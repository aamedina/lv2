(ns net.wikipunk.rdf.tl
  "Extends owl-time ontology (http://www.w3.org/2006/time) with support for several timelines, acting as a backbone to adress time interval/instants. Mainly designed with a multimedia use-case in mind. Copyright (c) Yves Raimond, Samer Abdallah, Centre for Digital Music, Queen Mary, University of London"
  {:dcat/downloadURL "https://motools.sf.net/timeline/timeline.n3",
   :foaf/maker "http://moustaki.org/foaf.rdf#moustaki",
   :owl/imports ["http://www.w3.org/2006/time"
                 "http://www.w3.org/2006/time-entry"],
   :rdf/ns-prefix-map {"daml" "http://www.daml.org/2001/03/daml+oil#",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "time" "http://www.w3.org/2006/time#",
                       "tl" "http://purl.org/NET/c4dm/timeline.owl#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:owl/Thing :owl/Ontology],
   :rdfa/prefix "tl",
   :rdfa/uri "http://purl.org/NET/c4dm/timeline.owl",
   :rdfs/comment
   "\n    \tExtends owl-time ontology (http://www.w3.org/2006/time) with  \n\tsupport for several timelines, acting as a backbone to adress \n\ttime interval/instants. \n\n\tMainly designed with a multimedia use-case in mind.\n\n\tCopyright (c) Yves Raimond, Samer Abdallah, Centre for Digital Music, Queen Mary, University of London\n\t",
   :rdfs/label "The Timeline ontology"}
  (:refer-clojure :exclude [delay]))

(def AbstractInstant
  "An instant defined on an abstract timeline"
  {:db/ident            :tl/AbstractInstant,
   :owl/equivalentClass {:owl/onProperty     :tl/timeline,
                         :owl/someValuesFrom :tl/AbstractTimeLine,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/comment        "An instant defined on an abstract timeline",
   :rdfs/label          "abstract instant",
   :rdfs/subClassOf     :tl/Instant,
   :vs/term_status      "stable"})

(def AbstractInterval
  "An interval defined on an abstract time-line."
  {:db/ident :tl/AbstractInterval,
   :owl/equivalentClass {:owl/onProperty     :tl/timeline,
                         :owl/someValuesFrom :tl/AbstractTimeLine,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment "\n\tAn interval defined on an abstract time-line.\n    ",
   :rdfs/label "abstract interval",
   :rdfs/subClassOf :tl/Interval,
   :vs/term_status "stable"})

(def AbstractTimeLine
  "Abstract time lines may be used as a backbone for Score, Works, ... This allows for TimeLine maps to relate works to a given performance (this part was played at this time)."
  {:db/ident :tl/AbstractTimeLine,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n    \tAbstract time lines may be used as a backbone for Score, Works, ... \n\tThis allows for TimeLine maps to relate works to a given \n\tperformance (this part was played at this time).",
   :rdfs/label "abstract timeline",
   :rdfs/subClassOf :tl/TimeLine,
   :vs/term_status "stable"})

(def ContinuousTimeLine
  "A continuous timeline, like the universal one, or the one backing an analog signal"
  {:db/ident :tl/ContinuousTimeLine,
   :owl/disjointWith :tl/DiscreteTimeLine,
   :owl/equivalentClass {:owl/unionOf [:tl/PhysicalTimeLine
                                       :tl/RelativeTimeLine],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "A continuous timeline, like the universal one, or the one backing an analog signal",
   :rdfs/label "continuous timeline",
   :rdfs/subClassOf :tl/TimeLine,
   :vs/term_status "stable"})

(def DiscreteInstant
  "An instant defined on a discrete timeline"
  {:db/ident            :tl/DiscreteInstant,
   :owl/equivalentClass {:owl/intersectionOf [{:owl/onProperty :tl/timeline,
                                               :owl/someValuesFrom
                                               :tl/DiscreteTimeLine,
                                               :rdf/type :owl/Restriction}
                                              :tl/Instant],
                         :rdf/type :owl/Class},
   :rdf/type            :owl/Class,
   :rdfs/comment        "An instant defined on a discrete timeline",
   :rdfs/label          "discrete instant",
   :rdfs/subClassOf     {:owl/cardinality 1,
                         :owl/onProperty  :tl/atInt,
                         :rdf/type        :owl/Restriction},
   :vs/term_status      "stable"})

(def DiscreteInterval
  "An interval defined on a discrete timeline, like the one backing a digital signal"
  {:db/ident :tl/DiscreteInterval,
   :owl/equivalentClass {:owl/intersectionOf [{:owl/onProperty :tl/timeline,
                                               :owl/someValuesFrom
                                               :tl/DiscreteTimeLine,
                                               :rdf/type :owl/Restriction}
                                              :tl/Interval],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "An interval defined on a discrete timeline, like the one backing a digital signal",
   :rdfs/label "discrete interval",
   :rdfs/subClassOf {:owl/unionOf
                     [{:owl/intersectionOf [{:owl/cardinality 1,
                                             :owl/onProperty :time/hasBeginning,
                                             :rdf/type :owl/Restriction}
                                            {:owl/cardinality 1,
                                             :owl/onProperty :time/hasEnd,
                                             :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class}
                      {:owl/intersectionOf [{:owl/cardinality 1,
                                             :owl/onProperty  :tl/beginsAtInt,
                                             :rdf/type        :owl/Restriction}
                                            {:owl/cardinality 1,
                                             :owl/onProperty :tl/endsAtInt,
                                             :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class}
                      {:owl/intersectionOf [{:owl/cardinality 1,
                                             :owl/onProperty  :tl/beginsAtInt,
                                             :rdf/type        :owl/Restriction}
                                            {:owl/cardinality 1,
                                             :owl/onProperty :tl/durationInt,
                                             :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class}],
                     :rdf/type :owl/Class},
   :vs/term_status "stable"})

(def DiscreteTimeLine
  "A discrete time line (like the time line backing a digital signal"
  {:db/ident :tl/DiscreteTimeLine,
   :owl/disjointWith :tl/ContinuousTimeLine,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A discrete time line (like the time line backing a digital signal",
   :rdfs/label "discrete time line",
   :rdfs/subClassOf :tl/TimeLine,
   :vs/term_status "stable"})

(def Instant
  "An instant (same as in OWL-Time)"
  {:db/ident            :tl/Instant,
   :owl/equivalentClass :time/Instant,
   :rdf/type            :owl/Class,
   :rdfs/comment        "An instant (same as in OWL-Time)",
   :rdfs/label          "instant",
   :vs/term_status      "stable"})

(def Interval
  "An interval (same as in OWL-Time). Allen's relationships are defined in OWL-Time."
  {:db/ident :tl/Interval,
   :owl/equivalentClass :time/ProperInterval,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An interval (same as in OWL-Time). Allen's relationships are defined in OWL-Time.",
   :rdfs/label "interval",
   :vs/term_status "stable"})

(def OriginMap
  "A timeline map linking a physical timeline to a relative one (originating at some point on the physical timeline)"
  {:db/ident :tl/OriginMap,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A timeline map linking a physical timeline to a relative one (originating at some point on the physical timeline)",
   :rdfs/label "origin map",
   :rdfs/subClassOf [:tl/TimeLineMap
                     {:owl/onProperty     :tl/domainTimeLine,
                      :owl/someValuesFrom :tl/PhysicalTimeLine,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tl/rangeTimeLine,
                      :owl/someValuesFrom :tl/RelativeTimeLine,
                      :rdf/type           :owl/Restriction}],
   :vs/term_status "stable"})

(def PhysicalTimeLine
  "A \"physical\" time-line (the universal time line (UTC)) is an instance of this class. Other time zones consists in instances of this class as well, with a \"shifting\" time line map relating them to the universal time line map."
  {:db/ident :tl/PhysicalTimeLine,
   :owl/disjointWith :tl/RelativeTimeLine,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A \"physical\" time-line (the universal time line (UTC)) is an instance of this class. Other time zones consists in instances of this class as well, with a \"shifting\" time line map relating them to the universal time line map.",
   :rdfs/label "physical timeline",
   :rdfs/subClassOf [:tl/ContinuousTimeLine :tl/TimeLine],
   :vs/term_status "stable"})

(def RelativeInstant
  "An instant defined on a relative timeline"
  {:db/ident            :tl/RelativeInstant,
   :owl/equivalentClass {:owl/intersectionOf [{:owl/onProperty :tl/timeline,
                                               :owl/someValuesFrom
                                               :tl/RelativeTimeLine,
                                               :rdf/type :owl/Restriction}
                                              :tl/Instant],
                         :rdf/type :owl/Class},
   :rdf/type            :owl/Class,
   :rdfs/comment        "An instant defined on a relative timeline",
   :rdfs/label          "relative instant",
   :rdfs/subClassOf     {:owl/cardinality 1,
                         :owl/onProperty  :tl/atDuration,
                         :rdf/type        :owl/Restriction},
   :vs/term_status      "stable"})

(def RelativeInterval
  "an interval defined on a relative timeline"
  {:db/ident            :tl/RelativeInterval,
   :owl/equivalentClass {:owl/intersectionOf [{:owl/onProperty :tl/timeline,
                                               :owl/someValuesFrom
                                               :tl/RelativeTimeLine,
                                               :rdf/type :owl/Restriction}
                                              :tl/Interval],
                         :rdf/type :owl/Class},
   :rdf/type            :owl/Class,
   :rdfs/comment        "an interval defined on a relative timeline",
   :rdfs/label          "relative interval",
   :rdfs/subClassOf     {:owl/unionOf [{:owl/intersectionOf
                                        [{:owl/cardinality 1,
                                          :owl/onProperty  :time/hasBeginning,
                                          :rdf/type        :owl/Restriction}
                                         {:owl/cardinality 1,
                                          :owl/onProperty  :time/hasEnd,
                                          :rdf/type        :owl/Restriction}],
                                        :rdf/type :owl/Class}
                                       {:owl/intersectionOf
                                        [{:owl/cardinality 1,
                                          :owl/onProperty  :tl/beginsAtDuration,
                                          :rdf/type        :owl/Restriction}
                                         {:owl/cardinality 1,
                                          :owl/onProperty  :tl/durationXSD,
                                          :rdf/type        :owl/Restriction}],
                                        :rdf/type :owl/Class}
                                       {:owl/intersectionOf
                                        [{:owl/cardinality 1,
                                          :owl/onProperty  :tl/beginsAtDuration,
                                          :rdf/type        :owl/Restriction}
                                         {:owl/cardinality 1,
                                          :owl/onProperty  :tl/endsAtDuration,
                                          :rdf/type        :owl/Restriction}],
                                        :rdf/type :owl/Class}],
                         :rdf/type    :owl/Class},
   :vs/term_status      "stable"})

(def RelativeTimeLine
  "Semi infinite time line...canonical coordinate system --> adressed through xsd:duration since the instant 0."
  {:db/ident :tl/RelativeTimeLine,
   :owl/disjointWith :tl/PhysicalTimeLine,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Semi infinite time line...canonical coordinate system --> adressed through xsd:duration since the instant 0.",
   :rdfs/label "relative timeline",
   :rdfs/subClassOf [:tl/ContinuousTimeLine :tl/TimeLine],
   :vs/term_status "stable"})

(def ShiftMap
  "a map just shifting one timeline to another"
  {:db/ident        :tl/ShiftMap,
   :rdf/type        :owl/Class,
   :rdfs/comment    "a map just shifting one timeline to another",
   :rdfs/label      "shift map",
   :rdfs/subClassOf :tl/TimeLineMap,
   :vs/term_status  "stable"})

(def TimeLine
  "Represents a linear and coherent piece of time -- can be either abstract (such as the one behind a score) or concrete (such as the universal time line). Two timelines can be mapped using timeline maps."
  {:db/ident :tl/TimeLine,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Represents a linear and coherent piece of time -- can be either abstract (such as the one behind a score) or concrete (such as the universal time line).\nTwo timelines can be mapped using timeline maps.",
   :rdfs/label "timeline",
   :vs/term_status "stable"})

(def TimeLineMap
  "Allows to map two time lines together"
  {:db/ident       :tl/TimeLineMap,
   :rdf/type       :owl/Class,
   :rdfs/comment   "Allows to map two time lines together",
   :rdfs/label     "timeline map",
   :vs/term_status "stable"})

(def UTInstant
  "This concept expresses that an instant defined on the universal timeline must be associated to a dateTime value"
  {:db/ident :tl/UTInstant,
   :owl/equivalentClass {:owl/intersectionOf [{:owl/hasValue
                                               :tl/universaltimeline,
                                               :owl/onProperty :tl/timeline,
                                               :rdf/type :owl/Restriction}
                                              :tl/Instant],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "This concept expresses that an instant defined on the universal timeline must be associated to a dateTime value",
   :rdfs/label "instant on the universal timeline",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty  :tl/atDateTime,
                     :rdf/type        :owl/Restriction},
   :vs/term_status "stable"})

(def UTInterval
  "an interval defined on the universal time line"
  {:db/ident :tl/UTInterval,
   :owl/equivalentClass {:owl/intersectionOf [{:owl/hasValue
                                               :tl/universaltimeline,
                                               :owl/onProperty :tl/timeline,
                                               :rdf/type :owl/Restriction}
                                              :tl/Interval],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment "an interval defined on the universal time line",
   :rdfs/label "universal timeline interval",
   :rdfs/subClassOf
   {:owl/unionOf [{:owl/cardinality 1,
                   :owl/onProperty  :tl/atYear,
                   :rdf/type        :owl/Restriction}
                  {:owl/cardinality 1,
                   :owl/onProperty  :tl/atYearMonth,
                   :rdf/type        :owl/Restriction}
                  {:owl/cardinality 1,
                   :owl/onProperty  :tl/atDate,
                   :rdf/type        :owl/Restriction}
                  {:owl/intersectionOf [{:owl/cardinality 1,
                                         :owl/onProperty  :tl/beginsAtDateTime,
                                         :rdf/type        :owl/Restriction}
                                        {:owl/cardinality 1,
                                         :owl/onProperty  :tl/durationXSD,
                                         :rdf/type        :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/cardinality 1,
                                         :owl/onProperty  :time/hasBeginning,
                                         :rdf/type        :owl/Restriction}
                                        {:owl/cardinality 1,
                                         :owl/onProperty  :time/hasEnd,
                                         :rdf/type        :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/cardinality 1,
                                         :owl/onProperty  :tl/beginsAtDateTime,
                                         :rdf/type        :owl/Restriction}
                                        {:owl/cardinality 1,
                                         :owl/onProperty  :tl/endsAtDateTime,
                                         :rdf/type        :owl/Restriction}],
                   :rdf/type :owl/Class}],
    :rdf/type    :owl/Class},
   :vs/term_status "stable"})

(def UniformSamplingMap
  "Describe the relation between a continuous time-line and its sampled equivalent"
  {:db/ident :tl/UniformSamplingMap,
   :owl/disjointWith [:tl/UniformWindowingMap :tl/UniformSamplingWindowingMap],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describe the relation between a continuous time-line and its sampled equivalent",
   :rdfs/label "uniform sampling map",
   :rdfs/subClassOf [{:owl/onProperty     :tl/domainTimeLine,
                      :owl/someValuesFrom :tl/RelativeTimeLine,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tl/rangeTimeLine,
                      :owl/someValuesFrom :tl/DiscreteTimeLine,
                      :rdf/type           :owl/Restriction}
                     :tl/TimeLineMap
                     {:owl/cardinality 1,
                      :owl/onProperty  :tl/sampleRate,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status "stable"})

(def UniformSamplingWindowingMap
  "Describes the relation between a continuous time-line, and a time-line that corresponds to its sampled and windowed equivalent"
  {:db/ident :tl/UniformSamplingWindowingMap,
   :owl/disjointWith [:tl/UniformSamplingMap :tl/UniformWindowingMap],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the relation between a continuous time-line, and a time-line that corresponds to its sampled and windowed equivalent",
   :rdfs/label "Uniform sampling and windowing map",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :tl/hopSize,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :tl/domainTimeLine,
                      :owl/someValuesFrom :tl/ContinuousTimeLine,
                      :rdf/type           :owl/Restriction}
                     :tl/TimeLineMap
                     {:owl/cardinality 1,
                      :owl/onProperty  :tl/sampleRate,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :tl/windowLength,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :tl/rangeTimeLine,
                      :owl/someValuesFrom :tl/DiscreteTimeLine,
                      :rdf/type           :owl/Restriction}],
   :vs/term_status "stable"})

(def UniformWindowingMap
  "Describes the relation between a discrete time line and its windowed equivalent"
  {:db/ident :tl/UniformWindowingMap,
   :owl/disjointWith [:tl/UniformSamplingWindowingMap :tl/UniformSamplingMap],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the relation between a discrete time line and its windowed equivalent",
   :rdfs/label "uniform windowing map",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :tl/windowLength,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :tl/hopSize,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :tl/domainTimeLine,
                      :owl/someValuesFrom :tl/DiscreteTimeLine,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tl/rangeTimeLine,
                      :owl/someValuesFrom :tl/DiscreteTimeLine,
                      :rdf/type           :owl/Restriction}
                     :tl/TimeLineMap],
   :vs/term_status "stable"})

(def after
  {:db/ident :tl/after,
   :owl/equivalentProperty :time/intervalAfter,
   :rdf/type :owl/ObjectProperty})

(def at
  "refers to a point or an interval on the time line, through an explicit datatype"
  {:db/ident :tl/at,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/comment
   "refers to a point or an interval on the time line, through an explicit datatype",
   :rdfs/domain {:owl/unionOf [:tl/Interval :tl/Instant],
                 :rdf/type    :owl/Class},
   :rdfs/label "at",
   :vs/term_status "stable"})

(def atDate
  "A subproperty of :at, allowing to address a date (beginning of it for an instant, all of it for an interval)"
  {:db/ident :tl/atDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A subproperty of :at, allowing to address a date (beginning of it for an instant, all of it for an interval)",
   :rdfs/label "at (date)",
   :rdfs/range :xsd/date,
   :rdfs/subPropertyOf :tl/at,
   :vs/term_status "stable"})

(def atDateTime
  "This property links an instant defined on the universal time line to an XSD date/time value"
  {:db/ident :tl/atDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This property links an instant defined on the universal time line to an XSD date/time value",
   :rdfs/label "at date/time",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :tl/at,
   :vs/term_status "stable"})

(def atDuration
  "A property enabling to adress a time point P through the duration of the interval [0,P] on a continuous timeline"
  {:db/ident :tl/atDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A property enabling to adress a time point P through the duration of the interval [0,P] on a continuous timeline",
   :rdfs/label "at (duration)",
   :rdfs/range :xsd/duration,
   :rdfs/subPropertyOf :tl/at,
   :vs/term_status "stable"})

(def atInt
  "A subproperty of :at, having as a specific range xsd:int"
  {:db/ident :tl/atInt,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "A subproperty of :at, having as a specific range xsd:int",
   :rdfs/label "at (integer)",
   :rdfs/range :xsd/int,
   :rdfs/subPropertyOf :tl/at,
   :vs/term_status "stable"})

(def atReal
  "subproperty of :at, having xsd:float as a range"
  {:db/ident           :tl/atReal,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       "subproperty of :at, having xsd:float as a range",
   :rdfs/label         "at (real)",
   :rdfs/range         :xsd/float,
   :rdfs/subPropertyOf :tl/at,
   :vs/term_status     "stable"})

(def atYear
  "A subproperty of :at, allowing to address a year (beginning of it for an instant, all of it for an interval)"
  {:db/ident :tl/atYear,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A subproperty of :at, allowing to address a year (beginning of it for an instant, all of it for an interval)",
   :rdfs/label "at (year)",
   :rdfs/range :xsd/gYear,
   :rdfs/subPropertyOf :tl/at,
   :vs/term_status "stable"})

(def atYearMonth
  "A subproperty of :at, allowing to address a year/month (beginning of it for an instant, all of it for an interval)"
  {:db/ident :tl/atYearMonth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A subproperty of :at, allowing to address a year/month (beginning of it for an instant, all of it for an interval)",
   :rdfs/label "at (year/month)",
   :rdfs/range :xsd/gYearMonth,
   :rdfs/subPropertyOf :tl/at,
   :vs/term_status "stable"})

(def before
  {:db/ident :tl/before,
   :owl/equivalentProperty :time/intervalBefore,
   :rdf/type :owl/ObjectProperty})

(def beginsAt
  {:db/ident :tl/beginsAt,
   :owl/equivalentProperty :tl/start,
   :rdf/type :owl/DatatypeProperty})

(def beginsAtDateTime
  "A subproperty of :beginsAt, allowing to address the beginning of an interval as a date/time"
  {:db/ident :tl/beginsAtDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A subproperty of :beginsAt, allowing to address the beginning of an interval as a date/time",
   :rdfs/label "begins at (date/time)",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :tl/start,
   :vs/term_status "stable"})

(def beginsAtDuration
  "A property enabling to adress a start time point P of an interval [P,E] through the duration of the interval [0,P] on a continuous timeline"
  {:db/ident :tl/beginsAtDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A property enabling to adress a start time point P of an interval [P,E] through the duration of the interval [0,P] on a continuous timeline",
   :rdfs/label "begins at (xsd:duration)",
   :rdfs/range :xsd/duration,
   :rdfs/subPropertyOf :tl/start,
   :vs/term_status "stable"})

(def beginsAtInt
  "A subproperty of :beginsAt, having xsd:int as a range"
  {:db/ident           :tl/beginsAtInt,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       "A subproperty of :beginsAt, having xsd:int as a range",
   :rdfs/label         "begins at (integer)",
   :rdfs/range         :xsd/int,
   :rdfs/subPropertyOf :tl/start,
   :vs/term_status     "stable"})

(def contains
  {:db/ident :tl/contains,
   :owl/equivalentProperty :time/intervalContains,
   :rdf/type :owl/ObjectProperty})

(def delay
  "associate a shift map to a particular delay"
  {:db/ident       :tl/delay,
   :rdf/type       [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/comment   "associate a shift map to a particular delay",
   :rdfs/domain    :tl/ShiftMap,
   :rdfs/label     "delay",
   :vs/term_status "stable"})

(def domainTimeLine
  "associates a timeline map to its domain timeline"
  {:db/ident       :tl/domainTimeLine,
   :rdf/type       [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment   "associates a timeline map to its domain timeline",
   :rdfs/domain    :tl/TimeLineMap,
   :rdfs/label     "domain timeline",
   :rdfs/range     :tl/TimeLine,
   :vs/term_status "stable"})

(def duration
  "the duration of a time interval"
  {:db/ident       :tl/duration,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "the duration of a time interval",
   :rdfs/domain    :tl/Interval,
   :rdfs/label     "duration",
   :vs/term_status "stable"})

(def durationInt
  "A subproperty of :duration, having xsd:int as a range"
  {:db/ident           :tl/durationInt,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       "A subproperty of :duration, having xsd:int as a range",
   :rdfs/label         "duration (integer)",
   :rdfs/range         :xsd/int,
   :rdfs/subPropertyOf :tl/duration,
   :vs/term_status     "stable"})

(def durationXSD
  "A subproperty of :duration, having xsd:duration as a range"
  {:db/ident :tl/durationXSD,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "A subproperty of :duration, having xsd:duration as a range",
   :rdfs/label "duration (xsd:duration)",
   :rdfs/range :xsd/duration,
   :rdfs/subPropertyOf :tl/duration,
   :vs/term_status "stable"})

(def during
  {:db/ident :tl/during,
   :owl/equivalentProperty :time/intervalDuring,
   :rdf/type :owl/ObjectProperty})

(def end
  "refers to the end of a time interval, through an explicit datatype. time:hasEnd can be used as well, if you want to associate the end of the interval to an explicit time point resource"
  {:db/ident :tl/end,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "refers to the end of a time interval, through an explicit datatype. time:hasEnd can be used as well, if you want to associate the end of the interval to an explicit time point resource",
   :rdfs/domain :tl/Interval,
   :rdfs/label "ends at",
   :vs/term_status "stable"})

(def endsAt
  {:db/ident :tl/endsAt,
   :owl/equivalentProperty :tl/end,
   :rdf/type :owl/DatatypeProperty})

(def endsAtDateTime
  "A subproperty of :endsAt, allowing to address the end of an interval as a date/time"
  {:db/ident :tl/endsAtDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A subproperty of :endsAt, allowing to address the end of an interval as a date/time",
   :rdfs/label "ends at (date/time)",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :tl/end,
   :vs/term_status "stable"})

(def endsAtDuration
  "A property enabling to adress an end time point P of an interval [S,P] through the duration of the interval [0,P] on a continuous timeline"
  {:db/ident :tl/endsAtDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A property enabling to adress an end time point P of an interval [S,P] through the duration of the interval [0,P] on a continuous timeline",
   :rdfs/label "ends at (xsd:duration)",
   :rdfs/range :xsd/duration,
   :rdfs/subPropertyOf :tl/end,
   :vs/term_status "stable"})

(def endsAtInt
  "A subproperty of :endsAt, having xsd:int as a range"
  {:db/ident           :tl/endsAtInt,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       "A subproperty of :endsAt, having xsd:int as a range",
   :rdfs/label         "ends at (integer)",
   :rdfs/range         :xsd/int,
   :rdfs/subPropertyOf :tl/end,
   :vs/term_status     "stable"})

(def equals
  {:db/ident :tl/equals,
   :owl/equivalentProperty :time/intervalEquals,
   :rdf/type :owl/ObjectProperty})

(def finishedBy
  {:db/ident :tl/finishedBy,
   :owl/equivalentProperty :time/intervalFinishedBy,
   :rdf/type :owl/ObjectProperty})

(def finishes
  {:db/ident :tl/finishes,
   :owl/equivalentProperty :time/intervalFinishes,
   :rdf/type :owl/ObjectProperty})

(def hopSize
  "hop size, associated to a uniform windowing map"
  {:db/ident       :tl/hopSize,
   :rdf/type       [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/comment   "hop size, associated to a uniform windowing map",
   :rdfs/domain    {:owl/unionOf [:tl/UniformWindowingMap
                                  :tl/UniformSamplingWindowingMap],
                    :rdf/type    :owl/Class},
   :rdfs/label     "hop size",
   :rdfs/range     :xsd/int,
   :vs/term_status "stable"})

(def meets
  {:db/ident :tl/meets,
   :owl/equivalentProperty :time/intervalMeets,
   :rdf/type :owl/ObjectProperty})

(def metBy
  {:db/ident :tl/metBy,
   :owl/equivalentProperty :time/intervalMetBy,
   :rdf/type :owl/ObjectProperty})

(def onTimeLine
  {:db/ident :tl/onTimeLine,
   :owl/equivalentProperty :tl/timeline,
   :rdf/type :owl/ObjectProperty})

(def origin
  "associate an origin map to its origin on the domain physical timeline"
  {:db/ident :tl/origin,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/comment
   "associate an origin map to its origin on the domain physical timeline",
   :rdfs/domain :tl/OriginMap,
   :rdfs/label "origin",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "stable"})

(def overlappedBy
  {:db/ident :tl/overlappedBy,
   :owl/equivalentProperty :time/intervalOverlappedBy,
   :rdf/type :owl/ObjectProperty})

(def overlaps
  {:db/ident :tl/overlaps,
   :owl/equivalentProperty :time/intervalOverlaps,
   :rdf/type :owl/ObjectProperty})

(def rangeTimeLine
  "associates a timeline map to its range timeline"
  {:db/ident       :tl/rangeTimeLine,
   :rdf/type       [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment   "associates a timeline map to its range timeline",
   :rdfs/domain    :tl/TimeLineMap,
   :rdfs/label     "range timeline",
   :rdfs/range     :tl/TimeLine,
   :vs/term_status "stable"})

(def sampleRate
  "associates a sample rate value to a uniform sampling map"
  {:db/ident       :tl/sampleRate,
   :rdf/type       [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/comment   "associates a sample rate value to a uniform sampling map",
   :rdfs/domain    {:owl/unionOf [:tl/UniformSamplingMap
                                  :tl/UniformSamplingWindowingMap],
                    :rdf/type    :owl/Class},
   :rdfs/label     "sample rate",
   :rdfs/range     :xsd/int,
   :vs/term_status "stable"})

(def start
  "refers to the beginning of a time interval, through an explicit datatype. time:hasBeginning can be used as well, if you want to associate the beginning of the interval to an explicit time point resource"
  {:db/ident :tl/start,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "refers to the beginning of a time interval, through an explicit datatype. time:hasBeginning can be used as well, if you want to associate the beginning of the interval to an explicit time point resource",
   :rdfs/domain :tl/Interval,
   :rdfs/label "begins at",
   :vs/term_status "stable"})

(def startedBy
  {:db/ident :tl/startedBy,
   :owl/equivalentProperty :time/intervalStartedBy,
   :rdf/type :owl/ObjectProperty})

(def starts
  {:db/ident :tl/starts,
   :owl/equivalentProperty :time/intervalStarts,
   :rdf/type :owl/ObjectProperty})

(def timeline
  "Relates an interval or an instant to the timeline on which it is defined. The 29th of August, 2007 would be linked through this property to the universal timeline, whereas \"from 2s to 5s on this particular signal\" would be defined on the signal' timeline."
  {:db/ident :tl/timeline,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   "\n\tRelates an interval or an instant to the timeline on which it is defined.\n\n\tThe 29th of August, 2007 would be linked through this property to the universal timeline, whereas\n\t\"from 2s to 5s on this particular signal\" would be defined on the signal' timeline.\n\n    ",
   :rdfs/domain {:owl/unionOf [:tl/Instant :tl/Interval],
                 :rdf/type    :owl/Class},
   :rdfs/label "on timeline",
   :rdfs/range :tl/TimeLine,
   :vs/term_status "stable"})

(def universaltimeline
  "The timeline one can addresss \"the 1st of July, 2007\""
  {:db/ident :tl/universaltimeline,
   :dc11/description "The timeline one can addresss \"the 1st of July, 2007\"",
   :dc11/title "the universal time line",
   :rdf/type [:tl/PhysicalTimeLine :tl/ContinuousTimeLine :tl/TimeLine],
   :rdfs/comment
   "this is the `universal' time line -- can adress time intervals on it using date/dateTime -- UTC",
   :vs/term_status "stable"})

(def windowLength
  "window length, associated to a uniform windowing map"
  {:db/ident       :tl/windowLength,
   :rdf/type       [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/comment   "window length, associated to a uniform windowing map",
   :rdfs/domain    {:owl/unionOf [:tl/UniformWindowingMap
                                  :tl/UniformSamplingWindowingMap],
                    :rdf/type    :owl/Class},
   :rdfs/label     "window length",
   :rdfs/range     :xsd/int,
   :vs/term_status "stable"})