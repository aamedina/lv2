(ns net.wikipunk.rdf.lv2.bufsz
  "Access to, and restrictions on, buffer sizes."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.ttl",
   :owl/imports [{:rdf/uri "http://lv2plug.in/ns/ext/options"}
                 {:rdf/uri "http://lv2plug.in/ns/lv2core"}],
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/buf-size"},
   :rdf/ns-prefix-map {"bufsz" "http://lv2plug.in/ns/ext/buf-size#",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "opts"  "http://lv2plug.in/ns/ext/options#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.meta.ttl"},
   :vann/preferredNamespacePrefix "bufsz",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/buf-size#"}
  (:refer-clojure :exclude []))

(def boundedBlockLength
  "Block length has lower and upper bounds."
  {:rdf/about  :bufsz/boundedBlockLength,
   :rdf/type   :lv2/Feature,
   :rdfs/label "bounded block length"})

(def coarseBlockLength
  "Plugin prefers coarse block length without buffer splitting."
  {:rdf/about  :bufsz/coarseBlockLength,
   :rdf/type   :lv2/Feature,
   :rdfs/label "coarse block length"})

(def fixedBlockLength
  "Block length never changes."
  {:rdf/about  :bufsz/fixedBlockLength,
   :rdf/type   :lv2/Feature,
   :rdfs/label "fixed block length"})

(def maxBlockLength
  "Block length has an upper bound."
  {:rdf/about  :bufsz/maxBlockLength,
   :rdf/type   [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "maximum block length",
   :rdfs/range :xsd/nonNegativeInteger})

(def minBlockLength
  "Block length has a lower bound."
  {:rdf/about  :bufsz/minBlockLength,
   :rdf/type   [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "minimum block length",
   :rdfs/range :xsd/nonNegativeInteger})

(def nominalBlockLength
  "Typical block length that will most often be processed."
  {:rdf/about  :bufsz/nominalBlockLength,
   :rdf/type   [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "nominal block length",
   :rdfs/range :xsd/nonNegativeInteger})

(def powerOf2BlockLength
  "Block length is a power of 2."
  {:rdf/about  :bufsz/powerOf2BlockLength,
   :rdf/type   :lv2/Feature,
   :rdfs/label "power of 2 block length"})

(def sequenceSize
  "The maximum size of a sequence, in bytes."
  {:rdf/about  :bufsz/sequenceSize,
   :rdf/type   [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "sequence size",
   :rdfs/range :xsd/nonNegativeInteger})