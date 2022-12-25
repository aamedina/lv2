(ns net.wikipunk.rdf.lv2.pprops
  "Various properties for LV2 plugin ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.ttl",
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/port-props"},
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/label "LV2 Port Properties",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.meta.ttl"},
   :vann/preferredNamespacePrefix "pprops",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/port-props#"})

(def causesArtifacts
  "Input port causes audible artifacts when changed."
  {:rdf/about  :pprops/causesArtifacts,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "changes cause artifacts"})

(def continuousCV
  "Port carries a smooth modulation signal."
  {:rdf/about  :pprops/continuousCV,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "smooth modulation signal"})

(def discreteCV
  "Port carries a discrete modulation signal."
  {:rdf/about  :pprops/discreteCV,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "discrete modulation signal"})

(def displayPriority
  "A priority ranking this port in importance to its plugin."
  {:rdf/about   :pprops/displayPriority,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :lv2/Port,
   :rdfs/label  "display priority",
   :rdfs/range  :xsd/nonNegativeInteger})

(def expensive
  "Input port is expensive to change."
  {:rdf/about  :pprops/expensive,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "changes are expensive"})

(def hasStrictBounds
  "Port has strict bounds which are not internally clamped."
  {:rdf/about  :pprops/hasStrictBounds,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "has strict bounds"})

(def logarithmic
  "Port value is logarithmic."
  {:rdf/about  :pprops/logarithmic,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "logarithmic"})

(def notAutomatic
  "Port that is not intended to be fed with a modulation signal."
  {:rdf/about  :pprops/notAutomatic,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "not automatic"})

(def notOnGUI
  "Port that should not be displayed on a GUI."
  {:rdf/about  :pprops/notOnGUI,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "not on GUI"})

(def rangeSteps
  "The number of even steps the range should be divided into."
  {:rdf/about   :pprops/rangeSteps,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :lv2/Port,
   :rdfs/label  "range steps",
   :rdfs/range  :xsd/nonNegativeInteger})

(def supportsStrictBounds
  "A feature indicating plugin support for strict port bounds."
  {:rdf/about  :pprops/supportsStrictBounds,
   :rdf/type   :lv2/Feature,
   :rdfs/label "supports strict bounds"})

(def trigger
  "Port is a momentary trigger."
  {:rdf/about  :pprops/trigger,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "trigger"})