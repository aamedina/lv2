(ns net.wikipunk.rdf.lv2.patch
  "A protocol for accessing and manipulating properties."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.ttl",
   :rdf/ns-prefix-map {"foaf" "http://xmlns.com/foaf/0.1/",
                       "lv2.patch" "http://lv2plug.in/ns/ext/patch#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.patch",
   :rdfa/uri "http://lv2plug.in/ns/ext/patch",
   :rdfs/comment "A protocol for accessing and manipulating properties.",
   :rdfs/label "LV2 Patch",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.meta.ttl"]}
  (:refer-clojure :exclude [remove]))

(def Ack
  "An acknowledgement that a request was successful."
  {:db/ident        :lv2.patch/Ack,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An acknowledgement that a request was successful.",
   :rdfs/label      "Ack",
   :rdfs/subClassOf [:lv2.patch/Response :rdfs/Resource :lv2.patch/Message]})

(def Copy
  "A request to copy the patch:subject to the patch:destination."
  {:db/ident :lv2.patch/Copy,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A request to copy the patch:subject to the patch:destination.",
   :rdfs/label "Copy",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/destination,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :lv2.patch/subject,
                      :rdf/type           :owl/Restriction}
                     :lv2.patch/Request
                     :rdfs/Resource
                     :lv2.patch/Message]})

(def Delete
  "Request that the patch:subject or subjects be deleted."
  {:db/ident        :lv2.patch/Delete,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Request that the patch:subject or subjects be deleted.",
   :rdfs/label      "Delete",
   :rdfs/subClassOf [:rdfs/Resource :lv2.patch/Request :lv2.patch/Message]})

(def ErrorClass
  "A response indicating an error processing a request."
  {:db/ident        :lv2.patch/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A response indicating an error processing a request.",
   :rdfs/label      "Error",
   :rdfs/subClassOf [:lv2.patch/Response :rdfs/Resource :lv2.patch/Message]})

(def Get
  "A request for a description of the patch:subject."
  {:db/ident        :lv2.patch/Get,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request for a description of the patch:subject.",
   :rdfs/label      "Get",
   :rdfs/subClassOf [:rdfs/Resource :lv2.patch/Request :lv2.patch/Message]})

(def Insert
  "A request to insert a patch:body into the patch:subject."
  {:db/ident        :lv2.patch/Insert,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request to insert a patch:body into the patch:subject.",
   :rdfs/label      "Insert",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/subject,
                      :rdf/type        :owl/Restriction}
                     :lv2.patch/Request
                     :rdfs/Resource
                     :lv2.patch/Message]})

(def Message
  "A patch message."
  {:db/ident        :lv2.patch/Message,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A patch message.",
   :rdfs/label      "Patch Message",
   :rdfs/subClassOf :rdfs/Resource})

(def Move
  "A request to move the patch:subject to the patch:destination."
  {:db/ident :lv2.patch/Move,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A request to move the patch:subject to the patch:destination.",
   :rdfs/label "Move",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/destination,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/subject,
                      :rdf/type        :owl/Restriction}
                     :lv2.patch/Request
                     :lv2.patch/Message]})

(def Patch
  "A request to add and/or remove properties of the patch:subject."
  {:db/ident :lv2.patch/Patch,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A request to add and/or remove properties of the patch:subject.",
   :rdfs/label "Patch",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/remove,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/add,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :lv2.patch/subject,
                      :rdf/type           :owl/Restriction}
                     :lv2.patch/Request
                     :rdfs/Resource
                     :lv2.patch/Message]})

(def Put
  "A request to put the patch:body as the patch:subject."
  {:db/ident        :lv2.patch/Put,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request to put the patch:body as the patch:subject.",
   :rdfs/label      "Put",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/subject,
                      :rdf/type        :owl/Restriction}
                     :lv2.patch/Request
                     :lv2.patch/Message]})

(def Request
  "A patch request message."
  {:db/ident        :lv2.patch/Request,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A patch request message.",
   :rdfs/label      "Request",
   :rdfs/subClassOf [:lv2.patch/Message :rdfs/Resource]})

(def Response
  "A response to a patch:Request."
  {:db/ident        :lv2.patch/Response,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A response to a patch:Request.",
   :rdfs/label      "Response",
   :rdfs/subClassOf [:rdfs/Resource :lv2.patch/Message]})

(def Set
  "A compact request to set a property to a value."
  {:db/ident        :lv2.patch/Set,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A compact request to set a property to a value.",
   :rdfs/label      "Set",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/value,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :lv2.patch/property,
                      :rdf/type        :owl/Restriction}
                     :lv2.patch/Request
                     :rdfs/Resource
                     :lv2.patch/Message]})

(def accept
  "An accepted type for a response."
  {:db/ident     :lv2.patch/accept,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An accepted type for a response.",
   :rdfs/domain  :lv2.patch/Request,
   :rdfs/label   "accept",
   :rdfs/range   :rdfs/Class})

(def add
  "The properties to add to the subject."
  {:db/ident     :lv2.patch/add,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The properties to add to the subject.",
   :rdfs/domain  :lv2.patch/Patch,
   :rdfs/label   "add",
   :rdfs/range   :rdfs/Resource})

(def body
  "The body of a message."
  {:db/ident     :lv2.patch/body,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The body of a message.",
   :rdfs/domain  :lv2.patch/Message,
   :rdfs/label   "body"})

(def context
  "The context of properties in this message."
  {:db/ident     :lv2.patch/context,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The context of properties in this message.",
   :rdfs/domain  :lv2.patch/Message,
   :rdfs/label   "context"})

(def destination
  "The destination to move the patch:subject to."
  {:db/ident     :lv2.patch/destination,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The destination to move the patch:subject to.",
   :rdfs/domain  :lv2.patch/Message,
   :rdfs/label   "destination"})

(def property
  "The property for a patch:Set or patch:Get message."
  {:db/ident     :lv2.patch/property,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The property for a patch:Set or patch:Get message.",
   :rdfs/domain  :lv2.patch/Message,
   :rdfs/label   "property",
   :rdfs/range   :rdf/Property})

(def readable
  "A property that can be read with a patch:Get message."
  {:db/ident     :lv2.patch/readable,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A property that can be read with a patch:Get message.",
   :rdfs/label   "readable",
   :rdfs/range   :rdf/Property})

(def remove
  "The properties to remove from the subject."
  {:db/ident     :lv2.patch/remove,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The properties to remove from the subject.",
   :rdfs/domain  :lv2.patch/Patch,
   :rdfs/label   "remove",
   :rdfs/range   :rdfs/Resource})

(def request
  "The request this is a response to."
  {:db/ident     :lv2.patch/request,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The request this is a response to.",
   :rdfs/domain  :lv2.patch/Response,
   :rdfs/label   "request",
   :rdfs/range   :lv2.patch/Request})

(def sequenceNumber
  "The sequence number of a request or response."
  {:db/ident     :lv2.patch/sequenceNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The sequence number of a request or response.",
   :rdfs/domain  :lv2.patch/Message,
   :rdfs/label   "sequence number",
   :rdfs/range   :xsd/int})

(def subject
  "The subject this message applies to."
  {:db/ident     :lv2.patch/subject,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The subject this message applies to.",
   :rdfs/domain  :lv2.patch/Message,
   :rdfs/label   "subject"})

(def value
  "The value of a property in a patch:Set message."
  {:db/ident     :lv2.patch/value,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The value of a property in a patch:Set message.",
   :rdfs/domain  :lv2.patch/Set,
   :rdfs/label   "value"})

(def wildcard
  "A wildcard that matches any resource."
  {:db/ident     :lv2.patch/wildcard,
   :rdf/type     :owl/Thing,
   :rdfs/comment "A wildcard that matches any resource.",
   :rdfs/label   "wildcard"})

(def writable
  "A property that can be set with a patch:Set or patch:Patch message."
  {:db/ident :lv2.patch/writable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A property that can be set with a patch:Set or patch:Patch message.",
   :rdfs/label "writable",
   :rdfs/range :rdf/Property})