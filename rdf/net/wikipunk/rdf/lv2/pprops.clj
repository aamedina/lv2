(ns net.wikipunk.rdf.lv2.pprops
  "Various properties for LV2 plugin ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.ttl",
   :lv2/project
   {:doap/created    "2009-01-01",
    :doap/developer  {:rdf/uri "http://lv2plug.in/ns/meta#kfoltman"},
    :doap/maintainer {:rdf/uri "http://drobilla.net/drobilla#me"},
    :doap/name       "LV2 Port Properties",
    :doap/shortdesc  "Various properties for LV2 plugin ports.",
    :rdf/about       {:rdf/uri "http://lv2plug.in/ns/ext/port-props"},
    :rdf/type        :doap/Project},
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/port-props"},
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "Various properties for LV2 plugin ports.",
   :rdfs/label "LV2 Port Properties",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.meta.ttl"},
   :vann/preferredNamespacePrefix "pprops",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/port-props#"})

(def causesArtifacts
  "Input port causes audible artifacts when changed."
  {:rdf/about    :pprops/causesArtifacts,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Input port causes audible artifacts when changed.",
   :rdfs/label   "changes cause artifacts"})

(def continuousCV
  "Port carries a smooth modulation signal."
  {:rdf/about    :pprops/continuousCV,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port carries a smooth modulation signal.",
   :rdfs/label   "smooth modulation signal"})

(def discreteCV
  "Port carries a discrete modulation signal."
  {:rdf/about    :pprops/discreteCV,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port carries a discrete modulation signal.",
   :rdfs/label   "discrete modulation signal"})

(def displayPriority
  "A priority ranking this port in importance to its plugin."
  {:rdf/about    :pprops/displayPriority,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A priority ranking this port in importance to its plugin.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "display priority",
   :rdfs/range   :xsd/nonNegativeInteger})

(def expensive
  "Input port is expensive to change."
  {:rdf/about    :pprops/expensive,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Input port is expensive to change.",
   :rdfs/label   "changes are expensive"})

(def hasStrictBounds
  "Port has strict bounds which are not internally clamped."
  {:rdf/about    :pprops/hasStrictBounds,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port has strict bounds which are not internally clamped.",
   :rdfs/label   "has strict bounds"})

(def logarithmic
  "Port value is logarithmic."
  {:rdf/about    :pprops/logarithmic,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port value is logarithmic.",
   :rdfs/label   "logarithmic"})

(def notAutomatic
  "Port that is not intended to be fed with a modulation signal."
  {:rdf/about :pprops/notAutomatic,
   :rdf/type :lv2/PortProperty,
   :rdfs/comment
   "Port that is not intended to be fed with a modulation signal.",
   :rdfs/label "not automatic"})

(def notOnGUI
  "Port that should not be displayed on a GUI."
  {:rdf/about    :pprops/notOnGUI,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port that should not be displayed on a GUI.",
   :rdfs/label   "not on GUI"})

(def rangeSteps
  "The number of even steps the range should be divided into."
  {:rdf/about    :pprops/rangeSteps,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The number of even steps the range should be divided into.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "range steps",
   :rdfs/range   :xsd/nonNegativeInteger})

(def supportsStrictBounds
  "A feature indicating plugin support for strict port bounds."
  {:rdf/about    :pprops/supportsStrictBounds,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature indicating plugin support for strict port bounds.",
   :rdfs/label   "supports strict bounds"})

(def trigger
  "Port is a momentary trigger."
  {:rdf/about    :pprops/trigger,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port is a momentary trigger.",
   :rdfs/label   "trigger"})