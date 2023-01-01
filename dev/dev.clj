(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [arachne.aristotle :as a]
   [arachne.aristotle.query :as q]
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.java.shell :as sh :refer [sh]]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir doc find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [zprint.core :as zprint]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.lv2.boot :as boot]
   [net.wikipunk.lv2.host :as host]
   ;; LV2 RDF models
   [net.wikipunk.rdf.lv2.atom :as atom]
   [net.wikipunk.rdf.lv2.bufsz :as bufsz]
   [net.wikipunk.rdf.lv2.da :as da]
   [net.wikipunk.rdf.lv2.dman :as dman]
   [net.wikipunk.rdf.lv2.ev :as ev]
   [net.wikipunk.rdf.lv2.ia :as ia]
   [net.wikipunk.rdf.lv2.log :as log]   
   [net.wikipunk.rdf.lv2.lv2 :as lv2]
   [net.wikipunk.rdf.lv2.midi :as midi]
   [net.wikipunk.rdf.lv2.morph :as morph]
   [net.wikipunk.rdf.lv2.opts :as opts]
   [net.wikipunk.rdf.lv2.param :as param]
   [net.wikipunk.rdf.lv2.patch :as patch]
   [net.wikipunk.rdf.lv2.pg :as pg]
   [net.wikipunk.rdf.lv2.pprops :as pprops]
   [net.wikipunk.rdf.lv2.pset :as pset]
   [net.wikipunk.rdf.lv2.rsz :as rsz]
   [net.wikipunk.rdf.lv2.state :as state]
   [net.wikipunk.rdf.lv2.time :as time]
   [net.wikipunk.rdf.lv2.ui :as ui]
   [net.wikipunk.rdf.lv2.umap :as umap]
   [net.wikipunk.rdf.lv2.units :as units]
   [net.wikipunk.rdf.lv2.urid :as urid]
   [net.wikipunk.rdf.lv2.work :as work]))

(set-init
  (fn [_]
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(comment
  (def rdf (deref (get-in system [:vocab :types])))
  
  ;; A Clojure multimethod hierarchy contained in a ref
  (get-in system [:vocab :types])

  ;; Use it like this...
  (isa? rdf :owl/Class :rdfs/Class)

  )

