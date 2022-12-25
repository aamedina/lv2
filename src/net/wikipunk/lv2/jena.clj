(ns net.wikipunk.lv2.jena
  "Apache Jena"
  (:require
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.core.protocols :refer [coll-reduce]]
   [clojure.java.io :as io]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [zprint.core :as zprint])
  (:import
   (org.apache.jena.datatypes BaseDatatype$TypedValue)
   (org.apache.jena.datatypes.xsd XSDDatatype XSDDateTime)
   (org.apache.jena.graph Graph Node Triple Node_URI Node_Literal Node_Variable Node_Blank)
   (org.apache.jena.riot RDFParser)
   (org.apache.jena.rdf.model Model)
   (org.apache.jena.query ResultSet)
   (org.apache.jena.util.iterator ClosableIterator)
   (org.apache.jena.shared PrefixMapping)))

;; Make Apache Jena iterators reducible

(extend-protocol clojure.core.protocols/CollReduce
  ClosableIterator
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^ClosableIterator iter coll]
       (try
         (loop [ret val]
           (if (.hasNext iter)
             (let [ret (f ret (.next iter))]
               (if (reduced? ret)
                 @ret
                 (recur ret)))
             ret))
         (finally
           (.close iter))))))

  org.apache.jena.query.ResultSet
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^ResultSet iter coll]
       (try
         (loop [ret val]
           (if (.hasNext iter)
             (let [ret (f ret (.next iter))]
               (if (reduced? ret)
                 @ret
                 (recur ret)))
             ret))
         (finally
           (.close iter))))))

  Model
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^Model model coll]
       (coll-reduce (.listStatements model) f val))))

  Graph
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^Graph g coll]
       (coll-reduce (.find g) f val)))))

(defmethod print-method org.apache.jena.datatypes.xsd.XSDDateTime
  [^org.apache.jena.datatypes.xsd.XSDDateTime x ^java.io.Writer writer]
  (print-method (.asCalendar x) writer))

(defmethod print-dup org.apache.jena.datatypes.xsd.XSDDateTime
  [^org.apache.jena.datatypes.xsd.XSDDateTime x ^java.io.Writer writer]
  (print-method x writer))

(extend-protocol g/AsClojureData
  Node_URI
  (data [n]
    (let [uri (.getURI n)]
      (or (when-some [k (reg/kw uri)]
            (cond
              ;; Do not return blank qualified keyword names
              (or (str/blank? (namespace k)) (str/blank? (name k)))
              nil

              ;; Since these are not readable wrap in CL-inspired || 
              (Character/isDigit (first (name k)))
              (keyword (namespace k) (str \| (name k) \|))

              :else k))
          {:rdf/uri uri})))

  Node_Blank
  (data [n]
    {:rdf/blank (.getLabelString (.getBlankNodeId n))})

  Node_Literal
  (data [n]
    (if (= XSDDatatype/XSDdateTime (.getLiteralDatatype n))
      (.getTime (.asCalendar ^XSDDateTime (.getLiteralValue n)))
      (if-let [lang (not-empty (.getLiteralLanguage n))]
        (if (str/starts-with? lang "en")
          (.getLiteralValue n)
          {:rdf/literal (.getLiteralValue n)
           :rdf/lang    lang})
        (let [value (.getLiteralValue n)]
          (if (instance? BaseDatatype$TypedValue value)
            {:rdf/literal (.-lexicalValue value)
             :rdf/uri     (.-datatypeURI value)}
            value))))))

(defprotocol Parsable
  (parse [x]
    "Parses source using Apache Jena's RDFParser and converts it to
  Clojure data using Aristotle.

  Adapted from arachne.aristotle.graph/graph->clj"))

(extend-protocol Parsable
  clojure.lang.IPersistentMap
  (parse [md]
    (let [{:vann/keys [preferredNamespaceUri
                       preferredNamespacePrefix]
           :dcat/keys [downloadURL]} md
          g                          (.toGraph (RDFParser/source downloadURL))
          ns-prefix-map              (dissoc (into (if (and preferredNamespacePrefix preferredNamespaceUri)
                                                     {preferredNamespacePrefix preferredNamespaceUri}
                                                     {})
                                      (.getNsPrefixMap (.getPrefixMapping g)))
                                "")]
      (reg/with ns-prefix-map
                (into (with-meta [] (assoc md :rdf/ns-prefix-map ns-prefix-map))
                      (map (fn [[subject triples]]
                             (into {:rdf/about (g/data subject)}
                                   (map (fn [[pred triples]]
                                          (let [objects (mapv #(g/data (.getObject ^Triple %)) triples)]
                                            [(g/data pred) (if (= 1 (count objects))
                                                             (first objects)
                                                             objects)])))
                                   (group-by #(.getPredicate ^Triple %) triples))))
                      (group-by #(.getSubject ^Triple %) (into [] g))))))

  String
  (parse [s]
    (parse {:dcat/downloadURL s})))

(defn unroll
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [index (-> (group-by :rdf/about model)
                  (update-vals first)
                  (update-vals #(dissoc % :rdf/about)))
        index' (walk/prewalk (fn [form]
                               (if-some [node (:rdf/blank form)]
                                 (get index form)
                                 form))
                             index)
        md (reduce (fn [md [uri m]]
                     (merge (update md :rdf/about conj uri) m))
                   (assoc (meta model) :rdf/about [])
                   (filter (comp :rdf/uri key) index'))
        md (update md :rdf/about (fn [about]
                                   (if (= (count about) 1)
                                     (first about)
                                     about)))
        exclusions (->> (keys (filter (comp qualified-keyword? key) index'))
                        (map name)
                        (filter #(var? (ns-resolve 'clojure.core (symbol %))))
                        (map symbol)
                        (into []))]
    (->> index'
         (filter (comp qualified-keyword? key))
         (sort-by key)
         (map (fn [form] (walk/postwalk (fn [form]
                                          (cond
                                            (identical? (:rdf/rest form) :rdf/nil)
                                            [(:rdf/first form)]

                                            (and (:rdf/first form) (:rdf/rest form))
                                            (into [(:rdf/first form)] (:rdf/rest form))

                                            :else form))
                                        form)))
         (map (fn [[k v]]
                (let [sym (symbol (name k))
                      sym (cond
                            (= (name sym) "Class")
                            'T
                            
                            (get clojure.lang.RT/DEFAULT_IMPORTS sym)
                            (symbol (str sym "Class"))

                            (= (name sym) "nil")
                            'null
                            
                            :else sym)
                      docstring (:rdfs/comment v)
                      docstring (if (coll? docstring)
                                  (first (filter string? docstring))
                                  docstring)
                      docstring (when docstring
                                  (str/trim (str/escape docstring {\tab "" \newline ""})))
                      v (assoc v :rdf/about k)]
                  (if docstring
                    (list 'def sym docstring (dissoc v :rdfs/comment))
                    (list 'def sym v)))))
         (map (fn [form] (walk/postwalk (fn [form]
                                          (if (bytes? form)
                                            (into (vector-of :byte) form)
                                            form))
                                        form)))
         (cons (list 'ns (symbol (str "net.wikipunk.rdf.lv2." (:vann/preferredNamespacePrefix md)))
                     (let [docstring (or (:rdfs/comment md)
                                         (:dcterms/abstract md)
                                         (:dcterms/description md)
                                         (:dcterms/title md)
                                         (:rdfs/label md)
                                         (:doc md))
                           docstring (if (coll? docstring)
                                       (first (filter string? docstring))
                                       docstring)
                           docstring (str/trim (str/escape docstring {\tab "" \newline ""}))]
                       docstring)
                     (dissoc md :doc :rdfs/comment :dcterms/abstract :dcterms/description :dcterms/title :rdfs/label)
                     (list :refer-clojure :exclude exclusions))))))

(defn parse-and-spit-namespaces
  "Crawls namespaces and spits resources."
  []
  (->> (all-ns)
       (filter (comp :dcat/downloadURL meta))
       (map (fn [ns] [(ns-name ns) (meta ns)]))
       (pmap (fn [[ns-name md]]
               (spit (str "rdf/net/wikipunk/rdf/lv2/" (:vann/preferredNamespacePrefix md) ".clj")
                     (zprint/zprint-file-str (apply str (unroll (parse md)))
                                             ""
                                             {:parse {:interpose "\n\n"}
                                              :map   {:justify?      true
                                                      :nl-separator? false
                                                      :hang?         true
                                                      :indent 0
                                                      :sort-in-code? true
                                                      :force-nl?     true}
                                              :style :hiccup}))))
       (dorun)))

(defrecord Vocabulary [types]
  com/Lifecycle
  (start [this]
    (let [vocab (->> (all-ns)
                      (filter (comp :rdf/about meta))
                      (map ns-publics)
                      (mapcat vals)
                      (map deref)
                      (filter map?)
                      (filter :rdf/about)) 
          types (transduce
                  (comp
                    (filter :rdf/type)
                    (filter (comp keyword? :rdf/about))
                    (map #(update % :rdf/type (fn [x] (if (coll? x) x [x]))))
                    (map #(update % :rdfs/subClassOf (fn [x] (if (coll? x) x [x])))))
                  (completing
                    (fn [h {:rdf/keys  [about type]
                            :rdfs/keys [subClassOf]}]
                      (reduce (fn [h parent]
                                (try
                                  (derive h about parent)
                                  (catch Throwable ex
                                    h)))
                              h
                              (concat (filter #{:rdfs/Class :owl/Class :owl/NamedIndividual}
                                              (filter keyword? type))
                                      (filter keyword? subClassOf)))))
                  (make-hierarchy)
                  vocab)]
      (assoc this :types (ref types))))
  (stop [this]
    this))
