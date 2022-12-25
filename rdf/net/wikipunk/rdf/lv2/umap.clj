(ns net.wikipunk.rdf.lv2.umap
  "A feature for mapping URIs to integers."
  {:rdf/type :lv2/Feature,
   :owl/deprecated true,
   :vann/preferredNamespacePrefix "umap",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/uri-map"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/uri-map#",
   :rdf/ns-prefix-map {"umap" "http://lv2plug.in/ns/ext/uri-map#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}}
  (:refer-clojure :exclude []))