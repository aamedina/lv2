(ns net.wikipunk.rdf.lv2.pprops
  "Various properties for LV2 plugin ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2" "http://lv2plug.in/ns/lv2core#",
                       "lv2.pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/port-props",
   :rdfa/prefix "lv2.pprops",
   :rdfa/uri "http://lv2plug.in/ns/ext/port-props#",
   :rdfs/comment "Various properties for LV2 plugin ports.",
   :rdfs/label "LV2 Port Properties",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.meta.ttl"]})

(def causesArtifacts
  "Input port causes audible artifacts when changed."
  {:db/ident     :lv2.pprops/causesArtifacts,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Input port causes audible artifacts when changed.",
   :rdfs/label   "changes cause artifacts"})

(def continuousCV
  "Port carries a smooth modulation signal."
  {:db/ident     :lv2.pprops/continuousCV,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port carries a smooth modulation signal.",
   :rdfs/label   "smooth modulation signal"})

(def discreteCV
  "Port carries a discrete modulation signal."
  {:db/ident     :lv2.pprops/discreteCV,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port carries a discrete modulation signal.",
   :rdfs/label   "discrete modulation signal"})

(def displayPriority
  "A priority ranking this port in importance to its plugin."
  {:db/ident     :lv2.pprops/displayPriority,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A priority ranking this port in importance to its plugin.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "display priority",
   :rdfs/range   :xsd/nonNegativeInteger})

(def expensive
  "Input port is expensive to change."
  {:db/ident     :lv2.pprops/expensive,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Input port is expensive to change.",
   :rdfs/label   "changes are expensive"})

(def hasStrictBounds
  "Port has strict bounds which are not internally clamped."
  {:db/ident     :lv2.pprops/hasStrictBounds,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port has strict bounds which are not internally clamped.",
   :rdfs/label   "has strict bounds"})

(def logarithmic
  "Port value is logarithmic."
  {:db/ident     :lv2.pprops/logarithmic,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port value is logarithmic.",
   :rdfs/label   "logarithmic"})

(def notAutomatic
  "Port that is not intended to be fed with a modulation signal."
  {:db/ident :lv2.pprops/notAutomatic,
   :rdf/type :lv2/PortProperty,
   :rdfs/comment
   "Port that is not intended to be fed with a modulation signal.",
   :rdfs/label "not automatic"})

(def notOnGUI
  "Port that should not be displayed on a GUI."
  {:db/ident     :lv2.pprops/notOnGUI,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port that should not be displayed on a GUI.",
   :rdfs/label   "not on GUI"})

(def rangeSteps
  "The number of even steps the range should be divided into."
  {:db/ident     :lv2.pprops/rangeSteps,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The number of even steps the range should be divided into.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "range steps",
   :rdfs/range   :xsd/nonNegativeInteger})

(def supportsStrictBounds
  "A feature indicating plugin support for strict port bounds."
  {:db/ident     :lv2.pprops/supportsStrictBounds,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature indicating plugin support for strict port bounds.",
   :rdfs/label   "supports strict bounds"})

(def trigger
  "Port is a momentary trigger."
  {:db/ident     :lv2.pprops/trigger,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port is a momentary trigger.",
   :rdfs/label   "trigger"})