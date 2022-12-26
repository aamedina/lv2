(ns net.wikipunk.boot
  "RDFa Core Initial Context"
  (:refer-clojure :exclude [time]))

(def initial-context
  {:dcat/downloadURL "https://raw.githubusercontent.com/w3c/json-ld-rc/main/rdfa-1.1.ttl"})

(def as
  "Activity Vocabulary"
  {:dcat/downloadURL #_ "https://raw.githubusercontent.com/w3c/activitystreams/master/vocabulary/activitystreams2.owl"
   "https://www.w3.org/ns/activitystreams-owl"
   :rdfa/uri         "https://www.w3.org/ns/activitystreams#",
   :rdfa/prefix      "as",
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/activitystreams-vocabulary/"},
   :rdf/type         :rdfa/PrefixMapping})

(def cc
  "ccREL"
  {:dcat/downloadURL "https://creativecommons.org/schema.rdf"
   :rdfa/uri         "http://creativecommons.org/ns#",
   :rdfa/prefix      "cc",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2008/SUBM-ccREL-20080501/"},
   :rdf/type         :rdfa/PrefixMapping})

(def csvw
  "Metadata for Tabular Data"
  {:rdfa/uri         "http://www.w3.org/ns/csvw#",
   :rdfa/prefix      "csvw",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/tabular-metadata/"},
   :rdf/type         :rdfa/PrefixMapping})

(def ctag
  "Common Tag Ontology"
  {:rdfa/uri         "http://commontag.org/ns#",
   :rdfa/prefix      "ctag",
   :rdfs/isDefinedBy {:rdf/uri "http://commontag.org/Specification"},
   :rdf/type         :rdfa/PrefixMapping})

(def dc
  "Dublin Core Metadata Terms"
  {:rdfa/uri         "http://purl.org/dc/terms/",
   :rdfa/prefix      "dc",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://dublincore.org/documents/dcmi-terms/#H2"},
   :rdf/type         :rdfa/PrefixMapping})

(def dc11
  "Dublin Core Metadata Element Set, Version 1.1"
  {:rdfa/uri         "http://purl.org/dc/elements/1.1/",
   :rdfa/prefix      "dc11",
   :rdfs/isDefinedBy {:rdf/uri "http://purl.org/dc/elements/1.1/"},
   :rdf/type         :rdfa/PrefixMapping})

(def dcat
  "Data Catalog Vocabulary"
  {:rdfa/uri         "http://www.w3.org/ns/dcat#",
   :rdfa/prefix      "dcat",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdf/type         :rdfa/PrefixMapping})

(def dcam
  "DCMI Metadata Terms"
  {:dcat/downloadURL "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_abstract_model.ttl"
   :rdfa/uri         "http://purl.org/dc/dcam/"
   :rdfa/prefix      "dcam",
   :rdf/type         :rdfa/PrefixMapping})

(def dcterms
  "Dublin Core Metadata Terms"
  {:dcat/downloadURL #_ "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/dcterms.ttl"
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_terms.ttl"
   :rdfa/uri         "http://purl.org/dc/terms/",
   :rdfa/prefix      "dcterms",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://dublincore.org/documents/dcmi-terms/#H2"},
   :rdf/type         :rdfa/PrefixMapping})

(def doap
  "Description of a Project"
  {:dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/doap.ttl"
   :rdfa/prefix      "doap",
   :rdfa/uri         "http://usefulinc.com/ns/doap#"
   :rdf/type         :rdfa/PrefixMapping})

(def dqv
  "Data Quality Vocabulary"
  {:rdfa/uri         "http://www.w3.org/ns/dqv#",
   :rdfa/prefix      "dqv",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/vocab-dqv/"},
   :rdf/type         :rdfa/PrefixMapping})

(def duv
  "Dataset Usage Vocabulary"
  {:rdfa/uri         "https://www.w3.org/ns/duv#",
   :rdfa/prefix      "duv",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/vocab-duv/"},
   :rdf/type         :rdfa/PrefixMapping})

(def event
  {:dcat/downloadURL "https://purl.org/NET/c4dm/event.owl"
   :rdfa/uri         "http://purl.org/NET/c4dm/event.owl#"
   :rdfa/prefix      "event"
   :rdf/type         :rdfa/PrefixMapping})

(def foaf
  "FOAF"
  {:dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/foaf.ttl"
   :rdfa/uri         "http://xmlns.com/foaf/0.1/",
   :rdfa/prefix      "foaf",
   :rdfs/isDefinedBy {:rdf/uri "http://xmlns.com/foaf/spec/"},
   :rdf/type         :rdfa/PrefixMapping})

(def geo
  {:rdfa/uri    "http://www.w3.org/2003/01/geo/wgs84_pos#"
   :rdfa/prefix "geo"
   :rdf/type    :rdfa/PrefixMapping})

(def gr
  "GoodRelations Ontology"
  {:rdfa/uri         "http://purl.org/goodrelations/v1#",
   :rdfa/prefix      "gr",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.heppnetz.de/ontologies/goodrelations/v1"},
   :rdf/type         :rdfa/PrefixMapping})

(def greg
  "Gregorian months"
  {:dcat/downloadURL "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time-gregorian.ttl"
   :rdfa/uri         "http://www.w3.org/ns/time/gregorian/",
   :rdfa/prefix      "greg",
   :rdf/type         :rdfa/PrefixMapping})

(def grddl
  "GRDDL"
  {:rdfa/uri         "http://www.w3.org/2003/g/data-view#",
   :rdfa/prefix      "grddl",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/2007/REC-grddl-20070911/"},
   :rdf/type         :rdfa/PrefixMapping})

(def ical
  "iCalendar terms in RDF"
  {:rdfa/uri         "http://www.w3.org/2002/12/cal/icaltzd#",
   :rdfa/prefix      "ical",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/2002/12/cal/icaltzd#"},
   :rdf/type         :rdfa/PrefixMapping})

(def jsonld
  "JSON-LD"
  {:rdfa/uri         "http://www.w3.org/ns/json-ld#",
   :rdfa/prefix      "jsonld",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/json-ld/"},
   :rdf/type         :rdfa/PrefixMapping})

(def jsonschema
  "JSON Schema in RDF"
  {:rdfa/uri    "https://www.w3.org/2019/wot/json-schema#"
   :rdfa/prefix "jsonschema",
   :rdf/type    :rdfa/PrefixMapping})

(def ldp
  "Linked Data Platform Vocabulary"
  {:rdfa/uri         "http://www.w3.org/ns/ldp#",
   :rdfa/prefix      "ldp",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/ldp/"},
   :rdf/type         :rdfa/PrefixMapping})

(def ma
  "Ontology for Media Resources"
  {:rdfa/uri         "http://www.w3.org/ns/ma-ont#",
   :rdfa/prefix      "ma",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2012/REC-mediaont-10-20120209/"},
   :rdf/type         :rdfa/PrefixMapping})

(def mo
  "Music Ontology"
  {:rdfa/uri    "http://purl.org/ontology/mo/"
   :rdfa/prefix "mo"
   :rdf/type    :rdfa/PrefixMapping})

(def oa
  "Web Annotation Vocabulary"
  {:rdfa/uri         "http://www.w3.org/ns/oa#",
   :rdfa/prefix      "oa",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/annotation-vocab/"},
   :rdf/type         :rdfa/PrefixMapping})

(def odrl
  "ODRL Vocabulary & Expression 2.2"
  {:rdfa/uri         "http://www.w3.org/ns/odrl/2/",
   :rdfa/prefix      "odrl",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/odrl-vocab/"},
   :rdf/type         :rdfa/PrefixMapping})

(def og
  "Facebook's Open Graph protocol"
  {:rdfa/uri         "http://ogp.me/ns#",
   :rdfa/prefix      "og",
   :rdfs/isDefinedBy {:rdf/uri "http://ogp.me/"},
   :rdf/type         :rdfa/PrefixMapping})

(def org
  "Organizations"
  {:rdfa/uri         "http://www.w3.org/ns/org#",
   :rdfa/prefix      "org",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/vocab-org/"},
   :rdf/type         :rdfa/PrefixMapping})

(def owl
  "OWL"
  {:rdfa/uri    "http://www.w3.org/2002/07/owl#",
   :rdfa/prefix "owl",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/TR/2009/REC-owl2-overview-20091027/"},
   :rdf/type    :rdfa/PrefixMapping})

(def prov
  "Provenance Vocabulary"
  {:rdfa/uri         "http://www.w3.org/ns/prov#",
   :rdfa/prefix      "prov",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/prov-o/"},
   :rdf/type         :rdfa/PrefixMapping})

(def qb
  "Data Cubes"
  {:rdfa/uri         "http://purl.org/linked-data/cube#",
   :rdfa/prefix      "qb",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/vocab-data-cube/"},
   :rdf/type         :rdfa/PrefixMapping})

(def rdf
  "RDF"
  {:rdfa/uri         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
   :rdfa/prefix      "rdf",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2004/REC-rdf-mt-20040210/"},
   :rdf/type         :rdfa/PrefixMapping})

(def rdfa
  "RDFa Vocabulary"
  {:rdfa/uri         "http://www.w3.org/ns/rdfa#",
   :rdfa/prefix      "rdfa",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/rdfa-core/"},
   :rdf/type         :rdfa/PrefixMapping})

(def rdfs
  "RDF Schema"
  {:rdfa/uri         "http://www.w3.org/2000/01/rdf-schema#",
   :rdfa/prefix      "rdfs",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2004/REC-rdf-mt-20040210/"},
   :rdf/type         :rdfa/PrefixMapping})

(def rev
  "RDF Review Vocabulary"
  {:rdfa/uri         "http://purl.org/stuff/rev#",
   :rdfa/prefix      "rev",
   :rdfs/isDefinedBy {:rdf/uri "http://vocab.org/review/terms.html"},
   :rdf/type         :rdfa/PrefixMapping})

(def rif
  "RIF"
  {:rdfa/uri    "http://www.w3.org/2007/rif#",
   :rdfa/prefix "rif",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/TR/2010/NOTE-rif-overview-20100622/"},
   :rdf/type    :rdfa/PrefixMapping})

(def rr
  "R2RML"
  {:rdfa/uri         "http://www.w3.org/ns/r2rml#",
   :rdfa/prefix      "rr",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/2012/REC-r2rml-20120927/"},
   :rdf/type         :rdfa/PrefixMapping})

(def schema
  "The Schema.org vocabulary"
  {:dcat/downloadURL "https://raw.githubusercontent.com/schemaorg/schemaorg/main/data/releases/15.0/schemaorg.owl"
   :rdfa/uri         "http://schema.org/",
   :rdfa/prefix      "schema",
   :rdfs/isDefinedBy {:rdf/uri "http://schema.org/docs/full.html"},
   :rdf/type         :rdfa/PrefixMapping})

(def sd
  "SPARQL 1.1 Service Description"
  {:rdfa/uri         "http://www.w3.org/ns/sparql-service-description#",
   :rdfa/prefix      "sd",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/sparql11-service-description/"},
   :rdf/type         :rdfa/PrefixMapping})

(def sioc
  "SIOC Core Ontology"
  {:rdfa/uri    "http://rdfs.org/sioc/ns#",
   :rdfa/prefix "sioc",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2007/SUBM-sioc-spec-20070612/"},
   :rdf/type    :rdfa/PrefixMapping})

(def skos
  "SKOS Core"
  {:rdfa/uri    "http://www.w3.org/2004/02/skos/core#",
   :rdfa/prefix "skos",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/TR/2009/REC-skos-reference-20090818/"},
   :rdf/type    :rdfa/PrefixMapping})

(def skosxl
  "SKOS eXtension for Labels"
  {:rdfa/uri    "http://www.w3.org/2008/05/skos-xl#",
   :rdfa/prefix "skosxl",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/TR/2009/REC-skos-reference-20090818/"},
   :rdf/type    :rdfa/PrefixMapping})

(def sosa
  "Sensor, Observation, Sample, and Actuator Ontology"
  {:rdfa/uri         "http://www.w3.org/ns/sosa/",
   :rdfa/prefix      "sosa",
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/2017/REC-vocab-ssn-20171019/"},
   :rdf/type         :rdfa/PrefixMapping})

(def ssn
  "Semantic Sensor Network Ontology"
  {:rdfa/uri         "http://www.w3.org/ns/ssn/",
   :rdfa/prefix      "ssn",
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/2017/REC-vocab-ssn-20171019/"},
   :rdf/type         :rdfa/PrefixMapping})

(def time
  "Time Ontology"
  {:dcat/downloadURL "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time.ttl"
   :rdfa/uri         "http://www.w3.org/2006/time#",
   :rdfa/prefix      "time",
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/2017/REC-owl-time-20171019/"},
   :rdf/type         :rdfa/PrefixMapping})

(def v
  "Google Rich Snippets' Vocabularies"
  {:rdfa/uri    "http://rdf.data-vocabulary.org/#",
   :rdfa/prefix "v",
   :rdfs/isDefinedBy
   {:rdf/uri
    "http://www.google.com/support/webmasters/bin/answer.py?answer=99170"},
   :rdf/type    :rdfa/PrefixMapping})

(def vs
  {:rdfa/uri    "http://www.w3.org/2003/06/sw-vocab-status/ns#"
   :rdfa/prefix "vs",
   :rdf/type    :rdfa/PrefixMapping})

(def vann
  "A vocabulary for annotating vocabulary descriptions"
  {:rdfa/prefix      "vann"
   :rdfa/uri         "http://purl.org/vocab/vann/"
   :rdf/type         :rdfa/PrefixMapping
   :dcat/downloadURL "https://vocab.org/vann/vann-vocab-20100607.rdf"})

(def vcard
  "vCard in RDF"
  {:rdfa/uri    "http://www.w3.org/2006/vcard/ns#",
   :rdfa/prefix "vcard",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2010/SUBM-vcard-rdf-20100120/"},
   :rdf/type    :rdfa/PrefixMapping})

(def void
  "VoID"
  {:rdfa/uri         "http://rdfs.org/ns/void#",
   :rdfa/prefix      "void",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/void/"},
   :rdf/type         :rdfa/PrefixMapping})

(def wdr
  "POWDER"
  {:rdfa/uri    "http://www.w3.org/2007/05/powder#",
   :rdfa/prefix "wdr",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/TR/2009/REC-powder-formal-20090901/"},
   :rdf/type    :rdfa/PrefixMapping})

(def wdrs
  "POWDER-S"
  {:rdfa/uri    "http://www.w3.org/2007/05/powder-s#",
   :rdfa/prefix "wdrs",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/TR/2009/REC-powder-formal-20090901/"},
   :rdf/type    :rdfa/PrefixMapping})

(def xhv
  "RDFa Default Prefix"
  {:rdfa/uri         "http://www.w3.org/1999/xhtml/vocab#",
   :rdfa/prefix      "xhv",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/rdfa-core/"},
   :rdf/type         :rdfa/PrefixMapping})

(def xml
  "XML Reserved Prefix"
  {:rdfa/uri         "http://www.w3.org/XML/1998/namespace",
   :rdfa/prefix      "xml",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/REC-xml-names/"},
   :rdf/type         :rdfa/PrefixMapping})

(def xsd
  "XML Schema Datatypes"
  {:dcat/downloadURL "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/xsd.ttl"
   :rdfa/uri         "http://www.w3.org/2001/XMLSchema#",
   :rdfa/prefix      "xsd",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/xmlschema-2/"},
   :rdf/type         :rdfa/PrefixMapping})

