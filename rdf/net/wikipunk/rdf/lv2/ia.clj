(ns net.wikipunk.rdf.lv2.ia
  "This extension defines a feature which allows plugin UIs to get a direct handle to an LV2 plugin instance (LV2_Handle), if possible.  Note that the use of this extension by UIs violates the important principle of UI/plugin separation, and is potentially a source of many problems. Accordingly, **use of this extension is highly discouraged**, and plugins should not expect hosts to support it, since it is often impossible to do so.  To support this feature the host must pass an LV2_Feature struct to the UI instantiate method with URI LV2_INSTANCE_ACCESS_URI and data pointed directly to the LV2_Handle of the plugin instance."
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