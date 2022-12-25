(ns net.wikipunk.rdf.lv2.midi
  "A normalised definition of raw MIDI."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "midi",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/midi"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/midi#",
   :rdf/ns-prefix-map {"midi" "http://lv2plug.in/ns/ext/midi#",
                       "ev" "http://lv2plug.in/ns/ext/event#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "atom" "http://lv2plug.in/ns/ext/atom#"}}
  (:refer-clojure :exclude [binding chunk]))

(def ActiveSense
  "MIDI active sense message."
  {:midi/status [-2],
   :rdfs/comment "MIDI active sense message.",
   :rdfs/label "Active Sense",
   :rdfs/subClassOf :midi/SystemRealtime,
   :rdf/type :rdfs/Class})

(def Aftertouch
  "MIDI aftertouch message."
  {:midi/chunk [#:midi{:property :midi/pressure, :byteNumber 1}
                #:midi{:property :midi/noteNumber, :byteNumber 0}],
   :midi/statusMask [-96],
   :rdfs/comment "MIDI aftertouch message.",
   :rdfs/label "Aftertouch",
   :rdfs/subClassOf :midi/VoiceMessage,
   :rdf/type :rdfs/Class})

(def Bender
  "MIDI bender message."
  {:midi/chunk #:midi{:property :midi/benderValue, :byteNumber [1 0]},
   :midi/statusMask [-32],
   :rdfs/comment "MIDI bender message.",
   :rdfs/label "Bender",
   :rdfs/subClassOf :midi/VoiceMessage,
   :rdf/type :rdfs/Class})

(def ChannelPressure
  "MIDI channel pressure message."
  {:midi/chunk #:midi{:property :midi/pressure, :byteNumber 0},
   :midi/statusMask [-48],
   :rdfs/comment "MIDI channel pressure message.",
   :rdfs/label "Channel Pressure",
   :rdfs/subClassOf :midi/VoiceMessage,
   :rdf/type :rdfs/Class})

(def Chunk
  "A sequence of contiguous bytes in a MIDI message."
  {:rdfs/comment "A sequence of contiguous bytes in a MIDI message.",
   :rdfs/label "Chunk",
   :rdf/type :rdfs/Class})

(def Clock
  "MIDI clock message."
  {:midi/status [-8],
   :rdfs/comment "MIDI clock message.",
   :rdfs/label "Clock",
   :rdfs/subClassOf :midi/SystemRealtime,
   :rdf/type :rdfs/Class})

(def Continue
  "MIDI continue message."
  {:midi/status [-5],
   :rdfs/comment "MIDI continue message.",
   :rdfs/label "Continue",
   :rdfs/subClassOf :midi/SystemRealtime,
   :rdf/type :rdfs/Class})

(def Controller
  "MIDI controller change message."
  {:midi/chunk [#:midi{:property :midi/controllerValue, :byteNumber 1}
                #:midi{:property :midi/controllerNumber, :byteNumber 0}],
   :midi/statusMask [-80],
   :rdfs/comment "MIDI controller change message.",
   :rdfs/label "Controller",
   :rdfs/subClassOf :midi/VoiceMessage,
   :rdf/type :rdfs/Class})

(def HexByte
  "A hexadecimal byte, which has a value <= FF."
  {:rdfs/comment "A hexadecimal byte, which has a value <= FF.",
   :rdfs/label "Hex Byte",
   :owl/withRestrictions [#:xsd{:maxInclusive "FF"}],
   :owl/onDatatype :xsd/hexBinary,
   :rdf/type :rdfs/Datatype})

(def MidiEvent
  "A single raw MIDI message."
  {:rdfs/comment "A single raw MIDI message.",
   :rdfs/label "MIDI Message",
   :owl/onDatatype :xsd/hexBinary,
   :rdfs/subClassOf [:atom/Atom :ev/Event],
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def NoteOff
  "MIDI note off message."
  {:midi/chunk [#:midi{:property :midi/velocity, :byteNumber 1}
                #:midi{:property :midi/noteNumber, :byteNumber 0}],
   :midi/statusMask [-128],
   :rdfs/comment "MIDI note off message.",
   :rdfs/label "Note Off",
   :rdfs/subClassOf :midi/VoiceMessage,
   :rdf/type :rdfs/Class})

(def NoteOn
  "MIDI note on message."
  {:midi/chunk [#:midi{:property :midi/velocity, :byteNumber 1}
                #:midi{:property :midi/noteNumber, :byteNumber 0}],
   :midi/statusMask [-112],
   :rdfs/comment "MIDI note on message.",
   :rdfs/label "Note On",
   :rdfs/subClassOf :midi/VoiceMessage,
   :rdf/type :rdfs/Class})

(def ProgramChange
  "MIDI program change message."
  {:midi/chunk #:midi{:property :midi/programNumber, :byteNumber 0},
   :midi/statusMask [-64],
   :rdfs/comment "MIDI program change message.",
   :rdfs/label "Program Change",
   :rdfs/subClassOf :midi/VoiceMessage,
   :rdf/type :rdfs/Class})

(def QuarterFrame
  "MIDI quarter frame message."
  {:midi/status [-15],
   :rdfs/comment "MIDI quarter frame message.",
   :rdfs/label "Quarter Frame",
   :rdfs/subClassOf :midi/SystemCommon,
   :rdf/type :rdfs/Class})

(def Reset
  "MIDI reset message."
  {:midi/status [-1],
   :rdfs/comment "MIDI reset message.",
   :rdfs/label "Reset",
   :rdfs/subClassOf :midi/SystemRealtime,
   :rdf/type :rdfs/Class})

(def SongPosition
  "MIDI song position pointer message."
  {:midi/chunk #:midi{:property :midi/songPosition, :byteNumber [1 0]},
   :midi/status [-14],
   :rdfs/comment "MIDI song position pointer message.",
   :rdfs/label "Song Position",
   :rdfs/subClassOf :midi/SystemCommon,
   :rdf/type :rdfs/Class})

(def SongSelect
  "MIDI song select message."
  {:midi/status [-13],
   :rdfs/comment "MIDI song select message.",
   :rdfs/label "Song Select",
   :rdfs/subClassOf :midi/SystemCommon,
   :rdf/type :rdfs/Class})

(def Start
  "MIDI start message."
  {:midi/status [-6],
   :rdfs/comment "MIDI start message.",
   :rdfs/label "Start",
   :rdfs/subClassOf :midi/SystemRealtime,
   :rdf/type :rdfs/Class})

(def Stop
  "MIDI stop message."
  {:midi/status [-4],
   :rdfs/comment "MIDI stop message.",
   :rdfs/label "Stop",
   :rdfs/subClassOf :midi/SystemRealtime,
   :rdf/type :rdfs/Class})

(def SystemCommon
  "MIDI system common message."
  {:rdfs/comment "MIDI system common message.",
   :rdfs/label "System Common",
   :rdfs/subClassOf :midi/SystemMessage,
   :rdf/type :rdfs/Class})

(def SystemExclusive
  "MIDI system exclusive message."
  {:midi/status [-16],
   :rdfs/comment "MIDI system exclusive message.",
   :rdfs/label "System Exclusive",
   :rdfs/subClassOf :midi/SystemMessage,
   :rdf/type :rdfs/Class})

(def SystemMessage
  "MIDI system message."
  {:midi/statusMask [-16],
   :rdfs/comment "MIDI system message.",
   :rdfs/label "System Message",
   :rdfs/subClassOf :midi/MidiEvent,
   :rdf/type :rdfs/Class})

(def SystemRealtime
  "MIDI system realtime message."
  {:rdfs/comment "MIDI system realtime message.",
   :rdfs/label "System Realtime",
   :rdfs/subClassOf :midi/SystemMessage,
   :rdf/type :rdfs/Class})

(def TuneRequest
  "MIDI tune request message."
  {:midi/status [-10],
   :rdfs/comment "MIDI tune request message.",
   :rdfs/label "Tune Request",
   :rdfs/subClassOf :midi/SystemCommon,
   :rdf/type :rdfs/Class})

(def VoiceMessage
  "MIDI voice message."
  {:midi/statusMask [-16],
   :rdfs/comment "MIDI voice message.",
   :rdfs/label "Voice Message",
   :rdfs/subClassOf :midi/MidiEvent,
   :rdf/type :rdfs/Class})

(def benderValue
  "MIDI pitch bender message (-8192 to 8192)."
  {:rdfs/comment "MIDI pitch bender message (-8192 to 8192).",
   :rdfs/range :xsd/short,
   :rdfs/label "bender value",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def binding
  "The MIDI event to bind a parameter to."
  {:rdfs/comment "The MIDI event to bind a parameter to.",
   :rdfs/label "binding",
   :rdfs/range :midi/MidiEvent,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def byteNumber
  "The 0-based index of a byte which is part of this chunk."
  {:rdfs/comment "The 0-based index of a byte which is part of this chunk.",
   :rdfs/range :xsd/unsignedByte,
   :rdfs/domain :midi/Chunk,
   :rdfs/label "byte number",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def channel
  "The channel number of a MIDI message."
  {:rdfs/comment "The channel number of a MIDI message.",
   :rdfs/range :xsd/unsignedByte,
   :rdfs/label "MIDI channel",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def chunk
  "A chunk of a MIDI message."
  {:rdfs/comment "A chunk of a MIDI message.",
   :rdfs/label "MIDI chunk",
   :rdfs/range :midi/Chunk,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def controllerNumber
  "The numeric ID of a controller (0 to 127)."
  {:rdfs/comment "The numeric ID of a controller (0 to 127).",
   :rdfs/range :xsd/byte,
   :rdfs/label "MIDI controller number",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def controllerValue
  "The value of a controller (0 to 127)."
  {:rdfs/comment "The value of a controller (0 to 127).",
   :rdfs/range :xsd/byte,
   :rdfs/label "MIDI controller value",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def noteNumber
  "The numeric ID of a note (0 to 127)."
  {:rdfs/comment "The numeric ID of a note (0 to 127).",
   :rdfs/range :xsd/byte,
   :rdfs/label "note number",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def pressure
  "Key pressure (0 to 127)."
  {:rdfs/comment "Key pressure (0 to 127).",
   :rdfs/range :xsd/byte,
   :rdfs/label "key pressure",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def programNumber
  "The numeric ID of a program (0 to 127)."
  {:rdfs/comment "The numeric ID of a program (0 to 127).",
   :rdfs/range :xsd/byte,
   :rdfs/label "program number",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def property
  "The property this chunk represents."
  {:rdfs/comment "The property this chunk represents.",
   :rdfs/range :rdf/Property,
   :rdfs/domain :midi/Chunk,
   :rdfs/label "property",
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def songNumber
  "The numeric ID of a song (0 to 127)."
  {:rdfs/comment "The numeric ID of a song (0 to 127).",
   :rdfs/range :xsd/byte,
   :rdfs/label "song number",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def songPosition
  "Song position in MIDI beats (16th notes) (-8192 to 8192)."
  {:rdfs/comment "Song position in MIDI beats (16th notes) (-8192 to 8192).",
   :rdfs/range :xsd/short,
   :rdfs/label "song position",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def status
  "The exact status byte for a message of this type."
  {:rdfs/comment "The exact status byte for a message of this type.",
   :rdfs/range :midi/HexByte,
   :rdfs/label "status byte",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def statusMask
  "The status byte for a message of this type on channel 1."
  {:rdfs/comment "The status byte for a message of this type on channel 1.",
   :rdfs/range :midi/HexByte,
   :rdfs/label "status mask",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def velocity
  "The velocity of a note message (0 to 127)."
  {:rdfs/comment "The velocity of a note message (0 to 127).",
   :rdfs/range :midi/HexByte,
   :rdfs/label "velocity",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})