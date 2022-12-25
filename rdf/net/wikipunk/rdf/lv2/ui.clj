(ns net.wikipunk.rdf.lv2.ui
  "User interfaces for LV2 plugins."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.ttl",
   :owl/imports [{:rdf/uri "http://lv2plug.in/ns/ext/options"}
                 {:rdf/uri "http://lv2plug.in/ns/lv2core"}],
   :rdf/about {:rdf/uri "http://lv2plug.in/ns/extensions/ui"},
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ui"   "http://lv2plug.in/ns/extensions/ui#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso
   {:rdf/uri "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.meta.ttl"},
   :vann/preferredNamespacePrefix "ui",
   :vann/preferredNamespaceUri "http://lv2plug.in/ns/ext/ui#"})

(def CocoaUI
  "A UI where the widget is a pointer to a NSView."
  {:rdf/about       :ui/CocoaUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Cocoa UI",
   :rdfs/subClassOf :ui/UI})

(def Gtk3UI
  "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget."
  {:rdf/about       :ui/Gtk3UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "GTK3 UI",
   :rdfs/subClassOf :ui/UI})

(def GtkUI
  "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget."
  {:rdf/about       :ui/GtkUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "GTK2 UI",
   :rdfs/subClassOf :ui/UI})

(def PortNotification
  "A description of port updates that a host must send a UI."
  {:rdf/about       :ui/PortNotification,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Port Notification",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :ui/plugin,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A PortNotification MUST have exactly one ui:plugin."}})

(def PortProtocol
  "A method to communicate port data between a UI and plugin."
  {:rdf/about       :ui/PortProtocol,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "Port Protocol",
   :rdfs/subClassOf :lv2/Feature})

(def Qt4UI
  "A UI where the widget is a pointer to a Qt4 QWidget."
  {:rdf/about       :ui/Qt4UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Qt4 UI",
   :rdfs/subClassOf :ui/UI})

(def Qt5UI
  "A UI where the widget is a pointer to a Qt5 QWidget."
  {:rdf/about       :ui/Qt5UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Qt5 UI",
   :rdfs/subClassOf :ui/UI})

(def UI
  "A UI for an LV2 plugin."
  {:rdf/about  :ui/UI,
   :rdf/type   [:owl/Class :rdfs/Class],
   :rdfs/label "User Interface"})

(def WindowsUI
  "A UI where the widget is a Windows HWND window ID."
  {:rdf/about       :ui/WindowsUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "Windows UI",
   :rdfs/subClassOf :ui/UI})

(def X11UI
  "A UI where the widget is an X11 Window window ID."
  {:rdf/about       :ui/X11UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/label      "X11 UI",
   :rdfs/subClassOf :ui/UI})

(def backgroundColor
  "The background color of the host's UI."
  {:rdf/about  :ui/backgroundColor,
   :rdf/type   [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "background color"})

(def binary
  "The shared library that a UI resides in."
  {:owl/deprecated true,
   :owl/sameAs     :lv2/binary,
   :rdf/about      :ui/binary,
   :rdf/type       [:owl/ObjectProperty :rdf/Property],
   :rdfs/label     "binary"})

(def fixedSize
  "Non-resizable UI that will never resize itself."
  {:rdf/about  :ui/fixedSize,
   :rdf/type   :lv2/Feature,
   :rdfs/label "fixed size"})

(def floatProtocol
  "A protocol for transferring single floating point values."
  {:rdf/about  :ui/floatProtocol,
   :rdf/type   :ui/PortProtocol,
   :rdfs/label "float protocol"})

(def foregroundColor
  "The foreground color of the host's UI."
  {:rdf/about  :ui/foregroundColor,
   :rdf/type   [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "foreground color"})

(def idleInterface
  "A feature that provides a callback for the host to drive the UI."
  {:rdf/about  :ui/idleInterface,
   :rdf/type   [:lv2/ExtensionData :lv2/Feature],
   :rdfs/label "idle interface"})

(def makeSONameResident
  "UI binary must not be unloaded."
  {:owl/deprecated true,
   :rdf/about      :ui/makeSONameResident,
   :rdf/type       :lv2/Feature,
   :rdfs/label     "make SO name resident"})

(def noUserResize
  "Non-resizable UI."
  {:rdf/about  :ui/noUserResize,
   :rdf/type   :lv2/Feature,
   :rdfs/label "no user resize"})

(def notifyType
  "A particular type that the UI should be notified of."
  {:rdf/about   :ui/notifyType,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :ui/PortNotification,
   :rdfs/label  "notify type"})

(def parent
  "The parent for a UI."
  {:rdf/about  :ui/parent,
   :rdf/type   :lv2/Feature,
   :rdfs/label "parent"})

(def peakProtocol
  "A protocol for sending continuous peak measurements of an audio signal."
  {:rdf/about  :ui/peakProtocol,
   :rdf/type   :ui/PortProtocol,
   :rdfs/label "peak protocol"})

(def plugin
  "The plugin a portNotification applies to."
  {:rdf/about   :ui/plugin,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :ui/PortNotification,
   :rdfs/label  "plugin",
   :rdfs/range  :lv2/Plugin})

(def portIndex
  "The index of the port a portNotification applies to."
  {:rdf/about   :ui/portIndex,
   :rdf/type    [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :ui/PortNotification,
   :rdfs/label  "port index",
   :rdfs/range  :xsd/decimal})

(def portMap
  "A feature for accessing the index of a port by symbol."
  {:rdf/about  :ui/portMap,
   :rdf/type   :lv2/Feature,
   :rdfs/label "port map"})

(def portNotification
  "Specifies a port notification that is required by a UI."
  {:rdf/about   :ui/portNotification,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :ui/UI,
   :rdfs/label  "port notification",
   :rdfs/range  :ui/PortNotification})

(def portSubscribe
  "A feature for dynamically subscribing to updates from a port."
  {:rdf/about  :ui/portSubscribe,
   :rdf/type   :lv2/Feature,
   :rdfs/label "port subscribe"})

(def protocol
  "The protocol to be used for this notification."
  {:rdf/about   :ui/protocol,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :ui/PortNotification,
   :rdfs/label  "protocol",
   :rdfs/range  :ui/PortProtocol})

(def requestValue
  "A feature to request a parameter value from the user via the host."
  {:rdf/about  :ui/requestValue,
   :rdf/type   :lv2/Feature,
   :rdfs/label "request value"})

(def resize
  "A feature that provides control of, and notifications about, a UI's size."
  {:owl/deprecated true,
   :rdf/about      :ui/resize,
   :rdf/type       [:lv2/ExtensionData :lv2/Feature],
   :rdfs/label     "resize"})

(def scaleFactor
  "Scale factor for high resolution screens."
  {:rdf/about  :ui/scaleFactor,
   :rdf/type   [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/label "scale factor",
   :rdfs/range :xsd/float})

(def showInterface
  "An interface for showing and hiding a window for a UI."
  {:rdf/about  :ui/showInterface,
   :rdf/type   :lv2/ExtensionData,
   :rdfs/label "show interface"})

(def touch
  "A feature to notify that the user has grabbed a port control."
  {:rdf/about  :ui/touch,
   :rdf/type   :lv2/Feature,
   :rdfs/label "touch"})

(def ui
  "Relates a plugin to a UI that applies to it."
  {:rdf/about   :ui/ui,
   :rdf/type    [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :lv2/Plugin,
   :rdfs/label  "user interface",
   :rdfs/range  :ui/UI})

(def updateRate
  "The target rate, in Hz, to send updates to the UI."
  {:rdf/about  :ui/updateRate,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "update rate",
   :rdfs/range :xsd/float})

(def windowTitle
  "The title for the window shown by LV2UI_Show_Interface."
  {:rdf/about  :ui/windowTitle,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "window title",
   :rdfs/range :xsd/string})