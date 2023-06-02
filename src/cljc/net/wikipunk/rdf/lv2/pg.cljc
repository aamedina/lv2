(ns net.wikipunk.rdf.lv2.pg
  "Multi-channel groups of LV2 ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"    "http://lv2plug.in/ns/lv2core#",
                       "lv2.pg" "http://lv2plug.in/ns/ext/port-groups#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.pg",
   :rdfa/uri "http://lv2plug.in/ns/ext/port-groups",
   :rdfs/comment "Multi-channel groups of LV2 ports.",
   :rdfs/label "LV2 Port Groups",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.meta.ttl"]})

(def ACN0
  "Ambisonic channel 0 (W): degree 0, index 0."
  {:db/ident          :lv2.pg/ACN0,
   :lv2.pg/harmonicDegree 0,
   :lv2.pg/harmonicIndex 0,
   :lv2.pg/letterCode "W",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 0 (W): degree 0, index 0.",
   :rdfs/label        "ACN0"})

(def ACN1
  "Ambisonic channel 1 (Y): degree 1, index -1."
  {:db/ident          :lv2.pg/ACN1,
   :lv2.pg/harmonicDegree 1,
   :lv2.pg/harmonicIndex -1,
   :lv2.pg/letterCode "Y",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 1 (Y): degree 1, index -1.",
   :rdfs/label        "ACN1"})

(def ACN10
  "Ambisonic channel 10 (O): degree 3, index -2."
  {:db/ident          :lv2.pg/ACN10,
   :lv2.pg/harmonicDegree 3,
   :lv2.pg/harmonicIndex -2,
   :lv2.pg/letterCode "O",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 10 (O): degree 3, index -2.",
   :rdfs/label        "ACN10"})

(def ACN11
  "Ambisonic channel 11 (M): degree 3, index -1."
  {:db/ident          :lv2.pg/ACN11,
   :lv2.pg/harmonicDegree 3,
   :lv2.pg/harmonicIndex -1,
   :lv2.pg/letterCode "M",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 11 (M): degree 3, index -1.",
   :rdfs/label        "ACN11"})

(def ACN12
  "Ambisonic channel 12 (K): degree 3, index 0."
  {:db/ident          :lv2.pg/ACN12,
   :lv2.pg/harmonicDegree 3,
   :lv2.pg/harmonicIndex 0,
   :lv2.pg/letterCode "K",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 12 (K): degree 3, index 0.",
   :rdfs/label        "ACN12"})

(def ACN13
  "Ambisonic channel 13 (L): degree 3, index 1."
  {:db/ident          :lv2.pg/ACN13,
   :lv2.pg/harmonicDegree 3,
   :lv2.pg/harmonicIndex 1,
   :lv2.pg/letterCode "L",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 13 (L): degree 3, index 1.",
   :rdfs/label        "ACN13"})

(def ACN14
  "Ambisonic channel 14 (N): degree 3, index 2."
  {:db/ident          :lv2.pg/ACN14,
   :lv2.pg/harmonicDegree 3,
   :lv2.pg/harmonicIndex 2,
   :lv2.pg/letterCode "N",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 14 (N): degree 3, index 2.",
   :rdfs/label        "ACN14"})

(def ACN15
  "Ambisonic channel 15 (P): degree 3, index 3."
  {:db/ident          :lv2.pg/ACN15,
   :lv2.pg/harmonicDegree 3,
   :lv2.pg/harmonicIndex 3,
   :lv2.pg/letterCode "P",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 15 (P): degree 3, index 3.",
   :rdfs/label        "ACN15"})

(def ACN2
  "Ambisonic channel 2 (Z): degree 1, index 0."
  {:db/ident          :lv2.pg/ACN2,
   :lv2.pg/harmonicDegree 1,
   :lv2.pg/harmonicIndex 0,
   :lv2.pg/letterCode "Z",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 2 (Z): degree 1, index 0.",
   :rdfs/label        "ACN2"})

(def ACN3
  "Ambisonic channel 3 (X): degree 1, index 1."
  {:db/ident          :lv2.pg/ACN3,
   :lv2.pg/harmonicDegree 1,
   :lv2.pg/harmonicIndex 1,
   :lv2.pg/letterCode "X",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 3 (X): degree 1, index 1.",
   :rdfs/label        "ACN3"})

(def ACN4
  "Ambisonic channel 4 (V): degree 2, index -2."
  {:db/ident          :lv2.pg/ACN4,
   :lv2.pg/harmonicDegree 2,
   :lv2.pg/harmonicIndex -2,
   :lv2.pg/letterCode "V",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 4 (V): degree 2, index -2.",
   :rdfs/label        "ACN4"})

(def ACN5
  "Ambisonic channel 5 (T): degree 2, index -1."
  {:db/ident          :lv2.pg/ACN5,
   :lv2.pg/harmonicDegree 2,
   :lv2.pg/harmonicIndex -1,
   :lv2.pg/letterCode "T",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 5 (T): degree 2, index -1.",
   :rdfs/label        "ACN5"})

(def ACN6
  "Ambisonic channel 6 (R): degree 2, index 0."
  {:db/ident          :lv2.pg/ACN6,
   :lv2.pg/harmonicDegree 2,
   :lv2.pg/harmonicIndex 0,
   :lv2.pg/letterCode "R",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 6 (R): degree 2, index 0.",
   :rdfs/label        "ACN6"})

(def ACN7
  "Ambisonic channel 7 (S): degree 2, index 1."
  {:db/ident          :lv2.pg/ACN7,
   :lv2.pg/harmonicDegree 2,
   :lv2.pg/harmonicIndex 1,
   :lv2.pg/letterCode "S",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 7 (S): degree 2, index 1.",
   :rdfs/label        "ACN7"})

(def ACN8
  "Ambisonic channel 8 (U): degree 2, index 2."
  {:db/ident          :lv2.pg/ACN8,
   :lv2.pg/harmonicDegree 2,
   :lv2.pg/harmonicIndex 2,
   :lv2.pg/letterCode "U",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 8 (U): degree 2, index 2.",
   :rdfs/label        "ACN8"})

(def ACN9
  "Ambisonic channel 9 (Q): degree 3, index -3."
  {:db/ident          :lv2.pg/ACN9,
   :lv2.pg/harmonicDegree 3,
   :lv2.pg/harmonicIndex -3,
   :lv2.pg/letterCode "Q",
   :rdf/type          :lv2/Channel,
   :rdfs/comment      "Ambisonic channel 9 (Q): degree 3, index -3.",
   :rdfs/label        "ACN9"})

(def AmbisonicBH1P0Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 0."
  {:db/ident :lv2.pg/AmbisonicBH1P0Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN3,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 1 and peripheral order 0.",
   :rdfs/label "Ambisonic BH1P0",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH1P0Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH1P1Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 1."
  {:db/ident :lv2.pg/AmbisonicBH1P1Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN3,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN2,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 1 and peripheral order 1.",
   :rdfs/label "Ambisonic BH1P1",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH1P1Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH2P0Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 0."
  {:db/ident :lv2.pg/AmbisonicBH2P0Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN8,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN4,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN3,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 0.",
   :rdfs/label "Ambisonic BH2P0",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH2P0Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH2P1Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 1."
  {:db/ident :lv2.pg/AmbisonicBH2P1Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN4,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN2,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN8,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN3,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 1.",
   :rdfs/label "Ambisonic BH2P1",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH2P1Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH2P2Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 2."
  {:db/ident :lv2.pg/AmbisonicBH2P2Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN6,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN3,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN4,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN7,
     :lv2/index       7,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN5,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN2,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN8,
     :lv2/index       8,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 2 and peripheral order 2.",
   :rdfs/label "Ambisonic BH2P2",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH2P2Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH3P0Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 0."
  {:db/ident :lv2.pg/AmbisonicBH3P0Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN3,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN8,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN15,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN9,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN4,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 0.",
   :rdfs/label "Ambisonic BH3P0",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH3P0Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH3P1Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 1."
  {:db/ident :lv2.pg/AmbisonicBH3P1Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN8,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN2,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN3,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN9,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN15,
     :lv2/index       7,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN4,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 1.",
   :rdfs/label "Ambisonic BH3P1",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH3P1Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH3P2Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 2."
  {:db/ident :lv2.pg/AmbisonicBH3P2Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN8,
     :lv2/index       8,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN9,
     :lv2/index       9,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN7,
     :lv2/index       7,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN15,
     :lv2/index       10,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN6,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN5,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN3,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN4,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN2,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 2.",
   :rdfs/label "Ambisonic BH3P2",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH3P2Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicBH3P3Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 3."
  {:db/ident :lv2.pg/AmbisonicBH3P3Group,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/ACN13,
     :lv2/index       13,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN14,
     :lv2/index       14,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN8,
     :lv2/index       8,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN9,
     :lv2/index       9,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN6,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN11,
     :lv2/index       11,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN15,
     :lv2/index       15,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN0,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN5,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN1,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN7,
     :lv2/index       7,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN2,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN4,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN12,
     :lv2/index       12,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN10,
     :lv2/index       10,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/ACN3,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Ambisonic B stream of horizontal order 3 and peripheral order 3.",
   :rdfs/label "Ambisonic BH3P3",
   :rdfs/subClassOf [:lv2.pg/AmbisonicGroup
                     :lv2.pg/AmbisonicBH3P3Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group
                     :rdfs/Resource]})

(def AmbisonicGroup
  "A group of Ambisonic channels."
  {:db/ident        :lv2.pg/AmbisonicGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group of Ambisonic channels.",
   :rdfs/label      "Ambisonic Group",
   :rdfs/subClassOf [:lv2.pg/Group
                     :lv2.pg/AmbisonicGroup
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def DiscreteGroup
  "A group of discrete channels."
  {:db/ident        :lv2.pg/DiscreteGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group of discrete channels.",
   :rdfs/label      "Discrete Group",
   :rdfs/subClassOf [:lv2.pg/Group
                     :lv2.pg/DiscreteGroup
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def Element
  "An element of a group, with a designation and optional index. An ordered element of a group."
  {:db/ident :lv2.pg/Element,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   ["An element of a group, with a designation and optional index."
    "An ordered element of a group."],
   :rdfs/label "Element",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/designation,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "An element MUST have exactly one lv2:designation."}
                     :lv2.pg/Element]})

(def FivePointOneGroup
  "A 5.1 (3-2 stereo with sub) discrete surround sound group."
  {:db/ident :lv2.pg/FivePointOneGroup,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/right,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/rearLeft,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/left,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/rearRight,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/lowFrequencyEffects,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/center,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 5.1 (3-2 stereo with sub) discrete surround sound group.",
   :rdfs/label "5.1 Surround",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/FivePointOneGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def FivePointZeroGroup
  "A 5.0 (3-2 stereo) discrete surround sound group."
  {:db/ident :lv2.pg/FivePointZeroGroup,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/rearRight,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/rearLeft,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/right,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/center,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/left,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 5.0 (3-2 stereo) discrete surround sound group.",
   :rdfs/label "5.0 Surround",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/FivePointZeroGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def FourPointZeroGroup
  "A 4.0 (Quadraphonic) discrete surround sound group."
  {:db/ident :lv2.pg/FourPointZeroGroup,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/rearCenter,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/right,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/center,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/left,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 4.0 (Quadraphonic) discrete surround sound group.",
   :rdfs/label "4.0 Surround",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/FourPointZeroGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def Group
  "A set of ports that are logically grouped together."
  {:db/ident        :lv2.pg/Group,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A set of ports that are logically grouped together.",
   :rdfs/label      "Port Group",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :lv2.pg/Group]})

(def InputGroup
  "A group which contains exclusively inputs."
  {:db/ident        :lv2.pg/InputGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group which contains exclusively inputs.",
   :rdfs/label      "Input Group",
   :rdfs/subClassOf [:lv2.pg/Group
                     :lv2.pg/InputGroup
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def MidSideGroup
  "A 2-channel mid-side stereo audio group."
  {:db/ident        :lv2.pg/MidSideGroup,
   :lv2.pg/element  [{:lv2/designation :lv2.pg/side,
                      :lv2/index 1,
                      :rdf/type
                      [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
                     {:lv2/designation :lv2.pg/center,
                      :lv2/index 0,
                      :rdf/type
                      [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 2-channel mid-side stereo audio group.",
   :rdfs/label      "Mid-Side Stereo",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/MidSideGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def MonoGroup
  "A single channel audio group."
  {:db/ident        :lv2.pg/MonoGroup,
   :lv2.pg/element  {:lv2/designation :lv2.pg/center,
                     :lv2/index 0,
                     :rdf/type
                     [:lv2.pg/Element
                      {:owl/cardinality 1,
                       :owl/onProperty :lv2/designation,
                       :rdf/type :owl/Restriction,
                       :rdfs/comment
                       "An element MUST have exactly one lv2:designation."}
                      :rdfs/Resource]},
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A single channel audio group.",
   :rdfs/label      "Mono",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/MonoGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def OutputGroup
  "A group which contains exclusively outputs."
  {:db/ident        :lv2.pg/OutputGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A group which contains exclusively outputs.",
   :rdfs/label      "Output Group",
   :rdfs/subClassOf [:lv2.pg/Group
                     :lv2.pg/OutputGroup
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def SevenPointOneGroup
  "A 7.1 discrete surround sound group."
  {:db/ident :lv2.pg/SevenPointOneGroup,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/lowFrequencyEffects,
     :lv2/index       7,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/sideRight,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/right,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/left,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/rearLeft,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/sideLeft,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/rearRight,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/center,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 7.1 discrete surround sound group.",
   :rdfs/label "7.1 Surround",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/SevenPointOneGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def SevenPointOneWideGroup
  "A 7.1 wide discrete surround sound group."
  {:db/ident :lv2.pg/SevenPointOneWideGroup,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/rearLeft,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/left,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/centerRight,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/rearRight,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/lowFrequencyEffects,
     :lv2/index       7,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/center,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/centerLeft,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/right,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 7.1 wide discrete surround sound group.",
   :rdfs/label "7.1 Surround (Wide)",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/SevenPointOneWideGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def SixPointOneGroup
  "A 6.1 discrete surround sound group."
  {:db/ident :lv2.pg/SixPointOneGroup,
   :lv2.pg/element
   [{:lv2/designation :lv2.pg/sideLeft,
     :lv2/index       3,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/lowFrequencyEffects,
     :lv2/index       6,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/left,
     :lv2/index       0,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/sideRight,
     :lv2/index       4,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/rearCenter,
     :lv2/index       5,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/center,
     :lv2/index       1,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
    {:lv2/designation :lv2.pg/right,
     :lv2/index       2,
     :rdf/type        [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 6.1 discrete surround sound group.",
   :rdfs/label "6.1 Surround",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/SixPointOneGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def StereoGroup
  "A 2-channel discrete stereo audio group."
  {:db/ident        :lv2.pg/StereoGroup,
   :lv2.pg/element  [{:lv2/designation :lv2.pg/right,
                      :lv2/index 1,
                      :rdf/type
                      [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
                     {:lv2/designation :lv2.pg/left,
                      :lv2/index 0,
                      :rdf/type
                      [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 2-channel discrete stereo audio group.",
   :rdfs/label      "Stereo",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/StereoGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def ThreePointZeroGroup
  "A 3.0 discrete surround sound group."
  {:db/ident        :lv2.pg/ThreePointZeroGroup,
   :lv2.pg/element  [{:lv2/designation :lv2.pg/rearCenter,
                      :lv2/index 2,
                      :rdf/type
                      [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
                     {:lv2/designation :lv2.pg/right,
                      :lv2/index 1,
                      :rdf/type
                      [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}
                     {:lv2/designation :lv2.pg/left,
                      :lv2/index 0,
                      :rdf/type
                      [:lv2.pg/Element
                       {:owl/cardinality 1,
                        :owl/onProperty :lv2/designation,
                        :rdf/type :owl/Restriction,
                        :rdfs/comment
                        "An element MUST have exactly one lv2:designation."}
                       :rdfs/Resource]}],
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A 3.0 discrete surround sound group.",
   :rdfs/label      "3.0 Surround",
   :rdfs/subClassOf [:lv2.pg/DiscreteGroup
                     :lv2.pg/ThreePointZeroGroup
                     :lv2.pg/Group
                     {:owl/cardinality 1,
                      :owl/onProperty :lv2/symbol,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Group MUST have exactly one string lv2:symbol."}
                     :rdfs/Resource]})

(def center
  "The center channel of a discrete audio group."
  {:db/ident     :lv2.pg/center,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center channel of a discrete audio group.",
   :rdfs/label   "center"})

(def centerLeft
  "The center-left channel of a 7.1 wide surround sound group."
  {:db/ident     :lv2.pg/centerLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center-left channel of a 7.1 wide surround sound group.",
   :rdfs/label   "center left"})

(def centerRight
  "The center-right channel of a 7.1 wide surround sound group."
  {:db/ident     :lv2.pg/centerRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The center-right channel of a 7.1 wide surround sound group.",
   :rdfs/label   "center right"})

(def element
  "An element within a port group."
  {:db/ident           :lv2.pg/element,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "An element within a port group.",
   :rdfs/label         "element",
   :rdfs/range         :lv2.pg/Element,
   :rdfs/subPropertyOf :lv2.pg/element})

(def group
  "Group that this port is a part of."
  {:db/ident           :lv2.pg/group,
   :rdf/type           [:owl/FunctionalProperty
                        :owl/ObjectProperty
                        :rdf/Property],
   :rdfs/comment       "Group that this port is a part of.",
   :rdfs/domain        :lv2/Port,
   :rdfs/label         "group",
   :rdfs/range         :lv2.pg/Group,
   :rdfs/subPropertyOf :lv2.pg/group})

(def harmonicDegree
  "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel."
  {:db/ident :lv2.pg/harmonicDegree,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/domain :lv2/Channel,
   :rdfs/label "harmonic degree",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :lv2.pg/harmonicDegree})

(def harmonicIndex
  "The index coefficient (m) of the spherical harmonic for an Ambisonic channel."
  {:db/ident :lv2.pg/harmonicIndex,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The index coefficient (m) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/domain :lv2/Channel,
   :rdfs/label "harmonic index",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :lv2.pg/harmonicIndex})

(def left
  "The left channel of a stereo audio group."
  {:db/ident     :lv2.pg/left,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The left channel of a stereo audio group.",
   :rdfs/label   "left"})

(def letterCode
  "The YuMa letter code for an Ambisonic channel."
  {:db/ident           :lv2.pg/letterCode,
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "The YuMa letter code for an Ambisonic channel.",
   :rdfs/domain        :lv2/Channel,
   :rdfs/label         "ambisonic letter code",
   :rdfs/range         :rdf/PlainLiteral,
   :rdfs/subPropertyOf :lv2.pg/letterCode})

(def lowFrequencyEffects
  "The LFE channel of a *.1 surround sound group."
  {:db/ident     :lv2.pg/lowFrequencyEffects,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The LFE channel of a *.1 surround sound group.",
   :rdfs/label   "low-frequency effects"})

(def mainInput
  "Input group that is the primary input of the plugin."
  {:db/ident           :lv2.pg/mainInput,
   :rdf/type           [:owl/FunctionalProperty
                        :owl/ObjectProperty
                        :rdf/Property],
   :rdfs/comment       "Input group that is the primary input of the plugin.",
   :rdfs/domain        :lv2/Plugin,
   :rdfs/label         "main input",
   :rdfs/range         :lv2.pg/InputGroup,
   :rdfs/subPropertyOf :lv2.pg/mainInput})

(def mainOutput
  "Output group that is the primary output of the plugin."
  {:db/ident           :lv2.pg/mainOutput,
   :rdf/type           [:owl/FunctionalProperty
                        :owl/ObjectProperty
                        :rdf/Property],
   :rdfs/comment       "Output group that is the primary output of the plugin.",
   :rdfs/domain        :lv2/Plugin,
   :rdfs/label         "main output",
   :rdfs/range         :lv2.pg/OutputGroup,
   :rdfs/subPropertyOf :lv2.pg/mainOutput})

(def rearCenter
  "The rear-center channel of a surround sound group."
  {:db/ident     :lv2.pg/rearCenter,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-center channel of a surround sound group.",
   :rdfs/label   "rear center"})

(def rearLeft
  "The rear-left channel of a surround sound group."
  {:db/ident     :lv2.pg/rearLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-left channel of a surround sound group.",
   :rdfs/label   "rear left"})

(def rearRight
  "The rear-right channel of a surround sound group."
  {:db/ident     :lv2.pg/rearRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The rear-right channel of a surround sound group.",
   :rdfs/label   "rear right"})

(def right
  "The right channel of a stereo audio group."
  {:db/ident     :lv2.pg/right,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The right channel of a stereo audio group.",
   :rdfs/label   "right"})

(def side
  "The side channel of a mid-side audio group."
  {:db/ident     :lv2.pg/side,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side channel of a mid-side audio group.",
   :rdfs/label   "side"})

(def sideChainOf
  "Port or group is a side chain of another."
  {:db/ident           :lv2.pg/sideChainOf,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "Port or group is a side chain of another.",
   :rdfs/label         "side-chain of",
   :rdfs/subPropertyOf :lv2.pg/sideChainOf})

(def sideLeft
  "The side-left channel of a 6.1 or 7.1 surround sound group."
  {:db/ident     :lv2.pg/sideLeft,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side-left channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label   "side left"})

(def sideRight
  "The side-right channel of a 6.1 or 7.1 surround sound group."
  {:db/ident     :lv2.pg/sideRight,
   :rdf/type     :lv2/Channel,
   :rdfs/comment "The side-right channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label   "side right"})

(def source
  "Port or group that this group is the output of."
  {:db/ident           :lv2.pg/source,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "Port or group that this group is the output of.",
   :rdfs/domain        :lv2.pg/OutputGroup,
   :rdfs/label         "source",
   :rdfs/range         :lv2.pg/InputGroup,
   :rdfs/subPropertyOf :lv2.pg/source})

(def subGroupOf
  "Group is a child of another group."
  {:db/ident           :lv2.pg/subGroupOf,
   :rdf/type           [:owl/FunctionalProperty
                        :owl/ObjectProperty
                        :rdf/Property],
   :rdfs/comment       "Group is a child of another group.",
   :rdfs/domain        :lv2.pg/Group,
   :rdfs/label         "sub-group of",
   :rdfs/range         :lv2.pg/Group,
   :rdfs/subPropertyOf :lv2.pg/subGroupOf})