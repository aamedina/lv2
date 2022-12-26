(ns net.wikipunk.rdf.lv2.urid
  "Features for mapping URIs to and from integers."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.ttl",
   :lv2/project
   {:doap/created    "2011-07-22",
    :doap/developer  {:rdf/uri "http://lv2plug.in/ns/meta#gabrbedd"},
    :doap/license    {:rdf/uri "http://opensource.org/licenses/isc"},
    :doap/maintainer {:rdf/uri "http://drobilla.net/drobilla#me"},
    :doap/name       "LV2 URID",
    :doap/shortdesc  "Features for mapping URIs to and from integers.",
    :rdf/about       {:rdf/uri "http://lv2plug.in/ns/ext/urid"},
    :rdf/type        :doap/Project},
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/urid"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "urid" "http://lv2plug.in/ns/ext/urid#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "Features for mapping URIs to and from integers.",
   :rdfs/label "LV2 URID",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.meta.ttl"},
   :vann/preferredNamespacePrefix "urid",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/urid#"}
  (:refer-clojure :exclude [map]))

(def map
  "A feature to map URI strings to integer URIDs."
  {:rdf/about    :urid/map,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature to map URI strings to integer URIDs.",
   :rdfs/label   "map"})

(def unmap
  "A feature to unmap URIDs back to strings."
  {:rdf/about    :urid/unmap,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature to unmap URIDs back to strings.",
   :rdfs/label   "unmap"})