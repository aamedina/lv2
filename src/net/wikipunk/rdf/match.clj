(ns net.wikipunk.rdf.match
  "http://vamp-plugins.org/rdf/plugins/match-vamp-plugin"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/match-vamp-plugin",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "match"
                       "http://vamp-plugins.org/rdf/plugins/match-vamp-plugin#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "match",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/match-vamp-plugin"})

(def library
  "Vamp implementation of the MATCH audio alignment algorithm from Simon Dixon. Sonic Visualiser can use this for automatic time alignment among multiple audio files."
  {:db/ident :match/library,
   :dc11/description
   "Vamp implementation of the MATCH audio alignment algorithm from Simon Dixon. Sonic Visualiser can use this for automatic time alignment among multiple audio files.",
   :dc11/title "MATCH Vamp Plugin",
   :foaf/maker :match/library_maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/match-vamp",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :match/match,
   :vamp/identifier "match-vamp-plugin"})

(def library_maker
  {:db/ident  :match/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Simon Dixon and Chris Cannam",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def match
  "Calculate alignment between two performances in separate channel inputs"
  {:db/ident :match/match,
   :dc11/description
   "Calculate alignment between two performances in separate channel inputs",
   :dc11/rights "GPL",
   :dc11/title "Match Performance Aligner",
   :foaf/maker :match/library_maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "match",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Match Performance Aligner",
   :vamp/output [:match/match_output_overall_cost
                 :match/match_output_b_features
                 :match/match_output_path
                 :match/match_output_a_cfeatures
                 :match/match_output_a_b_temporatio
                 :match/match_output_b_cfeatures
                 :match/match_output_a_features
                 :match/match_output_a_b_divergence
                 :match/match_output_a_b
                 :match/match_output_b_a],
   :vamp/parameter [:match/match_param_framenorm
                    :match/match_param_metric
                    :match/match_param_gradientlimit
                    :match/match_param_freq1
                    :match/match_param_serialise
                    :match/match_param_noise
                    :match/match_param_silencethreshold
                    :match/match_param_freq2
                    :match/match_param_smooth
                    :match/match_param_usechroma
                    :match/match_param_usespecdiff
                    :match/match_param_distnorm
                    :match/match_param_diagonalweight
                    :match/match_param_zonewidth],
   :vamp/vamp_API_version :vamp/api_version_2})

(def match_output_a_b
  "Timing in performance B corresponding to moments in performance A"
  {:db/ident :match/match_output_a_b,
   :dc11/description
   "Timing in performance B corresponding to moments in performance A",
   :dc11/title "A-B Timeline",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "a_b",
   :vamp/sample_rate 50,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "sec"})

(def match_output_a_b_divergence
  "Difference between timings in performances A and B"
  {:db/ident             :match/match_output_a_b_divergence,
   :dc11/description     "Difference between timings in performances A and B",
   :dc11/title           "A-B Divergence",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "a_b_divergence",
   :vamp/sample_rate     50,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "sec"})

(def match_output_a_b_temporatio
  "Ratio of tempi between performances A and B"
  {:db/ident             :match/match_output_a_b_temporatio,
   :dc11/description     "Ratio of tempi between performances A and B",
   :dc11/title           "A-B Tempo Ratio",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "a_b_temporatio",
   :vamp/sample_rate     50,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def match_output_a_cfeatures
  "Spectral features extracted from performance A, after normalisation and conditioning"
  {:db/ident :match/match_output_a_cfeatures,
   :dc11/description
   "Spectral features extracted from performance A, after normalisation and conditioning",
   :dc11/title "Conditioned A Features",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 84,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "a_cfeatures",
   :vamp/unit ""})

(def match_output_a_features
  "Spectral features extracted from performance A"
  {:db/ident             :match/match_output_a_features,
   :dc11/description     "Spectral features extracted from performance A",
   :dc11/title           "Raw A Features",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       84,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "a_features",
   :vamp/unit            ""})

(def match_output_b_a
  "Timing in performance A corresponding to moments in performance B"
  {:db/ident :match/match_output_b_a,
   :dc11/description
   "Timing in performance A corresponding to moments in performance B",
   :dc11/title "B-A Timeline",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "b_a",
   :vamp/sample_rate 50,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "sec"})

(def match_output_b_cfeatures
  "Spectral features extracted from performance B, after norrmalisation and conditioning"
  {:db/ident :match/match_output_b_cfeatures,
   :dc11/description
   "Spectral features extracted from performance B, after norrmalisation and conditioning",
   :dc11/title "Conditioned B Features",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 84,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "b_cfeatures",
   :vamp/unit ""})

(def match_output_b_features
  "Spectral features extracted from performance B"
  {:db/ident             :match/match_output_b_features,
   :dc11/description     "Spectral features extracted from performance B",
   :dc11/title           "Raw B Features",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       84,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "b_features",
   :vamp/unit            ""})

(def match_output_overall_cost
  "Normalised overall path cost for the cheapest path"
  {:db/ident             :match/match_output_overall_cost,
   :dc11/description     "Normalised overall path cost for the cheapest path",
   :dc11/title           "Overall Cost",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "overall_cost",
   :vamp/unit            ""})

(def match_output_path
  "Alignment path"
  {:db/ident             :match/match_output_path,
   :dc11/description     "Alignment path",
   :dc11/title           "Path",
   :rdf/type             [:vamp/SparseOutput :vamp/QuantizedOutput],
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "path",
   :vamp/quantize_step   1,
   :vamp/sample_rate     50,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def match_param_diagonalweight
  {:db/ident           :match/match_param_diagonalweight,
   :dc11/format        "",
   :dc11/title         "Diagonal weight",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 2,
   :vamp/identifier    "diagonalweight",
   :vamp/max_value     2,
   :vamp/min_value     1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def match_param_distnorm
  {:db/ident           :match/match_param_distnorm,
   :dc11/format        "",
   :dc11/title         "Distance normalisation",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2,
   :vamp/identifier    "distnorm",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["None" "Sum of frames" "Log sum of frames"]})

(def match_param_framenorm
  {:db/ident           :match/match_param_framenorm,
   :dc11/format        "",
   :dc11/title         "Frame normalisation",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "framenorm",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["None" "Sum to 1" "Long-term average"]})

(def match_param_freq1
  {:db/ident           :match/match_param_freq1,
   :dc11/format        "Hz",
   :dc11/title         "Tuning frequency of first input",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "freq1",
   :vamp/max_value     880,
   :vamp/min_value     220,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def match_param_freq2
  {:db/ident           :match/match_param_freq2,
   :dc11/format        "Hz",
   :dc11/title         "Tuning frequency of second input",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "freq2",
   :vamp/max_value     880,
   :vamp/min_value     220,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def match_param_gradientlimit
  {:db/ident           :match/match_param_gradientlimit,
   :dc11/format        "",
   :dc11/title         "Gradient limit",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "gradientlimit",
   :vamp/max_value     10,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def match_param_metric
  {:db/ident           :match/match_param_metric,
   :dc11/format        "",
   :dc11/title         "Distance metric",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "metric",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Manhattan" "Euclidean" "Cosine"]})

(def match_param_noise
  {:db/ident           :match/match_param_noise,
   :dc11/format        "",
   :dc11/title         "Add noise",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "noise",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def match_param_serialise
  {:db/ident           :match/match_param_serialise,
   :dc11/format        "",
   :dc11/title         "Serialise plugin invocations",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "serialise",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def match_param_silencethreshold
  {:db/ident           :match/match_param_silencethreshold,
   :dc11/format        "",
   :dc11/title         "Silence threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.01M,
   :vamp/identifier    "silencethreshold",
   :vamp/max_value     0.1M,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def match_param_smooth
  {:db/ident           :match/match_param_smooth,
   :dc11/format        "",
   :dc11/title         "Use path smoothing",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "smooth",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def match_param_usechroma
  {:db/ident           :match/match_param_usechroma,
   :dc11/format        "",
   :dc11/title         "Feature type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "usechroma",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Spectral" "Chroma"]})

(def match_param_usespecdiff
  {:db/ident           :match/match_param_usespecdiff,
   :dc11/format        "",
   :dc11/title         "Use feature difference",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "usespecdiff",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def match_param_zonewidth
  {:db/ident           :match/match_param_zonewidth,
   :dc11/format        "s",
   :dc11/title         "Search zone width",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 10,
   :vamp/identifier    "zonewidth",
   :vamp/max_value     60,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "s",
   :vamp/value_names   :rdf/nil})