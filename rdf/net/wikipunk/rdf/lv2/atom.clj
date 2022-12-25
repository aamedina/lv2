(ns net.wikipunk.rdf.lv2.atom
  "A generic value container and several data types."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "atom",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/atom.lv2/atom.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/atom.lv2/atom.ttl",
   :owl/imports [#:rdf{:uri "http://lv2plug.in/ns/extensions/units"}
                 #:rdf{:uri "http://lv2plug.in/ns/extensions/ui"}
                 #:rdf{:uri "http://lv2plug.in/ns/lv2core"}],
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/atom"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/atom#",
   :rdf/ns-prefix-map {"atom" "http://lv2plug.in/ns/ext/atom#",
                       "ui" "http://lv2plug.in/ns/extensions/ui#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "units" "http://lv2plug.in/ns/extensions/units#"}}
  (:refer-clojure :exclude []))

(def Atom
  "Abstract base class for all atoms."
  {:atom/cType "LV2_Atom",
   :rdfs/comment "Abstract base class for all atoms.",
   :rdfs/label "Atom",
   :rdf/type :rdfs/Class})

(def AtomPort
  "A port which contains an atom:Atom."
  {:rdfs/comment "A port which contains an atom:Atom.",
   :rdfs/label "Atom Port",
   :rdfs/subClassOf :lv2/Port,
   :rdf/type :rdfs/Class})

(def Blank
  "An anonymous collection of properties without a URI."
  {:atom/cType "LV2_Atom_Object",
   :owl/deprecated true,
   :rdfs/comment "An anonymous collection of properties without a URI.",
   :rdfs/label "Blank",
   :rdfs/subClassOf :atom/Object,
   :rdf/type :rdfs/Class})

(def Bool
  "An atom:Int where 0 is false and any other value is true."
  {:owl/onDatatype :xsd/boolean,
   :atom/cType "LV2_Atom_Bool",
   :rdfs/comment "An atom:Int where 0 is false and any other value is true.",
   :rdfs/label "Bool",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def Chunk
  "A chunk of memory with undefined contents."
  {:owl/onDatatype :xsd/base64Binary,
   :rdfs/comment "A chunk of memory with undefined contents.",
   :rdfs/label "Chunk",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def DoubleClass
  "A native `double`."
  {:owl/onDatatype :xsd/double,
   :atom/cType "LV2_Atom_Double",
   :rdfs/comment "A native `double`.",
   :rdfs/label "Double",
   :rdfs/subClassOf :atom/Number,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def Event
  "An atom with a time stamp prefix in a sequence."
  {:rdfs/comment "An atom with a time stamp prefix in a sequence.",
   :atom/cType "LV2_Atom_Event",
   :rdfs/label "Event",
   :rdf/type :rdfs/Class})

(def FloatClass
  "A native `float`."
  {:owl/onDatatype :xsd/float,
   :atom/cType "LV2_Atom_Float",
   :rdfs/comment "A native `float`.",
   :rdfs/label "Float",
   :rdfs/subClassOf :atom/Number,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def Int
  "A native `int32_t`."
  {:owl/onDatatype :xsd/int,
   :atom/cType "LV2_Atom_Int",
   :rdfs/comment "A native `int32_t`.",
   :rdfs/label "Int",
   :rdfs/subClassOf :atom/Number,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def Literal
  "A UTF-8 string literal with optional datatype or language."
  {:atom/cType "LV2_Atom_Literal",
   :rdfs/comment "A UTF-8 string literal with optional datatype or language.",
   :rdfs/label "Literal",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def LongClass
  "A native `int64_t`."
  {:owl/onDatatype :xsd/long,
   :atom/cType "LV2_Atom_Long",
   :rdfs/comment "A native `int64_t`.",
   :rdfs/label "Long",
   :rdfs/subClassOf :atom/Number,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def NumberClass
  "Base class for numeric types."
  {:rdfs/comment "Base class for numeric types.",
   :rdfs/label "Number",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def ObjectClass
  "A collection of properties."
  {:atom/cType "LV2_Atom_Object",
   :rdfs/comment "A collection of properties.",
   :rdfs/label "Object",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def Path
  "A local file path."
  {:rdfs/comment "A local file path.",
   :rdfs/label "Path",
   :owl/onDatatype :atom/URI,
   :rdfs/subClassOf :atom/URI,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def Property
  "A property of an atom:Object."
  {:atom/cType "LV2_Atom_Property",
   :rdfs/comment "A property of an atom:Object.",
   :rdfs/label "Property",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def Resource
  "A named collection of properties with a URI."
  {:atom/cType "LV2_Atom_Object",
   :owl/deprecated true,
   :rdfs/comment "A named collection of properties with a URI.",
   :rdfs/label "Resource",
   :rdfs/subClassOf :atom/Object,
   :rdf/type :rdfs/Class})

(def Sequence
  "A sequence of events."
  {:rdfs/comment "A sequence of events.",
   :atom/cType "LV2_Atom_Sequence",
   :rdfs/label "Sequence",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def Sound
  "A atom:Vector of atom:Float which represents an audio waveform."
  {:atom/cType "LV2_Atom_Vector",
   :rdfs/comment
     "A atom:Vector of atom:Float which represents an audio waveform.",
   :rdfs/label "Sound",
   :rdfs/subClassOf :atom/Vector,
   :rdf/type :rdfs/Class})

(def StringClass
  "A UTF-8 string."
  {:owl/onDatatype :xsd/string,
   :atom/cType "LV2_Atom_String",
   :rdfs/comment "A UTF-8 string.",
   :rdfs/label "String",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def Tuple
  "A sequence of atoms with varying type and size."
  {:rdfs/comment "A sequence of atoms with varying type and size.",
   :rdfs/label "Tuple",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def URI
  "A URI string."
  {:rdfs/comment "A URI string.",
   :rdfs/label "URI",
   :owl/onDatatype :xsd/anyURI,
   :rdfs/subClassOf :atom/String,
   :rdf/type [:rdfs/Datatype :rdfs/Class]})

(def URID
  "An unsigned 32-bit integer ID for a URI."
  {:atom/cType "LV2_Atom_URID",
   :rdfs/comment "An unsigned 32-bit integer ID for a URI.",
   :rdfs/label "URID",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def Vector
  "A homogeneous sequence of atom bodies with equivalent type and size."
  {:atom/cType "LV2_Atom_Vector",
   :rdfs/comment
     "A homogeneous sequence of atom bodies with equivalent type and size.",
   :rdfs/label "Vector",
   :rdfs/subClassOf :atom/Atom,
   :rdf/type :rdfs/Class})

(def atomTransfer
  "A port protocol for transferring atoms."
  {:rdfs/comment "A port protocol for transferring atoms.",
   :rdfs/label "atom transfer",
   :rdf/type :ui/PortProtocol})

(def beatTime
  "A time stamp in beats."
  {:rdfs/comment "A time stamp in beats.",
   :rdfs/label "beat time",
   :rdfs/range :xsd/decimal,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def bufferType
  "An atom type that a port may be connected to."
  {:rdfs/comment "An atom type that a port may be connected to.",
   :rdfs/label "buffer type",
   :rdfs/range :rdfs/Class,
   :rdfs/domain :atom/AtomPort,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def cType
  "The C type that describes the binary representation of an Atom type."
  {:rdfs/range :lv2/Symbol,
   :rdfs/domain :rdfs/Class,
   :rdfs/comment
     "The C type that describes the binary representation of an Atom type.",
   :rdfs/label "C type",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def childType
  "The type of children in a container."
  {:rdfs/comment "The type of children in a container.",
   :rdfs/label "child type",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def eventTransfer
  "A port protocol for transferring events."
  {:rdfs/comment "A port protocol for transferring events.",
   :rdfs/label "event transfer",
   :rdf/type :ui/PortProtocol})

(def frameTime
  "A time stamp in audio frames."
  {:rdfs/comment "A time stamp in audio frames.",
   :rdfs/label "frame time",
   :rdfs/range :xsd/decimal,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def supports
  "A supported atom type."
  {:rdfs/range :rdfs/Class,
   :rdfs/comment "A supported atom type.",
   :rdfs/label "supports",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})