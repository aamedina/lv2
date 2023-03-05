(ns net.wikipunk.sonic-annotator
  "requires the sonic-annotator binary to be on the PATH"
  (:require
   [com.stuartsierra.component :as com]
   [clojure.java.shell :refer [sh]]
   [net.wikipunk.rdf :as rdf]
   [clojure.string :as str]))

(defn help
  "Prints help."
  []
  (println (str/trim (:err (sh "sonic-annotator" "-h")))))

(defn skeleton
  "Returns the skeleton for `plugin-key`."
  [plugin-key & {:as md}]
  (rdf/sniff (assoc md :rdf/value (:out (sh "sonic-annotator" "-s" plugin-key))
                    :rdfa/prefix (or (:rdfa/prefix md)
                                     (str/replace #_plugin-key
                                                  (str/replace plugin-key #_(str/replace-first plugin-key #"^vamp:" "") #":" ".")
                                                  #"\.\." "."))
                    :format :n3)))
(defn list-plugins
  "List available transform ids."
  []
  (into []
        (filter #(str/starts-with? % "vamp:"))
        (str/split-lines (:out (sh "sonic-annotator" "-l")))))

(defn annotate
  [path & {:keys [plugin-key] :as md}]
  (rdf/sniff (assoc md
                    :rdf/value   (str/replace (:out (sh "sonic-annotator" "-d" plugin-key "-w" "rdf" path "--rdf-stdout"))
                                              #"LibXtract compiled with ooura FFT" "")
                    :format      :n3)))
