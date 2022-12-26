(ns net.wikipunk.rdf.lv2.patch
  "This is a vocabulary for messages that access and manipulate properties. It can be used as a dynamic control interface for plugins, or anything else with a property-based model.  The key underlying concept here is to control things by manipulating arbitrary properties, rather than by calling application-specific methods. This allows implementations to understand what messages do (at least in a mechanical sense), which makes things like caching, proxying, or undo relatively straightforward to implement. Note, however, that this is only conceptual: there is no requirement to implement a general property store. Typically, a plugin will understand a fixed set of properties that represent its parameters or other internal state, and ignore everything else.  This protocol is syntax-agnostic, and [homoiconic](https://en.wikipedia.org/wiki/Homoiconicity) in the sense that the messages use the same format as the data they manipulate. In particular, messages can be serialised as a binary [Object](atom.html#Object) for realtime plugin control, or as Turtle for saving to a file, sending over a network, printing for debugging purposes, and so on.  This specification only defines a semantic protocol, there is no corresponding API. It can be used with the [Atom](atom.html) extension to control plugins which support message-based parameters as defined by the [Parameters](parameters.html) extension.  For example, if a plugin defines a `eg:volume` parameter, it can be controlled by the host by sending a patch:Set message to the plugin instance:      :::turtle     [         a patch:Set ;         patch:property eg:volume ;         patch:value 11.0 ;     ]  Similarly, the host could get the current value for this parameter by sending a patch:Get message:      :::turtle     [         a patch:Get ;         patch:property eg:volume ;     ]  The plugin would then respond with the same patch:Set message as above. In this case, the plugin instance is implicitly the patch:subject, but a specific subject can also be given for deeper control."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/patch.lv2/patch.ttl",
   :lv2/project {:doap/created "2012-02-09",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/license {:rdf/uri "http://opensource.org/licenses/isc"},
                 :doap/name "LV2 Patch",
                 :doap/shortdesc
                 "A protocol for accessing and manipulating properties.",
                 :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/patch"},
                 :rdf/type :doap/Project},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/patch"},
   :rdf/ns-prefix-map {"foaf"  "http://xmlns.com/foaf/0.1/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "patch" "http://lv2plug.in/ns/ext/patch#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "A protocol for accessing and manipulating properties.",
   :rdfs/label "LV2 Patch",
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
   :rdfs/comment    "An acknowledgement that a request was successful.",
   :rdfs/label      "Ack",
   :rdfs/subClassOf :patch/Response})

(def Copy
  "After this, the destination has the same description as the subject, and the subject is unchanged.  It is an error if the subject does not exist, or if the destination already exists.  Multiple subjects may be given if the destination is a container, but the semantics of this case are application-defined."
  {:rdf/about :patch/Copy,
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
  {:rdf/about       :patch/Delete,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Request that the patch:subject or subjects be deleted.",
   :rdfs/label      "Delete",
   :rdfs/subClassOf :patch/Request})

(def ErrorClass
  "A response indicating an error processing a request."
  {:rdf/about       :patch/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A response indicating an error processing a request.",
   :rdfs/label      "Error",
   :rdfs/subClassOf :patch/Response})

(def Get
  "If a patch:property is given, then the receiver should respond with a patch:Set message that gives only that property.  Otherwise, it should respond with a [concise bounded description](http://www.w3.org/Submission/CBD/) in a patch:Put message, that is, a description that recursively includes any blank node values.  If a patch:subject is given, then the response should have the same subject. If no subject is given, then the receiver is implicitly the subject.  If a patch:request node or a patch:sequenceNumber is given, then the response should be a patch:Response and have the same property. If neither is given, then the receiver can respond with a simple patch:Put message. For example:      :::turtle     []         a patch:Get ;         patch:subject eg:something .  Could result in:      :::turtle     []         a patch:Put ;         patch:subject eg:something ;         patch:body [             eg:name \"Something\" ;             eg:ratio 1.6180339887 ;         ] ."
  {:rdf/about       :patch/Get,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request for a description of the patch:subject.",
   :rdfs/label      "Get",
   :rdfs/subClassOf :patch/Request})

(def Insert
  "If the subject does not exist, it is created.  If the subject does already exist, it is added to.  This request only adds properties, it never removes them.  The user must take care that multiple values are not set for properties which should only have one."
  {:rdf/about       :patch/Insert,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request to insert a patch:body into the patch:subject.",
   :rdfs/label      "Insert",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Message
  "This is an abstract base class for all patch messages.  Concrete messages are either a patch:Request or a patch:Response."
  {:rdf/about    :patch/Message,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A patch message.",
   :rdfs/label   "Patch Message"})

(def Move
  "After this, the destination has the description that the subject had, and the subject no longer exists.  It is an error if the subject does not exist, or if the destination already exists."
  {:rdf/about :patch/Move,
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
  "This method always has at least one subject, and exactly one patch:add and patch:remove property.  The value of patch:add and patch:remove are nodes which have the properties to add or remove from the subject(s), respectively.  The special value patch:wildcard may be used as the value of a remove property to remove all properties with the given predicate.  For example:      :::turtle     []         a patch:Patch ;         patch:subject <something> ;         patch:add [             eg:name \"New name\" ;             eg:age 42 ;         ] ;         patch:remove [             eg:name \"Old name\" ;             eg:age patch:wildcard ;  # Remove all old eg:age properties         ] ."
  {:rdf/about :patch/Patch,
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
  "If the subject does not already exist, it is created.  If the subject does already exist, the patch:body is considered an updated version of it, and the previous version is replaced.      :::turtle     []         a patch:Put ;         patch:subject <something> ;         patch:body [             eg:name \"New name\" ;             eg:age 42 ;         ] ."
  {:rdf/about       :patch/Put,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request to put the patch:body as the patch:subject.",
   :rdfs/label      "Put",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :patch/subject,
                      :rdf/type        :owl/Restriction}
                     :patch/Request]})

(def Request
  "A request may have a patch:subject property, which specifies the resource that the request applies to.  The subject may be omitted in contexts where it is implicit, for example if the recipient is the subject."
  {:rdf/about       :patch/Request,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A patch request message.",
   :rdfs/label      "Request",
   :rdfs/subClassOf :patch/Message})

(def Response
  "A response to a patch:Request."
  {:rdf/about       :patch/Response,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A response to a patch:Request.",
   :rdfs/label      "Response",
   :rdfs/subClassOf :patch/Message})

(def Set
  "This is equivalent to a patch:Patch which removes _all_ pre-existing values for the property before setting the new value.  For example:      :::turtle     []         a patch:Set ;         patch:subject <something> ;         patch:property eg:name ;         patch:value \"New name\" .  Which is equivalent to:      :::turtle     []         a patch:Patch ;         patch:subject <something> ;         patch:add [             eg:name \"New name\" ;         ] ;         patch:remove [             eg:name patch:wildcard ;         ] ."
  {:rdf/about       :patch/Set,
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
  {:rdf/about    :patch/accept,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An accepted type for a response.",
   :rdfs/domain  :patch/Request,
   :rdfs/label   "accept",
   :rdfs/range   :rdfs/Class})

(def add
  "The properties to add to the subject."
  {:rdf/about    :patch/add,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The properties to add to the subject.",
   :rdfs/domain  :patch/Patch,
   :rdfs/label   "add",
   :rdfs/range   :rdfs/Resource})

(def body
  "The details of this property's value depend on the type of message it is a part of."
  {:rdf/about    :patch/body,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The body of a message.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "body"})

(def context
  "For example, a plugin may have a special context for ephemeral properties which are only relevant during the lifetime of the instance and should not be saved in state.  The specific uses for contexts are application specific.  However, the context MUST be a URI, and can be interpreted as the ID of a data model where properties should be stored.  Implementations MAY have special support for contexts, for example by storing in a quad store or serializing to a format that supports multiple RDF graphs such as TriG."
  {:rdf/about    :patch/context,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The context of properties in this message.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "context"})

(def destination
  "The destination to move the patch:subject to."
  {:rdf/about    :patch/destination,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The destination to move the patch:subject to.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "destination"})

(def property
  "The property for a patch:Set or patch:Get message."
  {:rdf/about    :patch/property,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The property for a patch:Set or patch:Get message.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "property",
   :rdfs/range   :rdf/Property})

(def readable
  "See the similar patch:writable property for details."
  {:rdf/about    :patch/readable,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A property that can be read with a patch:Get message.",
   :rdfs/label   "readable",
   :rdfs/range   :rdf/Property})

(def remove
  "The properties to remove from the subject."
  {:rdf/about    :patch/remove,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The properties to remove from the subject.",
   :rdfs/domain  :patch/Patch,
   :rdfs/label   "remove",
   :rdfs/range   :rdfs/Resource})

(def request
  "This can be used if referring directly to the URI or blank node ID of the request is possible.  Otherwise, use patch:sequenceNumber."
  {:rdf/about    :patch/request,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The request this is a response to.",
   :rdfs/domain  :patch/Response,
   :rdfs/label   "request",
   :rdfs/range   :patch/Request})

(def sequenceNumber
  "This property is used to associate replies with requests when it is not feasible to refer to request URIs with patch:request.  A patch:Response with a given sequence number is the reply to the previously send patch:Request with the same sequence number.  The special sequence number 0 means that no reply is desired."
  {:rdf/about    :patch/sequenceNumber,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The sequence number of a request or response.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "sequence number",
   :rdfs/range   :xsd/int})

(def subject
  "The subject this message applies to."
  {:rdf/about    :patch/subject,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The subject this message applies to.",
   :rdfs/domain  :patch/Message,
   :rdfs/label   "subject"})

(def value
  "The value of a property in a patch:Set message."
  {:rdf/about    :patch/value,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The value of a property in a patch:Set message.",
   :rdfs/domain  :patch/Set,
   :rdfs/label   "value"})

(def wildcard
  "This makes it possible to describe the removal of all values for a given property."
  {:rdf/about    :patch/wildcard,
   :rdf/type     :owl/Thing,
   :rdfs/comment "A wildcard that matches any resource.",
   :rdfs/label   "wildcard"})

(def writable
  "This is used to list properties that can be changed, for example to allow user interfaces to present appropriate controls.  For example:      :::turtle     @prefix eg:   <http://example.org/> .     @prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .     @prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .     @prefix xsd:  <http://www.w3.org/2001/XMLSchema#> .      eg:title         a rdf:Property ;         rdfs:label \"title\" ;         rdfs:range xsd:string .      eg:plugin         patch:writable eg:title ."
  {:rdf/about :patch/writable,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A property that can be set with a patch:Set or patch:Patch message.",
   :rdfs/label "writable",
   :rdfs/range :rdf/Property})