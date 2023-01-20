(ns net.wikipunk.rdf.lv2.pset
  "Presets for LV2 plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.pset" "http://lv2plug.in/ns/ext/presets#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "pset"     "http://lv2plug.in/ns/ext/presets#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/presets",
   :rdfa/prefix "lv2.pset",
   :rdfa/uri "http://lv2plug.in/ns/ext/presets#",
   :rdfs/comment "Presets for LV2 plugins.",
   :rdfs/label "LV2 Presets",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.meta.ttl"]})