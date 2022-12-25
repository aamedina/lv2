(ns net.wikipunk.rdf.lv2.opts
  "Runtime options for LV2 plugins and UIs."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "opts",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/options"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/options#",
   :rdf/ns-prefix-map {"opts" "http://lv2plug.in/ns/ext/options#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def Option
  "A value for a static option passed to an instance."
  {:rdfs/comment "A value for a static option passed to an instance.",
   :rdfs/subClassOf :rdf/Property,
   :rdfs/label "Option",
   :rdf/type :rdfs/Class})

(def interface
  "An interface for dynamically setting and getting options."
  {:rdfs/comment "An interface for dynamically setting and getting options.",
   :rdfs/label "interface",
   :rdf/type :lv2/ExtensionData})

(def options
  "The feature used to provide options to an instance."
  {:rdfs/comment "The feature used to provide options to an instance.",
   :rdfs/label "options",
   :rdf/type :lv2/Feature})

(def requiredOption
  "An option required by the instance to function at all."
  {:rdfs/comment "An option required by the instance to function at all.",
   :rdfs/label "required option",
   :rdfs/range :rdf/Property,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def supportedOption
  "An option supported or by the instance."
  {:rdfs/comment "An option supported or by the instance.",
   :rdfs/label "supported option",
   :rdfs/range :rdf/Property,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})