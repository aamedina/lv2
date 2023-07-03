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
   :rdfa/uri          "http://purl.org/ontology/chord/note/"})

(def A
  "A"
  {:db/ident         :note/A,
   :rdf/type         [:chord/Natural :chord/Note :rdfs/Resource],
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
   :rdf/type         [:chord/Natural :chord/Note :rdfs/Resource],
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
   :rdf/type         [:chord/Natural :chord/Note :rdfs/Resource],
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
   :rdf/type         [:chord/Natural :chord/Note :rdfs/Resource],
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
   :rdf/type         [:chord/Natural :chord/Note :rdfs/Resource],
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
   :rdf/type         [:chord/Natural :chord/Note :rdfs/Resource],
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
   :rdf/type         [:chord/Natural :chord/Note :rdfs/Resource],
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