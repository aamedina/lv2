(ns net.wikipunk.rdf.lv2.patch
  "A protocol for accessing and manipulating properties."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.ttl",
   :rdf/ns-prefix-map {"foaf" "http://xmlns.com/foaf/0.1/",
                       "lv2.patch" "http://lv2plug.in/ns/ext/patch#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "patch" "http://lv2plug.in/ns/ext/patch#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/patch",
   :rdfa/prefix "lv2.patch",
   :rdfa/uri "http://lv2plug.in/ns/ext/patch#",
   :rdfs/comment "A protocol for accessing and manipulating properties.",
   :rdfs/label "LV2 Patch",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.meta.ttl"]})