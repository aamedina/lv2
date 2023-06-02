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

(def MonoEffect_ttl
  {:db/ident :ingen.lv2/MonoEffect.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/MonoEffect.ttl"]})

(def MonoInstrument_ttl
  {:db/ident :ingen.lv2/MonoInstrument.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/MonoInstrument.ttl"]})

(def StereoEffect_ttl
  {:db/ident :ingen.lv2/StereoEffect.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/StereoEffect.ttl"]})

(def StereoInstrument_ttl
  {:db/ident :ingen.lv2/StereoInstrument.ttl,
   :lv2/prototype :ingen/GraphPrototype,
   :rdf/type [:lv2/Plugin :ingen/Graph],
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/StereoInstrument.ttl"]})

(def ^{:private true} GraphPrototype
  "Template for all Ingen graphs. Saved Ingen graphs always set this as their lv2:prototype. When Ingen is installed, a bundle is installed which included the Ingen LV2 binary and a description of ingen:GraphPrototype which links to it. This way, Ingen graphs can be loaded by LV2 hosts without including binaries or symbolic links in saved Ingen bundles."
  {:db/ident :ingen/GraphPrototype,
   :lv2/binary :ingen.lv2/libingen_lv2.so,
   :rdf/type :lv2/PluginBase,
   :rdfs/comment
   "Template for all Ingen graphs.\n\nSaved Ingen graphs always set this as their lv2:prototype.  When Ingen is\ninstalled, a bundle is installed which included the Ingen LV2 binary and a\ndescription of ingen:GraphPrototype which links to it.  This way, Ingen graphs\ncan be loaded by LV2 hosts without including binaries or symbolic links in\nsaved Ingen bundles.\n"})

(def ^{:private true} GraphUIGtk2
  "The Ingen patcher interface."
  {:db/ident      :ingen/GraphUIGtk2,
   :lv2.ui/binary :ingen.lv2/libingen_gui_lv2.so,
   :rdf/type      :lv2.ui/GtkUI,
   :rdfs/comment  "The Ingen patcher interface."})

(def ^{:private true} Controller
  {:db/ident :ingen.internals/Controller,
   :rdf/type :ingen/Plugin,
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/internals.ttl"]})

(def ^{:private true} Note
  {:db/ident :ingen.internals/Note,
   :rdf/type :ingen/Plugin,
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/internals.ttl"]})

(def ^{:private true} Transport
  {:db/ident :ingen.internals/Transport,
   :rdf/type :ingen/Plugin,
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/internals.ttl"]})

(def ^{:private true} Trigger
  {:db/ident :ingen.internals/Trigger,
   :rdf/type :ingen/Plugin,
   :rdfs/seeAlso
   ["https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/internals.ttl"]})