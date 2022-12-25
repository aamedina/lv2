(ns net.wikipunk.rdf.lv2.time
  "A vocabulary for describing musical time."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "time",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/time"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/time#",
   :rdf/ns-prefix-map {"time" "http://lv2plug.in/ns/ext/time#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}}
  (:refer-clojure :exclude []))

(def Position
  "A point in time and/or the speed at which time is passing."
  {:rdfs/comment "A point in time and/or the speed at which time is passing.",
   :rdfs/label "Position",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Rate
  "The rate of passage of time."
  {:rdfs/comment "The rate of passage of time.",
   :rdfs/label "Rate",
   :rdfs/subClassOf :time/Position,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Time
  "A point in time in some unit/dimension."
  {:rdfs/comment "A point in time in some unit/dimension.",
   :rdfs/label "Time",
   :rdfs/subClassOf :time/Position,
   :rdf/type [:owl/Class :rdfs/Class]})

(def bar
  "A musical bar or measure."
  {:rdfs/comment "A musical bar or measure.",
   :rdfs/label "bar",
   :rdfs/range :xsd/long,
   :rdfs/domain :time/Time,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def barBeat
  "The beat number within the bar, from 0 to time:beatsPerBar."
  {:rdfs/comment "The beat number within the bar, from 0 to time:beatsPerBar.",
   :rdfs/label "beat within bar",
   :rdfs/range :xsd/float,
   :rdfs/domain :time/Time,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def beat
  "The global running beat number."
  {:rdfs/comment "The global running beat number.",
   :rdfs/label "beat",
   :rdfs/range :xsd/double,
   :rdfs/domain :time/Time,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def beatUnit
  "The note value that counts as one beat."
  {:rdfs/comment "The note value that counts as one beat.",
   :rdfs/label "beat unit",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/domain :time/Rate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def beatsPerBar
  "The number of beats in one bar."
  {:rdfs/comment "The number of beats in one bar.",
   :rdfs/label "beats per bar",
   :rdfs/range :xsd/float,
   :rdfs/domain :time/Rate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def beatsPerMinute
  "Tempo in beats per minute."
  {:rdfs/comment "Tempo in beats per minute.",
   :rdfs/label "beats per minute",
   :rdfs/range :xsd/float,
   :rdfs/domain :time/Rate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def frame
  "A time stamp in audio frames."
  {:rdfs/comment "A time stamp in audio frames.",
   :rdfs/label "frame",
   :rdfs/range :xsd/long,
   :rdfs/domain :time/Time,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def framesPerSecond
  "Frame rate in frames per second."
  {:rdfs/comment "Frame rate in frames per second.",
   :rdfs/label "frames per second",
   :rdfs/range :xsd/float,
   :rdfs/domain :time/Rate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def position
  "A musical position."
  {:rdfs/comment "A musical position.",
   :rdfs/label "position",
   :rdfs/range :time/Position,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def speed
  "The rate of the progress of time as a fraction of normal speed."
  {:rdfs/comment
     "The rate of the progress of time as a fraction of normal speed.",
   :rdfs/label "speed",
   :rdfs/range :xsd/float,
   :rdfs/domain :time/Rate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})