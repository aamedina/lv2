(ns net.wikipunk.rdf.beatroot
  "http://vamp-plugins.org/rdf/plugins/beatroot-vamp"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/beatroot-vamp",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "beatroot"
                       "http://vamp-plugins.org/rdf/plugins/beatroot-vamp#",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/beatroot-vamp#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "beatroot",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/beatroot-vamp"})

(def beatroot
  "Identify beat locations in music"
  {:db/ident              :beatroot/beatroot,
   :dc11/description      "Identify beat locations in music",
   :dc11/rights           "GPL",
   :dc11/title            "BeatRoot Beat Tracker",
   :foaf/maker            :beatroot/maker,
   :owl/versionInfo       "1",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "beatroot",
   :vamp/input_domain     :vamp/FrequencyDomain,
   :vamp/name             "BeatRoot Beat Tracker",
   :vamp/output           :beatroot/beatroot_output_beats,
   :vamp/parameter        [:beatroot/beatroot_param_maxChange
                           :beatroot/beatroot_param_preMarginFactor
                           :beatroot/beatroot_param_postMarginFactor
                           :beatroot/beatroot_param_expiryTime],
   :vamp/vamp_API_version :vamp/api_version_2})

(def beatroot_output_beats
  "Estimated beat locations"
  {:db/ident             :beatroot/beatroot_output_beats,
   :dc11/description     "Estimated beat locations",
   :dc11/title           "Beats",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/computes_event_type :af/Beat,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "beats",
   :vamp/sample_rate     44100,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def beatroot_param_expiryTime
  {:db/ident           :beatroot/beatroot_param_expiryTime,
   :dc11/format        "",
   :dc11/title         "Expiry Time",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "expiryTime",
   :vamp/max_value     120,
   :vamp/min_value     2,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def beatroot_param_maxChange
  {:db/ident           :beatroot/beatroot_param_maxChange,
   :dc11/format        "",
   :dc11/title         "Maximum Change",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.2M,
   :vamp/identifier    "maxChange",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def beatroot_param_postMarginFactor
  {:db/ident           :beatroot/beatroot_param_postMarginFactor,
   :dc11/format        "",
   :dc11/title         "Post-Margin Factor",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.3M,
   :vamp/identifier    "postMarginFactor",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def beatroot_param_preMarginFactor
  {:db/ident           :beatroot/beatroot_param_preMarginFactor,
   :dc11/format        "",
   :dc11/title         "Pre-Margin Factor",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.15M,
   :vamp/identifier    "preMarginFactor",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def library
  "A plugin implementation of the BeatRoot beat tracking system"
  {:db/ident :beatroot/library,
   :dc11/description
   "A plugin implementation of the BeatRoot beat tracking system",
   :dc11/title "BeatRoot",
   :foaf/maker :beatroot/maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/beatroot-vamp",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :beatroot/beatroot,
   :vamp/identifier "beatroot-vamp"})

(def maker
  {:db/ident  :beatroot/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Simon Dixon and Chris Cannam",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})