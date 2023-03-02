(ns net.wikipunk.rdf.lv2.ui
  "User interfaces for LV2 plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.ttl",
   :owl/imports ["http://lv2plug.in/ns/ext/options"
                 "http://lv2plug.in/ns/lv2core"],
   :rdf/ns-prefix-map {"lv2"      "http://lv2plug.in/ns/lv2core#",
                       "lv2.opts" "http://lv2plug.in/ns/ext/options#",
                       "lv2.ui"   "http://lv2plug.in/ns/extensions/ui#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lv2.ui",
   :rdfa/uri "http://lv2plug.in/ns/extensions/ui",
   :rdfs/comment "User interfaces for LV2 plugins.",
   :rdfs/label "LV2 UI",
   :rdfs/seeAlso
   ["https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.meta.ttl"]})

(def CocoaUI
  "A UI where the widget is a pointer to a NSView."
  {:db/ident        :lv2.ui/CocoaUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a NSView.",
   :rdfs/label      "Cocoa UI",
   :rdfs/subClassOf :lv2.ui/UI})

(def Gtk3UI
  "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget."
  {:db/ident :lv2.ui/Gtk3UI,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget.",
   :rdfs/label "GTK3 UI",
   :rdfs/subClassOf :lv2.ui/UI})

(def GtkUI
  "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget."
  {:db/ident :lv2.ui/GtkUI,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget.",
   :rdfs/label "GTK2 UI",
   :rdfs/subClassOf :lv2.ui/UI})

(def PortNotification
  "A description of port updates that a host must send a UI."
  {:db/ident        :lv2.ui/PortNotification,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A description of port updates that a host must send a UI.",
   :rdfs/label      "Port Notification",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :lv2.ui/plugin,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A PortNotification MUST have exactly one ui:plugin."}})

(def PortProtocol
  "A method to communicate port data between a UI and plugin."
  {:db/ident :lv2.ui/PortProtocol,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A method to communicate port data between a UI and plugin.",
   :rdfs/label "Port Protocol",
   :rdfs/subClassOf :lv2/Feature})

(def Qt4UI
  "A UI where the widget is a pointer to a Qt4 QWidget."
  {:db/ident        :lv2.ui/Qt4UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a Qt4 QWidget.",
   :rdfs/label      "Qt4 UI",
   :rdfs/subClassOf :lv2.ui/UI})

(def Qt5UI
  "A UI where the widget is a pointer to a Qt5 QWidget."
  {:db/ident        :lv2.ui/Qt5UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a Qt5 QWidget.",
   :rdfs/label      "Qt5 UI",
   :rdfs/subClassOf :lv2.ui/UI})

(def UI
  "A UI for an LV2 plugin."
  {:db/ident     :lv2.ui/UI,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI for an LV2 plugin.",
   :rdfs/label   "User Interface"})

(def WindowsUI
  "A UI where the widget is a Windows HWND window ID."
  {:db/ident        :lv2.ui/WindowsUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a Windows HWND window ID.",
   :rdfs/label      "Windows UI",
   :rdfs/subClassOf :lv2.ui/UI})

(def X11UI
  "A UI where the widget is an X11 Window window ID."
  {:db/ident        :lv2.ui/X11UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is an X11 Window window ID.",
   :rdfs/label      "X11 UI",
   :rdfs/subClassOf :lv2.ui/UI})

(def backgroundColor
  "The background color of the host's UI."
  {:db/ident     :lv2.ui/backgroundColor,
   :rdf/type     [:lv2.opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The background color of the host's UI.",
   :rdfs/label   "background color"})

(def binary
  "The shared library that a UI resides in."
  {:db/ident       :lv2.ui/binary,
   :owl/deprecated true,
   :owl/sameAs     :lv2/binary,
   :rdf/type       [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment   "The shared library that a UI resides in.",
   :rdfs/label     "binary"})

(def fixedSize
  "Non-resizable UI that will never resize itself."
  {:db/ident     :lv2.ui/fixedSize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Non-resizable UI that will never resize itself.",
   :rdfs/label   "fixed size"})

(def floatProtocol
  "A protocol for transferring single floating point values."
  {:db/ident     :lv2.ui/floatProtocol,
   :rdf/type     :lv2.ui/PortProtocol,
   :rdfs/comment "A protocol for transferring single floating point values.",
   :rdfs/label   "float protocol"})

(def foregroundColor
  "The foreground color of the host's UI."
  {:db/ident     :lv2.ui/foregroundColor,
   :rdf/type     [:lv2.opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The foreground color of the host's UI.",
   :rdfs/label   "foreground color"})

(def idleInterface
  "A feature that provides a callback for the host to drive the UI."
  {:db/ident :lv2.ui/idleInterface,
   :rdf/type [:lv2/ExtensionData :lv2/Feature],
   :rdfs/comment
   "A feature that provides a callback for the host to drive the UI.",
   :rdfs/label "idle interface"})

(def makeSONameResident
  "UI binary must not be unloaded."
  {:db/ident       :lv2.ui/makeSONameResident,
   :owl/deprecated true,
   :rdf/type       :lv2/Feature,
   :rdfs/comment   "UI binary must not be unloaded.",
   :rdfs/label     "make SO name resident"})

(def noUserResize
  "Non-resizable UI."
  {:db/ident     :lv2.ui/noUserResize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Non-resizable UI.",
   :rdfs/label   "no user resize"})

(def notifyType
  "A particular type that the UI should be notified of."
  {:db/ident     :lv2.ui/notifyType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A particular type that the UI should be notified of.",
   :rdfs/domain  :lv2.ui/PortNotification,
   :rdfs/label   "notify type"})

(def parent
  "The parent for a UI."
  {:db/ident     :lv2.ui/parent,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "The parent for a UI.",
   :rdfs/label   "parent"})

(def peakProtocol
  "A protocol for sending continuous peak measurements of an audio signal."
  {:db/ident :lv2.ui/peakProtocol,
   :rdf/type :lv2.ui/PortProtocol,
   :rdfs/comment
   "A protocol for sending continuous peak measurements of an audio signal.",
   :rdfs/label "peak protocol"})

(def plugin
  "The plugin a portNotification applies to."
  {:db/ident     :lv2.ui/plugin,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The plugin a portNotification applies to.",
   :rdfs/domain  :lv2.ui/PortNotification,
   :rdfs/label   "plugin",
   :rdfs/range   :lv2/Plugin})

(def portIndex
  "The index of the port a portNotification applies to."
  {:db/ident     :lv2.ui/portIndex,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The index of the port a portNotification applies to.",
   :rdfs/domain  :lv2.ui/PortNotification,
   :rdfs/label   "port index",
   :rdfs/range   :xsd/decimal})

(def portMap
  "A feature for accessing the index of a port by symbol."
  {:db/ident     :lv2.ui/portMap,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature for accessing the index of a port by symbol.",
   :rdfs/label   "port map"})

(def portNotification
  "Specifies a port notification that is required by a UI."
  {:db/ident     :lv2.ui/portNotification,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Specifies a port notification that is required by a UI.",
   :rdfs/domain  :lv2.ui/UI,
   :rdfs/label   "port notification",
   :rdfs/range   :lv2.ui/PortNotification})

(def portSubscribe
  "A feature for dynamically subscribing to updates from a port."
  {:db/ident :lv2.ui/portSubscribe,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature for dynamically subscribing to updates from a port.",
   :rdfs/label "port subscribe"})

(def protocol
  "The protocol to be used for this notification."
  {:db/ident     :lv2.ui/protocol,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The protocol to be used for this notification.",
   :rdfs/domain  :lv2.ui/PortNotification,
   :rdfs/label   "protocol",
   :rdfs/range   :lv2.ui/PortProtocol})

(def requestValue
  "A feature to request a parameter value from the user via the host."
  {:db/ident :lv2.ui/requestValue,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature to request a parameter value from the user via the host.",
   :rdfs/label "request value"})

(def resize
  "A feature that provides control of, and notifications about, a UI's size."
  {:db/ident :lv2.ui/resize,
   :owl/deprecated true,
   :rdf/type [:lv2/ExtensionData :lv2/Feature],
   :rdfs/comment
   "A feature that provides control of, and notifications about, a UI's size.",
   :rdfs/label "resize"})

(def scaleFactor
  "Scale factor for high resolution screens."
  {:db/ident     :lv2.ui/scaleFactor,
   :rdf/type     [:lv2.opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Scale factor for high resolution screens.",
   :rdfs/label   "scale factor",
   :rdfs/range   :xsd/float})

(def showInterface
  "An interface for showing and hiding a window for a UI."
  {:db/ident     :lv2.ui/showInterface,
   :rdf/type     :lv2/ExtensionData,
   :rdfs/comment "An interface for showing and hiding a window for a UI.",
   :rdfs/label   "show interface"})

(def touch
  "A feature to notify that the user has grabbed a port control."
  {:db/ident :lv2.ui/touch,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature to notify that the user has grabbed a port control.",
   :rdfs/label "touch"})

(def ui
  "Relates a plugin to a UI that applies to it."
  {:db/ident     :lv2.ui/ui,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Relates a plugin to a UI that applies to it.",
   :rdfs/domain  :lv2/Plugin,
   :rdfs/label   "user interface",
   :rdfs/range   :lv2.ui/UI})

(def updateRate
  "The target rate, in Hz, to send updates to the UI."
  {:db/ident     :lv2.ui/updateRate,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The target rate, in Hz, to send updates to the UI.",
   :rdfs/label   "update rate",
   :rdfs/range   :xsd/float})

(def windowTitle
  "The title for the window shown by LV2UI_Show_Interface."
  {:db/ident     :lv2.ui/windowTitle,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The title for the window shown by LV2UI_Show_Interface.",
   :rdfs/label   "window title",
   :rdfs/range   :xsd/string})