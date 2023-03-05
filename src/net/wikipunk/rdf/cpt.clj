(ns net.wikipunk.rdf.cpt
  "http://vamp-plugins.org/rdf/plugins/cepstral-pitchtracker"
  {:foaf/maker "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic
   "http://vamp-plugins.org/rdf/plugins/cepstral-pitchtracker",
   :rdf/ns-prefix-map
   {"af"       "http://purl.org/ontology/af/",
    "cc"       "http://web.resource.org/cc/",
    "cpt"      "http://vamp-plugins.org/rdf/plugins/cepstral-pitchtracker#",
    "dc11"     "http://purl.org/dc/elements/1.1/",
    "doap"     "http://usefulinc.com/ns/doap#",
    "foaf"     "http://xmlns.com/foaf/0.1/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "plugbase" "http://vamp-plugins.org/rdf/plugins/cepstral-pitchtracker#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "vamp"     "http://purl.org/ontology/vamp/",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :vamp/PluginDescription,
   :rdfa/prefix "cpt",
   :rdfa/uri "http://vamp-plugins.org/rdf/plugins/cepstral-pitchtracker"})

(def cepstral-pitchtracker
  "Estimate f0 of monophonic material using a cepstrum method."
  {:db/ident :cpt/cepstral-pitchtracker,
   :dc11/description
   "Estimate f0 of monophonic material using a cepstrum method.",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Cepstral Pitch Tracker",
   :foaf/maker :cpt/library_maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "cepstral-pitchtracker",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Cepstral Pitch Tracker",
   :vamp/output [:cpt/cepstral-pitchtracker_output_f0
                 :cpt/cepstral-pitchtracker_output_notes],
   :vamp/vamp_API_version :vamp/api_version_2})

(def cepstral-pitchtracker_output_f0
  "Estimated fundamental frequency"
  {:db/ident             :cpt/cepstral-pitchtracker_output_f0,
   :dc11/description     "Estimated fundamental frequency",
   :dc11/title           "Estimated f0",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count       1,
   :vamp/computes_event_type :af/Pitch,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "f0",
   :vamp/max_value       900,
   :vamp/min_value       50,
   :vamp/unit            "Hz"})

(def cepstral-pitchtracker_output_notes
  "Derived fixed-pitch note frequencies"
  {:db/ident             :cpt/cepstral-pitchtracker_output_notes,
   :dc11/description     "Derived fixed-pitch note frequencies",
   :dc11/title           "Notes",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/SparseOutput],
   :vamp/bin_count       1,
   :vamp/computes_event_type :af/Note,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "notes",
   :vamp/max_value       900,
   :vamp/min_value       50,
   :vamp/unit            "Hz"})

(def library
  "A straightforward cepstral pitch- and note-tracker Vamp plugin, probably most suited to tracking singing pitch."
  {:db/ident :cpt/library,
   :dc11/description
   "A straightforward cepstral pitch- and note-tracker Vamp plugin, probably most suited to tracking singing pitch.",
   :dc11/title "Cepstral Pitch Tracker",
   :doap/download-page
   "http://code.soundsoftware.ac.uk/projects/cepstral-pitchtracker/files",
   :foaf/maker :cpt/library_maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/cepstral-pitchtracker",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :cpt/cepstral-pitchtracker,
   :vamp/has_source true,
   :vamp/identifier "cepstral-pitchtracker"})

(def library_maker
  {:db/ident  :cpt/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Chris Cannam",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})