(ns net.wikipunk.rdf.lv2.ia
  "A feature that provides access to a plugin instance."
  {:rdf/type :lv2/Feature,
   :vann/preferredNamespacePrefix "ia",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/instance-access.lv2/instance-access.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/instance-access.lv2/instance-access.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/instance-access"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/instance-access#",
   :rdf/ns-prefix-map {"ia" "http://lv2plug.in/ns/ext/instance-access#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))