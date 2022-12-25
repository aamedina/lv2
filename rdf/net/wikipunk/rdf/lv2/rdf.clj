(ns net.wikipunk.rdf.lv2.rdf
  "This is the RDF Schema for the RDF vocabulary defined in the RDF namespace."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "rdf",
   :rdfs/seeAlso #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema-more"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/rdf.ttl",
   :rdf/about [#:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}],
   :dcterms/title "The RDF Vocabulary (RDF)",
   :vann/preferredNamespaceUri "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdf/ns-prefix-map {"rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#"}}
  (:refer-clojure :exclude [type first rest]))

(def Alt
  "The class of containers of alternatives."
  {:rdfs/subClassOf :rdfs/Container,
   :rdfs/label "Alt",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment "The class of containers of alternatives.",
   :rdf/type :rdfs/Class})

(def Bag
  "The class of unordered containers."
  {:rdfs/subClassOf :rdfs/Container,
   :rdfs/label "Bag",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment "The class of unordered containers.",
   :rdf/type :rdfs/Class})

(def List
  "The class of RDF Lists."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "List",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment "The class of RDF Lists.",
   :rdf/type :rdfs/Class})

(def PlainLiteral
  "The class of plain (i.e. untyped) literal values."
  {:rdfs/subClassOf :rdfs/Literal,
   :rdfs/label "Plain Literal",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/TR/rdf-plain-literal/"},
   :rdfs/comment "The class of plain (i.e. untyped) literal values.",
   :rdf/type :rdfs/Datatype})

(def Property
  "The class of RDF properties."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment "The class of RDF properties.",
   :rdf/type :rdfs/Class})

(def Seq
  "The class of ordered containers."
  {:rdfs/subClassOf :rdfs/Container,
   :rdfs/label "Seq",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment "The class of ordered containers.",
   :rdf/type :rdfs/Class})

(def Statement
  "The class of RDF statements."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Statement",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment "The class of RDF statements.",
   :rdf/type :rdfs/Class})

(def XMLLiteral
  "The class of XML literal values."
  {:rdfs/subClassOf :rdfs/Literal,
   :rdfs/label "XML Literal",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment "The class of XML literal values.",
   :rdf/type :rdfs/Datatype})

(def first
  "The first item in the subject RDF list."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "first",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/domain :rdf/List,
   :rdfs/comment "The first item in the subject RDF list.",
   :rdf/type :rdf/Property})

(def null
  "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it."
  {:rdfs/label "nil",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/comment
     "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it.",
   :rdf/type :rdf/List})

(def object
  "The object of the subject RDF statement."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "object",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/domain :rdf/Statement,
   :rdfs/comment "The object of the subject RDF statement.",
   :rdf/type :rdf/Property})

(def predicate
  "The predicate of the subject RDF statement."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "predicate",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/domain :rdf/Statement,
   :rdfs/comment "The predicate of the subject RDF statement.",
   :rdf/type :rdf/Property})

(def rest
  "The rest of the subject RDF list after the first item."
  {:rdfs/range :rdf/List,
   :rdfs/label "rest",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/domain :rdf/List,
   :rdfs/comment "The rest of the subject RDF list after the first item.",
   :rdf/type :rdf/Property})

(def subject
  "The subject of the subject RDF statement."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "subject",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/domain :rdf/Statement,
   :rdfs/comment "The subject of the subject RDF statement.",
   :rdf/type :rdf/Property})

(def type
  "The subject is an instance of a class."
  {:rdfs/range :rdfs/Class,
   :rdfs/label "type",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment "The subject is an instance of a class.",
   :rdf/type :rdf/Property})

(def value
  "Idiomatic property used for structured values."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "value",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment "Idiomatic property used for structured values.",
   :rdf/type :rdf/Property})