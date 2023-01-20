(ns net.wikipunk.rdf.lv2.units
  "Units for LV2 values."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.ttl",
   :rdf/ns-prefix-map {"owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "units" "http://lv2plug.in/ns/extensions/units#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/extensions/units",
   :rdfa/prefix "units",
   :rdfa/uri "http://lv2plug.in/ns/ext/units#",
   :rdfs/comment "Units for LV2 values.",
   :rdfs/label "LV2 Units",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.meta.ttl"]}
  (:refer-clojure :exclude [min symbol]))

(def Conversion
  "A conversion from one unit to another."
  {:db/ident        :units/Conversion,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A conversion from one unit to another.",
   :rdfs/label      "Conversion",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :units/to,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A conversion MUST have exactly 1 units:to property."}})

(def Unit
  "A unit for a control value."
  {:db/ident     :units/Unit,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A unit for a control value.",
   :rdfs/label   "Unit"})

(def bar
  "Musical bars or measures."
  {:db/ident     :units/bar,
   :rdf/type     :units/Unit,
   :rdfs/comment "Musical bars or measures.",
   :rdfs/label   "bars",
   :units/render "%f bars",
   :units/symbol "bars"})

(def beat
  "Musical beats."
  {:db/ident     :units/beat,
   :rdf/type     :units/Unit,
   :rdfs/comment "Musical beats.",
   :rdfs/label   "beats",
   :units/render "%f beats",
   :units/symbol "beats"})

(def bpm
  "Beats Per Minute (BPM), the standard unit for musical tempo."
  {:db/ident :units/bpm,
   :rdf/type :units/Unit,
   :rdfs/comment "Beats Per Minute (BPM), the standard unit for musical tempo.",
   :rdfs/label "beats per minute",
   :units/prefixConversion {:units/factor 0.0166666666M,
                            :units/to     :units/hz},
   :units/render "%f BPM",
   :units/symbol "BPM"})

(def cent
  "Cents (hundredths of semitones)."
  {:db/ident         :units/cent,
   :rdf/type         :units/Unit,
   :rdfs/comment     "Cents (hundredths of semitones).",
   :rdfs/label       "cents",
   :units/conversion {:units/factor 0.01M,
                      :units/to     :units/semitone12TET},
   :units/render     "%f ct",
   :units/symbol     "ct"})

(def cm
  "Centimetres (hundredths of metres)."
  {:db/ident               :units/cm,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Centimetres (hundredths of metres).",
   :rdfs/label             "centimetres",
   :units/conversion       {:units/factor 0.3937M,
                            :units/to     :units/inch},
   :units/prefixConversion [{:units/factor 0.00001M,
                             :units/to     :units/km}
                            {:units/factor 10,
                             :units/to     :units/mm}
                            {:units/factor 0.01M,
                             :units/to     :units/m}],
   :units/render           "%f cm",
   :units/symbol           "cm"})

(def coef
  "A scale coefficient where 1 is unity, or 100 percent."
  {:db/ident         :units/coef,
   :rdf/type         :units/Unit,
   :rdfs/comment     "A scale coefficient where 1 is unity, or 100 percent.",
   :rdfs/label       "coefficient",
   :units/conversion {:units/factor 100,
                      :units/to     :units/pc},
   :units/render     "* %f",
   :units/symbol     ""})

(def conversion
  "A conversion from this unit to another."
  {:db/ident     :units/conversion,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A conversion from this unit to another.",
   :rdfs/domain  :units/Unit,
   :rdfs/label   "conversion",
   :rdfs/range   :units/Conversion})

(def db
  "Decibels, a logarithmic relative unit where 0 is unity."
  {:db/ident     :units/db,
   :rdf/type     :units/Unit,
   :rdfs/comment "Decibels, a logarithmic relative unit where 0 is unity.",
   :rdfs/label   "decibels",
   :units/render "%f dB",
   :units/symbol "dB"})

(def degree
  "An angle where 360 degrees is one full rotation."
  {:db/ident     :units/degree,
   :rdf/type     :units/Unit,
   :rdfs/comment "An angle where 360 degrees is one full rotation.",
   :rdfs/label   "degrees",
   :units/render "%f deg",
   :units/symbol "deg"})

(def factor
  "The factor to multiply the source value by in order to convert to the target unit."
  {:db/ident :units/factor,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The factor to multiply the source value by in order to convert to the target unit.",
   :rdfs/domain :units/Conversion,
   :rdfs/label "conversion factor"})

(def frame
  "Audio frames or samples."
  {:db/ident     :units/frame,
   :rdf/type     :units/Unit,
   :rdfs/comment "Audio frames or samples.",
   :rdfs/label   "audio frames",
   :units/render "%f frames",
   :units/symbol "frames"})

(def hz
  "Hertz, or inverse seconds, the SI derived unit for frequency."
  {:db/ident :units/hz,
   :rdf/type :units/Unit,
   :rdfs/comment
   "Hertz, or inverse seconds, the SI derived unit for frequency.",
   :rdfs/label "hertz",
   :units/prefixConversion [{:units/factor 0.000001M,
                             :units/to     :units/mhz}
                            {:units/factor 0.001M,
                             :units/to     :units/khz}],
   :units/render "%f Hz",
   :units/symbol "Hz"})

(def inch
  "An inch, defined as exactly 0.0254 metres."
  {:db/ident         :units/inch,
   :rdf/type         :units/Unit,
   :rdfs/comment     "An inch, defined as exactly 0.0254 metres.",
   :rdfs/label       "inches",
   :units/conversion {:units/factor 0.0254M,
                      :units/to     :units/m},
   :units/render     "%f\"",
   :units/symbol     "in"})

(def khz
  "Kilohertz (thousands of Hertz)."
  {:db/ident               :units/khz,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Kilohertz (thousands of Hertz).",
   :rdfs/label             "kilohertz",
   :units/prefixConversion [{:units/factor 0.001M,
                             :units/to     :units/mhz}
                            {:units/factor 1000,
                             :units/to     :units/hz}],
   :units/render           "%f kHz",
   :units/symbol           "kHz"})

(def km
  "Kilometres (thousands of metres)."
  {:db/ident               :units/km,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Kilometres (thousands of metres).",
   :rdfs/label             "kilometres",
   :units/conversion       {:units/factor 0.62138818M,
                            :units/to     :units/mile},
   :units/prefixConversion [{:units/factor 1000000,
                             :units/to     :units/mm}
                            {:units/factor 100000,
                             :units/to     :units/cm}
                            {:units/factor 1000,
                             :units/to     :units/m}],
   :units/render           "%f km",
   :units/symbol           "km"})

(def m
  "Metres, the SI base unit for length."
  {:db/ident               :units/m,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Metres, the SI base unit for length.",
   :rdfs/label             "metres",
   :units/conversion       {:units/factor 39.37M,
                            :units/to     :units/inch},
   :units/prefixConversion [{:units/factor 0.001M,
                             :units/to     :units/km}
                            {:units/factor 1000,
                             :units/to     :units/mm}
                            {:units/factor 100,
                             :units/to     :units/cm}],
   :units/render           "%f m",
   :units/symbol           "m"})

(def mhz
  "Megahertz (millions of Hertz)."
  {:db/ident               :units/mhz,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Megahertz (millions of Hertz).",
   :rdfs/label             "megahertz",
   :units/prefixConversion [{:units/factor 0.001M,
                             :units/to     :units/khz}
                            {:units/factor 1000000,
                             :units/to     :units/hz}],
   :units/render           "%f MHz",
   :units/symbol           "MHz"})

(def midiNote
  "A MIDI note number."
  {:db/ident     :units/midiNote,
   :rdf/type     :units/Unit,
   :rdfs/comment "A MIDI note number.",
   :rdfs/label   "MIDI note",
   :units/render "MIDI note %d",
   :units/symbol "note"})

(def mile
  "A mile, defined as exactly 1609.344 metres."
  {:db/ident         :units/mile,
   :rdf/type         :units/Unit,
   :rdfs/comment     "A mile, defined as exactly 1609.344 metres.",
   :rdfs/label       "miles",
   :units/conversion {:units/factor 1609.344M,
                      :units/to     :units/m},
   :units/render     "%f mi",
   :units/symbol     "mi"})

(def min
  "Minutes (60s of seconds and 60ths of an hour)."
  {:db/ident         :units/min,
   :rdf/type         :units/Unit,
   :rdfs/comment     "Minutes (60s of seconds and 60ths of an hour).",
   :rdfs/label       "minutes",
   :units/conversion {:units/factor 60,
                      :units/to     :units/s},
   :units/render     "%f mins",
   :units/symbol     "min"})

(def mm
  "Millimetres (thousandths of metres)."
  {:db/ident               :units/mm,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Millimetres (thousandths of metres).",
   :rdfs/label             "millimetres",
   :units/conversion       {:units/factor 0.03937M,
                            :units/to     :units/inch},
   :units/prefixConversion [{:units/factor 0.000001M,
                             :units/to     :units/km}
                            {:units/factor 0.1M,
                             :units/to     :units/cm}
                            {:units/factor 0.001M,
                             :units/to     :units/m}],
   :units/render           "%f mm",
   :units/symbol           "mm"})

(def ms
  "Milliseconds (thousandths of seconds)."
  {:db/ident               :units/ms,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Milliseconds (thousandths of seconds).",
   :rdfs/label             "milliseconds",
   :units/prefixConversion {:units/factor 0.001M,
                            :units/to     :units/s},
   :units/render           "%f ms",
   :units/symbol           "ms"})

(def oct
  "Octaves, relative musical pitch where +1 octave doubles the frequency."
  {:db/ident :units/oct,
   :rdf/type :units/Unit,
   :rdfs/comment
   "Octaves, relative musical pitch where +1 octave doubles the frequency.",
   :rdfs/label "octaves",
   :units/conversion {:units/factor 12,
                      :units/to     :units/semitone12TET},
   :units/render "%f octaves",
   :units/symbol "oct"})

(def pc
  "Percentage, a ratio as a fraction of 100."
  {:db/ident         :units/pc,
   :rdf/type         :units/Unit,
   :rdfs/comment     "Percentage, a ratio as a fraction of 100.",
   :rdfs/label       "percent",
   :units/conversion {:units/factor 0.01M,
                      :units/to     :units/coef},
   :units/render     "%f%%",
   :units/symbol     "%"})

(def prefixConversion
  "A conversion from this unit to another with the same base but a different prefix."
  {:db/ident :units/prefixConversion,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A conversion from this unit to another with the same base but a different prefix.",
   :rdfs/domain :units/Unit,
   :rdfs/label "prefix conversion",
   :rdfs/range :units/Conversion,
   :rdfs/subPropertyOf :units/conversion})

(def render
  "A printf format string for rendering a value (e.g., \"%f dB\")."
  {:db/ident :units/render,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "A printf format string for rendering a value (e.g., \"%f dB\").",
   :rdfs/domain :units/Unit,
   :rdfs/label "unit format string",
   :rdfs/range :xsd/string})

(def s
  "Seconds, the SI base unit for time."
  {:db/ident               :units/s,
   :rdf/type               :units/Unit,
   :rdfs/comment           "Seconds, the SI base unit for time.",
   :rdfs/label             "seconds",
   :units/conversion       {:units/factor 0.0166666666M,
                            :units/to     :units/min},
   :units/prefixConversion {:units/factor 1000,
                            :units/to     :units/ms},
   :units/render           "%f s",
   :units/symbol           "s"})

(def semitone12TET
  "A semitone in the 12-tone equal temperament scale."
  {:db/ident         :units/semitone12TET,
   :rdf/type         :units/Unit,
   :rdfs/comment     "A semitone in the 12-tone equal temperament scale.",
   :rdfs/label       "semitones",
   :units/conversion {:units/factor 0.083333333M,
                      :units/to     :units/oct},
   :units/render     "%f semi",
   :units/symbol     "semi"})

(def symbol
  "The abbreviated symbol for this unit (e.g., \"dB\")."
  {:db/ident     :units/symbol,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The abbreviated symbol for this unit (e.g., \"dB\").",
   :rdfs/domain  :units/Unit,
   :rdfs/label   "unit symbol",
   :rdfs/range   :xsd/string})

(def to
  "The target unit this conversion converts to."
  {:db/ident     :units/to,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The target unit this conversion converts to.",
   :rdfs/domain  :units/Conversion,
   :rdfs/label   "conversion target",
   :rdfs/range   :units/Unit})

(def unit
  "The unit used by the value of a port or parameter."
  {:db/ident     :units/unit,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The unit used by the value of a port or parameter.",
   :rdfs/label   "unit",
   :rdfs/range   :units/Unit})