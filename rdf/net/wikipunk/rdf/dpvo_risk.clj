(ns net.wikipunk.rdf.dpvo-risk
  "Risk Extension for DPV-OWL"
  {:dcterms/abstract {:rdf/language "en",
                      :rdf/value    "Risk Extension for DPV-OWL"},
   :dcterms/contributor ["Julian Flake"
                         "Paul Ryan"
                         "Beatriz Esteves"
                         "Harshvardhan J. Pandit"
                         "Georg P Krog"],
   :dcterms/created #inst "2022-08-14T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Risk extension to Data Privacy Vocabulary provides terms (classes and properties) related to risk management, assessment, and consequences."},
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-10-06T00:00:00.000-04:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Risk Extension for DPV-OWL"},
   :owl/imports "https://w3id.org/dpv/dpv-owl",
   :owl/versionInfo "0.8.2",
   :rdf/about "https://w3id.org/dpv/dpv-owl/risk",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "dpvo-risk" "https://w3id.org/dpv/dpv-owl/risk#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-risk",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/risk#",
   :vann/preferredNamespacePrefix "dpvs-risk",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/risk#"})

(def ACSC-ISM
  "The Australian Cyber Security Centre (ACSC) published the Australian Government Information Security Manual (ISM) which adopts the use of a risk management framework that draws from NIST 800-37, and includes six steps: define the system, select security controls, implement security controls, assess security controls, authorise the system and monitor the system"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Australian Cyber Security Centre (ACSC) published the Australian Government Information Security Manual (ISM) which adopts the use of a risk management framework that draws from NIST 800-37, and includes six steps: define the system, select security controls, implement security controls, assess security controls, authorise the system and monitor the system"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/ACSC-ISM,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ACSC-ISM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ALARA
  "As Low as Resonably Achievable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "As Low as Resonably Achievable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/ALARA,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ALARA"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ALARP
  "As Low as Resonably Possible (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "As Low as Resonably Possible (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/ALARP,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ALARP"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ANSI-ISA-62443-3‑2-2020
  "ANSI/ISA-62443-3-2-2020 standard, entitled ‘Security for industrial automation and control systems, Part 3-2: Security risk assessment for system design’, from the International Society of Automation (ISA), dedicates an entire part to the assessment of security risk for system design targeting Security and IT professionals"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ANSI/ISA-62443-3-2-2020 standard, entitled ‘Security for industrial automation and control systems, Part 3-2: Security risk assessment for system design’, from the International Society of Automation (ISA), dedicates an entire part to the assessment of security risk for system design targeting Security and IT professionals"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/ANSI-ISA-62443-3‑2-2020,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ANSI/ISA-62443-3‑2-2020"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AbusiveContentUtilisation
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/AbusiveContentUtilisation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Abusive Content Utilisation"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AttackonPrivateLife
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/AttackonPrivateLife,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Attack on Private Life"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def AuthorisationFailure
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/trust-services-security-incidents-2021",
   :rdf/about :dpvo-risk/AuthorisationFailure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authorisation Failure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AvoidSource
  "Risk Control that avoids the risk source"
  {:dcterms/created     #inst "2022-08-21T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Risk Control that avoids the risk source"},
   :rdf/about           :dpvo-risk/AvoidSource,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Avoid Source"},
   :rdfs/subClassOf     :dpvo-risk/ControlRiskSource,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BSI-200-2
  "The BSI-Standard 200-2 (‘IT-Grundschutz Methodology’) provides a methodology for the management of information security which can be adapted to the requirements of organisations of various types and sizes"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The BSI-Standard 200-2 (‘IT-Grundschutz Methodology’) provides a methodology for the management of information security which can be adapted to the requirements of organisations of various types and sizes"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/BSI-200-2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BSI Standard 200-2"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BayesianAnalysis
  "A means of making inference about model parameters using Bayes' theorem which has the capability of incorporating empirical data into prior judgements about probabilities"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A means of making inference about model parameters using Bayes' theorem which has the capability of incorporating empirical data into prior judgements about probabilities"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/BayesianAnalysis,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bayesian Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BayesianNetworks
  "A graphical model of variables and their cause-effect relationships expressed using probabilities"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A graphical model of variables and their cause-effect relationships expressed using probabilities"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/BayesianNetworks,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bayesian Networks"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Blackmail
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Blackmail,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Blackmail"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BowTie
  "A diagrammatic way of describing the pathways from sources of risk to outcomes, and of reviewing controls"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A diagrammatic way of describing the pathways from sources of risk to outcomes, and of reviewing controls"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/BowTie,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bow Tie Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Brainstorming
  "Technique used in workshops to encourage imaginative thinking"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Technique used in workshops to encourage imaginative thinking"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Brainstorming,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Brainstorming"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BruteForceAuthorisations
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/BruteForceAuthorisations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Brute Force Authorisations"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BusinessImpact
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/BusinessImpact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BusinessImpactAnalysis
  "A process that analyses the consequences of a disruptive incident on the organization which determines the recovery priorities of an organization's products and services and, thereby, the priorities of the activities and resources which deliver them"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A process that analyses the consequences of a disruptive incident on the organization which determines the recovery priorities of an organization's products and services and, thereby, the priorities of the activities and resources which deliver them"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/BusinessImpactAnalysis,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business Impact Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BusinessPerformanceImpairment
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/BusinessPerformanceImpairment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Business Performance Impairment"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Businessdisruption
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Businessdisruption,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Business disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CCRACII
  "The Guide to Conducting Cybersecurity Risk Assessment for Critical Information Infrastructure (CCRACII) defines commonly used terms such as threat event, vulnerability, likelihood, impact and risk, roles, and responsibilities, in addition to a range for risk levels, ranging from low to very high with different level of risk toleranc"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Guide to Conducting Cybersecurity Risk Assessment for Critical Information Infrastructure (CCRACII) defines commonly used terms such as threat event, vulnerability, likelihood, impact and risk, roles, and responsibilities, in addition to a range for risk levels, ranging from low to very high with different level of risk toleranc"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/CCRACII,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CCRACII"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CORAS
  "The CORAS method was developed and is supported by SourceForge. It is a method for conducting the analysis and management of security risk. It provides a customised language for modelling threats and risks as well as detailed guidelines explaining how the language should be used to capture and model relevant information during the various stages of the security analysis"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The CORAS method was developed and is supported by SourceForge. It is a method for conducting the analysis and management of security risk. It provides a customised language for modelling threats and risks as well as detailed guidelines explaining how the language should be used to capture and model relevant information during the various stages of the security analysis"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/CORAS,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CORAS"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CRAMM
  "CCTA Risk Assessment and Management Methodology (CRAMM) is a method that an analyst or group of analysts may use to evaluate the security and risk level of an organisation by analysing and combining the diverse knowledge distributed in the local corporate environment"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "CCTA Risk Assessment and Management Methodology (CRAMM) is a method that an analyst or group of analysts may use to evaluate the security and risk level of an organisation by analysing and combining the diverse knowledge distributed in the local corporate environment"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/CRAMM,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CRAMM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CVaR
  "A measure of the expected loss from a financial portfolio in the worst a % of cases. Also called expected shortfall (ES)"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A measure of the expected loss from a financial portfolio in the worst a % of cases. Also called expected shortfall (ES)"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/CVaR,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Conditional Value at Risk (CVaR)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CausalMapping
  "A network diagram representing events, causes and effects and their relationships."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A network diagram representing events, causes and effects and their relationships."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/CausalMapping,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Causal Mapping"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CauseConsequenceAnalysis
  "A combination of fault and event tree analysis that allows inclusion of time delays. Both causes and consequences of an initiating event are considered."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A combination of fault and event tree analysis that allows inclusion of time delays. Both causes and consequences of an initiating event are considered."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/CauseConsequenceAnalysis,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cause-Consequence Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ChangeConsequence
  "Risk Control that changes Consequence"
  {:dcterms/created     #inst "2022-08-25T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Risk Control that changes Consequence"},
   :rdf/about           :dpvo-risk/ChangeConsequence,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Change Consequence"},
   :rdfs/subClassOf     :dpvo-risk/ControlConsequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ChangeImpact
  "Risk Control that changes Impact"
  {:dcterms/created     #inst "2022-08-26T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Risk Control that changes Impact"},
   :rdf/about           :dpvo-risk/ChangeImpact,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Change Impact"},
   :rdfs/subClassOf     :dpvo-risk/ControlConsequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Checklists
  "A checklist based on experience or on concepts and models that can be used to help identify risks or controls."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A checklist based on experience or on concepts and models that can be used to help identify risks or controls."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Checklists,
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Checklists"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ChildViolence
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/ChildViolence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child Violence"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Cindynic
  "Considers goals, values, rules, data and models of stakeholders and identifies inconsistencies, ambiguities, omissions and ignorance. These form systemic sources and drivers of risk."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Considers goals, values, rules, data and models of stakeholders and identifies inconsistencies, ambiguities, omissions and ignorance. These form systemic sources and drivers of risk."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Cindynic,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cindynic Approach"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CitizensImpact
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/CitizensImpact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Citizens impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Classifications
  "A classification list based on experience or on concepts and models that can be used to help identify risks or controls."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A classification list based on experience or on concepts and models that can be used to help identify risks or controls."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Classifications,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Classifications"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Coercion
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/Coercion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Coercion"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ComplianceImpact
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/ComplianceImpact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compliance impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompromiseAccount
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/CompromiseAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compromise Account"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompromiseAccountCredentials
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/CompromiseAccountCredentials,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compromise Account Credentials"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CompromiseAccountSecurity
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/CompromiseAccountSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compromise Account Security"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ConfidentialityBreach
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ConfidentialityBreach,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Confidentiality Breach"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsequenceForDataSubject
  ""
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/ConsequenceForDataSubject,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consequence for Data Subject"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ConsequenceOnDataSecurity
  ""
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/ConsequenceOnDataSecurity,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Consequence on Data Security"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ControlConsequence
  "Risk Mitigation Measure that controls the Consequences and Impacts"
  {:dcterms/created #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Mitigation Measure that controls the Consequences and Impacts"},
   :rdf/about :dpvo-risk/ControlConsequence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Control Consequence"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ControlMonitors
  "Risk Mitigation Measure that uses controls to monitor events"
  {:dcterms/created #inst "2022-08-30T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Risk Mitigation Measure that uses controls to monitor events"},
   :rdf/about :dpvo-risk/ControlMonitors,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Monitoring can be associated with characteristics such as assessing or detecting whether something is active, operational, performant, effective, has potential to materialise, is materialising, or has already materialised."},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Control Monitors"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ControlRiskSource
  "Risk Mitigation Measure that controls the Risk Source"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Risk Mitigation Measure that controls the Risk Source"},
   :rdf/about :dpvo-risk/ControlRiskSource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Control Risk Source"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CopyrightViolation
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/CopyrightViolation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright Violation"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CorruptionData
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CorruptionData,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Corruption of Data"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostAcquisition
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostAcquisition,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Acquisition"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostBackup
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostBackup,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Backup"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostBenefitAnalysis
  "Uses money as a scale for estimating positive and negative, tangible and intangible, consequences of different options."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Uses money as a scale for estimating positive and negative, tangible and intangible, consequences of different options."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/CostBenefitAnalysis,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cost/benefit Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CostConfiguration
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostConfiguration,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Configuration"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostInstallation
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostInstallation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Installation"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostJudicialPenalties
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostJudicialPenalties,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Judicial Penalties"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostJudicialProceedings
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostJudicialProceedings,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Judicial Proceedings"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostOperationInterruption
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostOperationInterruption,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Operation Interruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CostSuspendedOperations
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CostSuspendedOperations,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cost of Suspended Operations"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CrossImpactAnalysis
  "Evaluates changes in the probability of the occurrence of a given set of events consequent on the actual occurrence of one of them."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Evaluates changes in the probability of the occurrence of a given set of events consequent on the actual occurrence of one of them."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/CrossImpactAnalysis,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cross Impact Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Cryptojacking
  "Cryptojacking or hidden cryptomining is a type of cybercrime where a criminal secretly uses a victim’s computing power to generate cryptocurrency"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Cryptojacking or hidden cryptomining is a type of cybercrime where a criminal secretly uses a victim’s computing power to generate cryptocurrency"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021",
   :rdf/about :dpvo-risk/Cryptojacking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptojacking"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CyberSpying
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CyberSpying,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cyber Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CyberStalking
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/CyberStalking,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cyber Stalking"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIA
  "Analyses how incidents and events could affect the protection of data and its effects on persons and identifies and quantifies the capabilities that would be needed to manage it."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses how incidents and events could affect the protection of data and its effects on persons and identifies and quantifies the capabilities that would be needed to manage it."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/DPIA,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Impact Assessment (DPIA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DamageByThirdParty
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/DamageByThirdParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Damage by Third Party"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DangertoCustomers
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/DangertoCustomers,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Danger to Customers"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DangertoPersonnel
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/DangertoPersonnel,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Danger to Personnel"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataBreach
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/DataBreach,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Breach"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DecisionTreeAnalysis
  "Uses a tree-like representation or model of decisions and their possible consequences. Outcomes are usually expressed in monetary terms or in terms of utility."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Uses a tree-like representation or model of decisions and their possible consequences. Outcomes are usually expressed in monetary terms or in terms of utility."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/DecisionTreeAnalysis,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Decision Tree Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DelphiTechnique
  "Collects judgements through a set of sequential questionnaires. People participate individually but receive feedback on the responses of others after each set of questions."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Collects judgements through a set of sequential questionnaires. People participate individually but receive feedback on the responses of others after each set of questions."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/DelphiTechnique,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delphi Technique"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DenialServiceAttack
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/DenialServiceAttack,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Denial of Service Attack (DoS)"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DetrimentToRecovery
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/DetrimentToRecovery,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Detriment to Recovery"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Discrimination
  ""
  {:dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/Discrimination,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Discrimination"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DistributedDenialServiceAttack
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/DistributedDenialServiceAttack,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value
                         "Distributed Denial of Service Attack (DDoS)"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EBIOS
  "Expression des Besoins et Identification des Objectifs de Sécurité (EBIOS) Risk Manager is an information security risk management method, created under the French General Secretariat of National Defence, consistent with ISO 31000 and ISO/IEC 27005, and enables the risk management requirements of ISO/IEC 27001 to be met"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Expression des Besoins et Identification des Objectifs de Sécurité (EBIOS) Risk Manager is an information security risk management method, created under the French General Secretariat of National Defence, consistent with ISO 31000 and ISO/IEC 27005, and enables the risk management requirements of ISO/IEC 27001 to be met"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/EBIOS,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EBIOS"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ERM-IF
  "Enterprise Risk Management - Integrated Framework (ERM-IF) defines the essential components of enterprise risk management. It is based on a set of principles and concepts for the enterprise and has as its objective to offer a common language for enterprise risk"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Enterprise Risk Management - Integrated Framework (ERM-IF) defines the essential components of enterprise risk management. It is based on a set of principles and concepts for the enterprise and has as its objective to offer a common language for enterprise risk"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/ERM-IF,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ERM-IF"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ETSI-TS-102-165-1
  "ETSI TS 102 165-1 offers methodology and pro-forma for threat, vulnerability and risk analysis (TVRA). According to ETSI TS 102 165-1, threat vulnerability and risk analysis (TVRA) is used to identify risk to an information system based upon the product of the likelihood of an attack and the impact that such an attack will have on the system"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ETSI TS 102 165-1 offers methodology and pro-forma for threat, vulnerability and risk analysis (TVRA). According to ETSI TS 102 165-1, threat vulnerability and risk analysis (TVRA) is used to identify risk to an information system based upon the product of the likelihood of an attack and the impact that such an attack will have on the system"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/ETSI-TS-102-165-1,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ETSI TS 102 165-1"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EU-ITSRM
  "ITSRM² IT Security Risk Management Methodology is a methodology provided by DG DIGIT and the European Commission as part of a set of standards for information security"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ITSRM² IT Security Risk Management Methodology is a methodology provided by DG DIGIT and the European Commission as part of a set of standards for information security"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/EU-ITSRM,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ITSRM²"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Eavesdropping
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Eavesdropping,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Eavesdropping"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EconomicDisadvantage
  ""
  {:dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/EconomicDisadvantage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Economic Disadvantage"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EnvironmentalSafetyEndangerment
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/EnvironmentalSafetyEndangerment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Environmental Safety Endangerment"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EquipmentFailure
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/EquipmentFailure,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Equipment Failure"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EquipmentMalfunction
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/EquipmentMalfunction,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Equipment Malfunction"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ErrornousSystemUse
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ErrornousSystemUse,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Errornous System Use"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EventTreeAnalysis
  "Models the possible outcomes from a given initiating event and the status of controls thus analysing the frequency or probability of the various possible outcomes."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Models the possible outcomes from a given initiating event and the status of controls thus analysing the frequency or probability of the various possible outcomes."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/EventTreeAnalysis,
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Tree Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Extorsion
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/Extorsion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extorsion"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyHighLikelihood
  "Level where Likelihood is Extremely High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Level where Likelihood is Extremely High"},
   :rdf/about :dpvo-risk/ExtremelyHighLikelihood,
   :rdf/type
   [:owl/NamedIndividual :dpvo/Likelihood :dpvo-risk/|7LikelihoodLevels|],
   :rdf/value 0.99M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyHighRisk
  "Level where Risk is Extremely High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Extremely High"},
   :rdf/about :dpvo-risk/ExtremelyHighRisk,
   :rdf/type [:dpvo-risk/|7RiskLevels| :owl/NamedIndividual :dpvo/RiskLevel],
   :rdf/value 0.99M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyHighSeverity
  "Level where Severity is Extremely High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Level where Severity is Extremely High"},
   :rdf/about :dpvo-risk/ExtremelyHighSeverity,
   :rdf/type [:dpvo-risk/|7SeverityLevels| :dpvo/Severity :owl/NamedIndividual],
   :rdf/value 0.99M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.99 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyLowLikelihood
  "Level where Likelihood is Extremely Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Level where Likelihood is Extremely Low"},
   :rdf/about :dpvo-risk/ExtremelyLowLikelihood,
   :rdf/type
   [:dpvo-risk/|7LikelihoodLevels| :dpvo/Likelihood :owl/NamedIndividual],
   :rdf/value 0.01M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyLowRisk
  "Level where Risk is Extremely Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Extremely Low"},
   :rdf/about :dpvo-risk/ExtremelyLowRisk,
   :rdf/type [:dpvo/RiskLevel :dpvo-risk/|7RiskLevels| :owl/NamedIndividual],
   :rdf/value 0.01M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ExtremelyLowSeverity
  "Level where Severity is Extremely Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Extremely Low"},
   :rdf/about :dpvo-risk/ExtremelyLowSeverity,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/|7SeverityLevels| :dpvo/Severity],
   :rdf/value 0.01M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.01 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FAIR
  "The purpose of the FAIR (Factor Analysis of Information Risk) model is to help organisations understand, analyse, and measure information risk. The model provides an approach to quantify risk and defines the necessary building blocks for implementing effective cyber risk management programmes"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The purpose of the FAIR (Factor Analysis of Information Risk) model is to help organisations understand, analyse, and measure information risk. The model provides an approach to quantify risk and defines the necessary building blocks for implementing effective cyber risk management programmes"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/FAIR,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FAIR"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FAIR-Privacy
  "Factors Analysis in Information Risk (FAIR Privacy) is a quantitative privacy risk framework based on FAIR (Factors Analysis in Information Risk) that examines personal privacy risks (to individuals), not organisational risks"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Factors Analysis in Information Risk (FAIR Privacy) is a quantitative privacy risk framework based on FAIR (Factors Analysis in Information Risk) that examines personal privacy risks (to individuals), not organisational risks"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/FAIR-Privacy,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FAIR Privacy"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FMEA
  "Considers the ways in which each component of a system might fail and the failure causes and effects."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Considers the ways in which each component of a system might fail and the failure causes and effects."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/FMEA,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Failure Modes And Effects Analysis (FMEA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FMECA
  "Considers the ways in which each component of a system might fail and the failure causes and effects. FMEA followed by a criticality analysis which defines the significance of each failure mode (FMECA)."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Considers the ways in which each component of a system might fail and the failure causes and effects. FMEA followed by a criticality analysis which defines the significance of each failure mode (FMECA)."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/FMECA,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Failure Modes And Effects And Criticality Analysis (FMECA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FNDiagrams
  "Special case of quantitative consequence/likelihood graph applied to consideration of tolerability of risk to human life."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Special case of quantitative consequence/likelihood graph applied to consideration of tolerability of risk to human life."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/FNDiagrams,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "F-N Diagrams"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FaultTreeAnalysis
  "Analyses causes of a focus event using Boolean logic to describe combinations of faults. Variations include a success tree where the top event is desired and a cause tree used to investigate past events."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses causes of a focus event using Boolean logic to describe combinations of faults. Variations include a success tree where the top event is desired and a cause tree used to investigate past events."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/FaultTreeAnalysis,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fault Tree Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialEquipmentCosts
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/FinancialEquipmentCosts,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Equipment Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialInvestigationCosts
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/FinancialInvestigationCosts,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Investigation Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialLoss
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/FinancialLoss,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Loss"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialPersonnelCosts
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/FinancialPersonnelCosts,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Personnel Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def FinancialRepairCosts
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/FinancialRepairCosts,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Repair Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Fishbone
  "Identifies contributory factors to a defined outcome (wanted or unwanted). Contributory factors are usually divided into predefined categories and displayed in a tree structure or a fishbone diagram."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Identifies contributory factors to a defined outcome (wanted or unwanted). Contributory factors are usually divided into predefined categories and displayed in a tree structure or a fishbone diagram."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Fishbone,
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ishikawa (Fishbone)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Fraud
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Fraud,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Fraud"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GCSOS
  "The Guidelines on Cyber Security Onboard Ships (GCSOS) guidelines explain why and how cyber risks should be managed in a shipping context. They outline the risk assessment process with an explanation of the part played by each component of cyber risk and offer advice on how to respond to and recover from cyber incidents"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Guidelines on Cyber Security Onboard Ships (GCSOS) guidelines explain why and how cyber risks should be managed in a shipping context. They outline the risk assessment process with an explanation of the part played by each component of cyber risk and offer advice on how to respond to and recover from cyber incidents"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/GCSOS,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GCSOS"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GameTheory
  "The study of strategic decision making to model the impact of the decisions of different players involved in the game. Example application area can be risk based pricing."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The study of strategic decision making to model the impact of the decisions of different players involved in the game. Example application area can be risk based pricing."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/GameTheory,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Game Theory"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GovernmentCrisis
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/GovernmentCrisis,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Government Crisis"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def HACCP
  "Analyses the risk reduction that can be achieved by various layers of protection."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses the risk reduction that can be achieved by various layers of protection."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/HACCP,
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Hazard Analysis And Critical Control Points (HACCP)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HAZOP
  "A structured and systematic examination of a planned or existing process or operation in order to identify and evaluate problems that might represent risk to personnel or equipment, or prevent efficient operation"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A structured and systematic examination of a planned or existing process or operation in order to identify and evaluate problems that might represent risk to personnel or equipment, or prevent efficient operation"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/HAZOP,
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hazard And Operability Studies (HAZOP)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HITRUST-CSF
  "The HITRUST Cyber-Security Framework (CSF) is a framework created by security industry experts to safeguard sensitive information and manage information risk for organisations across all industries and throughout the third-party supply chain"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The HITRUST Cyber-Security Framework (CSF) is a framework created by security industry experts to safeguard sensitive information and manage information risk for organisations across all industries and throughout the third-party supply chain"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/HITRUST-CSF,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "HITRUST-CSF"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HaltSource
  "Risk Control that halts the risk source or prevents it from materialising"
  {:dcterms/created #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Control that halts the risk source or prevents it from materialising"},
   :rdf/about :dpvo-risk/HaltSource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Halt Source"},
   :rdfs/subClassOf :dpvo-risk/ControlRiskSource,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HarmfulSpeech
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/HarmfulSpeech,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Harmful Spech"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthLifeImpact
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/HealthLifeImpact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health and life impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HighLikelihood
  "Level where Likelihood is High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is High"},
   :rdf/about :dpvo-risk/HighLikelihood,
   :rdf/type [:dpvo-risk/|3LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :owl/NamedIndividual
              :dpvo/Likelihood
              :dpvo-risk/|7LikelihoodLevels|],
   :rdf/value 0.75M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HighRisk
  "Level where Risk is High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is High"},
   :rdf/about :dpvo-risk/HighRisk,
   :rdf/type [:owl/NamedIndividual
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|
              :dpvo-risk/|7RiskLevels|
              :dpvo-risk/|3RiskLevels|],
   :rdf/value 0.75M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HighSeverity
  "Level where Severity is High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is High"},
   :rdf/about :dpvo-risk/HighSeverity,
   :rdf/type [:dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value 0.75M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.75 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanErrors
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/HumanErrors,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Errors"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HumanReliabilityAnalysis
  "A set of techniques for identifying the potential for human error and estimating the likelihood of failure."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A set of techniques for identifying the potential for human error and estimating the likelihood of failure."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/HumanReliabilityAnalysis,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Human Reliability Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IMO-MSC-FAL1-CIRC3
  "The official International Maritime Organization guidelines IMO MSC-FAL.1/CIRC.3 provide a high-level approach to the management pf maritime cyber risk which refers to the extent a technology asset is exposed to risks during an event that could result in shipping-related operational failure"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The official International Maritime Organization guidelines IMO MSC-FAL.1/CIRC.3 provide a high-level approach to the management pf maritime cyber risk which refers to the extent a technology asset is exposed to risks during an event that could result in shipping-related operational failure"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/IMO-MSC-FAL1-CIRC3,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IMO MSC-FAL.1/CIRC.3"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IRAM2
  "Information Risk Assessment Methodology (IRAM2) supports risk assessment and treatment and entails a six-phase process, and is is implemented by an automated toolset"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information Risk Assessment Methodology (IRAM2) supports risk assessment and treatment and entails a six-phase process, and is is implemented by an automated toolset"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/IRAM2,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IRAM2"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IS-BM
  "The IS risk analysis method is based on a business model using a quantitative approach. The values of IS assets come from their importance towards operational continuity, as well as from their replacement costs"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The IS risk analysis method is based on a business model using a quantitative approach. The values of IS assets come from their importance towards operational continuity, as well as from their replacement costs"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/IS-BM,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IS-BM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISACA-RISK-IT
  "The ISACA Risk IT Framework provides a set of guiding principles and supporting practices for enterprise management, combined to deliver a comprehensive process model for governing and managing IT risk"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The ISACA Risk IT Framework provides a set of guiding principles and supporting practices for enterprise management, combined to deliver a comprehensive process model for governing and managing IT risk"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/ISACA-RISK-IT,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISACA-RISK-IT"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISAMM
  "Information Security Assessment and Monitoring Method (ISAMM) is a quantitative type of risk management methodology that can be applied by various organisations such as governmental agencies, large companies and small and medium size enterprises"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information Security Assessment and Monitoring Method (ISAMM) is a quantitative type of risk management methodology that can be applied by various organisations such as governmental agencies, large companies and small and medium size enterprises"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/ISAMM,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISAMM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISO-IEC-27005-2018
  "ISO/IEC 27005:2018 ‘Information technology — Security techniques — Information security risk management’ is a risk management framework applicable to all types of organisations (e.g. commercial enterprises, government agencies, non-profit organisations) which intend to manage risks that could compromise the organisation’s information security"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ISO/IEC 27005:2018 ‘Information technology — Security techniques — Information security risk management’ is a risk management framework applicable to all types of organisations (e.g. commercial enterprises, government agencies, non-profit organisations) which intend to manage risks that could compromise the organisation’s information security"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/ISO-IEC-27005-2018,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISO/IEC 27005:2018"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ISRAM
  "ISRAM is a quantitative, paper-based risk analysis method that is designed to allow effective participation of managers and staff in the process"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "ISRAM is a quantitative, paper-based risk analysis method that is designed to allow effective participation of managers and staff in the process"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/ISRAM,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISRAM"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IT-Grundschutz
  "IT-Grundschutz has been developed by the Federal Office for Information Security in Germany. IT-Grundschutz provides a configuration for the establishment of an integrated and effective IT security managemen"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "IT-Grundschutz has been developed by the Federal Office for Information Security in Germany. IT-Grundschutz provides a configuration for the establishment of an integrated and effective IT security managemen"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/IT-Grundschutz,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IT-Grundschutz"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityDispute
  ""
  {:dcterms/created     #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/IdentityDispute,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Identity Dispute"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IdentityFraud
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/IdentityFraud,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Fraud"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityTheft
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/IdentityTheft,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Theft"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IllegalProcessingData
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/IllegalProcessingData,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Illegal Processing of Data"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ImpactOnDataSubject
  ""
  {:dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     ["Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/ImpactOnDataSubject,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Impact on Data Subject"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ImpacttoRights
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ImpacttoRights,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Impact to Rights"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IncreaseInternalCost
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/IncreaseInternalCost,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Increase Internal Cost"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IndustrialCrisis
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/IndustrialCrisis,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Industrial Crisis"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def InfluenceDiagrams
  "An extended version of Bayesian networks that includes variables representing uncertainties, consequences and actions"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An extended version of Bayesian networks that includes variables representing uncertainties, consequences and actions"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/InfluenceDiagrams,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Influence Diagrams"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Injury
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Injury,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Injury"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def InterceptionCommunications
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/InterceptionCommunications,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Interception of Communications"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def InternalOperationDisruption
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/InternalOperationDisruption,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Internal Operation Disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Interviews
  "Structured or semi- structured one-to-one conversations to elicit views."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Structured or semi- structured one-to-one conversations to elicit views."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Interviews,
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interviews"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def KnownVulnerabilityExploited
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/KnownVulnerabilityExploited,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Known Vulnerability Exploited"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LOPA
  "Analyses the risk reduction that can be achieved by various layers of protection."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses the risk reduction that can be achieved by various layers of protection."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/LOPA,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Layer Protection Analysis (LOPA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LawEnforcementAdverseEffects
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LawEnforcementAdverseEffects,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Law Enforcement Adverse Effects"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LimitationOfRights
  ""
  {:dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/LimitationOfRights,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Limitation of Rights"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossAssets
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossAssets,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Assets"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCompetitiveAdvantage
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossCompetitiveAdvantage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Competitive Advantage"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossControlOverData
  ""
  {:dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/LossControlOverData,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Control over Data"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCredibility
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossCredibility,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Credibility"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCustomerConfidence
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossCustomerConfidence,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Customer Confidence"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossCustomers
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossCustomers,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Customers"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossData
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/LossData,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loss of Data"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LossFunds
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossFunds,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Funds"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossGoods
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossGoods,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Goods"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossGoodwill
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossGoodwill,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Goodwill"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossNegotiatingCapacity
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossNegotiatingCapacity,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Negotiating Capacity"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossOpportunity
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossOpportunity,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Opportunity"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossProprietaryInformation
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossProprietaryInformation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Proprietary Information"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossReputation
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossReputation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Reputation"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossResources
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/LossResources,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loss of Resources"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LossSuppliers
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossSuppliers,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Suppliers"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossTechnologicalAdvantage
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossTechnologicalAdvantage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Technological Advantage"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LossTrust
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/LossTrust,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Loss of Trust"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LowLikelihood
  "Level where Likelihood is Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Low"},
   :rdf/about :dpvo-risk/LowLikelihood,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7LikelihoodLevels|
              :dpvo/Likelihood
              :dpvo-risk/|5LikelihoodLevels|
              :dpvo-risk/|3LikelihoodLevels|],
   :rdf/value 0.25M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LowRisk
  "Level where Risk is Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Low"},
   :rdf/about :dpvo-risk/LowRisk,
   :rdf/type [:dpvo-risk/|3RiskLevels|
              :dpvo-risk/|5RiskLevels|
              :dpvo/RiskLevel
              :owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|],
   :rdf/value 0.25M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LowSeverity
  "Level where Severity is Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Low"},
   :rdf/about :dpvo-risk/LowSeverity,
   :rdf/type [:dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :dpvo/Severity
              :owl/NamedIndividual],
   :rdf/value 0.25M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.25 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MAGERIT
  "Method for the Harmonised Analysis of Risk (MAGERIT) is an open methodology for risk analysis and management developed by the Spanish Higher Council for Electronic Government and offered as a framework and guide to the public administration"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Method for the Harmonised Analysis of Risk (MAGERIT) is an open methodology for risk analysis and management developed by the Spanish Higher Council for Electronic Government and offered as a framework and guide to the public administration"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/MAGERIT,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MAGERIT"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MCA
  "Compares options in a way that makes trade-offs explicit. Provides an alternative to cost/benefit analysis that does not need a monetary value to be allocated to all inputs."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Compares options in a way that makes trade-offs explicit. Provides an alternative to cost/benefit analysis that does not need a monetary value to be allocated to all inputs."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/MCA,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Multi-criteria Analysis (MCA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MEHARI
  "MEHARI is a free of charge qualitative risk analysis and management method developed by CLUSIF (Club for the Security of Information in France/Club de la Sécurité de l'Information Français)"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "MEHARI is a free of charge qualitative risk analysis and management method developed by CLUSIF (Club for the Security of Information in France/Club de la Sécurité de l'Information Français)"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/MEHARI,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MEHARI"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MONARC
  "MONARC (Méthode Optimisée d’analyse des risques CASES – ‘Method for an Optimised Analysis of Risks by CASES’ is a tool and a method allowing precise and repeatable risk assessments to take place"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "MONARC (Méthode Optimisée d’analyse des risques CASES – ‘Method for an Optimised Analysis of Risks by CASES’ is a tool and a method allowing precise and repeatable risk assessments to take place"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/MONARC,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MONARC"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaliciousCodeAttack
  "Intentional use of software by including or inserting in a system for a harmful purpose"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Intentional use of software by including or inserting in a system for a harmful purpose"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/MaliciousCodeAttack,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Malicious Code Attack"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MalwareAttack
  "Malware is software or firmware intended to perform an unauthorised process that will have an adverse impact on the confidentiality, integrity, or availability of a system"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Malware is software or firmware intended to perform an unauthorised process that will have an adverse impact on the confidentiality, integrity, or availability of a system"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/MalwareAttack,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Malware Attack"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MarkovAnalysis
  "Calculates the probability that a system that has the capacity to be in one of a number of states will be in a particular state at a time t in the future."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Calculates the probability that a system that has the capacity to be in one of a number of states will be in a particular state at a time t in the future."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/MarkovAnalysis,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Markov Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MisinformationDisinformation
  "Information that is untrue, misleading, or false and used intentionally (disinformation) or unintentionally (misinformation)"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information that is untrue, misleading, or false and used intentionally (disinformation) or unintentionally (misinformation)"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-2021",
   :rdf/about :dpvo-risk/MisinformationDisinformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MisinformationDisinformation"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MisuseBreachedInformation
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/MisuseBreachedInformation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Misuse of Breached Information"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ModerateLikelihood
  "Level where Likelihood is Moderate"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Moderate"},
   :rdf/about :dpvo-risk/ModerateLikelihood,
   :rdf/type [:dpvo-risk/|5LikelihoodLevels|
              :dpvo/Likelihood
              :dpvo-risk/|3LikelihoodLevels|
              :dpvo-risk/|7LikelihoodLevels|
              :owl/NamedIndividual],
   :rdf/value 0.5M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ModerateRisk
  "Level where Risk is Moderate"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Moderate"},
   :rdf/about :dpvo-risk/ModerateRisk,
   :rdf/type [:dpvo-risk/|3RiskLevels|
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :owl/NamedIndividual
              :dpvo-risk/|5RiskLevels|],
   :rdf/value 0.5M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ModerateSeverity
  "Level where Severity is Moderate"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Moderate"},
   :rdf/about :dpvo-risk/ModerateSeverity,
   :rdf/type [:dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|3SeverityLevels|
              :dpvo-risk/|7SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value 0.5M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.5 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MonitorConsequence
  "Risk Control that monitors a Risk Consequence"
  {:dcterms/created     #inst "2022-09-03T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that monitors a Risk Consequence"},
   :rdf/about           :dpvo-risk/MonitorConsequence,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Consequence"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorImpact
  "Risk Control that monitors a Risk Impact"
  {:dcterms/created     #inst "2022-09-04T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Risk Control that monitors a Risk Impact"},
   :rdf/about           :dpvo-risk/MonitorImpact,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Impact"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorRisk
  "Risk Control that monitors a Risk"
  {:dcterms/created     #inst "2022-08-31T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Risk Control that monitors a Risk"},
   :rdf/about           :dpvo-risk/MonitorRisk,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Risk"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorRiskControl
  "Risk Control that monitors another Risk Control"
  {:dcterms/created     #inst "2022-09-05T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that monitors another Risk Control"},
   :rdf/about           :dpvo-risk/MonitorRiskControl,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Risk Control"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorRiskSource
  "Risk Control that monitors a Risk Source"
  {:dcterms/created     #inst "2022-09-01T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Risk Control that monitors a Risk Source"},
   :rdf/about           :dpvo-risk/MonitorRiskSource,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Risk Source"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonitorVulnerabilities
  "Risk Control that monitors a Risk Vulnerability"
  {:dcterms/created     #inst "2022-09-02T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that monitors a Risk Vulnerability"},
   :rdf/about           :dpvo-risk/MonitorVulnerabilities,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Monitor Vulnerabilities"},
   :rdfs/subClassOf     :dpvo-risk/ControlMonitors,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MonteCarloSimulation
  "Calculates the probability of outcomes by running multiple simulations using random variables."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Calculates the probability of outcomes by running multiple simulations using random variables."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/MonteCarloSimulation,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Monte Carlo Simulation"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-30
  "NIST 800-30 is a free guide that provides a foundation for the development of an effective risk management programme, containing both the definitions and the practical guidance necessary for assessing and mitigating risks identified within IT systems"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "NIST 800-30 is a free guide that provides a foundation for the development of an effective risk management programme, containing both the definitions and the practical guidance necessary for assessing and mitigating risks identified within IT systems"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/NIST-SP-800-30,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800-30"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-37
  "NIST SP 800-37 Rev. 2 is an asset-based RMF which comprises 7 steps, namely Prepare, Categorise, Select, Implement, Assess, Authorise and Monitor. It does not adopt a specific risk assessment methodology, although the NIST 800-30 guide is extensively referenced"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "NIST SP 800-37 Rev. 2 is an asset-based RMF which comprises 7 steps, namely Prepare, Categorise, Select, Implement, Assess, Authorise and Monitor. It does not adopt a specific risk assessment methodology, although the NIST 800-30 guide is extensively referenced"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/NIST-SP-800-37,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800-37"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-39
  "The purpose of NIST SP 800-39 is to provide a structured, yet flexible approach for an integrated, enterprise-wide programme for managing the risk to information security of organisational operations (i.e. mission, functions, image, and reputation) and assets, individuals, other organisations etc. on an ongoing basis"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The purpose of NIST SP 800-39 is to provide a structured, yet flexible approach for an integrated, enterprise-wide programme for managing the risk to information security of organisational operations (i.e. mission, functions, image, and reputation) and assets, individuals, other organisations etc. on an ongoing basis"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/NIST-SP-800-39,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800–39"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NIST-SP-800-82
  "NIST SP 800-82 Rev. 2 (Stouffer, et al., 2015), entitled ‘Guide to industrial control systems (ISC) security’, is an Industrial Control Systems Security Guide"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "NIST SP 800-82 Rev. 2 (Stouffer, et al., 2015), entitled ‘Guide to industrial control systems (ISC) security’, is an Industrial Control Systems Security Guide"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/NIST-SP-800-82,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NIST SP 800–82"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def NominalGroupTechnique
  "Technique for eliciting views from a group of people where initial participation is as individuals with no interaction, then group discussion of ideas follows."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technique for eliciting views from a group of people where initial participation is as individuals with no interaction, then group discussion of ideas follows."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/NominalGroupTechnique,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nominal Group Technique"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def O-RA
  "The Open Group Standard for Risk Analysis (O-RA) provides a set of standards for various aspects of information security risk analysis that is based on the Open FAIR framework and can be applied to any risk scenario"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Open Group Standard for Risk Analysis (O-RA) provides a set of standards for various aspects of information security risk analysis that is based on the Open FAIR framework and can be applied to any risk scenario"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/O-RA,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "O-RA"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE
  "Operationally Critical Threat, Asset, and Vulnerability Evaluation (OCTAVE) is a free of charge approach to evaluations of information security risk that is comprehensive, systematic, context-driven, and self-directed"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Operationally Critical Threat, Asset, and Vulnerability Evaluation (OCTAVE) is a free of charge approach to evaluations of information security risk that is comprehensive, systematic, context-driven, and self-directed"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/risk-management-standards",
   :rdf/about :dpvo-risk/OCTAVE,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE-ALLEGRO
  "OCTAVE Allegro is designed to allow broad assessment of an organisation’s operational risk environment, with the goal of producing robust results without the need for extensive knowledge of risk assessment"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "OCTAVE Allegro is designed to allow broad assessment of an organisation’s operational risk environment, with the goal of producing robust results without the need for extensive knowledge of risk assessment"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/OCTAVE-ALLEGRO,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskManagementMethodology],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE ALLEGRO"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE-FORTE
  "The OCTAVE FORTE process model was developed to support organisations in evaluating their security risks. It applies Enterprise Risk Management (ERM) principles to bridge the gap between executives and practitioners acting as decision makers"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The OCTAVE FORTE process model was developed to support organisations in evaluating their security risks. It applies Enterprise Risk Management (ERM) principles to bridge the gap between executives and practitioners acting as decision makers"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/OCTAVE-FORTE,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE FORTE"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OCTAVE-S
  "The OCTAVE-S is based on the OCTAVE approach and is a self-directed approach, meaning that people from an organisation assume responsibility for setting the organisation’s security strategy"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The OCTAVE-S is based on the OCTAVE approach and is a self-directed approach, meaning that people from an organisation assume responsibility for setting the organisation’s security strategy"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/OCTAVE-S,
   :rdf/type [:dpvo-risk/RiskManagementMethodology :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OCTAVE-S"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OrganisationDisruption
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/OrganisationDisruption,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Organisation Disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PIA
  "Analyses how incidents and events could affect a person's privacy and identifies and quantifies the capabilities that would be needed to manage it."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Analyses how incidents and events could affect a person's privacy and identifies and quantifies the capabilities that would be needed to manage it."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/PIA,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Impact Analysis (PIA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ParetoCharts
  "The Pareto principle (the 80–20 rule) states that, for many events, roughly 80 % of the effects come from 20 % of the causes."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Pareto principle (the 80–20 rule) states that, for many events, roughly 80 % of the effects come from 20 % of the causes."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/ParetoCharts,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pareto Charts"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalSafetyEndangerment
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/PersonalSafetyEndangerment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Personal Safety Endangerment"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PersonnelAbsence
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/PersonnelAbsence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personnel Absence"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhishingScam
  "A type of social engineering attack involving deceptive messages intended to reveal sensitive information"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A type of social engineering attack involving deceptive messages intended to reveal sensitive information"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks",
   :rdf/about :dpvo-risk/PhishingScam,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Phishing Scam"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalAssault
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/PhysicalAssault,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Physical Assault"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PhysicalSpying
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/PhysicalSpying,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Physical Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PhysicalStalking
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/PhysicalStalking,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Physical Stalking"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PreventExercisingOfRights
  ""
  {:dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/PreventExercisingOfRights,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Prevent Exercising of Rights"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PrivacyImpact
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/PrivacyImpact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PsychologicalHarm
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/PsychologicalHarm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Psychological Harm"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicOrderBreach
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/PublicOrderBreach,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Public Order Breach"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def QualitativeRiskAssessmentTechnique
  "A risk assessment technique that uses qualitative methods"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A risk assessment technique that uses qualitative methods"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/QualitativeRiskAssessmentTechnique,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Qualitative Risk Assessment Technique"},
   :rdfs/subClassOf :dpvo-risk/RiskAssessmentTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def QuantitativeRiskAssessmentTechnique
  "A risk assessment technique that uses quantitative methods"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A risk assessment technique that uses quantitative methods"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/QuantitativeRiskAssessmentTechnique,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quantitative Risk Assessment Technique"},
   :rdfs/subClassOf :dpvo-risk/RiskAssessmentTechnique,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S1L1
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM3x3S1L1,
   :rdf/type [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual],
   :rdf/value 0.11M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM3x3 S:1 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S1L2
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM3x3S1L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3],
   :rdf/value 0.22M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM3x3 S:1 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S1L3
  "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM3x3S1L3,
   :rdf/type [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual],
   :rdf/value 0.33M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM3x3 S:1 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S2L1
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM3x3S2L1,
   :rdf/type [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual],
   :rdf/value 0.22M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM3x3 S:2 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S2L2
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM3x3S2L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3],
   :rdf/value 0.44M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM3x3 S:2 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S2L3
  "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM3x3S2L3,
   :rdf/type [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual],
   :rdf/value 0.67M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM3x3 S:2 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S3L1
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM3x3S3L1,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3],
   :rdf/value 0.33M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM3x3 S:3 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S3L2
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM3x3S3L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix3x3],
   :rdf/value 0.67M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM3x3 S:3 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM3x3S3L3
  "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 3x3 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM3x3S3L3,
   :rdf/type [:dpvo-risk/RiskMatrix3x3 :owl/NamedIndividual],
   :rdf/value 1,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM3x3 S:3 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L1
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM5x5S1L1,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.04M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:1 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L2
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM5x5S1L2,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:1 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L3
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM5x5S1L3,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:1 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L4
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM5x5S1L4,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:1 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S1L5
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM5x5S1L5,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:1 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L1
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM5x5S2L1,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:2 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L2
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM5x5S2L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:2 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L3
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM5x5S2L3,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:2 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L4
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM5x5S2L4,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.32M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:2 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S2L5
  "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM5x5S2L5,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.4M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:2 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L1
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM5x5S3L1,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM5x5 S:3 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L2
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM5x5S3L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:3 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L3
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM5x5S3L3,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.36M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:3 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L4
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM5x5S3L4,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.48M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:3 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S3L5
  "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM5x5S3L5,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.6M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:3 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L1
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM5x5S4L1,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:4 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L2
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM5x5S4L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.32M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM5x5 S:4 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L3
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM5x5S4L3,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.48M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:4 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L4
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM5x5S4L4,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.64M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:4 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S4L5
  "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM5x5S4L5,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.8M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:4 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L1
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM5x5S5L1,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM5x5 S:5 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L2
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM5x5S5L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 0.4M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:5 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L3
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM5x5S5L3,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.6M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM5x5 S:5 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L4
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM5x5S5L4,
   :rdf/type [:dpvo-risk/RiskMatrix5x5 :owl/NamedIndividual],
   :rdf/value 0.8M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:5 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM5x5S5L5
  "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 5x5 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM5x5S5L5,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix5x5],
   :rdf/value 1,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM5x5 S:5 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L1
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S1L1,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.02M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:1 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L2
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S1L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.04M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:1 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L3
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Low; and Risk Level: ExtremelyLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Low; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S1L3,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.06M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:1 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L4
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Moderate; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: Moderate; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S1L4,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:1 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L5
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: High; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: High; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S1L5,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.1M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:1 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L6
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryHigh; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: VeryHigh; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S1L6,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:1 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S1L7
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyHigh; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyLow; Likelihood: ExtremelyHigh; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S1L7,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.14M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:1 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L1
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S2L1,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.04M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:2 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L2
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S2L2,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:2 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L3
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Low; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S2L3,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:2 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L4
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: Moderate; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S2L4,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:2 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L5
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: High; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S2L5,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:2 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L6
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: VeryHigh; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S2L6,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:2 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S2L7
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyHigh; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryLow; Likelihood: ExtremelyHigh; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryLowSeverity,
   :rdf/about :dpvo-risk/RM7x7S2L7,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.29M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:2 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L1
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM7x7S3L1,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.06M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:3 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L2
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM7x7S3L2,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:3 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L3
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Low; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM7x7S3L3,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.18M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:3 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L4
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: Moderate; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM7x7S3L4,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:3 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L5
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM7x7S3L5,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.31M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:3 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L6
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: VeryHigh; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM7x7S3L6,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.37M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:3 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S3L7
  "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Low; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/LowSeverity,
   :rdf/about :dpvo-risk/RM7x7S3L7,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.43M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:3 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L1
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyLow; and Risk Level: ExtremelyLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyLowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM7x7S4L1,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.08M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely Low Risk (RM7x7 S:4 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L2
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM7x7S4L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.16M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:4 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L3
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM7x7S4L3,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:4 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L4
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM7x7S4L4,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.33M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:4 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L5
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: High; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM7x7S4L5,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.41M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:4 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L6
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: VeryHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM7x7S4L6,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.49M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:4 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S4L7
  "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: Moderate; Likelihood: ExtremelyHigh; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ModerateSeverity,
   :rdf/about :dpvo-risk/RM7x7S4L7,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.57M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:4 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L1
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyLow; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM7x7S5L1,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.1M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:5 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L2
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM7x7S5L2,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.2M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:5 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L3
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Low; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM7x7S5L3,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.31M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:5 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L4
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: Moderate; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM7x7S5L4,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.41M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:5 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L5
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM7x7S5L5,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.51M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:5 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L6
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM7x7S5L6,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.61M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:5 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S5L7
  "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: High; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/HighSeverity,
   :rdf/about :dpvo-risk/RM7x7S5L7,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.71M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:5 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L1
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyLow; and Risk Level: VeryLow"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyLow; and Risk Level: VeryLow"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryLowRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S6L1,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.12M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk (RM7x7 S:6 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L2
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryLow; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S6L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.24M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:6 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L3
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Low; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S6L3,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.37M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:6 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L4
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: Moderate; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S6L4,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.49M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:6 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L5
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: High; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S6L5,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.61M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:6 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L6
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S6L6,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.73M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:6 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S6L7
  "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: VeryHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/VeryHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S6L7,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.86M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:6 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L1
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyLow; and Risk Level: Low"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyLow; and Risk Level: Low"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/LowRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S7L1,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.14M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Low Risk (RM7x7 S:7 L:1)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L2
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryLow; and Risk Level: Moderate"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryLow; and Risk Level: Moderate"},
   :dpvo/hasLikelihood :dpvo-risk/VeryLowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ModerateRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S7L2,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.29M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moderate Risk (RM7x7 S:7 L:2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L3
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Low; and Risk Level: High"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Low; and Risk Level: High"},
   :dpvo/hasLikelihood :dpvo-risk/LowLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/HighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S7L3,
   :rdf/type [:dpvo-risk/RiskMatrix7x7 :owl/NamedIndividual],
   :rdf/value 0.43M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "High Risk (RM7x7 S:7 L:3)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L4
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Moderate; and Risk Level: VeryHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: Moderate; and Risk Level: VeryHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ModerateLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/VeryHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S7L4,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.57M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk (RM7x7 S:7 L:4)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L5
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: High; and Risk Level: ExtremelyHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: High; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/HighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S7L5,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.71M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:7 L:5)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L6
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: VeryHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/VeryHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S7L6,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 0.86M,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:7 L:6)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RM7x7S7L7
  "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Node in a 7x7 Risk Matrix with Risk Severity: ExtremelyHigh; Likelihood: ExtremelyHigh; and Risk Level: ExtremelyHigh"},
   :dpvo/hasLikelihood :dpvo-risk/ExtremelyHighLikelihood,
   :dpvo/hasRiskLevel :dpvo-risk/ExtremelyHighRisk,
   :dpvo/hasSeverity :dpvo-risk/ExtremelyHighSeverity,
   :rdf/about :dpvo-risk/RM7x7S7L7,
   :rdf/type [:owl/NamedIndividual :dpvo-risk/RiskMatrix7x7],
   :rdf/value 1,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extremely High Risk (RM7x7 S:7 L:7)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RansomwareAttack
  "Ransomware is a type of attack where threat actors take control of a target’s assets and demand a ransom in exchange for the return of the asset’s availability and confidentiality"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Ransomware is a type of attack where threat actors take control of a target’s assets and demand a ransom in exchange for the return of the asset’s availability and confidentiality"},
   :dcterms/source
   ["https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks"
    "https://www.iso.org/standard/75281.html"],
   :rdf/about :dpvo-risk/RansomwareAttack,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RansomwareAttack"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReduceLikelihood
  "Risk Control that reduces the likelihood of an event"
  {:dcterms/created #inst "2022-08-22T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Risk Control that reduces the likelihood of an event"},
   :rdf/about :dpvo-risk/ReduceLikelihood,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reduce Likelihood"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReduceSeverity
  "Risk Control that reduces the severity of an event"
  {:dcterms/created     #inst "2022-08-23T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that reduces the severity of an event"},
   :rdf/about           :dpvo-risk/ReduceSeverity,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Reduce Severity"},
   :rdfs/subClassOf     :dpvo/RiskMitigationMeasure,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ReliabilityCentredMaintenance
  "A risk based assessment used to identify the appropriate maintenance tasks for a system and its components."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A risk based assessment used to identify the appropriate maintenance tasks for a system and its components."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/ReliabilityCentredMaintenance,
   :rdf/type [:dpvo-risk/QualitativeRiskAssessmentTechnique
              :owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reliability Centred Maintenance"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoteSpying
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/RemoteSpying,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Remote Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RemoveConsequence
  "Risk Control that removes Consequence i.e. prevents it from materialising"
  {:dcterms/created #inst "2022-08-27T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Control that removes Consequence i.e. prevents it from materialising"},
   :rdf/about :dpvo-risk/RemoveConsequence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Remove Consequence"},
   :rdfs/subClassOf :dpvo-risk/ControlConsequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoveImpact
  "Risk Control that removes Impact i.e. prevents it from materialising"
  {:dcterms/created #inst "2022-08-28T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Control that removes Impact i.e. prevents it from materialising"},
   :rdf/about :dpvo-risk/RemoveImpact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Remove Impact"},
   :rdfs/subClassOf :dpvo-risk/ControlConsequence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RemoveSource
  "Risk Control that removes the risk source"
  {:dcterms/created     #inst "2022-08-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Risk Control that removes the risk source"},
   :rdf/about           :dpvo-risk/RemoveSource,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Remove Source"},
   :rdfs/subClassOf     :dpvo-risk/ControlRiskSource,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ReplacementCosts
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ReplacementCosts,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Replacement Costs"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ReputationTrustImpact
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/ReputationTrustImpact,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reputation and trust impact"},
   :rdfs/subClassOf :dpvo/Impact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RetrievalDeletedData
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/RetrievalDeletedData,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Retrieval of Deleted Data"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RetrievalDiscardedEquipment
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/RetrievalDiscardedEquipment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Retrieval of Discarded Equipment"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def RiskAssessmentTechnique
  "A technique or method used to analyse and identify risk levels, sources, likelihoods, severities, and other necessary information required to conduct risk management procedures"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A technique or method used to analyse and identify risk levels, sources, likelihoods, severities, and other necessary information required to conduct risk management procedures"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/RiskAssessmentTechnique,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Assessment Technique"},
   :rdfs/subClassOf :dpvo/RiskManagementProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskIndices
  "Rates the significance of risks based on ratings applied to factors which are believed to influence the magnitude of the risk."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Rates the significance of risks based on ratings applied to factors which are believed to influence the magnitude of the risk."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/RiskIndices,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Indices"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskManagementMethodology
  "A risk management framework or methodology addresses the main functional components related to identification, assessment, treatment, and monitoring regarding risks"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A risk management framework or methodology addresses the main functional components related to identification, assessment, treatment, and monitoring regarding risks"},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/compendium-of-risk-management-frameworks",
   :rdf/about :dpvo-risk/RiskManagementMethodology,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Management Methodology"},
   :rdfs/subClassOf :dpvo/RiskManagementProcedure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix
  "Compares individual risks by selecting a consequence/ likelihood pair and displaying them on a matrix with consequence on one axis and likelihood on the other."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Compares individual risks by selecting a consequence/ likelihood pair and displaying them on a matrix with consequence on one axis and likelihood on the other."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/RiskMatrix,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix3x3
  "A Risk Matrix with 3 Likelihood, 3 Severity, and 3 Risk Level types"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Risk Matrix with 3 Likelihood, 3 Severity, and 3 Risk Level types"},
   :rdf/about :dpvo-risk/RiskMatrix3x3,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix 3x3"},
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix5x5
  "A Risk Matrix with 5 Likelihood, 5 Severity, and 5 Risk Level types"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Risk Matrix with 5 Likelihood, 5 Severity, and 5 Risk Level types"},
   :rdf/about :dpvo-risk/RiskMatrix5x5,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix 5x5"},
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskMatrix7x7
  "A Risk Matrix with 7 Likelihood, 7 Severity, and 7 Risk Level types"
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Risk Matrix with 7 Likelihood, 7 Severity, and 7 Risk Level types"},
   :rdf/about :dpvo-risk/RiskMatrix7x7,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Matrix 7x7"},
   :rdfs/subClassOf :dpvo-risk/RiskMatrix,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RiskRegisters
  "A means of recording information about risks and tracking actions."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A means of recording information about risks and tracking actions."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/RiskRegisters,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Risk Registers"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SCurves
  "A means of displaying the relationship between consequences and their likelihood plotted as a cumulative distribution function (S-curve)."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A means of displaying the relationship between consequences and their likelihood plotted as a cumulative distribution function (S-curve)."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/SCurves,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "S-curves"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SFAIRP
  "So far as is Resonably Practiceable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "So far as is Resonably Practiceable (ALARP) - A criteria for deciding significance of risk and means of evaluating tolerability of risk"},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/SFAIRP,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SFAIRP"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SWIFT
  "A simpler form of HAZOP with prompts of \"what if\" to identify deviations from the expected."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A simpler form of HAZOP with prompts of \"what if\" to identify deviations from the expected."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/SWIFT,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Structured \"What If?\" (SWIFT)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sabotage
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/Sabotage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sabotage"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Scam
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Scam,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Scam"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ScenarioAnalysis
  "Identifies possible future scenarios through imagination, extrapolation from the present or modelling. Risk is then considered for each of these scenarios."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Identifies possible future scenarios through imagination, extrapolation from the present or modelling. Risk is then considered for each of these scenarios."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/ScenarioAnalysis,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scenario Analysis"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecurityBreach
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/SecurityBreach,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Security Breach"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ServiceInterruption
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ServiceInterruption,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Service Interruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SexualViolence
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/SexualViolence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual Violence"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ShareRisk
  "Risk Mitigation Measure that shares Risk e.g. amongst stakeholders"
  {:dcterms/created #inst "2022-08-29T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Risk Mitigation Measure that shares Risk e.g. amongst stakeholders"},
   :rdf/about :dpvo-risk/ShareRisk,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Share Risk"},
   :rdfs/subClassOf :dpvo/RiskMitigationMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialDisadvantage
  ""
  {:dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/SocialDisadvantage,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Social Disadvantage"},
   :rdfs/subClassOf     :dpvo/Impact,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Spam
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/Spam,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Spam"},
   :rdfs/subClassOf :dpvo/Harm,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Spoofing
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Spoofing,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Spoofing"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Spying
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Spying,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Spying"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Stalking
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Stalking,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Stalking"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Surveys
  "Paper- or computer-based questionnaires to elicit views."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Paper- or computer-based questionnaires to elicit views."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Surveys,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Surveys"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystemFailure
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/enisa-threat-landscape-for-ransomware-attacks",
   :rdf/about :dpvo-risk/SystemFailure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Failure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystemIntrusion
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/SystemIntrusion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Intrusion"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystemMalfunction
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/SystemMalfunction,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "System Malfunction"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Taxonomies
  "A taxonomy based on experience or on concepts and models that can be used to help identify risks or controls."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A taxonomy based on experience or on concepts and models that can be used to help identify risks or controls."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Taxonomies,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QualitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Taxonomies"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Terrorism
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Terrorism,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Terrorism"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Theft
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/Theft,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Theft"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TheftEquipment
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/TheftEquipment,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Theft of Equipment"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TheftMedia
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/TheftMedia,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Theft of Media"},
   :rdfs/subClassOf     :dpvo/MaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ThirdPartyOperationDisruption
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ThirdPartyOperationDisruption,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Third Party Operation Disruption"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Toxicological
  "A series of steps taken to obtain a measure for the risk to humans or ecological systems due to exposure to chemicals."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A series of steps taken to obtain a measure for the risk to humans or ecological systems due to exposure to chemicals."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/Toxicological,
   :rdf/type [:dpvo-risk/QuantitativeRiskAssessmentTechnique
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Toxicological Risk Assessment"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedAccesstoPremises
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/UnauthorisedAccesstoPremises,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Access to Premises"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedCodeAccess
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/UnauthorisedCodeAccess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Code Access"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedCodeDisclosure
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/UnauthorisedCodeDisclosure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Code Disclosure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedCodeModification
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/UnauthorisedCodeModification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Code Modification"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedDataAccess
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/UnauthorisedDataAccess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Data Access"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedDataDisclosure
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/UnauthorisedDataDisclosure,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Data Disclosure"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedDataModification
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/UnauthorisedDataModification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Data Modification"},
   :rdfs/subClassOf :dpvo/NonMaterialDamage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedImpersonation
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/UnauthorisedImpersonation,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Impersonation"},
   :rdfs/subClassOf     :dpvo/NonMaterialDamage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedInformationDisclosure
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/UnauthorisedInformationDisclosure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised Information Disclosure"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnauthorisedReIdentification
  ""
  {:dcterms/created     #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/UnauthorisedReIdentification,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Re-Identification"},
   :rdfs/subClassOf     :dpvo/Consequence,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedResourceUse
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/UnauthorisedResourceUse,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised Resource Use"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedSystemAccess
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/UnauthorisedSystemAccess,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unauthorised System Access"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnauthorisedSystemModification
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/UnauthorisedSystemModification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unauthorised System Modification"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnknownVulnerabilityExploited
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/UnknownVulnerabilityExploited,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unknown Vulnerability Exploited"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnwantedCodeDeletion
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/methodology-for-a-sectoral-cybersecurity-assessment",
   :rdf/about :dpvo-risk/UnwantedCodeDeletion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unwanted Code Deletion"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UnwantedDataDeletion
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/UnwantedDataDeletion,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unwanted Data Deletion"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UnwantedDisclosureData
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/UnwantedDisclosureData,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Unwanted Disclosure of Data"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VaR
  "Financial measure of risk that uses an assumed probability distribution of losses in a stable market condition to calculate the value of a loss that might occur with a specified probability within a defined time span."
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Financial measure of risk that uses an assumed probability distribution of losses in a stable market condition to calculate the value of a loss that might occur with a specified probability within a defined time span."},
   :dcterms/source "https://www.iso.org/standard/72140.html",
   :rdf/about :dpvo-risk/VaR,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/QuantitativeRiskAssessmentTechnique],
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Value At Risk (VaR)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Vandalism
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/topics/threat-risk-management/threats-and-trends/enisa-threat-landscape/threat-taxonomy/view",
   :rdf/about :dpvo-risk/Vandalism,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vandalism"},
   :rdfs/subClassOf :dpvo/Damage,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryHighLikelihood
  "Level where Likelihood is Very High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Very High"},
   :rdf/about :dpvo-risk/VeryHighLikelihood,
   :rdf/type [:dpvo-risk/|7LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :owl/NamedIndividual
              :dpvo/Likelihood],
   :rdf/value 0.9M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryHighRisk
  "Level where Risk is Very High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Very High"},
   :rdf/about :dpvo-risk/VeryHighRisk,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|],
   :rdf/value 0.9M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryHighSeverity
  "Level where Severity is Very High"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Very High"},
   :rdf/about :dpvo-risk/VeryHighSeverity,
   :rdf/type [:dpvo-risk/|7SeverityLevels|
              :dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :owl/NamedIndividual],
   :rdf/value 0.9M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.9 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very High Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryLowLikelihood
  "Level where Likelihood is Very Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Likelihood is Very Low"},
   :rdf/about :dpvo-risk/VeryLowLikelihood,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7LikelihoodLevels|
              :dpvo-risk/|5LikelihoodLevels|
              :dpvo/Likelihood],
   :rdf/value 0.1M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Likelihood"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryLowRisk
  "Level where Risk is Very Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Risk is Very Low"},
   :rdf/about :dpvo-risk/VeryLowRisk,
   :rdf/type [:owl/NamedIndividual
              :dpvo-risk/|7RiskLevels|
              :dpvo/RiskLevel
              :dpvo-risk/|5RiskLevels|],
   :rdf/value 0.1M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VeryLowSeverity
  "Level where Severity is Very Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Level where Severity is Very Low"},
   :rdf/about :dpvo-risk/VeryLowSeverity,
   :rdf/type [:owl/NamedIndividual
              :dpvo/Severity
              :dpvo-risk/|5SeverityLevels|
              :dpvo-risk/|7SeverityLevels|],
   :rdf/value 0.1M,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The suggested quantitative value for this concept is 0.1 on a scale of 0 to 1"},
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Very Low Severity"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ViolationCodeConduct
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ViolationCodeConduct,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Code of Conduct"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationContractualObligations
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ViolationContractualObligations,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Contractual Obligations"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationEthicalCode
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ViolationEthicalCode,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Ethical Code"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationOfRights
  ""
  {:dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     ["Georg P Krog" "Harshvardhan J. Pandit"],
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :rdf/about           :dpvo-risk/ViolationOfRights,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Rights"},
   :rdfs/subClassOf     :dpvo/Harm,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationRegulatoryObligations
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ViolationRegulatoryObligations,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Regulatory Obligations"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ViolationStatutoryObligations
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/ViolationStatutoryObligations,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Violation of Statutory Obligations"},
   :rdfs/subClassOf     :dpvo/Damage,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VulnerabilityCreated
  ""
  {:dcterms/created     #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source      "https://www.iso.org/standard/75281.html",
   :rdf/about           :dpvo-risk/VulnerabilityCreated,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vulnerability Created"},
   :rdfs/subClassOf     :dpvo/Detriment,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VulnerabilityExploited
  ""
  {:dcterms/created #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value    ""},
   :dcterms/source
   "https://www.enisa.europa.eu/publications/reference-incident-classification-taxonomy/",
   :rdf/about :dpvo-risk/VulnerabilityExploited,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vulnerability Exploited"},
   :rdfs/subClassOf :dpvo/Detriment,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |3LikelihoodLevels|
  "Scale with 3 Likelihood Levels from High to Low"
  {:dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 3 Likelihood Levels from High to Low"},
   :rdf/about           :dpvo-risk/|3LikelihoodLevels|,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "3 Likelihood Levels"},
   :rdfs/subClassOf     :dpvo/Likelihood,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |3RiskLevels|
  "Scale with 3 Risk Levels from High to Low"
  {:dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 3 Risk Levels from High to Low"},
   :rdf/about           :dpvo-risk/|3RiskLevels|,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "3 Risk Levels"},
   :rdfs/subClassOf     :dpvo/RiskLevel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |3SeverityLevels|
  "Scale with 3 Severity Levels from High to Low"
  {:dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 3 Severity Levels from High to Low"},
   :rdf/about           :dpvo-risk/|3SeverityLevels|,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "3 Severity Levels"},
   :rdfs/subClassOf     :dpvo/Severity,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |5LikelihoodLevels|
  "Scale with 5 Likelihood Levels from Very High to Very Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Scale with 5 Likelihood Levels from Very High to Very Low"},
   :rdf/about :dpvo-risk/|5LikelihoodLevels|,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "5 Likelihood Levels"},
   :rdfs/subClassOf :dpvo/Likelihood,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |5RiskLevels|
  "Scale with 5 Risk Levels from Very High to Very Low"
  {:dcterms/created     #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Scale with 5 Risk Levels from Very High to Very Low"},
   :rdf/about           :dpvo-risk/|5RiskLevels|,
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "5 Risk Levels"},
   :rdfs/subClassOf     :dpvo/RiskLevel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def |5SeverityLevels|
  "Scale with 5 Severity Levels from Very High to Very Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Scale with 5 Severity Levels from Very High to Very Low"},
   :rdf/about :dpvo-risk/|5SeverityLevels|,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "5 Severity Levels"},
   :rdfs/subClassOf :dpvo/Severity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |7LikelihoodLevels|
  "Scale with 7 Likelihood Levels from Extremely High to Extremely Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale with 7 Likelihood Levels from Extremely High to Extremely Low"},
   :rdf/about :dpvo-risk/|7LikelihoodLevels|,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "7 Likelihood Levels"},
   :rdfs/subClassOf :dpvo/Likelihood,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |7RiskLevels|
  "Scale with 7 Risk Levels from Extremely High to Extremely Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Scale with 7 Risk Levels from Extremely High to Extremely Low"},
   :rdf/about :dpvo-risk/|7RiskLevels|,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "7 Risk Levels"},
   :rdfs/subClassOf :dpvo/RiskLevel,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def |7SeverityLevels|
  "Scale with 7 Severity Levels from Extremely High to Extremely Low"
  {:dcterms/created #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Scale with 7 Severity Levels from Extremely High to Extremely Low"},
   :rdf/about :dpvo-risk/|7SeverityLevels|,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/risk#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "7 Severity Levels"},
   :rdfs/subClassOf :dpvo/Severity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})