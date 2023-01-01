(ns net.wikipunk.rdf.lv2.pset
  "This is a vocabulary for LV2 plugin presets, that is, named sets of control values and possibly other state.  The structure of a pset:Preset is deliberately identical to that of an lv2:Plugin, and can be thought of as a plugin template or overlay.  Presets may be defined in any bundle, including the plugin's bundle, separate third party preset bundles, or user preset bundles saved by hosts.  Since preset data tends to be large, it is recommended that plugins describe presets in a separate file(s) to avoid slowing down hosts.  The `manifest.ttl` of a bundle containing presets should list them like so:      :::turtle     eg:mypreset         a             pset:Preset ;         lv2:appliesTo eg:myplugin ;         rdfs:seeAlso  <mypreset.ttl> ."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.ttl",
   :lv2/project {:doap/created   "2009-00-00",
                 :doap/developer "http://drobilla.net/drobilla#me",
                 :doap/license   "http://opensource.org/licenses/isc",
                 :doap/name      "LV2 Presets",
                 :doap/shortdesc "Presets for LV2 plugins.",
                 :rdf/about      "http://lv2plug.in/ns/ext/presets",
                 :rdf/type       :doap/Project},
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/about "http://lv2plug.in/ns/ext/presets",
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "pset" "http://lv2plug.in/ns/ext/presets#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "pset",
   :rdfa/uri "http://lv2plug.in/ns/ext/presets#",
   :rdfs/comment "Presets for LV2 plugins.",
   :rdfs/label "LV2 Presets",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/presets.lv2/presets.meta.ttl"})

(def Bank
  "A bank of presets."
  {:rdf/about       :pset/Bank,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A bank of presets.",
   :rdfs/label      "Bank",
   :rdfs/subClassOf {:owl/minCardinality 1,
                     :owl/onProperty :rdfs/label,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A Bank MUST have at least one string rdfs:label."}})

(def Preset
  "The structure of a Preset deliberately mirrors that of a plugin, so existing predicates can be used to describe any data associated with the preset.  For example:      :::turtle     @prefix eg: <http://example.org/> .      eg:mypreset         a pset:Preset ;         rdfs:label \"One louder\" ;         lv2:appliesTo eg:myplugin ;         lv2:port [             lv2:symbol \"volume1\" ;             pset:value 11.0         ] , [             lv2:symbol \"volume2\" ;             pset:value 11.0         ] .  A Preset SHOULD have at least one lv2:appliesTo property.  Each Port on a Preset MUST have at least a lv2:symbol property and a pset:value property.  Hosts SHOULD save user presets to a bundle in the user-local LV2 directory (for example `~/.lv2`) with a name like `<Plugin_Name>_<Preset_Name>.preset.lv2` (for example `LV2_Amp_At_Eleven.preset.lv2`), where names are transformed to be valid LV2 symbols for maximum compatibility."
  {:rdf/about       :pset/Preset,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A preset for an LV2 plugin.",
   :rdfs/label      "Preset",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty :rdfs/label,
                      :rdf/type :owl/Restriction,
                      :rdfs/comment
                      "A Preset MUST have at least one string rdfs:label."}
                     :lv2/PluginBase]})

(def bank
  "The bank this preset belongs to."
  {:rdf/about    :pset/bank,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The bank this preset belongs to.",
   :rdfs/domain  :pset/Preset,
   :rdfs/label   "bank",
   :rdfs/range   :pset/Bank})

(def preset
  "Specifies the preset currently applied to a plugin instance.  This property may be useful for saving state, or notifying a plugin instance at run-time about a preset change."
  {:rdf/about    :pset/preset,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The preset currently applied to a plugin instance.",
   :rdfs/domain  :lv2/PluginBase,
   :rdfs/label   "preset",
   :rdfs/range   :pset/Preset})

(def value
  "This property is used in a similar way to lv2:default."
  {:rdf/about    :pset/value,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The value of a port in a preset.",
   :rdfs/domain  :lv2/PortBase,
   :rdfs/label   "value"})