(ns net.wikipunk.rdf.lv2.bufsz
  "This extension defines a facility for plugins to get information about the block length (the sample_count parameter of LV2_Descriptor::run) and port buffer sizes, as well as several features which can be used to restrict the block length.  This extension defines features and properties but has no special purpose API of its own.  The host provides all the relevant information to the plugin as [options](options.html).  To require restrictions on the block length, plugins can require additional features: bufsz:boundedBlockLength, bufsz:powerOf2BlockLength, and bufsz:fixedBlockLength.  These features are data-only, that is they merely indicate a restriction and do not carry any data or API."
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
  "A feature that indicates the host will provide both the bufsz:minBlockLength and bufsz:maxBlockLength options to the plugin.  Plugins that copy data from audio inputs can require this feature to ensure they know how much space is required for auxiliary buffers.  Note the minimum may be zero, this feature is mainly useful to ensure a maximum is available.  All hosts SHOULD support this feature, since it is simple to support and necessary for any plugins that may need to copy the input."
  {:rdf/about    :bufsz/boundedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length has lower and upper bounds.",
   :rdfs/label   "bounded block length"})

(def coarseBlockLength
  "A feature that indicates the plugin prefers coarse, regular block lengths.  For example, plugins that do not implement sample-accurate control use this feature to indicate that the host should not split the run cycle because controls have changed.  Note that this feature is merely a hint, and does not guarantee a fixed block length.  The run cycle may be split for other reasons, and the blocksize itself may change anytime."
  {:rdf/about    :bufsz/coarseBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Plugin prefers coarse block length without buffer splitting.",
   :rdfs/label   "coarse block length"})

(def fixedBlockLength
  "A feature that indicates the host will always call LV2_Descriptor::run() with the same value for sample_count.  This length MUST be provided as the value of both the bufsz:minBlockLength and bufsz:maxBlockLength options.  Note that requiring this feature may severely limit the number of hosts capable of running the plugin."
  {:rdf/about    :bufsz/fixedBlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length never changes.",
   :rdfs/label   "fixed block length"})

(def maxBlockLength
  "The maximum block length the host will ever request the plugin to process at once, that is, the maximum `sample_count` parameter that will ever be passed to LV2_Descriptor::run()."
  {:rdf/about    :bufsz/maxBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Block length has an upper bound.",
   :rdfs/label   "maximum block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def minBlockLength
  "The minimum block length the host will ever request the plugin to process at once, that is, the minimum `sample_count` parameter that will ever be passed to LV2_Descriptor::run()."
  {:rdf/about    :bufsz/minBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Block length has a lower bound.",
   :rdfs/label   "minimum block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def nominalBlockLength
  "The typical block length the host will request the plugin to process at once, that is, the typical `sample_count` parameter that will be passed to LV2_Descriptor::run().  This will usually be equivalent, or close to, the maximum block length, but there are no strong guarantees about this value whatsoever.  Plugins may use this length for optimization purposes, but MUST NOT assume the host will always process blocks of this length.  In particular, the host MAY process longer blocks."
  {:rdf/about    :bufsz/nominalBlockLength,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Typical block length that will most often be processed.",
   :rdfs/label   "nominal block length",
   :rdfs/range   :xsd/nonNegativeInteger})

(def powerOf2BlockLength
  "A feature that indicates the host will always call LV2_Descriptor::run() with a power of two sample_count.  Note that this feature does not guarantee the value is the same each call, to guarantee a fixed power of two block length plugins must require both this feature and bufsz:fixedBlockLength.  Note that requiring this feature may severely limit the number of hosts capable of running the plugin."
  {:rdf/about    :bufsz/powerOf2BlockLength,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Block length is a power of 2.",
   :rdfs/label   "power of 2 block length"})

(def sequenceSize
  "This should be provided as an option by hosts that support event ports (including but not limited to MIDI), so plugins have the ability to allocate auxiliary buffers large enough to copy the input."
  {:rdf/about    :bufsz/sequenceSize,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The maximum size of a sequence, in bytes.",
   :rdfs/label   "sequence size",
   :rdfs/range   :xsd/nonNegativeInteger})