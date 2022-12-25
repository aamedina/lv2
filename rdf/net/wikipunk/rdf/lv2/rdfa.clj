(ns net.wikipunk.rdf.lv2.rdfa
  "RDFa Vocabulary for Term and Prefix Assignment, and for Processor Graph Reporting"
  {:dcat/downloadURL "https://www.w3.org/ns/rdfa",
   :dcterms/creator {:rdf/uri "http://www.ivan-herman.net/foaf#me"},
   :dcterms/date "2013-01-18",
   :dcterms/description
   "This document describes the RDFa Vocabulary for Term and Prefix Assignment. The Vocabulary is used to modify RDFa 1.1 processing behavior.",
   :dcterms/publisher {:rdf/uri "http://www.w3.org/data#W3C"},
   :dcterms/title
   "RDFa Vocabulary for Term and Prefix Assignment, and for Processor Graph Reporting",
   :owl/versionInfo "$Date: 2013-03-11 07:54:23 $",
   :rdf/about {:rdf/uri "http://www.w3.org/ns/rdfa#"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfa"    "http://www.w3.org/ns/rdfa#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/rdfa-core/#s_initialcontexts"},
   :vann/preferredNamespacePrefix "rdfa",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/rdfa#"})

(def DocumentError
  {:dcterms/description
   "error condition; to be used when the document fails to be fully processed as a result of non-conformant host language markup",
   :rdf/about :rdfa/DocumentError,
   :rdfs/subClassOf :rdfa/Error})

(def ErrorClass
  {:dcterms/description "is the class for all error conditions",
   :rdf/about           :rdfa/Error,
   :rdfs/subClassOf     :rdfa/PGClass})

(def Info
  {:dcterms/description "is the class for all informations",
   :rdf/about           :rdfa/Info,
   :rdfs/subClassOf     :rdfa/PGClass})

(def PGClass
  {:dcterms/description "is the top level class of the hierarchy",
   :rdf/about :rdfa/PGClass,
   :rdf/type  [:owl/Class :rdfs/Class]})

(def Pattern
  {:dcterms/description
   "Class to identify an (RDF) resource whose properties are to be copied to another resource",
   :rdf/about :rdfa/Pattern,
   :rdf/type  [:owl/Class :rdfs/Class]})

(def PrefixMapping
  {:dcterms/description "is the class for prefix mappings",
   :rdf/about           :rdfa/PrefixMapping,
   :rdfs/subClassOf     :rdfa/PrefixOrTermMapping})

(def PrefixOrTermMapping
  {:dcterms/description "is the top level class for prefix or term mappings",
   :rdf/about :rdfa/PrefixOrTermMapping,
   :rdf/type  [:owl/Class :rdfs/Class]})

(def PrefixRedefinition
  {:dcterms/description
   "warning; to be used when a prefix, either from the initial context or inherited from an ancestor node, is redefined in an element",
   :rdf/about :rdfa/PrefixRedefinition,
   :rdfs/subClassOf :rdfa/Warning})

(def TermMapping
  {:dcterms/description "is the class for term mappings",
   :rdf/about           :rdfa/TermMapping,
   :rdfs/subClassOf     :rdfa/PrefixOrTermMapping})

(def UnresolvedCURIE
  {:dcterms/description
   "warning; to be used when a CURIE prefix fails to be resolved",
   :rdf/about :rdfa/UnresolvedCURIE,
   :rdfs/subClassOf :rdfa/Warning})

(def UnresolvedTerm
  {:dcterms/description "warning; to be used when a Term fails to be resolved",
   :rdf/about           :rdfa/UnresolvedTerm,
   :rdfs/subClassOf     :rdfa/Warning})

(def VocabReferenceError
  {:dcterms/description
   "warning; to be used when the value of a @vocab attribute cannot be dereferenced, hence the vocabulary expansion cannot be completed",
   :rdf/about :rdfa/VocabReferenceError,
   :rdfs/subClassOf :rdfa/Warning})

(def Warning
  {:dcterms/description "is the class for all warnings",
   :rdf/about           :rdfa/Warning,
   :rdfs/subClassOf     :rdfa/PGClass})

(def context
  {:dcterms/description
   "provides extra context for the error, eg, http response, an XPointer/XPath information, or simply the URI that created the error",
   :rdf/about :rdfa/context,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :rdfa/PGClass})

(def copy
  {:dcterms/description
   "identifies the resource (i.e., pattern) whose properties and values should be copied to replace the current triple (retaining the subject of the triple).",
   :rdf/about :rdfa/copy,
   :rdf/type  [:owl/ObjectProperty :rdf/Property]})

(def prefix
  {:dcterms/description
   "defines a prefix mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/about :rdfa/prefix,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :rdfa/PrefixMapping})

(def term
  {:dcterms/description
   "defines a term mapping for a URI; the value is supposed to be a NMTOKEN",
   :rdf/about :rdfa/term,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :rdfa/TermMapping})

(def uri
  {:dcterms/description
   "defines the URI for either a prefix or a term mapping; the value is supposed to be an absolute URI",
   :rdf/about :rdfa/uri,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :rdfa/PrefixOrTermMapping})

(def usesVocabulary
  {:dcterms/description
   "provides a relationship between the host document and a vocabulary\n\tdefined using the @vocab facility of RDFa1.1",
   :rdf/about :rdfa/usesVocabulary,
   :rdf/type  [:owl/ObjectProperty :rdf/Property]})

(def vocabulary
  {:dcterms/description
   "defines an absolute URI to be used as a default vocabulary; the value is can be any string; for documentation purposes it is advised to use the string 'true' or 'True'.",
   :rdf/about :rdfa/vocabulary,
   :rdf/type  [:owl/DatatypeProperty :rdf/Property]})