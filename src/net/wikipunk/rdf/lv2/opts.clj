(ns net.wikipunk.rdf.lv2.opts
  "Runtime options for LV2 plugins and UIs."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.opts" "http://lv2plug.in/ns/ext/options#",
                       "opts"     "http://lv2plug.in/ns/ext/options#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/options",
   :rdfa/prefix "lv2.opts",
   :rdfa/uri "http://lv2plug.in/ns/ext/options#",
   :rdfs/comment "Runtime options for LV2 plugins and UIs.",
   :rdfs/label "LV2 Options",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.meta.ttl"]})