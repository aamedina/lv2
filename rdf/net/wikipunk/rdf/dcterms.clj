(ns net.wikipunk.rdf.dcterms
  "http://purl.org/dc/terms/"
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_terms.ttl",
   :rdf/ns-prefix-map {"dcam"    "http://purl.org/dc/dcam/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "dcterms",
   :rdfa/uri "http://purl.org/dc/terms/",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://dublincore.org/documents/dcmi-terms/#H2"}}
  (:refer-clojure :exclude [type format]))

(def Agent
  "A resource that acts or has the power to act."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/Agent,
   :rdf/type         [:rdfs/Class :dcterms/AgentClass],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A resource that acts or has the power to act."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Agent"}})

(def AgentClass
  "A group of agents."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/AgentClass,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A group of agents."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Agent Class"},
   :rdfs/subClassOf  :rdfs/Class})

(def BibliographicResource
  "A book, article, or other documentary resource."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/BibliographicResource,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A book, article, or other documentary resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Bibliographic Resource"}})

(def Box
  "The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/Box,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DCMI Box"},
   :rdfs/seeAlso
   "https://www.dublincore.org/specifications/dublin-core/dcmi-box/"})

(def DCMIType
  "The set of classes specified by the DCMI Type Vocabulary, used to categorize the nature or genre of the resource."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/DCMIType,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of classes specified by the DCMI Type Vocabulary, used to categorize the nature or genre of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DCMI Type Vocabulary"},
   :rdfs/seeAlso "http://purl.org/dc/dcmitype/"})

(def DDC
  "The set of conceptual resources specified by the Dewey Decimal Classification."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/DDC,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of conceptual resources specified by the Dewey Decimal Classification."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DDC"},
   :rdfs/seeAlso "http://www.oclc.org/dewey/"})

(def FileFormat
  "A digital resource format."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/FileFormat,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A digital resource format."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "File Format"},
   :rdfs/subClassOf  :dcterms/MediaType})

(def Frequency
  "A rate at which something recurs."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/Frequency,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A rate at which something recurs."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Frequency"}})

(def IMT
  "The set of media types specified by the Internet Assigned Numbers Authority."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/IMT,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of media types specified by the Internet Assigned Numbers Authority."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IMT"},
   :rdfs/seeAlso "http://www.iana.org/assignments/media-types/"})

(def ISO3166
  "The set of codes listed in ISO 3166-1 for the representation of names of countries."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/ISO3166,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of codes listed in ISO 3166-1 for the representation of names of countries."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISO 3166"},
   :rdfs/seeAlso "https://www.iso.org/obp/ui/#search"})

(def ISO639-2
  "The three-letter alphabetic codes listed in ISO639-2 for the representation of names of languages."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/ISO639-2,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The three-letter alphabetic codes listed in ISO639-2 for the representation of names of languages."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISO 639-2"},
   :rdfs/seeAlso "http://lcweb.loc.gov/standards/iso639-2/langhome.html"})

(def ISO639-3
  "The set of three-letter codes listed in ISO 639-3 for the representation of names of languages."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/ISO639-3,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of three-letter codes listed in ISO 639-3 for the representation of names of languages."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISO 639-3"},
   :rdfs/seeAlso "http://www.sil.org/iso639-3/"})

(def Jurisdiction
  "The extent or range of judicial, law enforcement, or other authority."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/Jurisdiction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The extent or range of judicial, law enforcement, or other authority."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Jurisdiction"},
   :rdfs/subClassOf :dcterms/LocationPeriodOrJurisdiction})

(def LCC
  "The set of conceptual resources specified by the Library of Congress Classification."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/LCC,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of conceptual resources specified by the Library of Congress Classification."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LCC"},
   :rdfs/seeAlso "http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html"})

(def LCSH
  "The set of labeled concepts specified by the Library of Congress Subject Headings."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/LCSH,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of labeled concepts specified by the Library of Congress Subject Headings."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LCSH"}})

(def LicenseDocument
  "A legal document giving official permission to do something with a resource."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/LicenseDocument,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal document giving official permission to do something with a resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "License Document"},
   :rdfs/subClassOf :dcterms/RightsStatement})

(def LinguisticSystem
  "Written, spoken, sign, and computer languages are linguistic systems."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Written, spoken, sign, and computer languages are linguistic systems."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/LinguisticSystem,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A system of signs, symbols, sounds, gestures, or rules used in communication."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Linguistic System"}})

(def Location
  "A spatial region or named place."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/Location,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A spatial region or named place."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Location"},
   :rdfs/subClassOf  :dcterms/LocationPeriodOrJurisdiction})

(def LocationPeriodOrJurisdiction
  "A location, period of time, or jurisdiction."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/LocationPeriodOrJurisdiction,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A location, period of time, or jurisdiction."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Location, Period, or Jurisdiction"}})

(def MESH
  "The set of labeled concepts specified by the Medical Subject Headings."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/MESH,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of labeled concepts specified by the Medical Subject Headings."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MeSH"},
   :rdfs/seeAlso "http://www.nlm.nih.gov/mesh/meshhome.html"})

(def MediaType
  "A file format or physical medium."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/MediaType,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A file format or physical medium."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Media Type"},
   :rdfs/subClassOf  :dcterms/MediaTypeOrExtent})

(def MediaTypeOrExtent
  "A media type or extent."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/MediaTypeOrExtent,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A media type or extent."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Media Type or Extent"}})

(def MethodOfAccrual
  "A method by which resources are added to a collection."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/MethodOfAccrual,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A method by which resources are added to a collection."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Method of Accrual"}})

(def MethodOfInstruction
  "A process that is used to engender knowledge, attitudes, and skills."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/MethodOfInstruction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A process that is used to engender knowledge, attitudes, and skills."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Method of Instruction"}})

(def NLM
  "The set of conceptual resources specified by the National Library of Medicine Classification."
  {:dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/about :dcterms/NLM,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of conceptual resources specified by the National Library of Medicine Classification."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NLM"},
   :rdfs/seeAlso "http://wwwcf.nlm.nih.gov/class/"})

(def Period
  "The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/Period,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DCMI Period"},
   :rdfs/seeAlso
   "https://www.dublincore.org/specifications/dublin-core/dcmi-period/"})

(def PeriodOfTime
  "An interval of time that is named or defined by its start and end dates."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/PeriodOfTime,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An interval of time that is named or defined by its start and end dates."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Period of Time"},
   :rdfs/subClassOf :dcterms/LocationPeriodOrJurisdiction})

(def PhysicalMedium
  "Examples include paper, canvas, or DVD."
  {:dcterms/description {:rdf/language "en",
                         :rdf/value "Examples include paper, canvas, or DVD."},
   :dcterms/issued      #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about           :dcterms/PhysicalMedium,
   :rdf/type            :rdfs/Class,
   :rdfs/comment        {:rdf/language "en",
                         :rdf/value    "A physical material or carrier."},
   :rdfs/isDefinedBy    "http://purl.org/dc/terms/",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Physical Medium"},
   :rdfs/subClassOf     :dcterms/MediaType})

(def PhysicalResource
  "A material thing."
  {:dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about        :dcterms/PhysicalResource,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A material thing."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Physical Resource"}})

(def Point
  "The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/Point,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DCMI Point"},
   :rdfs/seeAlso
   "https://www.dublincore.org/specifications/dublin-core/dcmi-point/"})

(def Policy
  "A plan or course of action by an authority, intended to influence and determine decisions, actions, and other matters."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/Policy,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A plan or course of action by an authority, intended to influence and determine decisions, actions, and other matters."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Policy"}})

(def ProvenanceStatement
  "Any changes in ownership and custody of a resource since its creation that are significant for its authenticity, integrity, and interpretation."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/ProvenanceStatement,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Any changes in ownership and custody of a resource since its creation that are significant for its authenticity, integrity, and interpretation."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provenance Statement"}})

(def RFC1766
  "The set of tags, constructed according to RFC 1766, for the identification of languages."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/RFC1766,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of tags, constructed according to RFC 1766, for the identification of languages."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RFC 1766"},
   :rdfs/seeAlso "http://www.ietf.org/rfc/rfc1766.txt"})

(def RFC3066
  "RFC 3066 has been obsoleted by RFC 4646."
  {:dcterms/description {:rdf/language "en",
                         :rdf/value "RFC 3066 has been obsoleted by RFC 4646."},
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/about :dcterms/RFC3066,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of tags constructed according to RFC 3066 for the identification of languages."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RFC 3066"},
   :rdfs/seeAlso "http://www.ietf.org/rfc/rfc3066.txt"})

(def RFC4646
  "RFC 4646 obsoletes RFC 3066."
  {:dcterms/description {:rdf/language "en",
                         :rdf/value    "RFC 4646 obsoletes RFC 3066."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/RFC4646,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of tags constructed according to RFC 4646 for the identification of languages."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RFC 4646"},
   :rdfs/seeAlso "http://www.ietf.org/rfc/rfc4646.txt"})

(def RFC5646
  "RFC 5646 obsoletes RFC 4646."
  {:dcterms/description {:rdf/language "en",
                         :rdf/value    "RFC 5646 obsoletes RFC 4646."},
   :dcterms/issued #inst "2010-10-11T00:00:00.000-04:00",
   :rdf/about :dcterms/RFC5646,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of tags constructed according to RFC 5646 for the identification of languages."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RFC 5646"},
   :rdfs/seeAlso "http://www.ietf.org/rfc/rfc5646.txt"})

(def RightsStatement
  "A statement about the intellectual property rights (IPR) held in or over a resource, a legal document giving official permission to do something with a resource, or a statement about access rights."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/RightsStatement,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A statement about the intellectual property rights (IPR) held in or over a resource, a legal document giving official permission to do something with a resource, or a statement about access rights."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights Statement"}})

(def SizeOrDuration
  "Examples include a number of pages, a specification of length, width, and breadth, or a period in hours, minutes, and seconds."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include a number of pages, a specification of length, width, and breadth, or a period in hours, minutes, and seconds."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/SizeOrDuration,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A dimension or extent, or a time taken to play or execute."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Size or Duration"},
   :rdfs/subClassOf :dcterms/MediaTypeOrExtent})

(def Standard
  "A reference point against which other things can be evaluated or compared."
  {:dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/Standard,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference point against which other things can be evaluated or compared."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Standard"}})

(def TGN
  "The set of places specified by the Getty Thesaurus of Geographic Names."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/TGN,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of places specified by the Getty Thesaurus of Geographic Names."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TGN"},
   :rdfs/seeAlso
   "http://www.getty.edu/research/tools/vocabulary/tgn/index.html"})

(def UDC
  "The set of conceptual resources specified by the Universal Decimal Classification."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/UDC,
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of conceptual resources specified by the Universal Decimal Classification."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "UDC"},
   :rdfs/seeAlso "http://www.udcc.org/"})

(def URI
  "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/URI,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "URI"},
   :rdfs/seeAlso "http://www.ietf.org/rfc/rfc3986.txt"})

(def W3CDTF
  "The set of dates and times constructed according to the W3C Date and Time Formats Specification."
  {:dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/W3CDTF,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of dates and times constructed according to the W3C Date and Time Formats Specification."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "W3C-DTF"},
   :rdfs/seeAlso "http://www.w3.org/TR/NOTE-datetime"})

(def abstract
  "A summary of the resource."
  {:dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about          :dcterms/abstract,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A summary of the resource."},
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Abstract"},
   :rdfs/subPropertyOf [:dcterms/description
                        "http://purl.org/dc/elements/1.1/description"]})

(def accessRights
  "Access Rights may include information regarding access or restrictions based on privacy, security, or other policies."
  {:dcam/rangeIncludes :dcterms/RightsStatement,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Access Rights may include information regarding access or restrictions based on privacy, security, or other policies."},
   :dcterms/issued #inst "2003-02-15T00:00:00.000-05:00",
   :rdf/about :dcterms/accessRights,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information about who access the resource or an indication of its security status."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Access Rights"},
   :rdfs/subPropertyOf [:dcterms/rights
                        "http://purl.org/dc/elements/1.1/rights"]})

(def accrualMethod
  "Recommended practice is to use a value from the Collection Description Accrual Method Vocabulary [[DCMI-ACCRUALMETHOD](https://dublincore.org/groups/collections/accrual-method/)]."
  {:dcam/rangeIncludes :dcterms/MethodOfAccrual,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to use a value from the Collection Description Accrual Method Vocabulary [[DCMI-ACCRUALMETHOD](https://dublincore.org/groups/collections/accrual-method/)]."},
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/about :dcterms/accrualMethod,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The method by which items are added to a collection."},
   :rdfs/domain "http://purl.org/dc/dcmitype/Collection",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accrual Method"}})

(def accrualPeriodicity
  "Recommended practice is to use a value from the Collection Description Frequency Vocabulary [[DCMI-COLLFREQ](https://dublincore.org/groups/collections/frequency/)]."
  {:dcam/rangeIncludes :dcterms/Frequency,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to use a value from the Collection Description Frequency Vocabulary [[DCMI-COLLFREQ](https://dublincore.org/groups/collections/frequency/)]."},
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/about :dcterms/accrualPeriodicity,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The frequency with which items are added to a collection."},
   :rdfs/domain "http://purl.org/dc/dcmitype/Collection",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accrual Periodicity"}})

(def accrualPolicy
  "Recommended practice is to use a value from the Collection Description Accrual Policy Vocabulary [[DCMI-ACCRUALPOLICY](https://dublincore.org/groups/collections/accrual-policy/)]."
  {:dcam/rangeIncludes :dcterms/Policy,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to use a value from the Collection Description Accrual Policy Vocabulary [[DCMI-ACCRUALPOLICY](https://dublincore.org/groups/collections/accrual-policy/)]."},
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/about :dcterms/accrualPolicy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The policy governing the addition of items to a collection."},
   :rdfs/domain "http://purl.org/dc/dcmitype/Collection",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accrual Policy"}})

(def alternative
  "The distinction between titles and alternative titles is application-specific."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The distinction between titles and alternative titles is application-specific."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/alternative,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An alternative name for the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Alternative Title"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/title
                        "http://purl.org/dc/elements/1.1/title"]})

(def audience
  "Recommended practice is to use this property with non-literal values from a vocabulary of audience types."
  {:dcam/rangeIncludes :dcterms/AgentClass,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to use this property with non-literal values from a vocabulary of audience types."},
   :dcterms/issued #inst "2001-05-21T00:00:00.000-04:00",
   :rdf/about :dcterms/audience,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A class of agents for whom the resource is intended or useful."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audience"}})

(def available
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/available,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Date that the resource became or will become available."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Available"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})

(def bibliographicCitation
  "Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible."},
   :dcterms/issued #inst "2003-02-15T00:00:00.000-05:00",
   :rdf/about :dcterms/bibliographicCitation,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A bibliographic reference for the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bibliographic Citation"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/identifier
                        "http://purl.org/dc/elements/1.1/identifier"]})

(def conformsTo
  "An established standard to which the described resource conforms."
  {:dcam/rangeIncludes :dcterms/Standard,
   :dcterms/issued #inst "2001-05-21T00:00:00.000-04:00",
   :rdf/about :dcterms/conformsTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An established standard to which the described resource conforms."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Conforms To"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def contributor
  "The guidelines for using names of persons or organizations as creators apply to contributors."
  {:dcam/rangeIncludes :dcterms/Agent,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The guidelines for using names of persons or organizations as creators apply to contributors."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/contributor,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An entity responsible for making contributions to the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contributor"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/contributor"})

(def coverage
  "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended practice is to use a controlled vocabulary such as the Getty Thesaurus of Geographic Names [[TGN](https://www.getty.edu/research/tools/vocabulary/tgn/index.html)]. Where appropriate, named places or time periods may be used in preference to numeric identifiers such as sets of coordinates or date ranges.  Because coverage is so broadly defined, it is preferable to use the more specific subproperties Temporal Coverage and Spatial Coverage."
  {:dcam/rangeIncludes
   [:dcterms/Location :dcterms/Period :dcterms/Jurisdiction],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended practice is to use a controlled vocabulary such as the Getty Thesaurus of Geographic Names [[TGN](https://www.getty.edu/research/tools/vocabulary/tgn/index.html)]. Where appropriate, named places or time periods may be used in preference to numeric identifiers such as sets of coordinates or date ranges.  Because coverage is so broadly defined, it is preferable to use the more specific subproperties Temporal Coverage and Spatial Coverage."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/coverage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The spatial or temporal topic of the resource, spatial applicability of the resource, or jurisdiction under which the resource is relevant."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Coverage"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/coverage"})

(def created
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/created,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Date of creation of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Created"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})

(def creator
  "Recommended practice is to identify the creator with a URI.  If this is not possible or feasible, a literal value that identifies the creator may be provided."
  {:dcam/rangeIncludes :dcterms/Agent,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to identify the creator with a URI.  If this is not possible or feasible, a literal value that identifies the creator may be provided."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :owl/equivalentProperty "http://xmlns.com/foaf/0.1/maker",
   :rdf/about :dcterms/creator,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "An entity responsible for making the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Creator"},
   :rdfs/subPropertyOf [:dcterms/contributor
                        "http://purl.org/dc/elements/1.1/creator"]})

(def date
  "Date may be used to express temporal information at any level of granularity.  Recommended practice is to express the date, date/time, or period of time according to ISO 8601-1 [[ISO 8601-1](https://www.iso.org/iso-8601-date-and-time-format.html)] or a published profile of the ISO standard, such as the W3C Note on Date and Time Formats [[W3CDTF](https://www.w3.org/TR/NOTE-datetime)] or the Extended Date/Time Format Specification [[EDTF](http://www.loc.gov/standards/datetime/)].  If the full date is unknown, month and year (YYYY-MM) or just year (YYYY) may be used. Date ranges may be specified using ISO 8601 period of time specification in which start and end dates are separated by a '/' (slash) character.  Either the start or end date may be missing."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Date may be used to express temporal information at any level of granularity.  Recommended practice is to express the date, date/time, or period of time according to ISO 8601-1 [[ISO 8601-1](https://www.iso.org/iso-8601-date-and-time-format.html)] or a published profile of the ISO standard, such as the W3C Note on Date and Time Formats [[W3CDTF](https://www.w3.org/TR/NOTE-datetime)] or the Extended Date/Time Format Specification [[EDTF](http://www.loc.gov/standards/datetime/)].  If the full date is unknown, month and year (YYYY-MM) or just year (YYYY) may be used. Date ranges may be specified using ISO 8601 period of time specification in which start and end dates are separated by a '/' (slash) character.  Either the start or end date may be missing."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A point or period of time associated with an event in the lifecycle of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/date"})

(def dateAccepted
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a date of acceptance may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal)."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a date of acceptance may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal)."},
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/about :dcterms/dateAccepted,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Date of acceptance of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Accepted"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})

(def dateCopyrighted
  "Typically a year.  Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Typically a year.  Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."},
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/about :dcterms/dateCopyrighted,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Date of copyright of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Copyrighted"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})

(def dateSubmitted
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a 'Date Submitted' may be relevant include a thesis (submitted to a university department) or an article (submitted to a journal)."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a 'Date Submitted' may be relevant include a thesis (submitted to a university department) or an article (submitted to a journal)."},
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/about :dcterms/dateSubmitted,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Date of submission of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Submitted"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})

(def description
  "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/description,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An account of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Description"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/description"})

(def educationLevel
  "A class of agents, defined in terms of progression through an educational or training context, for which the described resource is intended."
  {:dcam/rangeIncludes :dcterms/AgentClass,
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/about :dcterms/educationLevel,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A class of agents, defined in terms of progression through an educational or training context, for which the described resource is intended."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audience Education Level"},
   :rdfs/subPropertyOf :dcterms/audience})

(def extent
  "Recommended practice is to specify the file size in megabytes and duration in ISO 8601 format."
  {:dcam/rangeIncludes :dcterms/SizeOrDuration,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to specify the file size in megabytes and duration in ISO 8601 format."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/extent,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The size or duration of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extent"},
   :rdfs/subPropertyOf [:dcterms/format
                        "http://purl.org/dc/elements/1.1/format"]})

(def format
  "Recommended practice is to use a controlled vocabulary where available. For example, for file formats one could use the list of Internet Media Types [[MIME](https://www.iana.org/assignments/media-types/media-types.xhtml)].  Examples of dimensions include size and duration."
  {:dcam/rangeIncludes [:dcterms/MediaType :dcterms/Extent],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to use a controlled vocabulary where available. For example, for file formats one could use the list of Internet Media Types [[MIME](https://www.iana.org/assignments/media-types/media-types.xhtml)].  Examples of dimensions include size and duration."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/format,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The file format, physical medium, or dimensions of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Format"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/format"})

(def hasFormat
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Format Of."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Format Of."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/hasFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that is substantially the same as the pre-existing described resource, but in another format."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Format"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def hasPart
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Part Of."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Part Of."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/hasPart,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that is included either physically or logically in the described resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Part"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def hasVersion
  "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Is Version Of."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Is Version Of."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/hasVersion,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that is a version, edition, or adaptation of the described resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Version"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def identifier
  "Recommended practice is to identify the resource by means of a string conforming to an identification system. Examples include International Standard Book Number (ISBN), Digital Object Identifier (DOI), and Uniform Resource Name (URN).  Persistent identifiers should be provided as HTTP URIs."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to identify the resource by means of a string conforming to an identification system. Examples include International Standard Book Number (ISBN), Digital Object Identifier (DOI), and Uniform Resource Name (URN).  Persistent identifiers should be provided as HTTP URIs."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/identifier,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An unambiguous reference to the resource within a given context."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifier"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/identifier"})

(def instructionalMethod
  "Instructional Method typically includes ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured.  Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback."
  {:dcam/rangeIncludes :dcterms/MethodOfInstruction,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Instructional Method typically includes ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured.  Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback."},
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/about :dcterms/instructionalMethod,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A process, used to engender knowledge, attitudes and skills, that the described resource is designed to support."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Instructional Method"}})

(def isFormatOf
  "This property is intended to be used with non-literal values. This property is an inverse property of Has Format."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Has Format."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/isFormatOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A pre-existing related resource that is substantially the same as the described resource, but in another format."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is Format Of"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def isPartOf
  "This property is intended to be used with non-literal values. This property is an inverse property of Has Part."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Has Part."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/isPartOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource in which the described resource is physically or logically included."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is Part Of"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def isReferencedBy
  "This property is intended to be used with non-literal values. This property is an inverse property of References."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of References."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/isReferencedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that references, cites, or otherwise points to the described resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is Referenced By"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def isReplacedBy
  "This property is intended to be used with non-literal values. This property is an inverse property of Replaces."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Replaces."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/isReplacedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that supplants, displaces, or supersedes the described resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is Replaced By"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def isRequiredBy
  "This property is intended to be used with non-literal values. This property is an inverse property of Requires."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Requires."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/isRequiredBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that requires the described resource to support its function, delivery, or coherence."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is Required By"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def isVersionOf
  "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Has Version."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Has Version."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/isVersionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource of which the described resource is a version, edition, or adaptation."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is Version Of"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def issued
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/issued,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Date of formal issuance of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Issued"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})

(def language
  "Recommended practice is to use either a non-literal value representing a language from a controlled vocabulary such as ISO 639-2 or ISO 639-3, or a literal value consisting of an IETF Best Current Practice 47 [[IETF-BCP47](https://tools.ietf.org/html/bcp47)] language tag."
  {:dcam/rangeIncludes :dcterms/LinguisticSystem,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to use either a non-literal value representing a language from a controlled vocabulary such as ISO 639-2 or ISO 639-3, or a literal value consisting of an IETF Best Current Practice 47 [[IETF-BCP47](https://tools.ietf.org/html/bcp47)] language tag."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/language,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A language of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/language"})

(def license
  "Recommended practice is to identify the license document with a URI. If this is not possible or feasible, a literal value that identifies the license may be provided."
  {:dcam/rangeIncludes :dcterms/LicenseDocument,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to identify the license document with a URI. If this is not possible or feasible, a literal value that identifies the license may be provided."},
   :dcterms/issued #inst "2004-06-14T00:00:00.000-04:00",
   :rdf/about :dcterms/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal document giving official permission to do something with the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "License"},
   :rdfs/subPropertyOf [:dcterms/rights
                        "http://purl.org/dc/elements/1.1/rights"]})

(def mediator
  "In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver."
  {:dcam/rangeIncludes :dcterms/AgentClass,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver."},
   :dcterms/issued #inst "2001-05-21T00:00:00.000-04:00",
   :rdf/about :dcterms/mediator,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "An entity that mediates access to the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mediator"},
   :rdfs/subPropertyOf :dcterms/audience})

(def medium
  "The material or physical carrier of the resource."
  {:dcam/domainIncludes :dcterms/PhysicalResource,
   :dcam/rangeIncludes  :dcterms/PhysicalMedium,
   :dcterms/issued      #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about           :dcterms/medium,
   :rdf/type            :rdf/Property,
   :rdfs/comment        {:rdf/language "en",
                         :rdf/value
                         "The material or physical carrier of the resource."},
   :rdfs/isDefinedBy    "http://purl.org/dc/terms/",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Medium"},
   :rdfs/subPropertyOf  [:dcterms/format
                         "http://purl.org/dc/elements/1.1/format"]})

(def modified
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/modified,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Date on which the resource was changed."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Modified"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})

(def provenance
  "The statement may include a description of any changes successive custodians made to the resource."
  {:dcam/rangeIncludes :dcterms/ProvenanceStatement,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The statement may include a description of any changes successive custodians made to the resource."},
   :dcterms/issued #inst "2004-09-20T00:00:00.000-04:00",
   :rdf/about :dcterms/provenance,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provenance"}})

(def publisher
  "An entity responsible for making the resource available."
  {:dcam/rangeIncludes :dcterms/Agent,
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/publisher,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An entity responsible for making the resource available."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Publisher"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/publisher"})

(def references
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Referenced By."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Referenced By."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/references,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that is referenced, cited, or otherwise pointed to by the described resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "References"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def relation
  "Recommended practice is to identify the related resource by means of a URI.  If this is not possible or feasible, a string conforming to a formal identification system may be provided."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to identify the related resource by means of a URI.  If this is not possible or feasible, a string conforming to a formal identification system may be provided."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/relation,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A related resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relation"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/relation"})

(def replaces
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Replaced By."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Replaced By."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/replaces,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that is supplanted, displaced, or superseded by the described resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Replaces"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def requires
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Required By."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Required By."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/requires,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource that is required by the described resource to support its function, delivery, or coherence."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Requires"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/relation"]})

(def rights
  "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.  Recommended practice is to refer to a rights statement with a URI.  If this is not possible or feasible, a literal value (name, label, or short text) may be provided."
  {:dcam/rangeIncludes :dcterms/RightsStatement,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.  Recommended practice is to refer to a rights statement with a URI.  If this is not possible or feasible, a literal value (name, label, or short text) may be provided."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/rights,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Information about rights held in and over the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/rights"})

(def rightsHolder
  "Recommended practice is to refer to the rights holder with a URI. If this is not possible or feasible, a literal value that identifies the rights holder may be provided."
  {:dcam/rangeIncludes :dcterms/Agent,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to refer to the rights holder with a URI. If this is not possible or feasible, a literal value that identifies the rights holder may be provided."},
   :dcterms/issued #inst "2004-06-14T00:00:00.000-04:00",
   :rdf/about :dcterms/rightsHolder,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person or organization owning or managing rights over the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights Holder"}})

(def source
  "This property is intended to be used with non-literal values. The described resource may be derived from the related resource in whole or in part. Best practice is to identify the related resource by means of a URI or a string conforming to a formal identification system."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This property is intended to be used with non-literal values. The described resource may be derived from the related resource in whole or in part. Best practice is to identify the related resource by means of a URI or a string conforming to a formal identification system."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/source,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A related resource from which the described resource is derived."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Source"},
   :rdfs/subPropertyOf [:dcterms/relation
                        "http://purl.org/dc/elements/1.1/source"]})

(def spatial
  "Spatial characteristics of the resource."
  {:dcam/rangeIncludes :dcterms/Location,
   :dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about          :dcterms/spatial,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "Spatial characteristics of the resource."},
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Spatial Coverage"},
   :rdfs/subPropertyOf [:dcterms/coverage
                        "http://purl.org/dc/elements/1.1/coverage"]})

(def subject
  "Recommended practice is to refer to the subject with a URI. If this is not possible or feasible, a literal value that identifies the subject may be provided. Both should preferably refer to a subject in a controlled vocabulary."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to refer to the subject with a URI. If this is not possible or feasible, a literal value that identifies the subject may be provided. Both should preferably refer to a subject in a controlled vocabulary."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/subject,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A topic of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Subject"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/subject"})

(def tableOfContents
  "A list of subunits of the resource."
  {:dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about          :dcterms/tableOfContents,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A list of subunits of the resource."},
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Table Of Contents"},
   :rdfs/subPropertyOf [:dcterms/description
                        "http://purl.org/dc/elements/1.1/description"]})

(def temporal
  "Temporal characteristics of the resource."
  {:dcam/rangeIncludes :dcterms/PeriodOfTime,
   :dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about          :dcterms/temporal,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "Temporal characteristics of the resource."},
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Temporal Coverage"},
   :rdfs/subPropertyOf [:dcterms/coverage
                        "http://purl.org/dc/elements/1.1/coverage"]})

(def title
  "A name given to the resource."
  {:dcterms/issued     #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about          :dcterms/title,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A name given to the resource."},
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Title"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/title"})

(def type
  "Recommended practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [[DCMI-TYPE](http://dublincore.org/documents/dcmi-type-vocabulary/)]. To describe the file format, physical medium, or dimensions of the resource, use the property Format."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [[DCMI-TYPE](http://dublincore.org/documents/dcmi-type-vocabulary/)]. To describe the file format, physical medium, or dimensions of the resource, use the property Format."},
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/about :dcterms/type,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The nature or genre of the resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Type"},
   :rdfs/subPropertyOf "http://purl.org/dc/elements/1.1/type"})

(def valid
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/about :dcterms/valid,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Date (often a range) of validity of a resource."},
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date Valid"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date "http://purl.org/dc/elements/1.1/date"]})