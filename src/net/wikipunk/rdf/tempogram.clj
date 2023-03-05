(ns net.wikipunk.rdf.tempogram
  "http://vamp-plugins.org/rdf/plugins/tempogram"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/tempogram",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/tempogram#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "tempogram"
                       "http://vamp-plugins.org/rdf/plugins/tempogram#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "tempogram",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/tempogram"})

(def library
  "A Vamp plugin implementation of the tempogram and cyclic tempogram features described in Grosche, Müller, and Kurth 2010"
  {:db/ident :tempogram/library,
   :dc11/description
   "A Vamp plugin implementation of the tempogram and cyclic tempogram features described in Grosche, Müller, and Kurth 2010",
   :dc11/title "Tempogram",
   :doap/download-page
   "https://code.soundsoftware.ac.uk/projects/vamp-tempogram/files",
   :foaf/maker :tempogram/library_maker,
   :foaf/page "https://code.soundsoftware.ac.uk/projects/vamp-tempogram",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :tempogram/tempogram,
   :vamp/identifier "tempogram"})

(def library_maker
  {:db/ident  :tempogram/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Carl Bussey",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def tempogram
  "Cyclic Tempogram as described by Peter Grosche and Meinard Müller"
  {:db/ident :tempogram/tempogram,
   :dc11/description
   "Cyclic Tempogram as described by Peter Grosche and Meinard Müller",
   :dc11/rights "Copyright 2014 Queen Mary University of London. GPL licence.",
   :dc11/title "Tempogram",
   :foaf/maker :tempogram/library_maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tempogram",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Tempogram",
   :vamp/output [:tempogram/tempogram_output_tempogramDFT
                 :tempogram/tempogram_output_nc
                 :tempogram/tempogram_output_tempogramACT
                 :tempogram/tempogram_output_cyclicTempogram],
   :vamp/parameter [:tempogram/tempogram_param_minBPM
                    :tempogram/tempogram_param_log2HopSize
                    :tempogram/tempogram_param_octDiv
                    :tempogram/tempogram_param_maxBPM
                    :tempogram/tempogram_param_C
                    :tempogram/tempogram_param_log2FftLength
                    :tempogram/tempogram_param_log2TN
                    :tempogram/tempogram_param_minDB],
   :vamp/vamp_API_version :vamp/api_version_2})

(def tempogram_output_cyclicTempogram
  "Cyclic Tempogram"
  {:db/ident             :tempogram/tempogram_output_cyclicTempogram,
   :dc11/description     "Cyclic Tempogram",
   :dc11/title           "Cyclic Tempogram",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       30,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "cyclicTempogram",
   :vamp/unit            ""})

(def tempogram_output_nc
  "Novelty Curve"
  {:db/ident             :tempogram/tempogram_output_nc,
   :dc11/description     "Novelty Curve",
   :dc11/title           "Novelty Curve",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "nc",
   :vamp/unit            ""})

(def tempogram_output_tempogramACT
  "Tempogram via ACT"
  {:db/ident             :tempogram/tempogram_output_tempogramACT,
   :dc11/description     "Tempogram via ACT",
   :dc11/title           "Tempogram via ACT",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       ["inf"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tempogramACT",
   :vamp/unit            "BPM"})

(def tempogram_output_tempogramDFT
  "Tempogram via DFT"
  {:db/ident             :tempogram/tempogram_output_tempogramDFT,
   :dc11/description     "Tempogram via DFT",
   :dc11/title           "Tempogram via DFT",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/bin_names       ["-nan"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tempogramDFT",
   :vamp/unit            "BPM"})

(def tempogram_param_C
  {:db/ident           :tempogram/tempogram_param_C,
   :dc11/format        "",
   :dc11/title         "Novelty Curve Spectrogram Compression Constant",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1000,
   :vamp/identifier    "C",
   :vamp/max_value     10000,
   :vamp/min_value     2,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tempogram_param_log2FftLength
  {:db/ident           :tempogram/tempogram_param_log2FftLength,
   :dc11/format        "",
   :dc11/title         "Tempogram FFT Length",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value -74,
   :vamp/identifier    "log2FftLength",
   :vamp/max_value     12,
   :vamp/min_value     6,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tempogram_param_log2HopSize
  {:db/ident           :tempogram/tempogram_param_log2HopSize,
   :dc11/format        "",
   :dc11/title         "Tempogram Hopsize",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 6,
   :vamp/identifier    "log2HopSize",
   :vamp/max_value     12,
   :vamp/min_value     6,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["64" "128" "256" "512" "1024" "2048" "4096"]})

(def tempogram_param_log2TN
  {:db/ident           :tempogram/tempogram_param_log2TN,
   :dc11/format        "",
   :dc11/title         "Tempogram Window Length",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 10,
   :vamp/identifier    "log2TN",
   :vamp/max_value     12,
   :vamp/min_value     7,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["128" "256" "512" "1024" "2048" "4096"]})

(def tempogram_param_maxBPM
  {:db/ident           :tempogram/tempogram_param_maxBPM,
   :dc11/format        "",
   :dc11/title         "(Cyclic) Tempogram Maximum BPM",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 480,
   :vamp/identifier    "maxBPM",
   :vamp/max_value     2000,
   :vamp/min_value     30,
   :vamp/quantize_step 5,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tempogram_param_minBPM
  {:db/ident           :tempogram/tempogram_param_minBPM,
   :dc11/format        "",
   :dc11/title         "(Cyclic) Tempogram Minimum BPM",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 30,
   :vamp/identifier    "minBPM",
   :vamp/max_value     2000,
   :vamp/min_value     0,
   :vamp/quantize_step 5,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tempogram_param_minDB
  {:db/ident           :tempogram/tempogram_param_minDB,
   :dc11/format        "",
   :dc11/title         "Novelty Curve Minimum DB",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value -74,
   :vamp/identifier    "minDB",
   :vamp/max_value     -50,
   :vamp/min_value     -100,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tempogram_param_octDiv
  {:db/ident           :tempogram/tempogram_param_octDiv,
   :dc11/format        "",
   :dc11/title         "Cyclic Tempogram Octave Divider",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 30,
   :vamp/identifier    "octDiv",
   :vamp/max_value     60,
   :vamp/min_value     5,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})