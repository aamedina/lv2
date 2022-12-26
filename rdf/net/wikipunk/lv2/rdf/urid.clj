(ns net.wikipunk.lv2.rdf.urid
  "This extension defines a simple mechanism for plugins to map URIs to and from integers.  This is usually used for performance reasons, for example for processing events with URI types in real-time audio code).  Typically, plugins map URIs to integers for things they \"understand\" at instantiation time, and store those values for use in the audio thread without doing any string comparison.  This allows for the extensibility of RDF but with the performance of integers.  This extension is intended as an improved and simplified replacement for the [uri-map](uri-map.html) extension, since the `map` context parameter there has proven problematic.  This extension is functionally equivalent to the uri-map extension with a NULL context.  New implementations are encouraged to use this extension for URI mapping."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.ttl",
   :lv2/project {:doap/created "2011-07-22",
                 :doap/developer "http://lv2plug.in/ns/meta#gabrbedd",
                 :doap/license "http://opensource.org/licenses/isc",
                 :doap/maintainer "http://drobilla.net/drobilla#me",
                 :doap/name "LV2 URID",
                 :doap/shortdesc
                 "Features for mapping URIs to and from integers.",
                 :rdf/about "http://lv2plug.in/ns/ext/urid",
                 :rdf/type :doap/Project},
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/about "http://lv2plug.in/ns/ext/urid",
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "urid" "http://lv2plug.in/ns/ext/urid#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "urid",
   :rdfa/uri "http://lv2plug.in/ns/ext/urid#",
   :rdfs/comment "Features for mapping URIs to and from integers.",
   :rdfs/label "LV2 URID",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.meta.ttl"}
  (:refer-clojure :exclude [map]))

(def map
  "To support this feature, the host must pass an LV2_Feature to LV2_Descriptor::instantiate() with URI LV2_URID__map and data pointed to an instance of LV2_URID_Map."
  {:rdf/about    :urid/map,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature to map URI strings to integer URIDs.",
   :rdfs/label   "map"})

(def unmap
  "To support this feature, the host must pass an LV2_Feature to LV2_Descriptor::instantiate() with URI LV2_URID__unmap and data pointed to an instance of LV2_URID_Unmap."
  {:rdf/about    :urid/unmap,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature to unmap URIDs back to strings.",
   :rdfs/label   "unmap"})