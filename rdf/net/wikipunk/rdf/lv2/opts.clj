(ns net.wikipunk.rdf.lv2.opts
  "This extension defines a facility for <q>options</q>, which are values the host passes to a plugin or UI at run time.  There are two facilities for passing options to an instance: opts:options allows passing options at instantiation time, and the opts:interface interface allows options to be dynamically set and retrieved after instantiation.  Note that this extension is only for allowing hosts to configure plugins, and is not a <q>live</q> control mechanism.  For real-time control, use event-based control via an atom:AtomPort with an atom:Sequence buffer.  Instances may indicate they require an option with the opts:requiredOption property, or that they optionally support an option with the opts:supportedOption property."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.ttl",
   :doap/created "2012-08-20",
   :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
   :doap/name "LV2 Options",
   :doap/shortdesc "Runtime options for LV2 plugins and UIs.",
   :lv2/documentation
   {:rdf/literal
    "\n\nThis extension defines a facility for <q>options</q>, which are values the host\npasses to a plugin or UI at run time.\n\nThere are two facilities for passing options to an instance: opts:options\nallows passing options at instantiation time, and the opts:interface interface\nallows options to be dynamically set and retrieved after instantiation.\n\nNote that this extension is only for allowing hosts to configure plugins, and\nis not a <q>live</q> control mechanism.  For real-time control, use event-based\ncontrol via an atom:AtomPort with an atom:Sequence buffer.\n\nInstances may indicate they require an option with the opts:requiredOption\nproperty, or that they optionally support an option with the\nopts:supportedOption property.\n\n",
    :rdf/uri "http://lv2plug.in/ns/lv2core#Markdown"},
   :lv2/project {:doap/created   "2012-08-20",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/name      "LV2 Options",
                 :doap/shortdesc "Runtime options for LV2 plugins and UIs.",
                 :rdf/about      {:rdf/uri "http://lv2plug.in/ns/ext/options"},
                 :rdf/type       :doap/Project},
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/options"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "Runtime options for LV2 plugins and UIs.",
   :rdfs/label "LV2 Options",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/options.lv2/options.meta.ttl"},
   :vann/preferredNamespacePrefix "opts",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/options#"})

(def Option
  "It is not required for a property to explicitly be an Option in order to be used as such.  However, properties which are primarily intended for use as options, or are at least particularly useful as options, should be explicitly given this type for documentation purposes, and to assist hosts in discovering option definitions."
  {:rdf/about       :opts/Option,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Option",
   :rdfs/subClassOf :rdf/Property})

(def interface
  "An interface (LV2_Options_Interface) for dynamically setting and getting options.  Note that this is intended for use by the host for configuring plugins only, and is not a <q>live</q> plugin control mechanism.  The plugin data file should advertise this interface like so:      :::turtle     @prefix opts: <http://lv2plug.in/ns/ext/options#> .      <plugin>         a lv2:Plugin ;         lv2:extensionData opts:interface ."
  {:rdf/about  :opts/interface,
   :rdf/type   :lv2/ExtensionData,
   :rdfs/label "interface"})

(def options
  "To implement this feature, hosts MUST pass an LV2_Feature to the appropriate instantiate method with this URI and data pointed to an array of LV2_Options_Option terminated by an element with both key and value set to zero.  The instance should cast this data pointer to `const LV2_Options_Option*` and scan the array for any options of interest.  The instance MUST NOT modify the options array in any way.  Note that requiring this feature may reduce the number of compatible hosts. Unless some options are strictly required by the instance, this feature SHOULD be listed as an lv2:optionalFeature."
  {:rdf/about  :opts/options,
   :rdf/type   :lv2/Feature,
   :rdfs/label "options"})

(def requiredOption
  "The host MUST pass a value for the specified option via opts:options during instantiation.  Note that use of this property may reduce the number of compatible hosts. Wherever possible, it is better to list options with opts:supportedOption and fall back to a reasonable default value if it is not provided."
  {:rdf/about  :opts/requiredOption,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "required option",
   :rdfs/range :rdf/Property})

(def supportedOption
  "The host SHOULD provide a value for the specified option if one is known, or provide the user an opportunity to specify one if possible."
  {:rdf/about  :opts/supportedOption,
   :rdf/type   [:owl/ObjectProperty :rdf/Property],
   :rdfs/label "supported option",
   :rdfs/range :rdf/Property})