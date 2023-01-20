(ns net.wikipunk.rdf.lv2.morph
  "Ports that can dynamically change type."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "lv2.morph" "http://lv2plug.in/ns/ext/morph#",
                       "morph" "http://lv2plug.in/ns/ext/morph#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/morph",
   :rdfa/prefix "lv2.morph",
   :rdfa/uri "http://lv2plug.in/ns/ext/morph#",
   :rdfs/comment "Ports that can dynamically change type.",
   :rdfs/label "LV2 Morph",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.meta.ttl"]})