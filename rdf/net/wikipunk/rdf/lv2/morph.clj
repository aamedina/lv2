(ns net.wikipunk.rdf.lv2.morph
  "Ports that can dynamically change type."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "morph",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/morph"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/morph#",
   :rdf/ns-prefix-map {"owl" "http://www.w3.org/2002/07/owl#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "morph" "http://lv2plug.in/ns/ext/morph#"}}
  (:refer-clojure :exclude []))

(def AutoMorphPort
  "A port that can change its type based on that of another."
  {:rdfs/comment "A port that can change its type based on that of another.",
   :rdfs/label "Auto Morph Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type [:owl/Class :rdfs/Class]})

(def MorphPort
  "A port which can be switched to another type."
  {:rdfs/comment "A port which can be switched to another type.",
   :rdfs/label "Morph Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type [:owl/Class :rdfs/Class]})

(def currentType
  "The currently active type of the port."
  {:rdfs/comment "The currently active type of the port.",
   :rdfs/label "current type",
   :rdfs/domain :morph/MorphPort,
   :rdf/type [:owl/ObjectProperty :opts/Option :rdf/Property]})

(def supportsType
  "A type that a port supports being switched to."
  {:rdfs/comment "A type that a port supports being switched to.",
   :rdfs/label "supports type",
   :rdfs/domain :morph/MorphPort,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})