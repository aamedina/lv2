(ns net.wikipunk.rdf.lv2.pg
  "Multi-channel groups of LV2 ports."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "pg",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/port-groups.lv2/port-groups.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/port-groups"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/port-groups#",
   :rdf/ns-prefix-map {"pg" "http://lv2plug.in/ns/ext/port-groups#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def ACN0
  "Ambisonic channel 0 (W): degree 0, index 0."
  {:rdfs/comment "Ambisonic channel 0 (W): degree 0, index 0.",
   :rdfs/label "ACN0",
   :pg/harmonicIndex 0,
   :pg/harmonicDegree 0,
   :pg/letterCode "W",
   :rdf/type :lv2/Channel})

(def ACN1
  "Ambisonic channel 1 (Y): degree 1, index -1."
  {:rdfs/comment "Ambisonic channel 1 (Y): degree 1, index -1.",
   :rdfs/label "ACN1",
   :pg/harmonicIndex -1,
   :pg/harmonicDegree 1,
   :pg/letterCode "Y",
   :rdf/type :lv2/Channel})

(def ACN10
  "Ambisonic channel 10 (O): degree 3, index -2."
  {:rdfs/comment "Ambisonic channel 10 (O): degree 3, index -2.",
   :rdfs/label "ACN10",
   :pg/harmonicIndex -2,
   :pg/harmonicDegree 3,
   :pg/letterCode "O",
   :rdf/type :lv2/Channel})

(def ACN11
  "Ambisonic channel 11 (M): degree 3, index -1."
  {:rdfs/comment "Ambisonic channel 11 (M): degree 3, index -1.",
   :rdfs/label "ACN11",
   :pg/harmonicIndex -1,
   :pg/harmonicDegree 3,
   :pg/letterCode "M",
   :rdf/type :lv2/Channel})

(def ACN12
  "Ambisonic channel 12 (K): degree 3, index 0."
  {:rdfs/comment "Ambisonic channel 12 (K): degree 3, index 0.",
   :rdfs/label "ACN12",
   :pg/harmonicIndex 0,
   :pg/harmonicDegree 3,
   :pg/letterCode "K",
   :rdf/type :lv2/Channel})

(def ACN13
  "Ambisonic channel 13 (L): degree 3, index 1."
  {:rdfs/comment "Ambisonic channel 13 (L): degree 3, index 1.",
   :rdfs/label "ACN13",
   :pg/harmonicIndex 1,
   :pg/harmonicDegree 3,
   :pg/letterCode "L",
   :rdf/type :lv2/Channel})

(def ACN14
  "Ambisonic channel 14 (N): degree 3, index 2."
  {:rdfs/comment "Ambisonic channel 14 (N): degree 3, index 2.",
   :rdfs/label "ACN14",
   :pg/harmonicIndex 2,
   :pg/harmonicDegree 3,
   :pg/letterCode "N",
   :rdf/type :lv2/Channel})

(def ACN15
  "Ambisonic channel 15 (P): degree 3, index 3."
  {:rdfs/comment "Ambisonic channel 15 (P): degree 3, index 3.",
   :rdfs/label "ACN15",
   :pg/harmonicIndex 3,
   :pg/harmonicDegree 3,
   :pg/letterCode "P",
   :rdf/type :lv2/Channel})

(def ACN2
  "Ambisonic channel 2 (Z): degree 1, index 0."
  {:rdfs/comment "Ambisonic channel 2 (Z): degree 1, index 0.",
   :rdfs/label "ACN2",
   :pg/harmonicIndex 0,
   :pg/harmonicDegree 1,
   :pg/letterCode "Z",
   :rdf/type :lv2/Channel})

(def ACN3
  "Ambisonic channel 3 (X): degree 1, index 1."
  {:rdfs/comment "Ambisonic channel 3 (X): degree 1, index 1.",
   :rdfs/label "ACN3",
   :pg/harmonicIndex 1,
   :pg/harmonicDegree 1,
   :pg/letterCode "X",
   :rdf/type :lv2/Channel})

(def ACN4
  "Ambisonic channel 4 (V): degree 2, index -2."
  {:rdfs/comment "Ambisonic channel 4 (V): degree 2, index -2.",
   :rdfs/label "ACN4",
   :pg/harmonicIndex -2,
   :pg/harmonicDegree 2,
   :pg/letterCode "V",
   :rdf/type :lv2/Channel})

(def ACN5
  "Ambisonic channel 5 (T): degree 2, index -1."
  {:rdfs/comment "Ambisonic channel 5 (T): degree 2, index -1.",
   :rdfs/label "ACN5",
   :pg/harmonicIndex -1,
   :pg/harmonicDegree 2,
   :pg/letterCode "T",
   :rdf/type :lv2/Channel})

(def ACN6
  "Ambisonic channel 6 (R): degree 2, index 0."
  {:rdfs/comment "Ambisonic channel 6 (R): degree 2, index 0.",
   :rdfs/label "ACN6",
   :pg/harmonicIndex 0,
   :pg/harmonicDegree 2,
   :pg/letterCode "R",
   :rdf/type :lv2/Channel})

(def ACN7
  "Ambisonic channel 7 (S): degree 2, index 1."
  {:rdfs/comment "Ambisonic channel 7 (S): degree 2, index 1.",
   :rdfs/label "ACN7",
   :pg/harmonicIndex 1,
   :pg/harmonicDegree 2,
   :pg/letterCode "S",
   :rdf/type :lv2/Channel})

(def ACN8
  "Ambisonic channel 8 (U): degree 2, index 2."
  {:rdfs/comment "Ambisonic channel 8 (U): degree 2, index 2.",
   :rdfs/label "ACN8",
   :pg/harmonicIndex 2,
   :pg/harmonicDegree 2,
   :pg/letterCode "U",
   :rdf/type :lv2/Channel})

(def ACN9
  "Ambisonic channel 9 (Q): degree 3, index -3."
  {:rdfs/comment "Ambisonic channel 9 (Q): degree 3, index -3.",
   :rdfs/label "ACN9",
   :pg/harmonicIndex -3,
   :pg/harmonicDegree 3,
   :pg/letterCode "Q",
   :rdf/type :lv2/Channel})

(def AmbisonicBH1P0Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 0."
  {:pg/element [#:lv2{:designation :pg/ACN3, :index 2}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN0, :index 0}],
   :rdfs/comment
     "Ambisonic B stream of horizontal order 1 and peripheral order 0.",
   :rdfs/label "Ambisonic BH1P0",
   :rdfs/subClassOf :pg/AmbisonicGroup,
   :rdf/type :rdfs/Class})

(def AmbisonicBH1P1Group
  "Ambisonic B stream of horizontal order 1 and peripheral order 1."
  {:pg/element [#:lv2{:designation :pg/ACN3, :index 3}
                #:lv2{:designation :pg/ACN2, :index 2}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN0, :index 0}],
   :rdfs/comment
     "Ambisonic B stream of horizontal order 1 and peripheral order 1.",
   :rdfs/label "Ambisonic BH1P1",
   :rdfs/subClassOf :pg/AmbisonicGroup,
   :rdf/type :rdfs/Class})

(def AmbisonicBH2P0Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 0."
  {:pg/element [#:lv2{:designation :pg/ACN8, :index 4}
                #:lv2{:designation :pg/ACN4, :index 3}
                #:lv2{:designation :pg/ACN3, :index 2}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN0, :index 0}],
   :rdfs/comment
     "Ambisonic B stream of horizontal order 2 and peripheral order 0.",
   :rdfs/label "Ambisonic BH2P0",
   :rdfs/subClassOf :pg/AmbisonicGroup,
   :rdf/type :rdfs/Class})

(def AmbisonicBH2P1Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 1."
  {:pg/element [#:lv2{:designation :pg/ACN8, :index 5}
                #:lv2{:designation :pg/ACN3, :index 3}
                #:lv2{:designation :pg/ACN4, :index 4}
                #:lv2{:designation :pg/ACN0, :index 0}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN2, :index 2}],
   :rdfs/comment
     "Ambisonic B stream of horizontal order 2 and peripheral order 1.",
   :rdf/type :rdfs/Class,
   :rdfs/subClassOf :pg/AmbisonicGroup,
   :rdfs/label "Ambisonic BH2P1"})

(def AmbisonicBH2P2Group
  "Ambisonic B stream of horizontal order 2 and peripheral order 2."
  {:pg/element [#:lv2{:designation :pg/ACN4, :index 4}
                #:lv2{:designation :pg/ACN3, :index 3}
                #:lv2{:designation :pg/ACN0, :index 0}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN7, :index 7}
                #:lv2{:designation :pg/ACN2, :index 2}
                #:lv2{:designation :pg/ACN6, :index 6}
                #:lv2{:designation :pg/ACN8, :index 8}
                #:lv2{:designation :pg/ACN5, :index 5}],
   :rdfs/label "Ambisonic BH2P2",
   :rdfs/subClassOf :pg/AmbisonicGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
     "Ambisonic B stream of horizontal order 2 and peripheral order 2."})

(def AmbisonicBH3P0Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 0."
  {:rdfs/comment
     "Ambisonic B stream of horizontal order 3 and peripheral order 0.",
   :pg/element [#:lv2{:designation :pg/ACN4, :index 3}
                #:lv2{:designation :pg/ACN15, :index 6}
                #:lv2{:designation :pg/ACN9, :index 5}
                #:lv2{:designation :pg/ACN0, :index 0}
                #:lv2{:designation :pg/ACN8, :index 4}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN3, :index 2}],
   :rdf/type :rdfs/Class,
   :rdfs/label "Ambisonic BH3P0",
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicBH3P1Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 1."
  {:pg/element [#:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN15, :index 7}
                #:lv2{:designation :pg/ACN8, :index 5}
                #:lv2{:designation :pg/ACN0, :index 0}
                #:lv2{:designation :pg/ACN9, :index 6}
                #:lv2{:designation :pg/ACN4, :index 4}
                #:lv2{:designation :pg/ACN2, :index 2}
                #:lv2{:designation :pg/ACN3, :index 3}],
   :rdfs/label "Ambisonic BH3P1",
   :rdfs/comment
     "Ambisonic B stream of horizontal order 3 and peripheral order 1.",
   :rdfs/subClassOf :pg/AmbisonicGroup,
   :rdf/type :rdfs/Class})

(def AmbisonicBH3P2Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 2."
  {:pg/element [#:lv2{:designation :pg/ACN15, :index 10}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN9, :index 9}
                #:lv2{:designation :pg/ACN3, :index 3}
                #:lv2{:designation :pg/ACN8, :index 8}
                #:lv2{:designation :pg/ACN4, :index 4}
                #:lv2{:designation :pg/ACN2, :index 2}
                #:lv2{:designation :pg/ACN5, :index 5}
                #:lv2{:designation :pg/ACN6, :index 6}
                #:lv2{:designation :pg/ACN7, :index 7}
                #:lv2{:designation :pg/ACN0, :index 0}],
   :rdfs/comment
     "Ambisonic B stream of horizontal order 3 and peripheral order 2.",
   :rdfs/subClassOf :pg/AmbisonicGroup,
   :rdfs/label "Ambisonic BH3P2",
   :rdf/type :rdfs/Class})

(def AmbisonicBH3P3Group
  "Ambisonic B stream of horizontal order 3 and peripheral order 3."
  {:rdfs/label "Ambisonic BH3P3",
   :pg/element [#:lv2{:designation :pg/ACN2, :index 2}
                #:lv2{:designation :pg/ACN5, :index 5}
                #:lv2{:designation :pg/ACN14, :index 14}
                #:lv2{:designation :pg/ACN9, :index 9}
                #:lv2{:designation :pg/ACN15, :index 15}
                #:lv2{:designation :pg/ACN13, :index 13}
                #:lv2{:designation :pg/ACN6, :index 6}
                #:lv2{:designation :pg/ACN11, :index 11}
                #:lv2{:designation :pg/ACN0, :index 0}
                #:lv2{:designation :pg/ACN8, :index 8}
                #:lv2{:designation :pg/ACN10, :index 10}
                #:lv2{:designation :pg/ACN7, :index 7}
                #:lv2{:designation :pg/ACN12, :index 12}
                #:lv2{:designation :pg/ACN4, :index 4}
                #:lv2{:designation :pg/ACN1, :index 1}
                #:lv2{:designation :pg/ACN3, :index 3}],
   :rdfs/comment
     "Ambisonic B stream of horizontal order 3 and peripheral order 3.",
   :rdf/type :rdfs/Class,
   :rdfs/subClassOf :pg/AmbisonicGroup})

(def AmbisonicGroup
  "A group of Ambisonic channels."
  {:rdfs/comment "A group of Ambisonic channels.",
   :rdfs/label "Ambisonic Group",
   :rdfs/subClassOf :pg/Group,
   :rdf/type :rdfs/Class})

(def DiscreteGroup
  "A group of discrete channels."
  {:rdfs/comment "A group of discrete channels.",
   :rdfs/label "Discrete Group",
   :rdfs/subClassOf :pg/Group,
   :rdf/type :rdfs/Class})

(def Element
  "An element of a group, with a designation and optional index."
  {:rdfs/comment
     ["An element of a group, with a designation and optional index."
      "An ordered element of a group."],
   :rdfs/subClassOf {:rdfs/comment
                       "An element MUST have exactly one lv2:designation.",
                     :owl/cardinality 1,
                     :owl/onProperty :lv2/designation,
                     :rdf/type :owl/Restriction},
   :rdfs/label "Element",
   :rdf/type :rdfs/Class})

(def FivePointOneGroup
  "A 5.1 (3-2 stereo with sub) discrete surround sound group."
  {:pg/element [#:lv2{:designation :pg/lowFrequencyEffects, :index 5}
                #:lv2{:designation :pg/left, :index 0}
                #:lv2{:designation :pg/right, :index 2}
                #:lv2{:designation :pg/center, :index 1}
                #:lv2{:designation :pg/rearRight, :index 4}
                #:lv2{:designation :pg/rearLeft, :index 3}],
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdfs/comment "A 5.1 (3-2 stereo with sub) discrete surround sound group.",
   :rdf/type :rdfs/Class,
   :rdfs/label "5.1 Surround"})

(def FivePointZeroGroup
  "A 5.0 (3-2 stereo) discrete surround sound group."
  {:pg/element [#:lv2{:designation :pg/rearRight, :index 4}
                #:lv2{:designation :pg/rearLeft, :index 3}
                #:lv2{:designation :pg/right, :index 2}
                #:lv2{:designation :pg/center, :index 1}
                #:lv2{:designation :pg/left, :index 0}],
   :rdfs/comment "A 5.0 (3-2 stereo) discrete surround sound group.",
   :rdfs/label "5.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdf/type :rdfs/Class})

(def FourPointZeroGroup
  "A 4.0 (Quadraphonic) discrete surround sound group."
  {:pg/element [#:lv2{:designation :pg/rearCenter, :index 3}
                #:lv2{:designation :pg/right, :index 2}
                #:lv2{:designation :pg/center, :index 1}
                #:lv2{:designation :pg/left, :index 0}],
   :rdfs/comment "A 4.0 (Quadraphonic) discrete surround sound group.",
   :rdfs/label "4.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdf/type :rdfs/Class})

(def Group
  "A set of ports that are logically grouped together."
  {:rdfs/comment "A set of ports that are logically grouped together.",
   :rdfs/subClassOf {:rdfs/comment
                       "A Group MUST have exactly one string lv2:symbol.",
                     :owl/cardinality 1,
                     :owl/onProperty :lv2/symbol,
                     :rdf/type :owl/Restriction},
   :rdfs/label "Port Group",
   :rdf/type :rdfs/Class})

(def InputGroup
  "A group which contains exclusively inputs."
  {:rdfs/comment "A group which contains exclusively inputs.",
   :rdfs/label "Input Group",
   :rdfs/subClassOf :pg/Group,
   :rdf/type :rdfs/Class})

(def MidSideGroup
  "A 2-channel mid-side stereo audio group."
  {:pg/element [#:lv2{:designation :pg/side, :index 1}
                #:lv2{:designation :pg/center, :index 0}],
   :rdfs/comment "A 2-channel mid-side stereo audio group.",
   :rdfs/label "Mid-Side Stereo",
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdf/type :rdfs/Class})

(def MonoGroup
  "A single channel audio group."
  {:pg/element #:lv2{:designation :pg/center, :index 0},
   :rdfs/comment "A single channel audio group.",
   :rdfs/label "Mono",
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdf/type :rdfs/Class})

(def OutputGroup
  "A group which contains exclusively outputs."
  {:rdfs/comment "A group which contains exclusively outputs.",
   :rdfs/label "Output Group",
   :rdfs/subClassOf :pg/Group,
   :rdf/type :rdfs/Class})

(def SevenPointOneGroup
  "A 7.1 discrete surround sound group."
  {:pg/element [#:lv2{:designation :pg/lowFrequencyEffects, :index 7}
                #:lv2{:designation :pg/sideLeft, :index 3}
                #:lv2{:designation :pg/right, :index 2}
                #:lv2{:designation :pg/center, :index 1}
                #:lv2{:designation :pg/rearRight, :index 6}
                #:lv2{:designation :pg/rearLeft, :index 5}
                #:lv2{:designation :pg/left, :index 0}
                #:lv2{:designation :pg/sideRight, :index 4}],
   :rdfs/label "7.1 Surround",
   :rdfs/comment "A 7.1 discrete surround sound group.",
   :rdf/type :rdfs/Class,
   :rdfs/subClassOf :pg/DiscreteGroup})

(def SevenPointOneWideGroup
  "A 7.1 wide discrete surround sound group."
  {:pg/element [#:lv2{:designation :pg/centerLeft, :index 1}
                #:lv2{:designation :pg/center, :index 2}
                #:lv2{:designation :pg/rearLeft, :index 5}
                #:lv2{:designation :pg/centerRight, :index 3}
                #:lv2{:designation :pg/lowFrequencyEffects, :index 7}
                #:lv2{:designation :pg/left, :index 0}
                #:lv2{:designation :pg/rearRight, :index 6}
                #:lv2{:designation :pg/right, :index 4}],
   :rdfs/label "7.1 Surround (Wide)",
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 7.1 wide discrete surround sound group."})

(def SixPointOneGroup
  "A 6.1 discrete surround sound group."
  {:rdfs/subClassOf :pg/DiscreteGroup,
   :rdfs/label "6.1 Surround",
   :pg/element [#:lv2{:designation :pg/right, :index 2}
                #:lv2{:designation :pg/sideLeft, :index 3}
                #:lv2{:designation :pg/rearCenter, :index 5}
                #:lv2{:designation :pg/left, :index 0}
                #:lv2{:designation :pg/lowFrequencyEffects, :index 6}
                #:lv2{:designation :pg/center, :index 1}
                #:lv2{:designation :pg/sideRight, :index 4}],
   :rdf/type :rdfs/Class,
   :rdfs/comment "A 6.1 discrete surround sound group."})

(def StereoGroup
  "A 2-channel discrete stereo audio group."
  {:pg/element [#:lv2{:designation :pg/right, :index 1}
                #:lv2{:designation :pg/left, :index 0}],
   :rdfs/comment "A 2-channel discrete stereo audio group.",
   :rdfs/label "Stereo",
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdf/type :rdfs/Class})

(def ThreePointZeroGroup
  "A 3.0 discrete surround sound group."
  {:pg/element [#:lv2{:designation :pg/rearCenter, :index 2}
                #:lv2{:designation :pg/right, :index 1}
                #:lv2{:designation :pg/left, :index 0}],
   :rdfs/comment "A 3.0 discrete surround sound group.",
   :rdfs/label "3.0 Surround",
   :rdfs/subClassOf :pg/DiscreteGroup,
   :rdf/type :rdfs/Class})

(def center
  "The center channel of a discrete audio group."
  {:rdfs/comment "The center channel of a discrete audio group.",
   :rdfs/label "center",
   :rdf/type :lv2/Channel})

(def centerLeft
  "The center-left channel of a 7.1 wide surround sound group."
  {:rdfs/comment "The center-left channel of a 7.1 wide surround sound group.",
   :rdfs/label "center left",
   :rdf/type :lv2/Channel})

(def centerRight
  "The center-right channel of a 7.1 wide surround sound group."
  {:rdfs/comment "The center-right channel of a 7.1 wide surround sound group.",
   :rdfs/label "center right",
   :rdf/type :lv2/Channel})

(def element
  "An element within a port group."
  {:rdfs/comment "An element within a port group.",
   :rdfs/label "element",
   :rdfs/range :pg/Element,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def group
  "Group that this port is a part of."
  {:rdfs/comment "Group that this port is a part of.",
   :rdfs/label "group",
   :rdfs/range :pg/Group,
   :rdfs/domain :lv2/Port,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def harmonicDegree
  "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel."
  {:rdfs/comment
     "The degree coefficient (l) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/label "harmonic degree",
   :rdfs/range :xsd/integer,
   :rdfs/domain :lv2/Channel,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def harmonicIndex
  "The index coefficient (m) of the spherical harmonic for an Ambisonic channel."
  {:rdfs/comment
     "The index coefficient (m) of the spherical harmonic for an Ambisonic channel.",
   :rdfs/label "harmonic index",
   :rdfs/range :xsd/integer,
   :rdfs/domain :lv2/Channel,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def left
  "The left channel of a stereo audio group."
  {:rdfs/comment "The left channel of a stereo audio group.",
   :rdfs/label "left",
   :rdf/type :lv2/Channel})

(def letterCode
  "The YuMa letter code for an Ambisonic channel."
  {:rdfs/comment "The YuMa letter code for an Ambisonic channel.",
   :rdfs/label "ambisonic letter code",
   :rdfs/range :rdf/PlainLiteral,
   :rdfs/domain :lv2/Channel,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def lowFrequencyEffects
  "The LFE channel of a *.1 surround sound group."
  {:rdfs/comment "The LFE channel of a *.1 surround sound group.",
   :rdfs/label "low-frequency effects",
   :rdf/type :lv2/Channel})

(def mainInput
  "Input group that is the primary input of the plugin."
  {:rdfs/comment "Input group that is the primary input of the plugin.",
   :rdfs/label "main input",
   :rdfs/range :pg/InputGroup,
   :rdfs/domain :lv2/Plugin,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def mainOutput
  "Output group that is the primary output of the plugin."
  {:rdfs/comment "Output group that is the primary output of the plugin.",
   :rdfs/label "main output",
   :rdfs/range :pg/OutputGroup,
   :rdfs/domain :lv2/Plugin,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def rearCenter
  "The rear-center channel of a surround sound group."
  {:rdfs/comment "The rear-center channel of a surround sound group.",
   :rdfs/label "rear center",
   :rdf/type :lv2/Channel})

(def rearLeft
  "The rear-left channel of a surround sound group."
  {:rdfs/comment "The rear-left channel of a surround sound group.",
   :rdfs/label "rear left",
   :rdf/type :lv2/Channel})

(def rearRight
  "The rear-right channel of a surround sound group."
  {:rdfs/comment "The rear-right channel of a surround sound group.",
   :rdfs/label "rear right",
   :rdf/type :lv2/Channel})

(def right
  "The right channel of a stereo audio group."
  {:rdfs/comment "The right channel of a stereo audio group.",
   :rdfs/label "right",
   :rdf/type :lv2/Channel})

(def side
  "The side channel of a mid-side audio group."
  {:rdfs/comment "The side channel of a mid-side audio group.",
   :rdfs/label "side",
   :rdf/type :lv2/Channel})

(def sideChainOf
  "Port or group is a side chain of another."
  {:rdfs/comment "Port or group is a side chain of another.",
   :rdfs/label "side-chain of",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def sideLeft
  "The side-left channel of a 6.1 or 7.1 surround sound group."
  {:rdfs/comment "The side-left channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label "side left",
   :rdf/type :lv2/Channel})

(def sideRight
  "The side-right channel of a 6.1 or 7.1 surround sound group."
  {:rdfs/comment "The side-right channel of a 6.1 or 7.1 surround sound group.",
   :rdfs/label "side right",
   :rdf/type :lv2/Channel})

(def source
  "Port or group that this group is the output of."
  {:rdfs/comment "Port or group that this group is the output of.",
   :rdfs/label "source",
   :rdfs/range :pg/InputGroup,
   :rdfs/domain :pg/OutputGroup,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def subGroupOf
  "Group is a child of another group."
  {:rdfs/comment "Group is a child of another group.",
   :rdfs/label "sub-group of",
   :rdfs/range :pg/Group,
   :rdfs/domain :pg/Group,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})