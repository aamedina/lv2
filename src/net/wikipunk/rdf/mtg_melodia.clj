(ns net.wikipunk.rdf.mtg-melodia
  "http://vamp-plugins.org/rdf/plugins/mtg-melodia"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/mtg-melodia",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "mtg-melodia"
                       "http://vamp-plugins.org/rdf/plugins/mtg-melodia#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/mtg-melodia#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "mtg-melodia",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/mtg-melodia"})

(def library
  "Melody pitch estimator for polyphonic music"
  {:db/ident :mtg-melodia/library,
   :dc11/description "Melody pitch estimator for polyphonic music",
   :dc11/title "MELODIA - Melody Extraction",
   :doap/download-page
   "http://mtg.upf.edu/technologies/melodia?p=Download%20and%20installation",
   :foaf/maker :mtg-melodia/maker,
   :foaf/page "http://mtg.upf.edu/technologies/melodia",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:mtg-melodia/melodiaviz :mtg-melodia/melodia],
   :vamp/has_binary ["linux32" "osx" "win32" "linux64"],
   :vamp/has_source false,
   :vamp/identifier "mtg-melodia"})

(def maker
  {:db/ident  :mtg-melodia/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/upf.png",
   :foaf/name "Music Technology Group, Universitat Pompeu Fabra",
   :foaf/page "http://mtg.upf.edu/"})

(def melodia
  "Estimates the melody pitch in polyphonic music (also good for homophonic and monophonic music). Segments without melody are indicated by zero or negative values. For further details please read: J. Salamon and E. Gomez, \"Melody Extraction from Polyphonic Music Signals using Pitch Contour Characteristics\", IEEE Transactions on Audio, Speech and Language Processing, 20(6):1759-1770, 2012. We would highly appreciate the above reference being cited in publications of work in which this plug-in was used."
  {:db/ident :mtg-melodia/melodia,
   :dc11/description
   "Estimates the melody pitch in polyphonic music (also good for homophonic and monophonic music). Segments without melody are indicated by zero or negative values. For further details please read:\r\n\r\nJ. Salamon and E. Gomez, \"Melody Extraction from Polyphonic Music Signals using Pitch Contour Characteristics\", IEEE Transactions on Audio, Speech and Language Processing, 20(6):1759-1770, 2012.\r\n\r\nWe would highly appreciate the above reference being cited in publications of work in which this plug-in was used.",
   :dc11/rights
   "Plugin by Justin Salamon. Copyright (c) Music Technology Group, Universitat Pompeu Fabra - All Rights Reserved",
   :dc11/title "MELODIA - Melody Extraction",
   :foaf/maker {:foaf/name "Music Technology Group, Universitat Pompeu Fabra"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "melodia",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MELODIA - Melody Extraction",
   :vamp/output :mtg-melodia/melodia_output_melody,
   :vamp/parameter [:mtg-melodia/melodia_param_minpeaksalience
                    :mtg-melodia/melodia_param_voicing
                    :mtg-melodia/melodia_param_minfqr
                    :mtg-melodia/melodia_param_maxfqr],
   :vamp/vamp_API_version :vamp/api_version_2})

(def melodia_output_melody
  "Estimated melody frequency in Hertz. Non-voiced segments indicated by negative values."
  {:db/ident :mtg-melodia/melodia_output_melody,
   :dc11/description
   "Estimated melody frequency in Hertz. Non-voiced segments indicated by negative values.",
   :dc11/title "Melody",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "melody",
   :vamp/unit "Hz"})

(def melodia_param_maxfqr
  {:db/ident           :mtg-melodia/melodia_param_maxfqr,
   :dc11/format        "Hz",
   :dc11/title         "Max Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1760,
   :vamp/identifier    "maxfqr",
   :vamp/max_value     1760,
   :vamp/min_value     55,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def melodia_param_minfqr
  {:db/ident           :mtg-melodia/melodia_param_minfqr,
   :dc11/format        "Hz",
   :dc11/title         "Min Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 55,
   :vamp/identifier    "minfqr",
   :vamp/max_value     1760,
   :vamp/min_value     55,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def melodia_param_minpeaksalience
  {:db/ident           :mtg-melodia/melodia_param_minpeaksalience,
   :dc11/format        "",
   :dc11/title         "Monophonic Noise Filter",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "minpeaksalience",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def melodia_param_voicing
  {:db/ident           :mtg-melodia/melodia_param_voicing,
   :dc11/format        "",
   :dc11/title         "Voicing Tolerance",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0.2M,
   :vamp/identifier    "voicing",
   :vamp/max_value     3,
   :vamp/min_value     -2.6M,
   :vamp/quantize_step 0.01M,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def melodiaviz
  "Provides visualisations of the intermediate steps calculated by the melody extraction algorithm implemented in the MELODIA - Melody Extraction plug-in. For further details please read: J. Salamon and E. Gomez, \"Melody Extraction from Polyphonic Music Signals using Pitch Contour Characteristics\", IEEE Transactions on Audio, Speech and Language Processing, 20(6):1759-1770, 2012. We would highly appreciate the above reference being cited in publications of work in which this plug-in was used."
  {:db/ident :mtg-melodia/melodiaviz,
   :dc11/description
   "Provides visualisations of the intermediate steps calculated by the melody extraction algorithm implemented in the MELODIA - Melody Extraction plug-in. For further details please read:\r\n\r\nJ. Salamon and E. Gomez, \"Melody Extraction from Polyphonic Music Signals using Pitch Contour Characteristics\", IEEE Transactions on Audio, Speech and Language Processing, 20(6):1759-1770, 2012.\r\n\r\nWe would highly appreciate the above reference being cited in publications of work in which this plug-in was used.",
   :dc11/rights
   "Plugin by Justin Salamon. Copyright (c) Music Technology Group, Universitat Pompeu Fabra - All Rights Reserved",
   :dc11/title "MELODIA - Melody Extraction (intermediate steps)",
   :foaf/maker :mtg-melodia/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "melodiaviz",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MELODIA - Melody Extraction (intermediate steps)",
   :vamp/output [:mtg-melodia/melodiaviz_output_saliencefunction
                 :mtg-melodia/melodiaviz_output_contoursall
                 :mtg-melodia/melodiaviz_output_contoursmelody],
   :vamp/parameter [:mtg-melodia/melodiaviz_param_voicing
                    :mtg-melodia/melodiaviz_param_minpeaksalience
                    :mtg-melodia/melodiaviz_param_maxfqr
                    :mtg-melodia/melodiaviz_param_minfqr],
   :vamp/vamp_API_version :vamp/api_version_2})

(def melodiaviz_output_contoursall
  "All pitch contours generated from the salience fucntion"
  {:db/ident :mtg-melodia/melodiaviz_output_contoursall,
   :dc11/description "All pitch contours generated from the salience fucntion",
   :dc11/title "Pitch Contours: All",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 600,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "contoursall",
   :vamp/unit ""})

(def melodiaviz_output_contoursmelody
  "Final set of pitch contours from which the melody is obtained"
  {:db/ident :mtg-melodia/melodiaviz_output_contoursmelody,
   :dc11/description
   "Final set of pitch contours from which the melody is obtained",
   :dc11/title "Pitch Contours: Melody",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 600,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "contoursmelody",
   :vamp/unit ""})

(def melodiaviz_output_saliencefunction
  "Estimate of pitch salience over time"
  {:db/ident             :mtg-melodia/melodiaviz_output_saliencefunction,
   :dc11/description     "Estimate of pitch salience over time",
   :dc11/title           "Salience Function",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       600,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "saliencefunction",
   :vamp/unit            ""})

(def melodiaviz_param_maxfqr
  {:db/ident           :mtg-melodia/melodiaviz_param_maxfqr,
   :dc11/format        "Hz",
   :dc11/title         "Max Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1760,
   :vamp/identifier    "maxfqr",
   :vamp/max_value     1760,
   :vamp/min_value     55,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def melodiaviz_param_minfqr
  {:db/ident           :mtg-melodia/melodiaviz_param_minfqr,
   :dc11/format        "Hz",
   :dc11/title         "Min Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 55,
   :vamp/identifier    "minfqr",
   :vamp/max_value     1760,
   :vamp/min_value     55,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def melodiaviz_param_minpeaksalience
  {:db/ident           :mtg-melodia/melodiaviz_param_minpeaksalience,
   :dc11/format        "",
   :dc11/title         "Monophonic Noise Filter",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "minpeaksalience",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def melodiaviz_param_voicing
  {:db/ident           :mtg-melodia/melodiaviz_param_voicing,
   :dc11/format        "",
   :dc11/title         "Voicing Tolerance",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0.2M,
   :vamp/identifier    "voicing",
   :vamp/max_value     3,
   :vamp/min_value     -2.6M,
   :vamp/quantize_step 0.01M,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})