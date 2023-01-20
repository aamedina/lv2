(ns net.wikipunk.rdf.lv2.rsz
  "Dynamically sized LV2 port buffers."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.ttl",
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/ns-prefix-map {"lv2"     "http://lv2plug.in/ns/lv2core#",
                       "lv2.rsz" "http://lv2plug.in/ns/ext/resize-port#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/resize-port",
   :rdfa/prefix "lv2.rsz",
   :rdfa/uri "http://lv2plug.in/ns/ext/resize-port#",
   :rdfs/comment "Dynamically sized LV2 port buffers.",
   :rdfs/label "LV2 Resize Port",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.meta.ttl"]})

(def asLargeAs
  "Port that this port must have at least as much buffer space as."
  {:db/ident :lv2.rsz/asLargeAs,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Port that this port must have at least as much buffer space as.",
   :rdfs/domain :lv2/Port,
   :rdfs/label "as large as",
   :rdfs/range :lv2/Symbol})

(def minimumSize
  "Minimum buffer size required by a port, in bytes."
  {:db/ident     :lv2.rsz/minimumSize,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Minimum buffer size required by a port, in bytes.",
   :rdfs/domain  :lv2/Port,
   :rdfs/label   "minimum size",
   :rdfs/range   :xsd/nonNegativeInteger})

(def resize
  "A feature for resizing output port buffers."
  {:db/ident     :lv2.rsz/resize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature for resizing output port buffers.",
   :rdfs/label   "resize"})