(ns net.wikipunk.rdf.ingen.errors
  "Errors that the Ingen server may return"
  {:dcat/downloadURL
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/errors.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map
   {"doap" "http://usefulinc.com/ns/doap#",
    "ingen" "http://drobilla.net/ns/ingen#",
    "ingen.lv2"
    "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/",
    "lv2" "http://lv2plug.in/ns/lv2core#",
    "lv2.atom" "http://lv2plug.in/ns/ext/atom#",
    "lv2.midi" "http://lv2plug.in/ns/ext/midi#",
    "lv2.patch" "http://lv2plug.in/ns/ext/patch#",
    "lv2.work" "http://lv2plug.in/ns/ext/worker#",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ingen.errors",
   :rdfa/uri "http://drobilla.net/ns/ingen/errors#",
   :rdfs/comment "Errors that the Ingen server may return",
   :rdfs/label "Ingen Error Ontology"})

(def BadIndex
  {:db/ident        :ingen.errors/BadIndex,
   :ingen.errors/errorCode 2,
   :ingen.errors/formatString "Invalid index",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/BadIndex]})

(def BadObjectType
  {:db/ident        :ingen.errors/BadObjectType,
   :ingen.errors/errorCode 3,
   :ingen.errors/formatString "Invalid object type",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/BadObjectType]})

(def BadRequest
  {:db/ident        :ingen.errors/BadRequest,
   :ingen.errors/errorCode 4,
   :ingen.errors/formatString "Invalid request",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/BadRequest]})

(def BadURI
  {:db/ident        :ingen.errors/BadURI,
   :ingen.errors/errorCode 5,
   :ingen.errors/formatString "Invalid URI",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/BadURI]})

(def BadValueType
  {:db/ident        :ingen.errors/BadValueType,
   :ingen.errors/errorCode 6,
   :ingen.errors/formatString "Invalid value type",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/BadValueType]})

(def ClientNotFound
  {:db/ident        :ingen.errors/ClientNotFound,
   :ingen.errors/errorCode 7,
   :ingen.errors/formatString "Client not found",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/ClientNotFound]})

(def CreationFailed
  {:db/ident        :ingen.errors/CreationFailed,
   :ingen.errors/errorCode 8,
   :ingen.errors/formatString "Creation failed",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/CreationFailed]})

(def DirectionMismatch
  {:db/ident        :ingen.errors/DirectionMismatch,
   :ingen.errors/errorCode 9,
   :ingen.errors/formatString "Direction mismatch",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/DirectionMismatch]})

(def ErrorClass
  "An error"
  {:db/ident        :ingen.errors/Error,
   :rdf/type        :owl/Class,
   :rdfs/label      "An error",
   :rdfs/subClassOf :ingen.errors/Error})

(def Exists
  {:db/ident        :ingen.errors/Exists,
   :ingen.errors/errorCode 10,
   :ingen.errors/formatString "Object exists",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/Exists]})

(def InternalErrorClass
  {:db/ident        :ingen.errors/InternalError,
   :ingen.errors/errorCode 11,
   :ingen.errors/formatString "Internal error",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/InternalError]})

(def InvalidParentPath
  {:db/ident        :ingen.errors/InvalidParentPath,
   :ingen.errors/errorCode 12,
   :ingen.errors/formatString "Invalid parent path",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/InvalidParentPath]})

(def InvalidPoly
  {:db/ident        :ingen.errors/InvalidPoly,
   :ingen.errors/errorCode 13,
   :ingen.errors/formatString "Invalid polyphony",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/InvalidPoly]})

(def NoSpace
  {:db/ident        :ingen.errors/NoSpace,
   :ingen.errors/errorCode 18,
   :ingen.errors/formatString "Insufficient space",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/NoSpace]})

(def NotDeletable
  {:db/ident        :ingen.errors/NotDeletable,
   :ingen.errors/errorCode 14,
   :ingen.errors/formatString "Object not deletable",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/NotDeletable]})

(def NotFound
  {:db/ident        :ingen.errors/NotFound,
   :ingen.errors/errorCode 15,
   :ingen.errors/formatString "Object not found",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/NotFound]})

(def NotMovable
  {:db/ident        :ingen.errors/NotMovable,
   :ingen.errors/errorCode 16,
   :ingen.errors/formatString "Object not movable",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/NotMovable]})

(def NotPrepared
  {:db/ident        :ingen.errors/NotPrepared,
   :ingen.errors/errorCode 17,
   :ingen.errors/formatString "Not prepared",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/NotPrepared]})

(def ParentDiffers
  {:db/ident        :ingen.errors/ParentDiffers,
   :ingen.errors/errorCode 19,
   :ingen.errors/formatString "Parent differs",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/ParentDiffers]})

(def ParentNotFound
  {:db/ident        :ingen.errors/ParentNotFound,
   :ingen.errors/errorCode 20,
   :ingen.errors/formatString "Parent not found",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/ParentNotFound]})

(def PluginNotFound
  {:db/ident        :ingen.errors/PluginNotFound,
   :ingen.errors/errorCode 21,
   :ingen.errors/formatString "Plugin not found",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/PluginNotFound]})

(def PortNotFound
  {:db/ident        :ingen.errors/PortNotFound,
   :ingen.errors/errorCode 22,
   :ingen.errors/formatString "Port not found",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/PortNotFound]})

(def TypeMismatch
  {:db/ident        :ingen.errors/TypeMismatch,
   :ingen.errors/errorCode 23,
   :ingen.errors/formatString "Type mismatch",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/TypeMismatch]})

(def UnknownErrorClass
  {:db/ident        :ingen.errors/UnknownError,
   :ingen.errors/errorCode 1,
   :ingen.errors/formatString "Unknown error",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/UnknownError]})

(def UnknownType
  {:db/ident        :ingen.errors/UnknownType,
   :ingen.errors/errorCode 24,
   :ingen.errors/formatString "Unknown type",
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:ingen.errors/Error :ingen.errors/UnknownType]})

(def errorCode
  "The numeric code of an error."
  {:db/ident     :ingen.errors/errorCode,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The numeric code of an error.",
   :rdfs/label   "error code",
   :rdfs/range   :xsd/integer})

(def formatString
  "A C-style format string for producing a message."
  {:db/ident     :ingen.errors/formatString,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "A C-style format string for producing a message.",
   :rdfs/label   "format string",
   :rdfs/range   :xsd/string})