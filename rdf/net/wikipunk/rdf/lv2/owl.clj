(ns net.wikipunk.rdf.lv2.owl
  "\n  This ontology partially describes the built-in classes and\n  properties that together form the basis of the RDF/XML syntax of OWL 2.\n  The content of this ontology is based on Tables 6.1 and 6.2\n  in Section 6.4 of the OWL 2 RDF-Based Semantics specification,\n  available at http://www.w3.org/TR/owl2-rdf-based-semantics/.\n  Please note that those tables do not include the different annotations\n  (labels, comments and rdfs:isDefinedBy links) used in this file.\n  Also note that the descriptions provided in this ontology do not\n  provide a complete and correct formal description of either the syntax\n  or the semantics of the introduced terms (please see the OWL 2\n  recommendations for the complete and normative specifications).\n  Furthermore, the information provided by this ontology may be\n  misleading if not used with care. This ontology SHOULD NOT be imported\n  into OWL ontologies. Importing this file into an OWL 2 DL ontology\n  will cause it to become an OWL 2 Full ontology and may have other,\n  unexpected, consequences.\n   "
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "owl",
   :rdfs/seeAlso
     [#:rdf{:uri
              "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-properties"}
      #:rdf{:uri
              "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-classes"}],
   :owl/versionInfo "$Date: 2009/11/15 10:54:12 $",
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/owl.ttl",
   :owl/imports #:rdf{:uri "http://www.w3.org/2000/01/rdf-schema#"},
   :rdfs/isDefinedBy
     [#:rdf{:uri "http://www.w3.org/TR/owl2-syntax/"}
      #:rdf{:uri "http://www.w3.org/TR/owl2-mapping-to-rdf/"}
      #:rdf{:uri "http://www.w3.org/TR/owl2-rdf-based-semantics/"}],
   :rdf/about [#:rdf{:uri "http://www.w3.org/2002/07/owl"}],
   :dcterms/title "The OWL 2 Schema vocabulary (OWL 2)",
   :owl/versionIRI #:rdf{:uri "http://www.w3.org/2002/07/owl"},
   :vann/preferredNamespaceUri "http://www.w3.org/2002/07/owl",
   :rdf/ns-prefix-map {"owl" "http://www.w3.org/2002/07/owl#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}}
  (:refer-clojure :exclude []))

(def AllDifferent
  "The class of collections of pairwise different individuals."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "AllDifferent",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of collections of pairwise different individuals.",
   :rdf/type :rdfs/Class})

(def AllDisjointClasses
  "The class of collections of pairwise disjoint classes."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "AllDisjointClasses",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of collections of pairwise disjoint classes.",
   :rdf/type :rdfs/Class})

(def AllDisjointProperties
  "The class of collections of pairwise disjoint properties."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "AllDisjointProperties",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of collections of pairwise disjoint properties.",
   :rdf/type :rdfs/Class})

(def Annotation
  "The class of annotated annotations for which the RDF serialization consists of an annotated subject, predicate and object."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Annotation",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment
     "The class of annotated annotations for which the RDF serialization consists of an annotated subject, predicate and object.",
   :rdf/type :rdfs/Class})

(def AnnotationProperty
  "The class of annotation properties."
  {:rdfs/subClassOf :rdf/Property,
   :rdfs/label "AnnotationProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of annotation properties.",
   :rdf/type :rdfs/Class})

(def AsymmetricProperty
  "The class of asymmetric properties."
  {:rdfs/subClassOf :owl/ObjectProperty,
   :rdfs/label "AsymmetricProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of asymmetric properties.",
   :rdf/type :rdfs/Class})

(def Axiom
  "The class of annotated axioms for which the RDF serialization consists of an annotated subject, predicate and object."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Axiom",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment
     "The class of annotated axioms for which the RDF serialization consists of an annotated subject, predicate and object.",
   :rdf/type :rdfs/Class})

(def ClassClass
  "The class of OWL classes."
  {:rdfs/subClassOf :rdfs/Class,
   :rdfs/label "Class",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of OWL classes.",
   :rdf/type :rdfs/Class})

(def DatatypeProperty
  "The class of data properties."
  {:rdfs/subClassOf :rdf/Property,
   :rdfs/label "DatatypeProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of data properties.",
   :rdf/type :rdfs/Class})

(def DeprecatedClass
  "The class of deprecated classes."
  {:rdfs/subClassOf :rdfs/Class,
   :rdfs/label "DeprecatedClass",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of deprecated classes.",
   :rdf/type :rdfs/Class})

(def DeprecatedProperty
  "The class of deprecated properties."
  {:rdfs/subClassOf :rdf/Property,
   :rdfs/label "DeprecatedProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of deprecated properties.",
   :rdf/type :rdfs/Class})

(def FunctionalProperty
  "The class of functional properties."
  {:rdfs/subClassOf :rdf/Property,
   :rdfs/label "FunctionalProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of functional properties.",
   :rdf/type :rdfs/Class})

(def InverseFunctionalProperty
  "The class of inverse-functional properties."
  {:rdfs/subClassOf :owl/ObjectProperty,
   :rdfs/label "InverseFunctionalProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of inverse-functional properties.",
   :rdf/type :rdfs/Class})

(def IrreflexiveProperty
  "The class of irreflexive properties."
  {:rdfs/subClassOf :owl/ObjectProperty,
   :rdfs/label "IrreflexiveProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of irreflexive properties.",
   :rdf/type :rdfs/Class})

(def NamedIndividual
  "The class of named individuals."
  {:rdfs/subClassOf :owl/Thing,
   :rdfs/label "NamedIndividual",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of named individuals.",
   :rdf/type :rdfs/Class})

(def NegativePropertyAssertion
  "The class of negative property assertions."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "NegativePropertyAssertion",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of negative property assertions.",
   :rdf/type :rdfs/Class})

(def Nothing
  "This is the empty class."
  {:rdfs/subClassOf :owl/Thing,
   :rdfs/label "Nothing",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "This is the empty class.",
   :rdf/type :owl/Class})

(def ObjectProperty
  "The class of object properties."
  {:rdfs/subClassOf :rdf/Property,
   :rdfs/label "ObjectProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of object properties.",
   :rdf/type :rdfs/Class})

(def Ontology
  "The class of ontologies."
  {:rdfs/subClassOf :rdfs/Resource,
   :rdfs/label "Ontology",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of ontologies.",
   :rdf/type :rdfs/Class})

(def OntologyProperty
  "The class of ontology properties."
  {:rdfs/subClassOf :rdf/Property,
   :rdfs/label "OntologyProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of ontology properties.",
   :rdf/type :rdfs/Class})

(def ReflexiveProperty
  "The class of reflexive properties."
  {:rdfs/subClassOf :owl/ObjectProperty,
   :rdfs/label "ReflexiveProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of reflexive properties.",
   :rdf/type :rdfs/Class})

(def Restriction
  "The class of property restrictions."
  {:rdfs/subClassOf :owl/Class,
   :rdfs/label "Restriction",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of property restrictions.",
   :rdf/type :rdfs/Class})

(def SymmetricProperty
  "The class of symmetric properties."
  {:rdfs/subClassOf :owl/ObjectProperty,
   :rdfs/label "SymmetricProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of symmetric properties.",
   :rdf/type :rdfs/Class})

(def Thing
  "The class of OWL individuals."
  {:rdfs/label "Thing",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of OWL individuals.",
   :rdf/type :owl/Class})

(def TransitiveProperty
  "The class of transitive properties."
  {:rdfs/subClassOf :owl/ObjectProperty,
   :rdfs/label "TransitiveProperty",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/comment "The class of transitive properties.",
   :rdf/type :rdfs/Class})

(def allValuesFrom
  "The property that determines the class that a universal property restriction refers to."
  {:rdfs/range :rdfs/Class,
   :rdfs/label "all values from",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the class that a universal property restriction refers to.",
   :rdf/type :rdf/Property})

(def annotatedProperty
  "The property that determines the predicate of an annotated axiom or annotated annotation."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "annotated property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment
     "The property that determines the predicate of an annotated axiom or annotated annotation.",
   :rdf/type :rdf/Property})

(def annotatedSource
  "The property that determines the subject of an annotated axiom or annotated annotation."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "annotated source",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment
     "The property that determines the subject of an annotated axiom or annotated annotation.",
   :rdf/type :rdf/Property})

(def annotatedTarget
  "The property that determines the object of an annotated axiom or annotated annotation."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "annotated target",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment
     "The property that determines the object of an annotated axiom or annotated annotation.",
   :rdf/type :rdf/Property})

(def assertionProperty
  "The property that determines the predicate of a negative property assertion."
  {:rdfs/range :rdf/Property,
   :rdfs/label "assertion property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/comment
     "The property that determines the predicate of a negative property assertion.",
   :rdf/type :rdf/Property})

(def backwardCompatibleWith
  "The annotation property that indicates that a given ontology is backward compatible with another ontology."
  {:rdfs/range :owl/Ontology,
   :rdfs/label "backward compatible with",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Ontology,
   :rdfs/comment
     "The annotation property that indicates that a given ontology is backward compatible with another ontology.",
   :rdf/type [:owl/OntologyProperty :owl/AnnotationProperty]})

(def bottomDataProperty
  "The data property that does not relate any individual to any data value."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "bottom data property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment
     "The data property that does not relate any individual to any data value.",
   :rdf/type :owl/DatatypeProperty})

(def bottomObjectProperty
  "The object property that does not relate any two individuals."
  {:rdfs/range :owl/Thing,
   :rdfs/label "bottom object property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment
     "The object property that does not relate any two individuals.",
   :rdf/type :owl/ObjectProperty})

(def cardinality
  "The property that determines the cardinality of an exact cardinality restriction."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/label "cardinality",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the cardinality of an exact cardinality restriction.",
   :rdf/type :rdf/Property})

(def complementOf
  "The property that determines that a given class is the complement of another class."
  {:rdfs/range :owl/Class,
   :rdfs/label "complement of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Class,
   :rdfs/comment
     "The property that determines that a given class is the complement of another class.",
   :rdf/type :rdf/Property})

(def datatypeComplementOf
  "The property that determines that a given data range is the complement of another data range with respect to the data domain."
  {:rdfs/range :rdfs/Datatype,
   :rdfs/label "datatype complement of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Datatype,
   :rdfs/comment
     "The property that determines that a given data range is the complement of another data range with respect to the data domain.",
   :rdf/type :rdf/Property})

(def deprecated
  "The annotation property that indicates that a given entity has been deprecated."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "deprecated",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment
     "The annotation property that indicates that a given entity has been deprecated.",
   :rdf/type :owl/AnnotationProperty})

(def differentFrom
  "The property that determines that two given individuals are different."
  {:rdfs/range :owl/Thing,
   :rdfs/label "different from",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment
     "The property that determines that two given individuals are different.",
   :rdf/type :rdf/Property})

(def disjointUnionOf
  "The property that determines that a given class is equivalent to the disjoint union of a collection of other classes."
  {:rdfs/range :rdf/List,
   :rdfs/label "disjoint union of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Class,
   :rdfs/comment
     "The property that determines that a given class is equivalent to the disjoint union of a collection of other classes.",
   :rdf/type :rdf/Property})

(def disjointWith
  "The property that determines that two given classes are disjoint."
  {:rdfs/range :owl/Class,
   :rdfs/label "disjoint with",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Class,
   :rdfs/comment
     "The property that determines that two given classes are disjoint.",
   :rdf/type :rdf/Property})

(def distinctMembers
  "The property that determines the collection of pairwise different individuals in a owl:AllDifferent axiom."
  {:rdfs/range :rdf/List,
   :rdfs/label "distinct members",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/AllDifferent,
   :rdfs/comment
     "The property that determines the collection of pairwise different individuals in a owl:AllDifferent axiom.",
   :rdf/type :rdf/Property})

(def equivalentClass
  "The property that determines that two given classes are equivalent, and that is used to specify datatype definitions."
  {:rdfs/range :rdfs/Class,
   :rdfs/label "equivalent class",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Class,
   :rdfs/comment
     "The property that determines that two given classes are equivalent, and that is used to specify datatype definitions.",
   :rdf/type :rdf/Property})

(def equivalentProperty
  "The property that determines that two given properties are equivalent."
  {:rdfs/range :rdf/Property,
   :rdfs/label "equivalent property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdf/Property,
   :rdfs/comment
     "The property that determines that two given properties are equivalent.",
   :rdf/type :rdf/Property})

(def hasKey
  "The property that determines the collection of properties that jointly build a key."
  {:rdfs/range :rdf/List,
   :rdfs/label "has key",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Class,
   :rdfs/comment
     "The property that determines the collection of properties that jointly build a key.",
   :rdf/type :rdf/Property})

(def hasSelf
  "The property that determines the property that a self restriction refers to."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "has self",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the property that a self restriction refers to.",
   :rdf/type :rdf/Property})

(def hasValue
  "The property that determines the individual that a has-value restriction refers to."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "has value",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the individual that a has-value restriction refers to.",
   :rdf/type :rdf/Property})

(def imports
  "The property that is used for importing other ontologies into a given ontology."
  {:rdfs/range :owl/Ontology,
   :rdfs/label "imports",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Ontology,
   :rdfs/comment
     "The property that is used for importing other ontologies into a given ontology.",
   :rdf/type :owl/OntologyProperty})

(def incompatibleWith
  "The annotation property that indicates that a given ontology is incompatible with another ontology."
  {:rdfs/range :owl/Ontology,
   :rdfs/label "incompatible with",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Ontology,
   :rdfs/comment
     "The annotation property that indicates that a given ontology is incompatible with another ontology.",
   :rdf/type [:owl/OntologyProperty :owl/AnnotationProperty]})

(def intersectionOf
  "The property that determines the collection of classes or data ranges that build an intersection."
  {:rdfs/range :rdf/List,
   :rdfs/label "intersection of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Class,
   :rdfs/comment
     "The property that determines the collection of classes or data ranges that build an intersection.",
   :rdf/type :rdf/Property})

(def inverseOf
  "The property that determines that two given properties are inverse."
  {:rdfs/range :owl/ObjectProperty,
   :rdfs/label "inverse of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/ObjectProperty,
   :rdfs/comment
     "The property that determines that two given properties are inverse.",
   :rdf/type :rdf/Property})

(def maxCardinality
  "The property that determines the cardinality of a maximum cardinality restriction."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/label "max cardinality",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the cardinality of a maximum cardinality restriction.",
   :rdf/type :rdf/Property})

(def maxQualifiedCardinality
  "The property that determines the cardinality of a maximum qualified cardinality restriction."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/label "max qualified cardinality",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the cardinality of a maximum qualified cardinality restriction.",
   :rdf/type :rdf/Property})

(def members
  "The property that determines the collection of members in either a owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties axiom."
  {:rdfs/range :rdf/List,
   :rdfs/label "members",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment
     "The property that determines the collection of members in either a owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties axiom.",
   :rdf/type :rdf/Property})

(def minCardinality
  "The property that determines the cardinality of a minimum cardinality restriction."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/label "min cardinality",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the cardinality of a minimum cardinality restriction.",
   :rdf/type :rdf/Property})

(def minQualifiedCardinality
  "The property that determines the cardinality of a minimum qualified cardinality restriction."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/label "min qualified cardinality",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the cardinality of a minimum qualified cardinality restriction.",
   :rdf/type :rdf/Property})

(def onClass
  "The property that determines the class that a qualified object cardinality restriction refers to."
  {:rdfs/range :owl/Class,
   :rdfs/label "on class",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the class that a qualified object cardinality restriction refers to.",
   :rdf/type :rdf/Property})

(def onDataRange
  "The property that determines the data range that a qualified data cardinality restriction refers to."
  {:rdfs/range :rdfs/Datatype,
   :rdfs/label "on data range",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the data range that a qualified data cardinality restriction refers to.",
   :rdf/type :rdf/Property})

(def onDatatype
  "The property that determines the datatype that a datatype restriction refers to."
  {:rdfs/range :rdfs/Datatype,
   :rdfs/label "on datatype",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Datatype,
   :rdfs/comment
     "The property that determines the datatype that a datatype restriction refers to.",
   :rdf/type :rdf/Property})

(def onProperties
  "The property that determines the n-tuple of properties that a property restriction on an n-ary data range refers to."
  {:rdfs/range :rdf/List,
   :rdfs/label "on properties",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the n-tuple of properties that a property restriction on an n-ary data range refers to.",
   :rdf/type :rdf/Property})

(def onProperty
  "The property that determines the property that a property restriction refers to."
  {:rdfs/range :rdf/Property,
   :rdfs/label "on property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the property that a property restriction refers to.",
   :rdf/type :rdf/Property})

(def oneOf
  "The property that determines the collection of individuals or data values that build an enumeration."
  {:rdfs/range :rdf/List,
   :rdfs/label "one of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Class,
   :rdfs/comment
     "The property that determines the collection of individuals or data values that build an enumeration.",
   :rdf/type :rdf/Property})

(def priorVersion
  "The annotation property that indicates the predecessor ontology of a given ontology."
  {:rdfs/range :owl/Ontology,
   :rdfs/label "prior version",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Ontology,
   :rdfs/comment
     "The annotation property that indicates the predecessor ontology of a given ontology.",
   :rdf/type [:owl/OntologyProperty :owl/AnnotationProperty]})

(def propertyChainAxiom
  "The property that determines the n-tuple of properties that build a sub property chain of a given property."
  {:rdfs/range :rdf/List,
   :rdfs/label "property chain axiom",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/ObjectProperty,
   :rdfs/comment
     "The property that determines the n-tuple of properties that build a sub property chain of a given property.",
   :rdf/type :rdf/Property})

(def propertyDisjointWith
  "The property that determines that two given properties are disjoint."
  {:rdfs/range :rdf/Property,
   :rdfs/label "property disjoint with",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdf/Property,
   :rdfs/comment
     "The property that determines that two given properties are disjoint.",
   :rdf/type :rdf/Property})

(def qualifiedCardinality
  "The property that determines the cardinality of an exact qualified cardinality restriction."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/label "qualified cardinality",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the cardinality of an exact qualified cardinality restriction.",
   :rdf/type :rdf/Property})

(def sameAs
  "The property that determines that two given individuals are equal."
  {:rdfs/range :owl/Thing,
   :rdfs/label "same as",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment
     "The property that determines that two given individuals are equal.",
   :rdf/type :rdf/Property})

(def someValuesFrom
  "The property that determines the class that an existential property restriction refers to."
  {:rdfs/range :rdfs/Class,
   :rdfs/label "some values from",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Restriction,
   :rdfs/comment
     "The property that determines the class that an existential property restriction refers to.",
   :rdf/type :rdf/Property})

(def sourceIndividual
  "The property that determines the subject of a negative property assertion."
  {:rdfs/range :owl/Thing,
   :rdfs/label "source individual",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/comment
     "The property that determines the subject of a negative property assertion.",
   :rdf/type :rdf/Property})

(def targetIndividual
  "The property that determines the object of a negative object property assertion."
  {:rdfs/range :owl/Thing,
   :rdfs/label "target individual",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/comment
     "The property that determines the object of a negative object property assertion.",
   :rdf/type :rdf/Property})

(def targetValue
  "The property that determines the value of a negative data property assertion."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "target value",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/comment
     "The property that determines the value of a negative data property assertion.",
   :rdf/type :rdf/Property})

(def topDataProperty
  "The data property that relates every individual to every data value."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "top data property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment
     "The data property that relates every individual to every data value.",
   :rdf/type :owl/DatatypeProperty})

(def topObjectProperty
  "The object property that relates every two individuals."
  {:rdfs/range :owl/Thing,
   :rdfs/label "top object property",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment "The object property that relates every two individuals.",
   :rdf/type :owl/ObjectProperty})

(def unionOf
  "The property that determines the collection of classes or data ranges that build a union."
  {:rdfs/range :rdf/List,
   :rdfs/label "union of",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Class,
   :rdfs/comment
     "The property that determines the collection of classes or data ranges that build a union.",
   :rdf/type :rdf/Property})

(def versionIRI
  "The property that identifies the version IRI of an ontology."
  {:rdfs/range :owl/Ontology,
   :rdfs/label "version IRI",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :owl/Ontology,
   :rdfs/comment "The property that identifies the version IRI of an ontology.",
   :rdf/type :owl/OntologyProperty})

(def versionInfo
  "The annotation property that provides version information for an ontology or another OWL construct."
  {:rdfs/range :rdfs/Resource,
   :rdfs/label "version info",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Resource,
   :rdfs/comment
     "The annotation property that provides version information for an ontology or another OWL construct.",
   :rdf/type :owl/AnnotationProperty})

(def withRestrictions
  "The property that determines the collection of facet-value pairs that define a datatype restriction."
  {:rdfs/range :rdf/List,
   :rdfs/label "with restrictions",
   :rdfs/isDefinedBy #:rdf{:uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/domain :rdfs/Datatype,
   :rdfs/comment
     "The property that determines the collection of facet-value pairs that define a datatype restriction.",
   :rdf/type :rdf/Property})