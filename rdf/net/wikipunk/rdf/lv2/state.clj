(ns net.wikipunk.rdf.lv2.state
  "An interface for LV2 plugins to save and restore state."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "state",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/state.lv2/state.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/state"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/state#",
   :rdf/ns-prefix-map {"state" "http://lv2plug.in/ns/ext/state#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}}
  (:refer-clojure :exclude []))

(def State
  "LV2 plugin state."
  {:rdfs/comment "LV2 plugin state.",
   :rdfs/label "State",
   :rdf/type :rdfs/Class})

(def StateChanged
  "A notification that the internal state of the plugin has changed."
  {:rdfs/comment
     "A notification that the internal state of the plugin has changed.",
   :rdfs/label "State Changed",
   :rdf/type :rdfs/Class})

(def freePath
  "A feature for freeing paths allocated by the host."
  {:rdfs/comment "A feature for freeing paths allocated by the host.",
   :rdfs/label "free path",
   :rdf/type :lv2/Feature})

(def interface
  "A plugin interface for saving and restoring state."
  {:rdfs/comment "A plugin interface for saving and restoring state.",
   :rdfs/label "interface",
   :rdf/type :lv2/ExtensionData})

(def loadDefaultState
  "A feature indicating that the plugin has default state."
  {:rdfs/comment "A feature indicating that the plugin has default state.",
   :rdfs/label "load default state",
   :rdf/type :lv2/Feature})

(def makePath
  "A feature for creating new files and directories."
  {:rdfs/comment "A feature for creating new files and directories.",
   :rdfs/label "make path",
   :rdf/type :lv2/Feature})

(def mapPath
  "A feature for mapping between absolute and abstract file paths."
  {:rdfs/comment
     "A feature for mapping between absolute and abstract file paths.",
   :rdfs/label "map path",
   :rdf/type :lv2/Feature})

(def state
  "The state of an LV2 plugin instance."
  {:rdfs/comment "The state of an LV2 plugin instance.",
   :rdfs/range :state/State,
   :rdfs/label "state",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def threadSafeRestore
  "A feature indicating support for thread-safe state restoration."
  {:rdfs/comment
     "A feature indicating support for thread-safe state restoration.",
   :rdfs/label "thread-safe restore",
   :rdf/type :lv2/Feature})