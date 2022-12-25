(ns net.wikipunk.rdf.lv2.lv2
  "An extensible open standard for audio plugins."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "lv2",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/core.lv2/lv2core.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/core.lv2/lv2core.ttl",
   :owl/imports #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/lv2core"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/lv2core#",
   :rdf/ns-prefix-map {"lv2" "http://lv2plug.in/ns/lv2core#",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude [symbol name]))

(def AllpassPlugin
  "A filter that changes the phase relationship between frequency components."
  {:rdfs/comment
     "A filter that changes the phase relationship between frequency components.",
   :rdfs/label "Allpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def AmplifierPlugin
  "A plugin that primarily changes the volume of its input."
  {:rdfs/comment "A plugin that primarily changes the volume of its input.",
   :rdfs/label "Amplifier Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def AnalyserPlugin
  "A plugin that analyses its input and emits some useful information."
  {:rdfs/comment
     "A plugin that analyses its input and emits some useful information.",
   :rdfs/label "Analyser Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def AudioPort
  "A port connected to an array of float audio samples."
  {:rdfs/comment "A port connected to an array of float audio samples.",
   :rdfs/label "Audio Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type [:owl/Class :rdfs/Class]})

(def BandpassPlugin
  "A filter that attenuates frequencies outside of some band."
  {:rdfs/comment "A filter that attenuates frequencies outside of some band.",
   :rdfs/label "Bandpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def CVPort
  "A port connected to an array of float control values."
  {:rdfs/comment "A port connected to an array of float control values.",
   :rdfs/label "CV Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Channel
  "An individual channel, such as left or right."
  {:rdfs/comment "An individual channel, such as left or right.",
   :rdfs/label "Channel",
   :rdfs/subClassOf :lv2/Designation,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ChorusPlugin
  "An effect that mixes significantly delayed copies of its input."
  {:rdfs/comment
     "An effect that mixes significantly delayed copies of its input.",
   :rdfs/label "Chorus Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def CombPlugin
  "A filter that adds a delayed version of its input to itself."
  {:rdfs/comment "A filter that adds a delayed version of its input to itself.",
   :rdfs/label "Comb Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def CompressorPlugin
  "A plugin that reduces the dynamic range of its input."
  {:rdfs/comment "A plugin that reduces the dynamic range of its input.",
   :rdfs/label "Compressor Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ConstantPlugin
  "A plugin that emits constant values."
  {:rdfs/comment "A plugin that emits constant values.",
   :rdfs/label "Constant Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ControlPort
  "A port connected to a single `float`."
  {:rdfs/comment "A port connected to a single `float`.",
   :rdfs/label "Control Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ConverterPlugin
  "A plugin that converts its input into a different form."
  {:rdfs/comment "A plugin that converts its input into a different form.",
   :rdfs/label "Converter Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def DelayPlugin
  "An effect that intentionally delays its input as an effect."
  {:rdfs/comment "An effect that intentionally delays its input as an effect.",
   :rdfs/label "Delay Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Designation
  "A designation which defines the meaning of some data."
  {:rdfs/comment "A designation which defines the meaning of some data.",
   :rdfs/label "Designation",
   :rdfs/subClassOf :rdf/Property,
   :rdf/type [:owl/Class :rdfs/Class]})

(def DistortionPlugin
  "A plugin that adds distortion to its input."
  {:rdfs/comment "A plugin that adds distortion to its input.",
   :rdfs/label "Distortion Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def DynamicsPlugin
  "A plugin that alters the envelope or dynamic range of its input."
  {:rdfs/comment
     "A plugin that alters the envelope or dynamic range of its input.",
   :rdfs/label "Dynamics Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def EQPlugin
  "A plugin that adjusts the balance between frequency components."
  {:rdfs/comment
     "A plugin that adjusts the balance between frequency components.",
   :rdfs/label "EQ Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def EnvelopePlugin
  "A plugin that applies an envelope to its input."
  {:rdfs/comment "A plugin that applies an envelope to its input.",
   :rdfs/label "Envelope Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ExpanderPlugin
  "A plugin that expands the dynamic range of its input."
  {:rdfs/comment "A plugin that expands the dynamic range of its input.",
   :rdfs/label "Expander Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ExtensionData
  "Additional data defined by an extension."
  {:rdfs/comment "Additional data defined by an extension.",
   :rdfs/label "Extension Data",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Feature
  "An additional feature which may be used or required."
  {:rdfs/comment "An additional feature which may be used or required.",
   :rdfs/label "Feature",
   :rdf/type [:owl/Class :rdfs/Class]})

(def FilterPlugin
  "An effect that manipulates the frequency spectrum of its input."
  {:rdfs/comment
     "An effect that manipulates the frequency spectrum of its input.",
   :rdfs/label "Filter Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def FlangerPlugin
  "An effect that mixes slightly delayed copies of its input."
  {:rdfs/comment "An effect that mixes slightly delayed copies of its input.",
   :rdfs/label "Flanger Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def FunctionPlugin
  "A plugin whose output is a mathematical function of its input."
  {:rdfs/comment
     "A plugin whose output is a mathematical function of its input.",
   :rdfs/label "Function Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def GatePlugin
  "A plugin that attenuates signals below some threshold."
  {:rdfs/comment "A plugin that attenuates signals below some threshold.",
   :rdfs/label "Gate Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def GeneratorPlugin
  "A plugin that generates new sound internally."
  {:rdfs/comment "A plugin that generates new sound internally.",
   :rdfs/label "Generator Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def HighpassPlugin
  "A filter that attenuates frequencies below some cutoff."
  {:rdfs/comment "A filter that attenuates frequencies below some cutoff.",
   :rdfs/label "Highpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def InputPort
  "A port connected to constant data which is read during `run()`."
  {:rdfs/comment
     "A port connected to constant data which is read during `run()`.",
   :rdfs/label "Input Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type [:owl/Class :rdfs/Class]})

(def InstrumentPlugin
  "A plugin intended to be played as a musical instrument."
  {:rdfs/comment "A plugin intended to be played as a musical instrument.",
   :rdfs/label "Instrument Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def LimiterPlugin
  "A plugin that limits its input to some maximum level."
  {:rdfs/comment "A plugin that limits its input to some maximum level.",
   :rdfs/label "Limiter Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def LowpassPlugin
  "A filter that attenuates frequencies above some cutoff."
  {:rdfs/comment "A filter that attenuates frequencies above some cutoff.",
   :rdfs/label "Lowpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def MIDIPlugin
  "A plugin that primarily processes MIDI messages."
  {:rdfs/comment "A plugin that primarily processes MIDI messages.",
   :rdfs/label "MIDI Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Markdown
  "A string in Markdown syntax."
  {:rdfs/comment "A string in Markdown syntax.",
   :rdfs/label "Markdown",
   :owl/onDatatype :xsd/string,
   :rdf/type :rdfs/Datatype})

(def MixerPlugin
  "A plugin that mixes some number of inputs into some number of outputs."
  {:rdfs/comment
     "A plugin that mixes some number of inputs into some number of outputs.",
   :rdfs/label "Mixer Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ModulatorPlugin
  "An effect that modulats its input as an effect."
  {:rdfs/comment "An effect that modulats its input as an effect.",
   :rdfs/label "Modulator Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def MultiEQPlugin
  "A plugin that adjusts the balance between a fixed set of frequency components."
  {:rdfs/comment
     "A plugin that adjusts the balance between a fixed set of frequency components.",
   :rdfs/label "Multiband EQ Plugin",
   :rdfs/subClassOf :lv2/EQPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def OscillatorPlugin
  "A plugin that generates output with an oscillator."
  {:rdfs/comment "A plugin that generates output with an oscillator.",
   :rdfs/label "Oscillator Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def OutputPort
  "A port connected to data which is written during `run()`."
  {:rdfs/comment "A port connected to data which is written during `run()`.",
   :rdfs/label "Output Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type [:owl/Class :rdfs/Class]})

(def ParaEQPlugin
  "A plugin that adjusts the balance between configurable frequency components."
  {:rdfs/comment
     "A plugin that adjusts the balance between configurable frequency components.",
   :rdfs/label "Parametric EQ Plugin",
   :rdfs/subClassOf :lv2/EQPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Parameter
  "A property that is a plugin parameter."
  {:rdfs/comment "A property that is a plugin parameter.",
   :rdfs/label "Parameter",
   :rdfs/subClassOf [:rdf/Property :lv2/Designation],
   :rdf/type [:owl/Class :rdfs/Class]})

(def PhaserPlugin
  "An effect that periodically sweeps a filter over its input."
  {:rdfs/comment "An effect that periodically sweeps a filter over its input.",
   :rdfs/label "Phaser Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def PitchPlugin
  "A plugin that shifts the pitch of its input."
  {:rdfs/comment "A plugin that shifts the pitch of its input.",
   :rdfs/label "Pitch Shifter Plugin",
   :rdfs/subClassOf :lv2/SpectralPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Plugin
  "An LV2 plugin."
  {:rdfs/subClassOf
     [{:rdfs/comment
         "All ports on a plugin MUST be fully specified lv2:Port instances.",
       :owl/allValuesFrom :lv2/Port,
       :owl/onProperty :lv2/port,
       :rdf/type :owl/Restriction}
      {:rdfs/comment "A plugin MUST have at least one untranslated doap:name.",
       :owl/someValuesFrom :rdf/PlainLiteral,
       :owl/onProperty :doap/name,
       :rdf/type :owl/Restriction} :lv2/PluginBase],
   :rdfs/comment "An LV2 plugin.",
   :rdfs/label "Plugin",
   :rdf/type [:owl/Class :rdfs/Class]})

(def PluginBase
  "Base class for a plugin-like resource."
  {:rdfs/comment "Base class for a plugin-like resource.",
   :rdfs/label "Plugin Base",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Point
  "An interesting point in a value range."
  {:rdfs/comment "An interesting point in a value range.",
   :rdfs/label "Point",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Port
  "An LV2 plugin port."
  {:rdfs/subClassOf [{:rdfs/comment "A port MUST have at least one lv2:name.",
                      :owl/minCardinality 1,
                      :owl/onProperty :lv2/name,
                      :rdf/type :owl/Restriction} :lv2/PortBase],
   :rdfs/comment "An LV2 plugin port.",
   :rdfs/label "Port",
   :rdf/type [:owl/Class :rdfs/Class]})

(def PortBase
  "Base class for a port-like resource."
  {:rdfs/subClassOf {:rdfs/comment "A port MUST have exactly one lv2:symbol.",
                     :owl/cardinality 1,
                     :owl/onProperty :lv2/symbol,
                     :rdf/type :owl/Restriction},
   :rdfs/comment "Base class for a port-like resource.",
   :rdfs/label "Port Base",
   :rdf/type [:owl/Class :rdfs/Class]})

(def PortProperty
  "A particular property that a port has."
  {:rdfs/comment "A particular property that a port has.",
   :rdfs/label "Port Property",
   :rdf/type [:owl/Class :rdfs/Class]})

(def ReverbPlugin
  "An effect that adds reverberation to its input."
  {:rdfs/comment "An effect that adds reverberation to its input.",
   :rdfs/label "Reverb Plugin",
   :rdfs/subClassOf [:lv2/DelayPlugin :lv2/SimulatorPlugin :lv2/Plugin],
   :rdf/type [:owl/Class :rdfs/Class]})

(def ScalePoint
  "A single `float` Point for control inputs."
  {:rdfs/comment "A single `float` Point for control inputs.",
   :rdfs/label "Scale Point",
   :rdfs/subClassOf :lv2/Point,
   :rdf/type [:owl/Class :rdfs/Class]})

(def SimulatorPlugin
  "A plugin that aims to emulate some environmental effect or musical equipment."
  {:rdfs/comment
     "A plugin that aims to emulate some environmental effect or musical equipment.",
   :rdfs/label "Simulator Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def SpatialPlugin
  "A plugin that manipulates the position of audio in space."
  {:rdfs/comment "A plugin that manipulates the position of audio in space.",
   :rdfs/label "Spatial Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Specification
  "An LV2 specifiation."
  {:rdfs/comment "An LV2 specifiation.",
   :rdfs/label "Specification",
   :rdfs/subClassOf :doap/Project,
   :rdf/type [:owl/Class :rdfs/Class]})

(def SpectralPlugin
  "A plugin that alters the spectral properties of audio."
  {:rdfs/comment "A plugin that alters the spectral properties of audio.",
   :rdfs/label "Spectral Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Symbol
  "A short restricted name used as a strong identifier."
  {:rdfs/comment "A short restricted name used as a strong identifier.",
   :rdfs/label "Symbol",
   :owl/withRestrictions [#:xsd{:pattern "[_a-zA-Z][_a-zA-Z0-9]*"}],
   :owl/onDatatype :xsd/string,
   :rdf/type :rdfs/Datatype})

(def UtilityPlugin
  "A utility plugin that is not a typical audio effect or generator."
  {:rdfs/comment
     "A utility plugin that is not a typical audio effect or generator.",
   :rdfs/label "Utility Plugin",
   :rdfs/subClassOf :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def WaveshaperPlugin
  "An effect that alters the shape of input waveforms."
  {:rdfs/comment "An effect that alters the shape of input waveforms.",
   :rdfs/label "Waveshaper Plugin",
   :rdfs/subClassOf :lv2/DistortionPlugin,
   :rdf/type [:owl/Class :rdfs/Class]})

(def appliesTo
  "The plugin this resource is related to."
  {:rdfs/comment "The plugin this resource is related to.",
   :rdfs/label "applies to",
   :rdfs/range :lv2/Plugin,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def binary
  "The binary of this resource."
  {:rdfs/comment "The binary of this resource.",
   :rdfs/label "binary",
   :rdfs/range :owl/Thing,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def connectionOptional
  "The property that this port may be connected to NULL."
  {:rdfs/comment "The property that this port may be connected to NULL.",
   :rdfs/label "connection optional",
   :rdf/type :lv2/PortProperty})

(def control
  "The primary control channel."
  {:rdfs/comment "The primary control channel.",
   :rdfs/label "control",
   :rdf/type :lv2/Channel})

(def default
  "The default value for this control."
  {:rdfs/comment "The default value for this control.",
   :rdfs/label "default",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def designation
  "The designation that defines the meaning of this input or output."
  {:rdfs/comment
     "The designation that defines the meaning of this input or output.",
   :rdfs/label "designation",
   :rdfs/range :rdf/Property,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def documentation
  "Extended documentation."
  {:rdfs/seeAlso #:rdf{:uri "http://www.w3.org/TR/xhtml-basic/"},
   :rdfs/comment "Extended documentation.",
   :rdfs/label "documentation",
   :rdfs/range :rdfs/Literal,
   :rdf/type [:owl/AnnotationProperty :rdf/Property]})

(def enabled
  "Whether processing is currently enabled (not bypassed)."
  {:rdfs/comment "Whether processing is currently enabled (not bypassed).",
   :rdfs/range :xsd/int,
   :rdfs/label "enabled",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def enumeration
  "Control port scale points represent all useful values."
  {:rdfs/comment "Control port scale points represent all useful values.",
   :rdfs/label "enumeration",
   :rdf/type :lv2/PortProperty})

(def extensionData
  "Extension data provided by a plugin or other binary."
  {:rdfs/comment "Extension data provided by a plugin or other binary.",
   :rdfs/label "extension data",
   :rdfs/range :lv2/ExtensionData,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def freeWheeling
  "Whether processing is currently free-wheeling."
  {:rdfs/comment "Whether processing is currently free-wheeling.",
   :rdfs/range :xsd/boolean,
   :rdfs/label "free-wheeling",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def hardRTCapable
  "Plugin is capable of running in a hard real-time environment."
  {:rdfs/comment
     "Plugin is capable of running in a hard real-time environment.",
   :rdfs/label "hard real-time capable",
   :rdf/type :lv2/Feature})

(def inPlaceBroken
  "Plugin requires separate locations for input and output."
  {:rdfs/comment "Plugin requires separate locations for input and output.",
   :rdfs/label "in-place broken",
   :rdf/type :lv2/Feature})

(def index
  "A non-negative zero-based 32-bit index."
  {:rdfs/comment "A non-negative zero-based 32-bit index.",
   :rdfs/label "index",
   :rdfs/range :xsd/unsignedInt,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def integer
  "Control port values are treated as integers."
  {:rdfs/comment "Control port values are treated as integers.",
   :rdfs/label "integer",
   :rdf/type :lv2/PortProperty})

(def isLive
  "Plugin has a real-time dependency."
  {:rdfs/comment "Plugin has a real-time dependency.",
   :rdfs/label "is live",
   :rdf/type :lv2/Feature})

(def isSideChain
  "Signal for port should not be considered a main input or output."
  {:rdfs/comment
     "Signal for port should not be considered a main input or output.",
   :rdfs/label "is side-chain",
   :rdf/type :lv2/PortProperty})

(def latency
  "The latency introduced, in frames."
  {:rdfs/comment "The latency introduced, in frames.",
   :rdfs/label "latency",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def maximum
  "The maximum value for this control."
  {:rdfs/comment "The maximum value for this control.",
   :rdfs/label "maximum",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def microVersion
  "The micro version of this resource."
  {:rdfs/comment "The micro version of this resource.",
   :rdfs/label "micro version",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def minimum
  "The minimum value for this control."
  {:rdfs/comment "The minimum value for this control.",
   :rdfs/label "minimum",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def minorVersion
  "The minor version of this resource."
  {:rdfs/comment "The minor version of this resource.",
   :rdfs/label "minor version",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def name
  "A display name for labeling in a user interface."
  {:rdfs/comment "A display name for labeling in a user interface.",
   :rdfs/range :xsd/string,
   :rdfs/label "name",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def optionalFeature
  "An optional feature that is supported if available."
  {:rdfs/comment "An optional feature that is supported if available.",
   :rdfs/label "optional feature",
   :rdfs/range :lv2/Feature,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def port
  "A port (input or output) on this plugin."
  {:rdfs/comment "A port (input or output) on this plugin.",
   :rdfs/label "port",
   :rdfs/range :lv2/PortBase,
   :rdfs/domain :lv2/PluginBase,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def portProperty
  "A property of this port hosts may find useful."
  {:rdfs/comment "A property of this port hosts may find useful.",
   :rdfs/label "port property",
   :rdfs/range :lv2/PortProperty,
   :rdfs/domain :lv2/Port,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def project
  "The project this is a part of."
  {:rdfs/comment "The project this is a part of.",
   :rdfs/label "project",
   :rdfs/range :doap/Project,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def prototype
  "The prototype to inherit properties from."
  {:rdfs/comment "The prototype to inherit properties from.",
   :rdfs/label "prototype",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def reportsLatency
  "Control port value is the plugin latency in frames."
  {:rdfs/comment "Control port value is the plugin latency in frames.",
   :rdfs/label "reports latency",
   :owl/deprecated true,
   :rdf/type :lv2/PortProperty})

(def requiredFeature
  "A required feature that must be available to run."
  {:rdfs/comment "A required feature that must be available to run.",
   :rdfs/label "required feature",
   :rdfs/range :lv2/Feature,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def sampleRate
  "Control port bounds are interpreted as multiples of the sample rate."
  {:rdfs/comment
     "Control port bounds are interpreted as multiples of the sample rate.",
   :rdfs/label "sample rate",
   :rdf/type :lv2/PortProperty})

(def scalePoint
  "A scale point of a port or parameter."
  {:rdfs/comment "A scale point of a port or parameter.",
   :rdfs/label "scale point",
   :rdfs/range :lv2/ScalePoint,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def shortName
  "A short display name for labeling in a user interface."
  {:rdfs/comment "A short display name for labeling in a user interface.",
   :rdfs/range :xsd/string,
   :rdfs/label "short name",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def symbol
  "The symbol that identifies this resource in the context of its parent."
  {:rdfs/comment
     "The symbol that identifies this resource in the context of its parent.",
   :rdfs/range [:rdf/PlainLiteral :lv2/Symbol],
   :rdfs/label "symbol",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def toggled
  "Control port value is considered a boolean toggle."
  {:rdfs/comment "Control port value is considered a boolean toggle.",
   :rdfs/label "toggled",
   :rdf/type :lv2/PortProperty})