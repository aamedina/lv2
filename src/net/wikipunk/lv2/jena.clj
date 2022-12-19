(ns net.wikipunk.lv2.jena
  "Apache Jena"
  (:refer-clojure :exclude [slurp])
  (:require
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.core.protocols :refer [coll-reduce]]
   [clojure.java.io :as io]
   [clojure.string :as str])
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
              (str/blank? (name k))
              nil

              ;; Since these are not readable wrap in CL-inspired || 
              (Character/isDigit (first (name k)))
              (keyword (namespace k) (str \| (name k) \|))

              :else k))
          (str "<" uri ">")))))

(defn parse
  "Parses source using Apache Jena's RDFParser and converts it to
  Clojure data using Aristotle.

  Adapted from arachne.aristotle.graph/graph->clj"
  [x]
  (let [g             (.toGraph (RDFParser/source x))
        ns-prefix-map (into {} (.getNsPrefixMap (.getPrefixMapping g)))]
    (reg/with ns-prefix-map
              (into (with-meta [] {:rdf/ns-prefix-map ns-prefix-map})
                    (map (fn [[subject triples]]
                           (into {:rdf/about (g/data subject)}
                                 (map (fn [[pred triples]]
                                        (let [objects (mapv #(g/data (.getObject ^Triple %)) triples)]
                                          [(g/data pred) (if (= 1 (count objects))
                                                           (first objects)
                                                           objects)])))
                                 (group-by #(.getPredicate ^Triple %) triples))))
                    (group-by #(.getSubject ^Triple %) (into [] g))))))

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
               (parse-and-spit (str "resources/" (:vann/preferredNamespacePrefix md) ".edn")
                               (:dcat/downloadURL md))))
       (dorun)))

(defn slurp
  "Reads EDN model from disk."
  [f]
  (with-open [r (java.io.PushbackReader. (io/reader f))]
    (binding [*read-eval*    nil]
      (read r))))
