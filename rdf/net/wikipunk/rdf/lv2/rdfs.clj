(ns net.wikipunk.rdf.lv2.rdfs
  "The RDF Schema vocabulary (RDFS)"
  {:dcat/downloadURL  "http://www.w3.org/2000/01/rdf-schema#",
   :dcterms/title     "The RDF Schema vocabulary (RDFS)",
   :rdf/about         {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/ns-prefix-map {"dc"   "http://purl.org/dc/elements/1.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :owl/Ontology,
   :rdfs/seeAlso      {:rdf/uri "http://www.w3.org/2000/01/rdf-schema-more"},
   :vann/preferredNamespacePrefix "rdfs",
   :vann/preferredNamespaceUri "http://www.w3.org/2000/01/rdf-schema#"}
  (:refer-clojure :exclude [comment range]))

(def T
  "The class of classes."
  {:rdf/about        :rdfs/Class,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Class",
   :rdfs/subClassOf  :rdfs/Resource})

(def Container
  "The class of RDF containers."
  {:rdf/about        :rdfs/Container,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Container",
   :rdfs/subClassOf  :rdfs/Resource})

(def ContainerMembershipProperty
  "The class of container membership properties, rdf:_1, rdf:_2, ...,                     all of which are sub-properties of 'member'."
  {:rdf/about        :rdfs/ContainerMembershipProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "ContainerMembershipProperty",
   :rdfs/subClassOf  :rdf/Property})

(def Datatype
  "The class of RDF datatypes."
  {:rdf/about        :rdfs/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Datatype",
   :rdfs/subClassOf  :rdfs/Class})

(def Literal
  "The class of literal values, eg. textual strings and integers."
  {:rdf/about        :rdfs/Literal,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Literal",
   :rdfs/subClassOf  :rdfs/Resource})

(def Resource
  "The class resource, everything."
  {:rdf/about        :rdfs/Resource,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "Resource"})

(def comment
  "A description of the subject resource."
  {:rdf/about        :rdfs/comment,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "comment",
   :rdfs/range       :rdfs/Literal})

(def domain
  "A domain of the subject property."
  {:rdf/about        :rdfs/domain,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "domain",
   :rdfs/range       :rdfs/Class})

(def isDefinedBy
  "The defininition of the subject resource."
  {:rdf/about          :rdfs/isDefinedBy,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :rdfs/Resource,
   :rdfs/isDefinedBy   {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label         "isDefinedBy",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def label
  "A human-readable name for the subject."
  {:rdf/about        :rdfs/label,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "label",
   :rdfs/range       :rdfs/Literal})

(def member
  "A member of the subject resource."
  {:rdf/about        :rdfs/member,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "member",
   :rdfs/range       :rdfs/Resource})

(def range
  "A range of the subject property."
  {:rdf/about        :rdfs/range,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "range",
   :rdfs/range       :rdfs/Class})

(def seeAlso
  "Further information about the subject resource."
  {:rdf/about        :rdfs/seeAlso,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "seeAlso",
   :rdfs/range       :rdfs/Resource})

(def subClassOf
  "The subject is a subclass of a class."
  {:rdf/about        :rdfs/subClassOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "subClassOf",
   :rdfs/range       :rdfs/Class})

(def subPropertyOf
  "The subject is a subproperty of a property."
  {:rdf/about        :rdfs/subPropertyOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/label       "subPropertyOf",
   :rdfs/range       :rdf/Property})