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
   [net.wikipunk.boot.lv2 :as boot.lv2]
   [net.wikipunk.boot :as boot]
   [net.wikipunk.lv2.host :as host]
   ;; Core RDF models
   [net.wikipunk.rdf.owl :as owl]
   [net.wikipunk.rdf.rdf :as rdf]
   [net.wikipunk.rdf.rdfa :as rdfa]
   [net.wikipunk.rdf.rdfs :as rdfs]
   [net.wikipunk.rdf.doap :as doap]
   [net.wikipunk.rdf.event :as event]
   [net.wikipunk.rdf.foaf :as foaf]
   [net.wikipunk.rdf.jsonld :as jsonld]
   [net.wikipunk.rdf.jsonschema :as jsonschema]
   [net.wikipunk.rdf.dcam :as dcam]
   [net.wikipunk.rdf.dcterms :as dcterms]
   [net.wikipunk.rdf.prov :as prov]
   [net.wikipunk.rdf.schema :as schema]
   [net.wikipunk.rdf.skos :as skos]
   [net.wikipunk.rdf.xsd :as xsd]
   [net.wikipunk.rdf.vann :as vann]
   [net.wikipunk.rdf.vs :as vs]
   [net.wikipunk.rdf.as :as as]
   [net.wikipunk.rdf.ldp :as ldp]
   [net.wikipunk.rdf.rr :as rr]
   [net.wikipunk.rdf.mo :as mo]
   [net.wikipunk.rdf.time :as owl-time]
   [net.wikipunk.rdf.greg :as greg]
   [net.wikipunk.rdf.sioc :as sioc]
   [net.wikipunk.rdf.cc :as cc]
   [net.wikipunk.rdf.sosa :as sosa]
   [net.wikipunk.rdf.ssn :as ssn]
   [net.wikipunk.rdf.vcard :as vcard]
   [net.wikipunk.rdf.ma :as ma]
   [net.wikipunk.rdf.geo :as geo]
   [net.wikipunk.rdf.swrl :as swrl]
   [net.wikipunk.rdf.dcat :as dcat]
   [net.wikipunk.rdf.dqv :as dqv]
   [net.wikipunk.rdf.duv :as duv]
   [net.wikipunk.rdf.oa :as oa]
   [net.wikipunk.rdf.odrl :as odrl]
   [net.wikipunk.rdf.org :as org]
   [net.wikipunk.rdf.qb :as qb]
   [net.wikipunk.rdf.rev :as rev]
   [net.wikipunk.rdf.sd :as sd]
   [net.wikipunk.rdf.skosxl :as skosxl]
   [net.wikipunk.rdf.voaf :as voaf]
   [net.wikipunk.rdf.void :as void]
   [net.wikipunk.rdf.adms :as adms]
   [net.wikipunk.rdf.exif :as exif]
   [net.wikipunk.rdf.acl :as acl]
   [net.wikipunk.rdf.bibo :as bibo]
   [net.wikipunk.rdf.csvw :as csvw]
   [net.wikipunk.rdf.dpvo :as dpvo]
   [net.wikipunk.rdf.dpvo-pd :as dpvo-pd]
   [net.wikipunk.rdf.dpvo-gdpr :as dpvo-gdpr]
   [net.wikipunk.rdf.dpvo-risk :as dpvo-risk]
   [net.wikipunk.rdf.gen :as gen]
   [net.wikipunk.rdf.ao :as ao]
   [net.wikipunk.rdf.bio :as bio]
   [net.wikipunk.rdf.cnt :as cnt]
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

(comment
  (jena/emit (:vocab system) nil))
