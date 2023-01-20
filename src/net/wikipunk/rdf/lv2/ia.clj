(ns net.wikipunk.rdf.lv2.ia
  "A feature that provides access to a plugin instance."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/instance-access.lv2/instance-access.ttl",
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.ia" "http://lv2plug.in/ns/ext/instance-access#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/instance-access",
   :rdfa/prefix "lv2.ia",
   :rdfa/uri "http://lv2plug.in/ns/ext/instance-access#",
   :rdfs/comment "A feature that provides access to a plugin instance.",
   :rdfs/label "instance access",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/instance-access.lv2/instance-access.meta.ttl"]})