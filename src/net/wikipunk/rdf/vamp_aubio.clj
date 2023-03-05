(ns net.wikipunk.rdf.vamp-aubio
  "http://vamp-plugins.org/rdf/plugins/vamp-aubio"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/vamp-aubio",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/vamp-aubio#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "vamp-aubio"
                       "http://vamp-plugins.org/rdf/plugins/vamp-aubio#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "vamp-aubio",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/vamp-aubio"})

(def aubiomelenergy
  "Compute energy in each 40 mel-frequency bands"
  {:db/ident              :vamp-aubio/aubiomelenergy,
   :dc11/description      "Compute energy in each 40 mel-frequency bands",
   :dc11/rights           "GPL",
   :dc11/title            "Aubio Mel-Frequency Bands Extractor",
   :foaf/maker            :vamp-aubio/maker,
   :owl/versionInfo       "3",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Low Level Features",
   :vamp/identifier       "aubiomelenergy",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Aubio Mel-Energy Bands Extractor",
   :vamp/output           :vamp-aubio/aubiomelenergy_output_melenergy,
   :vamp/parameter        :vamp-aubio/aubiomelenergy_param_nfilters,
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubiomelenergy_output_melenergy
  "List of measured energy in each Mel-frequency bands"
  {:db/ident             :vamp-aubio/aubiomelenergy_output_melenergy,
   :dc11/description     "List of measured energy in each Mel-frequency bands",
   :dc11/title           "Mel-Frequency Cepstrum Coefficients",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "melenergy",
   :vamp/unit            ""})

(def aubiomelenergy_param_nfilters
  "Size of filterbank used to compute mel bands (fixed to 40 for now)"
  {:db/ident :vamp-aubio/aubiomelenergy_param_nfilters,
   :dc11/description
   "Size of filterbank used to compute mel bands (fixed to 40 for now)",
   :dc11/format "",
   :dc11/title "Number of filters",
   :rdf/type :vamp/Parameter,
   :vamp/default_value 40,
   :vamp/identifier "nfilters",
   :vamp/max_value 40,
   :vamp/min_value 40,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def aubiomfcc
  "Extract Mel-Frequency Cepstrum Coefficients"
  {:db/ident              :vamp-aubio/aubiomfcc,
   :dc11/description      "Extract Mel-Frequency Cepstrum Coefficients",
   :dc11/rights           "GPL",
   :dc11/title            "Aubio Mfcc Extractor",
   :foaf/maker            :vamp-aubio/maker,
   :owl/versionInfo       "3",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Low Level Features",
   :vamp/identifier       "aubiomfcc",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Aubio Mfcc Extractor",
   :vamp/output           :vamp-aubio/aubiomfcc_output_mfcc,
   :vamp/parameter        [:vamp-aubio/aubiomfcc_param_ncoeffs
                           :vamp-aubio/aubiomfcc_param_nfilters],
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubiomfcc_output_mfcc
  "List of detected Mel-Frequency Cepstrum Coefficients"
  {:db/ident             :vamp-aubio/aubiomfcc_output_mfcc,
   :dc11/description     "List of detected Mel-Frequency Cepstrum Coefficients",
   :dc11/title           "Mel-Frequency Cepstrum Coefficients",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mfcc",
   :vamp/unit            ""})

(def aubiomfcc_param_ncoeffs
  "Number of output coefficients to compute"
  {:db/ident           :vamp-aubio/aubiomfcc_param_ncoeffs,
   :dc11/description   "Number of output coefficients to compute",
   :dc11/format        "",
   :dc11/title         "Number of coefficients",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 13,
   :vamp/identifier    "ncoeffs",
   :vamp/max_value     100,
   :vamp/min_value     1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def aubiomfcc_param_nfilters
  "Size of filterbank used to compute MFCCs (fixed to 40 for now)"
  {:db/ident :vamp-aubio/aubiomfcc_param_nfilters,
   :dc11/description
   "Size of filterbank used to compute MFCCs (fixed to 40 for now)",
   :dc11/format "",
   :dc11/title "Number of filters",
   :rdf/type :vamp/Parameter,
   :vamp/default_value 40,
   :vamp/identifier "nfilters",
   :vamp/max_value 40,
   :vamp/min_value 40,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def aubionotes
  "Estimate note onset positions, pitches and durations"
  {:db/ident :vamp-aubio/aubionotes,
   :dc11/description "Estimate note onset positions, pitches and durations",
   :dc11/rights "GPL",
   :dc11/title "Aubio Note Tracker",
   :foaf/maker :vamp-aubio/maker,
   :owl/versionInfo "4",
   :rdf/type :vamp/Plugin,
   :vamp/category "Notes",
   :vamp/identifier "aubionotes",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Aubio Note Tracker",
   :vamp/output :vamp-aubio/aubionotes_output_notes,
   :vamp/parameter [:vamp-aubio/aubionotes_param_pitchtype
                    :vamp-aubio/aubionotes_param_avoidleaps
                    :vamp-aubio/aubionotes_param_wraprange
                    :vamp-aubio/aubionotes_param_minioi
                    :vamp-aubio/aubionotes_param_minpitch
                    :vamp-aubio/aubionotes_param_peakpickthreshold
                    :vamp-aubio/aubionotes_param_maxpitch
                    :vamp-aubio/aubionotes_param_silencethreshold
                    :vamp-aubio/aubionotes_param_onsettype],
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubionotes_output_notes
  "List of notes detected, with their frequency and velocity"
  {:db/ident :vamp-aubio/aubionotes_output_notes,
   :dc11/description
   "List of notes detected, with their frequency and velocity",
   :dc11/title "Notes",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 2,
   :vamp/bin_names ["Frequency" "Velocity"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "notes",
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "Hz"})

(def aubionotes_param_avoidleaps
  "Minimize octave jumps by transposing to the octave of the previously detected note"
  {:db/ident :vamp-aubio/aubionotes_param_avoidleaps,
   :dc11/description
   "Minimize octave jumps by transposing to the octave of the previously detected note",
   :dc11/format "",
   :dc11/title "Avoid Multi-Octave Jumps",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier "avoidleaps",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def aubionotes_param_maxpitch
  "Highest pitch value to look for"
  {:db/ident           :vamp-aubio/aubionotes_param_maxpitch,
   :dc11/description   "Highest pitch value to look for",
   :dc11/format        "MIDI units",
   :dc11/title         "Maximum Pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 95,
   :vamp/identifier    "maxpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI units",
   :vamp/value_names   :rdf/nil})

(def aubionotes_param_minioi
  "Time interval below which two consecutive onsets should be merged"
  {:db/ident :vamp-aubio/aubionotes_param_minioi,
   :dc11/description
   "Time interval below which two consecutive onsets should be merged",
   :dc11/format "ms",
   :dc11/title "Minimum Inter-Onset Interval",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier "minioi",
   :vamp/max_value 40,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "ms",
   :vamp/value_names :rdf/nil})

(def aubionotes_param_minpitch
  "Lowest pitch value to look for"
  {:db/ident           :vamp-aubio/aubionotes_param_minpitch,
   :dc11/description   "Lowest pitch value to look for",
   :dc11/format        "MIDI units",
   :dc11/title         "Minimum Pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 32,
   :vamp/identifier    "minpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI units",
   :vamp/value_names   :rdf/nil})

(def aubionotes_param_onsettype
  "Type of onset detection function to use"
  {:db/ident           :vamp-aubio/aubionotes_param_onsettype,
   :dc11/description   "Type of onset detection function to use",
   :dc11/format        "",
   :dc11/title         "Onset Detection Function Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "onsettype",
   :vamp/max_value     7,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Energy Based"
                        "Spectral Difference"
                        "High-Frequency Content"
                        "Complex Domain"
                        "Phase Deviation"
                        "Kullback-Liebler"
                        "Modified Kullback-Liebler"
                        "Spectral Flux"]})

(def aubionotes_param_peakpickthreshold
  "Peak picking threshold, the higher the least detection"
  {:db/ident           :vamp-aubio/aubionotes_param_peakpickthreshold,
   :dc11/description   "Peak picking threshold, the higher the least detection",
   :dc11/format        "",
   :dc11/title         "Peak Picker Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.3M,
   :vamp/identifier    "peakpickthreshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def aubionotes_param_pitchtype
  "Type of pitch detection function to use"
  {:db/ident           :vamp-aubio/aubionotes_param_pitchtype,
   :dc11/description   "Type of pitch detection function to use",
   :dc11/format        "",
   :dc11/title         "Pitch Detection Function Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier    "pitchtype",
   :vamp/max_value     4,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["YIN Frequency Estimator"
                        "Spectral Comb"
                        "Schmitt"
                        "Fast Harmonic Comb"
                        "YIN with FFT"]})

(def aubionotes_param_silencethreshold
  "Silence threshold, the higher the least detection"
  {:db/ident           :vamp-aubio/aubionotes_param_silencethreshold,
   :dc11/description   "Silence threshold, the higher the least detection",
   :dc11/format        "dB",
   :dc11/title         "Silence Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value -70,
   :vamp/identifier    "silencethreshold",
   :vamp/max_value     0,
   :vamp/min_value     -120,
   :vamp/unit          "dB",
   :vamp/value_names   :rdf/nil})

(def aubionotes_param_wraprange
  "Notes detected outside the range will be transposed to higher or lower octaves"
  {:db/ident :vamp-aubio/aubionotes_param_wraprange,
   :dc11/description
   "Notes detected outside the range will be transposed to higher or lower octaves",
   :dc11/format "",
   :dc11/title "Fold Higher or Lower Notes into Range",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier "wraprange",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def aubioonset
  "Estimate note onset times"
  {:db/ident              :vamp-aubio/aubioonset,
   :dc11/description      "Estimate note onset times",
   :dc11/rights           "GPL",
   :dc11/title            "Aubio Onset Detector",
   :foaf/maker            :vamp-aubio/maker,
   :owl/versionInfo       "2",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Time > Onsets",
   :vamp/identifier       "aubioonset",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Aubio Onset Detector",
   :vamp/output           [:vamp-aubio/aubioonset_output_odf
                           :vamp-aubio/aubioonset_output_todf
                           :vamp-aubio/aubioonset_output_onsets],
   :vamp/parameter        [:vamp-aubio/aubioonset_param_onsettype
                           :vamp-aubio/aubioonset_param_peakpickthreshold
                           :vamp-aubio/aubioonset_param_minioi
                           :vamp-aubio/aubioonset_param_silencethreshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubioonset_output_odf
  "Output of the onset detection function"
  {:db/ident             :vamp-aubio/aubioonset_output_odf,
   :dc11/description     "Output of the onset detection function",
   :dc11/title           "Onsets",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/computes_signal_type :af/Signal,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onsets",
   :vamp/unit            ""})

(def aubioonset_output_onsets
  "List of times at which a note onset was detected"
  {:db/ident             :vamp-aubio/aubioonset_output_onsets,
   :dc11/description     "List of times at which a note onset was detected",
   :dc11/title           "Onsets",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onsets",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def aubioonset_output_todf
  "Output of the thresholded onset detection function"
  {:db/ident             :vamp-aubio/aubioonset_output_todf,
   :dc11/description     "Output of the thresholded onset detection function",
   :dc11/title           "Onsets",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onsets",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def aubioonset_param_minioi
  "Time interval below which two consecutive onsets should be merged"
  {:db/ident :vamp-aubio/aubioonset_param_minioi,
   :dc11/description
   "Time interval below which two consecutive onsets should be merged",
   :dc11/format "ms",
   :dc11/title "Minimum Inter-Onset Interval",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier "minioi",
   :vamp/max_value 40,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "ms",
   :vamp/value_names :rdf/nil})

(def aubioonset_param_onsettype
  "Type of onset detection function to use"
  {:db/ident           :vamp-aubio/aubioonset_param_onsettype,
   :dc11/description   "Type of onset detection function to use",
   :dc11/format        "",
   :dc11/title         "Onset Detection Function Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "onsettype",
   :vamp/max_value     7,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Energy Based"
                        "Spectral Difference"
                        "High-Frequency Content"
                        "Complex Domain"
                        "Phase Deviation"
                        "Kullback-Liebler"
                        "Modified Kullback-Liebler"
                        "Spectral Flux"]})

(def aubioonset_param_peakpickthreshold
  "Threshold used for peak picking, the higher the more detections"
  {:db/ident :vamp-aubio/aubioonset_param_peakpickthreshold,
   :dc11/description
   "Threshold used for peak picking, the higher the more detections",
   :dc11/format "",
   :dc11/title "Peak Picker Threshold",
   :rdf/type :vamp/Parameter,
   :vamp/default_value 0.3M,
   :vamp/identifier "peakpickthreshold",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def aubioonset_param_silencethreshold
  "Silence threshold, the higher the least detection"
  {:db/ident           :vamp-aubio/aubioonset_param_silencethreshold,
   :dc11/description   "Silence threshold, the higher the least detection",
   :dc11/format        "dB",
   :dc11/title         "Silence Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value -70,
   :vamp/identifier    "silencethreshold",
   :vamp/max_value     0,
   :vamp/min_value     -120,
   :vamp/unit          "dB",
   :vamp/value_names   :rdf/nil})

(def aubioonset_param_specdesctype
  "Type of onset detection function to use"
  {:db/ident           :vamp-aubio/aubioonset_param_specdesctype,
   :dc11/description   "Type of onset detection function to use",
   :dc11/format        "",
   :dc11/title         "Spectral Description Function",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "specdesctype",
   :vamp/max_value     7,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Spectral Flux"
                        "Spectral Centroid"
                        "Spectral Spread"
                        "Spectral Skewness"
                        "Spectral Kurtosis"
                        "Spectral Slope"
                        "Spectral Decrease"
                        "Spectral Rolloff"]})

(def aubiopitch
  "Track estimated note pitches"
  {:db/ident              :vamp-aubio/aubiopitch,
   :dc11/description      "Track estimated note pitches",
   :dc11/rights           "GPL",
   :dc11/title            "Aubio Pitch Detector",
   :foaf/maker            :vamp-aubio/maker,
   :owl/versionInfo       "3",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Pitch",
   :vamp/identifier       "aubiopitch",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Aubio Pitch Detector",
   :vamp/output           :vamp-aubio/aubiopitch_output_frequency,
   :vamp/parameter        [:vamp-aubio/aubiopitch_param_wraprange
                           :vamp-aubio/aubiopitch_param_maxfreq
                           :vamp-aubio/aubiopitch_param_silencethreshold
                           :vamp-aubio/aubiopitch_param_minfreq
                           :vamp-aubio/aubiopitch_param_pitchtype],
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubiopitch_output_frequency
  "List of detected frequencies"
  {:db/ident             :vamp-aubio/aubiopitch_output_frequency,
   :dc11/description     "List of detected frequencies",
   :dc11/title           "Fundamental Frequency",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "frequency",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "Hz"})

(def aubiopitch_param_maxfreq
  "Highest frequency to look for"
  {:db/ident           :vamp-aubio/aubiopitch_param_maxfreq,
   :dc11/description   "Highest frequency to look for",
   :dc11/format        "Hz",
   :dc11/title         "Maximum Fundamental Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1975.53M,
   :vamp/identifier    "maxfreq",
   :vamp/max_value     24000,
   :vamp/min_value     1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def aubiopitch_param_minfreq
  "Lowest frequency to look for"
  {:db/ident           :vamp-aubio/aubiopitch_param_minfreq,
   :dc11/description   "Lowest frequency to look for",
   :dc11/format        "Hz",
   :dc11/title         "Minimum Fundamental Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 51.9131M,
   :vamp/identifier    "minfreq",
   :vamp/max_value     24000,
   :vamp/min_value     1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def aubiopitch_param_pitchtype
  "Type of pitch detection function to use"
  {:db/ident           :vamp-aubio/aubiopitch_param_pitchtype,
   :dc11/description   "Type of pitch detection function to use",
   :dc11/format        "",
   :dc11/title         "Pitch Detection Function Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier    "pitchtype",
   :vamp/max_value     4,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["YIN Frequency Estimator"
                        "Spectral Comb"
                        "Schmitt"
                        "Fast Harmonic Comb"
                        "YIN with FFT"]})

(def aubiopitch_param_silencethreshold
  "Silence threshold, the higher the least detection"
  {:db/ident           :vamp-aubio/aubiopitch_param_silencethreshold,
   :dc11/description   "Silence threshold, the higher the least detection",
   :dc11/format        "dB",
   :dc11/title         "Silence Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value -90,
   :vamp/identifier    "silencethreshold",
   :vamp/max_value     0,
   :vamp/min_value     -120,
   :vamp/unit          "dB",
   :vamp/value_names   :rdf/nil})

(def aubiopitch_param_wraprange
  "Frequencies detected outside the range will be transposed to higher or lower octaves"
  {:db/ident :vamp-aubio/aubiopitch_param_wraprange,
   :dc11/description
   "Frequencies detected outside the range will be transposed to higher or lower octaves",
   :dc11/format "",
   :dc11/title "Fold Higher or Lower Frequencies into Range",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier "wraprange",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def aubiosilence
  "Detect levels below a certain threshold"
  {:db/ident              :vamp-aubio/aubiosilence,
   :dc11/description      "Detect levels below a certain threshold",
   :dc11/rights           "GPL",
   :dc11/title            "Aubio Silence Detector",
   :foaf/maker            :vamp-aubio/maker,
   :owl/versionInfo       "4",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Low Level Features",
   :vamp/identifier       "aubiosilence",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Aubio Silence Detector",
   :vamp/output           [:vamp-aubio/aubiosilence_output_silencelevel
                           :vamp-aubio/aubiosilence_output_noisy
                           :vamp-aubio/aubiosilence_output_silent],
   :vamp/parameter        :vamp-aubio/aubiosilence_param_silencethreshold,
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubiosilence_output_noisy
  "Return an interval covering each non-silent region"
  {:db/ident             :vamp-aubio/aubiosilence_output_noisy,
   :dc11/description     "Return an interval covering each non-silent region",
   :dc11/title           "Non-Silent Regions",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "noisy",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def aubiosilence_output_silencelevel
  "Return a function that switches from 1 to 0 when silence falls, and back again when it ends"
  {:db/ident :vamp-aubio/aubiosilence_output_silencelevel,
   :dc11/description
   "Return a function that switches from 1 to 0 when silence falls, and back again when it ends",
   :dc11/title "Silence Test",
   :rdf/type
   [:vamp/SparseOutput :vamp/QuantizedOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "silencelevel",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def aubiosilence_output_silent
  "Return an interval covering each silent region"
  {:db/ident             :vamp-aubio/aubiosilence_output_silent,
   :dc11/description     "Return an interval covering each silent region",
   :dc11/title           "Silent Regions",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "silent",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def aubiosilence_param_silencethreshold
  {:db/ident           :vamp-aubio/aubiosilence_param_silencethreshold,
   :dc11/format        "dB",
   :dc11/title         "Silence Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value -80,
   :vamp/identifier    "silencethreshold",
   :vamp/max_value     0,
   :vamp/min_value     -120,
   :vamp/unit          "dB",
   :vamp/value_names   :rdf/nil})

(def aubiospecdesc
  "Compute spectral description function"
  {:db/ident              :vamp-aubio/aubiospecdesc,
   :dc11/description      "Compute spectral description function",
   :dc11/rights           "GPL",
   :dc11/title            "Aubio Spectral Descriptor",
   :foaf/maker            :vamp-aubio/maker,
   :owl/versionInfo       "2",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Low Level Features",
   :vamp/identifier       "aubiospecdesc",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Aubio Spectral Descriptor",
   :vamp/output           :vamp-aubio/aubiospecdesc_output_descriptor,
   :vamp/parameter        :vamp-aubio/aubiospecdesc_param_specdesctype,
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubiospecdesc_output_descriptor
  "Values computed on consecutive spectral frames"
  {:db/ident             :vamp-aubio/aubiospecdesc_output_descriptor,
   :dc11/description     "Values computed on consecutive spectral frames",
   :dc11/title           "Spectral Descriptor Output",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/computes_signal_type :af/Signal,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "specdesc",
   :vamp/unit            ""})

(def aubiotempo
  "Estimate the musical tempo and track beat positions"
  {:db/ident              :vamp-aubio/aubiotempo,
   :dc11/description      "Estimate the musical tempo and track beat positions",
   :dc11/rights           "GPL",
   :dc11/title            "Aubio Beat Tracker",
   :foaf/maker            :vamp-aubio/maker,
   :owl/versionInfo       "2",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Time > Tempo",
   :vamp/identifier       "aubiotempo",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Aubio Beat Tracker",
   :vamp/output           [:vamp-aubio/aubiotempo_output_tempo
                           :vamp-aubio/aubiotempo_output_beats],
   :vamp/parameter        [:vamp-aubio/aubiotempo_param_onsettype
                           :vamp-aubio/aubiotempo_param_silencethreshold
                           :vamp-aubio/aubiotempo_param_peakpickthreshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def aubiotempo_output_beats
  "List of times at which a beat was detected"
  {:db/ident             :vamp-aubio/aubiotempo_output_beats,
   :dc11/description     "List of times at which a beat was detected",
   :dc11/title           "Beats",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "beats",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def aubiotempo_output_tempo
  "Overall estimated tempo"
  {:db/ident             :vamp-aubio/aubiotempo_output_tempo,
   :dc11/description     "Overall estimated tempo",
   :dc11/title           "Tempo",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tempo",
   :vamp/unit            "bpm"})

(def aubiotempo_param_onsettype
  "Type of onset detection function to use"
  {:db/ident           :vamp-aubio/aubiotempo_param_onsettype,
   :dc11/description   "Type of onset detection function to use",
   :dc11/format        "",
   :dc11/title         "Onset Detection Function Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "onsettype",
   :vamp/max_value     7,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Energy Based"
                        "Spectral Difference"
                        "High-Frequency Content"
                        "Complex Domain"
                        "Phase Deviation"
                        "Kullback-Liebler"
                        "Modified Kullback-Liebler"
                        "Spectral Flux"]})

(def aubiotempo_param_peakpickthreshold
  "Peak picking threshold, the higher the least detection"
  {:db/ident           :vamp-aubio/aubiotempo_param_peakpickthreshold,
   :dc11/description   "Peak picking threshold, the higher the least detection",
   :dc11/format        "",
   :dc11/title         "Peak Picker Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.3M,
   :vamp/identifier    "peakpickthreshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def aubiotempo_param_silencethreshold
  "Silence threshold, the higher the least detection"
  {:db/ident           :vamp-aubio/aubiotempo_param_silencethreshold,
   :dc11/description   "Silence threshold, the higher the least detection",
   :dc11/format        "dB",
   :dc11/title         "Silence Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value -70,
   :vamp/identifier    "silencethreshold",
   :vamp/max_value     0,
   :vamp/min_value     -120,
   :vamp/unit          "dB",
   :vamp/value_names   :rdf/nil})

(def library
  "The Vamp Aubio Plugins provide methods from Paul Brossier's aubio annotation library, including beat and tempo tracking, onset detection, pitch detection, note tracking, silence detector, and Mel-frequency cepstral coefficients."
  {:db/ident :vamp-aubio/library,
   :dc11/description
   "The Vamp Aubio Plugins provide methods from Paul Brossier's aubio annotation library, including beat and tempo tracking, onset detection, pitch detection, note tracking, silence detector, and Mel-frequency cepstral coefficients.",
   :dc11/title "Vamp Aubio plugins",
   :doap/download-page "http://aubio.org/vamp-aubio-plugins/download",
   :foaf/maker :vamp-aubio/maker,
   :foaf/page "http://aubio.org/vamp-aubio-plugins/",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:vamp-aubio/aubiosilence
                           :vamp-aubio/aubiomelenergy
                           :vamp-aubio/aubiomfcc
                           :vamp-aubio/aubiotempo
                           :vamp-aubio/aubiospecdesc
                           :vamp-aubio/aubioonset
                           :vamp-aubio/aubiopitch
                           :vamp-aubio/aubionotes],
   :vamp/has_binary ["osx" "linux64" "win32"],
   :vamp/has_source true,
   :vamp/identifier "vamp-aubio"})

(def maker
  {:db/ident  :vamp-aubio/maker,
   :foaf/logo "http://aubio.org/smallrect.png",
   :foaf/name "Paul Brossier",
   :foaf/page "http://aubio.org"})