(ns net.wikipunk.rdf.lv2.log
  "A feature for writing log messages."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"log"     "http://lv2plug.in/ns/ext/log#",
                       "lv2"     "http://lv2plug.in/ns/lv2core#",
                       "lv2.log" "http://lv2plug.in/ns/ext/log#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/log",
   :rdfa/prefix "lv2.log",
   :rdfa/uri "http://lv2plug.in/ns/ext/log#",
   :rdfs/comment "A feature for writing log messages.",
   :rdfs/label "LV2 Log",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.meta.ttl"]})