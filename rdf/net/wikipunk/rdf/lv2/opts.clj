(ns net.wikipunk.rdf.lv2.opts
  "http://lv2plug.in/ns/ext/options#"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.ttl",
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/options"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/label "LV2 Options",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.meta.ttl"},
   :vann/preferredNamespacePrefix "opts",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/options#"})

(def Option
  "A value for a static option passed to an instance."
  {:rdf/about       :opts/Option,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Option",
   :rdfs/subClassOf :rdf/Property})

(def interface
  "An interface for dynamically setting and getting options."
  {:rdf/about  :opts/interface,
   :rdf/type   :lv2/ExtensionData,
   :rdfs/label "interface"})

(def options
  "The feature used to provide options to an instance."
  {:rdf/about  :opts/options,
   :rdf/type   :lv2/Feature,
   :rdfs/label "options"})

(def requiredOption
  "An option required by the instance to function at all."
  {:rdf/about  :opts/requiredOption,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "required option",
   :rdfs/range :rdf/Property})

(def supportedOption
  "An option supported or by the instance."
  {:rdf/about  :opts/supportedOption,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "supported option",
   :rdfs/range :rdf/Property})