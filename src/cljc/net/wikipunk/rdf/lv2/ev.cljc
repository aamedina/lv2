(ns net.wikipunk.rdf.lv2.ev
  "A port-based real-time generic event interface."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/event.lv2/event.ttl",
   :owl/deprecated true,
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.ev" "http://lv2plug.in/ns/ext/event#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.ev",
   :rdfa/uri "http://lv2plug.in/ns/ext/event",
   :rdfs/comment "A port-based real-time generic event interface.",
   :rdfs/label "LV2 Event",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/event.lv2/event.meta.ttl"]})

(def Event
  "A single generic time-stamped event."
  {:db/ident     :lv2.ev/Event,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A single generic time-stamped event.",
   :rdfs/label   "Event"})

(def EventPort
  "An LV2 event port."
  {:db/ident        :lv2.ev/EventPort,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An LV2 event port.",
   :rdfs/label      "Event Port",
   :rdfs/subClassOf :lv2/Port})

(def FrameStamp
  "The default time stamp unit for an event."
  {:db/ident        :lv2.ev/FrameStamp,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "The default time stamp unit for an event.",
   :rdfs/label      "Audio Frame Time Stamp",
   :rdfs/subClassOf :lv2.ev/TimeStamp})

(def TimeStamp
  "The time stamp of an Event."
  {:db/ident     :lv2.ev/TimeStamp,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "The time stamp of an Event.",
   :rdfs/label   "Event Time Stamp"})

(def generatesTimeStamp
  "A time stamp type generated by this input port."
  {:db/ident     :lv2.ev/generatesTimeStamp,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A time stamp type generated by this input port.",
   :rdfs/domain  [:lv2/OutputPort :lv2.ev/EventPort],
   :rdfs/label   "generates time stamp type",
   :rdfs/range   :rdfs/Class})

(def generic
  "Port works with generic events."
  {:db/ident     :lv2.ev/generic,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port works with generic events.",
   :rdfs/label   "generic event port"})

(def inheritsEvent
  "Output port inherits event types from an input port."
  {:db/ident     :lv2.ev/inheritsEvent,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Output port inherits event types from an input port.",
   :rdfs/domain  [:lv2/OutputPort :lv2.ev/EventPort],
   :rdfs/label   "inherits event type",
   :rdfs/range   :lv2/Port})

(def inheritsTimeStamp
  "Output port inherits time stamp types from an input port."
  {:db/ident     :lv2.ev/inheritsTimeStamp,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Output port inherits time stamp types from an input port.",
   :rdfs/domain  [:lv2/OutputPort :lv2.ev/EventPort],
   :rdfs/label   "inherits time stamp type",
   :rdfs/range   :lv2/Port})

(def supportsEvent
  "An event type supported by this port."
  {:db/ident     :lv2.ev/supportsEvent,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An event type supported by this port.",
   :rdfs/domain  :lv2.ev/EventPort,
   :rdfs/label   "supports event type",
   :rdfs/range   :rdfs/Class})

(def supportsTimeStamp
  "A time stamp type supported by this input port."
  {:db/ident     :lv2.ev/supportsTimeStamp,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A time stamp type supported by this input port.",
   :rdfs/domain  [:lv2/InputPort :lv2.ev/EventPort],
   :rdfs/label   "supports time stamp type",
   :rdfs/range   :rdfs/Class})