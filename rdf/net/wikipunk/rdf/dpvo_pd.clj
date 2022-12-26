(ns net.wikipunk.rdf.dpvo-pd
  "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."},
   :dcterms/contributor ["Rigo Wenning"
                         "Beatriz Esteves"
                         "Rob Brennan"
                         "Georg P Krog"
                         "Javier D. Fernández"
                         "David Hickey"
                         "Mark Lizar"
                         "Fajar J. Ekaputra"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Bert Bos"
                         "Elmar Kiesling"
                         "Piero Bonatti"
                         "Axel Polleres"
                         "Bud Bruegger"
                         "Eva Schlehahn"
                         "Paul Ryan"
                         "Simon Steyskal"
                         "Ramisa Gachpaz Hamed"],
   :dcterms/created #inst "2022-04-02T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."},
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DPV-PD: Personal Data Extension for DPV"},
   :owl/imports "https://w3id.org/dpv/dpv-owl",
   :owl/versionInfo "1",
   :rdf/about "https://w3id.org/dpv/dpv-owl/dpv-pd",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo-pd" "https://w3id.org/dpv/dpv-owl/dpv-pd#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-pd",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :vann/preferredNamespacePrefix "dpvo-pd",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-pd#"})

(def Accent
  "Information about linguistic and speech accents."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about linguistic and speech accents."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Accent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accent"},
   :rdfs/subClassOf :dpvo-pd/Language,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AccountIdentifier
  "Information about financial account identifier."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial account identifier."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/AccountIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Account Identifier"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Acquantaince
  "Information about acquaintainces in a social network."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about acquaintainces in a social network."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Acquantaince,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acquantaince"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Age
  "Information about age"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about age"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Age,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AgeExact
  "Information about the exact age (i.e. to some degree within a year, month, or day)"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the exact age (i.e. to some degree within a year, month, or day)"},
   :rdf/about :dpvo-pd/AgeExact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age Exact"},
   :rdfs/subClassOf :dpvo-pd/AgeRange,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AgeRange
  "Information about age range i.e. inexact age to some degree (i.e. some years)"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about age range i.e. inexact age to some degree (i.e. some years)"},
   :rdf/about :dpvo-pd/AgeRange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age Range"},
   :rdfs/subClassOf :dpvo-pd/Age,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ApartmentOwned
  "Information about apartment(s) owned and its history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about apartment(s) owned and its history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/ApartmentOwned,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Apartment Owned"},
   :rdfs/subClassOf :dpvo-pd/HouseOwned,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Association
  "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Association,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Association"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Attitude
  "Information about attitude."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about attitude."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Attitude,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attitude"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Authenticating
  "Information about authentication and information used for authenticating"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about authentication and information used for authenticating"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Authenticating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authenticating"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthenticationHistory
  "Information about prior authentication and its outcomes such as login attempts or location."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about prior authentication and its outcomes such as login attempts or location."},
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo-pd/AuthenticationHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication History"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BankAccount
  "Information about bank accounts."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about bank accounts."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/BankAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bank Account"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Behavioral
  "Information about Behavior or activity"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about Behavior or activity"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Behavioral,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Behavioral"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Activity",
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Biometric
  "Information about biometrics and biometric characteristics."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about biometrics and biometric characteristics."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Biometric,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Biometric"},
   :rdfs/subClassOf
   [:dpvo-pd/Identifying
    "https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BirthDate
  "Information about birth date"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about birth date"},
   :rdf/about           :dpvo-pd/BirthDate,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Birth Date"},
   :rdfs/subClassOf     :dpvo-pd/Age,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BirthPlace
  "Information about birth place"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about birth place"},
   :rdf/about           :dpvo-pd/BirthPlace,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Birth Place"},
   :rdfs/subClassOf     :dpvo-pd/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BloodType
  "Information about blood type."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about blood type."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/BloodType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Blood Type"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowserFingerprint
  "Information about the web browser which is used as a 'fingerprint'"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the web browser which is used as a 'fingerprint'"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/BrowserFingerprint,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browser Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowserHistory
  "Information about and including web browsing history"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about and including web browsing history"},
   :rdf/about :dpvo-pd/BrowserHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browser History"},
   :rdfs/subClassOf :dpvo-pd/BrowsingBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowsingBehavior
  "Information about browsing Behavior."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about browsing Behavior."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/BrowsingBehavior,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browsing Behavior"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#OnlineActivity",
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowsingReferral
  "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."},
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo-pd/BrowsingReferral,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browsing Referral"},
   :rdfs/subClassOf :dpvo-pd/BrowsingBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CallLog
  "Information about the calls that an individual has made."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about the calls that an individual has made."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CallLog,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Call Log"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CarOwned
  "Information about cars ownership and ownership history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about cars ownership and ownership history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CarOwned,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Car Owned"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CharacterClass
  "Information about character in the public sphere"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about character in the public sphere"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Character,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Character"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Communication
  "Information communicated from or to an individual"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information communicated from or to an individual"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Communication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationsMetadata
  "Information about communication metadata in the public sphere"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about communication metadata in the public sphere"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CommunicationsMetadata,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communications Metadata"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Interactive",
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Connection
  "Information about and including connections in a social network"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about and including connections in a social network"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Connection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Connection"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Contact
  "Information about contacts or used for contacting e.g. email address or phone number"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about contacts or used for contacting e.g. email address or phone number"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Contact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contact"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Physical",
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Country
  "Information about country e.g. residence, travel."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about country e.g. residence, travel."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Country,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Country"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Credit
  "Information about reputation with regards to money"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reputation with regards to money"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Credit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditCapacity
  "Information about credit capacity."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit capacity."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CreditCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Capacity"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditCardNumber
  "Information about credit card number"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit card number"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CreditCardNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Card Number"},
   :rdfs/subClassOf :dpvo-pd/PaymentCardNumber,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditRecord
  "Information about credit record."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit record."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CreditRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Record"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditScore
  "Information about credit score."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit score."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CreditScore,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Score"},
   :rdfs/subClassOf :dpvo-pd/CreditWorthiness,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditStanding
  "Information about credit standing."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit standing."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CreditStanding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Standing"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditWorthiness
  "Information about credit worthiness."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit worthiness."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CreditWorthiness,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Worthiness"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Criminal
  "Information about criminal activity e.g. criminal convictions or jail time"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about criminal activity e.g. criminal convictions or jail time"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Criminal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Judicial",
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalCharge
  "Information about criminal charges."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal charges."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CriminalCharge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Charge"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalConviction
  "Information about criminal convictions."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about criminal convictions."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CriminalConviction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Conviction"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalOffense
  "Information about criminal offenses"
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal offenses"},
   :rdf/about           :dpvo-pd/CriminalOffense,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Criminal Offense"},
   :rdfs/subClassOf     :dpvo-pd/Criminal,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CriminalPardon
  "Information about criminal pardons."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal pardons."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/CriminalPardon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Pardon"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CurrentEmployment
  "Information about current employment"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about current employment"},
   :rdf/about           :dpvo-pd/CurrentEmployment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Current Employment"},
   :rdfs/subClassOf     :dpvo-pd/EmploymentHistory,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DNACode
  "Information about DNA."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about DNA."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/DNACode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DNA Code"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Demeanor
  "Information about demeanor."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about demeanor."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Demeanor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demeanor"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Demographic
  "Information about demography and demographic characteristics"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about demography and demographic characteristics"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Demographic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demographic"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceApplications
  "Information about applications or application-like software on a device."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about applications or application-like software on a device."},
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo-pd/DeviceApplications,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Applications"},
   :rdfs/subClassOf :dpvo-pd/DeviceSoftware,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceBased
  "Information about devices"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about devices"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/DeviceBased,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Based"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Computer",
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceOperatingSystem
  "Information about the operating system (OS) or system software that manages hardware or software resources."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Beatriz Esteves" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the operating system (OS) or system software that manages hardware or software resources."},
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo-pd/DeviceOperatingSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Operating System"},
   :rdfs/subClassOf :dpvo-pd/DeviceSoftware,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceSoftware
  "Information about software on or related to a device."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about software on or related to a device."},
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo-pd/DeviceSoftware,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Software"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Dialect
  "Information about linguistic dialects."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about linguistic dialects."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Dialect,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dialect"},
   :rdfs/subClassOf :dpvo-pd/Language,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DigitalFingerprint
  "Information about a 'digital fingerprint' created for identification"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about a 'digital fingerprint' created for identification"},
   :rdf/about :dpvo-pd/DigitalFingerprint,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digital Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Disability
  "Information about disabilities."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about disabilities."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Disability,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disability"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DisciplinaryAction
  "Information about disciplinary actions and its history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about disciplinary actions and its history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/DisciplinaryAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disciplinary Action"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Dislike
  "Information about dislikes or preferences regarding repulsions."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about dislikes or preferences regarding repulsions."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Dislike,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dislike"},
   :rdfs/subClassOf :dpvo-pd/Interest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Divorce
  "Information about divorce(s)."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about divorce(s)."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Divorce,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Divorce"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DrugTestResult
  "Information about drug test results."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about drug test results."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/DrugTestResult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Drug Test Result"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Education
  "Information about education"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about education"},
   :rdf/about           :dpvo-pd/Education,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Education"},
   :rdfs/subClassOf     :dpvo-pd/Professional,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EducationExperience
  "Information about education experience e.g. attending a university"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about education experience e.g. attending a university"},
   :rdf/about :dpvo-pd/EducationExperience,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Education Experience"},
   :rdfs/subClassOf :dpvo-pd/Education,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EducationQualification
  "Information about educational qualifications"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about educational qualifications"},
   :rdf/about           :dpvo-pd/EducationQualification,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Education Qualification"},
   :rdfs/subClassOf     :dpvo-pd/Education,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EmailAddress
  "Information about Email address."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about Email address."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/EmailAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailAddressPersonal
  "Information about Email address used in Personal capacity"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about Email address used in Personal capacity"},
   :rdf/about :dpvo-pd/EmailAddressPersonal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address Personal"},
   :rdfs/subClassOf :dpvo-pd/EmailAddress,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailAddressWork
  "Information about Email address used for Work or in Professional capacity"
  {:dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about Email address used for Work or in Professional capacity"},
   :rdf/about :dpvo-pd/EmailAddressWork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address Work"},
   :rdfs/subClassOf :dpvo-pd/EmailAddress,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailContent
  "Information about the contents of Emails sent or received"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about the contents of Emails sent or received"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/EmailContent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Content"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmploymentHistory
  "Information about employment history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about employment history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/EmploymentHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employment History"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EthnicOrigin
  "Information about ethnic origin"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about ethnic origin"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/EthnicOrigin,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ethnic Origin"},
   :rdfs/subClassOf
   [:dpvo-pd/Ethnicity
    "https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Ethnicity
  "Information about ethnic origins and lineage"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about ethnic origins and lineage"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Ethnicity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ethnicity"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def External
  "Information about external characteristics that can be observed"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about external characteristics that can be observed"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/External,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "External"},
   :rdfs/subClassOf "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FacialPrint
  "Information about facial print or pattern"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about facial print or pattern"},
   :rdf/about           :dpvo-pd/FacialPrint,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Facial Print"},
   :rdfs/subClassOf     :dpvo-pd/Biometric,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Family
  "Information about family and relationships"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about family and relationships"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Family,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FamilyHealthHistory
  "Information about family health history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about family health history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/FamilyHealthHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family Health History"},
   :rdfs/subClassOf :dpvo-pd/HealthHistory,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FamilyStructure
  "Information about family and familial structure."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about family and familial structure."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/FamilyStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family Structure"},
   :rdfs/subClassOf :dpvo-pd/Family,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Favorite
  "Information about favorites"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorites"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Favorite,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteColor
  "Information about favorite color."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite color."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/FavoriteColor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Color"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteFood
  "Information about favorite food."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite food."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/FavoriteFood,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Food"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteMusic
  "Information about favorite music."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite music."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/FavoriteMusic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Music"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Fetish
  "Information about an individual's sexual fetishes"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about an individual's sexual fetishes"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Fetish,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fetish"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Financial
  "Information about finance including monetary characteristics and transactions"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about finance including monetary characteristics and transactions"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Financial,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Financial",
   :rdfs/subClassOf "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialAccount
  "Information about financial accounts."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about financial accounts."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/FinancialAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Account"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialAccountNumber
  "Information about financial account number"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial account number"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/FinancialAccountNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Account Number"},
   :rdfs/subClassOf :dpvo-pd/AccountIdentifier,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialStatus
  "Information about financial status or standing"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial status or standing"},
   :rdf/about           :dpvo-pd/FinancialStatus,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Status"},
   :rdfs/subClassOf     :dpvo-pd/Financial,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Fingerprint
  "Information about fingerprint used for biometric purposes."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about fingerprint used for biometric purposes."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Fingerprint,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/Biometric,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Friend
  "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Friend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Friend"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GPSCoordinate
  "Information about location expressed using Global Position System coordinates (GPS)"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location expressed using Global Position System coordinates (GPS)"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/GPSCoordinate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPS Coordinate"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Gender
  "Information about gender"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about gender"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Gender,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gender"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GeneralReputation
  "Information about reputation in the public sphere"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reputation in the public sphere"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/GeneralReputation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "General Reputation"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Genetic
  "Information about inherited or acquired genetic characteristics"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about inherited or acquired genetic characteristics"},
   :rdf/about :dpvo-pd/Genetic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Genetic"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Geographic
  "Information about location or based on geography (e.g. home address)"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location or based on geography (e.g. home address)"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Geographic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Geographic"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GroupMembership
  "Information about groups and memberships included or associated with a social network"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about groups and memberships included or associated with a social network"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/GroupMembership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group Membership"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HairColor
  "Information about hair color"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about hair color"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/HairColor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hair Color"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Health
  "Information about health."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Health,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Health",
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthHistory
  "Information about health history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/HealthHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health History"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthRecord
  "Information about health record."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health record."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/HealthRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health Record"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Height
  "Information about physical height"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical height"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Height,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Height"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Historical
  "Information about historical data related to or relevant regarding history or past events"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about historical data related to or relevant regarding history or past events"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Historical,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Historical"},
   :rdfs/subClassOf "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HouseOwned
  "Information about house(s) owned and ownership history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about house(s) owned and ownership history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/HouseOwned,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "House Owned"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Household
  "Information about personal or household activities"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about personal or household activities"},
   :rdf/about           :dpvo-pd/Household,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Household"},
   :rdfs/subClassOf     "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IPAddress
  "Information about the Internet Protocol (IP) address of a device"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the Internet Protocol (IP) address of a device"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/IPAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IP Address"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Identifier
  "Information about an identifier or name used for identification"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about an identifier or name used for identification"},
   :rdf/about :dpvo-pd/Identifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifier"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Identifying
  "Information that uniquely or semi-uniquely identifies an individual or a group"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information that uniquely or semi-uniquely identifies an individual or a group"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Identifying,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifying"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Income
  "Information about financial income e.g. for individual or household or family"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about financial income e.g. for individual or household or family"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Income,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Income"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncomeBracket
  "Information about income bracket."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about income bracket."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/IncomeBracket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Income Bracket"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndividualHealthHistory
  "Information about information health history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about information health history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/IndividualHealthHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Individual Health History"},
   :rdfs/subClassOf :dpvo-pd/HealthHistory,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Insurance
  "Information about Insurance"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about Insurance"},
   :rdf/about           :dpvo-pd/Insurance,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Insurance"},
   :rdfs/subClassOf     :dpvo-pd/Financial,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Intention
  "Information about intentions"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about intentions"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Intention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intention"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Interaction
  "Information about interactions in the public sphere"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about interactions in the public sphere"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Interaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interaction"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Interest
  "Information about interests"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about interests"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Interest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interest"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Internal
  "Informatoin about internal characteristics that cannot be seen or observed"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Informatoin about internal characteristics that cannot be seen or observed"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Internal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Internal"},
   :rdfs/subClassOf "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Job
  "Information about professional jobs"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about professional jobs"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Job,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Job"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def KnowledgeBelief
  "Information about knowledge and beliefs"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about knowledge and beliefs"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/KnowledgeBelief,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knowledge and Beliefs"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Language
  "Information about language and lingual history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about language and lingual history."},
   :dcterms/modified #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Language,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def LifeHistory
  "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/LifeHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Life History"},
   :rdfs/subClassOf :dpvo-pd/Historical,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Like
  "Information about likes or preferences regarding attractions."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about likes or preferences regarding attractions."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Like,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Like"},
   :rdfs/subClassOf :dpvo-pd/Interest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LinkClicked
  "Information about the links that an individual has clicked."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about the links that an individual has clicked."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/LinkClicked,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Link Clicked"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Navigation",
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LoanRecord
  "Information about loans, whether applied, provided or rejected, and its history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about loans, whether applied, provided or rejected, and its history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/LoanRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Record"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Location
  "Information about location"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about location"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Location,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Location",
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MACAddress
  "Information about the Media Access Control (MAC) address of a device"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the Media Access Control (MAC) address of a device"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/MACAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MAC Address"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaritalStatus
  "Information about marital status and history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about marital status and history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/MaritalStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marital Status"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Marriage
  "Information about marriage(s)."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about marriage(s)."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Marriage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marriage"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MedicalHealth
  "Information about health, medical conditions or health care"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about health, medical conditions or health care"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/MedicalHealth,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medical Health"},
   :rdfs/subClassOf
   [:dpvo-pd/External
    "https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MentalHealth
  "Information about mental health."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about mental health."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/MentalHealth,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mental Health"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Name
  "Information about names associated or used as given name or nickname."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about names associated or used as given name or nickname."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Name,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Name"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Nationality
  "Information about nationality"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "https://www.w3.org/2022/04/20-dpvcg-minutes.html",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about nationality"},
   :rdf/about           :dpvo-pd/Nationality,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Nationality"},
   :rdfs/subClassOf     :dpvo-pd/External,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def OfficialID
  "Information about an official identifier or identification document"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about an official identifier or identification document"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/OfficialID,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Official ID"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Government",
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Offspring
  "Information about offspring(s)."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about offspring(s)."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Offspring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Offspring"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Opinion
  "Information about opinions"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about opinions"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Opinion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Opinion"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Ownership
  "Information about ownership and history, including renting, borrowing, possessions."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about ownership and history, including renting, borrowing, possessions."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Ownership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ownership"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PINCode
  "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PINCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PIN Code"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Parent
  "Information about parent(s)."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about parent(s)."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Parent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parent"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Passport
  "Information about passport"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about passport"},
   :rdf/about           :dpvo-pd/Passport,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Passport"},
   :rdfs/subClassOf     :dpvo-pd/OfficialID,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Password
  "Information about password used in the process of authenticating the individual as an user accessing a system."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about password used in the process of authenticating the individual as an user accessing a system."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Password,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Password"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PastEmployment
  "Information about past employment"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about past employment"},
   :rdf/about           :dpvo-pd/PastEmployment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Past Employment"},
   :rdfs/subClassOf     :dpvo-pd/EmploymentHistory,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PaymentCard
  "Information about payment card such as Credit Card, Debit Card."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about payment card such as Credit Card, Debit Card."},
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo-pd/PaymentCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Card"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentCardExpiry
  "Information about payment card expiry such as a date."
  {:dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about payment card expiry such as a date."},
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/about :dpvo-pd/PaymentCardExpiry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Card Expiry"},
   :rdfs/subClassOf :dpvo-pd/PaymentCard,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentCardNumber
  "Information about payment card number."
  {:dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about payment card number."},
   :dcterms/source      "https://www.w3.org/community/dpvcg/",
   :rdf/about           :dpvo-pd/PaymentCardNumber,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Payment Card Number"},
   :rdfs/subClassOf     [:dpvo-pd/AccountIdentifier :dpvo-pd/PaymentCard],
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PerformanceAtWork
  "Information about performance at work or within work environments"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about performance at work or within work environments"},
   :rdf/about :dpvo-pd/PerformanceAtWork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Performance at Work"},
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Behavioral],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalDocuments
  "Information about and including personal documents e.g. diaries or journals"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about and including personal documents e.g. diaries or journals"},
   :rdf/about :dpvo-pd/PersonalDocuments,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Documents"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalPossession
  "Information about personal possessions."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about personal possessions."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PersonalPossession,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Possession"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Personality
  "Information about personality (e.g., categorization in terms of the Big Five personality traits)"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about personality (e.g., categorization in terms of the Big Five personality traits)"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Personality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personality"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhilosophicalBelief
  "Information about philosophical beliefs."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about philosophical beliefs."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PhilosophicalBelief,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Philosophical Belief"},
   :rdfs/subClassOf
   [:dpvo-pd/KnowledgeBelief
    "https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalAddress
  "Information about physical address."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical address."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PhysicalAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Address"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalCharacteristic
  "Information about physical characteristics"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about physical characteristics"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PhysicalCharacteristic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Characteristic"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Demographic",
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalHealth
  "Information about physical health."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical health."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PhysicalHealth,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Health"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalTrait
  "Information about defining traits or features regarding the body."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about defining traits or features regarding the body."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PhysicalTrait,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Trait"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Picture
  "Information about visual representation or image e.g. profile photo."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about visual representation or image e.g. profile photo."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Picture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Picture"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Piercing
  "Information about piercings"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about piercings"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Piercing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Piercing"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PoliticalAffiliation
  "Information about political affiliation and history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about political affiliation and history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PoliticalAffiliation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Political Affiliation"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Political",
   :rdfs/subClassOf
   [:dpvo-pd/PublicLife
    "https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PoliticalOpinion
  "Information about opinions regarding politics and political topics"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about opinions regarding politics and political topics"},
   :rdf/about :dpvo-pd/PoliticalOpinion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Political Opinion"},
   :rdfs/subClassOf ["https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"
                     :dpvo-pd/PublicLife],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Preference
  "Information about preferences or interests"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about preferences or interests"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Preference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preference"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Preference",
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Prescription
  "Information about medical and pharmaceutical prescriptions"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about medical and pharmaceutical prescriptions"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Prescription,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prescription"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyPreference
  "Information about privacy preferences"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about privacy preferences"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PrivacyPreference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Preference"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Proclivitie
  "Information about proclivities in a sexual context"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about proclivities in a sexual context"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Proclivitie,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Proclivitie"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Professional
  "Information about educational or professional career"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about educational or professional career"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Professional,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalCertification
  "Information about professional certifications"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional certifications"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/ProfessionalCertification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Certification"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalEvaluation
  "Information about professional evaluations"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional evaluations"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/ProfessionalEvaluation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Evaluation"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalInterview
  "Information about professional interviews"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional interviews"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/ProfessionalInterview,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Interview"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Profile
  "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"},
   :rdf/about :dpvo-pd/Profile,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Profile"},
   :rdfs/subClassOf "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicLife
  "Information about public life"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about public life"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PublicLife,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Life"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PubliclyAvailableSocialMedia
  "Information about social media that is publicly available"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about social media that is publicly available"},
   :rdf/about :dpvo-pd/PubliclyAvailableSocialMedia,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Publicly Available Social Media"},
   :rdfs/subClassOf :dpvo-pd/SocialMedia,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Purchase
  "Information about purchases such as items bought e.g. grocery or clothing"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about purchases such as items bought e.g. grocery or clothing"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Purchase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purchase"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Purchase",
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PurchasesAndSpendingHabit
  "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/PurchasesAndSpendingHabit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purchases and Spending Habit"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Race
  "Information about race or racial history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about race or racial history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Race,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Race"},
   :rdfs/subClassOf ["https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"
                     :dpvo-pd/Ethnicity],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Reference
  "Information about references in the professional context"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about references in the professional context"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Reference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reference"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Relationship
  "Information about relationships and relationship history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about relationships and relationship history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Relationship,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :rdfs/subClassOf :dpvo-pd/Family,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Reliability
  "Information about reliability (e.g. of a person)"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reliability (e.g. of a person)"},
   :rdf/about           :dpvo-pd/Reliability,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Reliability"},
   :rdfs/subClassOf     :dpvo-pd/Behavioral,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Religion
  "Information about religion, religious inclinations, and religious history."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about religion, religious inclinations, and religious history."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Religion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Religion"},
   :rdfs/subClassOf ["https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"
                     :dpvo-pd/PublicLife],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReligiousBelief
  "Information about religion and religious beliefs."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about religion and religious beliefs."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/ReligiousBelief,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Religious Belief"},
   :rdfs/subClassOf ["https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"
                     :dpvo-pd/KnowledgeBelief],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Retina
  "Information about retina and the retinal patterns."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about retina and the retinal patterns."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Retina,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Retina"},
   :rdfs/subClassOf :dpvo-pd/Biometric,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RoomNumber
  "Information about location expressed as Room number or similar numbering systems"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location expressed as Room number or similar numbering systems"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/RoomNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Room Number"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Salary
  "Information about salary"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about salary"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Salary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Salary"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sale
  "Information about sales e.g. selling of goods or services"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about sales e.g. selling of goods or services"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Sale,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sale"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def School
  "Information about school such as name of school, conduct, or grades obtained."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about school such as name of school, conduct, or grades obtained."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/School,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "School"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecretText
  "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/SecretText,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secret Text"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceConsumptionBehavior
  "Information about the consumption of a service, e.g. time and duration of consumption."
  {:dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the consumption of a service, e.g. time and duration of consumption."},
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/about :dpvo-pd/ServiceConsumptionBehavior,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Consumption Behavior"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sexual
  "Information about sexuality and sexual history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about sexuality and sexual history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Sexual,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual"},
   :rdfs/subClassOf ["https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"
                     :dpvo-pd/External],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SexualHistory
  "Information about sexual history"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sexual history"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/SexualHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual History"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SexualPreference
  "Information about sexual preferences"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sexual preferences"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/SexualPreference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual Preference"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sibling
  "Information about sibling(s)."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sibling(s)."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Sibling,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sibling"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SkinTone
  "Information about skin tone"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about skin tone"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/SkinTone,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Skin Tone"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Social
  "Information about social aspects such as family, public life, or professional networks."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about social aspects such as family, public life, or professional networks."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Social,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social"},
   :rdfs/subClassOf "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialMedia
  "Information about social media"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about social media"},
   :rdf/about           :dpvo-pd/SocialMedia,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Social Media"},
   :rdfs/subClassOf     :dpvo-pd/Communication,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SocialMediaCommunication
  "Information about social media communication, including the communication itself and metadata."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about social media communication, including the communication itself and metadata."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/SocialMediaCommunication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Media Communication"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#Social",
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialNetwork
  "Information about friends or connections expressed as a social network"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about friends or connections expressed as a social network"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/SocialNetwork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Network"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialStatus
  "Information about social status"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about social status"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/SocialStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Status"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TVViewingBehavior
  "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"
  {:dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Rudy Jacob"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"},
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/about :dpvo-pd/TVViewingBehavior,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TV Viewing Behavior"},
   :rdfs/subClassOf :dpvo-pd/ServiceConsumptionBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tattoo
  "Information about tattoos"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about tattoos"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Tattoo,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tattoo"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tax
  "Information about financial tax e.g. tax records or tax due"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about financial tax e.g. tax records or tax due"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Tax,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tax"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TelephoneNumber
  "Information about telephone number."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about telephone number."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/TelephoneNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Telephone Number"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Thought
  "Information about thoughts"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about thoughts"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Thought,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Thought"},
   :rdfs/subClassOf :dpvo-pd/KnowledgeBelief,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tracking
  "Information used to track an individual or group e.g. location or email"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information used to track an individual or group e.g. location or email"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Tracking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tracking"},
   :rdfs/subClassOf "https://w3id.org/dpv/dpv-owl#PersonalData",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TradeUnionMembership
  "Information about trade union memberships and related topics"
  {:dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about trade union memberships and related topics"},
   :rdf/about :dpvo-pd/TradeUnionMembership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trade Union Membership"},
   :rdfs/subClassOf ["https://w3id.org/dpv/dpv-owl#SpecialCategoryPersonalData"
                     :dpvo-pd/GroupMembership],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transaction
  "Information about financial transactions e.g. bank transfers"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about financial transactions e.g. bank transfers"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Transaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transaction"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transactional
  "Information about a purchasing, spending or income"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about a purchasing, spending or income"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Transactional,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transactional"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TravelHistory
  "Information about travel history"
  {:dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about travel history"},
   :rdf/about           :dpvo-pd/TravelHistory,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Travel History"},
   :rdfs/subClassOf     :dpvo-pd/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UID
  "Information about unique identifiers."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about unique identifiers."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/UID,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "UID"},
   :rdfs/seeAlso "https://specialprivacy.ercim.eu/vocabs/data#UniqueId",
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UserAgent
  "Information about software acting on behalf of users e.g. web browser"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about software acting on behalf of users e.g. web browser"},
   :rdf/about :dpvo-pd/UserAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User agent"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Username
  "Information about usernames."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about usernames."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Username,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Username"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VehicalLicenseNumber
  "Information about vehicle license number"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about vehicle license number"},
   :rdf/about           :dpvo-pd/VehicalLicenseNumber,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License Number"},
   :rdfs/subClassOf     :dpvo-pd/VehicleLicense,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicalLicenseRegistration
  "Information about vehicle license registration"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about vehicle license registration"},
   :rdf/about           :dpvo-pd/VehicalLicenseRegistration,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License Registration"},
   :rdfs/subClassOf     :dpvo-pd/VehicleLicense,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Vehicle
  "Information about vehicles"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about vehicles"},
   :rdf/about           :dpvo-pd/Vehicle,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle"},
   :rdfs/subClassOf     :dpvo-pd/External,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicleLicense
  "Information about vehicle license"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about vehicle license"},
   :rdf/about           :dpvo-pd/VehicleLicense,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License"},
   :rdfs/subClassOf     [:dpvo-pd/Vehicle :dpvo-pd/Identifying],
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicleUsage
  "Information about usage of vehicles, e.g. driving statistics"
  {:dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about usage of vehicles, e.g. driving statistics"},
   :rdf/about :dpvo-pd/VehicleUsage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vehicle Usage"},
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/Vehicle],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VoiceCommunicationRecording
  "Information about vocal recorded communication (e.g. telephony, VoIP)"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about vocal recorded communication (e.g. telephony, VoIP)"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/VoiceCommunicationRecording,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voice Communication Recording"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VoiceMail
  "Information about voice mail messages."
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about voice mail messages."},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/VoiceMail,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voice Mail"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Weight
  "Information about physical weight"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical weight"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/Weight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Weight"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WorkEnvironment
  "Information about work environments"
  {:dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about work environments"},
   :rdf/about           :dpvo-pd/WorkEnvironment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Work Environment"},
   :rdfs/subClassOf     :dpvo-pd/Professional,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def WorkHistory
  "Information about work history in a professional context"
  {:dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about work history in a professional context"},
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/about :dpvo-pd/WorkHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Work History"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})