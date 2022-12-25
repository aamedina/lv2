(ns net.wikipunk.rdf.lv2.units
  "Units for LV2 values."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.ttl",
   :rdf/about #:rdf{:uri "http://lv2plug.in/ns/extensions/units"},
   :rdf/ns-prefix-map {"owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "units" "http://lv2plug.in/ns/extensions/units#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   #:rdf{:uri
         "https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.meta.ttl"},
   :vann/preferredNamespacePrefix "units",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/units#"}
  (:refer-clojure :exclude [min symbol]))

(def Conversion
  "A conversion from one unit to another."
  {:rdf/about       :units/Conversion,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Conversion",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :units/to,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A conversion MUST have exactly 1 units:to property."}})

(def Unit
  "A unit for a control value."
  {:rdf/about  :units/Unit,
   :rdf/type   [:owl/Class :rdfs/Class],
   :rdfs/label "Unit"})

(def bar
  "Musical bars or measures."
  {:rdf/about    :units/bar,
   :rdf/type     :units/Unit,
   :rdfs/label   "bars",
   :units/render "%f bars",
   :units/symbol "bars"})

(def beat
  "Musical beats."
  {:rdf/about    :units/beat,
   :rdf/type     :units/Unit,
   :rdfs/label   "beats",
   :units/render "%f beats",
   :units/symbol "beats"})

(def bpm
  "Beats Per Minute (BPM), the standard unit for musical tempo."
  {:rdf/about    :units/bpm,
   :rdf/type     :units/Unit,
   :rdfs/label   "beats per minute",
   :units/prefixConversion #:units{:factor 0.0166666666M,
                            :to     :units/hz},
   :units/render "%f BPM",
   :units/symbol "BPM"})

(def cent
  "Cents (hundredths of semitones)."
  {:rdf/about        :units/cent,
   :rdf/type         :units/Unit,
   :rdfs/label       "cents",
   :units/conversion #:units{:factor 0.01M,
                      :to     :units/semitone12TET},
   :units/render     "%f ct",
   :units/symbol     "ct"})

(def cm
  "Centimetres (hundredths of metres)."
  {:rdf/about        :units/cm,
   :rdf/type         :units/Unit,
   :rdfs/label       "centimetres",
   :units/conversion #:units{:factor 0.3937M,
                      :to     :units/inch},
   :units/prefixConversion [#:units{:factor 0.00001M,
                             :to     :units/km}
                            #:units{:factor 10,
                             :to     :units/mm}
                            #:units{:factor 0.01M,
                             :to     :units/m}],
   :units/render     "%f cm",
   :units/symbol     "cm"})

(def coef
  "A scale coefficient where 1 is unity, or 100 percent."
  {:rdf/about        :units/coef,
   :rdf/type         :units/Unit,
   :rdfs/label       "coefficient",
   :units/conversion #:units{:factor 100,
                      :to     :units/pc},
   :units/render     "* %f",
   :units/symbol     ""})

(def conversion
  "A conversion from this unit to another."
  {:rdf/about   :units/conversion,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :units/Unit,
   :rdfs/label  "conversion",
   :rdfs/range  :units/Conversion})

(def db
  "Decibels, a logarithmic relative unit where 0 is unity."
  {:rdf/about    :units/db,
   :rdf/type     :units/Unit,
   :rdfs/label   "decibels",
   :units/render "%f dB",
   :units/symbol "dB"})

(def degree
  "An angle where 360 degrees is one full rotation."
  {:rdf/about    :units/degree,
   :rdf/type     :units/Unit,
   :rdfs/label   "degrees",
   :units/render "%f deg",
   :units/symbol "deg"})

(def factor
  "The factor to multiply the source value by in order to convert to the target unit."
  {:rdf/about   :units/factor,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :units/Conversion,
   :rdfs/label  "conversion factor"})

(def frame
  "Audio frames or samples."
  {:rdf/about    :units/frame,
   :rdf/type     :units/Unit,
   :rdfs/label   "audio frames",
   :units/render "%f frames",
   :units/symbol "frames"})

(def hz
  "Hertz, or inverse seconds, the SI derived unit for frequency."
  {:rdf/about    :units/hz,
   :rdf/type     :units/Unit,
   :rdfs/label   "hertz",
   :units/prefixConversion [#:units{:factor 0.000001M,
                             :to     :units/mhz}
                            #:units{:factor 0.001M,
                             :to     :units/khz}],
   :units/render "%f Hz",
   :units/symbol "Hz"})

(def inch
  "An inch, defined as exactly 0.0254 metres."
  {:rdf/about        :units/inch,
   :rdf/type         :units/Unit,
   :rdfs/label       "inches",
   :units/conversion #:units{:factor 0.0254M,
                      :to     :units/m},
   :units/render     "%f\"",
   :units/symbol     "in"})

(def khz
  "Kilohertz (thousands of Hertz)."
  {:rdf/about    :units/khz,
   :rdf/type     :units/Unit,
   :rdfs/label   "kilohertz",
   :units/prefixConversion [#:units{:factor 0.001M,
                             :to     :units/mhz}
                            #:units{:factor 1000,
                             :to     :units/hz}],
   :units/render "%f kHz",
   :units/symbol "kHz"})

(def km
  "Kilometres (thousands of metres)."
  {:rdf/about        :units/km,
   :rdf/type         :units/Unit,
   :rdfs/label       "kilometres",
   :units/conversion #:units{:factor 0.62138818M,
                      :to     :units/mile},
   :units/prefixConversion [#:units{:factor 1000000,
                             :to     :units/mm}
                            #:units{:factor 100000,
                             :to     :units/cm}
                            #:units{:factor 1000,
                             :to     :units/m}],
   :units/render     "%f km",
   :units/symbol     "km"})

(def m
  "Metres, the SI base unit for length."
  {:rdf/about        :units/m,
   :rdf/type         :units/Unit,
   :rdfs/label       "metres",
   :units/conversion #:units{:factor 39.37M,
                      :to     :units/inch},
   :units/prefixConversion [#:units{:factor 0.001M,
                             :to     :units/km}
                            #:units{:factor 1000,
                             :to     :units/mm}
                            #:units{:factor 100,
                             :to     :units/cm}],
   :units/render     "%f m",
   :units/symbol     "m"})

(def mhz
  "Megahertz (millions of Hertz)."
  {:rdf/about    :units/mhz,
   :rdf/type     :units/Unit,
   :rdfs/label   "megahertz",
   :units/prefixConversion [#:units{:factor 0.001M,
                             :to     :units/khz}
                            #:units{:factor 1000000,
                             :to     :units/hz}],
   :units/render "%f MHz",
   :units/symbol "MHz"})

(def midiNote
  "A MIDI note number."
  {:rdf/about    :units/midiNote,
   :rdf/type     :units/Unit,
   :rdfs/label   "MIDI note",
   :units/render "MIDI note %d",
   :units/symbol "note"})

(def mile
  "A mile, defined as exactly 1609.344 metres."
  {:rdf/about        :units/mile,
   :rdf/type         :units/Unit,
   :rdfs/label       "miles",
   :units/conversion #:units{:factor 1609.344M,
                      :to     :units/m},
   :units/render     "%f mi",
   :units/symbol     "mi"})

(def min
  "Minutes (60s of seconds and 60ths of an hour)."
  {:rdf/about        :units/min,
   :rdf/type         :units/Unit,
   :rdfs/label       "minutes",
   :units/conversion #:units{:factor 60,
                      :to     :units/s},
   :units/render     "%f mins",
   :units/symbol     "min"})

(def mm
  "Millimetres (thousandths of metres)."
  {:rdf/about        :units/mm,
   :rdf/type         :units/Unit,
   :rdfs/label       "millimetres",
   :units/conversion #:units{:factor 0.03937M,
                      :to     :units/inch},
   :units/prefixConversion [#:units{:factor 0.000001M,
                             :to     :units/km}
                            #:units{:factor 0.1M,
                             :to     :units/cm}
                            #:units{:factor 0.001M,
                             :to     :units/m}],
   :units/render     "%f mm",
   :units/symbol     "mm"})

(def ms
  "Milliseconds (thousandths of seconds)."
  {:rdf/about    :units/ms,
   :rdf/type     :units/Unit,
   :rdfs/label   "milliseconds",
   :units/prefixConversion #:units{:factor 0.001M,
                            :to     :units/s},
   :units/render "%f ms",
   :units/symbol "ms"})

(def oct
  "Octaves, relative musical pitch where +1 octave doubles the frequency."
  {:rdf/about        :units/oct,
   :rdf/type         :units/Unit,
   :rdfs/label       "octaves",
   :units/conversion #:units{:factor 12,
                      :to     :units/semitone12TET},
   :units/render     "%f octaves",
   :units/symbol     "oct"})

(def pc
  "Percentage, a ratio as a fraction of 100."
  {:rdf/about        :units/pc,
   :rdf/type         :units/Unit,
   :rdfs/label       "percent",
   :units/conversion #:units{:factor 0.01M,
                      :to     :units/coef},
   :units/render     "%f%%",
   :units/symbol     "%"})

(def prefixConversion
  "A conversion from this unit to another with the same base but a different prefix."
  {:rdf/about          :units/prefixConversion,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :units/Unit,
   :rdfs/label         "prefix conversion",
   :rdfs/range         :units/Conversion,
   :rdfs/subPropertyOf :units/conversion})

(def render
  "A printf format string for rendering a value (e.g., \"%f dB\")."
  {:rdf/about   :units/render,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :units/Unit,
   :rdfs/label  "unit format string",
   :rdfs/range  :xsd/string})

(def s
  "Seconds, the SI base unit for time."
  {:rdf/about        :units/s,
   :rdf/type         :units/Unit,
   :rdfs/label       "seconds",
   :units/conversion #:units{:factor 0.0166666666M,
                      :to     :units/min},
   :units/prefixConversion #:units{:factor 1000,
                            :to     :units/ms},
   :units/render     "%f s",
   :units/symbol     "s"})

(def semitone12TET
  "A semitone in the 12-tone equal temperament scale."
  {:rdf/about        :units/semitone12TET,
   :rdf/type         :units/Unit,
   :rdfs/label       "semitones",
   :units/conversion #:units{:factor 0.083333333M,
                      :to     :units/oct},
   :units/render     "%f semi",
   :units/symbol     "semi"})

(def symbol
  "The abbreviated symbol for this unit (e.g., \"dB\")."
  {:rdf/about   :units/symbol,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :units/Unit,
   :rdfs/label  "unit symbol",
   :rdfs/range  :xsd/string})

(def to
  "The target unit this conversion converts to."
  {:rdf/about   :units/to,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :units/Conversion,
   :rdfs/label  "conversion target",
   :rdfs/range  :units/Unit})

(def unit
  "The unit used by the value of a port or parameter."
  {:rdf/about  :units/unit,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "unit",
   :rdfs/range :units/Unit})