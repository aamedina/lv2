(ns net.wikipunk.rdf.nnls-chroma
  "http://vamp-plugins.org/rdf/plugins/nnls-chroma"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/nnls-chroma",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "nnls-chroma"
                       "http://vamp-plugins.org/rdf/plugins/nnls-chroma#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/nnls-chroma#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "nnls-chroma",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/nnls-chroma"})

(def chordino
  "Chordino provides a simple chord transcription based on NNLS Chroma (as in the NNLS Chroma plugin). Chord profiles given by the user in the file chord.dict are used to calculate frame-wise chord similarities. Two simple (non-state-of-the-art!) algorithms are available that smooth these to provide a chord transcription: a simple chord change method, and a standard HMM/Viterbi approach."
  {:db/ident :nnls-chroma/chordino,
   :dc11/description
   "Chordino provides a simple chord transcription based on NNLS Chroma (as in the NNLS Chroma plugin). Chord profiles given by the user in the file chord.dict are used to calculate frame-wise chord similarities. Two simple (non-state-of-the-art!) algorithms are available that smooth these to provide a chord transcription: a simple chord change method, and a standard HMM/Viterbi approach.",
   :dc11/rights "GPL",
   :dc11/title "Chordino",
   :foaf/maker :nnls-chroma/maker,
   :owl/versionInfo "5",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "chordino",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Chordino",
   :vamp/output [:nnls-chroma/chordino_output_harmonicchange
                 :nnls-chroma/chordino_output_simplechord],
   :vamp/parameter [:nnls-chroma/chordino_param_whitening
                    :nnls-chroma/chordino_param_rollon
                    :nnls-chroma/chordino_param_useNNLS
                    :nnls-chroma/chordino_param_s
                    :nnls-chroma/chordino_param_useHMM
                    :nnls-chroma/chordino_param_tuningmode],
   :vamp/vamp_API_version :vamp/api_version_2})

(def chordino_output_harmonicchange
  "An indication of the likelihood of harmonic change. Depends on the chord dictionary. Calculation is different depending on whether the Viterbi algorithm is used for chord estimation, or the simple chord estimate."
  {:db/ident :nnls-chroma/chordino_output_harmonicchange,
   :dc11/description
   "An indication of the likelihood of harmonic change. Depends on the chord dictionary. Calculation is different depending on whether the Viterbi algorithm is used for chord estimation, or the simple chord estimate.",
   :dc11/title "Harmonic Change Value",
   :rdf/type [:vamp/DenseOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count 1,
   :vamp/computes_signal_type :af/TonalChangeDetectionFunction,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "harmonicchange",
   :vamp/max_value 0.999M,
   :vamp/min_value 0,
   :vamp/unit ""})

(def chordino_output_simplechord
  "Estimated chord times and labels. Two simple (non-state-of-the-art!) algorithms are available that smooth these to provide a chord transcription: a simple chord change method, and a standard HMM/Viterbi approach."
  {:db/ident :nnls-chroma/chordino_output_simplechord,
   :dc11/description
   "Estimated chord times and labels. Two simple (non-state-of-the-art!) algorithms are available that smooth these to provide a chord transcription: a simple chord change method, and a standard HMM/Viterbi approach.",
   :dc11/title "Chord Estimate",
   :rdf/type [:vamp/SparseOutput :vamp/QuantizedOutput],
   :vamp/bin_count 0,
   :vamp/computes_event_type :af/ChordSegment,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "simplechord",
   :vamp/quantize_step 1,
   :vamp/sample_rate 21.5332M,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "chord"})

(def chordino_param_rollon
  {:db/ident           :nnls-chroma/chordino_param_rollon,
   :dc11/format        "",
   :dc11/title         "spectral roll-on",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "rollon",
   :vamp/max_value     5,
   :vamp/min_value     0,
   :vamp/quantize_step 0.5M,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def chordino_param_s
  {:db/ident           :nnls-chroma/chordino_param_s,
   :dc11/format        "",
   :dc11/title         "spectral shape",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.7M,
   :vamp/identifier    "s",
   :vamp/max_value     0.9M,
   :vamp/min_value     0.5M,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def chordino_param_tuningmode
  {:db/ident           :nnls-chroma/chordino_param_tuningmode,
   :dc11/format        "",
   :dc11/title         "tuning mode",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "tuningmode",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["global tuning" "local tuning"]})

(def chordino_param_useHMM
  {:db/ident           :nnls-chroma/chordino_param_useHMM,
   :dc11/format        "",
   :dc11/title         "HMM (Viterbi decoding)",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "useHMM",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def chordino_param_useNNLS
  {:db/ident           :nnls-chroma/chordino_param_useNNLS,
   :dc11/format        "",
   :dc11/title         "use approximate transcription (NNLS)",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "useNNLS",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def chordino_param_whitening
  {:db/ident           :nnls-chroma/chordino_param_whitening,
   :dc11/format        "",
   :dc11/title         "spectral whitening",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1,
   :vamp/identifier    "whitening",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def library
  "Harmony and chord extraction plugins by Matthias Mauch at C4DM"
  {:db/ident :nnls-chroma/library,
   :dc11/description
   "Harmony and chord extraction plugins by Matthias Mauch at C4DM",
   :dc11/title "Chordino and NNLS Chroma",
   :doap/download-page "http://www.isophonics.net/nnls-chroma",
   :foaf/maker :nnls-chroma/maker,
   :foaf/page ["http://www.matthiasmauch.net/"
               "http://www.omras2.org/"
               "http://www.isophonics.net/nnls-chroma"],
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin
   [:nnls-chroma/tuning :nnls-chroma/nnls-chroma :nnls-chroma/chordino],
   :vamp/has_binary ["win32" "osx"],
   :vamp/has_source true,
   :vamp/identifier "nnls-chroma"})

(def maker
  {:db/ident  :nnls-chroma/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Matthias Mauch",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def nnls-chroma
  "This plugin provides a number of features derived from a DFT-based log-frequency amplitude spectrum: some variants of the log-frequency spectrum, including a semitone spectrum derived from approximate transcription using the NNLS algorithm; and based on this semitone spectrum, different chroma features."
  {:db/ident :nnls-chroma/nnls-chroma,
   :dc11/description
   "This plugin provides a number of features derived from a DFT-based log-frequency amplitude spectrum: some variants of the log-frequency spectrum, including a semitone spectrum derived from approximate transcription using the NNLS algorithm; and based on this semitone spectrum, different chroma features.",
   :dc11/rights "GPL",
   :dc11/title "NNLS Chroma",
   :foaf/maker :nnls-chroma/maker,
   :owl/versionInfo "5",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "nnls-chroma",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "NNLS Chroma",
   :vamp/output [:nnls-chroma/nnls-chroma_output_basschroma
                 :nnls-chroma/nnls-chroma_output_semitonespectrum
                 :nnls-chroma/nnls-chroma_output_chroma
                 :nnls-chroma/nnls-chroma_output_logfreqspec
                 :nnls-chroma/nnls-chroma_output_bothchroma
                 :nnls-chroma/nnls-chroma_output_tunedlogfreqspec],
   :vamp/parameter [:nnls-chroma/nnls-chroma_param_tuningmode
                    :nnls-chroma/nnls-chroma_param_chromanormalize
                    :nnls-chroma/nnls-chroma_param_rollon
                    :nnls-chroma/nnls-chroma_param_whitening
                    :nnls-chroma/nnls-chroma_param_useNNLS
                    :nnls-chroma/nnls-chroma_param_s],
   :vamp/vamp_API_version :vamp/api_version_2})

(def nnls-chroma_output_basschroma
  "Tuning-adjusted bass chromagram from NNLS approximate transcription, with an emphasis on the bass note range."
  {:db/ident :nnls-chroma/nnls-chroma_output_basschroma,
   :dc11/description
   "Tuning-adjusted bass chromagram from NNLS approximate transcription, with an emphasis on the bass note range.",
   :dc11/title "Bass Chromagram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 12,
   :vamp/bin_names ["A" "Bb" "B" "C" "C#" "D" "Eb" "E" "F" "F#" "G" "Ab"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "basschroma",
   :vamp/unit ""})

(def nnls-chroma_output_bothchroma
  "Tuning-adjusted chromagram and bass chromagram (stacked on top of each other) from NNLS approximate transcription."
  {:db/ident :nnls-chroma/nnls-chroma_output_bothchroma,
   :dc11/description
   "Tuning-adjusted chromagram and bass chromagram (stacked on top of each other) from NNLS approximate transcription.",
   :dc11/title "Chromagram and Bass Chromagram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 24,
   :vamp/bin_names ["A  (bass)"
                    "Bb (bass)"
                    "B  (bass)"
                    "C  (bass)"
                    "C# (bass)"
                    "D  (bass)"
                    "Eb (bass)"
                    "E  (bass)"
                    "F  (bass)"
                    "F# (bass)"
                    "G  (bass)"
                    "Ab (bass)"
                    "A"
                    "Bb"
                    "B"
                    "C"
                    "C#"
                    "D"
                    "Eb"
                    "E"
                    "F"
                    "F#"
                    "G"
                    "Ab"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "bothchroma",
   :vamp/unit ""})

(def nnls-chroma_output_chroma
  "Tuning-adjusted chromagram from NNLS approximate transcription, with an emphasis on the medium note range."
  {:db/ident :nnls-chroma/nnls-chroma_output_chroma,
   :dc11/description
   "Tuning-adjusted chromagram from NNLS approximate transcription, with an emphasis on the medium note range.",
   :dc11/title "Chromagram",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 12,
   :vamp/bin_names ["A" "Bb" "B" "C" "C#" "D" "Eb" "E" "F" "F#" "G" "Ab"],
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "chroma",
   :vamp/unit ""})

(def nnls-chroma_output_logfreqspec
  "A Log-Frequency Spectrum (constant Q) that is obtained by cosine filter mapping."
  {:db/ident :nnls-chroma/nnls-chroma_output_logfreqspec,
   :dc11/description
   "A Log-Frequency Spectrum (constant Q) that is obtained by cosine filter mapping.",
   :dc11/title "Log-Frequency Spectrum",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 256,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "logfreqspec",
   :vamp/unit ""})

(def nnls-chroma_output_semitonespectrum
  "A semitone-spaced log-frequency spectrum derived from the third-of-a-semitone-spaced tuned log-frequency spectrum."
  {:db/ident :nnls-chroma/nnls-chroma_output_semitonespectrum,
   :dc11/description
   "A semitone-spaced log-frequency spectrum derived from the third-of-a-semitone-spaced tuned log-frequency spectrum.",
   :dc11/title "Semitone Spectrum",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 84,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "semitonespectrum",
   :vamp/unit ""})

(def nnls-chroma_output_tunedlogfreqspec
  "A Log-Frequency Spectrum (constant Q) that is obtained by cosine filter mapping, then its tuned using the estimated tuning frequency."
  {:db/ident :nnls-chroma/nnls-chroma_output_tunedlogfreqspec,
   :dc11/description
   "A Log-Frequency Spectrum (constant Q) that is obtained by cosine filter mapping, then its tuned using the estimated tuning frequency.",
   :dc11/title "Tuned Log-Frequency Spectrum",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 256,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tunedlogfreqspec",
   :vamp/unit ""})

(def nnls-chroma_param_chromanormalize
  {:db/ident           :nnls-chroma/nnls-chroma_param_chromanormalize,
   :dc11/format        "",
   :dc11/title         "chroma normalization",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "chromanormalize",
   :vamp/max_value     3,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["none" "maximum norm" "L1 norm" "L2 norm"]})

(def nnls-chroma_param_rollon
  {:db/ident           :nnls-chroma/nnls-chroma_param_rollon,
   :dc11/format        "",
   :dc11/title         "spectral roll-on",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "rollon",
   :vamp/max_value     5,
   :vamp/min_value     0,
   :vamp/quantize_step 0.5M,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def nnls-chroma_param_s
  {:db/ident           :nnls-chroma/nnls-chroma_param_s,
   :dc11/format        "",
   :dc11/title         "spectral shape",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.7M,
   :vamp/identifier    "s",
   :vamp/max_value     0.9M,
   :vamp/min_value     0.5M,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def nnls-chroma_param_tuningmode
  {:db/ident           :nnls-chroma/nnls-chroma_param_tuningmode,
   :dc11/format        "",
   :dc11/title         "tuning mode",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "tuningmode",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["global tuning" "local tuning"]})

(def nnls-chroma_param_useNNLS
  {:db/ident           :nnls-chroma/nnls-chroma_param_useNNLS,
   :dc11/format        "",
   :dc11/title         "use approximate transcription (NNLS)",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "useNNLS",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def nnls-chroma_param_whitening
  {:db/ident           :nnls-chroma/nnls-chroma_param_whitening,
   :dc11/format        "",
   :dc11/title         "spectral whitening",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1,
   :vamp/identifier    "whitening",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tuning
  "The tuning plugin can estimate the local and global tuning of piece. The same tuning method is used for the NNLS Chroma and Chordino plugins."
  {:db/ident :nnls-chroma/tuning,
   :dc11/description
   "The tuning plugin can estimate the local and global tuning of piece. The same tuning method is used for the NNLS Chroma and Chordino plugins.",
   :dc11/rights "GPL",
   :dc11/title "Tuning",
   :foaf/maker :nnls-chroma/maker,
   :owl/versionInfo "5",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tuning",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Tuning",
   :vamp/output [:nnls-chroma/tuning_output_tuning
                 :nnls-chroma/tuning_output_localtuning],
   :vamp/parameter :nnls-chroma/tuning_param_rollon,
   :vamp/vamp_API_version :vamp/api_version_2})

(def tuning_output_localtuning
  "Returns a tuning estimate at every analysis frame, an average of the (recent) previous frame-wise estimates of the concert pitch in Hz."
  {:db/ident :nnls-chroma/tuning_output_localtuning,
   :dc11/description
   "Returns a tuning estimate at every analysis frame, an average of the (recent) previous frame-wise estimates of the concert pitch in Hz.",
   :dc11/title "Local Tuning",
   :rdf/type [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "localtuning",
   :vamp/max_value 452.89M,
   :vamp/min_value 427.47M,
   :vamp/unit "Hz"})

(def tuning_output_tuning
  "Returns a single label (at time 0 seconds) containing an estimate of the concert pitch in Hz."
  {:db/ident :nnls-chroma/tuning_output_tuning,
   :dc11/description
   "Returns a single label (at time 0 seconds) containing an estimate of the concert pitch in Hz.",
   :dc11/title "Tuning",
   :rdf/type [:vamp/KnownExtentsOutput :vamp/SparseOutput],
   :vamp/bin_count 0,
   :vamp/computes_event_type :af/MusicSegment,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tuning",
   :vamp/max_value 452.89M,
   :vamp/min_value 427.47M,
   :vamp/sample_rate 2.38221E-44,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "Hz"})

(def tuning_param_rollon
  {:db/ident           :nnls-chroma/tuning_param_rollon,
   :dc11/format        "",
   :dc11/title         "spectral roll-on",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "rollon",
   :vamp/max_value     5,
   :vamp/min_value     0,
   :vamp/quantize_step 0.5M,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})