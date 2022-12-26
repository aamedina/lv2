(ns net.wikipunk.rdf.lv2.morph
  "Ports that can dynamically change type."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.ttl",
   :lv2/project {:doap/created   "2012-05-22",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/name      "LV2 Morph",
                 :doap/shortdesc "Ports that can dynamically change type.",
                 :rdf/about      {:rdf/uri "http://lv2plug.in/ns/ext/morph"},
                 :rdf/type       :doap/Project},
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/morph"},
   :rdf/ns-prefix-map {"doap"  "http://usefulinc.com/ns/doap#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "morph" "http://lv2plug.in/ns/ext/morph#",
                       "opts"  "http://lv2plug.in/ns/ext/options#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "Ports that can dynamically change type.",
   :rdfs/label "LV2 Morph",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.meta.ttl"},
   :vann/preferredNamespacePrefix "morph",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/morph#"})

(def AutoMorphPort
  "A port that can change its type based on that of another."
  {:rdf/about       :morph/AutoMorphPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port that can change its type based on that of another.",
   :rdfs/label      "Auto Morph Port",
   :rdfs/subClassOf :lv2/Port})

(def MorphPort
  "A port which can be switched to another type."
  {:rdf/about       :morph/MorphPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port which can be switched to another type.",
   :rdfs/label      "Morph Port",
   :rdfs/subClassOf :lv2/Port})

(def currentType
  "The currently active type of the port."
  {:rdf/about    :morph/currentType,
   :rdf/type     [:owl/ObjectProperty :opts/Option :rdf/Property],
   :rdfs/comment "The currently active type of the port.",
   :rdfs/domain  :morph/MorphPort,
   :rdfs/label   "current type"})

(def supportsType
  "A type that a port supports being switched to."
  {:rdf/about    :morph/supportsType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A type that a port supports being switched to.",
   :rdfs/domain  :morph/MorphPort,
   :rdfs/label   "supports type"})