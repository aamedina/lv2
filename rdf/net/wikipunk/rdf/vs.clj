(ns net.wikipunk.rdf.vs
  "An RDF vocabulary for relating SW vocabulary terms to their status."
  {:dcterms/contributor "Pierre-Yves Vandenbussche",
   :dcterms/creator ["Libby Miller" "Dan Brickley" "Leigh Dodds"],
   :dcterms/description
   "An RDF vocabulary for relating SW vocabulary terms to their status.",
   :dcterms/issued #inst "2003-06-01T00:00:00.000-04:00",
   :dcterms/modified #inst "2011-12-12T00:00:00.000-05:00",
   :dcterms/title "SemWeb Vocab Status ontology",
   :rdf/about "http://www.w3.org/2003/06/sw-vocab-status/ns",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/elements/1.1/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vs",
   :rdfa/uri "http://www.w3.org/2003/06/sw-vocab-status/ns#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This vocabulary was created in the FOAF project, based on experience with FOAF, Dublin Core and other early RDF vocabularies. Deployment experience shows that changing namespace URIs is expensive and unrewarding, so this vocabulary provides terms to support in-place evolution of structured data vocabularies. By indicating status at the level of terms rather than vocabularies, dictionary-style, fine grained improvements become easier. Different organizations and parties can agree or disagree on the status of a vocabulary term; however the status published alongside the term may deserve special attention. Future work could include patterns for citing announcements and decisions, or using SKOS to decentralise the extension of the basic status levels."},
   :vann/preferredNamespacePrefix "vs",
   :vann/preferredNamespaceUri "http://www.w3.org/2003/06/sw-vocab-status/ns#"})

(def moreinfo
  "more information about the status etc of a term, typically human oriented"
  {:rdf/about :vs/moreinfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "more information about the status etc of a term, typically human oriented",
   :rdfs/isDefinedBy "http://www.w3.org/2003/06/sw-vocab-status/ns#",
   :rdfs/label "more info",
   :vs/term_status "unstable"})

(def term_status
  "the status of a vocabulary term, expressed as a short symbolic string; known values include 'unstable','testing', 'stable' and 'archaic'"
  {:rdf/about :vs/term_status,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "the status of a vocabulary term, expressed as a short symbolic string; known values include 'unstable','testing', 'stable' and 'archaic'",
   :rdfs/isDefinedBy "http://www.w3.org/2003/06/sw-vocab-status/ns#",
   :rdfs/label "term status",
   :vs/term_status "unstable"})

(def userdocs
  "human-oriented documentation, examples etc for use of this term"
  {:rdf/about :vs/userdocs,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "human-oriented documentation, examples etc for use of this term",
   :rdfs/isDefinedBy "http://www.w3.org/2003/06/sw-vocab-status/ns#",
   :rdfs/label "user docs",
   :vs/term_status "unstable"})