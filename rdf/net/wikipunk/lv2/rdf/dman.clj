(ns net.wikipunk.lv2.rdf.dman
  "The LV2 API, on its own, cannot be used to write plugin libraries where data is dynamically generated at runtime, since LV2 requires needed information to be provided in one or more static data (RDF) files. This API addresses this limitation by extending the LV2 API.  To detect that a plugin library implements a dynamic manifest generator, the host checks its static manifest for a description like:      :::turtle     <http://example.org/my-dynamic-manifest>         a dman:DynManifest ;         lv2:binary <mydynmanifest.so> .  To load the data, the host loads the library (`mydynmanifest.so` in this example) as usual and fetches the dynamic Turtle data from it using this API.  The host is allowed to request regeneration of the dynamic manifest multiple times, and the plugin library is expected to provide updated data if/when possible. All data and references provided via this API before the last regeneration of the dynamic manifest is to be considered invalid by the host, including plugin descriptors whose URIs were discovered using this API.  ### Accessing Data  To access data using this API, the host must:    1. Call lv2_dyn_manifest_open().    2. Create a `FILE` for functions to write data to (for example with `tmpfile()`).    3. Get a list of exposed subject URIs using lv2_dyn_manifest_get_subjects().    4. Call lv2_dyn_manifest_get_data() for each URI of interest to write the   related data to the file.    5. Call lv2_dyn_manifest_close().    6. Parse the content of the file(s).    7. Remove the file(s).  Each call to the above mentioned dynamic manifest functions MUST write a complete, valid Turtle document (including all needed prefix definitions) to the output FILE.  Each call to lv2_dyn_manifest_open() causes the (re)generation of the dynamic manifest data, and invalidates all data fetched before the call.  In case the plugin library uses this same API to access other dynamic manifests, it MUST implement some mechanism to avoid potentially endless loops (such as A loads B, B loads A, etc.) and, in case such a loop is detected, the operation MUST fail.  For this purpose, use of a static boolean flag is suggested.  ### Threading Rules  All of the functions defined by this specification belong to the Discovery class."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/dynmanifest.lv2/dynmanifest.ttl",
   :lv2/project {:doap/created "2009-06-13",
                 :doap/developer "http://lv2plug.in/ns/meta#daste",
                 :doap/homepage "http://naspro.atheme.org",
                 :doap/license "http://opensource.org/licenses/isc",
                 :doap/name "LV2 Dynamic Manifest",
                 :doap/programming-language "C",
                 :doap/shortdesc
                 "Support for dynamic manifest data generation.",
                 :rdf/about "http://lv2plug.in/ns/ext/dynmanifest",
                 :rdf/type :doap/Project},
   :rdf/about "http://lv2plug.in/ns/ext/dynmanifest",
   :rdf/ns-prefix-map {"dman" "http://lv2plug.in/ns/ext/dynmanifest#",
                       "lv2"  "http://lv2plug.in/ns/lv2core#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dman",
   :rdfa/uri "http://lv2plug.in/ns/ext/dynmanifest#",
   :rdfs/comment "Support for dynamic manifest data generation.",
   :rdfs/label "LV2 Dyn Manifest",
   :rdfs/seeAlso
   "https://gitlab.com/lv2/lv2/-/raw/master/lv2/dynmanifest.lv2/dynmanifest.meta.ttl"})

(def DynManifest
  "There MUST NOT be any instances of dman:DynManifest in the generated manifest.  All relative URIs in the generated data MUST be relative to the base path that would be used to parse a normal LV2 manifest (the bundle path)."
  {:rdf/about       :dman/DynManifest,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Dynamic manifest for an LV2 binary.",
   :rdfs/label      "Dynamic Manifest",
   :rdfs/subClassOf {:owl/minCardinality 1,
                     :owl/onProperty :lv2/binary,
                     :rdf/type :owl/Restriction,
                     :rdfs/comment
                     "A DynManifest MUST have at least one lv2:binary."}})