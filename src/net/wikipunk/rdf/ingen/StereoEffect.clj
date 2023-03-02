(ns net.wikipunk.rdf.ingen.StereoEffect
  "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/StereoEffect.ttl#"
  {:dcat/downloadURL
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/StereoEffect.ttl",
   :rdf/ns-prefix-map
   {"doap" "http://usefulinc.com/ns/doap#",
    "ingen" "http://drobilla.net/ns/ingen#",
    "ingen.lv2"
    "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/",
    "lv2" "http://lv2plug.in/ns/lv2core#",
    "lv2.atom" "http://lv2plug.in/ns/ext/atom#",
    "lv2.midi" "http://lv2plug.in/ns/ext/midi#",
    "lv2.patch" "http://lv2plug.in/ns/ext/patch#",
    "lv2.work" "http://lv2plug.in/ns/ext/worker#",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ingen.StereoEffect",
   :rdfa/uri
   "https://gitlab.com/drobilla/ingen/-/raw/master/bundles/ingen.lv2/StereoEffect.ttl#"})

(def ^{:private true} StereoEffect.ttl
  {:db/ident          :ingen.lv2/StereoEffect.ttl,
   :doap/name         "Ingen Stereo Effect Template",
   :ingen/arc         [{:ingen/head :ingen.lv2/notify,
                        :ingen/tail :ingen.lv2/control}
                       {:ingen/head :ingen.lv2/right_out,
                        :ingen/tail :ingen.lv2/right_in}
                       {:ingen/head :ingen.lv2/left_out,
                        :ingen/tail :ingen.lv2/left_in}],
   :ingen/polyphony   1,
   :lv2.ui/ui         :ingen/GraphUIGtk2,
   :lv2/extensionData :lv2.state/interface,
   :lv2/port          [:ingen.lv2/notify
                       :ingen.lv2/control
                       :ingen.lv2/left_in
                       :ingen.lv2/right_in
                       :ingen.lv2/left_out
                       :ingen.lv2/right_out],
   :rdf/type          [:lv2/Plugin :ingen/Graph]})

(def ^{:private true} control
  {:db/ident            :ingen.lv2/control,
   :ingen/canvasX       9.5M,
   :ingen/canvasY       112,
   :ingen/polyphonic    false,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.rsz/minimumSize 4096,
   :lv2/index           0,
   :lv2/name            "Control",
   :lv2/portProperty    :lv2/connectionOptional,
   :lv2/symbol          "control",
   :rdf/type            [:lv2/InputPort :lv2.atom/AtomPort]})

(def ^{:private true} left_in
  {:db/ident         :ingen.lv2/left_in,
   :ingen/canvasX    13,
   :ingen/canvasY    60,
   :ingen/polyphonic false,
   :lv2/designation  :lv2.pg/left,
   :lv2/index        2,
   :lv2/name         "Left In",
   :lv2/symbol       "left_in",
   :rdf/type         [:lv2/InputPort :lv2/AudioPort]})

(def ^{:private true} left_out
  {:db/ident         :ingen.lv2/left_out,
   :ingen/canvasX    186,
   :ingen/canvasY    60,
   :ingen/polyphonic false,
   :lv2/designation  :lv2.pg/left,
   :lv2/index        3,
   :lv2/name         "Left Out",
   :lv2/symbol       "left_out",
   :rdf/type         [:lv2/OutputPort :lv2/AudioPort]})

(def ^{:private true} notify
  {:db/ident            :ingen.lv2/notify,
   :ingen/canvasX       187.5M,
   :ingen/canvasY       112,
   :ingen/polyphonic    false,
   :lv2.atom/bufferType :lv2.atom/Sequence,
   :lv2.rsz/minimumSize 4096,
   :lv2/index           1,
   :lv2/name            "Control",
   :lv2/symbol          "notify",
   :rdf/type            [:lv2/OutputPort :lv2.atom/AtomPort]})

(def ^{:private true} right_in
  {:db/ident         :ingen.lv2/right_in,
   :ingen/canvasX    8,
   :ingen/canvasY    8,
   :ingen/polyphonic false,
   :lv2/designation  :lv2.pg/right,
   :lv2/index        4,
   :lv2/name         "Right In",
   :lv2/symbol       "right_in",
   :rdf/type         [:lv2/InputPort :lv2/AudioPort]})

(def ^{:private true} right_out
  {:db/ident         :ingen.lv2/right_out,
   :ingen/canvasX    181,
   :ingen/canvasY    8,
   :ingen/polyphonic false,
   :lv2/designation  :lv2.pg/right,
   :lv2/index        5,
   :lv2/name         "Right Out",
   :lv2/symbol       "right_out",
   :rdf/type         [:lv2/OutputPort :lv2/AudioPort]})