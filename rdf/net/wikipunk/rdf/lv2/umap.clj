(ns net.wikipunk.rdf.lv2.umap
  "A feature for mapping URIs to integers."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.ttl",
   :owl/deprecated true,
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/uri-map"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "umap" "http://lv2plug.in/ns/ext/uri-map#"},
   :rdf/type :lv2/Feature,
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.meta.ttl"},
   :vann/preferredNamespacePrefix "umap",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/uri-map#"}
  (:refer-clojure :exclude []))