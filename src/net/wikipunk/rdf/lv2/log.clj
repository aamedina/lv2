(ns net.wikipunk.rdf.lv2.log
  "This extension defines a feature, log:log, which allows plugins to print log messages with an API similar to the standard C `printf` function.  This allows, for example, plugin logs to be nicely presented to the user in a graphical user interface.  Different log levels are defined by URI and passed as an LV2_URID.  This extensions defines standard levels which are expected to be understood by all implementations and should be sufficient in most cases, but advanced implementations may define and use additional levels to suit their needs."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.ttl",
   :lv2/project {:doap/created   "2012-01-12",
                 :doap/developer "http://drobilla.net/drobilla#me",
                 :doap/name      "LV2 Log",
                 :doap/shortdesc "A feature for writing log messages.",
                 :rdf/about      "http://lv2plug.in/ns/ext/log",
                 :rdf/type       :doap/Project},
   :owl/imports "http://lv2plug.in/ns/lv2core",
   :rdf/about "http://lv2plug.in/ns/ext/log",
   :rdf/ns-prefix-map {"log"  "http://lv2plug.in/ns/ext/log#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "log",
   :rdfa/uri "http://lv2plug.in/ns/ext/log#",
   :rdfs/comment "A feature for writing log messages.",
   :rdfs/label "LV2 Log",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/log.lv2/log.meta.ttl"})

(def Entry
  "Subclasses of this are passed as the `type` parameter to LV2_Log_Log methods to describe the nature of the log entry."
  {:rdf/about    :log/Entry,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "A log entry.",
   :rdfs/label   "Log Entry"})

(def ErrorClass
  "An error should only be posted when a serious unexpected error occurs, and should be actively shown to the user by the host."
  {:rdf/about       :log/Error,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An error message.",
   :rdfs/label      "Error",
   :rdfs/subClassOf :log/Entry})

(def Note
  "A note records some useful piece of information, but may be ignored.  The host should provide passive access to note entries to the user."
  {:rdf/about       :log/Note,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An informative message.",
   :rdfs/label      "Note",
   :rdfs/subClassOf :log/Entry})

(def Trace
  "A trace should not be displayed during normal operation, but the host may implement an option to display them for debugging purposes.  This entry type is special in that one may be posted in a real-time thread.  It is assumed that if debug tracing is enabled, real-time performance is not a concern.  However, the host MUST guarantee that posting a trace _is_ real-time safe if debug tracing is not enabled (for example, by simply ignoring the call as early as possible)."
  {:rdf/about       :log/Trace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A debugging trace message.",
   :rdfs/label      "Trace",
   :rdfs/subClassOf :log/Entry})

(def Warning
  "A warning should be posted when an unexpected, but non-critical, error occurs. The host should provide passive access to warnings entries to the user, but may also choose to actively show them."
  {:rdf/about       :log/Warning,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "A warning message.",
   :rdfs/label      "Warning",
   :rdfs/subClassOf :log/Entry})

(def log
  "A feature which plugins may use to log messages.  To support this feature, the host must pass an LV2_Feature to LV2_Descriptor::instantiate() with URI LV2_LOG__log and data pointed to an instance of LV2_Log_Log."
  {:rdf/about    :log/log,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Logging feature.",
   :rdfs/label   "log"})