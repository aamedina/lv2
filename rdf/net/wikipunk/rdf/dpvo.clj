(ns net.wikipunk.rdf.dpvo
  "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."},
   :dcterms/contributor ["Rigo Wenning"
                         "Georg P Krog"
                         "Simon Steyskal"
                         "Harshvardhan J. Pandit"
                         "Piero Bonatti"
                         "Elmar Kiesling"
                         "Paul Ryan"
                         "Bert Bos"
                         "Javier D. Fernández"
                         "Mark Lizar"
                         "Rob Brennan"
                         "Axel Polleres"
                         "Eva Schlehahn"
                         "Bud Bruegger"
                         "Beatriz Esteves"
                         "Ramisa Gachpaz Hamed"
                         "Julian Flake"
                         "Fajar J. Ekaputra"],
   :dcterms/created #inst "2019-06-18T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Data Privacy Vocabulary (DPV) provides terms (classes and properties) to represent information about legally compliant personal data handling, which includes purposes, processing, personal data, technical and organisational measures."},
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Data Privacy Vocabulary"},
   :owl/versionInfo "1",
   :rdf/about "https://w3id.org/dpv/dpv-owl",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl#",
   :vann/preferredNamespacePrefix "dpvo",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl#"}
  (:refer-clojure :exclude [format]))

(def AcademicResearch
  "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Simon Steyskal"
                     "Javier Fernandez"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting or assisting with research conducted in an academic context e.g. within universities"},
   :rdf/about :dpvo/AcademicResearch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Academic Research"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Education",
   :rdfs/subClassOf :dpvo/ResearchAndDevelopment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AcademicScientificOrganisation
  "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Organisations related to academia or scientific pursuits e.g. Universities, Schools, Research Bodies"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/about :dpvo/AcademicScientificOrganisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Academic or Scientific Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Access
  "to access data"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to access data"},
   :rdf/about           :dpvo/Access,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Access"},
   :rdfs/subClassOf     :dpvo/Use,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AccessControlMethod
  "Methods which restrict access to a place or resource"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Rob Brennan" "Mark Lizar"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Methods which restrict access to a place or resource"},
   :rdf/about :dpvo/AccessControlMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Access Control Method"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AccountManagement
  "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Account Management refers to purposes associated with account management, such as to create, provide, maintain, and manage accounts"},
   :rdf/about :dpvo/AccountManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Account Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Acquire
  "to come into possession or control of the data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to come into possession or control of the data"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Acquire,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acquire"},
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActiveRight
  "The right(s) applicable, provided, or expected that need to be (actively) exercised"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Beatriz Esteves" "Harshvardhan J Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The right(s) applicable, provided, or expected that need to be (actively) exercised"},
   :rdf/about :dpvo/ActiveRight,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Active rights require the entity to expressly exercise them. For example, a Data Subject exercising their right to withdraw their consent."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Active Right"},
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityCompleted
  "State of an activity that has completed i.e. is fully in the past"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity that has completed i.e. is fully in the past"},
   :rdf/about :dpvo/ActivityCompleted,
   :rdf/type [:owl/NamedIndividual :dpvo/ActivityStatus],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Completed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityHalted
  "State of an activity that was occuring in the past, and has been halted or paused or stoped"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity that was occuring in the past, and has been halted or paused or stoped"},
   :rdf/about :dpvo/ActivityHalted,
   :rdf/type [:owl/NamedIndividual :dpvo/ActivityStatus],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Halted"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityMonitoring
  "Monitoring of activities including assessing whether they have been successfully initiated and completed"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Monitoring of activities including assessing whether they have been successfully initiated and completed"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/ActivityMonitoring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Monitoring"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityNotCompleted
  "State of an activity that could not be completed, but has reached some end state"
  {:dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity that could not be completed, but has reached some end state"},
   :rdf/about :dpvo/ActivityNotCompleted,
   :rdf/type [:dpvo/ActivityStatus :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This relates to a 'Stop' state as distinct from a 'Halt' state. It makes no comments on whether the Acitivity can be resumed or continued towards completion."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acitivity Not Completed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityOngoing
  "State of an activity occuring in continuation i.e. currently ongoing"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity occuring in continuation i.e. currently ongoing"},
   :rdf/about :dpvo/ActivityOngoing,
   :rdf/type [:owl/NamedIndividual :dpvo/ActivityStatus],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Ongoing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityProposed
  "State of an activity being proposed or planned i.e. yet to occur"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an activity being proposed or planned i.e. yet to occur"},
   :rdf/about :dpvo/ActivityProposed,
   :rdf/type [:dpvo/ActivityStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Proposed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ActivityStatus
  "Status associated with activity operations and lifecycles"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Status associated with activity operations and lifecycles"},
   :rdf/about :dpvo/ActivityStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adapt
  "to modify the data, often rewritten into a new form for a new use"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to modify the data, often rewritten into a new form for a new use"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Adapt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adapt"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adult
  "A natural person that is not a child i.e. has attained some legally specified age of adulthood"
  {:dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Georg Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A natural person that is not a child i.e. has attained some legally specified age of adulthood"},
   :rdf/about :dpvo/Adult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adult"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Advertising
  "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting advertising i.e. process or artefact used to call attention to a product, service, etc. through announcements, notices, or other forms of communication"},
   :rdf/about :dpvo/Advertising,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Advertising is a subset of Marketing. Advertising by itself does not indicate 'personalisation' i.e. personalised ads."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Advertising"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AlgorithmicLogic
  "The algorithmic logic applied or used"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The algorithmic logic applied or used"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/about :dpvo/AlgorithmicLogic,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Algorithmic Logic is intended as a broad concept for explaining the use of algorithms and automated decisions making within Processing. To describe the actual algorithm, see the Algorithm concept."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Algorithmic Logic"},
   :rdfs/subClassOf :dpvo/AutomationOfProcessing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Align
  "to adjust the data to be in relation to another data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to adjust the data to be in relation to another data"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Align,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Align"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Alter
  "to change the data without changing it into something else"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to change the data without changing it into something else"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Alter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Alter"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Analyse
  "to study or examine the data in detail"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to study or examine the data in detail"},
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/about :dpvo/Analyse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Analyse"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Analyse",
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Anonymisation
  "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Rob Brennan" "Mark Lizar" "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Anonymisation is the process by which data is irreversibly altered in such a way that a data subject can no longer be identified directly or indirectly, either by the entity holding the data alone or in collaboration with other entities and information sources"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://www.iso.org/standard/45123.html",
   :rdf/about :dpvo/Anonymisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anonymisation"},
   :rdfs/subClassOf :dpvo/Deidentification,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Anonymise
  "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to irreversibly alter personal data in such a way that an unique data subject can no longer be identified directly or indirectly or in combination with other data"},
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/about :dpvo/Anonymise,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anonymise"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Anonymise",
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AnonymisedData
  "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Piero Bonatti",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has been (fully and completely) anonymised so that it is no longer considered Personal Data"},
   :rdf/about :dpvo/AnonymisedData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "It is advised to carefully consider indicating data is fully or completely anonymised by determining whether the data by itself or in combination with other data can identify a person. Failing this condition, the data should be denoted as PseudonymisedData. To indicate data is anonymised only for a specified entity (e.g. within an organisation), the concept ContextuallyAnonymisedData (as subclass of PseudonymisedData) should be used instead of AnonymisedData."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anonymised Data"},
   :rdfs/subClassOf :dpvo/NonPersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AntiTerrorismOperations
  "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with activities that detect, prevent, mitigate, or perform other activities for anti-terrorism"},
   :rdf/about :dpvo/AntiTerrorismOperations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anti-Terrorism Operations"},
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Applicant
  "Data subjects that are applicants in some context"
  {:dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Georg P. Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that are applicants in some context"},
   :rdf/about           :dpvo/Applicant,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Applicant"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Assess
  "to assess data for some criteria"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to assess data for some criteria"},
   :rdf/about           :dpvo/Assess,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Assess"},
   :rdfs/subClassOf     :dpvo/Use,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Assessment
  "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The document, plan, or process for assessment or determination towards a purpose e.g. assessment of legality or impact assessments"},
   :rdf/about :dpvo/Assessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Assessment"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AssetManagementProcedures
  "Procedures related to management of assets"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Procedures related to management of assets"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/AssetManagementProcedures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset Management Procedures"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AsylumSeeker
  "Data subjects that are asylum seekers"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that are asylum seekers"},
   :rdf/about           :dpvo/AsylumSeeker,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Asylum Seeker"},
   :rdfs/subClassOf     :dpvo/VulnerableDataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AsymmetricCryptography
  "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of public-key cryptography or asymmetric cryptography involving a public and private pair of keys"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/AsymmetricCryptography,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asymmetric Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AsymmetricEncryption
  "Use of asymmetric cryptography to encrypt data"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of asymmetric cryptography to encrypt data"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/AsymmetricEncryption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asymmetric Encryption"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditApproved
  "State of being approved through the audit"
  {:dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of being approved through the audit"},
   :rdf/about           :dpvo/AuditApproved,
   :rdf/type            [:dpvo/AuditStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Audit Approved"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AuditConditionallyApproved
  "State of being conditionally approved through the audit"
  {:dcterms/created #inst "2022-06-29T00:00:00.000-04:00",
   :dcterms/creator "Paul Ryan",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State of being conditionally approved through the audit"},
   :rdf/about :dpvo/AuditConditionallyApproved,
   :rdf/type [:dpvo/AuditStatus :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A \"conditional approval\" is intended to reflect states where the audit has identified further changes which must be implemented before considering the audit has been 'passed', without requiring another audit to validate them. This is distinct from the case where an audit has state 'rejected', which means changes must be made and submitted for review. The requirements of a 'conditional acceptance' are expected to be minor or not significant enough to warrant another audit to review them."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Conditionally Approved"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditNotRequired
  "State where an audit is determined as not being required"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State where an audit is determined as not being required"},
   :rdf/about :dpvo/AuditNotRequired,
   :rdf/type [:dpvo/AuditStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Not Required"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditRejected
  "State of not being approved or being rejected through the audit"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of not being approved or being rejected through the audit"},
   :rdf/about :dpvo/AuditRejected,
   :rdf/type [:owl/NamedIndividual :dpvo/AuditStatus],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Rejected"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditRequested
  "State of an audit being requested whose outcome is not yet known"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of an audit being requested whose outcome is not yet known"},
   :rdf/about :dpvo/AuditRequested,
   :rdf/type [:dpvo/AuditStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Requested"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditRequired
  "State where an audit is determined as being required but has not been conducted"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where an audit is determined as being required but has not been conducted"},
   :rdf/about :dpvo/AuditRequired,
   :rdf/type [:dpvo/AuditStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audit Required"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuditStatus
  "Status associated with Auditing or Investigation"
  {:dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Status associated with Auditing or Investigation"},
   :rdf/about           :dpvo/AuditStatus,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Audit Status"},
   :rdfs/subClassOf     :dpvo/Status,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Authentication-ABC
  "Use of Attribute Based Credentials (ABC) to perform and manage authentication"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of Attribute Based Credentials (ABC) to perform and manage authentication"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/Authentication-ABC,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication using ABC"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Authentication-PABC
  "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of Privacy-enhacing Attribute Based Credentials (ABC) to perform and manage authentication"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/Authentication-PABC,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication using PABC"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthenticationProtocols
  "Protocols involving validation of identity i.e. authentication of a person or information"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Protocols involving validation of identity i.e. authentication of a person or information"},
   :rdf/about :dpvo/AuthenticationProtocols,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication Protocols"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthorisationProcedure
  "Procedures for determining authorisation through permission or authority"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Rob Brennan" "Mark Lizar" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures for determining authorisation through permission or authority"},
   :rdf/about :dpvo/AuthorisationProcedure,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "non-technical authorisation procedures: How is it described on an organisational level, who gets access to the data"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authorisation Procedure"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthorisationProtocols
  "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Protocols involving authorisation of roles or profiles to determine permission, rights, or privileges"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/AuthorisationProtocols,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authorisation Protocols"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Authority
  "An authority with the power to create or enforce laws, or determine their compliance."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan Pandit" "Georg Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority with the power to create or enforce laws, or determine their compliance."},
   :rdf/about :dpvo/Authority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authority"},
   :rdfs/subClassOf [:dpvo/GovernmentalOrganisation :dpvo/LegalEntity],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AutomatedDecisionMaking
  "Processing that involves automated decision making"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing that involves automated decision making"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/AutomatedDecisionMaking,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Automated decision making can be defined as “the ability to make decisions by technological means without human involvement.” (“Guidelines on Automated individual decision-making and Profiling for the purposes of Regulation 2016/679 (wp251rev.01)”, 2018, p. 8)"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Decision Making"},
   :rdfs/subClassOf [:dpvo/AutomationOfProcessing :dpvo/DecisionMaking],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def AutomatedProcessingWithHumanInput
  "Processing that is automated and involves inputs by Humans"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is automated and involves inputs by Humans"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/about :dpvo/AutomatedProcessingWithHumanInput,
   :rdf/type [:owl/NamedIndividual
              :dpvo/HumanInvolvementForInput
              :dpvo/AutomationOfProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, an algorithm that takes inputs from humans and performs operations based on them"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Processing with Human Input"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AutomatedProcessingWithHumanOversight
  "Processing that is automated and involves oversight by Humans"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Processing that is automated and involves oversight by Humans"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/about :dpvo/AutomatedProcessingWithHumanOversight,
   :rdf/type [:dpvo/AutomationOfProcessing
              :dpvo/HumanInvolvementForOversight
              :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, a human watching metrics to ensure correctness of procedural values and outputs as processing takes place"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Processing with Human Oversight"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AutomatedProcessingWithHumanReview
  "Processing that is automated and involves review by Humans"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is automated and involves review by Humans"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/AutomatedProcessingWithHumanReview,
   :rdf/type [:dpvo/HumanInvolvementForVerification
              :owl/NamedIndividual
              :dpvo/AutomationOfProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, a human verifying outputs of an algorithm for correctness or impact to individuals"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automated Processing with Human Review"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def AutomationOfProcessing
  "Contextual information about the degree of automation and human involvement associated with Processing"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contextual information about the degree of automation and human involvement associated with Processing"},
   :rdf/about :dpvo/AutomationOfProcessing,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "It is difficult to provide a formal definition of automation since any and all processing may be considered automation. This concept instead is intended to explicitly signal the utilisation of automation and its extent towards some context - such as decision making, and to indicate the involvement of humans."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Automation of Processing"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BackgroundChecks
  "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedure where the background of an entity is assessed to identity vulnerabilities and threats due to their current or intended role"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/BackgroundChecks,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Background Checks"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Benefit
  "Impact(s) that acts as or causes benefits"
  {:dcterms/created     #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Georg P Krog"
                         "Beatriz Esteves"
                         "Fajar Ekaputra"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact(s) that acts as or causes benefits"},
   :rdf/about           :dpvo/Benefit,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Benefit"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BiometricAuthentication
  "Use of biometric data for authentication"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Use of biometric data for authentication"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/BiometricAuthentication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Biometric Authentication"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Certification
  "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Certification mechanisms, seals, and marks for the purpose of demonstrating compliance"},
   :rdf/about :dpvo/Certification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Certification"},
   :rdfs/subClassOf :dpvo/CertificationSeal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CertificationSeal
  "Certifications, seals, and marks indicating compliance to regulations or practices"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Certifications, seals, and marks indicating compliance to regulations or practices"},
   :rdf/about :dpvo/CertificationSeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Certification and Seal"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Child
  "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction."
  {:dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A 'child' is a natural legal person who is below a certain legal age depending on the legal jurisdiction."},
   :dcterms/modified #inst "2022-06-22T00:00:00.000-04:00",
   :rdf/about :dpvo/Child,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The legality of age defining a child varies by jurisdiction. In addition, 'child' is distinct from a 'minor'. For example, the legal age for consumption of alcohol can be 21, which makes a person of age 20 a 'minor' in this context. In other cases, 'minor' and 'child' are used interchangeably to refer to a person below some legally defined age."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def Citizen
  "Data subjects that are citizens (for a jurisdiction)"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan"
                     "Beatriz Esteves"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are citizens (for a jurisdiction)"},
   :rdf/about :dpvo/Citizen,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Citizen"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def City
  "A region consisting of urban population and commerce"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A region consisting of urban population and commerce"},
   :rdf/about :dpvo/City,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "City"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Client
  "Data subjects that are clients or recipients of services"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Georg P. Krog"
                     "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are clients or recipients of services"},
   :rdf/about :dpvo/Client,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Client"},
   :rdfs/subClassOf :dpvo/Customer,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CloudLocation
  "Location that is in the 'cloud' i.e. a logical location operated over the internet"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is in the 'cloud' i.e. a logical location operated over the internet"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/CloudLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cloud Location"},
   :rdfs/subClassOf :dpvo/RemoteLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def CodeOfConduct
  "A set of rules or procedures outlining the norms and practices for conducting activities"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A set of rules or procedures outlining the norms and practices for conducting activities"},
   :rdf/about :dpvo/CodeOfConduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Code of Conduct"},
   :rdfs/subClassOf :dpvo/GuidelinesPrinciple,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Collect
  "to gather data from someone"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to gather data from someone"},
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"
                    "https://specialprivacy.ercim.eu/vocabs/processing"],
   :rdf/about :dpvo/Collect,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collect"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Collect",
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CollectedPersonalData
  "Personal Data that has been collected from another source such as the Data Subject"
  {:dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has been collected from another source such as the Data Subject"},
   :rdf/about :dpvo/CollectedPersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To indicate the source of data, use the DataSource concept with the hasDataSource relation"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collected Personal Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Combine
  "to join or merge data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to join or merge data"},
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"
                    "https://specialprivacy.ercim.eu/vocabs/processing"],
   :rdf/about :dpvo/Combine,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Combine"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Aggregate",
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommercialResearch
  "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"
                     "Axel Polleres"
                     "Simon Steyskal"
                     "Elmar Kiesling"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting research in a commercial setting or with intention to commercialise e.g. in a company or sponsored by a company"},
   :rdf/about :dpvo/CommercialResearch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Commercial Research"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Develop",
   :rdfs/subClassOf :dpvo/ResearchAndDevelopment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationForCustomerCare
  "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Care Communication refers to purposes associated with communicating with customers for assisting them, resolving issues, ensuring satisfaction, etc. in relation to services provided"},
   :rdf/about :dpvo/CommunicationForCustomerCare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication for Customer Care"},
   :rdfs/subClassOf [:dpvo/CustomerCare :dpvo/CommunicationManagement],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationManagement
  "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Communication Management refers to purposes associated with providing or managing communication activities e.g. to send an email for notifying some information"},
   :rdf/about :dpvo/CommunicationManagement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This purpose by itself does not sufficiently and clearly indicate what the communication is about. As such, it is recommended to combine it with another purpose to indicate the application. For example, Communication of Payment."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompletelyManualProcessing
  "Processing that is completely un-automated or fully manual"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is completely un-automated or fully manual"},
   :rdf/about :dpvo/CompletelyManualProcessing,
   :rdf/type [:owl/NamedIndividual :dpvo/AutomationOfProcessing],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "For example, a human performing some processing operation"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Completely Manual Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceIndeterminate
  "State where the status of compliance has not been fully assessed, evaluated, or determined"
  {:dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where the status of compliance has not been fully assessed, evaluated, or determined"},
   :rdf/about :dpvo/ComplianceIndeterminate,
   :rdf/type [:owl/NamedIndividual :dpvo/ComplianceStatus],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Indeterminate"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceMonitoring
  "Monitoring of compliance (e.g. internal policy, regulations)"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Monitoring of compliance (e.g. internal policy, regulations)"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/ComplianceMonitoring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Monitoring"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceStatus
  "Status associated with Compliance with some norms, objectives, or requirements"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Status associated with Compliance with some norms, objectives, or requirements"},
   :rdf/about :dpvo/ComplianceStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceUnknown
  "State where the status of compliance is unknown"
  {:dcterms/created     #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State where the status of compliance is unknown"},
   :rdf/about           :dpvo/ComplianceUnknown,
   :rdf/type            [:dpvo/ComplianceStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Compliance Unknown"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ComplianceViolation
  "State where compliance cannot be achieved due to requirements being violated"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where compliance cannot be achieved due to requirements being violated"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/about :dpvo/ComplianceViolation,
   :rdf/type [:dpvo/ComplianceStatus :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Changed from \"violation of compliance\" for consistency with other terms"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance Violation"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def Compliant
  "State of being fully compliant"
  {:dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of being fully compliant"},
   :rdf/about           :dpvo/Compliant,
   :rdf/type            [:owl/NamedIndividual :dpvo/ComplianceStatus],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Compliant"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConformanceStatus
  "Status associated with conformance to a standard, guideline, code, or recommendation"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Status associated with conformance to a standard, guideline, code, or recommendation"},
   :rdf/about :dpvo/ConformanceStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Conformance Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Conformant
  "State of being conformant"
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of being conformant"},
   :rdf/about           :dpvo/Conformant,
   :rdf/type            [:dpvo/ConformanceStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Conformant"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Consent
  "Consent of the Data Subject for specified processing"
  {:dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Consent of the Data Subject for specified processing"},
   :rdf/about :dpvo/Consent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentExpired
  "The state where the temporal or contextual validity of consent has 'expired'"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where the temporal or contextual validity of consent has 'expired'"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentExpired,
   :rdf/type [:owl/NamedIndividual :dpvo/ConsentStatusInvalidForProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the obtained consent has been assigned a duration - which has lapsed or 'expired', making it invalid to be used further for processing data"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Expired"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentGiven
  "The state where consent has been given"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The state where consent has been given"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentGiven,
   :rdf/type [:owl/NamedIndividual :dpvo/ConsentStatusValidForProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the individual clicks on a button, ticks a checkbox, verbally agrees - or any other form that communicates their decision agreeing to the processing of data"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Given"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentInvalidated
  "The state where consent has been deemed to be invalid"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "The state where consent has been deemed to be invalid"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentInvalidated,
   :rdf/type [:owl/NamedIndividual :dpvo/ConsentStatusInvalidForProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is where an investigating authority or a court finds the collected consent did not meet requirements, and 'invalidates' both prior and future uses of it to carry out processing"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Invalidated"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentNotice
  "A Notice for information provision associated with Consent"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A Notice for information provision associated with Consent"},
   :rdf/about :dpvo/ConsentNotice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Notice"},
   :rdfs/subClassOf :dpvo/PrivacyNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRecord
  "A Record of Consent or Consent related activities"
  {:dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Paul Ryan"
                         "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "A Record of Consent or Consent related activities"},
   :rdf/about           :dpvo/ConsentRecord,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consent Record"},
   :rdfs/subClassOf     :dpvo/DataProcessingRecord,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsentRefused
  "The state where consent has been refused"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The state where consent has been refused"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentRefused,
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the individual clicks on a 'disagree' or 'reject' or 'refuse' button, or leaves a checkbox unticked"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Refused"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRequestDeferred
  "State where a request for consent has been deferred without a decision"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where a request for consent has been deferred without a decision"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentRequestDeferred,
   :rdf/type [:owl/NamedIndividual :dpvo/ConsentStatusInvalidForProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when the individual closes or dismisses a notice without making a decision. This state is intended for making the distinction between a notice being provided (as a consent request) and the individual interacting with the notice without making a decision - where the 'ignoring of a notice' is taken as consent being neither given nor refused"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Request Deferred"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRequested
  "State where a request for consent has been made and is awaiting a decision"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where a request for consent has been made and is awaiting a decision"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentRequested,
   :rdf/type [:owl/NamedIndividual :dpvo/ConsentStatusInvalidForProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when a notice has been presented to the individual but they have not made a decision"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Requested"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentRevoked
  "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where the consent is revoked by an entity other than the data subject and which prevents it from being further used as a valid state"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentRevoked,
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when a Data Controller stops utilising previously obtaining consent, such as when that service no longer exists"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Revoked"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentStatus
  "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state or status of 'consent' that provides information reflecting its operational status and validity for processing data"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentStatus,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "States are useful as information artefacts to implement them in controlling processing, and to reflect the process and flow of obtaining and maintaining consent. For example, a database table that stores consent states for specific processing and can be queried to obtain them in an efficient manner. States are also useful in investigations to determine the use and validity of consenting practices"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Status"},
   :rdfs/subClassOf :dpvo/Status,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentStatusInvalidForProcessing
  "States of consent that cannot be used as valid justifications for processing data"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "States of consent that cannot be used as valid justifications for processing data"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentStatusInvalidForProcessing,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This identifies the stages associated with consent that should not be used to process data"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Status Invalid for Processing"},
   :rdfs/subClassOf :dpvo/ConsentStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentStatusValidForProcessing
  "States of consent that can be used as valid justifications for processing data"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "States of consent that can be used as valid justifications for processing data"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentStatusValidForProcessing,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Practically, given consent is the only valid state for processing"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Status Valid for Processing"},
   :rdfs/subClassOf :dpvo/ConsentStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentUnknown
  "State where information about consent is not available or is unknown"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State where information about consent is not available or is unknown"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentUnknown,
   :rdf/type [:dpvo/ConsentStatusInvalidForProcessing :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Consent states can be unknown, for example, when information is not available, or cannot be trusted, or is known to be inaccurate"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Unknown"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsentWithdrawn
  "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where the consent is withdrawn or revoked specifically by the data subject and which prevents it from being further used as a valid state"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/ConsentWithdrawn,
   :rdf/type [:owl/NamedIndividual :dpvo/ConsentStatusInvalidForProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This state can be considered a form of 'revocation' of consent, where the revocation can only be performed by the data subject. Therefore we suggest using ConsentRevoked when it is a non-data-subject entity, and ConsentWithdrawn when it is the data subject"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consent Withdrawn"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Consequence
  "The consequence(s) possible or arising from specified context"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "The consequence(s) possible or arising from specified context"},
   :rdf/about :dpvo/Consequence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsequenceAsSideEffect
  "The consequence(s) possible or arising as a side-effect of specified context"
  {:dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The consequence(s) possible or arising as a side-effect of specified context"},
   :rdf/about :dpvo/ConsequenceAsSideEffect,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence as Side-Effect"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsequenceOfFailure
  "The consequence(s) possible or arising from failure of specified context"
  {:dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The consequence(s) possible or arising from failure of specified context"},
   :rdf/about :dpvo/ConsequenceOfFailure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence of Failure"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsequenceOfSuccess
  "The consequence(s) possible or arising from success of specified context"
  {:dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The consequence(s) possible or arising from success of specified context"},
   :rdf/about :dpvo/ConsequenceOfSuccess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence of Success"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Consult
  "to consult or query data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to consult or query data"},
   :dcterms/source
   ["https://specialprivacy.ercim.eu/vocabs/processing"
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj"],
   :rdf/about :dpvo/Consult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consult"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Query",
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Consultation
  "Consultation is a process of receiving feedback, advice, or opinion from an external agency"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consultation is a process of receiving feedback, advice, or opinion from an external agency"},
   :rdf/about :dpvo/Consultation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consultation"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsultationWithAuthority
  "Consultation with an authority or authoritative entity"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Consultation with an authority or authoritative entity"},
   :rdf/about :dpvo/ConsultationWithAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consultation with Authority"},
   :rdfs/subClassOf :dpvo/Consultation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsultationWithDPO
  "Consultation with Data Protection Officer(s)"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Consultation with Data Protection Officer(s)"},
   :rdf/about           :dpvo/ConsultationWithDPO,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consultation with DPO"},
   :rdfs/subClassOf     :dpvo/Consultation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsultationWithDataSubject
  "Consultation with data subject(s) or their representative(s)"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Consultation with data subject(s) or their representative(s)"},
   :rdf/about :dpvo/ConsultationWithDataSubject,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consultation with Data Subject"},
   :rdfs/subClassOf :dpvo/Consultation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConsultationWithDataSubjectRepresentative
  "Consultation with representative of data subject(s)"
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Consultation with representative of data subject(s)"},
   :rdf/about           :dpvo/ConsultationWithDataSubjectRepresentative,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value
                         "Consultation with Data Subject Representative"},
   :rdfs/subClassOf     :dpvo/ConsultationWithDataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Consumer
  "Data subjects that consume goods or services for direct use"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake"
                     "Paul Ryan"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Data subjects that consume goods or services for direct use"},
   :rdf/about :dpvo/Consumer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consumer"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Context
  "Contextually relevant information not possible to represent through other core concepts"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Javier Fernandez"
                     "Fajar Ekaputra"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contextually relevant information not possible to represent through other core concepts"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/about :dpvo/Context,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Context"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def ContinousFrequency
  "Frequency where occurences are continous"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Frequency where occurences are continous"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about           :dpvo/ContinousFrequency,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Continous Frequency"},
   :rdfs/subClassOf     :dpvo/Frequency,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def Contract
  "Creation, completion, fulfilment, or performance of a contract involving specified processing"
  {:dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Creation, completion, fulfilment, or performance of a contract involving specified processing"},
   :rdf/about :dpvo/Contract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contract"},
   :rdfs/subClassOf [:dpvo/LegalBasis :dpvo/LegalAgreement],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ContractPerformance
  "Fulfilment or performance of a contract involving specified processing"
  {:dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Fulfilment or performance of a contract involving specified processing"},
   :rdf/about :dpvo/ContractPerformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contract Performance"},
   :rdfs/subClassOf :dpvo/Contract,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ContractualTerms
  "Contractual terms governing data handling within or with an entity"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contractual terms governing data handling within or with an entity"},
   :rdf/about :dpvo/ContractualTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contractual Terms"},
   :rdfs/subClassOf :dpvo/LegalAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ControllerProcessorAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller and a Data Processor"},
   :rdf/about :dpvo/ControllerProcessorAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Controller-Processor Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Copy
  "to produce an exact reprodution of the data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to produce an exact reprodution of the data"},
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/about :dpvo/Copy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copy"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Copy",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CounterMoneyLaundering
  "Purposes associated with detection, prevention, and mitigation of mitigate money laundering"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with detection, prevention, and mitigation of mitigate money laundering"},
   :rdf/about :dpvo/CounterMoneyLaundering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Counter Money Laundering"},
   :rdfs/subClassOf :dpvo/FraudPreventionAndDetection,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Country
  "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A political entity indicative of a sovereign or non-sovereign territorial state comprising of distinct geographical areas"},
   :rdf/about :dpvo/Country,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The definition of country is not intended for political interpretation. DPVCG welcomes alternate definitions based in existing sources with global scope, such as UN or ISO."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Country"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CredentialManagement
  "Management of credentials and their use in authorisations"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Management of credentials and their use in authorisations"},
   :rdf/about :dpvo/CredentialManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credential Management"},
   :rdfs/subClassOf :dpvo/AuthorisationProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditChecking
  "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with monitoring, performing, or assessing credit worthiness or solvency"},
   :rdf/about :dpvo/CreditChecking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Checking"},
   :rdfs/subClassOf :dpvo/CustomerSolvencyMonitoring,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CryptographicAuthentication
  "Use of cryptography for authentication"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Use of cryptography for authentication"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/CryptographicAuthentication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Authentication"},
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols :dpvo/CryptographicMethods],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CryptographicKeyManagement
  "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Management of cryptographic keys, including their generation, storage, assessment, and safekeeping"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/CryptographicKeyManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Key Management"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CryptographicMethods
  "Use of cryptographic methods to perform tasks"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of cryptographic methods to perform tasks"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/CryptographicMethods,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Methods"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Customer
  "Data subjects that purchase goods or services"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Beatriz Esteves"
                     "Georg P. Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that purchase goods or services"},
   :rdf/about :dpvo/Customer,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "note: for B2B relations where customers are organisations, this concept only applies for data subjects"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerCare
  "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Care refers to purposes associated with purposes for providing assistance, resolving issues, ensuring satisfaction, etc. in relation to services provided"},
   :rdf/about :dpvo/CustomerCare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Care"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Feedback",
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerClaimsManagement
  "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Claims Management refers to purposes associated with managing claims, including repayment of monies owed"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/CustomerClaimsManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Claims Management"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerManagement
  "Customer Management refers to purposes associated with managing activities related with past, current, and future customers"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Management refers to purposes associated with managing activities related with past, current, and future customers"},
   :rdf/about :dpvo/CustomerManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerOrderManagement
  "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Order Management refers to purposes associated with managing customer orders i.e. processing of an order related to customer's purchase of good or services"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/CustomerOrderManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Order Management"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerRelationshipManagement
  "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Relationship Management refers to purposes associated with managing and analysing interactions with past, current, and potential customers"},
   :rdf/about :dpvo/CustomerRelationshipManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Relationship Management"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CustomerSolvencyMonitoring
  "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Beatriz" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Customer Solvency Monitoring refers to purposes associated with monitor solvency of customers for financial diligence"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/CustomerSolvencyMonitoring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Customer Solvency Monitoring"},
   :rdfs/subClassOf :dpvo/CustomerManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CybersecurityAssessment
  "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Assessment of cybersecurity capabilities in terms of vulnerabilities and effectiveness of controls"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/CybersecurityAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cybersecurity Assessment"},
   :rdfs/subClassOf [:dpvo/SecurityAssessment :dpvo/Assessment],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CybersecurityTraining
  "Training methods related to cybersecurity"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Training methods related to cybersecurity"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/CybersecurityTraining,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cybersecurity Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIA
  "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A DPIA involves determining the potential and actual impact of processing activities on individuals or groups of individuals"},
   :rdf/about :dpvo/DPIA,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Top class: Impact Assessment, and DPIA is sub-class"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Impact Assessment (DPIA)"},
   :rdfs/subClassOf :dpvo/ImpactAssessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Damage
  "Impact that acts as or causes damages"
  {:dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Impact that acts as or causes damages"},
   :rdf/about           :dpvo/Damage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Damage"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Data
  "A broad concept representing  'data' or 'information'"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A broad concept representing  'data' or 'information'"},
   :rdf/about :dpvo/Data,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataBackupProtocols
  "Protocols or plans for backing up of data"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Protocols or plans for backing up of data"},
   :rdf/about           :dpvo/DataBackupProtocols,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Backup Protocols"},
   :rdfs/subClassOf     :dpvo/TechnicalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataController
  "The individual or organisation that decides (or controls) the purpose(s) of processing personal data."
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The individual or organisation that decides (or controls) the purpose(s) of processing personal data."},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_7/oj",
   :rdf/about :dpvo/DataController,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The terms 'Controller' is usually the more common form of indicating a Data Controller. In ISO/IEC the term 'PII Controller' is used."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Controller"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataExporter
  "An entity that 'exports' data where exporting is considered a form of data transfer"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan Pandit" "David Hickey" "Georg Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An entity that 'exports' data where exporting is considered a form of data transfer"},
   :dcterms/source
   "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en",
   :rdf/about :dpvo/DataExporter,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The EU, in particular the EDPB, uses data exporter the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of exporting"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Exporter"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataImporter
  "An entity that 'imports' data where importing is considered a form of data transfer"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Paul Ryan" "Harshvardhan Pandit" "Georg Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An entity that 'imports' data where importing is considered a form of data transfer"},
   :dcterms/source
   "https://edpb.europa.eu/our-work-tools/our-documents/recommendations/recommendations-012020-measures-supplement-transfer_en",
   :rdf/about :dpvo/DataImporter,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The EU, in particular the EDPB, uses data importing the context of cross-border data transfers/flows. These concepts are not bound by jurisdictional or geopolitical scopes within DPV and can thus be used for any notion of importing"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Importer"},
   :rdfs/subClassOf :dpvo/Recipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProcessingAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan"
                     "Julian Flake"
                     "Georg P Krog"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data"},
   :rdf/about :dpvo/DataProcessingAgreement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For specific role-based data processing agreements, see concepts for Processors and JointDataController agreements."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Processing Agreement"},
   :rdfs/subClassOf :dpvo/LegalAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProcessingRecord
  "Record of personal data processing, whether ex-ante or ex-post"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Record of personal data processing, whether ex-ante or ex-post"},
   :rdf/about :dpvo/DataProcessingRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Processing Record"},
   :rdfs/subClassOf :dpvo/RecordsOfActivities,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProcessor
  "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A ‘processor’ means a natural or legal person, public authority, agency or other body which processes personal data on behalf of the controller."},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_8/oj",
   :rdf/about :dpvo/DataProcessor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Processor"},
   :rdfs/subClassOf :dpvo/Recipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProtectionAuthority
  "An authority tasked with overseeing legal compliance regarding privacy and data protection laws."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan Pandit" "Paul Ryan" "Georg Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance regarding privacy and data protection laws."},
   :rdf/about :dpvo/DataProtectionAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataProtectionOfficer
  "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An entity within or authorised by an organisation to monitor internal compliance, inform and advise on data protection obligations and act as a contact point for data subjects and the supervisory authority."},
   :dcterms/modified #inst "2021-12-08T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_37/oj",
   :rdf/about :dpvo/DataProtectionOfficer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Officer"},
   :rdfs/subClassOf :dpvo/Representative,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def DataProtectionTraining
  "Training intended to increase knowledge regarding data protection"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Training intended to increase knowledge regarding data protection"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/DataProtectionTraining,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataPublishedByDataSubject
  "Data is published by the data subject"
  {:dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Julian Flake",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data is published by the data subject"},
   :rdf/about :dpvo/DataPublishedByDataSubject,
   :rdf/type [:dpvo/DataSource :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This refers to where that data was made publicly available by the data subject. An example of this would be a social media profile that the data subject has made publicly accessible."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data published by Data Subject"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataRedaction
  "Removal of sensitive information from a data or document"
  {:dcterms/created #inst "2020-10-01T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Removal of sensitive information from a data or document"},
   :rdf/about :dpvo/DataRedaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Redaction"},
   :rdfs/subClassOf :dpvo/DataSanitisationTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSanitisationTechnique
  "Cleaning or any removal or re-organisation of elements in data based on selective criteria"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Cleaning or any removal or re-organisation of elements in data based on selective criteria"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/DataSanitisationTechnique,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Sanitisation Technique"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSource
  "The source or origin of data"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The source or origin of data"},
   :rdf/about :dpvo/DataSource,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Source' is the direct point of data collection; 'origin' would indicate the original/others points of where the data originates from."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Source"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubProcessor
  "A 'sub-processor' is a processor engaged by another processor"
  {:dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A 'sub-processor' is a processor engaged by another processor"},
   :rdf/about :dpvo/DataSubProcessor,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "sub-processor' is a commonly used term similar to 'sub-contractor' and does not have a specific legal definition"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Sub-Processor"},
   :rdfs/subClassOf :dpvo/DataProcessor,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubject
  "The individual (or category of individuals) whose personal data is being processed"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The individual (or category of individuals) whose personal data is being processed"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj",
   :rdf/about :dpvo/DataSubject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'data subject' is specific to the GDPR, but is functionally equivalent to the term 'individual' and the ISO/IEC term 'PII Principle'."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Subject"},
   :rdfs/subClassOf [:dpvo/NaturalPerson :dpvo/LegalEntity],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubjectRight
  "The rights applicable or provided to a Data Subject"
  {:dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Beatriz Esteves" "Harshvardhan Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The rights applicable or provided to a Data Subject"},
   :rdf/about :dpvo/DataSubjectRight,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Based on use of definitions, the notion of 'Data Subject Right' can be equivalent to 'Individual Right' or 'Right of a Person'"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Subject Right"},
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataSubjectScale
  "Scale of Data Subject(s)"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Rana Saniei" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Scale of Data Subject(s)"},
   :rdf/about           :dpvo/DataSubjectScale,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Subject Scale"},
   :rdfs/subClassOf     :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataTransferImpactAssessment
  "Impact Assessment for conducting data transfers"
  {:dcterms/created     #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact Assessment for conducting data transfers"},
   :rdf/about           :dpvo/DataTransferImpactAssessment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Transfer Impact Assessment"},
   :rdfs/subClassOf     :dpvo/ImpactAssessment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataTransferLegalBasis
  "Specific or special categories and instances of legal basis intended for justifying data transfers"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["David Hickey" "Georg P Krogg"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specific or special categories and instances of legal basis intended for justifying data transfers"},
   :rdf/about :dpvo/DataTransferLegalBasis,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Transfer Legal Basis"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataVolume
  "Volume or Scale of Data"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Rana Saniei" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Volume or Scale of Data"},
   :rdf/about           :dpvo/DataVolume,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Volume"},
   :rdfs/subClassOf     :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DecentralisedLocations
  "Location that is spread across multiple separate areas with no distinction between their importance"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is spread across multiple separate areas with no distinction between their importance"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/DecentralisedLocations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Decentralised Locations"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def DecisionMaking
  "Processing that involves decision making"
  {:dcterms/created     #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Processing that involves decision making"},
   :rdf/about           :dpvo/DecisionMaking,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Decision Making"},
   :rdfs/subClassOf     :dpvo/ProcessingContext,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Deidentification
  "Removal of identity or information to reduce identifiability"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Removal of identity or information to reduce identifiability"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://nvlpubs.nist.gov/nistpubs/ir/2015/NIST.IR.8053.pdf",
   :rdf/about :dpvo/Deidentification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "De-Identification"},
   :rdfs/subClassOf :dpvo/DataSanitisationTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def DeliveryOfGoods
  "Purposes associated with delivering goods and services requested or asked by consumer"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Axel Polleres"
                     "Javier Fernandez"
                     "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with delivering goods and services requested or asked by consumer"},
   :rdf/about :dpvo/DeliveryOfGoods,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery of Goods"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Delivery",
   :rdfs/subClassOf :dpvo/RequestedServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Derive
  "to create new derivative data from the original data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to create new derivative data from the original data"},
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/about :dpvo/Derive,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Derive indicates data is present or obtainable from existing data. For data that is created without such existence, see Infer."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Derive"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Derive",
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DerivedPersonalData
  "Personal Data that is obtained or derived from other data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Personal Data that is obtained or derived from other data"},
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo/DerivedPersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Derived Data is data that is obtained through processing of existing data, e.g. deriving first name from full name. To indicate data that is derived but which was not present or evident within the source data, InferredPersonalData should be used."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Derived Personal Data"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Derived",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DesignStandard
  "A set of rules or guidelines outlining criterias for design"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Axel Polleres" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A set of rules or guidelines outlining criterias for design"},
   :rdf/about :dpvo/DesignStandard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Design Standard"},
   :rdfs/subClassOf :dpvo/GuidelinesPrinciple,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Destruct
  "to process data in a way it no longer exists or cannot be repaired"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to process data in a way it no longer exists or cannot be repaired"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Destruct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Destruct"},
   :rdfs/subClassOf :dpvo/Remove,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeterministicPseudonymisation
  "Pseudonymisation achieved through a deterministic function"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Pseudonymisation achieved through a deterministic function"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/DeterministicPseudonymisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deterministic Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Detriment
  "Impact that acts as or causes detriments"
  {:dcterms/created     #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Fajar Ekaputra"
                         "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Impact that acts as or causes detriments"},
   :rdf/about           :dpvo/Detriment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Detriment"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DifferentialPrivacy
  "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Utilisation of differential privacy where information is shared as patterns or groups to withold individual elements"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/DifferentialPrivacy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Differential Privacy"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DigitalRightsManagement
  "Management of access, use, and other operations associated with digital content"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Management of access, use, and other operations associated with digital content"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/DigitalRightsManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digital Rights Management"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DigitalSignatures
  "Expression and authentication of identity through digital information containing cryptographic signatures"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Expression and authentication of identity through digital information containing cryptographic signatures"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/DigitalSignatures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digital Signatures"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DirectMarketing
  "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting direct marketing i.e. marketing communicated directly to the individual"},
   :rdf/about :dpvo/DirectMarketing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Direct Marketing"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DisasterRecoveryProcedures
  "Procedures related to management of disasters and recovery"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Procedures related to management of disasters and recovery"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/DisasterRecoveryProcedures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disaster Recovery Procedures"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Disclose
  "to make data known"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to make data known"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Disclose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disclose"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DiscloseByTransmission
  "to disclose data by means of transmission"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to disclose data by means of transmission"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/DiscloseByTransmission,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disclose by Transmission"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DisputeManagement
  "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with activities that manage disputes by natural persons, private bodies, or public authorities relevant to organisation"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/DisputeManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dispute Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Disseminate
  "to spread data throughout"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to spread data throughout"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Disseminate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disseminate"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DistributedSystemSecurity
  "Security implementations provided using or over a distributed system"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Security implementations provided using or over a distributed system"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/DistributedSystemSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Distributed System Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DocumentRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of randomised pseudonymisation where the same elements are assigned different values in the same document or database"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/DocumentRandomisedPseudonymisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Document Randomised Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DocumentSecurity
  "Security measures enacted over documents to protect against tampering or restrict access"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Security measures enacted over documents to protect against tampering or restrict access"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/DocumentSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Document Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Duration
  "The duration or temporal limitation"
  {:dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The duration or temporal limitation"},
   :rdf/about           :dpvo/Duration,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Duration"},
   :rdfs/subClassOf     :dpvo/Context,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EconomicUnion
  "A political union of two or more countries based on economic or trade agreements"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A political union of two or more countries based on economic or trade agreements"},
   :rdf/about :dpvo/EconomicUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Economic Union"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EducationalTraining
  "Training methods that are intended to provide education on topic(s)"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Training methods that are intended to provide education on topic(s)"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/EducationalTraining,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Educational Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EffectivenessDeterminationProcedures
  "Procedures intended to determine effectiveness of other measures"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures intended to determine effectiveness of other measures"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/EffectivenessDeterminationProcedures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Effectiveness Determination Procedures"},
   :rdfs/subClassOf :dpvo/Assessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ElderlyDataSubject
  "Data subjects that are considered elderly (i.e. based on age)"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Data subjects that are considered elderly (i.e. based on age)"},
   :rdf/about :dpvo/ElderlyDataSubject,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Elderly Data Subject"},
   :rdfs/subClassOf :dpvo/VulnerableDataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Employee
  "Data subjects that are employees"
  {:dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P. Krog"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that are employees"},
   :rdf/about           :dpvo/Employee,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Employee"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Encryption
  "Technical measures consisting of encryption"
  {:dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"
                         "Mark Lizar"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technical measures consisting of encryption"},
   :rdf/about           :dpvo/Encryption,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Encryption"},
   :rdfs/subClassOf     :dpvo/TechnicalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EncryptionAtRest
  "Encryption of data when being stored (persistent encryption)"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Encryption of data when being stored (persistent encryption)"},
   :rdf/about :dpvo/EncryptionAtRest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Encryption at Rest"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EncryptionInTransfer
  "Encryption of data in transit e.g. when being transferred from one location to another, including sharing"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Rob Brennan" "Harshvardhan J. Pandit" "Mark Lizar"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Encryption of data in transit e.g. when being transferred from one location to another, including sharing"},
   :rdf/about :dpvo/EncryptionInTransfer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Encryption in Transfer"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EncryptionInUse
  "Encryption of data when it is being used"
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Encryption of data when it is being used"},
   :rdf/about           :dpvo/EncryptionInUse,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Encryption in Use"},
   :rdfs/subClassOf     :dpvo/Encryption,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EndToEndEncryption
  "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Encrypted communications where data is encrypted by the sender and decrypted by the intended receiver to prevent access to any third party"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/EndToEndEncryption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "End-to-End Encryption (E2EE)"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EndlessDuration
  "Duration that is (known or intended to be) open ended or without an end"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Duration that is (known or intended to be) open ended or without an end"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/EndlessDuration,
   :rdf/type [:dpvo/Duration :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Endless Duration"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def EnforceAccessControl
  "Purposes associated with conducting or enforcing access control as a form of security"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Javier Fernandez"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Axel Polleres"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting or enforcing access control as a form of security"},
   :rdf/about :dpvo/EnforceAccessControl,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was previously \"Access Control\". Prefixed to distinguish from Technical Measure."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enforce Access Control"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Login",
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EnforceSecurity
  "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with ensuring and enforcing security for data, personnel, or other related matters"},
   :rdf/about :dpvo/EnforceSecurity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was previous \"Security\". Prefixed to distinguish from TechOrg measures."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enforce Security"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EnterIntoContract
  "Processing necessary to enter into contract"
  {:dcterms/created     #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing necessary to enter into contract"},
   :rdf/about           :dpvo/EnterIntoContract,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Enter Into Contract"},
   :rdfs/subClassOf     :dpvo/Contract,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Entity
  "A human or non-human 'thing' that constitutes as an entity"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A human or non-human 'thing' that constitutes as an entity"},
   :rdf/about :dpvo/Entity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Entity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Erase
  "to delete data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to delete data"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Erase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Erase"},
   :rdfs/subClassOf :dpvo/Remove,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EstablishContractualAgreement
  "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract"
  {:dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to establish an agreement, such as for entering into a contract"},
   :rdf/about :dpvo/EstablishContractualAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Establish Contractual Agreement"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EvaluationOfIndividuals
  "Processing that involves evaluation of individuals"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing that involves evaluation of individuals"},
   :dcterms/modified #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/EvaluationOfIndividuals,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Evaluation of Individuals"},
   :rdfs/subClassOf :dpvo/EvaluationScoring,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def EvaluationScoring
  "Processing that involves evaluation and scoring of individuals"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that involves evaluation and scoring of individuals"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/EvaluationScoring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Evaluation and Scoring"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExplicitlyExpressedConsent
  "Consent that is expressed through an explicit action solely conveying a consenting decision"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is expressed through an explicit action solely conveying a consenting decision"},
   :rdf/about :dpvo/ExplicitlyExpressedConsent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Explicitly expressed consent is a more specific form of Expressed consent where the action taken must 'explicitly' relate to only the consent decision. Expressed consent where the consenting is part of other matters therefore cannot satisfy the requirements of explicitly expressed consent. An example of explicit action expressing the consenting decision is a button on a web form where the form only relates to consent, or it is accompanied with suitable text that reiterates what the consenting decision is about"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Explicitly Expressed Consent"},
   :rdfs/subClassOf :dpvo/ExpressedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExpressedConsent
  "Consent that is expressed through an action intended to convey a consenting decision"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is expressed through an action intended to convey a consenting decision"},
   :rdf/about :dpvo/ExpressedConsent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Expressed consent requires the individual take a specific and unambigious action that directly indicates their consent. This action may be a part of other processes such as setting preferences, or agreeing to a contract, or other matters not relating to consent. An example of expressed consent is interacting with a checkbox within a dashboard or clicking a button on a web form"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Expressed Consent"},
   :rdfs/subClassOf :dpvo/InformedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FederatedLocations
  "Location that is federated across multiple separate areas with designation of a primary or central location"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is federated across multiple separate areas with designation of a primary or central location"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/FederatedLocations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Federated Locations"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FileSystemSecurity
  "Security implemented over a file system"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Security implemented over a file system"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/FileSystemSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "File System Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Filter
  "to filter or keep data for some criteria"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to filter or keep data for some criteria"},
   :rdf/about           :dpvo/Filter,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Filter"},
   :rdfs/subClassOf     :dpvo/Transform,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FixedLocation
  "Location that is fixed i.e. known to occur at a specific place"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is fixed i.e. known to occur at a specific place"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/FixedLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Location"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FixedMultipleLocations
  "Location that is fixed with multiple places e.g. multiple cities"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is fixed with multiple places e.g. multiple cities"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/FixedMultipleLocations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Multiple Locations"},
   :rdfs/subClassOf :dpvo/FixedLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FixedOccurencesDuration
  "Duration that takes place a fixed number of times e.g. 3 times"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Duration that takes place a fixed number of times e.g. 3 times"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/FixedOccurencesDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Occurences Duration"},
   :rdfs/subClassOf :dpvo/Duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FixedSingularLocation
  "Location that is fixed at a specific place e.g. a city"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Location that is fixed at a specific place e.g. a city"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/FixedSingularLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixed Singular Location"},
   :rdfs/subClassOf :dpvo/FixedLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def ForProfitOrganisation
  "An organisation that aims to achieve profit as its primary goal"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation that aims to achieve profit as its primary goal"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/ForProfitOrganisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "For-Profit Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def FraudPreventionAndDetection
  "Purposes associated with fraud detection, prevention, and mitigation"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Javier Fernandez"
                     "Axel Polleres"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Elmar Kiesling"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with fraud detection, prevention, and mitigation"},
   :rdf/about :dpvo/FraudPreventionAndDetection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fraud Prevention and Detection"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Government",
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Frequency
  "The frequency or information about periods and repetitions in terms of recurrence."
  {:dcterms/created #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The frequency or information about periods and repetitions in terms of recurrence."},
   :rdf/about :dpvo/Frequency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Frequency"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FulfilmentOfContractualObligation
  "Purposes associated with carrying out data processing to fulfill a contractual obligation"
  {:dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to fulfill a contractual obligation"},
   :rdf/about :dpvo/FulfilmentOfContractualObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fulfilment of Contractual Obligation"},
   :rdfs/subClassOf :dpvo/FulfilmentOfObligation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FulfilmentOfObligation
  "Purposes associated with carrying out data processing to fulfill an obligation"
  {:dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to fulfill an obligation"},
   :rdf/about :dpvo/FulfilmentOfObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fulfilment of Obligation"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FullyAutomatedProcessing
  "Processing that is fully automated"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Processing that is fully automated"},
   :rdf/about           :dpvo/FullyAutomatedProcessing,
   :rdf/type            [:dpvo/AutomationOfProcessing :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Fully Automated Processing"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FullyRandomisedPseudonymisation
  "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of randomised pseudonymisation where the same elements are assigned different values each time they occur"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/FullyRandomisedPseudonymisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fully Randomised Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Generate
  "to generate or create data"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to generate or create data"},
   :rdf/about           :dpvo/Generate,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Generate"},
   :rdfs/subClassOf     :dpvo/Obtain,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GeneratedPersonalData
  "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data"
  {:dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that is generated or brought into existence without relation to existing data i.e. it is not derived or inferred from other data"},
   :rdf/about :dpvo/GeneratedPersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Generated Data is used to indicate data that is produced and is not derived or inferred from other data"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Generated Personal Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GeographicCoverage
  "Indicate of scale in terms of geographic coverage"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicate of scale in terms of geographic coverage"},
   :rdf/about           :dpvo/GeographicCoverage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Geographic Coverage"},
   :rdfs/subClassOf     :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GlobalScale
  "Geographic coverage spanning the entire globe"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Geographic coverage spanning the entire globe"},
   :rdf/about           :dpvo/GlobalScale,
   :rdf/type            [:dpvo/GeographicCoverage :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Global Scale"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GovernanceProcedures
  "Procedures related to governance (e.g. organisation, unit, team, process, system)"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures related to governance (e.g. organisation, unit, team, process, system)"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/GovernanceProcedures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Governance Procedures"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GovernmentalOrganisation
  "An organisation managed or part of government"
  {:dcterms/created     #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "An organisation managed or part of government"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about           :dpvo/GovernmentalOrganisation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Governmental Organisation"},
   :rdfs/subClassOf     :dpvo/Organisation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def GuardianOfDataSubject
  "Guardian(s) of data subjects such as children"
  {:dcterms/created     #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Guardian(s) of data subjects such as children"},
   :rdf/about           :dpvo/GuardianOfDataSubject,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Guardian(s) of Data Subject"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GuidelinesPrinciple
  "Guidelines or Principles regarding processing and operational measures"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Guidelines or Principles regarding processing and operational measures"},
   :rdf/about :dpvo/GuidelinesPrinciple,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GuidelinesPrinciple"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HardwareSecurityProtocols
  "Security protocols implemented at or within hardware"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Security protocols implemented at or within hardware"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/HardwareSecurityProtocols,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hardware Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Harm
  "Impact that acts as or causes harms"
  {:dcterms/created     #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Georg P Krog"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Impact that acts as or causes harms"},
   :rdf/about           :dpvo/Harm,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Harm"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def HashFunctions
  "Use of hash functions to map information or to retrieve a prior categorisation"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of hash functions to map information or to retrieve a prior categorisation"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/HashFunctions,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hash Functions"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HashMessageAuthenticationCode
  "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of HMAC where message authentication code (MAC) utilise a cryptographic hash function and a secret cryptographic key"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/HashMessageAuthenticationCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hash-based Message Authentication Code (HMAC)"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HomomorphicEncryption
  "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of Homomorphic encryption that permits computations on encrypted data without decrypting it"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/HomomorphicEncryption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Homomorphic Encryption"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HugeDataVolume
  "Data volume that is considered huge or more than large within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered huge or more than large within the context"},
   :rdf/about :dpvo/HugeDataVolume,
   :rdf/type [:owl/NamedIndividual :dpvo/DataVolume],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Huge Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HugeScaleOfDataSubjects
  "Scale of data subjects considered huge or more than large within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered huge or more than large within the context"},
   :rdf/about :dpvo/HugeScaleOfDataSubjects,
   :rdf/type [:dpvo/DataSubjectScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Huge Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvement
  "The involvement of humans in specified context"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The involvement of humans in specified context"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/about :dpvo/HumanInvolvement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Human Involvement here broadly refers to any involvement by a human in the context of carrying out processing. This may include verification of outcomes, providing input data for making decisions, or overseeing activities."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement"},
   :rdfs/subClassOf :dpvo/AutomationOfProcessing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvementForInput
  "Human involvement for the purposes of providing inputs"
  {:dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Human involvement for the purposes of providing inputs"},
   :rdf/about :dpvo/HumanInvolvementForInput,
   :rdf/type [:owl/NamedIndividual :dpvo/HumanInvolvement],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement for Input"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvementForOversight
  "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs"
  {:dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Human involvement for the purposes of having oversight over a system, its operations, inputs, or outputs"},
   :rdf/about :dpvo/HumanInvolvementForOversight,
   :rdf/type [:owl/NamedIndividual :dpvo/HumanInvolvement],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement for Oversight"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanInvolvementForVerification
  "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs"
  {:dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Human involvement for the purposes of verification of a system, its operations, inputs, or outputs"},
   :rdf/about :dpvo/HumanInvolvementForVerification,
   :rdf/type [:owl/NamedIndividual :dpvo/HumanInvolvement],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Involvement for Verification"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanResourceManagement
  "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations."
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Beatriz Esteves"
                     "David Hickey"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing humans and 'human resources' within the organisation for effective and efficient operations."},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/HumanResourceManagement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "HR is a broad concept. Its management includes, amongst others - recruiting employees and intermediaries e.g. brokers, independent representatives; payroll administration, remunerations, commissions, and wages; and application of social legislation."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Resource Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityManagementMethod
  "Management of identity and identity-based processes"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Management of identity and identity-based processes"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/IdentityManagementMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Management Method"},
   :rdfs/subClassOf :dpvo/AuthorisationProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityVerification
  "Purposes associated with verifying or authorising identity as a form of security"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Axel Polleres"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Simon Steyskal"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with verifying or authorising identity as a form of security"},
   :rdf/about :dpvo/IdentityVerification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Verification"},
   :rdfs/subClassOf :dpvo/EnforceSecurity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Immigrant
  "Data subjects that are immigrants (for a jurisdiction)"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are immigrants (for a jurisdiction)"},
   :rdf/about :dpvo/Immigrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Immigrant"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Impact
  "The impact(s) possible or arising as a consequence from specified context"
  {:dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Julian Flake"
                     "Fajar Ekaputra"
                     "Georg P Krog"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The impact(s) possible or arising as a consequence from specified context"},
   :rdf/about :dpvo/Impact,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Impact is a stronger notion of consequence in terms of influence, change, or effect on something e.g. for impact assessments"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Impact"},
   :rdfs/subClassOf :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImpactAssessment
  "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Calculating or determining the likelihood of impact of an existing or proposed process, which can involve risks or detriments."},
   :rdf/about :dpvo/ImpactAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Impact Assessment"},
   :rdfs/subClassOf :dpvo/Assessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImpliedConsent
  "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan" "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is implied indirectly through an action not associated solely with conveying a consenting decision"},
   :rdf/about :dpvo/ImpliedConsent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Implied consent is expected to also be Informed Consent. An example is a CCTV notice outside a monitored area that informs the individuals that by walking in they would be consenting to the use of camera for surveillance."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Implied Consent"},
   :rdfs/subClassOf :dpvo/InformedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Importance
  "An indication of 'importance' within a context"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Georg P Krog"
                     "Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "An indication of 'importance' within a context"},
   :rdf/about :dpvo/Importance,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Importance can be used to express importance, desirability, relevance, or significance as a context."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Importance"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImproveExistingProductsAndServices
  "Purposes associated with improving existing products and services"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"
                     "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with improving existing products and services"},
   :rdf/about :dpvo/ImproveExistingProductsAndServices,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Improve Existing Products and Services"},
   :rdfs/subClassOf :dpvo/OptimisationForController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ImproveInternalCRMProcesses
  "Purposes associated with improving customer-relationship management (CRM) processes"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Simon Steyskal"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with improving customer-relationship management (CRM) processes"},
   :rdf/about :dpvo/ImproveInternalCRMProcesses,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Improve Internal CRM Processes"},
   :rdfs/subClassOf [:dpvo/OptimisationForController
                     :dpvo/CustomerRelationshipManagement],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncidentManagementProcedures
  "Procedures related to management of incidents"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Procedures related to management of incidents"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/IncidentManagementProcedures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Incident Management Procedures"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncidentReportingCommunication
  "Procedures related to management of incident reporting"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Procedures related to management of incident reporting"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/IncidentReportingCommunication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Incident Reporting Communication"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncorrectData
  "Data that is known to be incorrect or inconsistent with some quality requirements"
  {:dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data that is known to be incorrect or inconsistent with some quality requirements"},
   :rdf/about :dpvo/IncorrectData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Incorrect Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncreaseServiceRobustness
  "Purposes associated with improving robustness and resilience of services"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"
                     "Fajar Ekaputra"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with improving robustness and resilience of services"},
   :rdf/about :dpvo/IncreaseServiceRobustness,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Increase Service Robustness"},
   :rdfs/subClassOf :dpvo/OptimisationForController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndeterminateDuration
  "Duration that is indeterminate or cannot be determined"
  {:dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Duration that is indeterminate or cannot be determined"},
   :rdf/about :dpvo/IndeterminateDuration,
   :rdf/type [:dpvo/Duration :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indeterminate means (exact or otherwise) information about the duration cannot be determined, which is distinct from 'EndlessDuration' where it is known (or decided) that the duration is open-ended or without an end."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Indeterminate Duration"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndustryConsortium
  "A consortium established and comprising on industry organisations"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A consortium established and comprising on industry organisations"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/about :dpvo/IndustryConsortium,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Industry Consortium"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Infer
  "to infer data from existing data"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to infer data from existing data"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/about :dpvo/Infer,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Infer indicates data that is derived without it being present or obtainable from existing data. For data that is presented, and is 'extracted' or 'obtained' from existing data, see Derive."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Infer"},
   :rdfs/subClassOf :dpvo/Derive,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def InferredPersonalData
  "Personal Data that is obtained through inference from other data"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that is obtained through inference from other data"},
   :rdf/about :dpvo/InferredPersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Inferred Data is derived data generated from existing data, but which did not originally exist within it, e.g. inferring demographics from browsing history."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inferred Personal Data"},
   :rdfs/subClassOf [:dpvo/GeneratedPersonalData :dpvo/DerivedPersonalData],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InformationFlowControl
  "Use of measures to control information flows"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of measures to control information flows"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/InformationFlowControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Information Flow Control"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InformationSecurityPolicy
  "Policy regarding security of information"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Policy regarding security of information"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/InformationSecurityPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Information Security Policy"},
   :rdfs/subClassOf :dpvo/Policy,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InformedConsent
  "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is informed i.e. with the requirement to provide sufficient information to make a consenting decision"},
   :rdf/about :dpvo/InformedConsent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The specifics for what information should be provided or made available will depend on the context, use-case, or relevant legal requirements"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Informed Consent"},
   :rdfs/subClassOf :dpvo/Consent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InnovativeUseOfNewTechnologies
  "Processing that involves use of innovative and new technologies"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that involves use of innovative and new technologies"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/InnovativeUseOfNewTechnologies,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Innovative Use of New Technologies"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InternalResourceOptimisation
  "Purposes associated with optimisation of internal resource availability and usage for organisation"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Axel Polleres"
                     "Javier Fernandez"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of internal resource availability and usage for organisation"},
   :rdf/about :dpvo/InternalResourceOptimisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Internal Resource Optimisation"},
   :rdfs/subClassOf :dpvo/OptimisationForController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def InternationalOrganisation
  "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries"
  {:dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation and its subordinate bodies governed by public international law, or any other body which is set up by, or on the basis of, an agreement between two or more countries"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_26/oj",
   :rdf/about :dpvo/InternationalOrganisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "International Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def IntrusionDetectionSystem
  "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of measures to detect intrusions and other unauthorised attempts to gain access to a system"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/IntrusionDetectionSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intrusion Detection System"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def JobApplicant
  "Data subjects that apply for jobs or employments"
  {:dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Paul Ryan"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Georg P. Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that apply for jobs or employments"},
   :rdf/about           :dpvo/JobApplicant,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Job Applicant"},
   :rdfs/subClassOf     :dpvo/Applicant,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def JointDataControllers
  "A group of Data Controllers that jointly determine the purposes and means of processing"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator ["Georg Krog" "Harshvardhan Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A group of Data Controllers that jointly determine the purposes and means of processing"},
   :rdf/about :dpvo/JointDataControllers,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "To indicate the membership, hasDataController may be used"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Joint Data Controllers"},
   :rdfs/subClassOf :dpvo/DataController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def JointDataControllersAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Beatriz Esteves"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between Controllers within a Joint Controllers relationship"},
   :rdf/about :dpvo/JointDataControllersAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Joint Data Controllers Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Justification
  "A form of documentation providing reaosns, explanations, or justifications"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A form of documentation providing reaosns, explanations, or justifications"},
   :rdf/about :dpvo/Justification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Justification"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LargeDataVolume
  "Data volume that is considered large within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data volume that is considered large within the context"},
   :rdf/about :dpvo/LargeDataVolume,
   :rdf/type [:dpvo/DataVolume :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Large Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LargeScaleOfDataSubjects
  "Scale of data subjects considered large within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Scale of data subjects considered large within the context"},
   :rdf/about :dpvo/LargeScaleOfDataSubjects,
   :rdf/type [:dpvo/DataSubjectScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Large Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LargeScaleProcessing
  "Processing that takes place at large scales (as specified by some criteria)"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that takes place at large scales (as specified by some criteria)"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/LargeScaleProcessing,
   :rdf/type [:owl/NamedIndividual :dpvo/ProcessingScale],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The exact definition of what constitutes \"large scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending this term with the appropriate context."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Large Scale Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Law
  "A law is a set of rules created by government or authorities"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A law is a set of rules created by government or authorities"},
   :rdf/about :dpvo/Law,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Law"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Lawful
  "State of being lawful or legally compliant"
  {:dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of being lawful or legally compliant"},
   :rdf/about           :dpvo/Lawful,
   :rdf/type            [:owl/NamedIndividual :dpvo/Lawfulness],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Lawful"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Lawfulness
  "Status associated with expressing lawfullness or legal compliance"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Status associated with expressing lawfullness or legal compliance"},
   :rdf/about :dpvo/Lawfulness,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lawfulness"},
   :rdfs/subClassOf :dpvo/ComplianceStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LawfulnessUnkown
  "State of the lawfulness not being known"
  {:dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "State of the lawfulness not being known"},
   :rdf/about           :dpvo/LawfulnessUnkown,
   :rdf/type            [:owl/NamedIndividual :dpvo/Lawfulness],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Lawfulness Unknown"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LegalAgreement
  "A legally binding agreement"
  {:dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A legally binding agreement"},
   :rdf/about           :dpvo/LegalAgreement,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Legal Agreement"},
   :rdfs/subClassOf     :dpvo/OrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LegalBasis
  "The Legal basis used to justify processing of personal data"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "The Legal basis used to justify processing of personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/about :dpvo/LegalBasis,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Legal basis (plural: legal bases) are defined by legislations and regulations, whose applicability is usually restricted to specific jurisdictions."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Basis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegalCompliance
  "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with carrying out data processing to fulfill a legal or statutory obligation"},
   :dcterms/modified #inst "2022-11-09T00:00:00.000-05:00",
   :rdf/about :dpvo/LegalCompliance,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This purpose only refers to processing that is additionally required in order to fulfill the obligations and requirements associated with a law. For example, the use of consent would have its own separate purposes, with this purpose addressing a legal requirement for maintaining consent record (along with RecordManagement). This purpose will typically be used with Legal Obligation as the legal basis."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Compliance"},
   :rdfs/subClassOf :dpvo/FulfilmentOfObligation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegalEntity
  "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A human or non-human 'thing' that constitutes as an entity and which is recognised and defined in law"},
   :rdf/about :dpvo/LegalEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Entity"},
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegalObligation
  "Legal Obligation to conduct the specified processing"
  {:dcterms/created #inst "2021-04-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Legal Obligation to conduct the specified processing"},
   :rdf/about :dpvo/LegalObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legal Obligation"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterest
  "Legitimate Interests of a Party as justification for specified processing"
  {:dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of a Party as justification for specified processing"},
   :rdf/about :dpvo/LegitimateInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestAssessment
  "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates an assessment regarding the use of legitimate interest as a lawful basis by the data controller"},
   :rdf/about :dpvo/LegitimateInterestAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest Assessment"},
   :rdfs/subClassOf :dpvo/Assessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestOfController
  "Legitimate Interests of a Data Controller in conducting specified processing"
  {:dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of a Data Controller in conducting specified processing"},
   :rdf/about :dpvo/LegitimateInterestOfController,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest of Controller"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestOfDataSubject
  "Legitimate Interests of the Data Subject in conducting specified processing"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of the Data Subject in conducting specified processing"},
   :rdf/about :dpvo/LegitimateInterestOfDataSubject,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest of Data Subject"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LegitimateInterestOfThirdParty
  "Legitimate Interests of a Third Party in conducting specified processing"
  {:dcterms/created #inst "2021-05-19T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legitimate Interests of a Third Party in conducting specified processing"},
   :rdf/about :dpvo/LegitimateInterestOfThirdParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Legitimate Interest of Third Party"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Likelihood
  "The likelihood or probability or chance of something taking place or occuring"
  {:dcterms/created #inst "2022-07-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The likelihood or probability or chance of something taking place or occuring"},
   :rdf/about :dpvo/Likelihood,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Likelihood can be expressed in a subjective manner, such as 'Unlikely', or in a quantitative manner such as \"Twice in a Day\" (frequency per period). The suggestion is to use quantitative values, or to associate them with subjective terms used so as to enable accurate interpretations and interoperability. See the concepts related to Frequency and Duration for possible uses as a combination to express Likelihood."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocalEnvironmentScale
  "Geographic coverage spanning a specific environment within the locality"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Geographic coverage spanning a specific environment within the locality"},
   :rdf/about :dpvo/LocalEnvironmentScale,
   :rdf/type [:owl/NamedIndividual :dpvo/GeographicCoverage],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, geographic scale of an event take place in a specific building or room"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Local Environment Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocalLocation
  "Location is local"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Location is local"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about           :dpvo/LocalLocation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Local Location"},
   :rdfs/subClassOf     :dpvo/LocationLocality,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def LocalityScale
  "Geographic coverage spanning a specific locality"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Geographic coverage spanning a specific locality"},
   :rdf/about :dpvo/LocalityScale,
   :rdf/type [:dpvo/GeographicCoverage :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, geographic scale of a city or an area within a city"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Locality Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Location
  "A location is a position, site, or area where something is located"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A location is a position, site, or area where something is located"},
   :rdf/about :dpvo/Location,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Location may be geographic, physical, or virtual."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocationFixture
  "The fixture of location refers to whether the location is fixed"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The fixture of location refers to whether the location is fixed"},
   :rdf/about :dpvo/LocationFixture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location Fixture"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LocationLocality
  "Locality refers to whether the specified location is local within some context, e.g. for the user"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Locality refers to whether the specified location is local within some context, e.g. for the user"},
   :dcterms/modified #inst "2022-10-04T00:00:00.000-04:00",
   :rdf/about :dpvo/LocationLocality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location Locality"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def LoggingPolicies
  "Policy for logging of information"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Policy for logging of information"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/LoggingPolicies,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Logging Policies"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaintainCreditCheckingDatabase
  "Purposes associated with maintaining a Credit Checking Database"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with maintaining a Credit Checking Database"},
   :rdf/about :dpvo/MaintainCreditCheckingDatabase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Maintain Credit Checking Database"},
   :rdfs/subClassOf :dpvo/CreditChecking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaintainCreditRatingDatabase
  "Purposes associated with maintaining a Credit Rating Database"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Purposes associated with maintaining a Credit Rating Database"},
   :rdf/about :dpvo/MaintainCreditRatingDatabase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Maintain Credit Rating Database"},
   :rdfs/subClassOf :dpvo/CreditChecking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaintainFraudDatabase
  "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with maintaining a database related to identifying and identified fraud risks and fraud incidents"},
   :rdf/about :dpvo/MaintainFraudDatabase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MaintainFraudDatabase"},
   :rdfs/subClassOf :dpvo/FraudPreventionAndDetection,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MakeAvailable
  "to transform or publish data to be used"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to transform or publish data to be used"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/MakeAvailable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Make Available"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Marketing
  "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting marketing in relation to organisation or products or services e.g. promoting, selling, and distributing"},
   :rdf/about :dpvo/Marketing,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was commercial interest, changed to consider Marketing a separate Purpose category by itself"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marketing"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Match
  "to combine, compare, or match data from different sources"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to combine, compare, or match data from different sources"},
   :dcterms/source "https://ec.europa.eu/newsroom/article29/items/611236",
   :rdf/about :dpvo/Match,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Match"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaterialDamage
  "Impact that acts as or causes material damages"
  {:dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact that acts as or causes material damages"},
   :rdf/about           :dpvo/MaterialDamage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Material Damage"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MediumDataVolume
  "Data volume that is considered medium i.e. neither large nor small within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered medium i.e. neither large nor small within the context"},
   :rdf/about :dpvo/MediumDataVolume,
   :rdf/type [:dpvo/DataVolume :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medium Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MediumScaleOfDataSubjects
  "Scale of data subjects considered medium i.e. neither large nor small within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered medium i.e. neither large nor small within the context"},
   :rdf/about :dpvo/MediumScaleOfDataSubjects,
   :rdf/type [:dpvo/DataSubjectScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medium Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MediumScaleProcessing
  "Processing that takes place at medium scales (as specified by some criteria)"
  {:dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that takes place at medium scales (as specified by some criteria)"},
   :rdf/about :dpvo/MediumScaleProcessing,
   :rdf/type [:dpvo/ProcessingScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medium Scale Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Member
  "Data subjects that are members of a group, organisation, or other collectives"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Julian Flake"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Georg P. Krog"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that are members of a group, organisation, or other collectives"},
   :rdf/about :dpvo/Member,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Member"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MemberPartnerManagement
  "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan" "David Hickey"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with maintaining a registry of shareholders, members, or partners for governance, administration, and management functions"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/MemberPartnerManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Members and Partners Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MentallyVulnerableDataSubject
  "Data subjects that are considered mentally vulnerable"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are considered mentally vulnerable"},
   :rdf/about :dpvo/MentallyVulnerableDataSubject,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mentally Vulnerable Data Subject"},
   :rdfs/subClassOf :dpvo/VulnerableDataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MessageAuthenticationCodes
  "Use of cryptographic methods to authenticate messages"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Use of cryptographic methods to authenticate messages"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/MessageAuthenticationCodes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Message Authentication Codes (MAC)"},
   :rdfs/subClassOf :dpvo/CryptographicAuthentication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MobilePlatformSecurity
  "Security implemented over a mobile platform"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented over a mobile platform"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/MobilePlatformSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mobile Platform Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Modify
  "to modify or change data"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to modify or change data"},
   :rdf/about           :dpvo/Modify,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Modify"},
   :rdfs/subClassOf     :dpvo/Alter,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Monitor
  "to monitor data for some criteria"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to monitor data for some criteria"},
   :rdf/about           :dpvo/Monitor,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor"},
   :rdfs/subClassOf     :dpvo/Consult,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitoringPolicies
  "Policy for monitoring (e.g. progress, performance)"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Policy for monitoring (e.g. progress, performance)"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/MonitoringPolicies,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Monitoring Policies"},
   :rdfs/subClassOf :dpvo/GovernanceProcedures,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MonotonicCounterPseudonymisation
  "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A simple pseudonymisation method where identifiers are substituted by a number chosen by a monotonic counter"},
   :dcterms/modified #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/MonotonicCounterPseudonymisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Monotonic Counter Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Move
  "to move data from one location to another including deleting the original copy"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to move data from one location to another including deleting the original copy"},
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/about :dpvo/Move,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Move"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Move",
   :rdfs/subClassOf :dpvo/Transfer,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MultiFactorAuthentication
  "An authentication system that uses two or more methods to authenticate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authentication system that uses two or more methods to authenticate"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/MultiFactorAuthentication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Multi-Factor Authentication (MFA)"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MultiNationalScale
  "Geographic coverage spanning multiple nations"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Geographic coverage spanning multiple nations"},
   :rdf/about           :dpvo/MultiNationalScale,
   :rdf/type            [:dpvo/GeographicCoverage :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Multi National Scale"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NDA
  "Non-disclosure Agreements e.g. preserving confidentiality of information"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Rob Brennan" "Axel Polleres" "Mark Lizar"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Non-disclosure Agreements e.g. preserving confidentiality of information"},
   :rdf/about :dpvo/NDA,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Disclosure Agreement (NDA)"},
   :rdfs/subClassOf :dpvo/LegalAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NationalAuthority
  "An authority tasked with overseeing legal compliance for a nation"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance for a nation"},
   :dcterms/source "http://purl.org/adms",
   :rdf/about :dpvo/NationalAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "National Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NationalScale
  "Geographic coverage spanning a nation"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Geographic coverage spanning a nation"},
   :rdf/about           :dpvo/NationalScale,
   :rdf/type            [:owl/NamedIndividual :dpvo/GeographicCoverage],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "National Scale"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NaturalPerson
  "A human"
  {:dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A human"},
   :rdf/about           :dpvo/NaturalPerson,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Natural Person"},
   :rdfs/subClassOf     :dpvo/Entity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NearlyGlobalScale
  "Geographic coverage nearly spanning the entire globe"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Geographic coverage nearly spanning the entire globe"},
   :rdf/about :dpvo/NearlyGlobalScale,
   :rdf/type [:owl/NamedIndividual :dpvo/GeographicCoverage],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nearly Global Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Necessity
  "An indication of 'necessity' within a context"
  {:dcterms/created #inst "2022-02-12T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "An indication of 'necessity' within a context"},
   :rdf/about :dpvo/Necessity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Necessity can be used to express need, essentiality, requirement, or compulsion."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Necessity"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NetworkProxyRouting
  "Use of network routing using proxy"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Use of network routing using proxy"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/NetworkProxyRouting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Network Proxy Routing"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NetworkSecurityProtocols
  "Security implemented at or over networks protocols"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented at or over networks protocols"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/NetworkSecurityProtocols,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Network Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonCitizen
  "Data subjects that are not citizens (for a jurisdiction)"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"
                     "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Data subjects that are not citizens (for a jurisdiction)"},
   :rdf/about :dpvo/NonCitizen,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Citizen"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonCommercialResearch
  "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Fajar Ekaputra"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting research in a non-commercial setting e.g. for a non-profit-organisation (NGO)"},
   :rdf/about :dpvo/NonCommercialResearch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Commercial Research"},
   :rdfs/subClassOf :dpvo/ResearchAndDevelopment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonCompliant
  "State of non-compliance where objectives have not been met, but have not been violated"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of non-compliance where objectives have not been met, but have not been violated"},
   :dcterms/modified #inst "2022-09-07T00:00:00.000-04:00",
   :rdf/about :dpvo/NonCompliant,
   :rdf/type [:dpvo/ComplianceStatus :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Changed from not compliant for consistency in commonly used terms"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non Compliant"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def NonConformant
  "State of being non-conformant"
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of being non-conformant"},
   :rdf/about           :dpvo/NonConformant,
   :rdf/type            [:dpvo/ConformanceStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "NonConformant"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NonGovernmentalOrganisation
  "An organisation not part of or independent from the government"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation not part of or independent from the government"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/about :dpvo/NonGovernmentalOrganisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Governmental Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def NonMaterialDamage
  "Impact that acts as or causes non-material damages"
  {:dcterms/created     #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Impact that acts as or causes non-material damages"},
   :rdf/about           :dpvo/NonMaterialDamage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Non-Material Damage"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def NonPersonalData
  "Data that is not Personal Data"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data that is not Personal Data"},
   :rdf/about :dpvo/NonPersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term NonPersonalData is provided to distinguish between PersonalData and other data, e.g. for indicating which data is regulated by privacy laws. To specify personal data that has been anonymised, the concept AnonymisedData should be used."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Personal Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NonProfitOrganisation
  "An organisation that does not aim to achieve profit as its primary goal"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An organisation that does not aim to achieve profit as its primary goal"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :dcterms/source "http://purl.org/adms",
   :rdf/about :dpvo/NonProfitOrganisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Profit Organisation"},
   :rdfs/subClassOf :dpvo/Organisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def NonPublicDataSource
  "A source of data that is not publicly accessible or available"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Paul Ryan"
                     "Harshvardhan J. Pandit"
                     "Georg P Krog"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "A source of data that is not publicly accessible or available"},
   :rdf/about :dpvo/NonPublicDataSource,
   :rdf/type [:dpvo/DataSource :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-Public Data Source"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NotRequired
  "Indication of neither being required nor optional i.e. not relevant or needed"
  {:dcterms/created #inst "2022-02-15T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Paul Ryan"
                     "Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indication of neither being required nor optional i.e. not relevant or needed"},
   :rdf/about :dpvo/NotRequired,
   :rdf/type [:owl/NamedIndividual :dpvo/Necessity],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Not Required"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Notice
  "A notice is an artefact for providing information, choices, or controls"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "David Hickey" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A notice is an artefact for providing information, choices, or controls"},
   :rdf/about :dpvo/Notice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Notice"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Obligation
  "A rule describing an obligation for performing an activity"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A rule describing an obligation for performing an activity"},
   :rdf/about :dpvo/Obligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Obligation"},
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Observe
  "to obtain data through observation"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to obtain data through observation"},
   :rdf/about           :dpvo/Observe,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Observe"},
   :rdfs/subClassOf     :dpvo/Obtain,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ObservedPersonalData
  "Personal Data that has been collected through observation of the Data Subject(s)"
  {:dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has been collected through observation of the Data Subject(s)"},
   :rdf/about :dpvo/ObservedPersonalData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Observed Personal Data"},
   :rdfs/subClassOf :dpvo/CollectedPersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Obtain
  "to solicit or gather data from someone"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to solicit or gather data from someone"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Obtain,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Obtain"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OfficialAuthorityOfController
  "Processing necessary or authorised through the official authority granted to or vested in the Data Controller"
  {:dcterms/created #inst "2021-05-05T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing necessary or authorised through the official authority granted to or vested in the Data Controller"},
   :rdf/about :dpvo/OfficialAuthorityOfController,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Official Authority of Controller"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OftenFrequency
  "Frequency where occurences are often or frequent, but not continous"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Frequency where occurences are often or frequent, but not continous"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/OftenFrequency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Often Frequency"},
   :rdfs/subClassOf :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def OperatingSystemSecurity
  "Security implemented at or through operating systems"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Security implemented at or through operating systems"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/OperatingSystemSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operating System Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OptimisationForConsumer
  "Purposes associated with optimisation of activities and services for consumer or user"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"
                     "Axel Polleres"
                     "Simon Steyskal"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of activities and services for consumer or user"},
   :rdf/about :dpvo/OptimisationForConsumer,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term optmisation here refers to the efficiency of the service in terms of technical provision (or similar means) with benefits for everybody. Personalisation implies making changes that benefit the current user or persona."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Optimisation for Consumer"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Custom",
   :rdfs/subClassOf :dpvo/ServiceOptimisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OptimisationForController
  "Purposes associated with optimisation of activities and services for provider or controller"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Axel Polleres"
                     "Javier Fernandez"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of activities and services for provider or controller"},
   :rdf/about :dpvo/OptimisationForController,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Optimisation for Controller"},
   :rdfs/subClassOf :dpvo/ServiceOptimisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OptimiseUserInterface
  "Purposes associated with optimisation of interfaces presented to the user"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Elmar Kiesling"
                     "Axel Polleres"
                     "Fajar Ekaputra"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of interfaces presented to the user"},
   :rdf/about :dpvo/OptimiseUserInterface,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Optimise User Interface"},
   :rdfs/subClassOf :dpvo/OptimisationForConsumer,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Optional
  "Indication of 'optional' or 'voluntary'"
  {:dcterms/created     #inst "2022-02-14T00:00:00.000-05:00",
   :dcterms/creator     ["Julian Flake"
                         "Beatriz Esteves"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indication of 'optional' or 'voluntary'"},
   :rdf/about           :dpvo/Optional,
   :rdf/type            [:dpvo/Necessity :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Optional"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Organisation
  "A general term reflecting a company or a business or a group acting as a unit"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A general term reflecting a company or a business or a group acting as a unit"},
   :rdf/about :dpvo/Organisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation"},
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationComplianceManagement
  "Purposes associated with managing compliance for organisation in relation to internal policies"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan" "David Hickey"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing compliance for organisation in relation to internal policies"},
   :rdf/about :dpvo/OrganisationComplianceManagement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Note that this concept relates to internal organisational compliance. The concept LegalCompliance should be used for external legal or regulatory compliance."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation Compliance Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationGovernance
  "Purposes associated with conducting activities and functions for governance of an organisation"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "David Hickey"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting activities and functions for governance of an organisation"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/OrganisationGovernance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation Governance"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationRiskManagement
  "Purposes associated with managing risk for organisation's activities"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "David Hickey" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing risk for organisation's activities"},
   :rdf/about :dpvo/OrganisationRiskManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisation Risk Management"},
   :rdfs/subClassOf :dpvo/OrganisationGovernance,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationalMeasure
  "Organisational measures required/followed when processing data of the declared category"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Axel Polleres" "Rob Brennan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Organisational measures required/followed when processing data of the declared category"},
   :rdf/about :dpvo/OrganisationalMeasure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisational Measure"},
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationalUnit
  "Entity within an organisation that does not constitute as a separate legal entity"
  {:dcterms/created #inst "2022-03-23T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Entity within an organisation that does not constitute as a separate legal entity"},
   :rdf/about :dpvo/OrganisationalUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organisational Unit"},
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Organise
  "to organize data for arranging or classifying"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to organize data for arranging or classifying"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Organise,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organise"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PIA
  "Carrying out an impact assessment regarding privacy risks"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Carrying out an impact assessment regarding privacy risks"},
   :rdf/about :dpvo/PIA,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Impact Assessment"},
   :rdfs/subClassOf :dpvo/ImpactAssessment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ParentOfDataSubject
  "Parent(s) of data subjects such as children"
  {:dcterms/created     #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Parent(s) of data subjects such as children"},
   :rdf/about           :dpvo/ParentOfDataSubject,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Parent(s) of Data Subject"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PartiallyAutomatedProcessing
  "Processing that is partially automated or semi-automated"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Processing that is partially automated or semi-automated"},
   :rdf/about :dpvo/PartiallyAutomatedProcessing,
   :rdf/type [:dpvo/AutomationOfProcessing :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, a series of distinct processing operations that are automated individually or have some human involvement"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Partially Automated Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PartiallyCompliant
  "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of partially being compliant i.e. only some objectives have been met, and others have not been in violation"},
   :rdf/about :dpvo/PartiallyCompliant,
   :rdf/type [:dpvo/ComplianceStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Partially Compliant"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Participant
  "Data subjects that participate in some context such as volunteers in a function"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Beatriz Esteves"
                     "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that participate in some context such as volunteers in a function"},
   :rdf/about :dpvo/Participant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PassiveRight
  "The right(s) applicable, provided, or expected that are always (passively) applicable"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Beatriz Esteves" "Harshvardhan J Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The right(s) applicable, provided, or expected that are always (passively) applicable"},
   :rdf/about :dpvo/PassiveRight,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Passive rights do not require the entity to request or exercise them. They are considered to be always applicable. For example, the Right to Privacy (in EU) does not require an exercise for it to be fulfilled."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Passive Right"},
   :rdfs/subClassOf :dpvo/Right,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PasswordAuthentication
  "Use of passwords to perform authentication"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of passwords to perform authentication"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/PasswordAuthentication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Password Authentication"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Patient
  "Data subjects that receive medican attention, treatment, care, advice, or other health related services"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan"
                     "Beatriz Esteves"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that receive medican attention, treatment, care, advice, or other health related services"},
   :rdf/about :dpvo/Patient,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Patient"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentManagement
  "Purposes associated with processing and managing payment in relation to service, including invoicing and records"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with processing and managing payment in relation to service, including invoicing and records"},
   :rdf/about :dpvo/PaymentManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Management"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PenetrationTestingMethods
  "Use of penetration testing to identity weaknessess and vulnerabilities through simulations"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of penetration testing to identity weaknessess and vulnerabilities through simulations"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/PenetrationTestingMethods,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Penetration Testing Methods"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Permission
  "A rule describing a permission to perform an activity"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Beatriz Esteves" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A rule describing a permission to perform an activity"},
   :rdf/about :dpvo/Permission,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Permission"},
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalData
  "Data directly or indirectly associated or related to an individual."
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data directly or indirectly associated or related to an individual."},
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_1/oj",
   :rdf/about :dpvo/PersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This definition of personal data encompasses the concepts used in GDPR Art.4-1 for 'personal data' and ISO/IEC 2700 for 'personally identifiable information (PII)'."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Data"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/langs/usage-policy#AnyData",
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalDataHandling
  "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis."
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernández" "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A high-level Class to describe 'data handling'. This can consist of personal data being processed for a purpose, involving entities, using technical and organisational measures, applicable risks, rights, and legal basis."},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/about :dpvo/PersonalDataHandling,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Data Handling"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Personalisation
  "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s)."
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing customisation based on attributes and/or needs of person(s) or context(s)."},
   :rdf/about :dpvo/Personalisation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This term is a blanket purpose category for indicating personalisation of some other purpose, e.g. by creating a subclass of the other concept and Personalisation"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personalisation"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalisedAdvertising
  "Purposes associated with creating and providing personalised advertising"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised advertising"},
   :rdf/about :dpvo/PersonalisedAdvertising,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personalised Advertising"},
   :rdfs/subClassOf [:dpvo/Personalisation :dpvo/Advertising],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalisedBenefits
  "Purposes associated with creating and providing personalised benefits for a service"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Axel Polleres"
                     "Simon Steyskal"
                     "Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised benefits for a service"},
   :rdf/about :dpvo/PersonalisedBenefits,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personalised Benefits"},
   :rdfs/subClassOf :dpvo/ServicePersonalisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonnelHiring
  "Purposes associated with management and execution of hiring processes of personnel"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with management and execution of hiring processes of personnel"},
   :rdf/about :dpvo/PersonnelHiring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Hiring"},
   :rdfs/subClassOf :dpvo/PersonnelManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonnelManagement
  "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries"
  {:dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with management of personnel associated with the organisation e.g. evaluation and management of employees and intermediaries"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/PersonnelManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Management"},
   :rdfs/subClassOf :dpvo/HumanResourceManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonnelPayment
  "Purposes associated with management and execution of payment of personnel"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with management and execution of payment of personnel"},
   :rdf/about :dpvo/PersonnelPayment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Payment"},
   :rdfs/subClassOf :dpvo/PersonnelManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalAccessControlMethod
  "Access control applied for physical access e.g. premises or equipement"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Access control applied for physical access e.g. premises or equipement"},
   :rdf/about :dpvo/PhysicalAccessControlMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Access Control Method"},
   :rdfs/subClassOf :dpvo/AccessControlMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Policy
  "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols."
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "David Hickey" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A guidance document outlining any of: procedures, plans, principles, decisions, intent, or protocols."},
   :rdf/about :dpvo/Policy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Policy"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PostQuantumCryptography
  "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of algorithms that are intended to be secure against cryptanalytic attack by a quantum computer"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/PostQuantumCryptography,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Post-Quantum Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrimaryImportance
  "Indication of 'primary' or 'main' or 'core' importance"
  {:dcterms/created #inst "2022-02-10T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Georg P Krog"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indication of 'primary' or 'main' or 'core' importance"},
   :rdf/about :dpvo/PrimaryImportance,
   :rdf/type [:dpvo/Importance :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Primary Importance"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyByDefault
  "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Practices regarding selecting appropriate data protection and privacy measures as the 'default' in an activity or service"},
   :rdf/about :dpvo/PrivacyByDefault,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy by Default"},
   :rdfs/subClassOf :dpvo/GuidelinesPrinciple,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyByDesign
  "Practices regarding incorporating data protection and privacy in the design of information and services"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Practices regarding incorporating data protection and privacy in the design of information and services"},
   :rdf/about :dpvo/PrivacyByDesign,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy by Design"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyNotice
  "Represents a notice or document outlining information regarding privacy"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "David Hickey" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Represents a notice or document outlining information regarding privacy"},
   :rdf/about :dpvo/PrivacyNotice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Notice"},
   :rdfs/subClassOf :dpvo/Notice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyPreservingProtocol
  "Use of protocols designed with the intention of provided additional guarentees regarding privacy"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of protocols designed with the intention of provided additional guarentees regarding privacy"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/PrivacyPreservingProtocol,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Preserving Protocol"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivateInformationRetrieval
  "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods to retrieve a record from a system without revealing which record is retrieved"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/PrivateInformationRetrieval,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Private Information Retrieval"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivateLocation
  "Location that is not or cannot be accessed by the public and is controlled as a private space"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is not or cannot be accessed by the public and is controlled as a private space"},
   :rdf/about :dpvo/PrivateLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Private Location"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Processing
  "The processing performed on personal data"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The processing performed on personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/about :dpvo/Processing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Processing"},
   :rdfs/seeAlso
   "https://specialprivacy.ercim.eu/langs/usage-policy#AnyProcessing",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProcessingContext
  "Context or conditions within which processing takes place"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Context or conditions within which processing takes place"},
   :rdf/about :dpvo/ProcessingContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Processing Context"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProcessingScale
  "Scale of Processing"
  {:dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Piero Bonatti"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Scale of Processing"},
   :rdf/about :dpvo/ProcessingScale,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The exact definition of what constitutes \"scale\" depends on use of jurisdictional, domain-specific, or other forms of externally defined criterias. Where possible, this should be reflected by extending the scales provided with the appropriate context."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Processing Scale"},
   :rdfs/subClassOf :dpvo/Scale,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalTraining
  "Training methods that are intended to provide professional knowledge and expertise"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Training methods that are intended to provide professional knowledge and expertise"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/ProfessionalTraining,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Profiling
  "to create a profile that describes or represents a person"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "to create a profile that describes or represents a person"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Profiling,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Profiling"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Prohibition
  "A rule describing a prohibition to perform an activity"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A rule describing a prohibition to perform an activity"},
   :rdf/about :dpvo/Prohibition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prohibition"},
   :rdfs/subClassOf :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProvideEventRecommendations
  "Purposes associated with creating and providing personalised recommendations for events"
  {:dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised recommendations for events"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/about :dpvo/ProvideEventRecommendations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provide Event Recommendations"},
   :rdfs/subClassOf :dpvo/ProvidePersonalisedRecommendations,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProvidePersonalisedRecommendations
  "Purposes associated with creating and providing personalised recommendations"
  {:dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing personalised recommendations"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/about :dpvo/ProvidePersonalisedRecommendations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provide Personalised Recommendations"},
   :rdfs/subClassOf :dpvo/ServicePersonalisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProvideProductRecommendations
  "Purposes associated with creating and providing product recommendations e.g. suggest similar products"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Javier Fernandez"
                     "Fajar Ekaputra"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing product recommendations e.g. suggest similar products"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-04:00",
   :rdf/about :dpvo/ProvideProductRecommendations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provide Product Recommendations"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/purposes#Marketing",
   :rdfs/subClassOf :dpvo/ProvidePersonalisedRecommendations,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Pseudonymisation
  "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Axel Polleres" "Mark Lizar" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Pseudonymisation means the processing of personal data in such a manner that the personal data can no longer be attributed to a specific data subject without the use of additional information, provided that such additional information is kept separately and is subject to technical and organisational measures to ensure that the personal data are not attributed to an identified or identifiable natural person;"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_5/oj",
   :rdf/about :dpvo/Pseudonymisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Deidentification,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Pseudonymise
  "to replace personal identifiable information by artificial identifiers"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator "2022-10-14",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "to replace personal identifiable information by artificial identifiers"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Pseudonymise,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pseudonymise"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def PseudonymisedData
  "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal Data that has undergone a pseudonymisation process or a partial (incomplete) anonymisation process such that it is still considered Personal Data"},
   :rdf/about :dpvo/PseudonymisedData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pseudonymised Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicDataSource
  "A source of data that is publicly accessible or available"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Beatriz Esteves"
                     "Georg P Krog"
                     "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A source of data that is publicly accessible or available"},
   :rdf/about :dpvo/PublicDataSource,
   :rdf/type [:owl/NamedIndividual :dpvo/DataSource],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'Public' is used here in a broad sense. Actual consideration of what is 'Public Data' can vary based on several contextual or jurisdictional factors such as  definition of open, methods of access, permissions and licenses."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Data Source"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicInterest
  "Processing is necessary or beneficial for interest of the public or society at large"
  {:dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or beneficial for interest of the public or society at large"},
   :rdf/about :dpvo/PublicInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Interest"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicLocation
  "Location that is or can be accessed by the public"
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Location that is or can be accessed by the public"},
   :rdf/about           :dpvo/PublicLocation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Public Location"},
   :rdfs/subClassOf     :dpvo/LocalLocation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PublicRelations
  "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog" "David Hickey"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing and conducting public relations processes, including creating goodwill for the organisation"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/PublicRelations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Relations"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Purpose
  "The purpose of processing personal data"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernández" "Axel Polleres"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The purpose of processing personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/about :dpvo/Purpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purpose"},
   :rdfs/seeAlso
   "https://specialprivacy.ercim.eu/langs/usage-policy#AnyPurpose",
   :vann/example "https://w3id.org/dpv/examples#E0004",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def QuantumCryptography
  "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Cryptographic methods that utilise quantum mechanical properties to perform cryptographic tasks"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/QuantumCryptography,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quantum Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Query
  "to query or make enquiries over data"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to query or make enquiries over data"},
   :rdf/about           :dpvo/Query,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Query"},
   :rdfs/subClassOf     :dpvo/Consult,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RNGPseudonymisation
  "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A pseudonymisation method where identifiers are substituted by a number chosen by a Random Number Generator (RNG)"},
   :dcterms/modified #inst "2022-10-13T00:00:00.000-04:00",
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/RNGPseudonymisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RNG Pseudonymisation"},
   :rdfs/subClassOf :dpvo/Pseudonymisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def RandomLocation
  "Location that is random or unknown"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Location that is random or unknown"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about           :dpvo/RandomLocation,
   :rdf/type            [:dpvo/LocationFixture :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Random Location"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def Recipient
  "Entities that receive personal data"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Javier Fernández"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Entities that receive personal data"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source ["https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_9/oj"
                    "https://specialprivacy.ercim.eu/"],
   :rdf/about :dpvo/Recipient,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A recipient of personal data can be used to indicate any entity that receives personal data. This can be a Third Party, Processor (GDPR), or even a Controller."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Recipient"},
   :rdfs/seeAlso
   "https://specialprivacy.ercim.eu/langs/usage-policy#AnyRecipient",
   :rdfs/subClassOf :dpvo/LegalEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Record
  "to make a record (especially media)"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to make a record (especially media)"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Record,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Record"},
   :rdfs/subClassOf :dpvo/Obtain,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RecordManagement
  "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["David Hickey" "Harshvardhan J. Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with manage creation, storage, and use of records relevant to operations, events, and processes e.g. to store logs or access requests"},
   :rdf/about :dpvo/RecordManagement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This purpose relates specifiaclly for record creation and management. This can be combined or used along with other purposes to express intentions such as records for legal compliance or vendor payments."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Record Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RecordsOfActivities
  "Records of activities within some context such as maintainence tasks or governance functions"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Records of activities within some context such as maintainence tasks or governance functions"},
   :rdf/about :dpvo/RecordsOfActivities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Records of Activities"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Region
  "A region is an area or site that is considered a location"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A region is an area or site that is considered a location"},
   :rdf/about :dpvo/Region,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Region"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegionalAuthority
  "An authority tasked with overseeing legal compliance for a region"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance for a region"},
   :dcterms/source "http://purl.org/adms",
   :rdf/about :dpvo/RegionalAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Regional Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegionalScale
  "Geographic coverage spanning a specific region or regions"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Geographic coverage spanning a specific region or regions"},
   :rdf/about :dpvo/RegionalScale,
   :rdf/type [:owl/NamedIndividual :dpvo/GeographicCoverage],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Regional Scale"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegisterOfProcessingActivities
  "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A ROPA is a document maintained by Data Controllers detailing processing activities carried out under their responsibility"},
   :rdf/about :dpvo/RegisterOfProcessingActivities,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Tied to compliance processes and documents, decide how to specify those"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Register of Processing Activities"},
   :rdfs/subClassOf :dpvo/DataProcessingRecord,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RegularityOfRecertification
  "Policy regarding repetition or renewal of existing certification(s)"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Rob Brennan" "Mark Lizar"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Policy regarding repetition or renewal of existing certification(s)"},
   :rdf/about :dpvo/RegularityOfRecertification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Regularity of Re-certification"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoteLocation
  "Location is remote i.e. not local"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Location is remote i.e. not local"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about           :dpvo/RemoteLocation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Remote Location"},
   :rdfs/subClassOf     :dpvo/LocationLocality,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def Remove
  "to destruct or erase data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to destruct or erase data"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Remove,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Remove"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RenewedConsentGiven
  "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The state where a previously given consent has been 'renewed' or 'refreshed' or 'reaffirmed' to form a new instance of given consent"},
   :dcterms/source "https://w3id.org/GConsent",
   :rdf/about :dpvo/RenewedConsentGiven,
   :rdf/type [:owl/NamedIndividual :dpvo/ConsentStatusValidForProcessing],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of this state is when a previously given consent has expired, and the individual is presented a notice regarding continuing associated processing operations - to which they agree. This state can be useful to keep track of 'reconfirmed' or 'refreshed' consent within consent records, assist notices and contextual agents to create better consenting dialogues, and assist with specific legal obligations related to subsequent consenting"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Renewed Consent Given"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RepairImpairments
  "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities"
  {:dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with identifying, rectifying, or otherwise undertaking activities intended to fix or repair impairments to existing functionalities"},
   :rdf/about :dpvo/RepairImpairments,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of identifying and rectifying impairments is the process of finding and fixing errors in products, commonly referred to as debugging"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Repair Impairments"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Representative
  "A representative of a legal entity"
  {:dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Georg Krog"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Beatriz Esteves"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A representative of a legal entity"},
   :dcterms/source      "https://eur-lex.europa.eu/eli/reg/2016/679/art_27/oj",
   :rdf/about           :dpvo/Representative,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Representative"},
   :rdfs/subClassOf     :dpvo/LegalEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestAccepted
  "State of a request being accepted towards fulfilment"
  {:dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State of a request being accepted towards fulfilment"},
   :rdf/about :dpvo/RequestAccepted,
   :rdf/type [:dpvo/RequestStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Accepted"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestAcknowledged
  "State of a request being acknowledged"
  {:dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being acknowledged"},
   :rdf/about           :dpvo/RequestAcknowledged,
   :rdf/type            [:owl/NamedIndividual :dpvo/RequestStatus],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Acknowledged"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestActionDelayed
  "State of a request being delayed towards fulfilment"
  {:dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of a request being delayed towards fulfilment"},
   :rdf/about           :dpvo/RequestActionDelayed,
   :rdf/type            [:dpvo/RequestStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Action Delayed"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestFulfilled
  "State of a request being fulfilled"
  {:dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being fulfilled"},
   :rdf/about           :dpvo/RequestFulfilled,
   :rdf/type            [:owl/NamedIndividual :dpvo/RequestStatus],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Fulfilled"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestInitiated
  "State of a request being initiated"
  {:dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being initiated"},
   :rdf/about           :dpvo/RequestInitiated,
   :rdf/type            [:dpvo/RequestStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Initiated"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestRejected
  "State of a request being rejected towards non-fulfilment"
  {:dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State of a request being rejected towards non-fulfilment"},
   :rdf/about :dpvo/RequestRejected,
   :rdf/type [:owl/NamedIndividual :dpvo/RequestStatus],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Rejected"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestRequiredActionPerformed
  "State of a request's required action having been performed by the other party"
  {:dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of a request's required action having been performed by the other party"},
   :rdf/about :dpvo/RequestRequiredActionPerformed,
   :rdf/type [:dpvo/RequestStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Required Action Performed"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestRequiresAction
  "State of a request requiring an action to be performed from another party"
  {:dcterms/created #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "State of a request requiring an action to be performed from another party"},
   :rdf/about :dpvo/RequestRequiresAction,
   :rdf/type [:dpvo/RequestStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request Requires Action"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RequestStatus
  "Status associated with requests"
  {:dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Status associated with requests"},
   :rdf/about           :dpvo/RequestStatus,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Status"},
   :rdfs/subClassOf     :dpvo/Status,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestStatusQuery
  "State of a request's status being queried"
  {:dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of a request's status being queried"},
   :rdf/about           :dpvo/RequestStatusQuery,
   :rdf/type            [:dpvo/RequestStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Status Query"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestUnfulfilled
  "State of a request being unfulfilled"
  {:dcterms/created     #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "State of a request being unfulfilled"},
   :rdf/about           :dpvo/RequestUnfulfilled,
   :rdf/type            [:dpvo/RequestStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Request Unfulfilled"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RequestedServiceProvision
  "Purposes associated with delivering services as requested by user or consumer"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with delivering services as requested by user or consumer"},
   :rdf/about :dpvo/RequestedServiceProvision,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The use of 'request' here includes where an user explicitly asks for the service and also when an established contract requires the provision of the service"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Requested Service Provision"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Required
  "Indication of 'required' or 'necessary'"
  {:dcterms/created     #inst "2022-02-13T00:00:00.000-05:00",
   :dcterms/creator     ["Paul Ryan"
                         "Georg P Krog"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Beatriz Esteves"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indication of 'required' or 'necessary'"},
   :rdf/about           :dpvo/Required,
   :rdf/type            [:owl/NamedIndividual :dpvo/Necessity],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Required"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ResearchAndDevelopment
  "Purposes associated with conducting research and development for new methods, products, or services"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Javier Fernandez"
                     "Simon Steyskal"
                     "Fajar Ekaputra"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting research and development for new methods, products, or services"},
   :rdf/about :dpvo/ResearchAndDevelopment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Research and Development"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Restrict
  "to apply a restriction on the processsing of specific records"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "to apply a restriction on the processsing of specific records"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Restrict,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Restrict"},
   :rdfs/subClassOf :dpvo/Transform,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Retrieve
  "to retrieve data, often in an automated manner"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to retrieve data, often in an automated manner"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Retrieve,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Retrieve"},
   :rdfs/subClassOf :dpvo/Use,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReviewImpactAssessment
  "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures to review impact assessments in terms of continued validity, adequacy for intended purposes, and conformance of processes with findings"},
   :rdf/about :dpvo/ReviewImpactAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Review Impact Assessment"},
   :rdfs/subClassOf [:dpvo/ReviewProcedure :dpvo/ImpactAssessment],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReviewProcedure
  "A procedure or process that reviews the correctness and validity of other measures and processes"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A procedure or process that reviews the correctness and validity of other measures and processes"},
   :rdf/about :dpvo/ReviewProcedure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Review Procedure"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Right
  "The right(s) applicable, provided, or expected."
  {:dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator ["Beatriz Esteves" "Georg P Krog" "Harshvardhan J Pandit"],
   :dcterms/description
   [{:rdf/language "en",
     :rdf/value    "The right(s) applicable, provided, or expected."}
    {:rdf/language "en",
     :rdf/value    "The right(s) applicable, provided, or expected"}],
   :rdf/about :dpvo/Right,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A 'right' is a legal, social, or ethical principle of freedom or entitlement which dictate the norms regarding what is allowed or owed.. Rights as a concept encompass a broad area of norms and entities, and are not specific to Individuals or Data Protection / Privacy. For individual specific rights, see dpv:DataSubjectRight"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightExerciseActivity
  "An activity representing an exercising of an active right"
  {:dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "An activity representing an exercising of an active right"},
   :rdf/about :dpvo/RightExerciseActivity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "There may be multiple activities associated with exercising and fulfilling rights. See the RightExerciseRecord concept for record-keeping of such activities in a cohesive manner."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Exercise Activity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightExerciseNotice
  "Information associated with exercising of an active right"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J Pandit" "Georg P Krog" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information associated with exercising of an active right"},
   :rdf/about :dpvo/RightExerciseNotice,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept is intended for providing information regarding a right exercise. For specific instances of such exercises, see RightExerciseActivity and RightExerciseRecord."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Exercise Notice"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightExerciseRecord
  "Record of a Right being exercised"
  {:dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J Pandit" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Record of a Right being exercised"},
   :rdf/about :dpvo/RightExerciseRecord,
   :rdf/type [:dpvo/Record :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept represents a record of one or more right exercise activities, such as those associated with a single data subject or service or entity"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Exercise Record"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightFulfilmentNotice
  "Notice provided regarding fulfilment of a right"
  {:dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Notice provided regarding fulfilment of a right"},
   :rdf/about :dpvo/RightFulfilmentNotice,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This notice is associated with situations where information is provided with the intention of progressing the fulfilment of a right. For example, a notice asking for more information regarding the scope of the right, or providing information on where to access the data provided under a right."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Fulfilment Notice"},
   :rdfs/subClassOf :dpvo/Notice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightNonFulfilmentNotice
  "Notice provided regarding non-fulfilment of a right"
  {:dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Notice provided regarding non-fulfilment of a right"},
   :rdf/about :dpvo/RightNonFulfilmentNotice,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This notice is associated with situations where information is provided with the intention of communicating non-fulfilment of a right. For example, to provide justifications on why a right could not be fulfilled or providing information about another entity  who should be approached for exercising this right."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Non-Fulfilment Notice"},
   :rdfs/subClassOf :dpvo/Notice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Risk
  "A risk or possibility or uncertainty of negative effects, impacts, or consequences."
  {:dcterms/created #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A risk or possibility or uncertainty of negative effects, impacts, or consequences."},
   :rdf/about :dpvo/Risk,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Risks can be associated with one or more different concepts such as purpose, processing, personal data, technical or organisational measure."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskLevel
  "The magnitude of a risk expressed as an indication to aid in its management"
  {:dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The magnitude of a risk expressed as an indication to aid in its management"},
   :rdf/about :dpvo/RiskLevel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Risk Levels can be defined as a combination of different characteristics. For example, ISO 31073:2022 defines it as a combination of consequences and their likelihood. Another example would be the Risk Matrix where Risk Level is defined as a combination of Likelihood and Severity associated with the Risk."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Level"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementPlan
  "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A scheme within the risk management framework specifying the approach, the management components, and resources to be applied to the management of risk"},
   :dcterms/source "https://www.iso.org/standard/79637.html",
   :rdf/about :dpvo/RiskManagementPlan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Plan"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementPolicy
  "A policy or statement of the overall intentions and direction of an organisation related to risk management"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A policy or statement of the overall intentions and direction of an organisation related to risk management"},
   :dcterms/source "https://www.iso.org/standard/79637.html",
   :rdf/about :dpvo/RiskManagementPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Policy"},
   :rdfs/subClassOf [:dpvo/Policy :dpvo/SecurityProcedure],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementProcess
  "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The systematic application of management policies, procedures and practices to the activities of communicating, consulting, establishing the context, and identifying, analysing, evaluating, treating, monitoring, and reviewing risk"},
   :dcterms/source ["https://www.iso.org/standard/79637.html"
                    "https://www.iso.org/iso-31000-risk-management.html"],
   :rdf/about :dpvo/RiskManagementProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Process"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMitigationMeasure
  "Measures intended to mitigate, minimise, or prevent risk."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Measures intended to mitigate, minimise, or prevent risk."},
   :rdf/about :dpvo/RiskMitigationMeasure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Mitigation Measure"},
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Rule
  "A rule describing a process or control that directs or determines if and how an activity should be conducted"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A rule describing a process or control that directs or determines if and how an activity should be conducted"},
   :rdf/about :dpvo/Rule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rule"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Safeguard
  "A safeguard is a precautionary measure for the protection against or mitigation of negative effects"
  {:dcterms/created #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A safeguard is a precautionary measure for the protection against or mitigation of negative effects"},
   :rdf/about :dpvo/Safeguard,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept is relevant given the requirement to assert safeguards in cross-border data transfers"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Safeguard"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SafeguardForDataTransfer
  "Represents a safeguard used for data transfer. Can include technical or organisational measures."
  {:dcterms/created #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Represents a safeguard used for data transfer. Can include technical or organisational measures."},
   :rdf/about :dpvo/SafeguardForDataTransfer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Safeguard for Data Transfer"},
   :rdfs/subClassOf :dpvo/Safeguard,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Scale
  "A measurement along some dimension"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator ["Rana Saniei" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A measurement along some dimension"},
   :rdf/about :dpvo/Scale,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Scales are subjective concepts that need to be defined and interpreted within the context of their application. For example, what would be small within one context could be large within another."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scale"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Scope
  "Indication of the extent or range or boundaries associated with(in) a context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indication of the extent or range or boundaries associated with(in) a context"},
   :rdf/about :dpvo/Scope,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scope"},
   :rdfs/subClassOf :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ScoringOfIndividuals
  "Processing that involves scoring of individuals"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Processing that involves scoring of individuals"},
   :dcterms/modified #inst "2022-11-30T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/ScoringOfIndividuals,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scoring of Individuals"},
   :rdfs/subClassOf :dpvo/EvaluationScoring,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Screen
  "to remove data for some criteria"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to remove data for some criteria"},
   :rdf/about           :dpvo/Screen,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Screen"},
   :rdfs/subClassOf     :dpvo/Transform,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Seal
  "A seal or a mark indicating proof of certification to some certification or standard"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Rob Brennan" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A seal or a mark indicating proof of certification to some certification or standard"},
   :rdf/about :dpvo/Seal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Seal"},
   :rdfs/subClassOf :dpvo/CertificationSeal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SearchFunctionalities
  "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities"
  {:dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with providing searching, querying, or other forms of information retrieval related functionalities"},
   :rdf/about :dpvo/SearchFunctionalities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Search Functionalities"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecondaryImportance
  "Indication of 'secondary' or 'minor' or 'auxiliary' importance"
  {:dcterms/created #inst "2022-02-11T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Julian Flake"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indication of 'secondary' or 'minor' or 'auxiliary' importance"},
   :rdf/about :dpvo/SecondaryImportance,
   :rdf/type [:dpvo/Importance :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secondary Importance"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecretSharingSchemes
  "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of secret sharing schemes where the secret can only be reconstructed through combination of sufficient number of individuals"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/SecretSharingSchemes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secret Sharing Schemes"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sector
  "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Javier Fernandez"
                     "Axel Polleres"
                     "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Sector describes the area of application or domain that indicates or restricts scope for interpretation and application of purpose e.g. Agriculture, Banking"},
   :rdf/about :dpvo/Sector,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "There are various sector codes used commonly to indicate the domain of an organisation or business. Examples include NACE (EU), ISIC (UN), SIC and NAICS (USA)."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sector"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecureMultiPartyComputation
  "Use of cryptographic methods for entities to jointly compute functions without revealing inputs"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods for entities to jointly compute functions without revealing inputs"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/SecureMultiPartyComputation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secure Multi-Party Computation"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityAssessment
  "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Assessment of security intended to identity gaps, vulnerabilities, risks, and effectiveness of controls"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/SecurityAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Assessment"},
   :rdfs/subClassOf [:dpvo/SecurityProcedure :dpvo/Assessment],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityKnowledgeTraining
  "Training intended to increase knowledge regarding security"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Training intended to increase knowledge regarding security"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/SecurityKnowledgeTraining,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Knowledge Training"},
   :rdfs/subClassOf :dpvo/StaffTraining,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityMethod
  "Methods that relate to creating and providing security"
  {:dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Methods that relate to creating and providing security"},
   :rdf/about :dpvo/SecurityMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Method"},
   :rdfs/subClassOf :dpvo/TechnicalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityProcedure
  "Procedures associated with assessing, implementing, and evaluating security"
  {:dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Procedures associated with assessing, implementing, and evaluating security"},
   :rdf/about :dpvo/SecurityProcedure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Procedure"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityRoleProcedures
  "Procedures related to security roles"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Procedures related to security roles"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/SecurityRoleProcedures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security Role Procedures"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellDataToThirdParties
  "Purposes associated with selling or sharing data or information to third parties"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with selling or sharing data or information to third parties"},
   :rdf/about :dpvo/SellDataToThirdParties,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Data to Third Parties"},
   :rdfs/subClassOf :dpvo/SellProducts,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellInsightsFromData
  "Purposes associated with selling or sharing insights obtained from analysis of data"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Simon Steyskal"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with selling or sharing insights obtained from analysis of data"},
   :rdf/about :dpvo/SellInsightsFromData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation. Was subclass of commercial interest, changed to reflect selling something"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Insights from Data"},
   :rdfs/subClassOf :dpvo/SellProducts,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellProducts
  "Purposes associated with selling products or services"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Purposes associated with selling products or services"},
   :rdf/about :dpvo/SellProducts,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell here means exchange, submit, or provide in return for direct or indirect compensation."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Products"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SellProductsToDataSubject
  "Purposes associated with selling products or services to the user, consumer, or data subjects"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Elmar Kiesling"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with selling products or services to the user, consumer, or data subjects"},
   :rdf/about :dpvo/SellProductsToDataSubject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sell Products here refers to processing necessary to provide and complete a sale to customers. It should not be confused with providing services with a cost based on an established agreement."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell Products to Data Subject"},
   :rdfs/subClassOf :dpvo/SellProducts,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SensitivePersonalData
  "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal data that is considered 'sensitive' in terms of privacy and/or impact, and therefore requires additional considerations and/or protection"},
   :rdf/about :dpvo/SensitivePersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sensitivity' is a matter of context, and may be defined within legal frameworks. For GDPR, Special categories of personal data are considered a subset of sensitive data. To illustrate the difference between the two, consider the situation where Location data is collected, and which is considered 'sensitive' but not 'special'. As a probable rule, sensitive data require additional considerations whereas special category data requires additional legal basis / justifications."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sensitive Personal Data"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceOptimisation
  "Purposes associated with optimisation of services or activities"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra"
                     "Axel Polleres"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Harshvardhan J. Pandit"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with optimisation of services or activities"},
   :rdf/about :dpvo/ServiceOptimisation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Subclass of ServiceProvision since optimisation is usually considered part of providing services"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Optimisation"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServicePersonalisation
  "Purposes associated with providing personalisation within services or product or activities"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Axel Polleres"
                     "Fajar Ekaputra"
                     "Javier Fernandez"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with providing personalisation within services or product or activities"},
   :rdf/about :dpvo/ServicePersonalisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Personalisation"},
   :rdfs/subClassOf [:dpvo/ServiceProvision :dpvo/Personalisation],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceProvision
  "Purposes associated with providing service or product or activities"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres"
                     "Elmar Kiesling"
                     "Simon Steyskal"
                     "Fajar Ekaputra"
                     "Javier Fernandez"
                     "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with providing service or product or activities"},
   :rdf/about :dpvo/ServiceProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Provision"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceRegistration
  "Purposes associated with registering users and collecting information required for providing a service"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with registering users and collecting information required for providing a service"},
   :rdf/about :dpvo/ServiceRegistration,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An example of service registration is to provide a form that collects information such as preferred language or media format for downloading a movie"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Registration"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceUsageAnalytics
  "Purposes associated with conducting analysis and reporting related to usage of services or products"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting analysis and reporting related to usage of services or products"},
   :dcterms/modified #inst "2022-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/ServiceUsageAnalytics,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Was \"UsageAnalytics\", prefixed with Service to better reflect scope"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Usage Analytics"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def Severity
  "The magnitude of being unwanted or having negative effects such as harmful impacts"
  {:dcterms/created #inst "2022-07-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The magnitude of being unwanted or having negative effects such as harmful impacts"},
   :rdf/about :dpvo/Severity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Severity can be associated with Risk, or its Consequences and Impacts"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Share
  "to give data (or a portion of it) to others"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "to give data (or a portion of it) to others"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Share,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Share"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SingleSignOn
  "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of credentials or processes that enable using one set of credentials to authenticate multiple contexts."},
   :rdf/about :dpvo/SingleSignOn,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Single Sign On"},
   :rdfs/subClassOf :dpvo/AuthenticationProtocols,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SingularDataVolume
  "Data volume that is considered singular i.e. a specific instance or single item"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered singular i.e. a specific instance or single item"},
   :rdf/about :dpvo/SingularDataVolume,
   :rdf/type [:owl/NamedIndividual :dpvo/DataVolume],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Singular Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SingularFrequency
  "Frequency where occurences are singular i.e. they take place only once"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Frequency where occurences are singular i.e. they take place only once"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/SingularFrequency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Singular Frequency"},
   :rdfs/subClassOf :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def SingularScaleOfDataSubjects
  "Scale of data subjects considered singular i.e. a specific data subject"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered singular i.e. a specific data subject"},
   :rdf/about :dpvo/SingularScaleOfDataSubjects,
   :rdf/type [:dpvo/DataSubjectScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Singular Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SmallDataVolume
  "Data volume that is considered small or limited within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered small or limited within the context"},
   :rdf/about :dpvo/SmallDataVolume,
   :rdf/type [:dpvo/DataVolume :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Small Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SmallScaleOfDataSubjects
  "Scale of data subjects considered small or limited within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered small or limited within the context"},
   :rdf/about :dpvo/SmallScaleOfDataSubjects,
   :rdf/type [:dpvo/DataSubjectScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Small Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SmallScaleProcessing
  "Processing that takes place at small scales (as specified by some criteria)"
  {:dcterms/created #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing that takes place at small scales (as specified by some criteria)"},
   :rdf/about :dpvo/SmallScaleProcessing,
   :rdf/type [:dpvo/ProcessingScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Small Scale Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialMediaMarketing
  "Purposes associated with conducting marketing through social media"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with conducting marketing through social media"},
   :rdf/about :dpvo/SocialMediaMarketing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Media Marketing"},
   :rdfs/subClassOf :dpvo/Marketing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SpecialCategoryPersonalData
  "Sensitive Personal Data whose use requires specific legal permission or justification"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Sensitive Personal Data whose use requires specific legal permission or justification"},
   :dcterms/modified #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_1/oj",
   :rdf/about :dpvo/SpecialCategoryPersonalData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'special category' is based on GDPR Art.9, but should not be considered as exlusive to it. DPV considers all Special Categories to also be Sensitive, but whose use is either prohibited or regulated and therefore requires additional legal basis for justification."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Special Category Personal Data"},
   :rdfs/subClassOf :dpvo/SensitivePersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def SporadicDataVolume
  "Data volume that is considered sporadic or sparse within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data volume that is considered sporadic or sparse within the context"},
   :rdf/about :dpvo/SporadicDataVolume,
   :rdf/type [:owl/NamedIndividual :dpvo/DataVolume],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sporadic Data Volume"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SporadicFrequency
  "Frequency where occurences are sporadic or infrequent or sparse"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Frequency where occurences are sporadic or infrequent or sparse"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/SporadicFrequency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sporadic Frequency"},
   :rdfs/subClassOf :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def SporadicScaleOfDataSubjects
  "Scale of data subjects considered sporadic or sparse within the context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale of data subjects considered sporadic or sparse within the context"},
   :rdf/about :dpvo/SporadicScaleOfDataSubjects,
   :rdf/type [:dpvo/DataSubjectScale :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sporadic Scale Of Data Subjects"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StaffTraining
  "Practices and policies regarding training of staff members"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Mark Lizar" "Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Practices and policies regarding training of staff members"},
   :rdf/about :dpvo/StaffTraining,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Staff Training"},
   :rdfs/subClassOf :dpvo/OrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Status
  "The status or state of something"
  {:dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The status or state of something"},
   :rdf/about           :dpvo/Status,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Status"},
   :rdfs/subClassOf     :dpvo/Context,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def StorageCondition
  "Conditions required or followed regarding storage of data"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Conditions required or followed regarding storage of data"},
   :rdf/about :dpvo/StorageCondition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Condition"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageDeletion
  "Deletion or Erasure of data including any deletion guarantees"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Axel Polleres" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Deletion or Erasure of data including any deletion guarantees"},
   :rdf/about :dpvo/StorageDeletion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Deletion"},
   :rdfs/subClassOf :dpvo/StorageCondition,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageDuration
  "Duration or temporal limitation on storage of personal data"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Mark Lizar" "Rob Brennan" "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Duration or temporal limitation on storage of personal data"},
   :rdf/about :dpvo/StorageDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Duration"},
   :rdfs/subClassOf [:dpvo/StorageCondition :dpvo/Duration],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageLocation
  "Location or geospatial scope where the data is stored"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Harshvardhan J. Pandit" "Axel Polleres" "Mark Lizar"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Location or geospatial scope where the data is stored"},
   :rdf/about :dpvo/StorageLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Location"},
   :rdfs/subClassOf [:dpvo/StorageCondition :dpvo/Location],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StorageRestoration
  "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Mark Lizar" "Axel Polleres" "Harshvardhan J. Pandit" "Rob Brennan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Regularity and temporal span of data restoration/backup mechanisms that guarantee that data is preserved"},
   :rdf/about :dpvo/StorageRestoration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Restoration"},
   :rdfs/subClassOf :dpvo/StorageCondition,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Store
  "to keep data for future use"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to keep data for future use"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Store,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Store"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Structure
  "to arrange data according to a structure"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to arrange data according to a structure"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Structure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Structure"},
   :rdfs/subClassOf :dpvo/Organise,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Student
  "Data subjects that are students"
  {:dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Georg P. Krog"
                         "Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that are students"},
   :rdf/about           :dpvo/Student,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Student"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SubProcessorAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator ["Julian Flake"
                     "Beatriz Esteves"
                     "Harshvardhan J. Pandit"
                     "Georg P Krog"
                     "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Processor and a Data (Sub-)Processor"},
   :rdf/about :dpvo/SubProcessorAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sub-Processor Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Subscriber
  "Data subjects that subscribe to service(s)"
  {:dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Beatriz Esteves"
                         "Julian Flake"
                         "Georg P. Krog"
                         "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that subscribe to service(s)"},
   :rdf/about           :dpvo/Subscriber,
   :rdf/type            :owl/Class,
   :rdfs/comment        {:rdf/language "en",
                         :rdf/value
                         "note: subscriber can be customer or consumer"},
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Subscriber"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SupraNationalAuthority
  "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU"
  {:dcterms/created #inst "2022-02-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An authority tasked with overseeing legal compliance for a supra-national union e.g. EU"},
   :dcterms/source "http://purl.org/adms",
   :rdf/about :dpvo/SupraNationalAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Supra-National Authority"},
   :rdfs/subClassOf :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SupraNationalUnion
  "A political union of two or more countries with an establishment of common authority"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A political union of two or more countries with an establishment of common authority"},
   :rdf/about :dpvo/SupraNationalUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Supranational Union"},
   :rdfs/subClassOf :dpvo/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SymmetricCryptography
  "Use of cryptography where the same keys are utilised for encryption and descryption of information"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptography where the same keys are utilised for encryption and descryption of information"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/SymmetricCryptography,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Symmetric Cryptography"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SymmetricEncryption
  "Use of symmetric cryptography to encrypt data"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Use of symmetric cryptography to encrypt data"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/SymmetricEncryption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Symmetric Encryption"},
   :rdfs/subClassOf :dpvo/Encryption,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SyntheticData
  "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Synthetic data reffers to artificially created data such that it is intended to resemble real data (personal or non-personal), but does not refer to any specific identified or identifiable individual, or to the real measure of an observable parameter in the case of non-personal data"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/SyntheticData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Synthetic Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystematicMonitoring
  "Processing that involves systematic monitoring of individuals"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Piero Bonatti" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Processing that involves systematic monitoring of individuals"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/SystematicMonitoring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Systematic Monitoring"},
   :rdfs/subClassOf :dpvo/ProcessingContext,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TargetedAdvertising
  "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals"
  {:dcterms/created #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with creating and providing pesonalised advertisement where the personalisation is targeted to a specific individual or group of individuals"},
   :rdf/about :dpvo/TargetedAdvertising,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Targeted Advertising"},
   :rdfs/subClassOf :dpvo/PersonalisedAdvertising,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TechnicalMeasure
  "Technical measures required/followed when processing data of the declared category"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator
   ["Rob Brennan" "Mark Lizar" "Harshvardhan J. Pandit" "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technical measures required/followed when processing data of the declared category"},
   :rdf/about :dpvo/TechnicalMeasure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technical Measure"},
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TechnicalOrganisationalMeasure
  "The Technical and Organisational measures used."
  {:dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     "Bud Bruegger",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "The Technical and Organisational measures used."},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/about           :dpvo/TechnicalOrganisationalMeasure,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Technical and Organisational Measure"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TechnicalServiceProvision
  "Purposes associated with managing and providing technical processes and functions necessary for delivering services"
  {:dcterms/created #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing and providing technical processes and functions necessary for delivering services"},
   :rdf/about :dpvo/TechnicalServiceProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technical Service Provision"},
   :rdfs/subClassOf :dpvo/ServiceProvision,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Technology
  "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The technology, technological implementation, or any techniques, skills, methods, and processes used or applied"},
   :rdf/about :dpvo/Technology,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Examples (non-exhaustive) include: Algorithm, Process, Method, Skill, Database, Cookies, Server, Device"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technology"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TemporalDuration
  "Duration that has a fixed temporal duration e.g. 6 months"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Duration that has a fixed temporal duration e.g. 6 months"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/TemporalDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Temporal Duration"},
   :rdfs/subClassOf :dpvo/Duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def ThirdCountry
  "Represents a country outside applicable or compatible jurisdiction as outlined in law"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Represents a country outside applicable or compatible jurisdiction as outlined in law"},
   :rdf/about :dpvo/ThirdCountry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third Country"},
   :rdfs/subClassOf :dpvo/Country,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ThirdParty
  "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A ‘third party’ means a natural or legal person, public authority, agency or body other than the data subject, controller, processor and people who, under the direct authority of the controller or processor, are authorised to process personal data."},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_10/oj",
   :rdf/about :dpvo/ThirdParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third Party"},
   :rdfs/subClassOf :dpvo/Recipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ThirdPartyAgreement
  "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An agreement outlining conditions, criteria, obligations, responsibilities, and specifics for carrying out processing of personal data between a Data Controller or Processor and a Third Party"},
   :rdf/about :dpvo/ThirdPartyAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third-Party Agreement"},
   :rdfs/subClassOf :dpvo/DataProcessingAgreement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ThirdPartySecurityProcedures
  "Procedures related to security associated with Third Parties"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Procedures related to security associated with Third Parties"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/5g-cybersecurity-standards",
   :rdf/about :dpvo/ThirdPartySecurityProcedures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Third Party Security Procedures"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tourist
  "Data subjects that are tourists i.e. not citizens and not immigrants"
  {:dcterms/created #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Julian Flake"
                     "Georg P. Krog"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data subjects that are tourists i.e. not citizens and not immigrants"},
   :rdf/about :dpvo/Tourist,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tourist"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transfer
  "to move data from one place to another"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "to move data from one place to another"},
   :dcterms/source "https://specialprivacy.ercim.eu/vocabs/processing",
   :rdf/about :dpvo/Transfer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transfer"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/processing#Transfer",
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transform
  "to change the form or nature of data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to change the form or nature of data"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Transform,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transform"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transmit
  "to send out data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to send out data"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Transmit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transmit"},
   :rdfs/subClassOf :dpvo/Disclose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TrustedComputing
  "Use of cryptographic methods to restrict access and execution to trusted parties and code"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods to restrict access and execution to trusted parties and code"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/TrustedComputing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trusted Computing"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TrustedExecutionEnvironments
  "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of cryptographic methods to restrict access and execution to trusted parties and code within a dedicated execution environment"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/TrustedExecutionEnvironments,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trusted Execution Environments"},
   :rdfs/subClassOf :dpvo/CryptographicMethods,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TrustedThirdPartyUtilisation
  "Utilisation of a trusted third party to provide or carry out a measure"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Utilisation of a trusted third party to provide or carry out a measure"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-pseudonymisation-advanced-techniques-and-use-cases",
   :rdf/about :dpvo/TrustedThirdPartyUtilisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trusted Third Party Utilisation"},
   :rdfs/subClassOf :dpvo/SecurityProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UninformedConsent
  "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Consent that is uninformed i.e. without requirement to provide sufficient information to make a consenting decision"},
   :rdf/about :dpvo/UninformedConsent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Uninformed Consent"},
   :rdfs/subClassOf :dpvo/Consent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Unlawful
  "State of being unlawful or legally non-compliant"
  {:dcterms/created     #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of being unlawful or legally non-compliant"},
   :rdf/about           :dpvo/Unlawful,
   :rdf/type            [:owl/NamedIndividual :dpvo/Lawfulness],
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unlawful"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UntilEventDuration
  "Duration that takes place until a specific event occurs e.g. Account Closure"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Duration that takes place until a specific event occurs e.g. Account Closure"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/UntilEventDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Until Event Duration"},
   :rdfs/subClassOf :dpvo/Duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def UntilTimeDuration
  "Duration that has a fixed end date e.g. 2022-12-31"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Duration that has a fixed end date e.g. 2022-12-31"},
   :dcterms/modified    #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about           :dpvo/UntilTimeDuration,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Until Time Duration"},
   :rdfs/subClassOf     :dpvo/Duration,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "modified"}})

(def UnverifiedData
  "Data that has not been verified in terms of accuracy, inconsistency, or quality"
  {:dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data that has not been verified in terms of accuracy, inconsistency, or quality"},
   :rdf/about :dpvo/UnverifiedData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unverified Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UsageControl
  "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Management of usage, which is intended to be broader than access control and may cover trust, digital rights, or other relevant controls"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/UsageControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Usage Control"},
   :rdfs/subClassOf :dpvo/AccessControlMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Use
  "to use data"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "to use data"},
   :dcterms/source "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_2/oj",
   :rdf/about :dpvo/Use,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Use"},
   :rdfs/subClassOf :dpvo/Processing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UseSyntheticData
  "Use of synthetic data to preserve privacy, security, or other effects and side-effects"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Use of synthetic data to preserve privacy, security, or other effects and side-effects"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/UseSyntheticData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Use of Synthetic Data"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def User
  "Data subjects that use service(s)"
  {:dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan"
                         "Julian Flake"
                         "Beatriz Esteves"
                         "Harshvardhan J. Pandit"
                         "Georg P. Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Data subjects that use service(s)"},
   :rdf/about           :dpvo/User,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "User"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UserInterfacePersonalisation
  "Purposes associated with personalisation of interfaces presented to the user"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator ["Simon Steyskal"
                     "Fajar Ekaputra"
                     "Harshvardhan J. Pandit"
                     "Elmar Kiesling"
                     "Javier Fernandez"
                     "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with personalisation of interfaces presented to the user"},
   :rdf/about :dpvo/UserInterfacePersonalisation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Examples of user-interface personalisation include changing the language to match the locale"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User Interface Personalisation"},
   :rdfs/subClassOf :dpvo/ServicePersonalisation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VariableLocation
  "Location that is known but is variable e.g. somewhere within a given area"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location that is known but is variable e.g. somewhere within a given area"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/VariableLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Variable Location"},
   :rdfs/subClassOf :dpvo/LocationFixture,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def VendorManagement
  "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "David Hickey" "Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with manage orders, payment, evaluation, and prospecting related to vendors"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/VendorManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Management"},
   :rdfs/subClassOf :dpvo/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VendorPayment
  "Purposes associated with managing payment of vendors"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "David Hickey" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Purposes associated with managing payment of vendors"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/VendorPayment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Payment"},
   :rdfs/subClassOf :dpvo/VendorManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VendorRecordsManagement
  "Purposes associated with managing records and orders related to vendors"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "David Hickey" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing records and orders related to vendors"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/VendorRecordsManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Records Management"},
   :rdfs/subClassOf :dpvo/VendorManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VendorSelectionAssessment
  "Purposes associated with managing selection, assessment, and evaluation related to vendors"
  {:dcterms/created #inst "2021-09-01T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "David Hickey" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Purposes associated with managing selection, assessment, and evaluation related to vendors"},
   :dcterms/source
   "https://www.privacycommission.be/nl/model-voor-een-register-van-de-verwerkingsactiviteiten",
   :rdf/about :dpvo/VendorSelectionAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vendor Selection Assessment"},
   :rdfs/subClassOf :dpvo/VendorManagement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VerifiedData
  "Data that has been verified in terms of accuracy, inconsistency, or quality"
  {:dcterms/created #inst "2022-11-02T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data that has been verified in terms of accuracy, inconsistency, or quality"},
   :rdf/about :dpvo/VerifiedData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Verified Data"},
   :rdfs/subClassOf :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VirtualisationSecurity
  "Security implemented at or through virtualised environments"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Security implemented at or through virtualised environments"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/VirtualisationSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virtualisation Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Visitor
  "Data subjects that are temporary visitors"
  {:dcterms/created     #inst "2022-04-06T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Paul Ryan"
                         "Julian Flake"
                         "Georg P. Krog"
                         "Beatriz Esteves"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Data subjects that are temporary visitors"},
   :rdf/about           :dpvo/Visitor,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Visitor"},
   :rdfs/subClassOf     :dpvo/DataSubject,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VitalInterest
  "Processing is necessary or required to protect vital interests of a data subject or other natural person"
  {:dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or required to protect vital interests of a data subject or other natural person"},
   :rdf/about :dpvo/VitalInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vital Interest"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VitalInterestOfDataSubject
  "Processing is necessary or required to protect vital interests of a data subject"
  {:dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or required to protect vital interests of a data subject"},
   :rdf/about :dpvo/VitalInterestOfDataSubject,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vital Interest of Data Subject"},
   :rdfs/subClassOf :dpvo/VitalInterestOfNaturalPerson,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VitalInterestOfNaturalPerson
  "Processing is necessary or required to protect vital interests of a natural person"
  {:dcterms/created #inst "2021-04-21T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Processing is necessary or required to protect vital interests of a natural person"},
   :rdf/about :dpvo/VitalInterestOfNaturalPerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vital Interest of Natural Person"},
   :rdfs/subClassOf :dpvo/VitalInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VulnerabilityTestingMethods
  "Methods that assess or discover vulnerabilities in a system"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Methods that assess or discover vulnerabilities in a system"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/VulnerabilityTestingMethods,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vulnerability Testing Methods"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VulnerableDataSubject
  "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan Pandit" "Paul Ryan" "Georg Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Data Subjects which should be considered 'vulnerable' and therefore would require additional measures and safeguards"},
   :rdf/about :dpvo/VulnerableDataSubject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This concept denotes a Data Subject or a group are vulnerable, but not what vulnerability they possess or its context. This information can be provided additionally as comments, or as separate concepts and relations. Proposals for this are welcome."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vulnerable Data Subject"},
   :rdfs/subClassOf :dpvo/DataSubject,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WebBrowserSecurity
  "Security implemented at or over web browsers"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented at or over web browsers"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/WebBrowserSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "WebBrowser Security"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WebSecurityProtocols
  "Security implemented at or over web-based protocols"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Security implemented at or over web-based protocols"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/WebSecurityProtocols,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Web Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WirelessSecurityProtocols
  "Security implemented at or over wireless communication protocols"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Security implemented at or over wireless communication protocols"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo/WirelessSecurityProtocols,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Wireless Security Protocols"},
   :rdfs/subClassOf :dpvo/SecurityMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WithinDevice
  "Location is local and entirely within a device, such as a smartphone"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location is local and entirely within a device, such as a smartphone"},
   :dcterms/modified #inst "2020-10-05T00:00:00.000-04:00",
   :rdf/about :dpvo/WithinDevice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Within Device"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def WithinPhysicalEnvironment
  "Location is local and entirely within a physical environment, such as a room"
  {:dcterms/created #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location is local and entirely within a physical environment, such as a room"},
   :rdf/about :dpvo/WithinPhysicalEnvironment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Within Physical Environment"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WithinVirtualEnvironment
  "Location is local and entirely within a virtual environment, such as a shared network directory"
  {:dcterms/created #inst "2020-10-06T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Location is local and entirely within a virtual environment, such as a shared network directory"},
   :rdf/about :dpvo/WithinVirtualEnvironment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Within Virtual Environment"},
   :rdfs/subClassOf :dpvo/LocalLocation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ZeroKnowledgeAuthentication
  "Authentication using Zero-Knowledge proofs"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Authentication using Zero-Knowledge proofs"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/data-protection-engineering",
   :rdf/about :dpvo/ZeroKnowledgeAuthentication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zero Knowledge Authentication"},
   :rdfs/subClassOf [:dpvo/AuthenticationProtocols :dpvo/CryptographicMethods],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasActivityStatus
  "Indicates the status of activity of specified concept"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the status of activity of specified concept"},
   :rdf/about :dpvo/hasActivityStatus,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has activity status"},
   :rdfs/range :dpvo/ActivityStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasAddress
  "Specifies address of a legal entity such as street address or pin code"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Beatriz Esteves" "Georg P Krog" "Paul Ryan" "Harshvardhan J.Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies address of a legal entity such as street address or pin code"},
   :rdf/about :dpvo/hasAddress,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has address"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasAlgorithmicLogic
  "Indicates the logic used in processing such as for automated decision making"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Georg P. Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the logic used in processing such as for automated decision making"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/about :dpvo/hasAlgorithmicLogic,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has algorithmic logic"},
   :rdfs/range :dpvo/AlgorithmicLogic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def hasApplicableLaw
  "Indicates applicability of a Law"
  {:dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates applicability of a Law"},
   :rdf/about           :dpvo/hasApplicableLaw,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has applicable law"},
   :rdfs/range          :dpvo/Law,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasAuditStatus
  "Indicates the status of audit associated with specified concept"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the status of audit associated with specified concept"},
   :rdf/about :dpvo/hasAuditStatus,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has audit status"},
   :rdfs/range :dpvo/AuditStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasAuthority
  "Indicates applicability of authority for a jurisdiction"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates applicability of authority for a jurisdiction"},
   :rdf/about :dpvo/hasAuthority,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has authority"},
   :rdfs/range :dpvo/Authority,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasComplianceStatus
  "Indicates the status of compliance of specified concept"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the status of compliance of specified concept"},
   :rdf/about :dpvo/hasComplianceStatus,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has compliance status"},
   :rdfs/range :dpvo/ComplianceStatus,
   :rdfs/subPropertyOf :dpvo/hasStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasConsentStatus
  "Specifies the state or status of consent"
  {:dcterms/created     #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog"
                         "Julian Flake"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Specifies the state or status of consent"},
   :rdf/about           :dpvo/hasConsentStatus,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has consent status"},
   :rdfs/range          :dpvo/ConsentStatus,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasConsequence
  "Indicates consenquence(s) possible or arising from specified concept"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Georg P Krog"
                     "Fajar Ekaputra"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates consenquence(s) possible or arising from specified concept"},
   :dcterms/modified #inst "2021-09-21T00:00:00.000-04:00",
   :rdf/about :dpvo/hasConsequence,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Removed plural suffix for consistency"},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has consequence"},
   :rdfs/range :dpvo/Consequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasConsequenceOn
  "Indicates the thing (e.g. plan, process, or entity) affected by a consequence"
  {:dcterms/created #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the thing (e.g. plan, process, or entity) affected by a consequence"},
   :rdf/about :dpvo/hasConsequenceOn,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Consequence,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has consequence on"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasContact
  "Specifies contact details of a legal entity such as phone  or email"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J.Pandit" "Beatriz Esteves" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies contact details of a legal entity such as phone  or email"},
   :rdf/about :dpvo/hasContact,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has contact"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasContext
  "Indicates a purpose is restricted to the specified context(s)"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates a purpose is restricted to the specified context(s)"},
   :rdf/about :dpvo/hasContext,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has context"},
   :rdfs/range :dpvo/Context,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasCountry
  "Indicates applicability of specified country"
  {:dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates applicability of specified country"},
   :rdf/about           :dpvo/hasCountry,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has country"},
   :rdfs/range          :dpvo/Country,
   :rdfs/subPropertyOf  :dpvo/hasLocation,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasData
  "Indicates associated with Data (may or may not be personal)"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates associated with Data (may or may not be personal)"},
   :rdf/about :dpvo/hasData,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data"},
   :rdfs/range :dpvo/Data,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataController
  "Indicates association with Data Controller"
  {:dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Javier Fernández"
                         "Harshvardhan J. Pandit"
                         "Bud Bruegger"
                         "Mark Lizar"
                         "Axel Polleres"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates association with Data Controller"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/about           :dpvo/hasDataController,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data controller"},
   :rdfs/range          [:dpvo/DataController :dpvo/LegalEntity],
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataExporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Exporter"},
   :rdf/about :dpvo/hasDataExporter,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data exporter"},
   :rdfs/range :dpvo/DataExporter,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataImporter
  "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a LegalEntity in the role of Data Importer"},
   :rdf/about :dpvo/hasDataImporter,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data importer"},
   :rdfs/range :dpvo/DataImporter,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataProcessor
  "Indiciates inclusion or applicability of a Data Processor"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indiciates inclusion or applicability of a Data Processor"},
   :rdf/about :dpvo/hasDataProcessor,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data processor"},
   :rdfs/range :dpvo/DataProcessor,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataProtectionOfficer
  "Specifices an associated data protection officer"
  {:dcterms/created     #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator     ["Paul Ryan" "Rob Brennan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Specifices an associated data protection officer"},
   :rdf/about           :dpvo/hasDataProtectionOfficer,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data protection officer"},
   :rdfs/range          :dpvo/DataProtectionOfficer,
   :rdfs/subPropertyOf  :dpvo/hasRepresentative,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataSource
  "Indicates the source or origin of data being processed"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the source or origin of data being processed"},
   :rdf/about :dpvo/hasDataSource,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data source"},
   :rdfs/range :dpvo/DataSource,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasDataSubject
  "Indicates association with Data Subject"
  {:dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Javier Fernández"
                         "Harshvardhan J. Pandit"
                         "Axel Polleres"
                         "Bud Bruegger"
                         "Mark Lizar"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates association with Data Subject"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/about           :dpvo/hasDataSubject,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data subject"},
   :rdfs/range          :dpvo/DataSubject,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataSubjectScale
  "Indicates the scale of data subjects"
  {:dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates the scale of data subjects"},
   :rdf/about           :dpvo/hasDataSubjectScale,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data subject scale"},
   :rdfs/range          :dpvo/DataSubjectScale,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDataVolume
  "Indicates the volume of data"
  {:dcterms/created     #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates the volume of data"},
   :rdf/about           :dpvo/hasDataVolume,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has data volume"},
   :rdfs/range          :dpvo/DataVolume,
   :rdfs/subPropertyOf  :dpvo/hasScale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasDuration
  "Indicates information about duration"
  {:dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Rob Brennan"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates information about duration"},
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/about           :dpvo/hasDuration,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has duration"},
   :rdfs/range          :dpvo/Duration,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasEntity
  "Indicates inclusion or applicability of an entity to some concept"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates inclusion or applicability of an entity to some concept"},
   :rdf/about :dpvo/hasEntity,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "parent property for controller, processor, data subject, authority, etc.?"},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has entity"},
   :rdfs/range :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasFrequency
  "Indicates the frequency with which something takes place"
  {:dcterms/created #inst "2022-02-16T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the frequency with which something takes place"},
   :rdf/about :dpvo/hasFrequency,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has frequency"},
   :rdfs/range :dpvo/Frequency,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasGeographicCoverage
  "Indicate the geographic coverage (of specified context)"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicate the geographic coverage (of specified context)"},
   :rdf/about :dpvo/hasGeographicCoverage,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has geographic coverage"},
   :rdfs/range :dpvo/GeographicCoverage,
   :rdfs/subPropertyOf :dpvo/hasScale,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasHumanInvolvement
  "Indicates Involvement of humans in processing such as within automated decision making process"
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates Involvement of humans in processing such as within automated decision making process"},
   :rdf/about :dpvo/hasHumanInvolvement,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Human involvement is also relevant to 'human in the loop'"},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has human involvement"},
   :rdfs/range :dpvo/HumanInvolvement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasIdentifier
  "Indicates an identifier associated for identification or reference"
  {:dcterms/created #inst "2020-11-25T00:00:00.000-05:00",
   :dcterms/creator
   ["Harshvardhan J.Pandit" "Georg P Krog" "Paul Ryan" "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates an identifier associated for identification or reference"},
   :rdf/about :dpvo/hasIdentifier,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has identifier"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasImpact
  "Indicates impact(s) possible or arising as consequences from specified concept"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Fajar Ekaputra"
                     "Beatriz Esteves"
                     "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates impact(s) possible or arising as consequences from specified concept"},
   :rdf/about :dpvo/hasImpact,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has impact"},
   :rdfs/range :dpvo/Impact,
   :rdfs/subPropertyOf :dpvo/hasConsequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasImpactOn
  "Indicates the thing (e.g. plan, process, or entity) affected by an impact"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator ["Georg P Krog"
                     "Harshvardhan J. Pandit"
                     "Julian Flake"
                     "Fajar Ekaputra"
                     "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the thing (e.g. plan, process, or entity) affected by an impact"},
   :rdf/about :dpvo/hasImpactOn,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Impact,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has impact on"},
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasConsequenceOn,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasIndicationMethod
  "Specifies the method by which an entity has indicated the specific context"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies the method by which an entity has indicated the specific context"},
   :rdf/about :dpvo/hasIndicationMethod,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has indication method"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasJointDataControllers
  "Indicates inclusion or applicability of a Joint Data Controller"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates inclusion or applicability of a Joint Data Controller"},
   :rdf/about :dpvo/hasJointDataControllers,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has joint data controllers"},
   :rdfs/range :dpvo/JointDataControllers,
   :rdfs/subPropertyOf :dpvo/hasDataController,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasJurisdiction
  "Indicates applicability of specified jurisdiction"
  {:dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates applicability of specified jurisdiction"},
   :rdf/about           :dpvo/hasJurisdiction,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has jurisdiction"},
   :rdfs/range          :dpvo/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasJustification
  "Indicates a justification for specified concept or context"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates a justification for specified concept or context"},
   :rdf/about :dpvo/hasJustification,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has justification"},
   :rdfs/range :dpvo/Justification,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasLawfulness
  "Indicates the status of being lawful or legally compliant"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the status of being lawful or legally compliant"},
   :rdf/about :dpvo/hasLawfulness,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has lawfulness"},
   :rdfs/range :dpvo/Lawfulness,
   :rdfs/subPropertyOf :dpvo/hasComplianceStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasLegalBasis
  "Indicates use or applicability of a Legal Basis"
  {:dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres" "Javier Fernández"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates use or applicability of a Legal Basis"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/about           :dpvo/hasLegalBasis,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has legal basis"},
   :rdfs/range          :dpvo/LegalBasis,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasLikelihood
  "Indicates the likelihood associated with a concept"
  {:dcterms/created     #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator     ["Paul Ryan"
                         "Julian Flake"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the likelihood associated with a concept"},
   :rdf/about           :dpvo/hasLikelihood,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has likelihood"},
   :rdfs/range          :dpvo/Likelihood,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasLocation
  "Indicates information about location"
  {:dcterms/created     #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator     ["Mark Lizar"
                         "Harshvardhan J. Pandit"
                         "Rob Brennan"
                         "Axel Polleres"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates information about location"},
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/about           :dpvo/hasLocation,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has location"},
   :rdfs/range          :dpvo/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasName
  "Specifies name of a legal entity"
  {:dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Harshvardhan J.Pandit"
                         "Georg P Krog"
                         "Beatriz Esteves"
                         "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Specifies name of a legal entity"},
   :rdf/about           :dpvo/hasName,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has name"},
   :rdfs/range          :owl/Thing,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasNotice
  "Indicates the use or applicability of a Notice for the specified context"
  {:dcterms/created #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Paul Ryan" "Georg P Krog" "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the use or applicability of a Notice for the specified context"},
   :rdf/about :dpvo/hasNotice,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has notice"},
   :rdfs/range :dpvo/Notice,
   :rdfs/subPropertyOf :dpvo/hasOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasObligation
  "Specifying applicability or inclusion of an obligation rule within specified context"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Beatriz Esteves" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of an obligation rule within specified context"},
   :rdf/about :dpvo/hasObligation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has obligation"},
   :rdfs/range :dpvo/Obligation,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasOrganisationalMeasure
  "Indicates use or applicability of Organisational measure"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates use or applicability of Organisational measure"},
   :rdf/about :dpvo/hasOrganisationalMeasure,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has organisational measure"},
   :rdfs/range :dpvo/OrganisationalMeasure,
   :rdfs/subPropertyOf :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasOutcome
  "Indicates an outcome of specified concept or context"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates an outcome of specified concept or context"},
   :rdf/about :dpvo/hasOutcome,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has outcome"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasPermission
  "Specifying applicability or inclusion of a permission rule within specified context"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of a permission rule within specified context"},
   :rdf/about :dpvo/hasPermission,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has permission"},
   :rdfs/range :dpvo/Permission,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasPersonalData
  "Indicates association with Personal Data"
  {:dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates association with Personal Data"},
   :rdf/about           :dpvo/hasPersonalData,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has personal data"},
   :rdfs/range          :dpvo/PersonalData,
   :rdfs/subPropertyOf  :dpvo/hasData,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasPersonalDataHandling
  "Indicates association with Personal Data Handling"
  {:dcterms/created     #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates association with Personal Data Handling"},
   :rdf/about           :dpvo/hasPersonalDataHandling,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has personal data handling"},
   :rdfs/range          :dpvo/PersonalDataHandling,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasPolicy
  "Indicates policy applicable or used"
  {:dcterms/created     #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates policy applicable or used"},
   :rdf/about           :dpvo/hasPolicy,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has policy"},
   :rdfs/range          :dpvo/Policy,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasProcessing
  "Indicates association with Processing"
  {:dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Bud Bruegger"
                         "Javier Fernández"
                         "Mark Lizar"
                         "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates association with Processing"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/about           :dpvo/hasProcessing,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has processing"},
   :rdfs/range          :dpvo/Processing,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasProcessingAutomation
  "Indicates the use or extent of automation associated with processing"
  {:dcterms/created #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the use or extent of automation associated with processing"},
   :rdf/about :dpvo/hasProcessingAutomation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has processing automation"},
   :rdfs/range :dpvo/AutomationOfProcessing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasProhibition
  "Specifying applicability or inclusion of a prohibition rule within specified context"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of a prohibition rule within specified context"},
   :rdf/about :dpvo/hasProhibition,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has prohibition"},
   :rdfs/range :dpvo/Prohibition,
   :rdfs/subPropertyOf :dpvo/hasRule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasPurpose
  "Indicates association with Purpose"
  {:dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Axel Polleres"
                         "Bud Bruegger"
                         "Mark Lizar"
                         "Harshvardhan J. Pandit"
                         "Javier Fernández"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates association with Purpose"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/about           :dpvo/hasPurpose,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has purpose"},
   :rdfs/range          :dpvo/Purpose,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRecipient
  "Indicates Recipient of Personal Data"
  {:dcterms/created     #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator     ["Bud Bruegger"
                         "Javier Fernández"
                         "Axel Polleres"
                         "Harshvardhan J. Pandit"
                         "Mark Lizar"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates Recipient of Personal Data"},
   :dcterms/modified    #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/about           :dpvo/hasRecipient,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has recipient"},
   :rdfs/range          :dpvo/Recipient,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRecipientDataController
  "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Georg P. Krog" "Paul Ryan" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a Data Controller as a Recipient of persona data"},
   :rdf/about :dpvo/hasRecipientDataController,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has recipient data controller"},
   :rdfs/range :dpvo/DataController,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRecipientThirdParty
  "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Paul Ryan" "Harshvardhan J. Pandit" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indiciates inclusion or applicability of a Third Party as a Recipient of persona data"},
   :rdf/about :dpvo/hasRecipientThirdParty,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has recipient third party"},
   :rdfs/range :dpvo/ThirdParty,
   :rdfs/subPropertyOf :dpvo/hasRecipient,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRelationWithDataSubject
  "Indicates the relation between specified Entity and Data Subject"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Julian Flake" "Georg P Krog" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the relation between specified Entity and Data Subject"},
   :rdf/about :dpvo/hasRelationWithDataSubject,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Entity,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has relation with data subject"},
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRepresentative
  "Specifies representative of the legal entity"
  {:dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Beatriz Esteves"
                         "Paul Ryan"
                         "Georg P Krog"
                         "Harshvardhan J.Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Specifies representative of the legal entity"},
   :rdf/about           :dpvo/hasRepresentative,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Entity,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has representative"},
   :rdfs/range          :dpvo/Representative,
   :rdfs/subPropertyOf  :dpvo/hasEntity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasResidualRisk
  "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk"
  {:dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the associated risk is the remaining or residual risk from applying mitigation measures or treatments to this risk"},
   :rdf/about :dpvo/hasResidualRisk,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has residual risk"},
   :rdfs/range :dpvo/Risk,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasResponsibleEntity
  "Specifies the indicated entity is responsible within some context"
  {:dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies the indicated entity is responsible within some context"},
   :rdf/about :dpvo/hasResponsibleEntity,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has responsible entity"},
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRight
  "Indicates use or applicability of Right"
  {:dcterms/created     #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates use or applicability of Right"},
   :rdf/about           :dpvo/hasRight,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has right"},
   :rdfs/range          :dpvo/Right,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRisk
  "Indicates applicability of Risk"
  {:dcterms/created     #inst "2020-11-18T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description [{:rdf/language "en",
                          :rdf/value    "Indicates applicability of Risk"}
                         {:rdf/language "en",
                          :rdf/value
                          "Indicates applicability of Risk for this concept"}],
   :rdf/about           :dpvo/hasRisk,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has risk"},
   :rdfs/range          :dpvo/Risk,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasRiskLevel
  "Indicates the associated risk level associated with a risk"
  {:dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Paul Ryan" "Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates the associated risk level associated with a risk"},
   :rdf/about :dpvo/hasRiskLevel,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has risk level"},
   :rdfs/range :dpvo/RiskLevel,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasRule
  "Specifying applicability or inclusion of a rule within specified context"
  {:dcterms/created #inst "2022-10-19T00:00:00.000-04:00",
   :dcterms/creator
   ["Beatriz Esteves" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifying applicability or inclusion of a rule within specified context"},
   :rdf/about :dpvo/hasRule,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Context,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has rule"},
   :rdfs/range :dpvo/Rule,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasScale
  "Indicates the scale of specified concept"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Indicates the scale of specified concept"},
   :rdf/about           :dpvo/hasScale,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has scale"},
   :rdfs/range          :dpvo/Scale,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasScope
  "Indicates the scope of specified concept or context"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the scope of specified concept or context"},
   :rdf/about           :dpvo/hasScope,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has scope"},
   :rdfs/range          :dpvo/Scope,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasSector
  "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)"
  {:dcterms/created #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the purpose is associated with activities in the indicated (Economic) Sector(s)"},
   :rdf/about :dpvo/hasSector,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sector"},
   :rdfs/range :dpvo/Sector,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasSeverity
  "Indicates the severity associated with a concept"
  {:dcterms/created     #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Georg P Krog"
                         "Paul Ryan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the severity associated with a concept"},
   :rdf/about           :dpvo/hasSeverity,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has severity"},
   :rdfs/range          :dpvo/Severity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasStatus
  "Indicates the status of specified concept"
  {:dcterms/created     #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the status of specified concept"},
   :rdf/about           :dpvo/hasStatus,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has status"},
   :rdfs/range          :dpvo/Status,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasStorageCondition
  "Indicates information about storage condition"
  {:dcterms/created     #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Mark Lizar"
                         "Axel Polleres"
                         "Rob Brennan"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates information about storage condition"},
   :dcterms/source      "https://specialprivacy.ercim.eu/",
   :rdf/about           :dpvo/hasStorageCondition,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has storage condition"},
   :rdfs/range          :dpvo/StorageCondition,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasTechnicalMeasure
  "Indicates use or applicability of Technical measure"
  {:dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates use or applicability of Technical measure"},
   :rdf/about           :dpvo/hasTechnicalMeasure,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has technical measure"},
   :rdfs/range          :dpvo/TechnicalMeasure,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasTechnicalOrganisationalMeasure
  "Indicates use or applicability of Technical or Organisational measure"
  {:dcterms/created #inst "2019-04-04T00:00:00.000-04:00",
   :dcterms/creator ["Harshvardhan J. Pandit"
                     "Mark Lizar"
                     "Axel Polleres"
                     "Javier Fernández"
                     "Bud Bruegger"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates use or applicability of Technical or Organisational measure"},
   :dcterms/modified #inst "2020-11-04T00:00:00.000-05:00",
   :rdf/about :dpvo/hasTechnicalOrganisationalMeasure,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has technical and organisational measure"},
   :rdfs/range :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasThirdCountry
  "Indicates applicability or relevance of a 'third country'"
  {:dcterms/created #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates applicability or relevance of a 'third country'"},
   :rdf/about :dpvo/hasThirdCountry,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has third country"},
   :rdfs/range :dpvo/ThirdCountry,
   :rdfs/subPropertyOf :dpvo/hasCountry,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isAfter
  "Indicates the specified concepts is 'after' this concept in some context"
  {:dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Julian Flake" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the specified concepts is 'after' this concept in some context"},
   :rdf/about :dpvo/isAfter,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is after"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isAuthorityFor
  "Indicates area, scope, or applicability of an Authority"
  {:dcterms/created #inst "2022-01-19T00:00:00.000-05:00",
   :dcterms/creator ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates area, scope, or applicability of an Authority"},
   :rdf/about :dpvo/isAuthorityFor,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Authority,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is authority for"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isBefore
  "Indicates the specified concepts is 'before' this concept in some context"
  {:dcterms/created #inst "2022-03-02T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Julian Flake" "Georg P. Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates the specified concepts is 'before' this concept in some context"},
   :rdf/about :dpvo/isBefore,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is before"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isExercisedAt
  "Indicates context or information about exercising a right"
  {:dcterms/created #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indicates context or information about exercising a right"},
   :rdf/about :dpvo/isExercisedAt,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/ActiveRight,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is exercised at"},
   :rdfs/range :dpvo/RightExerciseNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isImplementedByEntity
  "Indicates implementation details such as entities or agents"
  {:dcterms/created #inst "2019-05-07T00:00:00.000-04:00",
   :dcterms/creator ["Beatriz Esteves"
                     "Julian Flake"
                     "Harshvardhan J. Pandit"
                     "Paul Ryan"
                     "Axel Polleres"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates implementation details such as entities or agents"},
   :dcterms/modified #inst "2022-01-26T00:00:00.000-05:00",
   :rdf/about :dpvo/isImplementedByEntity,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The use of 'entity' is inclusive of entities (e.g. Data Processor) as well as 'agent' (e.g. DPO). For indicating technological implementation, the property isImplementedByTechnology should be used."},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is implemented by entity"},
   :rdfs/range :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def isImplementedUsingTechnology
  "Indicates implementation details such as technologies or processes"
  {:dcterms/created #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator
   ["Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan" "Beatriz Esteves"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates implementation details such as technologies or processes"},
   :dcterms/modified #inst "2022-06-15T00:00:00.000-04:00",
   :rdf/about :dpvo/isImplementedUsingTechnology,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term 'technology' is inclusive of technologies, processes, and methods."},
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is implemented using technology"},
   :rdfs/range :dpvo/Technology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def isIndicatedAtTime
  "Specifies the temporal information for when the entity has indicated the specific context"
  {:dcterms/created #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Julian Flake" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Specifies the temporal information for when the entity has indicated the specific context"},
   :rdf/about :dpvo/isIndicatedAtTime,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is indicated at time"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isIndicatedBy
  "Specifies entity who indicates the specific context"
  {:dcterms/created     #inst "2022-06-21T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Georg P Krog"
                         "Paul Ryan"
                         "Julian Flake"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Specifies entity who indicates the specific context"},
   :rdf/about           :dpvo/isIndicatedBy,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :owl/Thing,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "is indicated by"},
   :rdfs/range          :dpvo/Entity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def isMitigatedByMeasure
  "Indicate a risk is mitigated by specified measure"
  {:dcterms/created     #inst "2022-02-09T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicate a risk is mitigated by specified measure"},
   :rdf/about           :dpvo/isMitigatedByMeasure,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Risk,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "is mitigated by measure"},
   :rdfs/range          :dpvo/RiskMitigationMeasure,
   :rdfs/subPropertyOf  :dpvo/hasTechnicalOrganisationalMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def isPolicyFor
  "Indicates the context or application of policy"
  {:dcterms/created     #inst "2022-01-26T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates the context or application of policy"},
   :rdf/about           :dpvo/isPolicyFor,
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Policy,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "is policy for"},
   :rdfs/range          :owl/Thing,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def isRepresentativeFor
  "Indicates the entity is a representative for specified entity"
  {:dcterms/created #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Indicates the entity is a representative for specified entity"},
   :rdf/about :dpvo/isRepresentativeFor,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Representative,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is representative for"},
   :rdfs/range :dpvo/Entity,
   :rdfs/subPropertyOf :dpvo/hasEntity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def isResidualRiskOf
  "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk"
  {:dcterms/created #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator
   ["Georg P Krog" "Julian Flake" "Harshvardhan J. Pandit" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates this risk is the remaining or residual risk from applying mitigation measures or treatments to specified risk"},
   :rdf/about :dpvo/isResidualRiskOf,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :dpvo/Risk,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is residual risk of"},
   :rdfs/range :dpvo/Risk,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def mitigatesRisk
  "Indicates risks mitigated by this concept"
  {:dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates risks mitigated by this concept"},
   :rdf/about           :dpvo/mitigatesRisk,
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/RiskMitigationMeasure,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "mitigates risk"},
   :rdfs/range          :dpvo/Risk,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})