(ns net.wikipunk.rdf.lv2.pset
  "Presets for LV2 plugins."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "pset",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/presets"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/presets#",
   :rdf/ns-prefix-map {"pset" "http://lv2plug.in/ns/ext/presets#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def Bank
  "A bank of presets."
  {:rdfs/comment "A bank of presets.",
   :rdfs/subClassOf {:rdfs/comment
                       "A Bank MUST have at least one string rdfs:label.",
                     :owl/minCardinality 1,
                     :owl/onProperty :rdfs/label,
                     :rdf/type :owl/Restriction},
   :rdfs/label "Bank",
   :rdf/type :rdfs/Class})

(def Preset
  "A preset for an LV2 plugin."
  {:rdfs/subClassOf [{:rdfs/comment
                        "A Preset MUST have at least one string rdfs:label.",
                      :owl/minCardinality 1,
                      :owl/onProperty :rdfs/label,
                      :rdf/type :owl/Restriction} :lv2/PluginBase],
   :rdfs/comment "A preset for an LV2 plugin.",
   :rdfs/label "Preset",
   :rdf/type :rdfs/Class})

(def bank
  "The bank this preset belongs to."
  {:rdfs/comment "The bank this preset belongs to.",
   :rdfs/label "bank",
   :rdfs/range :pset/Bank,
   :rdfs/domain :pset/Preset,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def preset
  "The preset currently applied to a plugin instance."
  {:rdfs/comment "The preset currently applied to a plugin instance.",
   :rdfs/label "preset",
   :rdfs/range :pset/Preset,
   :rdfs/domain :lv2/PluginBase,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def value
  "The value of a port in a preset."
  {:rdfs/comment "The value of a port in a preset.",
   :rdfs/label "value",
   :rdfs/domain :lv2/PortBase,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})