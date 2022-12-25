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
   [datomic.client.api :as d]
   [net.wikipunk.lv2.jena :as jena]
   [net.wikipunk.lv2 :as host]
   [net.wikipunk.rdf.lv2.owl :as owl]
   [net.wikipunk.rdf.lv2.rdf :as rdf]
   [net.wikipunk.rdf.lv2.rdfs :as rdfs]
   [net.wikipunk.rdf.lv2.doap :as doap]
   [net.wikipunk.rdf.lv2.foaf :as foaf]
   [net.wikipunk.rdf.lv2.dcterms :as dcterms]
   [net.wikipunk.rdf.lv2.schema :as schema]
   [net.wikipunk.rdf.lv2.atom :as atom]
   [net.wikipunk.rdf.lv2.bufsz :as bufsz]
   [net.wikipunk.rdf.lv2.da :as da]
   [net.wikipunk.rdf.lv2.dman :as dman]
   [net.wikipunk.rdf.lv2.lv2 :as lv2]
   [net.wikipunk.rdf.lv2.midi :as midi]
   [zprint.core :as zprint]))

(set-init
  (fn [_]
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))
