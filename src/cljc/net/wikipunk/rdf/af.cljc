(ns net.wikipunk.rdf.af
  "The Audio Features ontology"
  {:dc11/creator "http://moustaki.org/foaf.rdf#moustaki",
   :dc11/date "$Date: 2008/06/23 10:24:13 $",
   :dc11/description
   "\n\t\tThis ontology expresses some common concepts\n\t\tto represent automatically extracted features\n\t\tfrom audio signals. Therefore, it mainly relies \n\t\ton the Event ontology, in order to classify particular\n\t\tparts of the timeline backing an audio signal. \n\t\t\n\t\tPrograms outputting RDF according to this ontology should \n\t\talso describe the ouputted document to express some information\n\t\tabout itself (estimated confidence, maintainer of the program, etc.)\n\t\t",
   :dc11/title "The Audio Features ontology",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/af/versions/2008-06-23.n3",
   :foaf/maker "http://moustaki.org/foaf.rdf#moustaki",
   :owl/versionInfo "Revision: 1.1",
   :rdf/ns-prefix-map {"af"    "http://purl.org/ontology/af/",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "mo"    "http://purl.org/ontology/mo/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "time"  "http://www.w3.org/2006/time#",
                       "tl"    "http://purl.org/NET/c4dm/timeline.owl#",
                       "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "af",
   :rdfa/uri "http://www.w3.org/1999/02/22-rdf-syntax-ns",
   :rdfs/label "The Audio Features ontology"}
  (:refer-clojure :exclude [key]))

(def Amplitude
  "Result of an amplitude following process"
  {:db/ident        :af/Amplitude,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tResult of an amplitude following process\n\t",
   :rdfs/label      "Amplitude",
   :rdfs/subClassOf :af/Signal,
   :vs/term_status  "testing"})

(def Beat
  "A beat event (instantaneous)"
  {:db/ident        :af/Beat,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A beat event (instantaneous)",
   :rdfs/label      "Beat event",
   :rdfs/subClassOf :af/Point,
   :vs/term_status  "testing"})

(def ChordSegment
  "A classifier for chords. Equivalent concept as the one in the Chord ontology."
  {:db/ident :af/ChordSegment,
   :owl/equivalentClass :chord/ChordEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for chords. Equivalent concept as the one\n\t\tin the Chord ontology.\n\t",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status "testing"})

(def Chromagram
  "A chromagram feature."
  {:db/ident        :af/Chromagram,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tA chromagram feature.\n\t",
   :rdfs/label      "Chromagram",
   :rdfs/subClassOf :af/Signal,
   :vs/term_status  "testing"})

(def DetectionFunction
  "A detection function."
  {:db/ident        :af/DetectionFunction,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tA detection function.\n\t",
   :rdfs/label      "Detection function",
   :rdfs/subClassOf :af/Signal,
   :vs/term_status  "testing"})

(def EmotionSegment
  "A classifier for emotional content"
  {:db/ident        :af/EmotionSegment,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tA classifier for emotional content\n\t\t",
   :rdfs/label      "Emotion segment",
   :rdfs/subClassOf :af/SpeechSegment,
   :vs/term_status  "testing"})

(def EnglishIdiom
  "English idiom"
  {:db/ident       :af/EnglishIdiom,
   :rdf/type       :owl/Class,
   :rdfs/comment   "\n\t\tEnglish idiom\n\t\t",
   :rdfs/label     "English idiom",
   :vs/term_status "testing"})

(def GermanIdiom
  "German idiom"
  {:db/ident       :af/GermanIdiom,
   :rdf/type       :owl/Class,
   :rdfs/comment   "\n\t\tGerman idiom\n\t\t",
   :rdfs/label     "German idiom",
   :vs/term_status "testing"})

(def HungarianIdiom
  "Hungarian idiom"
  {:db/ident       :af/HungarianIdiom,
   :rdf/type       :owl/Class,
   :rdfs/comment   "Hungarian idiom",
   :rdfs/label     "Hungarian idiom",
   :vs/term_status "testing"})

(def Idiom
  "Idiom (English with Irish accent, Austrian German, etc.)"
  {:db/ident :af/Idiom,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tIdiom (English with Irish accent, Austrian German, etc.)\n\t\t",
   :rdfs/label "Idiom",
   :vs/term_status "testing"})

(def IdiomSegment
  "A classifier for recognized idiom (English with Irish accent, etc.)"
  {:db/ident :af/IdiomSegment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for recognized idiom (English with Irish accent, etc.)\n\t\t",
   :rdfs/label "Idiom segment",
   :rdfs/subClassOf :af/SpeechSegment,
   :vs/term_status "testing"})

(def KeyChange
  "A key change event. The factor of such an event captures the key that holds after that event."
  {:db/ident :af/KeyChange,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A key change event. The factor of such an event captures the key that holds after that event.",
   :rdfs/label "Key change event",
   :rdfs/subClassOf :af/Point,
   :vs/term_status "testing"})

(def KeySegment
  "A classifier for keys. In case of a \"clean cut\", instances of such events should have one factor: the detected key (perhaps using the key ontology at http://purl.org/NET/c4dm/keys.owl). In other cases, we can put several keys as a factor, maybe with different confidence factors, using event decomposition."
  {:db/ident :af/KeySegment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for keys.\n\t\tIn case of a \"clean cut\", instances of such events\n\t\tshould have one factor: the detected key (perhaps using the\n\t\tkey ontology at http://purl.org/NET/c4dm/keys.owl).\n\t\tIn other cases, we can put several keys as a factor, maybe with different confidence\n\t\tfactors, using event decomposition.\n\t\t",
   :rdfs/label "Key event",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status "testing"})

(def Laugh
  "A classifier for laugh content"
  {:db/ident        :af/Laugh,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tA classifier for laugh content\n\t\t",
   :rdfs/label      "Laugh",
   :rdfs/subClassOf :af/SpeechSegment,
   :vs/term_status  "testing"})

(def LinearFrequencyCentroid
  "Log-frequency spectral centroid"
  {:db/ident        :af/LinearFrequencyCentroid,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tLog-frequency spectral centroid\n\t",
   :rdfs/label      "Linear-frequency spectral centroid",
   :rdfs/subClassOf :af/SpectralCentroid,
   :vs/term_status  "testing"})

(def LogFrequencyCentroid
  "Log-frequency spectral centroid"
  {:db/ident        :af/LogFrequencyCentroid,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tLog-frequency spectral centroid\n\t",
   :rdfs/label      "Log-frequency spectral centroid",
   :rdfs/subClassOf :af/SpectralCentroid,
   :vs/term_Status  "testing"})

(def Loudness
  "Event holding a loudness value"
  {:db/ident        :af/Loudness,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Event holding a loudness value",
   :rdfs/label      "Loudness event",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status  "testing"})

(def Major
  "A classifier for a major mode region. In case of a \"clean cut\", instances of such events have one factor. In other cases, this event can have several factors, each associated with a particular confidence using event decomposition."
  {:db/ident :af/Major,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for a major mode region.\n\t\tIn case of a \"clean cut\", instances of such events have one\n                factor. In other cases, this event can have several factors, each associated\n                with a particular confidence using event decomposition.\n\t",
   :rdfs/label "Major segment",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status "testing"})

(def Minor
  "A classifier for a minor mode region. In case of a \"clean cut\", instances of such events have one factor. In other cases, this event can have several factors, each associated with a particular confidence using event decomposition."
  {:db/ident :af/Minor,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for a minor mode region.\n\t\tIn case of a \"clean cut\", instances of such events have one\n                factor. In other cases, this event can have several factors, each associated\n                with a particular confidence using event decomposition.\n\t",
   :rdfs/label "Minor segment",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status "testing"})

(def ModeChange
  "A mode change event. The factors of such events include the mode that holds after the event."
  {:db/ident :af/ModeChange,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A mode change event. The factors of such events include the mode that holds after the event.",
   :rdfs/label "Mode change event",
   :rdfs/subClassOf :af/Point,
   :vs/term_status "testing"})

(def MusicSegment
  "A classifier capturing the notion of an audio segment holding music. This classifier can be subsumed with more specific classifiers."
  {:db/ident :af/MusicSegment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier capturing the notion of an audio segment holding music.\n\t\tThis classifier can be subsumed with more specific classifiers.\n\t\t",
   :rdfs/label "Music",
   :rdfs/subClassOf :af/StructuralSegment,
   :vs/term_status "testing"})

(def MusicStructuralSegment
  "Classifier capturing the notion of chorus, verse, intro, bridge, phrase, etc."
  {:db/ident :af/MusicStructuralSegment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tClassifier capturing the notion of chorus, verse, intro, bridge, phrase, etc.\n\t\t",
   :rdfs/label "Music structural segment",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status "testing"})

(def NonTonalOnset
  "A percussive onset"
  {:db/ident        :af/NonTonalOnset,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A percussive onset",
   :rdfs/label      "Percussive onset",
   :rdfs/subClassOf :af/Onset,
   :vs/term_status  "testing"})

(def Onset
  "A classifier corresponding to the output of an onset detection process."
  {:db/ident :af/Onset,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier corresponding to the output of an onset detection process.\n\t\t",
   :rdfs/label "Onset",
   :rdfs/subClassOf :af/Point,
   :vs/term_status "testing"})

(def OnsetDetectionFunction
  "An onset detection function"
  {:db/ident        :af/OnsetDetectionFunction,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tAn onset detection function\n\t",
   :rdfs/label      "Onset detection function",
   :rdfs/subClassOf :af/DetectionFunction,
   :vs/term_status  "testing"})

(def Ornament
  "Classifying a temporal region holding a musical ornament"
  {:db/ident        :af/Ornament,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Classifying a temporal region holding a musical ornament",
   :rdfs/label      "Ornament event",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status  "testing"})

(def PersonSpeaking
  "A classifier associating a FOAF description to a particular segment (to classify genre, recognized speaker, etc.)"
  {:db/ident :af/PersonSpeaking,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\t\tA classifier associating a FOAF description to a particular segment \n\t\t\t(to classify genre, recognized speaker, etc.)\n\t\t\t",
   :rdfs/label "Person speaking",
   :rdfs/subClassOf :af/SpeechSegment,
   :vs/term_status "testing"})

(def Pitch
  "Associate a point to a particular pitch Event holding a pitch value (for example coming from a monophonic transcription process)"
  {:db/ident :af/Pitch,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Associate a point to a particular pitch"
    "Event holding a pitch value (for example coming from a monophonic transcription process)"],
   :rdfs/label "Pitch event",
   :rdfs/subClassOf [:af/Point :af/MusicSegment],
   :vs/term_status "testing"})

(def Point
  "A classifier for instants corresponding to the output of an automatic process---an artificial cognitive agent (should be associated to a time:Instant---DL version)."
  {:db/ident :af/Point,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for instants corresponding to the output of an automatic process---an\n\t\tartificial cognitive agent (should be associated to a time:Instant---DL version).\n\t\t",
   :rdfs/label "Point",
   :rdfs/subClassOf [{:owl/onProperty     :event/time,
                      :owl/someValuesFrom :tl/Instant,
                      :rdf/type           :owl/Restriction}
                     :event/Event],
   :vs/term_status "testing"})

(def Segment
  "A classifier for a temporal region corresponding to the output of an automatic process---an artificial cognitive agent."
  {:db/ident :af/Segment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for a temporal region corresponding to the output\n\t\tof an automatic process---an artificial cognitive agent.\n\t\t",
   :rdfs/label "Segment",
   :rdfs/subClassOf [{:owl/onProperty     :event/time,
                      :owl/someValuesFrom :tl/Interval,
                      :rdf/type           :owl/Restriction}
                     :event/Event],
   :vs/term_status "testing"})

(def Signal
  "A signal-like feature, holding dense data describing another signal. Examples of signal features include chromagrams, spectrograms, onset detection functions etc."
  {:db/ident :af/Signal,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA signal-like feature, holding dense data describing another signal.\n\t\tExamples of signal features include chromagrams, spectrograms, onset detection functions etc.\n\t",
   :rdfs/label "Signal-level feature",
   :rdfs/subClassOf :mo/Signal,
   :vs/term_status "testing"})

(def SpectralCentroid
  "Spectral centroid"
  {:db/ident        :af/SpectralCentroid,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tSpectral centroid\n\t",
   :rdfs/label      "Spectral centroid",
   :rdfs/subClassOf :af/Signal,
   :vs/term_status  "testing"})

(def SpeechSegment
  "A classifier capturing the notion of an audio segment holding speech content"
  {:db/ident :af/SpeechSegment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier capturing the notion of an audio segment holding speech\n\t\tcontent\n\t\t",
   :rdfs/label "Speech",
   :rdfs/subClassOf :af/StructuralSegment,
   :vs/term_status "testing"})

(def StructuralSegment
  "A classifier trying to capture the notion of structure in an audio piece. This classifier should be subsumed by more specific classifiers: speech/music segmentation, structural music segmmentation (intro, verse, chorus, etc.)."
  {:db/ident :af/StructuralSegment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier trying to capture the notion of structure in an audio piece.\n\t\tThis classifier should be subsumed by more specific classifiers: speech/music\n\t\tsegmentation, structural music segmmentation (intro, verse, chorus, etc.).\n\t\t",
   :rdfs/label "Structural Segment",
   :rdfs/subClassOf :af/Segment,
   :vs/term_status "testing"})

(def Tempo
  "Event holding a tempo value (120bpm...)"
  {:db/ident        :af/Tempo,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Event holding a tempo value (120bpm...)",
   :rdfs/label      "Tempo event",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status  "testing"})

(def TempoDetectionFunction
  "A tempo detection function"
  {:db/ident        :af/TempoDetectionFunction,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tA tempo detection function\n\t",
   :rdfs/label      "Tempo detection function",
   :rdfs/subClassOf :af/DetectionFunction,
   :vs/term_status  "testing"})

(def Text
  "A classifier allowing to associate some text to a segment"
  {:db/ident :af/Text,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier allowing to associate some text to a segment\n\t\t",
   :rdfs/label "Text",
   :rdfs/subClassOf :af/SpeechSegment,
   :vs/term_status "testing"})

(def TimeSignature
  "Classifying a temporal region with a particular time signature (what? there is something else than 4/4?? :-)"
  {:db/ident :af/TimeSignature,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Classifying a temporal region with a particular time signature (what? there is something else than 4/4?? :-)",
   :rdfs/label "Time signature",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status "testing"})

(def TonalChange
  "A tonal change event."
  {:db/ident        :af/TonalChange,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tonal change event.",
   :rdfs/label      "Tonal change event",
   :rdfs/subClassOf :af/Point,
   :vs/term_status  "testing"})

(def TonalChangeDetectionFunction
  "A tonal change detection function"
  {:db/ident        :af/TonalChangeDetectionFunction,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tA tonal change detection function\n\t",
   :rdfs/label      "Tonal change detection function",
   :rdfs/subClassOf :af/DetectionFunction,
   :vs/term_status  "testing"})

(def TonalContentSpace
  "A 6-D tonal content space"
  {:db/ident        :af/TonalContentSpace,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tA 6-D tonal content space\n\t",
   :rdfs/label      "Tonal content space",
   :rdfs/subClassOf :af/Signal,
   :vs/term_status  "testing"})

(def TonalOnset
  "A pitched onset"
  {:db/ident        :af/TonalOnset,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A pitched onset",
   :rdfs/label      "Pitched onset",
   :rdfs/subClassOf :af/Onset,
   :vs/term_status  "testing"})

(def TonicChange
  "A tonic change event. The factors of such events include the tonic that holds after the event."
  {:db/ident :af/TonicChange,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tonic change event. The factors of such events include the tonic that holds after the event.",
   :rdfs/label "Tonic change event",
   :rdfs/subClassOf :af/Point,
   :vs/term_status "testing"})

(def TonicSegment
  "A classifier for tonics. In case of a \"clean cut\", instances of such events have one factor. In other cases, this event can have several factors, each associated with a particular confidence using event decomposition."
  {:db/ident :af/TonicSegment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tA classifier for tonics.\n\t\tIn case of a \"clean cut\", instances of such events have one\n\t\tfactor. In other cases, this event can have several factors, each associated\n\t\twith a particular confidence using event decomposition.\t\n\t",
   :rdfs/label "Tonic event",
   :rdfs/subClassOf :af/MusicSegment,
   :vs/term_status "testing"})

(def ZeroCrossing
  "Classifier for a zero-crossing point"
  {:db/ident        :af/ZeroCrossing,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Classifier for a zero-crossing point",
   :rdfs/label      "Zero crossing",
   :rdfs/subClassOf :af/Point,
   :vs/term_status  "testing"})

(def ZeroCrossingCount
  "Zero-crossing counts"
  {:db/ident        :af/ZeroCrossingCount,
   :rdf/type        :owl/Class,
   :rdfs/comment    "\n\t\tZero-crossing counts\n\t",
   :rdfs/label      "Zero-crossing counts",
   :rdfs/subClassOf :af/Signal,
   :vs/term_status  "testing"})

(def austrian_german
  {:db/ident       :af/austrian_german,
   :dc11/title     "Austrian German",
   :rdf/type       :af/GermanIdiom,
   :vs/term_status "testing"})

(def confidence
  "A really generic property, allowing to associate a confidence to a document or to a particular resource (such as an automatically detected segment)"
  {:db/ident :af/confidence,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   "\n\t\tA really generic property, allowing to associate a confidence to a document or to a particular\n\t\tresource (such as an automatically detected segment)\n\t\t",
   :rdfs/label "confidence",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "testing"})

(def dimensions
  "Associates a signal with its dimensions, eg. \"12 3546\". Equivalent to the mpeg7:dim attribute of the mpeg7:Raw element."
  {:db/ident :af/dimensions,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n\t\tAssociates a signal with its dimensions, eg. \"12 3546\". Equivalent to the mpeg7:dim attribute of the mpeg7:Raw\n\t\telement.\n\t",
   :rdfs/domain :af/Signal,
   :rdfs/label "dimensions",
   :vs/term_status "testing"})

(def emotional_intensity
  "Associates an \"emotional intensity\" value to a segment detected as being \"emotional\""
  {:db/ident :af/emotional_intensity,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   "\n\t\tAssociates an \"emotional intensity\" value to a \n\t\tsegment detected as being \"emotional\"\n\t\t",
   :rdfs/domain :af/EmotionSegment,
   :rdfs/label "emotional intensity",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "testing"})

(def english_irish_accent
  {:db/ident       :af/english_irish_accent,
   :dc11/title     "English with an Irish accent",
   :rdf/type       :af/EnglishIdiom,
   :vs/term_status "testing"})

(def english_scottish_accent
  {:db/ident       :af/english_scottish_accent,
   :dc11/title     "English with a Scottish accent",
   :rdf/type       :af/EnglishIdiom,
   :vs/term_status "testing"})

(def feature
  "Associates a segment classifying a feature to the actual feature---we should use mpeg7 sort-of datatypes here"
  {:db/ident :af/feature,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   "\n\t\tAssociates a segment classifying a feature to the actual feature---we should use mpeg7 sort-of datatypes here\n\t\t",
   :rdfs/domain :af/Segment,
   :rdfs/label "feature",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :event/literal_factor,
   :vs/term_status "testing"})

(def idiom
  "Associates a segment which classify an idiom (English with Irish accent, etc.) to an actual idiom"
  {:db/ident :af/idiom,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   "\n\t\tAssociates a segment which classify an idiom (English with Irish accent, etc.) to an actual idiom\n\t\t",
   :rdfs/domain :af/IdiomSegment,
   :rdfs/range :af/Idiom,
   :rdfs/subPropertyOf :event/hasLiteralFactor,
   :vs/term_status "testing"})

(def key
  "Associates a key event to the corresponding key"
  {:db/ident           :af/key,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Associates a key event to the corresponding key",
   :rdfs/domain        :af/KeySegment,
   :rdfs/label         "key",
   :rdfs/range         :owl/Thing,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status     "testing"})

(def new_key
  "Associates a key change event to the new key, holding after the change"
  {:db/ident :af/new_key,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a key change event to the new key, holding after the change",
   :rdfs/domain :af/KeyChange,
   :rdfs/label "new key",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status "testing"})

(def new_mode
  "Mode that holds after the mode change event"
  {:db/ident           :af/new_mode,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Mode that holds after the mode change event",
   :rdfs/domain        :af/ModeChangeEvent,
   :rdfs/label         "new mode",
   :rdfs/range         :owl/Thing,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status     "testing"})

(def new_tonic
  "Tonic that holds after the tonic change event"
  {:db/ident           :af/new_tonic,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Tonic that holds after the tonic change event",
   :rdfs/domain        :af/TonicChangeEvent,
   :rdfs/label         "new tonic",
   :rdfs/range         :owl/Thing,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status     "testing"})

(def person
  "Associates a segment classified as holding speech content to a FOAF profile (maybe holding information about genre, recognized speaker URI, etc.)"
  {:db/ident :af/person,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   "\n\t\tAssociates a segment classified as holding speech content to a FOAF\n\t\tprofile (maybe holding information about genre, recognized speaker URI, etc.)\n\t\t",
   :rdfs/domain :af/PersonSegment,
   :rdfs/label "person",
   :rdfs/range :foaf/Person,
   :vs/term_status "testing"})

(def pitch
  "Associates a pitch event to the corresponding pitch"
  {:db/ident :af/pitch,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n\t\tAssociates a pitch event to the corresponding pitch\n\t",
   :rdfs/domain :af/Pitch,
   :rdfs/label "pitch",
   :rdfs/subPropertyOf :af/feature,
   :vs/term_status "testing"})

(def signal_feature
  "Associates an audio signal with a track-level signal feature. eg. a spectrogram, a chromagram, an onset detection function."
  {:db/ident :af/signal_feature,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n\t\tAssociates an audio signal with a track-level signal feature.\n\t\teg. a spectrogram, a chromagram, an onset detection function.\n\t",
   :rdfs/domain :mo/Signal,
   :rdfs/label "signal-level feature",
   :rdfs/range :af/Signal,
   :vs/term_status "testing"})

(def standard_british_english
  {:db/ident       :af/standard_british_english,
   :dc11/title     "Standard British English",
   :rdf/type       :af/EnglishIdiom,
   :vs/term_status "testing"})

(def standard_german
  {:db/ident       :af/standard_german,
   :dc11/title     "Standard German",
   :rdf/type       :af/GermanIdiom,
   :vs/term_status "testing"})

(def standard_hungarian
  {:db/ident       :af/standard_hungarian,
   :dc11/title     "Standard Hungarian",
   :rdf/type       :af/HungarianIdiom,
   :vs/term_status "testing"})

(def standard_us_english
  {:db/ident       :af/standard_us_english,
   :dc11/title     "Standard US English",
   :rdf/type       :af/EnglishIdiom,
   :vs/term_status "testing"})

(def swiss_german
  {:db/ident       :af/swiss_german,
   :dc11/title     "Swiss German",
   :rdf/type       :af/GermanIdiom,
   :vs/term_status "testing"})

(def tempo
  "Associates a tempo event to the corresponding tempo value."
  {:db/ident :af/tempo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n\t\tAssociates a tempo event to the corresponding tempo value.\n\t",
   :rdfs/domain :af/Tempo,
   :rdfs/label "tempo",
   :rdfs/subPropertyOf :af/feature,
   :vs/term_status "testing"})

(def text
  "Relates a Text segment (classifying a time interval that can be associated to some text) to a text string or other literals (number, etc.)"
  {:db/ident :af/text,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   "\n\t\tRelates a Text segment (classifying a time interval that can \n\t\tbe associated to some text) to a text string or other literals (number, etc.)\n\t\t",
   :rdfs/domain :af/Text,
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :event/hasLiteralFactor,
   :vs/term_status "testing"})

(def tonic
  "Associates a tonic event with the corresponding tonic"
  {:db/ident           :af/tonic,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Associates a tonic event with the corresponding tonic",
   :rdfs/domain        :af/TonicSegment,
   :rdfs/label         "tonic",
   :rdfs/range         :owl/Thing,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status     "testing"})

(def value
  "Associates a signal resource as defined in the Music Ontology to a literal: its actual value. For example, it can be used to link an onset detection function to a list of values."
  {:db/ident :af/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n\t\tAssociates a signal resource as defined in the Music Ontology to a literal: its actual value.\n\t\tFor example, it can be used to link an onset detection function to a list of values.\n\t",
   :rdfs/domain :af/Signal,
   :rdfs/label "value",
   :rdfs/subPropertyOf :rdf/value,
   :vs/term_status "testing"})

(def ^{:private true} term_status
  {:db/ident :vs/term_status,
   :rdf/type :owl/AnnotationProperty})