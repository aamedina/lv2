(ns net.wikipunk.rdf.tuning-difference
  "http://vamp-plugins.org/rdf/plugins/tuning-difference"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/tuning-difference",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/tuning-difference#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "tuning-difference"
                       "http://vamp-plugins.org/rdf/plugins/tuning-difference#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "tuning-difference",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/tuning-difference"})

(def library
  "Estimate the tuning frequency of a recording, by comparing it to another recording of the same music whose tuning frequency is known"
  {:db/ident :tuning-difference/library,
   :dc11/description
   "Estimate the tuning frequency of a recording, by comparing it to another recording of the same music whose tuning frequency is known",
   :dc11/title "Tuning Difference",
   :doap/download-page
   "http://code.soundsoftware.ac.uk/projects/tuning-difference",
   :foaf/maker :tuning-difference/library_maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/tuning-difference",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :tuning-difference/tuning-difference,
   :vamp/identifier "tuning-difference"})

(def library_maker
  {:db/ident  :tuning-difference/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Chris Cannam",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def tuning-difference
  "Estimate the tuning frequency of a recording, by comparing it to another recording of the same music whose tuning frequency is known"
  {:db/ident :tuning-difference/tuning-difference,
   :dc11/description
   "Estimate the tuning frequency of a recording, by comparing it to another recording of the same music whose tuning frequency is known",
   :dc11/rights "GPL",
   :dc11/title "Tuning Difference",
   :foaf/maker :tuning-difference/library_maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tuning-difference",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Tuning Difference",
   :vamp/output [:tuning-difference/tuning-difference_output_rotfeature
                 :tuning-difference/tuning-difference_output_reffeature
                 :tuning-difference/tuning-difference_output_otherfeature
                 :tuning-difference/tuning-difference_output_cents
                 :tuning-difference/tuning-difference_output_tuningfreq],
   :vamp/parameter [:tuning-difference/tuning-difference_param_finetuning
                    :tuning-difference/tuning-difference_param_maxduration
                    :tuning-difference/tuning-difference_param_maxrange],
   :vamp/vamp_API_version :vamp/api_version_2})

(def tuning-difference_output_cents
  "Difference in averaged frequency profile between channels 1 and 2, in cents. A positive value means channel 2 is higher."
  {:db/ident :tuning-difference/tuning-difference_output_cents,
   :dc11/description
   "Difference in averaged frequency profile between channels 1 and 2, in cents. A positive value means channel 2 is higher.",
   :dc11/title "Tuning Difference",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "cents",
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "cents"})

(def tuning-difference_output_otherfeature
  "Chroma feature from other audio, before rotation."
  {:db/ident :tuning-difference/tuning-difference_output_otherfeature,
   :dc11/description "Chroma feature from other audio, before rotation.",
   :dc11/title "Other Feature",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 60,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "otherfeature",
   :vamp/unit ""})

(def tuning-difference_output_reffeature
  "Chroma feature from reference audio."
  {:db/ident             :tuning-difference/tuning-difference_output_reffeature,
   :dc11/description     "Chroma feature from reference audio.",
   :dc11/title           "Reference Feature",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       60,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "reffeature",
   :vamp/unit            ""})

(def tuning-difference_output_rotfeature
  "Chroma feature from reference audio calculated with the tuning frequency obtained from rotation matching."
  {:db/ident :tuning-difference/tuning-difference_output_rotfeature,
   :dc11/description
   "Chroma feature from reference audio calculated with the tuning frequency obtained from rotation matching.",
   :dc11/title "Other Feature at Rotated Frequency",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 60,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "rotfeature",
   :vamp/unit ""})

(def tuning-difference_output_tuningfreq
  "Tuning frequency of channel 2, if channel 1 is assumed to contain the same music as it at a tuning frequency of A=440Hz."
  {:db/ident :tuning-difference/tuning-difference_output_tuningfreq,
   :dc11/description
   "Tuning frequency of channel 2, if channel 1 is assumed to contain the same music as it at a tuning frequency of A=440Hz.",
   :dc11/title "Relative Tuning Frequency",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tuningfreq",
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "hz"})

(def tuning-difference_param_finetuning
  {:db/ident           :tuning-difference/tuning-difference_param_finetuning,
   :dc11/format        "",
   :dc11/title         "Fine tuning",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "finetuning",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tuning-difference_param_maxduration
  {:db/ident           :tuning-difference/tuning-difference_param_maxduration,
   :dc11/format        "s",
   :dc11/title         "Maximum duration to analyse",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "maxduration",
   :vamp/max_value     3600,
   :vamp/min_value     0,
   :vamp/unit          "s",
   :vamp/value_names   :rdf/nil})

(def tuning-difference_param_maxrange
  {:db/ident           :tuning-difference/tuning-difference_param_maxrange,
   :dc11/format        "semitones",
   :dc11/title         "Maximum range in semitones",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier    "maxrange",
   :vamp/max_value     11,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "semitones",
   :vamp/value_names   :rdf/nil})