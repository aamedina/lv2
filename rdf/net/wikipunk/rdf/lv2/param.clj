(ns net.wikipunk.rdf.lv2.param
  "Common parameters for audio processing."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.ttl",
   :owl/imports [{:rdf/uri "http://lv2plug.in/ns/lv2core"}
                 {:rdf/uri "http://lv2plug.in/ns/ext/port-groups"}
                 {:rdf/uri "http://lv2plug.in/ns/ext/atom"}],
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/parameters"},
   :rdf/ns-prefix-map {"atom"  "http://lv2plug.in/ns/ext/atom#",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "param" "http://lv2plug.in/ns/ext/parameters#",
                       "pg"    "http://lv2plug.in/ns/ext/port-groups#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "units" "http://lv2plug.in/ns/extensions/units#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.meta.ttl"},
   :vann/preferredNamespacePrefix "param",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/parameters#"}
  (:refer-clojure :exclude [delay]))

(def CompressorControls
  "Typical controls for a compressor."
  {:pg/element      [{:lv2/designation :param/ratio}
                     {:lv2/designation :param/threshold}],
   :rdf/about       :param/CompressorControls,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Compressor Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def ControlGroup
  "A group representing a set of associated controls."
  {:rdf/about       :param/ControlGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Control Group",
   :rdfs/subClassOf :pg/Group})

(def EnvelopeControls
  "Typical controls for a DAHDSR envelope."
  {:pg/element      [{:lv2/designation :param/release,
                      :lv2/index       5}
                     {:lv2/designation :param/sustain,
                      :lv2/index       4}
                     {:lv2/designation :param/delay,
                      :lv2/index       0}
                     {:lv2/designation :param/attack,
                      :lv2/index       1}
                     {:lv2/designation :param/decay,
                      :lv2/index       3}
                     {:lv2/designation :param/hold,
                      :lv2/index       2}],
   :rdf/about       :param/EnvelopeControls,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Envelope Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def FilterControls
  "Typical controls for a filter."
  {:pg/element      [{:lv2/designation :param/resonance}
                     {:lv2/designation :param/cutoffFrequency}],
   :rdf/about       :param/FilterControls,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Filter Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def OscillatorControls
  "Typical controls for an oscillator."
  {:pg/element      [{:lv2/designation :param/pulseWidth}
                     {:lv2/designation :param/waveform}
                     {:lv2/designation :param/amplitude}
                     {:lv2/designation :param/frequency}],
   :rdf/about       :param/OscillatorControls,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Oscillator Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def amplitude
  "An amplitude as a factor, where 0 is silent and 1 is unity."
  {:rdf/about  :param/amplitude,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "amplitude",
   :rdfs/range :atom/Float})

(def attack
  "The duration of an envelope attack stage."
  {:rdf/about  :param/attack,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "attack",
   :rdfs/range :atom/Float})

(def bypass
  "A boolean parameter that disables processing if true."
  {:rdf/about  :param/bypass,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "bypass"})

(def cutoffFrequency
  "The cutoff frequency, typically in Hz, for a filter."
  {:rdf/about  :param/cutoffFrequency,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "cutoff frequency",
   :rdfs/range :atom/Float})

(def decay
  "The duration of an envelope decay stage."
  {:rdf/about  :param/decay,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "decay",
   :rdfs/range :atom/Float})

(def delay
  "The duration of an envelope delay stage."
  {:rdf/about  :param/delay,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "delay",
   :rdfs/range :atom/Float})

(def dryLevel
  "The level of the unprocessed component of a signal."
  {:rdf/about  :param/dryLevel,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "dry level"})

(def frequency
  "A frequency, typically in Hz."
  {:rdf/about  :param/frequency,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "frequency",
   :rdfs/range :atom/Float})

(def gain
  "Gain in decibels."
  {:lv2/default 0,
   :lv2/maximum 20,
   :lv2/minimum -20,
   :rdf/about   :param/gain,
   :rdf/type    :lv2/Parameter,
   :rdfs/label  "gain",
   :rdfs/range  :atom/Float,
   :units/unit  :units/db})

(def hold
  "The duration of an envelope hold stage."
  {:rdf/about  :param/hold,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "hold",
   :rdfs/range :atom/Float})

(def pulseWidth
  "The width of a pulse of a rectangular waveform."
  {:rdf/about  :param/pulseWidth,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "pulse width",
   :rdfs/range :atom/Float})

(def ratio
  "Compression ratio."
  {:rdf/about  :param/ratio,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "ratio",
   :rdfs/range :atom/Float})

(def release
  "The duration of an envelope release stage."
  {:rdf/about  :param/release,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "release",
   :rdfs/range :atom/Float})

(def resonance
  "The resonance of a filter."
  {:rdf/about  :param/resonance,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "resonance",
   :rdfs/range :atom/Float})

(def sampleRate
  "A sample rate in Hz."
  {:rdf/about  :param/sampleRate,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "sample rate"})

(def sustain
  "The level of an envelope sustain stage as a factor."
  {:rdf/about  :param/sustain,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "sustain",
   :rdfs/range :atom/Float})

(def threshold
  "Compression threshold."
  {:rdf/about  :param/threshold,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "threshold",
   :rdfs/range :atom/Float})

(def waveform
  "The waveform \"fader\" for oscillators or modulators that have several."
  {:rdf/about  :param/waveform,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "waveform",
   :rdfs/range :atom/Float})

(def wetDryRatio
  "The ratio between processed and bypassed levels in the output."
  {:rdf/about  :param/wetDryRatio,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "wet/dry ratio"})

(def wetLevel
  "The level of the processed component of a signal."
  {:rdf/about  :param/wetLevel,
   :rdf/type   :lv2/Parameter,
   :rdfs/label "wet level"})