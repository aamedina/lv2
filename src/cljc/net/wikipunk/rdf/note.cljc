(ns net.wikipunk.rdf.note
  "http://purl.org/ontology/chord/note/"
  {:db/ident          :chord/index.rdfs,
   :dc11/date         "2007-09-11",
   :dc11/description  "FIXME\n\t\t",
   :dc11/title        "The Chord Ontology",
   :dcat/downloadURL  "http://purl.org/ontology/chord/index.rdfs",
   :foaf/maker        "http://chrissutton.org/me",
   :owl/versionInfo   "Revision: 0.1",
   :rdf/ns-prefix-map {"chord" "http://purl.org/ontology/chord/",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "note"  "http://purl.org/ontology/chord/note/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "note",
   :rdfa/uri          "http://purl.org/ontology/chord/note/"}
  (:refer-clojure :exclude [min]))

(def A
  "A"
  {:db/ident         :note/A,
   :rdf/type         [:chord/Natural :rdfs/Resource :chord/Note],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "A"})

(def Ab
  "Ab"
  {:chord/modifier   :chord/flat,
   :chord/natural    :note/A,
   :db/ident         :note/Ab,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Ab"})

(def As
  "A#"
  {:chord/modifier   :chord/sharp,
   :chord/natural    :note/A,
   :db/ident         :note/As,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "A#"})

(def B
  "B"
  {:db/ident         :note/B,
   :rdf/type         [:chord/Natural :rdfs/Resource :chord/Note],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "B"})

(def Bb
  "Bb"
  {:chord/modifier   :chord/flat,
   :chord/natural    :note/B,
   :db/ident         :note/Bb,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Bb"})

(def Bs
  "B#"
  {:chord/modifier   :chord/sharp,
   :chord/natural    :note/B,
   :db/ident         :note/Bs,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "B#"})

(def C
  "C"
  {:db/ident         :note/C,
   :rdf/type         [:chord/Natural :rdfs/Resource :chord/Note],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "C"})

(def Cb
  "Cb"
  {:chord/modifier   :chord/flat,
   :chord/natural    :note/C,
   :db/ident         :note/Cb,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Cb"})

(def Cs
  "C#"
  {:chord/modifier   :chord/sharp,
   :chord/natural    :note/C,
   :db/ident         :note/Cs,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "C#"})

(def D
  "D"
  {:db/ident         :note/D,
   :rdf/type         [:chord/Natural :rdfs/Resource :chord/Note],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "D"})

(def Db
  "Db"
  {:chord/modifier   :chord/flat,
   :chord/natural    :note/D,
   :db/ident         :note/Db,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Db"})

(def Ds
  "D#"
  {:chord/modifier   :chord/sharp,
   :chord/natural    :note/D,
   :db/ident         :note/Ds,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "D#"})

(def E
  "E"
  {:db/ident         :note/E,
   :rdf/type         [:chord/Natural :rdfs/Resource :chord/Note],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "E"})

(def Eb
  "Eb"
  {:chord/modifier   :chord/flat,
   :chord/natural    :note/E,
   :db/ident         :note/Eb,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Eb"})

(def Es
  "E#"
  {:chord/modifier   :chord/sharp,
   :chord/natural    :note/E,
   :db/ident         :note/Es,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "E#"})

(def F
  "F"
  {:db/ident         :note/F,
   :rdf/type         [:chord/Natural :rdfs/Resource :chord/Note],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "F"})

(def Fb
  "Fb"
  {:chord/modifier   :chord/flat,
   :chord/natural    :note/F,
   :db/ident         :note/Fb,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Fb"})

(def Fs
  "F#"
  {:chord/modifier   :chord/sharp,
   :chord/natural    :note/F,
   :db/ident         :note/Fs,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "F#"})

(def G
  "G"
  {:db/ident         :note/G,
   :rdf/type         [:chord/Natural :rdfs/Resource :chord/Note],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "G"})

(def Gb
  "Gb"
  {:chord/modifier   :chord/flat,
   :chord/natural    :note/G,
   :db/ident         :note/Gb,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Gb"})

(def Gs
  "G#"
  {:chord/modifier   :chord/sharp,
   :chord/natural    :note/G,
   :db/ident         :note/Gs,
   :rdf/type         [:chord/Note
                      {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "G#"})

(def ^{:private true} Chord
  "Two or more notes played together."
  {:db/ident         :chord/Chord,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "Two or more notes played together.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Chord",
   :rdfs/subClassOf  [:rdfs/Resource :chord/Chord]})

(def ^{:private true} ChordEvent
  "A chord being played."
  {:db/ident         :chord/ChordEvent,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A chord being played.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "ChordEvent",
   :rdfs/subClassOf  [:rdfs/Resource :event/Event :chord/ChordEvent]})

(def ^{:private true} Interval
  "An interval above the root of a chord."
  {:db/ident         :chord/Interval,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An interval above the root of a chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Interval",
   :rdfs/subClassOf  [:rdfs/Resource :chord/Interval]})

(def ^{:private true} Modifier
  "A modifier applied to a note to change its pitch."
  {:db/ident         :chord/Modifier,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A modifier applied to a note to change its pitch.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Modifier",
   :rdfs/subClassOf  [:rdfs/Resource :chord/Modifier]})

(def ^{:private true} Natural
  "One of the seven natural notes of the Western music system."
  {:db/ident :chord/Natural,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "One of the seven natural notes of the Western music system.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "Natural",
   :rdfs/subClassOf [:chord/Note :chord/Natural :rdfs/Resource]})

(def ^{:private true} Note
  "FIXME"
  {:db/ident         :chord/Note,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "FIXME",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "Note",
   :rdfs/subClassOf  [:rdfs/Resource :chord/Note]})

(def ^{:private true} ScaleInterval
  "An interval in the root scale, made up of the degree of the scale and optional modifier."
  {:db/ident :chord/ScaleInterval,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "An interval in the root scale, made up of the degree of the scale and optional modifier.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "ScaleInterval",
   :rdfs/subClassOf [:chord/Interval :chord/ScaleInterval :rdfs/Resource]})

(def ^{:private true} SemitoneInterval
  "A semitone interval."
  {:db/ident         :chord/SemitoneInterval,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A semitone interval.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "SemitoneInterval",
   :rdfs/subClassOf  [:chord/Interval :chord/SemitoneInterval :rdfs/Resource]})

(def ^{:private true} aug
  "An augmented chord."
  {:chord/interval   [{:chord/degree   "5",
                       :chord/modifier :chord/sharp,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "3",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/aug,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "An augmented chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "aug",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Augmented_chord"]})

(def ^{:private true} base_chord
  "The chord on which this one is based. For example, a C7 chord might have chord:Cmaj as its base chord."
  {:db/ident :chord/base_chord,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The chord on which this one is based. \n\t\t\tFor example, a C7 chord might have chord:Cmaj as its base chord.",
   :rdfs/domain :chord/Chord,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "base_chord",
   :rdfs/range :chord/Chord,
   :rdfs/subPropertyOf :chord/base_chord})

(def ^{:private true} bass
  "The bass note of the chord (indicates the inversion)."
  {:db/ident           :chord/bass,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The bass note of the chord (indicates the inversion).",
   :rdfs/domain        :chord/Chord,
   :rdfs/isDefinedBy   "http://purl.org/ontology/chord/",
   :rdfs/label         "bass",
   :rdfs/range         :chord/Interval,
   :rdfs/subPropertyOf :chord/bass})

(def ^{:private true} chord
  "The chord associated with a chord event."
  {:db/ident           :chord/chord,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The chord associated with a chord event.",
   :rdfs/domain        :chord/ChordEvent,
   :rdfs/isDefinedBy   "http://purl.org/ontology/chord/",
   :rdfs/label         "chord",
   :rdfs/range         :chord/Chord,
   :rdfs/subPropertyOf :chord/chord})

(def ^{:private true} degree
  "The degree of an interval based on the root of a chord."
  {:db/ident :chord/degree,
   :rdf/type :rdf/Property,
   :rdfs/comment "The degree of an interval based on the root of a chord.",
   :rdfs/domain :chord/ScaleInterval,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "degree",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :chord/degree})

(def ^{:private true} dim
  "A diminished chord."
  {:chord/interval   [{:chord/degree   "5",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/dim,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A diminished chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "dim",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Diminished_chord"]})

(def ^{:private true} dim7
  "A diminished seventh chord."
  {:chord/interval   [{:chord/degree   "7",
                       :chord/modifier :chord/doubleflat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   "5",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/dim7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A diminished seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "dim7"})

(def ^{:private true} doubleflat
  "double flat"
  {:db/ident         :chord/doubleflat,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "double flat"})

(def ^{:private true} doublesharp
  "double sharp"
  {:db/ident         :chord/doublesharp,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "double sharp"})

(def ^{:private true} flat
  "flat"
  {:db/ident         :chord/flat,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "flat"})

(def ^{:private true} hdim7
  "A half-diminished seventh chord."
  {:chord/interval   [{:chord/degree   "7",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   "5",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/hdim7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A half-diminished seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "hdim7"})

(def ^{:private true} index_rdfs
  "FIXME"
  {:db/ident         :chord/index.rdfs,
   :dc11/date        "2007-09-11",
   :dc11/description "FIXME\n\t\t",
   :dc11/title       "The Chord Ontology",
   :foaf/maker       "http://chrissutton.org/me",
   :owl/versionInfo  "Revision: 0.1",
   :rdf/type         :owl/Ontology})

(def ^{:private true} interval
  "An interval from the root which is part of the chord."
  {:db/ident           :chord/interval,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An interval from the root which is part of the chord.",
   :rdfs/domain        :chord/Chord,
   :rdfs/isDefinedBy   "http://purl.org/ontology/chord/",
   :rdfs/label         "interval",
   :rdfs/range         :chord/Interval,
   :rdfs/subPropertyOf :chord/interval})

(def ^{:private true} maj
  "A major chord."
  {:chord/interval   [{:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "3",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/maj,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A major chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "maj",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Major_chord"]})

(def ^{:private true} maj6
  "A major sixth chord."
  {:chord/interval   [{:chord/degree "3",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "6",
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

(def ^{:private true} maj7
  "A major seventh chord."
  {:chord/interval   [{:chord/degree "7",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "3",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/maj7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A major seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "maj7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Major_seventh_chord"]})

(def ^{:private true} maj9
  "A major ninth chord."
  {:chord/interval   [{:chord/degree "7",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "9",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "3",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/maj9,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A major ninth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "maj9",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Major_chord"]})

(def ^{:private true} min
  "A minor chord."
  {:chord/interval   [{:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/min,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "min",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Minor_chord"]})

(def ^{:private true} min6
  "A minor sixth chord."
  {:chord/interval   [{:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "6",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}],
   :db/ident         :chord/min6,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor sixth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "min6",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Sixth_chord"
                      "http://dbpedia.org/resource/Minor_chord"]})

(def ^{:private true} min7
  "A minor seventh chord."
  {:chord/interval   [{:chord/degree   "7",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/min7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "min7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Minor_seventh_chord"]})

(def ^{:private true} min9
  "A minor ninth chord."
  {:chord/interval   [{:chord/degree "9",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree   "7",
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

(def ^{:private true} minmaj7
  "A minor (major 7th) chord."
  {:chord/interval   [{:chord/degree "7",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   "3",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/minmaj7,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A minor (major 7th) chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "minmaj7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Minor_major_seventh_chord"]})

(def ^{:private true} modifier
  "A modification to a note's pitch."
  {:db/ident           :chord/modifier,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A modification to a note's pitch.",
   :rdfs/domain        {:owl/unionOf [:chord/Note :chord/ScaleInterval],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://purl.org/ontology/chord/",
   :rdfs/label         "modifier",
   :rdfs/range         :chord/Modifier,
   :rdfs/subPropertyOf :chord/modifier})

(def ^{:private true} natural
  "The natural from which this note is derived."
  {:db/ident           :chord/natural,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The natural from which this note is derived.",
   :rdfs/domain        :chord/Note,
   :rdfs/isDefinedBy   "http://purl.org/ontology/chord/",
   :rdfs/label         "natural",
   :rdfs/range         :chord/Natural,
   :rdfs/subPropertyOf :chord/natural})

(def ^{:private true} ninth
  "A ninth chord."
  {:chord/interval   [{:chord/degree "9",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree   "7",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "3",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/ninth,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A ninth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "9"})

(def ^{:private true} noChord
  "Indicates that no chord is played."
  {:db/ident         :chord/noChord,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "Indicates that no chord is played.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "noChord"})

(def ^{:private true} root
  "The root note of the chord."
  {:db/ident           :chord/root,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The root note of the chord.",
   :rdfs/domain        :chord/Chord,
   :rdfs/isDefinedBy   "http://purl.org/ontology/chord/",
   :rdfs/label         "root",
   :rdfs/range         :chord/Note,
   :rdfs/subPropertyOf :chord/root})

(def ^{:private true} semitone_interval
  "An interval measured in semitones."
  {:db/ident           :chord/semitone_interval,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An interval measured in semitones.",
   :rdfs/domain        :chord/SemitoneInterval,
   :rdfs/isDefinedBy   "http://purl.org/ontology/chord/",
   :rdfs/label         "semitone_interval",
   :rdfs/range         :xsd/integer,
   :rdfs/subPropertyOf :chord/semitone_interval})

(def ^{:private true} seventh
  "A seventh chord."
  {:chord/interval   [{:chord/degree   "7",
                       :chord/modifier :chord/flat,
                       :rdf/type       [:chord/ScaleInterval
                                        :chord/Interval
                                        {:owl/unionOf [:chord/Note
                                                       :chord/ScaleInterval],
                                         :rdf/type    :owl/Class}
                                        :rdfs/Resource]}
                      {:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "3",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/seventh,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A seventh chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "7",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Seventh_chord"]})

(def ^{:private true} sharp
  "sharp"
  {:db/ident         :chord/sharp,
   :rdf/type         [:chord/Modifier :rdfs/Resource],
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "sharp"})

(def ^{:private true} sus2
  "A suspended fourth chord."
  {:chord/interval   [{:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "2",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/sus2,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A suspended fourth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "sus2",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Suspended_chord"]})

(def ^{:private true} sus4
  "A suspended fourth chord."
  {:chord/interval   [{:chord/degree "5",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "4",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}
                      {:chord/degree "1",
                       :rdf/type     [:chord/ScaleInterval
                                      :chord/Interval
                                      :rdfs/Resource]}],
   :db/ident         :chord/sus4,
   :rdf/type         [:chord/Chord :rdfs/Resource],
   :rdfs/comment     "A suspended fourth chord.",
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label       "sus4",
   :rdfs/seeAlso     ["http://dbpedia.org/resource/Suspended_chord"]})

(def ^{:private true} without_interval
  "A degree of the scale expected in the chord but not actually present here."
  {:db/ident :chord/without_interval,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A degree of the scale expected in the chord but not actually present here.",
   :rdfs/domain :chord/Chord,
   :rdfs/isDefinedBy "http://purl.org/ontology/chord/",
   :rdfs/label "without_interval",
   :rdfs/range :chord/ScaleInterval,
   :rdfs/subPropertyOf :chord/without_interval})

(def ^{:private true} Event
  {:db/ident        :event/Event,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :event/Event})