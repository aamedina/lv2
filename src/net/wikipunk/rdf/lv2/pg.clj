(ns net.wikipunk.rdf.lv2.pg
  "Multi-channel groups of LV2 ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.pg" "http://lv2plug.in/ns/ext/port-groups#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "pg"     "http://lv2plug.in/ns/ext/port-groups#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/port-groups",
   :rdfa/prefix "lv2.pg",
   :rdfa/uri "http://lv2plug.in/ns/ext/port-groups#",
   :rdfs/comment "Multi-channel groups of LV2 ports.",
   :rdfs/label "LV2 Port Groups",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.meta.ttl"]})