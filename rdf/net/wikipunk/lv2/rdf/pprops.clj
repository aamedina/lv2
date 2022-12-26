(ns net.wikipunk.lv2.rdf.pprops
  "This vocabulary defines various properties for plugin ports, which can be used to better describe how a plugin can be controlled.  Using this metadata, hosts can build better UIs for plugins, and provide more advanced automatic functionality."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.ttl",
   :lv2/project {:doap/created    "2009-01-01",
                 :doap/developer  "http://lv2plug.in/ns/meta#kfoltman",
                 :doap/maintainer "http://drobilla.net/drobilla#me",
                 :doap/name       "LV2 Port Properties",
                 :doap/shortdesc  "Various properties for LV2 plugin ports.",
                 :rdf/about       "http://lv2plug.in/ns/ext/port-props",
                 :rdf/type        :doap/Project},
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/about "http://lv2plug.in/ns/ext/port-props",
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "pprops",
   :rdfa/uri "http://lv2plug.in/ns/ext/port-props#",
   :rdfs/comment "Various properties for LV2 plugin ports.",
   :rdfs/label "LV2 Port Properties",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.meta.ttl"})

(def causesArtifacts
  "Input ports only.  Indicates that any changes to the port value may produce slight artifacts to produced audio signals (zipper noise and other results of signal discontinuities).  Connecting ports of this type to continuous signals is not recommended, and when presenting a list of automation targets, those ports may be marked as artifact-producing."
  {:rdf/about    :pprops/causesArtifacts,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Input port causes audible artifacts when changed.",
   :rdfs/label   "changes cause artifacts"})

(def continuousCV
  "Indicates that the port carries a \"smooth\" modulation signal.  Control input ports of this type are well-suited for being connected to sources of smooth signals (knobs with smoothing, modulation rate oscillators, output ports with continuousCV type, etc.).  Typically, the plugin with ports which have this property will implement appropriate smoothing to avoid audio artifacts.  For output ports, this property suggests the value of the port is likely to change frequently, and describes a smooth signal (so successive values may be considered points along a curve)."
  {:rdf/about    :pprops/continuousCV,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port carries a smooth modulation signal.",
   :rdfs/label   "smooth modulation signal"})

(def discreteCV
  "Indicates that the port carries a \"discrete\" modulation signal.  Input ports of this type are well-suited for being connected to sources of discrete signals (switches, buttons, classifiers, event detectors, etc.).  May be combined with pprops:trigger property.  For output ports, this property suggests the value of the port describe discrete values that should be interpreted as steps (and not points along a curve)."
  {:rdf/about    :pprops/discreteCV,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port carries a discrete modulation signal.",
   :rdfs/label   "discrete modulation signal"})

(def displayPriority
  "Indicates how important a port is to controlling the plugin.  If a host can only display some ports of a plugin, it should prefer ports with a higher display priority.  Priorities do not need to be unique, and are only meaningful when compared to each other."
  {:rdf/about    :pprops/displayPriority,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A priority ranking this port in importance to its plugin.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "display priority",
   :rdfs/range   :xsd/nonNegativeInteger})

(def expensive
  "Input ports only.  Indicates that any changes to the port value may trigger expensive background calculation (for example, regeneration of lookup tables in a background thread).  Any value changes may have not have immediate effect, or may cause silence or diminished-quality version of the output until background processing is finished.  Ports having this property are typically not well suited for connection to outputs of other plugins, and should not be offered as connection targets or for automation by default."
  {:rdf/about    :pprops/expensive,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Input port is expensive to change.",
   :rdfs/label   "changes are expensive"})

(def hasStrictBounds
  "For hosts that support pprops:supportsStrictBounds, this indicates that the value of the port should never exceed the port's minimum and maximum control points.  For input ports, it moves the responsibility for limiting the range of values to host, if it supports pprops:supportsStrictBounds.  For output ports, it indicates that values within specified range are to be expected, and breaking that should be considered by the host as error in plugin implementation."
  {:rdf/about    :pprops/hasStrictBounds,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port has strict bounds which are not internally clamped.",
   :rdfs/label   "has strict bounds"})

(def logarithmic
  "Indicates that port value behaviour within specified range (bounds) is a value using logarithmic scale.  The lower and upper bounds must be specified, and must be of the same sign."
  {:rdf/about    :pprops/logarithmic,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port value is logarithmic.",
   :rdfs/label   "logarithmic"})

(def notAutomatic
  "Indicates that the port is not primarily intended to be fed with modulation signals from external sources (other plugins, etc.).  It is merely a UI hint and hosts may allow the user to override it."
  {:rdf/about :pprops/notAutomatic,
   :rdf/type :lv2/PortProperty,
   :rdfs/comment
   "Port that is not intended to be fed with a modulation signal.",
   :rdfs/label "not automatic"})

(def notOnGUI
  "Indicates that the port is not primarily intended to be represented by a separate control in the user interface window (or any similar mechanism used for direct, immediate control of control ports).  It is merely a UI hint and hosts may allow the user to override it."
  {:rdf/about    :pprops/notOnGUI,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port that should not be displayed on a GUI.",
   :rdfs/label   "not on GUI"})

(def rangeSteps
  "This value indicates into how many evenly-divided points the (control) port range should be divided for step-wise control.  This may be used for changing the value with step-based controllers like arrow keys, mouse wheel, rotary encoders, and so on.  Note that when used with a pprops:logarithmic port, the steps are logarithmic too, and port value can be calculated as:      :::c     value = lower * pow(upper / lower, step / (steps - 1))  and the step from value is:      :::c     step = (steps - 1) * log(value / lower) / log(upper / lower)  where:    * `value` is the port value.    * `step` is the step number (0..steps).    * `steps` is the number of steps (= value of :rangeSteps property).    * `lower` and <code>upper</code> are the bounds."
  {:rdf/about    :pprops/rangeSteps,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The number of even steps the range should be divided into.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "range steps",
   :rdfs/range   :xsd/nonNegativeInteger})

(def supportsStrictBounds
  "Indicates use of host support for pprops:hasStrictBounds port property.  A plugin that specifies it as optional feature can omit value clamping for hasStrictBounds ports, if the feature is supported by the host.  When specified as required feature, it indicates that the plugin does not do any clamping for input ports that have a pprops:hasStrictBounds property."
  {:rdf/about    :pprops/supportsStrictBounds,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature indicating plugin support for strict port bounds.",
   :rdfs/label   "supports strict bounds"})

(def trigger
  "Indicates that the data item corresponds to a momentary event that has been detected (control output ports) or is to be triggered (control input ports). For input ports, the port needs to be reset to lv2:default value after run() function of the plugin has returned.  If the control port is assigned a GUI widget by the host, the widget should be of auto-off (momentary, one-shot) type - for example, a push button if the port is also declared as lv2:toggled, or a series of push button or auto-clear input box with a \"Send\" button if the port is also lv2:integer."
  {:rdf/about    :pprops/trigger,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port is a momentary trigger.",
   :rdfs/label   "trigger"})