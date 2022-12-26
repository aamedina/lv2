(ns net.wikipunk.rdf.lv2.ia
  "A feature that provides access to a plugin instance."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/instance-access.lv2/instance-access.ttl",
   :lv2/project
   {:doap/created   "2010-10-04",
    :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
    :doap/license   {:rdf/uri "http://opensource.org/licenses/isc"},
    :doap/name      "LV2 Instance Access",
    :doap/shortdesc "Provides access to the LV2_Handle of a plugin.",
    :rdf/about      {:rdf/uri "http://lv2plug.in/ns/ext/instance-access"},
    :rdf/type       :doap/Project},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/instance-access"},
   :rdf/ns-prefix-map {"ia"   "http://lv2plug.in/ns/ext/instance-access#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :lv2/Feature,
   :rdfs/comment "A feature that provides access to a plugin instance.",
   :rdfs/label "instance access",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/instance-access.lv2/instance-access.meta.ttl"},
   :vann/preferredNamespacePrefix "ia",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/instance-access#"})