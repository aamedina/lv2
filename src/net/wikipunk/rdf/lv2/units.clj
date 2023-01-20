(ns net.wikipunk.rdf.lv2.units
  "Units for LV2 values."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.ttl",
   :rdf/ns-prefix-map {"lv2.units" "http://lv2plug.in/ns/ext/units#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/extensions/units",
   :rdfa/prefix "lv2.units",
   :rdfa/uri "http://lv2plug.in/ns/extensions/units#",
   :rdfs/comment "Units for LV2 values.",
   :rdfs/label "LV2 Units",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.meta.ttl"]}
  (:refer-clojure :exclude [min symbol]))

(def Conversion
  "A conversion from one unit to another."
  {:db/ident        :lv2.units/Conversion,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A conversion from one unit to another.",
   :rdfs/label      "Conversion",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :lv2.units/to,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A conversion MUST have exactly 1 units:to property."}})

(def Unit
  "A unit for a control value."
  {:db/ident     :lv2.units/Unit,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A unit for a control value.",
   :rdfs/label   "Unit"})

(def bar
  "Musical bars or measures."
  {:db/ident         :lv2.units/bar,
   :lv2.units/render "%f bars",
   :lv2.units/symbol "bars",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "Musical bars or measures.",
   :rdfs/label       "bars"})

(def beat
  "Musical beats."
  {:db/ident         :lv2.units/beat,
   :lv2.units/render "%f beats",
   :lv2.units/symbol "beats",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "Musical beats.",
   :rdfs/label       "beats"})

(def bpm
  "Beats Per Minute (BPM), the standard unit for musical tempo."
  {:db/ident :lv2.units/bpm,
   :lv2.units/prefixConversion {:lv2.units/factor 0.0166666666M,
                                :lv2.units/to     :lv2.units/hz},
   :lv2.units/render "%f BPM",
   :lv2.units/symbol "BPM",
   :rdf/type :lv2.units/Unit,
   :rdfs/comment "Beats Per Minute (BPM), the standard unit for musical tempo.",
   :rdfs/label "beats per minute"})

(def cent
  "Cents (hundredths of semitones)."
  {:db/ident             :lv2.units/cent,
   :lv2.units/conversion {:lv2.units/factor 0.01M,
                          :lv2.units/to     :lv2.units/semitone12TET},
   :lv2.units/render     "%f ct",
   :lv2.units/symbol     "ct",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Cents (hundredths of semitones).",
   :rdfs/label           "cents"})

(def cm
  "Centimetres (hundredths of metres)."
  {:db/ident             :lv2.units/cm,
   :lv2.units/conversion {:lv2.units/factor 0.3937M,
                          :lv2.units/to     :lv2.units/inch},
   :lv2.units/prefixConversion [{:lv2.units/factor 0.00001M,
                                 :lv2.units/to     :lv2.units/km}
                                {:lv2.units/factor 10,
                                 :lv2.units/to     :lv2.units/mm}
                                {:lv2.units/factor 0.01M,
                                 :lv2.units/to     :lv2.units/m}],
   :lv2.units/render     "%f cm",
   :lv2.units/symbol     "cm",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Centimetres (hundredths of metres).",
   :rdfs/label           "centimetres"})

(def coef
  "A scale coefficient where 1 is unity, or 100 percent."
  {:db/ident :lv2.units/coef,
   :lv2.units/conversion {:lv2.units/factor 100,
                          :lv2.units/to     :lv2.units/pc},
   :lv2.units/render "* %f",
   :lv2.units/symbol "",
   :rdf/type :lv2.units/Unit,
   :rdfs/comment "A scale coefficient where 1 is unity, or 100 percent.",
   :rdfs/label "coefficient"})

(def conversion
  "A conversion from this unit to another."
  {:db/ident     :lv2.units/conversion,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A conversion from this unit to another.",
   :rdfs/domain  :lv2.units/Unit,
   :rdfs/label   "conversion",
   :rdfs/range   :lv2.units/Conversion})

(def db
  "Decibels, a logarithmic relative unit where 0 is unity."
  {:db/ident         :lv2.units/db,
   :lv2.units/render "%f dB",
   :lv2.units/symbol "dB",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "Decibels, a logarithmic relative unit where 0 is unity.",
   :rdfs/label       "decibels"})

(def degree
  "An angle where 360 degrees is one full rotation."
  {:db/ident         :lv2.units/degree,
   :lv2.units/render "%f deg",
   :lv2.units/symbol "deg",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "An angle where 360 degrees is one full rotation.",
   :rdfs/label       "degrees"})

(def factor
  "The factor to multiply the source value by in order to convert to the target unit."
  {:db/ident :lv2.units/factor,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The factor to multiply the source value by in order to convert to the target unit.",
   :rdfs/domain :lv2.units/Conversion,
   :rdfs/label "conversion factor"})

(def frame
  "Audio frames or samples."
  {:db/ident         :lv2.units/frame,
   :lv2.units/render "%f frames",
   :lv2.units/symbol "frames",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "Audio frames or samples.",
   :rdfs/label       "audio frames"})

(def hz
  "Hertz, or inverse seconds, the SI derived unit for frequency."
  {:db/ident :lv2.units/hz,
   :lv2.units/prefixConversion [{:lv2.units/factor 0.000001M,
                                 :lv2.units/to     :lv2.units/mhz}
                                {:lv2.units/factor 0.001M,
                                 :lv2.units/to     :lv2.units/khz}],
   :lv2.units/render "%f Hz",
   :lv2.units/symbol "Hz",
   :rdf/type :lv2.units/Unit,
   :rdfs/comment
   "Hertz, or inverse seconds, the SI derived unit for frequency.",
   :rdfs/label "hertz"})

(def inch
  "An inch, defined as exactly 0.0254 metres."
  {:db/ident             :lv2.units/inch,
   :lv2.units/conversion {:lv2.units/factor 0.0254M,
                          :lv2.units/to     :lv2.units/m},
   :lv2.units/render     "%f\"",
   :lv2.units/symbol     "in",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "An inch, defined as exactly 0.0254 metres.",
   :rdfs/label           "inches"})

(def khz
  "Kilohertz (thousands of Hertz)."
  {:db/ident         :lv2.units/khz,
   :lv2.units/prefixConversion [{:lv2.units/factor 0.001M,
                                 :lv2.units/to     :lv2.units/mhz}
                                {:lv2.units/factor 1000,
                                 :lv2.units/to     :lv2.units/hz}],
   :lv2.units/render "%f kHz",
   :lv2.units/symbol "kHz",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "Kilohertz (thousands of Hertz).",
   :rdfs/label       "kilohertz"})

(def km
  "Kilometres (thousands of metres)."
  {:db/ident             :lv2.units/km,
   :lv2.units/conversion {:lv2.units/factor 0.62138818M,
                          :lv2.units/to     :lv2.units/mile},
   :lv2.units/prefixConversion [{:lv2.units/factor 1000000,
                                 :lv2.units/to     :lv2.units/mm}
                                {:lv2.units/factor 100000,
                                 :lv2.units/to     :lv2.units/cm}
                                {:lv2.units/factor 1000,
                                 :lv2.units/to     :lv2.units/m}],
   :lv2.units/render     "%f km",
   :lv2.units/symbol     "km",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Kilometres (thousands of metres).",
   :rdfs/label           "kilometres"})

(def m
  "Metres, the SI base unit for length."
  {:db/ident             :lv2.units/m,
   :lv2.units/conversion {:lv2.units/factor 39.37M,
                          :lv2.units/to     :lv2.units/inch},
   :lv2.units/prefixConversion [{:lv2.units/factor 0.001M,
                                 :lv2.units/to     :lv2.units/km}
                                {:lv2.units/factor 1000,
                                 :lv2.units/to     :lv2.units/mm}
                                {:lv2.units/factor 100,
                                 :lv2.units/to     :lv2.units/cm}],
   :lv2.units/render     "%f m",
   :lv2.units/symbol     "m",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Metres, the SI base unit for length.",
   :rdfs/label           "metres"})

(def mhz
  "Megahertz (millions of Hertz)."
  {:db/ident         :lv2.units/mhz,
   :lv2.units/prefixConversion [{:lv2.units/factor 0.001M,
                                 :lv2.units/to     :lv2.units/khz}
                                {:lv2.units/factor 1000000,
                                 :lv2.units/to     :lv2.units/hz}],
   :lv2.units/render "%f MHz",
   :lv2.units/symbol "MHz",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "Megahertz (millions of Hertz).",
   :rdfs/label       "megahertz"})

(def midiNote
  "A MIDI note number."
  {:db/ident         :lv2.units/midiNote,
   :lv2.units/render "MIDI note %d",
   :lv2.units/symbol "note",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "A MIDI note number.",
   :rdfs/label       "MIDI note"})

(def mile
  "A mile, defined as exactly 1609.344 metres."
  {:db/ident             :lv2.units/mile,
   :lv2.units/conversion {:lv2.units/factor 1609.344M,
                          :lv2.units/to     :lv2.units/m},
   :lv2.units/render     "%f mi",
   :lv2.units/symbol     "mi",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "A mile, defined as exactly 1609.344 metres.",
   :rdfs/label           "miles"})

(def min
  "Minutes (60s of seconds and 60ths of an hour)."
  {:db/ident             :lv2.units/min,
   :lv2.units/conversion {:lv2.units/factor 60,
                          :lv2.units/to     :lv2.units/s},
   :lv2.units/render     "%f mins",
   :lv2.units/symbol     "min",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Minutes (60s of seconds and 60ths of an hour).",
   :rdfs/label           "minutes"})

(def mm
  "Millimetres (thousandths of metres)."
  {:db/ident             :lv2.units/mm,
   :lv2.units/conversion {:lv2.units/factor 0.03937M,
                          :lv2.units/to     :lv2.units/inch},
   :lv2.units/prefixConversion [{:lv2.units/factor 0.000001M,
                                 :lv2.units/to     :lv2.units/km}
                                {:lv2.units/factor 0.1M,
                                 :lv2.units/to     :lv2.units/cm}
                                {:lv2.units/factor 0.001M,
                                 :lv2.units/to     :lv2.units/m}],
   :lv2.units/render     "%f mm",
   :lv2.units/symbol     "mm",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Millimetres (thousandths of metres).",
   :rdfs/label           "millimetres"})

(def ms
  "Milliseconds (thousandths of seconds)."
  {:db/ident         :lv2.units/ms,
   :lv2.units/prefixConversion {:lv2.units/factor 0.001M,
                                :lv2.units/to     :lv2.units/s},
   :lv2.units/render "%f ms",
   :lv2.units/symbol "ms",
   :rdf/type         :lv2.units/Unit,
   :rdfs/comment     "Milliseconds (thousandths of seconds).",
   :rdfs/label       "milliseconds"})

(def oct
  "Octaves, relative musical pitch where +1 octave doubles the frequency."
  {:db/ident :lv2.units/oct,
   :lv2.units/conversion {:lv2.units/factor 12,
                          :lv2.units/to     :lv2.units/semitone12TET},
   :lv2.units/render "%f octaves",
   :lv2.units/symbol "oct",
   :rdf/type :lv2.units/Unit,
   :rdfs/comment
   "Octaves, relative musical pitch where +1 octave doubles the frequency.",
   :rdfs/label "octaves"})

(def pc
  "Percentage, a ratio as a fraction of 100."
  {:db/ident             :lv2.units/pc,
   :lv2.units/conversion {:lv2.units/factor 0.01M,
                          :lv2.units/to     :lv2.units/coef},
   :lv2.units/render     "%f%%",
   :lv2.units/symbol     "%",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Percentage, a ratio as a fraction of 100.",
   :rdfs/label           "percent"})

(def prefixConversion
  "A conversion from this unit to another with the same base but a different prefix."
  {:db/ident :lv2.units/prefixConversion,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A conversion from this unit to another with the same base but a different prefix.",
   :rdfs/domain :lv2.units/Unit,
   :rdfs/label "prefix conversion",
   :rdfs/range :lv2.units/Conversion,
   :rdfs/subPropertyOf :lv2.units/conversion})

(def render
  "A printf format string for rendering a value (e.g., \"%f dB\")."
  {:db/ident :lv2.units/render,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "A printf format string for rendering a value (e.g., \"%f dB\").",
   :rdfs/domain :lv2.units/Unit,
   :rdfs/label "unit format string",
   :rdfs/range :xsd/string})

(def s
  "Seconds, the SI base unit for time."
  {:db/ident             :lv2.units/s,
   :lv2.units/conversion {:lv2.units/factor 0.0166666666M,
                          :lv2.units/to     :lv2.units/min},
   :lv2.units/prefixConversion {:lv2.units/factor 1000,
                                :lv2.units/to     :lv2.units/ms},
   :lv2.units/render     "%f s",
   :lv2.units/symbol     "s",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "Seconds, the SI base unit for time.",
   :rdfs/label           "seconds"})

(def semitone12TET
  "A semitone in the 12-tone equal temperament scale."
  {:db/ident             :lv2.units/semitone12TET,
   :lv2.units/conversion {:lv2.units/factor 0.083333333M,
                          :lv2.units/to     :lv2.units/oct},
   :lv2.units/render     "%f semi",
   :lv2.units/symbol     "semi",
   :rdf/type             :lv2.units/Unit,
   :rdfs/comment         "A semitone in the 12-tone equal temperament scale.",
   :rdfs/label           "semitones"})

(def symbol
  "The abbreviated symbol for this unit (e.g., \"dB\")."
  {:db/ident     :lv2.units/symbol,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The abbreviated symbol for this unit (e.g., \"dB\").",
   :rdfs/domain  :lv2.units/Unit,
   :rdfs/label   "unit symbol",
   :rdfs/range   :xsd/string})

(def to
  "The target unit this conversion converts to."
  {:db/ident     :lv2.units/to,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The target unit this conversion converts to.",
   :rdfs/domain  :lv2.units/Conversion,
   :rdfs/label   "conversion target",
   :rdfs/range   :lv2.units/Unit})

(def unit
  "The unit used by the value of a port or parameter."
  {:db/ident     :lv2.units/unit,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The unit used by the value of a port or parameter.",
   :rdfs/label   "unit",
   :rdfs/range   :lv2.units/Unit})