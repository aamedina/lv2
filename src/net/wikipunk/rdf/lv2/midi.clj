(ns net.wikipunk.rdf.lv2.midi
  "A normalised definition of raw MIDI."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.ttl",
   :rdf/ns-prefix-map {"atom"     "http://lv2plug.in/ns/ext/atom#",
                       "ev"       "http://lv2plug.in/ns/ext/event#",
                       "lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.midi" "http://lv2plug.in/ns/ext/midi#",
                       "midi"     "http://lv2plug.in/ns/ext/midi#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/ext/midi",
   :rdfa/prefix "lv2.midi",
   :rdfa/uri "http://lv2plug.in/ns/ext/midi#",
   :rdfs/comment "A normalised definition of raw MIDI.",
   :rdfs/label "LV2 MIDI",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/midi.lv2/midi.meta.ttl"]})