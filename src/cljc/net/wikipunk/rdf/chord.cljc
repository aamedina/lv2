(ns net.wikipunk.rdf.chord
  "http://purl.org/ontology/chord/"
  {:dc11/date "2007-09-11",
   :dc11/description "FIXME\n\t\t",
   :dc11/title "The Chord Ontology",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/chord/versions/2007-10-25.n3",
   :foaf/maker "http://chrissutton.org/me",
   :owl/versionInfo "Revision: 0.1",
   :rdf/ns-prefix-map {"chord" "http://purl.org/ontology/chord/",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "note"  "http://purl.org/ontology/chord/note/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "chord",
   :rdfa/uri "http://purl.org/ontology/chord/"}
  (:refer-clojure :exclude [min]))

(def Chord
  "Two or more notes played together."
  {:db/ident         :chord/Chord,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     "Two or more notes played together.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Chord",
   :rdfs/subClassOf  :rdfs/Resource})

(def ChordEvent
  "A chord being played."
  {:db/ident         :chord/ChordEvent,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     "A chord being played.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "ChordEvent",
   :rdfs/subClassOf  [:rdfs/Resource :event/Event]})

(def Interval
  "An interval above the root of a chord."
  {:db/ident         :chord/Interval,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     "An interval above the root of a chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Interval",
   :rdfs/subClassOf  :rdfs/Resource})

(def Modifier
  "A modifier applied to a note to change its pitch."
  {:db/ident         :chord/Modifier,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     "A modifier applied to a note to change its pitch.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Modifier",
   :rdfs/subClassOf  :rdfs/Resource})

(def Natural
  "One of the seven natural notes of the Western music system."
  {:db/ident :chord/Natural,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment "One of the seven natural notes of the Western music system.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "Natural",
   :rdfs/subClassOf [:chord/Note :rdfs/Resource]})

(def Note
  "FIXME"
  {:db/ident         :chord/Note,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     "FIXME",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Note",
   :rdfs/subClassOf  :rdfs/Resource})

(def ScaleInterval
  "An interval in the root scale, made up of the degree of the scale and optional modifier."
  {:db/ident :chord/ScaleInterval,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   "An interval in the root scale, made up of the degree of the scale and optional modifier.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "ScaleInterval",
   :rdfs/subClassOf [:chord/Interval :rdfs/Resource]})

(def SemitoneInterval
  "A semitone interval."
  {:db/ident         :chord/SemitoneInterval,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     "A semitone interval.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "SemitoneInterval",
   :rdfs/subClassOf  [:rdfs/Resource :chord/Interval]})

(def aug
  "An augmented chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 3,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   5,
                       :chord/modifier :chord/sharp,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/aug,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "An augmented chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "aug",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Augmented_chord"]})

(def base_chord
  "The chord on which this one is based. For example, a C7 chord might have chord:Cmaj as its base chord."
  {:db/ident :chord/base_chord,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The chord on which this one is based. \n\t\t\tFor example, a C7 chord might have chord:Cmaj as its base chord.",
   :rdfs/domain :chord/Chord,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "base_chord",
   :rdfs/range :chord/Chord})

(def bass
  "The bass note of the chord (indicates the inversion)."
  {:db/ident         :chord/bass,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The bass note of the chord (indicates the inversion).",
   :rdfs/domain      :chord/Chord,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "bass",
   :rdfs/range       :chord/Interval})

(def chord
  "The chord associated with a chord event."
  {:db/ident         :chord/chord,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The chord associated with a chord event.",
   :rdfs/domain      :chord/ChordEvent,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "chord",
   :rdfs/range       :chord/Chord})

(def degree
  "The degree of an interval based on the root of a chord."
  {:db/ident         :chord/degree,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The degree of an interval based on the root of a chord.",
   :rdfs/domain      :chord/ScaleInterval,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "degree",
   :rdfs/range       :xsd/integer})

(def dim
  "A diminished chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   5,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/dim,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A diminished chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "dim",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Diminished_chord"]})

(def dim7
  "A diminished seventh chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   5,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   7,
                       :chord/modifier :chord/doubleflat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/dim7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A diminished seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "dim7"})

(def doubleflat
  "double flat"
  {:db/ident         :chord/doubleflat,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "double flat"})

(def doublesharp
  "double sharp"
  {:db/ident         :chord/doublesharp,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "double sharp"})

(def flat
  "flat"
  {:db/ident         :chord/flat,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "flat"})

(def hdim7
  "A half-diminished seventh chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   5,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   7,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/hdim7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A half-diminished seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "hdim7"})

(def interval
  "An interval from the root which is part of the chord."
  {:db/ident         :chord/interval,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "An interval from the root which is part of the chord.",
   :rdfs/domain      :chord/Chord,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "interval",
   :rdfs/range       :chord/Interval})

(def maj
  "A major chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 3,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/maj,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A major chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "maj",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Major_chord"]})

(def maj6
  "A major sixth chord."
  {:chord/interval   [{:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 3,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 6,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/maj6,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A major sixth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "maj6",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Sixth_chord"
                      "http://dbpedia.org/resource/Major_chord"]})

(def maj7
  "A major seventh chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 3,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 7,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/maj7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A major seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "maj7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Major_seventh_chord"]})

(def maj9
  "A major ninth chord."
  {:chord/interval   [{:chord/degree 7,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 3,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 9,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/maj9,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A major ninth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "maj9",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Major_chord"]})

(def min
  "A minor chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/min,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "min",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Minor_chord"]})

(def min6
  "A minor sixth chord."
  {:chord/interval   [{:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 6,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/min6,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor sixth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "min6",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Sixth_chord"
                      "http://dbpedia.org/resource/Minor_chord"]})

(def min7
  "A minor seventh chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   7,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/min7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "min7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Minor_seventh_chord"]})

(def min9
  "A minor ninth chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   7,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 9,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/min9,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor ninth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "min9",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Minor_chord"]})

(def minmaj7
  "A minor (major 7th) chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   3,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 7,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/minmaj7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor (major 7th) chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "minmaj7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Minor_major_seventh_chord"]})

(def modifier
  "A modification to a note's pitch."
  {:db/ident         :chord/modifier,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "A modification to a note's pitch.",
   :rdfs/domain      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "modifier",
   :rdfs/range       :chord/Modifier})

(def natural
  "The natural from which this note is derived."
  {:db/ident         :chord/natural,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The natural from which this note is derived.",
   :rdfs/domain      :chord/Note,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "natural",
   :rdfs/range       :chord/Natural})

(def ninth
  "A ninth chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 3,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   7,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree 9,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/ninth,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A ninth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "9"})

(def noChord
  "Indicates that no chord is played."
  {:db/ident         :chord/noChord,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "Indicates that no chord is played.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "noChord"})

(def root
  "The root note of the chord."
  {:db/ident         :chord/root,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "The root note of the chord.",
   :rdfs/domain      :chord/Chord,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "root",
   :rdfs/range       :chord/Note})

(def semitone_interval
  "An interval measured in semitones."
  {:db/ident         :chord/semitone_interval,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "An interval measured in semitones.",
   :rdfs/domain      :chord/SemitoneInterval,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "semitone_interval",
   :rdfs/range       :xsd/integer})

(def seventh
  "A seventh chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 3,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   7,
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/seventh,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Seventh_chord"]})

(def sharp
  "sharp"
  {:db/ident         :chord/sharp,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "sharp"})

(def sus2
  "A suspended fourth chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 2,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/sus2,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A suspended fourth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "sus2",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Suspended_chord"]})

(def sus4
  "A suspended fourth chord."
  {:chord/interval   [{:chord/degree 1,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 4,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree 5,
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/sus4,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A suspended fourth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "sus4",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Suspended_chord"]})

(def without_interval
  "A degree of the scale expected in the chord but not actually present here."
  {:db/ident :chord/without_interval,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A degree of the scale expected in the chord but not actually present here.",
   :rdfs/domain :chord/Chord,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "without_interval",
   :rdfs/range :chord/ScaleInterval})
