(ns net.wikipunk.rdf.vamp-onsetsds
  "http://vamp-plugins.org/rdf/plugins/vamp-onsetsds"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/vamp-onsetsds",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "vamp-onsetsds"
                       "http://vamp-plugins.org/rdf/plugins/vamp-onsetsds#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "vamp-onsetsds",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/vamp-onsetsds"})

(def maker
  {:db/ident  :vamp-onsetsds/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Dan Stowell",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def onsetsds
  "Detect note onsets"
  {:db/ident              :vamp-onsetsds/onsetsds,
   :dc11/description      "Detect note onsets",
   :dc11/rights           "Copyright (c) 2007-2008 Dan Stowell",
   :dc11/title            "OnsetsDS Onset Detector",
   :foaf/maker            :vamp-onsetsds/maker,
   :owl/versionInfo       "1",
   :rdf/type              :vamp/Plugin,
   :vamp/category         "Time > Onsets",
   :vamp/identifier       "onsetsds",
   :vamp/input_domain     :vamp/FrequencyDomain,
   :vamp/name             "OnsetsDS Onset Detector",
   :vamp/output           :vamp-onsetsds/onsetsds_output_onsets,
   :vamp/parameter        [:vamp-onsetsds/onsetsds_param_medspan
                           :vamp-onsetsds/onsetsds_param_dftype
                           :vamp-onsetsds/onsetsds_param_threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def onsetsds_output_onsets
  "Note onset positions"
  {:db/ident             :vamp-onsetsds/onsetsds_output_onsets,
   :dc11/description     "Note onset positions",
   :dc11/title           "Note Onsets",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onsets",
   :vamp/sample_rate     172.266M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def onsetsds_param_dftype
  {:db/ident           :vamp-onsetsds/onsetsds_param_dftype,
   :dc11/format        "",
   :dc11/title         "Onset detection function",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "dftype",
   :vamp/max_value     6,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Power"
                        "Sum of magnitudes"
                        "Complex-domain deviation"
                        "Rectified complex-domain deviation"
                        "Phase deviation"
                        "Weighted phase deviation"
                        "Modified Kullback-Liebler deviation"]})

(def onsetsds_param_medspan
  {:db/ident           :vamp-onsetsds/onsetsds_param_medspan,
   :dc11/format        "",
   :dc11/title         "Median frame span",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 11,
   :vamp/identifier    "medspan",
   :vamp/max_value     21,
   :vamp/min_value     5,
   :vamp/quantize_step 2,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def onsetsds_param_threshold
  {:db/ident           :vamp-onsetsds/onsetsds_param_threshold,
   :dc11/format        "",
   :dc11/title         "Detection threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.5M,
   :vamp/identifier    "threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def vamp-onsetsds
  "Note onset detector using Dan Stowell's OnsetsDS library"
  {:db/ident :vamp-onsetsds/vamp-onsetsds,
   :dc11/description "Note onset detector using Dan Stowell's OnsetsDS library",
   :dc11/title "OnsetsDS plugin",
   :doap/download-page
   "http://sourceforge.net/projects/vamp/files/vamp-onsetsds-plugin/0.2/",
   :foaf/maker :vamp-onsetsds/maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/vamp-onsetsds-plugin",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :vamp-onsetsds/onsetsds,
   :vamp/has_binary ["win32" "osx" "linux32"],
   :vamp/has_source true,
   :vamp/identifier "vamp-onsetsds"})