(ns net.wikipunk.rdf.lv2.rsz
  "This extension defines a feature, rsz:resize, which allows plugins to dynamically resize their output port buffers.  In addition to the dynamic feature, there are properties which describe the space required for a particular port buffer which can be used statically in data files."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.ttl",
   :lv2/project {:doap/created   "2007-00-00",
                 :doap/developer "http://drobilla.net/drobilla#me",
                 :doap/name      "LV2 Resize Port",
                 :doap/shortdesc "Dynamically sized LV2 port buffers.",
                 :rdf/about      "http://lv2plug.in/ns/ext/resize-port",
                 :rdf/type       :doap/Project},
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/about "http://lv2plug.in/ns/ext/resize-port",
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "rsz"  "http://lv2plug.in/ns/ext/resize-port#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "rsz",
   :rdfa/uri "http://lv2plug.in/ns/ext/resize-port#",
   :rdfs/comment "Dynamically sized LV2 port buffers.",
   :rdfs/label "LV2 Resize Port",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.meta.ttl"})

(def asLargeAs
  "Indicates that a port requires at least as much buffer space as the port with the given symbol on the same plugin instance.  This may be used for any ports, but is generally most useful to indicate an output port must be at least as large as some input port (because it will copy from it).  If a port is asLargeAs several ports, it is asLargeAs the largest such port (not the sum of those ports' sizes).  The host guarantees that whenever an ObjectPort's run method is called, any output `O` that is rsz:asLargeAs an input `I` is connected to a buffer large enough to copy `I`, or `NULL` if the port is lv2:connectionOptional."
  {:rdf/about :rsz/asLargeAs,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Port that this port must have at least as much buffer space as.",
   :rdfs/domain :lv2/Port,
   :rdfs/label "as large as",
   :rdfs/range :lv2/Symbol})

(def minimumSize
  "Indicates that a port requires a buffer at least this large, in bytes.  Any host that supports the resize-port feature MUST connect any port with a minimumSize specified to a buffer at least as large as the value given for this property.  Any host, especially those that do NOT support dynamic port resizing, SHOULD do so or reduced functionality may result."
  {:rdf/about    :rsz/minimumSize,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Minimum buffer size required by a port, in bytes.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "minimum size",
   :rdfs/range   :xsd/nonNegativeInteger})

(def resize
  "A feature to resize output port buffers in LV2_Plugin_Descriptor::run().  To support this feature, the host must pass an LV2_Feature to the plugin's instantiate method with URI LV2_RESIZE_PORT__resize and a pointer to a LV2_Resize_Port_Resize structure.  This structure provides a resize_port function which plugins may use to resize output port buffers as necessary."
  {:rdf/about    :rsz/resize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature for resizing output port buffers.",
   :rdfs/label   "resize"})