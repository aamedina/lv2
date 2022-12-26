(ns net.wikipunk.rdf.bibo
  "The Bibliographic Ontology describes bibliographic things on the semantic Web in RDF.  This ontology can be used as a citation ontology, as a document classification ontology, or simply as a way to describe any kind of document in RDF. It has been inspired by many existing document description metadata formats, and can be used as a common ground for converting other bibliographic data sources."
  {:dcterms/creator [:bibo/fgiasson :bibo/bdarcus],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Bibliographic Ontology describes\nbibliographic things on the semantic Web in RDF.  This ontology can be\nused as a citation ontology, as a document classification ontology, or\nsimply as a way to describe any kind of document in RDF. It has been\ninspired by many existing document description metadata formats, and\ncan be used as a common ground for converting other bibliographic data\nsources."},
   :dcterms/title "The Bibliographic Ontology",
   :owl/versionInfo "http://purl.org/ontology/bibo/1.3/",
   :rdf/about "http://purl.org/ontology/bibo/",
   :rdf/ns-prefix-map {"bibo" "http://purl.org/ontology/bibo/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "degrees" "http://purl.org/ontology/bibo/degrees/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prism" "http://prismstandard.org/namespaces/1.2/basic/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schemas.talis.com/2005/address/schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "status" "http://purl.org/ontology/bibo/status/",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "bibo",
   :rdfa/uri "http://purl.org/ontology/bibo/"}
  (:refer-clojure :exclude [time agent format name]))

(def AcademicArticle
  "A scholarly academic article, typically published in a journal."
  {:rdf/about :bibo/AcademicArticle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A scholarly academic article, typically published in a journal."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Academic Article"},
   :rdfs/subClassOf :bibo/Article,
   :vs/term_status "stable"})

(def Article
  "A written composition in prose, usually nonfiction, on a specific topic, forming an independent part of a book or other publication, as a newspaper or magazine."
  {:rdf/about :bibo/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written composition in prose, usually nonfiction, on a specific topic, forming an independent part of a book or other publication, as a newspaper or magazine."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Article"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def AudioDocument
  "An audio document; aka record."
  {:rdf/about        :bibo/AudioDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An audio document; aka record."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "audio document"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def AudioVisualDocument
  "An audio-visual document; film, video, and so forth."
  {:rdf/about        :bibo/AudioVisualDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An audio-visual document; film, video, and so forth."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "audio-visual document"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def Bill
  "Draft legislation presented for discussion to a legal body."
  {:rdf/about :bibo/Bill,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Draft legislation presented for discussion to a legal body."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bill"},
   :rdfs/subClassOf :bibo/Legislation,
   :vs/term_status "stable"})

(def Book
  "A written or printed work of fiction or nonfiction, usually on sheets of paper fastened or bound together within covers."
  {:rdf/about :bibo/Book,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written or printed work of fiction or nonfiction, usually on sheets of paper fastened or bound together within covers."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Book"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def BookSection
  "A section of a book."
  {:rdf/about        :bibo/BookSection,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A section of a book."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Book Section"},
   :rdfs/subClassOf  :bibo/DocumentPart,
   :vs/term_status   "unstable"})

(def Brief
  "A written argument submitted to a court."
  {:rdf/about        :bibo/Brief,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A written argument submitted to a court."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Brief"},
   :rdfs/subClassOf  :bibo/LegalCaseDocument,
   :vs/term_status   "unstable"})

(def Chapter
  "A chapter of a book."
  {:rdf/about        :bibo/Chapter,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A chapter of a book."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Chapter"},
   :rdfs/subClassOf  :bibo/BookSection,
   :vs/term_status   "unstable"})

(def Code
  "A collection of statutes."
  {:rdf/about        :bibo/Code,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A collection of statutes."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Code"},
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Legislation,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical],
   :vs/term_status   "stable"})

(def CollectedDocument
  "A document that simultaneously contains other documents."
  {:rdf/about :bibo/CollectedDocument,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A document that simultaneously contains other documents."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collected Document"},
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Document],
   :vs/term_status "stable"})

(def Collection
  "A collection of Documents or Collections"
  {:rdf/about        :bibo/Collection,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A collection of Documents or Collections"},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Collection"},
   :rdfs/subClassOf  {:owl/allValuesFrom {:owl/unionOf [:bibo/Collection
                                                        :bibo/Document],
                                          :rdf/type    :owl/Class},
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction},
   :vs/term_status   "stable"})

(def Conference
  "A meeting for consultation or discussion."
  {:rdf/about        :bibo/Conference,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A meeting for consultation or discussion."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Conference"},
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   "stable"})

(def CourtReporter
  "A collection of legal cases."
  {:rdf/about        :bibo/CourtReporter,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A collection of legal cases."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Court Reporter"},
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/LegalDocument,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical],
   :vs/term_status   "stable"})

(def Document
  "A document (noun) is a bounded physical representation of body of information designed with the capacity (and usually intent) to communicate. A document may manifest symbolic, diagrammatic or sensory-representational information."
  {:owl/equivalentClass :foaf/Document,
   :rdf/about :bibo/Document,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document (noun) is a bounded physical representation of body of information designed with the capacity (and usually intent) to communicate. A document may manifest symbolic, diagrammatic or sensory-representational information."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Document"},
   :vs/term_status "stable"})

(def DocumentPart
  "a distinct part of a larger document or collected document."
  {:rdf/about :bibo/DocumentPart,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "a distinct part of a larger document or collected document."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "document part"},
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :dcterms/isPartOf,
                      :rdf/type           :owl/Restriction}
                     :bibo/Document],
   :vs/term_status "unstable"})

(def DocumentStatus
  "The status of the publication of a document."
  {:rdf/about        :bibo/DocumentStatus,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The status of the publication of a document."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Document Status"},
   :vs/term_status   "stable"})

(def EditedBook
  "An edited book."
  {:rdf/about        :bibo/EditedBook,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An edited book."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Edited Book"},
   :rdfs/subClassOf  :bibo/CollectedDocument,
   :vs/term_status   "stable"})

(def Email
  "A written communication addressed to a person or organization and transmitted electronically."
  {:rdf/about :bibo/Email,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written communication addressed to a person or organization and transmitted electronically."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EMail"},
   :rdfs/subClassOf :bibo/PersonalCommunicationDocument,
   :vs/term_status "stable"})

(def Event
  {:rdf/about :bibo/Event,
   :rdf/type  :owl/Class})

(def Excerpt
  "A passage selected from a larger work."
  {:rdf/about        :bibo/Excerpt,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A passage selected from a larger work."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Excerpt"},
   :rdfs/subClassOf  :bibo/DocumentPart,
   :vs/term_status   "stable"})

(def Film
  "aka movie."
  {:rdf/about        :bibo/Film,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "aka movie."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Film"},
   :rdfs/subClassOf  :bibo/AudioVisualDocument,
   :vs/term_status   "stable"})

(def Hearing
  "An instance or a session in which testimony and arguments are presented, esp. before an official, as a judge in a lawsuit."
  {:rdf/about :bibo/Hearing,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance or a session in which testimony and arguments are presented, esp. before an official, as a judge in a lawsuit."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hearing"},
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def Image
  "A document that presents visual or diagrammatic information."
  {:owl/equivalentClass :foaf/Image,
   :rdf/about :bibo/Image,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A document that presents visual or diagrammatic information."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Image"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Interview
  "A formalized discussion between two or more people."
  {:rdf/about        :bibo/Interview,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A formalized discussion between two or more people."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Interview"},
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   "stable"})

(def Issue
  "something that is printed or published and distributed, esp. a given number of a periodical"
  {:rdf/about :bibo/Issue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "something that is printed or published and distributed, esp. a given number of a periodical"},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Issue"},
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Article,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/CollectedDocument],
   :vs/term_status "stable"})

(def Journal
  "A periodical of scholarly journal Articles."
  {:rdf/about        :bibo/Journal,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A periodical of scholarly journal Articles."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Journal"},
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Issue,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Periodical],
   :vs/term_status   "stable"})

(def LegalCaseDocument
  "A document accompanying a legal case."
  {:rdf/about        :bibo/LegalCaseDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A document accompanying a legal case."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Legal Case Document"},
   :rdfs/subClassOf  :bibo/LegalDocument,
   :vs/term_status   "unstable"})

(def LegalDecision
  "A document containing an authoritative determination (as a decree or judgment) made after consideration of facts or law."
  {:rdf/about :bibo/LegalDecision,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document containing an authoritative determination (as a decree or judgment) made after consideration of facts or law."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Decision"},
   :rdfs/subClassOf :bibo/LegalCaseDocument,
   :vs/term_status "unstable"})

(def LegalDocument
  "A legal document; for example, a court decision, a brief, and so forth."
  {:rdf/about :bibo/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal document; for example, a court decision, a brief, and so forth."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Document"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Legislation
  "A legal document proposing or enacting a law or a group of laws."
  {:rdf/about :bibo/Legislation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal document proposing or enacting a law or a group of laws."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legislation"},
   :rdfs/subClassOf :bibo/LegalDocument,
   :vs/term_status "unstable"})

(def Letter
  "A written or printed communication addressed to a person or organization and usually transmitted by mail."
  {:rdf/about :bibo/Letter,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written or printed communication addressed to a person or organization and usually transmitted by mail."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Letter"},
   :rdfs/subClassOf :bibo/PersonalCommunicationDocument,
   :vs/term_status "stable"})

(def Magazine
  "A periodical of magazine Articles. A magazine is a publication that is issued periodically, usually bound in a paper cover, and typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports."
  {:rdf/about :bibo/Magazine,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A periodical of magazine Articles. A magazine is a publication that is issued periodically, usually bound in a paper cover, and typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Magazine"},
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Periodical],
   :vs/term_status "stable"})

(def Manual
  "A small reference book, especially one giving instructions."
  {:rdf/about :bibo/Manual,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A small reference book, especially one giving instructions."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Manual"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "unstable"})

(def Manuscript
  "An unpublished Document, which may also be submitted to a publisher for publication."
  {:rdf/about :bibo/Manuscript,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An unpublished Document, which may also be submitted to a publisher for publication."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Manuscript"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Map
  "A graphical depiction of geographic features."
  {:rdf/about        :bibo/Map,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A graphical depiction of geographic features."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Map"},
   :rdfs/subClassOf  :bibo/Image,
   :vs/term_status   "unstable"})

(def MultiVolumeBook
  "A loose, thematic, collection of Documents, often Books."
  {:rdf/about :bibo/MultiVolumeBook,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A loose, thematic, collection of Documents, often Books."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Multivolume Book"},
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Book,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection],
   :vs/term_status "stable"})

(def Newspaper
  "A periodical of documents, usually issued daily or weekly, containing current news, editorials, feature articles, and usually advertising."
  {:rdf/about :bibo/Newspaper,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A periodical of documents, usually issued daily or weekly, containing current news, editorials, feature articles, and usually advertising."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Newspaper"},
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Periodical],
   :vs/term_status "stable"})

(def Note
  "Notes or annotations about a resource."
  {:rdf/about        :bibo/Note,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Notes or annotations about a resource."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Note"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def Patent
  "A document describing the exclusive right granted by a government to an inventor to manufacture, use, or sell an invention for a certain number of years."
  {:rdf/about :bibo/Patent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document describing the exclusive right granted by a government to an inventor to manufacture, use, or sell an invention for a certain number of years."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Patent"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Performance
  "A public performance."
  {:rdf/about        :bibo/Performance,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A public performance."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Performance"},
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   "unstable"})

(def Periodical
  "A group of related documents issued at regular intervals."
  {:rdf/about :bibo/Periodical,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A group of related documents issued at regular intervals."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Periodical"},
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Issue,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :dcterms/hasPart,
                      :rdf/type           :owl/Restriction}
                     :bibo/Collection],
   :vs/term_status "stable"})

(def PersonalCommunication
  "A communication between an agent and one or more specific recipients."
  {:rdf/about :bibo/PersonalCommunication,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A communication between an agent and one or more specific recipients."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Communication"},
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def PersonalCommunicationDocument
  "A personal communication manifested in some document."
  {:rdf/about        :bibo/PersonalCommunicationDocument,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A personal communication manifested in some document."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Personal Communication Document"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "stable"})

(def Proceedings
  "A compilation of documents published from an event, such as a conference."
  {:rdf/about :bibo/Proceedings,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A compilation of documents published from an event, such as a conference."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Proceedings"},
   :rdfs/subClassOf :bibo/Book,
   :vs/term_status "unstable"})

(def Quote
  "An excerpted collection of words."
  {:rdf/about        :bibo/Quote,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An excerpted collection of words."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Quote"},
   :rdfs/subClassOf  :bibo/Excerpt,
   :vs/term_status   "stable"})

(def ReferenceSource
  "A document that presents authoritative reference information, such as a dictionary or encylopedia ."
  {:rdf/about :bibo/ReferenceSource,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document that presents authoritative reference information, such as a dictionary or encylopedia ."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reference Source"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "unstable"})

(def Report
  "A document describing an account or statement describing in detail an event, situation, or the like, usually as the result of observation, inquiry, etc.."
  {:rdf/about :bibo/Report,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document describing an account or statement describing in detail an event, situation, or the like, usually as the result of observation, inquiry, etc.."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Report"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def Series
  "A loose, thematic, collection of Documents, often Books."
  {:rdf/about :bibo/Series,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A loose, thematic, collection of Documents, often Books."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Series"},
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Document,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Collection],
   :vs/term_status "stable"})

(def Slide
  "A slide in a slideshow"
  {:rdf/about        :bibo/Slide,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A slide in a slideshow"},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Slide"},
   :rdfs/subClassOf  :bibo/DocumentPart,
   :vs/term_status   "unstable"})

(def Slideshow
  "A presentation of a series of slides, usually presented in front of an audience with written text and images."
  {:rdf/about :bibo/Slideshow,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A presentation of a series of slides, usually presented in front of an audience with written text and images."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Slideshow"},
   :rdfs/subClassOf [{:owl/allValuesFrom :bibo/Slide,
                      :owl/onProperty    :dcterms/hasPart,
                      :rdf/type          :owl/Restriction}
                     :bibo/Document],
   :vs/term_status "stable"})

(def Specification
  "A document describing a specification."
  {:rdf/about        :bibo/Specification,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A document describing a specification."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Specification"},
   :rdfs/subClassOf  :bibo/Document,
   :vs/term_status   "testing"})

(def Standard
  "A document describing a standard: a specification organized through a standards body."
  {:rdf/about :bibo/Standard,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document describing a standard: a specification organized through a standards body."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Standard"},
   :rdfs/subClassOf :bibo/Specification,
   :vs/term_status "stable"})

(def Statute
  "A bill enacted into law."
  {:rdf/about        :bibo/Statute,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A bill enacted into law."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Statute"},
   :rdfs/subClassOf  :bibo/Legislation,
   :vs/term_status   "stable"})

(def Thesis
  "A document created to summarize research findings associated with the completion of an academic degree."
  {:rdf/about :bibo/Thesis,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A document created to summarize research findings associated with the completion of an academic degree."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Thesis"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "stable"})

(def ThesisDegree
  "The academic degree of a Thesis"
  {:rdf/about        :bibo/ThesisDegree,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The academic degree of a Thesis"},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Thesis degree"},
   :vs/term_status   "stable"})

(def Webpage
  "A web page is an online document available (at least initially) on the world wide web. A web page is written first and foremost to appear on the web, as distinct from other online resources such as books, manuscripts or audio documents which use the web primarily as a distribution mechanism alongside other more traditional methods such as print."
  {:rdf/about :bibo/Webpage,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A web page is an online document available (at least initially) on the world wide web. A web page is written first and foremost to appear on the web, as distinct from other online resources such as books, manuscripts or audio documents which use the web primarily as a distribution mechanism alongside other more traditional methods such as print."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Webpage"},
   :rdfs/subClassOf :bibo/Document,
   :vs/term_status "unstable"})

(def Website
  "A group of Webpages accessible on the Web."
  {:rdf/about        :bibo/Website,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A group of Webpages accessible on the Web."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Website"},
   :rdfs/subClassOf  [{:owl/allValuesFrom :bibo/Webpage,
                       :owl/onProperty    :dcterms/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :dcterms/hasPart,
                       :rdf/type           :owl/Restriction}
                      :bibo/Collection],
   :vs/term_status   "unstable"})

(def Workshop
  "A seminar, discussion group, or the like, that emphasizes zxchange of ideas and the demonstration and application of techniques, skills, etc."
  {:rdf/about :bibo/Workshop,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A seminar, discussion group, or the like, that emphasizes zxchange of ideas and the demonstration and application of techniques, skills, etc."},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Workshop"},
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def abstract
  "A summary of the resource."
  {:rdf/about        :bibo/abstract,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "A summary of the resource.",
   :rdfs/domain      :rdfs/Resource,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       "abstract",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def affirmedBy
  "A legal decision that affirms a ruling."
  {:rdf/about          :bibo/affirmedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A legal decision that affirms a ruling."},
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf :bibo/subsequentLegalDecision})

(def annotates
  "Critical or explanatory note for a Document."
  {:rdf/about          :bibo/annotates,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Critical or explanatory note for a Document."},
   :rdfs/domain        :bibo/Note,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "annotates"},
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status     "stable"})

(def argued
  "The date on which a legal case is argued before a court. Date is of format xsd:date"
  {:rdf/about :bibo/argued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The date on which a legal case is argued before a court. Date is of format xsd:date"},
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "date argued"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "unstable"})

(def asin
  {:rdf/about          :bibo/asin,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def authorList
  "An ordered list of authors. Normally, this list is seen as a priority list that order authors by importance."
  {:rdf/about :bibo/authorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ordered list of authors. Normally, this list is seen as a priority list that order authors by importance."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "list of authors"},
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :bibo/contributorList,
   :vs/term_status "stable"})

(def bdarcus
  {:foaf/name        "Bruce D'Arcus",
   :rdf/about        :bibo/bdarcus,
   :rdf/type         [:foaf/Person :owl/NamedIndividual :owl/Thing],
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/seeAlso     "http://purl.org/net/darcusb/info#me"})

(def chapter
  "An chapter number"
  {:rdf/about          :bibo/chapter,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An chapter number"},
   :rdfs/domain        :bibo/BookSection,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "chapter"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "unstable"})

(def citedBy
  "Relates a document to another document that cites the first document."
  {:owl/inverseOf :bibo/cites,
   :rdf/about :bibo/citedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a document to another document that cites the\nfirst document."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cited by"},
   :rdfs/range :bibo/Document,
   :vs/term_status "unstable"})

(def cites
  "Relates a document to another document that is cited by the first document as reference, comment, review, quotation or for another purpose."
  {:rdf/about :bibo/cites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a document to another document that is cited\nby the first document as reference, comment, review, quotation or for\nanother purpose."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cites"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/references,
   :vs/term_status "unstable"})

(def coden
  {:rdf/about          :bibo/coden,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def content
  "This property is for a plain-text rendering of the content of a Document. While the plain-text content of an entire document could be described by this property."
  {:owl/deprecated true,
   :rdf/about :bibo/content,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is for a plain-text rendering of the content of a Document. While the plain-text content of an entire document could be described by this property."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "content"},
   :rdfs/range :rdfs/Literal,
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "bibo:content has been deprecated; we recommend to use \"rdf:value\" for this purpose. Here is the rational behind this choice: http://www.w3.org/TR/2004/REC-rdf-primer-20040210/#rdfvalue"},
   :vs/term_status "unstable"})

(def contributorList
  "An ordered list of contributors. Normally, this list is seen as a priority list that order contributors by importance."
  {:rdf/about :bibo/contributorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ordered list of contributors. Normally, this list is seen as a priority list that order contributors by importance."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "list of contributors"},
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :vs/term_status "stable"})

(def court
  "A court associated with a legal document; for example, that which issues a decision."
  {:rdf/about :bibo/court,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A court associated with a legal document; for example, that which issues a decision."},
   :rdfs/domain :bibo/LegalDocument,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "court"},
   :rdfs/range :foaf/Organization,
   :vs/term_status "unstable"})

(def degree
  "The thesis degree."
  {:rdf/about :bibo/degree,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The thesis degree."},
   :rdfs/domain :bibo/Thesis,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "degree"},
   :rdfs/range :bibo/ThesisDegree,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "We are not defining, using an enumeration, the range of the bibo:degree to the defined list of bibo:ThesisDegree. We won't do it because we want people to be able to define new degress if needed by some special usecases. Creating such an enumeration would restrict this to happen."},
   :vs/term_status "unstable"})

(def director
  "A Film director."
  {:rdf/about          :bibo/director,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A Film director."},
   :rdfs/domain        :bibo/AudioVisualDocument,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "director",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

(def distributor
  "Distributor of a document or a collection of documents."
  {:rdf/about :bibo/distributor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Distributor of a document or a collection of documents."},
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distributor"},
   :rdfs/range :foaf/Agent,
   :vs/term_status "stable"})

(def doi
  {:rdf/about          :bibo/doi,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def eanucc13
  {:rdf/about          :bibo/eanucc13,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def edition
  "The name defining a special edition of a document. Normally its a literal value composed of a version number and words."
  {:rdf/about :bibo/edition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name defining a special edition of a document. Normally its a literal value composed of a version number and words."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "edition"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def editor
  "A person having managerial and sometimes policy-making responsibility for the editorial part of a publishing firm or of a newspaper, magazine, or other publication."
  {:rdf/about :bibo/editor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person having managerial and sometimes policy-making responsibility for the editorial part of a publishing firm or of a newspaper, magazine, or other publication."},
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label "editor",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status "stable"})

(def editorList
  "An ordered list of editors. Normally, this list is seen as a priority list that order editors by importance."
  {:rdf/about :bibo/editorList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ordered list of editors. Normally, this list is seen as a priority list that order editors by importance."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "list of editors"},
   :rdfs/range {:owl/unionOf [:rdf/List :rdf/Seq],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :bibo/contributorList,
   :vs/term_status "stable"})

(def eissn
  {:rdf/about          :bibo/eissn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def fgiasson
  {:foaf/name        "Frederick Giasson",
   :rdf/about        :bibo/fgiasson,
   :rdf/type         [:foaf/Person :owl/NamedIndividual :owl/Thing],
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/seeAlso     "http://fgiasson.com/me/"})

(def gtin14
  {:rdf/about          :bibo/gtin14,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def handle
  {:rdf/about          :bibo/handle,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def identifier
  {:rdf/about   :bibo/identifier,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/range  :rdfs/Literal})

(def interviewee
  "An agent that is interviewed by another agent."
  {:rdf/about          :bibo/interviewee,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An agent that is interviewed by another agent."},
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "interviewee",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

(def interviewer
  "An agent that interview another agent."
  {:rdf/about          :bibo/interviewer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An agent that interview another agent."},
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "interviewer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

(def isbn
  {:rdf/about :bibo/isbn,
   :rdf/type  :owl/DatatypeProperty,
   :rdfs/subPropertyOf :bibo/identifier})

(def isbn10
  {:rdf/about          :bibo/isbn10,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/isbn})

(def isbn13
  {:rdf/about          :bibo/isbn13,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/isbn})

(def issn
  {:rdf/about          :bibo/issn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :bibo/Collection,
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def issue
  "An issue number"
  {:rdf/about          :bibo/issue,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An issue number"},
   :rdfs/domain        :bibo/Issue,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "issue"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})

(def issuer
  "An entity responsible for issuing often informally published documents such as press releases, reports, etc."
  {:rdf/about :bibo/issuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An entity responsible for issuing often informally published documents such as press releases, reports, etc.",
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label "issuer",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/publisher,
   :vs/term_status "unstable"})

(def lccn
  {:rdf/about          :bibo/lccn,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def locator
  "A description (often numeric) that locates an item within a containing document or collection."
  {:rdf/about :bibo/locator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A description (often numeric) that locates an item within a containing document or collection."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "locator"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def numPages
  "The number of pages contained in a document"
  {:rdf/about        :bibo/numPages,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The number of pages contained in a document"},
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "number of pages"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def numVolumes
  "The number of volumes contained in a collection of documents (usually a series, periodical, etc.)."
  {:rdf/about :bibo/numVolumes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of volumes contained in a collection of documents (usually a series, periodical, etc.)."},
   :rdfs/domain :bibo/Collection,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of volumes"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def number
  "A generic item or document number. Not to be confused with issue number."
  {:rdf/about :bibo/number,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A generic item or document number. Not to be confused with issue number."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number"},
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def oclcnum
  {:rdf/about          :bibo/oclcnum,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def organizer
  "The organizer of an event; includes conference organizers, but also government agencies or other bodies that are responsible for conducting hearings."
  {:rdf/about :bibo/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The organizer of an event; includes conference organizers, but also government agencies or other bodies that are responsible for conducting hearings."},
   :rdfs/domain :event/Event,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organizer"},
   :rdfs/range :foaf/Agent,
   :vs/term_status "unstable"})

(def owner
  "Owner of a document or a collection of documents."
  {:rdf/about        :bibo/owner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Owner of a document or a collection of documents."},
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "owner"},
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "unstable"})

(def pageEnd
  "Ending page number within a continuous page range."
  {:rdf/about          :bibo/pageEnd,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Ending page number within a continuous page range."},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "page end"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})

(def pageStart
  "Starting page number within a continuous page range."
  {:rdf/about          :bibo/pageStart,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Starting page number within a continuous page range."},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "page start"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})

(def pages
  "A string of non-contiguous page spans that locate a Document within a Collection. Example: 23-25, 34, 54-56. For continuous page ranges, use the pageStart and pageEnd properties."
  {:rdf/about :bibo/pages,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A string of non-contiguous page spans that locate a Document within a Collection. Example: 23-25, 34, 54-56. For continuous page ranges, use the pageStart and pageEnd properties."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pages"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status "stable"})

(def performer
  {:rdf/about          :bibo/performer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :bibo/Performance,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         "performer",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status     "stable"})

(def pmid
  {:rdf/about          :bibo/pmid,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def prefixName
  "The prefix of a name"
  {:rdf/about        :bibo/prefixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The prefix of a name"},
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "prefix name"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def presentedAt
  "Relates a document to an event; for example, a paper to a conference."
  {:rdf/about :bibo/presentedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a document to an event; for example, a paper to a conference."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "presented at"},
   :rdfs/range :bibo/Event,
   :rdfs/subPropertyOf :event/produced_in,
   :vs/term_status "unstable"})

(def presents
  "Relates an event to associated documents; for example, conference to a paper."
  {:owl/inverseOf :bibo/presentedAt,
   :rdf/about :bibo/presents,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates an event to associated documents; for example, conference to a paper."},
   :rdfs/domain :bibo/Event,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "presents"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "unstable"})

(def producer
  "Producer of a document or a collection of documents."
  {:rdf/about        :bibo/producer,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Producer of a document or a collection of documents."},
   :rdfs/domain      {:owl/unionOf [:bibo/Collection :bibo/Document],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "producer"},
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "stable"})

(def recipient
  "An agent that receives a communication document."
  {:rdf/about        :bibo/recipient,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An agent that receives a communication document."},
   :rdfs/domain      :bibo/PersonalCommunicationDocument,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       "recipient",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "stable"})

(def reproducedIn
  "The resource in which another resource is reproduced."
  {:rdf/about :bibo/reproducedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The resource in which another resource is reproduced."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/isPartOf,
   :vs/term_status "unstable"})

(def reversedBy
  "A legal decision that reverses a ruling."
  {:rdf/about          :bibo/reversedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A legal decision that reverses a ruling."},
   :rdfs/domain        :bibo/LegalDecision,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/range         :bibo/LegalDecision,
   :rdfs/subPropertyOf :bibo/subsequentLegalDecision})

(def reviewOf
  "Relates a review document to a reviewed thing (resource, item, etc.)."
  {:rdf/about :bibo/reviewOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a review document to a reviewed thing (resource, item, etc.)."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "review of"},
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status "stable"})

(def section
  "A section number"
  {:rdf/about :bibo/section,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A section number"},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "section"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Di Rado, Alicia. 1995. Trekking through college: Classes explore\nmodern society using the world of Star trek. Los Angeles Times, March\n15, sec. A, p. 3."},
   :vs/term_status "unstable"})

(def shortDescription
  {:rdf/about   :bibo/shortDescription,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :bibo/Document,
   :rdfs/range  :rdfs/Literal})

(def shortTitle
  "The abbreviation of a title."
  {:rdf/about        :bibo/shortTitle,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The abbreviation of a title."},
   :rdfs/domain      :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "short title"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def sici
  {:rdf/about          :bibo/sici,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def status
  "The publication status of (typically academic) content."
  {:rdf/about :bibo/status,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The publication status of (typically academic) content."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "status"},
   :rdfs/range :bibo/DocumentStatus,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "We are not defining, using an enumeration, the range of the bibo:status to the defined list of bibo:DocumentStatus. We won't do it because we want people to be able to define new status if needed by some special usecases. Creating such an enumeration would restrict this to happen."},
   :vs/term_status "stable"})

(def subsequentLegalDecision
  "A legal decision on appeal that takes action on a case (affirming it, reversing it, etc.)."
  {:rdf/about :bibo/subsequentLegalDecision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A legal decision on appeal that takes action on a case (affirming it, reversing it, etc.)."},
   :rdfs/domain :bibo/LegalDecision,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/range :bibo/LegalDecision,
   :rdfs/subPropertyOf :dcterms/isReferencedBy})

(def suffixName
  "The suffix of a name"
  {:rdf/about        :bibo/suffixName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The suffix of a name"},
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "suffix name"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def transcriptOf
  "Relates a document to some transcribed original."
  {:rdf/about          :bibo/transcriptOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Relates a document to some transcribed original."},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "transcript of"},
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation,
   :vs/term_status     "unstable"})

(def translationOf
  "Relates a translated document to the original document."
  {:rdf/about :bibo/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Relates a translated document to the original document."},
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "translation of"},
   :rdfs/range :bibo/Document,
   :rdfs/subPropertyOf :dcterms/isVersionOf,
   :vs/term_status "stable"})

(def translator
  "A person who translates written document from one language to another."
  {:rdf/about :bibo/translator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person who translates written document from one language to another."},
   :rdfs/domain {:owl/unionOf [:bibo/Collection :bibo/Document],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/bibo/",
   :rdfs/label "translator",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :dcterms/contributor,
   :vs/term_status "stable"})

(def upc
  {:rdf/about          :bibo/upc,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier})

(def uri
  "Universal Resource Identifier of a document"
  {:rdf/about          :bibo/uri,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Universal Resource Identifier of a document"},
   :rdfs/domain        {:owl/unionOf [:bibo/Collection :bibo/Document],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "uri"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/identifier,
   :vs/term_status     "stable"})

(def volume
  "A volume number"
  {:rdf/about          :bibo/volume,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A volume number"},
   :rdfs/domain        :bibo/Document,
   :rdfs/isDefinedBy   "http://purl.org/ontology/bibo/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "volume"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bibo/locator,
   :vs/term_status     "stable"})