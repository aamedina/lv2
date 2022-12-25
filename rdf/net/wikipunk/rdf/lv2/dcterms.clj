(ns net.wikipunk.rdf.lv2.dcterms
  "This version of the DCMI Terms vocabulary has been heavily trimmed for LV2."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dcterms",
   :dcterms/modified "2010-10-11",
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/dcterms.ttl",
   :rdf/about [#:rdf{:uri "http://purl.org/dc/terms/"}],
   :dcterms/title "DCMI Metadata Terms",
   :vann/preferredNamespaceUri "http://purl.org/dc/terms/",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"}}
  (:refer-clojure :exclude [format]))

(def Agent
  "A resource that acts or has the power to act."
  {:rdfs/label "Agent",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A resource that acts or has the power to act.",
   :dcterms/description
     "Examples of Agent include person, organization, and software agent.",
   :rdf/type [:rdfs/Class :dcterms/AgentClass]})

(def AgentClass
  "A group of agents."
  {:rdfs/label "Agent Class",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A group of agents.",
   :dcterms/description
     "Examples of Agent Class include groups seen as classes, such as students, women, charities, lecturers.",
   :rdf/type :rdfs/Class})

(def LicenseDocument
  "A legal document giving official permission to do something with a Resource."
  {:rdfs/subClassOf :dcterms/RightsStatement,
   :rdfs/label "License Document",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A legal document giving official permission to do something with a Resource.",
   :rdf/type :rdfs/Class})

(def LinguisticSystem
  "A system of signs, symbols, sounds, gestures, or rules used in communication."
  {:rdfs/label "Linguistic System",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A system of signs, symbols, sounds, gestures, or rules used in communication.",
   :dcterms/description
     "Examples include written, spoken, sign, and computer languages.",
   :rdf/type :rdfs/Class})

(def MediaType
  "A file format or physical medium."
  {:rdfs/subClassOf :dcterms/MediaTypeOrExtent,
   :rdfs/label "Media Type",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A file format or physical medium.",
   :rdf/type :rdfs/Class})

(def MediaTypeOrExtent
  "A media type or extent."
  {:rdfs/label "Media Type or Extent",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A media type or extent.",
   :rdf/type :rdfs/Class})

(def RightsStatement
  "A statement about the intellectual property rights (IPR) held in or over a Resource, a legal document giving official permission to do something with a resource, or a statement about access rights."
  {:rdfs/label "Rights Statement",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A statement about the intellectual property rights (IPR) held in or over a Resource, a legal document giving official permission to do something with a resource, or a statement about access rights.",
   :rdf/type :rdfs/Class})

(def Standard
  "A basis for comparison; a reference point against which other things can be evaluated."
  {:rdfs/label "Standard",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A basis for comparison; a reference point against which other things can be evaluated.",
   :rdf/type :rdfs/Class})

(def URI
  "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."
  {:rdfs/seeAlso #:rdf{:uri "http://www.ietf.org/rfc/rfc3986.txt"},
   :rdfs/label "URI",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force.",
   :rdf/type :rdfs/Datatype})

(def W3CDTF
  "The set of dates and times constructed according to the W3C Date and Time Formats Specification."
  {:rdfs/seeAlso #:rdf{:uri "http://www.w3.org/TR/NOTE-datetime"},
   :rdfs/label "W3C-DTF",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "The set of dates and times constructed according to the W3C Date and Time Formats Specification.",
   :rdf/type :rdfs/Datatype})

(def abstract
  "A summary of the resource."
  {:rdfs/subPropertyOf :dcterms/description,
   :rdfs/label "Abstract",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A summary of the resource.",
   :rdf/type :rdf/Property})

(def alternative
  "An alternative name for the resource."
  {:rdfs/subPropertyOf :dcterms/title,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "alternative title",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "An alternative name for the resource.",
   :dcterms/description
     "The distinction between titles and alternative titles is application-specific.",
   :rdf/type :rdf/Property})

(def available
  "Date (often a range) that the resource became or will become available."
  {:rdfs/subPropertyOf :dcterms/date,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "date available",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "Date (often a range) that the resource became or will become available.",
   :rdf/type :rdf/Property})

(def conformsTo
  "An established standard to which the described resource conforms."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/range :dcterms/Standard,
   :rdfs/label "conforms to",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "An established standard to which the described resource conforms.",
   :rdf/type :rdf/Property})

(def contributor
  "An entity responsible for making contributions to the resource."
  {:rdfs/range :dcterms/Agent,
   :rdfs/label "contributor",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "An entity responsible for making contributions to the resource.",
   :dcterms/description
     "Examples of a Contributor include a person, an organization, or a service.",
   :rdf/type :rdf/Property})

(def created
  "Date of creation of the resource."
  {:rdfs/subPropertyOf :dcterms/date,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "date created",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "Date of creation of the resource.",
   :rdf/type :rdf/Property})

(def creator
  "An entity primarily responsible for making the resource."
  {:rdf/type :rdf/Property,
   :owl/equivalentProperty #:rdf{:uri "http://xmlns.com/foaf/0.1/maker"},
   :rdfs/subPropertyOf :dcterms/contributor,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "creator",
   :rdfs/comment "An entity primarily responsible for making the resource.",
   :dcterms/description
     "Examples of a Creator include a person, an organization, or a service.",
   :rdfs/range :dcterms/Agent})

(def date
  "A point or period of time associated with an event in the lifecycle of the resource."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "date",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A point or period of time associated with an event in the lifecycle of the resource.",
   :dcterms/description
     "Date may be used to express temporal information at any level of granularity.  Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF].",
   :rdf/type :rdf/Property})

(def dateAccepted
  "Date of acceptance of the resource."
  {:rdfs/subPropertyOf :dcterms/date,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "date accepted",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "Date of acceptance of the resource.",
   :dcterms/description
     "Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal).",
   :rdf/type :rdf/Property})

(def dateCopyrighted
  "Date of copyright."
  {:rdfs/subPropertyOf :dcterms/date,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "date copyrighted",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "Date of copyright.",
   :rdf/type :rdf/Property})

(def dateSubmitted
  "Date of submission of the resource."
  {:rdfs/subPropertyOf :dcterms/date,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "date submitted",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "Date of submission of the resource.",
   :dcterms/description
     "Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal).",
   :rdf/type :rdf/Property})

(def description
  "An account of the resource."
  {:rdfs/label "description",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "An account of the resource.",
   :dcterms/description
     "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.",
   :rdf/type :rdf/Property})

(def format
  "The file format, physical medium, or dimensions of the resource."
  {:rdfs/range :dcterms/MediaTypeOrExtent,
   :rdfs/label "format",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "The file format, physical medium, or dimensions of the resource.",
   :dcterms/description
     "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME].",
   :rdf/type :rdf/Property})

(def hasFormat
  "A related resource that is substantially the same as the pre-existing described resource, but in another format."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "has format",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that is substantially the same as the pre-existing described resource, but in another format.",
   :rdf/type :rdf/Property})

(def hasPart
  "A related resource that is included either physically or logically in the described resource."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "has part",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that is included either physically or logically in the described resource.",
   :rdf/type :rdf/Property})

(def hasVersion
  "A related resource that is a version, edition, or adaptation of the described resource."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "has version",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that is a version, edition, or adaptation of the described resource.",
   :rdf/type :rdf/Property})

(def isFormatOf
  "A related resource that is substantially the same as the described resource, but in another format."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "is format of",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that is substantially the same as the described resource, but in another format.",
   :rdf/type :rdf/Property})

(def isPartOf
  "A related resource in which the described resource is physically or logically included."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "is part of",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource in which the described resource is physically or logically included.",
   :rdf/type :rdf/Property})

(def isReferencedBy
  "A related resource that references, cites, or otherwise points to the described resource."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "is referenced by",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that references, cites, or otherwise points to the described resource.",
   :rdf/type :rdf/Property})

(def isReplacedBy
  "A related resource that supplants, displaces, or supersedes the described resource."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "is replaced by",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that supplants, displaces, or supersedes the described resource.",
   :rdf/type :rdf/Property})

(def isRequiredBy
  "A related resource that requires the described resource to support its function, delivery, or coherence."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "is required by",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that requires the described resource to support its function, delivery, or coherence.",
   :rdf/type :rdf/Property})

(def isVersionOf
  "A related resource of which the described resource is a version, edition, or adaptation."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "is version of",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource of which the described resource is a version, edition, or adaptation.",
   :dcterms/description
     "Changes in version imply substantive changes in content rather than differences in format.",
   :rdf/type :rdf/Property})

(def issued
  "Date of formal issuance (e.g., publication) of the resource."
  {:rdfs/subPropertyOf :dcterms/date,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "date issued",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "Date of formal issuance (e.g., publication) of the resource.",
   :rdf/type :rdf/Property})

(def language
  "A language of the resource."
  {:rdfs/range :dcterms/LinguisticSystem,
   :rdfs/label "language",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A language of the resource.",
   :dcterms/description
     "Recommended best practice is to use a controlled vocabulary such as RFC 4646.",
   :rdf/type :rdf/Property})

(def license
  "A legal document giving official permission to do something with the resource."
  {:rdfs/subPropertyOf :dcterms/rights,
   :rdfs/range :dcterms/LicenseDocument,
   :rdfs/label "license",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A legal document giving official permission to do something with the resource.",
   :rdf/type :rdf/Property})

(def modified
  "Date on which the resource was changed."
  {:rdfs/subPropertyOf :dcterms/date,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "date modified",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "Date on which the resource was changed.",
   :rdf/type :rdf/Property})

(def publisher
  "An entity responsible for making the resource available."
  {:rdfs/range :dcterms/Agent,
   :rdfs/label "publisher",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "An entity responsible for making the resource available.",
   :dcterms/description
     "Examples of a Publisher include a person, an organization, or a service.",
   :rdf/type :rdf/Property})

(def references
  "A related resource that is referenced, cited, or otherwise pointed to by the described resource."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "references",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that is referenced, cited, or otherwise pointed to by the described resource.",
   :rdf/type :rdf/Property})

(def relation
  "A related resource."
  {:rdfs/label "relation",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A related resource.",
   :dcterms/description
     "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. ",
   :rdf/type :rdf/Property})

(def replaces
  "A related resource that is supplanted, displaced, or superseded by the described resource."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "replaces",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that is supplanted, displaced, or superseded by the described resource.",
   :rdf/type :rdf/Property})

(def requires
  "A related resource that is required by the described resource to support its function, delivery, or coherence."
  {:rdfs/subPropertyOf :dcterms/relation,
   :rdfs/label "requires",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A related resource that is required by the described resource to support its function, delivery, or coherence.",
   :rdf/type :rdf/Property})

(def rights
  "Information about rights held in and over the resource."
  {:rdfs/range :dcterms/RightsStatement,
   :rdfs/label "rights",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "Information about rights held in and over the resource.",
   :dcterms/description
     "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.",
   :rdf/type :rdf/Property})

(def rightsHolder
  "A person or organization owning or managing rights over the resource."
  {:rdfs/range :dcterms/Agent,
   :rdfs/label "rights holder",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment
     "A person or organization owning or managing rights over the resource.",
   :rdf/type :rdf/Property})

(def title
  "A name given to the resource."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "title",
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/comment "A name given to the resource.",
   :rdf/type :rdf/Property})