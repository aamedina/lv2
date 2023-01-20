(ns net.wikipunk.rdf.lv2.work
  "Support for doing non-realtime work in plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.work" "http://lv2plug.in/ns/ext/worker#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "work"     "http://lv2plug.in/ns/ext/worker#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/worker",
   :rdfa/prefix "lv2.work",
   :rdfa/uri "http://lv2plug.in/ns/ext/worker#",
   :rdfs/comment "Support for doing non-realtime work in plugins.",
   :rdfs/label "LV2 Worker",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.meta.ttl"]})