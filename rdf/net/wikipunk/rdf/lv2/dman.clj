(ns net.wikipunk.rdf.lv2.dman
  "Support for dynamic manifest data generation."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dman",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/dynmanifest.lv2/dynmanifest.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/dynmanifest.lv2/dynmanifest.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/dynmanifest"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/dynmanifest#",
   :rdf/ns-prefix-map {"dman" "http://lv2plug.in/ns/ext/dynmanifest#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def DynManifest
  "Dynamic manifest for an LV2 binary."
  {:rdfs/comment "Dynamic manifest for an LV2 binary.",
   :rdfs/subClassOf {:rdfs/comment
                       "A DynManifest MUST have at least one lv2:binary.",
                     :owl/minCardinality 1,
                     :owl/onProperty :lv2/binary,
                     :rdf/type :owl/Restriction},
   :rdfs/label "Dynamic Manifest",
   :rdf/type :rdfs/Class})