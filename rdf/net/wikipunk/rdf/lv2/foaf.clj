(ns net.wikipunk.rdf.lv2.foaf
  "This version of the FOAF vocabulary has been slightly trimmed for LV2."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "foaf",
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/foaf.ttl",
   :rdf/about [#:rdf{:uri "http://xmlns.com/foaf/0.1/"}],
   :dcterms/title "Friend of a Friend (FOAF) vocabulary",
   :vann/preferredNamespaceUri "http://xmlns.com/foaf/0.1/",
   :rdf/ns-prefix-map {"foaf" "http://xmlns.com/foaf/0.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "owl" "http://www.w3.org/2002/07/owl#"}}
  (:refer-clojure :exclude [name]))

(def Agent
  "An agent (eg. person, group, software or physical artifact)."
  {:owl/equivalentClass :dcterms/Agent,
   :rdfs/label "Agent",
   :rdfs/comment "An agent (eg. person, group, software or physical artifact).",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Document
  "A document."
  {:owl/disjointWith [:foaf/Project :foaf/Organization],
   :rdfs/label "Document",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "A document.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Group
  "A class of Agents."
  {:rdfs/subClassOf :foaf/Agent,
   :rdfs/label "Group",
   :rdfs/comment "A class of Agents.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Image
  "An image."
  {:rdfs/subClassOf :foaf/Document,
   :rdfs/label "Image",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "An image.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def LabelProperty
  "A foaf:LabelProperty is any RDF property with textual values that serve as labels."
  {:rdfs/label "Label Property",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment
     "A foaf:LabelProperty is any RDF property with textual values that serve as labels.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def OnlineAccount
  "An online account."
  {:rdfs/subClassOf :owl/Thing,
   :rdfs/label "Online Account",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "An online account.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def OnlineChatAccount
  "An online chat account."
  {:rdfs/subClassOf :foaf/OnlineAccount,
   :rdfs/label "Online Chat Account",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "An online chat account.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def OnlineEcommerceAccount
  "An online e-commerce account."
  {:rdfs/subClassOf :foaf/OnlineAccount,
   :rdfs/label "Online E-commerce Account",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "An online e-commerce account.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def OnlineGamingAccount
  "An online gaming account."
  {:rdfs/subClassOf :foaf/OnlineAccount,
   :rdfs/label "Online Gaming Account",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "An online gaming account.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Organization
  "An organization."
  {:owl/disjointWith [:foaf/Person :foaf/Document],
   :rdfs/subClassOf :foaf/Agent,
   :rdfs/label "Organization",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "An organization.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Person
  "A person."
  {:owl/disjointWith [:foaf/Project :foaf/Organization],
   :rdfs/subClassOf :foaf/Agent,
   :rdfs/label "Person",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "A person.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def PersonalProfileDocument
  "A personal profile RDF document."
  {:rdfs/subClassOf :foaf/Document,
   :rdfs/label "PersonalProfileDocument",
   :rdfs/comment "A personal profile RDF document.",
   :rdf/type [:owl/Class :rdfs/Class]})

(def Project
  "A project (a collective endeavour of some kind)."
  {:owl/disjointWith [:foaf/Person :foaf/Document],
   :rdfs/label "Project",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "A project (a collective endeavour of some kind).",
   :rdf/type [:owl/Class :rdfs/Class]})

(def account
  "Indicates an account held by this agent."
  {:rdfs/range :foaf/OnlineAccount,
   :rdfs/label "account",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "Indicates an account held by this agent.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def accountName
  "Indicates the name (identifier) associated with this online account."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "account name",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/OnlineAccount,
   :rdfs/comment
     "Indicates the name (identifier) associated with this online account.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def accountServiceHomepage
  "Indicates a homepage of the service provide for this online account."
  {:rdfs/range :foaf/Document,
   :rdfs/label "account service homepage",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/OnlineAccount,
   :rdfs/comment
     "Indicates a homepage of the service provide for this online account.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def age
  "The age in years of some agent."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "age",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "The age in years of some agent.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def aimChatID
  "An AIM chat ID"
  {:rdfs/subPropertyOf :foaf/nick,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "AIM chat ID",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "An AIM chat ID",
   :rdf/type [:owl/InverseFunctionalProperty :owl/DatatypeProperty
              :rdf/Property]})

(def birthday
  "The birthday of this Agent, represented in mm-dd string form, eg. '12-31'."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "birthday",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment
     "The birthday of this Agent, represented in mm-dd string form, eg. '12-31'.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def currentProject
  "A current project this person works on."
  {:rdfs/range :owl/Thing,
   :rdfs/label "current project",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "A current project this person works on.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def depiction
  "A depiction of some thing."
  {:owl/inverseOf :foaf/depicts,
   :rdfs/range :foaf/Image,
   :rdfs/label "depiction",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment "A depiction of some thing.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def depicts
  "A thing depicted in this representation."
  {:owl/inverseOf :foaf/depiction,
   :rdfs/range :owl/Thing,
   :rdfs/label "depicts",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Image,
   :rdfs/comment "A thing depicted in this representation.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def familyName
  "The family name of some person."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "familyName",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "The family name of some person.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def firstName
  "The first name of a person."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "firstName",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "The first name of a person.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def gender
  "The gender of this Agent (typically but not necessarily 'male' or 'female')."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "gender",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment
     "The gender of this Agent (typically but not necessarily 'male' or 'female').",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def givenName
  "The given name of some person."
  {:rdfs/label "Given name",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "The given name of some person.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def homepage
  "A homepage for some thing."
  {:rdfs/comment "A homepage for some thing.",
   :rdfs/range :foaf/Document,
   :rdf/type [:rdf/Property :owl/ObjectProperty :owl/InverseFunctionalProperty],
   :rdfs/subPropertyOf [:foaf/page :foaf/isPrimaryTopicOf],
   :rdfs/domain :owl/Thing,
   :rdfs/label "homepage",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"}})

(def icqChatID
  "An ICQ chat ID"
  {:rdfs/subPropertyOf :foaf/nick,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "ICQ chat ID",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "An ICQ chat ID",
   :rdf/type [:owl/InverseFunctionalProperty :owl/DatatypeProperty
              :rdf/Property]})

(def img
  "An image that can be used to represent some thing (ie. those depictions which are particularly representative of something, eg. one's photo on a homepage)."
  {:rdfs/subPropertyOf :foaf/depiction,
   :rdfs/range :foaf/Image,
   :rdfs/label "image",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment
     "An image that can be used to represent some thing (ie. those depictions which are particularly representative of something, eg. one's photo on a homepage).",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def interest
  "A page about a topic of interest to this person."
  {:rdfs/range :foaf/Document,
   :rdfs/label "interest",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "A page about a topic of interest to this person.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def isPrimaryTopicOf
  "A document that this thing is the primary topic of."
  {:rdfs/domain :owl/Thing,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/subPropertyOf :foaf/page,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "is primary topic of",
   :rdfs/comment "A document that this thing is the primary topic of.",
   :owl/inverseOf :foaf/primaryTopic,
   :rdfs/range :foaf/Document})

(def jabberID
  "A jabber ID for something."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "jabber ID",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "A jabber ID for something.",
   :rdf/type [:owl/InverseFunctionalProperty :owl/DatatypeProperty
              :rdf/Property]})

(def knows
  "A person known by this person (indicating some level of reciprocated interaction between the parties)."
  {:rdfs/range :foaf/Person,
   :rdfs/label "knows",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment
     "A person known by this person (indicating some level of reciprocated interaction between the parties).",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def lastName
  "The last name of a person."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "lastName",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "The last name of a person.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def logo
  "A logo representing some thing."
  {:rdfs/range :owl/Thing,
   :rdfs/label "logo",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment "A logo representing some thing.",
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty
              :rdf/Property]})

(def made
  "Something that was made by this agent."
  {:owl/inverseOf :foaf/maker,
   :rdfs/range :owl/Thing,
   :rdfs/label "made",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "Something that was made by this agent.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def maker
  "An agent that made this thing."
  {:rdfs/domain :owl/Thing,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :owl/equivalentProperty :dcterms/creator,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "maker",
   :rdfs/comment "An agent that made this thing.",
   :owl/inverseOf :foaf/made,
   :rdfs/range :foaf/Agent})

(def mbox
  "A personal mailbox, ie. an Internet mailbox associated with exactly one owner, the first owner of this mailbox. This is a 'static inverse functional property', in that there is (across time and change) at most one individual that ever has any particular value for foaf:mbox."
  {:rdfs/range :owl/Thing,
   :rdfs/label "personal mailbox",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment
     "A personal mailbox, ie. an Internet mailbox associated with exactly one owner, the first owner of this mailbox. This is a 'static inverse functional property', in that there is (across time and change) at most one individual that ever has any particular value for foaf:mbox.",
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty
              :rdf/Property]})

(def mbox_sha1sum
  "The sha1sum of the URI of an Internet mailbox associated with exactly one owner, the first owner of the mailbox."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "sha1sum of a personal mailbox URI name",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment
     "The sha1sum of the URI of an Internet mailbox associated with exactly one owner, the first owner of the mailbox.",
   :rdf/type [:owl/InverseFunctionalProperty :owl/DatatypeProperty
              :rdf/Property]})

(def member
  "Indicates a member of a Group"
  {:rdfs/range :foaf/Agent,
   :rdfs/label "member",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Group,
   :rdfs/comment "Indicates a member of a Group",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def membershipClass
  "Indicates the class of individuals that are a member of a Group"
  {:rdfs/label "membershipClass",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment
     "Indicates the class of individuals that are a member of a Group",
   :rdf/type [:owl/AnnotationProperty :rdf/Property]})

(def msnChatID
  "An MSN chat ID"
  {:rdfs/subPropertyOf :foaf/nick,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "MSN chat ID",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "An MSN chat ID",
   :rdf/type [:owl/InverseFunctionalProperty :owl/DatatypeProperty
              :rdf/Property]})

(def myersBriggs
  "A Myers Briggs (MBTI) personality classification."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "myersBriggs",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "A Myers Briggs (MBTI) personality classification.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def name
  "A name for some thing."
  {:rdfs/subPropertyOf :rdfs/label,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "name",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment "A name for some thing.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def nick
  "A short informal nickname characterising an agent (includes login identifiers, IRC and other chat nicknames)."
  {:rdfs/label "nickname",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment
     "A short informal nickname characterising an agent (includes login identifiers, IRC and other chat nicknames).",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def openid
  "An OpenID for an Agent."
  {:rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :rdfs/range :foaf/Document,
   :rdfs/label "openid",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "An OpenID for an Agent.",
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty
              :rdf/Property]})

(def page
  "A page or document about this thing."
  {:owl/inverseOf :foaf/topic,
   :rdfs/range :foaf/Document,
   :rdfs/label "page",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :owl/Thing,
   :rdfs/comment "A page or document about this thing.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def pastProject
  "A project this person has previously worked on."
  {:rdfs/range :owl/Thing,
   :rdfs/label "past project",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "A project this person has previously worked on.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def phone
  "A phone, specified using fully qualified tel: URI scheme (refs: http://www.w3.org/Addressing/schemes.html#tel)."
  {:rdfs/label "phone",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment
     "A phone, specified using fully qualified tel: URI scheme (refs: http://www.w3.org/Addressing/schemes.html#tel).",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def plan
  "A .plan comment, in the tradition of finger and '.plan' files."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "plan",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment
     "A .plan comment, in the tradition of finger and '.plan' files.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def primaryTopic
  "The primary topic of some page or document."
  {:owl/inverseOf :foaf/isPrimaryTopicOf,
   :rdfs/range :owl/Thing,
   :rdfs/label "primary topic",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Document,
   :rdfs/comment "The primary topic of some page or document.",
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty :rdf/Property]})

(def publications
  "A link to the publications of this person."
  {:rdfs/range :foaf/Document,
   :rdfs/label "publications",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "A link to the publications of this person.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def schoolHomepage
  "A homepage of a school attended by the person."
  {:rdfs/range :foaf/Document,
   :rdfs/label "schoolHomepage",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment "A homepage of a school attended by the person.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def sha1
  "A sha1sum hash, in hex."
  {:rdfs/label "sha1sum (hex)",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Document,
   :rdfs/comment "A sha1sum hash, in hex.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def skypeID
  "A Skype ID"
  {:rdfs/subPropertyOf :foaf/nick,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "Skype ID",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "A Skype ID",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def status
  "A string expressing what the user is happy for the general public (normally) to know about their current activity."
  {:rdfs/range :rdfs/Literal,
   :rdfs/label "status",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment
     "A string expressing what the user is happy for the general public (normally) to know about their current activity.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def thumbnail
  "A derived thumbnail image."
  {:rdfs/range :foaf/Image,
   :rdfs/label "thumbnail",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Image,
   :rdfs/comment "A derived thumbnail image.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def tipjar
  "A tipjar document for this agent, describing means for payment and reward."
  {:rdfs/subPropertyOf :foaf/page,
   :rdfs/range :foaf/Document,
   :rdfs/label "tipjar",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment
     "A tipjar document for this agent, describing means for payment and reward.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def title
  "Title (Mr, Mrs, Ms, Dr. etc)"
  {:rdfs/label "title",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/comment "Title (Mr, Mrs, Ms, Dr. etc)",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def topic
  "A topic of some page or document."
  {:owl/inverseOf :foaf/page,
   :rdfs/range :owl/Thing,
   :rdfs/label "topic",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Document,
   :rdfs/comment "A topic of some page or document.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def topic_interest
  "A thing of interest to this person."
  {:rdfs/range :owl/Thing,
   :rdfs/label "topic_interest",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "A thing of interest to this person.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def weblog
  "A weblog of some thing (whether person, group, company etc.)."
  {:rdfs/subPropertyOf :foaf/page,
   :rdfs/range :foaf/Document,
   :rdfs/label "weblog",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment
     "A weblog of some thing (whether person, group, company etc.).",
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty
              :rdf/Property]})

(def workInfoHomepage
  "A work info homepage of some person; a page about their work for some organization."
  {:rdfs/range :foaf/Document,
   :rdfs/label "work info homepage",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment
     "A work info homepage of some person; a page about their work for some organization.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def workplaceHomepage
  "A workplace homepage of some person; the homepage of an organization they work for."
  {:rdfs/range :foaf/Document,
   :rdfs/label "workplace homepage",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Person,
   :rdfs/comment
     "A workplace homepage of some person; the homepage of an organization they work for.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def yahooChatID
  "A Yahoo chat ID"
  {:rdfs/subPropertyOf :foaf/nick,
   :rdfs/range :rdfs/Literal,
   :rdfs/label "Yahoo chat ID",
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/domain :foaf/Agent,
   :rdfs/comment "A Yahoo chat ID",
   :rdf/type [:owl/InverseFunctionalProperty :owl/DatatypeProperty
              :rdf/Property]})