(ns net.wikipunk.rdf.mvamp-ibt
  "http://vamp-plugins.org/rdf/plugins/mvamp-ibt"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/mvamp-ibt",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "mvamp-ibt"
                       "http://vamp-plugins.org/rdf/plugins/mvamp-ibt#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "mvamp-ibt",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/mvamp-ibt"})

(def maker
  {:db/ident  :mvamp-ibt/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/smc.png",
   :foaf/name "SMC Group at INESC Porto",
   :foaf/page "http://smc.inescporto.pt"})

(def mvamp
  "Plugin from João Oliveira of the SMC Group for tempo induction and beat tracking, built on the MARSYAS framework"
  {:db/ident :mvamp-ibt/mvamp,
   :dc11/description
   "Plugin from João Oliveira of the SMC Group for tempo induction and beat tracking, built on the MARSYAS framework",
   :dc11/title "INESC Porto Beat Tracker",
   :doap/download-page "http://smc.inescporto.pt/technologies/ibt/",
   :foaf/page "http://smc.inescporto.pt/technologies/ibt/",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :mvamp/marsyas_ibt,
   :vamp/has_binary ["linux32" "win32" "osx" "linux64"],
   :vamp/has_source true,
   :vamp/identifier "mvamp-ibt"})

(def ^{:private true} marsyas_ibt
  "Estimates beat locations and tempo (off-line [default] and on-line modes of operation)"
  {:db/ident :mvamp/marsyas_ibt,
   :dc11/description
   "Estimates beat locations and tempo (off-line [default] and on-line modes of operation)",
   :dc11/rights "GPL v3 license",
   :dc11/title "IBT - INESC Beat Tracker",
   :foaf/maker :mvamp-ibt/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/category "Time > Tempo",
   :vamp/identifier "marsyas_ibt",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "IBT - INESC Beat Tracker",
   :vamp/output :mvamp/marsyas_ibt_output_beats,
   :vamp/parameter [:mvamp/marsyas_ibt_param_maxbpm
                    :mvamp/marsyas_ibt_param_minbpm
                    :mvamp/marsyas_ibt_param_indtime
                    :mvamp/marsyas_ibt_param_induction
                    :mvamp/marsyas_ibt_param_metrical_changes
                    :mvamp/marsyas_ibt_param_online],
   :vamp/vamp_API_version :vamp/api_version_1})

(def ^{:private true} marsyas_ibt_output_beats
  "Estimated/predicted beat times"
  {:db/ident             :mvamp/marsyas_ibt_output_beats,
   :dc11/description     "Estimated/predicted beat times",
   :dc11/title           "Beat Times",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/computes_event_type :af/Beat,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "beat_times",
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "s"})

(def ^{:private true} marsyas_ibt_param_indtime
  "Duration of induction steps"
  {:db/ident           :mvamp/marsyas_ibt_param_indtime,
   :dc11/description   "Duration of induction steps",
   :dc11/title         "Duration of Induction Steps",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 5,
   :vamp/identifier    "indtime",
   :vamp/max_value     60,
   :vamp/min_value     1.2M,
   :vamp/quantize_step 0.1M,
   :vamp/unit          "s",
   :vamp/value_names   :rdf/nil})

(def ^{:private true} marsyas_ibt_param_induction
  "Induction mode of operation"
  {:db/ident           :mvamp/marsyas_ibt_param_induction,
   :dc11/description   "Induction mode of operation",
   :dc11/title         "Induction Operation Mode",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "induction",
   :vamp/max_value     3,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Single (only at the beginning)"
                        "Supervised (automatically triggered for recovery)"
                        "Random (every random time-points)"
                        "Repeated (spaced by induction time)"]})

(def ^{:private true} marsyas_ibt_param_maxbpm
  "Maximum allowed tempo (BPM)"
  {:db/ident           :mvamp/marsyas_ibt_param_maxbpm,
   :dc11/description   "Maximum allowed tempo (BPM)",
   :dc11/title         "Maximum Allowed Tempo (BPM)",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 250,
   :vamp/identifier    "maxbpm",
   :vamp/max_value     400,
   :vamp/min_value     51,
   :vamp/quantize_step 1,
   :vamp/unit          "bpm",
   :vamp/value_names   :rdf/nil})

(def ^{:private true} marsyas_ibt_param_metrical_changes
  "Avoid metrical changes by limiting the considered tempo to an octave (for on-line mode)"
  {:db/ident :mvamp/marsyas_ibt_param_metrical_changes,
   :dc11/description
   "Avoid metrical changes by limiting the considered tempo to an octave (for on-line mode)",
   :dc11/title "Avoid Metrical Changes",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier "metrical_changes",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def ^{:private true} marsyas_ibt_param_minbpm
  "Minimum allowed tempo (BPM)"
  {:db/ident           :mvamp/marsyas_ibt_param_minbpm,
   :dc11/description   "Minimum allowed tempo (BPM)",
   :dc11/title         "Minimum Allowed Tempo (BPM)",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 50,
   :vamp/identifier    "minbpm",
   :vamp/max_value     249,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "bpm",
   :vamp/value_names   :rdf/nil})

(def ^{:private true} marsyas_ibt_param_online
  "Activates the on-line operation mode (off-line operation by default)"
  {:db/ident :mvamp/marsyas_ibt_param_online,
   :dc11/description
   "Activates the on-line operation mode (off-line operation by default)",
   :dc11/title "On-line Operation Mode",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier "online",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})