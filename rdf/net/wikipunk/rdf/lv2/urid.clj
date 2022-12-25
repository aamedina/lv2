(ns net.wikipunk.rdf.lv2.urid
  "Features for mapping URIs to and from integers."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about #:rdf{:uri "http://lv2plug.in/ns/ext/urid"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "urid" "http://lv2plug.in/ns/ext/urid#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   #:rdf{:uri
         "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.meta.ttl"},
   :vann/preferredNamespacePrefix "urid",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/urid#"}
  (:refer-clojure :exclude [map]))

(def map
  "A feature to map URI strings to integer URIDs."
  {:rdf/about  :urid/map,
   :rdf/type   :lv2/Feature,
   :rdfs/label "map"})

(def unmap
  "A feature to unmap URIDs back to strings."
  {:rdf/about  :urid/unmap,
   :rdf/type   :lv2/Feature,
   :rdfs/label "unmap"})