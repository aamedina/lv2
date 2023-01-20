(ns net.wikipunk.rdf.lv2.umap
  "A feature for mapping URIs to integers."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.ttl",
   :owl/deprecated true,
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.umap" "http://lv2plug.in/ns/ext/uri-map#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/uri-map",
   :rdfa/prefix "lv2.umap",
   :rdfa/uri "http://lv2plug.in/ns/ext/uri-map#",
   :rdfs/comment "A feature for mapping URIs to integers.",
   :rdfs/label "LV2 URI Map",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.meta.ttl"]})