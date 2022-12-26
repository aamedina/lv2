(ns net.wikipunk.rdf.csvw
  "This document describes the RDFS vocabulary description used in the Metadata Vocabulary for Tabular Data [[tabular-metadata]] along with the default JSON-LD Context."
  {:dcterms/date #inst "2017-06-06T00:00:00.000-04:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This document describes the RDFS vocabulary description used in the Metadata Vocabulary for Tabular Data [[tabular-metadata]] along with the default JSON-LD Context."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "CSVW Namespace Vocabulary Terms"},
   :owl/imports "http://www.w3.org/ns/prov",
   :owl/versionInfo
   "https://github.com/w3c/csvw/commit/fcc9db20ba4de10e41e964eee1b5d01defa4c664",
   :rdf/about "http://www.w3.org/ns/csvw#",
   :rdf/ns-prefix-map {"as" "https://www.w3.org/ns/activitystreams#",
                       "cc" "http://creativecommons.org/ns#",
                       "csvw" "http://www.w3.org/ns/csvw#",
                       "ctag" "http://commontag.org/ns#",
                       "dcat" "http://www.w3.org/ns/dcat#",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms" "http://purl.org/dc/elements/1.1/",
                       "dqv" "http://www.w3.org/ns/dqv#",
                       "duv" "https://www.w3.org/TR/vocab-duv#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "gr" "http://purl.org/goodrelations/v1#",
                       "grddl" "http://www.w3.org/2003/g/data-view#",
                       "ical" "http://www.w3.org/2002/12/cal/icaltzd#",
                       "ldp" "http://www.w3.org/ns/ldp#",
                       "ma" "http://www.w3.org/ns/ma-ont#",
                       "oa" "http://www.w3.org/ns/oa#",
                       "og" "http://ogp.me/ns#",
                       "org" "http://www.w3.org/ns/org#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qb" "http://purl.org/linked-data/cube#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfa" "http://www.w3.org/ns/rdfa#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "rev" "http://purl.org/stuff/rev#",
                       "rif" "http://www.w3.org/2007/rif#",
                       "rr" "http://www.w3.org/ns/r2rml#",
                       "schema" "http://schema.org/",
                       "sd" "http://www.w3.org/ns/sparql-service-description#",
                       "sioc" "http://rdfs.org/sioc/ns#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "skosxl" "http://www.w3.org/2008/05/skos-xl#",
                       "v" "http://rdf.data-vocabulary.org/#",
                       "vcard" "http://www.w3.org/2006/vcard/ns#",
                       "void" "http://rdfs.org/ns/void#",
                       "wdr" "http://www.w3.org/2007/05/powder#",
                       "wrds" "http://www.w3.org/2007/05/powder-s#",
                       "xhv" "http://www.w3.org/1999/xhtml/vocab#",
                       "xml" "http://www.w3.org/XML/1998/namespace",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "csvw",
   :rdfa/uri "http://www.w3.org/ns/csvw#",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/tabular-metadata/"},
   :rdfs/seeAlso "http://www.w3.org/TR/tabular-metadata"}
  (:refer-clojure :exclude [name format]))

(def Cell
  "A Cell represents a cell at the intersection of a Row and a Column within a Table."
  {:rdf/about :csvw/Cell,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Cell represents a cell at the intersection of a Row and a Column within a Table."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cell"}})

(def Column
  "A Column represents a vertical arrangement of Cells within a Table."
  {:rdf/about :csvw/Column,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Column represents a vertical arrangement of Cells within a Table."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Column Description"}})

(def Datatype
  "Describes facets of a datatype."
  {:rdf/about        :csvw/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes facets of a datatype."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Datatype"}})

(def Dialect
  "A Dialect Description provides hints to parsers about how to parse a linked file."
  {:rdf/about :csvw/Dialect,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Dialect Description provides hints to parsers about how to parse a linked file."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dialect Description"}})

(def Direction
  "The class of table/text directions."
  {:rdf/about        :csvw/Direction,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The class of table/text directions."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Direction"}})

(def ForeignKey
  "Describes relationships between Columns in one or more Tables."
  {:rdf/about :csvw/ForeignKey,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes relationships between Columns in one or more Tables."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Foreign Key Definition"}})

(def JSON
  "A literal containing JSON."
  {:rdf/about        :csvw/JSON,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A literal containing JSON."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "JSON"},
   :rdfs/subClassOf  :xsd/string})

(def NumericFormat
  "If the datatype is a numeric type, the format property indicates the expected format for that number. Its value must be either a single string or an object with one or more properties."
  {:rdf/about :csvw/NumericFormat,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the datatype is a numeric type, the format property indicates the expected format for that number. Its value must be either a single string or an object with one or more properties."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Numeric Format"}})

(def Row
  "A Row represents a horizontal arrangement of cells within a Table."
  {:rdf/about :csvw/Row,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Row represents a horizontal arrangement of cells within a Table."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Row"}})

(def Schema
  "A Schema is a definition of a tabular format that may be common to multiple tables."
  {:rdf/about :csvw/Schema,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Schema is a definition of a tabular format that may be common to multiple tables."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Schema"}})

(def Table
  "An annotated table is a table that is annotated with additional metadata."
  {:rdf/about :csvw/Table,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An annotated table is a table that is annotated with additional metadata."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Annotated Table"}})

(def TableGroup
  "A Group of Tables comprises a set of Annotated Tables and a set of annotations that relate to those Tables."
  {:rdf/about :csvw/TableGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Group of Tables comprises a set of Annotated Tables and a set of annotations that relate to those Tables."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group of Tables"}})

(def TableReference
  "An object property that identifies a referenced table and a set of referenced columns within that table."
  {:rdf/about :csvw/TableReference,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object property that identifies a referenced table and a set of referenced columns within that table."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Table Reference"}})

(def Transformation
  "A Transformation Definition is a definition of how tabular data can be transformed into another format."
  {:rdf/about :csvw/Transformation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Transformation Definition is a definition of how tabular data can be transformed into another format."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transformation Definition"}})

(def aboutUrl
  "A URI template property that MAY be used to indicate what a cell contains information about."
  {:rdf/about :csvw/aboutUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A URI template property that MAY be used to indicate what a cell contains information about."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "about URL"},
   :rdfs/range :csvw/uriTemplate})

(def auto
  "Indicates whether the tables in the group should be displayed based on the first character in the table that has a specific direction."
  {:rdf/about :csvw/auto,
   :rdf/type :csvw/Direction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the tables in the group should be displayed based on the first character in the table that has a specific direction."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auto"}})

(def base
  "An atomic property that contains a single string: a term defined in the default context representing a built-in datatype URL, as listed above."
  {:rdf/about :csvw/base,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that contains a single string: a term defined in the default context representing a built-in datatype URL, as listed above."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "base"},
   :rdfs/range :xsd/string})

(def column
  "An array property of column descriptions as described in section 5.6 Columns."
  {:rdf/about :csvw/column,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An array property of column descriptions as described in section 5.6 Columns."},
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "column"},
   :rdfs/range :csvw/Column})

(def columnReference
  "A column reference property that holds either a single reference to a column description object within this schema, or an array of references. These form the referencing columns for the foreign key definition."
  {:rdf/about :csvw/columnReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A column reference property that holds either a single reference to a column description object within this schema, or an array of references. These form the referencing columns for the foreign key definition."},
   :rdfs/domain {:owl/unionOf [:csvw/ForeignKey :csvw/TableReference]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "column reference"},
   :rdfs/range :xsd/string})

(def commentPrefix
  "An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string."
  {:rdf/about :csvw/commentPrefix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "comment prefix"},
   :rdfs/range :xsd/string})

(def csvEncodedTabularData
  "Describes the role of a CSV file in the tabular data mapping."
  {:rdf/about :csvw/csvEncodedTabularData,
   :rdf/type :prov/Role,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Describes the role of a CSV file in the tabular data mapping."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CSV Encoded Tabular Data"}})

(def datatype
  "An object property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes or an absolute URL; if it is an object then it describes a more specialised datatype."
  {:rdf/about :csvw/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes or an absolute URL; if it is an object then it describes a more specialised datatype."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "datatype"},
   :rdfs/range {:owl/unionOf [:csvw/Datatype :xsd/string]}})

(def decimalChar
  "A string whose value is used to represent a decimal point within the number."
  {:rdf/about :csvw/decimalChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A string whose value is used to represent a decimal point within the number."},
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "decimal character"},
   :rdfs/range :xsd/string})

(def default
  "An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string."
  {:rdf/about :csvw/default,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default"},
   :rdfs/range :xsd/string})

(def delimiter
  "An atomic property that sets the delimiter flag to the single provided value, which MUST be a string."
  {:rdf/about :csvw/delimiter,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that sets the delimiter flag to the single provided value, which MUST be a string."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "delimiter"},
   :rdfs/range :xsd/string})

(def describes
  "From IANA describes: The relationship A 'describes' B asserts that resource A provides a description of resource B. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource."
  {:rdf/about :csvw/describes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "From IANA describes: The relationship A 'describes' B asserts that resource A provides a description of resource B. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource."},
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "describes"}})

(def dialect
  "An object property that provides a single dialect description. If provided, dialect provides hints to processors about how to parse the referenced files to create tabular data models for the tables in the group."
  {:rdf/about :csvw/dialect,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object property that provides a single dialect description. If provided, dialect provides hints to processors about how to parse the referenced files to create tabular data models for the tables in the group."},
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dialect"},
   :rdfs/range :csvw/Dialect})

(def doubleQuote
  "A boolean atomic property that, if `true`, sets the escape character flag to `\"`."
  {:rdf/about :csvw/doubleQuote,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A boolean atomic property that, if `true`, sets the escape character flag to `\"`."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "double quote"},
   :rdfs/range :xsd/boolean})

(def encoding
  "An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [[encoding]]. The default is \"utf-8\"."
  {:rdf/about :csvw/encoding,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [[encoding]]. The default is \"utf-8\"."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "encoding"},
   :rdfs/range :xsd/string})

(def foreignKey
  "For a Table: a list of foreign keys on the table.  For a Schema: an array property of foreign key definitions that define how the values from specified columns within this table link to rows within this table or other tables."
  {:rdf/about :csvw/foreignKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For a Table: a list of foreign keys on the table.\n\nFor a Schema: an array property of foreign key definitions that define how the values from specified columns within this table link to rows within this table or other tables."},
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Schema]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "foreign key"},
   :rdfs/range :csvw/ForeignKey})

(def format
  "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [[tabular-data-model]]."
  {:rdf/about :csvw/format,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [[tabular-data-model]]."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "format"},
   :rdfs/range :xsd/string})

(def groupChar
  "A string whose value is used to group digits within the number."
  {:rdf/about :csvw/groupChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A string whose value is used to group digits within the number."},
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "group character"},
   :rdfs/range {:owl/unionOf [:csvw/NumericFormat :xsd/string]}})

(def header
  "A boolean atomic property that, if `true`, sets the header row count flag to `1`, and if `false` to `0`, unless headerRowCount is provided, in which case the value provided for the header property is ignored."
  {:rdf/about :csvw/header,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A boolean atomic property that, if `true`, sets the header row count flag to `1`, and if `false` to `0`, unless headerRowCount is provided, in which case the value provided for the header property is ignored."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "header"},
   :rdfs/range :xsd/boolean})

(def headerRowCount
  "An numeric atomic property that sets the header row count flag to the single provided value, which must be a non-negative integer."
  {:rdf/about :csvw/headerRowCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An numeric atomic property that sets the header row count flag to the single provided value, which must be a non-negative integer."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "header row count"},
   :rdfs/range :xsd/nonNegativeInteger})

(def inherit
  "For `textDirection`, indicates that the direction is inherited from the `tableDirection` annotation of the `table`."
  {:rdf/about :csvw/inherit,
   :rdf/type :csvw/Direction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For `textDirection`, indicates that the direction is inherited from the `tableDirection` annotation of the `table`."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inherit"}})

(def lang
  "An atomic property giving a single string language code as defined by [[BCP47]]."
  {:rdf/about :csvw/lang,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property giving a single string language code as defined by [[BCP47]]."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "language"},
   :rdfs/range :xsd/string})

(def length
  "The exact length of the value of the cell."
  {:rdf/about        :csvw/length,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The exact length of the value of the cell."},
   :rdfs/domain      :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "length"},
   :rdfs/range       :xsd/nonNegativeInteger})

(def lineTerminators
  "An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array."
  {:rdf/about :csvw/lineTerminators,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "line terminators"},
   :rdfs/range :xsd/string})

(def ltr
  "Indicates whether the tables in the group should be displayed with the first column on the right."
  {:rdf/about :csvw/ltr,
   :rdf/type :csvw/Direction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the tables in the group should be displayed with the first column on the right."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "left to right"}})

(def maxExclusive
  "An atomic property that contains a single number that is the maximum valid value (exclusive)."
  {:rdf/about :csvw/maxExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that contains a single number that is the maximum valid value (exclusive)."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max exclusive"},
   :rdfs/range :xsd/integer})

(def maxInclusive
  "An atomic property that contains a single number that is the maximum valid value (inclusive)."
  {:rdf/about :csvw/maxInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that contains a single number that is the maximum valid value (inclusive)."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max inclusive"},
   :rdfs/range :xsd/integer})

(def maxLength
  "A numeric atomic property that contains a single integer that is the maximum length of the value."
  {:rdf/about :csvw/maxLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A numeric atomic property that contains a single integer that is the maximum length of the value."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max length"},
   :rdfs/range :xsd/nonNegativeInteger})

(def minExclusive
  "An atomic property that contains a single number that is the minimum valid value (exclusive)."
  {:rdf/about :csvw/minExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that contains a single number that is the minimum valid value (exclusive)."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min exclusive"},
   :rdfs/range :xsd/integer})

(def minInclusive
  "An atomic property that contains a single number that is the minimum valid value (inclusive)."
  {:rdf/about :csvw/minInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that contains a single number that is the minimum valid value (inclusive)."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min inclusive"},
   :rdfs/range :xsd/integer})

(def minLength
  "An atomic property that contains a single integer that is the minimum length of the value."
  {:rdf/about :csvw/minLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that contains a single integer that is the minimum length of the value."},
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min length"},
   :rdfs/range :xsd/nonNegativeInteger})

(def name
  "An atomic property that gives a single canonical name for the column. The value of this property becomes the name annotation for the described column."
  {:rdf/about :csvw/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that gives a single canonical name for the column. The value of this property becomes the name annotation for the described column."},
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "name"},
   :rdfs/range :xsd/string})

(def note
  "An array property that provides an array of objects representing arbitrary annotations on the annotated tabular data model."
  {:rdf/about :csvw/note,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An array property that provides an array of objects representing arbitrary annotations on the annotated tabular data model."},
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "note"}})

(def null
  "An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is `null`."
  {:rdf/about :csvw/null,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is `null`."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "null"},
   :rdfs/range :xsd/string})

(def ordered
  "A boolean atomic property taking a single value which indicates whether a list that is the value of the cell is ordered (if `true`) or unordered (if `false`)."
  {:rdf/about :csvw/ordered,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A boolean atomic property taking a single value which indicates whether a list that is the value of the cell is ordered (if `true`) or unordered (if `false`)."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ordered"},
   :rdfs/range :xsd/boolean})

(def pattern
  "A regular expression string, in the syntax and interpreted as defined by [[ECMASCRIPT]]."
  {:rdf/about :csvw/pattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A regular expression string, in the syntax and interpreted as defined by [[ECMASCRIPT]]."},
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pattern"},
   :rdfs/range :xsd/string})

(def primaryKey
  "For Schema: A column reference property that holds either a single reference to a column description object or an array of references.  For Row: a possibly empty list of cells whose values together provide a unique identifier for this row. This is similar to the name of a column."
  {:rdf/about :csvw/primaryKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For Schema: A column reference property that holds either a single reference to a column description object or an array of references.\n\nFor Row: a possibly empty list of cells whose values together provide a unique identifier for this row. This is similar to the name of a column."},
   :rdfs/domain {:owl/unionOf [:csvw/Schema :csvw/Row]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary key"},
   :rdfs/range :xsd/string})

(def propertyUrl
  "An URI template property that MAY be used to create a URI for a property if the table is mapped to another format."
  {:rdf/about :csvw/propertyUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An URI template property that MAY be used to create a URI for a property if the table is mapped to another format. "},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property URL"},
   :rdfs/range :csvw/uriTemplate})

(def quoteChar
  "An atomic property that sets the quote character flag to the single provided value, which must be a string or `null`."
  {:rdf/about :csvw/quoteChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that sets the quote character flag to the single provided value, which must be a string or `null`."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quote char"},
   :rdfs/range :xsd/string})

(def reference
  "An object property that identifies a **referenced table** and a set of **referenced columns** within that table."
  {:rdf/about :csvw/reference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object property that identifies a **referenced table** and a set of **referenced columns** within that table."},
   :rdfs/domain :csvw/ForeignKey,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reference"},
   :rdfs/range :csvw/TableReference})

(def referencedRow
  "A possibly empty list of pairs of a foreign key and a row in a table within the same group of tables."
  {:rdf/about :csvw/referencedRow,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A possibly empty list of pairs of a foreign key and a row in a table within the same group of tables."},
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "referenced rows"}})

(def required
  "A boolean atomic property taking a single value which indicates whether the cell must have a non-null value. The default is `false`."
  {:rdf/about :csvw/required,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A boolean atomic property taking a single value which indicates whether the cell must have a non-null value. The default is `false`. "},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "required"},
   :rdfs/range :xsd/boolean})

(def resource
  "A link property holding a URL that is the identifier for a specific table that is being referenced."
  {:rdf/about :csvw/resource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link property holding a URL that is the identifier for a specific table that is being referenced."},
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "resource"},
   :rdfs/range :xsd/anyURI})

(def row
  "Relates a Table to each Row output."
  {:rdf/about          :csvw/row,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Relates a Table to each Row output."},
   :rdfs/domain        :csvw/Table,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/csvw#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "row"},
   :rdfs/range         :csvw/Row,
   :rdfs/subPropertyOf :rdfs/member})

(def rowTitle
  "A column reference property that holds either a single reference to a column description object or an array of references."
  {:rdf/about :csvw/rowTitle,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A column reference property that holds either a single reference to a column description object or an array of references."},
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "row titles"},
   :rdfs/range :xsd/string})

(def rownum
  "The position of the row amongst the rows of the Annotated Tabl, starting from 1"
  {:rdf/about :csvw/rownum,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The position of the row amongst the rows of the Annotated Tabl, starting from 1"},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "row number"},
   :rdfs/range :xsd/integer})

(def rtl
  "Indicates whether the tables in the group should be displayed with the first column on the left."
  {:rdf/about :csvw/rtl,
   :rdf/type :csvw/Direction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the tables in the group should be displayed with the first column on the left."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "right to left"}})

(def schemaReference
  "A link property holding a URL that is the identifier for a schema that is being referenced."
  {:rdf/about :csvw/schemaReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link property holding a URL that is the identifier for a schema that is being referenced."},
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "schema reference"},
   :rdfs/range :xsd/anyURI})

(def scriptFormat
  "A link property giving the single URL for the format that is used by the script or template."
  {:rdf/about :csvw/scriptFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link property giving the single URL for the format that is used by the script or template."},
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "script format"},
   :rdfs/range :xsd/anyURI})

(def separator
  "An atomic property that MUST have a single string value that is the character used to separate items in the string value of the cell."
  {:rdf/about :csvw/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that MUST have a single string value that is the character used to separate items in the string value of the cell."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "separator"},
   :rdfs/range :xsd/string})

(def skipBlankRows
  "An boolean atomic property that sets the `skip blank rows` flag to the single provided boolean value."
  {:rdf/about :csvw/skipBlankRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An boolean atomic property that sets the `skip blank rows` flag to the single provided boolean value."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "skip blank rows"},
   :rdfs/range :xsd/boolean})

(def skipColumns
  "An numeric atomic property that sets the `skip columns` flag to the single provided numeric value, which MUST be a non-negative integer."
  {:rdf/about :csvw/skipColumns,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An numeric atomic property that sets the `skip columns` flag to the single provided numeric value, which MUST be a non-negative integer."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "skip columns"},
   :rdfs/range :xsd/nonNegativeInteger})

(def skipInitialSpace
  "A boolean atomic property that, if `true`, sets the trim flag to \"start\". If `false`, to `false`."
  {:rdf/about :csvw/skipInitialSpace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A boolean atomic property that, if `true`, sets the trim flag to \"start\". If `false`, to `false`."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "skip initial space"},
   :rdfs/range :xsd/boolean})

(def skipRows
  "An numeric atomic property that sets the `skip rows` flag to the single provided numeric value, which MUST be a non-negative integer."
  {:rdf/about :csvw/skipRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An numeric atomic property that sets the `skip rows` flag to the single provided numeric value, which MUST be a non-negative integer."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "skip rows"},
   :rdfs/range :xsd/nonNegativeInteger})

(def source
  "A single string atomic property that provides, if specified, the format to which the tabular data should be transformed prior to the transformation using the script or template."
  {:rdf/about :csvw/source,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A single string atomic property that provides, if specified, the format to which the tabular data should be transformed prior to the transformation using the script or template."},
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "source"},
   :rdfs/range :xsd/string})

(def suppressOutput
  "A boolean atomic property. If `true`, suppresses any output that would be generated when converting a table or cells within a column."
  {:rdf/about :csvw/suppressOutput,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A boolean atomic property. If `true`, suppresses any output that would be generated when converting a table or cells within a column."},
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "suppress output"},
   :rdfs/range :xsd/boolean})

(def table
  "Relates an Table group to annotated tables."
  {:rdf/about          :csvw/table,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Relates an Table group to annotated tables."},
   :rdfs/domain        :csvw/TableGroup,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/csvw#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "table"},
   :rdfs/range         :csvw/Table,
   :rdfs/subPropertyOf :rdfs/member})

(def tableDirection
  "One of `rtl`, `ltr` or `auto`. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction."
  {:rdf/about :csvw/tableDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "One of `rtl`, `ltr` or `auto`. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction."},
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "table direction"},
   :rdfs/range :csvw/Direction})

(def tableSchema
  "An object property that provides a single schema description as described in section 5.5 Schemas, used as the default for all the tables in the group"
  {:rdf/about :csvw/tableSchema,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object property that provides a single schema description as described in section 5.5 Schemas, used as the default for all the tables in the group"},
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "table schema"},
   :rdfs/range :csvw/Schema})

(def tabularMetadata
  "Describes the role of a Metadata file in the tabular data mapping."
  {:rdf/about :csvw/tabularMetadata,
   :rdf/type :prov/Role,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes the role of a Metadata file in the tabular data mapping."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tabular Metadata"}})

(def targetFormat
  "A link property giving the single URL for the format that will be created through the transformation."
  {:rdf/about :csvw/targetFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link property giving the single URL for the format that will be created through the transformation."},
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "target format"},
   :rdfs/range :xsd/anyURI})

(def textDirection
  "An atomic property that must have a single value that is one of `rtl` or `ltr` (the default)."
  {:rdf/about :csvw/textDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that must have a single value that is one of `rtl` or `ltr` (the default)."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "text direction"},
   :rdfs/range :csvw/Direction})

(def title
  "For a Transformation A natural language property that describes the format that will be generated from the transformation.  For a Column: A natural language property that provides possible alternative names for the column."
  {:rdf/about :csvw/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For a Transformation A natural language property that describes the format that will be generated from the transformation.\n\nFor a Column: A natural language property that provides possible alternative names for the column."},
   :rdfs/domain {:owl/unionOf [:csvw/Transformation :csvw/Column :csvw/Row]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "title"}})

(def transformations
  "An array property of transformation definitions that provide mechanisms to transform the tabular data into other formats."
  {:rdf/about :csvw/transformations,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An array property of transformation definitions that provide mechanisms to transform the tabular data into other formats."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transformations"},
   :rdfs/range :csvw/Transformation})

(def trim
  "An atomic property that, if the boolean `true`, sets the trim flag to `true` and if the boolean `false` to `false`. If the value provided is a string, sets the trim flag to the provided value, which must be one of \"true\", \"false\", \"start\" or \"end\"."
  {:rdf/about :csvw/trim,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An atomic property that, if the boolean `true`, sets the trim flag to `true` and if the boolean `false` to `false`. If the value provided is a string, sets the trim flag to the provided value, which must be one of \"true\", \"false\", \"start\" or \"end\"."},
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trim"},
   :rdfs/range :xsd/boolean})

(def uriTemplate
  ""
  {:rdf/about        :csvw/uriTemplate,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    ""},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "uri template"},
   :rdfs/subClassOf  :xsd/string})

(def url
  "For a Table: This link property gives the single URL of the CSV file that the table is held in, relative to the location of the metadata document.  For a Transformation: A link property giving the single URL of the file that the script or template is held in, relative to the location of the metadata document."
  {:rdf/about :csvw/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For a Table: This link property gives the single URL of the CSV file that the table is held in, relative to the location of the metadata document.\n\nFor a Transformation: A link property giving the single URL of the file that the script or template is held in, relative to the location of the metadata document."},
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Transformation]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "url"},
   :rdfs/range :xsd/anyURI})

(def valueUrl
  "An URI template property that is used to map the values of cells into URLs."
  {:rdf/about :csvw/valueUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An URI template property that is used to map the values of cells into URLs."},
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valueUrl"},
   :rdfs/range :csvw/uriTemplate})

(def virtual
  "A boolean atomic property taking a single value which indicates whether the column is a virtual column not present in the original source"
  {:rdf/about :csvw/virtual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A boolean atomic property taking a single value which indicates whether the column is a virtual column not present in the original source"},
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "virtual"},
   :rdfs/range :xsd/boolean})