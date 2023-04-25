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
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.work",
   :rdfa/uri "http://lv2plug.in/ns/ext/worker",
   :rdfs/comment "Support for doing non-realtime work in plugins.",
   :rdfs/label "LV2 Worker",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.meta.ttl"]})

(def interface
  "The work interface provided by a plugin."
  {:db/ident     :lv2.work/interface,
   :rdf/type     :lv2/ExtensionData,
   :rdfs/comment "The work interface provided by a plugin.",
   :rdfs/label   "work interface"})

(def schedule
  "The work scheduling feature provided by a host."
  {:db/ident     :lv2.work/schedule,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "The work scheduling feature provided by a host.",
   :rdfs/label   "work schedule"})