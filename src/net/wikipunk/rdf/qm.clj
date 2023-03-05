(ns net.wikipunk.rdf.qm
  "http://vamp-plugins.org/rdf/plugins/qm-vamp-plugins"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/qm-vamp-plugins",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/qm-vamp-plugins#",
                       "qm"
                       "http://vamp-plugins.org/rdf/plugins/qm-vamp-plugins#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "qm",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/qm-vamp-plugins"})

(def library
  "Plugins from the Centre for Digital Music at Queen Mary, University of London"
  {:db/ident :qm/library,
   :dc11/description
   "Plugins from the Centre for Digital Music at Queen Mary, University of London",
   :dc11/title "Queen Mary plugin set",
   :doap/download-page
   "https://code.soundsoftware.ac.uk/projects/qm-vamp-plugins/files",
   :foaf/maker :qm/maker,
   :foaf/page "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:qm/qm-keydetector
                           :qm/qm-dwt
                           :qm/qm-transcription
                           :qm/qm-similarity
                           :qm/qm-mfcc
                           :qm/qm-chromagram
                           :qm/qm-tempotracker
                           :qm/qm-adaptivespectrogram
                           :qm/qm-tonalchange
                           :qm/qm-constantq
                           :qm/qm-onsetdetector
                           :qm/qm-segmenter
                           :qm/qm-barbeattracker],
   :vamp/identifier "qm-vamp-plugins"})

(def maker
  {:db/ident  :qm/maker,
   :foaf/logo "https://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Queen Mary, University of London",
   :foaf/page "https://c4dm.eecs.qmul.ac.uk/"})

(def qm-adaptivespectrogram
  "Produce an adaptive spectrogram by adaptive selection from spectrograms at multiple resolutions"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-adaptivespectrogram,
   :dc11/description
   "Produce an adaptive spectrogram by adaptive selection from spectrograms at multiple resolutions",
   :dc11/rights
   "Plugin by Wen Xue and Chris Cannam.  Copyright (c) 2009 Wen Xue and QMUL - All Rights Reserved",
   :dc11/title "Adaptive Spectrogram",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-adaptivespectrogram",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/category "Visualisation",
   :vamp/identifier "qm-adaptivespectrogram",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Adaptive Spectrogram",
   :vamp/output :qm/qm-adaptivespectrogram_output_output,
   :vamp/parameter [:qm/qm-adaptivespectrogram_param_threaded
                    :qm/qm-adaptivespectrogram_param_w
                    :qm/qm-adaptivespectrogram_param_coarse
                    :qm/qm-adaptivespectrogram_param_dec
                    :qm/qm-adaptivespectrogram_param_n],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-adaptivespectrogram_output_output
  "The output of the plugin"
  {:db/ident         :qm/qm-adaptivespectrogram_output_output,
   :dc11/description "The output of the plugin",
   :dc11/title       "Output",
   :rdf/type         :vamp/DenseOutput,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/identifier  "output",
   :vamp/unit        ""})

(def qm-adaptivespectrogram_param_coarse
  {:db/ident           :qm/qm-adaptivespectrogram_param_coarse,
   :dc11/format        "",
   :dc11/title         "Omit alternate resolutions",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "coarse",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-adaptivespectrogram_param_dec
  {:db/ident           :qm/qm-adaptivespectrogram_param_dec,
   :dc11/format        "",
   :dc11/title         "Decimation factor",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "dec",
   :vamp/max_value     3,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["No decimation" "2" "4" "8"]})

(def qm-adaptivespectrogram_param_n
  {:db/ident           :qm/qm-adaptivespectrogram_param_n,
   :dc11/format        "",
   :dc11/title         "Number of resolutions",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "n",
   :vamp/max_value     10,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-adaptivespectrogram_param_threaded
  {:db/ident           :qm/qm-adaptivespectrogram_param_threaded,
   :dc11/format        "",
   :dc11/title         "Multi-threaded processing",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "threaded",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-adaptivespectrogram_param_w
  {:db/ident           :qm/qm-adaptivespectrogram_param_w,
   :dc11/format        "",
   :dc11/title         "Smallest resolution",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 9,
   :vamp/identifier    "w",
   :vamp/max_value     14,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["2"
                        "4"
                        "8"
                        "16"
                        "32"
                        "64"
                        "128"
                        "256"
                        "512"
                        "1024"
                        "2048"
                        "4096"
                        "8192"
                        "16384"]})

(def qm-barbeattracker
  "Estimate bar and beat locations"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-barbeattracker,
   :dc11/description "Estimate bar and beat locations",
   :dc11/rights
   "Plugin by Matthew Davies, Christian Landone and Chris Cannam.  Copyright (c) 2006-2013 QMUL - All Rights Reserved",
   :dc11/title "Bar and Beat Tracker",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-barbeattracker",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/category "Time > Tempo",
   :vamp/identifier "qm-barbeattracker",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Bar and Beat Tracker",
   :vamp/output [:qm/qm-barbeattracker_output_beatcounts
                 :qm/qm-barbeattracker_output_beats
                 :qm/qm-barbeattracker_output_bars
                 :qm/qm-barbeattracker_output_beatsd],
   :vamp/parameter [:qm/qm-barbeattracker_param_bpb
                    :qm/qm-barbeattracker_param_inputtempo
                    :qm/qm-barbeattracker_param_alpha
                    :qm/qm-barbeattracker_param_constraintempo],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-barbeattracker_output_bars
  "Bar locations"
  {:db/ident             :qm/qm-barbeattracker_output_bars,
   :dc11/description     "Bar locations",
   :dc11/title           "Bars",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "bars",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-barbeattracker_output_beatcounts
  "Beat counter function"
  {:db/ident             :qm/qm-barbeattracker_output_beatcounts,
   :dc11/description     "Beat counter function",
   :dc11/title           "Beat Count",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "beatcounts",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-barbeattracker_output_beats
  "Beat locations labelled with metrical position"
  {:db/ident             :qm/qm-barbeattracker_output_beats,
   :dc11/description     "Beat locations labelled with metrical position",
   :dc11/title           "Beats",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/computes_event_type :af/Beat,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "beats",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-barbeattracker_output_beatsd
  "Beat spectral difference function used for bar-line detection"
  {:db/ident :qm/qm-barbeattracker_output_beatsd,
   :dc11/description
   "Beat spectral difference function used for bar-line detection",
   :dc11/title "Beat Spectral Difference",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "beatsd",
   :vamp/sample_rate 86.1326M,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def qm-barbeattracker_param_alpha
  {:db/ident           :qm/qm-barbeattracker_param_alpha,
   :dc11/format        "",
   :dc11/title         "Alpha",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.9M,
   :vamp/identifier    "alpha",
   :vamp/max_value     0.99M,
   :vamp/min_value     0.1M,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-barbeattracker_param_bpb
  {:db/ident           :qm/qm-barbeattracker_param_bpb,
   :dc11/format        "",
   :dc11/title         "Beats per Bar",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier    "bpb",
   :vamp/max_value     16,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-barbeattracker_param_constraintempo
  {:db/ident           :qm/qm-barbeattracker_param_constraintempo,
   :dc11/format        "",
   :dc11/title         "Constrain Tempo",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "constraintempo",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-barbeattracker_param_inputtempo
  {:db/ident           :qm/qm-barbeattracker_param_inputtempo,
   :dc11/format        "BPM",
   :dc11/title         "Tempo Hint",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 120,
   :vamp/identifier    "inputtempo",
   :vamp/max_value     250,
   :vamp/min_value     50,
   :vamp/quantize_step 1,
   :vamp/unit          "BPM",
   :vamp/value_names   :rdf/nil})

(def qm-chromagram
  "Extract a series of tonal chroma vectors from the audio"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-chromagram,
   :dc11/description "Extract a series of tonal chroma vectors from the audio",
   :dc11/rights
   "Plugin by Chris Cannam and Christian Landone.  Copyright (c) 2006-2009 QMUL - All Rights Reserved",
   :dc11/title "Chromagram",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-chromagram",
   :owl/versionInfo "5",
   :rdf/type :vamp/Plugin,
   :vamp/category "Visualisation",
   :vamp/identifier "qm-chromagram",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Chromagram",
   :vamp/output [:qm/qm-chromagram_output_chromagram
                 :qm/qm-chromagram_output_chromameans],
   :vamp/parameter [:qm/qm-chromagram_param_minpitch
                    :qm/qm-chromagram_param_maxpitch
                    :qm/qm-chromagram_param_bpo
                    :qm/qm-chromagram_param_normalization
                    :qm/qm-chromagram_param_tuning],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-chromagram_output_chromagram
  "Output of chromagram, as a single vector per process block"
  {:db/ident :qm/qm-chromagram_output_chromagram,
   :dc11/description
   "Output of chromagram, as a single vector per process block",
   :dc11/title "Chromagram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 12,
   :vamp/bin_names ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "chromagram",
   :vamp/unit ""})

(def qm-chromagram_output_chromameans
  "Mean values of chromagram bins across the duration of the input audio"
  {:db/ident :qm/qm-chromagram_output_chromameans,
   :dc11/description
   "Mean values of chromagram bins across the duration of the input audio",
   :dc11/title "Chroma Means",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 12,
   :vamp/bin_names ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "chromameans",
   :vamp/unit ""})

(def qm-chromagram_param_bpo
  {:db/ident           :qm/qm-chromagram_param_bpo,
   :dc11/format        "bins",
   :dc11/title         "Bins per Octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 12,
   :vamp/identifier    "bpo",
   :vamp/max_value     480,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "bins",
   :vamp/value_names   :rdf/nil})

(def qm-chromagram_param_maxpitch
  {:db/ident           :qm/qm-chromagram_param_maxpitch,
   :dc11/format        "MIDI units",
   :dc11/title         "Maximum Pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 96,
   :vamp/identifier    "maxpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI units",
   :vamp/value_names   :rdf/nil})

(def qm-chromagram_param_minpitch
  {:db/ident           :qm/qm-chromagram_param_minpitch,
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

(def qm-chromagram_param_normalization
  {:db/ident           :qm/qm-chromagram_param_normalization,
   :dc11/format        "",
   :dc11/title         "Normalization",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "normalization",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["None" "Unit Sum" "Unit Maximum"]})

(def qm-chromagram_param_tuning
  {:db/ident           :qm/qm-chromagram_param_tuning,
   :dc11/format        "Hz",
   :dc11/title         "Tuning Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "tuning",
   :vamp/max_value     500,
   :vamp/min_value     360,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def qm-constantq
  "Extract a spectrogram with constant ratio of centre frequency to resolution from the input audio"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-constantq,
   :dc11/description
   "Extract a spectrogram with constant ratio of centre frequency to resolution from the input audio",
   :dc11/rights
   "Plugin by Chris Cannam and Christian Landone.  Copyright (c) 2006-2009 QMUL - All Rights Reserved",
   :dc11/title "Constant-Q Spectrogram",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-constantq",
   :owl/versionInfo "4",
   :rdf/type :vamp/Plugin,
   :vamp/category "Visualisation",
   :vamp/identifier "qm-constantq",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Constant-Q Spectrogram",
   :vamp/output :qm/qm-constantq_output_constantq,
   :vamp/parameter [:qm/qm-constantq_param_normalized
                    :qm/qm-constantq_param_minpitch
                    :qm/qm-constantq_param_bpo
                    :qm/qm-constantq_param_tuning
                    :qm/qm-constantq_param_maxpitch],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-constantq_output_constantq
  "Output of constant-Q transform, as a single vector per process block"
  {:db/ident :qm/qm-constantq_output_constantq,
   :dc11/description
   "Output of constant-Q transform, as a single vector per process block",
   :dc11/title "Constant-Q Spectrogram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "constantq",
   :vamp/unit ""})

(def qm-constantq_param_bpo
  {:db/ident           :qm/qm-constantq_param_bpo,
   :dc11/format        "bins",
   :dc11/title         "Bins per Octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 12,
   :vamp/identifier    "bpo",
   :vamp/max_value     480,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "bins",
   :vamp/value_names   :rdf/nil})

(def qm-constantq_param_maxpitch
  {:db/ident           :qm/qm-constantq_param_maxpitch,
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

(def qm-constantq_param_minpitch
  {:db/ident           :qm/qm-constantq_param_minpitch,
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

(def qm-constantq_param_normalized
  {:db/ident           :qm/qm-constantq_param_normalized,
   :dc11/format        "",
   :dc11/title         "Normalized",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "normalized",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-constantq_param_tuning
  {:db/ident           :qm/qm-constantq_param_tuning,
   :dc11/format        "Hz",
   :dc11/title         "Tuning Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "tuning",
   :vamp/max_value     500,
   :vamp/min_value     360,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def qm-dwt
  "Visualisation by scalogram"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-dwt,
   :dc11/description "Visualisation by scalogram",
   :dc11/rights
   "Plugin by Thomas Wilmering.  Copyright (c) 2009 Thomas Wilmering and QMUL - All Rights Reserved",
   :dc11/title "Discrete Wavelet Transform",
   :foaf/maker :qm/maker,
   :foaf/page "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-dwt",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/category "Visualisation",
   :vamp/identifier "qm-dwt",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Discrete Wavelet Transform",
   :vamp/output :qm/qm-dwt_output_wcoeff,
   :vamp/parameter [:qm/qm-dwt_param_absolute
                    :qm/qm-dwt_param_threshold
                    :qm/qm-dwt_param_wavelet
                    :qm/qm-dwt_param_scales],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-dwt_output_wcoeff
  "Wavelet coefficients"
  {:db/ident             :qm/qm-dwt_output_wcoeff,
   :dc11/description     "Wavelet coefficients",
   :dc11/title           "Wavelet Coefficients",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       10,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "wcoeff",
   :vamp/unit            ""})

(def qm-dwt_param_absolute
  {:db/ident           :qm/qm-dwt_param_absolute,
   :dc11/format        "",
   :dc11/title         "Absolute values",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "absolute",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-dwt_param_scales
  {:db/ident           :qm/qm-dwt_param_scales,
   :dc11/format        "",
   :dc11/title         "Scales",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 10,
   :vamp/identifier    "scales",
   :vamp/max_value     16,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-dwt_param_threshold
  {:db/ident           :qm/qm-dwt_param_threshold,
   :dc11/format        "",
   :dc11/title         "Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "threshold",
   :vamp/max_value     0.01M,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-dwt_param_wavelet
  {:db/ident           :qm/qm-dwt_param_wavelet,
   :dc11/format        "",
   :dc11/title         "Wavelet",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "wavelet",
   :vamp/max_value     42,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Haar"
                        "Daubechies 2"
                        "Daubechies 3"
                        "Daubechies 4"
                        "Daubechies 5"
                        "Daubechies 6"
                        "Daubechies 7"
                        "Daubechies 8"
                        "Daubechies 9"
                        "Daubechies 10"
                        "Daubechies 20"
                        "Daubechies 40"
                        "Symlet 2"
                        "Symlet 3"
                        "Symlet 4"
                        "Symlet 5"
                        "Symlet 6"
                        "Symlet 7"
                        "Symlet 8"
                        "Symlet 9"
                        "Symlet 10"
                        "Symlet 20"
                        "Symlet 30"
                        "Coiflet 1"
                        "Coiflet 2"
                        "Coiflet 3"
                        "Coiflet 4"
                        "Coiflet 5"
                        "Biorthogonal 1.3"
                        "Biorthogonal 1.5"
                        "Biorthogonal 2.2"
                        "Biorthogonal 2.4"
                        "Biorthogonal 2.6"
                        "Biorthogonal 2.8"
                        "Biorthogonal 3.1"
                        "Biorthogonal 3.3"
                        "Biorthogonal 3.5"
                        "Biorthogonal 3.7"
                        "Biorthogonal 3.9"
                        "Biorthogonal 4.4"
                        "Biorthogonal 5.5"
                        "Biorthogonal 6.8"
                        "Meyer"]})

(def qm-keydetector
  "Estimate the key of the music"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-keydetector,
   :dc11/description "Estimate the key of the music",
   :dc11/rights
   "Plugin by Katy Noland and Christian Landone.  Copyright (c) 2006-2019 QMUL - All Rights Reserved",
   :dc11/title "Key Detector",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-keydetector",
   :owl/versionInfo "6",
   :rdf/type :vamp/Plugin,
   :vamp/category "Key and Tonality",
   :vamp/identifier "qm-keydetector",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Key Detector",
   :vamp/output [:qm/qm-keydetector_output_keystrength
                 :qm/qm-keydetector_output_tonic
                 :qm/qm-keydetector_output_key
                 :qm/qm-keydetector_output_mergedkeystrength
                 :qm/qm-keydetector_output_mode],
   :vamp/parameter [:qm/qm-keydetector_param_tuning
                    :qm/qm-keydetector_param_length],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-keydetector_output_key
  "Estimated key (from C major = 1 to B major = 12 and C minor = 13 to B minor = 24)"
  {:db/ident :qm/qm-keydetector_output_key,
   :dc11/description
   "Estimated key (from C major = 1 to B major = 12 and C minor = 13 to B minor = 24)",
   :dc11/title "Key",
   :rdf/type
   [:vamp/SparseOutput :vamp/KnownExtentsOutput :vamp/QuantizedOutput],
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_event_type :af/KeyChange,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "key",
   :vamp/max_value 24,
   :vamp/min_value 1,
   :vamp/quantize_step 1,
   :vamp/sample_rate 1.34583M,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def qm-keydetector_output_keystrength
  "Correlation of the chroma vector with stored key profile for each major and minor key"
  {:db/ident :qm/qm-keydetector_output_keystrength,
   :dc11/description
   "Correlation of the chroma vector with stored key profile for each major and minor key",
   :dc11/title "Key Strength Plot",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 25,
   :vamp/bin_names ["F# / Gb major"
                    "B major"
                    "E major"
                    "A major"
                    "D major"
                    "G major"
                    "C major"
                    "F major"
                    "Bb major"
                    "Eb major"
                    "Ab major"
                    "Db major"
                    " "
                    "Eb / D# minor"
                    "G# minor"
                    "C# minor"
                    "F# minor"
                    "B minor"
                    "E minor"
                    "A minor"
                    "D minor"
                    "G minor"
                    "C minor"
                    "F minor"
                    "Bb minor"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "keystrength",
   :vamp/unit ""})

(def qm-keydetector_output_mergedkeystrength
  "Correlation of the chroma vector with stored key profile for each key, with major and minor alternatives merged"
  {:db/ident :qm/qm-keydetector_output_mergedkeystrength,
   :dc11/description
   "Correlation of the chroma vector with stored key profile for each key, with major and minor alternatives merged",
   :dc11/title "Merged Key Strength Plot",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 12,
   :vamp/bin_names ["F#/Gb maj / Eb/D# min"
                    "B maj / G# min"
                    "E maj / C# min"
                    "A maj / F# min"
                    "D maj / B min"
                    "G maj / E min"
                    "C maj / A min"
                    "F maj / D min"
                    "Bb maj / G min"
                    "Eb maj / C min"
                    "Ab maj / F min"
                    "Db maj / Bb min"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "mergedkeystrength",
   :vamp/unit ""})

(def qm-keydetector_output_mode
  "Major or minor mode of the estimated key (major = 0, minor = 1)"
  {:db/ident :qm/qm-keydetector_output_mode,
   :dc11/description
   "Major or minor mode of the estimated key (major = 0, minor = 1)",
   :dc11/title "Key Mode",
   :rdf/type
   [:vamp/KnownExtentsOutput :vamp/QuantizedOutput :vamp/SparseOutput],
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "mode",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/sample_rate 1.34583M,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def qm-keydetector_output_tonic
  "Tonic of the estimated key (from C = 1 to B = 12)"
  {:db/ident             :qm/qm-keydetector_output_tonic,
   :dc11/description     "Tonic of the estimated key (from C = 1 to B = 12)",
   :dc11/title           "Tonic Pitch",
   :rdf/type             [:vamp/QuantizedOutput
                          :vamp/KnownExtentsOutput
                          :vamp/SparseOutput],
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tonic",
   :vamp/max_value       12,
   :vamp/min_value       1,
   :vamp/quantize_step   1,
   :vamp/sample_rate     1.34583M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-keydetector_param_length
  {:db/ident           :qm/qm-keydetector_param_length,
   :dc11/format        "chroma frames",
   :dc11/title         "Window Length",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 10,
   :vamp/identifier    "length",
   :vamp/max_value     30,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "chroma frames",
   :vamp/value_names   :rdf/nil})

(def qm-keydetector_param_tuning
  {:db/ident           :qm/qm-keydetector_param_tuning,
   :dc11/format        "Hz",
   :dc11/title         "Tuning Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "tuning",
   :vamp/max_value     460,
   :vamp/min_value     420,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def qm-mfcc
  "Calculate a series of MFCC vectors from the audio"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-mfcc,
   :dc11/description "Calculate a series of MFCC vectors from the audio",
   :dc11/rights
   "Plugin by Nicolas Chetry and Chris Cannam.  Copyright (c) 2009 QMUL - All Rights Reserved",
   :dc11/title "Mel-Frequency Cepstral Coefficients",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-mfcc",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/category "Low Level Features",
   :vamp/identifier "qm-mfcc",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Mel-Frequency Cepstral Coefficients",
   :vamp/output [:qm/qm-mfcc_output_means :qm/qm-mfcc_output_coefficients],
   :vamp/parameter [:qm/qm-mfcc_param_wantc0
                    :qm/qm-mfcc_param_logpower
                    :qm/qm-mfcc_param_nceps],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-mfcc_output_coefficients
  "MFCC values"
  {:db/ident :qm/qm-mfcc_output_coefficients,
   :dc11/description "MFCC values",
   :dc11/title "Coefficients",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 20,
   :vamp/bin_names
   ["" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" ""],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "coefficients",
   :vamp/unit ""})

(def qm-mfcc_output_means
  "Mean values of MFCCs across duration of audio input"
  {:db/ident :qm/qm-mfcc_output_means,
   :dc11/description "Mean values of MFCCs across duration of audio input",
   :dc11/title "Means of Coefficients",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 20,
   :vamp/bin_names
   ["" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" ""],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "means",
   :vamp/unit ""})

(def qm-mfcc_param_logpower
  {:db/ident           :qm/qm-mfcc_param_logpower,
   :dc11/format        "",
   :dc11/title         "Power for Mel Amplitude Logs",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1,
   :vamp/identifier    "logpower",
   :vamp/max_value     5,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-mfcc_param_nceps
  {:db/ident           :qm/qm-mfcc_param_nceps,
   :dc11/format        "",
   :dc11/title         "Number of Coefficients",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 20,
   :vamp/identifier    "nceps",
   :vamp/max_value     40,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-mfcc_param_wantc0
  {:db/ident           :qm/qm-mfcc_param_wantc0,
   :dc11/format        "",
   :dc11/title         "Include C0",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "wantc0",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-onsetdetector
  "Estimate individual note onset positions"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-onsetdetector,
   :dc11/description "Estimate individual note onset positions",
   :dc11/rights
   "Plugin by Christian Landone, Chris Duxbury and Juan Pablo Bello.  Copyright (c) 2006-2009 QMUL - All Rights Reserved",
   :dc11/title "Note Onset Detector",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-onsetdetector",
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/category "Time > Onsets",
   :vamp/identifier "qm-onsetdetector",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Note Onset Detector",
   :vamp/output [:qm/qm-onsetdetector_output_detection_fn
                 :qm/qm-onsetdetector_output_smoothed_df
                 :qm/qm-onsetdetector_output_onsets],
   :vamp/parameter [:qm/qm-onsetdetector_param_sensitivity
                    :qm/qm-onsetdetector_param_whiten
                    :qm/qm-onsetdetector_param_dftype],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-onsetdetector_output_detection_fn
  "Probability function of note onset likelihood"
  {:db/ident             :qm/qm-onsetdetector_output_detection_fn,
   :dc11/description     "Probability function of note onset likelihood",
   :dc11/title           "Onset Detection Function",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/computes_signal_type :af/OnsetDetectionFunction,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "detection_fn",
   :vamp/unit            ""})

(def qm-onsetdetector_output_onsets
  "Perceived note onset positions"
  {:db/ident             :qm/qm-onsetdetector_output_onsets,
   :dc11/description     "Perceived note onset positions",
   :dc11/title           "Note Onsets",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/computes_event_type :af/Onset,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onsets",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-onsetdetector_output_smoothed_df
  "Smoothed probability function used for peak-picking"
  {:db/ident             :qm/qm-onsetdetector_output_smoothed_df,
   :dc11/description     "Smoothed probability function used for peak-picking",
   :dc11/title           "Smoothed Detection Function",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/computes_signal_type :af/OnsetDetectionFunction,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "smoothed_df",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-onsetdetector_param_dftype
  {:db/ident           :qm/qm-onsetdetector_param_dftype,
   :dc11/format        "",
   :dc11/title         "Onset Detection Function Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "dftype",
   :vamp/max_value     4,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["High-Frequency Content"
                        "Spectral Difference"
                        "Phase Deviation"
                        "Complex Domain"
                        "Broadband Energy Rise"]})

(def qm-onsetdetector_param_sensitivity
  {:db/ident           :qm/qm-onsetdetector_param_sensitivity,
   :dc11/format        "%",
   :dc11/title         "Onset Detector Sensitivity",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 50,
   :vamp/identifier    "sensitivity",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def qm-onsetdetector_param_whiten
  {:db/ident           :qm/qm-onsetdetector_param_whiten,
   :dc11/format        "",
   :dc11/title         "Adaptive Whitening",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "whiten",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-segmenter
  "Divide the track into a sequence of consistent segments"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-segmenter,
   :dc11/description "Divide the track into a sequence of consistent segments",
   :dc11/rights
   "Plugin by Mark Levy.  Copyright (c) 2006-2013 QMUL - All Rights Reserved",
   :dc11/title "Segmenter",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-segmenter",
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/category "Classification",
   :vamp/identifier "qm-segmenter",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Segmenter",
   :vamp/output :qm/qm-segmenter_output_segmentation,
   :vamp/parameter [:qm/qm-segmenter_param_nSegmentTypes
                    :qm/qm-segmenter_param_neighbourhoodLimit
                    :qm/qm-segmenter_param_featureType],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-segmenter_output_segmentation
  "Segmentation"
  {:db/ident                 :qm/qm-segmenter_output_segmentation,
   :dc11/description         "Segmentation",
   :dc11/title               "Segmentation",
   :rdf/type                 [:vamp/KnownExtentsOutput
                              :vamp/QuantizedOutput
                              :vamp/SparseOutput],
   :vamp/bin_count           1,
   :vamp/bin_names           [""],
   :vamp/computes_event_type :af/StructuralSegment,
   :vamp/fixed_bin_count     "true",
   :vamp/identifier          "segmentation",
   :vamp/max_value           10,
   :vamp/min_value           1,
   :vamp/quantize_step       1,
   :vamp/sample_rate         5,
   :vamp/sample_type         :vamp/VariableSampleRate,
   :vamp/unit                "segment-type"})

(def qm-segmenter_param_featureType
  {:db/ident           :qm/qm-segmenter_param_featureType,
   :dc11/format        "",
   :dc11/title         "Feature Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "featureType",
   :vamp/max_value     3,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Hybrid (Constant-Q)"
                        "Chromatic (Chroma)"
                        "Timbral (MFCC)"]})

(def qm-segmenter_param_nSegmentTypes
  {:db/ident           :qm/qm-segmenter_param_nSegmentTypes,
   :dc11/format        "",
   :dc11/title         "Number of segment-types",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 10,
   :vamp/identifier    "nSegmentTypes",
   :vamp/max_value     12,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-segmenter_param_neighbourhoodLimit
  {:db/ident           :qm/qm-segmenter_param_neighbourhoodLimit,
   :dc11/format        "s",
   :dc11/title         "Minimum segment duration",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier    "neighbourhoodLimit",
   :vamp/max_value     15,
   :vamp/min_value     1,
   :vamp/quantize_step 0.2M,
   :vamp/unit          "s",
   :vamp/value_names   :rdf/nil})

(def qm-similarity
  "Return a distance matrix for similarity between the input audio channels"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-similarity,
   :dc11/description
   "Return a distance matrix for similarity between the input audio channels",
   :dc11/rights
   "Plugin by Mark Levy, Kurt Jacobson and Chris Cannam.  Copyright (c) 2009 QMUL - All Rights Reserved",
   :dc11/title "Similarity",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-similarity",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/category "Classification",
   :vamp/identifier "qm-similarity",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Similarity",
   :vamp/output [:qm/qm-similarity_output_distancevector
                 :qm/qm-similarity_output_beatspectrum
                 :qm/qm-similarity_output_distancematrix
                 :qm/qm-similarity_output_variances
                 :qm/qm-similarity_output_sorteddistancevector
                 :qm/qm-similarity_output_means],
   :vamp/parameter :qm/qm-similarity_param_featureType,
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-similarity_output_beatspectrum
  "Rhythmic self-similarity vectors (beat spectra) for the input channels. Feature time (sec) corresponds to input channel. Not returned if rhythm weighting is zero."
  {:db/ident :qm/qm-similarity_output_beatspectrum,
   :dc11/description
   "Rhythmic self-similarity vectors (beat spectra) for the input channels.  Feature time (sec) corresponds to input channel.  Not returned if rhythm weighting is zero.",
   :dc11/title "Beat Spectra",
   :rdf/type :vamp/SparseOutput,
   :vamp/fixed_bin_count "false",
   :vamp/identifier "beatspectrum",
   :vamp/sample_rate 1,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def qm-similarity_output_distancematrix
  "Distance matrix for similarity metric. Smaller = more similar. Should be symmetrical."
  {:db/ident :qm/qm-similarity_output_distancematrix,
   :dc11/description
   "Distance matrix for similarity metric.  Smaller = more similar.  Should be symmetrical.",
   :dc11/title "Distance Matrix",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "distancematrix",
   :vamp/unit ""})

(def qm-similarity_output_distancevector
  "Distance vector for similarity of each channel to the first channel. Smaller = more similar."
  {:db/ident :qm/qm-similarity_output_distancevector,
   :dc11/description
   "Distance vector for similarity of each channel to the first channel.  Smaller = more similar.",
   :dc11/title "Distance from First Channel",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "distancevector",
   :vamp/unit ""})

(def qm-similarity_output_means
  "Means of the feature bins. Feature time (sec) corresponds to input channel. Number of bins depends on selected feature type."
  {:db/ident :qm/qm-similarity_output_means,
   :dc11/description
   "Means of the feature bins.  Feature time (sec) corresponds to input channel.  Number of bins depends on selected feature type.",
   :dc11/title "Feature Means",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 20,
   :vamp/bin_names
   ["" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" ""],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "means",
   :vamp/unit ""})

(def qm-similarity_output_sorteddistancevector
  "Vector of the order of other channels in similarity to the first, followed by distance vector for similarity of each to the first. Smaller = more similar."
  {:db/ident :qm/qm-similarity_output_sorteddistancevector,
   :dc11/description
   "Vector of the order of other channels in similarity to the first, followed by distance vector for similarity of each to the first.  Smaller = more similar.",
   :dc11/title "Ordered Distances from First Channel",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "sorteddistancevector",
   :vamp/unit ""})

(def qm-similarity_output_variances
  "Variances of the feature bins. Feature time (sec) corresponds to input channel. Number of bins depends on selected feature type."
  {:db/ident :qm/qm-similarity_output_variances,
   :dc11/description
   "Variances of the feature bins.  Feature time (sec) corresponds to input channel.  Number of bins depends on selected feature type.",
   :dc11/title "Feature Variances",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 20,
   :vamp/bin_names
   ["" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" "" ""],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "variances",
   :vamp/unit ""})

(def qm-similarity_param_featureType
  {:db/ident :qm/qm-similarity_param_featureType,
   :dc11/format "",
   :dc11/title "Feature Type",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier "featureType",
   :vamp/max_value 4,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names
   ["Timbre" "Timbre and Rhythm" "Chroma" "Chroma and Rhythm" "Rhythm only"]})

(def qm-tempotracker
  "Estimate beat locations and tempo"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-tempotracker,
   :dc11/description "Estimate beat locations and tempo",
   :dc11/rights
   "Plugin by Christian Landone and Matthew Davies.  Copyright (c) 2006-2013 QMUL - All Rights Reserved",
   :dc11/title "Tempo and Beat Tracker",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-tempotracker",
   :owl/versionInfo "6",
   :rdf/type :vamp/Plugin,
   :vamp/category "Time > Tempo",
   :vamp/identifier "qm-tempotracker",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Tempo and Beat Tracker",
   :vamp/output [:qm/qm-tempotracker_output_tempo
                 :qm/qm-tempotracker_output_beats
                 :qm/qm-tempotracker_output_detection_fn],
   :vamp/parameter [:qm/qm-tempotracker_param_whiten
                    :qm/qm-tempotracker_param_constraintempo
                    :qm/qm-tempotracker_param_dftype
                    :qm/qm-tempotracker_param_inputtempo
                    :qm/qm-tempotracker_param_method
                    :qm/qm-tempotracker_param_alpha],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-tempotracker_output_beats
  "Estimated metrical beat locations"
  {:db/ident             :qm/qm-tempotracker_output_beats,
   :dc11/description     "Estimated metrical beat locations",
   :dc11/title           "Beats",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/computes_event_type :af/Beat,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "beats",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-tempotracker_output_detection_fn
  "Probability function of note onset likelihood"
  {:db/ident             :qm/qm-tempotracker_output_detection_fn,
   :dc11/description     "Probability function of note onset likelihood",
   :dc11/title           "Onset Detection Function",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/computes_signal_type :af/OnsetDetectionFunction,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "detection_fn",
   :vamp/unit            ""})

(def qm-tempotracker_output_tempo
  "Locked tempo estimates"
  {:db/ident             :qm/qm-tempotracker_output_tempo,
   :dc11/description     "Locked tempo estimates",
   :dc11/title           "Tempo",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/computes_event_type :af/Tempo,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tempo",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "bpm"})

(def qm-tempotracker_param_alpha
  {:db/ident           :qm/qm-tempotracker_param_alpha,
   :dc11/format        "",
   :dc11/title         "Alpha",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.9M,
   :vamp/identifier    "alpha",
   :vamp/max_value     0.99M,
   :vamp/min_value     0.1M,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-tempotracker_param_constraintempo
  {:db/ident           :qm/qm-tempotracker_param_constraintempo,
   :dc11/format        "",
   :dc11/title         "Constrain Tempo",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "constraintempo",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-tempotracker_param_dftype
  {:db/ident           :qm/qm-tempotracker_param_dftype,
   :dc11/format        "",
   :dc11/title         "Onset Detection Function Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "dftype",
   :vamp/max_value     4,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["High-Frequency Content"
                        "Spectral Difference"
                        "Phase Deviation"
                        "Complex Domain"
                        "Broadband Energy Rise"]})

(def qm-tempotracker_param_inputtempo
  {:db/ident           :qm/qm-tempotracker_param_inputtempo,
   :dc11/format        "BPM",
   :dc11/title         "Tempo Hint",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 120,
   :vamp/identifier    "inputtempo",
   :vamp/max_value     250,
   :vamp/min_value     50,
   :vamp/quantize_step 1,
   :vamp/unit          "BPM",
   :vamp/value_names   :rdf/nil})

(def qm-tempotracker_param_method
  {:db/ident           :qm/qm-tempotracker_param_method,
   :dc11/format        "",
   :dc11/title         "Beat Tracking Method",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "method",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Old" "New"]})

(def qm-tempotracker_param_whiten
  {:db/ident           :qm/qm-tempotracker_param_whiten,
   :dc11/format        "",
   :dc11/title         "Adaptive Whitening",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "whiten",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def qm-tonalchange
  "Detect and return the positions of harmonic changes such as chord boundaries"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-tonalchange,
   :dc11/description
   "Detect and return the positions of harmonic changes such as chord boundaries",
   :dc11/rights
   "Plugin by Martin Gasser and Christopher Harte.  Copyright (c) 2006-2009 QMUL - All Rights Reserved",
   :dc11/title "Tonal Change",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-tonalchange",
   :owl/versionInfo "4",
   :rdf/type :vamp/Plugin,
   :vamp/category "Key and Tonality",
   :vamp/identifier "qm-tonalchange",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Tonal Change",
   :vamp/output [:qm/qm-tonalchange_output_changepositions
                 :qm/qm-tonalchange_output_tcstransform
                 :qm/qm-tonalchange_output_tcfunction],
   :vamp/parameter [:qm/qm-tonalchange_param_minpitch
                    :qm/qm-tonalchange_param_maxpitch
                    :qm/qm-tonalchange_param_smoothingwidth
                    :qm/qm-tonalchange_param_tuning],
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-tonalchange_output_changepositions
  "Estimated locations of tonal changes"
  {:db/ident             :qm/qm-tonalchange_output_changepositions,
   :dc11/description     "Estimated locations of tonal changes",
   :dc11/title           "Tonal Change Positions",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/computes_event_type :af/TonalOnset,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "changepositions",
   :vamp/sample_rate     21.5332M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def qm-tonalchange_output_tcfunction
  "Estimate of the likelihood of a tonal change occurring within each spectral frame"
  {:db/ident :qm/qm-tonalchange_output_tcfunction,
   :dc11/description
   "Estimate of the likelihood of a tonal change occurring within each spectral frame",
   :dc11/title "Tonal Change Detection Function",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_signal_type :af/TonalChangeDetectionFunction,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tcfunction",
   :vamp/sample_rate 21.5332M,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def qm-tonalchange_output_tcstransform
  "Representation of content in a six-dimensional tonal space"
  {:db/ident :qm/qm-tonalchange_output_tcstransform,
   :dc11/description
   "Representation of content in a six-dimensional tonal space",
   :dc11/title "Transform to 6D Tonal Content Space",
   :rdf/type [:vamp/DenseOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count 6,
   :vamp/bin_names ["" "" "" "" "" ""],
   :vamp/computes_signal_type :af/TonalContentSpace,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tcstransform",
   :vamp/max_value 1,
   :vamp/min_value -1,
   :vamp/unit ""})

(def qm-tonalchange_param_maxpitch
  {:db/ident           :qm/qm-tonalchange_param_maxpitch,
   :dc11/format        "MIDI units",
   :dc11/title         "Chromagram maximum pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 108,
   :vamp/identifier    "maxpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI units",
   :vamp/value_names   :rdf/nil})

(def qm-tonalchange_param_minpitch
  {:db/ident           :qm/qm-tonalchange_param_minpitch,
   :dc11/format        "MIDI units",
   :dc11/title         "Chromagram minimum pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 32,
   :vamp/identifier    "minpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI units",
   :vamp/value_names   :rdf/nil})

(def qm-tonalchange_param_smoothingwidth
  {:db/ident           :qm/qm-tonalchange_param_smoothingwidth,
   :dc11/format        "frames",
   :dc11/title         "Gaussian smoothing",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 5,
   :vamp/identifier    "smoothingwidth",
   :vamp/max_value     20,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "frames",
   :vamp/value_names   :rdf/nil})

(def qm-tonalchange_param_tuning
  {:db/ident           :qm/qm-tonalchange_param_tuning,
   :dc11/format        "Hz",
   :dc11/title         "Chromagram tuning frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "tuning",
   :vamp/max_value     460,
   :vamp/min_value     420,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def qm-transcription
  "Transcribe the input audio to estimated notes"
  {:cc/license "https://www.gnu.org/licenses/old-licenses/gpl-2.0",
   :db/ident :qm/qm-transcription,
   :dc11/description "Transcribe the input audio to estimated notes",
   :dc11/rights
   "Plugin by Dr. Ruohua Zhou.  Copyright (c) 2008-2009 QMUL - All Rights Reserved",
   :dc11/title "Polyphonic Transcription",
   :foaf/maker :qm/maker,
   :foaf/page
   "https://vamp-plugins.org/plugin-doc/qm-vamp-plugins.html#qm-transcription",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/category "Notes",
   :vamp/identifier "qm-transcription",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Polyphonic Transcription",
   :vamp/output :qm/qm-transcription_output_transcription,
   :vamp/vamp_API_version :vamp/api_version_2})

(def qm-transcription_output_transcription
  "Estimated note pitch (MIDI note number from 0 to 127)"
  {:db/ident :qm/qm-transcription_output_transcription,
   :dc11/description "Estimated note pitch (MIDI note number from 0 to 127)",
   :dc11/title "Transcription",
   :rdf/type
   [:vamp/SparseOutput :vamp/QuantizedOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count 1,
   :vamp/computes_event_type :af/Note,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "transcription",
   :vamp/max_value 127,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "MIDI units"})