(ns net.wikipunk.rdf.lv2.param
  "Common parameters for audio processing."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.ttl",
   :owl/imports ["http://lv2plug.in/ns/lv2core"
                 "http://lv2plug.in/ns/ext/port-groups"
                 "http://lv2plug.in/ns/ext/atom"],
   :rdf/ns-prefix-map {"atom"  "http://lv2plug.in/ns/ext/atom#",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "param" "http://lv2plug.in/ns/ext/parameters#",
                       "pg"    "http://lv2plug.in/ns/ext/port-groups#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "units" "http://lv2plug.in/ns/extensions/units#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/parameters",
   :rdfa/prefix "param",
   :rdfa/uri "http://lv2plug.in/ns/ext/parameters#",
   :rdfs/comment "Common parameters for audio processing.",
   :rdfs/label "LV2 Parameters",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.meta.ttl"]}
  (:refer-clojure :exclude [delay]))

(def CompressorControls
  "Typical controls for a compressor."
  {:db/ident        :param/CompressorControls,
   :pg/element      [{:lv2/designation :param/ratio}
                     {:lv2/designation :param/threshold}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a compressor.",
   :rdfs/label      "Compressor Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def ControlGroup
  "A group representing a set of associated controls."
  {:db/ident        :param/ControlGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group representing a set of associated controls.",
   :rdfs/label      "Control Group",
   :rdfs/subClassOf :pg/Group})

(def EnvelopeControls
  "Typical controls for a DAHDSR envelope."
  {:db/ident        :param/EnvelopeControls,
   :pg/element      [{:lv2/designation :param/release,
                      :lv2/index       5}
                     {:lv2/designation :param/attack,
                      :lv2/index       1}
                     {:lv2/designation :param/decay,
                      :lv2/index       3}
                     {:lv2/designation :param/hold,
                      :lv2/index       2}
                     {:lv2/designation :param/delay,
                      :lv2/index       0}
                     {:lv2/designation :param/sustain,
                      :lv2/index       4}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a DAHDSR envelope.",
   :rdfs/label      "Envelope Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def FilterControls
  "Typical controls for a filter."
  {:db/ident        :param/FilterControls,
   :pg/element      [{:lv2/designation :param/resonance}
                     {:lv2/designation :param/cutoffFrequency}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a filter.",
   :rdfs/label      "Filter Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def OscillatorControls
  "Typical controls for an oscillator."
  {:db/ident        :param/OscillatorControls,
   :pg/element      [{:lv2/designation :param/pulseWidth}
                     {:lv2/designation :param/waveform}
                     {:lv2/designation :param/amplitude}
                     {:lv2/designation :param/frequency}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for an oscillator.",
   :rdfs/label      "Oscillator Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def amplitude
  "An amplitude as a factor, where 0 is silent and 1 is unity."
  {:db/ident     :param/amplitude,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "An amplitude as a factor, where 0 is silent and 1 is unity.",
   :rdfs/label   "amplitude",
   :rdfs/range   :atom/Float})

(def attack
  "The duration of an envelope attack stage."
  {:db/ident     :param/attack,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope attack stage.",
   :rdfs/label   "attack",
   :rdfs/range   :atom/Float})

(def bypass
  "A boolean parameter that disables processing if true."
  {:db/ident     :param/bypass,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A boolean parameter that disables processing if true.",
   :rdfs/label   "bypass"})

(def cutoffFrequency
  "The cutoff frequency, typically in Hz, for a filter."
  {:db/ident     :param/cutoffFrequency,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The cutoff frequency, typically in Hz, for a filter.",
   :rdfs/label   "cutoff frequency",
   :rdfs/range   :atom/Float})

(def decay
  "The duration of an envelope decay stage."
  {:db/ident     :param/decay,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope decay stage.",
   :rdfs/label   "decay",
   :rdfs/range   :atom/Float})

(def delay
  "The duration of an envelope delay stage."
  {:db/ident     :param/delay,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope delay stage.",
   :rdfs/label   "delay",
   :rdfs/range   :atom/Float})

(def dryLevel
  "The level of the unprocessed component of a signal."
  {:db/ident     :param/dryLevel,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of the unprocessed component of a signal.",
   :rdfs/label   "dry level"})

(def frequency
  "A frequency, typically in Hz."
  {:db/ident     :param/frequency,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A frequency, typically in Hz.",
   :rdfs/label   "frequency",
   :rdfs/range   :atom/Float})

(def gain
  "Gain in decibels."
  {:db/ident     :param/gain,
   :lv2/default  0,
   :lv2/maximum  20,
   :lv2/minimum  -20,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Gain in decibels.",
   :rdfs/label   "gain",
   :rdfs/range   :atom/Float,
   :units/unit   :units/db})

(def hold
  "The duration of an envelope hold stage."
  {:db/ident     :param/hold,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope hold stage.",
   :rdfs/label   "hold",
   :rdfs/range   :atom/Float})

(def pulseWidth
  "The width of a pulse of a rectangular waveform."
  {:db/ident     :param/pulseWidth,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The width of a pulse of a rectangular waveform.",
   :rdfs/label   "pulse width",
   :rdfs/range   :atom/Float})

(def ratio
  "Compression ratio."
  {:db/ident     :param/ratio,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Compression ratio.",
   :rdfs/label   "ratio",
   :rdfs/range   :atom/Float})

(def release
  "The duration of an envelope release stage."
  {:db/ident     :param/release,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope release stage.",
   :rdfs/label   "release",
   :rdfs/range   :atom/Float})

(def resonance
  "The resonance of a filter."
  {:db/ident     :param/resonance,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The resonance of a filter.",
   :rdfs/label   "resonance",
   :rdfs/range   :atom/Float})

(def sampleRate
  "A sample rate in Hz."
  {:db/ident     :param/sampleRate,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A sample rate in Hz.",
   :rdfs/label   "sample rate"})

(def sustain
  "The level of an envelope sustain stage as a factor."
  {:db/ident     :param/sustain,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of an envelope sustain stage as a factor.",
   :rdfs/label   "sustain",
   :rdfs/range   :atom/Float})

(def threshold
  "Compression threshold."
  {:db/ident     :param/threshold,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Compression threshold.",
   :rdfs/label   "threshold",
   :rdfs/range   :atom/Float})

(def waveform
  "The waveform \"fader\" for oscillators or modulators that have several."
  {:db/ident :param/waveform,
   :rdf/type :lv2/Parameter,
   :rdfs/comment
   "The waveform \"fader\" for oscillators or modulators that have several.",
   :rdfs/label "waveform",
   :rdfs/range :atom/Float})

(def wetDryRatio
  "The ratio between processed and bypassed levels in the output."
  {:db/ident :param/wetDryRatio,
   :rdf/type :lv2/Parameter,
   :rdfs/comment
   "The ratio between processed and bypassed levels in the output.",
   :rdfs/label "wet/dry ratio"})

(def wetLevel
  "The level of the processed component of a signal."
  {:db/ident     :param/wetLevel,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of the processed component of a signal.",
   :rdfs/label   "wet level"})