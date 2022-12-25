(ns net.wikipunk.rdf.lv2.patch
  "A protocol for accessing and manipulating properties."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "patch",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.ttl",
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/patch"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/patch#",
   :rdf/ns-prefix-map {"patch" "http://lv2plug.in/ns/ext/patch#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "foaf" "http://xmlns.com/foaf/0.1/"}}
  (:refer-clojure :exclude [remove]))

(def Ack
  "An acknowledgement that a request was successful."
  {:rdfs/comment "An acknowledgement that a request was successful.",
   :rdfs/label "Ack",
   :rdfs/subClassOf :patch/Response,
   :rdf/type :rdfs/Class})

(def Copy
  "A request to copy the patch:subject to the patch:destination."
  {:rdfs/comment
     "A request to copy the patch:subject to the patch:destination.",
   :rdfs/subClassOf [{:owl/onProperty :patch/destination,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :patch/subject,
                      :owl/minCardinality 1,
                      :rdf/type :owl/Restriction} :patch/Request],
   :rdfs/label "Copy",
   :rdf/type :rdfs/Class})

(def Delete
  "Request that the patch:subject or subjects be deleted."
  {:rdfs/comment "Request that the patch:subject or subjects be deleted.",
   :rdfs/label "Delete",
   :rdfs/subClassOf :patch/Request,
   :rdf/type :rdfs/Class})

(def ErrorClass
  "A response indicating an error processing a request."
  {:rdfs/comment "A response indicating an error processing a request.",
   :rdfs/label "Error",
   :rdfs/subClassOf :patch/Response,
   :rdf/type :rdfs/Class})

(def Get
  "A request for a description of the patch:subject."
  {:rdfs/comment "A request for a description of the patch:subject.",
   :rdfs/label "Get",
   :rdfs/subClassOf :patch/Request,
   :rdf/type :rdfs/Class})

(def Insert
  "A request to insert a patch:body into the patch:subject."
  {:rdfs/comment "A request to insert a patch:body into the patch:subject.",
   :rdfs/subClassOf [{:owl/onProperty :patch/subject,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction} :patch/Request],
   :rdfs/label "Insert",
   :rdf/type :rdfs/Class})

(def Message
  "A patch message."
  {:rdfs/comment "A patch message.",
   :rdfs/label "Patch Message",
   :rdf/type :rdfs/Class})

(def Move
  "A request to move the patch:subject to the patch:destination."
  {:rdfs/comment
     "A request to move the patch:subject to the patch:destination.",
   :rdfs/subClassOf [{:owl/onProperty :patch/destination,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :patch/subject,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction} :patch/Request],
   :rdfs/label "Move",
   :rdf/type :rdfs/Class})

(def Patch
  "A request to add and/or remove properties of the patch:subject."
  {:rdfs/comment
     "A request to add and/or remove properties of the patch:subject.",
   :rdfs/label "Patch",
   :rdfs/subClassOf [{:owl/onProperty :patch/remove,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :patch/add,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :patch/subject,
                      :owl/minCardinality 1,
                      :rdf/type :owl/Restriction} :patch/Request],
   :rdf/type :rdfs/Class})

(def Put
  "A request to put the patch:body as the patch:subject."
  {:rdfs/comment "A request to put the patch:body as the patch:subject.",
   :rdfs/subClassOf [{:owl/onProperty :patch/subject,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction} :patch/Request],
   :rdfs/label "Put",
   :rdf/type :rdfs/Class})

(def Request
  "A patch request message."
  {:rdfs/comment "A patch request message.",
   :rdfs/subClassOf :patch/Message,
   :rdfs/label "Request",
   :rdf/type :rdfs/Class})

(def Response
  "A response to a patch:Request."
  {:rdfs/comment "A response to a patch:Request.",
   :rdfs/label "Response",
   :rdfs/subClassOf :patch/Message,
   :rdf/type :rdfs/Class})

(def Set
  "A compact request to set a property to a value."
  {:rdfs/comment "A compact request to set a property to a value.",
   :rdfs/subClassOf [{:owl/onProperty :patch/value,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :patch/property,
                      :owl/cardinality 1,
                      :rdf/type :owl/Restriction} :patch/Request],
   :rdfs/label "Set",
   :rdf/type :rdfs/Class})

(def accept
  "An accepted type for a response."
  {:rdfs/comment "An accepted type for a response.",
   :rdfs/range :rdfs/Class,
   :rdfs/domain :patch/Request,
   :rdfs/label "accept",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def add
  "The properties to add to the subject."
  {:rdfs/comment "The properties to add to the subject.",
   :rdfs/label "add",
   :rdfs/range :rdfs/Resource,
   :rdfs/domain :patch/Patch,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def body
  "The body of a message."
  {:rdfs/comment "The body of a message.",
   :rdfs/label "body",
   :rdfs/domain :patch/Message,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def context
  "The context of properties in this message."
  {:rdfs/comment "The context of properties in this message.",
   :rdfs/label "context",
   :rdfs/domain :patch/Message,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def destination
  "The destination to move the patch:subject to."
  {:rdfs/comment "The destination to move the patch:subject to.",
   :rdfs/label "destination",
   :rdfs/domain :patch/Message,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def property
  "The property for a patch:Set or patch:Get message."
  {:rdfs/comment "The property for a patch:Set or patch:Get message.",
   :rdfs/range :rdf/Property,
   :rdfs/domain :patch/Message,
   :rdfs/label "property",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def readable
  "A property that can be read with a patch:Get message."
  {:rdfs/comment "A property that can be read with a patch:Get message.",
   :rdfs/range :rdf/Property,
   :rdfs/label "readable",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def remove
  "The properties to remove from the subject."
  {:rdfs/comment "The properties to remove from the subject.",
   :rdfs/range :rdfs/Resource,
   :rdfs/domain :patch/Patch,
   :rdfs/label "remove",
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def request
  "The request this is a response to."
  {:rdfs/comment "The request this is a response to.",
   :rdfs/range :patch/Request,
   :rdfs/domain :patch/Response,
   :rdfs/label "request",
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def sequenceNumber
  "The sequence number of a request or response."
  {:rdfs/comment "The sequence number of a request or response.",
   :rdfs/range :xsd/int,
   :rdfs/domain :patch/Message,
   :rdfs/label "sequence number",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def subject
  "The subject this message applies to."
  {:rdfs/comment "The subject this message applies to.",
   :rdfs/label "subject",
   :rdfs/domain :patch/Message,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property]})

(def value
  "The value of a property in a patch:Set message."
  {:rdfs/comment "The value of a property in a patch:Set message.",
   :rdfs/domain :patch/Set,
   :rdfs/label "value",
   :rdf/type :rdf/Property})

(def wildcard
  "A wildcard that matches any resource."
  {:rdfs/comment "A wildcard that matches any resource.",
   :rdfs/label "wildcard",
   :rdf/type :owl/Thing})

(def writable
  "A property that can be set with a patch:Set or patch:Patch message."
  {:rdfs/comment
     "A property that can be set with a patch:Set or patch:Patch message.",
   :rdfs/range :rdf/Property,
   :rdfs/label "writable",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})