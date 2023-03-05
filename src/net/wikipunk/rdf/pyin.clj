(ns net.wikipunk.rdf.pyin
  "http://vamp-plugins.org/rdf/plugins/pyin"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/pyin",
   :rdf/ns-prefix-map {"af"       "http://purl.org/ontology/af/",
                       "cc"       "http://web.resource.org/cc/",
                       "dc11"     "http://purl.org/dc/elements/1.1/",
                       "doap"     "http://usefulinc.com/ns/doap#",
                       "foaf"     "http://xmlns.com/foaf/0.1/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "plugbase" "http://vamp-plugins.org/rdf/plugins/pyin#",
                       "pyin"     "http://vamp-plugins.org/rdf/plugins/pyin#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp"     "http://purl.org/ontology/vamp/",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "pyin",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/pyin"})

(def library
  "pYIN is a modification of the well-loved YIN algorithm for fundamental frequency (F0) estimation in monophonic audio."
  {:db/ident :pyin/library,
   :dc11/description
   "pYIN is a modification of the well-loved YIN algorithm for fundamental frequency (F0) estimation in monophonic audio.",
   :dc11/title "pYIN",
   :foaf/maker :pyin/maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/pyin",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:pyin/yin :pyin/pyin :pyin/localcandidatepyin],
   :vamp/identifier "pyin"})

(def localcandidatepyin
  "Monophonic pitch and note tracking based on a probabilistic Yin extension."
  {:db/ident :pyin/localcandidatepyin,
   :dc11/description
   "Monophonic pitch and note tracking based on a probabilistic Yin extension.",
   :dc11/rights "GPL",
   :dc11/title "Local Candidate PYIN",
   :foaf/maker :pyin/library_maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "localcandidatepyin",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Local Candidate PYIN",
   :vamp/output :pyin/localcandidatepyin_output_pitchtrackcandidates,
   :vamp/parameter [:pyin/localcandidatepyin_param_outputunvoiced
                    :pyin/localcandidatepyin_param_threshdistr
                    :pyin/localcandidatepyin_param_precisetime],
   :vamp/vamp_API_version :vamp/api_version_2})

(def localcandidatepyin_output_pitchtrackcandidates
  "Multiple candidate pitch tracks."
  {:db/ident             :pyin/localcandidatepyin_output_pitchtrackcandidates,
   :dc11/description     "Multiple candidate pitch tracks.",
   :dc11/title           "Pitch track candidates",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/SparseOutput],
   :vamp/fixed_bin_count "false",
   :vamp/identifier      "pitchtrackcandidates",
   :vamp/max_value       500,
   :vamp/min_value       40,
   :vamp/sample_rate     172.266M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "Hz"})

(def localcandidatepyin_param_outputunvoiced
  {:db/ident           :pyin/localcandidatepyin_param_outputunvoiced,
   :dc11/format        "",
   :dc11/title         "Output estimates classified as unvoiced?",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "outputunvoiced",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["No" "Yes" "Yes, as negative frequencies"]})

(def localcandidatepyin_param_precisetime
  {:db/ident           :pyin/localcandidatepyin_param_precisetime,
   :dc11/format        "",
   :dc11/title         "Use non-standard precise YIN timing (slow).",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "precisetime",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def localcandidatepyin_param_threshdistr
  {:db/ident           :pyin/localcandidatepyin_param_threshdistr,
   :dc11/format        "",
   :dc11/title         "Yin threshold distribution",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2,
   :vamp/identifier    "threshdistr",
   :vamp/max_value     7,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Uniform"
                        "Beta (mean 0.10)"
                        "Beta (mean 0.15)"
                        "Beta (mean 0.20)"
                        "Beta (mean 0.30)"
                        "Single Value 0.10"
                        "Single Value 0.15"
                        "Single Value 0.20"]})

(def maker
  {:db/ident  :pyin/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Matthias Mauch",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def pyin
  "Monophonic pitch and note tracking based on a probabilistic Yin extension."
  {:db/ident :pyin/pyin,
   :dc11/description
   "Monophonic pitch and note tracking based on a probabilistic Yin extension.",
   :dc11/rights "GPL",
   :dc11/title "pYin",
   :foaf/maker :pyin/maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "pyin",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "pYin",
   :vamp/output [:pyin/pyin_output_smoothedpitchtrack
                 :pyin/pyin_output_voicedprob
                 :pyin/pyin_output_notes
                 :pyin/pyin_output_candidatesalience
                 :pyin/pyin_output_f0probs
                 :pyin/pyin_output_f0candidates],
   :vamp/parameter [:pyin/pyin_param_outputunvoiced
                    :pyin/pyin_param_lowampsuppression
                    :pyin/pyin_param_threshdistr
                    :pyin/pyin_param_onsetsensitivity
                    :pyin/pyin_param_precisetime
                    :pyin/pyin_param_prunethresh],
   :vamp/vamp_API_version :vamp/api_version_2})

(def pyin_output_candidatesalience
  "Candidate Salience"
  {:db/ident             :pyin/pyin_output_candidatesalience,
   :dc11/description     "Candidate Salience",
   :dc11/title           "Candidate Salience",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count       1024,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "candidatesalience",
   :vamp/max_value       1,
   :vamp/min_value       0,
   :vamp/unit            ""})

(def pyin_output_f0candidates
  "Estimated fundamental frequency candidates."
  {:db/ident             :pyin/pyin_output_f0candidates,
   :dc11/description     "Estimated fundamental frequency candidates.",
   :dc11/title           "F0 Candidates",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/SparseOutput],
   :vamp/fixed_bin_count "false",
   :vamp/identifier      "f0candidates",
   :vamp/max_value       500,
   :vamp/min_value       40,
   :vamp/sample_rate     172.266M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "Hz"})

(def pyin_output_f0probs
  "Probabilities of estimated fundamental frequency candidates."
  {:db/ident :pyin/pyin_output_f0probs,
   :dc11/description
   "Probabilities  of estimated fundamental frequency candidates.",
   :dc11/title "Candidate Probabilities",
   :rdf/type [:vamp/KnownExtentsOutput :vamp/SparseOutput],
   :vamp/fixed_bin_count "false",
   :vamp/identifier "f0probs",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/sample_rate 172.266M,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def pyin_output_notes
  "Derived fixed-pitch note frequencies"
  {:db/ident             :pyin/pyin_output_notes,
   :dc11/description     "Derived fixed-pitch note frequencies",
   :dc11/title           "Notes",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/computes_event_type :af/Note,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "notes",
   :vamp/sample_rate     172.266M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "Hz"})

(def pyin_output_smoothedpitchtrack
  "."
  {:db/ident             :pyin/pyin_output_smoothedpitchtrack,
   :dc11/description     ".",
   :dc11/title           "Smoothed Pitch Track",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "smoothedpitchtrack",
   :vamp/unit            "Hz"})

(def pyin_output_voicedprob
  "Probability that the signal is voiced according to Probabilistic Yin."
  {:db/ident :pyin/pyin_output_voicedprob,
   :dc11/description
   "Probability that the signal is voiced according to Probabilistic Yin.",
   :dc11/title "Voiced Probability",
   :rdf/type [:vamp/DenseOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "voicedprob",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/unit ""})

(def pyin_param_lowampsuppression
  {:db/ident           :pyin/pyin_param_lowampsuppression,
   :dc11/format        "",
   :dc11/title         "Suppress low amplitude pitch estimates.",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.1M,
   :vamp/identifier    "lowampsuppression",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def pyin_param_onsetsensitivity
  {:db/ident           :pyin/pyin_param_onsetsensitivity,
   :dc11/format        "",
   :dc11/title         "Onset sensitivity",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.5M,
   :vamp/identifier    "onsetsensitivity",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def pyin_param_outputunvoiced
  {:db/ident           :pyin/pyin_param_outputunvoiced,
   :dc11/format        "",
   :dc11/title         "Output estimates classified as unvoiced?",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "outputunvoiced",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["No" "Yes" "Yes, as negative frequencies"]})

(def pyin_param_precisetime
  {:db/ident           :pyin/pyin_param_precisetime,
   :dc11/format        "",
   :dc11/title         "Use non-standard precise YIN timing (slow).",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "precisetime",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def pyin_param_prunethresh
  {:db/ident           :pyin/pyin_param_prunethresh,
   :dc11/format        "",
   :dc11/title         "Duration pruning threshold.",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.05M,
   :vamp/identifier    "prunethresh",
   :vamp/max_value     0.2M,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def pyin_param_threshdistr
  {:db/ident           :pyin/pyin_param_threshdistr,
   :dc11/format        "",
   :dc11/title         "Yin threshold distribution",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2,
   :vamp/identifier    "threshdistr",
   :vamp/max_value     7,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Uniform"
                        "Beta (mean 0.10)"
                        "Beta (mean 0.15)"
                        "Beta (mean 0.20)"
                        "Beta (mean 0.30)"
                        "Single Value 0.10"
                        "Single Value 0.15"
                        "Single Value 0.20"]})

(def yin
  "A vamp implementation of the Yin algorithm for monophonic frequency estimation."
  {:db/ident :pyin/yin,
   :dc11/description
   "A vamp implementation of the Yin algorithm for monophonic frequency estimation.",
   :dc11/rights "GPL",
   :dc11/title "Yin",
   :foaf/maker :pyin/maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "yin",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Yin",
   :vamp/output [:pyin/yin_output_rms
                 :pyin/yin_output_f0
                 :pyin/yin_output_salience
                 :pyin/yin_output_periodicity],
   :vamp/parameter [:pyin/yin_param_outputunvoiced
                    :pyin/yin_param_yinThreshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def yin_output_f0
  "Estimated fundamental frequency"
  {:db/ident             :pyin/yin_output_f0,
   :dc11/description     "Estimated fundamental frequency",
   :dc11/title           "Estimated f0",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count       1,
   :vamp/computes_event_type :af/Pitch,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "f0",
   :vamp/max_value       500,
   :vamp/min_value       40,
   :vamp/unit            "Hz"})

(def yin_output_periodicity
  "by-product of Yin f0 estimation"
  {:db/ident             :pyin/yin_output_periodicity,
   :dc11/description     "by-product of Yin f0 estimation",
   :dc11/title           "Periodicity",
   :rdf/type             [:vamp/DenseOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "periodicity",
   :vamp/max_value       1,
   :vamp/min_value       0,
   :vamp/unit            ""})

(def yin_output_rms
  "Root mean square of the waveform."
  {:db/ident             :pyin/yin_output_rms,
   :dc11/description     "Root mean square of the waveform.",
   :dc11/title           "Root mean square",
   :rdf/type             [:vamp/DenseOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rms",
   :vamp/max_value       1,
   :vamp/min_value       0,
   :vamp/unit            ""})

(def yin_output_salience
  "Yin Salience"
  {:db/ident             :pyin/yin_output_salience,
   :dc11/description     "Yin Salience",
   :dc11/title           "Salience",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count       1024,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "salience",
   :vamp/max_value       1,
   :vamp/min_value       0,
   :vamp/unit            ""})

(def yin_param_outputunvoiced
  {:db/ident           :pyin/yin_param_outputunvoiced,
   :dc11/format        "",
   :dc11/title         "Output estimates classified as unvoiced?",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2,
   :vamp/identifier    "outputunvoiced",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["No" "Yes" "Yes, as negative frequencies"]})

(def yin_param_yinThreshold
  {:db/ident           :pyin/yin_param_yinThreshold,
   :dc11/format        "",
   :dc11/title         "Yin threshold",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0.15M,
   :vamp/identifier    "yinThreshold",
   :vamp/max_value     1,
   :vamp/min_value     0.025M,
   :vamp/quantize_step 0.025M,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})