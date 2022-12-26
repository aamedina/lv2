(ns net.wikipunk.lv2.rdf.umap
  "<span class=\"warning\">This extension is deprecated.</span> New implementations should use [LV2 URID](urid.html) instead.  This extension defines a simple mechanism for plugins to map URIs to integers, usually for performance reasons (e.g. processing events typed by URIs in real time).  The expected use case is for plugins to map URIs to integers for things they 'understand' at instantiation time, and store those values for use in the audio thread without doing any string comparison.  This allows the extensibility of RDF with the performance of integers (or centrally defined enumerations)."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.ttl",
   :lv2/project {:doap/created    "2008-00-00",
                 :doap/developer  ["http://drobilla.net/drobilla#me"
                                   "http://lv2plug.in/ns/meta#larsl"],
                 :doap/license    "http://opensource.org/licenses/isc",
                 :doap/maintainer "http://drobilla.net/drobilla#me",
                 :doap/name       "LV2 URI Map",
                 :doap/shortdesc  "A feature for mapping URIs to integers.",
                 :rdf/about       "http://lv2plug.in/ns/ext/uri-map",
                 :rdf/type        :doap/Project},
   :owl/deprecated true,
   :rdf/about "http://lv2plug.in/ns/ext/uri-map",
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "umap" "http://lv2plug.in/ns/ext/uri-map#"},
   :rdf/type :lv2/Feature,
   :rdfa/prefix "umap",
   :rdfa/uri "http://lv2plug.in/ns/ext/uri-map#",
   :rdfs/comment "A feature for mapping URIs to integers.",
   :rdfs/label "LV2 URI Map",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.meta.ttl"})