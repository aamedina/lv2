(ns net.wikipunk.rdf.lv2.da
  "A feature that provides access to plugin extension data."
  {:rdf/type :lv2/Feature,
   :vann/preferredNamespacePrefix "da",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/data-access.lv2/data-access.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/data-access.lv2/data-access.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/data-access"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/data-access#",
   :rdf/ns-prefix-map {"da" "http://lv2plug.in/ns/ext/data-access#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))