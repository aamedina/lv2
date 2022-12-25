(ns net.wikipunk.rdf.lv2.ev
  "<span class=\"warning\">This extension is deprecated.</span> New implementations should use <a href=\"atom.html\">LV2 Atom</a> instead.  This extension defines a generic time-stamped event port type, which can be used to create plugins that read and write real-time events, such as MIDI, OSC, or any other type of event payload.  The type(s) of event supported by a port is defined in the data file for a plugin, for example:      :::turtle     <http://example.org/some-plugin>         lv2:port [             a ev:EventPort, lv2:InputPort ;             lv2:index 0 ;             ev:supportsEvent <http://lv2plug.in/ns/ext/midi#MidiEvent> ;             lv2:symbol \"midi_input\" ;             lv2:name \"MIDI input\" ;         ] ."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/event.lv2/event.ttl",
   :lv2/project {:doap/created "2008-00-00",
                 :doap/developer [{:rdf/uri "http://lv2plug.in/ns/meta#larsl"}
                                  {:rdf/uri "http://drobilla.net/drobilla#me"}],
                 :doap/license {:rdf/uri "http://opensource.org/licenses/isc"},
                 :doap/name "LV2 Event",
                 :doap/shortdesc
                 "A port-based real-time generic event interface.",
                 :rdf/type :doap/Project},
   :owl/deprecated true,
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/event"},
   :rdf/ns-prefix-map {"ev"   "http://lv2plug.in/ns/ext/event#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "A port-based real-time generic event interface.",
   :rdfs/label "LV2 Event",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/event.lv2/event.meta.ttl"},
   :vann/preferredNamespacePrefix "ev",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/event#"})

(def Event
  "An ev:EventPort contains an LV2_Event_Buffer which contains a sequence of these events.  The binary format of LV2 events is defined by the LV2_Event struct in event.h.  Specific event types (such as MIDI or OSC) are defined by extensions, and should be rdfs:subClassOf this class."
  {:rdf/about    :ev/Event,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A single generic time-stamped event.",
   :rdfs/label   "Event"})

(def EventPort
  "Ports of this type will be connected to a struct of type LV2_Event_Buffer, defined in event.h.  These ports contain a sequence of generic events (possibly several types mixed in a single stream), the specific types of which are defined by some URI in another LV2 extension."
  {:rdf/about       :ev/EventPort,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An LV2 event port.",
   :rdfs/label      "Event Port",
   :rdfs/subClassOf :lv2/Port})

(def FrameStamp
  "The default time stamp unit for an LV2 event: the frames field represents audio frames (in the sample rate passed to instantiate), and the subframes field is 1/UINT32_MAX of a frame."
  {:rdf/about       :ev/FrameStamp,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "The default time stamp unit for an event.",
   :rdfs/label      "Audio Frame Time Stamp",
   :rdfs/subClassOf :ev/TimeStamp})

(def TimeStamp
  "This defines the meaning of the 'frames' and 'subframes' fields of an LV2_Event (both unsigned 32-bit integers)."
  {:rdf/about    :ev/TimeStamp,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "The time stamp of an Event.",
   :rdfs/label   "Event Time Stamp"})

(def generatesTimeStamp
  "Indicates that this port may output a certain time stamp type, regardless of the time stamp type of any input ports.  If the port outputs stamps based on what type inputs are connected to, this property should not be set (use the ev:inheritsTimeStamp property for that). Hosts MUST check the time_stamp value of any output port buffers after a call to connect_port on ANY event input port on the plugin.  If the plugin changes the stamp_type field of an output event buffer during a call to run(), the plugin must call the stamp_type_changed function provided by the host in the LV2_Event_Feature struct, if it is non-NULL."
  {:rdf/about    :ev/generatesTimeStamp,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A time stamp type generated by this input port.",
   :rdfs/domain  [:lv2/OutputPort :ev/EventPort],
   :rdfs/label   "generates time stamp type",
   :rdfs/range   :rdfs/Class})

(def generic
  "Indicates that this port does something meaningful for any event type.  This is useful for things like event mixers, delays, serialisers, and so on.  If this property is set, hosts should consider the port suitable for any type of event.  Otherwise, hosts should consider the port 'appropriate' only for the specific event types listed with :supportsEvent.  Note that plugins must gracefully handle unknown event types whether or not this property is present."
  {:rdf/about    :ev/generic,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Port works with generic events.",
   :rdfs/label   "generic event port"})

(def inheritsEvent
  "Indicates that this output port might pass through events that arrived at some other input port (or generate an event of the same type as events arriving at that input).  The host must always check the stamp type of all outputs when connecting an input, but this property should be set whenever it applies."
  {:rdf/about    :ev/inheritsEvent,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Output port inherits event types from an input port.",
   :rdfs/domain  [:lv2/OutputPort :ev/EventPort],
   :rdfs/label   "inherits event type",
   :rdfs/range   :lv2/Port})

(def inheritsTimeStamp
  "Indicates that this port follows the time stamp type of an input port.  This property is not necessary, but it should be set for outputs that base their output type on an input port so the host can make more sense of the plugin and provide a more sensible interface."
  {:rdf/about    :ev/inheritsTimeStamp,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Output port inherits time stamp types from an input port.",
   :rdfs/domain  [:lv2/OutputPort :ev/EventPort],
   :rdfs/label   "inherits time stamp type",
   :rdfs/range   :lv2/Port})

(def supportsEvent
  "Indicates that this port supports or \"understands\" a certain event type.  For input ports, this means the plugin understands and does something useful with events of this type.  For output ports, this means the plugin may generate events of this type.  If the plugin never actually generates events of this type, but might pass them through from an input, this property should not be set (use ev:inheritsEvent for that).  Plugins with event input ports must always gracefully handle any type of event, even if it does not 'support' it.  This property should always be set for event types the plugin understands/generates so hosts can discover plugins appropriate for a given scenario (for example, plugins with a MIDI input). Hosts are not expected to consider event ports suitable for some type of event if the relevant :supportsEvent property is not set, unless the ev:generic property for that port is also set."
  {:rdf/about    :ev/supportsEvent,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An event type supported by this port.",
   :rdfs/domain  :ev/EventPort,
   :rdfs/label   "supports event type",
   :rdfs/range   :rdfs/Class})

(def supportsTimeStamp
  "Indicates that this port supports or \"understands\" a certain time stamp type. Meaningful only for input ports, the host must never connect a port to an event buffer with a time stamp type that isn't supported by the port."
  {:rdf/about    :ev/supportsTimeStamp,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A time stamp type supported by this input port.",
   :rdfs/domain  [:lv2/InputPort :ev/EventPort],
   :rdfs/label   "supports time stamp type",
   :rdfs/range   :rdfs/Class})