(ns net.wikipunk.rdf.cc
  "http://creativecommons.org/ns#"
  {:dcat/downloadURL "https://creativecommons.org/schema.rdf",
   :rdf/ns-prefix-map {"cc"   "http://creativecommons.org/ns#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "cc",
   :rdfa/uri "http://creativecommons.org/ns#",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2008/SUBM-ccREL-20080501/"}})

(def Attribution
  "credit be given to       copyright holder and/or author"
  {:rdf/about    :cc/Attribution,
   :rdf/type     :cc/Requirement,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "credit be given to\n\t\t    copyright holder and/or author"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Attribution"}})

(def CommercialUse
  "exercising rights for       commercial purposes"
  {:rdf/about    :cc/CommercialUse,
   :rdf/type     :cc/Prohibition,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "exercising rights for\n\t\t    commercial purposes"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Commercial Use"}})

(def Copyleft
  "derivative and       combined works must be licensed under specified       terms, similar to those on the original       work"
  {:rdf/about :cc/Copyleft,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "derivative and\n\t\t    combined works must be licensed under specified\n\t\t    terms, similar to those on the original\n\t\t    work"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Copyleft"}})

(def DerivativeWorks
  "distribution of       derivative works"
  {:rdf/about    :cc/DerivativeWorks,
   :rdf/type     :cc/Permission,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "distribution of\n\t\t    derivative works"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Derivative Works"}})

(def Distribution
  "distribution, public       display, and publicly performance"
  {:rdf/about :cc/Distribution,
   :rdf/type :cc/Permission,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "distribution, public\n\t\t    display, and publicly performance"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Distribution"}})

(def HighIncomeNationUse
  "use in a       non-developing country"
  {:rdf/about    :cc/HighIncomeNationUse,
   :rdf/type     :cc/Prohibition,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "use in a\n\t\t    non-developing country"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "High Income Nation Use"}})

(def Jurisdiction
  "the legal jurisdiction       of a license"
  {:rdf/about    :cc/Jurisdiction,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "the legal jurisdiction\n\t\t    of a license"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Jurisdiction"}})

(def LesserCopyleft
  "derivative works must       be licensed under specified terms, with at least       the same conditions as the original work;       combinations with the work may be licensed under       different terms"
  {:rdf/about :cc/LesserCopyleft,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "derivative works must\n\t\t    be licensed under specified terms, with at least\n\t\t    the same conditions as the original work;\n\t\t    combinations with the work may be licensed under\n\t\t    different terms"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Lesser Copyleft"}})

(def License
  "a set of       requests/permissions to users of a Work, e.g. a       copyright license, the public domain, information       for distributors"
  {:rdf/about :cc/License,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "a set of\n\t\t    requests/permissions to users of a Work, e.g. a\n\t\t    copyright license, the public domain, information\n\t\t    for distributors"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "License"},
   :rdfs/subClassOf :dcterms/LicenseDocument})

(def Notice
  "copyright and license       notices be kept intact"
  {:rdf/about    :cc/Notice,
   :rdf/type     :cc/Requirement,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "copyright and license\n\t\t    notices be kept intact"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Notice"}})

(def Permission
  "an action that may or       may not be allowed or desired"
  {:rdf/about :cc/Permission,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "an action that may or\n\t\t    may not be allowed or desired"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Permission"}})

(def Prohibition
  "something you may be       asked not to do"
  {:rdf/about    :cc/Prohibition,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value "something you may be\n\t\t    asked not to do"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Prohibition"}})

(def Reproduction
  "making multiple       copies"
  {:rdf/about    :cc/Reproduction,
   :rdf/type     :cc/Permission,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "making multiple\n\t\t    copies"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Reproduction"}})

(def Requirement
  "an action that may or       may not be requested of you"
  {:rdf/about    :cc/Requirement,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "an action that may or\n\t\t    may not be requested of you"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Requirement"}})

(def ShareAlike
  "derivative works be       licensed under the same terms or compatible terms       as the original work"
  {:rdf/about :cc/ShareAlike,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "derivative works be\n\t\t    licensed under the same terms or compatible terms\n\t\t    as the original work"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Share Alike"}})

(def Sharing
  "permits commercial       derivatives, but only non-commercial       distribution"
  {:rdf/about :cc/Sharing,
   :rdf/type :cc/Permission,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "permits commercial\n\t\t    derivatives, but only non-commercial\n\t\t    distribution"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Sharing"}})

(def SourceCode
  "source code (the       preferred form for making modifications) must be       provided when exercising some rights granted by       the license."
  {:rdf/about :cc/SourceCode,
   :rdf/type :cc/Requirement,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "source code (the\n\t\t    preferred form for making modifications) must be\n\t\t    provided when exercising some rights granted by\n\t\t    the license."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Source Code"}})

(def Work
  "a potentially       copyrightable work"
  {:rdf/about    :cc/Work,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value    "a potentially\n\t\t    copyrightable work"},
   :rdfs/label   {:rdf/language "en-US",
                  :rdf/value    "Work"}})

(def attributionName
  {:rdf/about   :cc/attributionName,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/Work,
   :rdfs/range  :rdfs/Literal})

(def attributionURL
  {:rdf/about   :cc/attributionURL,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/Work,
   :rdfs/range  :rdfs/Resource})

(def deprecatedOn
  {:rdf/about   :cc/deprecatedOn,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "deprecated\n\t\t  on"},
   :rdfs/range  "http://www.w3.org/2001/XMLSchema-datatypes#date"})

(def jurisdiction
  {:rdf/about   :cc/jurisdiction,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "jurisdiction"},
   :rdfs/range  :cc/Jurisdiction})

(def legalcode
  {:rdf/about   :cc/legalcode,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/range  :rdfs/Resource})

(def license
  {:owl/sameAs         "http://www.w3.org/1999/xhtml/vocab#license",
   :rdf/about          :cc/license,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/label         {:rdf/language "en-US",
                        :rdf/value    "has\n\t\t  license"},
   :rdfs/range         :cc/License,
   :rdfs/subPropertyOf :dcterms/license})

(def morePermissions
  {:rdf/about          :cc/morePermissions,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation})

(def permits
  {:rdf/about   :cc/permits,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "permits"},
   :rdfs/range  :cc/Permission})

(def prohibits
  {:rdf/about   :cc/prohibits,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "prohibits"},
   :rdfs/range  :cc/Prohibition})

(def requires
  {:rdf/about   :cc/requires,
   :rdf/type    :rdf/Property,
   :rdfs/domain :cc/License,
   :rdfs/label  {:rdf/language "en-US",
                 :rdf/value    "requires"},
   :rdfs/range  :cc/Requirement})

(def useGuidelines
  {:rdf/about          :cc/useGuidelines,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :cc/Work,
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :dcterms/relation})