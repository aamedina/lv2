(ns net.wikipunk.jena
  "Apache Jena"
  (:require
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.core.protocols :refer [coll-reduce]]
   [clojure.java.io :as io]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [zprint.core :as zprint])
  (:import
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
    {:rdf/blank (.getLabelString (.getBlankNodeId n))}))

(defn parse
  "Parses source using Apache Jena's RDFParser and converts it to
  Clojure data using Aristotle.

  Adapted from arachne.aristotle.graph/graph->clj"
  [{:vann/keys [preferredNamespaceUri
                preferredNamespacePrefix]
    :dcat/keys [downloadURL] :as md}]
  (let [g             (.toGraph (RDFParser/source downloadURL))
        ns-prefix-map (dissoc (into {preferredNamespacePrefix
                                     preferredNamespaceUri}
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
                            (get clojure.lang.RT/DEFAULT_IMPORTS sym)
                            (symbol (str sym "Class"))

                            (= (name sym) "nil")
                            'null
                            
                            :else sym)]
                  (list 'def sym v))))
         (cons (list 'ns (symbol (str "net.wikipunk.rdf.lv2." (:vann/preferredNamespacePrefix md)))
                     (or (:rdfs/comment md)
                         (:dcterms/abstract md)
                         (:dcterms/description md)
                         (:doc md))
                     (dissoc md :doc :rdfs/comment :dcterms/abstract :dcterms/description)
                     (list :refer-clojure :exclude exclusions))))))

(defn parse-and-spit
  "Parses source and writes subjects of the RDF model as maps to the path specified."
  [f x]
  (with-open [w (clojure.java.io/writer f)]
    (binding [*print-meta* true
              *out*        w]
      (clojure.pprint/pprint (parse x)))))

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
                                             {:parse {:interpose "\n\n"}}))))
       (dorun)))
