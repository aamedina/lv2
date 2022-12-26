(ns net.wikipunk.rdf.vcard
  "Ontology for vCard based on RFC6350"
  {:owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Final"},
   :rdf/about "http://www.w3.org/2006/vcard/ns",
   :rdf/ns-prefix-map {"owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "vcard" "http://www.w3.org/2006/vcard/ns#",
                       "xml"   "http://www.w3.org/XML/1998/namespace",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vcard",
   :rdfa/uri "http://www.w3.org/2006/vcard/ns#",
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Ontology for vCard based on RFC6350"},
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2010/SUBM-vcard-rdf-20100120/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ontology for vCard"}}
  (:refer-clojure :exclude [key agent class fn]))

(def Acquaintance
  {:rdf/about        :vcard/Acquaintance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Acquaintance"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Address
  "To specify the components of the delivery address for the  object"
  {:owl/equivalentClass
   {:owl/unionOf [{:owl/intersectionOf [{:owl/onProperty :vcard/country-name,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty :vcard/country-name,
                                         :rdf/type :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty     :vcard/locality,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type           :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty     :vcard/locality,
                                         :rdf/type           :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty     :vcard/postal-code,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type           :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty     :vcard/postal-code,
                                         :rdf/type           :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty     :vcard/region,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type           :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty     :vcard/region,
                                         :rdf/type           :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty :vcard/street-address,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty :vcard/street-address,
                                         :rdf/type :owl/Restriction}],
                   :rdf/type :owl/Class}],
    :rdf/type    :owl/Class},
   :rdf/about :vcard/Address,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the components of the delivery address for the  object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Address"}})

(def Agent
  {:rdf/about        :vcard/Agent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Agent"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def BBS
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/BBS,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "BBS"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Car
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Car,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Car"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Cell
  "Also called mobile telephone"
  {:rdf/about        :vcard/Cell,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Also called mobile telephone"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Cell"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Child
  {:rdf/about        :vcard/Child,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Child"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Colleague
  {:rdf/about        :vcard/Colleague,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Colleague"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Contact
  {:rdf/about        :vcard/Contact,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Contact"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coresident
  {:rdf/about        :vcard/Coresident,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Coresident"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coworker
  {:rdf/about        :vcard/Coworker,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Coworker"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Crush
  {:rdf/about        :vcard/Crush,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Crush"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Date
  {:rdf/about        :vcard/Date,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Date"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Dom
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Dom,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Dom"},
   :rdfs/subClassOf  :vcard/Type})

(def Email
  "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property."
  {:owl/deprecated true,
   :rdf/about :vcard/Email,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email"}})

(def Emergency
  {:rdf/about        :vcard/Emergency,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Emergency"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Fax
  {:rdf/about        :vcard/Fax,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Fax"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Female
  {:rdf/about        :vcard/Female,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Female"},
   :rdfs/subClassOf  :vcard/Gender})

(def Friend
  {:rdf/about        :vcard/Friend,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Friend"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Gender
  "Used for gender codes. The URI of the gender code must be used as the value for Gender."
  {:rdf/about :vcard/Gender,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for gender codes. The URI of the gender code must be used as the value for Gender."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gender"}})

(def Group
  "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group."
  {:owl/disjointWith [:vcard/Organization :vcard/Location :vcard/Individual],
   :owl/equivalentClass {:owl/intersectionOf [{:owl/onProperty :vcard/hasMember,
                                               :owl/someValuesFrom :vcard/Kind,
                                               :rdf/type :owl/Restriction}
                                              {:owl/minQualifiedCardinality 1,
                                               :owl/onClass :vcard/Kind,
                                               :owl/onProperty :vcard/hasMember,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/about :vcard/Group,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group"},
   :rdfs/subClassOf :vcard/Kind})

(def Home
  "This implies that the property is related to an individual's personal life"
  {:rdf/about :vcard/Home,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This implies that the property is related to an individual's personal life"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Home"},
   :rdfs/subClassOf :vcard/Type})

(def ISDN
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/ISDN,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ISDN"},
   :rdfs/subClassOf  :vcard/Type})

(def Individual
  "An object representing a single person or entity"
  {:owl/disjointWith [:vcard/Organization :vcard/Location],
   :rdf/about        :vcard/Individual,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An object representing a single person or entity"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Individual"},
   :rdfs/subClassOf  :vcard/Kind})

(def Internet
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Internet,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Internet"},
   :rdfs/subClassOf  :vcard/Type})

(def Intl
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Intl,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Intl"},
   :rdfs/subClassOf  :vcard/Type})

(def Kin
  {:rdf/about        :vcard/Kin,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Kin"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Kind
  "The parent class for all objects"
  {:owl/equivalentClass [:vcard/VCard
                         {:owl/minQualifiedCardinality 1,
                          :owl/onDataRange :xsd/string,
                          :owl/onProperty  :vcard/fn,
                          :rdf/type        :owl/Restriction}],
   :rdf/about           :vcard/Kind,
   :rdf/type            :owl/Class,
   :rdfs/comment        {:rdf/language "en",
                         :rdf/value    "The parent class for all objects"},
   :rdfs/isDefinedBy    "http://www.w3.org/2006/vcard/ns",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Kind"}})

(def Label
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Label,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Label"},
   :rdfs/subClassOf  :vcard/Type})

(def Location
  "An object representing a named geographical place"
  {:owl/disjointWith :vcard/Organization,
   :rdf/about        :vcard/Location,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An object representing a named geographical place"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Location"},
   :rdfs/subClassOf  :vcard/Kind})

(def Male
  {:rdf/about        :vcard/Male,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Male"},
   :rdfs/subClassOf  :vcard/Gender})

(def Me
  {:rdf/about        :vcard/Me,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Me"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Met
  {:rdf/about        :vcard/Met,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Met"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Modem
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Modem,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Modem"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Msg
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Msg,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Msg"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Muse
  {:rdf/about        :vcard/Muse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Muse"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Name
  "To specify the components of the name of the object"
  {:owl/equivalentClass
   {:owl/unionOf
    [{:owl/intersectionOf [{:owl/onProperty     :vcard/additional-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality 0,
                            :owl/onProperty     :vcard/additional-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/family-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality 1,
                            :owl/onProperty     :vcard/family-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/given-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality 1,
                            :owl/onProperty     :vcard/given-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/honorific-prefix,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality 0,
                            :owl/onProperty     :vcard/honorific-prefix,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/honorific-suffix,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality 0,
                            :owl/onProperty     :vcard/honorific-suffix,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}],
    :rdf/type :owl/Class},
   :rdf/about :vcard/Name,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "To specify the components of the name of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Name"}})

(def Neighbor
  {:rdf/about        :vcard/Neighbor,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Neighbor"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def None
  {:rdf/about        :vcard/None,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "None"},
   :rdfs/subClassOf  :vcard/Gender})

(def Organization
  "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like."
  {:rdf/about :vcard/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like.\n"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organization"},
   :rdfs/subClassOf :vcard/Kind})

(def Other
  {:rdf/about        :vcard/Other,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Other"},
   :rdfs/subClassOf  :vcard/Gender})

(def PCS
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/PCS,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "PCS"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Pager
  {:rdf/about        :vcard/Pager,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Pager"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Parcel
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Parcel,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Parcel"},
   :rdfs/subClassOf  :vcard/Type})

(def Parent
  {:rdf/about        :vcard/Parent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Parent"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Postal
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Postal,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Postal"},
   :rdfs/subClassOf  :vcard/Type})

(def Pref
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/Pref,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Pref"},
   :rdfs/subClassOf  :vcard/Type})

(def RelatedType
  "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type."
  {:rdf/about :vcard/RelatedType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relation Type"}})

(def Sibling
  {:rdf/about        :vcard/Sibling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Sibling"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Spouse
  {:rdf/about        :vcard/Spouse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Spouse"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Sweetheart
  {:rdf/about        :vcard/Sweetheart,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Sweetheart"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Tel
  "This class is deprecated. Use the hasTelephone object property."
  {:owl/deprecated true,
   :rdf/about :vcard/Tel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class is deprecated. Use the hasTelephone object property."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tel"}})

(def TelephoneType
  "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type."
  {:rdf/about :vcard/TelephoneType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Phone"}})

(def Text
  "Also called sms telephone"
  {:rdf/about        :vcard/Text,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Also called sms telephone"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Text"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def TextPhone
  {:rdf/about        :vcard/TextPhone,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Text phone"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Type
  "Used for type codes. The URI of the type code must be used as the value for Type."
  {:rdf/about :vcard/Type,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for type codes. The URI of the type code must be used as the value for Type."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Type"}})

(def Unknown
  {:rdf/about        :vcard/Unknown,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Unknown"},
   :rdfs/subClassOf  :vcard/Gender})

(def VCard
  "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)"
  {:owl/equivalentClass :vcard/Kind,
   :rdf/about :vcard/VCard,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "VCard"}})

(def Video
  {:rdf/about        :vcard/Video,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Video"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Voice
  {:rdf/about        :vcard/Voice,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Voice"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Work
  "This implies that the property is related to an individual's work place"
  {:rdf/about :vcard/Work,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This implies that the property is related to an individual's work place"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Work"},
   :rdfs/subClassOf :vcard/Type})

(def X400
  "This class is deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/X400,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "X400"},
   :rdfs/subClassOf  :vcard/Type})

(def additional-name
  "The additional name associated with the object"
  {:rdf/about        :vcard/additional-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The additional name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "additional name"},
   :rdfs/range       :xsd/string})

(def adr
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasAddress,
   :rdf/about        :vcard/adr,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "address"}})

(def agent
  "This object property has been deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/agent,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "agent"}})

(def anniversary
  "The date of marriage, or equivalent, of the object"
  {:rdf/about        :vcard/anniversary,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The date of marriage, or equivalent, of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "anniversary"},
   :rdfs/range       {:owl/unionOf [:xsd/dateTime :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def bday
  "To specify the birth date of the object"
  {:rdf/about        :vcard/bday,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "To specify the birth date of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "birth date"},
   :rdfs/range       {:owl/unionOf [:xsd/dateTime
                                    :xsd/dateTimeStamp
                                    :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def category
  "The category information about the object, also known as tags"
  {:rdf/about :vcard/category,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The category information about the object, also known as tags"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "category"},
   :rdfs/range :xsd/string})

(def class
  "This data property has been deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/class,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "class"}})

(def country-name
  "The country name associated with the address of the object"
  {:rdf/about :vcard/country-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The country name associated with the address of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "country name"},
   :rdfs/range :xsd/string})

(def email
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasEmail,
   :rdf/about        :vcard/email,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "email"}})

(def extended-address
  "This data property has been deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/extended-address,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "extended address"}})

(def family-name
  "The family name associated with the object"
  {:rdf/about        :vcard/family-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The family name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "family name"},
   :rdfs/range       :xsd/string})

(def fn
  "The formatted text corresponding to the name of the object"
  {:rdf/about :vcard/fn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The formatted text corresponding to the name of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formatted name"},
   :rdfs/range :xsd/string})

(def geo
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasGeo,
   :rdf/about        :vcard/geo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "geo"}})

(def given-name
  "The given name associated with the object"
  {:rdf/about        :vcard/given-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The given name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "given name"},
   :rdfs/range       :xsd/string})

(def hasAdditionalName
  "Used to support property parameters for the additional name data property"
  {:rdf/about :vcard/hasAdditionalName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the additional name data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has additional name"}})

(def hasAddress
  "To specify the components of the delivery address for the object"
  {:rdf/about :vcard/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the components of the delivery address for the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has address"},
   :rdfs/range :vcard/Address})

(def hasCalendarBusy
  "To specify the busy time associated with the object. (Was called FBURL in RFC6350)"
  {:rdf/about :vcard/hasCalendarBusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the busy time associated with the object. (Was called FBURL in RFC6350)"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calendar busy"}})

(def hasCalendarLink
  "To specify the calendar associated with the object. (Was called CALURI in RFC6350)"
  {:rdf/about :vcard/hasCalendarLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the calendar associated with the object. (Was called CALURI in RFC6350)"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calendar link"}})

(def hasCalendarRequest
  "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)"
  {:rdf/about :vcard/hasCalendarRequest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calendar request"}})

(def hasCategory
  "Used to support property parameters for the category data property"
  {:rdf/about :vcard/hasCategory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the category data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has category"}})

(def hasCountryName
  "Used to support property parameters for the country name data property"
  {:rdf/about :vcard/hasCountryName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the country name data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has country name"}})

(def hasEmail
  "To specify the electronic mail address for communication with the object"
  {:rdf/about :vcard/hasEmail,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the electronic mail address for communication with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has email"},
   :rdfs/range :vcard/Email})

(def hasFN
  "Used to support property parameters for the formatted name data property"
  {:rdf/about :vcard/hasFN,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the formatted name data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has formatted name"}})

(def hasFamilyName
  "Used to support property parameters for the family name data property"
  {:rdf/about :vcard/hasFamilyName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the family name data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has family name"}})

(def hasGender
  "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used."
  {:rdf/about :vcard/hasGender,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has gender"}})

(def hasGeo
  "To specify information related to the global positioning of the object. May also be used as a property parameter."
  {:rdf/about :vcard/hasGeo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify information related to the global positioning of the object. May also be used as a property parameter."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has geo"}})

(def hasGivenName
  "Used to support property parameters for the given name data property"
  {:rdf/about :vcard/hasGivenName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the given name data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has given name"}})

(def hasHonorificPrefix
  "Used to support property parameters for the honorific prefix data property"
  {:rdf/about :vcard/hasHonorificPrefix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the honorific prefix data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has honorific prefix"}})

(def hasHonorificSuffix
  "Used to support property parameters for the honorific suffix data property"
  {:rdf/about :vcard/hasHonorificSuffix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the honorific suffix data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has honorific suffix"}})

(def hasInstantMessage
  "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)"
  {:rdf/about :vcard/hasInstantMessage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has messaging"}})

(def hasKey
  "To specify a public key or authentication certificate associated with the object"
  {:owl/equivalentProperty :vcard/key,
   :rdf/about :vcard/hasKey,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a public key or authentication certificate associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has key"}})

(def hasLanguage
  "Used to support property parameters for the language data property"
  {:rdf/about :vcard/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the language data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has language"}})

(def hasLocality
  "Used to support property parameters for the locality data property"
  {:rdf/about :vcard/hasLocality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the locality data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has locality"}})

(def hasLogo
  "To specify a graphic image of a logo associated with the object"
  {:owl/equivalentProperty :vcard/logo,
   :rdf/about :vcard/hasLogo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a graphic image of a logo associated with the object "},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has logo"}})

(def hasMember
  "To include a member in the group this object represents. (This property can only be used by Group individuals)"
  {:rdf/about :vcard/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To include a member in the group this object represents. (This property can only be used by Group individuals)"},
   :rdfs/domain :vcard/Group,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has member"},
   :rdfs/range :vcard/Kind})

(def hasName
  "To specify the components of the name of the object"
  {:owl/equivalentProperty :vcard/n,
   :rdf/about        :vcard/hasName,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "To specify the components of the name of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has name"},
   :rdfs/range       :vcard/Name})

(def hasNickname
  "Used to support property parameters for the nickname data property"
  {:rdf/about :vcard/hasNickname,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the nickname data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has nickname"},
   :rdfs/seeAlso :vcard/nickname})

(def hasNote
  "Used to support property parameters for the note data property"
  {:rdf/about :vcard/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the note data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has note"}})

(def hasOrganizationName
  "Used to support property parameters for the organization name data property"
  {:rdf/about :vcard/hasOrganizationName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the organization name data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has organization name"}})

(def hasOrganizationUnit
  "Used to support property parameters for the organization unit name data property"
  {:rdf/about :vcard/hasOrganizationUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the organization unit name data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has organization unit name"}})

(def hasPhoto
  "To specify an image or photograph information that annotates some aspect of the object"
  {:owl/equivalentProperty :vcard/photo,
   :rdf/about :vcard/hasPhoto,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify an image or photograph information that annotates some aspect of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has photo"}})

(def hasPostalCode
  "Used to support property parameters for the postal code data property"
  {:rdf/about :vcard/hasPostalCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the postal code data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has postal code"}})

(def hasRegion
  "Used to support property parameters for the region data property"
  {:rdf/about :vcard/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the region data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has region"}})

(def hasRelated
  "To specify a relationship between another entity and the entity represented by this object"
  {:rdf/about :vcard/hasRelated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a relationship between another entity and the entity represented by this object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has related"}})

(def hasRole
  "Used to support property parameters for the role data property"
  {:rdf/about :vcard/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the role data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has role"}})

(def hasSound
  "To specify a digital sound content information that annotates some aspect of the object"
  {:owl/equivalentProperty :vcard/sound,
   :rdf/about :vcard/hasSound,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a digital sound content information that annotates some aspect of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sound"}})

(def hasSource
  "To identify the source of directory information of the object"
  {:rdf/about :vcard/hasSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "To identify the source of directory information of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has source"}})

(def hasStreetAddress
  "Used to support property parameters for the street address data property"
  {:rdf/about :vcard/hasStreetAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the street address data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has street address"}})

(def hasTelephone
  "To specify the telephone number for telephony communication with the object"
  {:owl/equivalentProperty :vcard/tel,
   :rdf/about :vcard/hasTelephone,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the telephone number for telephony communication with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has telephone"}})

(def hasTitle
  "Used to support property parameters for the title data property"
  {:rdf/about :vcard/hasTitle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the title data property"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has title"}})

(def hasUID
  "To specify a value that represents a globally unique identifier corresponding to the object"
  {:rdf/about :vcard/hasUID,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a value that represents a globally unique identifier corresponding to the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has uid"}})

(def hasURL
  "To specify a uniform resource locator associated with the object"
  {:owl/equivalentProperty :vcard/url,
   :rdf/about :vcard/hasURL,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a uniform resource locator associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has url"}})

(def hasValue
  "Used to indicate the resource value of an object property that requires property parameters"
  {:rdf/about :vcard/hasValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to indicate the resource value of an object property that requires property parameters"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has value"}})

(def honorific-prefix
  "The honorific prefix of the name associated with the object"
  {:rdf/about :vcard/honorific-prefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The honorific prefix of the name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "honorific prefix"},
   :rdfs/range :xsd/string})

(def honorific-suffix
  "The honorific suffix of the name associated with the object"
  {:rdf/about :vcard/honorific-suffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The honorific suffix of the name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "honorific suffix"},
   :rdfs/range :xsd/string})

(def key
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasKey,
   :rdf/about        :vcard/key,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "key"}})

(def label
  "This data property has been deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/label,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "label"}})

(def language
  "To specify the language that may be used for contacting the object. May also be used as a property parameter."
  {:rdf/about :vcard/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the language that may be used for contacting the object. May also be used as a property parameter."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "language"}})

(def latitude
  "This data property has been deprecated. See hasGeo"
  {:owl/deprecated   true,
   :rdf/about        :vcard/latitude,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "This data property has been deprecated. See hasGeo"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "latitude"}})

(def locality
  "The locality (e.g. city or town) associated with the address of the object"
  {:rdf/about :vcard/locality,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The locality (e.g. city or town) associated with the address of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "locality"},
   :rdfs/range :xsd/string})

(def logo
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasLogo,
   :rdf/about        :vcard/logo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "logo"}})

(def longitude
  "This data property has been deprecated. See hasGeo"
  {:owl/deprecated   true,
   :rdf/about        :vcard/longitude,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "This data property has been deprecated. See hasGeo"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "longitude"}})

(def mailer
  "This data property has been deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/mailer,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "mailer"}})

(def n
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasName,
   :rdf/about        :vcard/n,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "name"}})

(def nickname
  "The nick name associated with the object"
  {:rdf/about        :vcard/nickname,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The nick name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "nickname"},
   :rdfs/range       :xsd/string})

(def note
  "A note associated with the object"
  {:rdf/about        :vcard/note,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A note associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "note"},
   :rdfs/range       :xsd/string})

(def org
  "This object property has been mapped. Use the organization-name data property."
  {:owl/equivalentProperty :vcard/organization-name,
   :rdf/about :vcard/org,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This object property has been mapped. Use the organization-name data property."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization"}})

(def organization-name
  "To specify the organizational name associated with the object"
  {:rdf/about :vcard/organization-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "To specify the organizational name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization name"},
   :rdfs/range :xsd/string})

(def organization-unit
  "To specify the organizational unit name associated with the object"
  {:rdf/about :vcard/organization-unit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the organizational unit name associated with the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organizational unit name"},
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :vcard/organization-name})

(def photo
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasPhoto,
   :rdf/about        :vcard/photo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "photo"}})

(def post-office-box
  "This data property has been deprecated"
  {:owl/deprecated   true,
   :rdf/about        :vcard/post-office-box,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "post office box"}})

(def postal-code
  "The postal code associated with the address of the object"
  {:rdf/about :vcard/postal-code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The postal code associated with the address of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "postal code"},
   :rdfs/range :xsd/string})

(def prodid
  "To specify the identifier for the product that created the object"
  {:rdf/about :vcard/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the identifier for the product that created the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "product id"},
   :rdfs/range :xsd/string})

(def region
  "The region (e.g. state or province) associated with the address of the object"
  {:rdf/about :vcard/region,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The region (e.g. state or province) associated with the address of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "region"},
   :rdfs/range :xsd/string})

(def rev
  "To specify revision information about the object"
  {:rdf/about        :vcard/rev,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "To specify revision information about the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "revision"},
   :rdfs/range       :xsd/dateTime})

(def role
  "To specify the function or part played in a particular situation by the object"
  {:rdf/about :vcard/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the function or part played in a particular situation by the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "role"},
   :rdfs/range :xsd/string})

(def sort-string
  "To specify the string to be used for national-language-specific sorting. Used as a property parameter only."
  {:rdf/about :vcard/sort-string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the string to be used for national-language-specific sorting. Used as a property parameter only."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sort as"},
   :rdfs/range :xsd/string})

(def sound
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasSound,
   :rdf/about        :vcard/sound,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "sound"}})

(def street-address
  "The street address associated with the address of the object"
  {:rdf/about :vcard/street-address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The street address associated with the address of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "street address"},
   :rdfs/range :xsd/string})

(def tel
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasTelephone,
   :rdf/about        :vcard/tel,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "telephone"}})

(def title
  "To specify the position or job of the object"
  {:rdf/about        :vcard/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "To specify the position or job of the object"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "title"},
   :rdfs/range       :xsd/string})

(def tz
  "To indicate time zone information that is specific to the object. May also be used as a property parameter."
  {:rdf/about :vcard/tz,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To indicate time zone information that is specific to the object. May also be used as a property parameter."},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "time zone"},
   :rdfs/range :xsd/string})

(def url
  "This object property has been mapped"
  {:owl/equivalentProperty :vcard/hasURL,
   :rdf/about        :vcard/url,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "url"}})

(def value
  "Used to indicate the literal value of a data property that requires property parameters"
  {:rdf/about :vcard/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to indicate the literal value of a data property that requires property parameters"},
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value"}})