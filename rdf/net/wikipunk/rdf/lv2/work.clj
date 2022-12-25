(ns net.wikipunk.rdf.lv2.work
  "Support for doing non-realtime work in plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.ttl",
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/worker"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "work" "http://lv2plug.in/ns/ext/worker#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.meta.ttl"},
   :vann/preferredNamespacePrefix "work",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/worker#"}
  (:refer-clojure :exclude []))

(def interface
  "The work interface provided by a plugin."
  {:rdf/about  :work/interface,
   :rdf/type   :lv2/ExtensionData,
   :rdfs/label "work interface"})

(def schedule
  "The work scheduling feature provided by a host."
  {:rdf/about  :work/schedule,
   :rdf/type   :lv2/Feature,
   :rdfs/label "work schedule"})