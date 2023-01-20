(ns net.wikipunk.rdf.lv2.time
  "A vocabulary for describing musical time."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.ttl",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "time" "http://lv2plug.in/ns/ext/time#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/time",
   :rdfa/prefix "time",
   :rdfa/uri "http://lv2plug.in/ns/ext/time#",
   :rdfs/comment "A vocabulary for describing musical time.",
   :rdfs/label "LV2 Time",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.meta.ttl"]})

(def Position
  "A point in time and/or the speed at which time is passing."
  {:db/ident     :time/Position,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A point in time and/or the speed at which time is passing.",
   :rdfs/label   "Position"})

(def Rate
  "The rate of passage of time."
  {:db/ident        :time/Rate,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "The rate of passage of time.",
   :rdfs/label      "Rate",
   :rdfs/subClassOf :time/Position})

(def Time
  "A point in time in some unit/dimension."
  {:db/ident        :time/Time,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A point in time in some unit/dimension.",
   :rdfs/label      "Time",
   :rdfs/subClassOf :time/Position})

(def bar
  "A musical bar or measure."
  {:db/ident     :time/bar,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A musical bar or measure.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "bar",
   :rdfs/range   :xsd/long})

(def barBeat
  "The beat number within the bar, from 0 to time:beatsPerBar."
  {:db/ident     :time/barBeat,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The beat number within the bar, from 0 to time:beatsPerBar.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "beat within bar",
   :rdfs/range   :xsd/float})

(def beat
  "The global running beat number."
  {:db/ident     :time/beat,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The global running beat number.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "beat",
   :rdfs/range   :xsd/double})

(def beatUnit
  "The note value that counts as one beat."
  {:db/ident     :time/beatUnit,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The note value that counts as one beat.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "beat unit",
   :rdfs/range   :xsd/nonNegativeInteger})

(def beatsPerBar
  "The number of beats in one bar."
  {:db/ident     :time/beatsPerBar,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The number of beats in one bar.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "beats per bar",
   :rdfs/range   :xsd/float})

(def beatsPerMinute
  "Tempo in beats per minute."
  {:db/ident     :time/beatsPerMinute,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Tempo in beats per minute.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "beats per minute",
   :rdfs/range   :xsd/float})

(def frame
  "A time stamp in audio frames."
  {:db/ident     :time/frame,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A time stamp in audio frames.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "frame",
   :rdfs/range   :xsd/long})

(def framesPerSecond
  "Frame rate in frames per second."
  {:db/ident     :time/framesPerSecond,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Frame rate in frames per second.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "frames per second",
   :rdfs/range   :xsd/float})

(def position
  "A musical position."
  {:db/ident     :time/position,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A musical position.",
   :rdfs/label   "position",
   :rdfs/range   :time/Position})

(def speed
  "The rate of the progress of time as a fraction of normal speed."
  {:db/ident :time/speed,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The rate of the progress of time as a fraction of normal speed.",
   :rdfs/domain :time/Rate,
   :rdfs/label "speed",
   :rdfs/range :xsd/float})