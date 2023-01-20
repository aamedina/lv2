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
                       "rsz"     "http://lv2plug.in/ns/ext/resize-port#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/resize-port",
   :rdfa/prefix "lv2.rsz",
   :rdfa/uri "http://lv2plug.in/ns/ext/resize-port#",
   :rdfs/comment "Dynamically sized LV2 port buffers.",
   :rdfs/label "LV2 Resize Port",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/resize-port.lv2/resize-port.meta.ttl"]})