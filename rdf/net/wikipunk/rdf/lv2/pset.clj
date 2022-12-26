(ns net.wikipunk.rdf.lv2.pset
  "Presets for LV2 plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.ttl",
   :lv2/project {:doap/created   "2009-00-00",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/license   {:rdf/uri
                                  "http://opensource.org/licenses/isc"},
                 :doap/name      "LV2 Presets",
                 :doap/shortdesc "Presets for LV2 plugins.",
                 :rdf/about      {:rdf/uri "http://lv2plug.in/ns/ext/presets"},
                 :rdf/type       :doap/Project},
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/presets"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "pset" "http://lv2plug.in/ns/ext/presets#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "Presets for LV2 plugins.",
   :rdfs/label "LV2 Presets",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.meta.ttl"},
   :vann/preferredNamespacePrefix "pset",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/presets#"})

(def Bank
  "A bank of presets."
  {:rdf/about       :pset/Bank,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A bank of presets.",
   :rdfs/label      "Bank",
   :rdfs/subClassOf {:owl/minCardinality 1,
                     :owl/onProperty :rdfs/label,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A Bank MUST have at least one string rdfs:label."}})

(def Preset
  "A preset for an LV2 plugin."
  {:rdf/about       :pset/Preset,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A preset for an LV2 plugin.",
   :rdfs/label      "Preset",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty :rdfs/label,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Preset MUST have at least one string rdfs:label."}
                     :lv2/PluginBase]})

(def bank
  "The bank this preset belongs to."
  {:rdf/about    :pset/bank,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The bank this preset belongs to.",
   :rdfs/domain  :pset/Preset,
   :rdfs/label   "bank",
   :rdfs/range   :pset/Bank})

(def preset
  "The preset currently applied to a plugin instance."
  {:rdf/about    :pset/preset,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The preset currently applied to a plugin instance.",
   :rdfs/domain  :lv2/PluginBase,
   :rdfs/label   "preset",
   :rdfs/range   :pset/Preset})

(def value
  "The value of a port in a preset."
  {:rdf/about    :pset/value,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The value of a port in a preset.",
   :rdfs/domain  :lv2/PortBase,
   :rdfs/label   "value"})