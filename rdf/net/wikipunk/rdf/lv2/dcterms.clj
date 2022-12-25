(ns net.wikipunk.rdf.lv2.dcterms
  "This version of the DCMI Terms vocabulary has been heavily trimmed for LV2."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/dcterms.ttl",
   :dcterms/modified "2010-10-11",
   :rdf/about #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dcterms",
   :vann/preferredNamespaceUri "http://purl.org/dc/terms/"}
  (:refer-clojure :exclude [format]))

(def Agent
  "A resource that acts or has the power to act."
  {:dcterms/description
   "Examples of Agent include person, organization, and software agent.",
   :rdf/about :dcterms/Agent,
   :rdf/type [:rdfs/Class :dcterms/AgentClass],
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "Agent"})

(def AgentClass
  "A group of agents."
  {:dcterms/description
   "Examples of Agent Class include groups seen as classes, such as students, women, charities, lecturers.",
   :rdf/about :dcterms/AgentClass,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "Agent Class"})

(def LicenseDocument
  "A legal document giving official permission to do something with a Resource."
  {:rdf/about        :dcterms/LicenseDocument,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "License Document",
   :rdfs/subClassOf  :dcterms/RightsStatement})

(def LinguisticSystem
  "A system of signs, symbols, sounds, gestures, or rules used in communication."
  {:dcterms/description
   "Examples include written, spoken, sign, and computer languages.",
   :rdf/about :dcterms/LinguisticSystem,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "Linguistic System"})

(def MediaType
  "A file format or physical medium."
  {:rdf/about        :dcterms/MediaType,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "Media Type",
   :rdfs/subClassOf  :dcterms/MediaTypeOrExtent})

(def MediaTypeOrExtent
  "A media type or extent."
  {:rdf/about        :dcterms/MediaTypeOrExtent,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "Media Type or Extent"})

(def RightsStatement
  "A statement about the intellectual property rights (IPR) held in or over a Resource, a legal document giving official permission to do something with a resource, or a statement about access rights."
  {:rdf/about        :dcterms/RightsStatement,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "Rights Statement"})

(def Standard
  "A basis for comparison; a reference point against which other things can be evaluated."
  {:rdf/about        :dcterms/Standard,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "Standard"})

(def URI
  "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."
  {:rdf/about        :dcterms/URI,
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "URI",
   :rdfs/seeAlso     #:rdf{:uri "http://www.ietf.org/rfc/rfc3986.txt"}})

(def W3CDTF
  "The set of dates and times constructed according to the W3C Date and Time Formats Specification."
  {:rdf/about        :dcterms/W3CDTF,
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "W3C-DTF",
   :rdfs/seeAlso     #:rdf{:uri "http://www.w3.org/TR/NOTE-datetime"}})

(def abstract
  "A summary of the resource."
  {:rdf/about          :dcterms/abstract,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "Abstract",
   :rdfs/subPropertyOf :dcterms/description})

(def alternative
  "An alternative name for the resource."
  {:dcterms/description
   "The distinction between titles and alternative titles is application-specific.",
   :rdf/about :dcterms/alternative,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "alternative title",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/title})

(def available
  "Date (often a range) that the resource became or will become available."
  {:rdf/about          :dcterms/available,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "date available",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def conformsTo
  "An established standard to which the described resource conforms."
  {:rdf/about          :dcterms/conformsTo,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "conforms to",
   :rdfs/range         :dcterms/Standard,
   :rdfs/subPropertyOf :dcterms/relation})

(def contributor
  "An entity responsible for making contributions to the resource."
  {:dcterms/description
   "Examples of a Contributor include a person, an organization, or a service.",
   :rdf/about :dcterms/contributor,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "contributor",
   :rdfs/range :dcterms/Agent})

(def created
  "Date of creation of the resource."
  {:rdf/about          :dcterms/created,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "date created",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def creator
  "An entity primarily responsible for making the resource."
  {:dcterms/description
   "Examples of a Creator include a person, an organization, or a service.",
   :owl/equivalentProperty #:rdf{:uri "http://xmlns.com/foaf/0.1/maker"},
   :rdf/about :dcterms/creator,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "creator",
   :rdfs/range :dcterms/Agent,
   :rdfs/subPropertyOf :dcterms/contributor})

(def date
  "A point or period of time associated with an event in the lifecycle of the resource."
  {:dcterms/description
   "Date may be used to express temporal information at any level of granularity.  Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF].",
   :rdf/about :dcterms/date,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "date",
   :rdfs/range :rdfs/Literal})

(def dateAccepted
  "Date of acceptance of the resource."
  {:dcterms/description
   "Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal).",
   :rdf/about :dcterms/dateAccepted,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "date accepted",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def dateCopyrighted
  "Date of copyright."
  {:rdf/about          :dcterms/dateCopyrighted,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "date copyrighted",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def dateSubmitted
  "Date of submission of the resource."
  {:dcterms/description
   "Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal).",
   :rdf/about :dcterms/dateSubmitted,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "date submitted",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def description
  "An account of the resource."
  {:dcterms/description
   "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.",
   :rdf/about :dcterms/description,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "description"})

(def format
  "The file format, physical medium, or dimensions of the resource."
  {:dcterms/description
   "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME].",
   :rdf/about :dcterms/format,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "format",
   :rdfs/range :dcterms/MediaTypeOrExtent})

(def hasFormat
  "A related resource that is substantially the same as the pre-existing described resource, but in another format."
  {:rdf/about          :dcterms/hasFormat,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "has format",
   :rdfs/subPropertyOf :dcterms/relation})

(def hasPart
  "A related resource that is included either physically or logically in the described resource."
  {:rdf/about          :dcterms/hasPart,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "has part",
   :rdfs/subPropertyOf :dcterms/relation})

(def hasVersion
  "A related resource that is a version, edition, or adaptation of the described resource."
  {:rdf/about          :dcterms/hasVersion,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "has version",
   :rdfs/subPropertyOf :dcterms/relation})

(def isFormatOf
  "A related resource that is substantially the same as the described resource, but in another format."
  {:rdf/about          :dcterms/isFormatOf,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "is format of",
   :rdfs/subPropertyOf :dcterms/relation})

(def isPartOf
  "A related resource in which the described resource is physically or logically included."
  {:rdf/about          :dcterms/isPartOf,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "is part of",
   :rdfs/subPropertyOf :dcterms/relation})

(def isReferencedBy
  "A related resource that references, cites, or otherwise points to the described resource."
  {:rdf/about          :dcterms/isReferencedBy,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "is referenced by",
   :rdfs/subPropertyOf :dcterms/relation})

(def isReplacedBy
  "A related resource that supplants, displaces, or supersedes the described resource."
  {:rdf/about          :dcterms/isReplacedBy,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "is replaced by",
   :rdfs/subPropertyOf :dcterms/relation})

(def isRequiredBy
  "A related resource that requires the described resource to support its function, delivery, or coherence."
  {:rdf/about          :dcterms/isRequiredBy,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "is required by",
   :rdfs/subPropertyOf :dcterms/relation})

(def isVersionOf
  "A related resource of which the described resource is a version, edition, or adaptation."
  {:dcterms/description
   "Changes in version imply substantive changes in content rather than differences in format.",
   :rdf/about :dcterms/isVersionOf,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "is version of",
   :rdfs/subPropertyOf :dcterms/relation})

(def issued
  "Date of formal issuance (e.g., publication) of the resource."
  {:rdf/about          :dcterms/issued,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "date issued",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def language
  "A language of the resource."
  {:dcterms/description
   "Recommended best practice is to use a controlled vocabulary such as RFC 4646.",
   :rdf/about :dcterms/language,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "language",
   :rdfs/range :dcterms/LinguisticSystem})

(def license
  "A legal document giving official permission to do something with the resource."
  {:rdf/about          :dcterms/license,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "license",
   :rdfs/range         :dcterms/LicenseDocument,
   :rdfs/subPropertyOf :dcterms/rights})

(def modified
  "Date on which the resource was changed."
  {:rdf/about          :dcterms/modified,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "date modified",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def publisher
  "An entity responsible for making the resource available."
  {:dcterms/description
   "Examples of a Publisher include a person, an organization, or a service.",
   :rdf/about :dcterms/publisher,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "publisher",
   :rdfs/range :dcterms/Agent})

(def references
  "A related resource that is referenced, cited, or otherwise pointed to by the described resource."
  {:rdf/about          :dcterms/references,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "references",
   :rdfs/subPropertyOf :dcterms/relation})

(def relation
  "A related resource."
  {:dcterms/description
   "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. ",
   :rdf/about :dcterms/relation,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "relation"})

(def replaces
  "A related resource that is supplanted, displaced, or superseded by the described resource."
  {:rdf/about          :dcterms/replaces,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "replaces",
   :rdfs/subPropertyOf :dcterms/relation})

(def requires
  "A related resource that is required by the described resource to support its function, delivery, or coherence."
  {:rdf/about          :dcterms/requires,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label         "requires",
   :rdfs/subPropertyOf :dcterms/relation})

(def rights
  "Information about rights held in and over the resource."
  {:dcterms/description
   "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.",
   :rdf/about :dcterms/rights,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label "rights",
   :rdfs/range :dcterms/RightsStatement})

(def rightsHolder
  "A person or organization owning or managing rights over the resource."
  {:rdf/about        :dcterms/rightsHolder,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "rights holder",
   :rdfs/range       :dcterms/Agent})

(def title
  "A name given to the resource."
  {:rdf/about        :dcterms/title,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy #:rdf{:uri "http://purl.org/dc/terms/"},
   :rdfs/label       "title",
   :rdfs/range       :rdfs/Literal})