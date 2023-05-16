(ns net.wikipunk.rdf.lv2.pset
  "Presets for LV2 plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.pset" "http://lv2plug.in/ns/ext/presets#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.pset",
   :rdfa/uri "http://lv2plug.in/ns/ext/presets",
   :rdfs/comment "Presets for LV2 plugins.",
   :rdfs/label "LV2 Presets",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.meta.ttl"]})

(def Bank
  "A bank of presets."
  {:db/ident        :lv2.pset/Bank,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A bank of presets.",
   :rdfs/label      "Bank",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/minCardinality 1,
                      :owl/onProperty :rdfs/label,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Bank MUST have at least one string rdfs:label."}
                     :lv2.pset/Bank]})

(def Preset
  "A preset for an LV2 plugin."
  {:db/ident        :lv2.pset/Preset,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A preset for an LV2 plugin.",
   :rdfs/label      "Preset",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/minCardinality 1,
                      :owl/onProperty :rdfs/label,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Preset MUST have at least one string rdfs:label."}
                     :lv2/PluginBase
                     :lv2.pset/Preset]})

(def bank
  "The bank this preset belongs to."
  {:db/ident           :lv2.pset/bank,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The bank this preset belongs to.",
   :rdfs/domain        :lv2.pset/Preset,
   :rdfs/label         "bank",
   :rdfs/range         :lv2.pset/Bank,
   :rdfs/subPropertyOf :lv2.pset/bank})

(def preset
  "The preset currently applied to a plugin instance."
  {:db/ident           :lv2.pset/preset,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "The preset currently applied to a plugin instance.",
   :rdfs/domain        :lv2/PluginBase,
   :rdfs/label         "preset",
   :rdfs/range         :lv2.pset/Preset,
   :rdfs/subPropertyOf :lv2.pset/preset})

(def value
  "The value of a port in a preset."
  {:db/ident           :lv2.pset/value,
   :rdf/type           [:owl/FunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/comment       "The value of a port in a preset.",
   :rdfs/domain        :lv2/PortBase,
   :rdfs/label         "value",
   :rdfs/subPropertyOf :lv2.pset/value})