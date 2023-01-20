(ns net.wikipunk.rdf.lv2.midi
  "A normalised definition of raw MIDI."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.ttl",
   :rdf/ns-prefix-map {"atom" "http://lv2plug.in/ns/ext/atom#",
                       "ev"   "http://lv2plug.in/ns/ext/event#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "midi" "http://lv2plug.in/ns/ext/midi#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/midi",
   :rdfa/prefix "midi",
   :rdfa/uri "http://lv2plug.in/ns/ext/midi#",
   :rdfs/comment "A normalised definition of raw MIDI.",
   :rdfs/label "LV2 MIDI",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.meta.ttl"]}
  (:refer-clojure :exclude [binding chunk]))

(def ActiveSense
  "MIDI active sense message."
  {:db/ident        :midi/ActiveSense,
   :midi/status     [-2],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI active sense message.",
   :rdfs/label      "Active Sense",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Aftertouch
  "MIDI aftertouch message."
  {:db/ident        :midi/Aftertouch,
   :midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/pressure}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/noteNumber}],
   :midi/statusMask [-96],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI aftertouch message.",
   :rdfs/label      "Aftertouch",
   :rdfs/subClassOf :midi/VoiceMessage})

(def Bender
  "MIDI bender message."
  {:db/ident        :midi/Bender,
   :midi/chunk      {:midi/byteNumber [1 0],
                     :midi/property   :midi/benderValue},
   :midi/statusMask [-32],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI bender message.",
   :rdfs/label      "Bender",
   :rdfs/subClassOf :midi/VoiceMessage})

(def ChannelPressure
  "MIDI channel pressure message."
  {:db/ident        :midi/ChannelPressure,
   :midi/chunk      {:midi/byteNumber 0,
                     :midi/property   :midi/pressure},
   :midi/statusMask [-48],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI channel pressure message.",
   :rdfs/label      "Channel Pressure",
   :rdfs/subClassOf :midi/VoiceMessage})

(def Chunk
  "A sequence of contiguous bytes in a MIDI message."
  {:db/ident     :midi/Chunk,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A sequence of contiguous bytes in a MIDI message.",
   :rdfs/label   "Chunk"})

(def Clock
  "MIDI clock message."
  {:db/ident        :midi/Clock,
   :midi/status     [-8],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI clock message.",
   :rdfs/label      "Clock",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Continue
  "MIDI continue message."
  {:db/ident        :midi/Continue,
   :midi/status     [-5],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI continue message.",
   :rdfs/label      "Continue",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Controller
  "MIDI controller change message."
  {:db/ident        :midi/Controller,
   :midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/controllerValue}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/controllerNumber}],
   :midi/statusMask [-80],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI controller change message.",
   :rdfs/label      "Controller",
   :rdfs/subClassOf :midi/VoiceMessage})

(def HexByte
  "A hexadecimal byte, which has a value <= FF."
  {:db/ident             :midi/HexByte,
   :owl/onDatatype       :xsd/hexBinary,
   :owl/withRestrictions [{:xsd/maxInclusive 255.0}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/comment         "A hexadecimal byte, which has a value <= FF.",
   :rdfs/label           "Hex Byte"})

(def MidiEvent
  "A single raw MIDI message."
  {:db/ident        :midi/MidiEvent,
   :owl/onDatatype  :xsd/hexBinary,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A single raw MIDI message.",
   :rdfs/label      "MIDI Message",
   :rdfs/subClassOf [:atom/Atom :ev/Event]})

(def NoteOff
  "MIDI note off message."
  {:db/ident        :midi/NoteOff,
   :midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/velocity}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/noteNumber}],
   :midi/statusMask [-128],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI note off message.",
   :rdfs/label      "Note Off",
   :rdfs/subClassOf :midi/VoiceMessage})

(def NoteOn
  "MIDI note on message."
  {:db/ident        :midi/NoteOn,
   :midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/velocity}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/noteNumber}],
   :midi/statusMask [-112],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI note on message.",
   :rdfs/label      "Note On",
   :rdfs/subClassOf :midi/VoiceMessage})

(def ProgramChange
  "MIDI program change message."
  {:db/ident        :midi/ProgramChange,
   :midi/chunk      {:midi/byteNumber 0,
                     :midi/property   :midi/programNumber},
   :midi/statusMask [-64],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI program change message.",
   :rdfs/label      "Program Change",
   :rdfs/subClassOf :midi/VoiceMessage})

(def QuarterFrame
  "MIDI quarter frame message."
  {:db/ident        :midi/QuarterFrame,
   :midi/status     [-15],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI quarter frame message.",
   :rdfs/label      "Quarter Frame",
   :rdfs/subClassOf :midi/SystemCommon})

(def Reset
  "MIDI reset message."
  {:db/ident        :midi/Reset,
   :midi/status     [-1],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI reset message.",
   :rdfs/label      "Reset",
   :rdfs/subClassOf :midi/SystemRealtime})

(def SongPosition
  "MIDI song position pointer message."
  {:db/ident        :midi/SongPosition,
   :midi/chunk      {:midi/byteNumber [1 0],
                     :midi/property   :midi/songPosition},
   :midi/status     [-14],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI song position pointer message.",
   :rdfs/label      "Song Position",
   :rdfs/subClassOf :midi/SystemCommon})

(def SongSelect
  "MIDI song select message."
  {:db/ident        :midi/SongSelect,
   :midi/status     [-13],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI song select message.",
   :rdfs/label      "Song Select",
   :rdfs/subClassOf :midi/SystemCommon})

(def Start
  "MIDI start message."
  {:db/ident        :midi/Start,
   :midi/status     [-6],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI start message.",
   :rdfs/label      "Start",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Stop
  "MIDI stop message."
  {:db/ident        :midi/Stop,
   :midi/status     [-4],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI stop message.",
   :rdfs/label      "Stop",
   :rdfs/subClassOf :midi/SystemRealtime})

(def SystemCommon
  "MIDI system common message."
  {:db/ident        :midi/SystemCommon,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI system common message.",
   :rdfs/label      "System Common",
   :rdfs/subClassOf :midi/SystemMessage})

(def SystemExclusive
  "MIDI system exclusive message."
  {:db/ident        :midi/SystemExclusive,
   :midi/status     [-16],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI system exclusive message.",
   :rdfs/label      "System Exclusive",
   :rdfs/subClassOf :midi/SystemMessage})

(def SystemMessage
  "MIDI system message."
  {:db/ident        :midi/SystemMessage,
   :midi/statusMask [-16],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI system message.",
   :rdfs/label      "System Message",
   :rdfs/subClassOf :midi/MidiEvent})

(def SystemRealtime
  "MIDI system realtime message."
  {:db/ident        :midi/SystemRealtime,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI system realtime message.",
   :rdfs/label      "System Realtime",
   :rdfs/subClassOf :midi/SystemMessage})

(def TuneRequest
  "MIDI tune request message."
  {:db/ident        :midi/TuneRequest,
   :midi/status     [-10],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI tune request message.",
   :rdfs/label      "Tune Request",
   :rdfs/subClassOf :midi/SystemCommon})

(def VoiceMessage
  "MIDI voice message."
  {:db/ident        :midi/VoiceMessage,
   :midi/statusMask [-16],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "MIDI voice message.",
   :rdfs/label      "Voice Message",
   :rdfs/subClassOf :midi/MidiEvent})

(def benderValue
  "MIDI pitch bender message (-8192 to 8192)."
  {:db/ident     :midi/benderValue,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "MIDI pitch bender message (-8192 to 8192).",
   :rdfs/label   "bender value",
   :rdfs/range   :xsd/short})

(def binding
  "The MIDI event to bind a parameter to."
  {:db/ident     :midi/binding,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The MIDI event to bind a parameter to.",
   :rdfs/label   "binding",
   :rdfs/range   :midi/MidiEvent})

(def byteNumber
  "The 0-based index of a byte which is part of this chunk."
  {:db/ident     :midi/byteNumber,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The 0-based index of a byte which is part of this chunk.",
   :rdfs/domain  :midi/Chunk,
   :rdfs/label   "byte number",
   :rdfs/range   :xsd/unsignedByte})

(def channel
  "The channel number of a MIDI message."
  {:db/ident     :midi/channel,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The channel number of a MIDI message.",
   :rdfs/label   "MIDI channel",
   :rdfs/range   :xsd/unsignedByte})

(def chunk
  "A chunk of a MIDI message."
  {:db/ident     :midi/chunk,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A chunk of a MIDI message.",
   :rdfs/label   "MIDI chunk",
   :rdfs/range   :midi/Chunk})

(def controllerNumber
  "The numeric ID of a controller (0 to 127)."
  {:db/ident     :midi/controllerNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a controller (0 to 127).",
   :rdfs/label   "MIDI controller number",
   :rdfs/range   :xsd/byte})

(def controllerValue
  "The value of a controller (0 to 127)."
  {:db/ident     :midi/controllerValue,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The value of a controller (0 to 127).",
   :rdfs/label   "MIDI controller value",
   :rdfs/range   :xsd/byte})

(def noteNumber
  "The numeric ID of a note (0 to 127)."
  {:db/ident     :midi/noteNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a note (0 to 127).",
   :rdfs/label   "note number",
   :rdfs/range   :xsd/byte})

(def pressure
  "Key pressure (0 to 127)."
  {:db/ident     :midi/pressure,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Key pressure (0 to 127).",
   :rdfs/label   "key pressure",
   :rdfs/range   :xsd/byte})

(def programNumber
  "The numeric ID of a program (0 to 127)."
  {:db/ident     :midi/programNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a program (0 to 127).",
   :rdfs/label   "program number",
   :rdfs/range   :xsd/byte})

(def property
  "The property this chunk represents."
  {:db/ident     :midi/property,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The property this chunk represents.",
   :rdfs/domain  :midi/Chunk,
   :rdfs/label   "property",
   :rdfs/range   :rdf/Property})

(def songNumber
  "The numeric ID of a song (0 to 127)."
  {:db/ident     :midi/songNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The numeric ID of a song (0 to 127).",
   :rdfs/label   "song number",
   :rdfs/range   :xsd/byte})

(def songPosition
  "Song position in MIDI beats (16th notes) (-8192 to 8192)."
  {:db/ident     :midi/songPosition,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Song position in MIDI beats (16th notes) (-8192 to 8192).",
   :rdfs/label   "song position",
   :rdfs/range   :xsd/short})

(def status
  "The exact status byte for a message of this type."
  {:db/ident     :midi/status,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The exact status byte for a message of this type.",
   :rdfs/label   "status byte",
   :rdfs/range   :midi/HexByte})

(def statusMask
  "The status byte for a message of this type on channel 1."
  {:db/ident     :midi/statusMask,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The status byte for a message of this type on channel 1.",
   :rdfs/label   "status mask",
   :rdfs/range   :midi/HexByte})

(def velocity
  "The velocity of a note message (0 to 127)."
  {:db/ident     :midi/velocity,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The velocity of a note message (0 to 127).",
   :rdfs/label   "velocity",
   :rdfs/range   :midi/HexByte})