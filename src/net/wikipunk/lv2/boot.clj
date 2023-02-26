(ns net.wikipunk.lv2.boot
  "LV2 RDF models"
  {:rdf/type :jsonld/Context}
  (:refer-clojure :exclude [atom time keys]))

(def atom
  {:rdfa/prefix       "lv2.atom",
   :rdfa/uri          "http://lv2plug.in/ns/ext/atom#",
   :rdf/type          :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2.atom"  "http://lv2plug.in/ns/ext/atom#",
                       "lv2"       "http://lv2plug.in/ns/lv2core#",
                       "owl"       "http://www.w3.org/2002/07/owl#",
                       "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                       "lv2.ui"    "http://lv2plug.in/ns/extensions/ui#",
                       "lv2.units" "http://lv2plug.in/ns/extensions/units#",
                       "xsd"       "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL  "https://gitlab.com/lv2/lv2/-/raw/master/lv2/atom.lv2/atom.ttl"})

(def buf-size
  {:rdfa/prefix      "lv2.bufsz",
   :rdfa/uri         "http://lv2plug.in/ns/ext/buf-size#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2.bufsz" "http://lv2plug.in/ns/ext/buf-size#",
                       "lv2"       "http://lv2plug.in/ns/lv2core#",
                       "lv2.opts"  "http://lv2plug.in/ns/ext/options#",
                       "owl"       "http://www.w3.org/2002/07/owl#",
                       "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"       "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.ttl"})

(def core
  {:rdfa/prefix      "lv2",
   :rdfa/uri         "http://lv2plug.in/ns/lv2core#",
   :rdf/type         :rdfa/PrefixMapping
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/core.lv2/lv2core.ttl"})

(def data-access
  {:rdfa/prefix      "lv2.da",
   :rdfa/uri         "http://lv2plug.in/ns/ext/data-access#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2.da" "http://lv2plug.in/ns/ext/data-access#",
                       "lv2"    "http://lv2plug.in/ns/lv2core#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/data-access.lv2/data-access.ttl"})

(def dynmanifest
  {:rdfa/prefix      "lv2.dman",
   :rdfa/uri         "http://lv2plug.in/ns/ext/dynmanifest#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2.dman" "http://lv2plug.in/ns/ext/dynmanifest#",
                       "lv2"      "http://lv2plug.in/ns/lv2core#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/dynmanifest.lv2/dynmanifest.ttl"})

(def event
  {:rdfa/prefix      "lv2.ev",
   :rdfa/uri         "http://lv2plug.in/ns/ext/event#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2.ev"   "http://lv2plug.in/ns/ext/event#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/event.lv2/event.ttl"})

(def instance-access
  {:rdfa/prefix      "lv2.ia",
   :rdfa/uri         "http://lv2plug.in/ns/ext/instance-access#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2.ia" "http://lv2plug.in/ns/ext/instance-access#",
                       "lv2"    "http://lv2plug.in/ns/lv2core#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/instance-access.lv2/instance-access.ttl"})

(def log
  {:rdfa/prefix      "lv2.log",
   :rdfa/uri         "http://lv2plug.in/ns/ext/log#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"     "http://lv2plug.in/ns/lv2core#",
                       "lv2.log" "http://lv2plug.in/ns/ext/log#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.ttl"})

(def midi
  {:rdfa/prefix      "lv2.midi",
   :rdfa/uri         "http://lv2plug.in/ns/ext/midi#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.midi" "http://lv2plug.in/ns/ext/midi#",
                       "lv2.atom" "http://lv2plug.in/ns/ext/atom#",
                       "lv2.ev"   "http://lv2plug.in/ns/ext/event#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.ttl"})

(def morph
  {:rdfa/prefix      "lv2.morph",
   :rdfa/uri         "http://lv2plug.in/ns/ext/morph#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"owl"       "http://www.w3.org/2002/07/owl#",
                       "foaf"      "http://xmlns.com/foaf/0.1/",
                       "lv2"       "http://lv2plug.in/ns/lv2core#",
                       "lv2.morph" "http://lv2plug.in/ns/ext/morph#",
                       "lv2.opts"  "http://lv2plug.in/ns/ext/options#",
                       "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "doap"      "http://usefulinc.com/ns/doap#",
                       "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"       "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.ttl"})

(def options
  {:rdfa/prefix      "lv2.opts",
   :rdfa/uri         "http://lv2plug.in/ns/ext/options#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.opts" "http://lv2plug.in/ns/ext/options#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.ttl"})

(def parameters
  {:rdfa/prefix      "lv2.param",
   :rdfa/uri         "http://lv2plug.in/ns/ext/parameters#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"owl"       "http://www.w3.org/2002/07/owl#",
                       "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "lv2"       "http://lv2plug.in/ns/lv2core#",
                       "lv2.atom"  "http://lv2plug.in/ns/ext/atom#",
                       "lv2.param" "http://lv2plug.in/ns/ext/parameters#",
                       "lv2.pg"    "http://lv2plug.in/ns/ext/port-groups#",
                       "lv2.units" "http://lv2plug.in/ns/extensions/units#",
                       "rdfs"      "http://www.w3.org/2000/01/rdf-schema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/parameters.lv2/parameters.ttl"})

(def patch
  {:rdfa/prefix      "lv2.patch",
   :rdfa/uri         "http://lv2plug.in/ns/ext/patch#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"foaf"      "http://xmlns.com/foaf/0.1/",
                       "lv2.patch" "http://lv2plug.in/ns/ext/patch#",
                       "owl"       "http://www.w3.org/2002/07/owl#",
                       "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"       "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.ttl"})

(def port-groups
  {:rdfa/prefix      "lv2.pg",
   :rdfa/uri         "http://lv2plug.in/ns/ext/port-groups#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.pg" "http://lv2plug.in/ns/ext/port-groups#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.ttl"})

(def port-props
  {:rdfa/prefix      "lv2.pprops",
   :rdfa/uri         "http://lv2plug.in/ns/ext/port-props#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"        "http://lv2plug.in/ns/lv2core#",
                       "lv2.pprops" "http://lv2plug.in/ns/ext/port-props#",
                       "owl"        "http://www.w3.org/2002/07/owl#",
                       "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"        "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-props.lv2/port-props.ttl"})

(def presets
  {:rdfa/prefix      "lv2.pset",
   :rdfa/uri         "http://lv2plug.in/ns/ext/presets#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.pset" "http://lv2plug.in/ns/ext/presets#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.ttl"})

(def resize-port
  {:rdfa/prefix      "lv2.rsz",
   :rdfa/uri         "http://lv2plug.in/ns/ext/resize-port#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"     "http://lv2plug.in/ns/lv2core#",
                       "lv2.rsz" "http://lv2plug.in/ns/ext/resize-port#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.ttl"})

(def state
  {:rdfa/prefix      "lv2.state",
   :rdfa/uri         "http://lv2plug.in/ns/ext/state#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"       "http://lv2plug.in/ns/lv2core#",
                       "lv2.state" "http://lv2plug.in/ns/ext/state#",
                       "owl"       "http://www.w3.org/2002/07/owl#",
                       "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"      "http://www.w3.org/2000/01/rdf-schema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.ttl"})

(def time
  {:rdfa/prefix      "lv2.time",
   :rdfa/uri         "http://lv2plug.in/ns/ext/time#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.time" "http://lv2plug.in/ns/ext/time#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.ttl"})

(def ui
  {:rdfa/prefix      "lv2.ui",
   :rdfa/uri         "http://lv2plug.in/ns/extensions/ui#"
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.ui" "http://lv2plug.in/ns/extensions/ui#",
                       "lv2.opts"   "http://lv2plug.in/ns/ext/options#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.ttl"})

(def units
  {:rdfa/prefix      "lv2.units",
   :rdfa/uri         "http://lv2plug.in/ns/extensions/units#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2.units" "http://lv2plug.in/ns/ext/units#",
                       "owl"       "http://www.w3.org/2002/07/owl#",
                       "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"       "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/units.lv2/units.ttl"})

(def urid
  {:rdfa/prefix      "lv2.urid",
   :rdfa/uri         "http://lv2plug.in/ns/ext/urid#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.urid" "http://lv2plug.in/ns/ext/urid#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/urid.lv2/urid.ttl"})

(def uri-map
  {:rdfa/prefix      "lv2.umap",
   :rdfa/uri         "http://lv2plug.in/ns/ext/uri-map#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.umap" "http://lv2plug.in/ns/ext/uri-map#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/uri-map.lv2/uri-map.ttl"})

(def worker
  {:rdfa/prefix      "lv2.work",
   :rdfa/uri         "http://lv2plug.in/ns/ext/worker#",
   :rdf/type         :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.work" "http://lv2plug.in/ns/ext/worker#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"}
   :dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.ttl"})

(def keys
  {:dcat/downloadURL "https://motools.sourceforge.net/keys/keys.owl"
   :rdfa/prefix      "keys"
   :rdfa/uri         "http://purl.org/NET/c4dm/keys.owl#"
   :rdf/type         :rdfa/PrefixMapping})

(def mo
  "Music Ontology"
  {:rdfa/uri    "http://purl.org/ontology/mo/"
   :rdfa/prefix "mo"
   :rdf/type    :rdfa/PrefixMapping})
