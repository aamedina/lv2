(ns net.wikipunk.rdf.lv2.dman
  "Support for dynamic manifest data generation."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/dynmanifest.lv2/dynmanifest.ttl",
   :rdf/ns-prefix-map {"dman" "http://lv2plug.in/ns/ext/dynmanifest#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/dynmanifest",
   :rdfa/prefix "dman",
   :rdfa/uri "http://lv2plug.in/ns/ext/dynmanifest#",
   :rdfs/comment "Support for dynamic manifest data generation.",
   :rdfs/label "LV2 Dyn Manifest",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/dynmanifest.lv2/dynmanifest.meta.ttl"]})

(def DynManifest
  "Dynamic manifest for an LV2 binary."
  {:db/ident        :dman/DynManifest,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Dynamic manifest for an LV2 binary.",
   :rdfs/label      "Dynamic Manifest",
   :rdfs/subClassOf {:owl/minCardinality 1,
                     :owl/onProperty :lv2/binary,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A DynManifest MUST have at least one lv2:binary."}})