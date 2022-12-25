(ns net.wikipunk.rdf.lv2.work
  "Support for doing non-realtime work in plugins."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "work",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/worker"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/worker#",
   :rdf/ns-prefix-map {"work" "http://lv2plug.in/ns/ext/worker#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def interface
  "The work interface provided by a plugin."
  {:rdfs/comment "The work interface provided by a plugin.",
   :rdfs/label "work interface",
   :rdf/type :lv2/ExtensionData})

(def schedule
  "The work scheduling feature provided by a host."
  {:rdfs/comment "The work scheduling feature provided by a host.",
   :rdfs/label "work schedule",
   :rdf/type :lv2/Feature})