(ns net.wikipunk.rdf.lv2.bufsz
  "Access to, and restrictions on, buffer sizes."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.ttl",
   :owl/imports ["http://lv2plug.in/ns/ext/options"
                 "http://lv2plug.in/ns/lv2core"],
   :rdf/ns-prefix-map {"bufsz" "http://lv2plug.in/ns/ext/buf-size#",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "opts"  "http://lv2plug.in/ns/ext/options#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/buf-size",
   :rdfa/prefix "bufsz",
   :rdfa/uri "http://lv2plug.in/ns/ext/buf-size#",
   :rdfs/comment "Access to, and restrictions on, buffer sizes.",
   :rdfs/label "LV2 Buf Size",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.meta.ttl"]})

(def boundedBlockLength
  "Block length has lower and upper bounds."
  {:db/ident     :bufsz/boundedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length has lower and upper bounds.",
   :rdfs/label   "bounded block length"})

(def coarseBlockLength
  "Plugin prefers coarse block length without buffer splitting."
  {:db/ident     :bufsz/coarseBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Plugin prefers coarse block length without buffer splitting.",
   :rdfs/label   "coarse block length"})

(def fixedBlockLength
  "Block length never changes."
  {:db/ident     :bufsz/fixedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length never changes.",
   :rdfs/label   "fixed block length"})

(def maxBlockLength
  "Block length has an upper bound."
  {:db/ident     :bufsz/maxBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Block length has an upper bound.",
   :rdfs/label   "maximum block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def minBlockLength
  "Block length has a lower bound."
  {:db/ident     :bufsz/minBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Block length has a lower bound.",
   :rdfs/label   "minimum block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def nominalBlockLength
  "Typical block length that will most often be processed."
  {:db/ident     :bufsz/nominalBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Typical block length that will most often be processed.",
   :rdfs/label   "nominal block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def powerOf2BlockLength
  "Block length is a power of 2."
  {:db/ident     :bufsz/powerOf2BlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length is a power of 2.",
   :rdfs/label   "power of 2 block length"})

(def sequenceSize
  "The maximum size of a sequence, in bytes."
  {:db/ident     :bufsz/sequenceSize,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The maximum size of a sequence, in bytes.",
   :rdfs/label   "sequence size",
   :rdfs/range   :xsd/nonNegativeInteger})