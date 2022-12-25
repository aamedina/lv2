(ns net.wikipunk.rdf.lv2.bufsz
  "Access to, and restrictions on, buffer sizes."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "bufsz",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.ttl",
   :owl/imports [#:rdf{:uri "http://lv2plug.in/ns/ext/options"}
                 #:rdf{:uri "http://lv2plug.in/ns/lv2core"}],
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/buf-size"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/buf-size#",
   :rdf/ns-prefix-map {"bufsz" "http://lv2plug.in/ns/ext/buf-size#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def boundedBlockLength
  "Block length has lower and upper bounds."
  {:rdfs/comment "Block length has lower and upper bounds.",
   :rdfs/label "bounded block length",
   :rdf/type :lv2/Feature})

(def coarseBlockLength
  "Plugin prefers coarse block length without buffer splitting."
  {:rdfs/comment "Plugin prefers coarse block length without buffer splitting.",
   :rdfs/label "coarse block length",
   :rdf/type :lv2/Feature})

(def fixedBlockLength
  "Block length never changes."
  {:rdfs/comment "Block length never changes.",
   :rdfs/label "fixed block length",
   :rdf/type :lv2/Feature})

(def maxBlockLength
  "Block length has an upper bound."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/comment "Block length has an upper bound.",
   :rdfs/label "maximum block length",
   :rdf/type [:opts/Option :owl/DatatypeProperty :rdf/Property]})

(def minBlockLength
  "Block length has a lower bound."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/comment "Block length has a lower bound.",
   :rdfs/label "minimum block length",
   :rdf/type [:opts/Option :owl/DatatypeProperty :rdf/Property]})

(def nominalBlockLength
  "Typical block length that will most often be processed."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/comment "Typical block length that will most often be processed.",
   :rdfs/label "nominal block length",
   :rdf/type [:opts/Option :owl/DatatypeProperty :rdf/Property]})

(def powerOf2BlockLength
  "Block length is a power of 2."
  {:rdfs/comment "Block length is a power of 2.",
   :rdfs/label "power of 2 block length",
   :rdf/type :lv2/Feature})

(def sequenceSize
  "The maximum size of a sequence, in bytes."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/comment "The maximum size of a sequence, in bytes.",
   :rdfs/label "sequence size",
   :rdf/type [:opts/Option :owl/DatatypeProperty :rdf/Property]})