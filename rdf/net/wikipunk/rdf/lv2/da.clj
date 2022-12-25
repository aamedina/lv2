(ns net.wikipunk.rdf.lv2.da
  "This extension defines a feature, LV2_Extension_Data_Feature, which provides access to LV2_Descriptor::extension_data() for plugin UIs or other potentially remote users of a plugin.  Note that the use of this extension by UIs violates the important principle of UI/plugin separation, and is potentially a source of many problems. Accordingly, **use of this extension is highly discouraged**, and plugins should not expect hosts to support it, since it is often impossible to do so.  To support this feature the host must pass an LV2_Feature struct to LV2_Descriptor::extension_data() with URI LV2_DATA_ACCESS_URI and data pointed to an instance of LV2_Extension_Data_Feature."
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