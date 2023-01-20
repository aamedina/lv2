(ns net.wikipunk.rdf.lv2.log
  "A feature for writing log messages."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"log"  "http://lv2plug.in/ns/ext/log#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/log",
   :rdfa/prefix "log",
   :rdfa/uri "http://lv2plug.in/ns/ext/log#",
   :rdfs/comment "A feature for writing log messages.",
   :rdfs/label "LV2 Log",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.meta.ttl"]})

(def Entry
  "A log entry."
  {:db/ident     :log/Entry,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A log entry.",
   :rdfs/label   "Entry"})

(def ErrorClass
  "An error message."
  {:db/ident        :log/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An error message.",
   :rdfs/label      "Error",
   :rdfs/subClassOf :log/Entry})

(def Note
  "An informative message."
  {:db/ident        :log/Note,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An informative message.",
   :rdfs/label      "Note",
   :rdfs/subClassOf :log/Entry})

(def Trace
  "A debugging trace message."
  {:db/ident        :log/Trace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A debugging trace message.",
   :rdfs/label      "Trace",
   :rdfs/subClassOf :log/Entry})

(def Warning
  "A warning message."
  {:db/ident        :log/Warning,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A warning message.",
   :rdfs/label      "Warning",
   :rdfs/subClassOf :log/Entry})

(def log
  "Logging feature."
  {:db/ident     :log/log,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Logging feature.",
   :rdfs/label   "log"})