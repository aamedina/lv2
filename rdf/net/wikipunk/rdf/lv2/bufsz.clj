(ns net.wikipunk.rdf.lv2.bufsz
  "Access to, and restrictions on, buffer sizes."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.ttl",
   :lv2/project {:doap/created "2012-08-07",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/name "LV2 Buf Size",
                 :doap/shortdesc
                 "Access to, and restrictions on, buffer sizes.",
                 :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/buf-size"},
                 :rdf/type :doap/Project},
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
   :rdfs/comment "Access to, and restrictions on, buffer sizes.",
   :rdfs/label "LV2 Buf Size",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/buf-size.lv2/buf-size.meta.ttl"},
   :vann/preferredNamespacePrefix "bufsz",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/buf-size#"})

(def boundedBlockLength
  "Block length has lower and upper bounds."
  {:rdf/about    :bufsz/boundedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length has lower and upper bounds.",
   :rdfs/label   "bounded block length"})

(def coarseBlockLength
  "Plugin prefers coarse block length without buffer splitting."
  {:rdf/about    :bufsz/coarseBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Plugin prefers coarse block length without buffer splitting.",
   :rdfs/label   "coarse block length"})

(def fixedBlockLength
  "Block length never changes."
  {:rdf/about    :bufsz/fixedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length never changes.",
   :rdfs/label   "fixed block length"})

(def maxBlockLength
  "Block length has an upper bound."
  {:rdf/about    :bufsz/maxBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Block length has an upper bound.",
   :rdfs/label   "maximum block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def minBlockLength
  "Block length has a lower bound."
  {:rdf/about    :bufsz/minBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Block length has a lower bound.",
   :rdfs/label   "minimum block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def nominalBlockLength
  "Typical block length that will most often be processed."
  {:rdf/about    :bufsz/nominalBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Typical block length that will most often be processed.",
   :rdfs/label   "nominal block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def powerOf2BlockLength
  "Block length is a power of 2."
  {:rdf/about    :bufsz/powerOf2BlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length is a power of 2.",
   :rdfs/label   "power of 2 block length"})

(def sequenceSize
  "The maximum size of a sequence, in bytes."
  {:rdf/about    :bufsz/sequenceSize,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The maximum size of a sequence, in bytes.",
   :rdfs/label   "sequence size",
   :rdfs/range   :xsd/nonNegativeInteger})