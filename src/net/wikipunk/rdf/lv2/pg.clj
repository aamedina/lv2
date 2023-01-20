(ns net.wikipunk.rdf.lv2.pg
  "Multi-channel groups of LV2 ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "pg"   "http://lv2plug.in/ns/ext/port-groups#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/port-groups",
   :rdfa/prefix "pg",
   :rdfa/uri "http://lv2plug.in/ns/ext/port-groups#",
   :rdfs/comment "Multi-channel groups of LV2 ports.",
   :rdfs/label "LV2 Port Groups",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.meta.ttl"]})

(def ACN0
  "Ambisonic channel 0 (W): degree 0, index 0."
  {:db/ident          :pg/ACN0,
   :pg/harmonicDegree 0,
   :pg/harmonicIndex  0,
   :pg/letterCode     "W",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 0 (W): degree 0, index 0.",
   :rdfs/label        "ACN0"})

(def ACN1
  "Ambisonic channel 1 (Y): degree 1, index -1."
  {:db/ident          :pg/ACN1,
   :pg/harmonicDegree 1,
   :pg/harmonicIndex  -1,
   :pg/letterCode     "Y",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 1 (Y): degree 1, index -1.",
   :rdfs/label        "ACN1"})

(def ACN10
  "Ambisonic channel 10 (O): degree 3, index -2."
  {:db/ident          :pg/ACN10,
   :pg/harmonicDegree 3,
   :pg/harmonicIndex  -2,
   :pg/letterCode     "O",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 10 (O): degree 3, index -2.",
   :rdfs/label        "ACN10"})

(def ACN11
  "Ambisonic channel 11 (M): degree 3, index -1."
  {:db/ident          :pg/ACN11,
   :pg/harmonicDegree 3,
   :pg/harmonicIndex  -1,
   :pg/letterCode     "M",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 11 (M): degree 3, index -1.",
   :rdfs/label        "ACN11"})

(def ACN12
  "Ambisonic channel 12 (K): degree 3, index 0."
  {:db/ident          :pg/ACN12,
   :pg/harmonicDegree 3,
   :pg/harmonicIndex  0,
   :pg/letterCode     "K",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 12 (K): degree 3, index 0.",
   :rdfs/label        "ACN12"})

(def ACN13
  "Ambisonic channel 13 (L): degree 3, index 1."
  {:db/ident          :pg/ACN13,
   :pg/harmonicDegree 3,
   :pg/harmonicIndex  1,
   :pg/letterCode     "L",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 13 (L): degree 3, index 1.",
   :rdfs/label        "ACN13"})

(def ACN14
  "Ambisonic channel 14 (N): degree 3, index 2."
  {:db/ident          :pg/ACN14,
   :pg/harmonicDegree 3,
   :pg/harmonicIndex  2,
   :pg/letterCode     "N",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 14 (N): degree 3, index 2.",
   :rdfs/label        "ACN14"})

(def ACN15
  "Ambisonic channel 15 (P): degree 3, index 3."
  {:db/ident          :pg/ACN15,
   :pg/harmonicDegree 3,
   :pg/harmonicIndex  3,
   :pg/letterCode     "P",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 15 (P): degree 3, index 3.",
   :rdfs/label        "ACN15"})

(def ACN2
  "Ambisonic channel 2 (Z): degree 1, index 0."
  {:db/ident          :pg/ACN2,
   :pg/harmonicDegree 1,
   :pg/harmonicIndex  0,
   :pg/letterCode     "Z",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 2 (Z): degree 1, index 0.",
   :rdfs/label        "ACN2"})

(def ACN3
  "Ambisonic channel 3 (X): degree 1, index 1."
  {:db/ident          :pg/ACN3,
   :pg/harmonicDegree 1,
   :pg/harmonicIndex  1,
   :pg/letterCode     "X",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 3 (X): degree 1, index 1.",
   :rdfs/label        "ACN3"})

(def ACN4
  "Ambisonic channel 4 (V): degree 2, index -2."
  {:db/ident          :pg/ACN4,
   :pg/harmonicDegree 2,
   :pg/harmonicIndex  -2,
   :pg/letterCode     "V",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 4 (V): degree 2, index -2.",
   :rdfs/label        "ACN4"})

(def ACN5
  "Ambisonic channel 5 (T): degree 2, index -1."
  {:db/ident          :pg/ACN5,
   :pg/harmonicDegree 2,
   :pg/harmonicIndex  -1,
   :pg/letterCode     "T",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 5 (T): degree 2, index -1.",
   :rdfs/label        "ACN5"})

(def ACN6
  "Ambisonic channel 6 (R): degree 2, index 0."
  {:db/ident          :pg/ACN6,
   :pg/harmonicDegree 2,
   :pg/harmonicIndex  0,
   :pg/letterCode     "R",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 6 (R): degree 2, index 0.",
   :rdfs/label        "ACN6"})

(def ACN7
  "Ambisonic channel 7 (S): degree 2, index 1."
  {:db/ident          :pg/ACN7,
   :pg/harmonicDegree 2,
   :pg/harmonicIndex  1,
   :pg/letterCode     "S",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 7 (S): degree 2, index 1.",
   :rdfs/label        "ACN7"})

(def ACN8
  "Ambisonic channel 8 (U): degree 2, index 2."
  {:db/ident          :pg/ACN8,
   :pg/harmonicDegree 2,
   :pg/harmonicIndex  2,
   :pg/letterCode     "U",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 8 (U): degree 2, index 2.",
   :rdfs/label        "ACN8"})

(def ACN9
  "Ambisonic channel 9 (Q): degree 3, index -3."
  {:db/ident          :pg/ACN9,
   :pg/harmonicDegree 3,
   :pg/harmonicIndex  -3,
   :pg/letterCode     "Q",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 9 (Q): degree 3, index -3.",
   :rdfs/label        "ACN9"})

(def AmbisonicBH1P0Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 0."
  {:db/ident :pg/AmbisonicBH1P0Group,
   :pg/element [{:lv2/designation :pg/ACN3,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 1 and peripheral order 0.",
   :rdfs/label "Ambisonic BH1P0",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH1P1Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 1."
  {:db/ident :pg/AmbisonicBH1P1Group,
   :pg/element [{:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 1 and peripheral order 1.",
   :rdfs/label "Ambisonic BH1P1",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH2P0Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 0."
  {:db/ident :pg/AmbisonicBH2P0Group,
   :pg/element [{:lv2/designation :pg/ACN8,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 0.",
   :rdfs/label "Ambisonic BH2P0",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH2P1Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 1."
  {:db/ident :pg/AmbisonicBH2P1Group,
   :pg/element [{:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 1.",
   :rdfs/label "Ambisonic BH2P1",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH2P2Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 2."
  {:db/ident :pg/AmbisonicBH2P2Group,
   :pg/element [{:lv2/designation :pg/ACN7,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN6,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN5,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       8}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 2.",
   :rdfs/label "Ambisonic BH2P2",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P0Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 0."
  {:db/ident :pg/AmbisonicBH3P0Group,
   :pg/element [{:lv2/designation :pg/ACN9,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 0.",
   :rdfs/label "Ambisonic BH3P0",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P1Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 1."
  {:db/ident :pg/AmbisonicBH3P1Group,
   :pg/element [{:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN9,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 1.",
   :rdfs/label "Ambisonic BH3P1",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P2Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 2."
  {:db/ident :pg/AmbisonicBH3P2Group,
   :pg/element [{:lv2/designation :pg/ACN9,
                 :lv2/index       9}
                {:lv2/designation :pg/ACN5,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN7,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       8}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       10}
                {:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}
                {:lv2/designation :pg/ACN6,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 2.",
   :rdfs/label "Ambisonic BH3P2",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P3Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 3."
  {:db/ident :pg/AmbisonicBH3P3Group,
   :pg/element [{:lv2/designation :pg/ACN3,
                 :lv2/index       3}
                {:lv2/designation :pg/ACN12,
                 :lv2/index       12}
                {:lv2/designation :pg/ACN13,
                 :lv2/index       13}
                {:lv2/designation :pg/ACN10,
                 :lv2/index       10}
                {:lv2/designation :pg/ACN1,
                 :lv2/index       1}
                {:lv2/designation :pg/ACN15,
                 :lv2/index       15}
                {:lv2/designation :pg/ACN5,
                 :lv2/index       5}
                {:lv2/designation :pg/ACN14,
                 :lv2/index       14}
                {:lv2/designation :pg/ACN9,
                 :lv2/index       9}
                {:lv2/designation :pg/ACN11,
                 :lv2/index       11}
                {:lv2/designation :pg/ACN8,
                 :lv2/index       8}
                {:lv2/designation :pg/ACN4,
                 :lv2/index       4}
                {:lv2/designation :pg/ACN2,
                 :lv2/index       2}
                {:lv2/designation :pg/ACN7,
                 :lv2/index       7}
                {:lv2/designation :pg/ACN6,
                 :lv2/index       6}
                {:lv2/designation :pg/ACN0,
                 :lv2/index       0}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 3.",
   :rdfs/label "Ambisonic BH3P3",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicGroup
  "A group of Ambisonic channels."
  {:db/ident        :pg/AmbisonicGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group of Ambisonic channels.",
   :rdfs/label      "Ambisonic Group",
   :rdfs/subClassOf :pg/Group})

(def DiscreteGroup
  "A group of discrete channels."
  {:db/ident        :pg/DiscreteGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group of discrete channels.",
   :rdfs/label      "Discrete Group",
   :rdfs/subClassOf :pg/Group})

(def Element
  "An element of a group, with a designation and optional index. An ordered element of a group."
  {:db/ident :pg/Element,
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
  {:db/ident :pg/FivePointOneGroup,
   :pg/element [{:lv2/designation :pg/rearLeft,
                 :lv2/index       3}
                {:lv2/designation :pg/rearRight,
                 :lv2/index       4}
                {:lv2/designation :pg/center,
                 :lv2/index       1}
                {:lv2/designation :pg/left,
                 :lv2/index       0}
                {:lv2/designation :pg/lowFrequencyEffects,
                 :lv2/index       5}
                {:lv2/designation :pg/right,
                 :lv2/index       2}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 5.1 (3-2 stereo with sub) discrete surround sound group.",
   :rdfs/label "5.1 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def FivePointZeroGroup
  "A 5.0 (3-2 stereo) discrete surround sound group."
  {:db/ident        :pg/FivePointZeroGroup,
   :pg/element      [{:lv2/designation :pg/rearRight,
                      :lv2/index       4}
                     {:lv2/designation :pg/rearLeft,
                      :lv2/index       3}
                     {:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 5.0 (3-2 stereo) discrete surround sound group.",
   :rdfs/label      "5.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def FourPointZeroGroup
  "A 4.0 (Quadraphonic) discrete surround sound group."
  {:db/ident        :pg/FourPointZeroGroup,
   :pg/element      [{:lv2/designation :pg/rearCenter,
                      :lv2/index       3}
                     {:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 4.0 (Quadraphonic) discrete surround sound group.",
   :rdfs/label      "4.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def Group
  "A set of ports that are logically grouped together."
  {:db/ident        :pg/Group,
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
  {:db/ident        :pg/InputGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group which contains exclusively inputs.",
   :rdfs/label      "Input Group",
   :rdfs/subClassOf :pg/Group})

(def MidSideGroup
  "A 2-channel mid-side stereo audio group."
  {:db/ident        :pg/MidSideGroup,
   :pg/element      [{:lv2/designation :pg/side,
                      :lv2/index       1}
                     {:lv2/designation :pg/center,
                      :lv2/index       0}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 2-channel mid-side stereo audio group.",
   :rdfs/label      "Mid-Side Stereo",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def MonoGroup
  "A single channel audio group."
  {:db/ident        :pg/MonoGroup,
   :pg/element      {:lv2/designation :pg/center,
                     :lv2/index       0},
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A single channel audio group.",
   :rdfs/label      "Mono",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def OutputGroup
  "A group which contains exclusively outputs."
  {:db/ident        :pg/OutputGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group which contains exclusively outputs.",
   :rdfs/label      "Output Group",
   :rdfs/subClassOf :pg/Group})

(def SevenPointOneGroup
  "A 7.1 discrete surround sound group."
  {:db/ident        :pg/SevenPointOneGroup,
   :pg/element      [{:lv2/designation :pg/sideRight,
                      :lv2/index       4}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/rearLeft,
                      :lv2/index       5}
                     {:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/lowFrequencyEffects,
                      :lv2/index       7}
                     {:lv2/designation :pg/rearRight,
                      :lv2/index       6}
                     {:lv2/designation :pg/sideLeft,
                      :lv2/index       3}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 7.1 discrete surround sound group.",
   :rdfs/label      "7.1 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def SevenPointOneWideGroup
  "A 7.1 wide discrete surround sound group."
  {:db/ident        :pg/SevenPointOneWideGroup,
   :pg/element      [{:lv2/designation :pg/rearLeft,
                      :lv2/index       5}
                     {:lv2/designation :pg/centerLeft,
                      :lv2/index       1}
                     {:lv2/designation :pg/centerRight,
                      :lv2/index       3}
                     {:lv2/designation :pg/center,
                      :lv2/index       2}
                     {:lv2/designation :pg/lowFrequencyEffects,
                      :lv2/index       7}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}
                     {:lv2/designation :pg/right,
                      :lv2/index       4}
                     {:lv2/designation :pg/rearRight,
                      :lv2/index       6}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 7.1 wide discrete surround sound group.",
   :rdfs/label      "7.1 Surround (Wide)",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def SixPointOneGroup
  "A 6.1 discrete surround sound group."
  {:db/ident        :pg/SixPointOneGroup,
   :pg/element      [{:lv2/designation :pg/right,
                      :lv2/index       2}
                     {:lv2/designation :pg/rearCenter,
                      :lv2/index       5}
                     {:lv2/designation :pg/lowFrequencyEffects,
                      :lv2/index       6}
                     {:lv2/designation :pg/sideRight,
                      :lv2/index       4}
                     {:lv2/designation :pg/center,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}
                     {:lv2/designation :pg/sideLeft,
                      :lv2/index       3}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 6.1 discrete surround sound group.",
   :rdfs/label      "6.1 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def StereoGroup
  "A 2-channel discrete stereo audio group."
  {:db/ident        :pg/StereoGroup,
   :pg/element      [{:lv2/designation :pg/right,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 2-channel discrete stereo audio group.",
   :rdfs/label      "Stereo",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def ThreePointZeroGroup
  "A 3.0 discrete surround sound group."
  {:db/ident        :pg/ThreePointZeroGroup,
   :pg/element      [{:lv2/designation :pg/rearCenter,
                      :lv2/index       2}
                     {:lv2/designation :pg/right,
                      :lv2/index       1}
                     {:lv2/designation :pg/left,
                      :lv2/index       0}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 3.0 discrete surround sound group.",
   :rdfs/label      "3.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup})

(def center
  "The center channel of a discrete audio group."
  {:db/ident     :pg/center,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center channel of a discrete audio group.",
   :rdfs/label   "center"})

(def centerLeft
  "The center-left channel of a 7.1 wide surround sound group."
  {:db/ident     :pg/centerLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center-left channel of a 7.1 wide surround sound group.",
   :rdfs/label   "center left"})

(def centerRight
  "The center-right channel of a 7.1 wide surround sound group."
  {:db/ident     :pg/centerRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center-right channel of a 7.1 wide surround sound group.",
   :rdfs/label   "center right"})

(def element
  "An element within a port group."
  {:db/ident     :pg/element,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An element within a port group.",
   :rdfs/label   "element",
   :rdfs/range   :pg/Element})

(def group
  "Group that this port is a part of."
  {:db/ident     :pg/group,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Group that this port is a part of.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "group",
   :rdfs/range   :pg/Group})

(def harmonicDegree
  "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel."
  {:db/ident :pg/harmonicDegree,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/domain :lv2/Channel,
   :rdfs/label "harmonic degree",
   :rdfs/range :xsd/integer})

(def harmonicIndex
  "The index coefficient (m) of the spherical harmonic for an Ambisonic channel."
  {:db/ident :pg/harmonicIndex,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The index coefficient (m) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/domain :lv2/Channel,
   :rdfs/label "harmonic index",
   :rdfs/range :xsd/integer})

(def left
  "The left channel of a stereo audio group."
  {:db/ident     :pg/left,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The left channel of a stereo audio group.",
   :rdfs/label   "left"})

(def letterCode
  "The YuMa letter code for an Ambisonic channel."
  {:db/ident     :pg/letterCode,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The YuMa letter code for an Ambisonic channel.",
   :rdfs/domain  :lv2/Channel,
   :rdfs/label   "ambisonic letter code",
   :rdfs/range   :rdf/PlainLiteral})

(def lowFrequencyEffects
  "The LFE channel of a *.1 surround sound group."
  {:db/ident     :pg/lowFrequencyEffects,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The LFE channel of a *.1 surround sound group.",
   :rdfs/label   "low-frequency effects"})

(def mainInput
  "Input group that is the primary input of the plugin."
  {:db/ident     :pg/mainInput,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Input group that is the primary input of the plugin.",
   :rdfs/domain  :lv2/Plugin,
   :rdfs/label   "main input",
   :rdfs/range   :pg/InputGroup})

(def mainOutput
  "Output group that is the primary output of the plugin."
  {:db/ident     :pg/mainOutput,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Output group that is the primary output of the plugin.",
   :rdfs/domain  :lv2/Plugin,
   :rdfs/label   "main output",
   :rdfs/range   :pg/OutputGroup})

(def rearCenter
  "The rear-center channel of a surround sound group."
  {:db/ident     :pg/rearCenter,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-center channel of a surround sound group.",
   :rdfs/label   "rear center"})

(def rearLeft
  "The rear-left channel of a surround sound group."
  {:db/ident     :pg/rearLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-left channel of a surround sound group.",
   :rdfs/label   "rear left"})

(def rearRight
  "The rear-right channel of a surround sound group."
  {:db/ident     :pg/rearRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-right channel of a surround sound group.",
   :rdfs/label   "rear right"})

(def right
  "The right channel of a stereo audio group."
  {:db/ident     :pg/right,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The right channel of a stereo audio group.",
   :rdfs/label   "right"})

(def side
  "The side channel of a mid-side audio group."
  {:db/ident     :pg/side,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side channel of a mid-side audio group.",
   :rdfs/label   "side"})

(def sideChainOf
  "Port or group is a side chain of another."
  {:db/ident     :pg/sideChainOf,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Port or group is a side chain of another.",
   :rdfs/label   "side-chain of"})

(def sideLeft
  "The side-left channel of a 6.1 or 7.1 surround sound group."
  {:db/ident     :pg/sideLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side-left channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label   "side left"})

(def sideRight
  "The side-right channel of a 6.1 or 7.1 surround sound group."
  {:db/ident     :pg/sideRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side-right channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label   "side right"})

(def source
  "Port or group that this group is the output of."
  {:db/ident     :pg/source,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Port or group that this group is the output of.",
   :rdfs/domain  :pg/OutputGroup,
   :rdfs/label   "source",
   :rdfs/range   :pg/InputGroup})

(def subGroupOf
  "Group is a child of another group."
  {:db/ident     :pg/subGroupOf,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Group is a child of another group.",
   :rdfs/domain  :pg/Group,
   :rdfs/label   "sub-group of",
   :rdfs/range   :pg/Group})