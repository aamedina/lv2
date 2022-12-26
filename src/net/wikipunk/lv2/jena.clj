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
          uri)))

  Node_Blank
  (data [n]
    {:rdf/blank (.getLabelString (.getBlankNodeId n))})

  Node_Literal
  (data [n]
    (if (= XSDDatatype/XSDdateTime (.getLiteralDatatype n))
      (.getTime (.asCalendar ^XSDDateTime (.getLiteralValue n)))
      (if-let [lang (not-empty (.getLiteralLanguage n))]
        {:rdf/value    (.getLiteralValue n)
         :rdf/language lang}
        (let [value (.getLiteralValue n)]
          (if (instance? BaseDatatype$TypedValue value)
            (.-lexicalValue value)
            value))))))

(defprotocol Parsable
  (parse [x]
    "Parses source using Apache Jena's RDFParser and converts it to
  Clojure data using Aristotle.

  Adapted from arachne.aristotle.graph/graph->clj"))

(extend-protocol Parsable
  clojure.lang.IPersistentMap
  (parse [md]
    (let [{:rdfa/keys [uri prefix]
           :dcat/keys [downloadURL]} md
          g                          (.toGraph (RDFParser/source (or downloadURL uri)))
          ns-prefix-map              (dissoc (into (if (and prefix uri)
                                                     {prefix uri}
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

  clojure.lang.Named
  (parse [ident]
    (if (qualified-ident? ident)
      (some-> (resolve ident) deref parse)
      (some-> (find-ns ident) meta parse)))

  clojure.lang.Namespace
  (parse [ns]
    (parse (meta ns)))

  String
  (parse [s]
    (parse {:dcat/downloadURL s})))

(def ^:dynamic *ns-prefix* "net.wikipunk.rdf.")
(def ^:dynamic *target* "rdf/net/wikipunk/rdf/")

(defn unroll
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [index      (-> (group-by :rdf/about model)
                       (update-vals first)
                       (update-vals #(dissoc % :rdf/about)))
        index'     (->> (walk/prewalk (fn [form]
                                        (if-some [node (:rdf/blank form)]
                                          (get index form)
                                          form))
                                      index)
                        (walk/postwalk (fn [form]
                                         (if (and (keyword? form) (or (= (namespace form) "dc")
                                                                      (= (namespace form) "dct")))
                                           ;; dcterms is a superset of dc(11)
                                           ;; https://www.dublincore.org/specifications/dublin-core/dces/
                                           (keyword "dcterms" (name form))
                                           form))))        
        ontologies (walk/prewalk (fn [form]
                                   (if-some [node (:rdf/blank form)]
                                     (get index form)
                                     form))
                                 (or (get (group-by :rdf/type model) :owl/Ontology)
                                     (get (group-by :rdf/type model) :lv2/Feature)))
        md         (walk/prewalk (fn [form]
                                   (if (and (keyword? form) (or (= (namespace form) "dc")
                                                                (= (namespace form) "dct")))
                                     (keyword "dcterms" (name form))
                                     form))
                                 (reduce merge (meta model) ontologies))
        seeAlso    (:rdfs/seeAlso md)
        seeAlso    (when (and seeAlso (str/ends-with? seeAlso "ttl"))
                     (update-vals (group-by :rdf/about (parse seeAlso)) first))
        project    (when seeAlso
                     (get seeAlso (:rdf/about md)))
        index'     (reduce-kv (fn [index k v]
                                (update index k merge v))
                              index' (dissoc seeAlso (:rdf/about md)))
        md         (cond-> md
                     project (assoc :lv2/project project))
        exclusions (->> (keys (filter (comp qualified-keyword? key) index'))
                        (map name)
                        (filter #(var? (ns-resolve 'clojure.core (symbol %))))
                        (map symbol)
                        (into []))
        forms      (->> index'
                        (filter (comp qualified-keyword? key))
                        (filter (comp (partial = (:rdfa/prefix md)) namespace key))
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
                                     docstring (or (some-> (:lv2/documentation v))
                                                   (:dcterms/description v)
                                                   (:skos/definition v)
                                                   (:prov/definition v)
                                                   (:prov/editorsDefinition v)
                                                   (:rdfs/comment v))
                                     docstring (if (vector? docstring)
                                                 (if (every? string? docstring)
                                                   (str/join \newline docstring)
                                                   (first (get (group-by :rdf/language docstring) "en")))
                                                 docstring)
                                     docstring (if (map? docstring)
                                                 (:rdf/value docstring "")
                                                 docstring)
                                     docstring (when docstring
                                                 (str/trim (str/replace docstring #"\s" " ")))
                                     v         (assoc v :rdf/about k)]
                                 (if docstring
                                   (list 'def sym docstring (dissoc v :lv2/documentation))
                                   (list 'def sym v)))))
                        (map (fn [form] (walk/postwalk (fn [form]
                                                         (if (bytes? form)
                                                           (into (vector-of :byte) form)
                                                           form))
                                                       form))))]
    (cons `(~'ns ~(symbol (str *ns-prefix* (:rdfa/prefix md)))
            ~@(let [docstring (or (get-in md [:lv2/project :lv2/documentation])
                                  (:dcterms/abstract md)
                                  (:dcterms/description md)
                                  (:dcterms/title md)
                                  (:rdfs/comment md)
                                  (:rdfs/label md)
                                  (:rdfa/uri md)
                                  (:skos/historyNote md)
                                  (:doc md)
                                  "")
                    docstring (if (vector? docstring)
                                (if (every? string? docstring)
                                  (str/join \newline docstring)
                                  (first (get (group-by :rdf/language docstring) "en")))
                                docstring)
                    docstring (if (map? docstring)
                                (:rdf/value docstring "")
                                docstring)
                    docstring (when docstring
                                (str/trim (str/replace docstring #"\s" " ")))]
                (when docstring
                  [docstring]))
            ~(dissoc (cond-> md
                       (:lv2/project md)
                       (update :lv2/project #(dissoc % :lv2/documentation)))
                     :doc)
            ~@(when (seq exclusions)
                [(list :refer-clojure :exclude exclusions)]))
          forms)))

(defrecord Vocabulary [types boot lv2]
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

(defprotocol NamespaceSpitter
  (emit [x path]))

(extend-protocol NamespaceSpitter
  clojure.lang.Sequential
  (emit [xs path]
    (dorun (pmap #(emit % path) xs)))
  
  Object
  (emit [x path]
    (let [model (parse x)
          md    (meta model)]
      (spit (str (or path *target*) (namespace-munge (:rdfa/prefix md)) ".clj")
            (binding [*print-namespace-maps* nil]
              (zprint/zprint-file-str  (str/join \newline (unroll model))
                                       ""
                                       {:parse  {:interpose "\n\n"}
                                        :map    {:justify?      true
                                                 :nl-separator? false
                                                 :hang?         true
                                                 :indent        0
                                                 :sort-in-code? true
                                                 :force-nl?     true}
                                        :vector {:wrap? false}})))))

  Vocabulary
  (emit [component _]
    (let [{:keys [boot boot-ns-prefix boot-target
                  lv2 lv2-ns-prefix lv2-target]} component]
      (binding [*ns-prefix* boot-ns-prefix]
        (emit boot boot-target))
      (binding [*ns-prefix* lv2-ns-prefix]
        (emit lv2 lv2-target)))))


