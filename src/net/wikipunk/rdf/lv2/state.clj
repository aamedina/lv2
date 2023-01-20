(ns net.wikipunk.rdf.lv2.state
  "An interface for LV2 plugins to save and restore state."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2" "http://lv2plug.in/ns/lv2core#",
                       "lv2.state" "http://lv2plug.in/ns/ext/state#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "state" "http://lv2plug.in/ns/ext/state#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/state",
   :rdfa/prefix "lv2.state",
   :rdfa/uri "http://lv2plug.in/ns/ext/state#",
   :rdfs/comment "An interface for LV2 plugins to save and restore state.",
   :rdfs/label "LV2 State",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.meta.ttl"]})