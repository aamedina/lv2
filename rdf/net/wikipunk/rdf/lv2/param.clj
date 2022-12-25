(ns net.wikipunk.rdf.lv2.param
  "Common parameters for audio processing."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "param",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.ttl",
   :owl/imports [#:rdf{:uri "http://lv2plug.in/ns/lv2core"}
                 #:rdf{:uri "http://lv2plug.in/ns/ext/port-groups"}
                 #:rdf{:uri "http://lv2plug.in/ns/ext/atom"}],
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/parameters"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/parameters#",
   :rdf/ns-prefix-map {"param" "http://lv2plug.in/ns/ext/parameters#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "pg" "http://lv2plug.in/ns/ext/port-groups#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "units" "http://lv2plug.in/ns/extensions/units#",
                       "atom" "http://lv2plug.in/ns/ext/atom#"}}
  (:refer-clojure :exclude [delay]))

(def CompressorControls
  "Typical controls for a compressor."
  {:pg/element [#:lv2{:designation :param/ratio}
                #:lv2{:designation :param/threshold}],
   :rdfs/comment "Typical controls for a compressor.",
   :rdfs/label "Compressor Controls",
   :rdfs/subClassOf :param/ControlGroup,
   :rdf/type :rdfs/Class})

(def ControlGroup
  "A group representing a set of associated controls."
  {:rdfs/comment "A group representing a set of associated controls.",
   :rdfs/label "Control Group",
   :rdfs/subClassOf :pg/Group,
   :rdf/type :rdfs/Class})

(def EnvelopeControls
  "Typical controls for a DAHDSR envelope."
  {:pg/element [#:lv2{:designation :param/hold, :index 2}
                #:lv2{:designation :param/attack, :index 1}
                #:lv2{:designation :param/decay, :index 3}
                #:lv2{:designation :param/delay, :index 0}
                #:lv2{:designation :param/sustain, :index 4}
                #:lv2{:designation :param/release, :index 5}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "Typical controls for a DAHDSR envelope.",
   :rdfs/subClassOf :param/ControlGroup,
   :rdfs/label "Envelope Controls"})

(def FilterControls
  "Typical controls for a filter."
  {:pg/element [#:lv2{:designation :param/resonance}
                #:lv2{:designation :param/cutoffFrequency}],
   :rdfs/comment "Typical controls for a filter.",
   :rdfs/label "Filter Controls",
   :rdfs/subClassOf :param/ControlGroup,
   :rdf/type :rdfs/Class})

(def OscillatorControls
  "Typical controls for an oscillator."
  {:pg/element [#:lv2{:designation :param/pulseWidth}
                #:lv2{:designation :param/waveform}
                #:lv2{:designation :param/amplitude}
                #:lv2{:designation :param/frequency}],
   :rdfs/comment "Typical controls for an oscillator.",
   :rdfs/label "Oscillator Controls",
   :rdfs/subClassOf :param/ControlGroup,
   :rdf/type :rdfs/Class})

(def amplitude
  "An amplitude as a factor, where 0 is silent and 1 is unity."
  {:rdfs/comment "An amplitude as a factor, where 0 is silent and 1 is unity.",
   :rdfs/label "amplitude",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def attack
  "The duration of an envelope attack stage."
  {:rdfs/comment "The duration of an envelope attack stage.",
   :rdfs/label "attack",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def bypass
  "A boolean parameter that disables processing if true."
  {:rdfs/comment "A boolean parameter that disables processing if true.",
   :rdfs/label "bypass",
   :rdf/type :lv2/Parameter})

(def cutoffFrequency
  "The cutoff frequency, typically in Hz, for a filter."
  {:rdfs/comment "The cutoff frequency, typically in Hz, for a filter.",
   :rdfs/label "cutoff frequency",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def decay
  "The duration of an envelope decay stage."
  {:rdfs/comment "The duration of an envelope decay stage.",
   :rdfs/label "decay",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def delay
  "The duration of an envelope delay stage."
  {:rdfs/comment "The duration of an envelope delay stage.",
   :rdfs/label "delay",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def dryLevel
  "The level of the unprocessed component of a signal."
  {:rdfs/comment "The level of the unprocessed component of a signal.",
   :rdfs/label "dry level",
   :rdf/type :lv2/Parameter})

(def frequency
  "A frequency, typically in Hz."
  {:rdfs/comment "A frequency, typically in Hz.",
   :rdfs/label "frequency",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def gain
  "Gain in decibels."
  {:rdf/type :lv2/Parameter,
   :lv2/default 0,
   :lv2/maximum 20,
   :lv2/minimum -20,
   :rdfs/label "gain",
   :units/unit :units/db,
   :rdfs/comment "Gain in decibels.",
   :rdfs/range :atom/Float})

(def hold
  "The duration of an envelope hold stage."
  {:rdfs/comment "The duration of an envelope hold stage.",
   :rdfs/label "hold",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def pulseWidth
  "The width of a pulse of a rectangular waveform."
  {:rdfs/comment "The width of a pulse of a rectangular waveform.",
   :rdfs/label "pulse width",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def ratio
  "Compression ratio."
  {:rdfs/comment "Compression ratio.",
   :rdfs/label "ratio",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def release
  "The duration of an envelope release stage."
  {:rdfs/comment "The duration of an envelope release stage.",
   :rdfs/label "release",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def resonance
  "The resonance of a filter."
  {:rdfs/comment "The resonance of a filter.",
   :rdfs/label "resonance",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def sampleRate
  "A sample rate in Hz."
  {:rdfs/comment "A sample rate in Hz.",
   :rdfs/label "sample rate",
   :rdf/type :lv2/Parameter})

(def sustain
  "The level of an envelope sustain stage as a factor."
  {:rdfs/comment "The level of an envelope sustain stage as a factor.",
   :rdfs/range :atom/Float,
   :rdfs/label "sustain",
   :rdf/type :lv2/Parameter})

(def threshold
  "Compression threshold."
  {:rdfs/comment "Compression threshold.",
   :rdfs/label "threshold",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def waveform
  "The waveform \"fader\" for oscillators or modulators that have several."
  {:rdfs/comment
     "The waveform \"fader\" for oscillators or modulators that have several.",
   :rdfs/label "waveform",
   :rdfs/range :atom/Float,
   :rdf/type :lv2/Parameter})

(def wetDryRatio
  "The ratio between processed and bypassed levels in the output."
  {:rdfs/comment
     "The ratio between processed and bypassed levels in the output.",
   :rdfs/label "wet/dry ratio",
   :rdf/type :lv2/Parameter})

(def wetLevel
  "The level of the processed component of a signal."
  {:rdfs/comment "The level of the processed component of a signal.",
   :rdfs/label "wet level",
   :rdf/type :lv2/Parameter})