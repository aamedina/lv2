(ns net.wikipunk.rdf.frbr
  "This vocabulary is an expression in RDF of the concepts and relations described in the       IFLA report on the Functional Requirements for Bibliographic Records (FRBR)."
  {:cc/license "http://creativecommons.org/licenses/by/2.0/uk/",
   :dcat/downloadURL "https://vocab.org/frbr/frbr-core-20050810.rdf",
   :dcterms/hasFormat ["http://purl.org/vocab/frbr/frbr-core-20050810.rdf"
                       "http://purl.org/vocab/frbr/frbr-core-20050810.html"],
   :dcterms/isVersionOf "http://purl.org/vocab/frbr/core#",
   :dcterms/issued "2005-07-15",
   :dcterms/replaces "http://purl.org/vocab/frbr/frbr-core-20050809",
   :rdf/about "https://vocab.org/frbr/frbr-core-20050810.rdf",
   :rdf/ns-prefix-map {"cc"       "http://web.resource.org/cc/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "frbr"     "http://purl.org/vocab/frbr/core#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "vann"     "http://purl.org/vocab/vann/"},
   :rdf/type [:owl/Ontology :cc/Work],
   :rdfa/prefix "frbr",
   :rdfa/uri "http://purl.org/vocab/frbr/core#",
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "\n      This vocabulary is an expression in RDF of the concepts and relations described in the\n      IFLA report on the Functional Requirements for Bibliographic Records (FRBR). \n    "}
    {:rdf/language "en",
     :rdf/value
     "\n      This vocabulary is a work in progress, it includes RDF classes for the group 1, 2 and 3 entities\n      described by the FRBR report and properties corresponding to the core relationships between\n      those entities. It does not yet describe attributes of the entities. Where possible, appropriate \n      relationships with other vocabularies are included in order to place this vocabulary in the \n      context of existing RDF work.\n    "}],
   :skos/changeNote
   [{:rdf/value "Fixed type in film example and added creator and date",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-10"}
    {:rdf/value
     "Added experimental paraphrases to property and class descriptions",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-10"}
    {:rdf/value "Sorted properties and classes alphabetically by URI",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-10"}],
   :skos/example "https://vocab.org/frbr/frbr-example-film-20050809.html",
   :skos/historyNote
   [{:rdf/value "Made domains and ranges of many properties more specific",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-10"}
    {:rdf/value
     "Added alternate, alternateOf, reconfiguration, reconfigurationOf properties",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-10"}
    {:rdf/value "Item is now not a subclass of geo:SpatialThing",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-10"}],
   :vann/preferredNamespacePrefix "frbr",
   :vann/preferredNamespaceUri "http://purl.org/vocab/frbr/core#",
   "http://purl.org/dc/elements/1.1/contributor" "Bruce D'Arcus",
   "http://purl.org/dc/elements/1.1/creator"
   ["Richard Newman" "Ian Davis <http://purl.org/NET/iand>"],
   "http://purl.org/dc/elements/1.1/date" "2005-08-10",
   "http://purl.org/dc/elements/1.1/identifier"
   "http://purl.org/vocab/frbr/frbr-core-20050810",
   "http://purl.org/dc/elements/1.1/rights"
   "Copyright © 2005 Richard Newman and Ian Davis",
   "http://purl.org/dc/elements/1.1/title"
   {:rdf/language "en",
    :rdf/value    "Expression of Core FRBR Concepts in RDF"}}
  (:refer-clojure :exclude [complement]))

(def Concept
  "An abstract idea or notion."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Place :frbr/Object :frbr/Event],
   :rdf/about :frbr/Concept,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Concept'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "concept"},
   :rdfs/subClassOf [:frbr/Subject :skos/Concept],
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An abstract idea or notion."},
   :skos/historyNote {:rdf/value "Made subclass of skos:Concept",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-08"}})

(def CorporateBody
  "An organization or group of individuals and/or other organizations."
  {:dcterms/issued "2005-07-15",
   :owl/equivalentClass {:owl/unionOf ["http://xmlns.com/foaf/0.1/Organization"
                                       "http://xmlns.com/foaf/0.1/Group"],
                         :rdf/type    :owl/Class},
   :rdf/about :frbr/CorporateBody,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group two entity 'Corporate Body'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate body"},
   :rdfs/subClassOf :frbr/ResponsibleEntity,
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An organization or group of individuals and/or other organizations."}})

(def Endeavour
  "Any of the products of artistic or creative endeavour."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/ResponsibleEntity :frbr/Subject],
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Expression :frbr/Item :frbr/Manifestation :frbr/Work],
    :rdf/type    :owl/Class},
   :rdf/about :frbr/Endeavour,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class represents any one of the FRBR group one entities."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "endeavour"},
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Any of the products of artistic or creative endeavour."}})

(def Event
  "An action or occurrence."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Place],
   :rdf/about :frbr/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Event'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "event"},
   :rdfs/subClassOf [:frbr/Subject
                     "http://www.isi.edu/~pan/damltime/time-entry.owl#Event"],
   :skos/changeNote [{:rdf/value "Added comment",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
                     {:rdf/value "Extracted definition from existing comment",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An action or occurrence."},
   :skos/historyNote {:rdf/value "Made subclass of owltime:Event",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-08"}})

(def Expression
  "A realization of a single work usually in a physical form."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Work :frbr/Item],
   :rdf/about :frbr/Expression,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group one entity 'Expression'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expression"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/changeNote
   [{:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A realization of a single work usually in a physical form."}})

(def Item
  "An exemplar of a single manifestation."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Work :frbr/Expression],
   :rdf/about :frbr/Item,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group one entity 'Item'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "item"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An exemplar of a single manifestation."},
   :skos/historyNote [{:rdf/value "Made subclass of geo:SpatialThing",
                       "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                       "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
                      {:rdf/value "Removed subclass of geo:SpatialThing",
                       "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                       "http://purl.org/dc/elements/1.1/date" "2005-08-10"}]})

(def Manifestation
  "The physical embodiment of one or more expressions."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Work :frbr/Expression :frbr/Item],
   :rdf/about :frbr/Manifestation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group one entity 'Manifestation'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "manifestation"},
   :rdfs/subClassOf :frbr/Endeavour,
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The physical embodiment of one or more expressions."}})

(def ObjectClass
  "A tangible or material thing."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Place :frbr/Event :frbr/Concept],
   :rdf/about :frbr/Object,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Object'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object"},
   :rdfs/subClassOf ["http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing"
                     :frbr/Subject],
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A tangible or material thing."},
   :skos/historyNote {:rdf/value "Made subclass of geo:SpatialThing",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-08"}})

(def Person
  "A living or dead individual."
  {:dcterms/issued "2005-08-08",
   :owl/disjointWith [:frbr/Subject :frbr/Endeavour],
   :owl/equivalentClass "http://xmlns.com/foaf/0.1/Person",
   :rdf/about :frbr/Person,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group two entity 'Person'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "person"},
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A living or dead individual."}})

(def Place
  "A location."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Concept :frbr/Object :frbr/Event],
   :rdf/about :frbr/Place,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class corresponds to the FRBR group three entity 'Place'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "place"},
   :rdfs/subClassOf ["http://www.w3.org/2003/01/geo/wgs84_pos#SpatialThing"
                     :frbr/Subject],
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A location."},
   :skos/historyNote {:rdf/value "Made subclass of geo:SpatialThing",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-08"}})

(def ResponsibleEntity
  "One responsible for the creation, production, distribution or maintenance of artistic or creative content."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Endeavour :frbr/Subject],
   :owl/equivalentClass {:owl/unionOf [:frbr/CorporateBody
                                       "http://xmlns.com/foaf/0.1/Person"],
                         :rdf/type    :owl/Class},
   :rdf/about :frbr/ResponsibleEntity,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "This class represents any of the FRBR group two entities."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible entity"},
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "One responsible for the creation, production, distribution or maintenance of artistic or creative content."}})

(def Subject
  "Something that may serve as the subject of a work."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Endeavour :frbr/ResponsibleEntity],
   :owl/equivalentClass
   {:owl/unionOf [:frbr/Event :frbr/Object :frbr/Place :frbr/Concept],
    :rdf/type    :owl/Class},
   :rdf/about :frbr/Subject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class represents any of the FRBR group three entities."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"},
   :skos/changeNote
   [{:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Something that may serve as the subject of a work."}})

(def Work
  "An abstract notion of an artistic or intellectual creation."
  {:dcterms/issued "2005-07-15",
   :owl/disjointWith [:frbr/Manifestation :frbr/Expression :frbr/Item],
   :rdf/about :frbr/Work,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "This class corresponds to the FRBR group one entity 'Work'."},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "work"},
   :rdfs/subClassOf [:frbr/Endeavour "http://xmlns.com/wordnet/1.6/Work~2"],
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Extracted definition from existing comment",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "An abstract notion of an artistic or intellectual creation."},
   :skos/historyNote {:rdf/value "Made subclass of wordnet:Work~2",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-08"}})

(def abridgement
  "An abridgment of an expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/abridgementOf,
   :rdf/about :frbr/abridgement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "abridgement"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An abridgment of an expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def abridgementOf
  "An expression that is abridged."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/abridgement,
   :rdf/about :frbr/abridgementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "abridgement of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is abridged."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def adaption
  "An adaption of a work or expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/adaptionOf,
   :rdf/about :frbr/adaption,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adaption"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An adaption of a work or expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def adaptionOf
  "A work or expression that is adapted."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/adaption,
   :rdf/about :frbr/adaptionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adaption of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is adapted."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def alternate
  "An alternative to a manifestation."
  {:dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/alternateOf,
   :rdf/about          :frbr/alternate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alternate"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An alternative to a manifestation."}})

(def alternateOf
  "A manifestation that is alternated."
  {:dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/alternate,
   :rdf/about          :frbr/alternateOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Manifestation,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alternate of"},
   :rdfs/range         :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A manifestation that is alternated."}})

(def arrangement
  "An arrangement of an expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/arrangementOf,
   :rdf/about :frbr/arrangement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arrangement"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An arrangement of an expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def arrangementOf
  "An expression that is arranged."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/arrangement,
   :rdf/about :frbr/arrangementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arrangement of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is arranged."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def complement
  "A complement to a work or expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/complementOf,
   :rdf/about :frbr/complement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "complement"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A complement to a work or expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def complementOf
  "A work or expression that is complemented."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/complement,
   :rdf/about :frbr/complementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "complement of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A work or expression that is complemented."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def creator
  "An entity in some way responsible for the creation of a work."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/creatorOf,
   :rdf/about :frbr/creator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "creator"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for the creation of a work."}})

(def creatorOf
  "A work that was in some way created by of an entity."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/creator,
   :rdf/about :frbr/creatorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "creator of"},
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A work that was in some way created by of an entity."}})

(def embodiment
  "A manifestation that embodies an expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/embodimentOf,
   :rdf/about :frbr/embodiment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "embodiment"},
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A manifestation that embodies an expression."}})

(def embodimentOf
  "An expression that is embodied by a manifestation."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/embodiment,
   :rdf/about :frbr/embodimentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "embodiment of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An expression that is embodied by a manifestation."}})

(def exemplar
  "An item that is an exemplar of a manifestation."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/exemplarOf,
   :rdf/about :frbr/exemplar,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exemplar"},
   :rdfs/range :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An item that is an exemplar of a manifestation."}})

(def exemplarOf
  "The manifestation that is exemplified by a item."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/exemplar,
   :rdf/about :frbr/exemplarOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Item,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exemplar of"},
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The manifestation that is exemplified by a item."}})

(def imitation
  "An imitation of a work or expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/imitationOf,
   :rdf/about :frbr/imitation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "imitation"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An imitation of a work or expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def imitationOf
  "A work or expression that is imitated."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/imitation,
   :rdf/about :frbr/imitationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "imitation of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is imitated."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def owner
  "An entity that owns an item."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/ownerOf,
   :rdf/about :frbr/owner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Item,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An entity that owns an item."}})

(def ownerOf
  "An item that is in some way owned an entity."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/owner,
   :rdf/about :frbr/ownerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner of"},
   :rdfs/range :frbr/Item,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An item that is in some way owned an entity."}})

(def part
  "A part of an endeavour."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/partOf,
   :rdf/about :frbr/part,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part"},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A part of an endeavour."}})

(def partOf
  "An endeavour incorporating an endeavour."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/part,
   :rdf/about :frbr/partOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part of"},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An endeavour incorporating an endeavour."}})

(def producer
  "An entity in some way responsible for producing a manifestation."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/producerOf,
   :rdf/about :frbr/producer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Manifestation,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "producer"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for producing a manifestation."}})

(def producerOf
  "A manifestation that was in some way produced an entity."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/producer,
   :rdf/about :frbr/producerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "producer of"},
   :rdfs/range :frbr/Manifestation,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A manifestation that was in some way produced an entity."}})

(def realization
  "An expression that is an intellectual or artistic realization of a work."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizationOf,
   :rdf/about :frbr/realization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realization"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An expression that is an intellectual or artistic realization of a work."}})

(def realizationOf
  "The work that has been realized by an expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realization,
   :rdf/about :frbr/realizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realization of"},
   :rdfs/range :frbr/Work,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The work that has been realized by an expression."}})

(def realizer
  "An entity in some way responsible for realizing an expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizerOf,
   :rdf/about :frbr/realizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizer"},
   :rdfs/range :frbr/ResponsibleEntity,
   :rdfs/subPropertyOf :frbr/responsibleEntity,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity in some way responsible for realizing an expression."}})

(def realizerOf
  "An expression that was in some way realized by an entity."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/realizer,
   :rdf/about :frbr/realizerOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "realizer of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/responsibleEntityOf,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "An expression that was in some way realized by an entity."}})

(def reconfiguration
  "A recongifuration of an item."
  {:dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/reconfigurationOf,
   :rdf/about          :frbr/reconfiguration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reconfiguration"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "A recongifuration of an item."}})

(def reconfigurationOf
  "An item that is reconfigured."
  {:dcterms/issued     "2005-08-10",
   :owl/inverseOf      :frbr/reconfiguration,
   :rdf/about          :frbr/reconfigurationOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :frbr/Item,
   :rdfs/isDefinedBy   "http://purl.org/vocab/frbr/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "reconfiguration of"},
   :rdfs/range         :frbr/Item,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "An item that is reconfigured."}})

(def relatedEndeavour
  "Another endeavour that is related in some way to an endeavour."
  {:dcterms/issued "2005-07-15",
   :rdf/about :frbr/relatedEndeavour,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related endeavour"},
   :rdfs/range :frbr/Endeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Another endeavour that is related in some way to an endeavour."}})

(def reproduction
  "A reproduction of a manifestation or item."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/reproductionOf,
   :rdf/about :frbr/reproduction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reproduction"},
   :rdfs/range {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A reproduction of a manifestation or item."},
   :skos/historyNote {:rdf/value
                      "Added domain and range of Manifestation or Item",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def reproductionOf
  "A manifestation or item that is reproduced."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/reproduction,
   :rdf/about :frbr/reproductionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reproduction of"},
   :rdfs/range {:owl/unionOf [:frbr/Manifestation :frbr/Item],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A manifestation or item that is reproduced."},
   :skos/historyNote {:rdf/value
                      "Added domain and range of Manifestation or Item",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def responsibleEntity
  "An entity in some way responsible for an endeavour."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/responsibleEntityOf,
   :rdf/about :frbr/responsibleEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible entity"},
   :rdfs/range :frbr/ResponsibleEntity,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An entity in some way responsible for an endeavour."}})

(def responsibleEntityOf
  "An endeavour that is the responsibility of an entity."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/responsibleEntity,
   :rdf/about :frbr/responsibleEntityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/ResponsibleEntity,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible entity of"},
   :rdfs/range :frbr/Endeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An endeavour that is the responsibility of an entity."}})

(def revision
  "A revision of an expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/revisionOf,
   :rdf/about :frbr/revision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "revision"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A revision of an expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def revisionOf
  "An expression that is revised."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/revision,
   :rdf/about :frbr/revisionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "revision of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is revised."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def subject
  "The subject of a work."
  {:dcterms/issued "2005-07-15",
   :rdf/about :frbr/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Work,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"},
   :rdfs/range
   {:owl/unionOf [:frbr/Endeavour :frbr/ResponsibleEntity :frbr/Subject],
    :rdf/type    :owl/Class},
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The subject of a work."}})

(def successor
  "A successor to a work or expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/successorOf,
   :rdf/about :frbr/successor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "successor"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A successor to a work or expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def successorOf
  "A work or expression that is succeeded."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/successor,
   :rdf/about :frbr/successorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "successor of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is succeeded."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def summarization
  "A summarization of a work or expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/summarizationOf,
   :rdf/about :frbr/summarization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "summarization"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A summarization of a work or expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def summarizationOf
  "A work or expression that is summarized."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/summarization,
   :rdf/about :frbr/summarizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "summarization of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is summarized."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def supplement
  "A supplement to a work or expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/supplementOf,
   :rdf/about :frbr/supplement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supplement"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A supplement to a work or expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def supplementOf
  "A work or expression that is supplemented."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/supplement,
   :rdf/about :frbr/supplementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supplement of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A work or expression that is supplemented."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def transformation
  "A transformation of a work or expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/transformationOf,
   :rdf/about :frbr/transformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transformation"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}
    {:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A transformation of a work or expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def transformationOf
  "A work or expression that is transformed."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/transformation,
   :rdf/about :frbr/transformationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transformation of"},
   :rdfs/range {:owl/unionOf [:frbr/Work :frbr/Expression],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A work or expression that is transformed."},
   :skos/historyNote {:rdf/value "Added domain and range of Work or Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def translation
  "A translation of an expression."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/translationOf,
   :rdf/about :frbr/translation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "translation"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A translation of an expression."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})

(def translationOf
  "An expression that is translated."
  {:dcterms/issued "2005-07-15",
   :owl/inverseOf :frbr/translation,
   :rdf/about :frbr/translationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy "http://purl.org/vocab/frbr/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "translation of"},
   :rdfs/range :frbr/Expression,
   :rdfs/subPropertyOf :frbr/relatedEndeavour,
   :skos/changeNote
   [{:rdf/value "Added definition",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-09"}
    {:rdf/value "Added isDefinedBy property referring to FRBR core namespace",
     "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
     "http://purl.org/dc/elements/1.1/date" "2005-08-08"}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An expression that is translated."},
   :skos/historyNote {:rdf/value "Added domain and range of Expression",
                      "http://purl.org/dc/elements/1.1/creator" "Ian Davis",
                      "http://purl.org/dc/elements/1.1/date" "2005-08-10"}})