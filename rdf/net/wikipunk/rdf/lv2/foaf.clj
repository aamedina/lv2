(ns net.wikipunk.rdf.lv2.foaf
  "This version of the FOAF vocabulary has been slightly trimmed for LV2."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/foaf.ttl",
   :dcterms/title "Friend of a Friend (FOAF) vocabulary",
   :rdf/about #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "foaf",
   :vann/preferredNamespaceUri "http://xmlns.com/foaf/0.1/"}
  (:refer-clojure :exclude [name]))

(def Agent
  "An agent (eg. person, group, software or physical artifact)."
  {:owl/equivalentClass :dcterms/Agent,
   :rdf/about           :foaf/Agent,
   :rdf/type            [:owl/Class :rdfs/Class],
   :rdfs/label          "Agent"})

(def Document
  "A document."
  {:owl/disjointWith [:foaf/Project :foaf/Organization],
   :rdf/about        :foaf/Document,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Document"})

(def Group
  "A class of Agents."
  {:rdf/about       :foaf/Group,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Group",
   :rdfs/subClassOf :foaf/Agent})

(def Image
  "An image."
  {:rdf/about        :foaf/Image,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Image",
   :rdfs/subClassOf  :foaf/Document})

(def LabelProperty
  "A foaf:LabelProperty is any RDF property with textual values that serve as labels."
  {:rdf/about        :foaf/LabelProperty,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Label Property"})

(def OnlineAccount
  "An online account."
  {:rdf/about        :foaf/OnlineAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online Account",
   :rdfs/subClassOf  :owl/Thing})

(def OnlineChatAccount
  "An online chat account."
  {:rdf/about        :foaf/OnlineChatAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online Chat Account",
   :rdfs/subClassOf  :foaf/OnlineAccount})

(def OnlineEcommerceAccount
  "An online e-commerce account."
  {:rdf/about        :foaf/OnlineEcommerceAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online E-commerce Account",
   :rdfs/subClassOf  :foaf/OnlineAccount})

(def OnlineGamingAccount
  "An online gaming account."
  {:rdf/about        :foaf/OnlineGamingAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online Gaming Account",
   :rdfs/subClassOf  :foaf/OnlineAccount})

(def Organization
  "An organization."
  {:owl/disjointWith [:foaf/Person :foaf/Document],
   :rdf/about        :foaf/Organization,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Organization",
   :rdfs/subClassOf  :foaf/Agent})

(def Person
  "A person."
  {:owl/disjointWith [:foaf/Project :foaf/Organization],
   :rdf/about        :foaf/Person,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Person",
   :rdfs/subClassOf  :foaf/Agent})

(def PersonalProfileDocument
  "A personal profile RDF document."
  {:rdf/about       :foaf/PersonalProfileDocument,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "PersonalProfileDocument",
   :rdfs/subClassOf :foaf/Document})

(def Project
  "A project (a collective endeavour of some kind)."
  {:owl/disjointWith [:foaf/Person :foaf/Document],
   :rdf/about        :foaf/Project,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Project"})

(def account
  "Indicates an account held by this agent."
  {:rdf/about        :foaf/account,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "account",
   :rdfs/range       :foaf/OnlineAccount})

(def accountName
  "Indicates the name (identifier) associated with this online account."
  {:rdf/about        :foaf/accountName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/OnlineAccount,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "account name",
   :rdfs/range       :rdfs/Literal})

(def accountServiceHomepage
  "Indicates a homepage of the service provide for this online account."
  {:rdf/about        :foaf/accountServiceHomepage,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/OnlineAccount,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "account service homepage",
   :rdfs/range       :foaf/Document})

(def age
  "The age in years of some agent."
  {:rdf/about        :foaf/age,
   :rdf/type         [:owl/FunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "age",
   :rdfs/range       :rdfs/Literal})

(def aimChatID
  "An AIM chat ID"
  {:rdf/about          :foaf/aimChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "AIM chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def birthday
  "The birthday of this Agent, represented in mm-dd string form, eg. '12-31'."
  {:rdf/about        :foaf/birthday,
   :rdf/type         [:owl/FunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "birthday",
   :rdfs/range       :rdfs/Literal})

(def currentProject
  "A current project this person works on."
  {:rdf/about        :foaf/currentProject,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "current project",
   :rdfs/range       :owl/Thing})

(def depiction
  "A depiction of some thing."
  {:owl/inverseOf    :foaf/depicts,
   :rdf/about        :foaf/depiction,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "depiction",
   :rdfs/range       :foaf/Image})

(def depicts
  "A thing depicted in this representation."
  {:owl/inverseOf    :foaf/depiction,
   :rdf/about        :foaf/depicts,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Image,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "depicts",
   :rdfs/range       :owl/Thing})

(def familyName
  "The family name of some person."
  {:rdf/about        :foaf/familyName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "familyName",
   :rdfs/range       :rdfs/Literal})

(def firstName
  "The first name of a person."
  {:rdf/about        :foaf/firstName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "firstName",
   :rdfs/range       :rdfs/Literal})

(def gender
  "The gender of this Agent (typically but not necessarily 'male' or 'female')."
  {:rdf/about        :foaf/gender,
   :rdf/type         [:owl/FunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "gender",
   :rdfs/range       :rdfs/Literal})

(def givenName
  "The given name of some person."
  {:rdf/about        :foaf/givenName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Given name"})

(def homepage
  "A homepage for some thing."
  {:rdf/about          :foaf/homepage,
   :rdf/type           [:rdf/Property
                        :owl/ObjectProperty
                        :owl/InverseFunctionalProperty],
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "homepage",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf [:foaf/page :foaf/isPrimaryTopicOf]})

(def icqChatID
  "An ICQ chat ID"
  {:rdf/about          :foaf/icqChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "ICQ chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def img
  "An image that can be used to represent some thing (ie. those depictions which are particularly representative of something, eg. one's photo on a homepage)."
  {:rdf/about          :foaf/img,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :foaf/Person,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "image",
   :rdfs/range         :foaf/Image,
   :rdfs/subPropertyOf :foaf/depiction})

(def interest
  "A page about a topic of interest to this person."
  {:rdf/about        :foaf/interest,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "interest",
   :rdfs/range       :foaf/Document})

(def isPrimaryTopicOf
  "A document that this thing is the primary topic of."
  {:owl/inverseOf      :foaf/primaryTopic,
   :rdf/about          :foaf/isPrimaryTopicOf,
   :rdf/type           [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "is primary topic of",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/page})

(def jabberID
  "A jabber ID for something."
  {:rdf/about        :foaf/jabberID,
   :rdf/type         [:owl/InverseFunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "jabber ID",
   :rdfs/range       :rdfs/Literal})

(def knows
  "A person known by this person (indicating some level of reciprocated interaction between the parties)."
  {:rdf/about        :foaf/knows,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "knows",
   :rdfs/range       :foaf/Person})

(def lastName
  "The last name of a person."
  {:rdf/about        :foaf/lastName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "lastName",
   :rdfs/range       :rdfs/Literal})

(def logo
  "A logo representing some thing."
  {:rdf/about        :foaf/logo,
   :rdf/type         [:owl/ObjectProperty
                      :owl/InverseFunctionalProperty
                      :rdf/Property],
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "logo",
   :rdfs/range       :owl/Thing})

(def made
  "Something that was made by this agent."
  {:owl/inverseOf    :foaf/maker,
   :rdf/about        :foaf/made,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "made",
   :rdfs/range       :owl/Thing})

(def maker
  "An agent that made this thing."
  {:owl/equivalentProperty :dcterms/creator,
   :owl/inverseOf          :foaf/made,
   :rdf/about              :foaf/maker,
   :rdf/type               [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain            :owl/Thing,
   :rdfs/isDefinedBy       #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label             "maker",
   :rdfs/range             :foaf/Agent})

(def mbox
  "A personal mailbox, ie. an Internet mailbox associated with exactly one owner, the first owner of this mailbox. This is a 'static inverse functional property', in that there is (across time and change) at most one individual that ever has any particular value for foaf:mbox."
  {:rdf/about        :foaf/mbox,
   :rdf/type         [:owl/ObjectProperty
                      :owl/InverseFunctionalProperty
                      :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "personal mailbox",
   :rdfs/range       :owl/Thing})

(def mbox_sha1sum
  "The sha1sum of the URI of an Internet mailbox associated with exactly one owner, the first owner of the mailbox."
  {:rdf/about        :foaf/mbox_sha1sum,
   :rdf/type         [:owl/InverseFunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "sha1sum of a personal mailbox URI name",
   :rdfs/range       :rdfs/Literal})

(def member
  "Indicates a member of a Group"
  {:rdf/about        :foaf/member,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Group,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "member",
   :rdfs/range       :foaf/Agent})

(def membershipClass
  "Indicates the class of individuals that are a member of a Group"
  {:rdf/about        :foaf/membershipClass,
   :rdf/type         [:owl/AnnotationProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "membershipClass"})

(def msnChatID
  "An MSN chat ID"
  {:rdf/about          :foaf/msnChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "MSN chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def myersBriggs
  "A Myers Briggs (MBTI) personality classification."
  {:rdf/about        :foaf/myersBriggs,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "myersBriggs",
   :rdfs/range       :rdfs/Literal})

(def name
  "A name for some thing."
  {:rdf/about          :foaf/name,
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :rdfs/label})

(def nick
  "A short informal nickname characterising an agent (includes login identifiers, IRC and other chat nicknames)."
  {:rdf/about        :foaf/nick,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "nickname"})

(def openid
  "An OpenID for an Agent."
  {:rdf/about          :foaf/openid,
   :rdf/type           [:owl/ObjectProperty
                        :owl/InverseFunctionalProperty
                        :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "openid",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf})

(def page
  "A page or document about this thing."
  {:owl/inverseOf    :foaf/topic,
   :rdf/about        :foaf/page,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "page",
   :rdfs/range       :foaf/Document})

(def pastProject
  "A project this person has previously worked on."
  {:rdf/about        :foaf/pastProject,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "past project",
   :rdfs/range       :owl/Thing})

(def phone
  "A phone, specified using fully qualified tel: URI scheme (refs: http://www.w3.org/Addressing/schemes.html#tel)."
  {:rdf/about        :foaf/phone,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "phone"})

(def plan
  "A .plan comment, in the tradition of finger and '.plan' files."
  {:rdf/about        :foaf/plan,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "plan",
   :rdfs/range       :rdfs/Literal})

(def primaryTopic
  "The primary topic of some page or document."
  {:owl/inverseOf    :foaf/isPrimaryTopicOf,
   :rdf/about        :foaf/primaryTopic,
   :rdf/type         [:owl/ObjectProperty
                      :owl/FunctionalProperty
                      :rdf/Property],
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "primary topic",
   :rdfs/range       :owl/Thing})

(def publications
  "A link to the publications of this person."
  {:rdf/about        :foaf/publications,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "publications",
   :rdfs/range       :foaf/Document})

(def schoolHomepage
  "A homepage of a school attended by the person."
  {:rdf/about        :foaf/schoolHomepage,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "schoolHomepage",
   :rdfs/range       :foaf/Document})

(def sha1
  "A sha1sum hash, in hex."
  {:rdf/about        :foaf/sha1,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "sha1sum (hex)"})

(def skypeID
  "A Skype ID"
  {:rdf/about          :foaf/skypeID,
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "Skype ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def status
  "A string expressing what the user is happy for the general public (normally) to know about their current activity."
  {:rdf/about        :foaf/status,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "status",
   :rdfs/range       :rdfs/Literal})

(def thumbnail
  "A derived thumbnail image."
  {:rdf/about        :foaf/thumbnail,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Image,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "thumbnail",
   :rdfs/range       :foaf/Image})

(def tipjar
  "A tipjar document for this agent, describing means for payment and reward."
  {:rdf/about          :foaf/tipjar,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "tipjar",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/page})

(def title
  "Title (Mr, Mrs, Ms, Dr. etc)"
  {:rdf/about        :foaf/title,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "title"})

(def topic
  "A topic of some page or document."
  {:owl/inverseOf    :foaf/page,
   :rdf/about        :foaf/topic,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "topic",
   :rdfs/range       :owl/Thing})

(def topic_interest
  "A thing of interest to this person."
  {:rdf/about        :foaf/topic_interest,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "topic_interest",
   :rdfs/range       :owl/Thing})

(def weblog
  "A weblog of some thing (whether person, group, company etc.)."
  {:rdf/about          :foaf/weblog,
   :rdf/type           [:owl/ObjectProperty
                        :owl/InverseFunctionalProperty
                        :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "weblog",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/page})

(def workInfoHomepage
  "A work info homepage of some person; a page about their work for some organization."
  {:rdf/about        :foaf/workInfoHomepage,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "work info homepage",
   :rdfs/range       :foaf/Document})

(def workplaceHomepage
  "A workplace homepage of some person; the homepage of an organization they work for."
  {:rdf/about        :foaf/workplaceHomepage,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "workplace homepage",
   :rdfs/range       :foaf/Document})

(def yahooChatID
  "A Yahoo chat ID"
  {:rdf/about          :foaf/yahooChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "Yahoo chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})