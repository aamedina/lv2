(ns net.wikipunk.rdf.vamp-example-plugins
  "http://vamp-plugins.org/rdf/plugins/vamp-example-plugins"
  {:foaf/maker "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic
   "http://vamp-plugins.org/rdf/plugins/vamp-example-plugins",
   :rdf/ns-prefix-map
   {"af"       "http://purl.org/ontology/af/",
    "cc"       "http://web.resource.org/cc/",
    "dc11"     "http://purl.org/dc/elements/1.1/",
    "doap"     "http://usefulinc.com/ns/doap#",
    "foaf"     "http://xmlns.com/foaf/0.1/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "plugbase" "http://vamp-plugins.org/rdf/plugins/vamp-example-plugins#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "vamp"     "http://purl.org/ontology/vamp/",
    "vamp-example-plugins"
    "http://vamp-plugins.org/rdf/plugins/vamp-example-plugins#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :vamp/PluginDescription,
   :rdfa/prefix "vamp-example-plugins",
   :rdfa/uri "http://vamp-plugins.org/rdf/plugins/vamp-example-plugins"})

(def amplitudefollower
  "Track the amplitude of the audio signal"
  {:cc/license "http://creativecommons.org/licenses/BSD/",
   :db/ident :vamp-example-plugins/amplitudefollower,
   :dc11/description "Track the amplitude of the audio signal",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Amplitude Follower",
   :foaf/maker :vamp-example-plugins/maker,
   :foaf/page
   "http://www.vamp-plugins.org/plugin-doc/vamp-example-plugins.html#amplitudefollower",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "amplitudefollower",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Amplitude Follower",
   :vamp/output :vamp-example-plugins/amplitudefollower_output_amplitude,
   :vamp/parameter [:vamp-example-plugins/amplitudefollower_param_release
                    :vamp-example-plugins/amplitudefollower_param_attack],
   :vamp/vamp_API_version :vamp/api_version_2})

(def amplitudefollower_output_amplitude
  ""
  {:db/ident :vamp-example-plugins/amplitudefollower_output_amplitude,
   :dc11/description "",
   :dc11/title "Amplitude",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_signal_type :af/Signal,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "amplitude",
   :vamp/unit "V"})

(def amplitudefollower_param_attack
  {:db/ident           :vamp-example-plugins/amplitudefollower_param_attack,
   :dc11/format        "s",
   :dc11/title         "Attack time",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.01M,
   :vamp/identifier    "attack",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "s",
   :vamp/value_names   :rdf/nil})

(def amplitudefollower_param_release
  {:db/ident           :vamp-example-plugins/amplitudefollower_param_release,
   :dc11/format        "s",
   :dc11/title         "Release time",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.01M,
   :vamp/identifier    "release",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "s",
   :vamp/value_names   :rdf/nil})

(def fixedtempo
  "Study a short section of audio and estimate its tempo, assuming the tempo is constant"
  {:cc/license "http://creativecommons.org/licenses/BSD/",
   :db/ident :vamp-example-plugins/fixedtempo,
   :dc11/description
   "Study a short section of audio and estimate its tempo, assuming the tempo is constant",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Simple Fixed Tempo Estimator",
   :foaf/maker :vamp-example-plugins/maker,
   :foaf/page
   "http://www.vamp-plugins.org/plugin-doc/vamp-example-plugins.html#fixedtempo",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "fixedtempo",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Simple Fixed Tempo Estimator",
   :vamp/output [:vamp-example-plugins/fixedtempo_output_detectionfunction
                 :vamp-example-plugins/fixedtempo_output_acf
                 :vamp-example-plugins/fixedtempo_output_candidates
                 :vamp-example-plugins/fixedtempo_output_filtered_acf
                 :vamp-example-plugins/fixedtempo_output_tempo],
   :vamp/vamp_API_version :vamp/api_version_2})

(def fixedtempo_output_acf
  "Autocorrelation of onset detection function"
  {:db/ident             :vamp-example-plugins/fixedtempo_output_acf,
   :dc11/description     "Autocorrelation of onset detection function",
   :dc11/title           "Autocorrelation Function",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/computes_signal_type :af/Signal,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "acf",
   :vamp/unit            "r"})

(def fixedtempo_output_candidates
  "Possible tempo estimates, one per bin with the most likely in the first bin"
  {:db/ident :vamp-example-plugins/fixedtempo_output_candidates,
   :dc11/description
   "Possible tempo estimates, one per bin with the most likely in the first bin",
   :dc11/title "Tempo candidates",
   :rdf/type :vamp/SparseOutput,
   :vamp/computes_event_type :af/Tempo,
   :vamp/fixed_bin_count "false",
   :vamp/identifier "candidates",
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "bpm"})

(def fixedtempo_output_detectionfunction
  "Onset detection function"
  {:db/ident :vamp-example-plugins/fixedtempo_output_detectionfunction,
   :dc11/description "Onset detection function",
   :dc11/title "Detection Function",
   :rdf/type [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_signal_type :af/OnsetDetectionFunction,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "detectionfunction",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/unit ""})

(def fixedtempo_output_filtered_acf
  "Filtered autocorrelation of onset detection function"
  {:db/ident             :vamp-example-plugins/fixedtempo_output_filtered_acf,
   :dc11/description     "Filtered autocorrelation of onset detection function",
   :dc11/title           "Filtered Autocorrelation",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/computes_signal_type :af/Signal,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "filtered_acf",
   :vamp/unit            "r"})

(def fixedtempo_output_tempo
  "Estimated tempo"
  {:db/ident             :vamp-example-plugins/fixedtempo_output_tempo,
   :dc11/description     "Estimated tempo",
   :dc11/title           "Tempo",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       [""],
   :vamp/computes_event_type :af/Tempo,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tempo",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "bpm"})

(def library
  "A set of simple plugins as included with the Vamp developers kit. Amplitude tracker, simple percussion onset detector, tempo estimator, spectral centroid, power spectrum, and zero-crossing counter. Example plugins from the Vamp Plugin SDK"
  {:db/ident :vamp-example-plugins/library,
   :dc11/description
   ["A set of simple plugins as included with the Vamp developers kit. Amplitude tracker, simple percussion onset detector, tempo estimator, spectral centroid, power spectrum, and zero-crossing counter."
    "Example plugins from the Vamp Plugin SDK"],
   :dc11/title ["Vamp Example Plugins" "Vamp example plugins"],
   :doap/download-page "http://vamp-plugins.org/develop.html",
   :foaf/maker :vamp-example-plugins/maker,
   :foaf/page
   "http://www.vamp-plugins.org/plugin-doc/vamp-example-plugins.html",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:vamp-example-plugins/amplitudefollower
                           :vamp-example-plugins/zerocrossing
                           :vamp-example-plugins/powerspectrum
                           :vamp-example-plugins/percussiononsets
                           :vamp-example-plugins/fixedtempo
                           :vamp-example-plugins/spectralcentroid],
   :vamp/has_binary ["osx" "linux64" "win32" "linux32"],
   :vamp/has_source true,
   :vamp/identifier "vamp-example-plugins"})

(def maker
  {:db/ident  :vamp-example-plugins/maker,
   :foaf/name "Vamp SDK Example Plugins",
   :foaf/page "http://vamp-plugins.org/"})

(def percussiononsets
  "Detect percussive note onsets by identifying broadband energy rises"
  {:cc/license "http://creativecommons.org/licenses/BSD/",
   :db/ident :vamp-example-plugins/percussiononsets,
   :dc11/description
   "Detect percussive note onsets by identifying broadband energy rises",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Simple Percussion Onset Detector",
   :foaf/maker :vamp-example-plugins/maker,
   :foaf/page
   "http://www.vamp-plugins.org/plugin-doc/vamp-example-plugins.html#percussiononsets",
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "percussiononsets",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Simple Percussion Onset Detector",
   :vamp/output [:vamp-example-plugins/percussiononsets_output_detectionfunction
                 :vamp-example-plugins/percussiononsets_output_onsets],
   :vamp/parameter [:vamp-example-plugins/percussiononsets_param_sensitivity
                    :vamp-example-plugins/percussiononsets_param_threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def percussiononsets_output_detectionfunction
  "Broadband energy rise detection function"
  {:db/ident :vamp-example-plugins/percussiononsets_output_detectionfunction,
   :dc11/description "Broadband energy rise detection function",
   :dc11/title "Detection Function",
   :rdf/type [:vamp/DenseOutput :vamp/QuantizedOutput],
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_signal_type :af/OnsetDetectionFunction,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "detectionfunction",
   :vamp/quantize_step 1,
   :vamp/unit ""})

(def percussiononsets_output_onsets
  "Percussive note onset locations"
  {:db/ident             :vamp-example-plugins/percussiononsets_output_onsets,
   :dc11/description     "Percussive note onset locations",
   :dc11/title           "Onsets",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/computes_event_type :af/Onset,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onsets",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def percussiononsets_param_sensitivity
  {:db/ident           :vamp-example-plugins/percussiononsets_param_sensitivity,
   :dc11/format        "%",
   :dc11/title         "Sensitivity",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 40,
   :vamp/identifier    "sensitivity",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def percussiononsets_param_threshold
  {:db/ident           :vamp-example-plugins/percussiononsets_param_threshold,
   :dc11/format        "dB",
   :dc11/title         "Energy rise threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 3,
   :vamp/identifier    "threshold",
   :vamp/max_value     20,
   :vamp/min_value     0,
   :vamp/unit          "dB",
   :vamp/value_names   :rdf/nil})

(def powerspectrum
  "Return the power spectrum of a signal"
  {:cc/license "http://creativecommons.org/licenses/BSD/",
   :db/ident :vamp-example-plugins/powerspectrum,
   :dc11/description "Return the power spectrum of a signal",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Simple Power Spectrum",
   :foaf/maker :vamp-example-plugins/maker,
   :foaf/page
   "http://www.vamp-plugins.org/plugin-doc/vamp-example-plugins.html#powerspectrum",
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "powerspectrum",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Simple Power Spectrum",
   :vamp/output :vamp-example-plugins/powerspectrum_output_powerspectrum,
   :vamp/vamp_API_version :vamp/api_version_2})

(def powerspectrum_output_powerspectrum
  "Power values of the frequency spectrum bins calculated from the input signal"
  {:db/ident :vamp-example-plugins/powerspectrum_output_powerspectrum,
   :dc11/description
   "Power values of the frequency spectrum bins calculated from the input signal",
   :dc11/title "Power Spectrum",
   :rdf/type :vamp/DenseOutput,
   :vamp/computes_signal_type :af/Signal,
   :vamp/identifier "powerspectrum"})

(def spectralcentroid
  "Calculate the centroid frequency of the spectrum of the input signal"
  {:cc/license "http://creativecommons.org/licenses/BSD/",
   :db/ident :vamp-example-plugins/spectralcentroid,
   :dc11/description
   "Calculate the centroid frequency of the spectrum of the input signal",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Spectral Centroid",
   :foaf/maker :vamp-example-plugins/maker,
   :foaf/page
   "http://www.vamp-plugins.org/plugin-doc/vamp-example-plugins.html#spectralcentroid",
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralcentroid",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Centroid",
   :vamp/output [:vamp-example-plugins/spectralcentroid_output_logcentroid
                 :vamp-example-plugins/spectralcentroid_output_linearcentroid],
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralcentroid_output_linearcentroid
  "Centroid of the linear frequency spectrum"
  {:db/ident :vamp-example-plugins/spectralcentroid_output_linearcentroid,
   :dc11/description "Centroid of the linear frequency spectrum",
   :dc11/title "Linear Frequency Centroid",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_signal_type :af/LinearFrequencyCentroid,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "linearcentroid",
   :vamp/unit "Hz"})

(def spectralcentroid_output_logcentroid
  "Centroid of the log weighted frequency spectrum"
  {:db/ident :vamp-example-plugins/spectralcentroid_output_logcentroid,
   :dc11/description "Centroid of the log weighted frequency spectrum",
   :dc11/title "Log Frequency Centroid",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_signal_type :af/LogFrequencyCentroid,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "logcentroid",
   :vamp/unit "Hz"})

(def zerocrossing
  "Detect and count zero crossing points"
  {:cc/license "http://creativecommons.org/licenses/BSD/",
   :db/ident :vamp-example-plugins/zerocrossing,
   :dc11/description "Detect and count zero crossing points",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Zero Crossings",
   :foaf/maker :vamp-example-plugins/maker,
   :foaf/page
   "http://www.vamp-plugins.org/plugin-doc/vamp-example-plugins.html#zerocrossing",
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "zerocrossing",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Zero Crossings",
   :vamp/output [:vamp-example-plugins/zerocrossing_output_zerocrossings
                 :vamp-example-plugins/zerocrossing_output_counts],
   :vamp/vamp_API_version :vamp/api_version_2})

(def zerocrossing_output_counts
  "The number of zero crossing points per processing block"
  {:db/ident :vamp-example-plugins/zerocrossing_output_counts,
   :dc11/description "The number of zero crossing points per processing block",
   :dc11/title "Zero Crossing Counts",
   :rdf/type [:vamp/DenseOutput :vamp/QuantizedOutput],
   :vamp/bin_count 1,
   :vamp/bin_names [""],
   :vamp/computes_signal_type :af/ZeroCrossingCount,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "counts",
   :vamp/quantize_step 1,
   :vamp/unit "crossings"})

(def zerocrossing_output_zerocrossings
  "The locations of zero crossing points"
  {:db/ident :vamp-example-plugins/zerocrossing_output_zerocrossings,
   :dc11/description "The locations of zero crossing points",
   :dc11/title "Zero Crossings",
   :rdf/type [:vamp/SparseOutput :vamp/QuantizedOutput],
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/computes_event_type :af/ZeroCrossing,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "zerocrossings",
   :vamp/quantize_step 1,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})