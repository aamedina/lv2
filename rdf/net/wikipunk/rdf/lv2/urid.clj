(ns net.wikipunk.rdf.lv2.urid
  "Features for mapping URIs to and from integers."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "urid",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/urid"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/urid#",
   :rdf/ns-prefix-map {"urid" "http://lv2plug.in/ns/ext/urid#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#"}}
  (:refer-clojure :exclude [map]))

(def map
  "A feature to map URI strings to integer URIDs."
  {:rdfs/comment "A feature to map URI strings to integer URIDs.",
   :rdfs/label "map",
   :rdf/type :lv2/Feature})

(def unmap
  "A feature to unmap URIDs back to strings."
  {:rdfs/comment "A feature to unmap URIDs back to strings.",
   :rdfs/label "unmap",
   :rdf/type :lv2/Feature})