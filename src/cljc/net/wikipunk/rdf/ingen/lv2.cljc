(ns net.wikipunk.rdf.ingen.lv2
  "http://drobilla.net/ns/ingen#"
  {:dcat/downloadURL
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/manifest.ttl",
   :rdf/ns-prefix-map
   {"doap" "http://usefulinc.com/ns/doap#",
    "ingen" "http://drobilla.net/ns/ingen#",
    "ingen.lv2"
    "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/",
    "lv2" "http://lv2plug.in/ns/lv2core#",
    "lv2.atom" "http://lv2plug.in/ns/ext/atom#",
    "lv2.midi" "http://lv2plug.in/ns/ext/midi#",
    "lv2.patch" "http://lv2plug.in/ns/ext/patch#",
    "lv2.work" "http://lv2plug.in/ns/ext/worker#",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ingen.lv2",
   :rdfa/uri "http://drobilla.net/ns/ingen#",
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/ingen.ttl"]})

(def MonoEffect.ttl
  {:db/ident :ingen.lv2/MonoEffect.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/MonoEffect.ttl"]})

(def MonoInstrument.ttl
  {:db/ident :ingen.lv2/MonoInstrument.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/MonoInstrument.ttl"]})

(def StereoEffect.ttl
  {:db/ident :ingen.lv2/StereoEffect.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/StereoEffect.ttl"]})

(def StereoInstrument.ttl
  {:db/ident :ingen.lv2/StereoInstrument.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/StereoInstrument.ttl"]})