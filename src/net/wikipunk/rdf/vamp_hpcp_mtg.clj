(ns net.wikipunk.rdf.vamp-hpcp-mtg
  "http://vamp-plugins.org/rdf/plugins/vamp-hpcp-mtg"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/vamp-hpcp-mtg",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/vamp-hpcp-mtg#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "vamp-hpcp-mtg"
                       "http://vamp-plugins.org/rdf/plugins/vamp-hpcp-mtg#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "vamp-hpcp-mtg",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/vamp-hpcp-mtg"})

(def MTG-HPCP
  "Return the instantaneous evolution of HPCP (Harmonic Pitch Class Profile) of a signal."
  {:db/ident :vamp-hpcp-mtg/MTG-HPCP,
   :dc11/description
   "Return the instantaneous evolution of HPCP (Harmonic Pitch Class Profile) of a signal.",
   :dc11/rights
   "Copyright 2012 Music Technology Group, Universitat Pompeu Fabra. All Rights Reserved.\r\nMethod described in\r\n  E. Gomez, Tonal description of music audio signals\r\n  Ph.D. dissertation, MTG\r\n  Universitat Pompeu Fabra, Barcelona, Spain, 2006",
   :dc11/title "HPCP",
   :foaf/maker :vamp-hpcp-mtg/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "MTG-HPCP",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "HPCP",
   :vamp/output :vamp-hpcp-mtg/MTG-HPCP_output_HPCP,
   :vamp/parameter [:vamp-hpcp-mtg/MTG-HPCP_param_two_bands
                    :vamp-hpcp-mtg/MTG-HPCP_param_peakMagThreshold
                    :vamp-hpcp-mtg/MTG-HPCP_param_HF
                    :vamp-hpcp-mtg/MTG-HPCP_param_HarmonicsPerPeak
                    :vamp-hpcp-mtg/MTG-HPCP_param_LF
                    :vamp-hpcp-mtg/MTG-HPCP_param_whitening
                    :vamp-hpcp-mtg/MTG-HPCP_param_reff0
                    :vamp-hpcp-mtg/MTG-HPCP_param_non_linear
                    :vamp-hpcp-mtg/MTG-HPCP_param_nbins],
   :vamp/vamp_API_version :vamp/api_version_2})

(def MTG-HPCP_output_HPCP
  "HPCP values computed from the input signal"
  {:db/ident             :vamp-hpcp-mtg/MTG-HPCP_output_HPCP,
   :dc11/description     "HPCP values computed from the input signal",
   :dc11/title           "HPCP",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       120,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "HPCP",
   :vamp/unit            ""})

(def MTG-HPCP_param_HF
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_HF,
   :dc11/format        "Hz",
   :dc11/title         "Highest frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 5000,
   :vamp/identifier    "HF",
   :vamp/max_value     20000,
   :vamp/min_value     100,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_HarmonicsPerPeak
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_HarmonicsPerPeak,
   :dc11/format        "",
   :dc11/title         "Harmonics per peak",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 8,
   :vamp/identifier    "HarmonicsPerPeak",
   :vamp/max_value     20,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_LF
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_LF,
   :dc11/format        "Hz",
   :dc11/title         "Lowest frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 50,
   :vamp/identifier    "LF",
   :vamp/max_value     20000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_nbins
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_nbins,
   :dc11/format        "bins",
   :dc11/title         "Number of bins",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 120,
   :vamp/identifier    "nbins",
   :vamp/max_value     360,
   :vamp/min_value     12,
   :vamp/quantize_step 1,
   :vamp/unit          "bins",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_non_linear
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_non_linear,
   :dc11/format        "",
   :dc11/title         "Non-linear",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "non_linear",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_peakMagThreshold
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_peakMagThreshold,
   :dc11/format        "dB",
   :dc11/title         "Peak mag threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value -100,
   :vamp/identifier    "peakMagThreshold",
   :vamp/max_value     0,
   :vamp/min_value     -300,
   :vamp/unit          "dB",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_reff0
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_reff0,
   :dc11/format        "Hz",
   :dc11/title         "Reference tuning frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "reff0",
   :vamp/max_value     600,
   :vamp/min_value     300,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_two_bands
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_two_bands,
   :dc11/format        "",
   :dc11/title         "Two frequency bands",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "two_bands",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def MTG-HPCP_param_whitening
  {:db/ident           :vamp-hpcp-mtg/MTG-HPCP_param_whitening,
   :dc11/format        "",
   :dc11/title         "Spectral Whitening",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "whitening",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def library
  "Chroma feature estimation plugin"
  {:db/ident :vamp-hpcp-mtg/library,
   :dc11/description "Chroma feature estimation plugin",
   :dc11/title "HPCP - Harmonic Pitch Class Profile",
   :doap/download-page
   "http://mtg.upf.edu/technologies/hpcp?p=Download%20and%20installation",
   :foaf/maker :vamp-hpcp-mtg/maker,
   :foaf/page "http://mtg.upf.edu/technologies/hpcp",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :vamp-hpcp-mtg/MTG-HPCP,
   :vamp/has_binary ["win32" "osx"],
   :vamp/has_source false,
   :vamp/identifier "vamp-hpcp-mtg"})

(def maker
  {:db/ident  :vamp-hpcp-mtg/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/upf.png",
   :foaf/name "Music Technology Group, Universitat Pompeu Fabra",
   :foaf/page "http://mtg.upf.edu/"})