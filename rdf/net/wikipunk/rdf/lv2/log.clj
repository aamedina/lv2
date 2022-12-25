(ns net.wikipunk.rdf.lv2.log
  "A feature for writing log messages."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "log",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/log"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/log#",
   :rdf/ns-prefix-map {"log" "http://lv2plug.in/ns/ext/log#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def Entry
  "A log entry."
  {:rdfs/comment "A log entry.", :rdfs/label "Entry", :rdf/type :rdfs/Class})

(def ErrorClass
  "An error message."
  {:rdfs/comment "An error message.",
   :rdfs/subClassOf :log/Entry,
   :rdfs/label "Error",
   :rdf/type :rdfs/Class})

(def Note
  "An informative message."
  {:rdfs/comment "An informative message.",
   :rdfs/subClassOf :log/Entry,
   :rdfs/label "Note",
   :rdf/type :rdfs/Class})

(def Trace
  "A debugging trace message."
  {:rdfs/comment "A debugging trace message.",
   :rdfs/subClassOf :log/Entry,
   :rdfs/label "Trace",
   :rdf/type :rdfs/Class})

(def Warning
  "A warning message."
  {:rdfs/comment "A warning message.",
   :rdfs/subClassOf :log/Entry,
   :rdfs/label "Warning",
   :rdf/type :rdfs/Class})

(def log
  "Logging feature."
  {:rdfs/comment "Logging feature.", :rdfs/label "log", :rdf/type :lv2/Feature})