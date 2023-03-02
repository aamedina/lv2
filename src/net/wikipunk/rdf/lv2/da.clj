(ns net.wikipunk.rdf.lv2.da
  "A feature that provides access to plugin extension data."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/data-access.lv2/data-access.ttl",
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.da" "http://lv2plug.in/ns/ext/data-access#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.da",
   :rdfa/uri "http://lv2plug.in/ns/ext/data-access",
   :rdfs/comment "A feature that provides access to plugin extension data.",
   :rdfs/label "data access",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/data-access.lv2/data-access.meta.ttl"]})