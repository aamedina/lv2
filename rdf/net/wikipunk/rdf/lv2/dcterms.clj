(ns net.wikipunk.rdf.lv2.dcterms
  "DCMI Metadata Terms"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/dcterms.ttl",
   :dcterms/modified "2010-10-11",
   :dcterms/title {:rdf/language "en-us",
                   :rdf/value    "DCMI Metadata Terms"},
   :rdf/about {:rdf/uri "http://purl.org/dc/terms/"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "This version of the DCMI Terms vocabulary has been heavily trimmed for LV2.",
   :vann/preferredNamespacePrefix "dcterms",
   :vann/preferredNamespaceUri "http://purl.org/dc/terms/"}
  (:refer-clojure :exclude [format]))

(def Agent
  "Examples of Agent include person, organization, and software agent."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of Agent include person, organization, and software agent."},
   :rdf/about :dcterms/Agent,
   :rdf/type [:rdfs/Class :dcterms/AgentClass],
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value "A resource that acts or has the power to act."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Agent"}})

(def AgentClass
  "Examples of Agent Class include groups seen as classes, such as students, women, charities, lecturers."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of Agent Class include groups seen as classes, such as students, women, charities, lecturers."},
   :rdf/about :dcterms/AgentClass,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "A group of agents."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Agent Class"}})

(def LicenseDocument
  "A legal document giving official permission to do something with a Resource."
  {:rdf/about :dcterms/LicenseDocument,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A legal document giving official permission to do something with a Resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "License Document"},
   :rdfs/subClassOf :dcterms/RightsStatement})

(def LinguisticSystem
  "Examples include written, spoken, sign, and computer languages."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples include written, spoken, sign, and computer languages."},
   :rdf/about :dcterms/LinguisticSystem,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A system of signs, symbols, sounds, gestures, or rules used in communication."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Linguistic System"}})

(def MediaType
  "A file format or physical medium."
  {:rdf/about        :dcterms/MediaType,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en-us",
                      :rdf/value    "A file format or physical medium."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label       {:rdf/language "en-us",
                      :rdf/value    "Media Type"},
   :rdfs/subClassOf  :dcterms/MediaTypeOrExtent})

(def MediaTypeOrExtent
  "A media type or extent."
  {:rdf/about        :dcterms/MediaTypeOrExtent,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en-us",
                      :rdf/value    "A media type or extent."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label       {:rdf/language "en-us",
                      :rdf/value    "Media Type or Extent"}})

(def RightsStatement
  "A statement about the intellectual property rights (IPR) held in or over a Resource, a legal document giving official permission to do something with a resource, or a statement about access rights."
  {:rdf/about :dcterms/RightsStatement,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A statement about the intellectual property rights (IPR) held in or over a Resource, a legal document giving official permission to do something with a resource, or a statement about access rights."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Rights Statement"}})

(def Standard
  "A basis for comparison; a reference point against which other things can be evaluated."
  {:rdf/about :dcterms/Standard,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A basis for comparison; a reference point against which other things can be evaluated."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Standard"}})

(def URI
  "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."
  {:rdf/about :dcterms/URI,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "URI"},
   :rdfs/seeAlso {:rdf/uri "http://www.ietf.org/rfc/rfc3986.txt"}})

(def W3CDTF
  "The set of dates and times constructed according to the W3C Date and Time Formats Specification."
  {:rdf/about :dcterms/W3CDTF,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The set of dates and times constructed according to the W3C Date and Time Formats Specification."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "W3C-DTF"},
   :rdfs/seeAlso {:rdf/uri "http://www.w3.org/TR/NOTE-datetime"}})

(def abstract
  "A summary of the resource."
  {:rdf/about          :dcterms/abstract,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en-us",
                        :rdf/value    "A summary of the resource."},
   :rdfs/isDefinedBy   {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label         {:rdf/language "en-us",
                        :rdf/value    "Abstract"},
   :rdfs/subPropertyOf :dcterms/description})

(def alternative
  "The distinction between titles and alternative titles is application-specific."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "The distinction between titles and alternative titles is application-specific."},
   :rdf/about :dcterms/alternative,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "An alternative name for the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "alternative title"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/title})

(def available
  "Date (often a range) that the resource became or will become available."
  {:rdf/about :dcterms/available,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Date (often a range) that the resource became or will become available."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "date available"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def conformsTo
  "An established standard to which the described resource conforms."
  {:rdf/about :dcterms/conformsTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An established standard to which the described resource conforms."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "conforms to"},
   :rdfs/range :dcterms/Standard,
   :rdfs/subPropertyOf :dcterms/relation})

(def contributor
  "Examples of a Contributor include a person, an organization, or a service."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of a Contributor include a person, an organization, or a service."},
   :rdf/about :dcterms/contributor,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An entity responsible for making contributions to the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "contributor"},
   :rdfs/range :dcterms/Agent})

(def created
  "Date of creation of the resource."
  {:rdf/about          :dcterms/created,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en-us",
                        :rdf/value    "Date of creation of the resource."},
   :rdfs/isDefinedBy   {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label         {:rdf/language "en-us",
                        :rdf/value    "date created"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def creator
  "Examples of a Creator include a person, an organization, or a service."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of a Creator include a person, an organization, or a service."},
   :owl/equivalentProperty {:rdf/uri "http://xmlns.com/foaf/0.1/maker"},
   :rdf/about :dcterms/creator,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "An entity primarily responsible for making the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "creator"},
   :rdfs/range :dcterms/Agent,
   :rdfs/subPropertyOf :dcterms/contributor})

(def date
  "Date may be used to express temporal information at any level of granularity.  Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Date may be used to express temporal information at any level of granularity.  Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."},
   :rdf/about :dcterms/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A point or period of time associated with an event in the lifecycle of the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "date"},
   :rdfs/range :rdfs/Literal})

(def dateAccepted
  "Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal)."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal)."},
   :rdf/about :dcterms/dateAccepted,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Date of acceptance of the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "date accepted"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def dateCopyrighted
  "Date of copyright."
  {:rdf/about          :dcterms/dateCopyrighted,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en-us",
                        :rdf/value    "Date of copyright."},
   :rdfs/isDefinedBy   {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label         {:rdf/language "en-us",
                        :rdf/value    "date copyrighted"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def dateSubmitted
  "Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal)."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal)."},
   :rdf/about :dcterms/dateSubmitted,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Date of submission of the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "date submitted"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def description
  "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."},
   :rdf/about :dcterms/description,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "An account of the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "description"}})

(def format
  "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME]."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME]."},
   :rdf/about :dcterms/format,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The file format, physical medium, or dimensions of the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "format"},
   :rdfs/range :dcterms/MediaTypeOrExtent})

(def hasFormat
  "A related resource that is substantially the same as the pre-existing described resource, but in another format."
  {:rdf/about :dcterms/hasFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that is substantially the same as the pre-existing described resource, but in another format."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "has format"},
   :rdfs/subPropertyOf :dcterms/relation})

(def hasPart
  "A related resource that is included either physically or logically in the described resource."
  {:rdf/about :dcterms/hasPart,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that is included either physically or logically in the described resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "has part"},
   :rdfs/subPropertyOf :dcterms/relation})

(def hasVersion
  "A related resource that is a version, edition, or adaptation of the described resource."
  {:rdf/about :dcterms/hasVersion,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that is a version, edition, or adaptation of the described resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "has version"},
   :rdfs/subPropertyOf :dcterms/relation})

(def isFormatOf
  "A related resource that is substantially the same as the described resource, but in another format."
  {:rdf/about :dcterms/isFormatOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that is substantially the same as the described resource, but in another format."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is format of"},
   :rdfs/subPropertyOf :dcterms/relation})

(def isPartOf
  "A related resource in which the described resource is physically or logically included."
  {:rdf/about :dcterms/isPartOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource in which the described resource is physically or logically included."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is part of"},
   :rdfs/subPropertyOf :dcterms/relation})

(def isReferencedBy
  "A related resource that references, cites, or otherwise points to the described resource."
  {:rdf/about :dcterms/isReferencedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that references, cites, or otherwise points to the described resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is referenced by"},
   :rdfs/subPropertyOf :dcterms/relation})

(def isReplacedBy
  "A related resource that supplants, displaces, or supersedes the described resource."
  {:rdf/about :dcterms/isReplacedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that supplants, displaces, or supersedes the described resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is replaced by"},
   :rdfs/subPropertyOf :dcterms/relation})

(def isRequiredBy
  "A related resource that requires the described resource to support its function, delivery, or coherence."
  {:rdf/about :dcterms/isRequiredBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that requires the described resource to support its function, delivery, or coherence."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is required by"},
   :rdfs/subPropertyOf :dcterms/relation})

(def isVersionOf
  "Changes in version imply substantive changes in content rather than differences in format."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Changes in version imply substantive changes in content rather than differences in format."},
   :rdf/about :dcterms/isVersionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource of which the described resource is a version, edition, or adaptation."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is version of"},
   :rdfs/subPropertyOf :dcterms/relation})

(def issued
  "Date of formal issuance (e.g., publication) of the resource."
  {:rdf/about :dcterms/issued,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value "Date of formal issuance (e.g., publication) of the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "date issued"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def language
  "Recommended best practice is to use a controlled vocabulary such as RFC 4646."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Recommended best practice is to use a controlled vocabulary such as RFC 4646."},
   :rdf/about :dcterms/language,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "A language of the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "language"},
   :rdfs/range :dcterms/LinguisticSystem})

(def license
  "A legal document giving official permission to do something with the resource."
  {:rdf/about :dcterms/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A legal document giving official permission to do something with the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "license"},
   :rdfs/range :dcterms/LicenseDocument,
   :rdfs/subPropertyOf :dcterms/rights})

(def modified
  "Date on which the resource was changed."
  {:rdf/about          :dcterms/modified,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en-us",
                        :rdf/value "Date on which the resource was changed."},
   :rdfs/isDefinedBy   {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label         {:rdf/language "en-us",
                        :rdf/value    "date modified"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def publisher
  "Examples of a Publisher include a person, an organization, or a service."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Examples of a Publisher include a person, an organization, or a service."},
   :rdf/about :dcterms/publisher,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "An entity responsible for making the resource available."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "publisher"},
   :rdfs/range :dcterms/Agent})

(def references
  "A related resource that is referenced, cited, or otherwise pointed to by the described resource."
  {:rdf/about :dcterms/references,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that is referenced, cited, or otherwise pointed to by the described resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "references"},
   :rdfs/subPropertyOf :dcterms/relation})

(def relation
  "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. "},
   :rdf/about :dcterms/relation,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "A related resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "relation"}})

(def replaces
  "A related resource that is supplanted, displaced, or superseded by the described resource."
  {:rdf/about :dcterms/replaces,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that is supplanted, displaced, or superseded by the described resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "replaces"},
   :rdfs/subPropertyOf :dcterms/relation})

(def requires
  "A related resource that is required by the described resource to support its function, delivery, or coherence."
  {:rdf/about :dcterms/requires,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A related resource that is required by the described resource to support its function, delivery, or coherence."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "requires"},
   :rdfs/subPropertyOf :dcterms/relation})

(def rights
  "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights."
  {:dcterms/description
   {:rdf/language "en-us",
    :rdf/value
    "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights."},
   :rdf/about :dcterms/rights,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Information about rights held in and over the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "rights"},
   :rdfs/range :dcterms/RightsStatement})

(def rightsHolder
  "A person or organization owning or managing rights over the resource."
  {:rdf/about :dcterms/rightsHolder,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A person or organization owning or managing rights over the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "rights holder"},
   :rdfs/range :dcterms/Agent})

(def title
  "A name given to the resource."
  {:rdf/about        :dcterms/title,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-us",
                      :rdf/value    "A name given to the resource."},
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/terms/"},
   :rdfs/label       {:rdf/language "en-us",
                      :rdf/value    "title"},
   :rdfs/range       :rdfs/Literal})