(ns net.wikipunk.rdf.lv2.work
  "This extension allows plugins to schedule work that must be performed in another thread.  Plugins can use this interface to safely perform work that is not real-time safe, and receive the result in the run context.  The details of threading are managed by the host, allowing plugins to be simple and portable while using resources more efficiently.  This interface is designed to gracefully support single-threaded synchronous execution, which allows the same code to work with sample accuracy for offline rendering.  For example, a sampler plugin may schedule a sample to be loaded from disk in another thread.  During live execution, the host will call the plugin's work method from another thread, and deliver the result to the audio thread when it is finished.  However, during offline export, the <q>scheduled</q> load would be executed immediately in the same thread.  This enables reproducible offline rendering, where any changes affect the output immediately regardless of how long the work takes to execute."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.ttl",
   :lv2/project {:doap/created "2012-03-22",
                 :doap/developer {:rdf/uri "http://drobilla.net/drobilla#me"},
                 :doap/name "LV2 Worker",
                 :doap/shortdesc
                 "Support for doing non-realtime work in plugins.",
                 :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/worker"},
                 :rdf/type :doap/Project},
   :owl/imports {:rdf/uri "http://lv2plug.in/ns/lv2core"},
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/ext/worker"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "work" "http://lv2plug.in/ns/ext/worker#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "Support for doing non-realtime work in plugins.",
   :rdfs/label "LV2 Worker",
   :rdfs/seeAlso
   {:rdf/uri
    "https://gitlab.com/lv2/lv2/-/raw/master/lv2/worker.lv2/worker.meta.ttl"},
   :vann/preferredNamespacePrefix "work",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/worker#"})

(def interface
  "The work interface provided by a plugin, LV2_Worker_Interface.      :::turtle      @prefix work: <http://lv2plug.in/ns/ext/worker#> .      <plugin>         a lv2:Plugin ;         lv2:extensionData work:interface ."
  {:rdf/about    :work/interface,
   :rdf/type     :lv2/ExtensionData,
   :rdfs/comment "The work interface provided by a plugin.",
   :rdfs/label   "work interface"})

(def schedule
  "The work scheduling feature provided by a host, LV2_Worker_Schedule.  If the host passes this feature to LV2_Descriptor::instantiate, the plugin MAY use it to schedule work in the audio thread, and MUST NOT call it in any other context.  Hosts MAY pass this feature to other functions as well, in which case the plugin MAY use it to schedule work in the calling context.  The plugin MUST NOT assume any relationship between different schedule features."
  {:rdf/about    :work/schedule,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "The work scheduling feature provided by a host.",
   :rdfs/label   "work schedule"})