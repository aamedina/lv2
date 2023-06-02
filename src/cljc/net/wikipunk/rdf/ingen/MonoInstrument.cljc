(ns net.wikipunk.rdf.ingen.MonoInstrument
  "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/MonoInstrument.ttl#"
  {:dcat/downloadURL
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/MonoInstrument.ttl",
   :rdf/ns-prefix-map
   {"doap" "http://usefulinc.com/ns/doap#",
    "ingen" "http://drobilla.net/ns/ingen#",
    "ingen.lv2"
    "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/",
    "ingen.note"
    "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/Note/",
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
   :rdfa/prefix "ingen.MonoInstrument",
   :rdfa/uri
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/MonoInstrument.ttl#"})

(def ^{:private true} MonoInstrument_ttl
  {:db/ident          :ingen.lv2/MonoInstrument.ttl,
   :doap/name         "Ingen Mono Instrument Template",
   :ingen/arc         [{:ingen/head :ingen.lv2/notify,
                        :ingen/tail :ingen.lv2/control}
                       {:ingen/head :ingen.note/input,
                        :ingen/tail :ingen.lv2/control}],
   :ingen/block       :ingen.lv2/Note,
   :ingen/polyphony   1,
   :lv2.ui/ui         :ingen/GraphUIGtk2,
   :lv2/extensionData :lv2.state/interface,
   :lv2/port          [:ingen.lv2/notify
                       :ingen.lv2/audio_out
                       :ingen.lv2/control],
   :rdf/type          [:lv2/InstrumentPlugin :ingen/Graph :lv2/Plugin]})

(def ^{:private true} Note
  {:db/ident         :ingen.lv2/Note,
   :ingen/canvasX    206.5M,
   :ingen/canvasY    8,
   :ingen/polyphonic true,
   :lv2/port         [:ingen.note/input
                      :ingen.note/trigger
                      :ingen.note/pressure
                      :ingen.note/gate
                      :ingen.note/frequency
                      :ingen.note/velocity
                      :ingen.note/number
                      :ingen.note/bend],
   :lv2/prototype    :ingen.internals/Note,
   :rdf/type         :ingen/Block})

(def ^{:private true} audio_out
  {:db/ident        :ingen.lv2/audio_out,
   :ingen/canvasX   506,
   :ingen/canvasY   118.5M,
   :lv2/designation :lv2.pg/center,
   :lv2/index       2,
   :lv2/name        "Audio Out",
   :lv2/symbol      "audio_out",
   :rdf/type        [:lv2/OutputPort :lv2/AudioPort]})

(def ^{:private true} control
  {:db/ident            :ingen.lv2/control,
   :ingen/canvasX       14.5M,
   :ingen/canvasY       136.5M,
   :ingen/polyphonic    false,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports   :lv2.midi/MidiEvent,
   :lv2.rsz/minimumSize 4096,
   :lv2/index           0,
   :lv2/name            "Control",
   :lv2/portProperty    :lv2/connectionOptional,
   :lv2/symbol          "control",
   :rdf/type            [:lv2/InputPort :lv2.atom/AtomPort]})

(def ^{:private true} notify
  {:db/ident            :ingen.lv2/notify,
   :ingen/canvasX       214.5M,
   :ingen/canvasY       260.5M,
   :ingen/polyphonic    false,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports   :lv2.midi/MidiEvent,
   :lv2.rsz/minimumSize 4096,
   :lv2/index           1,
   :lv2/name            "Control",
   :lv2/symbol          "notify",
   :rdf/type            [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} bend
  {:db/ident            :ingen.note/bend,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports   :lv2.atom/Float,
   :lv2/default         0,
   :lv2/maximum         1,
   :lv2/minimum         -1,
   :lv2/name            "Bender",
   :rdf/type            [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} frequency
  {:db/ident            :ingen.note/frequency,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports   :lv2.atom/Float,
   :lv2/maximum         25088,
   :lv2/minimum         16,
   :lv2/name            "Frequency",
   :rdf/type            [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} gate
  {:db/ident          :ingen.note/gate,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports :lv2.atom/Float,
   :lv2/name          "Gate",
   :lv2/portProperty  :lv2/toggled,
   :rdf/type          [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} input
  {:db/ident          :ingen.note/input,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports :lv2.midi/MidiEvent,
   :lv2/name          "Input",
   :rdf/type          [:lv2/InputPort :lv2.atom/AtomPort]})

(def ^{:private true} number
  {:db/ident            :ingen.note/number,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports   :lv2.atom/Float,
   :lv2/maximum         127,
   :lv2/minimum         0,
   :lv2/name            "Number",
   :lv2/portProperty    :lv2/integer,
   :rdf/type            [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} pressure
  {:db/ident            :ingen.note/pressure,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports   :lv2.atom/Float,
   :lv2/default         0,
   :lv2/maximum         1,
   :lv2/minimum         0,
   :lv2/name            "Pressure",
   :rdf/type            [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} trigger
  {:db/ident          :ingen.note/trigger,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports :lv2.atom/Float,
   :lv2/name          "Trigger",
   :lv2/portProperty  :lv2/toggled,
   :rdf/type          [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} velocity
  {:db/ident            :ingen.note/velocity,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.atom/supports   :lv2.atom/Float,
   :lv2/maximum         1,
   :lv2/minimum         0,
   :lv2/name            "Velocity",
   :rdf/type            [:lv2/OutputPort :lv2.atom/AtomPort]})