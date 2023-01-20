(ns net.wikipunk.rdf.lv2.pprops
  "Various properties for LV2 plugin ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2" "http://lv2plug.in/ns/lv2core#",
                       "lv2.pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/port-props",
   :rdfa/prefix "lv2.pprops",
   :rdfa/uri "http://lv2plug.in/ns/ext/port-props#",
   :rdfs/comment "Various properties for LV2 plugin ports.",
   :rdfs/label "LV2 Port Properties",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.meta.ttl"]})