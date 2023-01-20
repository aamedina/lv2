(ns net.wikipunk.rdf.lv2.state
  "An interface for LV2 plugins to save and restore state."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"   "http://lv2plug.in/ns/lv2core#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "state" "http://lv2plug.in/ns/ext/state#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/state",
   :rdfa/prefix "state",
   :rdfa/uri "http://lv2plug.in/ns/ext/state#",
   :rdfs/comment "An interface for LV2 plugins to save and restore state.",
   :rdfs/label "LV2 State",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.meta.ttl"]})

(def State
  "LV2 plugin state."
  {:db/ident     :state/State,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "LV2 plugin state.",
   :rdfs/label   "State"})

(def StateChanged
  "A notification that the internal state of the plugin has changed."
  {:db/ident :state/StateChanged,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A notification that the internal state of the plugin has changed.",
   :rdfs/label "State Changed"})

(def freePath
  "A feature for freeing paths allocated by the host."
  {:db/ident     :state/freePath,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature for freeing paths allocated by the host.",
   :rdfs/label   "free path"})

(def interface
  "A plugin interface for saving and restoring state."
  {:db/ident     :state/interface,
   :rdf/type     :lv2/ExtensionData,
   :rdfs/comment "A plugin interface for saving and restoring state.",
   :rdfs/label   "interface"})

(def loadDefaultState
  "A feature indicating that the plugin has default state."
  {:db/ident     :state/loadDefaultState,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature indicating that the plugin has default state.",
   :rdfs/label   "load default state"})

(def makePath
  "A feature for creating new files and directories."
  {:db/ident     :state/makePath,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature for creating new files and directories.",
   :rdfs/label   "make path"})

(def mapPath
  "A feature for mapping between absolute and abstract file paths."
  {:db/ident :state/mapPath,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature for mapping between absolute and abstract file paths.",
   :rdfs/label "map path"})

(def state
  "The state of an LV2 plugin instance."
  {:db/ident     :state/state,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The state of an LV2 plugin instance.",
   :rdfs/label   "state",
   :rdfs/range   :state/State})

(def threadSafeRestore
  "A feature indicating support for thread-safe state restoration."
  {:db/ident :state/threadSafeRestore,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature indicating support for thread-safe state restoration.",
   :rdfs/label "thread-safe restore"})