(ns net.wikipunk.rdf.ingen
  "Ingen is a modular audio processing environment. This vocabulary describes an Ingen configuration, and is used in both the control protocol and saved files. Conceptually, Ingen represents a tree of objects, each of which has a path (like /main/in or /main/osc/out) and a set of properties."
  {:dcat/downloadURL
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/ingen.ttl",
   :doap/name "Ingen",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.ui"   "http://lv2plug.in/ns/extensions/ui#",
                       "lv2.work" "http://lv2plug.in/ns/ext/worker#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ingen",
   :rdfa/uri "http://drobilla.net/ns/ingen#",
   :rdfs/comment
   "Ingen is a modular audio processing environment.  This vocabulary describes an Ingen configuration, and is used in both the control protocol and saved files.  Conceptually, Ingen represents a tree of objects, each of which has a path (like /main/in or /main/osc/out) and a set of properties.",
   :rdfs/label "Ingen"})

(def Arc
  "A connection between two ports. Graphs have a set of arcs which define how its component blocks and ports are connected."
  {:db/ident :ingen/Arc,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A connection between two ports.  Graphs have a set of arcs which define how its component blocks and ports are connected.",
   :rdfs/label "Arc",
   :rdfs/subClassOf
   [:rdfs/Resource
    {:owl/allValuesFrom :lv2/Port,
     :owl/cardinality   1,
     :owl/onProperty    :ingen/head,
     :rdf/type          :owl/Restriction,
     :rdfs/comment      "MUST have exactly one head which is a lv2:Port."}
    {:owl/allValuesFrom :lv2/Port,
     :owl/cardinality   1,
     :owl/onProperty    :ingen/tail,
     :rdf/type          :owl/Restriction,
     :rdfs/comment      "MUST have exactly one tail which is a lv2:Port."}]})

(def Block
  "A signal processing block, which is typically either a plugin instance, or a graph. A block MUST have at least one lv2:prototype property which is a subclass of lv2:Plugin. When there are many such properties, an applications SHOULD use the most specific class it understands."
  {:db/ident :ingen/Block,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A signal processing block, which is typically either a plugin instance, or a graph.\n\nA block MUST have at least one lv2:prototype property which is a subclass of lv2:Plugin.  When there are many such properties, an applications SHOULD use the most specific class it understands.",
   :rdfs/label "Block",
   :rdfs/subClassOf [:lv2/PluginBase :ingen/Node :rdfs/Resource]})

(def BundleEnd
  "The end of an undo transaction."
  {:db/ident        :ingen/BundleEnd,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "The end of an undo transaction.",
   :rdfs/label      "Bundle End",
   :rdfs/subClassOf :rdfs/Resource})

(def BundleStart
  "The start of an undo transaction."
  {:db/ident        :ingen/BundleStart,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "The start of an undo transaction.",
   :rdfs/label      "Bundle Start",
   :rdfs/subClassOf :rdfs/Resource})

(def Graph
  "A collection of Blocks connected together. A Graph can itself be a Block within a parent Graph, and so on."
  {:db/ident :ingen/Graph,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A collection of Blocks connected together.  A Graph can itself be a Block within a parent Graph, and so on.",
   :rdfs/label "Graph",
   :rdfs/subClassOf [:ingen/Plugin :rdfs/Resource]})

(def Internal
  "An internal 'plugin'"
  {:db/ident        :ingen/Internal,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An internal 'plugin'",
   :rdfs/label      "Internal",
   :rdfs/subClassOf [:ingen/Plugin :rdfs/Resource]})

(def Node
  "An element of a Graph. A Node always has a valid path and symbol, with the possible exception of the root graph which may not have a symbol depending on context. Ingen uses restricted paths and/or URIs built from valid lv2:symbol components, so the symbol of a Node may be inferred from its URI if no explicit lv2:symbol property is given."
  {:db/ident :ingen/Node,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An element of a Graph.  A Node always has a valid path and symbol, with the possible exception of the root graph which may not have a symbol depending on context.  Ingen uses restricted paths and/or URIs built from valid lv2:symbol components, so the symbol of a Node may be inferred from its URI if no explicit lv2:symbol property is given.",
   :rdfs/label "Node",
   :rdfs/subClassOf :rdfs/Resource})

(def Plugin
  "A class which can be instantiated into a ingen:Block. A plugin has a set of input and output \"ports\". In practice this class is semantically equivalent to lv2:Plugin, it only exists to allow the ingen ontology to be useful for \"plugins\" that aren't semantically LV2 plugins. See the LV2 specification for details about the required properties (rdf:type, doap:name, doap:license, and lv2:port)."
  {:db/ident :ingen/Plugin,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A class which can be instantiated into a ingen:Block.  A plugin has a set of input and output \"ports\".  In practice this class is semantically equivalent to lv2:Plugin, it only exists to allow the ingen ontology to be useful for \"plugins\" that aren't semantically LV2 plugins.  See the LV2 specification for details about the required properties (rdf:type, doap:name, doap:license, and lv2:port). ",
   :rdfs/label "Plugin",
   :rdfs/subClassOf :rdfs/Resource})

(def Undo
  "A request to undo the previous change."
  {:db/ident        :ingen/Undo,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A request to undo the previous change.",
   :rdfs/label      "Undo",
   :rdfs/subClassOf :rdfs/Resource})

(def activity
  "Transient activity. This property is used in the protocol to communicate activity at ports, such as MIDI events or audio peaks. It should never be stored in persistent data."
  {:db/ident :ingen/activity,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Transient activity.  This property is used in the protocol to communicate activity at ports, such as MIDI events or audio peaks.  It should never be stored in persistent data.",
   :rdfs/domain :lv2/Port,
   :rdfs/label "activity"})

(def arc
  "An arc contained in this graph."
  {:db/ident     :ingen/arc,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "An arc contained in this graph.",
   :rdfs/domain  :ingen/Graph,
   :rdfs/label   "arc",
   :rdfs/range   :ingen/Arc})

(def block
  "Signifies a graph contains some block."
  {:db/ident     :ingen/block,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Signifies a graph contains some block.",
   :rdfs/domain  :ingen/Graph,
   :rdfs/label   "block",
   :rdfs/range   :ingen/Block})

(def broadcast
  "Whether or not the port's value or activity should be broadcast to clients."
  {:db/ident :ingen/broadcast,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Whether or not the port's value or activity should be broadcast to clients.",
   :rdfs/domain :lv2/Port,
   :rdfs/label "broadcast",
   :rdfs/range :xsd/boolean})

(def canvasX
  "The X coordinate of an item on a canvas."
  {:db/ident     :ingen/canvasX,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The X coordinate of an item on a canvas.",
   :rdfs/label   "canvas X",
   :rdfs/range   :xsd/decimal})

(def canvasY
  "The Y coordinate of an item on a canvas."
  {:db/ident     :ingen/canvasY,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The Y coordinate of an item on a canvas.",
   :rdfs/label   "canvas Y",
   :rdfs/range   :xsd/decimal})

(def enabled
  "Signifies the block is or should be running."
  {:db/ident     :ingen/enabled,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Signifies the block is or should be running.",
   :rdfs/domain  :ingen/Block,
   :rdfs/label   "enabled",
   :rdfs/range   :xsd/boolean})

(def externalContext
  "The context for externally visible Graph properties, that is, properties which apply to the Graph when viewed as a Block within its parent Graph and should be saved in the parent's description."
  {:db/ident :ingen/externalContext,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   "The context for externally visible Graph properties, that is, properties which apply to the Graph when viewed as a Block within its parent Graph and should be saved in the parent's description.",
   :rdfs/label "external context"})

(def file
  "The file a Graph was loaded from."
  {:db/ident     :ingen/file,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The file a Graph was loaded from.",
   :rdfs/domain  :ingen/Graph,
   :rdfs/label   "file",
   :rdfs/range   :xsd/anyURI})

(def head
  "The destination/receiving/sink port of this arc"
  {:db/ident     :ingen/head,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The destination/receiving/sink port of this arc",
   :rdfs/domain  :ingen/Arc,
   :rdfs/label   "head",
   :rdfs/range   :lv2/Port})

(def incidentTo
  "A special property used to describe any arc incident to a port or block. This is never saved in graph files, but is used in the control protocol to completely disconnect a Block or Port."
  {:db/ident :ingen/incidentTo,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A special property used to describe any arc incident to a port or block.  This is never saved in graph files, but is used in the control protocol to completely disconnect a Block or Port.",
   :rdfs/domain :ingen/Arc,
   :rdfs/label "incident to"})

(def internalContext
  "The context for internally visible Graph properties, that is, properties which are only relevant inside the graph and should be saved in the Graph's description."
  {:db/ident :ingen/internalContext,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   "The context for internally visible Graph properties, that is, properties which are only relevant inside the graph and should be saved in the Graph's description.",
   :rdfs/label "internal context"})

(def loadedBundle
  "Whether or not a bundle is loaded into Ingen."
  {:db/ident     :ingen/loadedBundle,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Whether or not a bundle is loaded into Ingen.",
   :rdfs/label   "loaded bundle"})

(def longSwitch
  "Lowercase, hyphenated switch for long command line argument."
  {:db/ident     :ingen/longSwitch,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Lowercase, hyphenated switch for long command line argument.",
   :rdfs/domain  :rdf/Property,
   :rdfs/label   "long switch",
   :rdfs/range   :xsd/string})

(def maxRunLoad
  "The maximum fraction of a cycle spent running DSP."
  {:db/ident     :ingen/maxRunLoad,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The maximum fraction of a cycle spent running DSP.",
   :rdfs/label   "maximum run load",
   :rdfs/range   :xsd/decimal})

(def meanRunLoad
  "The average fraction of a cycle spent running DSP."
  {:db/ident     :ingen/meanRunLoad,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The average fraction of a cycle spent running DSP.",
   :rdfs/label   "mean run load",
   :rdfs/range   :xsd/decimal})

(def minRunLoad
  "The minimum fraction of a cycle spent running DSP."
  {:db/ident     :ingen/minRunLoad,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The minimum fraction of a cycle spent running DSP.",
   :rdfs/label   "minimum run load",
   :rdfs/range   :xsd/decimal})

(def numThreads
  "number of threads"
  {:db/ident          :ingen/numThreads,
   :ingen/longSwitch  "threads",
   :ingen/shortSwitch "p",
   :rdf/type          [:owl/ObjectProperty :rdf/Property],
   :rdfs/label        "number of threads"})

(def polyphonic
  "Signifies this node should be replicated when it is part of a polyphonic graph. The amount of polyphony (i.e. the number of voices) is determined by the ingen:polyphony property of the containing graph. This is a boolean property which defines whether the parent can access each voice individually: All nodes within a graph are either polyphonic or not from their parent's perspective. An Node may itself have \"internal\" polyphony but not be polyphonic according to this property, if those voices are mixed down."
  {:db/ident :ingen/polyphonic,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Signifies this node should be replicated when it is part of a polyphonic graph. The amount of polyphony (i.e. the number of voices) is determined by the ingen:polyphony property of the containing graph.  This is a boolean property which defines whether the parent can access each voice individually: All nodes within a graph are either polyphonic or not from their parent's perspective. An Node may itself have \"internal\" polyphony but not be polyphonic according to this property, if those voices are mixed down.",
   :rdfs/label "polyphonic",
   :rdfs/range :xsd/boolean})

(def polyphony
  "The amount of polyphony in a Graph. This defines the number of voices present on all :polyphonic children of this graph. Because a Graph is also a Block, a Graph may have both :polyphony and :polyphonic properties. These specify different things: :polyphony specifies the voice count of the Graph's children, and :polyphonic specifies whether the graph is seen as polyphonic to the Graph's parent."
  {:db/ident :ingen/polyphony,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The amount of polyphony in a Graph.  This defines the number of voices present on all :polyphonic children of this graph.  Because a Graph is also a Block, a Graph may have both :polyphony and :polyphonic properties. These specify different things: :polyphony specifies the voice count of the Graph's children, and :polyphonic specifies whether the graph is seen as polyphonic to the Graph's parent.",
   :rdfs/domain :ingen/Graph,
   :rdfs/label "polyphony",
   :rdfs/range :xsd/integer})

(def prototype
  "The object which this block is an instance of, or derived from."
  {:db/ident :ingen/prototype,
   :owl/deprecated true,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The object which this block is an instance of, or derived from.",
   :rdfs/domain :ingen/Block,
   :rdfs/label "prototype"})

(def shortSwitch
  "Single character switch for short command line argument."
  {:db/ident     :ingen/shortSwitch,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Single character switch for short command line argument.",
   :rdfs/domain  :rdf/Property,
   :rdfs/label   "short switch",
   :rdfs/range   :xsd/string})

(def sprungLayout
  "Whether or not the graph has a \"sprung\" force-directed layout."
  {:db/ident :ingen/sprungLayout,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Whether or not the graph has a \"sprung\" force-directed layout.",
   :rdfs/domain :ingen/Graph,
   :rdfs/label "sprung layout",
   :rdfs/range :xsd/boolean})

(def tail
  "The source/sending port of this arc"
  {:db/ident     :ingen/tail,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The source/sending port of this arc",
   :rdfs/domain  :ingen/Arc,
   :rdfs/label   "tail",
   :rdfs/range   :lv2/Port})

(def uiEmbedded
  "Whether or not the block's GUI is embedded."
  {:db/ident     :ingen/uiEmbedded,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Whether or not the block's GUI is embedded.",
   :rdfs/label   "UI embedded",
   :rdfs/range   :xsd/boolean})

(def value
  "The current value of a port."
  {:db/ident     :ingen/value,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The current value of a port.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "value"})
