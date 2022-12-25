(ns net.wikipunk.rdf.lv2.xsd
  "XML Schema Datatypes"
  {:vann/preferredNamespacePrefix "xsd",
   :vann/preferredNamespaceUri "http://www.w3.org/2001/XMLSchema#",
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/xsd.ttl",
   :rdf/ns-prefix-map {"xsd" "http://www.w3.org/2001/XMLSchema#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdf/about [#:rdf{:uri "http://www.w3.org/2001/XMLSchema#"}],
   :rdf/type :owl/Ontology}
  (:refer-clojure :exclude [boolean short byte float time double long int]))

(def anySimpleType
  "The base class of any primitive XSD dataype."
  {:rdfs/label "any simple type",
   :rdfs/comment "The base class of any primitive XSD dataype.",
   :rdf/type :rdfs/Datatype})

(def anyURI
  "any URI"
  {:owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "any URI",
   :rdf/type :rdfs/Datatype})

(def base64Binary
  "Base64-encoded arbitrary binary data."
  {:owl/withRestrictions
     [#:xsd{:pattern
              "(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *)*(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/])|([A-Za-z0-9+/] *[A-Za-z0-9+/] *[AEIMQUYcgkosw048] *=)|([A-Za-z0-9+/] *[AQgw] *= *=)))?"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "base64 binary",
   :rdfs/comment "Base64-encoded arbitrary binary data.",
   :rdf/type :rdfs/Datatype})

(def boolean
  "boolean"
  {:owl/withRestrictions [#:xsd{:pattern "(true|false|0|1)"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "boolean",
   :rdf/type :rdfs/Datatype})

(def byte
  "byte"
  {:owl/withRestrictions [#:xsd{:maxInclusive 127} #:xsd{:minInclusive -128}],
   :owl/onDatatype :xsd/short,
   :rdfs/label "byte",
   :rdf/type :rdfs/Datatype})

(def date
  "date"
  {:owl/withRestrictions
     [#:xsd{:pattern
              "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "date",
   :rdf/type :rdfs/Datatype})

(def dateTime
  "date time"
  {:owl/withRestrictions
     [#:xsd{:pattern
              "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])T(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "date time",
   :rdf/type :rdfs/Datatype})

(def decimal
  "A subset of the real numbers, which can be represented by decimal numerals."
  {:owl/withRestrictions
     [#:xsd{:pattern
              "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "decimal",
   :rdfs/comment
     "A subset of the real numbers, which can be represented by decimal numerals.",
   :rdf/type :rdfs/Datatype})

(def double
  "IEEE double-precision 64-bit floating point."
  {:owl/withRestrictions
     [#:xsd{:pattern
              "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "double",
   :rdfs/comment "IEEE double-precision 64-bit floating point.",
   :rdf/type :rdfs/Datatype})

(def duration
  "duration"
  {:owl/withRestrictions
     [#:xsd{:pattern
              "-?P([0-9]+Y)?([0-9]+M)?([0-9]+D)?(T([0-9]+H)?([0-9]+M)?([0-9]+(\\.[0-9]+)?S)?)?"}
      #:xsd{:whiteSpace "collapse"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "duration",
   :rdf/type :rdfs/Datatype})

(def float
  "IEEE single-precision 32-bit floating point."
  {:owl/withRestrictions
     [#:xsd{:pattern
              "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}
      #:xsd{:whiteSpace "collapse"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "float",
   :rdfs/comment "IEEE single-precision 32-bit floating point.",
   :rdf/type :rdfs/Datatype})

(def fractionDigits
  "The total number of digits to the right of the decimal point required to represent a value."
  {:rdfs/range :xsd/nonNegativeInteger,
   :rdfs/label "fraction digits",
   :rdfs/comment
     "The total number of digits to the right of the decimal point required to represent a value.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def hexBinary
  "Hex-encoded arbitrary binary data."
  {:owl/withRestrictions [#:xsd{:pattern "([0-9A-Fa-f][0-9A-Fa-f])*"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "hex binary",
   :rdfs/comment "Hex-encoded arbitrary binary data.",
   :rdf/type :rdfs/Datatype})

(def int
  "int"
  {:owl/withRestrictions [#:xsd{:maxInclusive 2147483647}
                          #:xsd{:minInclusive -2147483648}],
   :owl/onDatatype :xsd/long,
   :rdfs/label "int",
   :rdf/type :rdfs/Datatype})

(def integer
  "integer"
  {:owl/withRestrictions [#:xsd{:pattern "[-+]?[0-9]+"}
                          #:xsd{:fractionDigits 0}],
   :owl/onDatatype :xsd/decimal,
   :rdfs/label "integer",
   :rdf/type :rdfs/Datatype})

(def language
  "language"
  {:owl/withRestrictions
     [#:xsd{:pattern
              "[a-zA-Z][a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?(-[a-zA-Z0-9][a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?)*"}],
   :owl/onDatatype :xsd/token,
   :rdfs/label "language",
   :rdf/type :rdfs/Datatype})

(def long
  "long"
  {:owl/withRestrictions [#:xsd{:maxInclusive 9223372036854775807}
                          #:xsd{:minInclusive -9223372036854775808}],
   :owl/onDatatype :xsd/integer,
   :rdfs/label "long",
   :rdf/type :rdfs/Datatype})

(def maxExclusive
  "The exclusive upper bound of an ordered datatype."
  {:rdfs/label "max exclusive",
   :rdfs/comment "The exclusive upper bound of an ordered datatype.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def maxInclusive
  "The inclusive upper bound of an ordered datatype."
  {:rdfs/label "max inclusive",
   :rdfs/comment "The inclusive upper bound of an ordered datatype.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def minExclusive
  "The exclusive lower bound of an ordered datatype."
  {:rdfs/label "min exclusive",
   :rdfs/comment "The exclusive lower bound of an ordered datatype.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def minInclusive
  "The inclusive lower bound of an ordered datatype."
  {:rdfs/label "min inclusive",
   :rdfs/comment "The inclusive lower bound of an ordered datatype.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def negativeInteger
  "negative integer"
  {:owl/withRestrictions [#:xsd{:maxInclusive -1}],
   :owl/onDatatype :xsd/nonPositiveInteger,
   :rdfs/label "negative integer",
   :rdf/type :rdfs/Datatype})

(def nonNegativeInteger
  "non-negative integer"
  {:owl/withRestrictions [#:xsd{:pattern "[+]?[0-9]+"} #:xsd{:minInclusive 0}],
   :owl/onDatatype :xsd/integer,
   :rdfs/label "non-negative integer",
   :rdf/type :rdfs/Datatype})

(def nonPositiveInteger
  "non-positive integer"
  {:owl/withRestrictions [#:xsd{:pattern "(0|-[0-9]+)"} #:xsd{:maxInclusive 0}],
   :owl/onDatatype :xsd/integer,
   :rdfs/label "non-positive integer",
   :rdf/type :rdfs/Datatype})

(def normalizedString
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters."
  {:owl/onDatatype :xsd/string,
   :rdfs/label "normalized string",
   :rdfs/comment
     "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters.",
   :rdf/type :rdfs/Datatype})

(def pattern
  "A regular expression that matches complete valid literals."
  {:rdfs/label "pattern",
   :rdfs/comment "A regular expression that matches complete valid literals.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def positiveInteger
  "positive integer"
  {:owl/withRestrictions [#:xsd{:pattern "[+]?[0-9]*[1-9]+[0-9]*"}
                          #:xsd{:minInclusive 1}],
   :owl/onDatatype :xsd/nonNegativeInteger,
   :rdfs/label "positive integer",
   :rdf/type :rdfs/Datatype})

(def short
  "short"
  {:owl/withRestrictions [#:xsd{:maxInclusive 32767}
                          #:xsd{:minInclusive -32768}],
   :owl/onDatatype :xsd/int,
   :rdfs/label "short",
   :rdf/type :rdfs/Datatype})

(def string
  "A character string."
  {:owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "string",
   :rdfs/comment "A character string.",
   :rdf/type :rdfs/Datatype})

(def time
  "time"
  {:owl/withRestrictions
     [#:xsd{:pattern
              "(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :owl/onDatatype :xsd/anySimpleType,
   :rdfs/label "time",
   :rdf/type :rdfs/Datatype})

(def token
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, that have no leading or trailing spaces (#x20) and that have no internal sequences of two or more spaces."
  {:owl/onDatatype :xsd/normalizedString,
   :rdfs/label "token",
   :rdfs/comment
     "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, that have no leading or trailing spaces (#x20) and that have no internal sequences of two or more spaces.",
   :rdf/type :rdfs/Datatype})

(def unsignedByte
  "unsigned byte"
  {:owl/withRestrictions [#:xsd{:maxInclusive 255}],
   :owl/onDatatype :xsd/unsignedShort,
   :rdfs/label "unsigned byte",
   :rdf/type :rdfs/Datatype})

(def unsignedInt
  "unsigned int"
  {:owl/withRestrictions [#:xsd{:maxInclusive 4294967295}],
   :owl/onDatatype :xsd/unsignedLong,
   :rdfs/label "unsigned int",
   :rdf/type :rdfs/Datatype})

(def unsignedLong
  "unsigned long"
  {:owl/withRestrictions [#:xsd{:maxInclusive 18446744073709551615}],
   :owl/onDatatype :xsd/nonNegativeInteger,
   :rdfs/label "unsigned long",
   :rdf/type :rdfs/Datatype})

(def unsignedShort
  "unsigned short"
  {:owl/withRestrictions [#:xsd{:maxInclusive 65535}],
   :owl/onDatatype :xsd/unsignedInt,
   :rdfs/label "unsigned short",
   :rdf/type :rdfs/Datatype})

(def whiteSpace
  "A string that describes whitespace normalization for a string type."
  {:rdfs/range {:owl/withRestrictions [#:xsd{:pattern
                                               "(preserve|replace|collapse)"}],
                :owl/onDatatype :xsd/string,
                :rdf/type :rdfs/Datatype},
   :rdfs/label "white space",
   :rdfs/comment
     "A string that describes whitespace normalization for a string type.",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})