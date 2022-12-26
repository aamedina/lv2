(ns net.wikipunk.lv2.rdf.prov
  "This document is published by the Provenance Working Group (http://www.w3.org/2011/prov/wiki/Main_Page).   If you wish to make comments regarding this document, please send them to public-prov-comments@w3.org (subscribe public-prov-comments-request@w3.org, archives http://lists.w3.org/Archives/Public/public-prov-comments/). All feedback is welcome."
  {:owl/imports ["http://www.w3.org/ns/prov-dictionary#"
                 "http://www.w3.org/ns/prov-o#"
                 "http://www.w3.org/ns/prov-dc#"
                 "http://www.w3.org/ns/prov-links#"
                 "http://www.w3.org/ns/prov-o-inverses#"
                 "http://www.w3.org/ns/prov-aq#"],
   :owl/versionIRI "http://www.w3.org/ns/prov-o-20130430",
   :owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Recommendation version 2013-04-30"},
   :prov/specializationOf "http://www.w3.org/ns/prov-o",
   :prov/wasDerivedFrom ["http://www.w3.org/ns/prov-links#"
                         "http://www.w3.org/ns/prov-dictionary#"
                         "http://www.w3.org/ns/prov-aq#"
                         "http://www.w3.org/ns/prov-dc#"
                         "http://www.w3.org/ns/prov-o-inverses#"
                         "http://www.w3.org/ns/prov-o-20130430"
                         "http://www.w3.org/ns/prov-o#"],
   :prov/wasRevisionOf "http://www.w3.org/ns/prov-o-20120312",
   :rdf/about "http://www.w3.org/ns/prov-o#",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "prov",
   :rdfa/uri "http://www.w3.org/ns/prov#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This document is published by the Provenance Working Group (http://www.w3.org/2011/prov/wiki/Main_Page). \n\nIf you wish to make comments regarding this document, please send them to public-prov-comments@w3.org (subscribe public-prov-comments-request@w3.org, archives http://lists.w3.org/Archives/Public/public-prov-comments/). All feedback is welcome."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "W3C PROVenance Interchange Ontology (PROV-O)"},
   :rdfs/seeAlso ["http://www.w3.org/ns/prov" "http://www.w3.org/TR/prov-o/"]}
  (:refer-clojure :exclude [comment agent]))

(def Accept
  "Activity that identifies the acceptance of a resource (e.g., an article in a conference)"
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Activity that identifies the acceptance of a resource (e.g., an article in a conference)"},
   :rdf/about :prov/Accept,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accept"},
   :rdfs/subClassOf :prov/Activity})

(def Activity
  "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities."
  {:owl/disjointWith :prov/Entity,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Activity",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Activity",
   :rdf/about :prov/Activity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Activity"})

(def ActivityInfluence
  {:owl/disjointWith :prov/EntityInfluence,
   :prov/category "qualified",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "ActivitiyInfluence is the capacity of an activity to have an effect on the character, development, or behavior of another by means of generation, invalidation, communication, or other."},
   :rdf/about :prov/ActivityInfluence,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "It is not recommended that the type ActivityInfluence be asserted without also asserting one of its more specific subclasses."}
    {:rdf/language "en",
     :rdf/value
     "ActivityInfluence provides additional descriptions of an Activity's binary influence upon any other kind of resource. Instances of ActivityInfluence use the prov:activity property to cite the influencing Activity."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "ActivityInfluence",
   :rdfs/seeAlso :prov/activity,
   :rdfs/subClassOf [:prov/Influence
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}]})

(def Agent
  "An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity."
  {:owl/disjointWith :prov/InstantaneousEvent,
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. "},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Agent",
   :rdf/about :prov/Agent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Agent"})

(def AgentInfluence
  {:prov/category "qualified",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "AgentInfluence is the capacity of an agent to have an effect on the character, development, or behavior of another by means of attribution, association, delegation, or other."},
   :rdf/about :prov/AgentInfluence,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "It is not recommended that the type AgentInfluence be asserted without also asserting one of its more specific subclasses."}
    {:rdf/language "en",
     :rdf/value
     "AgentInfluence provides additional descriptions of an Agent's binary influence upon any other kind of resource. Instances of AgentInfluence use the prov:agent property to cite the influencing Agent."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "AgentInfluence",
   :rdfs/seeAlso :prov/agent,
   :rdfs/subClassOf :prov/Influence})

(def Association
  "An activity association is an assignment of responsibility to an agent for an activity, indicating that the agent had a role in the activity. It further allows for a plan to be specified, which is the plan intended by the agent to achieve some goals in the context of this activity."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An activity association is an assignment of responsibility to an agent for an activity, indicating that the agent had a role in the activity. It further allows for a plan to be specified, which is the plan intended by the agent to achieve some goals in the context of this activity."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association",
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/about :prov/Association,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Association provides additional descriptions about the binary prov:wasAssociatedWith relation from an prov:Activity to some prov:Agent that had some responsiblity for it. For example, :baking prov:wasAssociatedWith :baker; prov:qualifiedAssociation [ a prov:Association; prov:agent :baker; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Association",
   :rdfs/subClassOf :prov/AgentInfluence})

(def Attribution
  "Attribution is the ascribing of an entity to an agent.  When an entity e is attributed to agent ag, entity e was generated by some unspecified activity that in turn was associated to agent ag. Thus, this relation is useful when the activity is not known, or irrelevant."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Attribution is the ascribing of an entity to an agent.\n\nWhen an entity e is attributed to agent ag, entity e was generated by some unspecified activity that in turn was associated to agent ag. Thus, this relation is useful when the activity is not known, or irrelevant."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribution",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribution",
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/about :prov/Attribution,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Attribution provides additional descriptions about the binary prov:wasAttributedTo relation from an prov:Entity to some prov:Agent that had some responsible for it. For example, :cake prov:wasAttributedTo :baker; prov:qualifiedAttribution [ a prov:Attribution; prov:entity :baker; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Attribution",
   :rdfs/subClassOf :prov/AgentInfluence})

(def Bundle
  "A bundle is a named set of provenance descriptions, and is itself an Entity, so allowing provenance of provenance to be expressed."
  {:prov/category "expanded",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A bundle is a named set of provenance descriptions, and is itself an Entity, so allowing provenance of provenance to be expressed."},
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-bundle-entity",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-bundle-declaration",
   :rdf/about :prov/Bundle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Note that there are kinds of bundles (e.g. handwritten letters, audio recordings, etc.) that are not expressed in PROV-O, but can be still be described by PROV-O."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Bundle",
   :rdfs/subClassOf :prov/Entity})

(def Collection
  "A collection is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the collections."
  {:prov/category "expanded",
   :prov/component "collections",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A collection is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the collections."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-collection",
   :rdf/about :prov/Collection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Collection",
   :rdfs/subClassOf :prov/Entity})

(def Communication
  "Communication is the exchange of an entity by two activities, one activity using the entity generated by the other."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   "Communication is the exchange of an entity by two activities, one activity using the entity generated by the other.",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Communication",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-wasInformedBy",
   :prov/unqualifiedForm :prov/wasInformedBy,
   :rdf/about :prov/Communication,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Communication provides additional descriptions about the binary prov:wasInformedBy relation from an informed prov:Activity to the prov:Activity that informed it. For example, :you_jumping_off_bridge prov:wasInformedBy :everyone_else_jumping_off_bridge; prov:qualifiedCommunication [ a prov:Communication; prov:activity :everyone_else_jumping_off_bridge; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Communication",
   :rdfs/subClassOf :prov/ActivityInfluence})

(def Contribute
  "Activity that identifies any contribution of an agent to a resource."
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Activity that identifies any contribution of an agent to a resource. "},
   :rdf/about :prov/Contribute,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contribute\n"},
   :rdfs/subClassOf :prov/Activity})

(def Contributor
  "Role with the function of having responsibility for making contributions to a resource. The Agent assigned to this role is associated with a Modify or Create Activities"
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Role with the function of having responsibility for making contributions to a resource. The Agent assigned to this role is associated with a Modify or Create Activities"},
   :rdf/about :prov/Contributor,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contributor"},
   :rdfs/subClassOf :prov/Role})

(def Copyright
  "Activity that identifies the Copyrighting activity associated to a resource."
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Activity that identifies the Copyrighting activity associated to a resource."},
   :rdf/about :prov/Copyright,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright"},
   :rdfs/subClassOf :prov/Activity})

(def Create
  "Activity that identifies the creation of a resource"
  {:prov/definition {:rdf/language "en",
                     :rdf/value
                     "Activity that identifies the creation of a resource"},
   :rdf/about       :prov/Create,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Create"},
   :rdfs/subClassOf :prov/Contribute})

(def Creator
  "Role with the function of creating a resource. The Agent assigned to this role is associated with a Create Activity"
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Role with the function of creating a resource. The Agent assigned to this role is associated with a Create Activity"},
   :rdf/about :prov/Creator,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Creator"},
   :rdfs/subClassOf :prov/Contributor})

(def Delegation
  "Delegation is the assignment of authority and responsibility to an agent (by itself or by another agent) to carry out a specific activity as a delegate or representative, while the agent it acts on behalf of retains some responsibility for the outcome of the delegated work.  For example, a student acted on behalf of his supervisor, who acted on behalf of the department chair, who acted on behalf of the university; all those agents are responsible in some way for the activity that took place but we do not say explicitly who bears responsibility and to what degree."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Delegation is the assignment of authority and responsibility to an agent (by itself or by another agent) to carry out a specific activity as a delegate or representative, while the agent it acts on behalf of retains some responsibility for the outcome of the delegated work.\n\nFor example, a student acted on behalf of his supervisor, who acted on behalf of the department chair, who acted on behalf of the university; all those agents are responsible in some way for the activity that took place but we do not say explicitly who bears responsibility and to what degree."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-delegation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-delegation",
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/about :prov/Delegation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Delegation provides additional descriptions about the binary prov:actedOnBehalfOf relation from a performing prov:Agent to some prov:Agent for whom it was performed. For example, :mixing prov:wasAssociatedWith :toddler . :toddler prov:actedOnBehalfOf :mother; prov:qualifiedDelegation [ a prov:Delegation; prov:entity :mother; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Delegation",
   :rdfs/subClassOf :prov/AgentInfluence})

(def Derivation
  "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Derivation",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#Derivation-Relation",
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/about :prov/Derivation,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "An instance of prov:Derivation provides additional descriptions about the binary prov:wasDerivedFrom relation from some derived prov:Entity to another prov:Entity from which it was derived. For example, :chewed_bubble_gum prov:wasDerivedFrom :unwrapped_bubble_gum; prov:qualifiedDerivation [ a prov:Derivation; prov:entity :unwrapped_bubble_gum; :foo :bar ]."}
    {:rdf/language "en",
     :rdf/value
     "The more specific forms of prov:Derivation (i.e., prov:Revision, prov:Quotation, prov:PrimarySource) should be asserted if they apply."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Derivation",
   :rdfs/subClassOf :prov/EntityInfluence})

(def Dictionary
  "A dictionary is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the dictionary."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "A dictionary is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the dictionary.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-conceptual-definition",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary",
   :rdf/about :prov/Dictionary,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["This concept allows for the provenance of the dictionary, but also of its constituents to be expressed. Such a notion of dictionary corresponds to a wide variety of concrete data structures, such as a maps or associative arrays."
    "A given dictionary forms a given structure for its members. A different structure (obtained either by insertion or removal of members) constitutes a different dictionary."],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "Dictionary"})

(def DirectQueryService
  "Type for a generic provenance query service. Mainly for use in RDF provenance query service descriptions, to facilitate discovery in linked data environments."
  {:prov/aq
   "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/#provenance-query-service-discovery",
   :prov/category "access-and-query",
   :rdf/about :prov/DirectQueryService,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Type for a generic provenance query service. Mainly for use in RDF provenance query service descriptions, to facilitate discovery in linked data environments.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "ProvenanceService",
   :rdfs/subClassOf :prov/SoftwareAgent})

(def EmptyCollection
  "An empty collection is a collection without members."
  {:prov/category    "expanded",
   :prov/component   "collections",
   :prov/definition  {:rdf/language "en",
                      :rdf/value
                      "An empty collection is a collection without members."},
   :rdf/about        :prov/EmptyCollection,
   :rdf/type         [:owl/NamedIndividual :owl/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "EmptyCollection"},
   :rdfs/subClassOf  :prov/Collection})

(def EmptyDictionary
  "An empty dictionary (i.e. has no members)."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition "An empty dictionary (i.e. has no members).",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-conceptual-definition",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary",
   :rdf/about :prov/EmptyDictionary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "Empty Dictionary",
   :rdfs/subClassOf [:prov/Dictionary :prov/EmptyCollection]})

(def End
  "End is when an activity is deemed to have been ended by an entity, known as trigger. The activity no longer exists after its end. Any usage, generation, or invalidation involving an activity precedes the activity's end. An end may refer to a trigger entity that terminated the activity, or to an activity, known as ender that generated the trigger."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "End is when an activity is deemed to have been ended by an entity, known as trigger. The activity no longer exists after its end. Any usage, generation, or invalidation involving an activity precedes the activity's end. An end may refer to a trigger entity that terminated the activity, or to an activity, known as ender that generated the trigger."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-End",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-End",
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/about :prov/End,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:End provides additional descriptions about the binary prov:wasEndedBy relation from some ended prov:Activity to an prov:Entity that ended it. For example, :ball_game prov:wasEndedBy :buzzer; prov:qualifiedEnd [ a prov:End; prov:entity :buzzer; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "End",
   :rdfs/subClassOf [:prov/EntityInfluence :prov/InstantaneousEvent]})

(def Entity
  "An entity is a physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary."
  {:owl/disjointWith :prov/InstantaneousEvent,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An entity is a physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. "},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-entity",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Entity",
   :rdf/about :prov/Entity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Entity"})

(def EntityInfluence
  {:prov/category "qualified",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "EntityInfluence is the capacity of an entity to have an effect on the character, development, or behavior of another by means of usage, start, end, derivation, or other. "},
   :rdf/about :prov/EntityInfluence,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "It is not recommended that the type EntityInfluence be asserted without also asserting one of its more specific subclasses."}
    {:rdf/language "en",
     :rdf/value
     "EntityInfluence provides additional descriptions of an Entity's binary influence upon any other kind of resource. Instances of EntityInfluence use the prov:entity property to cite the influencing Entity."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "EntityInfluence",
   :rdfs/seeAlso :prov/entity,
   :rdfs/subClassOf :prov/Influence})

(def Generation
  "Generation is the completion of production of a new entity by an activity. This entity did not exist before generation and becomes available for usage after this generation."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Generation is the completion of production of a new entity by an activity. This entity did not exist before generation and becomes available for usage after this generation."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Generation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Generation",
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/about :prov/Generation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Generation provides additional descriptions about the binary prov:wasGeneratedBy relation from a generated prov:Entity to the prov:Activity that generated it. For example, :cake prov:wasGeneratedBy :baking; prov:qualifiedGeneration [ a prov:Generation; prov:activity :baking; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Generation",
   :rdfs/subClassOf [:prov/ActivityInfluence :prov/InstantaneousEvent]})

(def Influence
  "Influence is the capacity of an entity, activity, or agent to have an effect on the character, development, or behavior of another by means of usage, start, end, generation, invalidation, communication, derivation, attribution, association, or delegation."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Influence is the capacity of an entity, activity, or agent to have an effect on the character, development, or behavior of another by means of usage, start, end, generation, invalidation, communication, derivation, attribution, association, or delegation."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-influence",
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/about :prov/Influence,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "An instance of prov:Influence provides additional descriptions about the binary prov:wasInfluencedBy relation from some influenced Activity, Entity, or Agent to the influencing Activity, Entity, or Agent. For example, :stomach_ache prov:wasInfluencedBy :spoon; prov:qualifiedInfluence [ a prov:Influence; prov:entity :spoon; :foo :bar ] . Because prov:Influence is a broad relation, the more specific relations (Communication, Delegation, End, etc.) should be used when applicable."}
    {:rdf/language "en",
     :rdf/value
     "Because prov:Influence is a broad relation, its most specific subclasses (e.g. prov:Communication, prov:Delegation, prov:End, prov:Revision, etc.) should be used when applicable."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Influence"})

(def Insertion
  "Insertion is a derivation that transforms a dictionary into another, by insertion of one or more key-entity pairs."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "Insertion is a derivation that transforms a dictionary into another, by insertion of one or more key-entity pairs.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-insertion",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-insertion",
   :prov/unqualifiedForm :prov/derivedByInsertionFrom,
   :rdf/about :prov/Insertion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "Insertion",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :prov/dictionary,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :prov/insertedKeyEntityPair,
                      :rdf/type           :owl/Restriction}
                     :prov/Derivation]})

(def InstantaneousEvent
  "The PROV data model is implicitly based on a notion of instantaneous events (or just events), that mark transitions in the world. Events include generation, usage, or invalidation of entities, as well as starting or ending of activities. This notion of event is not first-class in the data model, but it is useful for explaining its other concepts and its semantics."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#dfn-event",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "The PROV data model is implicitly based on a notion of instantaneous events (or just events), that mark transitions in the world. Events include generation, usage, or invalidation of entities, as well as starting or ending of activities. This notion of event is not first-class in the data model, but it is useful for explaining its other concepts and its semantics."},
   :rdf/about :prov/InstantaneousEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instantaneous event, or event for short, happens in the world and marks a change in the world, in its activities and in its entities. The term 'event' is commonly used in process algebra with a similar meaning. Events represent communications or interactions; they are assumed to be atomic and instantaneous."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "InstantaneousEvent"})

(def Invalidation
  "Invalidation is the start of the destruction, cessation, or expiry of an existing entity by an activity. The entity is no longer available for use (or further invalidation) after invalidation. Any generation or usage of an entity precedes its invalidation."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   "Invalidation is the start of the destruction, cessation, or expiry of an existing entity by an activity. The entity is no longer available for use (or further invalidation) after invalidation. Any generation or usage of an entity precedes its invalidation.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Invalidation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Invalidation",
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/about :prov/Invalidation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Invalidation provides additional descriptions about the binary prov:wasInvalidatedBy relation from an invalidated prov:Entity to the prov:Activity that invalidated it. For example, :uncracked_egg prov:wasInvalidatedBy :baking; prov:qualifiedInvalidation [ a prov:Invalidation; prov:activity :baking; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Invalidation",
   :rdfs/subClassOf [:prov/ActivityInfluence :prov/InstantaneousEvent]})

(def KeyEntityPair
  "A key-entity pair. Part of a prov:Dictionary through prov:hadDictionaryMember. The key is any RDF Literal, the value is a prov:Entity."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "A key-entity pair. Part of a prov:Dictionary through prov:hadDictionaryMember. The key is any RDF Literal, the value is a prov:Entity.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-membership",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-membership",
   :rdf/about :prov/KeyEntityPair,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "Key-Entity Pair",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :prov/pairEntity,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :prov/pairKey,
                      :rdf/type        :owl/Restriction}]})

(def Location
  "A location can be an identifiable geographic place (ISO 19112), but it can also be a non-geographic place such as a directory, row, or column. As such, there are numerous ways in which location can be expressed, such as by a coordinate, address, landmark, and so forth."
  {:prov/category "expanded",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A location can be an identifiable geographic place (ISO 19112), but it can also be a non-geographic place such as a directory, row, or column. As such, there are numerous ways in which location can be expressed, such as by a coordinate, address, landmark, and so forth."},
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-location",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute",
   :rdf/about :prov/Location,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Location",
   :rdfs/seeAlso :prov/atLocation})

(def Modify
  "Activity that identifies the modification of a resource."
  {:prov/definition
   {:rdf/language "en",
    :rdf/value    "Activity that identifies the modification of a resource. "},
   :rdf/about :prov/Modify,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Modify"},
   :rdfs/subClassOf :prov/Activity})

(def Organization
  "An organization is a social or legal institution such as a company, society, etc."
  {:prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition
   "An organization is a social or legal institution such as a company, society, etc.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types",
   :rdf/about :prov/Organization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Organization",
   :rdfs/subClassOf :prov/Agent})

(def Person
  "Person agents are people."
  {:prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition {:rdf/language "en",
                     :rdf/value    "Person agents are people."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types",
   :rdf/about :prov/Person,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Person",
   :rdfs/subClassOf :prov/Agent})

(def Plan
  "A plan is an entity that represents a set of actions or steps intended by one or more agents to achieve some goals."
  {:prov/category ["expanded" "qualified"],
   :prov/component "agents-responsibility",
   :prov/definition
   "A plan is an entity that represents a set of actions or steps intended by one or more agents to achieve some goals.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association",
   :rdf/about :prov/Plan,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "There exist no prescriptive requirement on the nature of plans, their representation, the actions or steps they consist of, or their intended goals. Since plans may evolve over time, it may become necessary to track their provenance, so plans themselves are entities. Representing the plan explicitly in the provenance can be useful for various tasks: for example, to validate the execution as represented in the provenance record, to manage expectation failures, or to provide explanations."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Plan",
   :rdfs/subClassOf :prov/Entity})

(def PrimarySource
  "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.  Because of the directness of primary sources, they 'speak for themselves' in ways that cannot be captured through the filter of secondary sources. As such, it is important for secondary sources to reference those primary sources from which they were derived, so that their reliability can be investigated.  A primary source relation is a particular case of derivation of secondary materials from their primary sources. It is recognized that the determination of primary sources can be up to interpretation, and should be done according to conventions accepted within the application's domain."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.\n\nBecause of the directness of primary sources, they 'speak for themselves' in ways that cannot be captured through the filter of secondary sources. As such, it is important for secondary sources to reference those primary sources from which they were derived, so that their reliability can be investigated.\n\nA primary source relation is a particular case of derivation of secondary materials from their primary sources. It is recognized that the determination of primary sources can be up to interpretation, and should be done according to conventions accepted within the application's domain."},
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-primary-source",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-original-source",
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/about :prov/PrimarySource,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:PrimarySource provides additional descriptions about the binary prov:hadPrimarySource relation from some secondary prov:Entity to an earlier, primary prov:Entity. For example, :blog prov:hadPrimarySource :newsArticle; prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :newsArticle; :foo :bar ] ."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "PrimarySource",
   :rdfs/subClassOf :prov/Derivation})

(def Publish
  "Activity that identifies the publication of a resource"
  {:prov/definition {:rdf/language "en",
                     :rdf/value
                     "Activity that identifies the publication of a resource"},
   :rdf/about       :prov/Publish,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Publish"},
   :rdfs/subClassOf :prov/Activity})

(def Publisher
  "Role with the function of publishing a resource. The Agent assigned to this role is associated with a Publish Activity"
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Role with the function of publishing a resource. The Agent assigned to this role is associated with a Publish Activity"},
   :rdf/about :prov/Publisher,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Publisher"},
   :rdfs/subClassOf :prov/Role})

(def Quotation
  "A quotation is the repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author. Quotation is a particular case of derivation."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A quotation is the repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author. Quotation is a particular case of derivation."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-quotation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-quotation",
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/about :prov/Quotation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Quotation provides additional descriptions about the binary prov:wasQuotedFrom relation from some taken prov:Entity from an earlier, larger prov:Entity. For example, :here_is_looking_at_you_kid prov:wasQuotedFrom :casablanca_script; prov:qualifiedQuotation [ a prov:Quotation; prov:entity :casablanca_script; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Quotation",
   :rdfs/subClassOf :prov/Derivation})

(def Removal
  "Removal is a derivation that transforms a dictionary into another, by removing one or more key-entity pairs."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "Removal is a derivation that transforms a dictionary into another, by removing one or more key-entity pairs.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-removal",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-removal",
   :prov/unqualifiedForm :prov/derivedByRemovalFrom,
   :rdf/about :prov/Removal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "Removal",
   :rdfs/subClassOf [:prov/Derivation
                     {:owl/minCardinality 1,
                      :owl/onProperty     :prov/removedKey,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :prov/dictionary,
                      :rdf/type        :owl/Restriction}]})

(def Replace
  "Activity that identifies the replacement of a resource."
  {:prov/definition {:rdf/language "en",
                     :rdf/value
                     "Activity that identifies the replacement of a resource."},
   :rdf/about       :prov/Replace,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Replace"},
   :rdfs/subClassOf :prov/Activity})

(def Revision
  "A revision is a derivation for which the resulting entity is a revised version of some original. The implication here is that the resulting entity contains substantial content from the original. Revision is a particular case of derivation."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A revision is a derivation for which the resulting entity is a revised version of some original. The implication here is that the resulting entity contains substantial content from the original. Revision is a particular case of derivation."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-revision",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Revision",
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/about :prov/Revision,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Revision provides additional descriptions about the binary prov:wasRevisionOf relation from some newer prov:Entity to an earlier prov:Entity. For example, :draft_2 prov:wasRevisionOf :draft_1; prov:qualifiedRevision [ a prov:Revision; prov:entity :draft_1; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Revision",
   :rdfs/subClassOf :prov/Derivation})

(def RightsAssignment
  "Activity that identifies the rights assignment of a resource."
  {:prov/definition
   {:rdf/language "en",
    :rdf/value "Activity that identifies the rights assignment of a resource."},
   :rdf/about :prov/RightsAssignment,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RightsAssignment"},
   :rdfs/subClassOf :prov/Activity})

(def RightsHolder
  "Role with the function of owning or managing rights over a resource. The Agent assigned to this role is associated with a RightsAssignment Activity"
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Role with the function of owning or managing rights over a resource. The Agent assigned to this role is associated with a RightsAssignment Activity"},
   :rdf/about :prov/RightsHolder,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RightsHolder"},
   :rdfs/subClassOf :prov/Role})

(def Role
  "A role is the function of an entity or agent with respect to an activity, in the context of a usage, generation, invalidation, association, start, and end."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A role is the function of an entity or agent with respect to an activity, in the context of a usage, generation, invalidation, association, start, and end."},
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-role",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute",
   :rdf/about :prov/Role,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Role",
   :rdfs/seeAlso :prov/hadRole})

(def ServiceDescription
  "Type for a generic provenance query service. Mainly for use in RDF provenance query service descriptions, to facilitate discovery in linked data environments."
  {:prov/aq
   "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/#provenance-query-service-discovery",
   :prov/category "access-and-query",
   :rdf/about :prov/ServiceDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Type for a generic provenance query service. Mainly for use in RDF provenance query service descriptions, to facilitate discovery in linked data environments.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "ServiceDescription",
   :rdfs/subClassOf :prov/SoftwareAgent})

(def SoftwareAgent
  "A software agent is running software."
  {:prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition {:rdf/language "en",
                     :rdf/value    "A software agent is running software."},
   :prov/dm
   ["http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"
    "http://www.w3.org/TR/2012/WD-prov-dm-20120703/prov-dm.html#term-agent"],
   :prov/n
   ["http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"
    "http://www.w3.org/TR/2012/WD-prov-dm-20120703/prov-n.html#expression-types"],
   :rdf/about :prov/SoftwareAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov-o#"
                      "http://www.w3.org/ns/prov#"],
   :rdfs/label "SoftwareAgent",
   :rdfs/subClassOf [:owl/Thing :prov/Agent]})

(def Start
  "Start is when an activity is deemed to have been started by an entity, known as trigger. The activity did not exist before its start. Any usage, generation, or invalidation involving an activity follows the activity's start. A start may refer to a trigger entity that set off the activity, or to an activity, known as starter, that generated the trigger."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Start is when an activity is deemed to have been started by an entity, known as trigger. The activity did not exist before its start. Any usage, generation, or invalidation involving an activity follows the activity's start. A start may refer to a trigger entity that set off the activity, or to an activity, known as starter, that generated the trigger."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Start",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Start",
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/about :prov/Start,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Start provides additional descriptions about the binary prov:wasStartedBy relation from some started prov:Activity to an prov:Entity that started it. For example, :foot_race prov:wasStartedBy :bang; prov:qualifiedStart [ a prov:Start; prov:entity :bang; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ] ."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Start",
   :rdfs/subClassOf [:prov/EntityInfluence :prov/InstantaneousEvent]})

(def Submit
  "Activity that identifies the issuance (e.g., publication) of a resource."
  {:prov/definition
   {:rdf/language "en",
    :rdf/value
    "Activity that identifies the issuance (e.g., publication) of a resource. "},
   :rdf/about :prov/Submit,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Submit"},
   :rdfs/subClassOf :prov/Activity})

(def Usage
  "Usage is the beginning of utilizing an entity by an activity. Before usage, the activity had not begun to utilize this entity and could not have been affected by the entity."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Usage is the beginning of utilizing an entity by an activity. Before usage, the activity had not begun to utilize this entity and could not have been affected by the entity."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Usage",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Usage",
   :prov/unqualifiedForm :prov/used,
   :rdf/about :prov/Usage,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Usage provides additional descriptions about the binary prov:used relation from some prov:Activity to an prov:Entity that it used. For example, :keynote prov:used :podium; prov:qualifiedUsage [ a prov:Usage; prov:entity :podium; :foo :bar ]."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Usage",
   :rdfs/subClassOf [:prov/InstantaneousEvent :prov/EntityInfluence]})

(def actedOnBehalfOf
  "An object property to express the accountability of an agent towards another agent. The subordinate agent acted on behalf of the responsible agent in an actual activity."
  {:owl/propertyChainAxiom [:prov/qualifiedDelegation :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/inverse "hadDelegate",
   :prov/qualifiedForm [:prov/qualifiedDelegation :prov/Delegation],
   :rdf/about :prov/actedOnBehalfOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object property to express the accountability of an agent towards another agent. The subordinate agent acted on behalf of the responsible agent in an actual activity. "},
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "actedOnBehalfOf",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def activity
  {:prov/category "qualified",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple."},
   :prov/editorsDefinition
   "The prov:activity property references an prov:Activity which influenced a resource. This property applies to an prov:ActivityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse "activityOfInfluence",
   :rdf/about :prov/activity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/ActivityInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "activity",
   :rdfs/range :prov/Activity,
   :rdfs/subPropertyOf :prov/influencer})

(def activityOfInfluence
  {:owl/inverseOf    :prov/activity,
   :rdf/about        :prov/activityOfInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "activityOfInfluence"})

(def agent
  {:prov/category "qualified",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple."},
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "The prov:agent property references an prov:Agent which influenced a resource. This property applies to an prov:AgentInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent."},
   :prov/inverse "agentOfInfluence",
   :rdf/about :prov/agent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/AgentInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "agent",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/influencer})

(def agentOfInfluence
  {:owl/inverseOf    :prov/agent,
   :rdf/about        :prov/agentOfInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "agentOfInfluence"})

(def alternateOf
  "Two alternate entities present aspects of the same thing. These aspects may be the same or different, and the alternate entities may or may not overlap in time."
  {:owl/inverseOf :prov/alternateOf,
   :prov/category "expanded",
   :prov/component "alternate",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Two alternate entities present aspects of the same thing. These aspects may be the same or different, and the alternate entities may or may not overlap in time."},
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-alternate",
   :prov/inverse "alternateOf",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-alternate",
   :rdf/about :prov/alternateOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov-o-inverses#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/label "alternateOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso :prov/specializationOf})

(def aq
  {:rdf/about          :prov/aq,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/isDefinedBy   ["http://www.w3.org/ns/prov#"
                        "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def asInBundle
  "prov:asInBundle is used to specify which bundle the general entity of a prov:mentionOf property is described.  When :x prov:mentionOf :y and :y is described in Bundle :b, the triple :x prov:asInBundle :b is also asserted to cite the Bundle in which :y was described."
  {:prov/inverse "contextOf",
   :prov/sharesDefinitionWith :prov/mentionOf,
   :rdf/about :prov/asInBundle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "prov:asInBundle is used to specify which bundle the general entity of a prov:mentionOf property is described.\n\nWhen :x prov:mentionOf :y and :y is described in Bundle :b, the triple :x prov:asInBundle :b is also asserted to cite the Bundle in which :y was described."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-links#",
   :rdfs/label "asInBundle",
   :rdfs/range :prov/Bundle})

(def atLocation
  "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
  {:prov/category "expanded",
   :prov/editorialNote
   [{:rdf/language "en",
     :rdf/value
     "This property is not functional because the many values could be at a variety of granularies (In this building, in this room, in that chair)."}
    {:rdf/language "en",
     :rdf/value
     "The naming of prov:atLocation parallels prov:atTime, and is not named prov:hadLocation to avoid conflicting with the convention that prov:had* properties are used on prov:Influence classes."}],
   :prov/inverse "locationOf",
   :prov/sharesDefinitionWith :prov/Location,
   :rdf/about :prov/atLocation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value    "The Location of any resource."}
    "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain {:owl/unionOf [:prov/Activity
                               :prov/Agent
                               :prov/Entity
                               :prov/InstantaneousEvent],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "atLocation",
   :rdfs/range :prov/Location})

(def atTime
  "The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/sharesDefinitionWith :prov/InstantaneousEvent,
   :prov/unqualifiedForm [:prov/invalidatedAtTime
                          :prov/startedAtTime
                          :prov/generatedAtTime
                          :prov/endedAtTime],
   :rdf/about :prov/atTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime."},
   :rdfs/domain :prov/InstantaneousEvent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "atTime",
   :rdfs/range :xsd/dateTime})

(def category
  "Classify prov-o terms into three categories, including 'starting-point', 'qualifed', and 'extended'. This classification is used by the prov-o html document to gently introduce prov-o terms to its users."
  {:rdf/about :prov/category,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Classify prov-o terms into three categories, including 'starting-point', 'qualifed', and 'extended'. This classification is used by the prov-o html document to gently introduce prov-o terms to its users. "},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"]})

(def component
  "Classify prov-o terms into six components according to prov-dm, including 'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', and 'entities-activities'. This classification is used so that readers of prov-o specification can find its correspondence with the prov-dm specification."
  {:rdf/about :prov/component,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Classify prov-o terms into six components according to prov-dm, including 'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', and 'entities-activities'. This classification is used so that readers of prov-o specification can find its correspondence with the prov-dm specification."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"]})

(def constraints
  "A reference to the principal section of the PROV-CONSTRAINTS document that describes this concept."
  {:rdf/about :prov/constraints,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to the principal section of the PROV-CONSTRAINTS document that describes this concept."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def contributed
  {:owl/inverseOf    :prov/wasAttributedTo,
   :rdf/about        :prov/contributed,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "contributed"})

(def definition
  "A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept expressed with this OWL term."
  {:rdf/about :prov/definition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept expressed with this OWL term."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"]})

(def derivedByInsertionFrom
  "The dictionary was derived from the other by insertion. prov:qualifiedInsertion shows details of the insertion, in particular the inserted key-entity pairs."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "The dictionary was derived from the other by insertion. prov:qualifiedInsertion shows details of the insertion, in particular the inserted key-entity pairs.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-insertion",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-insertion",
   :rdf/about :prov/derivedByInsertionFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Dictionary,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "derivedByInsertionFrom",
   :rdfs/range :prov/Dictionary,
   :rdfs/subPropertyOf :prov/wasDerivedFrom})

(def derivedByRemovalFrom
  "The dictionary was derived from the other by removal. prov:qualifiedRemoval shows details of the removal, in particular the removed key-entity pairs."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "The dictionary was derived from the other by removal. prov:qualifiedRemoval shows details of the removal, in particular the removed key-entity pairs.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-removal",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-removal",
   :rdf/about :prov/derivedByRemovalFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Dictionary,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "derivedByRemovalFrom",
   :rdfs/range :prov/Dictionary,
   :rdfs/subPropertyOf :prov/wasDerivedFrom})

(def describesService
  "relates a generic provenance query service resource (type prov:ServiceDescription) to a specific query service description (e.g. a prov:DirectQueryService or a sd:Service)."
  {:prov/aq
   "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/rovenance-query-service-description",
   :prov/category "access-and-query",
   :prov/inverse "serviceDescribedBy",
   :rdf/about :prov/describesService,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "relates a generic provenance query service resource (type prov:ServiceDescription) to a specific query service description (e.g. a prov:DirectQueryService or a sd:Service)."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "describesService"})

(def dictionary
  "The property used by a prov:Insertion and prov:Removal to cite the prov:Dictionary that was prov:derivedByInsertionFrom or prov:derivedByRemovalFrom another dictionary."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "The property used by a prov:Insertion and prov:Removal to cite the prov:Dictionary that was prov:derivedByInsertionFrom or prov:derivedByRemovalFrom another dictionary.",
   :prov/dm
   ["http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-removal"
    "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-insertion"],
   :prov/n
   ["http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-removal"
    "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-insertion"],
   :rdf/about :prov/dictionary,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:prov/Insertion :prov/Removal],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "dictionary",
   :rdfs/range :prov/Dictionary,
   :rdfs/subPropertyOf :prov/entity})

(def dm
  "A reference to the principal section of the PROV-DM document that describes this concept."
  {:rdf/about :prov/dm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to the principal section of the PROV-DM document that describes this concept."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def editorialNote
  "A note by the OWL development team about how this term expresses the PROV-DM concept, or how it should be used in context of semantic web or linked data."
  {:rdf/about :prov/editorialNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A note by the OWL development team about how this term expresses the PROV-DM concept, or how it should be used in context of semantic web or linked data."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"]})

(def editorsDefinition
  "When the prov-o term does not have a definition drawn from prov-dm, and the prov-o editor provides one."
  {:rdf/about :prov/editorsDefinition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "When the prov-o term does not have a definition drawn from prov-dm, and the prov-o editor provides one."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :prov/definition})

(def ended
  {:owl/inverseOf    :prov/wasEndedBy,
   :rdf/about        :prov/ended,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "ended"})

(def endedAtTime
  "The time at which an activity ended. See also prov:startedAtTime."
  {:prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedEnd o prov:atTime) rdfs:subPropertyOf prov:endedAtTime."},
   :prov/qualifiedForm [:prov/End :prov/atTime],
   :rdf/about :prov/endedAtTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an activity ended. See also prov:startedAtTime."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "endedAtTime",
   :rdfs/range :xsd/dateTime})

(def entity
  {:prov/category "qualified",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple."},
   :prov/editorsDefinition
   "The prov:entity property references an prov:Entity which influenced a resource. This property applies to an prov:EntityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse "entityOfInfluence",
   :rdf/about :prov/entity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/EntityInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "entity",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influencer})

(def entityOfInfluence
  {:owl/inverseOf    :prov/entity,
   :rdf/about        :prov/entityOfInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "entityOfInfluence"})

(def generalizationOf
  {:owl/inverseOf    :prov/specializationOf,
   :rdf/about        :prov/generalizationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "generalizationOf"})

(def generated
  {:owl/inverseOf :prov/wasGeneratedBy,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "prov:generated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions."},
   :prov/inverse "wasGeneratedBy",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/about :prov/generated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov-o-inverses#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/label "generated",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influenced})

(def generatedAsDerivation
  {:owl/inverseOf    :prov/hadGeneration,
   :rdf/about        :prov/generatedAsDerivation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "generatedAsDerivation"})

(def generatedAtTime
  "The time at which an entity was completely created and is available for use."
  {:prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedGeneration o prov:atTime) rdfs:subPropertyOf prov:generatedAtTime."},
   :prov/qualifiedForm [:prov/atTime :prov/Generation],
   :rdf/about :prov/generatedAtTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an entity was completely created and is available for use."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "generatedAtTime",
   :rdfs/range :xsd/dateTime})

(def hadActivity
  "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The multiple rdfs:domain assertions are intended. One is simpler and works for OWL-RL, the union is more specific but is not recognized by OWL-RL."},
   :prov/inverse "wasActivityOfInfluence",
   :prov/sharesDefinitionWith :prov/Activity,
   :rdf/about :prov/hadActivity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The _optional_ Activity of an Influence, which used, generated, invalidated, or was the responsibility of some Entity. This property is _not_ used by ActivityInfluence (use prov:activity instead)."}
    "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain
   [:prov/Influence
    {:owl/unionOf [:prov/Delegation :prov/Derivation :prov/End :prov/Start],
     :rdf/type    :owl/Class}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadActivity",
   :rdfs/range :prov/Activity})

(def hadDelegate
  {:owl/inverseOf    :prov/actedOnBehalfOf,
   :rdf/about        :prov/hadDelegate,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "hadDelegate"})

(def hadDerivation
  {:owl/inverseOf    :prov/wasDerivedFrom,
   :rdf/about        :prov/hadDerivation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "hadDerivation"})

(def hadDictionaryMember
  "Describes the key-entity pair that was member of a prov:Dictionary. A dictionary can have multiple members."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "Describes the key-entity pair that was member of a prov:Dictionary. A dictionary can have multiple members.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-membership",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-membership",
   :rdf/about :prov/hadDictionaryMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Dictionary,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "hadDictionaryMember",
   :rdfs/range :prov/KeyEntityPair})

(def hadGeneration
  "The _optional_ Generation involved in an Entity's Derivation."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "generatedAsDerivation",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/about :prov/hadGeneration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The _optional_ Generation involved in an Entity's Derivation."},
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadGeneration",
   :rdfs/range :prov/Generation})

(def hadInfluence
  {:owl/inverseOf    :prov/influencer,
   :rdf/about        :prov/hadInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "hadInfluence"})

(def hadMember
  {:prov/category      "expanded",
   :prov/component     "expanded",
   :prov/inverse       "wasMemberOf",
   :prov/sharesDefinitionWith :prov/Collection,
   :rdf/about          :prov/hadMember,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :prov/Collection,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/prov-o#",
   :rdfs/label         "hadMember",
   :rdfs/range         :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def hadPlan
  "The _optional_ Plan adopted by an Agent in Association with some Activity. Plan specifications are out of the scope of this specification."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "wasPlanOf",
   :prov/sharesDefinitionWith :prov/Plan,
   :rdf/about :prov/hadPlan,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The _optional_ Plan adopted by an Agent in Association with some Activity. Plan specifications are out of the scope of this specification."},
   :rdfs/domain :prov/Association,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadPlan",
   :rdfs/range :prov/Plan})

(def hadPrimarySource
  {:owl/propertyChainAxiom [:prov/qualifiedPrimarySource :prov/entity],
   :prov/category          "expanded",
   :prov/component         "derivations",
   :prov/inverse           "wasPrimarySourceOf",
   :prov/qualifiedForm     [:prov/PrimarySource :prov/qualifiedPrimarySource],
   :rdf/about              :prov/hadPrimarySource,
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       "http://www.w3.org/ns/prov-o#",
   :rdfs/label             "hadPrimarySource",
   :rdfs/range             :prov/Entity,
   :rdfs/subPropertyOf     :prov/wasDerivedFrom})

(def hadRevision
  {:owl/inverseOf    :prov/wasRevisionOf,
   :rdf/about        :prov/hadRevision,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "hadRevision"})

(def hadRole
  "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "prov:hadRole references the Role (i.e. the function of an entity with respect to an activity), in the context of an instantaneous usage, generation, association, start, and end."},
   :prov/inverse "wasRoleIn",
   :prov/sharesDefinitionWith :prov/Role,
   :rdf/about :prov/hadRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The _optional_ Role that an Entity assumed in the context of an Activity. For example, :baking prov:used :spoon; prov:qualified [ a prov:Usage; prov:entity :spoon; prov:hadRole roles:mixing_implement ]."}
    "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain [:prov/Influence
                 {:owl/unionOf [:prov/Association :prov/InstantaneousEvent],
                  :rdf/type    :owl/Class}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadRole",
   :rdfs/range :prov/Role})

(def hadUsage
  "The _optional_ Usage involved in an Entity's Derivation."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "wasUsedInDerivation",
   :prov/sharesDefinitionWith :prov/Usage,
   :rdf/about :prov/hadUsage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The _optional_ Usage involved in an Entity's Derivation."},
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/label "hadUsage",
   :rdfs/range :prov/Usage})

(def has_anchor
  "Indicates anchor URI for a potentially dynamic resource instance."
  {:prov/aq
   "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/#resource-represented-as-html",
   :prov/category "access-and-query",
   :prov/inverse "anchorOf",
   :rdf/about :prov/has_anchor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates anchor URI for a potentially dynamic resource instance."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "has_anchor"})

(def has_provenance
  "Indicates a provenance-URI for a resource; the resource identified by this property presents a provenance record about its subject or anchor resource."
  {:prov/aq
   "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/#resource-represented-as-html",
   :prov/category "access-and-query",
   :prov/inverse "provenanceOf",
   :rdf/about :prov/has_provenance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates a provenance-URI for a resource; the resource identified by this property presents a provenance record about its subject or anchor resource."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "has_provenance"})

(def has_query_service
  "Indicates a provenance query service that can access provenance related to its subject or anchor resource."
  {:prov/aq "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/",
   :prov/category "access-and-query",
   :prov/inverse "provenanceQueryServiceOf",
   :rdf/about :prov/has_query_service,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates a provenance query service that can access provenance related to its subject or anchor resource."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "hasProvenanceService"})

(def influenced
  {:owl/inverseOf    :prov/wasInfluencedBy,
   :prov/category    "expanded",
   :prov/component   "agents-responsibility",
   :prov/inverse     "wasInfluencedBy",
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/about        :prov/influenced,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov-o-inverses#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/label       "influenced"})

(def influencer
  "Subproperties of prov:influencer are used to cite the object of an unqualified PROV-O triple whose predicate is a subproperty of prov:wasInfluencedBy (e.g. prov:used, prov:wasGeneratedBy). prov:influencer is used much like rdf:object is used."
  {:prov/category "qualified",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property and its subproperties are used in the same way as the rdf:object property, i.e. to reference the object of an unqualified prov:wasInfluencedBy or prov:influenced triple."},
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "This property is used as part of the qualified influence pattern. Subclasses of prov:Influence use these subproperties to reference the resource (Entity, Agent, or Activity) whose influence is being qualified."},
   :prov/inverse "hadInfluence",
   :rdf/about :prov/influencer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Subproperties of prov:influencer are used to cite the object of an unqualified PROV-O triple whose predicate is a subproperty of prov:wasInfluencedBy (e.g. prov:used, prov:wasGeneratedBy). prov:influencer is used much like rdf:object is used."},
   :rdfs/domain :prov/Influence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "influencer",
   :rdfs/range :owl/Thing})

(def informed
  {:owl/inverseOf    :prov/wasInformedBy,
   :rdf/about        :prov/informed,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "informed"})

(def insertedKeyEntityPair
  "An object property to refer to the prov:KeyEntityPair inserted into a prov:Dictionary."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "An object property to refer to the prov:KeyEntityPair inserted into a prov:Dictionary.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-insertion",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-insertion",
   :rdf/about :prov/insertedKeyEntityPair,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Insertion,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "insertedKeyEntityPair",
   :rdfs/range :prov/KeyEntityPair})

(def invalidated
  {:owl/inverseOf :prov/wasInvalidatedBy,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "prov:invalidated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions."},
   :prov/inverse "wasInvalidatedBy",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :rdf/about :prov/invalidated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov-o-inverses#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/label "invalidated",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influenced})

(def invalidatedAtTime
  "The time at which an entity was invalidated (i.e., no longer usable)."
  {:prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedInvalidation o prov:atTime) rdfs:subPropertyOf prov:invalidatedAtTime."},
   :prov/qualifiedForm [:prov/atTime :prov/Invalidation],
   :rdf/about :prov/invalidatedAtTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an entity was invalidated (i.e., no longer usable)."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "invalidatedAtTime",
   :rdfs/range :xsd/dateTime})

(def inverse
  "PROV-O does not define all property inverses. The directionalities defined in PROV-O should be given preference over those not defined. However, if users wish to name the inverse of a PROV-O property, the local name given by prov:inverse should be used."
  {:rdf/about :prov/inverse,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "PROV-O does not define all property inverses. The directionalities defined in PROV-O should be given preference over those not defined. However, if users wish to name the inverse of a PROV-O property, the local name given by prov:inverse should be used."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/seeAlso "http://www.w3.org/TR/prov-o/#names-of-inverse-properties"})

(def locationOf
  {:owl/inverseOf    :prov/atLocation,
   :rdf/about        :prov/locationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "locationOf"})

(def mentionOf
  "prov:mentionOf is used to specialize an entity as described in another bundle. It is to be used in conjuction with prov:asInBundle.  prov:asInBundle is used to cite the Bundle in which the generalization was mentioned."
  {:prov/inverse "hadMention",
   :rdf/about :prov/mentionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "prov:mentionOf is used to specialize an entity as described in another bundle. It is to be used in conjuction with prov:asInBundle.\n\nprov:asInBundle is used to cite the Bundle in which the generalization was mentioned."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-links#",
   :rdfs/label "mentionOf",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/specializationOf})

(def n
  {:rdf/about :prov/n,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "A reference to the principal section of the PROV-M document that describes this concept."}
    {:rdf/language "en",
     :rdf/value
     "A reference to the principal section of the PROV-DM document that describes this concept."}],
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def order
  "The position that this OWL term should be listed within documentation. The scope of the documentation (e.g., among all terms, among terms within a prov:category, among properties applying to a particular class, etc.) is unspecified."
  {:rdf/about :prov/order,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The position that this OWL term should be listed within documentation. The scope of the documentation (e.g., among all terms, among terms within a prov:category, among properties applying to a particular class, etc.) is unspecified."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#"})

(def pairEntity
  "The value of a KeyEntityPair."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition "The value of a KeyEntityPair.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-membership",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-membership",
   :rdf/about :prov/pairEntity,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/domain :prov/KeyEntityPair,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "pairKey",
   :rdfs/range :prov/Entity})

(def pairKey
  "The key of a KeyEntityPair, which is an element of a prov:Dictionary."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "The key of a KeyEntityPair, which is an element of a prov:Dictionary.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-membership",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-membership",
   :rdf/about :prov/pairKey,
   :rdf/type [:owl/DatatypeProperty :owl/FunctionalProperty],
   :rdfs/domain :prov/KeyEntityPair,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "pairKey",
   :rdfs/range :rdfs/Literal})

(def pingback
  "Relates a resource to a provenance pingback service that may receive additional provenance links about the resource."
  {:prov/aq
   "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/#provenance-pingback",
   :prov/category "access-and-query",
   :rdf/about :prov/pingback,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a resource to a provenance pingback service that may receive additional provenance links about the resource."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "provenance pingback"})

(def provenanceUriTemplate
  "Relates a provenance service to a URI template string for constructing provenance-URIs."
  {:prov/aq "http://www.w3.org/TR/2013/NOTE-prov-aq-20130430/",
   :prov/category "access-and-query",
   :rdf/about :prov/provenanceUriTemplate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates a provenance service to a URI template string for constructing provenance-URIs."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "provenanceUriTemplate"})

(def qualifiedAssociation
  "If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the Association using prov:qualifiedAssociation [ a prov:Association;  prov:agent :ag; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedAssociationOf",
   :prov/sharesDefinitionWith :prov/Association,
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/about :prov/qualifiedAssociation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the Association using prov:qualifiedAssociation [ a prov:Association;  prov:agent :ag; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedAssociation",
   :rdfs/range :prov/Association,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedAssociationOf
  {:owl/inverseOf    :prov/qualifiedAssociation,
   :rdf/about        :prov/qualifiedAssociationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedAssociationOf"})

(def qualifiedAttribution
  "If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it was influenced using prov:qualifiedAttribution [ a prov:Attribution;  prov:agent :ag; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedAttributionOf",
   :prov/sharesDefinitionWith :prov/Attribution,
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/about :prov/qualifiedAttribution,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it was influenced using prov:qualifiedAttribution [ a prov:Attribution;  prov:agent :ag; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedAttribution",
   :rdfs/range :prov/Attribution,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedAttributionOf
  {:owl/inverseOf    :prov/qualifiedAttribution,
   :rdf/about        :prov/qualifiedAttributionOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedAttributionOf"})

(def qualifiedCommunication
  "If this Activity prov:wasInformedBy Activity :a, then it can qualify how it was influenced using prov:qualifiedCommunication [ a prov:Communication;  prov:activity :a; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedCommunicationOf",
   :prov/qualifiedForm :prov/Communication,
   :prov/sharesDefinitionWith :prov/Communication,
   :rdf/about :prov/qualifiedCommunication,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasInformedBy Activity :a, then it can qualify how it was influenced using prov:qualifiedCommunication [ a prov:Communication;  prov:activity :a; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedCommunication",
   :rdfs/range :prov/Communication,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedCommunicationOf
  {:owl/inverseOf    :prov/qualifiedCommunication,
   :rdf/about        :prov/qualifiedCommunicationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedCommunicationOf"})

(def qualifiedDelegation
  "If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with prov:qualifiedResponsibility [ a prov:Responsibility;  prov:agent :ag; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedDelegationOf",
   :prov/sharesDefinitionWith :prov/Delegation,
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/about :prov/qualifiedDelegation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with prov:qualifiedResponsibility [ a prov:Responsibility;  prov:agent :ag; :foo :bar ]."},
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedDelegation",
   :rdfs/range :prov/Delegation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDelegationOf
  {:owl/inverseOf    :prov/qualifiedDelegation,
   :rdf/about        :prov/qualifiedDelegationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedDelegationOf"})

(def qualifiedDerivation
  "If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was derived using prov:qualifiedDerivation [ a prov:Derivation;  prov:entity :e; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedDerivationOf",
   :prov/sharesDefinitionWith :prov/Derivation,
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/about :prov/qualifiedDerivation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was derived using prov:qualifiedDerivation [ a prov:Derivation;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedDerivation",
   :rdfs/range :prov/Derivation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDerivationOf
  {:owl/inverseOf    :prov/qualifiedDerivation,
   :rdf/about        :prov/qualifiedDerivationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedDerivationOf"})

(def qualifiedEnd
  "If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was ended using prov:qualifiedEnd [ a prov:End;  prov:entity :e1; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedEndOf",
   :prov/sharesDefinitionWith :prov/End,
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/about :prov/qualifiedEnd,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was ended using prov:qualifiedEnd [ a prov:End;  prov:entity :e1; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedEnd",
   :rdfs/range :prov/End,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedEndOf
  {:owl/inverseOf    :prov/qualifiedEnd,
   :rdf/about        :prov/qualifiedEndOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedEndOf"})

(def qualifiedForm
  "This annotation property links a subproperty of prov:wasInfluencedBy with the subclass of prov:Influence and the qualifying property that are used to qualify it.   Example annotation:      prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, prov:Generation .  Then this unqualified assertion:      :entity1 prov:wasGeneratedBy :activity1 .  can be qualified by adding:     :entity1 prov:qualifiedGeneration :entity1Gen .    :entity1Gen         a prov:Generation, prov:Influence;        prov:activity :activity1;        :customValue 1337 .  Note how the value of the unqualified influence (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity (or prov:entity, or prov:agent) property on the influence class."
  {:rdf/about :prov/qualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This annotation property links a subproperty of prov:wasInfluencedBy with the subclass of prov:Influence and the qualifying property that are used to qualify it. \n\nExample annotation:\n\n    prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, prov:Generation .\n\nThen this unqualified assertion:\n\n    :entity1 prov:wasGeneratedBy :activity1 .\n\ncan be qualified by adding:\n\n   :entity1 prov:qualifiedGeneration :entity1Gen .\n   :entity1Gen \n       a prov:Generation, prov:Influence;\n       prov:activity :activity1;\n       :customValue 1337 .\n\nNote how the value of the unqualified influence (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity (or prov:entity, or prov:agent) property on the influence class."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def qualifiedGeneration
  "If this Activity prov:generated Entity :e, then it can qualify how it performed the Generation using prov:qualifiedGeneration [ a prov:Generation;  prov:entity :e; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedGenerationOf",
   :prov/sharesDefinitionWith :prov/Generation,
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/about :prov/qualifiedGeneration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:generated Entity :e, then it can qualify how it performed the Generation using prov:qualifiedGeneration [ a prov:Generation;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedGeneration",
   :rdfs/range :prov/Generation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedGenerationOf
  {:owl/inverseOf    :prov/qualifiedGeneration,
   :rdf/about        :prov/qualifiedGenerationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedGenerationOf"})

(def qualifiedInfluence
  "Because prov:qualifiedInfluence is a broad relation, the more specific relations (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be used when applicable."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedInfluenceOf",
   :prov/sharesDefinitionWith :prov/Influence,
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/about :prov/qualifiedInfluence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Because prov:qualifiedInfluence is a broad relation, the more specific relations (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be used when applicable."},
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedInfluence",
   :rdfs/range :prov/Influence})

(def qualifiedInfluenceOf
  {:owl/inverseOf    :prov/qualifiedInfluence,
   :rdf/about        :prov/qualifiedInfluenceOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedInfluenceOf"})

(def qualifiedInsertion
  "The dictionary was derived from the other by insertion. prov:qualifiedInsertion shows details of the insertion, in particular the inserted key-entity pairs."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "The dictionary was derived from the other by insertion. prov:qualifiedInsertion shows details of the insertion, in particular the inserted key-entity pairs.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-insertion",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-insertion",
   :rdf/about :prov/qualifiedInsertion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Dictionary,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "qualifiedInsertion",
   :rdfs/range :prov/Insertion,
   :rdfs/subPropertyOf :prov/qualifiedDerivation})

(def qualifiedInvalidation
  "If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation;  prov:activity :a; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedInvalidationOf",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/about :prov/qualifiedInvalidation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation;  prov:activity :a; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedInvalidation",
   :rdfs/range :prov/Invalidation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedInvalidationOf
  {:owl/inverseOf    :prov/qualifiedInvalidation,
   :rdf/about        :prov/qualifiedInvalidationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedInvalidationOf"})

(def qualifiedPrimarySource
  "If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedSourceOf",
   :prov/sharesDefinitionWith :prov/PrimarySource,
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/about :prov/qualifiedPrimarySource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedPrimarySource",
   :rdfs/range :prov/PrimarySource,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedQuotation
  "If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using prov:qualifiedQuotation [ a prov:Quotation;  prov:entity :e; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedQuotationOf",
   :prov/sharesDefinitionWith :prov/Quotation,
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/about :prov/qualifiedQuotation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using prov:qualifiedQuotation [ a prov:Quotation;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedQuotation",
   :rdfs/range :prov/Quotation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedQuotationOf
  {:owl/inverseOf    :prov/qualifiedQuotation,
   :rdf/about        :prov/qualifiedQuotationOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedQuotationOf"})

(def qualifiedRemoval
  "The dictionary was derived from the other by removal. prov:qualifiedRemoval shows details of the removal, in particular the removed keys."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition
   "The dictionary was derived from the other by removal. prov:qualifiedRemoval shows details of the removal, in particular the removed keys.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-removal",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-removal",
   :rdf/about :prov/qualifiedRemoval,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Dictionary,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "qualifiedRemoval",
   :rdfs/range :prov/Removal,
   :rdfs/subPropertyOf :prov/qualifiedDerivation})

(def qualifiedRevision
  "If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was revised using prov:qualifiedRevision [ a prov:Revision;  prov:entity :e; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "revisedEntity",
   :prov/sharesDefinitionWith :prov/Revision,
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/about :prov/qualifiedRevision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was revised using prov:qualifiedRevision [ a prov:Revision;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedRevision",
   :rdfs/range :prov/Revision,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedSourceOf
  {:owl/inverseOf    :prov/qualifiedPrimarySource,
   :rdf/about        :prov/qualifiedSourceOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedSourceOf"})

(def qualifiedStart
  "If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it was started using prov:qualifiedStart [ a prov:Start;  prov:entity :e1; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedStartOf",
   :prov/sharesDefinitionWith :prov/Start,
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/about :prov/qualifiedStart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it was started using prov:qualifiedStart [ a prov:Start;  prov:entity :e1; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedStart",
   :rdfs/range :prov/Start,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedStartOf
  {:owl/inverseOf    :prov/qualifiedStart,
   :rdf/about        :prov/qualifiedStartOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedStartOf"})

(def qualifiedUsage
  "If this Activity prov:used Entity :e, then it can qualify how it used it using prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ]."
  {:prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedUsingActivity",
   :prov/sharesDefinitionWith :prov/Usage,
   :prov/unqualifiedForm :prov/used,
   :rdf/about :prov/qualifiedUsage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:used Entity :e, then it can qualify how it used it using prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedUsage",
   :rdfs/range :prov/Usage,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedUsingActivity
  {:owl/inverseOf    :prov/qualifiedUsage,
   :rdf/about        :prov/qualifiedUsingActivity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "qualifiedUsingActivity"})

(def quotedAs
  {:owl/inverseOf    :prov/wasQuotedFrom,
   :rdf/about        :prov/quotedAs,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "quotedAs"})

(def removedKey
  "The key removed in a Removal."
  {:prov/category "collections",
   :prov/component "collections",
   :prov/constraints
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#dictionary-constraints",
   :prov/definition "The key removed in a Removal.",
   :prov/dm
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#term-dictionary-removal",
   :prov/n
   "http://www.w3.org/TR/2013/NOTE-prov-dictionary-20130430/#expression-dictionary-removal",
   :rdf/about :prov/removedKey,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :prov/Removal,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov#",
   :rdfs/label "removedKey",
   :rdfs/range :rdfs/Literal})

(def revisedEntity
  {:owl/inverseOf    :prov/qualifiedRevision,
   :rdf/about        :prov/revisedEntity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "revisedEntity"})

(def sharesDefinitionWith
  {:rdf/about          :prov/sharesDefinitionWith,
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/isDefinedBy   ["http://www.w3.org/ns/prov#"
                        "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def specializationOf
  "An entity that is a specialization of another shares all aspects of the latter, and additionally presents more specific aspects of the same thing as the latter. In particular, the lifetime of the entity being specialized contains that of any specialization. Examples of aspects include a time period, an abstraction, and a context associated with the entity."
  {:prov/category "expanded",
   :prov/component "alternate",
   :prov/constraints
   ["http://www.w3.org/TR/2012/WD-prov-dm-20120703/prov-constraints.html#prov-dm-constraints-fig"
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"],
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An entity that is a specialization of another shares all aspects of the latter, and additionally presents more specific aspects of the same thing as the latter. In particular, the lifetime of the entity being specialized contains that of any specialization. Examples of aspects include a time period, an abstraction, and a context associated with the entity."},
   :prov/dm
   ["http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-specialization"
    "http://www.w3.org/TR/2012/WD-prov-dm-20120703/prov-dm.html#term-specialization"],
   :prov/inverse "generalizationOf",
   :prov/n
   ["http://www.w3.org/TR/2012/WD-prov-dm-20120703/prov-n.html#expression-specialization"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-specialization"],
   :rdf/about :prov/specializationOf,
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/label "specializationOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso :prov/alternateOf,
   :rdfs/subPropertyOf [:owl/topObjectProperty :prov/alternateOf]})

(def started
  {:owl/inverseOf    :prov/wasStartedBy,
   :rdf/about        :prov/started,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "started"})

(def startedAtTime
  "The time at which an activity started. See also prov:endedAtTime."
  {:prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedStart o prov:atTime) rdfs:subPropertyOf prov:startedAtTime."},
   :prov/qualifiedForm [:prov/Start :prov/atTime],
   :rdf/about :prov/startedAtTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an activity started. See also prov:endedAtTime."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "startedAtTime",
   :rdfs/range :xsd/dateTime})

(def todo
  {:rdf/about :prov/todo,
   :rdf/type  :owl/AnnotationProperty})

(def unqualifiedForm
  "Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm to indicate the property used to assert an unqualified provenance relation."
  {:rdf/about :prov/unqualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm to indicate the property used to assert an unqualified provenance relation."},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def used
  "A prov:Entity that was used by this prov:Activity. For example, :baking prov:used :spoon, :egg, :oven ."
  {:owl/propertyChainAxiom [:prov/qualifiedUsage :prov/entity],
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/inverse "wasUsedBy",
   :prov/qualifiedForm [:prov/Usage :prov/qualifiedUsage],
   :rdf/about :prov/used,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A prov:Entity that was used by this prov:Activity. For example, :baking prov:used :spoon, :egg, :oven ."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "used",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def value
  "Provides a value that is a direct representation of an entity."
  {:prov/category "expanded",
   :prov/component "entities-activities",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Provides a value that is a direct representation of an entity."},
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-value",
   :prov/editorialNote
   [{:rdf/language "en",
     :rdf/value
     "This property serves the same purpose as rdf:value, but has been reintroduced to avoid some of the definitional ambiguity in the RDF specification (specifically, 'may be used in describing structured values')."}
    "The editor's definition comes from http://www.w3.org/TR/rdf-primer/#rdfvalue"],
   :rdf/about :prov/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "value"})

(def wasActivityOfInfluence
  {:owl/inverseOf    :prov/hadActivity,
   :rdf/about        :prov/wasActivityOfInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasActivityOfInfluence"})

(def wasAssociateFor
  {:owl/inverseOf    :prov/wasAssociatedWith,
   :rdf/about        :prov/wasAssociateFor,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasAssociateFor"})

(def wasAssociatedWith
  "An prov:Agent that had some (unspecified) responsibility for the occurrence of this prov:Activity."
  {:owl/propertyChainAxiom [:prov/qualifiedAssociation :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/inverse "wasAssociateFor",
   :prov/qualifiedForm [:prov/Association :prov/qualifiedAssociation],
   :rdf/about :prov/wasAssociatedWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An prov:Agent that had some (unspecified) responsibility for the occurrence of this prov:Activity."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasAssociatedWith",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasAttributedTo
  "Attribution is the ascribing of an entity to an agent."
  {:owl/propertyChainAxiom [:prov/qualifiedAttribution :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/definition {:rdf/language "en",
                     :rdf/value
                     "Attribution is the ascribing of an entity to an agent."},
   :prov/inverse "contributed",
   :prov/qualifiedForm [:prov/Attribution :prov/qualifiedAttribution],
   :rdf/about :prov/wasAttributedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Attribution is the ascribing of an entity to an agent."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasAttributedTo",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasDerivedFrom
  "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."
  {:owl/propertyChainAxiom [:prov/qualifiedDerivation :prov/entity],
   :prov/category "starting-point",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."},
   :prov/inverse "hadDerivation",
   :prov/qualifiedForm [:prov/Derivation :prov/qualifiedDerivation],
   :rdf/about :prov/wasDerivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The more specific subproperties of prov:wasDerivedFrom (i.e., prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource) should be used when applicable."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasDerivedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasEndedBy
  "End is when an activity is deemed to have ended. An end may refer to an entity, known as trigger, that terminated the activity."
  {:owl/propertyChainAxiom [:prov/qualifiedEnd :prov/entity],
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/inverse "ended",
   :prov/qualifiedForm [:prov/qualifiedEnd :prov/End],
   :rdf/about :prov/wasEndedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "End is when an activity is deemed to have ended. An end may refer to an entity, known as trigger, that terminated the activity."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasEndedBy",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasGeneratedBy
  {:owl/inverseOf          :prov/generated,
   :owl/propertyChainAxiom [:prov/qualifiedGeneration :prov/activity],
   :prov/category          "starting-point",
   :prov/component         "entities-activities",
   :prov/inverse           "generated",
   :prov/qualifiedForm     [:prov/Generation :prov/qualifiedGeneration],
   :rdf/about              :prov/wasGeneratedBy,
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       ["http://www.w3.org/ns/prov-o-inverses#"
                            "http://www.w3.org/ns/prov-o#"],
   :rdfs/label             "wasGeneratedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasInfluencedBy
  "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
  {:owl/inverseOf :prov/influenced,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The sub-properties of prov:wasInfluencedBy can be elaborated in more detail using the Qualification Pattern. For example, the binary relation :baking prov:used :spoon can be qualified by asserting :baking prov:qualifiedUsage [ a prov:Usage; prov:entity :spoon; prov:atLocation :kitchen ] .\n\nSubproperties of prov:wasInfluencedBy may also be asserted directly without being qualified.\n\nprov:wasInfluencedBy should not be used without also using one of its subproperties. \n"},
   :prov/inverse "influenced",
   :prov/qualifiedForm [:prov/Influence :prov/qualifiedInfluence],
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/about :prov/wasInfluencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
    {:rdf/language "en",
     :rdf/value
     "Because prov:wasInfluencedBy is a broad relation, its more specific subproperties (e.g. prov:wasInformedBy, prov:actedOnBehalfOf, prov:wasEndedBy, etc.) should be used when applicable."}],
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/prov-o-inverses#"
                      "http://www.w3.org/ns/prov-o#"],
   :rdfs/label "wasInfluencedBy",
   :rdfs/range {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                :rdf/type    :owl/Class}})

(def wasInformedBy
  "An activity a2 is dependent on or informed by another activity a1, by way of some unspecified entity that is generated by a1 and used by a2."
  {:owl/propertyChainAxiom [:prov/qualifiedCommunication :prov/activity],
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/inverse "informed",
   :prov/qualifiedForm [:prov/qualifiedCommunication :prov/Communication],
   :rdf/about :prov/wasInformedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An activity a2 is dependent on or informed by another activity a1, by way of some unspecified entity that is generated by a1 and used by a2."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasInformedBy",
   :rdfs/range :prov/Activity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasInvalidatedBy
  {:owl/inverseOf          :prov/invalidated,
   :owl/propertyChainAxiom [:prov/qualifiedInvalidation :prov/activity],
   :prov/category          "expanded",
   :prov/component         "entities-activities",
   :prov/inverse           "invalidated",
   :prov/qualifiedForm     [:prov/qualifiedInvalidation :prov/Invalidation],
   :rdf/about              :prov/wasInvalidatedBy,
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       ["http://www.w3.org/ns/prov-o-inverses#"
                            "http://www.w3.org/ns/prov-o#"],
   :rdfs/label             "wasInvalidatedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasMemberOf
  {:owl/inverseOf    :prov/hadMember,
   :rdf/about        :prov/wasMemberOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasMemberOf"})

(def wasPlanOf
  {:owl/inverseOf    :prov/hadPlan,
   :rdf/about        :prov/wasPlanOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasPlanOf"})

(def wasPrimarySourceOf
  {:owl/inverseOf    :prov/hadPrimarySource,
   :rdf/about        :prov/wasPrimarySourceOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasPrimarySourceOf"})

(def wasQuotedFrom
  "An entity is derived from an original entity by copying, or 'quoting', some or all of it."
  {:owl/propertyChainAxiom [:prov/qualifiedQuotation :prov/entity],
   :prov/category "expanded",
   :prov/component "derivations",
   :prov/inverse "quotedAs",
   :prov/qualifiedForm [:prov/qualifiedQuotation :prov/Quotation],
   :rdf/about :prov/wasQuotedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An entity is derived from an original entity by copying, or 'quoting', some or all of it."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasQuotedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasDerivedFrom})

(def wasRevisionOf
  "A revision is a derivation that revises an entity into a revised version."
  {:owl/propertyChainAxiom [:prov/qualifiedRevision :prov/entity],
   :prov/category "expanded",
   :prov/component "derivations",
   :prov/inverse "hadRevision",
   :prov/qualifiedForm [:prov/Revision :prov/qualifiedRevision],
   :rdf/about :prov/wasRevisionOf,
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A revision is a derivation that revises an entity into a revised version."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasRevisionOf",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasDerivedFrom})

(def wasRoleIn
  {:owl/inverseOf    :prov/hadRole,
   :rdf/about        :prov/wasRoleIn,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasRoleIn"})

(def wasStartedBy
  "Start is when an activity is deemed to have started. A start may refer to an entity, known as trigger, that initiated the activity."
  {:owl/propertyChainAxiom [:prov/qualifiedStart :prov/entity],
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/inverse "started",
   :prov/qualifiedForm [:prov/qualifiedStart :prov/Start],
   :rdf/about :prov/wasStartedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Start is when an activity is deemed to have started. A start may refer to an entity, known as trigger, that initiated the activity."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasStartedBy",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasUsedBy
  {:owl/inverseOf    :prov/used,
   :rdf/about        :prov/wasUsedBy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasUsedBy"})

(def wasUsedInDerivation
  {:owl/inverseOf    :prov/hadUsage,
   :rdf/about        :prov/wasUsedInDerivation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o-inverses#",
   :rdfs/label       "wasUsedInDerivation"})