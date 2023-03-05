(ns net.wikipunk.rdf.ofa
  "http://vamp-plugins.org/rdf/plugins/ofa-vamp-plugin"
  {:foaf/maker        ["http://www.vamp-plugins.org/doap.rdf#template-generator"
                       "http://vamp-plugins.org/rdf/plugins/x"],
   :foaf/primaryTopic :ofa/ofa-vamp-plugin,
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "ofa"
                       "http://vamp-plugins.org/rdf/plugins/ofa-vamp-plugin#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "ofa",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/ofa-vamp-plugin"})

(def maker
  {:db/ident  :ofa/maker,
   :foaf/name "Chris Cannam",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def ofa-vamp-plugin
  "Plugin that performed audio fingerprinting and lookup using the no-longer-supported MusicIP OFA library. This plugin is provided for interest only and is no longer practically useful."
  {:db/ident :ofa/ofa-vamp-plugin,
   :dc11/description
   "Plugin that performed audio fingerprinting and lookup using the no-longer-supported MusicIP OFA library. This plugin is provided for interest only and is no longer practically useful.",
   :dc11/title "OFA Vamp Plugin",
   :foaf/maker :ofa/maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/ofa-vamp-plugin",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:ofa/ofa_puid :ofa/ofa_fingerprint],
   :vamp/has_source true,
   :vamp/identifier "ofa-vamp-plugin"})

(def ofa_fingerprint
  "Calculates an audio fingerprint using the MusicIP OFA fingerprinting library"
  {:db/ident :ofa/ofa_fingerprint,
   :dc11/description
   "Calculates an audio fingerprint using the MusicIP OFA fingerprinting library",
   :dc11/title "MusicIP Audio Fingerprinter",
   :foaf/maker :ofa/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "ofa_fingerprint",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MusicIP Audio Fingerprinter",
   :vamp/output :ofa/ofa_fingerprint_output_fingerprint,
   :vamp/vamp_API_version :vamp/api_version_2})

(def ofa_fingerprint_output_fingerprint
  "Single result containing the audio fingerprint as its label"
  {:db/ident :ofa/ofa_fingerprint_output_fingerprint,
   :dc11/description
   "Single result containing the audio fingerprint as its label",
   :dc11/title "Fingerprint",
   :rdf/type :vamp/TrackLevelOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "fingerprint",
   :vamp/sample_rate 44100,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def ofa_puid
  "Calculates an audio fingerprint using the MusicIP OFA fingerprinting library and uses it to look up a MusicDNS PUID"
  {:db/ident :ofa/ofa_puid,
   :dc11/description
   "Calculates an audio fingerprint using the MusicIP OFA fingerprinting library and uses it to look up a MusicDNS PUID",
   :dc11/title "MusicIP PUID Lookup",
   :foaf/maker :ofa/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "ofa_puid",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MusicIP PUID Lookup",
   :vamp/output :ofa/ofa_puid_output_puid,
   :vamp/vamp_API_version :vamp/api_version_2})

(def ofa_puid_output_puid
  "Single result containing the MusicIP online PUID for this audio track, if available"
  {:db/ident :ofa/ofa_puid_output_puid,
   :dc11/description
   "Single result containing the MusicIP online PUID for this audio track, if available",
   :dc11/title "PUID",
   :rdf/type :vamp/TrackLevelOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "puid",
   :vamp/sample_rate 44100,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})