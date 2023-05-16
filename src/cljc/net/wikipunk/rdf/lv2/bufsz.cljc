(ns net.wikipunk.rdf.lv2.bufsz
  "Access to, and restrictions on, buffer sizes."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.ttl",
   :owl/imports ["http://lv2plug.in/ns/ext/options"
                 "http://lv2plug.in/ns/lv2core"],
   :rdf/ns-prefix-map {"lv2" "http://lv2plug.in/ns/lv2core#",
                       "lv2.bufsz" "http://lv2plug.in/ns/ext/buf-size#",
                       "lv2.opts" "http://lv2plug.in/ns/ext/options#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.bufsz",
   :rdfa/uri "http://lv2plug.in/ns/ext/buf-size",
   :rdfs/comment "Access to, and restrictions on, buffer sizes.",
   :rdfs/label "LV2 Buf Size",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.meta.ttl"]})

(def boundedBlockLength
  "Block length has lower and upper bounds."
  {:db/ident     :lv2.bufsz/boundedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length has lower and upper bounds.",
   :rdfs/label   "bounded block length"})

(def coarseBlockLength
  "Plugin prefers coarse block length without buffer splitting."
  {:db/ident     :lv2.bufsz/coarseBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Plugin prefers coarse block length without buffer splitting.",
   :rdfs/label   "coarse block length"})

(def fixedBlockLength
  "Block length never changes."
  {:db/ident     :lv2.bufsz/fixedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length never changes.",
   :rdfs/label   "fixed block length"})

(def maxBlockLength
  "Block length has an upper bound."
  {:db/ident           :lv2.bufsz/maxBlockLength,
   :rdf/type           [:lv2.opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "Block length has an upper bound.",
   :rdfs/label         "maximum block length",
   :rdfs/range         :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :lv2.bufsz/maxBlockLength})

(def minBlockLength
  "Block length has a lower bound."
  {:db/ident           :lv2.bufsz/minBlockLength,
   :rdf/type           [:lv2.opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "Block length has a lower bound.",
   :rdfs/label         "minimum block length",
   :rdfs/range         :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :lv2.bufsz/minBlockLength})

(def nominalBlockLength
  "Typical block length that will most often be processed."
  {:db/ident :lv2.bufsz/nominalBlockLength,
   :rdf/type [:lv2.opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Typical block length that will most often be processed.",
   :rdfs/label "nominal block length",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :lv2.bufsz/nominalBlockLength})

(def powerOf2BlockLength
  "Block length is a power of 2."
  {:db/ident     :lv2.bufsz/powerOf2BlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length is a power of 2.",
   :rdfs/label   "power of 2 block length"})

(def sequenceSize
  "The maximum size of a sequence, in bytes."
  {:db/ident           :lv2.bufsz/sequenceSize,
   :rdf/type           [:lv2.opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "The maximum size of a sequence, in bytes.",
   :rdfs/label         "sequence size",
   :rdfs/range         :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :lv2.bufsz/sequenceSize})