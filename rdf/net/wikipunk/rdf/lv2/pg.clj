(ns net.wikipunk.rdf.lv2.pg
  "Multi-channel groups of LV2 ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.ttl",
   :lv2/project
   {:doap/created   "2008-00-00",
    :doap/developer [{:rdf/uri "http://drobilla.net/drobilla#me"}
                     {:rdf/uri "http://lv2plug.in/ns/meta#larsl"}],
    :doap/license   {:rdf/uri "http://opensource.org/licenses/isc"},
    :doap/name      "LV2 Port Groups",
    :doap/shortdesc "Multi-channel groups of LV2 ports.",
    :rdf/about      {:rdf/uri "http://lv2plug.in/ns/ext/port-groups"},
    :rdf/type       :doap/Project},
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/port-groups"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "pg"   "http://lv2plug.in/ns/ext/port-groups#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "Multi-channel groups of LV2 ports.",
   :rdfs/label "LV2 Port Groups",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.meta.ttl"},
   :vann/preferredNamespacePrefix "pg",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/port-groups#"})

(def ACN0
  "Ambisonic channel 0 (W): degree 0, index 0."
  {:pg/harmonicDegree 0,
   :pg/harmonicIndex  0,
   :pg/letterCode     "W",
   :rdf/about         :pg/ACN0,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 0 (W): degree 0, index 0.",
   :rdfs/label        "ACN0"})

(def ACN1
  "Ambisonic channel 1 (Y): degree 1, index -1."
  {:pg/harmonicDegree 1,
   :pg/harmonicIndex  -1,
   :pg/letterCode     "Y",
   :rdf/about         :pg/ACN1,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 1 (Y): degree 1, index -1.",
   :rdfs/label        "ACN1"})

(def ACN10
  "Ambisonic channel 10 (O): degree 3, index -2."
  {:pg/harmonicDegree 3,
   :pg/harmonicIndex  -2,
   :pg/letterCode     "O",
   :rdf/about         :pg/ACN10,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 10 (O): degree 3, index -2.",
   :rdfs/label        "ACN10"})

(def ACN11
  "Ambisonic channel 11 (M): degree 3, index -1."
  {:pg/harmonicDegree 3,
   :pg/harmonicIndex  -1,
   :pg/letterCode     "M",
   :rdf/about         :pg/ACN11,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 11 (M): degree 3, index -1.",
   :rdfs/label        "ACN11"})

(def ACN12
  "Ambisonic channel 12 (K): degree 3, index 0."
  {:pg/harmonicDegree 3,
   :pg/harmonicIndex  0,
   :pg/letterCode     "K",
   :rdf/about         :pg/ACN12,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 12 (K): degree 3, index 0.",
   :rdfs/label        "ACN12"})

(def ACN13
  "Ambisonic channel 13 (L): degree 3, index 1."
  {:pg/harmonicDegree 3,
   :pg/harmonicIndex  1,
   :pg/letterCode     "L",
   :rdf/about         :pg/ACN13,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 13 (L): degree 3, index 1.",
   :rdfs/label        "ACN13"})

(def ACN14
  "Ambisonic channel 14 (N): degree 3, index 2."
  {:pg/harmonicDegree 3,
   :pg/harmonicIndex  2,
   :pg/letterCode     "N",
   :rdf/about         :pg/ACN14,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 14 (N): degree 3, index 2.",
   :rdfs/label        "ACN14"})

(def ACN15
  "Ambisonic channel 15 (P): degree 3, index 3."
  {:pg/harmonicDegree 3,
   :pg/harmonicIndex  3,
   :pg/letterCode     "P",
   :rdf/about         :pg/ACN15,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 15 (P): degree 3, index 3.",
   :rdfs/label        "ACN15"})

(def ACN2
  "Ambisonic channel 2 (Z): degree 1, index 0."
  {:pg/harmonicDegree 1,
   :pg/harmonicIndex  0,
   :pg/letterCode     "Z",
   :rdf/about         :pg/ACN2,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 2 (Z): degree 1, index 0.",
   :rdfs/label        "ACN2"})

(def ACN3
  "Ambisonic channel 3 (X): degree 1, index 1."
  {:pg/harmonicDegree 1,
   :pg/harmonicIndex  1,
   :pg/letterCode     "X",
   :rdf/about         :pg/ACN3,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 3 (X): degree 1, index 1.",
   :rdfs/label        "ACN3"})

(def ACN4
  "Ambisonic channel 4 (V): degree 2, index -2."
  {:pg/harmonicDegree 2,
   :pg/harmonicIndex  -2,
   :pg/letterCode     "V",
   :rdf/about         :pg/ACN4,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 4 (V): degree 2, index -2.",
   :rdfs/label        "ACN4"})

(def ACN5
  "Ambisonic channel 5 (T): degree 2, index -1."
  {:pg/harmonicDegree 2,
   :pg/harmonicIndex  -1,
   :pg/letterCode     "T",
   :rdf/about         :pg/ACN5,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 5 (T): degree 2, index -1.",
   :rdfs/label        "ACN5"})

(def ACN6
  "Ambisonic channel 6 (R): degree 2, index 0."
  {:pg/harmonicDegree 2,
   :pg/harmonicIndex  0,
   :pg/letterCode     "R",
   :rdf/about         :pg/ACN6,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 6 (R): degree 2, index 0.",
   :rdfs/label        "ACN6"})

(def ACN7
  "Ambisonic channel 7 (S): degree 2, index 1."
  {:pg/harmonicDegree 2,
   :pg/harmonicIndex  1,
   :pg/letterCode     "S",
   :rdf/about         :pg/ACN7,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 7 (S): degree 2, index 1.",
   :rdfs/label        "ACN7"})

(def ACN8
  "Ambisonic channel 8 (U): degree 2, index 2."
  {:pg/harmonicDegree 2,
   :pg/harmonicIndex  2,
   :pg/letterCode     "U",
   :rdf/about         :pg/ACN8,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 8 (U): degree 2, index 2.",
   :rdfs/label        "ACN8"})

(def ACN9
  "Ambisonic channel 9 (Q): degree 3, index -3."
  {:pg/harmonicDegree 3,
   :pg/harmonicIndex  -3,
   :pg/letterCode     "Q",
   :rdf/about         :pg/ACN9,
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 9 (Q): degree 3, index -3.",
   :rdfs/label        "ACN9"})

(def AmbisonicBH1P0Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 0."
  {:pg/element [{:lv2/designation :pg/ACN3,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/about :pg/AmbisonicBH1P0Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 1 and peripheral order 0.",
   :rdfs/label "Ambisonic BH1P0",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH1P1Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 1."
  {:pg/element [{:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/about :pg/AmbisonicBH1P1Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 1 and peripheral order 1.",
   :rdfs/label "Ambisonic BH1P1",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH2P0Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 0."
  {:pg/element [{:lv2/designation :pg/ACN8,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/about :pg/AmbisonicBH2P0Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 0.",
   :rdfs/label "Ambisonic BH2P0",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH2P1Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 1."
  {:pg/element [{:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}],
   :rdf/about :pg/AmbisonicBH2P1Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 1.",
   :rdfs/label "Ambisonic BH2P1",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH2P2Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 2."
  {:pg/element [{:lv2/designation :pg/ACN6,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN5,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       8}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN7,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}],
   :rdf/about :pg/AmbisonicBH2P2Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 2.",
   :rdfs/label "Ambisonic BH2P2",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P0Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 0."
  {:pg/element [{:lv2/designation :pg/ACN8,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN9,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       6}],
   :rdf/about :pg/AmbisonicBH3P0Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 0.",
   :rdfs/label "Ambisonic BH3P0",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P1Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 1."
  {:pg/element [{:lv2/designation :pg/ACN9,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}],
   :rdf/about :pg/AmbisonicBH3P1Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 1.",
   :rdfs/label "Ambisonic BH3P1",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P2Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 2."
  {:pg/element [{:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN7,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN5,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       8}
                {:lv2/designation :pg/ACN6,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       10}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN9,
                 :lv2/index       9}],
   :rdf/about :pg/AmbisonicBH3P2Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 2.",
   :rdfs/label "Ambisonic BH3P2",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P3Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 3."
  {:pg/element [{:lv2/designation :pg/ACN7,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN6,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN12,
                 :lv2/index       12}
                {:lv2/designation :pg/ACN9,
                 :lv2/index       9}
                {:lv2/designation :pg/ACN14,
                 :lv2/index       14}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       8}
                {:lv2/designation :pg/ACN5,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN13,
                 :lv2/index       13}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       15}
                {:lv2/designation :pg/ACN11,
                 :lv2/index       11}
                {:lv2/designation :pg/ACN10,
                 :lv2/index       10}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}],
   :rdf/about :pg/AmbisonicBH3P3Group,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 3.",
   :rdfs/label "Ambisonic BH3P3",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicGroup
  "These groups are divided into channels which together represent a position in an abstract n-dimensional space. The position of sound in one of these groups does not depend on a particular speaker configuration; a decoder can be used to convert an ambisonic stream for any speaker configuration."
  {:rdf/about       :pg/AmbisonicGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group of Ambisonic channels.",
   :rdfs/label      "Ambisonic Group",
   :rdfs/subClassOf :pg/Group})

(def DiscreteGroup
  "These groups are divided into channels where each represents a particular speaker location.  The position of sound in one of these groups depends on a particular speaker configuration."
  {:rdf/about       :pg/DiscreteGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group of discrete channels.",
   :rdfs/label      "Discrete Group",
   :rdfs/subClassOf :pg/Group})

(def Element
  "An element of a group, with a designation and optional index."
  {:rdf/about :pg/Element,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   ["An element of a group, with a designation and optional index."
    "An ordered element of a group."],
   :rdfs/label "Element",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :lv2/designation,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "An element MUST have exactly one lv2:designation."}})

(def FivePointOneGroup
  "A 5.1 (3-2 stereo with sub) discrete surround sound group."
  {:pg/element [{:lv2/designation :pg/lowFrequencyEffects,
                 :lv2/index       5}
                {:lv2/designation :pg/rearLeft,
                 :lv2/index       3}
                {:lv2/designation :pg/left,
                 :lv2/index       0}
                {:lv2/designation :pg/rearRight,
                 :lv2/index       4}
                {:lv2/designation :pg/right,
                 :lv2/index       2}
                {:lv2/designation :pg/center,
                 :lv2/index       1}],
   :rdf/about :pg/FivePointOneGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 5.1 (3-2 stereo with sub) discrete surround sound group.",
   :rdfs/label "5.1 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def FivePointZeroGroup
  "A 5.0 (3-2 stereo) discrete surround sound group."
  {:pg/element      [{:lv2/designation :pg/rearRight,
                      :lv2/index       4}
                     {:lv2/designation :pg/rearLeft,
                      :lv2/index       3}
                     {:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/about       :pg/FivePointZeroGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 5.0 (3-2 stereo) discrete surround sound group.",
   :rdfs/label      "5.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def FourPointZeroGroup
  "A 4.0 (Quadraphonic) discrete surround sound group."
  {:pg/element      [{:lv2/designation :pg/rearCenter,
                      :lv2/index       3}
                     {:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/about       :pg/FourPointZeroGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 4.0 (Quadraphonic) discrete surround sound group.",
   :rdfs/label      "4.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def Group
  "A group logically combines ports which should be considered part of the same stream.  For example, two audio ports in a group may form a stereo stream.  Like ports, groups have a lv2:symbol that is unique within the context of the plugin, where group symbols and port symbols reside in the same namespace.  In other words, a group on a plugin MUST NOT have the same symbol as any other group or port on that plugin.  This makes it possible to uniquely reference a port or group on a plugin with a single identifier and no context.  Group definitions may be shared across plugins for brevity.  For example, a plugin collection may define a single URI for a pg:StereoGroup with the symbol \"input\" and use it in many plugins."
  {:rdf/about       :pg/Group,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A set of ports that are logically grouped together.",
   :rdfs/label      "Port Group",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :lv2/symbol,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A Group MUST have exactly one string lv2:symbol."}})

(def InputGroup
  "A group which contains exclusively inputs."
  {:rdf/about       :pg/InputGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group which contains exclusively inputs.",
   :rdfs/label      "Input Group",
   :rdfs/subClassOf :pg/Group})

(def MidSideGroup
  "A 2-channel mid-side stereo audio group."
  {:pg/element      [{:lv2/designation :pg/side,
                      :lv2/index       1}
                     {:lv2/designation :pg/center,
                      :lv2/index       0}],
   :rdf/about       :pg/MidSideGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 2-channel mid-side stereo audio group.",
   :rdfs/label      "Mid-Side Stereo",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def MonoGroup
  "A single channel audio group."
  {:pg/element      {:lv2/designation :pg/center,
                     :lv2/index       0},
   :rdf/about       :pg/MonoGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A single channel audio group.",
   :rdfs/label      "Mono",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def OutputGroup
  "A group which contains exclusively outputs."
  {:rdf/about       :pg/OutputGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group which contains exclusively outputs.",
   :rdfs/label      "Output Group",
   :rdfs/subClassOf :pg/Group})

(def SevenPointOneGroup
  "A 7.1 discrete surround sound group."
  {:pg/element      [{:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/rearRight,
                      :lv2/index       6}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/sideRight,
                      :lv2/index       4}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}
                     {:lv2/designation :pg/lowFrequencyEffects,
                      :lv2/index       7}
                     {:lv2/designation :pg/rearLeft,
                      :lv2/index       5}
                     {:lv2/designation :pg/sideLeft,
                      :lv2/index       3}],
   :rdf/about       :pg/SevenPointOneGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 7.1 discrete surround sound group.",
   :rdfs/label      "7.1 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def SevenPointOneWideGroup
  "A 7.1 wide discrete surround sound group."
  {:pg/element      [{:lv2/designation :pg/right,
                      :lv2/index       4}
                     {:lv2/designation :pg/centerRight,
                      :lv2/index       3}
                     {:lv2/designation :pg/center,
                      :lv2/index       2}
                     {:lv2/designation :pg/centerLeft,
                      :lv2/index       1}
                     {:lv2/designation :pg/rearLeft,
                      :lv2/index       5}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}
                     {:lv2/designation :pg/rearRight,
                      :lv2/index       6}
                     {:lv2/designation :pg/lowFrequencyEffects,
                      :lv2/index       7}],
   :rdf/about       :pg/SevenPointOneWideGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 7.1 wide discrete surround sound group.",
   :rdfs/label      "7.1 Surround (Wide)",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def SixPointOneGroup
  "A 6.1 discrete surround sound group."
  {:pg/element      [{:lv2/designation :pg/sideRight,
                      :lv2/index       4}
                     {:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}
                     {:lv2/designation :pg/lowFrequencyEffects,
                      :lv2/index       6}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/sideLeft,
                      :lv2/index       3}
                     {:lv2/designation :pg/rearCenter,
                      :lv2/index       5}],
   :rdf/about       :pg/SixPointOneGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 6.1 discrete surround sound group.",
   :rdfs/label      "6.1 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def StereoGroup
  "A 2-channel discrete stereo audio group."
  {:pg/element      [{:lv2/designation :pg/right,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/about       :pg/StereoGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 2-channel discrete stereo audio group.",
   :rdfs/label      "Stereo",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def ThreePointZeroGroup
  "A 3.0 discrete surround sound group."
  {:pg/element      [{:lv2/designation :pg/rearCenter,
                      :lv2/index       2}
                     {:lv2/designation :pg/right,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/about       :pg/ThreePointZeroGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 3.0 discrete surround sound group.",
   :rdfs/label      "3.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def center
  "The center channel of a discrete audio group."
  {:rdf/about    :pg/center,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center channel of a discrete audio group.",
   :rdfs/label   "center"})

(def centerLeft
  "The center-left channel of a 7.1 wide surround sound group."
  {:rdf/about    :pg/centerLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center-left channel of a 7.1 wide surround sound group.",
   :rdfs/label   "center left"})

(def centerRight
  "The center-right channel of a 7.1 wide surround sound group."
  {:rdf/about    :pg/centerRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center-right channel of a 7.1 wide surround sound group.",
   :rdfs/label   "center right"})

(def element
  "An element within a port group."
  {:rdf/about    :pg/element,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An element within a port group.",
   :rdfs/label   "element",
   :rdfs/range   :pg/Element})

(def group
  "Indicates that this port is a part of a group of ports on the plugin.  The port should also have an lv2:designation property to define its designation within that group."
  {:rdf/about    :pg/group,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Group that this port is a part of.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "group",
   :rdfs/range   :pg/Group})

(def harmonicDegree
  "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel."
  {:rdf/about :pg/harmonicDegree,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/domain :lv2/Channel,
   :rdfs/label "harmonic degree",
   :rdfs/range :xsd/integer})

(def harmonicIndex
  "The index coefficient (m) of the spherical harmonic for an Ambisonic channel."
  {:rdf/about :pg/harmonicIndex,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The index coefficient (m) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/domain :lv2/Channel,
   :rdfs/label "harmonic index",
   :rdfs/range :xsd/integer})

(def left
  "The left channel of a stereo audio group."
  {:rdf/about    :pg/left,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The left channel of a stereo audio group.",
   :rdfs/label   "left"})

(def letterCode
  "The YuMa letter code for an Ambisonic channel."
  {:rdf/about    :pg/letterCode,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The YuMa letter code for an Ambisonic channel.",
   :rdfs/domain  :lv2/Channel,
   :rdfs/label   "ambisonic letter code",
   :rdfs/range   :rdf/PlainLiteral})

(def lowFrequencyEffects
  "The LFE channel of a *.1 surround sound group."
  {:rdf/about    :pg/lowFrequencyEffects,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The LFE channel of a *.1 surround sound group.",
   :rdfs/label   "low-frequency effects"})

(def mainInput
  "Indicates that this group should be considered the \"main\" input, i.e. the primary task is processing the signal in this group.  A plugin MUST NOT have more than one pg:mainInput property."
  {:rdf/about    :pg/mainInput,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Input group that is the primary input of the plugin.",
   :rdfs/domain  :lv2/Plugin,
   :rdfs/label   "main input",
   :rdfs/range   :pg/InputGroup})

(def mainOutput
  "Indicates that this group should be considered the \"main\" output.  The main output group SHOULD have the main input group as a pg:source."
  {:rdf/about    :pg/mainOutput,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Output group that is the primary output of the plugin.",
   :rdfs/domain  :lv2/Plugin,
   :rdfs/label   "main output",
   :rdfs/range   :pg/OutputGroup})

(def rearCenter
  "The rear-center channel of a surround sound group."
  {:rdf/about    :pg/rearCenter,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-center channel of a surround sound group.",
   :rdfs/label   "rear center"})

(def rearLeft
  "The rear-left channel of a surround sound group."
  {:rdf/about    :pg/rearLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-left channel of a surround sound group.",
   :rdfs/label   "rear left"})

(def rearRight
  "The rear-right channel of a surround sound group."
  {:rdf/about    :pg/rearRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-right channel of a surround sound group.",
   :rdfs/label   "rear right"})

(def right
  "The right channel of a stereo audio group."
  {:rdf/about    :pg/right,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The right channel of a stereo audio group.",
   :rdfs/label   "right"})

(def side
  "The side channel of a mid-side audio group."
  {:rdf/about    :pg/side,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side channel of a mid-side audio group.",
   :rdfs/label   "side"})

(def sideChainOf
  "Indicates that this port or group should be considered a \"side chain\" of some other port or group.  The precise definition of \"side chain\" depends on the plugin, but in general this group should be considered a modifier to some other group, rather than an independent input itself."
  {:rdf/about    :pg/sideChainOf,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Port or group is a side chain of another.",
   :rdfs/label   "side-chain of"})

(def sideLeft
  "The side-left channel of a 6.1 or 7.1 surround sound group."
  {:rdf/about    :pg/sideLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side-left channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label   "side left"})

(def sideRight
  "The side-right channel of a 6.1 or 7.1 surround sound group."
  {:rdf/about    :pg/sideRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side-right channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label   "side right"})

(def source
  "Indicates that this port or group should be considered the \"result\" of some other port or group.  This property only makes sense on groups with outputs when the source is a group with inputs.  This can be used to convey a relationship between corresponding input and output groups with different types, for example in a mono to stereo plugin."
  {:rdf/about    :pg/source,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Port or group that this group is the output of.",
   :rdfs/domain  :pg/OutputGroup,
   :rdfs/label   "source",
   :rdfs/range   :pg/InputGroup})

(def subGroupOf
  "Indicates that this group is a child of another group.  This property has no meaning with respect to plugin execution, but the host may find this information useful to provide a better user interface.  Note that being a sub-group does not relax the restriction that the group MUST have a unique symbol with respect to the plugin."
  {:rdf/about    :pg/subGroupOf,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Group is a child of another group.",
   :rdfs/domain  :pg/Group,
   :rdfs/label   "sub-group of",
   :rdfs/range   :pg/Group})