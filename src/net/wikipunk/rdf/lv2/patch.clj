(ns net.wikipunk.rdf.lv2.patch
  "A protocol for accessing and manipulating properties."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.ttl",
   :rdf/ns-prefix-map {"foaf"  "http://xmlns.com/foaf/0.1/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "patch" "http://lv2plug.in/ns/ext/patch#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/patch",
   :rdfa/prefix "patch",
   :rdfa/uri "http://lv2plug.in/ns/ext/patch#",
   :rdfs/comment "A protocol for accessing and manipulating properties.",
   :rdfs/label "LV2 Patch",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.meta.ttl"]}
  (:refer-clojure :exclude [remove]))

(def Ack
  "An acknowledgement that a request was successful."
  {:db/ident        :patch/Ack,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An acknowledgement that a request was successful.",
   :rdfs/label      "Ack",
   :rdfs/subClassOf :patch/Response})

(def Copy
  "A request to copy the patch:subject to the patch:destination."
  {:db/ident :patch/Copy,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A request to copy the patch:subject to the patch:destination.",
   :rdfs/label "Copy",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/destination,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :patch/subject,
                      :rdf/type           :owl/Restriction}
                     :patch/Request]})

(def Delete
  "Request that the patch:subject or subjects be deleted."
  {:db/ident        :patch/Delete,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Request that the patch:subject or subjects be deleted.",
   :rdfs/label      "Delete",
   :rdfs/subClassOf :patch/Request})

(def ErrorClass
  "A response indicating an error processing a request."
  {:db/ident        :patch/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A response indicating an error processing a request.",
   :rdfs/label      "Error",
   :rdfs/subClassOf :patch/Response})

(def Get
  "A request for a description of the patch:subject."
  {:db/ident        :patch/Get,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request for a description of the patch:subject.",
   :rdfs/label      "Get",
   :rdfs/subClassOf :patch/Request})

(def Insert
  "A request to insert a patch:body into the patch:subject."
  {:db/ident        :patch/Insert,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request to insert a patch:body into the patch:subject.",
   :rdfs/label      "Insert",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Message
  "A patch message."
  {:db/ident     :patch/Message,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A patch message.",
   :rdfs/label   "Patch Message"})

(def Move
  "A request to move the patch:subject to the patch:destination."
  {:db/ident :patch/Move,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A request to move the patch:subject to the patch:destination.",
   :rdfs/label "Move",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/destination,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Patch
  "A request to add and/or remove properties of the patch:subject."
  {:db/ident :patch/Patch,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A request to add and/or remove properties of the patch:subject.",
   :rdfs/label "Patch",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/remove,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :patch/add,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :patch/subject,
                      :rdf/type           :owl/Restriction}
                     :patch/Request]})

(def Put
  "A request to put the patch:body as the patch:subject."
  {:db/ident        :patch/Put,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request to put the patch:body as the patch:subject.",
   :rdfs/label      "Put",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Request
  "A patch request message."
  {:db/ident        :patch/Request,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A patch request message.",
   :rdfs/label      "Request",
   :rdfs/subClassOf :patch/Message})

(def Response
  "A response to a patch:Request."
  {:db/ident        :patch/Response,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A response to a patch:Request.",
   :rdfs/label      "Response",
   :rdfs/subClassOf :patch/Message})

(def Set
  "A compact request to set a property to a value."
  {:db/ident        :patch/Set,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A compact request to set a property to a value.",
   :rdfs/label      "Set",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/value,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :patch/property,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def accept
  "An accepted type for a response."
  {:db/ident     :patch/accept,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An accepted type for a response.",
   :rdfs/domain  :patch/Request,
   :rdfs/label   "accept",
   :rdfs/range   :rdfs/Class})

(def add
  "The properties to add to the subject."
  {:db/ident     :patch/add,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The properties to add to the subject.",
   :rdfs/domain  :patch/Patch,
   :rdfs/label   "add",
   :rdfs/range   :rdfs/Resource})

(def body
  "The body of a message."
  {:db/ident     :patch/body,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The body of a message.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "body"})

(def context
  "The context of properties in this message."
  {:db/ident     :patch/context,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The context of properties in this message.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "context"})

(def destination
  "The destination to move the patch:subject to."
  {:db/ident     :patch/destination,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The destination to move the patch:subject to.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "destination"})

(def property
  "The property for a patch:Set or patch:Get message."
  {:db/ident     :patch/property,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The property for a patch:Set or patch:Get message.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "property",
   :rdfs/range   :rdf/Property})

(def readable
  "A property that can be read with a patch:Get message."
  {:db/ident     :patch/readable,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A property that can be read with a patch:Get message.",
   :rdfs/label   "readable",
   :rdfs/range   :rdf/Property})

(def remove
  "The properties to remove from the subject."
  {:db/ident     :patch/remove,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The properties to remove from the subject.",
   :rdfs/domain  :patch/Patch,
   :rdfs/label   "remove",
   :rdfs/range   :rdfs/Resource})

(def request
  "The request this is a response to."
  {:db/ident     :patch/request,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The request this is a response to.",
   :rdfs/domain  :patch/Response,
   :rdfs/label   "request",
   :rdfs/range   :patch/Request})

(def sequenceNumber
  "The sequence number of a request or response."
  {:db/ident     :patch/sequenceNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The sequence number of a request or response.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "sequence number",
   :rdfs/range   :xsd/int})

(def subject
  "The subject this message applies to."
  {:db/ident     :patch/subject,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The subject this message applies to.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "subject"})

(def value
  "The value of a property in a patch:Set message."
  {:db/ident     :patch/value,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The value of a property in a patch:Set message.",
   :rdfs/domain  :patch/Set,
   :rdfs/label   "value"})

(def wildcard
  "A wildcard that matches any resource."
  {:db/ident     :patch/wildcard,
   :rdf/type     :owl/Thing,
   :rdfs/comment "A wildcard that matches any resource.",
   :rdfs/label   "wildcard"})

(def writable
  "A property that can be set with a patch:Set or patch:Patch message."
  {:db/ident :patch/writable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A property that can be set with a patch:Set or patch:Patch message.",
   :rdfs/label "writable",
   :rdfs/range :rdf/Property})