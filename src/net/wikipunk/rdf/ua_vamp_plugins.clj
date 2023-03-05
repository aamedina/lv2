(ns net.wikipunk.rdf.ua-vamp-plugins
  "http://vamp-plugins.org/rdf/plugins/ua-vamp-plugins"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/ua-vamp-plugins",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/ua-vamp-plugins#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ua-vamp-plugins"
                       "http://vamp-plugins.org/rdf/plugins/ua-vamp-plugins#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "ua-vamp-plugins",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/ua-vamp-plugins"})

(def library
  "The UAPlugins set is a library of Vamp plugins developed in the DRIMS project to perform onset detection and polyphonic transcription. The methods used in this library were developed by Antonio Pertusa and José Manuel Iñesta."
  {:db/ident :ua-vamp-plugins/library,
   :dc11/description
   "The UAPlugins set is a library of Vamp plugins developed in the DRIMS project to perform onset detection and polyphonic transcription. The methods used in this library were developed by Antonio Pertusa and José Manuel Iñesta.",
   :dc11/title "University of Alicante Vamp Plugins",
   :doap/download-page
   "http://grfia.dlsi.ua.es/cm/projects/drims/softwareVAMP.php",
   :foaf/maker :ua-vamp-plugins/library_maker,
   :foaf/page "http://grfia.dlsi.ua.es/cm/projects/drims/softwareVAMP.php",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:ua-vamp-plugins/mf0ua :ua-vamp-plugins/onsetsua],
   :vamp/has_binary ["linux64" "win32" "osx" "linux32"],
   :vamp/has_source true,
   :vamp/identifier "ua-vamp-plugins"})

(def library_maker
  {:db/ident  :ua-vamp-plugins/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/ua.png",
   :foaf/name "University of Alicante",
   :foaf/page "http://grfia.dlsi.ua.es/cm/"})

(def mf0ua
  "Multiple fundamental frequency estimation for polyphonic music transcription"
  {:db/ident :ua-vamp-plugins/mf0ua,
   :dc11/description
   "Multiple fundamental frequency estimation for polyphonic music transcription",
   :dc11/rights
   "Copyright 2012 Antonio Pertusa, Universidad de Alicante. Freely redistributable under GPL License",
   :dc11/title "Polyphonic Transcription",
   :foaf/maker :ua-vamp-plugins/library_maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "mf0ua",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Polyphonic Transcription",
   :vamp/output :ua-vamp-plugins/mf0ua_output_mf0ua,
   :vamp/parameter [:ua-vamp-plugins/mf0ua_param_minnoteduration
                    :ua-vamp-plugins/mf0ua_param_maxpolyphony
                    :ua-vamp-plugins/mf0ua_param_highestnote
                    :ua-vamp-plugins/mf0ua_param_algorithm
                    :ua-vamp-plugins/mf0ua_param_lowestnote],
   :vamp/vamp_API_version :vamp/api_version_2})

(def mf0ua_output_mf0ua
  "Estimated note pitch (MIDI note number)"
  {:db/ident             :ua-vamp-plugins/mf0ua_output_mf0ua,
   :dc11/description     "Estimated note pitch (MIDI note number)",
   :dc11/title           "UA Multiple f0 Estimation",
   :rdf/type             [:vamp/KnownExtentsOutput
                          :vamp/SparseOutput
                          :vamp/QuantizedOutput],
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mf0ua",
   :vamp/max_value       127,
   :vamp/min_value       0,
   :vamp/quantize_step   1,
   :vamp/sample_rate     0.00129909M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "MIDI units"})

(def mf0ua_param_algorithm
  {:db/ident           :ua-vamp-plugins/mf0ua_param_algorithm,
   :dc11/format        "",
   :dc11/title         "Algorithm",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "algorithm",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["EURASIP12" "EURASIP12 + tracking" "Onset-based"]})

(def mf0ua_param_highestnote
  {:db/ident           :ua-vamp-plugins/mf0ua_param_highestnote,
   :dc11/format        "Hz",
   :dc11/title         "Maximum fundamental frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 2100,
   :vamp/identifier    "highestnote",
   :vamp/max_value     2500,
   :vamp/min_value     1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mf0ua_param_lowestnote
  {:db/ident           :ua-vamp-plugins/mf0ua_param_lowestnote,
   :dc11/format        "Hz",
   :dc11/title         "Minimum fundamental frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 38,
   :vamp/identifier    "lowestnote",
   :vamp/max_value     2500,
   :vamp/min_value     1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mf0ua_param_maxpolyphony
  {:db/ident           :ua-vamp-plugins/mf0ua_param_maxpolyphony,
   :dc11/format        "",
   :dc11/title         "Maximum polyphony",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 6,
   :vamp/identifier    "maxpolyphony",
   :vamp/max_value     10,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mf0ua_param_minnoteduration
  {:db/ident           :ua-vamp-plugins/mf0ua_param_minnoteduration,
   :dc11/format        "s",
   :dc11/title         "Minimum note duration",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.023M,
   :vamp/identifier    "minnoteduration",
   :vamp/max_value     0.5M,
   :vamp/min_value     0,
   :vamp/unit          "s",
   :vamp/value_names   :rdf/nil})

(def onsetsua
  "Note onset detection using a one-semitone filterbank"
  {:db/ident :ua-vamp-plugins/onsetsua,
   :dc11/description "Note onset detection using a one-semitone filterbank",
   :dc11/rights
   "Copyright 2012 Antonio Pertusa, Universidad de Alicante. Freely redistributable under GPL License",
   :dc11/title "Note Onset Detector",
   :foaf/maker :ua-vamp-plugins/library_maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "onsetsua",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Note Onset Detector",
   :vamp/output [:ua-vamp-plugins/onsetsua_output_onsets
                 :ua-vamp-plugins/onsetsua_output_odf],
   :vamp/parameter :ua-vamp-plugins/onsetsua_param_sensitivity,
   :vamp/vamp_API_version :vamp/api_version_2})

(def onsetsua_output_odf
  ""
  {:db/ident             :ua-vamp-plugins/onsetsua_output_odf,
   :dc11/description     "",
   :dc11/title           "Onset Detection Function",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "odf",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def onsetsua_output_onsets
  ""
  {:db/ident             :ua-vamp-plugins/onsetsua_output_onsets,
   :dc11/description     "",
   :dc11/title           "Note Onsets",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onsets",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def onsetsua_param_sensitivity
  {:db/ident           :ua-vamp-plugins/onsetsua_param_sensitivity,
   :dc11/format        "",
   :dc11/title         "Sensitivity",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.18M,
   :vamp/identifier    "sensitivity",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})