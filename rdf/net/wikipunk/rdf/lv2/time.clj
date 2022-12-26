(ns net.wikipunk.rdf.lv2.time
  "A vocabulary for describing musical time."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.ttl",
   :lv2/project {:doap/created   "2011-10-05",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/name      "LV2 Time",
                 :doap/shortdesc "A vocabulary for describing musical time.",
                 :rdf/about      {:rdf/uri "http://lv2plug.in/ns/ext/time"},
                 :rdf/type       :doap/Project},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/time"},
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "time" "http://lv2plug.in/ns/ext/time#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "A vocabulary for describing musical time.",
   :rdfs/label "LV2 Time",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.meta.ttl"},
   :vann/preferredNamespacePrefix "time",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/time#"})

(def Position
  "A point in time and/or the speed at which time is passing."
  {:rdf/about    :time/Position,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A point in time and/or the speed at which time is passing.",
   :rdfs/label   "Position"})

(def Rate
  "The rate of passage of time."
  {:rdf/about       :time/Rate,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "The rate of passage of time.",
   :rdfs/label      "Rate",
   :rdfs/subClassOf :time/Position})

(def Time
  "A point in time in some unit/dimension."
  {:rdf/about       :time/Time,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A point in time in some unit/dimension.",
   :rdfs/label      "Time",
   :rdfs/subClassOf :time/Position})

(def bar
  "A musical bar or measure."
  {:rdf/about    :time/bar,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A musical bar or measure.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "bar",
   :rdfs/range   :xsd/long})

(def barBeat
  "The beat number within the bar, from 0 to time:beatsPerBar."
  {:rdf/about    :time/barBeat,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The beat number within the bar, from 0 to time:beatsPerBar.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "beat within bar",
   :rdfs/range   :xsd/float})

(def beat
  "The global running beat number."
  {:rdf/about    :time/beat,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The global running beat number.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "beat",
   :rdfs/range   :xsd/double})

(def beatUnit
  "The note value that counts as one beat."
  {:rdf/about    :time/beatUnit,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The note value that counts as one beat.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "beat unit",
   :rdfs/range   :xsd/nonNegativeInteger})

(def beatsPerBar
  "The number of beats in one bar."
  {:rdf/about    :time/beatsPerBar,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The number of beats in one bar.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "beats per bar",
   :rdfs/range   :xsd/float})

(def beatsPerMinute
  "Tempo in beats per minute."
  {:rdf/about    :time/beatsPerMinute,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Tempo in beats per minute.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "beats per minute",
   :rdfs/range   :xsd/float})

(def frame
  "A time stamp in audio frames."
  {:rdf/about    :time/frame,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A time stamp in audio frames.",
   :rdfs/domain  :time/Time,
   :rdfs/label   "frame",
   :rdfs/range   :xsd/long})

(def framesPerSecond
  "Frame rate in frames per second."
  {:rdf/about    :time/framesPerSecond,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Frame rate in frames per second.",
   :rdfs/domain  :time/Rate,
   :rdfs/label   "frames per second",
   :rdfs/range   :xsd/float})

(def position
  "A musical position."
  {:rdf/about    :time/position,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A musical position.",
   :rdfs/label   "position",
   :rdfs/range   :time/Position})

(def speed
  "The rate of the progress of time as a fraction of normal speed."
  {:rdf/about :time/speed,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The rate of the progress of time as a fraction of normal speed.",
   :rdfs/domain :time/Rate,
   :rdfs/label "speed",
   :rdfs/range :xsd/float})