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
   [zprint.core :as zprint]
   ;; Implementation namespaces
   [net.wikipunk.lv2.jena :as jena]
   [net.wikipunk.lv2 :as core]
   [net.wikipunk.rdfa :as context]
   [net.wikipunk.lv2.host :as host]
   ;; Core RDF models
   [net.wikipunk.lv2.rdf.owl :as owl]
   [net.wikipunk.lv2.rdf.rdf :as rdf]
   [net.wikipunk.lv2.rdf.rdfa :as rdfa]
   [net.wikipunk.lv2.rdf.rdfs :as rdfs]
   [net.wikipunk.lv2.rdf.doap :as doap]
   [net.wikipunk.lv2.rdf.foaf :as foaf]
   [net.wikipunk.lv2.rdf.jsonld :as jsonld]
   [net.wikipunk.lv2.rdf.jsonschema :as jsonschema]
   [net.wikipunk.lv2.rdf.dcam :as dcam]
   [net.wikipunk.lv2.rdf.dcterms :as dcterms]
   [net.wikipunk.lv2.rdf.prov :as prov]
   [net.wikipunk.lv2.rdf.schema :as schema]
   [net.wikipunk.lv2.rdf.skos :as skos]
   [net.wikipunk.lv2.rdf.xsd :as xsd]
   [net.wikipunk.lv2.rdf.vann :as vann]
   [net.wikipunk.lv2.rdf.vs :as vs]
   [net.wikipunk.lv2.rdf.as :as as]
   [net.wikipunk.lv2.rdf.ldp :as ldp]
   ;; ;; LV2 RDF models
   [net.wikipunk.lv2.rdf.atom :as atom]
   [net.wikipunk.lv2.rdf.bufsz :as bufsz]
   [net.wikipunk.lv2.rdf.da :as da]
   [net.wikipunk.lv2.rdf.dman :as dman]
   [net.wikipunk.lv2.rdf.ev :as ev]
   [net.wikipunk.lv2.rdf.ia :as ia]
   [net.wikipunk.lv2.rdf.log :as log]   
   [net.wikipunk.lv2.rdf.lv2 :as lv2]
   [net.wikipunk.lv2.rdf.midi :as midi]
   [net.wikipunk.lv2.rdf.morph :as morph]
   [net.wikipunk.lv2.rdf.opts :as opts]
   [net.wikipunk.lv2.rdf.param :as param]
   [net.wikipunk.lv2.rdf.patch :as patch]
   [net.wikipunk.lv2.rdf.pg :as pg]
   [net.wikipunk.lv2.rdf.pprops :as pprops]
   [net.wikipunk.lv2.rdf.pset :as pset]
   [net.wikipunk.lv2.rdf.rsz :as rsz]
   [net.wikipunk.lv2.rdf.state :as state]
   [net.wikipunk.lv2.rdf.time :as time]
   [net.wikipunk.lv2.rdf.ui :as ui]
   [net.wikipunk.lv2.rdf.umap :as umap]
   [net.wikipunk.lv2.rdf.units :as units]
   [net.wikipunk.lv2.rdf.urid :as urid]
   [net.wikipunk.lv2.rdf.work :as work]))

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
