(ns net.wikipunk.lv2.rdf.morph
  "This extension defines two port types: morph:MorphPort, which has a host-configurable type, and morph:AutoMorphPort, which may automatically change type when a MorphPort's type is changed.  These ports always have a default type and work normally work in hosts that are unaware of this extension.  Thus, this extension provides a backwards compatibility mechanism which allows plugins to use new port types but gracefully fall back to a default type in hosts that do not support them.  This extension only defines port types and properties for describing morph ports.  The actual run-time switching is done via the opts:interface API."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.ttl",
   :lv2/project {:doap/created   "2012-05-22",
                 :doap/developer "http://drobilla.net/drobilla#me",
                 :doap/name      "LV2 Morph",
                 :doap/shortdesc "Ports that can dynamically change type.",
                 :rdf/about      "http://lv2plug.in/ns/ext/morph",
                 :rdf/type       :doap/Project},
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/about "http://lv2plug.in/ns/ext/morph",
   :rdf/ns-prefix-map {"doap"  "http://usefulinc.com/ns/doap#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "lv2"   "http://lv2plug.in/ns/lv2core#",
                       "morph" "http://lv2plug.in/ns/ext/morph#",
                       "opts"  "http://lv2plug.in/ns/ext/options#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "morph",
   :rdfa/uri "http://lv2plug.in/ns/ext/morph#",
   :rdfs/comment "Ports that can dynamically change type.",
   :rdfs/label "LV2 Morph",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/morph.lv2/morph.meta.ttl"})

(def AutoMorphPort
  "Ports of this type MUST have another type which defines the default buffer format (for example, lv2:ControlPort) but may dynamically change types based on the configured types of any morph:MorphPort ports on the same plugin instance.  The type of a port may only change in response to a host call to LV2_Options_Interface::set().  Whenever any port type on the instance changes, the host MUST check the type of all morph:AutoMorphPort ports with LV2_Options_Interface::get() before calling run() again, since they may have changed.  If the type of any port is zero, it means the current configuration is invalid and the plugin may not be run (unless that port is lv2:connectionOptional and connected to NULL).  This is mainly useful for outputs whose type depends on the type of corresponding inputs."
  {:rdf/about       :morph/AutoMorphPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port that can change its type based on that of another.",
   :rdfs/label      "Auto Morph Port",
   :rdfs/subClassOf :lv2/Port})

(def MorphPort
  "Ports of this type MUST have another type which defines the default buffer format (for example lv2:ControlPort) but can be dynamically changed to a different type in hosts that support opts:interface.  The host may change the type of a MorphPort by setting its morph:currentType with LV2_Options_Interface::set().  If the plugin has any morph:AutoMorphPort ports, the host MUST check their types after changing any port type since they may have changed."
  {:rdf/about       :morph/MorphPort,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A port which can be switched to another type.",
   :rdfs/label      "Morph Port",
   :rdfs/subClassOf :lv2/Port})

(def currentType
  "The currently active type of the port.  This is for dynamic use as an option and SHOULD NOT be listed in the static plugin data."
  {:rdf/about    :morph/currentType,
   :rdf/type     [:owl/ObjectProperty :opts/Option :rdf/Property],
   :rdfs/comment "The currently active type of the port.",
   :rdfs/domain  :morph/MorphPort,
   :rdfs/label   "current type"})

(def supportsType
  "Indicates that a port supports being switched to a certain type.  A MorphPort MUST list each type it supports being switched to in the plugin data using this property."
  {:rdf/about    :morph/supportsType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A type that a port supports being switched to.",
   :rdfs/domain  :morph/MorphPort,
   :rdfs/label   "supports type"})