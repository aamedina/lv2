(ns net.wikipunk.rdf.lv2.ui
  "User interfaces for LV2 plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.ttl",
   :owl/imports ["http://lv2plug.in/ns/ext/options"
                 "http://lv2plug.in/ns/lv2core"],
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ui"   "http://lv2plug.in/ns/extensions/ui#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://lv2plug.in/ns/extensions/ui",
   :rdfa/prefix "ui",
   :rdfa/uri "http://lv2plug.in/ns/ext/ui#",
   :rdfs/comment "User interfaces for LV2 plugins.",
   :rdfs/label "LV2 UI",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.meta.ttl"]})

(def CocoaUI
  "A UI where the widget is a pointer to a NSView."
  {:db/ident        :ui/CocoaUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a NSView.",
   :rdfs/label      "Cocoa UI",
   :rdfs/subClassOf :ui/UI})

(def Gtk3UI
  "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget."
  {:db/ident :ui/Gtk3UI,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget.",
   :rdfs/label "GTK3 UI",
   :rdfs/subClassOf :ui/UI})

(def GtkUI
  "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget."
  {:db/ident :ui/GtkUI,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget.",
   :rdfs/label "GTK2 UI",
   :rdfs/subClassOf :ui/UI})

(def PortNotification
  "A description of port updates that a host must send a UI."
  {:db/ident        :ui/PortNotification,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A description of port updates that a host must send a UI.",
   :rdfs/label      "Port Notification",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :ui/plugin,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A PortNotification MUST have exactly one ui:plugin."}})

(def PortProtocol
  "A method to communicate port data between a UI and plugin."
  {:db/ident :ui/PortProtocol,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A method to communicate port data between a UI and plugin.",
   :rdfs/label "Port Protocol",
   :rdfs/subClassOf :lv2/Feature})

(def Qt4UI
  "A UI where the widget is a pointer to a Qt4 QWidget."
  {:db/ident        :ui/Qt4UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a Qt4 QWidget.",
   :rdfs/label      "Qt4 UI",
   :rdfs/subClassOf :ui/UI})

(def Qt5UI
  "A UI where the widget is a pointer to a Qt5 QWidget."
  {:db/ident        :ui/Qt5UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a Qt5 QWidget.",
   :rdfs/label      "Qt5 UI",
   :rdfs/subClassOf :ui/UI})

(def UI
  "A UI for an LV2 plugin."
  {:db/ident     :ui/UI,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI for an LV2 plugin.",
   :rdfs/label   "User Interface"})

(def WindowsUI
  "A UI where the widget is a Windows HWND window ID."
  {:db/ident        :ui/WindowsUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a Windows HWND window ID.",
   :rdfs/label      "Windows UI",
   :rdfs/subClassOf :ui/UI})

(def X11UI
  "A UI where the widget is an X11 Window window ID."
  {:db/ident        :ui/X11UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is an X11 Window window ID.",
   :rdfs/label      "X11 UI",
   :rdfs/subClassOf :ui/UI})

(def backgroundColor
  "The background color of the host's UI."
  {:db/ident     :ui/backgroundColor,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The background color of the host's UI.",
   :rdfs/label   "background color"})

(def binary
  "The shared library that a UI resides in."
  {:db/ident       :ui/binary,
   :owl/deprecated true,
   :owl/sameAs     :lv2/binary,
   :rdf/type       [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment   "The shared library that a UI resides in.",
   :rdfs/label     "binary"})

(def fixedSize
  "Non-resizable UI that will never resize itself."
  {:db/ident     :ui/fixedSize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Non-resizable UI that will never resize itself.",
   :rdfs/label   "fixed size"})

(def floatProtocol
  "A protocol for transferring single floating point values."
  {:db/ident     :ui/floatProtocol,
   :rdf/type     :ui/PortProtocol,
   :rdfs/comment "A protocol for transferring single floating point values.",
   :rdfs/label   "float protocol"})

(def foregroundColor
  "The foreground color of the host's UI."
  {:db/ident     :ui/foregroundColor,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The foreground color of the host's UI.",
   :rdfs/label   "foreground color"})

(def idleInterface
  "A feature that provides a callback for the host to drive the UI."
  {:db/ident :ui/idleInterface,
   :rdf/type [:lv2/ExtensionData :lv2/Feature],
   :rdfs/comment
   "A feature that provides a callback for the host to drive the UI.",
   :rdfs/label "idle interface"})

(def makeSONameResident
  "UI binary must not be unloaded."
  {:db/ident       :ui/makeSONameResident,
   :owl/deprecated true,
   :rdf/type       :lv2/Feature,
   :rdfs/comment   "UI binary must not be unloaded.",
   :rdfs/label     "make SO name resident"})

(def noUserResize
  "Non-resizable UI."
  {:db/ident     :ui/noUserResize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Non-resizable UI.",
   :rdfs/label   "no user resize"})

(def notifyType
  "A particular type that the UI should be notified of."
  {:db/ident     :ui/notifyType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A particular type that the UI should be notified of.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "notify type"})

(def parent
  "The parent for a UI."
  {:db/ident     :ui/parent,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "The parent for a UI.",
   :rdfs/label   "parent"})

(def peakProtocol
  "A protocol for sending continuous peak measurements of an audio signal."
  {:db/ident :ui/peakProtocol,
   :rdf/type :ui/PortProtocol,
   :rdfs/comment
   "A protocol for sending continuous peak measurements of an audio signal.",
   :rdfs/label "peak protocol"})

(def plugin
  "The plugin a portNotification applies to."
  {:db/ident     :ui/plugin,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The plugin a portNotification applies to.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "plugin",
   :rdfs/range   :lv2/Plugin})

(def portIndex
  "The index of the port a portNotification applies to."
  {:db/ident     :ui/portIndex,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The index of the port a portNotification applies to.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "port index",
   :rdfs/range   :xsd/decimal})

(def portMap
  "A feature for accessing the index of a port by symbol."
  {:db/ident     :ui/portMap,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature for accessing the index of a port by symbol.",
   :rdfs/label   "port map"})

(def portNotification
  "Specifies a port notification that is required by a UI."
  {:db/ident     :ui/portNotification,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Specifies a port notification that is required by a UI.",
   :rdfs/domain  :ui/UI,
   :rdfs/label   "port notification",
   :rdfs/range   :ui/PortNotification})

(def portSubscribe
  "A feature for dynamically subscribing to updates from a port."
  {:db/ident :ui/portSubscribe,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature for dynamically subscribing to updates from a port.",
   :rdfs/label "port subscribe"})

(def protocol
  "The protocol to be used for this notification."
  {:db/ident     :ui/protocol,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The protocol to be used for this notification.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "protocol",
   :rdfs/range   :ui/PortProtocol})

(def requestValue
  "A feature to request a parameter value from the user via the host."
  {:db/ident :ui/requestValue,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature to request a parameter value from the user via the host.",
   :rdfs/label "request value"})

(def resize
  "A feature that provides control of, and notifications about, a UI's size."
  {:db/ident :ui/resize,
   :owl/deprecated true,
   :rdf/type [:lv2/ExtensionData :lv2/Feature],
   :rdfs/comment
   "A feature that provides control of, and notifications about, a UI's size.",
   :rdfs/label "resize"})

(def scaleFactor
  "Scale factor for high resolution screens."
  {:db/ident     :ui/scaleFactor,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Scale factor for high resolution screens.",
   :rdfs/label   "scale factor",
   :rdfs/range   :xsd/float})

(def showInterface
  "An interface for showing and hiding a window for a UI."
  {:db/ident     :ui/showInterface,
   :rdf/type     :lv2/ExtensionData,
   :rdfs/comment "An interface for showing and hiding a window for a UI.",
   :rdfs/label   "show interface"})

(def touch
  "A feature to notify that the user has grabbed a port control."
  {:db/ident :ui/touch,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature to notify that the user has grabbed a port control.",
   :rdfs/label "touch"})

(def ui
  "Relates a plugin to a UI that applies to it."
  {:db/ident     :ui/ui,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Relates a plugin to a UI that applies to it.",
   :rdfs/domain  :lv2/Plugin,
   :rdfs/label   "user interface",
   :rdfs/range   :ui/UI})

(def updateRate
  "The target rate, in Hz, to send updates to the UI."
  {:db/ident     :ui/updateRate,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The target rate, in Hz, to send updates to the UI.",
   :rdfs/label   "update rate",
   :rdfs/range   :xsd/float})

(def windowTitle
  "The title for the window shown by LV2UI_Show_Interface."
  {:db/ident     :ui/windowTitle,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The title for the window shown by LV2UI_Show_Interface.",
   :rdfs/label   "window title",
   :rdfs/range   :xsd/string})