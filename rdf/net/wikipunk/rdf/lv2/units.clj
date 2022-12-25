(ns net.wikipunk.rdf.lv2.units
  "Units for LV2 values."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "units",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/extensions/units"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/units#",
   :rdf/ns-prefix-map {"units" "http://lv2plug.in/ns/extensions/units#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}}
  (:refer-clojure :exclude [min symbol]))

(def Conversion
  "A conversion from one unit to another."
  {:rdfs/comment "A conversion from one unit to another.",
   :rdfs/label "Conversion",
   :rdfs/subClassOf {:rdfs/comment
                       "A conversion MUST have exactly 1 units:to property.",
                     :owl/cardinality 1,
                     :owl/onProperty :units/to,
                     :rdf/type :owl/Restriction},
   :rdf/type [:owl/Class :rdfs/Class]})

(def Unit
  "A unit for a control value."
  {:rdfs/comment "A unit for a control value.",
   :rdfs/label "Unit",
   :rdf/type [:owl/Class :rdfs/Class]})

(def bar
  "Musical bars or measures."
  {:units/symbol "bars",
   :units/render "%f bars",
   :rdfs/comment "Musical bars or measures.",
   :rdfs/label "bars",
   :rdf/type :units/Unit})

(def beat
  "Musical beats."
  {:units/symbol "beats",
   :units/render "%f beats",
   :rdfs/comment "Musical beats.",
   :rdfs/label "beats",
   :rdf/type :units/Unit})

(def bpm
  "Beats Per Minute (BPM), the standard unit for musical tempo."
  {:units/symbol "BPM",
   :units/render "%f BPM",
   :units/prefixConversion #:units{:to :units/hz, :factor 0.0166666666M},
   :rdfs/comment "Beats Per Minute (BPM), the standard unit for musical tempo.",
   :rdfs/label "beats per minute",
   :rdf/type :units/Unit})

(def cent
  "Cents (hundredths of semitones)."
  {:units/symbol "ct",
   :units/render "%f ct",
   :rdfs/comment "Cents (hundredths of semitones).",
   :rdfs/label "cents",
   :units/conversion #:units{:to :units/semitone12TET, :factor 0.01M},
   :rdf/type :units/Unit})

(def cm
  "Centimetres (hundredths of metres)."
  {:units/symbol "cm",
   :units/render "%f cm",
   :units/prefixConversion [#:units{:to :units/km, :factor 0.00001M}
                            #:units{:to :units/mm, :factor 10}
                            #:units{:to :units/m, :factor 0.01M}],
   :rdfs/comment "Centimetres (hundredths of metres).",
   :rdfs/label "centimetres",
   :units/conversion #:units{:to :units/inch, :factor 0.3937M},
   :rdf/type :units/Unit})

(def coef
  "A scale coefficient where 1 is unity, or 100 percent."
  {:units/symbol "",
   :units/render "* %f",
   :rdfs/comment "A scale coefficient where 1 is unity, or 100 percent.",
   :rdfs/label "coefficient",
   :units/conversion #:units{:to :units/pc, :factor 100},
   :rdf/type :units/Unit})

(def conversion
  "A conversion from this unit to another."
  {:rdfs/comment "A conversion from this unit to another.",
   :rdfs/label "conversion",
   :rdfs/range :units/Conversion,
   :rdfs/domain :units/Unit,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def db
  "Decibels, a logarithmic relative unit where 0 is unity."
  {:units/symbol "dB",
   :units/render "%f dB",
   :rdfs/comment "Decibels, a logarithmic relative unit where 0 is unity.",
   :rdfs/label "decibels",
   :rdf/type :units/Unit})

(def degree
  "An angle where 360 degrees is one full rotation."
  {:units/symbol "deg",
   :units/render "%f deg",
   :rdfs/comment "An angle where 360 degrees is one full rotation.",
   :rdfs/label "degrees",
   :rdf/type :units/Unit})

(def factor
  "The factor to multiply the source value by in order to convert to the target unit."
  {:rdfs/comment
     "The factor to multiply the source value by in order to convert to the target unit.",
   :rdfs/label "conversion factor",
   :rdfs/domain :units/Conversion,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def frame
  "Audio frames or samples."
  {:units/symbol "frames",
   :units/render "%f frames",
   :rdfs/comment "Audio frames or samples.",
   :rdfs/label "audio frames",
   :rdf/type :units/Unit})

(def hz
  "Hertz, or inverse seconds, the SI derived unit for frequency."
  {:units/symbol "Hz",
   :units/render "%f Hz",
   :units/prefixConversion [#:units{:to :units/mhz, :factor 0.000001M}
                            #:units{:to :units/khz, :factor 0.001M}],
   :rdfs/comment
     "Hertz, or inverse seconds, the SI derived unit for frequency.",
   :rdfs/label "hertz",
   :rdf/type :units/Unit})

(def inch
  "An inch, defined as exactly 0.0254 metres."
  {:units/symbol "in",
   :units/render "%f\"",
   :rdfs/comment "An inch, defined as exactly 0.0254 metres.",
   :rdfs/label "inches",
   :units/conversion #:units{:to :units/m, :factor 0.0254M},
   :rdf/type :units/Unit})

(def khz
  "Kilohertz (thousands of Hertz)."
  {:units/symbol "kHz",
   :units/render "%f kHz",
   :units/prefixConversion [#:units{:to :units/mhz, :factor 0.001M}
                            #:units{:to :units/hz, :factor 1000}],
   :rdfs/comment "Kilohertz (thousands of Hertz).",
   :rdfs/label "kilohertz",
   :rdf/type :units/Unit})

(def km
  "Kilometres (thousands of metres)."
  {:units/symbol "km",
   :units/render "%f km",
   :units/prefixConversion [#:units{:to :units/mm, :factor 1000000}
                            #:units{:to :units/cm, :factor 100000}
                            #:units{:to :units/m, :factor 1000}],
   :rdfs/comment "Kilometres (thousands of metres).",
   :rdfs/label "kilometres",
   :units/conversion #:units{:to :units/mile, :factor 0.62138818M},
   :rdf/type :units/Unit})

(def m
  "Metres, the SI base unit for length."
  {:units/symbol "m",
   :units/render "%f m",
   :units/prefixConversion [#:units{:to :units/km, :factor 0.001M}
                            #:units{:to :units/mm, :factor 1000}
                            #:units{:to :units/cm, :factor 100}],
   :rdfs/comment "Metres, the SI base unit for length.",
   :rdfs/label "metres",
   :units/conversion #:units{:to :units/inch, :factor 39.37M},
   :rdf/type :units/Unit})

(def mhz
  "Megahertz (millions of Hertz)."
  {:units/symbol "MHz",
   :units/render "%f MHz",
   :units/prefixConversion [#:units{:to :units/khz, :factor 0.001M}
                            #:units{:to :units/hz, :factor 1000000}],
   :rdfs/comment "Megahertz (millions of Hertz).",
   :rdfs/label "megahertz",
   :rdf/type :units/Unit})

(def midiNote
  "A MIDI note number."
  {:units/symbol "note",
   :units/render "MIDI note %d",
   :rdfs/comment "A MIDI note number.",
   :rdfs/label "MIDI note",
   :rdf/type :units/Unit})

(def mile
  "A mile, defined as exactly 1609.344 metres."
  {:units/symbol "mi",
   :units/render "%f mi",
   :rdfs/comment "A mile, defined as exactly 1609.344 metres.",
   :rdfs/label "miles",
   :units/conversion #:units{:to :units/m, :factor 1609.344M},
   :rdf/type :units/Unit})

(def min
  "Minutes (60s of seconds and 60ths of an hour)."
  {:units/symbol "min",
   :units/render "%f mins",
   :rdfs/comment "Minutes (60s of seconds and 60ths of an hour).",
   :rdfs/label "minutes",
   :units/conversion #:units{:to :units/s, :factor 60},
   :rdf/type :units/Unit})

(def mm
  "Millimetres (thousandths of metres)."
  {:units/symbol "mm",
   :units/render "%f mm",
   :units/prefixConversion [#:units{:to :units/km, :factor 0.000001M}
                            #:units{:to :units/cm, :factor 0.1M}
                            #:units{:to :units/m, :factor 0.001M}],
   :rdfs/comment "Millimetres (thousandths of metres).",
   :rdfs/label "millimetres",
   :units/conversion #:units{:to :units/inch, :factor 0.03937M},
   :rdf/type :units/Unit})

(def ms
  "Milliseconds (thousandths of seconds)."
  {:units/symbol "ms",
   :units/render "%f ms",
   :units/prefixConversion #:units{:to :units/s, :factor 0.001M},
   :rdfs/comment "Milliseconds (thousandths of seconds).",
   :rdfs/label "milliseconds",
   :rdf/type :units/Unit})

(def oct
  "Octaves, relative musical pitch where +1 octave doubles the frequency."
  {:units/symbol "oct",
   :units/render "%f octaves",
   :rdfs/comment
     "Octaves, relative musical pitch where +1 octave doubles the frequency.",
   :rdfs/label "octaves",
   :units/conversion #:units{:to :units/semitone12TET, :factor 12},
   :rdf/type :units/Unit})

(def pc
  "Percentage, a ratio as a fraction of 100."
  {:units/symbol "%",
   :units/render "%f%%",
   :rdfs/comment "Percentage, a ratio as a fraction of 100.",
   :rdfs/label "percent",
   :units/conversion #:units{:to :units/coef, :factor 0.01M},
   :rdf/type :units/Unit})

(def prefixConversion
  "A conversion from this unit to another with the same base but a different prefix."
  {:rdfs/comment
     "A conversion from this unit to another with the same base but a different prefix.",
   :rdfs/label "prefix conversion",
   :rdfs/range :units/Conversion,
   :rdfs/domain :units/Unit,
   :rdfs/subPropertyOf :units/conversion,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def render
  "A printf format string for rendering a value (e.g., \"%f dB\")."
  {:rdfs/comment
     "A printf format string for rendering a value (e.g., \"%f dB\").",
   :rdfs/range :xsd/string,
   :rdfs/domain :units/Unit,
   :rdfs/label "unit format string",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def s
  "Seconds, the SI base unit for time."
  {:units/symbol "s",
   :units/render "%f s",
   :units/prefixConversion #:units{:to :units/ms, :factor 1000},
   :rdfs/comment "Seconds, the SI base unit for time.",
   :rdfs/label "seconds",
   :units/conversion #:units{:to :units/min, :factor 0.0166666666M},
   :rdf/type :units/Unit})

(def semitone12TET
  "A semitone in the 12-tone equal temperament scale."
  {:units/symbol "semi",
   :units/render "%f semi",
   :rdfs/comment "A semitone in the 12-tone equal temperament scale.",
   :rdfs/label "semitones",
   :units/conversion #:units{:to :units/oct, :factor 0.083333333M},
   :rdf/type :units/Unit})

(def symbol
  "The abbreviated symbol for this unit (e.g., \"dB\")."
  {:rdfs/comment "The abbreviated symbol for this unit (e.g., \"dB\").",
   :rdfs/range :xsd/string,
   :rdfs/domain :units/Unit,
   :rdfs/label "unit symbol",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def to
  "The target unit this conversion converts to."
  {:rdfs/comment "The target unit this conversion converts to.",
   :rdfs/label "conversion target",
   :rdfs/range :units/Unit,
   :rdfs/domain :units/Conversion,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def unit
  "The unit used by the value of a port or parameter."
  {:rdfs/comment "The unit used by the value of a port or parameter.",
   :rdfs/label "unit",
   :rdfs/range :units/Unit,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})