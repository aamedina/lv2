(ns net.wikipunk.lv2.rdf.atom
  "An atom:Atom is a simple generic data container for holding any type of Plain Old Data (POD).  An Atom can contain simple primitive types like integers, floating point numbers, and strings; as well as structured data like lists and dictionary-like <q>Objects</q>.  Since Atoms are POD, they can be easily copied (for example, with `memcpy()`) anywhere and are suitable for use in real-time code.  Every atom starts with an LV2_Atom header, followed by the contents.  This allows code to process atoms without requiring special code for every type of data.  For example, plugins that mutually understand a type can be used together in a host that does not understand that type, because the host is only required to copy atoms, not interpret their contents.  Similarly, plugins (such as routers, delays, or data structures) can meaningfully process atoms of a type unknown to them.  Atoms should be used anywhere values of various types must be stored or transmitted.  An atom:AtomPort can be used to transmit atoms via ports.  An atom:AtomPort that contains a atom:Sequence can be used for sample accurate communication of events, such as MIDI.  ### Serialisation  Each Atom type defines a binary format for use at runtime, but also a serialisation that is natural to express in Turtle format.  Thus, this specification defines a powerful real-time appropriate data model, as well as a portable way to serialise any data in that model.  This is particularly useful for inter-process communication, saving/restoring state, and describing values in plugin data files.  ### Custom Atom Types  While it is possible to define new Atom types for any binary format, the standard types defined here are powerful enough to describe almost anything. Implementations SHOULD build structures out of the types provided here, rather than define new binary formats (for example, using atom:Object rather than a new C `struct` type).  Host and tool implementations have support for serialising all standard types, so new binary formats are an implementation burden which harms interoperabilty.  In particular, plugins SHOULD NOT expect UI communication or state saving with custom binary types to work.  In general, new Atom types should only be defined where absolutely necessary due to performance reasons and serialisation is not a concern."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/atom.lv2/atom.ttl",
   :lv2/project {:doap/created "2007-00-00",
                 :doap/developer "http://drobilla.net/drobilla#me",
                 :doap/license "http://opensource.org/licenses/isc",
                 :doap/name "LV2 Atom",
                 :doap/shortdesc
                 "A generic value container and several data types.",
                 :rdf/about "http://lv2plug.in/ns/ext/atom",
                 :rdf/type :doap/Project},
   :owl/imports ["http://lv2plug.in/ns/extensions/units"
                 "http://lv2plug.in/ns/extensions/ui"
                 "http://lv2plug.in/ns/lv2core"],
   :rdf/about "http://lv2plug.in/ns/ext/atom",
   :rdf/ns-prefix-map {"atom"  "http://lv2plug.in/ns/ext/atom#",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "ui"    "http://lv2plug.in/ns/extensions/ui#",
                       "units" "http://lv2plug.in/ns/extensions/units#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "atom",
   :rdfa/uri "http://lv2plug.in/ns/ext/atom#",
   :rdfs/comment "A generic value container and several data types.",
   :rdfs/label "LV2 Atom",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/atom.lv2/atom.meta.ttl"})

(def Atom
  "An LV2_Atom has a 32-bit `size` and `type`, followed by a body of `size` bytes. Atoms MUST be 64-bit aligned.  All concrete Atom types (subclasses of this class) MUST define a precise binary layout for their body.  The `type` field is the URI of an Atom type mapped to an integer. Implementations SHOULD gracefully pass through, or ignore, atoms with unknown types.  All atoms are POD by definition except references, which as a special case have `type` 0.  An Atom MUST NOT contain a Reference.  It is safe to copy any non-reference Atom with a simple `memcpy`, even if the implementation does not understand `type`.  Though this extension reserves the type 0 for references, the details of reference handling are currently unspecified.  A future revision of this extension, or a different extension, may define how to use non-POD data and references.  Implementations MUST NOT send references to another implementation unless the receiver is explicitly known to support references (e.g. by supporting a feature).  The special case of a null atom with both `type` and `size` 0 is not considered a reference."
  {:atom/cType   "LV2_Atom",
   :rdf/about    :atom/Atom,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "Abstract base class for all atoms.",
   :rdfs/label   "Atom"})

(def AtomPort
  "Ports of this type are connected to an LV2_Atom with a type specified by atom:bufferType.  Output ports with a variably sized type MUST be initialised by the host before every run() to an atom:Chunk with size set to the available space.  The plugin reads this size to know how much space is available for writing.  In all cases, the plugin MUST write a complete atom (including header) to outputs.  However, to be robust, hosts SHOULD initialise output ports to a safe sentinel (e.g. the null Atom) before calling run()."
  {:rdf/about       :atom/AtomPort,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A port which contains an atom:Atom.",
   :rdfs/label      "Atom Port",
   :rdfs/subClassOf :lv2/Port})

(def Blank
  "This class is deprecated.  Use atom:Object with ID 0 instead.  An atom:Object where the LV2_Atom_Object::id is a blank node ID (NOT a URI). The ID of a Blank is valid only within the context the Blank appears in.  For ports this is the context of the associated run() call, i.e. all ports share the same context so outputs can contain IDs that correspond to IDs of blanks in the input."
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
  "This type is used to indicate a certain amount of space is available.  For example, output ports with a variably sized type are connected to a Chunk so the plugin knows the size of the buffer available for writing.  The use of a Chunk should be constrained to a local scope, since interpreting it is impossible without context.  However, if serialised to RDF, a Chunk may be represented directly as an xsd:base64Binary string, for example:      :::turtle     [] eg:someChunk \"vu/erQ==\"^^xsd:base64Binary ."
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
  "An Event is typically an element of an atom:Sequence.  Note that this is not an Atom type since it begins with a timestamp, not an atom header."
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
  "This type is compatible with rdfs:Literal and is capable of expressing a string in any language or a value of any type.  A Literal has a `datatype` and `lang` followed by string data in UTF-8 encoding.  The length of the string data in bytes is `size - sizeof(LV2_Atom_Literal)`, including the terminating NULL character.  The `lang` field SHOULD be a URI of the form `http://lexvo.org/id/iso639-3/LANG` or `http://lexvo.org/id/iso639-1/LANG` where LANG is a 3-character ISO 693-3 language code, or a 2-character ISO 693-1 language code, respectively.  A Literal may have a `datatype` or a `lang`, but never both.  For example, a Literal can be <q>Hello</q> in English:      :::c     void set_to_hello_in_english(LV2_Atom_Literal* lit) {          lit->atom.type     = map(expand(\"atom:Literal\"));          lit->atom.size     = 14;          lit->body.datatype = 0;          lit->body.lang     = map(\"http://lexvo.org/id/iso639-1/en\");          memcpy(LV2_ATOM_CONTENTS(LV2_Atom_Literal, lit),                 \"Hello\",                 sizeof(\"Hello\"));  // Assumes enough space     }  or a Turtle string:      :::c     void set_to_turtle_string(LV2_Atom_Literal* lit, const char* ttl) {          lit->atom.type     = map(expand(\"atom:Literal\"));          lit->atom.size     = 64;          lit->body.datatype = map(\"http://www.w3.org/2008/turtle#turtle\");          lit->body.lang     = 0;          memcpy(LV2_ATOM_CONTENTS(LV2_Atom_Literal, lit),                 ttl,                 strlen(ttl) + 1);  // Assumes enough space     }"
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
  "An <q>Object</q> is an atom with a set of properties.  This corresponds to an RDF Resource, and can be thought of as a dictionary with URID keys.  An LV2_Atom_Object body has a uint32_t `id` and `type`, followed by a series of atom:Property bodies (LV2_Atom_Property_Body).  The LV2_Atom_Object_Body::otype field is equivalent to a property with key rdf:type, but is included in the structure to allow for fast dispatching.  Code SHOULD check for objects using lv2_atom_forge_is_object() or lv2_atom_forge_is_blank() if a forge is available, rather than checking the atom type directly.  This will correctly handle the deprecated atom:Resource and atom:Blank types.  When serialised to RDF, an Object is represented as a resource, for example:      :::turtle     eg:someObject         eg:firstPropertyKey \"first property value\" ;         eg:secondPropertyKey \"first loser\" ;         eg:andSoOn \"and so on\" ."
  {:atom/cType      "LV2_Atom_Object",
   :rdf/about       :atom/Object,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A collection of properties.",
   :rdfs/label      "Object",
   :rdfs/subClassOf :atom/Atom})

(def Path
  "A Path is a URI reference with only a path component: no scheme, authority, query, or fragment.  In particular, paths to files in the same bundle may be cleanly written in Turtle files as a relative URI.  However, implementations may assume any binary Path (e.g. in an event payload) is a valid file path which can passed to system functions like fopen() directly, without any character encoding or escape expansion required.  Any implementation that creates a Path atom to transmit to another is responsible for ensuring it is valid.  A Path SHOULD always be absolute, unless there is some mechanism in place that defines a base path.  Since this is not the case for plugin instances, effectively any Path sent to or received from a plugin instance MUST be absolute."
  {:owl/onDatatype  :atom/URI,
   :rdf/about       :atom/Path,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A local file path.",
   :rdfs/label      "Path",
   :rdfs/subClassOf :atom/URI})

(def Property
  "An LV2_Atom_Property has a URID `key` and `context`, and an Atom `value`.  This corresponds to an RDF Property, where the <q>key</q> is the <q>predicate</q> and the <q>value</q> is the object.  The `context` field can be used to specify a different context for each property, where this is useful.  Otherwise, it may be 0.  Properties generally only exist as part of an atom:Object.  Accordingly, they will typically be represented directly as properties in RDF (see atom:Object).  If this is not possible, they may be expressed as partial reified statements, for example:      :::turtle     eg:someProperty         rdf:predicate eg:theKey ;         rdf:object eg:theValue ."
  {:atom/cType      "LV2_Atom_Property",
   :rdf/about       :atom/Property,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A property of an atom:Object.",
   :rdfs/label      "Property",
   :rdfs/subClassOf :atom/Atom})

(def Resource
  "This class is deprecated.  Use atom:Object directly instead.  An atom:Object where the <code>id</code> field is a URID, that is, an Object with a URI."
  {:atom/cType      "LV2_Atom_Object",
   :owl/deprecated  true,
   :rdf/about       :atom/Resource,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A named collection of properties with a URI.",
   :rdfs/label      "Resource",
   :rdfs/subClassOf :atom/Object})

(def Sequence
  "A flat sequence of atom:Event, that is, a series of time-stamped Atoms.  LV2_Atom_Sequence_Body.unit describes the time unit for the contained atoms. If the unit is known from context (e.g. run() stamps are always audio frames), this field may be zero.  Otherwise, it SHOULD be either units:frame or units:beat, in which case ev.time.frames or ev.time.beats is valid, respectively.  If serialised to RDF, a Sequence has a similar form to atom:Vector, but for brevity the elements may be assumed to be atom:Event, for example:      :::turtle     eg:someSequence         a atom:Sequence ;         rdf:value (             [                 atom:frameTime 1 ;                 rdf:value \"901A01\"^^midi:MidiEvent             ] [                 atom:frameTime 3 ;                 rdf:value \"902B02\"^^midi:MidiEvent             ]         ) ."
  {:atom/cType      "LV2_Atom_Sequence",
   :rdf/about       :atom/Sequence,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A sequence of events.",
   :rdfs/label      "Sequence",
   :rdfs/subClassOf :atom/Atom})

(def Sound
  "The format of a atom:Sound is the same as the buffer format for lv2:AudioPort (except the size may be arbitrary).  An atom:Sound inherently depends on the sample rate, which is assumed to be known from context.  Because of this, directly serialising an atom:Sound is probably a bad idea, use a standard format like WAV instead."
  {:atom/cType "LV2_Atom_Vector",
   :rdf/about :atom/Sound,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A atom:Vector of atom:Float which represents an audio waveform.",
   :rdfs/label "Sound",
   :rdfs/subClassOf :atom/Vector})

(def StringClass
  "The body of an LV2_Atom_String is a C string in UTF-8 encoding, i.e. an array of bytes (`uint8_t`) terminated with a NULL byte (`'\\0'`).  This type is for free-form strings, but SHOULD NOT be used for typed data or text in any language.  Use atom:Literal unless translating the string does not make sense and the string has no meaningful datatype."
  {:atom/cType      "LV2_Atom_String",
   :owl/onDatatype  :xsd/string,
   :rdf/about       :atom/String,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A UTF-8 string.",
   :rdfs/label      "String",
   :rdfs/subClassOf :atom/Atom})

(def Tuple
  "The body of a Tuple is simply a series of complete atoms, each aligned to 64 bits.  If serialised to RDF, a Tuple SHOULD have the form:      :::turtle     eg:someVector          a atom:Tuple ;          rdf:value (              \"1\"^^xsd:int              \"3.5\"^^xsd:float              \"etc\"          ) ."
  {:rdf/about       :atom/Tuple,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A sequence of atoms with varying type and size.",
   :rdfs/label      "Tuple",
   :rdfs/subClassOf :atom/Atom})

(def URI
  "This is useful when a URI is needed but mapping is inappropriate, for example with temporary or relative URIs.  Since the ability to distinguish URIs from plain strings is often necessary, URIs MUST NOT be transmitted as atom:String.  This is not strictly a URI, since UTF-8 is allowed.  Escaping and related issues are the host's responsibility."
  {:owl/onDatatype  :xsd/anyURI,
   :rdf/about       :atom/URI,
   :rdf/type        [:rdfs/Datatype :rdfs/Class],
   :rdfs/comment    "A URI string.",
   :rdfs/label      "URI",
   :rdfs/subClassOf :atom/String})

(def URID
  "A URID is typically generated with the LV2_URID_Map provided by the host ."
  {:atom/cType      "LV2_Atom_URID",
   :rdf/about       :atom/URID,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An unsigned 32-bit integer ID for a URI.",
   :rdfs/label      "URID",
   :rdfs/subClassOf :atom/Atom})

(def Vector
  "A homogeneous series of atom bodies with equivalent type and size.  An LV2_Atom_Vector is a 32-bit `child_size` and `child_type` followed by `size / child_size` atom bodies.  For example, an atom:Vector containing 42 elements of type atom:Float:      :::c     struct VectorOf42Floats {         uint32_t size;        // sizeof(LV2_Atom_Vector_Body) + (42 * sizeof(float);         uint32_t type;        // map(expand(\"atom:Vector\"))         uint32_t child_size;  // sizeof(float)         uint32_t child_type;  // map(expand(\"atom:Float\"))         float    elems[42];     };  Note that it is possible to construct a valid Atom for each element of the vector, even by an implementation which does not understand `child_type`.  If serialised to RDF, a Vector SHOULD have the form:      :::turtle     eg:someVector          a atom:Vector ;          atom:childType atom:Int ;          rdf:value (              \"1\"^^xsd:int              \"2\"^^xsd:int              \"3\"^^xsd:int              \"4\"^^xsd:int          ) ."
  {:atom/cType "LV2_Atom_Vector",
   :rdf/about :atom/Vector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A homogeneous sequence of atom bodies with equivalent type and size.",
   :rdfs/label "Vector",
   :rdfs/subClassOf :atom/Atom})

(def atomTransfer
  "Transfer of the complete atom in a port buffer.  Useful as the `format` for a LV2UI_Write_Function.  This protocol applies to atom ports.  The host must transfer the complete atom contained in the port, including header."
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
  "Indicates that an AtomPort may be connected to a certain Atom type.  A port MAY support several buffer types.  The host MUST NOT connect a port to an Atom with a type not explicitly listed with this property.  The value of this property MUST be a sub-class of atom:Atom.  For example, an input port that is connected directly to an LV2_Atom_Double value is described like so:      :::turtle     <plugin>         lv2:port [             a lv2:InputPort , atom:AtomPort ;             atom:bufferType atom:Double ;         ] .  This property only describes the types a port may be directly connected to.  It says nothing about the expected contents of containers.  For that, use atom:supports."
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
  "Transfer of individual events in a port buffer.  Useful as the `format` for a LV2UI_Write_Function.  This protocol applies to ports which contain events, usually in an atom:Sequence.  The host must transfer each individual event to the recipient. The format of the received data is an LV2_Atom, there is no timestamp header."
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
  "This property is defined loosely, it may be used to indicate that anything <q>supports</q> an Atom type, wherever that may be useful.  It applies <q>recursively</q> where collections are involved.  In particular, this property can be used to describe which event types are expected by a port.  For example, a port that receives MIDI events is described like so:      :::turtle     <plugin>         lv2:port [             a lv2:InputPort , atom:AtomPort ;             atom:bufferType atom:Sequence ;             atom:supports midi:MidiEvent ;         ] ."
  {:rdf/about    :atom/supports,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A supported atom type.",
   :rdfs/label   "supports",
   :rdfs/range   :rdfs/Class})