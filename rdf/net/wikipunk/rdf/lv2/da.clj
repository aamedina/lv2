(ns net.wikipunk.rdf.lv2.da
  "A feature that provides access to plugin extension data."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/data-access.lv2/data-access.ttl",
   :lv2/project
   {:doap/created   "2008-00-00",
    :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
    :doap/license   {:rdf/uri "http://opensource.org/licenses/isc"},
    :doap/name      "LV2 Data Access",
    :doap/shortdesc "Provides access to plugin extension data.",
    :rdf/about      {:rdf/uri "http://lv2plug.in/ns/ext/data-access"},
    :rdf/type       :doap/Project},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/data-access"},
   :rdf/ns-prefix-map {"da"   "http://lv2plug.in/ns/ext/data-access#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :lv2/Feature,
   :rdfs/comment "A feature that provides access to plugin extension data.",
   :rdfs/label "data access",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/data-access.lv2/data-access.meta.ttl"},
   :vann/preferredNamespacePrefix "da",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/data-access#"})