(ns net.wikipunk.rdf.lv2.time
  "A vocabulary for describing musical time."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.ttl",
   :rdf/ns-prefix-map {"lv2.time" "http://lv2plug.in/ns/ext/time#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "time"     "http://lv2plug.in/ns/ext/time#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/time",
   :rdfa/prefix "lv2.time",
   :rdfa/uri "http://lv2plug.in/ns/ext/time#",
   :rdfs/comment "A vocabulary for describing musical time.",
   :rdfs/label "LV2 Time",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/time.lv2/time.meta.ttl"]})