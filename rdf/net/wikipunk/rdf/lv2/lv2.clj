(ns net.wikipunk.rdf.lv2.lv2
  "LV2 is an interface for writing audio plugins in C or compatible languages, which can be dynamically loaded into many _host_ applications.  This core specification is simple and minimal, but is designed so that _extensions_ can be defined to add more advanced features, making it possible to implement nearly any feature.  LV2 maintains a strong distinction between code and data.  Plugin code is in a shared library, while data is in a companion data file written in [Turtle](https://www.w3.org/TR/turtle/).  Code, data, and any other resources (such as waveforms) are shipped together in a bundle directory.  The code contains only the executable portions of the plugin.  All other data is provided in the data file(s).  This makes plugin data flexible and extensible, and allows the host to do everything but run the plugin without loading or executing any code.  Among other advantages, this makes hosts more robust (broken plugins can't crash a host during discovery) and allows generic tools written in any language to work with LV2 data.  The LV2 specification itself is distributed in a similar way.  An LV2 plugin library is suitable for dynamic loading (for example with `dlopen()`) and provides one or more plugin descriptors via `lv2_descriptor()` or `lv2_lib_descriptor()`.  These can be instantiated to create plugin instances, which can be run directly on data or connected together to perform advanced signal processing tasks.  Plugins communicate via _ports_, which can transmit any type of data.  Data is processed by first connecting each port to a buffer, then repeatedly calling the `run()` method to process blocks of data.  This core specification defines two types of port, equivalent to those in [LADSPA](http://www.ladspa.org/), lv2:ControlPort and lv2:AudioPort, as well as lv2:CVPort which has the same format as an audio port but is interpreted as non-audible control data.  Audio ports contain arrays with one `float` element per sample, allowing a block of audio to be processed in a single call to `run()`.  Control ports contain single `float` values, which are fixed and valid for the duration of the call to `run()`.  Thus the _control rate_ is determined by the block size, which is controlled by the host (and not necessarily constant).  ### Threading Rules  To facilitate use in multi-threaded programs, LV2 functions are partitioned into several threading classes:  | Discovery Class                  | Instantiation Class           | Audio Class                    | |----------------------------------|-------------------------------|------------------------------- | | lv2_descriptor()                 | LV2_Descriptor::instantiate() | LV2_Descriptor::run()          | | lv2_lib_descriptor()             | LV2_Descriptor::cleanup()     | LV2_Descriptor::connect_port() | | LV2_Descriptor::extension_data() | LV2_Descriptor::activate()    |                                | |                                  | LV2_Descriptor::deactivate()  |                                |  Hosts MUST guarantee that:   * A function in any class is never called concurrently with another function    in that class.   * A _Discovery_ function is never called concurrently with any other function    in the same shared object file.   * An _Instantiation_ function for an instance is never called concurrently    with any other function for that instance.  Any simultaneous calls that are not explicitly forbidden by these rules are allowed. For example, a host may call `run()` for two different plugin instances simultaneously.  Plugin functions in any class MUST NOT manipulate any state which might affect other plugins or the host (beyond the contract of that function), for example by using non-reentrant global functions.  Extensions to this specification which add new functions MUST declare in which of these classes the functions belong, define new classes for them, or otherwise precisely describe their threading rules."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/core.lv2/lv2core.ttl",
   :lv2/project
   {:doap/created    "2004-04-21",
    :doap/developer  [{:rdf/uri "http://drobilla.net/drobilla#me"}
                      {:rdf/uri "http://plugin.org.uk/swh.xrdf#me"}],
    :doap/homepage   {:rdf/uri "http://lv2plug.in"},
    :doap/license    {:rdf/uri "http://opensource.org/licenses/isc"},
    :doap/maintainer {:rdf/uri "http://drobilla.net/drobilla#me"},
    :doap/name       "LV2",
    :doap/programming-language "C",
    :doap/shortdesc  "An extensible open standard for audio plugins",
    :rdf/type        :doap/Project},
   :owl/imports {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/ns-prefix-map {"doap" "http://usefulinc.com/ns/doap#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "An extensible open standard for audio plugins.",
   :rdfs/label "LV2",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/core.lv2/lv2core.meta.ttl"},
   :vann/preferredNamespacePrefix "lv2",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/lv2core#"}
  (:refer-clojure :exclude [symbol name]))

(def AllpassPlugin
  "A filter that changes the phase relationship between frequency components."
  {:rdf/about :lv2/AllpassPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A filter that changes the phase relationship between frequency components.",
   :rdfs/label "Allpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def AmplifierPlugin
  "A plugin that primarily changes the volume of its input."
  {:rdf/about       :lv2/AmplifierPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that primarily changes the volume of its input.",
   :rdfs/label      "Amplifier Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def AnalyserPlugin
  "A plugin that analyses its input and emits some useful information."
  {:rdf/about :lv2/AnalyserPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin that analyses its input and emits some useful information.",
   :rdfs/label "Analyser Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def AudioPort
  "Ports of this type are connected to a buffer of `float` audio samples, which the host guarantees have `sample_count` elements in any call to LV2_Descriptor::run().  Audio samples are normalized between -1.0 and 1.0, though there is no requirement for samples to be strictly within this range."
  {:rdf/about       :lv2/AudioPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port connected to an array of float audio samples.",
   :rdfs/label      "Audio Port",
   :rdfs/subClassOf :lv2/Port})

(def BandpassPlugin
  "A filter that attenuates frequencies outside of some band."
  {:rdf/about :lv2/BandpassPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A filter that attenuates frequencies outside of some band.",
   :rdfs/label "Bandpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def CVPort
  "Ports of this type have the same buffer format as an lv2:AudioPort, except the buffer represents audio-rate control data rather than audio.  Like a lv2:ControlPort, a CV port SHOULD have properties describing its value, in particular lv2:minimum, lv2:maximum, and lv2:default.  Hosts may present CV ports to users as controls in the same way as control ports.  Conceptually, aside from the buffer format, a CV port is the same as a control port, so hosts can use all the same properties and expectations.  In particular, this port type does not imply any range, unit, or meaning for its values.  However, if there is no inherent unit to the values, for example if the port is used to modulate some other value, then plugins SHOULD use a normalized range, either from -1.0 to 1.0, or from 0.0 to 1.0.  It is generally safe to connect an audio output to a CV input, but not vice-versa.  Hosts must take care to prevent data from a CVPort port from being used as audio."
  {:rdf/about       :lv2/CVPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port connected to an array of float control values.",
   :rdfs/label      "CV Port",
   :rdfs/subClassOf :lv2/Port})

(def Channel
  "A specific channel, for example the <q>left</q> channel of a stereo stream.  A channel may be audio, or another type such as a MIDI control stream."
  {:rdf/about       :lv2/Channel,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "An individual channel, such as left or right.",
   :rdfs/label      "Channel",
   :rdfs/subClassOf :lv2/Designation})

(def ChorusPlugin
  "An effect that mixes significantly delayed copies of its input."
  {:rdf/about :lv2/ChorusPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "An effect that mixes significantly delayed copies of its input.",
   :rdfs/label "Chorus Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin})

(def CombPlugin
  "A filter that adds a delayed version of its input to itself."
  {:rdf/about :lv2/CombPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A filter that adds a delayed version of its input to itself.",
   :rdfs/label "Comb Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def CompressorPlugin
  "A plugin that reduces the dynamic range of its input."
  {:rdf/about       :lv2/CompressorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that reduces the dynamic range of its input.",
   :rdfs/label      "Compressor Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def ConstantPlugin
  "A plugin that emits constant values."
  {:rdf/about       :lv2/ConstantPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that emits constant values.",
   :rdfs/label      "Constant Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin})

(def ControlPort
  "A port connected to a single `float`."
  {:rdf/about       :lv2/ControlPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port connected to a single `float`.",
   :rdfs/label      "Control Port",
   :rdfs/subClassOf :lv2/Port})

(def ConverterPlugin
  "A plugin that converts its input into a different form."
  {:rdf/about       :lv2/ConverterPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that converts its input into a different form.",
   :rdfs/label      "Converter Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def DelayPlugin
  "An effect that intentionally delays its input as an effect."
  {:rdf/about :lv2/DelayPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "An effect that intentionally delays its input as an effect.",
   :rdfs/label "Delay Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Designation
  "A designation is metadata that describes the meaning or role of something.  By assigning a designation to a port using lv2:designation, the port's content becomes meaningful and can be used more intelligently by the host."
  {:rdf/about       :lv2/Designation,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A designation which defines the meaning of some data.",
   :rdfs/label      "Designation",
   :rdfs/subClassOf :rdf/Property})

(def DistortionPlugin
  "A plugin that adds distortion to its input."
  {:rdf/about       :lv2/DistortionPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that adds distortion to its input.",
   :rdfs/label      "Distortion Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def DynamicsPlugin
  "A plugin that alters the envelope or dynamic range of its input."
  {:rdf/about :lv2/DynamicsPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin that alters the envelope or dynamic range of its input.",
   :rdfs/label "Dynamics Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def EQPlugin
  "A plugin that adjusts the balance between frequency components."
  {:rdf/about :lv2/EQPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin that adjusts the balance between frequency components.",
   :rdfs/label "EQ Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def EnvelopePlugin
  "A plugin that applies an envelope to its input."
  {:rdf/about       :lv2/EnvelopePlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that applies an envelope to its input.",
   :rdfs/label      "Envelope Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def ExpanderPlugin
  "A plugin that expands the dynamic range of its input."
  {:rdf/about       :lv2/ExpanderPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that expands the dynamic range of its input.",
   :rdfs/label      "Expander Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def ExtensionData
  "This is additional data that a plugin may return from LV2_Descriptor::extension_data().  This is generally used to add APIs to extend that defined by LV2_Descriptor."
  {:rdf/about    :lv2/ExtensionData,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "Additional data defined by an extension.",
   :rdfs/label   "Extension Data"})

(def Feature
  "An additional feature which may be used or required."
  {:rdf/about    :lv2/Feature,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "An additional feature which may be used or required.",
   :rdfs/label   "Feature"})

(def FilterPlugin
  "An effect that manipulates the frequency spectrum of its input."
  {:rdf/about :lv2/FilterPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "An effect that manipulates the frequency spectrum of its input.",
   :rdfs/label "Filter Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def FlangerPlugin
  "An effect that mixes slightly delayed copies of its input."
  {:rdf/about :lv2/FlangerPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "An effect that mixes slightly delayed copies of its input.",
   :rdfs/label "Flanger Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin})

(def FunctionPlugin
  "A plugin whose output is a mathematical function of its input."
  {:rdf/about :lv2/FunctionPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin whose output is a mathematical function of its input.",
   :rdfs/label "Function Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def GatePlugin
  "A plugin that attenuates signals below some threshold."
  {:rdf/about       :lv2/GatePlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that attenuates signals below some threshold.",
   :rdfs/label      "Gate Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def GeneratorPlugin
  "A plugin that generates new sound internally."
  {:rdf/about       :lv2/GeneratorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that generates new sound internally.",
   :rdfs/label      "Generator Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def HighpassPlugin
  "A filter that attenuates frequencies below some cutoff."
  {:rdf/about       :lv2/HighpassPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A filter that attenuates frequencies below some cutoff.",
   :rdfs/label      "Highpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def InputPort
  "A port connected to constant data which is read during `run()`."
  {:rdf/about :lv2/InputPort,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A port connected to constant data which is read during `run()`.",
   :rdfs/label "Input Port",
   :rdfs/subClassOf :lv2/Port})

(def InstrumentPlugin
  "A plugin intended to be played as a musical instrument."
  {:rdf/about       :lv2/InstrumentPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin intended to be played as a musical instrument.",
   :rdfs/label      "Instrument Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin})

(def LimiterPlugin
  "A plugin that limits its input to some maximum level."
  {:rdf/about       :lv2/LimiterPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that limits its input to some maximum level.",
   :rdfs/label      "Limiter Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def LowpassPlugin
  "A filter that attenuates frequencies above some cutoff."
  {:rdf/about       :lv2/LowpassPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A filter that attenuates frequencies above some cutoff.",
   :rdfs/label      "Lowpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def MIDIPlugin
  "A plugin that primarily processes MIDI messages."
  {:rdf/about       :lv2/MIDIPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that primarily processes MIDI messages.",
   :rdfs/label      "MIDI Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Markdown
  "This datatype is typically used for documentation in [Markdown](https://daringfireball.net/projects/markdown/syntax) syntax.  Generally, documentation with this datatype should stay as close to readable plain text as possible, but may use core Markdown syntax for nicer presentation.  Documentation can assume that basic extensions like codehilite and tables are available."
  {:owl/onDatatype :xsd/string,
   :rdf/about      :lv2/Markdown,
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment   "A string in Markdown syntax.",
   :rdfs/label     "Markdown"})

(def MixerPlugin
  "A plugin that mixes some number of inputs into some number of outputs."
  {:rdf/about :lv2/MixerPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin that mixes some number of inputs into some number of outputs.",
   :rdfs/label "Mixer Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def ModulatorPlugin
  "An effect that modulats its input as an effect."
  {:rdf/about       :lv2/ModulatorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "An effect that modulats its input as an effect.",
   :rdfs/label      "Modulator Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def MultiEQPlugin
  "A plugin that adjusts the balance between a fixed set of frequency components."
  {:rdf/about :lv2/MultiEQPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin that adjusts the balance between a fixed set of frequency components.",
   :rdfs/label "Multiband EQ Plugin",
   :rdfs/subClassOf :lv2/EQPlugin})

(def OscillatorPlugin
  "A plugin that generates output with an oscillator."
  {:rdf/about       :lv2/OscillatorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that generates output with an oscillator.",
   :rdfs/label      "Oscillator Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin})

(def OutputPort
  "A port connected to data which is written during `run()`."
  {:rdf/about       :lv2/OutputPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port connected to data which is written during `run()`.",
   :rdfs/label      "Output Port",
   :rdfs/subClassOf :lv2/Port})

(def ParaEQPlugin
  "A plugin that adjusts the balance between configurable frequency components."
  {:rdf/about :lv2/ParaEQPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin that adjusts the balance between configurable frequency components.",
   :rdfs/label "Parametric EQ Plugin",
   :rdfs/subClassOf :lv2/EQPlugin})

(def Parameter
  "A parameter is a designation for a control.  A parameter defines the meaning of a control, not the method of conveying its value.  For example, a parameter could be controlled via a lv2:ControlPort, messages, or both.  A lv2:ControlPort can be associated with a parameter using lv2:designation."
  {:rdf/about       :lv2/Parameter,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A property that is a plugin parameter.",
   :rdfs/label      "Parameter",
   :rdfs/subClassOf [:rdf/Property :lv2/Designation]})

(def PhaserPlugin
  "An effect that periodically sweeps a filter over its input."
  {:rdf/about :lv2/PhaserPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "An effect that periodically sweeps a filter over its input.",
   :rdfs/label "Phaser Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin})

(def PitchPlugin
  "A plugin that shifts the pitch of its input."
  {:rdf/about       :lv2/PitchPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that shifts the pitch of its input.",
   :rdfs/label      "Pitch Shifter Plugin",
   :rdfs/subClassOf :lv2/SpectralPlugin})

(def Plugin
  "To be discovered by hosts, plugins MUST explicitly have an rdf:type of lv2:Plugin in their bundle's manifest, for example:      :::turtle     <http://example.org/my-plugin> a lv2:Plugin .  Plugins should have a doap:name property that is at most a few words in length using title capitalization, for example <q>Tape Delay Unit</q>."
  {:rdf/about :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "An LV2 plugin.",
   :rdfs/label "Plugin",
   :rdfs/subClassOf
   [{:owl/allValuesFrom :lv2/Port,
     :owl/onProperty :lv2/port,
     :rdf/type :owl/Restriction,
     :rdfs/comment
     "All ports on a plugin MUST be fully specified lv2:Port instances."}
    {:owl/onProperty :doap/name,
     :owl/someValuesFrom :rdf/PlainLiteral,
     :rdf/type :owl/Restriction,
     :rdfs/comment "A plugin MUST have at least one untranslated doap:name."}
    :lv2/PluginBase]})

(def PluginBase
  "An abstract plugin-like resource that may not actually be an LV2 plugin, for example that may not have a lv2:binary.  This is useful for describing things that share common structure with a plugin, but are not themselves an actual plugin, such as presets."
  {:rdf/about    :lv2/PluginBase,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "Base class for a plugin-like resource.",
   :rdfs/label   "Plugin Base"})

(def Point
  "* A Point MUST have at least one rdfs:label which is a string.    * A Point MUST have exactly one rdf:value with a type that is compatible with     the type of the corresponding Port."
  {:rdf/about    :lv2/Point,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "An interesting point in a value range.",
   :rdfs/label   "Point"})

(def Port
  "All LV2 port descriptions MUST have a rdf:type that is one of lv2:Port, lv2:InputPort or lv2:OutputPort.  Additionally, there MUST be at least one other rdf:type which more precisely describes type of the port, for example lv2:AudioPort.  Hosts that do not support a specific port class MUST NOT instantiate the plugin, unless that port has the lv2:connectionOptional property set.  A port has two identifiers: a (numeric) index, and a (textual) symbol.  The index can be used as an identifier at run-time, but persistent references to ports (for example in presets or save files) MUST use the symbol.  Only the symbol is guaranteed to refer to the same port on all plugins with a given URI, that is the index for a port may differ between plugin binaries."
  {:rdf/about       :lv2/Port,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "An LV2 plugin port.",
   :rdfs/label      "Port",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty :lv2/name,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment "A port MUST have at least one lv2:name."}
                     :lv2/PortBase]})

(def PortBase
  "Similar to lv2:PluginBase, this is an abstract port-like resource that may not be a fully specified LV2 port.  For example, this is used for preset \"ports\" which do not specify an index."
  {:rdf/about       :lv2/PortBase,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "Base class for a port-like resource.",
   :rdfs/label      "Port Base",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :lv2/symbol,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment "A port MUST have exactly one lv2:symbol."}})

(def PortProperty
  "A particular property that a port has."
  {:rdf/about    :lv2/PortProperty,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A particular property that a port has.",
   :rdfs/label   "Port Property"})

(def ReverbPlugin
  "An effect that adds reverberation to its input."
  {:rdf/about       :lv2/ReverbPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "An effect that adds reverberation to its input.",
   :rdfs/label      "Reverb Plugin",
   :rdfs/subClassOf [:lv2/DelayPlugin :lv2/SimulatorPlugin :lv2/Plugin]})

(def ScalePoint
  "A single `float` Point for control inputs."
  {:rdf/about       :lv2/ScalePoint,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A single `float` Point for control inputs.",
   :rdfs/label      "Scale Point",
   :rdfs/subClassOf :lv2/Point})

(def SimulatorPlugin
  "A plugin that aims to emulate some environmental effect or musical equipment."
  {:rdf/about :lv2/SimulatorPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A plugin that aims to emulate some environmental effect or musical equipment.",
   :rdfs/label "Simulator Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def SpatialPlugin
  "A plugin that manipulates the position of audio in space."
  {:rdf/about       :lv2/SpatialPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that manipulates the position of audio in space.",
   :rdfs/label      "Spatial Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Specification
  "An LV2 specification typically contains a vocabulary description, C headers to define an API, and any other resources that may be useful.  Specifications, like plugins, are distributed and installed as bundles so that hosts may discover them."
  {:rdf/about       :lv2/Specification,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "An LV2 specifiation.",
   :rdfs/label      "Specification",
   :rdfs/subClassOf :doap/Project})

(def SpectralPlugin
  "A plugin that alters the spectral properties of audio."
  {:rdf/about       :lv2/SpectralPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A plugin that alters the spectral properties of audio.",
   :rdfs/label      "Spectral Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Symbol
  "The first character of a symbol must be one of `_`, `a-z` or `A-Z`, and subsequent characters may additionally be `0-9`.  This is, among other things, a valid C identifier, and generally compatible in most contexts which have restrictions on string identifiers, such as file paths."
  {:owl/onDatatype       :xsd/string,
   :owl/withRestrictions [{:xsd/pattern "[_a-zA-Z][_a-zA-Z0-9]*"}],
   :rdf/about            :lv2/Symbol,
   :rdf/type             :rdfs/Datatype,
   :rdfs/comment         "A short restricted name used as a strong identifier.",
   :rdfs/label           "Symbol"})

(def UtilityPlugin
  "A utility plugin that is not a typical audio effect or generator."
  {:rdf/about :lv2/UtilityPlugin,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A utility plugin that is not a typical audio effect or generator.",
   :rdfs/label "Utility Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def WaveshaperPlugin
  "An effect that alters the shape of input waveforms."
  {:rdf/about       :lv2/WaveshaperPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "An effect that alters the shape of input waveforms.",
   :rdfs/label      "Waveshaper Plugin",
   :rdfs/subClassOf :lv2/DistortionPlugin})

(def appliesTo
  "This is primarily intended for discovery purposes: bundles that describe resources that work with particular plugins (like presets or user interfaces) SHOULD specify this in their `manifest.ttl` so the host can associate them with the correct plugin.  For example:      :::turtle     <thing>         a             ext:Thing ;         lv2:appliesTo <plugin> ;         rdfs:seeAlso  <thing.ttl> .  Using this pattern is preferable for large amounts of data, since the host may choose whether/when to load the data."
  {:rdf/about    :lv2/appliesTo,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The plugin this resource is related to.",
   :rdfs/label   "applies to",
   :rdfs/range   :lv2/Plugin})

(def binary
  "The value of this property must be the URI of a shared library object, typically in the same bundle as the data file which contains this property. The actual type of the library is platform specific.  This is a required property of a lv2:Plugin which MUST be included in the bundle's `manifest.ttl` file.  The lv2:binary of a lv2:Plugin is the shared object containing the lv2_descriptor() or lv2_lib_descriptor() function.  This probably may also be used similarly by extensions to relate other resources to their implementations (it is not implied that a lv2:binary on an arbitrary resource is an LV2 plugin library)."
  {:rdf/about    :lv2/binary,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The binary of this resource.",
   :rdfs/label   "binary",
   :rdfs/range   :owl/Thing})

(def connectionOptional
  "This property means that the port does not have to be connected to valid data by the host.  To leave a port <q>unconnected</q>, the host MUST explicitly connect the port to `NULL`."
  {:rdf/about    :lv2/connectionOptional,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "The property that this port may be connected to NULL.",
   :rdfs/label   "connection optional"})

(def control
  "This should be used as the lv2:designation of ports that are used to send commands and receive responses.  Typically this will be an event port that supports some protocol, for example MIDI or LV2 Atoms."
  {:rdf/about    :lv2/control,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The primary control channel.",
   :rdfs/label   "control"})

(def default
  "The host SHOULD set the port to this value initially, and in any situation where the port value should be cleared or reset."
  {:rdf/about    :lv2/default,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The default value for this control.",
   :rdfs/label   "default"})

(def designation
  "This property is used to give a port's contents a well-defined meaning.  For example, if a port has the designation `eg:gain`, then the value of that port represents the `eg:gain` of the plugin instance.  Ports should be given designations whenever possible, particularly if a suitable designation is already defined.  This allows the host to act more intelligently and provide a more effective user interface.  For example, if the plugin has a BPM parameter, the host may automatically set that parameter to the current tempo."
  {:rdf/about :lv2/designation,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The designation that defines the meaning of this input or output.",
   :rdfs/label "designation",
   :rdfs/range :rdf/Property})

(def documentation
  "Relates a Resource to extended documentation.  LV2 specifications are documented using this property with an lv2:Markdown datatype.  If the value has no explicit datatype, it is assumed to be a valid XHTML Basic 1.1 fragment suitable for use as the content of the `body` element of a page.  XHTML Basic is a W3C Recommendation which defines a simplified subset of XHTML intended to be reasonable to implement with limited resources, for exampe on embedded devices. See [XHTML Basic, Section 3](http://www.w3.org/TR/xhtml-basic/#s_xhtmlmodules) for a list of valid tags."
  {:rdf/about    :lv2/documentation,
   :rdf/type     [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment "Extended documentation.",
   :rdfs/label   "documentation",
   :rdfs/range   :rdfs/Literal,
   :rdfs/seeAlso {:rdf/uri "http://www.w3.org/TR/xhtml-basic/"}})

(def enabled
  "If this value is greater than zero, the plugin processes normally.  If this value is zero, the plugin is expected to bypass all signals unmodified.  The plugin must provide a click-free transition between the enabled and disabled (bypassed) states.  Values less than zero are reserved for future use (such as click-free insertion/removal of latent plugins), and should be treated like zero (bypassed) by current implementations."
  {:rdf/about    :lv2/enabled,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Whether processing is currently enabled (not bypassed).",
   :rdfs/label   "enabled",
   :rdfs/range   :xsd/int})

(def enumeration
  "Indicates that all the rasonable values for a port are defined by lv2:scalePoint properties.  For such ports, a user interface should provide a selector that allows the user to choose any of the scale point values by name.  It is recommended to show the value as well if possible.  Note that this is only a hint, and that the plugin MUST operate reasonably even if such a port has a value that does not correspond to a scale point."
  {:rdf/about    :lv2/enumeration,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Control port scale points represent all useful values.",
   :rdfs/label   "enumeration"})

(def extensionData
  "If a plugin has a value for this property, it must be a URI that defines the extension data.  The plugin should return the appropriate data when LV2_Descriptor::extension_data() is called with that URI as a parameter."
  {:rdf/about    :lv2/extensionData,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Extension data provided by a plugin or other binary.",
   :rdfs/label   "extension data",
   :rdfs/range   :lv2/ExtensionData})

(def freeWheeling
  "If true, this means that all processing is happening as quickly as possible, not in real-time.  When free-wheeling there is no relationship between the passage of real wall-clock time and the passage of time in the data being processed."
  {:rdf/about    :lv2/freeWheeling,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Whether processing is currently free-wheeling.",
   :rdfs/label   "free-wheeling",
   :rdfs/range   :xsd/boolean})

(def hardRTCapable
  "This feature indicates that the plugin is capable of running in a <q>hard real-time</q> environment.  This should be the case for most audio processors, so most plugins are expected to have this feature.  To support this feature, plugins MUST adhere to the following in all of their audio class functions (LV2_Descriptor::run() and LV2_Descriptor::connect_port()):    * There is no use of `malloc()`, `free()` or any other heap memory management     functions.    * There is no use of any library functions which do not adhere to these     rules.  The plugin may assume that the standard C math library functions     are safe.    * There is no access to files, devices, pipes, sockets, system calls, or any     other mechanism that might result in the process or thread blocking.    * The maximum amount of time for a `run()` call is bounded by some expression     of the form `A + B * sample_count`, where `A` and `B` are platform specific     constants.  Note that this bound does not depend on input signals or plugin     state."
  {:rdf/about :lv2/hardRTCapable,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "Plugin is capable of running in a hard real-time environment.",
   :rdfs/label "hard real-time capable"})

(def inPlaceBroken
  "This feature indicates that the plugin may not work correctly if the host elects to use the same data location for both input and output.  Plugins that will fail to work correctly if ANY input port is connected to the same location as ANY output port MUST require this feature.  Doing so should be avoided whenever possible since it prevents hosts from running the plugin on data <q>in-place</q>."
  {:rdf/about    :lv2/inPlaceBroken,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Plugin requires separate locations for input and output.",
   :rdfs/label   "in-place broken"})

(def index
  "A non-negative zero-based 32-bit index."
  {:rdf/about    :lv2/index,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A non-negative zero-based 32-bit index.",
   :rdfs/label   "index",
   :rdfs/range   :xsd/unsignedInt})

(def integer
  "Indicates that all the reasonable values for a port are integers.  For such ports, a user interface should provide a stepped control that only allows choosing integer values.  Note that this is only a hint, and that the plugin MUST operate reasonably even if such a port has a non-integer value."
  {:rdf/about    :lv2/integer,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Control port values are treated as integers.",
   :rdfs/label   "integer"})

(def isLive
  "This feature is for plugins that have time-sensitive internals, for example communicating in real time over a socket.  It indicates to the host that its input and output must not be cached or subject to significant latency, and that calls to LV2_Descriptor::run() should be made at a rate that roughly corresponds to wall clock time (according to the `sample_count` parameter).  Note that this feature is not related to <q>hard real-time</q> execution requirements (see lv2:hardRTCapable)."
  {:rdf/about    :lv2/isLive,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Plugin has a real-time dependency.",
   :rdfs/label   "is live"})

(def isSideChain
  "Indicates that a port is a <q>sidechain</q>, which affects the output somehow but should not be considered a part of the main signal chain.  Sidechain ports SHOULD be lv2:connectionOptional, and may be ignored by hosts."
  {:rdf/about :lv2/isSideChain,
   :rdf/type :lv2/PortProperty,
   :rdfs/comment
   "Signal for port should not be considered a main input or output.",
   :rdfs/label "is side-chain"})

(def latency
  "The latency introduced, in frames."
  {:rdf/about    :lv2/latency,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The latency introduced, in frames.",
   :rdfs/label   "latency",
   :rdfs/range   :xsd/nonNegativeInteger})

(def maximum
  "This is a soft limit: the plugin is required to gracefully accept all values in the range of a port's data type."
  {:rdf/about    :lv2/maximum,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The maximum value for this control.",
   :rdfs/label   "maximum"})

(def microVersion
  "Releases of plugins and extensions MUST be explicitly versioned.  Correct version numbers MUST always be maintained for any versioned resource that is published. For example, after a release, if a change is made in the development version in source control, the micro version MUST be incremented (to an odd number) to distinguish this modified version from the previous release.  This property describes half of a resource version. For detailed documentation on LV2 resource versioning, see lv2:minorVersion."
  {:rdf/about    :lv2/microVersion,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The micro version of this resource.",
   :rdfs/label   "micro version",
   :rdfs/range   :xsd/nonNegativeInteger})

(def minimum
  "This is a soft limit: the plugin is required to gracefully accept all values in the range of a port's data type."
  {:rdf/about    :lv2/minimum,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The minimum value for this control.",
   :rdfs/label   "minimum"})

(def minorVersion
  "This, along with lv2:microVersion, is used to distinguish between different versions of the <q>same</q> resource, for example to load only the bundle with the most recent version of a plugin.  An LV2 version has a minor and micro number with the usual semantics:    * The minor version MUST be incremented when backwards (but not forwards)     compatible additions are made, for example the addition of a port to a     plugin.    * The micro version is incremented for changes which do not affect     compatibility at all, for example bug fixes or documentation updates.  Note that there is deliberately no major version: all versions with the same URI are compatible by definition.  Replacing a resource with a newer version of that resource MUST NOT break anything.  If a change violates this rule, then the URI of the resource (which serves as the major version) MUST be changed.  Plugins and extensions MUST adhere to at least the following rules:    * All versions of a plugin with a given URI MUST have the <q>same</q> set of     mandatory (not lv2:connectionOptional) ports with respect to lv2:symbol and     rdf:type.  In other words, every port on a particular version is guaranteed     to exist on a future version with same lv2:symbol and at least those     rdf:types.    * New ports MAY be added without changing the plugin URI if and only if they     are lv2:connectionOptional and the minor version is incremented.    * The minor version MUST be incremented if the index of any port (identified     by its symbol) is changed.    * All versions of a specification MUST be compatible in the sense that an     implementation of the new version can interoperate with an implementation     of any previous version.  Anything that depends on a specific version of a plugin (including referencing ports by index) MUST refer to the plugin by both URI and version.  However, implementations should be tolerant where possible.  When hosts discover several installed versions of a resource, they SHOULD warn the user and load only the most recent version.  An odd minor _or_ micro version, or minor version zero, indicates that the resource is a development version.  Hosts and tools SHOULD clearly indicate this wherever appropriate.  Minor version zero is a special case for pre-release development of plugins, or experimental plugins that are not intended for stable use at all.  Hosts SHOULD NOT expect such a plugin to remain compatible with any future version.  Where feasible, hosts SHOULD NOT expose such plugins to users by default, but may provide an option to display them."
  {:rdf/about    :lv2/minorVersion,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The minor version of this resource.",
   :rdfs/label   "minor version",
   :rdfs/range   :xsd/nonNegativeInteger})

(def name
  "Unlike lv2:symbol, this is unrestricted, may be translated, and is not relevant for compatibility.  The name is not necessarily unique and MUST NOT be used as an identifier."
  {:rdf/about    :lv2/name,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A display name for labeling in a user interface.",
   :rdfs/label   "name",
   :rdfs/range   :xsd/string})

(def optionalFeature
  "To support this feature, the host MUST pass its URI and any additional data to the plugin in LV2_Descriptor::instantiate().  The plugin MUST NOT fail to instantiate if an optional feature is not supported by the host."
  {:rdf/about    :lv2/optionalFeature,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An optional feature that is supported if available.",
   :rdfs/label   "optional feature",
   :rdfs/range   :lv2/Feature})

(def port
  "A port (input or output) on this plugin."
  {:rdf/about    :lv2/port,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A port (input or output) on this plugin.",
   :rdfs/domain  :lv2/PluginBase,
   :rdfs/label   "port",
   :rdfs/range   :lv2/PortBase})

(def portProperty
  "States that a port has a particular lv2:PortProperty.  This may be ignored without catastrophic effects, though it may be useful, for example to provide a sensible user interface for the port."
  {:rdf/about    :lv2/portProperty,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A property of this port hosts may find useful.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "port property",
   :rdfs/range   :lv2/PortProperty})

(def project
  "This property provides a way to group plugins and/or related resources.  A project may have useful metadata common to all plugins (such as homepage, author, version history) which would be wasteful to list separately for each plugin.  Grouping via projects also allows users to find plugins in hosts by project, which is often how they are remembered.  For this reason, a project that contains plugins SHOULD always have a doap:name.  It is also a good idea for each plugin and the project itself to have an lv2:symbol property, which allows nice quasi-global identifiers for plugins, for example `myproj.superamp` which can be useful for display or fast user entry."
  {:rdf/about    :lv2/project,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The project this is a part of.",
   :rdfs/label   "project",
   :rdfs/range   :doap/Project})

(def prototype
  "This property can be used to <q>include</q> common properties in several descriptions, serving as a sort of template mechanism.  If a plugin has a prototype, then the host must load all the properties for the prototype as if they were properties of the plugin.  That is, if `:plug lv2:prototype :prot`, then for each triple `:prot p o`, the triple `:plug p o` should be loaded.  This facility is useful for distributing data-only plugins that rely on a common binary, for example those where the internal state is loaded from some other file.  Such plugins can refer to a prototype in a template LV2 bundle which is installed by the corresponding software."
  {:rdf/about    :lv2/prototype,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The prototype to inherit properties from.",
   :rdfs/label   "prototype"})

(def reportsLatency
  "This property indicates that the port is used to express the processing latency incurred by the plugin, expressed in samples.  The latency may be affected by the current sample rate, plugin settings, or other factors, and may be changed by the plugin at any time.  Where the latency is frequency dependent the plugin may choose any appropriate value.  If a plugin introduces latency it MUST provide EXACTLY ONE port with this property set.  In <q>fuzzy</q> cases the value should be the most reasonable one based on user expectation of input/output alignment.  For example, musical delay plugins should not report their delay as latency, since it is an intentional effect that the host should not compensate for.  This property is deprecated, use a lv2:designation of lv2:latency instead, following the same rules as above:      :::turtle  <http://example.org/plugin>   lv2:port [    a lv2:OutputPort , lv2:ControlPort ;    lv2:designation lv2:latency ;    lv2:symbol \"latency\" ;         ]"
  {:owl/deprecated true,
   :rdf/about      :lv2/reportsLatency,
   :rdf/type       :lv2/PortProperty,
   :rdfs/comment   "Control port value is the plugin latency in frames.",
   :rdfs/label     "reports latency"})

(def requiredFeature
  "To support this feature, the host MUST pass its URI and any additional data to the plugin in LV2_Descriptor::instantiate().  The host MUST check this property before attempting to instantiate a plugin, and not attempt to instantiate plugins which require features it does not support.  The plugin MUST fail to instantiate if a required feature is not supported by the host.  Note that these rules are intentionally redundant for resilience: neither host nor plugin should assume that the other does not violate them."
  {:rdf/about    :lv2/requiredFeature,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A required feature that must be available to run.",
   :rdfs/label   "required feature",
   :rdfs/range   :lv2/Feature})

(def sampleRate
  "Indicates that any specified bounds should be interpreted as multiples of the sample rate.  For example, a frequency range from 0 Hz to the Nyquist frequency (half the sample rate) can be specified by using this property with lv2:minimum 0.0 and lv2:maximum 0.5.  Hosts that support bounds at all MUST support this property."
  {:rdf/about :lv2/sampleRate,
   :rdf/type :lv2/PortProperty,
   :rdfs/comment
   "Control port bounds are interpreted as multiples of the sample rate.",
   :rdfs/label "sample rate"})

(def scalePoint
  "A scale point of a port or parameter."
  {:rdf/about    :lv2/scalePoint,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A scale point of a port or parameter.",
   :rdfs/label   "scale point",
   :rdfs/range   :lv2/ScalePoint})

(def shortName
  "This is the same as lv2:name, with the additional requirement that the value is shorter than 16 characters."
  {:rdf/about    :lv2/shortName,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A short display name for labeling in a user interface.",
   :rdfs/label   "short name",
   :rdfs/range   :xsd/string})

(def symbol
  "The value of this property MUST be a valid lv2:Symbol, and MUST NOT have a language tag.  A symbol is a unique identifier with respect to the parent, for example a port's symbol is a unique identifiers with respect to its plugin.  The plugin author MUST change the plugin URI if any port symbol is changed or removed."
  {:rdf/about :lv2/symbol,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The symbol that identifies this resource in the context of its parent.",
   :rdfs/label "symbol",
   :rdfs/range [:rdf/PlainLiteral :lv2/Symbol]})

(def toggled
  "Indicates that the data item should be considered a boolean toggle.  Data less than or equal to zero should be considered <q>off</q> or <q>false</q>, and data above zero should be considered <q>on</q> or <q>true</q>."
  {:rdf/about    :lv2/toggled,
   :rdf/type     :lv2/PortProperty,
   :rdfs/comment "Control port value is considered a boolean toggle.",
   :rdfs/label   "toggled"})