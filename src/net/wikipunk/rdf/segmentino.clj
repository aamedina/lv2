(ns net.wikipunk.rdf.segmentino
  "http://vamp-plugins.org/rdf/plugins/segmentino"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/segmentino",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/segmentino#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "segmentino"
                       "http://vamp-plugins.org/rdf/plugins/segmentino#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "segmentino",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/segmentino"})

(def library
  "Plugin for automatic music structural segmentation"
  {:db/ident :segmentino/library,
   :dc11/description "Plugin for automatic music structural segmentation",
   :dc11/title "Segmentino",
   :doap/download-page
   "http://code.soundsoftware.ac.uk/projects/segmenter-vamp-plugin/files",
   :foaf/maker :segmentino/maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/segmenter-vamp-plugin",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :segmentino/segmentino,
   :vamp/has_binary ["win32" "linux64" "osx" "linux32"],
   :vamp/has_source true,
   :vamp/identifier "segmentino"})

(def maker
  {:db/ident  :segmentino/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Queen Mary, University of London",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def segmentino
  "Estimate contiguous segments pertaining to song parts such as verse and chorus."
  {:db/ident :segmentino/segmentino,
   :dc11/description
   "Estimate contiguous segments pertaining to song parts such as verse and chorus.",
   :dc11/rights
   "Plugin by Matthew Davies, Christian Landone, Chris Cannam, Matthias Mauch and Massimiliano Zanoni  Copyright (c) 2006-2013 QMUL - Affero GPL",
   :dc11/title "Segmentino",
   :foaf/maker {:foaf/name "Queen Mary, University of London"},
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/category "Classification",
   :vamp/identifier "segmentino",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Segmentino",
   :vamp/output :segmentino/segmentino_output_segmentation,
   :vamp/vamp_API_version :vamp/api_version_2})

(def segmentino_output_segmentation
  "Segmentation"
  {:db/ident             :segmentino/segmentino_output_segmentation,
   :dc11/description     "Segmentation",
   :dc11/title           "Segmentation",
   :rdf/type             [:vamp/SparseOutput
                          :vamp/QuantizedOutput
                          :vamp/KnownExtentsOutput],
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "segmentation",
   :vamp/max_value       5,
   :vamp/min_value       1,
   :vamp/quantize_step   1,
   :vamp/sample_rate     86.1326M,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "segment-type"})