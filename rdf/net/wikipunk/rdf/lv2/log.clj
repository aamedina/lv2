(ns net.wikipunk.rdf.lv2.log
  "http://lv2plug.in/ns/ext/log#"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.ttl",
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/log"},
   :rdf/ns-prefix-map {"log"  "http://lv2plug.in/ns/ext/log#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/label "LV2 Log",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.meta.ttl"},
   :vann/preferredNamespacePrefix "log",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/log#"})

(def Entry
  "A log entry."
  {:rdf/about  :log/Entry,
   :rdf/type   :rdfs/Class,
   :rdfs/label "Entry"})

(def ErrorClass
  "An error message."
  {:rdf/about       :log/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Error",
   :rdfs/subClassOf :log/Entry})

(def Note
  "An informative message."
  {:rdf/about       :log/Note,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Note",
   :rdfs/subClassOf :log/Entry})

(def Trace
  "A debugging trace message."
  {:rdf/about       :log/Trace,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Trace",
   :rdfs/subClassOf :log/Entry})

(def Warning
  "A warning message."
  {:rdf/about       :log/Warning,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Warning",
   :rdfs/subClassOf :log/Entry})

(def log
  "Logging feature."
  {:rdf/about  :log/log,
   :rdf/type   :lv2/Feature,
   :rdfs/label "log"})