(ns net.wikipunk.rdf.lv2.rsz
  "Dynamically sized LV2 port buffers."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.ttl",
   :owl/imports #:rdf{:uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about #:rdf{:uri "http://lv2plug.in/ns/ext/resize-port"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "rsz"  "http://lv2plug.in/ns/ext/resize-port#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   #:rdf{:uri
         "https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.meta.ttl"},
   :vann/preferredNamespacePrefix "rsz",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/resize-port#"}
  (:refer-clojure :exclude []))

(def asLargeAs
  "Port that this port must have at least as much buffer space as."
  {:rdf/about   :rsz/asLargeAs,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :lv2/Port,
   :rdfs/label  "as large as",
   :rdfs/range  :lv2/Symbol})

(def minimumSize
  "Minimum buffer size required by a port, in bytes."
  {:rdf/about   :rsz/minimumSize,
   :rdf/type    [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :lv2/Port,
   :rdfs/label  "minimum size",
   :rdfs/range  :xsd/nonNegativeInteger})

(def resize
  "A feature for resizing output port buffers."
  {:rdf/about  :rsz/resize,
   :rdf/type   :lv2/Feature,
   :rdfs/label "resize"})