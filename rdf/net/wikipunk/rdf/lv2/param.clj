(ns net.wikipunk.rdf.lv2.param
  "This is a vocabulary for parameters that are common in audio processing software.  A <q>parameter</q> is purely a metadata concept, unrelated to any particular code mechanism.  Parameters are used to assign meaning to controls (for example, using lv2:designation for ports) so they can be used more intelligently or presented to the user more efficiently."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.ttl",
   :lv2/project {:doap/created    "2009-00-00",
                 :doap/developer  {:rdf/uri "http://lv2plug.in/ns/meta#larsl"},
                 :doap/maintainer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/name       "LV2 Parameters",
                 :doap/shortdesc  "Common parameters for audio processing.",
                 :rdf/about       {:rdf/uri
                                   "http://lv2plug.in/ns/ext/parameters"},
                 :rdf/type        :doap/Project},
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
   :rdfs/comment "Common parameters for audio processing.",
   :rdfs/label "LV2 Parameters",
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
   :rdfs/comment    "Typical controls for a compressor.",
   :rdfs/label      "Compressor Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def ControlGroup
  "A group representing a set of associated controls."
  {:rdf/about       :param/ControlGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group representing a set of associated controls.",
   :rdfs/label      "Control Group",
   :rdfs/subClassOf :pg/Group})

(def EnvelopeControls
  "Typical controls for a DAHDSR envelope."
  {:pg/element      [{:lv2/designation :param/attack,
                      :lv2/index       1}
                     {:lv2/designation :param/hold,
                      :lv2/index       2}
                     {:lv2/designation :param/delay,
                      :lv2/index       0}
                     {:lv2/designation :param/decay,
                      :lv2/index       3}
                     {:lv2/designation :param/sustain,
                      :lv2/index       4}
                     {:lv2/designation :param/release,
                      :lv2/index       5}],
   :rdf/about       :param/EnvelopeControls,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a DAHDSR envelope.",
   :rdfs/label      "Envelope Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def FilterControls
  "Typical controls for a filter."
  {:pg/element      [{:lv2/designation :param/resonance}
                     {:lv2/designation :param/cutoffFrequency}],
   :rdf/about       :param/FilterControls,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Typical controls for a filter.",
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
   :rdfs/comment    "Typical controls for an oscillator.",
   :rdfs/label      "Oscillator Controls",
   :rdfs/subClassOf :param/ControlGroup})

(def amplitude
  "An amplitude as a factor, where 0 is silent and 1 is unity."
  {:rdf/about    :param/amplitude,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "An amplitude as a factor, where 0 is silent and 1 is unity.",
   :rdfs/label   "amplitude",
   :rdfs/range   :atom/Float})

(def attack
  "The duration of an envelope attack stage."
  {:rdf/about    :param/attack,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope attack stage.",
   :rdfs/label   "attack",
   :rdfs/range   :atom/Float})

(def bypass
  "A boolean parameter that disables processing if true."
  {:rdf/about    :param/bypass,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A boolean parameter that disables processing if true.",
   :rdfs/label   "bypass"})

(def cutoffFrequency
  "The cutoff frequency, typically in Hz, for a filter."
  {:rdf/about    :param/cutoffFrequency,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The cutoff frequency, typically in Hz, for a filter.",
   :rdfs/label   "cutoff frequency",
   :rdfs/range   :atom/Float})

(def decay
  "The duration of an envelope decay stage."
  {:rdf/about    :param/decay,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope decay stage.",
   :rdfs/label   "decay",
   :rdfs/range   :atom/Float})

(def delay
  "The duration of an envelope delay stage."
  {:rdf/about    :param/delay,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope delay stage.",
   :rdfs/label   "delay",
   :rdfs/range   :atom/Float})

(def dryLevel
  "The level of the unprocessed component of a signal."
  {:rdf/about    :param/dryLevel,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of the unprocessed component of a signal.",
   :rdfs/label   "dry level"})

(def frequency
  "A frequency, typically in Hz."
  {:rdf/about    :param/frequency,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A frequency, typically in Hz.",
   :rdfs/label   "frequency",
   :rdfs/range   :atom/Float})

(def gain
  "Gain in decibels."
  {:lv2/default  0,
   :lv2/maximum  20,
   :lv2/minimum  -20,
   :rdf/about    :param/gain,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Gain in decibels.",
   :rdfs/label   "gain",
   :rdfs/range   :atom/Float,
   :units/unit   :units/db})

(def hold
  "The duration of an envelope hold stage."
  {:rdf/about    :param/hold,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope hold stage.",
   :rdfs/label   "hold",
   :rdfs/range   :atom/Float})

(def pulseWidth
  "The width of a pulse of a rectangular waveform."
  {:rdf/about    :param/pulseWidth,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The width of a pulse of a rectangular waveform.",
   :rdfs/label   "pulse width",
   :rdfs/range   :atom/Float})

(def ratio
  "Compression ratio."
  {:rdf/about    :param/ratio,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Compression ratio.",
   :rdfs/label   "ratio",
   :rdfs/range   :atom/Float})

(def release
  "The duration of an envelope release stage."
  {:rdf/about    :param/release,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The duration of an envelope release stage.",
   :rdfs/label   "release",
   :rdfs/range   :atom/Float})

(def resonance
  "The resonance of a filter."
  {:rdf/about    :param/resonance,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The resonance of a filter.",
   :rdfs/label   "resonance",
   :rdfs/range   :atom/Float})

(def sampleRate
  "A sample rate in Hz."
  {:rdf/about    :param/sampleRate,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "A sample rate in Hz.",
   :rdfs/label   "sample rate"})

(def sustain
  "The level of an envelope sustain stage as a factor."
  {:rdf/about    :param/sustain,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of an envelope sustain stage as a factor.",
   :rdfs/label   "sustain",
   :rdfs/range   :atom/Float})

(def threshold
  "Compression threshold."
  {:rdf/about    :param/threshold,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "Compression threshold.",
   :rdfs/label   "threshold",
   :rdfs/range   :atom/Float})

(def waveform
  "The waveform \"fader\" for oscillators or modulators that have several."
  {:rdf/about :param/waveform,
   :rdf/type :lv2/Parameter,
   :rdfs/comment
   "The waveform \"fader\" for oscillators or modulators that have several.",
   :rdfs/label "waveform",
   :rdfs/range :atom/Float})

(def wetDryRatio
  "The ratio between processed and bypass components in output signal.  The dry and wet percentages can be calculated from the following equations:      :::c     dry = (wetDryRatio.maximum - wetDryRatio.value) / wetDryRatio.maximum     wet = wetDryRatio.value / wetDryRatio.maximum  Typically, maximum value of 1 or 100 and minimum value of 0 should be used."
  {:rdf/about :param/wetDryRatio,
   :rdf/type :lv2/Parameter,
   :rdfs/comment
   "The ratio between processed and bypassed levels in the output.",
   :rdfs/label "wet/dry ratio"})

(def wetLevel
  "The level of the processed component of a signal."
  {:rdf/about    :param/wetLevel,
   :rdf/type     :lv2/Parameter,
   :rdfs/comment "The level of the processed component of a signal.",
   :rdfs/label   "wet level"})