(ns net.wikipunk.rdf.ingen.internals
  "http://drobilla.net/ns/ingen-internals#"
  {:dcat/downloadURL
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/internals.ttl",
   :rdf/ns-prefix-map
   {"doap" "http://usefulinc.com/ns/doap#",
    "ingen" "http://drobilla.net/ns/ingen#",
    "ingen.lv2"
    "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/",
    "lv2" "http://lv2plug.in/ns/lv2core#",
    "lv2.atom" "http://lv2plug.in/ns/ext/atom#",
    "lv2.midi" "http://lv2plug.in/ns/ext/midi#",
    "lv2.patch" "http://lv2plug.in/ns/ext/patch#",
    "lv2.work" "http://lv2plug.in/ns/ext/worker#",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ingen.internals",
   :rdfa/uri "http://drobilla.net/ns/ingen-internals#"})

(def BlockDelay
  "Special internal delay block. This delays its input one full process cycle (or 'block'). It is necessary to have at least one block delay in any cycle in the graph, i.e. any feedback loops must contain a block delay."
  {:db/ident :ingen.internals/BlockDelay,
   :rdf/type :ingen/Internal,
   :rdfs/comment
   "Special internal delay block.  This delays its input one full process cycle (or 'block').  It is necessary to have at least one block delay in any cycle in the graph, i.e. any feedback loops must contain a block delay.",
   :rdfs/label "Block Delay"})

(def Controller
  "Outputs the value of a specific MIDI control as a signal. The output value will be scaled to be between the range specified by the minimum and maximum controls."
  {:db/ident :ingen.internals/Controller,
   :rdf/type :ingen/Internal,
   :rdfs/comment
   "Outputs the value of a specific MIDI control as a signal.  The output value will be scaled to be between the range specified by the minimum and maximum controls.",
   :rdfs/label "Controller"})

(def Note
  "Outputs the attributes of a note as signals. Typically the frequency output controls an oscillator and the gate and trigger control an envelope. This plugin is special because it is internally aware of polyphony and controls voice allocation."
  {:db/ident :ingen.internals/Note,
   :rdf/type :ingen/Internal,
   :rdfs/comment
   "Outputs the attributes of a note as signals.  Typically the frequency output controls an oscillator and the gate and trigger control an envelope.  This plugin is special because it is internally aware of polyphony and controls voice allocation.",
   :rdfs/label "Note"})

(def Time
  "Emits time and transport information like tempo, time signature, and speed. The emitted events are in the standard LV2 format expected by transport-aware LV2 plugins."
  {:db/ident :ingen.internals/Time,
   :rdf/type :ingen/Internal,
   :rdfs/comment
   "Emits time and transport information like tempo, time signature, and speed.  The emitted events are in the standard LV2 format expected by transport-aware LV2 plugins.",
   :rdfs/label "Time"})

(def Trigger
  "Outputs a gate, trigger, and velocity signal whenever the specified note is received. This is particularly useful for building percussive instruments."
  {:db/ident :ingen.internals/Trigger,
   :rdf/type :ingen/Internal,
   :rdfs/comment
   "Outputs a gate, trigger, and velocity signal whenever the specified note is received.  This is particularly useful for building percussive instruments.",
   :rdfs/label "Trigger"})