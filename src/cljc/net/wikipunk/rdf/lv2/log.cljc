(ns net.wikipunk.rdf.lv2.log
  "A feature for writing log messages."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"     "http://lv2plug.in/ns/lv2core#",
                       "lv2.log" "http://lv2plug.in/ns/ext/log#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.log",
   :rdfa/uri "http://lv2plug.in/ns/ext/log",
   :rdfs/comment "A feature for writing log messages.",
   :rdfs/label "LV2 Log",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.meta.ttl"]})

(def Entry
  "A log entry."
  {:db/ident        :lv2.log/Entry,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A log entry.",
   :rdfs/label      "Entry",
   :rdfs/subClassOf :rdfs/Resource})

(def ErrorClass
  "An error message."
  {:db/ident        :lv2.log/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An error message.",
   :rdfs/label      "Error",
   :rdfs/subClassOf [:lv2.log/Entry :rdfs/Resource]})

(def Note
  "An informative message."
  {:db/ident        :lv2.log/Note,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An informative message.",
   :rdfs/label      "Note",
   :rdfs/subClassOf [:lv2.log/Entry :rdfs/Resource]})

(def Trace
  "A debugging trace message."
  {:db/ident        :lv2.log/Trace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A debugging trace message.",
   :rdfs/label      "Trace",
   :rdfs/subClassOf [:lv2.log/Entry :rdfs/Resource]})

(def Warning
  "A warning message."
  {:db/ident        :lv2.log/Warning,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A warning message.",
   :rdfs/label      "Warning",
   :rdfs/subClassOf [:lv2.log/Entry :rdfs/Resource]})

(def log
  "Logging feature."
  {:db/ident     :lv2.log/log,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Logging feature.",
   :rdfs/label   "log"})