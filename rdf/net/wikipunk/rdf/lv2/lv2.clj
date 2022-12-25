(ns net.wikipunk.rdf.lv2.lv2
  "An extensible open standard for audio plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/core.lv2/lv2core.ttl",
   :owl/imports #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/about #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/ns-prefix-map {"doap" "http://usefulinc.com/ns/doap#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   #:rdf{:uri
         "https://gitlab.com/lv2/lv2/-/raw/master/lv2/core.lv2/lv2core.meta.ttl"},
   :vann/preferredNamespacePrefix "lv2",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/lv2core#"}
  (:refer-clojure :exclude [symbol name]))

(def AllpassPlugin
  "A filter that changes the phase relationship between frequency components."
  {:rdf/about       :lv2/AllpassPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Allpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def AmplifierPlugin
  "A plugin that primarily changes the volume of its input."
  {:rdf/about       :lv2/AmplifierPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Amplifier Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def AnalyserPlugin
  "A plugin that analyses its input and emits some useful information."
  {:rdf/about       :lv2/AnalyserPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Analyser Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def AudioPort
  "A port connected to an array of float audio samples."
  {:rdf/about       :lv2/AudioPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Audio Port",
   :rdfs/subClassOf :lv2/Port})

(def BandpassPlugin
  "A filter that attenuates frequencies outside of some band."
  {:rdf/about       :lv2/BandpassPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Bandpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def CVPort
  "A port connected to an array of float control values."
  {:rdf/about       :lv2/CVPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "CV Port",
   :rdfs/subClassOf :lv2/Port})

(def Channel
  "An individual channel, such as left or right."
  {:rdf/about       :lv2/Channel,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Channel",
   :rdfs/subClassOf :lv2/Designation})

(def ChorusPlugin
  "An effect that mixes significantly delayed copies of its input."
  {:rdf/about       :lv2/ChorusPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Chorus Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin})

(def CombPlugin
  "A filter that adds a delayed version of its input to itself."
  {:rdf/about       :lv2/CombPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Comb Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def CompressorPlugin
  "A plugin that reduces the dynamic range of its input."
  {:rdf/about       :lv2/CompressorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Compressor Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def ConstantPlugin
  "A plugin that emits constant values."
  {:rdf/about       :lv2/ConstantPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Constant Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin})

(def ControlPort
  "A port connected to a single `float`."
  {:rdf/about       :lv2/ControlPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Control Port",
   :rdfs/subClassOf :lv2/Port})

(def ConverterPlugin
  "A plugin that converts its input into a different form."
  {:rdf/about       :lv2/ConverterPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Converter Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def DelayPlugin
  "An effect that intentionally delays its input as an effect."
  {:rdf/about       :lv2/DelayPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Delay Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Designation
  "A designation which defines the meaning of some data."
  {:rdf/about       :lv2/Designation,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Designation",
   :rdfs/subClassOf :rdf/Property})

(def DistortionPlugin
  "A plugin that adds distortion to its input."
  {:rdf/about       :lv2/DistortionPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Distortion Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def DynamicsPlugin
  "A plugin that alters the envelope or dynamic range of its input."
  {:rdf/about       :lv2/DynamicsPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Dynamics Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def EQPlugin
  "A plugin that adjusts the balance between frequency components."
  {:rdf/about       :lv2/EQPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "EQ Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def EnvelopePlugin
  "A plugin that applies an envelope to its input."
  {:rdf/about       :lv2/EnvelopePlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Envelope Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def ExpanderPlugin
  "A plugin that expands the dynamic range of its input."
  {:rdf/about       :lv2/ExpanderPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Expander Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def ExtensionData
  "Additional data defined by an extension."
  {:rdf/about  :lv2/ExtensionData,
   :rdf/type   [:owl/Class :rdfs/Class],
   :rdfs/label "Extension Data"})

(def Feature
  "An additional feature which may be used or required."
  {:rdf/about  :lv2/Feature,
   :rdf/type   [:owl/Class :rdfs/Class],
   :rdfs/label "Feature"})

(def FilterPlugin
  "An effect that manipulates the frequency spectrum of its input."
  {:rdf/about       :lv2/FilterPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Filter Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def FlangerPlugin
  "An effect that mixes slightly delayed copies of its input."
  {:rdf/about       :lv2/FlangerPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Flanger Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin})

(def FunctionPlugin
  "A plugin whose output is a mathematical function of its input."
  {:rdf/about       :lv2/FunctionPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Function Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def GatePlugin
  "A plugin that attenuates signals below some threshold."
  {:rdf/about       :lv2/GatePlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Gate Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def GeneratorPlugin
  "A plugin that generates new sound internally."
  {:rdf/about       :lv2/GeneratorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Generator Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def HighpassPlugin
  "A filter that attenuates frequencies below some cutoff."
  {:rdf/about       :lv2/HighpassPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Highpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def InputPort
  "A port connected to constant data which is read during `run()`."
  {:rdf/about       :lv2/InputPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Input Port",
   :rdfs/subClassOf :lv2/Port})

(def InstrumentPlugin
  "A plugin intended to be played as a musical instrument."
  {:rdf/about       :lv2/InstrumentPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Instrument Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin})

(def LimiterPlugin
  "A plugin that limits its input to some maximum level."
  {:rdf/about       :lv2/LimiterPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Limiter Plugin",
   :rdfs/subClassOf :lv2/DynamicsPlugin})

(def LowpassPlugin
  "A filter that attenuates frequencies above some cutoff."
  {:rdf/about       :lv2/LowpassPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Lowpass Filter Plugin",
   :rdfs/subClassOf :lv2/FilterPlugin})

(def MIDIPlugin
  "A plugin that primarily processes MIDI messages."
  {:rdf/about       :lv2/MIDIPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "MIDI Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Markdown
  "A string in Markdown syntax."
  {:owl/onDatatype :xsd/string,
   :rdf/about      :lv2/Markdown,
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "Markdown"})

(def MixerPlugin
  "A plugin that mixes some number of inputs into some number of outputs."
  {:rdf/about       :lv2/MixerPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Mixer Plugin",
   :rdfs/subClassOf :lv2/UtilityPlugin})

(def ModulatorPlugin
  "An effect that modulats its input as an effect."
  {:rdf/about       :lv2/ModulatorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Modulator Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def MultiEQPlugin
  "A plugin that adjusts the balance between a fixed set of frequency components."
  {:rdf/about       :lv2/MultiEQPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Multiband EQ Plugin",
   :rdfs/subClassOf :lv2/EQPlugin})

(def OscillatorPlugin
  "A plugin that generates output with an oscillator."
  {:rdf/about       :lv2/OscillatorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Oscillator Plugin",
   :rdfs/subClassOf :lv2/GeneratorPlugin})

(def OutputPort
  "A port connected to data which is written during `run()`."
  {:rdf/about       :lv2/OutputPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Output Port",
   :rdfs/subClassOf :lv2/Port})

(def ParaEQPlugin
  "A plugin that adjusts the balance between configurable frequency components."
  {:rdf/about       :lv2/ParaEQPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Parametric EQ Plugin",
   :rdfs/subClassOf :lv2/EQPlugin})

(def Parameter
  "A property that is a plugin parameter."
  {:rdf/about       :lv2/Parameter,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Parameter",
   :rdfs/subClassOf [:rdf/Property :lv2/Designation]})

(def PhaserPlugin
  "An effect that periodically sweeps a filter over its input."
  {:rdf/about       :lv2/PhaserPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Phaser Plugin",
   :rdfs/subClassOf :lv2/ModulatorPlugin})

(def PitchPlugin
  "A plugin that shifts the pitch of its input."
  {:rdf/about       :lv2/PitchPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Pitch Shifter Plugin",
   :rdfs/subClassOf :lv2/SpectralPlugin})

(def Plugin
  "An LV2 plugin."
  {:rdf/about :lv2/Plugin,
   :rdf/type [:owl/Class :rdfs/Class],
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
  "Base class for a plugin-like resource."
  {:rdf/about  :lv2/PluginBase,
   :rdf/type   [:owl/Class :rdfs/Class],
   :rdfs/label "Plugin Base"})

(def Point
  "An interesting point in a value range."
  {:rdf/about  :lv2/Point,
   :rdf/type   [:owl/Class :rdfs/Class],
   :rdfs/label "Point"})

(def Port
  "An LV2 plugin port."
  {:rdf/about       :lv2/Port,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Port",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty :lv2/name,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment "A port MUST have at least one lv2:name."}
                     :lv2/PortBase]})

(def PortBase
  "Base class for a port-like resource."
  {:rdf/about       :lv2/PortBase,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Port Base",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :lv2/symbol,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment "A port MUST have exactly one lv2:symbol."}})

(def PortProperty
  "A particular property that a port has."
  {:rdf/about  :lv2/PortProperty,
   :rdf/type   [:owl/Class :rdfs/Class],
   :rdfs/label "Port Property"})

(def ReverbPlugin
  "An effect that adds reverberation to its input."
  {:rdf/about       :lv2/ReverbPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Reverb Plugin",
   :rdfs/subClassOf [:lv2/DelayPlugin :lv2/SimulatorPlugin :lv2/Plugin]})

(def ScalePoint
  "A single `float` Point for control inputs."
  {:rdf/about       :lv2/ScalePoint,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Scale Point",
   :rdfs/subClassOf :lv2/Point})

(def SimulatorPlugin
  "A plugin that aims to emulate some environmental effect or musical equipment."
  {:rdf/about       :lv2/SimulatorPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Simulator Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def SpatialPlugin
  "A plugin that manipulates the position of audio in space."
  {:rdf/about       :lv2/SpatialPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Spatial Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Specification
  "An LV2 specifiation."
  {:rdf/about       :lv2/Specification,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Specification",
   :rdfs/subClassOf :doap/Project})

(def SpectralPlugin
  "A plugin that alters the spectral properties of audio."
  {:rdf/about       :lv2/SpectralPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Spectral Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def Symbol
  "A short restricted name used as a strong identifier."
  {:owl/onDatatype       :xsd/string,
   :owl/withRestrictions [#:xsd{:pattern "[_a-zA-Z][_a-zA-Z0-9]*"}],
   :rdf/about            :lv2/Symbol,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "Symbol"})

(def UtilityPlugin
  "A utility plugin that is not a typical audio effect or generator."
  {:rdf/about       :lv2/UtilityPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Utility Plugin",
   :rdfs/subClassOf :lv2/Plugin})

(def WaveshaperPlugin
  "An effect that alters the shape of input waveforms."
  {:rdf/about       :lv2/WaveshaperPlugin,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Waveshaper Plugin",
   :rdfs/subClassOf :lv2/DistortionPlugin})

(def appliesTo
  "The plugin this resource is related to."
  {:rdf/about  :lv2/appliesTo,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "applies to",
   :rdfs/range :lv2/Plugin})

(def binary
  "The binary of this resource."
  {:rdf/about  :lv2/binary,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "binary",
   :rdfs/range :owl/Thing})

(def connectionOptional
  "The property that this port may be connected to NULL."
  {:rdf/about  :lv2/connectionOptional,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "connection optional"})

(def control
  "The primary control channel."
  {:rdf/about  :lv2/control,
   :rdf/type   :lv2/Channel,
   :rdfs/label "control"})

(def default
  "The default value for this control."
  {:rdf/about  :lv2/default,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "default"})

(def designation
  "The designation that defines the meaning of this input or output."
  {:rdf/about  :lv2/designation,
   :rdf/type   [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/label "designation",
   :rdfs/range :rdf/Property})

(def documentation
  "Extended documentation."
  {:rdf/about    :lv2/documentation,
   :rdf/type     [:owl/AnnotationProperty :rdf/Property],
   :rdfs/label   "documentation",
   :rdfs/range   :rdfs/Literal,
   :rdfs/seeAlso #:rdf{:uri "http://www.w3.org/TR/xhtml-basic/"}})

(def enabled
  "Whether processing is currently enabled (not bypassed)."
  {:rdf/about  :lv2/enabled,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "enabled",
   :rdfs/range :xsd/int})

(def enumeration
  "Control port scale points represent all useful values."
  {:rdf/about  :lv2/enumeration,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "enumeration"})

(def extensionData
  "Extension data provided by a plugin or other binary."
  {:rdf/about  :lv2/extensionData,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "extension data",
   :rdfs/range :lv2/ExtensionData})

(def freeWheeling
  "Whether processing is currently free-wheeling."
  {:rdf/about  :lv2/freeWheeling,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "free-wheeling",
   :rdfs/range :xsd/boolean})

(def hardRTCapable
  "Plugin is capable of running in a hard real-time environment."
  {:rdf/about  :lv2/hardRTCapable,
   :rdf/type   :lv2/Feature,
   :rdfs/label "hard real-time capable"})

(def inPlaceBroken
  "Plugin requires separate locations for input and output."
  {:rdf/about  :lv2/inPlaceBroken,
   :rdf/type   :lv2/Feature,
   :rdfs/label "in-place broken"})

(def index
  "A non-negative zero-based 32-bit index."
  {:rdf/about  :lv2/index,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "index",
   :rdfs/range :xsd/unsignedInt})

(def integer
  "Control port values are treated as integers."
  {:rdf/about  :lv2/integer,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "integer"})

(def isLive
  "Plugin has a real-time dependency."
  {:rdf/about  :lv2/isLive,
   :rdf/type   :lv2/Feature,
   :rdfs/label "is live"})

(def isSideChain
  "Signal for port should not be considered a main input or output."
  {:rdf/about  :lv2/isSideChain,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "is side-chain"})

(def latency
  "The latency introduced, in frames."
  {:rdf/about  :lv2/latency,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "latency",
   :rdfs/range :xsd/nonNegativeInteger})

(def maximum
  "The maximum value for this control."
  {:rdf/about  :lv2/maximum,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "maximum"})

(def microVersion
  "The micro version of this resource."
  {:rdf/about  :lv2/microVersion,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "micro version",
   :rdfs/range :xsd/nonNegativeInteger})

(def minimum
  "The minimum value for this control."
  {:rdf/about  :lv2/minimum,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "minimum"})

(def minorVersion
  "The minor version of this resource."
  {:rdf/about  :lv2/minorVersion,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "minor version",
   :rdfs/range :xsd/nonNegativeInteger})

(def name
  "A display name for labeling in a user interface."
  {:rdf/about  :lv2/name,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "name",
   :rdfs/range :xsd/string})

(def optionalFeature
  "An optional feature that is supported if available."
  {:rdf/about  :lv2/optionalFeature,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "optional feature",
   :rdfs/range :lv2/Feature})

(def port
  "A port (input or output) on this plugin."
  {:rdf/about   :lv2/port,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :lv2/PluginBase,
   :rdfs/label  "port",
   :rdfs/range  :lv2/PortBase})

(def portProperty
  "A property of this port hosts may find useful."
  {:rdf/about   :lv2/portProperty,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :lv2/Port,
   :rdfs/label  "port property",
   :rdfs/range  :lv2/PortProperty})

(def project
  "The project this is a part of."
  {:rdf/about  :lv2/project,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "project",
   :rdfs/range :doap/Project})

(def prototype
  "The prototype to inherit properties from."
  {:rdf/about  :lv2/prototype,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "prototype"})

(def reportsLatency
  "Control port value is the plugin latency in frames."
  {:owl/deprecated true,
   :rdf/about      :lv2/reportsLatency,
   :rdf/type       :lv2/PortProperty,
   :rdfs/label     "reports latency"})

(def requiredFeature
  "A required feature that must be available to run."
  {:rdf/about  :lv2/requiredFeature,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "required feature",
   :rdfs/range :lv2/Feature})

(def sampleRate
  "Control port bounds are interpreted as multiples of the sample rate."
  {:rdf/about  :lv2/sampleRate,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "sample rate"})

(def scalePoint
  "A scale point of a port or parameter."
  {:rdf/about  :lv2/scalePoint,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "scale point",
   :rdfs/range :lv2/ScalePoint})

(def shortName
  "A short display name for labeling in a user interface."
  {:rdf/about  :lv2/shortName,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "short name",
   :rdfs/range :xsd/string})

(def symbol
  "The symbol that identifies this resource in the context of its parent."
  {:rdf/about  :lv2/symbol,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "symbol",
   :rdfs/range [:rdf/PlainLiteral :lv2/Symbol]})

(def toggled
  "Control port value is considered a boolean toggle."
  {:rdf/about  :lv2/toggled,
   :rdf/type   :lv2/PortProperty,
   :rdfs/label "toggled"})