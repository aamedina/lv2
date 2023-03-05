(ns net.wikipunk.rdf.vamp
  "Vamp Ontology. This ontology includes the following descriptions: - OWL description of the Vamp API - OWL description of the Transform environment necessary to set up the execution of any plugin This Ontology provides semantics to describe and control Vamp plugins in RDF. Any \"RDF-speaker\" host is therefore able to use this ontology to read, set up and execute plugins. The extracted features are expressed in terms of the Audio Features Ontology: http://purl.org/ontology/af/. For more information, please visit the Vamp Plugins website: http://www.vamp-plugins.org/"
  {:dc11/date "$Date: 2008/05/21 17:05:11 $",
   :dc11/title "Vamp Plugins Ontology",
   :dcat/downloadURL "https://vamp-plugins.org/rdf/",
   :foaf/maker
   ["David Pastor Escuredo" "Yves Raimond" "Chris Sutton" "Chris Cannam"],
   :rdf/ns-prefix-map {"af"    "http://purl.org/ontology/af/",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp"  "http://purl.org/ontology/vamp/",
                       "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vamp",
   :rdfa/uri "http://purl.org/ontology/vamp/",
   :rdfs/comment
   "\n\t\t\tVamp Ontology. This ontology includes the following descriptions:\n\t\t\t\n\t\t\t\t- OWL description of the Vamp API\n\t\t\t\t- OWL description of the Transform environment necessary to set up the execution of any plugin \n\t\t\t\n\t\t\tThis Ontology provides semantics to describe and control Vamp plugins in RDF. Any \"RDF-speaker\" host is therefore able to \n\t\t\tuse this ontology to read, set up and execute plugins.\n\t\t\tThe extracted features are expressed in terms of the Audio Features Ontology: http://purl.org/ontology/af/.\n\t\t\tFor more information, please visit the Vamp Plugins website: http://www.vamp-plugins.org/\n\t",
   :rdfs/label "Vamp Plugins Ontology"}
  (:refer-clojure :exclude [name]))

(def Configuration
  "For extension (key/value data provided to DSSI plugins, not relevant to Vamp)"
  {:db/ident :vamp/Configuration,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tFor extension (key/value data provided to DSSI plugins, not relevant to Vamp)\n\t",
   :rdfs/label "Configuration",
   :vs/term_status "unstable"})

(def DenseOutput
  "Specific output type for data evenly spaced in time, which may be of high volume and which it is usually desirable to represent in a compact form."
  {:db/ident :vamp/DenseOutput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tSpecific output type for data evenly spaced in time, which may be of high volume and which it is usually desirable to represent in a compact form.\n\t",
   :rdfs/label "Dense output",
   :rdfs/subClassOf :vamp/PluginOutput,
   :vs/term_status "unstable"})

(def Effect
  "Effect transform. This may be just a subclass of Transform..."
  {:db/ident :vamp/Effect,
   :rdf/type :vamp/TransformType,
   :rdfs/comment
   "\n\t\tEffect transform. This may be just a subclass of Transform...\n\t",
   :rdfs/label "Effect",
   :vs/term_status "unstable"})

(def Feature
  "This may be removed mighty soon as we rely on the Audio Features Ontology for this"
  {:db/ident :vamp/Feature,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This may be removed mighty soon as we rely on the Audio Features Ontology for this",
   :rdfs/label "Vamp Feature",
   :vs/term_status "deprecated"})

(def FeatureExtraction
  "Feature extraction transform. This may be just a subclass of Transform..."
  {:db/ident :vamp/FeatureExtraction,
   :rdf/type :vamp/TransformType,
   :rdfs/comment
   "\n\t\tFeature extraction transform. This may be just a subclass of Transform...\n\t",
   :rdfs/label "Feature Extraction",
   :vs/term_status "unstable"})

(def FixedSampleRate
  {:db/ident :vamp/FixedSampleRate,
   :rdf/type :vamp/SampleType})

(def FrequencyDomain
  {:db/ident :vamp/FrequencyDomain,
   :rdf/type :vamp/InputDomain})

(def InputDomain
  "Plugins declare the input domain they require, so the host can convert the input data properly. Hosts using the Vamp SDK PluginAdapter to wrap plugins should see this work done for them automatically - see the Vamp documentation."
  {:db/ident :vamp/InputDomain,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tPlugins declare the input domain they require, so the host can convert the input data properly. Hosts using the Vamp SDK PluginAdapter to wrap plugins should see this work done for them automatically - see the Vamp documentation.\n\t",
   :rdfs/label "Plugin input domain",
   :vs/term_status "stable"})

(def KnownExtentsOutput
  "Descriptor of an output that does have known extents."
  {:db/ident :vamp/KnownExtentsOutput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\t\tDescriptor of an output that does have known extents.\n\t",
   :rdfs/label "Known Extents Output",
   :rdfs/subClassOf :vamp/PluginOutput,
   :vs/term_status "stable"})

(def OneSamplePerStep
  {:db/ident :vamp/OneSamplePerStep,
   :rdf/type :vamp/SampleType})

(def Parameter
  "Descriptor for a plugin parameter. Hosts need to know about the specific type and form of the parameters of a particular plugin for a correct transform setup."
  {:db/ident :vamp/Parameter,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tDescriptor for a plugin parameter. Hosts need to know about the specific type and form of the parameters of a particular plugin for a correct transform setup.\n\t",
   :rdfs/label "Vamp Plugin Parameter",
   :vs/term_status "stable"})

(def ParameterBinding
  "Parameter setting used by the plugin transform to set up the plugin."
  {:db/ident :vamp/ParameterBinding,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tParameter setting used by the plugin transform to set up the plugin.\n\t",
   :rdfs/label "Parameter binding",
   :vs/term_status "unstable"})

(def Plugin
  "A Vamp plugin is an implementation of an audio feature extraction algorithm using the Vamp API."
  {:db/ident :vamp/Plugin,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA Vamp plugin is an implementation of an audio feature extraction algorithm using the Vamp API.\n\t",
   :rdfs/label "Vamp Plugin",
   :vs/term_status "stable"})

(def PluginLibrary
  "Library of Vamp Plugins. This may need to include rights."
  {:db/ident :vamp/PluginLibrary,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tLibrary of Vamp Plugins. This may need to include rights.\n\t",
   :rdfs/label "Vamp Plugin Library",
   :vs/term_status "stable"})

(def PluginOutput
  "Descriptor for an output of a plugin. This descriptor provides information that is necessary to correctly interpret the output features. The output type will determine how to read the temporal information of the extracted features and how to manage the burden of ouput data."
  {:db/ident :vamp/PluginOutput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tDescriptor for an output of a plugin. This descriptor provides information that is necessary to correctly interpret the output features. The output type will determine how to read the temporal information of the extracted features and how to manage the burden of ouput data.\n\t",
   :rdfs/label "Vamp Plugin output descriptor",
   :vs/term_status "unstable"})

(def PluginProgram
  "The program is a predefined context of parameters. We may not need a concept for this and just a property linking a string representing the program name."
  {:db/ident :vamp/PluginProgram,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tThe program is a predefined context of parameters. We may not need a concept for this and just a property linking a string representing the program name.\n\t",
   :rdfs/label "Plugin program",
   :vs/term_status "unstable"})

(def QuantizedOutput
  "Descriptor of an output that does have quantized values."
  {:db/ident :vamp/QuantizedOutput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\t\tDescriptor of an output that does have quantized values.\n\t",
   :rdfs/label "Quantized Output",
   :rdfs/subClassOf :vamp/PluginOutput,
   :vs/term_status "stable"})

(def QuantizedParameter
  "Descriptor of a parameter that does have quantized values. The property quantize_step is just defined for this subclass and not for the general Parameter."
  {:db/ident :vamp/QuantizedParameter,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\t\tDescriptor of a parameter that does have quantized values. The property quantize_step is just defined for this subclass and not for the general Parameter.\n\t",
   :rdfs/label "Quantized Parameter",
   :rdfs/subClassOf :vamp/Parameter,
   :vs/term_status "stable"})

(def SampleType
  "The sample type specifies the temporal information of the plugin output. This information should be combined with the output type for a correct interpretation."
  {:db/ident :vamp/SampleType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tThe sample type specifies the temporal information of the plugin output. This information should be combined with the output type for a correct interpretation.\n\t",
   :rdfs/label "sample type",
   :vs/term_status "stable"})

(def SparseOutput
  "Specific output type for data that consist of features that require their own individual temporal information."
  {:db/ident :vamp/SparseOutput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tSpecific output type for data that consist of features that require their own individual temporal information.\n\t",
   :rdfs/label "Sparse output",
   :rdfs/subClassOf :vamp/PluginOutput,
   :vs/term_status "unstable"})

(def TimeDomain
  {:db/ident :vamp/TimeDomain,
   :rdf/type :vamp/InputDomain})

(def TrackLevelOutput
  "Specific output type for track level information. The Vamp API does not provide for this sort of output directly, so this will require a \"hacky\" interpretation of the feature timestamp to establish that it reflects track metadata instead of temporal data."
  {:db/ident :vamp/TrackLevelOutput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tSpecific output type for track level information.  The Vamp API does not provide for this sort of output directly, so this will require a \"hacky\" interpretation of the feature timestamp to establish that it reflects track metadata instead of temporal data.\n\t",
   :rdfs/label "track level output",
   :rdfs/subClassOf :vamp/PluginOutput,
   :vs/term_status "unstable"})

(def Transform
  "The Transform defines the environment of any audio processing computation."
  {:db/ident :vamp/Transform,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tThe Transform defines the environment of any audio processing computation. \n\t",
   :rdfs/label "Transform",
   :vs/term_status "stable"})

(def TransformType
  "Specifies the type of transform. May be feature extraction, effect..."
  {:db/ident :vamp/TransformType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tSpecifies the type of transform. May be feature extraction, effect...\n\t",
   :rdfs/label "Transform Type",
   :vs/term_status "unstable"})

(def VariableSampleRate
  {:db/ident :vamp/VariableSampleRate,
   :rdf/type :vamp/SampleType})

(def available_plugin
  "Available plugins in the library"
  {:db/ident       :vamp/available_plugin,
   :rdf/type       [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment   "\n\t\tAvailable plugins in the library\n\t",
   :rdfs/domain    :vamp/PluginLibrary,
   :rdfs/label     "available plugin",
   :rdfs/range     :vamp/Plugin,
   :vs/term_status "stable"})

(def bin_count
  "Number of elements of the bin output. This information is necessary to define the output as belonging to a specific subclass of Plugin Output."
  {:db/ident :vamp/bin_count,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tNumber of elements of the bin output. This information is necessary to define the output as belonging to a specific subclass of Plugin Output.\n\t",
   :rdfs/domain :vamp/PluginOutput,
   :rdfs/label "bin count",
   :vs/term_status "unstable"})

(def bin_names
  "List of bin names if available."
  {:db/ident       :vamp/bin_names,
   :rdf/type       [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment   "\n\t\tList of bin names if available.\n\t",
   :rdfs/domain    :vamp/PluginOutput,
   :rdfs/label     "bin names",
   :vs/term_status "unstable"})

(def block_size
  "Specifies the block size for the framing."
  {:db/ident       :vamp/block_size,
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty
                    :rdf/Property],
   :rdfs/comment   "\n\t\t\tSpecifies the block size for the framing. \n\t",
   :rdfs/domain    :vamp/Transform,
   :rdfs/label     "block size",
   :vs/term_status "stable"})

(def computed_by
  "Associates an audio feature with the transform that was used to compute it."
  {:db/ident :vamp/computed_by,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tAssociates an audio feature with the transform that was used to compute it.\n\t",
   :rdfs/domain [:af/Signal :event/Event],
   :rdfs/label "computed by",
   :rdfs/range :vamp/Transform,
   :vs/term_status "unstable"})

(def computes_event_type
  "Associates a plugin output with its corresponding event type (for example, in the Audio Features ontology)."
  {:db/ident :vamp/computes_event_type,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tAssociates a plugin output with its corresponding event type (for example, in the Audio Features ontology).\n\t",
   :rdfs/domain :vamp/PluginOutput,
   :rdfs/label "event type",
   :rdfs/range :event/Event,
   :vs/term_status "unstable"})

(def computes_feature
  "Associates a plugin output with the attribute connecting the event to its value data."
  {:db/ident :vamp/computes_feature,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tAssociates a plugin output with the attribute connecting the event to its value data.\n\t",
   :rdfs/domain :vamp/PluginOutput,
   :rdfs/label "feature type",
   :rdfs/range :event/factor,
   :vs/term_status "unstable"})

(def computes_signal_type
  "Associates a dense plugin output with its corresponding signal type (for example, in the Audio Features ontology)."
  {:db/ident :vamp/computes_signal_type,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tAssociates a dense plugin output with its corresponding signal type (for example, in the Audio Features ontology).\n\t",
   :rdfs/domain :vamp/PluginOutput,
   :rdfs/label "signal type",
   :rdfs/range :af/Signal,
   :vs/term_status "unstable"})

(def configuration
  "Extension for configuration."
  {:db/ident       :vamp/configuration,
   :rdf/type       [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment   "\n\t\tExtension for configuration. \n\t",
   :rdfs/domain    :vamp/Transform,
   :rdfs/label     "program",
   :rdfs/range     :vamp/Configuration,
   :vs/term_status "stable"})

(def default_value
  "Default value of the parameter"
  {:db/ident       :vamp/default_value,
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty
                    :rdf/Property],
   :rdfs/comment   "\n\t\tDefault value of the parameter\n\t",
   :rdfs/label     "default value",
   :rdfs/range     :vamp/Parameter,
   :vs/term_status "unstable"})

(def duration
  "Specifies temporal information when processing a data stream."
  {:db/ident :vamp/duration,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tSpecifies temporal information when processing a data stream. \n\t",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "start",
   :vs/term_status "unstable"})

(def engine
  "Specifies the sort of plugin in execution. This is an extension to use Transform with other plugin libraries"
  {:db/ident :vamp/engine,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tSpecifies the sort of plugin in execution. This is an extension to use Transform with other plugin libraries\n\t",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "plugin",
   :rdfs/range :vamp/Plugin,
   :vs/term_status "stable"})

(def fixed_bin_count
  "Fixed bin count. A boolean type."
  {:db/ident       :vamp/fixed_bin_count,
   :rdf/type       [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment   "\n\t\tFixed bin count. A boolean type.\n\t",
   :rdfs/domain    :vamp/PluginOutput,
   :rdfs/label     "fixed bin count",
   :vs/term_status "unstable"})

(def has_duration
  "True if features on this output are known to have durations"
  {:db/ident :vamp/has_duration,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tTrue if features on this output are known to have durations\n\t",
   :rdfs/domain :vamp/PluginOutput,
   :rdfs/label "has duration",
   :vs/term_status "unstable"})

(def identifier
  "Machine-readable identifier for a Vamp plugin within the scope of its library, or for a plugin descriptor within the scope of the plugin."
  {:db/ident :vamp/identifier,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tMachine-readable identifier for a Vamp plugin within the scope of its library, or for a plugin descriptor within the scope of the plugin.\n\t",
   :rdfs/domain [:vamp/Transform
                 :vamp/Plugin
                 :vamp/PluginLibrary
                 :vamp/PluginProgram
                 :vamp/Parameter
                 :vamp/PluginOutput],
   :rdfs/label "plugin identifier",
   :vs/term_status "stable"})

(def input_domain
  "Input domain required by the plugin (time or frequency)."
  {:db/ident :vamp/input_domain,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tInput domain required by the plugin (time or frequency).\n\t",
   :rdfs/domain :vamp/Plugin,
   :rdfs/label "input domain",
   :rdfs/range :vamp/InputDomain,
   :vs/term_status "stable"})

(def max_value
  "Maximum value of the parameter range"
  {:db/ident       :vamp/max_value,
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty
                    :rdf/Property],
   :rdfs/comment   "\n\t\tMaximum value of the parameter range\n\t",
   :rdfs/label     "max value",
   :rdfs/range     [:vamp/KnownExtentsOutput :vamp/Parameter],
   :vs/term_status "unstable"})

(def min_value
  "Minimum value of the parameter range"
  {:db/ident       :vamp/min_value,
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty
                    :rdf/Property],
   :rdfs/comment   "\n\t\tMinimum value of the parameter range\n\t",
   :rdfs/label     "min value",
   :rdfs/range     [:vamp/KnownExtentsOutput :vamp/Parameter],
   :vs/term_status "unstable"})

(def name
  "Human-readable identifier for the plugin."
  {:db/ident       :vamp/name,
   :rdf/type       [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment   "\n\t\tHuman-readable identifier for the plugin.\n\t",
   :rdfs/domain    :vamp/Plugin,
   :rdfs/label     "plugin name",
   :vs/term_status "stable"})

(def output
  "Links each output type to the plugin."
  {:db/ident       :vamp/output,
   :rdf/type       [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment   "\n\t\tLinks each output type to the plugin.\n\t",
   :rdfs/domain    [:vamp/Transform :vamp/Plugin],
   :rdfs/label     "output",
   :rdfs/range     :vamp/PluginOutput,
   :vs/term_status "stable"})

(def parameter
  "Links each parameter descriptor to the plugin."
  {:db/ident       :vamp/parameter,
   :rdf/type       [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment   "\n\t\tLinks each parameter descriptor to the plugin.\n\t",
   :rdfs/domain    [:vamp/Plugin :vamp/ParameterBinding],
   :rdfs/label     "parameter descriptor",
   :rdfs/range     :vamp/Parameter,
   :vs/term_status "stable"})

(def parameter_binding
  "Specifies the parameter to set the plugin in execution."
  {:db/ident :vamp/parameter_binding,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tSpecifies the parameter to set the plugin in execution. \n\t",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "parameter",
   :rdfs/range :vamp/ParameterBinding,
   :vs/term_status "stable"})

(def program
  "Specifies the program to set the plugin in execution. Here the plugin program matches with the one in the plugin descriptor. There is not descriptor required for the program (just a string), is it?"
  {:db/ident :vamp/program,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tSpecifies the program to set the plugin in execution.  Here the plugin program matches with the one in the plugin descriptor. There is not descriptor required for the program (just a string), is it?\n\t",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "program",
   :rdfs/range :vamp/PluginProgram,
   :vs/term_status "stable"})

(def quantize_step
  "Quantize step. Only defined for quantized outputs"
  {:db/ident :vamp/quantize_step,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty :rdf/Property],
   :rdfs/comment "\n\t\tQuantize step. Only defined for quantized outputs\n\t",
   :rdfs/domain [:vamp/QuantizedParameter :vamp/QuantizedOutput],
   :rdfs/label "quantized step",
   :vs/term_status "unstable"})

(def sample_rate
  "Specifies the sample rate if it is not constant. Sample rate of the output if any. Should be read depending on SampleType and Output classes."
  {:db/ident :vamp/sample_rate,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   ["\n\t\t\tSpecifies the sample rate if it is not constant.\n\t"
    "\n\t\tSample rate of the output if any. Should be read depending on SampleType and Output classes.\n\t"],
   :rdfs/domain [:vamp/Transform :vamp/PluginOutput],
   :rdfs/label "sample rate",
   :vs/term_status ["unstable" "stable"]})

(def sample_type
  "The sample type specifies the temporal information of the output."
  {:db/ident :vamp/sample_type,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tThe sample type specifies the temporal information of the output.\n\t",
   :rdfs/domain :vamp/PluginOutput,
   :rdfs/label "sample type",
   :rdfs/range :vamp/SampleType,
   :vs/term_status "unstable"})

(def start
  "Specifies temporal information when processing a data stream."
  {:db/ident :vamp/start,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tSpecifies temporal information when processing a data stream. \n\t",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "start",
   :vs/term_status "unstable"})

(def step_size
  "Specifies the step size for the framing."
  {:db/ident       :vamp/step_size,
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty
                    :rdf/Property],
   :rdfs/comment   "\n\t\t\tSpecifies the step size for the framing. \n\t",
   :rdfs/domain    :vamp/Transform,
   :rdfs/label     "step size",
   :vs/term_status "stable"})

(def summary_type
  "Specifies a summary type to be used (for averaging etc) on transform results."
  {:db/ident :vamp/summary_type,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t     Specifies a summary type to be used (for averaging etc) on transform results.\n        ",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "summary type",
   :vs/term_status "unstable"})

(def transform_type
  "Specifies the transform type (we could do this by subclassin transform instead of using a property)."
  {:db/ident :vamp/transform_type,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tSpecifies the transform type (we could do this by subclassin transform instead of using a property). \n\t",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "transform type",
   :vs/term_status "unstable"})

(def unit
  "Unit of the output/parameter. A string type"
  {:db/ident       :vamp/unit,
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty
                    :rdf/Property],
   :rdfs/comment   "\n\t\tUnit of the output/parameter. A string type\n\t",
   :rdfs/domain    [:vamp/Parameter :vamp/PluginOutput],
   :rdfs/label     "unit",
   :vs/term_status "unstable"})

(def value
  "Specifies the current value of the parameter."
  {:db/ident       :vamp/value,
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty
                    :rdf/Property],
   :rdfs/comment   "\n\t\t\tSpecifies the current value of the parameter. \n\t",
   :rdfs/domain    :vamp/ParameterBinding,
   :rdfs/label     "value",
   :vs/term_status "stable"})

(def value_names
  "List of value names if available"
  {:db/ident       :vamp/value_names,
   :rdf/type       [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment   "\n\t\tList of value names if available\n\t",
   :rdfs/domain    :vamp/Parameter,
   :rdfs/label     "value names",
   :vs/term_status "unstable"})

(def vamp_API_version
  "Version of the Vamp API used to implement this plugin."
  {:db/ident :vamp/vamp_API_version,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\tVersion of the Vamp API used to implement this plugin.\n\t",
   :rdfs/domain :vamp/Plugin,
   :rdfs/label "Vamp API version",
   :vs/term_status "stable"})

(def window_type
  "Specifies the window type (they should be individuals and clearly not here)."
  {:db/ident :vamp/window_type,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "\n\t\t\tSpecifies the window type (they should be individuals and clearly not here). \n\t",
   :rdfs/domain :vamp/Transform,
   :rdfs/label "window type",
   :vs/term_status "unstable"})

(def ^{:private true} term_status
  {:db/ident :vs/term_status,
   :rdf/type :owl/AnnotationProperty})
