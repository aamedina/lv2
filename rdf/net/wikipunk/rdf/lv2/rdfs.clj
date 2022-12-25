(ns net.wikipunk.rdf.lv2.rdfs
  "http://www.w3.org/2000/01/rdf-schema#"
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "rdfs",
   :rdfs/seeAlso #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema-more"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/rdfs.ttl",
   :rdf/about [#:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"}],
   :dcterms/title "The RDF Schema vocabulary (RDFS)",
   :vann/preferredNamespaceUri "http://www.w3.org/2000/01/rdf-schema#",
   :rdf/ns-prefix-map {"rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "owl" "http://www.w3.org/2002/07/owl#"}}
  (:refer-clojure :exclude [comment range]))

(def ClassClass
  "The class of classes."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Class",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/comment "The class of classes.",
   :rdf/type :rdfs/Class})

(def Container
  "The class of RDF containers."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Container",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/comment "The class of RDF containers.",
   :rdf/type :rdfs/Class})

(def ContainerMembershipProperty
  "The class of container membership properties, rdf:_1, rdf:_2, ..., all of which are sub-properties of 'member'."
  {:rdfs/subClassOf :rdf/Property,
   :rdfs/label "Container Membership Property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/comment
     "The class of container membership properties, rdf:_1, rdf:_2, ..., all of which are sub-properties of 'member'.",
   :rdf/type :rdfs/Class})

(def Datatype
  "The class of RDF datatypes."
  {:rdfs/subClassOf :rdfs/Class,
   :rdfs/label "Datatype",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/comment "The class of RDF datatypes.",
   :rdf/type :rdfs/Class})

(def Literal
  "The class of literal values, eg. textual strings and integers."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Literal",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/comment
     "The class of literal values, eg. textual strings and integers.",
   :rdf/type :rdfs/Class})

(def Resource
  "The class resource, everything."
  {:rdfs/label "Resource",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/comment "The class resource, everything.",
   :rdf/type :rdfs/Class})

(def comment
  "A description of the subject resource."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "comment",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment "A description of the subject resource.",
   :rdf/type :rdf/Property})

(def domain
  "A domain of the subject property."
  {:rdfs/range :rdfs/Class,
   :rdfs/label "domain",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdf/Property,
   :rdfs/comment "A domain of the subject property.",
   :rdf/type :rdf/Property})

(def isDefinedBy
  "The definition of the subject resource."
  {:rdfs/subPropertyOf :rdfs/seeAlso,
   :rdfs/range :rdfs/Resource,
   :rdfs/label "is defined by",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment "The definition of the subject resource.",
   :rdf/type :rdf/Property})

(def label
  "A human-readable name for the subject."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "label",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment "A human-readable name for the subject.",
   :rdf/type :rdf/Property})

(def member
  "A member of the subject resource."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "member",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment "A member of the subject resource.",
   :rdf/type :rdf/Property})

(def range
  "A range of the subject property."
  {:rdfs/range :rdfs/Class,
   :rdfs/label "range",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdf/Property,
   :rdfs/comment "A range of the subject property.",
   :rdf/type :rdf/Property})

(def seeAlso
  "Further information about the subject resource."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "see also",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment "Further information about the subject resource.",
   :rdf/type :rdf/Property})

(def subClassOf
  "The subject is a subclass of a class."
  {:rdfs/range :rdfs/Class,
   :rdfs/label "sub-class of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdfs/Class,
   :rdfs/comment "The subject is a subclass of a class.",
   :rdf/type :rdf/Property})

(def subPropertyOf
  "The subject is a subproperty of a property."
  {:rdfs/range :rdf/Property,
   :rdfs/label "sub-property of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/domain :rdf/Property,
   :rdfs/comment "The subject is a subproperty of a property.",
   :rdf/type :rdf/Property})