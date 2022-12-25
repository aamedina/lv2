(ns net.wikipunk.rdf.lv2.ui
  "User interfaces for LV2 plugins."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "ui",
   :rdfs/seeAlso
     #:rdf{:uri
             "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.meta.ttl"},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.ttl",
   :owl/imports [#:rdf{:uri "http://lv2plug.in/ns/ext/options"}
                 #:rdf{:uri "http://lv2plug.in/ns/lv2core"}],
   :rdf/about [#:rdf{:uri "http://lv2plug.in/ns/extensions/ui"}],
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/ui#",
   :rdf/ns-prefix-map {"ui" "http://lv2plug.in/ns/extensions/ui#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#",
                       "lv2" "http://lv2plug.in/ns/lv2core#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"}}
  (:refer-clojure :exclude []))

(def CocoaUI
  "A UI where the widget is a pointer to a NSView."
  {:rdfs/comment "A UI where the widget is a pointer to a NSView.",
   :rdfs/label "Cocoa UI",
   :rdfs/subClassOf :ui/UI,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Gtk3UI
  "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget."
  {:rdfs/comment "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget.",
   :rdfs/label "GTK3 UI",
   :rdfs/subClassOf :ui/UI,
   :rdf/type [:owl/Class :rdfs/Class]})

(def GtkUI
  "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget."
  {:rdfs/comment "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget.",
   :rdfs/label "GTK2 UI",
   :rdfs/subClassOf :ui/UI,
   :rdf/type [:owl/Class :rdfs/Class]})

(def PortNotification
  "A description of port updates that a host must send a UI."
  {:rdfs/comment "A description of port updates that a host must send a UI.",
   :rdfs/label "Port Notification",
   :rdfs/subClassOf {:rdfs/comment
                       "A PortNotification MUST have exactly one ui:plugin.",
                     :owl/cardinality 1,
                     :owl/onProperty :ui/plugin,
                     :rdf/type :owl/Restriction},
   :rdf/type [:owl/Class :rdfs/Class]})

(def PortProtocol
  "A method to communicate port data between a UI and plugin."
  {:rdfs/comment "A method to communicate port data between a UI and plugin.",
   :rdfs/label "Port Protocol",
   :rdfs/subClassOf :lv2/Feature,
   :rdf/type :rdfs/Class})

(def Qt4UI
  "A UI where the widget is a pointer to a Qt4 QWidget."
  {:rdfs/comment "A UI where the widget is a pointer to a Qt4 QWidget.",
   :rdfs/label "Qt4 UI",
   :rdfs/subClassOf :ui/UI,
   :rdf/type [:owl/Class :rdfs/Class]})

(def Qt5UI
  "A UI where the widget is a pointer to a Qt5 QWidget."
  {:rdfs/comment "A UI where the widget is a pointer to a Qt5 QWidget.",
   :rdfs/label "Qt5 UI",
   :rdfs/subClassOf :ui/UI,
   :rdf/type [:owl/Class :rdfs/Class]})

(def UI
  "A UI for an LV2 plugin."
  {:rdfs/comment "A UI for an LV2 plugin.",
   :rdfs/label "User Interface",
   :rdf/type [:owl/Class :rdfs/Class]})

(def WindowsUI
  "A UI where the widget is a Windows HWND window ID."
  {:rdfs/comment "A UI where the widget is a Windows HWND window ID.",
   :rdfs/label "Windows UI",
   :rdfs/subClassOf :ui/UI,
   :rdf/type [:owl/Class :rdfs/Class]})

(def X11UI
  "A UI where the widget is an X11 Window window ID."
  {:rdfs/comment "A UI where the widget is an X11 Window window ID.",
   :rdfs/label "X11 UI",
   :rdfs/subClassOf :ui/UI,
   :rdf/type [:owl/Class :rdfs/Class]})

(def backgroundColor
  "The background color of the host's UI."
  {:rdfs/comment "The background color of the host's UI.",
   :rdfs/label "background color",
   :rdf/type [:opts/Option :owl/DatatypeProperty :rdf/Property]})

(def binary
  "The shared library that a UI resides in."
  {:rdfs/comment "The shared library that a UI resides in.",
   :rdfs/label "binary",
   :owl/deprecated true,
   :owl/sameAs :lv2/binary,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def fixedSize
  "Non-resizable UI that will never resize itself."
  {:rdfs/comment "Non-resizable UI that will never resize itself.",
   :rdfs/label "fixed size",
   :rdf/type :lv2/Feature})

(def floatProtocol
  "A protocol for transferring single floating point values."
  {:rdfs/comment "A protocol for transferring single floating point values.",
   :rdfs/label "float protocol",
   :rdf/type :ui/PortProtocol})

(def foregroundColor
  "The foreground color of the host's UI."
  {:rdfs/comment "The foreground color of the host's UI.",
   :rdfs/label "foreground color",
   :rdf/type [:opts/Option :owl/DatatypeProperty :rdf/Property]})

(def idleInterface
  "A feature that provides a callback for the host to drive the UI."
  {:rdfs/comment
     "A feature that provides a callback for the host to drive the UI.",
   :rdfs/label "idle interface",
   :rdf/type [:lv2/ExtensionData :lv2/Feature]})

(def makeSONameResident
  "UI binary must not be unloaded."
  {:rdfs/comment "UI binary must not be unloaded.",
   :rdfs/label "make SO name resident",
   :owl/deprecated true,
   :rdf/type :lv2/Feature})

(def noUserResize
  "Non-resizable UI."
  {:rdfs/comment "Non-resizable UI.",
   :rdfs/label "no user resize",
   :rdf/type :lv2/Feature})

(def notifyType
  "A particular type that the UI should be notified of."
  {:rdfs/comment "A particular type that the UI should be notified of.",
   :rdfs/label "notify type",
   :rdfs/domain :ui/PortNotification,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def parent
  "The parent for a UI."
  {:rdfs/comment "The parent for a UI.",
   :rdfs/label "parent",
   :rdf/type :lv2/Feature})

(def peakProtocol
  "A protocol for sending continuous peak measurements of an audio signal."
  {:rdfs/comment
     "A protocol for sending continuous peak measurements of an audio signal.",
   :rdfs/label "peak protocol",
   :rdf/type :ui/PortProtocol})

(def plugin
  "The plugin a portNotification applies to."
  {:rdfs/comment "The plugin a portNotification applies to.",
   :rdfs/label "plugin",
   :rdfs/range :lv2/Plugin,
   :rdfs/domain :ui/PortNotification,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def portIndex
  "The index of the port a portNotification applies to."
  {:rdfs/comment "The index of the port a portNotification applies to.",
   :rdfs/label "port index",
   :rdfs/range :xsd/decimal,
   :rdfs/domain :ui/PortNotification,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def portMap
  "A feature for accessing the index of a port by symbol."
  {:rdfs/comment "A feature for accessing the index of a port by symbol.",
   :rdfs/label "port map",
   :rdf/type :lv2/Feature})

(def portNotification
  "Specifies a port notification that is required by a UI."
  {:rdfs/comment "Specifies a port notification that is required by a UI.",
   :rdfs/label "port notification",
   :rdfs/range :ui/PortNotification,
   :rdfs/domain :ui/UI,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def portSubscribe
  "A feature for dynamically subscribing to updates from a port."
  {:rdfs/comment
     "A feature for dynamically subscribing to updates from a port.",
   :rdfs/label "port subscribe",
   :rdf/type :lv2/Feature})

(def protocol
  "The protocol to be used for this notification."
  {:rdfs/comment "The protocol to be used for this notification.",
   :rdfs/label "protocol",
   :rdfs/range :ui/PortProtocol,
   :rdfs/domain :ui/PortNotification,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def requestValue
  "A feature to request a parameter value from the user via the host."
  {:rdfs/comment
     "A feature to request a parameter value from the user via the host.",
   :rdfs/label "request value",
   :rdf/type :lv2/Feature})

(def resize
  "A feature that provides control of, and notifications about, a UI's size."
  {:rdfs/comment
     "A feature that provides control of, and notifications about, a UI's size.",
   :rdfs/label "resize",
   :owl/deprecated true,
   :rdf/type [:lv2/ExtensionData :lv2/Feature]})

(def scaleFactor
  "Scale factor for high resolution screens."
  {:rdfs/comment "Scale factor for high resolution screens.",
   :rdfs/label "scale factor",
   :rdfs/range :xsd/float,
   :rdf/type [:opts/Option :owl/DatatypeProperty :rdf/Property]})

(def showInterface
  "An interface for showing and hiding a window for a UI."
  {:rdfs/comment "An interface for showing and hiding a window for a UI.",
   :rdfs/label "show interface",
   :rdf/type :lv2/ExtensionData})

(def touch
  "A feature to notify that the user has grabbed a port control."
  {:rdfs/comment
     "A feature to notify that the user has grabbed a port control.",
   :rdfs/label "touch",
   :rdf/type :lv2/Feature})

(def ui
  "Relates a plugin to a UI that applies to it."
  {:rdfs/comment "Relates a plugin to a UI that applies to it.",
   :rdfs/label "user interface",
   :rdfs/range :ui/UI,
   :rdfs/domain :lv2/Plugin,
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def updateRate
  "The target rate, in Hz, to send updates to the UI."
  {:rdfs/comment "The target rate, in Hz, to send updates to the UI.",
   :rdfs/label "update rate",
   :rdfs/range :xsd/float,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def windowTitle
  "The title for the window shown by LV2UI_Show_Interface."
  {:rdfs/comment "The title for the window shown by LV2UI_Show_Interface.",
   :rdfs/label "window title",
   :rdfs/range :xsd/string,
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})