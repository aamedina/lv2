(ns net.wikipunk.rdf.lv2.midi
  "A normalised definition of raw MIDI."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.ttl",
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.atom" "http://lv2plug.in/ns/ext/atom#",
                       "lv2.ev"   "http://lv2plug.in/ns/ext/event#",
                       "lv2.midi" "http://lv2plug.in/ns/ext/midi#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.midi",
   :rdfa/uri "http://lv2plug.in/ns/ext/midi",
   :rdfs/comment "A normalised definition of raw MIDI.",
   :rdfs/label "LV2 MIDI",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.meta.ttl"]}
  (:refer-clojure :exclude [binding chunk]))

(def ActiveSense
  "MIDI active sense message."
  {:db/ident        :lv2.midi/ActiveSense,
   :lv2.midi/status [-2],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI active sense message.",
   :rdfs/label      "Active Sense",
   :rdfs/subClassOf :lv2.midi/SystemRealtime})

(def Aftertouch
  "MIDI aftertouch message."
  {:db/ident            :lv2.midi/Aftertouch,
   :lv2.midi/chunk      [{:lv2.midi/byteNumber 1,
                          :lv2.midi/property   :lv2.midi/pressure}
                         {:lv2.midi/byteNumber 0,
                          :lv2.midi/property   :lv2.midi/noteNumber}],
   :lv2.midi/statusMask [-96],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI aftertouch message.",
   :rdfs/label          "Aftertouch",
   :rdfs/subClassOf     :lv2.midi/VoiceMessage})

(def Bender
  "MIDI bender message."
  {:db/ident            :lv2.midi/Bender,
   :lv2.midi/chunk      {:lv2.midi/byteNumber [1 0],
                         :lv2.midi/property   :lv2.midi/benderValue},
   :lv2.midi/statusMask [-32],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI bender message.",
   :rdfs/label          "Bender",
   :rdfs/subClassOf     :lv2.midi/VoiceMessage})

(def ChannelPressure
  "MIDI channel pressure message."
  {:db/ident            :lv2.midi/ChannelPressure,
   :lv2.midi/chunk      {:lv2.midi/byteNumber 0,
                         :lv2.midi/property   :lv2.midi/pressure},
   :lv2.midi/statusMask [-48],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI channel pressure message.",
   :rdfs/label          "Channel Pressure",
   :rdfs/subClassOf     :lv2.midi/VoiceMessage})

(def Chunk
  "A sequence of contiguous bytes in a MIDI message."
  {:db/ident     :lv2.midi/Chunk,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A sequence of contiguous bytes in a MIDI message.",
   :rdfs/label   "Chunk"})

(def Clock
  "MIDI clock message."
  {:db/ident        :lv2.midi/Clock,
   :lv2.midi/status [-8],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI clock message.",
   :rdfs/label      "Clock",
   :rdfs/subClassOf :lv2.midi/SystemRealtime})

(def Continue
  "MIDI continue message."
  {:db/ident        :lv2.midi/Continue,
   :lv2.midi/status [-5],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI continue message.",
   :rdfs/label      "Continue",
   :rdfs/subClassOf :lv2.midi/SystemRealtime})

(def Controller
  "MIDI controller change message."
  {:db/ident            :lv2.midi/Controller,
   :lv2.midi/chunk      [{:lv2.midi/byteNumber 1,
                          :lv2.midi/property   :lv2.midi/controllerValue}
                         {:lv2.midi/byteNumber 0,
                          :lv2.midi/property   :lv2.midi/controllerNumber}],
   :lv2.midi/statusMask [-80],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI controller change message.",
   :rdfs/label          "Controller",
   :rdfs/subClassOf     :lv2.midi/VoiceMessage})

(def HexByte
  "A hexadecimal byte, which has a value <= FF."
  {:db/ident             :lv2.midi/HexByte,
   :owl/onDatatype       :xsd/hexBinary,
   :owl/withRestrictions [{:xsd/maxInclusive 255.0}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/comment         "A hexadecimal byte, which has a value <= FF.",
   :rdfs/label           "Hex Byte"})

(def MidiEvent
  "A single raw MIDI message."
  {:db/ident        :lv2.midi/MidiEvent,
   :owl/onDatatype  :xsd/hexBinary,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A single raw MIDI message.",
   :rdfs/label      "MIDI Message",
   :rdfs/subClassOf [:lv2.atom/Atom :lv2.ev/Event]})

(def NoteOff
  "MIDI note off message."
  {:db/ident            :lv2.midi/NoteOff,
   :lv2.midi/chunk      [{:lv2.midi/byteNumber 1,
                          :lv2.midi/property   :lv2.midi/velocity}
                         {:lv2.midi/byteNumber 0,
                          :lv2.midi/property   :lv2.midi/noteNumber}],
   :lv2.midi/statusMask [-128],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI note off message.",
   :rdfs/label          "Note Off",
   :rdfs/subClassOf     :lv2.midi/VoiceMessage})

(def NoteOn
  "MIDI note on message."
  {:db/ident            :lv2.midi/NoteOn,
   :lv2.midi/chunk      [{:lv2.midi/byteNumber 1,
                          :lv2.midi/property   :lv2.midi/velocity}
                         {:lv2.midi/byteNumber 0,
                          :lv2.midi/property   :lv2.midi/noteNumber}],
   :lv2.midi/statusMask [-112],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI note on message.",
   :rdfs/label          "Note On",
   :rdfs/subClassOf     :lv2.midi/VoiceMessage})

(def ProgramChange
  "MIDI program change message."
  {:db/ident            :lv2.midi/ProgramChange,
   :lv2.midi/chunk      {:lv2.midi/byteNumber 0,
                         :lv2.midi/property   :lv2.midi/programNumber},
   :lv2.midi/statusMask [-64],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI program change message.",
   :rdfs/label          "Program Change",
   :rdfs/subClassOf     :lv2.midi/VoiceMessage})

(def QuarterFrame
  "MIDI quarter frame message."
  {:db/ident        :lv2.midi/QuarterFrame,
   :lv2.midi/status [-15],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI quarter frame message.",
   :rdfs/label      "Quarter Frame",
   :rdfs/subClassOf :lv2.midi/SystemCommon})

(def Reset
  "MIDI reset message."
  {:db/ident        :lv2.midi/Reset,
   :lv2.midi/status [-1],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI reset message.",
   :rdfs/label      "Reset",
   :rdfs/subClassOf :lv2.midi/SystemRealtime})

(def SongPosition
  "MIDI song position pointer message."
  {:db/ident        :lv2.midi/SongPosition,
   :lv2.midi/chunk  {:lv2.midi/byteNumber [1 0],
                     :lv2.midi/property   :lv2.midi/songPosition},
   :lv2.midi/status [-14],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI song position pointer message.",
   :rdfs/label      "Song Position",
   :rdfs/subClassOf :lv2.midi/SystemCommon})

(def SongSelect
  "MIDI song select message."
  {:db/ident        :lv2.midi/SongSelect,
   :lv2.midi/status [-13],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI song select message.",
   :rdfs/label      "Song Select",
   :rdfs/subClassOf :lv2.midi/SystemCommon})

(def Start
  "MIDI start message."
  {:db/ident        :lv2.midi/Start,
   :lv2.midi/status [-6],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI start message.",
   :rdfs/label      "Start",
   :rdfs/subClassOf :lv2.midi/SystemRealtime})

(def Stop
  "MIDI stop message."
  {:db/ident        :lv2.midi/Stop,
   :lv2.midi/status [-4],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI stop message.",
   :rdfs/label      "Stop",
   :rdfs/subClassOf :lv2.midi/SystemRealtime})

(def SystemCommon
  "MIDI system common message."
  {:db/ident        :lv2.midi/SystemCommon,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI system common message.",
   :rdfs/label      "System Common",
   :rdfs/subClassOf :lv2.midi/SystemMessage})

(def SystemExclusive
  "MIDI system exclusive message."
  {:db/ident        :lv2.midi/SystemExclusive,
   :lv2.midi/status [-16],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI system exclusive message.",
   :rdfs/label      "System Exclusive",
   :rdfs/subClassOf :lv2.midi/SystemMessage})

(def SystemMessage
  "MIDI system message."
  {:db/ident            :lv2.midi/SystemMessage,
   :lv2.midi/statusMask [-16],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI system message.",
   :rdfs/label          "System Message",
   :rdfs/subClassOf     :lv2.midi/MidiEvent})

(def SystemRealtime
  "MIDI system realtime message."
  {:db/ident        :lv2.midi/SystemRealtime,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI system realtime message.",
   :rdfs/label      "System Realtime",
   :rdfs/subClassOf :lv2.midi/SystemMessage})

(def TuneRequest
  "MIDI tune request message."
  {:db/ident        :lv2.midi/TuneRequest,
   :lv2.midi/status [-10],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI tune request message.",
   :rdfs/label      "Tune Request",
   :rdfs/subClassOf :lv2.midi/SystemCommon})

(def VoiceMessage
  "MIDI voice message."
  {:db/ident            :lv2.midi/VoiceMessage,
   :lv2.midi/statusMask [-16],
   :rdf/type            :rdfs/Class,
   :rdfs/comment        "MIDI voice message.",
   :rdfs/label          "Voice Message",
   :rdfs/subClassOf     :lv2.midi/MidiEvent})

(def benderValue
  "MIDI pitch bender message (-8192 to 8192)."
  {:db/ident     :lv2.midi/benderValue,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "MIDI pitch bender message (-8192 to 8192).",
   :rdfs/label   "bender value",
   :rdfs/range   :xsd/short})

(def binding
  "The MIDI event to bind a parameter to."
  {:db/ident     :lv2.midi/binding,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The MIDI event to bind a parameter to.",
   :rdfs/label   "binding",
   :rdfs/range   :lv2.midi/MidiEvent})

(def byteNumber
  "The 0-based index of a byte which is part of this chunk."
  {:db/ident     :lv2.midi/byteNumber,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The 0-based index of a byte which is part of this chunk.",
   :rdfs/domain  :lv2.midi/Chunk,
   :rdfs/label   "byte number",
   :rdfs/range   :xsd/unsignedByte})

(def channel
  "The channel number of a MIDI message."
  {:db/ident     :lv2.midi/channel,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The channel number of a MIDI message.",
   :rdfs/label   "MIDI channel",
   :rdfs/range   :xsd/unsignedByte})

(def chunk
  "A chunk of a MIDI message."
  {:db/ident     :lv2.midi/chunk,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A chunk of a MIDI message.",
   :rdfs/label   "MIDI chunk",
   :rdfs/range   :lv2.midi/Chunk})

(def controllerNumber
  "The numeric ID of a controller (0 to 127)."
  {:db/ident     :lv2.midi/controllerNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a controller (0 to 127).",
   :rdfs/label   "MIDI controller number",
   :rdfs/range   :xsd/byte})

(def controllerValue
  "The value of a controller (0 to 127)."
  {:db/ident     :lv2.midi/controllerValue,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The value of a controller (0 to 127).",
   :rdfs/label   "MIDI controller value",
   :rdfs/range   :xsd/byte})

(def noteNumber
  "The numeric ID of a note (0 to 127)."
  {:db/ident     :lv2.midi/noteNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a note (0 to 127).",
   :rdfs/label   "note number",
   :rdfs/range   :xsd/byte})

(def pressure
  "Key pressure (0 to 127)."
  {:db/ident     :lv2.midi/pressure,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Key pressure (0 to 127).",
   :rdfs/label   "key pressure",
   :rdfs/range   :xsd/byte})

(def programNumber
  "The numeric ID of a program (0 to 127)."
  {:db/ident     :lv2.midi/programNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a program (0 to 127).",
   :rdfs/label   "program number",
   :rdfs/range   :xsd/byte})

(def property
  "The property this chunk represents."
  {:db/ident     :lv2.midi/property,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The property this chunk represents.",
   :rdfs/domain  :lv2.midi/Chunk,
   :rdfs/label   "property",
   :rdfs/range   :rdf/Property})

(def songNumber
  "The numeric ID of a song (0 to 127)."
  {:db/ident     :lv2.midi/songNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a song (0 to 127).",
   :rdfs/label   "song number",
   :rdfs/range   :xsd/byte})

(def songPosition
  "Song position in MIDI beats (16th notes) (-8192 to 8192)."
  {:db/ident     :lv2.midi/songPosition,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Song position in MIDI beats (16th notes) (-8192 to 8192).",
   :rdfs/label   "song position",
   :rdfs/range   :xsd/short})

(def status
  "The exact status byte for a message of this type."
  {:db/ident     :lv2.midi/status,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The exact status byte for a message of this type.",
   :rdfs/label   "status byte",
   :rdfs/range   :lv2.midi/HexByte})

(def statusMask
  "The status byte for a message of this type on channel 1."
  {:db/ident     :lv2.midi/statusMask,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The status byte for a message of this type on channel 1.",
   :rdfs/label   "status mask",
   :rdfs/range   :lv2.midi/HexByte})

(def velocity
  "The velocity of a note message (0 to 127)."
  {:db/ident     :lv2.midi/velocity,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The velocity of a note message (0 to 127).",
   :rdfs/label   "velocity",
   :rdfs/range   :lv2.midi/HexByte})