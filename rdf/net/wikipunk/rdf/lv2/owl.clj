(ns net.wikipunk.rdf.lv2.owl
  "This ontology partially describes the built-in classes and  properties that together form the basis of the RDF/XML syntax of OWL 2.  The content of this ontology is based on Tables 6.1 and 6.2  in Section 6.4 of the OWL 2 RDF-Based Semantics specification,  available at http://www.w3.org/TR/owl2-rdf-based-semantics/.  Please note that those tables do not include the different annotations  (labels, comments and rdfs:isDefinedBy links) used in this file.  Also note that the descriptions provided in this ontology do not  provide a complete and correct formal description of either the syntax  or the semantics of the introduced terms (please see the OWL 2  recommendations for the complete and normative specifications).  Furthermore, the information provided by this ontology may be  misleading if not used with care. This ontology SHOULD NOT be imported  into OWL ontologies. Importing this file into an OWL 2 DL ontology  will cause it to become an OWL 2 Full ontology and may have other,  unexpected, consequences."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/owl.ttl",
   :owl/imports {:rdf/uri "http://www.w3.org/2000/01/rdf-schema#"},
   :owl/versionIRI {:rdf/uri "http://www.w3.org/2002/07/owl"},
   :owl/versionInfo "$Date: 2009/11/15 10:54:12 $",
   :rdf/about {:rdf/uri "http://www.w3.org/2002/07/owl"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/isDefinedBy [{:rdf/uri "http://www.w3.org/TR/owl2-syntax/"}
                      {:rdf/uri "http://www.w3.org/TR/owl2-mapping-to-rdf/"}
                      {:rdf/uri
                       "http://www.w3.org/TR/owl2-rdf-based-semantics/"}],
   :rdfs/seeAlso
   [{:rdf/uri
     "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-properties"}
    {:rdf/uri
     "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-classes"}],
   :vann/preferredNamespacePrefix "owl",
   :vann/preferredNamespaceUri "http://www.w3.org/2002/07/owl"}
  (:refer-clojure :exclude []))

(def AllDifferent
  "The class of collections of pairwise different individuals."
  {:rdf/about        :owl/AllDifferent,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AllDifferent",
   :rdfs/subClassOf  :rdfs/Resource})

(def AllDisjointClasses
  "The class of collections of pairwise disjoint classes."
  {:rdf/about        :owl/AllDisjointClasses,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AllDisjointClasses",
   :rdfs/subClassOf  :rdfs/Resource})

(def AllDisjointProperties
  "The class of collections of pairwise disjoint properties."
  {:rdf/about        :owl/AllDisjointProperties,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AllDisjointProperties",
   :rdfs/subClassOf  :rdfs/Resource})

(def Annotation
  "The class of annotated annotations for which the RDF serialization consists of an annotated subject, predicate and object."
  {:rdf/about        :owl/Annotation,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Annotation",
   :rdfs/subClassOf  :rdfs/Resource})

(def AnnotationProperty
  "The class of annotation properties."
  {:rdf/about        :owl/AnnotationProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AnnotationProperty",
   :rdfs/subClassOf  :rdf/Property})

(def AsymmetricProperty
  "The class of asymmetric properties."
  {:rdf/about        :owl/AsymmetricProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AsymmetricProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Axiom
  "The class of annotated axioms for which the RDF serialization consists of an annotated subject, predicate and object."
  {:rdf/about        :owl/Axiom,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Axiom",
   :rdfs/subClassOf  :rdfs/Resource})

(def T
  "The class of OWL classes."
  {:rdf/about        :owl/Class,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Class",
   :rdfs/subClassOf  :rdfs/Class})

(def DatatypeProperty
  "The class of data properties."
  {:rdf/about        :owl/DatatypeProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DatatypeProperty",
   :rdfs/subClassOf  :rdf/Property})

(def DeprecatedClass
  "The class of deprecated classes."
  {:rdf/about        :owl/DeprecatedClass,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DeprecatedClass",
   :rdfs/subClassOf  :rdfs/Class})

(def DeprecatedProperty
  "The class of deprecated properties."
  {:rdf/about        :owl/DeprecatedProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DeprecatedProperty",
   :rdfs/subClassOf  :rdf/Property})

(def FunctionalProperty
  "The class of functional properties."
  {:rdf/about        :owl/FunctionalProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "FunctionalProperty",
   :rdfs/subClassOf  :rdf/Property})

(def InverseFunctionalProperty
  "The class of inverse-functional properties."
  {:rdf/about        :owl/InverseFunctionalProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "InverseFunctionalProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def IrreflexiveProperty
  "The class of irreflexive properties."
  {:rdf/about        :owl/IrreflexiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "IrreflexiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def NamedIndividual
  "The class of named individuals."
  {:rdf/about        :owl/NamedIndividual,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "NamedIndividual",
   :rdfs/subClassOf  :owl/Thing})

(def NegativePropertyAssertion
  "The class of negative property assertions."
  {:rdf/about        :owl/NegativePropertyAssertion,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "NegativePropertyAssertion",
   :rdfs/subClassOf  :rdfs/Resource})

(def Nothing
  "This is the empty class."
  {:rdf/about        :owl/Nothing,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Nothing",
   :rdfs/subClassOf  :owl/Thing})

(def ObjectProperty
  "The class of object properties."
  {:rdf/about        :owl/ObjectProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "ObjectProperty",
   :rdfs/subClassOf  :rdf/Property})

(def Ontology
  "The class of ontologies."
  {:rdf/about        :owl/Ontology,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Ontology",
   :rdfs/subClassOf  :rdfs/Resource})

(def OntologyProperty
  "The class of ontology properties."
  {:rdf/about        :owl/OntologyProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "OntologyProperty",
   :rdfs/subClassOf  :rdf/Property})

(def ReflexiveProperty
  "The class of reflexive properties."
  {:rdf/about        :owl/ReflexiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "ReflexiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Restriction
  "The class of property restrictions."
  {:rdf/about        :owl/Restriction,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Restriction",
   :rdfs/subClassOf  :owl/Class})

(def SymmetricProperty
  "The class of symmetric properties."
  {:rdf/about        :owl/SymmetricProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "SymmetricProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Thing
  "The class of OWL individuals."
  {:rdf/about        :owl/Thing,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Thing"})

(def TransitiveProperty
  "The class of transitive properties."
  {:rdf/about        :owl/TransitiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "TransitiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def allValuesFrom
  "The property that determines the class that a universal property restriction refers to."
  {:rdf/about        :owl/allValuesFrom,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "all values from",
   :rdfs/range       :rdfs/Class})

(def annotatedProperty
  "The property that determines the predicate of an annotated axiom or annotated annotation."
  {:rdf/about        :owl/annotatedProperty,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "annotated property",
   :rdfs/range       :rdfs/Resource})

(def annotatedSource
  "The property that determines the subject of an annotated axiom or annotated annotation."
  {:rdf/about        :owl/annotatedSource,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "annotated source",
   :rdfs/range       :rdfs/Resource})

(def annotatedTarget
  "The property that determines the object of an annotated axiom or annotated annotation."
  {:rdf/about        :owl/annotatedTarget,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "annotated target",
   :rdfs/range       :rdfs/Resource})

(def assertionProperty
  "The property that determines the predicate of a negative property assertion."
  {:rdf/about        :owl/assertionProperty,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "assertion property",
   :rdfs/range       :rdf/Property})

(def backwardCompatibleWith
  "The annotation property that indicates that a given ontology is backward compatible with another ontology."
  {:rdf/about        :owl/backwardCompatibleWith,
   :rdf/type         [:owl/OntologyProperty :owl/AnnotationProperty],
   :rdfs/domain      :owl/Ontology,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "backward compatible with",
   :rdfs/range       :owl/Ontology})

(def bottomDataProperty
  "The data property that does not relate any individual to any data value."
  {:rdf/about        :owl/bottomDataProperty,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "bottom data property",
   :rdfs/range       :rdfs/Literal})

(def bottomObjectProperty
  "The object property that does not relate any two individuals."
  {:rdf/about        :owl/bottomObjectProperty,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "bottom object property",
   :rdfs/range       :owl/Thing})

(def cardinality
  "The property that determines the cardinality of an exact cardinality restriction."
  {:rdf/about        :owl/cardinality,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "cardinality",
   :rdfs/range       :xsd/nonNegativeInteger})

(def complementOf
  "The property that determines that a given class is the complement of another class."
  {:rdf/about        :owl/complementOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "complement of",
   :rdfs/range       :owl/Class})

(def datatypeComplementOf
  "The property that determines that a given data range is the complement of another data range with respect to the data domain."
  {:rdf/about        :owl/datatypeComplementOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Datatype,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "datatype complement of",
   :rdfs/range       :rdfs/Datatype})

(def deprecated
  "The annotation property that indicates that a given entity has been deprecated."
  {:rdf/about        :owl/deprecated,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "deprecated",
   :rdfs/range       :rdfs/Resource})

(def differentFrom
  "The property that determines that two given individuals are different."
  {:rdf/about        :owl/differentFrom,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "different from",
   :rdfs/range       :owl/Thing})

(def disjointUnionOf
  "The property that determines that a given class is equivalent to the disjoint union of a collection of other classes."
  {:rdf/about        :owl/disjointUnionOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "disjoint union of",
   :rdfs/range       :rdf/List})

(def disjointWith
  "The property that determines that two given classes are disjoint."
  {:rdf/about        :owl/disjointWith,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "disjoint with",
   :rdfs/range       :owl/Class})

(def distinctMembers
  "The property that determines the collection of pairwise different individuals in a owl:AllDifferent axiom."
  {:rdf/about        :owl/distinctMembers,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/AllDifferent,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "distinct members",
   :rdfs/range       :rdf/List})

(def equivalentClass
  "The property that determines that two given classes are equivalent, and that is used to specify datatype definitions."
  {:rdf/about        :owl/equivalentClass,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "equivalent class",
   :rdfs/range       :rdfs/Class})

(def equivalentProperty
  "The property that determines that two given properties are equivalent."
  {:rdf/about        :owl/equivalentProperty,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "equivalent property",
   :rdfs/range       :rdf/Property})

(def hasKey
  "The property that determines the collection of properties that jointly build a key."
  {:rdf/about        :owl/hasKey,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "has key",
   :rdfs/range       :rdf/List})

(def hasSelf
  "The property that determines the property that a self restriction refers to."
  {:rdf/about        :owl/hasSelf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "has self",
   :rdfs/range       :rdfs/Resource})

(def hasValue
  "The property that determines the individual that a has-value restriction refers to."
  {:rdf/about        :owl/hasValue,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "has value",
   :rdfs/range       :rdfs/Resource})

(def imports
  "The property that is used for importing other ontologies into a given ontology."
  {:rdf/about        :owl/imports,
   :rdf/type         :owl/OntologyProperty,
   :rdfs/domain      :owl/Ontology,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "imports",
   :rdfs/range       :owl/Ontology})

(def incompatibleWith
  "The annotation property that indicates that a given ontology is incompatible with another ontology."
  {:rdf/about        :owl/incompatibleWith,
   :rdf/type         [:owl/OntologyProperty :owl/AnnotationProperty],
   :rdfs/domain      :owl/Ontology,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "incompatible with",
   :rdfs/range       :owl/Ontology})

(def intersectionOf
  "The property that determines the collection of classes or data ranges that build an intersection."
  {:rdf/about        :owl/intersectionOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "intersection of",
   :rdfs/range       :rdf/List})

(def inverseOf
  "The property that determines that two given properties are inverse."
  {:rdf/about        :owl/inverseOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "inverse of",
   :rdfs/range       :owl/ObjectProperty})

(def maxCardinality
  "The property that determines the cardinality of a maximum cardinality restriction."
  {:rdf/about        :owl/maxCardinality,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "max cardinality",
   :rdfs/range       :xsd/nonNegativeInteger})

(def maxQualifiedCardinality
  "The property that determines the cardinality of a maximum qualified cardinality restriction."
  {:rdf/about        :owl/maxQualifiedCardinality,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "max qualified cardinality",
   :rdfs/range       :xsd/nonNegativeInteger})

(def members
  "The property that determines the collection of members in either a owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties axiom."
  {:rdf/about        :owl/members,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "members",
   :rdfs/range       :rdf/List})

(def minCardinality
  "The property that determines the cardinality of a minimum cardinality restriction."
  {:rdf/about        :owl/minCardinality,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "min cardinality",
   :rdfs/range       :xsd/nonNegativeInteger})

(def minQualifiedCardinality
  "The property that determines the cardinality of a minimum qualified cardinality restriction."
  {:rdf/about        :owl/minQualifiedCardinality,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "min qualified cardinality",
   :rdfs/range       :xsd/nonNegativeInteger})

(def onClass
  "The property that determines the class that a qualified object cardinality restriction refers to."
  {:rdf/about        :owl/onClass,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "on class",
   :rdfs/range       :owl/Class})

(def onDataRange
  "The property that determines the data range that a qualified data cardinality restriction refers to."
  {:rdf/about        :owl/onDataRange,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "on data range",
   :rdfs/range       :rdfs/Datatype})

(def onDatatype
  "The property that determines the datatype that a datatype restriction refers to."
  {:rdf/about        :owl/onDatatype,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Datatype,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "on datatype",
   :rdfs/range       :rdfs/Datatype})

(def onProperties
  "The property that determines the n-tuple of properties that a property restriction on an n-ary data range refers to."
  {:rdf/about        :owl/onProperties,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "on properties",
   :rdfs/range       :rdf/List})

(def onProperty
  "The property that determines the property that a property restriction refers to."
  {:rdf/about        :owl/onProperty,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "on property",
   :rdfs/range       :rdf/Property})

(def oneOf
  "The property that determines the collection of individuals or data values that build an enumeration."
  {:rdf/about        :owl/oneOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "one of",
   :rdfs/range       :rdf/List})

(def priorVersion
  "The annotation property that indicates the predecessor ontology of a given ontology."
  {:rdf/about        :owl/priorVersion,
   :rdf/type         [:owl/OntologyProperty :owl/AnnotationProperty],
   :rdfs/domain      :owl/Ontology,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "prior version",
   :rdfs/range       :owl/Ontology})

(def propertyChainAxiom
  "The property that determines the n-tuple of properties that build a sub property chain of a given property."
  {:rdf/about        :owl/propertyChainAxiom,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "property chain axiom",
   :rdfs/range       :rdf/List})

(def propertyDisjointWith
  "The property that determines that two given properties are disjoint."
  {:rdf/about        :owl/propertyDisjointWith,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdf/Property,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "property disjoint with",
   :rdfs/range       :rdf/Property})

(def qualifiedCardinality
  "The property that determines the cardinality of an exact qualified cardinality restriction."
  {:rdf/about        :owl/qualifiedCardinality,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "qualified cardinality",
   :rdfs/range       :xsd/nonNegativeInteger})

(def sameAs
  "The property that determines that two given individuals are equal."
  {:rdf/about        :owl/sameAs,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "same as",
   :rdfs/range       :owl/Thing})

(def someValuesFrom
  "The property that determines the class that an existential property restriction refers to."
  {:rdf/about        :owl/someValuesFrom,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/Restriction,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "some values from",
   :rdfs/range       :rdfs/Class})

(def sourceIndividual
  "The property that determines the subject of a negative property assertion."
  {:rdf/about        :owl/sourceIndividual,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "source individual",
   :rdfs/range       :owl/Thing})

(def targetIndividual
  "The property that determines the object of a negative object property assertion."
  {:rdf/about        :owl/targetIndividual,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "target individual",
   :rdfs/range       :owl/Thing})

(def targetValue
  "The property that determines the value of a negative data property assertion."
  {:rdf/about        :owl/targetValue,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "target value",
   :rdfs/range       :rdfs/Literal})

(def topDataProperty
  "The data property that relates every individual to every data value."
  {:rdf/about        :owl/topDataProperty,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "top data property",
   :rdfs/range       :rdfs/Literal})

(def topObjectProperty
  "The object property that relates every two individuals."
  {:rdf/about        :owl/topObjectProperty,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "top object property",
   :rdfs/range       :owl/Thing})

(def unionOf
  "The property that determines the collection of classes or data ranges that build a union."
  {:rdf/about        :owl/unionOf,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "union of",
   :rdfs/range       :rdf/List})

(def versionIRI
  "The property that identifies the version IRI of an ontology."
  {:rdf/about        :owl/versionIRI,
   :rdf/type         :owl/OntologyProperty,
   :rdfs/domain      :owl/Ontology,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "version IRI",
   :rdfs/range       :owl/Ontology})

(def versionInfo
  "The annotation property that provides version information for an ontology or another OWL construct."
  {:rdf/about        :owl/versionInfo,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "version info",
   :rdfs/range       :rdfs/Resource})

(def withRestrictions
  "The property that determines the collection of facet-value pairs that define a datatype restriction."
  {:rdf/about        :owl/withRestrictions,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :rdfs/Datatype,
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "with restrictions",
   :rdfs/range       :rdf/List})