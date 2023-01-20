(ns net.wikipunk.rdf.lv2.param
  "Common parameters for audio processing."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.ttl",
   :owl/imports ["http://lv2plug.in/ns/lv2core"
                 "http://lv2plug.in/ns/ext/port-groups"
                 "http://lv2plug.in/ns/ext/atom"],
   :rdf/ns-prefix-map {"lv2" "http://lv2plug.in/ns/lv2core#",
                       "lv2.atom" "http://lv2plug.in/ns/ext/atom#",
                       "lv2.param" "http://lv2plug.in/ns/ext/parameters#",
                       "lv2.pg" "http://lv2plug.in/ns/ext/port-groups#",
                       "lv2.units" "http://lv2plug.in/ns/extensions/units#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/parameters",
   :rdfa/prefix "lv2.param",
   :rdfa/uri "http://lv2plug.in/ns/ext/parameters#",
   :rdfs/comment "Common parameters for audio processing.",
   :rdfs/label "LV2 Parameters",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.meta.ttl"]}
  (:refer-clojure :exclude [delay]))

(def CompressorControls
  "Typical controls for a compressor."
  {:db/ident        :lv2.param/CompressorControls,
   :lv2.pg/element  [{:lv2/designation :lv2.param/ratio}
                     {:lv2/designation :lv2.param/threshold}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a compressor.",
   :rdfs/label      "Compressor Controls",
   :rdfs/subClassOf :lv2.param/ControlGroup})

(def ControlGroup
  "A group representing a set of associated controls."
  {:db/ident        :lv2.param/ControlGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group representing a set of associated controls.",
   :rdfs/label      "Control Group",
   :rdfs/subClassOf :lv2.pg/Group})

(def EnvelopeControls
  "Typical controls for a DAHDSR envelope."
  {:db/ident        :lv2.param/EnvelopeControls,
   :lv2.pg/element  [{:lv2/designation :lv2.param/sustain,
                      :lv2/index       4}
                     {:lv2/designation :lv2.param/release,
                      :lv2/index       5}
                     {:lv2/designation :lv2.param/attack,
                      :lv2/index       1}
                     {:lv2/designation :lv2.param/delay,
                      :lv2/index       0}
                     {:lv2/designation :lv2.param/decay,
                      :lv2/index       3}
                     {:lv2/designation :lv2.param/hold,
                      :lv2/index       2}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a DAHDSR envelope.",
   :rdfs/label      "Envelope Controls",
   :rdfs/subClassOf :lv2.param/ControlGroup})

(def FilterControls
  "Typical controls for a filter."
  {:db/ident        :lv2.param/FilterControls,
   :lv2.pg/element  [{:lv2/designation :lv2.param/resonance}
                     {:lv2/designation :lv2.param/cutoffFrequency}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a filter.",
   :rdfs/label      "Filter Controls",
   :rdfs/subClassOf :lv2.param/ControlGroup})

(def OscillatorControls
  "Typical controls for an oscillator."
  {:db/ident        :lv2.param/OscillatorControls,
   :lv2.pg/element  [{:lv2/designation :lv2.param/pulseWidth}
                     {:lv2/designation :lv2.param/waveform}
                     {:lv2/designation :lv2.param/amplitude}
                     {:lv2/designation :lv2.param/frequency}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for an oscillator.",
   :rdfs/label      "Oscillator Controls",
   :rdfs/subClassOf :lv2.param/ControlGroup})

(def amplitude
  "An amplitude as a factor, where 0 is silent and 1 is unity."
  {:db/ident     :lv2.param/amplitude,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "An amplitude as a factor, where 0 is silent and 1 is unity.",
   :rdfs/label   "amplitude",
   :rdfs/range   :lv2.atom/Float})

(def attack
  "The duration of an envelope attack stage."
  {:db/ident     :lv2.param/attack,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope attack stage.",
   :rdfs/label   "attack",
   :rdfs/range   :lv2.atom/Float})

(def bypass
  "A boolean parameter that disables processing if true."
  {:db/ident     :lv2.param/bypass,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A boolean parameter that disables processing if true.",
   :rdfs/label   "bypass"})

(def cutoffFrequency
  "The cutoff frequency, typically in Hz, for a filter."
  {:db/ident     :lv2.param/cutoffFrequency,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The cutoff frequency, typically in Hz, for a filter.",
   :rdfs/label   "cutoff frequency",
   :rdfs/range   :lv2.atom/Float})

(def decay
  "The duration of an envelope decay stage."
  {:db/ident     :lv2.param/decay,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope decay stage.",
   :rdfs/label   "decay",
   :rdfs/range   :lv2.atom/Float})

(def delay
  "The duration of an envelope delay stage."
  {:db/ident     :lv2.param/delay,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope delay stage.",
   :rdfs/label   "delay",
   :rdfs/range   :lv2.atom/Float})

(def dryLevel
  "The level of the unprocessed component of a signal."
  {:db/ident     :lv2.param/dryLevel,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of the unprocessed component of a signal.",
   :rdfs/label   "dry level"})

(def frequency
  "A frequency, typically in Hz."
  {:db/ident     :lv2.param/frequency,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A frequency, typically in Hz.",
   :rdfs/label   "frequency",
   :rdfs/range   :lv2.atom/Float})

(def gain
  "Gain in decibels."
  {:db/ident       :lv2.param/gain,
   :lv2.units/unit :lv2.units/db,
   :lv2/default    0,
   :lv2/maximum    20,
   :lv2/minimum    -20,
   :rdf/type       :lv2/Parameter,
   :rdfs/comment   "Gain in decibels.",
   :rdfs/label     "gain",
   :rdfs/range     :lv2.atom/Float})

(def hold
  "The duration of an envelope hold stage."
  {:db/ident     :lv2.param/hold,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope hold stage.",
   :rdfs/label   "hold",
   :rdfs/range   :lv2.atom/Float})

(def pulseWidth
  "The width of a pulse of a rectangular waveform."
  {:db/ident     :lv2.param/pulseWidth,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The width of a pulse of a rectangular waveform.",
   :rdfs/label   "pulse width",
   :rdfs/range   :lv2.atom/Float})

(def ratio
  "Compression ratio."
  {:db/ident     :lv2.param/ratio,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Compression ratio.",
   :rdfs/label   "ratio",
   :rdfs/range   :lv2.atom/Float})

(def release
  "The duration of an envelope release stage."
  {:db/ident     :lv2.param/release,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope release stage.",
   :rdfs/label   "release",
   :rdfs/range   :lv2.atom/Float})

(def resonance
  "The resonance of a filter."
  {:db/ident     :lv2.param/resonance,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The resonance of a filter.",
   :rdfs/label   "resonance",
   :rdfs/range   :lv2.atom/Float})

(def sampleRate
  "A sample rate in Hz."
  {:db/ident     :lv2.param/sampleRate,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A sample rate in Hz.",
   :rdfs/label   "sample rate"})

(def sustain
  "The level of an envelope sustain stage as a factor."
  {:db/ident     :lv2.param/sustain,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of an envelope sustain stage as a factor.",
   :rdfs/label   "sustain",
   :rdfs/range   :lv2.atom/Float})

(def threshold
  "Compression threshold."
  {:db/ident     :lv2.param/threshold,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Compression threshold.",
   :rdfs/label   "threshold",
   :rdfs/range   :lv2.atom/Float})

(def waveform
  "The waveform \"fader\" for oscillators or modulators that have several."
  {:db/ident :lv2.param/waveform,
   :rdf/type :lv2/Parameter,
   :rdfs/comment
   "The waveform \"fader\" for oscillators or modulators that have several.",
   :rdfs/label "waveform",
   :rdfs/range :lv2.atom/Float})

(def wetDryRatio
  "The ratio between processed and bypassed levels in the output."
  {:db/ident :lv2.param/wetDryRatio,
   :rdf/type :lv2/Parameter,
   :rdfs/comment
   "The ratio between processed and bypassed levels in the output.",
   :rdfs/label "wet/dry ratio"})

(def wetLevel
  "The level of the processed component of a signal."
  {:db/ident     :lv2.param/wetLevel,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of the processed component of a signal.",
   :rdfs/label   "wet level"})