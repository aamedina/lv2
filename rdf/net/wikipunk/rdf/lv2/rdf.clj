(ns net.wikipunk.rdf.lv2.rdf
  "This is the RDF Schema for the RDF vocabulary defined in the RDF namespace."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/rdf.ttl",
   :dcterms/title "The RDF Vocabulary (RDF)",
   :rdf/about #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema-more"},
   :vann/preferredNamespacePrefix "rdf",
   :vann/preferredNamespaceUri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}
  (:refer-clojure :exclude [type first rest]))

(def Alt
  "The class of containers of alternatives."
  {:rdf/about        :rdf/Alt,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Alt",
   :rdfs/subClassOf  :rdfs/Container})

(def Bag
  "The class of unordered containers."
  {:rdf/about        :rdf/Bag,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Bag",
   :rdfs/subClassOf  :rdfs/Container})

(def List
  "The class of RDF Lists."
  {:rdf/about        :rdf/List,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "List",
   :rdfs/subClassOf  :rdfs/Resource})

(def PlainLiteral
  "The class of plain (i.e. untyped) literal values."
  {:rdf/about        :rdf/PlainLiteral,
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/TR/rdf-plain-literal/"},
   :rdfs/label       "Plain Literal",
   :rdfs/subClassOf  :rdfs/Literal})

(def Property
  "The class of RDF properties."
  {:rdf/about        :rdf/Property,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Property",
   :rdfs/subClassOf  :rdfs/Resource})

(def Seq
  "The class of ordered containers."
  {:rdf/about        :rdf/Seq,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Seq",
   :rdfs/subClassOf  :rdfs/Container})

(def Statement
  "The class of RDF statements."
  {:rdf/about        :rdf/Statement,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "Statement",
   :rdfs/subClassOf  :rdfs/Resource})

(def XMLLiteral
  "The class of XML literal values."
  {:rdf/about        :rdf/XMLLiteral,
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "XML Literal",
   :rdfs/subClassOf  :rdfs/Literal})

(def first
  "The first item in the subject RDF list."
  {:rdf/about        :rdf/first,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "first",
   :rdfs/range       :rdfs/Resource})

(def null
  "The empty list, with no items in it. If the rest of a list is nil then the list has no more items in it."
  {:rdf/about        :rdf/nil,
   :rdf/type         :rdf/List,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "nil"})

(def object
  "The object of the subject RDF statement."
  {:rdf/about        :rdf/object,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "object",
   :rdfs/range       :rdfs/Resource})

(def predicate
  "The predicate of the subject RDF statement."
  {:rdf/about        :rdf/predicate,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "predicate",
   :rdfs/range       :rdfs/Resource})

(def rest
  "The rest of the subject RDF list after the first item."
  {:rdf/about        :rdf/rest,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/List,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "rest",
   :rdfs/range       :rdf/List})

(def subject
  "The subject of the subject RDF statement."
  {:rdf/about        :rdf/subject,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Statement,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "subject",
   :rdfs/range       :rdfs/Resource})

(def type
  "The subject is an instance of a class."
  {:rdf/about        :rdf/type,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "type",
   :rdfs/range       :rdfs/Class})

(def value
  "Idiomatic property used for structured values."
  {:rdf/about        :rdf/value,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdfs/label       "value",
   :rdfs/range       :rdfs/Resource})