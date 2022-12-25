(ns net.wikipunk.rdf.lv2.pprops
  "Various properties for LV2 plugin ports."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "pprops",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/port-props"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/port-props#",
   :rdf/ns-prefix-map {"pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def causesArtifacts
  "Input port causes audible artifacts when changed."
  {:rdfs/comment "Input port causes audible artifacts when changed.",
   :rdfs/label "changes cause artifacts",
   :rdf/type :lv2/PortProperty})

(def continuousCV
  "Port carries a smooth modulation signal."
  {:rdfs/comment "Port carries a smooth modulation signal.",
   :rdfs/label "smooth modulation signal",
   :rdf/type :lv2/PortProperty})

(def discreteCV
  "Port carries a discrete modulation signal."
  {:rdfs/comment "Port carries a discrete modulation signal.",
   :rdfs/label "discrete modulation signal",
   :rdf/type :lv2/PortProperty})

(def displayPriority
  "A priority ranking this port in importance to its plugin."
  {:rdfs/comment "A priority ranking this port in importance to its plugin.",
   :rdfs/label "display priority",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/domain :lv2/Port,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def expensive
  "Input port is expensive to change."
  {:rdfs/comment "Input port is expensive to change.",
   :rdfs/label "changes are expensive",
   :rdf/type :lv2/PortProperty})

(def hasStrictBounds
  "Port has strict bounds which are not internally clamped."
  {:rdfs/comment "Port has strict bounds which are not internally clamped.",
   :rdfs/label "has strict bounds",
   :rdf/type :lv2/PortProperty})

(def logarithmic
  "Port value is logarithmic."
  {:rdfs/comment "Port value is logarithmic.",
   :rdfs/label "logarithmic",
   :rdf/type :lv2/PortProperty})

(def notAutomatic
  "Port that is not intended to be fed with a modulation signal."
  {:rdfs/comment
     "Port that is not intended to be fed with a modulation signal.",
   :rdfs/label "not automatic",
   :rdf/type :lv2/PortProperty})

(def notOnGUI
  "Port that should not be displayed on a GUI."
  {:rdfs/comment "Port that should not be displayed on a GUI.",
   :rdfs/label "not on GUI",
   :rdf/type :lv2/PortProperty})

(def rangeSteps
  "The number of even steps the range should be divided into."
  {:rdfs/comment "The number of even steps the range should be divided into.",
   :rdfs/label "range steps",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/domain :lv2/Port,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def supportsStrictBounds
  "A feature indicating plugin support for strict port bounds."
  {:rdfs/comment "A feature indicating plugin support for strict port bounds.",
   :rdfs/label "supports strict bounds",
   :rdf/type :lv2/Feature})

(def trigger
  "Port is a momentary trigger."
  {:rdfs/comment "Port is a momentary trigger.",
   :rdfs/label "trigger",
   :rdf/type :lv2/PortProperty})