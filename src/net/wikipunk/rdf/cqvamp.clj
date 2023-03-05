(ns net.wikipunk.rdf.cqvamp
  "http://vamp-plugins.org/rdf/plugins/cqvamp"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/cqvamp",
   :rdf/ns-prefix-map {"af"     "http://purl.org/ontology/af/",
                       "cc"     "http://web.resource.org/cc/",
                       "cqvamp" "http://vamp-plugins.org/rdf/plugins/cqvamp#",
                       "dc11"   "http://purl.org/dc/elements/1.1/",
                       "doap"   "http://usefulinc.com/ns/doap#",
                       "foaf"   "http://xmlns.com/foaf/0.1/",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp"   "http://purl.org/ontology/vamp/",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "cqvamp",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/cqvamp"})

(def cqchromavamp
  "Extract a Constant-Q spectrogram with constant ratio of centre frequency to resolution from the audio, then wrap it around into a single-octave chromagram."
  {:db/ident :cqvamp/cqchromavamp,
   :dc11/description
   "Extract a Constant-Q spectrogram with constant ratio of centre frequency to resolution from the audio, then wrap it around into a single-octave chromagram.",
   :dc11/rights
   "Plugin by Chris Cannam. Method by Christian Schörkhuber and Anssi Klapuri. Copyright (c) 2014 QMUL. BSD/MIT licence.",
   :dc11/title "Chromagram",
   :foaf/maker :cqvamp/library_maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "cqchromavamp",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Chromagram",
   :vamp/output :cqvamp/cqchromavamp_output_chromagram,
   :vamp/parameter [:cqvamp/cqchromavamp_param_bpo
                    :cqvamp/cqchromavamp_param_lowestoct
                    :cqvamp/cqchromavamp_param_tuning
                    :cqvamp/cqchromavamp_param_octaves],
   :vamp/vamp_API_version :vamp/api_version_2})

(def cqchromavamp_output_chromagram
  "Chromagram obtained from output of constant-Q transform, folding over each process block into a single-octave vector"
  {:db/ident :cqvamp/cqchromavamp_output_chromagram,
   :dc11/description
   "Chromagram obtained from output of constant-Q transform, folding over each process block into a single-octave vector",
   :dc11/title "Chromagram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 36,
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "chromagram",
   :vamp/unit ""})

(def cqchromavamp_param_bpo
  {:db/ident           :cqvamp/cqchromavamp_param_bpo,
   :dc11/format        "bins",
   :dc11/title         "Bins per Octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 36,
   :vamp/identifier    "bpo",
   :vamp/max_value     480,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "bins",
   :vamp/value_names   :rdf/nil})

(def cqchromavamp_param_lowestoct
  {:db/ident           :cqvamp/cqchromavamp_param_lowestoct,
   :dc11/format        "",
   :dc11/title         "Lowest Contributing Octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "lowestoct",
   :vamp/max_value     12,
   :vamp/min_value     -1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def cqchromavamp_param_octaves
  {:db/ident           :cqvamp/cqchromavamp_param_octaves,
   :dc11/format        "octaves",
   :dc11/title         "Contributing Octave Count",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 7,
   :vamp/identifier    "octaves",
   :vamp/max_value     12,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "octaves",
   :vamp/value_names   :rdf/nil})

(def cqchromavamp_param_tuning
  {:db/ident           :cqvamp/cqchromavamp_param_tuning,
   :dc11/format        "Hz",
   :dc11/title         "Tuning Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "tuning",
   :vamp/max_value     500,
   :vamp/min_value     360,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def cqvamp
  "Extract a spectrogram with constant ratio of centre frequency to resolution from the input audio, specifying the frequency range in Hz."
  {:db/ident :cqvamp/cqvamp,
   :dc11/description
   "Extract a spectrogram with constant ratio of centre frequency to resolution from the input audio, specifying the frequency range in Hz.",
   :dc11/rights
   "Plugin by Chris Cannam. Method by Christian Schörkhuber and Anssi Klapuri. Copyright (c) 2014 QMUL. BSD/MIT licence.",
   :dc11/title "Constant-Q Spectrogram (Hz range)",
   :foaf/maker :cqvamp/library_maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "cqvamp",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Constant-Q Spectrogram (Hz range)",
   :vamp/output :cqvamp/cqvamp_output_constantq,
   :vamp/parameter [:cqvamp/cqvamp_param_interpolation
                    :cqvamp/cqvamp_param_bpo
                    :cqvamp/cqvamp_param_maxfreq
                    :cqvamp/cqvamp_param_minfreq],
   :vamp/vamp_API_version :vamp/api_version_2})

(def cqvamp_output_constantq
  "Output of constant-Q transform, as a single vector per process block"
  {:db/ident :cqvamp/cqvamp_output_constantq,
   :dc11/description
   "Output of constant-Q transform, as a single vector per process block",
   :dc11/title "Constant-Q Spectrogram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 216,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "constantq",
   :vamp/unit ""})

(def cqvamp_param_bpo
  {:db/ident           :cqvamp/cqvamp_param_bpo,
   :dc11/format        "bins",
   :dc11/title         "Bins per Octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 36,
   :vamp/identifier    "bpo",
   :vamp/max_value     480,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "bins",
   :vamp/value_names   :rdf/nil})

(def cqvamp_param_interpolation
  {:db/ident           :cqvamp/cqvamp_param_interpolation,
   :dc11/format        "",
   :dc11/title         "Interpolation",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2,
   :vamp/identifier    "interpolation",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["None, leave as zero"
                        "None, repeat prior value"
                        "Linear interpolation"]})

(def cqvamp_param_maxfreq
  {:db/ident           :cqvamp/cqvamp_param_maxfreq,
   :dc11/format        "Hz",
   :dc11/title         "Maximum Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 14080,
   :vamp/identifier    "maxfreq",
   :vamp/max_value     24000,
   :vamp/min_value     1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def cqvamp_param_minfreq
  {:db/ident           :cqvamp/cqvamp_param_minfreq,
   :dc11/format        "Hz",
   :dc11/title         "Minimum Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 100,
   :vamp/identifier    "minfreq",
   :vamp/max_value     24000,
   :vamp/min_value     1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def cqvampmidi
  "Extract a spectrogram with constant ratio of centre frequency to resolution from the input audio, specifying the frequency range in MIDI pitch units."
  {:db/ident :cqvamp/cqvampmidi,
   :dc11/description
   "Extract a spectrogram with constant ratio of centre frequency to resolution from the input audio, specifying the frequency range in MIDI pitch units.",
   :dc11/rights
   "Plugin by Chris Cannam. Method by Christian Schörkhuber and Anssi Klapuri. Copyright (c) 2014 QMUL. BSD/MIT licence.",
   :dc11/title "Constant-Q Spectrogram (MIDI pitch range)",
   :foaf/maker :cqvamp/library_maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "cqvampmidi",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Constant-Q Spectrogram (MIDI pitch range)",
   :vamp/output :cqvamp/cqvampmidi_output_constantq,
   :vamp/parameter [:cqvamp/cqvampmidi_param_interpolation
                    :cqvamp/cqvampmidi_param_maxpitch
                    :cqvamp/cqvampmidi_param_tuning
                    :cqvamp/cqvampmidi_param_bpo
                    :cqvamp/cqvampmidi_param_minpitch],
   :vamp/vamp_API_version :vamp/api_version_2})

(def cqvampmidi_output_constantq
  "Output of constant-Q transform, as a single vector per process block"
  {:db/ident :cqvamp/cqvampmidi_output_constantq,
   :dc11/description
   "Output of constant-Q transform, as a single vector per process block",
   :dc11/title "Constant-Q Spectrogram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 216,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "constantq",
   :vamp/unit ""})

(def cqvampmidi_param_bpo
  {:db/ident           :cqvamp/cqvampmidi_param_bpo,
   :dc11/format        "bins",
   :dc11/title         "Bins per Octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 36,
   :vamp/identifier    "bpo",
   :vamp/max_value     480,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "bins",
   :vamp/value_names   :rdf/nil})

(def cqvampmidi_param_interpolation
  {:db/ident           :cqvamp/cqvampmidi_param_interpolation,
   :dc11/format        "",
   :dc11/title         "Interpolation",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2,
   :vamp/identifier    "interpolation",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["None, leave as zero"
                        "None, repeat prior value"
                        "Linear interpolation"]})

(def cqvampmidi_param_maxpitch
  {:db/ident           :cqvamp/cqvampmidi_param_maxpitch,
   :dc11/format        "MIDI units",
   :dc11/title         "Maximum Pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 84,
   :vamp/identifier    "maxpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI units",
   :vamp/value_names   :rdf/nil})

(def cqvampmidi_param_minpitch
  {:db/ident           :cqvamp/cqvampmidi_param_minpitch,
   :dc11/format        "MIDI units",
   :dc11/title         "Minimum Pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 36,
   :vamp/identifier    "minpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI units",
   :vamp/value_names   :rdf/nil})

(def cqvampmidi_param_tuning
  {:db/ident           :cqvamp/cqvampmidi_param_tuning,
   :dc11/format        "Hz",
   :dc11/title         "Tuning Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "tuning",
   :vamp/max_value     500,
   :vamp/min_value     360,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def library
  "A plugin implementing the Constant-Q transform of a time-domain signal."
  {:db/ident :cqvamp/library,
   :dc11/description
   "A plugin implementing the Constant-Q transform of a time-domain signal.",
   :dc11/title "Constant-Q",
   :doap/download-page
   "http://code.soundsoftware.ac.uk/projects/constant-q-cpp/files",
   :foaf/maker :cqvamp/library_maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/constant-q-cpp",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin
   [:cqvamp/cqchromavamp :cqvamp/cqvamp :cqvamp/cqvampmidi],
   :vamp/identifier "cqvamp"})

(def library_maker
  {:db/ident  :cqvamp/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Queen Mary, University of London",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})