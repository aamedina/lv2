(ns net.wikipunk.rdf.lv2.xsd
  "http://www.w3.org/2001/XMLSchema#"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/xsd.ttl",
   :rdf/about {:rdf/uri "http://www.w3.org/2001/XMLSchema#"},
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "xsd",
   :vann/preferredNamespaceUri "http://www.w3.org/2001/XMLSchema#"}
  (:refer-clojure :exclude [boolean short byte float time double long int]))

(def anySimpleType
  "The base class of any primitive XSD dataype."
  {:rdf/about  :xsd/anySimpleType,
   :rdf/type   :rdfs/Datatype,
   :rdfs/label "any simple type"})

(def anyURI
  {:owl/onDatatype :xsd/anySimpleType,
   :rdf/about      :xsd/anyURI,
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "any URI"})

(def base64Binary
  "Base64-encoded arbitrary binary data."
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *)*(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/])|([A-Za-z0-9+/] *[A-Za-z0-9+/] *[AEIMQUYcgkosw048] *=)|([A-Za-z0-9+/] *[AQgw] *= *=)))?"}],
   :rdf/about :xsd/base64Binary,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "base64 binary"})

(def boolean
  {:owl/onDatatype       :xsd/anySimpleType,
   :owl/withRestrictions [{:xsd/pattern "(true|false|0|1)"}],
   :rdf/about            :xsd/boolean,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "boolean"})

(def byte
  {:owl/onDatatype       :xsd/short,
   :owl/withRestrictions [{:xsd/maxInclusive 127} {:xsd/minInclusive -128}],
   :rdf/about            :xsd/byte,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "byte"})

(def date
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/about :xsd/date,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "date"})

(def dateTime
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])T(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/about :xsd/dateTime,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "date time"})

(def decimal
  "A subset of the real numbers, which can be represented by decimal numerals."
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :rdf/about :xsd/decimal,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "decimal"})

(def double
  "IEEE double-precision 64-bit floating point."
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :rdf/about :xsd/double,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "double"})

(def duration
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?P([0-9]+Y)?([0-9]+M)?([0-9]+D)?(T([0-9]+H)?([0-9]+M)?([0-9]+(\\.[0-9]+)?S)?)?"}
    {:xsd/whiteSpace "collapse"}],
   :rdf/about :xsd/duration,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "duration"})

(def float
  "IEEE single-precision 32-bit floating point."
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}
    {:xsd/whiteSpace "collapse"}],
   :rdf/about :xsd/float,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "float"})

(def fractionDigits
  "The total number of digits to the right of the decimal point required to represent a value."
  {:rdf/about  :xsd/fractionDigits,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "fraction digits",
   :rdfs/range :xsd/nonNegativeInteger})

(def hexBinary
  "Hex-encoded arbitrary binary data."
  {:owl/onDatatype       :xsd/anySimpleType,
   :owl/withRestrictions [{:xsd/pattern "([0-9A-Fa-f][0-9A-Fa-f])*"}],
   :rdf/about            :xsd/hexBinary,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "hex binary"})

(def int
  {:owl/onDatatype       :xsd/long,
   :owl/withRestrictions [{:xsd/maxInclusive 2147483647}
                          {:xsd/minInclusive -2147483648}],
   :rdf/about            :xsd/int,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "int"})

(def integer
  {:owl/onDatatype       :xsd/decimal,
   :owl/withRestrictions [{:xsd/pattern "[-+]?[0-9]+"} {:xsd/fractionDigits 0}],
   :rdf/about            :xsd/integer,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "integer"})

(def language
  {:owl/onDatatype :xsd/token,
   :owl/withRestrictions
   [{:xsd/pattern
     "[a-zA-Z][a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?(-[a-zA-Z0-9][a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?)*"}],
   :rdf/about :xsd/language,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "language"})

(def long
  {:owl/onDatatype       :xsd/integer,
   :owl/withRestrictions [{:xsd/maxInclusive 9223372036854775807}
                          {:xsd/minInclusive -9223372036854775808}],
   :rdf/about            :xsd/long,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "long"})

(def maxExclusive
  "The exclusive upper bound of an ordered datatype."
  {:rdf/about  :xsd/maxExclusive,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "max exclusive"})

(def maxInclusive
  "The inclusive upper bound of an ordered datatype."
  {:rdf/about  :xsd/maxInclusive,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "max inclusive"})

(def minExclusive
  "The exclusive lower bound of an ordered datatype."
  {:rdf/about  :xsd/minExclusive,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "min exclusive"})

(def minInclusive
  "The inclusive lower bound of an ordered datatype."
  {:rdf/about  :xsd/minInclusive,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "min inclusive"})

(def negativeInteger
  {:owl/onDatatype       :xsd/nonPositiveInteger,
   :owl/withRestrictions [{:xsd/maxInclusive -1}],
   :rdf/about            :xsd/negativeInteger,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "negative integer"})

(def nonNegativeInteger
  {:owl/onDatatype       :xsd/integer,
   :owl/withRestrictions [{:xsd/pattern "[+]?[0-9]+"} {:xsd/minInclusive 0}],
   :rdf/about            :xsd/nonNegativeInteger,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "non-negative integer"})

(def nonPositiveInteger
  {:owl/onDatatype       :xsd/integer,
   :owl/withRestrictions [{:xsd/pattern "(0|-[0-9]+)"} {:xsd/maxInclusive 0}],
   :rdf/about            :xsd/nonPositiveInteger,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "non-positive integer"})

(def normalizedString
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters."
  {:owl/onDatatype :xsd/string,
   :rdf/about      :xsd/normalizedString,
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "normalized string"})

(def pattern
  "A regular expression that matches complete valid literals."
  {:rdf/about  :xsd/pattern,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "pattern"})

(def positiveInteger
  {:owl/onDatatype       :xsd/nonNegativeInteger,
   :owl/withRestrictions [{:xsd/pattern "[+]?[0-9]*[1-9]+[0-9]*"}
                          {:xsd/minInclusive 1}],
   :rdf/about            :xsd/positiveInteger,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "positive integer"})

(def short
  {:owl/onDatatype       :xsd/int,
   :owl/withRestrictions [{:xsd/maxInclusive 32767} {:xsd/minInclusive -32768}],
   :rdf/about            :xsd/short,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "short"})

(def string
  "A character string."
  {:owl/onDatatype :xsd/anySimpleType,
   :rdf/about      :xsd/string,
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "string"})

(def time
  {:owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/about :xsd/time,
   :rdf/type :rdfs/Datatype,
   :rdfs/label "time"})

(def token
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, that have no leading or trailing spaces (#x20) and that have no internal sequences of two or more spaces."
  {:owl/onDatatype :xsd/normalizedString,
   :rdf/about      :xsd/token,
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "token"})

(def unsignedByte
  {:owl/onDatatype       :xsd/unsignedShort,
   :owl/withRestrictions [{:xsd/maxInclusive 255}],
   :rdf/about            :xsd/unsignedByte,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned byte"})

(def unsignedInt
  {:owl/onDatatype       :xsd/unsignedLong,
   :owl/withRestrictions [{:xsd/maxInclusive 4294967295}],
   :rdf/about            :xsd/unsignedInt,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned int"})

(def unsignedLong
  {:owl/onDatatype       :xsd/nonNegativeInteger,
   :owl/withRestrictions [{:xsd/maxInclusive 18446744073709551615}],
   :rdf/about            :xsd/unsignedLong,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned long"})

(def unsignedShort
  {:owl/onDatatype       :xsd/unsignedInt,
   :owl/withRestrictions [{:xsd/maxInclusive 65535}],
   :rdf/about            :xsd/unsignedShort,
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned short"})

(def whiteSpace
  "A string that describes whitespace normalization for a string type."
  {:rdf/about  :xsd/whiteSpace,
   :rdf/type   [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label "white space",
   :rdfs/range {:owl/onDatatype :xsd/string,
                :owl/withRestrictions [{:xsd/pattern
                                        "(preserve|replace|collapse)"}],
                :rdf/type       :rdfs/Datatype}})