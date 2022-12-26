(ns net.wikipunk.rdf.duv
  "https://www.w3.org/ns/duv#"
  {:rdf/ns-prefix-map {"biro" "http://purl.org/spar/biro/",
                       "dcat" "http://www.w3.org/ns/dcat#",
                       "dct" "http://purl.org/dc/terms/",
                       "disco"
                       "http://rdf-vocabulary.ddialliance.org/discovery#",
                       "dqv" "http://www.w3.org/ns/dqv#",
                       "duv" "http://www.w3.org/ns/duv#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "frbr" "http://purl.org/vocab/frbr/core#",
                       "oa" "http://www.w3.org/ns/oa#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "pav" "http://purl.org/pav/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "voaf" "http://purl.org/vocommons/voaf#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "duv",
   :rdfa/uri          "https://www.w3.org/ns/duv#",
   :rdfs/isDefinedBy  {:rdf/uri "https://www.w3.org/TR/vocab-duv/"}})

(def RatingFeedback
  "Predefined criteria used to express a user opinion about a dataset or distribution using a discrete range of values."
  {:rdf/about :duv/RatingFeedback,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Predefined criteria used to express a user opinion about a dataset or distribution using a discrete range of values."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rating Feedback"},
   :rdfs/subclassOf :duv/UserFeedback})

(def Usage
  "A helpful description of actions that can be performed on a given dataset or distribution."
  {:rdf/about :duv/Usage,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A helpful description of actions that can be performed on a given dataset or distribution."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Usage"}})

(def UsageTool
  "A synopsis describing the way a tool can use a dataset or distribution."
  {:rdf/about :duv/UsageTool,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A synopsis describing the way a tool can use a dataset or distribution."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "UsageTool"}})

(def UserFeedback
  "User feedback on the dataset. Expresses whether the dataset was useful or not, for example."
  {:rdf/about :duv/UserFeedback,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "User feedback on the dataset. Expresses whether the dataset was useful or not, for example."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User Feedback"}})

(def hasDistributor
  "The distributor is the organization that makes the dataset available for downloading and use."
  {:rdf/about :duv/hasDistributor,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The distributor is the organization that makes the dataset available for downloading and use."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has distributor"},
   :vann/usageNote
   [{:rdf/language "en",
     :rdf/value
     "dcat:Distribution (subject) duv:hasDistributor (predicate) foaf:Agent (object)"}
    {:rdf/language "en",
     :rdf/value
     "dcat:Dataset (subject) duv:hasDistributor (predicate) foaf:Agent (object)"}]})

(def hasFeedback
  "User feedback associated with Dataset or distribution"
  {:rdf/about :duv/hasFeedback,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "User feedback associated with Dataset or distribution"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has dataset feedback"},
   :vann/usageNote
   [{:rdf/language "en",
     :rdf/value
     "dcat:Distribution (subject) duv:hasFeedback (predicate) duv:UserFeedback (object)"}
    {:rdf/language "en",
     :rdf/value
     "dcat:Dataset (subject) duv:hasFeedback (predicate) duv:UserFeedback (object)"}]})

(def hasRating
  "Rating Feedback has rating opinion"
  {:rdf/about    :duv/hasRating,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Rating Feedback has rating opinion"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "has rating"}})

(def hasUsage
  "Dataset/distribution usage guidance or instructions."
  {:rdf/about    :duv/hasUsage,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Dataset/distribution usage guidance or instructions."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "has dataset/distribution usage"}})

(def hasUsageTool
  "Describes the tool that provides the Usage"
  {:rdf/about    :duv/hasUsageTool,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Describes the tool that provides the Usage "},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "has usage tool"}})

(def refersTo
  "Dataset associated with Usage."
  {:rdf/about    :duv/refersTo,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Dataset associated with Usage. "},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "refers to dataset"}})