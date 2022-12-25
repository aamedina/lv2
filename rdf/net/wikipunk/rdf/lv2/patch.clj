(ns net.wikipunk.rdf.lv2.patch
  "A protocol for accessing and manipulating properties."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.ttl",
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/patch"},
   :rdf/ns-prefix-map {"foaf"  "http://xmlns.com/foaf/0.1/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "patch" "http://lv2plug.in/ns/ext/patch#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.meta.ttl"},
   :vann/preferredNamespacePrefix "patch",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/patch#"}
  (:refer-clojure :exclude [remove]))

(def Ack
  "An acknowledgement that a request was successful."
  {:rdf/about       :patch/Ack,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Ack",
   :rdfs/subClassOf :patch/Response})

(def Copy
  "A request to copy the patch:subject to the patch:destination."
  {:rdf/about       :patch/Copy,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Copy",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/destination,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     :patch/subject,
                      :rdf/type           :owl/Restriction}
                     :patch/Request]})

(def Delete
  "Request that the patch:subject or subjects be deleted."
  {:rdf/about       :patch/Delete,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Delete",
   :rdfs/subClassOf :patch/Request})

(def ErrorClass
  "A response indicating an error processing a request."
  {:rdf/about       :patch/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Error",
   :rdfs/subClassOf :patch/Response})

(def Get
  "A request for a description of the patch:subject."
  {:rdf/about       :patch/Get,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Get",
   :rdfs/subClassOf :patch/Request})

(def Insert
  "A request to insert a patch:body into the patch:subject."
  {:rdf/about       :patch/Insert,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Insert",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Message
  "A patch message."
  {:rdf/about  :patch/Message,
   :rdf/type   :rdfs/Class,
   :rdfs/label "Patch Message"})

(def Move
  "A request to move the patch:subject to the patch:destination."
  {:rdf/about       :patch/Move,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Move",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/destination,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Patch
  "A request to add and/or remove properties of the patch:subject."
  {:rdf/about       :patch/Patch,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Patch",
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
  {:rdf/about       :patch/Put,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Put",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Request
  "A patch request message."
  {:rdf/about       :patch/Request,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Request",
   :rdfs/subClassOf :patch/Message})

(def Response
  "A response to a patch:Request."
  {:rdf/about       :patch/Response,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Response",
   :rdfs/subClassOf :patch/Message})

(def Set
  "A compact request to set a property to a value."
  {:rdf/about       :patch/Set,
   :rdf/type        :rdfs/Class,
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
  {:rdf/about   :patch/accept,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Request,
   :rdfs/label  "accept",
   :rdfs/range  :rdfs/Class})

(def add
  "The properties to add to the subject."
  {:rdf/about   :patch/add,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Patch,
   :rdfs/label  "add",
   :rdfs/range  :rdfs/Resource})

(def body
  "The body of a message."
  {:rdf/about   :patch/body,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Message,
   :rdfs/label  "body"})

(def context
  "The context of properties in this message."
  {:rdf/about   :patch/context,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Message,
   :rdfs/label  "context"})

(def destination
  "The destination to move the patch:subject to."
  {:rdf/about   :patch/destination,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Message,
   :rdfs/label  "destination"})

(def property
  "The property for a patch:Set or patch:Get message."
  {:rdf/about   :patch/property,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Message,
   :rdfs/label  "property",
   :rdfs/range  :rdf/Property})

(def readable
  "A property that can be read with a patch:Get message."
  {:rdf/about  :patch/readable,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "readable",
   :rdfs/range :rdf/Property})

(def remove
  "The properties to remove from the subject."
  {:rdf/about   :patch/remove,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Patch,
   :rdfs/label  "remove",
   :rdfs/range  :rdfs/Resource})

(def request
  "The request this is a response to."
  {:rdf/about   :patch/request,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Response,
   :rdfs/label  "request",
   :rdfs/range  :patch/Request})

(def sequenceNumber
  "The sequence number of a request or response."
  {:rdf/about   :patch/sequenceNumber,
   :rdf/type    [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :patch/Message,
   :rdfs/label  "sequence number",
   :rdfs/range  :xsd/int})

(def subject
  "The subject this message applies to."
  {:rdf/about   :patch/subject,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :patch/Message,
   :rdfs/label  "subject"})

(def value
  "The value of a property in a patch:Set message."
  {:rdf/about   :patch/value,
   :rdf/type    :rdf/Property,
   :rdfs/domain :patch/Set,
   :rdfs/label  "value"})

(def wildcard
  "A wildcard that matches any resource."
  {:rdf/about  :patch/wildcard,
   :rdf/type   :owl/Thing,
   :rdfs/label "wildcard"})

(def writable
  "A property that can be set with a patch:Set or patch:Patch message."
  {:rdf/about  :patch/writable,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "writable",
   :rdfs/range :rdf/Property})