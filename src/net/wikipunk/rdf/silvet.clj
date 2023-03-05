(ns net.wikipunk.rdf.silvet
  "http://vamp-plugins.org/rdf/plugins/silvet"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/silvet",
   :rdf/ns-prefix-map {"af"     "http://purl.org/ontology/af/",
                       "cc"     "http://web.resource.org/cc/",
                       "dc11"   "http://purl.org/dc/elements/1.1/",
                       "doap"   "http://usefulinc.com/ns/doap#",
                       "foaf"   "http://xmlns.com/foaf/0.1/",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "silvet" "http://vamp-plugins.org/rdf/plugins/silvet#",
                       "vamp"   "http://purl.org/ontology/vamp/",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "silvet",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/silvet"})

(def library
  "Silvet, or Shift-Invariant Latent Variable Transcription, is a Vamp plugin for polyphonic music transcription (from audio to note times and pitches)."
  {:db/ident :silvet/library,
   :dc11/description
   "Silvet, or Shift-Invariant Latent Variable Transcription, is a Vamp plugin for polyphonic music transcription (from audio to note times and pitches).",
   :dc11/title "Silvet Note Transcription",
   :doap/download-page "http://code.soundsoftware.ac.uk/projects/silvet/files",
   :foaf/maker :silvet/library_maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/silvet",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :silvet/silvet,
   :vamp/identifier "silvet"})

(def library_maker
  {:db/ident  :silvet/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Queen Mary, University of London",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def silvet
  "Estimate the note onsets, pitches, and durations that make up a music recording."
  {:db/ident :silvet/silvet,
   :dc11/description
   "Estimate the note onsets, pitches, and durations that make up a music recording.",
   :dc11/rights
   "Method by Emmanouil Benetos and Simon Dixon; plugin by Chris Cannam and Emmanouil Benetos. GPL licence.",
   :dc11/title "Silvet Note Transcription",
   :foaf/maker :silvet/library_maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "silvet",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Silvet Note Transcription",
   :vamp/output [:silvet/silvet_output_timefreq
                 :silvet/silvet_output_onoffsets
                 :silvet/silvet_output_onsets
                 :silvet/silvet_output_pitchactivation
                 :silvet/silvet_output_templates
                 :silvet/silvet_output_chroma
                 :silvet/silvet_output_notes],
   :vamp/parameter [:silvet/silvet_param_mode
                    :silvet/silvet_param_instrument
                    :silvet/silvet_param_finetune],
   :vamp/vamp_API_version :vamp/api_version_2})

(def silvet_output_chroma
  "Pitch chroma distribution formed by wrapping the un-thresholded pitch activation distribution into a single octave of semitone bins."
  {:db/ident :silvet/silvet_output_chroma,
   :dc11/description
   "Pitch chroma distribution formed by wrapping the un-thresholded pitch activation distribution into a single octave of semitone bins.",
   :dc11/title "Pitch chroma distribution",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 12,
   :vamp/computes_signal_type :af/Chromagram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "chroma",
   :vamp/unit ""})

(def silvet_output_notes
  "Overall note transcription. Each note has time, duration, estimated fundamental frequency, and a synthetic MIDI velocity (1-127) estimated from the strength of the pitch in the mixture."
  {:db/ident :silvet/silvet_output_notes,
   :dc11/description
   "Overall note transcription. Each note has time, duration, estimated fundamental frequency, and a synthetic MIDI velocity (1-127) estimated from the strength of the pitch in the mixture.",
   :dc11/title "Note transcription",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 2,
   :vamp/bin_names ["Frequency" "Velocity"],
   :vamp/computes_event_type :af/Note,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "notes",
   :vamp/sample_rate 711,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "Hz"})

(def silvet_output_onoffsets
  "Note onsets and offsets as separate events. Each onset event has time, estimated fundamental frequency in Hz, and a synthetic MIDI velocity (1-127) estimated from the strength of the pitch in the mixture. Offsets are represented in the same way but with a velocity of 0."
  {:db/ident :silvet/silvet_output_onoffsets,
   :dc11/description
   "Note onsets and offsets as separate events. Each onset event has time, estimated fundamental frequency in Hz, and a synthetic MIDI velocity (1-127) estimated from the strength of the pitch in the mixture. Offsets are represented in the same way but with a velocity of 0.",
   :dc11/title "Note onsets and offsets",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 2,
   :vamp/bin_names ["Frequency" "Velocity"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier "onoffsets",
   :vamp/sample_rate 711,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "Hz"})

(def silvet_output_onsets
  "Note onsets, without durations. These can be calculated sooner than complete notes, because it isn't necessary to wait for a note to finish before returning its feature. Each event has time, estimated fundamental frequency in Hz, and a synthetic MIDI velocity (1-127) estimated from the strength of the pitch in the mixture."
  {:db/ident :silvet/silvet_output_onsets,
   :dc11/description
   "Note onsets, without durations. These can be calculated sooner than complete notes, because it isn't necessary to wait for a note to finish before returning its feature. Each event has time, estimated fundamental frequency in Hz, and a synthetic MIDI velocity (1-127) estimated from the strength of the pitch in the mixture.",
   :dc11/title "Note onsets",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 2,
   :vamp/bin_names ["Frequency" "Velocity"],
   :vamp/computes_event_type :af/Onset,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "onsets",
   :vamp/sample_rate 711,
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit "Hz"})

(def silvet_output_pitchactivation
  "Pitch activation distribution resulting from expectation-maximisation algorithm, prior to note extraction."
  {:db/ident :silvet/silvet_output_pitchactivation,
   :dc11/description
   "Pitch activation distribution resulting from expectation-maximisation algorithm, prior to note extraction.",
   :dc11/title "Pitch activation distribution",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 88,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "pitchactivation",
   :vamp/unit ""})

(def silvet_output_templates
  "Constant-Q spectral templates for the selected instrument pack."
  {:db/ident :silvet/silvet_output_templates,
   :dc11/description
   "Constant-Q spectral templates for the selected instrument pack.",
   :dc11/title "Templates",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 545,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "templates",
   :vamp/unit ""})

(def silvet_output_timefreq
  "Filtered constant-Q time-frequency distribution as used as input to the expectation-maximisation algorithm."
  {:db/ident :silvet/silvet_output_timefreq,
   :dc11/description
   "Filtered constant-Q time-frequency distribution as used as input to the expectation-maximisation algorithm.",
   :dc11/title "Time-frequency distribution",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 545,
   :vamp/computes_signal_type :af/Spectrogram,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "timefreq",
   :vamp/unit ""})

(def silvet_param_finetune
  {:db/ident           :silvet/silvet_param_finetune,
   :dc11/format        "",
   :dc11/title         "Return fine pitch estimates",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "finetune",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def silvet_param_instrument
  {:db/ident           :silvet/silvet_param_instrument,
   :dc11/format        "",
   :dc11/title         "Instrument",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "instrument",
   :vamp/max_value     13,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Multiple or unknown instruments"
                        "Piano"
                        "Guitar"
                        "Violin"
                        "Viola"
                        "Cello"
                        "Horn"
                        "Flute"
                        "Oboe"
                        "Clarinet"
                        "Tenor Sax"
                        "Bassoon"
                        "String quartet"
                        "Wind ensemble"]})

(def silvet_param_mode
  {:db/ident           :silvet/silvet_param_mode,
   :dc11/format        "",
   :dc11/title         "Processing mode",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "mode",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Live (faster and lower latency)"
                        "Intensive (higher quality)"]})