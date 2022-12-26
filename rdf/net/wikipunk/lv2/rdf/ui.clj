(ns net.wikipunk.lv2.rdf.ui
  "This extension makes it possible to create user interfaces for LV2 plugins.  UIs are implemented as an LV2UI_Descriptor loaded via lv2ui_descriptor() in a shared library, and are distributed in bundles just like plugins.  UIs are associated with plugins in data:      :::turtle     @prefix ui: <http://lv2plug.in/ns/extensions/ui#> .      <http://my.plugin>   ui:ui      <http://my.pluginui> .     <http://my.pluginui> a          ui:X11UI ;                          lv2:binary <myui.so> .  where `http://my.plugin` is the URI of the plugin, `http://my.pluginui` is the URI of the plugin UI and `myui.so` is the relative URI to the shared object file.  While it is possible to have the plugin UI and the plugin in the same shared object file, it is a good idea to keep them separate so that hosts can avoid loading the UI code if they do not need it.  A UI MUST specify its class in the RDF data (`ui:X11UI` in the above example).  The class defines what type the UI is, for example what graphics toolkit it uses.  Any type of UI class can be defined separately from this extension.  It is possible to have multiple UIs for the same plugin, or to have the UI for a plugin in a different bundle from the actual plugin.  This allows plugin UIs to be written independently.  Note that the process that loads the shared object file containing the UI code and the process that loads the shared object file containing the actual plugin implementation are not necessarily the same process (and not even necessarily on the same machine).  This means that plugin and UI code MUST NOT use singletons and global variables and expect them to refer to the same objects in the UI and the actual plugin. The function callback interface defined in this header is the only method of communication between UIs and plugin instances (extensions may define more, though this is discouraged unless absolutely necessary since the significant benefits of network transparency and serialisability are lost).  UI functionality may be extended via features, much like plugins:      :::turtle     <http://my.pluginui> lv2:requiredFeature <http://my.feature> .     <http://my.pluginui> lv2:optionalFeature <http://my.feature> .  The rules for a UI with a required or optional feature are identical to those of lv2:Plugin instances: if a UI declares a feature as required, the host is NOT allowed to load it unless it supports that feature; and if it does support a feature, it MUST pass an appropriate LV2_Feature struct to the UI's instantiate() method.  This extension defines several standard features for common functionality.  UIs written to this specification do not need to be thread-safe.  All functions may only be called in the <q>UI thread</q>.  There is only one UI thread (for toolkits, the one the UI main loop runs in).  There is no requirement that a <q>UI</q> actually be a graphical widget.  Note that UIs are completely separate from plugins.  From the plugin's perspective, control from a UI is indistinguishable from any other control, as it all occurs via ports."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.ttl",
   :lv2/project {:doap/created    "2006-00-00",
                 :doap/developer  "http://lv2plug.in/ns/meta#larsl",
                 :doap/license    "http://opensource.org/licenses/isc",
                 :doap/maintainer "http://drobilla.net/drobilla#me",
                 :doap/name       "LV2 UI",
                 :doap/shortdesc  "User interfaces for LV2 plugins.",
                 :rdf/about       "http://lv2plug.in/ns/extensions/ui",
                 :rdf/type        :doap/Project},
   :owl/imports ["http://lv2plug.in/ns/ext/options"
                 "http://lv2plug.in/ns/lv2core"],
   :rdf/about "http://lv2plug.in/ns/extensions/ui",
   :rdf/ns-prefix-map {"lv2"  "http://lv2plug.in/ns/lv2core#",
                       "opts" "http://lv2plug.in/ns/ext/options#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ui"   "http://lv2plug.in/ns/extensions/ui#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ui",
   :rdfa/uri "http://lv2plug.in/ns/ext/ui#",
   :rdfs/comment "User interfaces for LV2 plugins.",
   :rdfs/label "LV2 UI",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/ui.lv2/ui.meta.ttl"})

(def CocoaUI
  "This is the native UI type on Mac OS X."
  {:rdf/about       :ui/CocoaUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a NSView.",
   :rdfs/label      "Cocoa UI",
   :rdfs/subClassOf :ui/UI})

(def Gtk3UI
  "The host must guarantee that the Gtk+ 3 library has been initialised and the Glib main loop is running before the UI is instantiated.  Note that this UI type is not suitable for binary distribution since multiple versions of Gtk can not be used in the same process."
  {:rdf/about :ui/Gtk3UI,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI where the widget is a pointer to a Gtk+ 3.0 GtkWidget.",
   :rdfs/label "GTK3 UI",
   :rdfs/subClassOf :ui/UI})

(def GtkUI
  "The host must guarantee that the Gtk+ 2 library has been initialised and the Glib main loop is running before the UI is instantiated.  Note that this UI type is not suitable for binary distribution since multiple versions of Gtk can not be used in the same process."
  {:rdf/about :ui/GtkUI,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI where the widget is a pointer to a Gtk+ 2.0 GtkWidget.",
   :rdfs/label "GTK2 UI",
   :rdfs/subClassOf :ui/UI})

(def PortNotification
  "This describes which ports the host must send notifications to the UI about. The port must be specific either by index, using the ui:portIndex property, or symbol, using the lv2:symbol property.  Since port indices are not guaranteed to be stable, using the symbol is recommended, and the inde MUST NOT be used except by UIs that are shipped in the same bundle as the corresponding plugin."
  {:rdf/about       :ui/PortNotification,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A description of port updates that a host must send a UI.",
   :rdfs/label      "Port Notification",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty :ui/plugin,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A PortNotification MUST have exactly one ui:plugin."}})

(def PortProtocol
  "A PortProtocol MUST define:  Port Type :   Which plugin port types the buffer type is valid for.  Feature Data :   What data (if any) should be passed in the LV2_Feature.  A PortProtocol for an output port MUST define:  Update Frequency :   When the host should call port_event().  Update Format :   The format of the data in the buffer passed to port_event().  Options :   The format of the options passed to subscribe() and unsubscribe().  A PortProtocol for an input port MUST define:  Write Format :   The format of the data in the buffer passed to write_port().  Write Effect :   What happens when the UI calls write_port().  For an example, see ui:floatProtocol or ui:peakProtocol.  PortProtocol is a subclass of lv2:Feature, so UIs use lv2:optionalFeature and lv2:requiredFeature to specify which PortProtocols they want to use."
  {:rdf/about :ui/PortProtocol,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A method to communicate port data between a UI and plugin.",
   :rdfs/label "Port Protocol",
   :rdfs/subClassOf :lv2/Feature})

(def Qt4UI
  "The host must guarantee that the Qt4 library has been initialised and the Qt4 main loop is running before the UI is instantiated.  Note that this UI type is not suitable for binary distribution since multiple versions of Qt can not be used in the same process."
  {:rdf/about       :ui/Qt4UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a Qt4 QWidget.",
   :rdfs/label      "Qt4 UI",
   :rdfs/subClassOf :ui/UI})

(def Qt5UI
  "The host must guarantee that the Qt5 library has been initialised and the Qt5 main loop is running before the UI is instantiated.  Note that this UI type is not suitable for binary distribution since multiple versions of Qt can not be used in the same process."
  {:rdf/about       :ui/Qt5UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a pointer to a Qt5 QWidget.",
   :rdfs/label      "Qt5 UI",
   :rdfs/subClassOf :ui/UI})

(def UI
  "A UI for an LV2 plugin."
  {:rdf/about    :ui/UI,
   :rdf/type     [:owl/Class :rdfs/Class],
   :rdfs/comment "A UI for an LV2 plugin.",
   :rdfs/label   "User Interface"})

(def WindowsUI
  "Note that the LV2UI_Widget for this type of UI is not a pointer, but should be interpreted directly as a `HWND`.  This is the native UI type on Microsoft Windows."
  {:rdf/about       :ui/WindowsUI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is a Windows HWND window ID.",
   :rdfs/label      "Windows UI",
   :rdfs/subClassOf :ui/UI})

(def X11UI
  "Note that the LV2UI_Widget for this type of UI is not a pointer, but should be interpreted directly as an X11 `Window` ID.  This is the native UI type on most POSIX systems."
  {:rdf/about       :ui/X11UI,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A UI where the widget is an X11 Window window ID.",
   :rdfs/label      "X11 UI",
   :rdfs/subClassOf :ui/UI})

(def backgroundColor
  "The background color of the host's UI.  The host can pass this as an option so that UIs can integrate nicely with the host window around it.  Hosts should pass this as an option to UIs with an integer RGBA32 color value. If the value is a 32-bit integer, it is guaranteed to be in RGBA32 format, but the UI must check the value type and not assume this, to allow for other types of color in the future."
  {:rdf/about    :ui/backgroundColor,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The background color of the host's UI.",
   :rdfs/label   "background color"})

(def binary
  "This property is redundant and deprecated: new UIs should use lv2:binary instead, however hosts must still support ui:binary."
  {:owl/deprecated true,
   :owl/sameAs     :lv2/binary,
   :rdf/about      :ui/binary,
   :rdf/type       [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment   "The shared library that a UI resides in.",
   :rdfs/label     "binary"})

(def fixedSize
  "If a UI has this feature, it indicates the same thing as ui:noUserResize, and additionally that the UI will not resize itself on its own.  That is, the UI will always remain the same size.  This feature may not make sense for all UI types.  The data pointer for this feature should always be set to NULL."
  {:rdf/about    :ui/fixedSize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Non-resizable UI that will never resize itself.",
   :rdfs/label   "fixed size"})

(def floatProtocol
  "A protocol for transferring single floating point values.  The rules for this protocol are:  Port Type :   lv2:ControlPort  Feature Data :   None.  Update Frequency :   The host SHOULD call port_event() as soon as possible when the port value has     changed, but there are no timing guarantees.  Update Format :   A single <code>float</code>.  Options :   None.  Write Format :   A single <code>float</code>.  Write Effect :   The host SHOULD set the port to the received value as soon as possible, but     there is no guarantee that run() actually sees this value."
  {:rdf/about    :ui/floatProtocol,
   :rdf/type     :ui/PortProtocol,
   :rdfs/comment "A protocol for transferring single floating point values.",
   :rdfs/label   "float protocol"})

(def foregroundColor
  "The foreground color of the host's UI.  The host can pass this as an option so that UIs can integrate nicely with the host window around it.  Hosts should pass this as an option to UIs with an integer RGBA32 color value. If the value is a 32-bit integer, it is guaranteed to be in RGBA32 format, but the UI must check the value type and not assume this, to allow for other types of color in the future."
  {:rdf/about    :ui/foregroundColor,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The foreground color of the host's UI.",
   :rdfs/label   "foreground color"})

(def idleInterface
  "To support this feature, the UI should list it as a lv2:optionalFeature or lv2:requiredFeature in its data, and also as lv2:extensionData.  When the UI's extension_data() is called with this URI (LV2_UI__idleInterface), it should return a pointer to an LV2UI_Idle_Interface.  To indicate support, the host should pass a feature to instantiate() with this URI, with NULL for data."
  {:rdf/about :ui/idleInterface,
   :rdf/type [:lv2/ExtensionData :lv2/Feature],
   :rdfs/comment
   "A feature that provides a callback for the host to drive the UI.",
   :rdfs/label "idle interface"})

(def makeSONameResident
  "This feature was intended to support UIs that link against toolkit libraries which may not be unloaded during the lifetime of the host.  This is better achieved by using the appropriate flags when linking the UI, for example `gcc -Wl,-z,nodelete`."
  {:owl/deprecated true,
   :rdf/about      :ui/makeSONameResident,
   :rdf/type       :lv2/Feature,
   :rdfs/comment   "UI binary must not be unloaded.",
   :rdfs/label     "make SO name resident"})

(def noUserResize
  "If a UI has this feature, it indicates that it does not make sense to let the user resize the main widget, and the host should prevent that.  This feature may not make sense for all UI types.  The data pointer for this feature should always be set to NULL."
  {:rdf/about    :ui/noUserResize,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "Non-resizable UI.",
   :rdfs/label   "no user resize"})

(def notifyType
  "Specifies a particular type that the UI should be notified of.  This is useful for message-based ports where several types of data can be present, but only some are interesting to the UI.  For example, if UI control is multiplexed in the same port as MIDI, this property can be used to ensure that only the relevant events are forwarded to the UI, and not potentially high frequency MIDI data."
  {:rdf/about    :ui/notifyType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "A particular type that the UI should be notified of.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "notify type"})

(def parent
  "This feature can be used to pass a parent that the UI should be a child of. The format of data pointer of this feature is determined by the UI type, and is generally the same type as the LV2UI_Widget that the UI would return.  For example, for a ui:X11UI, the parent should be a `Window`.  This is particularly useful for embedding, where the parent often must be known at construction time for embedding to work correctly.  UIs should not _require_ this feature unless it is necessary for them to work at all, but hosts should provide it whenever possible."
  {:rdf/about    :ui/parent,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "The parent for a UI.",
   :rdfs/label   "parent"})

(def peakProtocol
  "This port protocol defines a way for the host to send continuous peak measurements of the audio signal at a certain port to the UI.  The intended use is visualisation, for example an animated meter widget that shows the level of the audio input or output.  A contiguous sequence of audio samples for which a peak value has been computed is called a _measurement period_.  The rules for this protocol are:  Port Type :   lv2:AudioPort  Feature Data :   None.  Update Frequency :   The host SHOULD call port_event() at regular intervals.  The measurement     periods used for calls to port_event() for the same port SHOULD be     contiguous (i.e. the measurement period for one call should begin right     after the end of the measurement period for the previous call ends) unless     the UI has removed and re-added the port subscription between those calls.     However, UIs MUST NOT depend on either the regularity of the calls or the     contiguity of the measurement periods; hosts may change the call rate or     skip calls for performance or other reasons.  Measurement periods for     different calls to port_event() for the same port MUST NOT overlap.  Update Format :   A single LV2UI_Peak_Data object.  Options :   None.  Write Format :   None.  Write Effect :   None."
  {:rdf/about :ui/peakProtocol,
   :rdf/type :ui/PortProtocol,
   :rdfs/comment
   "A protocol for sending continuous peak measurements of an audio signal.",
   :rdfs/label "peak protocol"})

(def plugin
  "The plugin a portNotification applies to."
  {:rdf/about    :ui/plugin,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The plugin a portNotification applies to.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "plugin",
   :rdfs/range   :lv2/Plugin})

(def portIndex
  "The index of the port a portNotification applies to."
  {:rdf/about    :ui/portIndex,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The index of the port a portNotification applies to.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "port index",
   :rdfs/range   :xsd/decimal})

(def portMap
  "This makes it possible to implement and distribute UIs separately from the plugin binaries they control.  This feature corresponds to the LV2UI_Port_Index struct, which should be passed with the URI LV2_UI__portIndex."
  {:rdf/about    :ui/portMap,
   :rdf/type     :lv2/Feature,
   :rdfs/comment "A feature for accessing the index of a port by symbol.",
   :rdfs/label   "port map"})

(def portNotification
  "Specifies that a UI should receive notifications about changes to a particular port's value via LV2UI_Descriptor::port_event().  For example:      :::turtle     eg:ui         a ui:X11UI ;         ui:portNotification [             ui:plugin eg:plugin ;             lv2:symbol \"gain\" ;             ui:protocol ui:floatProtocol         ] ."
  {:rdf/about    :ui/portNotification,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Specifies a port notification that is required by a UI.",
   :rdfs/domain  :ui/UI,
   :rdfs/label   "port notification",
   :rdfs/range   :ui/PortNotification})

(def portSubscribe
  "This makes it possible for a UI to explicitly request a particular style of update from a port at run-time, in a more flexible and powerful way than listing subscriptions statically allows.  This feature corresponds to the LV2UI_Port_Subscribe struct, which should be passed with the URI LV2_UI__portSubscribe."
  {:rdf/about :ui/portSubscribe,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature for dynamically subscribing to updates from a port.",
   :rdfs/label "port subscribe"})

(def protocol
  "The protocol to be used for this notification."
  {:rdf/about    :ui/protocol,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "The protocol to be used for this notification.",
   :rdfs/domain  :ui/PortNotification,
   :rdfs/label   "protocol",
   :rdfs/range   :ui/PortProtocol})

(def requestValue
  "This allows a plugin UI to request a new parameter value using the host's UI, for example by showing a dialog or integrating with the host's built-in content browser.  This should only be used for complex parameter types where the plugin UI is not capable of showing the expected native platform or host interface to choose a value, such as file path parameters.  This feature corresponds to the LV2UI_Request_Value struct, which should be passed with the URI LV2_UI__requestValue."
  {:rdf/about :ui/requestValue,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature to request a parameter value from the user via the host.",
   :rdfs/label "request value"})

(def resize
  "This feature corresponds to the LV2UI_Resize struct, which should be passed with the URI LV2_UI__resize.  This struct may also be provided by the UI as extension data using the same URI, in which case it is used by the host to request that the UI change its size."
  {:owl/deprecated true,
   :rdf/about :ui/resize,
   :rdf/type [:lv2/ExtensionData :lv2/Feature],
   :rdfs/comment
   "A feature that provides control of, and notifications about, a UI's size.",
   :rdfs/label "resize"})

(def scaleFactor
  "HiDPI (High Dots Per Inch) displays have a high resolution on a relatively small form factor.  Many systems use a scale factor to compensate for this, so for example, a scale factor of 2 means things are drawn twice as large as normal.  Hosts can pass this as an option to UIs to communicate this information, so that the UI can draw at an appropriate scale."
  {:rdf/about    :ui/scaleFactor,
   :rdf/type     [:opts/Option :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "Scale factor for high resolution screens.",
   :rdfs/label   "scale factor",
   :rdfs/range   :xsd/float})

(def showInterface
  "This allows UIs to gracefully degrade to separate windows when the host is unable to embed the UI widget for whatever reason.  When the UI's extension_data() is called with this URI (LV2_UI__showInterface), it should return a pointer to an LV2UI_Show_Interface."
  {:rdf/about    :ui/showInterface,
   :rdf/type     :lv2/ExtensionData,
   :rdfs/comment "An interface for showing and hiding a window for a UI.",
   :rdfs/label   "show interface"})

(def touch
  "This is useful for automation, so the host can allow the user to take control of a port, even if that port would otherwise be automated (much like grabbing a physical motorised fader).  It can also be used for MIDI learn or in any other situation where the host needs to do something with a particular control and it would be convenient for the user to select it directly from the plugin UI.  This feature corresponds to the LV2UI_Touch struct, which should be passed with the URI LV2_UI__touch."
  {:rdf/about :ui/touch,
   :rdf/type :lv2/Feature,
   :rdfs/comment
   "A feature to notify that the user has grabbed a port control.",
   :rdfs/label "touch"})

(def ui
  "Relates a plugin to a UI that applies to it."
  {:rdf/about    :ui/ui,
   :rdf/type     [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "Relates a plugin to a UI that applies to it.",
   :rdfs/domain  :lv2/Plugin,
   :rdfs/label   "user interface",
   :rdfs/range   :ui/UI})

(def updateRate
  "The target rate, in Hz, to send updates to the UI."
  {:rdf/about    :ui/updateRate,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The target rate, in Hz, to send updates to the UI.",
   :rdfs/label   "update rate",
   :rdfs/range   :xsd/float})

(def windowTitle
  "The title for the window shown by LV2UI_Show_Interface."
  {:rdf/about    :ui/windowTitle,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The title for the window shown by LV2UI_Show_Interface.",
   :rdfs/label   "window title",
   :rdfs/range   :xsd/string})