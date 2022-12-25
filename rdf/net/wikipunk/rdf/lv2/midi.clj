(ns net.wikipunk.rdf.lv2.midi
  "This specification defines a data type for a MIDI message, midi:MidiEvent, which is normalised for fast and convenient real-time processing.  MIDI is the <q>Musical Instrument Digital Interface</q>, a ubiquitous binary standard for controlling digital music devices.  For plugins that process MIDI (or other situations where MIDI is sent via a generic transport) the main type defined here, midi:MidiEvent, can be mapped to an integer and used as the type of an LV2 [Atom](atom.html#Atom) or [Event](event.html#Event).  This specification also defines a complete vocabulary for the MIDI standard, except for standard controller numbers.  These descriptions are detailed enough to express any MIDI message as properties."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.ttl",
   :lv2/project
   {:doap/created    "2006-00-00",
    :doap/developer  [{:rdf/uri "http://drobilla.net/drobilla#me"}
                      {:rdf/uri "http://lv2plug.in/ns/meta#larsl"}],
    :doap/license    {:rdf/uri "http://opensource.org/licenses/isc"},
    :doap/maintainer {:rdf/uri "http://drobilla.net/drobilla#me"},
    :doap/name       "LV2 MIDI",
    :doap/shortdesc  "A normalised definition of raw MIDI.",
    :rdf/about       {:rdf/uri "http://lv2plug.in/ns/ext/midi"},
    :rdf/type        :doap/Project},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/midi"},
   :rdf/ns-prefix-map {"atom" "http://lv2plug.in/ns/ext/atom#",
                       "ev"   "http://lv2plug.in/ns/ext/event#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "midi" "http://lv2plug.in/ns/ext/midi#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "A normalised definition of raw MIDI.",
   :rdfs/label "LV2 MIDI",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.meta.ttl"},
   :vann/preferredNamespacePrefix "midi",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/midi#"}
  (:refer-clojure :exclude [binding chunk]))

(def ActiveSense
  "MIDI active sense message."
  {:midi/status     [-2],
   :rdf/about       :midi/ActiveSense,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Active Sense",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Aftertouch
  "MIDI aftertouch message."
  {:midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/pressure}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/noteNumber}],
   :midi/statusMask [-96],
   :rdf/about       :midi/Aftertouch,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Aftertouch",
   :rdfs/subClassOf :midi/VoiceMessage})

(def Bender
  "MIDI bender message."
  {:midi/chunk      {:midi/byteNumber [1 0],
                     :midi/property   :midi/benderValue},
   :midi/statusMask [-32],
   :rdf/about       :midi/Bender,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Bender",
   :rdfs/subClassOf :midi/VoiceMessage})

(def ChannelPressure
  "MIDI channel pressure message."
  {:midi/chunk      {:midi/byteNumber 0,
                     :midi/property   :midi/pressure},
   :midi/statusMask [-48],
   :rdf/about       :midi/ChannelPressure,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Channel Pressure",
   :rdfs/subClassOf :midi/VoiceMessage})

(def Chunk
  "A sequence of contiguous bytes in a MIDI message."
  {:rdf/about  :midi/Chunk,
   :rdf/type   :rdfs/Class,
   :rdfs/label "Chunk"})

(def Clock
  "MIDI clock message."
  {:midi/status     [-8],
   :rdf/about       :midi/Clock,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Clock",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Continue
  "MIDI continue message."
  {:midi/status     [-5],
   :rdf/about       :midi/Continue,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Continue",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Controller
  "MIDI controller change message."
  {:midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/controllerValue}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/controllerNumber}],
   :midi/statusMask [-80],
   :rdf/about       :midi/Controller,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Controller",
   :rdfs/subClassOf :midi/VoiceMessage})

(def HexByte
  "A hexadecimal byte, which has a value <= FF."
  {:owl/onDatatype       :xsd/hexBinary,
   :owl/withRestrictions [{:xsd/maxInclusive "FF"}],
   :rdf/about            :midi/HexByte,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "Hex Byte"})

(def MidiEvent
  "A single raw MIDI message (a sequence of bytes).  This is equivalent to a standard MIDI messages, except with the following restrictions to simplify handling:    * Running status is not allowed, every message must have its own status byte.    * Note On messages with velocity 0 are not allowed.  These messages are     equivalent to Note Off in standard MIDI streams, but here only proper Note     Off messages are allowed.    * \"Realtime messages\" (status bytes 0xF8 to 0xFF) are allowed, but may not      occur inside other messages like they can in standard MIDI streams.    * All messages are complete valid MIDI messages.  This means, for example,     that only the first byte in each event (the status byte) may have the     eighth bit set, that Note On and Note Off events are always 3 bytes long,     etc.  Where messages are communicated, the writer is responsible for writing valid messages, and the reader may assume that all events are valid.  If a midi:MidiEvent is serialised to a string, the format should be xsd:hexBinary, for example:      :::turtle     [] eg:someEvent \"901A01\"^^midi:MidiEvent ."
  {:owl/onDatatype  :xsd/hexBinary,
   :rdf/about       :midi/MidiEvent,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/label      "MIDI Message",
   :rdfs/subClassOf [:atom/Atom :ev/Event]})

(def NoteOff
  "MIDI note off message."
  {:midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/velocity}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/noteNumber}],
   :midi/statusMask [-128],
   :rdf/about       :midi/NoteOff,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Note Off",
   :rdfs/subClassOf :midi/VoiceMessage})

(def NoteOn
  "MIDI note on message."
  {:midi/chunk      [{:midi/byteNumber 1,
                      :midi/property   :midi/velocity}
                     {:midi/byteNumber 0,
                      :midi/property   :midi/noteNumber}],
   :midi/statusMask [-112],
   :rdf/about       :midi/NoteOn,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Note On",
   :rdfs/subClassOf :midi/VoiceMessage})

(def ProgramChange
  "MIDI program change message."
  {:midi/chunk      {:midi/byteNumber 0,
                     :midi/property   :midi/programNumber},
   :midi/statusMask [-64],
   :rdf/about       :midi/ProgramChange,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Program Change",
   :rdfs/subClassOf :midi/VoiceMessage})

(def QuarterFrame
  "MIDI quarter frame message."
  {:midi/status     [-15],
   :rdf/about       :midi/QuarterFrame,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Quarter Frame",
   :rdfs/subClassOf :midi/SystemCommon})

(def Reset
  "MIDI reset message."
  {:midi/status     [-1],
   :rdf/about       :midi/Reset,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Reset",
   :rdfs/subClassOf :midi/SystemRealtime})

(def SongPosition
  "MIDI song position pointer message."
  {:midi/chunk      {:midi/byteNumber [1 0],
                     :midi/property   :midi/songPosition},
   :midi/status     [-14],
   :rdf/about       :midi/SongPosition,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Song Position",
   :rdfs/subClassOf :midi/SystemCommon})

(def SongSelect
  "MIDI song select message."
  {:midi/status     [-13],
   :rdf/about       :midi/SongSelect,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Song Select",
   :rdfs/subClassOf :midi/SystemCommon})

(def Start
  "MIDI start message."
  {:midi/status     [-6],
   :rdf/about       :midi/Start,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Start",
   :rdfs/subClassOf :midi/SystemRealtime})

(def Stop
  "MIDI stop message."
  {:midi/status     [-4],
   :rdf/about       :midi/Stop,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Stop",
   :rdfs/subClassOf :midi/SystemRealtime})

(def SystemCommon
  "MIDI system common message."
  {:rdf/about       :midi/SystemCommon,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "System Common",
   :rdfs/subClassOf :midi/SystemMessage})

(def SystemExclusive
  "MIDI system exclusive message."
  {:midi/status     [-16],
   :rdf/about       :midi/SystemExclusive,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "System Exclusive",
   :rdfs/subClassOf :midi/SystemMessage})

(def SystemMessage
  "MIDI system message."
  {:midi/statusMask [-16],
   :rdf/about       :midi/SystemMessage,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "System Message",
   :rdfs/subClassOf :midi/MidiEvent})

(def SystemRealtime
  "MIDI system realtime message."
  {:rdf/about       :midi/SystemRealtime,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "System Realtime",
   :rdfs/subClassOf :midi/SystemMessage})

(def TuneRequest
  "MIDI tune request message."
  {:midi/status     [-10],
   :rdf/about       :midi/TuneRequest,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Tune Request",
   :rdfs/subClassOf :midi/SystemCommon})

(def VoiceMessage
  "MIDI voice message."
  {:midi/statusMask [-16],
   :rdf/about       :midi/VoiceMessage,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Voice Message",
   :rdfs/subClassOf :midi/MidiEvent})

(def benderValue
  "MIDI pitch bender message (-8192 to 8192)."
  {:rdf/about  :midi/benderValue,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "bender value",
   :rdfs/range :xsd/short})

(def binding
  "The MIDI event to bind a parameter to."
  {:rdf/about  :midi/binding,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "binding",
   :rdfs/range :midi/MidiEvent})

(def byteNumber
  "The 0-based index of a byte which is part of this chunk."
  {:rdf/about   :midi/byteNumber,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :midi/Chunk,
   :rdfs/label  "byte number",
   :rdfs/range  :xsd/unsignedByte})

(def channel
  "The channel number of a MIDI message."
  {:rdf/about  :midi/channel,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "MIDI channel",
   :rdfs/range :xsd/unsignedByte})

(def chunk
  "A chunk of a MIDI message."
  {:rdf/about  :midi/chunk,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "MIDI chunk",
   :rdfs/range :midi/Chunk})

(def controllerNumber
  "The numeric ID of a controller (0 to 127)."
  {:rdf/about  :midi/controllerNumber,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "MIDI controller number",
   :rdfs/range :xsd/byte})

(def controllerValue
  "The value of a controller (0 to 127)."
  {:rdf/about  :midi/controllerValue,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "MIDI controller value",
   :rdfs/range :xsd/byte})

(def noteNumber
  "The numeric ID of a note (0 to 127)."
  {:rdf/about  :midi/noteNumber,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "note number",
   :rdfs/range :xsd/byte})

(def pressure
  "Key pressure (0 to 127)."
  {:rdf/about  :midi/pressure,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "key pressure",
   :rdfs/range :xsd/byte})

(def programNumber
  "The numeric ID of a program (0 to 127)."
  {:rdf/about  :midi/programNumber,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "program number",
   :rdfs/range :xsd/byte})

(def property
  "The property this chunk represents."
  {:rdf/about   :midi/property,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :midi/Chunk,
   :rdfs/label  "property",
   :rdfs/range  :rdf/Property})

(def songNumber
  "The numeric ID of a song (0 to 127)."
  {:rdf/about  :midi/songNumber,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "song number",
   :rdfs/range :xsd/byte})

(def songPosition
  "Song position in MIDI beats (16th notes) (-8192 to 8192)."
  {:rdf/about  :midi/songPosition,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "song position",
   :rdfs/range :xsd/short})

(def status
  "The exact status byte for a message of this type."
  {:rdf/about  :midi/status,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "status byte",
   :rdfs/range :midi/HexByte})

(def statusMask
  "This is a status byte with the lower nibble set to zero."
  {:rdf/about  :midi/statusMask,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "status mask",
   :rdfs/range :midi/HexByte})

(def velocity
  "The velocity of a note message (0 to 127)."
  {:rdf/about  :midi/velocity,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "velocity",
   :rdfs/range :midi/HexByte})