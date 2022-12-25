(ns net.wikipunk.rdf.lv2.rsz
  "Dynamically sized LV2 port buffers."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "rsz",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/ext/resize-port"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/resize-port#",
   :rdf/ns-prefix-map {"rsz" "http://lv2plug.in/ns/ext/resize-port#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def asLargeAs
  "Port that this port must have at least as much buffer space as."
  {:rdfs/comment
     "Port that this port must have at least as much buffer space as.",
   :rdfs/label "as large as",
   :rdfs/range :lv2/Symbol,
   :rdfs/domain :lv2/Port,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def minimumSize
  "Minimum buffer size required by a port, in bytes."
  {:rdfs/comment "Minimum buffer size required by a port, in bytes.",
   :rdfs/label "minimum size",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/domain :lv2/Port,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property]})

(def resize
  "A feature for resizing output port buffers."
  {:rdfs/comment "A feature for resizing output port buffers.",
   :rdfs/label "resize",
   :rdf/type :lv2/Feature})