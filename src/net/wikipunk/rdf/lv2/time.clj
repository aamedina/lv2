(ns net.wikipunk.rdf.lv2.time
  "A vocabulary for describing musical time."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.ttl",
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.time" "http://lv2plug.in/ns/ext/time#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/time",
   :rdfa/prefix "lv2.time",
   :rdfa/uri "http://lv2plug.in/ns/ext/time#",
   :rdfs/comment "A vocabulary for describing musical time.",
   :rdfs/label "LV2 Time",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.meta.ttl"]})

(def Position
  "A point in time and/or the speed at which time is passing."
  {:db/ident     :lv2.time/Position,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A point in time and/or the speed at which time is passing.",
   :rdfs/label   "Position"})

(def Rate
  "The rate of passage of time."
  {:db/ident        :lv2.time/Rate,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "The rate of passage of time.",
   :rdfs/label      "Rate",
   :rdfs/subClassOf :lv2.time/Position})

(def Time
  "A point in time in some unit/dimension."
  {:db/ident        :lv2.time/Time,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A point in time in some unit/dimension.",
   :rdfs/label      "Time",
   :rdfs/subClassOf :lv2.time/Position})

(def bar
  "A musical bar or measure."
  {:db/ident     :lv2.time/bar,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A musical bar or measure.",
   :rdfs/domain  :lv2.time/Time,
   :rdfs/label   "bar",
   :rdfs/range   :xsd/long})

(def barBeat
  "The beat number within the bar, from 0 to time:beatsPerBar."
  {:db/ident     :lv2.time/barBeat,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The beat number within the bar, from 0 to time:beatsPerBar.",
   :rdfs/domain  :lv2.time/Time,
   :rdfs/label   "beat within bar",
   :rdfs/range   :xsd/float})

(def beat
  "The global running beat number."
  {:db/ident     :lv2.time/beat,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The global running beat number.",
   :rdfs/domain  :lv2.time/Time,
   :rdfs/label   "beat",
   :rdfs/range   :xsd/double})

(def beatUnit
  "The note value that counts as one beat."
  {:db/ident     :lv2.time/beatUnit,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The note value that counts as one beat.",
   :rdfs/domain  :lv2.time/Rate,
   :rdfs/label   "beat unit",
   :rdfs/range   :xsd/nonNegativeInteger})

(def beatsPerBar
  "The number of beats in one bar."
  {:db/ident     :lv2.time/beatsPerBar,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The number of beats in one bar.",
   :rdfs/domain  :lv2.time/Rate,
   :rdfs/label   "beats per bar",
   :rdfs/range   :xsd/float})

(def beatsPerMinute
  "Tempo in beats per minute."
  {:db/ident     :lv2.time/beatsPerMinute,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Tempo in beats per minute.",
   :rdfs/domain  :lv2.time/Rate,
   :rdfs/label   "beats per minute",
   :rdfs/range   :xsd/float})

(def frame
  "A time stamp in audio frames."
  {:db/ident     :lv2.time/frame,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A time stamp in audio frames.",
   :rdfs/domain  :lv2.time/Time,
   :rdfs/label   "frame",
   :rdfs/range   :xsd/long})

(def framesPerSecond
  "Frame rate in frames per second."
  {:db/ident     :lv2.time/framesPerSecond,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Frame rate in frames per second.",
   :rdfs/domain  :lv2.time/Rate,
   :rdfs/label   "frames per second",
   :rdfs/range   :xsd/float})

(def position
  "A musical position."
  {:db/ident     :lv2.time/position,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A musical position.",
   :rdfs/label   "position",
   :rdfs/range   :lv2.time/Position})

(def speed
  "The rate of the progress of time as a fraction of normal speed."
  {:db/ident :lv2.time/speed,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The rate of the progress of time as a fraction of normal speed.",
   :rdfs/domain :lv2.time/Rate,
   :rdfs/label "speed",
   :rdfs/range :xsd/float})