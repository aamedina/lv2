(ns net.wikipunk.lv2.host
  "Embedded LV2 host using liblilv"
  (:require
   [clojure.java.io :as io]
   [clojure.string :as str]
   [com.stuartsierra.component :as com]))

(defrecord Host []
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))




