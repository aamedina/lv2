(ns net.wikipunk.rdf.lv2.opts
  "Runtime options for LV2 plugins and UIs."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/options",
   :rdfa/prefix "opts",
   :rdfa/uri "http://lv2plug.in/ns/ext/options#",
   :rdfs/comment "Runtime options for LV2 plugins and UIs.",
   :rdfs/label "LV2 Options",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.meta.ttl"]})

(def Option
  "A value for a static option passed to an instance."
  {:db/ident        :opts/Option,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A value for a static option passed to an instance.",
   :rdfs/label      "Option",
   :rdfs/subClassOf :rdf/Property})

(def interface
  "An interface for dynamically setting and getting options."
  {:db/ident     :opts/interface,
   :rdf/type     :lv2/ExtensionData,
   :rdfs/comment "An interface for dynamically setting and getting options.",
   :rdfs/label   "interface"})

(def options
  "The feature used to provide options to an instance."
  {:db/ident     :opts/options,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "The feature used to provide options to an instance.",
   :rdfs/label   "options"})

(def requiredOption
  "An option required by the instance to function at all."
  {:db/ident     :opts/requiredOption,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An option required by the instance to function at all.",
   :rdfs/label   "required option",
   :rdfs/range   :rdf/Property})

(def supportedOption
  "An option supported or by the instance."
  {:db/ident     :opts/supportedOption,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An option supported or by the instance.",
   :rdfs/label   "supported option",
   :rdfs/range   :rdf/Property})