(ns net.wikipunk.rdf.tipic
  "http://vamp-plugins.org/rdf/plugins/tipic"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/tipic",
   :rdf/ns-prefix-map {"af"    "http://purl.org/ontology/af/",
                       "cc"    "http://web.resource.org/cc/",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "doap"  "http://usefulinc.com/ns/doap#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "tipic" "http://vamp-plugins.org/rdf/plugins/tipic#",
                       "vamp"  "http://purl.org/ontology/vamp/",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "tipic",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/tipic"})

(def library
  "Pitch-chroma audio features approaching timbre invariance, after the paper \"Towards timbre-invariant audio features for harmony-based music\" by Meinard Müller and Sebastian Ewert"
  {:db/ident :tipic/library,
   :dc11/description
   "Pitch-chroma audio features approaching timbre invariance, after the paper \"Towards timbre-invariant audio features for harmony-based music\" by Meinard Müller and Sebastian Ewert",
   :dc11/title "Tipic - Tibre-Invariant Pitch Chroma",
   :doap/download-page "http://code.soundsoftware.ac.uk/projects/tipic/files",
   :foaf/maker :tipic/library_maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/tipic",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :tipic/tipic,
   :vamp/identifier "tipic"})

(def library_maker
  {:db/ident  :tipic/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Queen Mary, University of London",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def tipic
  "Pitch and chroma features with optional DCT timbre reduction."
  {:db/ident :tipic/tipic,
   :dc11/description
   "Pitch and chroma features with optional DCT timbre reduction.",
   :dc11/rights
   "Methods by Sebastian Ewert and Meinard Müller, plugin by Chris Cannam. GPL licence.",
   :dc11/title "Timbre-Invariant Pitch Chroma",
   :foaf/maker :tipic/library_maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tipic",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Timbre-Invariant Pitch Chroma",
   :vamp/output [:tipic/tipic_output_crp
                 :tipic/tipic_output_chroma
                 :tipic/tipic_output_cens
                 :tipic/tipic_output_chroma-down
                 :tipic/tipic_output_clp
                 :tipic/tipic_output_clp-down
                 :tipic/tipic_output_crp-down
                 :tipic/tipic_output_pitch-down
                 :tipic/tipic_output_pitch],
   :vamp/parameter :tipic/tipic_param_tuning,
   :vamp/vamp_API_version :vamp/api_version_2})

(def tipic_output_cens
  ""
  {:db/ident             :tipic/tipic_output_cens,
   :dc11/description     "",
   :dc11/title           "Chroma Energy Normalised Statistics Features",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/bin_names       ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "cens",
   :vamp/unit            ""})

(def tipic_output_chroma
  ""
  {:db/ident             :tipic/tipic_output_chroma,
   :dc11/description     "",
   :dc11/title           "Chroma Pitch Features",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/bin_names       ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "chroma",
   :vamp/unit            ""})

(def tipic_output_chroma-down
  ""
  {:db/ident             :tipic/tipic_output_chroma-down,
   :dc11/description     "",
   :dc11/title           "Chroma Pitch Features (Downsampled)",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/bin_names       ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "chroma-down",
   :vamp/unit            ""})

(def tipic_output_clp
  ""
  {:db/ident             :tipic/tipic_output_clp,
   :dc11/description     "",
   :dc11/title           "Chroma Log Pitch Features",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/bin_names       ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "clp",
   :vamp/unit            ""})

(def tipic_output_clp-down
  ""
  {:db/ident             :tipic/tipic_output_clp-down,
   :dc11/description     "",
   :dc11/title           "Chroma Log Pitch Features (Downsampled)",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/bin_names       ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "clp-down",
   :vamp/unit            ""})

(def tipic_output_crp
  ""
  {:db/ident             :tipic/tipic_output_crp,
   :dc11/description     "",
   :dc11/title           "Chroma DCT-Reduced Log Pitch Features",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/bin_names       ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "crp",
   :vamp/unit            ""})

(def tipic_output_crp-down
  ""
  {:db/ident             :tipic/tipic_output_crp-down,
   :dc11/description     "",
   :dc11/title           "Chroma DCT-Reduced Log Pitch Features (Downsampled)",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/bin_names       ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "crp-down",
   :vamp/unit            ""})

(def tipic_output_pitch
  ""
  {:db/ident             :tipic/tipic_output_pitch,
   :dc11/description     "",
   :dc11/title           "Pitch Features",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       88,
   :vamp/bin_names       ["21 A0"
                          "22 A#0"
                          "23 B0"
                          "24 C1"
                          "25 C#1"
                          "26 D1"
                          "27 D#1"
                          "28 E1"
                          "29 F1"
                          "30 F#1"
                          "31 G1"
                          "32 G#1"
                          "33 A1"
                          "34 A#1"
                          "35 B1"
                          "36 C2"
                          "37 C#2"
                          "38 D2"
                          "39 D#2"
                          "40 E2"
                          "41 F2"
                          "42 F#2"
                          "43 G2"
                          "44 G#2"
                          "45 A2"
                          "46 A#2"
                          "47 B2"
                          "48 C3"
                          "49 C#3"
                          "50 D3"
                          "51 D#3"
                          "52 E3"
                          "53 F3"
                          "54 F#3"
                          "55 G3"
                          "56 G#3"
                          "57 A3"
                          "58 A#3"
                          "59 B3"
                          "60 C4"
                          "61 C#4"
                          "62 D4"
                          "63 D#4"
                          "64 E4"
                          "65 F4"
                          "66 F#4"
                          "67 G4"
                          "68 G#4"
                          "69 A4"
                          "70 A#4"
                          "71 B4"
                          "72 C5"
                          "73 C#5"
                          "74 D5"
                          "75 D#5"
                          "76 E5"
                          "77 F5"
                          "78 F#5"
                          "79 G5"
                          "80 G#5"
                          "81 A5"
                          "82 A#5"
                          "83 B5"
                          "84 C6"
                          "85 C#6"
                          "86 D6"
                          "87 D#6"
                          "88 E6"
                          "89 F6"
                          "90 F#6"
                          "91 G6"
                          "92 G#6"
                          "93 A6"
                          "94 A#6"
                          "95 B6"
                          "96 C7"
                          "97 C#7"
                          "98 D7"
                          "99 D#7"
                          "100 E7"
                          "101 F7"
                          "102 F#7"
                          "103 G7"
                          "104 G#7"
                          "105 A7"
                          "106 A#7"
                          "107 B7"
                          "108 C8"],
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "pitch",
   :vamp/unit            ""})

(def tipic_output_pitch-down
  ""
  {:db/ident             :tipic/tipic_output_pitch-down,
   :dc11/description     "",
   :dc11/title           "Pitch Features (Downsampled)",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       88,
   :vamp/bin_names       ["21 A0"
                          "22 A#0"
                          "23 B0"
                          "24 C1"
                          "25 C#1"
                          "26 D1"
                          "27 D#1"
                          "28 E1"
                          "29 F1"
                          "30 F#1"
                          "31 G1"
                          "32 G#1"
                          "33 A1"
                          "34 A#1"
                          "35 B1"
                          "36 C2"
                          "37 C#2"
                          "38 D2"
                          "39 D#2"
                          "40 E2"
                          "41 F2"
                          "42 F#2"
                          "43 G2"
                          "44 G#2"
                          "45 A2"
                          "46 A#2"
                          "47 B2"
                          "48 C3"
                          "49 C#3"
                          "50 D3"
                          "51 D#3"
                          "52 E3"
                          "53 F3"
                          "54 F#3"
                          "55 G3"
                          "56 G#3"
                          "57 A3"
                          "58 A#3"
                          "59 B3"
                          "60 C4"
                          "61 C#4"
                          "62 D4"
                          "63 D#4"
                          "64 E4"
                          "65 F4"
                          "66 F#4"
                          "67 G4"
                          "68 G#4"
                          "69 A4"
                          "70 A#4"
                          "71 B4"
                          "72 C5"
                          "73 C#5"
                          "74 D5"
                          "75 D#5"
                          "76 E5"
                          "77 F5"
                          "78 F#5"
                          "79 G5"
                          "80 G#5"
                          "81 A5"
                          "82 A#5"
                          "83 B5"
                          "84 C6"
                          "85 C#6"
                          "86 D6"
                          "87 D#6"
                          "88 E6"
                          "89 F6"
                          "90 F#6"
                          "91 G6"
                          "92 G#6"
                          "93 A6"
                          "94 A#6"
                          "95 B6"
                          "96 C7"
                          "97 C#7"
                          "98 D7"
                          "99 D#7"
                          "100 E7"
                          "101 F7"
                          "102 F#7"
                          "103 G7"
                          "104 G#7"
                          "105 A7"
                          "106 A#7"
                          "107 B7"
                          "108 C8"],
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "pitch-down",
   :vamp/unit            ""})

(def tipic_param_tuning
  {:db/ident           :tipic/tipic_param_tuning,
   :dc11/format        "Hz",
   :dc11/title         "Tuning Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 440,
   :vamp/identifier    "tuning",
   :vamp/max_value     500,
   :vamp/min_value     360,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})