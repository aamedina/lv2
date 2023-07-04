(ns net.wikipunk.lv2
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.punk.db :as db]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.lv2.boot]
   [net.wikipunk.rdf.event]
   [net.wikipunk.rdf.sioc.types]
   [net.wikipunk.rdf.ingen]
   [net.wikipunk.rdf.doap]
   [net.wikipunk.rdf.chord]
   [net.wikipunk.rdf.keys]
   [net.wikipunk.rdf.mo]
   [net.wikipunk.rdf.time]
   [net.wikipunk.rdf.sim]
   [net.wikipunk.rdf.ao]
   [net.wikipunk.rdf.af]
   [net.wikipunk.rdf.bio]
   [net.wikipunk.rdf.rel]
   [net.wikipunk.rdf.lv2]
   [net.wikipunk.rdf.tl]
   [net.wikipunk.rdf.frbr]
   [net.wikipunk.rdf.lv2.atom]
   [net.wikipunk.rdf.lv2.bufsz]
   [net.wikipunk.rdf.lv2.da]
   [net.wikipunk.rdf.lv2.dman]
   [net.wikipunk.rdf.lv2.ev]
   [net.wikipunk.rdf.lv2.ia]
   [net.wikipunk.rdf.lv2.log]   
   [net.wikipunk.rdf.lv2.midi]
   [net.wikipunk.rdf.lv2.morph]
   [net.wikipunk.rdf.lv2.opts]
   [net.wikipunk.rdf.lv2.param]
   [net.wikipunk.rdf.lv2.patch]
   [net.wikipunk.rdf.lv2.pg]
   [net.wikipunk.rdf.lv2.pprops]
   [net.wikipunk.rdf.lv2.pset]
   [net.wikipunk.rdf.lv2.rsz]
   [net.wikipunk.rdf.lv2.state]
   [net.wikipunk.rdf.lv2.time]
   [net.wikipunk.rdf.lv2.ui]
   [net.wikipunk.rdf.lv2.umap]
   [net.wikipunk.rdf.lv2.units]
   [net.wikipunk.rdf.lv2.urid]
   [net.wikipunk.rdf.lv2.work]))

(defrecord LV2 []
  com/Lifecycle
  (start [this]
    (defmethod db/infer-datomic-type :ingen.errors/errorCode [_] :db.type/long)
    (alter-var-root #'net.wikipunk.rdf.lv2.midi/statusMask assoc
                    :db/valueType :db.type/long
                    :db/cardinality :db.cardinality/many)
    (alter-var-root #'net.wikipunk.rdf.lv2.midi/status assoc
                    :db/valueType :db.type/long
                    :db/cardinality :db.cardinality/many)
    (alter-var-root #'net.wikipunk.rdf.lv2.midi/velocity assoc
                    :db/valueType :db.type/long
                    :db/cardinality :db.cardinality/many)
    this)
  (stop [this]
    this))
