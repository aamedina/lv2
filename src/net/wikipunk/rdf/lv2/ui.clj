(ns net.wikipunk.rdf.lv2.ui
  "User interfaces for LV2 plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.ttl",
   :owl/imports ["http://lv2plug.in/ns/ext/options"
                 "http://lv2plug.in/ns/lv2core"],
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.ui" "http://lv2plug.in/ns/ext/ui#",
                       "opts"   "http://lv2plug.in/ns/ext/options#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "ui"     "http://lv2plug.in/ns/extensions/ui#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/extensions/ui",
   :rdfa/prefix "lv2.ui",
   :rdfa/uri "http://lv2plug.in/ns/ext/ui#",
   :rdfs/comment "User interfaces for LV2 plugins.",
   :rdfs/label "LV2 UI",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.meta.ttl"]})