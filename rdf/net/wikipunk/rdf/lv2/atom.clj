(ns net.wikipunk.rdf.lv2.atom
  "A generic value container and several data types."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/atom.lv2/atom.ttl",
   :lv2/project {:doap/created "2007-00-00",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/license {:rdf/uri "http://opensource.org/licenses/isc"},
                 :doap/name "LV2 Atom",
                 :doap/shortdesc
                 "A generic value container and several data types.",
                 :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/atom"},
                 :rdf/type :doap/Project},
   :owl/imports [{:rdf/uri "http://lv2plug.in/ns/extensions/units"}
                 {:rdf/uri "http://lv2plug.in/ns/extensions/ui"}
                 {:rdf/uri "http://lv2plug.in/ns/lv2core"}],
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/atom"},
   :rdf/ns-prefix-map {"atom"  "http://lv2plug.in/ns/ext/atom#",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "ui"    "http://lv2plug.in/ns/extensions/ui#",
                       "units" "http://lv2plug.in/ns/extensions/units#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "A generic value container and several data types.",
   :rdfs/label "LV2 Atom",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/atom.lv2/atom.meta.ttl"},
   :vann/preferredNamespacePrefix "atom",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/atom#"})

(def Atom
  "Abstract base class for all atoms."
  {:atom/cType   "LV2_Atom",
   :rdf/about    :atom/Atom,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "Abstract base class for all atoms.",
   :rdfs/label   "Atom"})

(def AtomPort
  "A port which contains an atom:Atom."
  {:rdf/about       :atom/AtomPort,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A port which contains an atom:Atom.",
   :rdfs/label      "Atom Port",
   :rdfs/subClassOf :lv2/Port})

(def Blank
  "An anonymous collection of properties without a URI."
  {:atom/cType      "LV2_Atom_Object",
   :owl/deprecated  true,
   :rdf/about       :atom/Blank,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An anonymous collection of properties without a URI.",
   :rdfs/label      "Blank",
   :rdfs/subClassOf :atom/Object})

(def Bool
  "An atom:Int where 0 is false and any other value is true."
  {:atom/cType      "LV2_Atom_Bool",
   :owl/onDatatype  :xsd/boolean,
   :rdf/about       :atom/Bool,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "An atom:Int where 0 is false and any other value is true.",
   :rdfs/label      "Bool",
   :rdfs/subClassOf :atom/Atom})

(def Chunk
  "A chunk of memory with undefined contents."
  {:owl/onDatatype  :xsd/base64Binary,
   :rdf/about       :atom/Chunk,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A chunk of memory with undefined contents.",
   :rdfs/label      "Chunk",
   :rdfs/subClassOf :atom/Atom})

(def DoubleClass
  "A native `double`."
  {:atom/cType      "LV2_Atom_Double",
   :owl/onDatatype  :xsd/double,
   :rdf/about       :atom/Double,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A native `double`.",
   :rdfs/label      "Double",
   :rdfs/subClassOf :atom/Number})

(def Event
  "An atom with a time stamp prefix in a sequence."
  {:atom/cType   "LV2_Atom_Event",
   :rdf/about    :atom/Event,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "An atom with a time stamp prefix in a sequence.",
   :rdfs/label   "Event"})

(def FloatClass
  "A native `float`."
  {:atom/cType      "LV2_Atom_Float",
   :owl/onDatatype  :xsd/float,
   :rdf/about       :atom/Float,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A native `float`.",
   :rdfs/label      "Float",
   :rdfs/subClassOf :atom/Number})

(def Int
  "A native `int32_t`."
  {:atom/cType      "LV2_Atom_Int",
   :owl/onDatatype  :xsd/int,
   :rdf/about       :atom/Int,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A native `int32_t`.",
   :rdfs/label      "Int",
   :rdfs/subClassOf :atom/Number})

(def Literal
  "A UTF-8 string literal with optional datatype or language."
  {:atom/cType "LV2_Atom_Literal",
   :rdf/about :atom/Literal,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A UTF-8 string literal with optional datatype or language.",
   :rdfs/label "Literal",
   :rdfs/subClassOf :atom/Atom})

(def LongClass
  "A native `int64_t`."
  {:atom/cType      "LV2_Atom_Long",
   :owl/onDatatype  :xsd/long,
   :rdf/about       :atom/Long,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A native `int64_t`.",
   :rdfs/label      "Long",
   :rdfs/subClassOf :atom/Number})

(def NumberClass
  "Base class for numeric types."
  {:rdf/about       :atom/Number,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Base class for numeric types.",
   :rdfs/label      "Number",
   :rdfs/subClassOf :atom/Atom})

(def ObjectClass
  "A collection of properties."
  {:atom/cType      "LV2_Atom_Object",
   :rdf/about       :atom/Object,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A collection of properties.",
   :rdfs/label      "Object",
   :rdfs/subClassOf :atom/Atom})

(def Path
  "A local file path."
  {:owl/onDatatype  :atom/URI,
   :rdf/about       :atom/Path,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A local file path.",
   :rdfs/label      "Path",
   :rdfs/subClassOf :atom/URI})

(def Property
  "A property of an atom:Object."
  {:atom/cType      "LV2_Atom_Property",
   :rdf/about       :atom/Property,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A property of an atom:Object.",
   :rdfs/label      "Property",
   :rdfs/subClassOf :atom/Atom})

(def Resource
  "A named collection of properties with a URI."
  {:atom/cType      "LV2_Atom_Object",
   :owl/deprecated  true,
   :rdf/about       :atom/Resource,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A named collection of properties with a URI.",
   :rdfs/label      "Resource",
   :rdfs/subClassOf :atom/Object})

(def Sequence
  "A sequence of events."
  {:atom/cType      "LV2_Atom_Sequence",
   :rdf/about       :atom/Sequence,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A sequence of events.",
   :rdfs/label      "Sequence",
   :rdfs/subClassOf :atom/Atom})

(def Sound
  "A atom:Vector of atom:Float which represents an audio waveform."
  {:atom/cType "LV2_Atom_Vector",
   :rdf/about :atom/Sound,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A atom:Vector of atom:Float which represents an audio waveform.",
   :rdfs/label "Sound",
   :rdfs/subClassOf :atom/Vector})

(def StringClass
  "A UTF-8 string."
  {:atom/cType      "LV2_Atom_String",
   :owl/onDatatype  :xsd/string,
   :rdf/about       :atom/String,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A UTF-8 string.",
   :rdfs/label      "String",
   :rdfs/subClassOf :atom/Atom})

(def Tuple
  "A sequence of atoms with varying type and size."
  {:rdf/about       :atom/Tuple,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A sequence of atoms with varying type and size.",
   :rdfs/label      "Tuple",
   :rdfs/subClassOf :atom/Atom})

(def URI
  "A URI string."
  {:owl/onDatatype  :xsd/anyURI,
   :rdf/about       :atom/URI,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A URI string.",
   :rdfs/label      "URI",
   :rdfs/subClassOf :atom/String})

(def URID
  "An unsigned 32-bit integer ID for a URI."
  {:atom/cType      "LV2_Atom_URID",
   :rdf/about       :atom/URID,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An unsigned 32-bit integer ID for a URI.",
   :rdfs/label      "URID",
   :rdfs/subClassOf :atom/Atom})

(def Vector
  "A homogeneous sequence of atom bodies with equivalent type and size."
  {:atom/cType "LV2_Atom_Vector",
   :rdf/about :atom/Vector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A homogeneous sequence of atom bodies with equivalent type and size.",
   :rdfs/label "Vector",
   :rdfs/subClassOf :atom/Atom})

(def atomTransfer
  "A port protocol for transferring atoms."
  {:rdf/about    :atom/atomTransfer,
   :rdf/type     :ui/PortProtocol,
   :rdfs/comment "A port protocol for transferring atoms.",
   :rdfs/label   "atom transfer"})

(def beatTime
  "A time stamp in beats."
  {:rdf/about    :atom/beatTime,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A time stamp in beats.",
   :rdfs/label   "beat time",
   :rdfs/range   :xsd/decimal})

(def bufferType
  "An atom type that a port may be connected to."
  {:rdf/about    :atom/bufferType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An atom type that a port may be connected to.",
   :rdfs/domain  :atom/AtomPort,
   :rdfs/label   "buffer type",
   :rdfs/range   :rdfs/Class})

(def cType
  "The C type that describes the binary representation of an Atom type."
  {:rdf/about :atom/cType,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The C type that describes the binary representation of an Atom type.",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "C type",
   :rdfs/range :lv2/Symbol})

(def childType
  "The type of children in a container."
  {:rdf/about    :atom/childType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The type of children in a container.",
   :rdfs/label   "child type"})

(def eventTransfer
  "A port protocol for transferring events."
  {:rdf/about    :atom/eventTransfer,
   :rdf/type     :ui/PortProtocol,
   :rdfs/comment "A port protocol for transferring events.",
   :rdfs/label   "event transfer"})

(def frameTime
  "A time stamp in audio frames."
  {:rdf/about    :atom/frameTime,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A time stamp in audio frames.",
   :rdfs/label   "frame time",
   :rdfs/range   :xsd/decimal})

(def supports
  "A supported atom type."
  {:rdf/about    :atom/supports,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A supported atom type.",
   :rdfs/label   "supports",
   :rdfs/range   :rdfs/Class})