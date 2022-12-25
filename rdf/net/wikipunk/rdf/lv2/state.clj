(ns net.wikipunk.rdf.lv2.state
  "An interface for LV2 plugins to save and restore state."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.ttl",
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/state"},
   :rdf/ns-prefix-map {"lv2"   "http://lv2plug.in/ns/lv2core#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "state" "http://lv2plug.in/ns/ext/state#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.meta.ttl"},
   :vann/preferredNamespacePrefix "state",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/state#"}
  (:refer-clojure :exclude []))

(def State
  "LV2 plugin state."
  {:rdf/about  :state/State,
   :rdf/type   :rdfs/Class,
   :rdfs/label "State"})

(def StateChanged
  "A notification that the internal state of the plugin has changed."
  {:rdf/about  :state/StateChanged,
   :rdf/type   :rdfs/Class,
   :rdfs/label "State Changed"})

(def freePath
  "A feature for freeing paths allocated by the host."
  {:rdf/about  :state/freePath,
   :rdf/type   :lv2/Feature,
   :rdfs/label "free path"})

(def interface
  "A plugin interface for saving and restoring state."
  {:rdf/about  :state/interface,
   :rdf/type   :lv2/ExtensionData,
   :rdfs/label "interface"})

(def loadDefaultState
  "A feature indicating that the plugin has default state."
  {:rdf/about  :state/loadDefaultState,
   :rdf/type   :lv2/Feature,
   :rdfs/label "load default state"})

(def makePath
  "A feature for creating new files and directories."
  {:rdf/about  :state/makePath,
   :rdf/type   :lv2/Feature,
   :rdfs/label "make path"})

(def mapPath
  "A feature for mapping between absolute and abstract file paths."
  {:rdf/about  :state/mapPath,
   :rdf/type   :lv2/Feature,
   :rdfs/label "map path"})

(def state
  "The state of an LV2 plugin instance."
  {:rdf/about  :state/state,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "state",
   :rdfs/range :state/State})

(def threadSafeRestore
  "A feature indicating support for thread-safe state restoration."
  {:rdf/about  :state/threadSafeRestore,
   :rdf/type   :lv2/Feature,
   :rdfs/label "thread-safe restore"})