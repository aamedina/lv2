(ns net.wikipunk.rdf.time
  "OWL-Time"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time.ttl",
   :dcterms/contributor ["https://orcid.org/0000-0001-8269-8171"
                         "mailto:chris.little@metoffice.gov.uk"],
   :dcterms/created #inst "2006-09-27T00:00:00.000-04:00",
   :dcterms/creator ["http://orcid.org/0000-0002-3884-3420"
                     "mailto:panfeng66@gmail.com"
                     "https://en.wikipedia.org/wiki/Jerry_Hobbs"],
   :dcterms/isVersionOf "http://www.w3.org/TR/owl-time",
   :dcterms/license "https://creativecommons.org/licenses/by/4.0/",
   :dcterms/modified #inst "2021-01-27T00:00:00.000-05:00",
   :dcterms/rights
   {:rdf/language "en",
    :rdf/value
    "Copyright © 2006-2021 W3C, OGC. W3C and OGC liability, trademark and document use rules apply."},
   :owl/priorVersion :time/|2006|,
   :owl/versionIRI :time/|2016|,
   :rdf/about "http://www.w3.org/2006/time",
   :rdf/ns-prefix-map {"dct"  "http://purl.org/dc/terms/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "time" "http://www.w3.org/2006/time#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "time",
   :rdfa/uri "http://www.w3.org/2006/time#",
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/2017/REC-owl-time-20171019/"},
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "OWL-Time"}
                {:rdf/language "es",
                 :rdf/value    "Tiempo en OWL"}],
   :rdfs/seeAlso
   ["http://www.w3.org/TR/owl-time"
    "http://dx.doi.org/10.3233/SW-150187"
    "http://www.semantic-web-journal.net/content/time-ontology-extended-non-gregorian-calendar-applications"],
   :skos/changeNote
   ["2016-12-20 - adjust range of time:timeZone to time:TimeZone, moved up from the tzont ontology.  "
    "2016-06-15 - initial update of OWL-Time - modified to support arbitrary temporal reference systems. "
    "2017-02 - intervalIn, intervalDisjoint, monthOfYear added; TemporalUnit subclass of TemporalDuration"
    "2021-01-27 - clarified definition and label for time:after and time:before"
    "2016-12-20 - restore time:Year and time:January which were present in the 2006 version of the ontology, but now marked \"deprecated\". "
    "2017-04-06 - hasTime, hasXSDDuration added; Number removed; all duration elements changed to xsd:decimal"],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "Update of OWL-Time ontology, extended to support general temporal reference systems. \n\nOntology engineering by Simon J D Cox"}}
  (:refer-clojure :exclude [second]))

(def DateTimeDescription
  "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively."
  {:rdf/about :time/DateTimeDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Descripción de fecha y tiempo estructurada con valores separados para los diferentes elementos de un sistema calendario-reloj. El sistema de referencia temporal está fijado al calendario gregoriano, y el rango de las propiedades año, mes, día restringidas a los correspondientes tipos del XML Schema xsd:gYear, xsd:gMonth y xsd:gDay respectivamente."}
    {:rdf/language "en",
     :rdf/value
     "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "descripción de fecha-tiempo"}
                {:rdf/language "en",
                 :rdf/value    "Date-Time description"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/gYear,
                      :owl/onProperty    :time/year,
                      :rdf/type          :owl/Restriction}
                     {:owl/hasValue
                      "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian",
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gMonth,
                      :owl/onProperty    :time/month,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gDay,
                      :owl/onProperty    :time/day,
                      :rdf/type          :owl/Restriction}
                     :time/GeneralDateTimeDescription],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Descripción de fecha y tiempo estructurada con valores separados para los diferentes elementos de un sistema calendario-reloj. El sistema de referencia temporal está fijado al calendario gregoriano, y el rango de las propiedades año, mes, día restringidas a los correspondientes tipos del XML Schema xsd:gYear, xsd:gMonth y xsd:gDay respectivamente."}
    {:rdf/language "en",
     :rdf/value
     "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively."}]})

(def DateTimeInterval
  "DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription."
  {:rdf/about :time/DateTimeInterval,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription."}
    {:rdf/language "es",
     :rdf/value
     "'intervalo de fecha-hora' es una subclase de 'intervalo propio', definida utilizando el multi-elemento 'descripción de fecha-hora'."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo de fecha-hora"}
                {:rdf/language "en",
                 :rdf/value    "Date-time interval"}],
   :rdfs/subClassOf :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription."}
    {:rdf/language "es",
     :rdf/value
     "'intervalo de fecha-hora' es una subclase de 'intervalo propio', definida utilizando el multi-elemento 'descripción de fecha-hora'."}],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     ":DateTimeInterval can only be used for an interval whose limits coincide with a date-time element aligned to the calendar and timezone indicated. For example, while both have a duration of one day, the 24-hour interval beginning at midnight at the beginning of 8 May in Central Europe can be expressed as a :DateTimeInterval, but the 24-hour interval starting at 1:30pm cannot."}
    {:rdf/language "es",
     :rdf/value
     "'intervalo de fecha-hora' se puede utilizar sólo para un intervalo cuyos límites coinciden con un elemento de fecha-hora alineados con el calendario y la zona horaria indicados. Por ejemplo, aunque ambos tienen una duración de un día, el intervalo de 24 horas que empieza en la media noche del comienzo del 8 mayo en Europa Central se puede expresar como un 'intervalo de fecha-hora', el intervalo de 24 horas que empieza a las 1:30pm no."}]})

(def DayOfWeek
  "The day of week"
  {:rdf/about :time/DayOfWeek,
   :rdf/type :owl/Class,
   :rdfs/comment [{:rdf/language "en",
                   :rdf/value    "The day of week"}
                  {:rdf/language "es",
                   :rdf/value    "El día de la semana"}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "día de la semana"}
                {:rdf/language "en",
                 :rdf/value    "Day of week"}],
   :rdfs/subClassOf :owl/Thing,
   :skos/changeNote
   {:rdf/language "en",
    :rdf/value
    "Remove enumeration from definition, in order to allow other days to be used when required in other calendars. \nNOTE: existing days are still present as members of the class, but the class membership is now open. \n\nIn the original OWL-Time the following constraint appeared: \n  owl:oneOf (\n      time:Monday\n      time:Tuesday\n      time:Wednesday\n      time:Thursday\n      time:Friday\n      time:Saturday\n      time:Sunday\n    ) ;"},
   :skos/definition [{:rdf/language "en",
                      :rdf/value    "The day of week"}
                     {:rdf/language "es",
                      :rdf/value    "El día de la semana"}],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "Membership of the class :DayOfWeek is open, to allow for alternative week lengths and different day names."}
    {:rdf/language "es",
     :rdf/value
     "La pertenencia a la clase 'día de la semana' está abierta, para permitir longitudes de semana alternativas y diferentes nombres de días."}]})

(def Duration
  "Duration of a temporal extent expressed as a number scaled by a temporal unit"
  {:rdf/about :time/Duration,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Duration of a temporal extent expressed as a number scaled by a temporal unit"}
    {:rdf/language "es",
     :rdf/value
     "Duración de una extensión temporal expresada como un número escalado por una unidad temporal."}],
   :rdfs/label ["duración de tiempo"
                {:rdf/language "en",
                 :rdf/value    "Time duration"}],
   :rdfs/subClassOf [:time/TemporalDuration
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/numericDuration,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "Duration of a temporal extent expressed as a number scaled by a temporal unit"}
    {:rdf/language "es",
     :rdf/value
     "Duración de una extensión temporal expresada como un número escalado por una unidad temporal."}],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "Alternative to time:DurationDescription to support description of a temporal duration other than using a calendar/clock system."}
    {:rdf/language "es",
     :rdf/value
     "Alternativa a 'descripción de tiempo' para proporcionar descripción soporte a una duración temporal diferente a utilizar un sistema de calendario/reloj."}]})

(def DurationDescription
  "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal"
  {:rdf/about :time/DurationDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal"}
    {:rdf/language "es",
     :rdf/value
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario. El sistema de referencia temporal se fija al calendario gregoriano, y el intervalo de cada una de las propiedades numéricas se restringe a xsd:decimal."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "descripción de duración"}
                {:rdf/language "en",
                 :rdf/value    "Duration description"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/years,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/minutes,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/hours,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/weeks,
                      :rdf/type          :owl/Restriction}
                     :time/GeneralDurationDescription
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/days,
                      :rdf/type          :owl/Restriction}
                     {:owl/hasValue
                      "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian",
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/months,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/seconds,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal"}
    {:rdf/language "es",
     :rdf/value
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario. El sistema de referencia temporal se fija al calendario gregoriano, y el intervalo de cada una de las propiedades numéricas se restringe a xsd:decimal."}],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "In the Gregorian calendar the length of the month is not fixed. Therefore, a value like \"2.5 months\" cannot be exactly compared with a similar duration expressed in terms of weeks or days."}
    {:rdf/language "es",
     :rdf/value
     "En el calendario gregoriano la longitud de los meses no es fija. Por lo tanto, un valor como \"2,5 meses\" no se puede comparar exactamente con una duración similar expresada en términos de semanas o días."}]})

(def Friday
  {:rdf/about      :time/Friday,
   :rdf/type       :time/DayOfWeek,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Friday"},
   :skos/prefLabel [{:rdf/language "it",
                     :rdf/value    "Venerdì"}
                    {:rdf/language "fr",
                     :rdf/value    "Vendredi"}
                    {:rdf/language "es",
                     :rdf/value    "Viernes"}
                    {:rdf/language "en",
                     :rdf/value    "Friday"}
                    {:rdf/language "pl",
                     :rdf/value    "Piątek"}
                    {:rdf/language "nl",
                     :rdf/value    "Vrijdag"}
                    {:rdf/language "de",
                     :rdf/value    "Freitag"}
                    {:rdf/language "ja",
                     :rdf/value    "金曜日"}
                    {:rdf/language "ru",
                     :rdf/value    "Пятница"}
                    {:rdf/language "ar",
                     :rdf/value    "الجمعة"}
                    {:rdf/language "zh",
                     :rdf/value    "星期五"}
                    {:rdf/language "pt",
                     :rdf/value    "Sexta-feira"}]})

(def GeneralDateTimeDescription
  "Description of date and time structured with separate values for the various elements of a calendar-clock system"
  {:rdf/about :time/GeneralDateTimeDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Descripción de fecha y hora estructurada con valores separados para los distintos elementos de un sistema calendario-reloj."}
    {:rdf/language "en",
     :rdf/value
     "Description of date and time structured with separate values for the various elements of a calendar-clock system"}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "descripción de fecha-hora generalizada"}
                {:rdf/language "en",
                 :rdf/value    "Generalized date-time description"}],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   ["Descripción de fecha y hora estructurada con valores separados para los distintos elementos de un sistema calendario-reloj."
    {:rdf/language "en",
     :rdf/value
     "Description of date and time structured with separate values for the various elements of a calendar-clock system"}],
   :skos/note
   [{:rdf/language "es",
     :rdf/value
     "Algunas combinaciones de propiedades son redundantes - por ejemplo, dentro de un 'año' especificado si se proporciona 'día del año' entonces 'día' y 'mes' se pueden computar, y viceversa. Los valores individuales deberían ser consistentes entre ellos y con el calendario, indicado a través del valor de la propiedad 'tiene TRS'."}
    "Some combinations of properties are redundant - for example, within a specified :year if :dayOfYear is provided then :day and :month can be computed, and vice versa. Individual values should be consistent with each other and the calendar, indicated through the value of the :hasTRS property."]})

(def GeneralDurationDescription
  "Description of temporal extent structured with separate values for the various elements of a calendar-clock system."
  {:rdf/about :time/GeneralDurationDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario."}
    {:rdf/language "en",
     :rdf/value
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "descripción de duración generalizada"}
                {:rdf/language "en",
                 :rdf/value    "Generalized duration description"}],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :time/hours,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/years,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/weeks,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/days,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minutes,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalDuration
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/months,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/seconds,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system."}
    {:rdf/language "es",
     :rdf/value
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario."}],
   :skos/note
   [{:rdf/language "es",
     :rdf/value
     "La extensión de una duración de tiempo expresada como una 'descripción de duración general' depende del Sistema de Referencia Temporal. En algunos calendarios la longitud de la semana o del mes no es constante a lo largo del año. Por tanto, un valor como \"25 meses\" puede no ser necesariamente ser comparado con un duración similar expresada en términos de semanas o días. Cuando se consideran calendarios que no están basados en el movimiento de la Tierra, se deben tomar incluso más precauciones en la comparación de duraciones."}
    {:rdf/language "en",
     :rdf/value
     "The extent of a time duration expressed as a GeneralDurationDescription depends on the Temporal Reference System. In some calendars the length of the week or month is not constant within the year. Therefore, a value like \"2.5 months\" may not necessarily be exactly compared with a similar duration expressed in terms of weeks or days. When non-earth-based calendars are considered even more care must be taken in comparing durations."}]})

(def Instant
  "A temporal entity with zero extent or duration"
  {:rdf/about       :time/Instant,
   :rdf/type        :owl/Class,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value
                      "Una entidad temporal con una extensión o duración cero."}
                     {:rdf/language "en",
                      :rdf/value
                      "A temporal entity with zero extent or duration"}],
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "instante de tiempo."}
                     {:rdf/language "en",
                      :rdf/value    "Time instant"}],
   :rdfs/subClassOf :time/TemporalEntity,
   :skos/definition [{:rdf/language "es",
                      :rdf/value
                      "Una entidad temporal con una extensión o duración cero."}
                     {:rdf/language "en",
                      :rdf/value
                      "A temporal entity with zero extent or duration"}]})

(def Interval
  "A temporal entity with an extent or duration"
  {:rdf/about       :time/Interval,
   :rdf/type        :owl/Class,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value
                      "Una entidad temporal con una extensión o duración."}
                     {:rdf/language "en",
                      :rdf/value
                      "A temporal entity with an extent or duration"}],
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "intervalo de tiempo"}
                     {:rdf/language "en",
                      :rdf/value    "Time interval"}],
   :rdfs/subClassOf :time/TemporalEntity,
   :skos/definition [{:rdf/language "es",
                      :rdf/value
                      "Una entidad temporal con una extensión o duración."}
                     {:rdf/language "en",
                      :rdf/value
                      "A temporal entity with an extent or duration"}]})

(def January
  {:owl/deprecated true,
   :rdf/about :time/January,
   :rdf/type [:owl/DeprecatedClass :owl/Class],
   :rdfs/label "January",
   :rdfs/subClassOf [{:owl/hasValue   "--01",
                      :owl/onProperty :time/month,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   :time/unitMonth,
                      :owl/onProperty :time/unitType,
                      :rdf/type       :owl/Restriction}
                     :time/DateTimeDescription],
   :skos/historyNote
   "This class was present in the 2006 version of OWL-Time. It was presented as an example of how DateTimeDescription could be specialized, but does not belong in the revised ontology. "})

(def Monday
  {:rdf/about      :time/Monday,
   :rdf/type       :time/DayOfWeek,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Monday"},
   :skos/prefLabel [{:rdf/language "en",
                     :rdf/value    "Monday"}
                    {:rdf/language "es",
                     :rdf/value    "Lunes"}
                    {:rdf/language "fr",
                     :rdf/value    "Lundi"}
                    {:rdf/language "de",
                     :rdf/value    "Montag"}
                    {:rdf/language "ar",
                     :rdf/value    "الاثنين"}
                    {:rdf/language "ja",
                     :rdf/value    "月曜日"}
                    {:rdf/language "it",
                     :rdf/value    "Lunedì"}
                    {:rdf/language "ru",
                     :rdf/value    "Понедельник"}
                    {:rdf/language "nl",
                     :rdf/value    "Maandag"}
                    {:rdf/language "pl",
                     :rdf/value    "Poniedziałek"}
                    {:rdf/language "zh",
                     :rdf/value    "星期一"}
                    {:rdf/language "pt",
                     :rdf/value    "Segunda-feira"}]})

(def MonthOfYear
  "The month of the year"
  {:rdf/about :time/MonthOfYear,
   :rdf/type :owl/Class,
   :rdfs/comment [{:rdf/language "es",
                   :rdf/value    "El mes del año."}
                  {:rdf/language "en",
                   :rdf/value    "The month of the year"}],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Month of year"}
                {:rdf/language "es",
                 :rdf/value    "mes del año"}],
   :rdfs/subClassOf [{:owl/cardinality 0,
                      :owl/onProperty  :time/minute,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/week,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/hour,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/day,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/year,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/month,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue   :time/unitMonth,
                      :owl/onProperty :time/unitType,
                      :rdf/type       :owl/Restriction}
                     :time/DateTimeDescription
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/second,
                      :rdf/type        :owl/Restriction}],
   :skos/definition [{:rdf/language "en",
                      :rdf/value    "The month of the year"}
                     {:rdf/language "es",
                      :rdf/value    "El mes del año."}],
   :skos/editorialNote
   [{:rdf/language "es",
     :rdf/value
     "Característica en riesgo - añadida en la revisión de 2017, y no utilizada todavía de forma amplia."}
    {:rdf/language "en",
     :rdf/value
     "Feature at risk - added in 2017 revision, and not yet widely used. "}],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "Membership of the class :MonthOfYear is open, to allow for alternative annual calendars and different month names."}
    {:rdf/language "es",
     :rdf/value
     "La pertenencia a la clase 'mes del año' está abierta, a permitir calendarios anuales alternativos y diferentes nombres de meses."}]})

(def ProperInterval
  "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different"
  {:owl/disjointWith :time/Instant,
   :rdf/about :time/ProperInterval,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Una entidad temporal con extensión o duración distinta de cero, es decir, para la cual los valores de principio y fin del intervalo son diferentes."}
    {:rdf/language "en",
     :rdf/value
     "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different"}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo propio"}
                {:rdf/language "en",
                 :rdf/value    "Proper interval"}],
   :rdfs/subClassOf :time/Interval,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Una entidad temporal con extensión o duración distinta de cero, es decir, para la cual los valores de principio y fin del intervalo son diferentes."}
    {:rdf/language "en",
     :rdf/value
     "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different"}]})

(def Saturday
  {:rdf/about      :time/Saturday,
   :rdf/type       :time/DayOfWeek,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Saturday"},
   :skos/prefLabel [{:rdf/language "ar",
                     :rdf/value    "السبت"}
                    {:rdf/language "ja",
                     :rdf/value    "土曜日"}
                    {:rdf/language "it",
                     :rdf/value    "Sabato"}
                    {:rdf/language "pt",
                     :rdf/value    "Sábado"}
                    {:rdf/language "es",
                     :rdf/value    "Sábado"}
                    {:rdf/language "nl",
                     :rdf/value    "Zaterdag"}
                    {:rdf/language "ru",
                     :rdf/value    "Суббота"}
                    {:rdf/language "pl",
                     :rdf/value    "Sobota"}
                    {:rdf/language "zh",
                     :rdf/value    "星期六"}
                    {:rdf/language "fr",
                     :rdf/value    "Samedi"}
                    {:rdf/language "en",
                     :rdf/value    "Saturday"}
                    {:rdf/language "de",
                     :rdf/value    "Samstag"}]})

(def Sunday
  {:rdf/about      :time/Sunday,
   :rdf/type       :time/DayOfWeek,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Sunday"},
   :skos/prefLabel [{:rdf/language "nl",
                     :rdf/value    "Zondag"}
                    {:rdf/language "en",
                     :rdf/value    "Sunday"}
                    {:rdf/language "ru",
                     :rdf/value    "Воскресенье"}
                    {:rdf/language "de",
                     :rdf/value    "Sonntag"}
                    {:rdf/language "pt",
                     :rdf/value    "Domingo"}
                    {:rdf/language "es",
                     :rdf/value    "Domingo"}
                    {:rdf/language "ar",
                     :rdf/value    "الأحد (يوم)"}
                    {:rdf/language "pl",
                     :rdf/value    "Niedziela"}
                    {:rdf/language "fr",
                     :rdf/value    "Dimanche"}
                    {:rdf/language "ja",
                     :rdf/value    "日曜日"}
                    {:rdf/language "it",
                     :rdf/value    "Domenica"}
                    {:rdf/language "zh",
                     :rdf/value    "星期日"}]})

(def TRS
  "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system.   This is a stub class, representing the set of all temporal reference systems."
  {:rdf/about :time/TRS,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Un sistema de referencia temporal, tal como un sistema de coordenadas temporales (con un origen, una dirección y una escala), una combinación calendario-reloj, o un sistema ordinal (posiblemente jerárquico).\n        Esta clase comodín representa el conjunto de todos los sistemas de referencia temporal."}
    {:rdf/language "en",
     :rdf/value
     "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. \n\nThis is a stub class, representing the set of all temporal reference systems."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "sistema de referencia temporal"}
                {:rdf/language "en",
                 :rdf/value    "Temporal Reference System"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Un sistema de referencia temporal, tal como un sistema de coordenadas temporales (con un origen, una dirección y una escala), una combinación calendario-reloj, o un sistema ordinal (posiblemente jerárquico).\n    Esta clase comodín representa el conjunto de todos los sistemas de referencia temporal."}
    {:rdf/language "en",
     :rdf/value
     "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. \n\nThis is a stub class, representing the set of all temporal reference systems."}],
   :skos/note
   [{:rdf/language "es",
     :rdf/value
     "En el ISO 19108:2002 [ISO19108] se proporciona una taxonomía de sistemas de referencia temporal, incluyendo (a) sistemas de calendario + reloj; (b) sistemas de coordenadas temporales (es decir, desplazamiento numérico a partir de una época); (c) sistemas de referencia ordinales temporales (es decir, secuencia ordenada de intervalos nombrados, no necesariamente de igual duración)."}
    {:rdf/language "en",
     :rdf/value
     "A taxonomy of temporal reference systems is provided in ISO 19108:2002 [ISO19108], including (a) calendar + clock systems; (b) temporal coordinate systems (i.e. numeric offset from an epoch); (c) temporal ordinal reference systems (i.e. ordered sequence of named intervals, not necessarily of equal duration)."}]})

(def TemporalDuration
  "Time extent; duration of a time interval separate from its particular start position"
  {:rdf/about :time/TemporalDuration,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Extensión de tiempo; duración de un intervalo de tiempo independiente de su posición de inicio particular."}
    {:rdf/language "en",
     :rdf/value
     "Time extent; duration of a time interval separate from its particular start position"}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "duración temporal"}
                {:rdf/language "en",
                 :rdf/value    "Temporal duration"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Extensión de tiempo; duración de un intervalo de tiempo independiente de su posición de inicio particular."}
    {:rdf/language "en",
     :rdf/value
     "Time extent; duration of a time interval separate from its particular start position"}]})

(def TemporalEntity
  "A temporal interval or instant."
  {:owl/unionOf     [:time/Instant :time/Interval],
   :rdf/about       :time/TemporalEntity,
   :rdf/type        :owl/Class,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value    "Un intervalo temporal o un instante."}
                     {:rdf/language "en",
                      :rdf/value    "A temporal interval or instant."}],
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "entidad temporal"}
                     {:rdf/language "en",
                      :rdf/value    "Temporal entity"}],
   :rdfs/subClassOf :owl/Thing,
   :skos/definition [{:rdf/language "es",
                      :rdf/value    "Un intervalo temporal o un instante."}
                     {:rdf/language "en",
                      :rdf/value    "A temporal interval or instant."}]})

(def TemporalPosition
  "A position on a time-line"
  {:rdf/about       :time/TemporalPosition,
   :rdf/type        :owl/Class,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value    "Una posición sobre una línea de tiempo."}
                     {:rdf/language "en",
                      :rdf/value    "A position on a time-line"}],
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "posición temporal"}
                     {:rdf/language "en",
                      :rdf/value    "Temporal position"}],
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction},
   :skos/definition [{:rdf/language "es",
                      :rdf/value    "Una posición sobre una línea de tiempo."}
                     {:rdf/language "en",
                      :rdf/value    "A position on a time-line"}]})

(def TemporalUnit
  "A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position."
  {:rdf/about :time/TemporalUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position."}
    {:rdf/language "es",
     :rdf/value
     "Una duración estándar, que proporciona un factor de escala para una extensión de tiempo, o la granularidad o precisión para una posición de tiempo."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "unidad de tiempo"}
                {:rdf/language "en",
                 :rdf/value    "Temporal unit"}],
   :rdfs/subClassOf :time/TemporalDuration,
   :skos/changeNote
   {:rdf/language "en",
    :rdf/value
    "Remove enumeration from definition, in order to allow other units to be used when required in other coordinate systems. \nNOTE: existing units are still present as members of the class, but the class membership is now open. \n\nIn the original OWL-Time the following constraint appeared: \n  owl:oneOf (\n      time:unitSecond\n      time:unitMinute\n      time:unitHour\n      time:unitDay\n      time:unitWeek\n      time:unitMonth\n      time:unitYear\n    ) ;"},
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Una duración estándar, que proporciona un factor de escala para una extensión de tiempo, o la granularidad o precisión para una posición de tiempo."}
    {:rdf/language "en",
     :rdf/value
     "A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position."}],
   :skos/note
   [{:rdf/language "es",
     :rdf/value
     "La pertenencia de la clase 'unidad de tiempo' está abierta, para permitir otras unidades de tiempo utilizadas en algunas aplicaciones técnicas (por ejemplo, millones de años o el mes Baha'i)."}
    {:rdf/language "en",
     :rdf/value
     "Membership of the class TemporalUnit is open, to allow for other temporal units used in some technical applications (e.g. millions of years, Baha'i month)."}]})

(def Thursday
  {:rdf/about      :time/Thursday,
   :rdf/type       :time/DayOfWeek,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Thursday"},
   :skos/prefLabel [{:rdf/language "ru",
                     :rdf/value    "Четверг"}
                    {:rdf/language "ar",
                     :rdf/value    "الخميس"}
                    {:rdf/language "de",
                     :rdf/value    "Donnerstag"}
                    {:rdf/language "pl",
                     :rdf/value    "Czwartek"}
                    {:rdf/language "nl",
                     :rdf/value    "Donderdag"}
                    {:rdf/language "fr",
                     :rdf/value    "Jeudi"}
                    {:rdf/language "pt",
                     :rdf/value    "Quinta-feira"}
                    {:rdf/language "es",
                     :rdf/value    "Jueves"}
                    {:rdf/language "zh",
                     :rdf/value    "星期四"}
                    {:rdf/language "ja",
                     :rdf/value    "木曜日"}
                    {:rdf/language "en",
                     :rdf/value    "Thursday"}
                    {:rdf/language "it",
                     :rdf/value    "Giovedì"}]})

(def TimePosition
  "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system."
  {:rdf/about :time/TimePosition,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Una posición temporal descrita utilizando bien un valor (nominal) de un sistema de referencia ordinal, o un valor (numérico) en un sistema de coordenadas temporales."}
    {:rdf/language "en",
     :rdf/value
     "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system. "}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "posición de tiempo"}
                {:rdf/language "en",
                 :rdf/value    "Time position"}],
   :rdfs/subClassOf [{:owl/unionOf [{:owl/cardinality 1,
                                     :owl/onProperty  :time/numericPosition,
                                     :rdf/type        :owl/Restriction}
                                    {:owl/cardinality 1,
                                     :owl/onProperty  :time/nominalPosition,
                                     :rdf/type        :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     :time/TemporalPosition],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Una posición temporal descrita utilizando bien un valor (nominal) de un sistema de referencia ordinal, o un valor (numérico) en un sistema de coordenadas temporales."}
    {:rdf/language "en",
     :rdf/value
     "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system. "}]})

(def TimeZone
  "A Time Zone specifies the amount by which the local time is offset from UTC.   A time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region.  The region where it applies and the offset from UTC are specified by a locally recognised governing authority."
  {:rdf/about :time/TimeZone,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Un huso horario especifica la cantidad en que la hora local está desplazada con respecto a UTC.\n        Un huso horario normalmente se denota geográficamente (p.ej. el horario de verano del este de Australia), con un valor constante en una región dada.\n        La región donde aplica y el desplazamiento desde UTC las especifica una autoridad gubernamental localmente reconocida."}
    {:rdf/language "en",
     :rdf/value
     "A Time Zone specifies the amount by which the local time is offset from UTC. \n\tA time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. \nThe region where it applies and the offset from UTC are specified by a locally recognised governing authority."}],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Time Zone"}
                {:rdf/language "es",
                 :rdf/value    "huso horario"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Un huso horario especifica la cantidad en que la hora local está desplazada con respecto a UTC.\n    Un huso horario normalmente se denota geográficamente (p.ej. el horario de verano del este de Australia), con un valor constante en una región dada.\n    La región donde aplica y el desplazamiento desde UTC las especifica una autoridad gubernamental localmente reconocida."}
    {:rdf/language "en",
     :rdf/value
     "A Time Zone specifies the amount by which the local time is offset from UTC. \n\tA time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. \nThe region where it applies and the offset from UTC are specified by a locally recognised governing authority."}],
   :skos/historyNote
   [{:rdf/language "es",
     :rdf/value
     "En la versión original de OWL-Time de 2006, se definió, en un espacio de nombres diferente \"http://www.w3.org/2006/timezone#\", la clase 'huso horario', con varias propiedades específicas correspondientes a un modelo específico de huso horario.\n    En la versión actual hay una clase con el mismo nombre local en el espacio de nombres de OWL-Time, eliminando la dependencia del espacio de nombres externo.\n    Un axioma de alineación permite que los datos codificados de acuerdo con la versión anterior sean consistentes con la ontología actualizada."}
    "In the original 2006 version of OWL-Time, the TimeZone class, with several properties corresponding to a specific model of time-zones, was defined in a separate namespace \"http://www.w3.org/2006/timezone#\". \n\nIn the current version a class with same local name is put into the main OWL-Time namespace, removing the dependency on the external namespace. \n\nAn alignment axiom \n\ttzont:TimeZone rdfs:subClassOf time:TimeZone . \nallows data encoded according to the previous version to be consistent with the updated ontology. "],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "A designated timezone is associated with a geographic region. However, for a particular region the offset from UTC often varies seasonally, and the dates of the changes may vary from year to year. The timezone designation usually changes for the different seasons (e.g. Australian Eastern Standard Time vs. Australian Eastern Daylight Time). Furthermore, the offset for a timezone may change over longer timescales, though its designation might not.  \n\nDetailed guidance about working with time zones is given in http://www.w3.org/TR/timezone/ ."}
    {:rdf/language "en",
     :rdf/value
     "An ontology for time zone descriptions was described in [owl-time-20060927] and provided as RDF in a separate namespace tzont:. However, that ontology was incomplete in scope, and the example datasets were selective. Furthermore, since the use of a class from an external ontology as the range of an ObjectProperty in OWL-Time creates a dependency, reference to the time zone class has been replaced with the 'stub' class in the normative part of this version of OWL-Time."}
    {:rdf/language "es",
     :rdf/value
     "Un huso horario designado está asociado con una región geográfica. Sin embargo, para una región particular el desplazamiento desde UTC a menudo varía según las estaciones, y las fechas de los cambios pueden variar de un año a otro. La designación de huso horario  normalmente cambia de una estación a otra (por ejemplo, el horario estándar frente al horario de verano ambos del este de Australia). Además, del desplazamiento para un huso horario puede cambiar sobre escalas de tiempo mayores, aunque su designación no lo haga.\n    Se puede encontrar una guía detallada sobre el funcionamiento de husos horarios en http://www.w3.org/TR/timezone/.\"@es , \"En [owl-time-20060927] se describió una ontología para descripciones de husos horarios, y se proporcionó en un espacio de nombres separado tzont:. Sin embargo, dicha ontología estaba incompleta en su alcance, y el ejemplo de conjuntos de datos (datasets) era selectivo. Además, puesto que el uso de una clase de una ontología externa como el rango de una propiedad de objeto en OWL-Time crea una dependencia, la referencia a la clase huso horario se ha reemplazado por una clase que viene a ser un \"cajón de sastre\" en la en la parte normativa de esta versión de OWL-Time."}],
   :skos/scopeNote
   [{:rdf/language "es",
     :rdf/value
     "En esta implementación 'huso horario' no tiene definidas propiedades. Se debería pensar como una superclase \"abstracta\" de todas las implementaciones de huso horario específicas."}
    "In this implementation TimeZone has no properties defined. It should be thought of as an 'abstract' superclass of all specific timezone implementations."]})

(def Tuesday
  {:rdf/about      :time/Tuesday,
   :rdf/type       :time/DayOfWeek,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Tuesday"},
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Dienstag"}
                    {:rdf/language "pt",
                     :rdf/value    "Terça-feira"}
                    {:rdf/language "ar",
                     :rdf/value    "الثلاثاء"}
                    {:rdf/language "fr",
                     :rdf/value    "Mardi"}
                    {:rdf/language "ru",
                     :rdf/value    "Вторник"}
                    {:rdf/language "nl",
                     :rdf/value    "Dinsdag"}
                    {:rdf/language "ja",
                     :rdf/value    "火曜日"}
                    {:rdf/language "pl",
                     :rdf/value    "Wtorek"}
                    {:rdf/language "en",
                     :rdf/value    "Tuesday"}
                    {:rdf/language "es",
                     :rdf/value    "Martes"}
                    {:rdf/language "zh",
                     :rdf/value    "星期二"}
                    {:rdf/language "it",
                     :rdf/value    "Martedì"}]})

(def Wednesday
  {:rdf/about      :time/Wednesday,
   :rdf/type       :time/DayOfWeek,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Wednesday"},
   :skos/prefLabel [{:rdf/language "it",
                     :rdf/value    "Mercoledì"}
                    {:rdf/language "ru",
                     :rdf/value    "Среда"}
                    {:rdf/language "nl",
                     :rdf/value    "Woensdag"}
                    {:rdf/language "fr",
                     :rdf/value    "Mercredi"}
                    {:rdf/language "ja",
                     :rdf/value    "水曜日"}
                    {:rdf/language "pt",
                     :rdf/value    "Quarta-feira"}
                    {:rdf/language "pl",
                     :rdf/value    "Środa"}
                    {:rdf/language "zh",
                     :rdf/value    "星期三"}
                    {:rdf/language "ar",
                     :rdf/value    "الأربعاء"}
                    {:rdf/language "de",
                     :rdf/value    "Mittwoch"}
                    {:rdf/language "es",
                     :rdf/value    "Miércoles"}
                    {:rdf/language "en",
                     :rdf/value    "Wednesday"}]})

(def Year
  "Year duration"
  {:owl/deprecated true,
   :rdf/about :time/Year,
   :rdf/type [:owl/DeprecatedClass :owl/Class],
   :rdfs/comment "Year duration",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Year"},
   :rdfs/subClassOf [{:owl/cardinality 0,
                      :owl/onProperty  :time/minutes,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/weeks,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/years,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/hours,
                      :rdf/type        :owl/Restriction}
                     :time/DurationDescription
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/days,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/seconds,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/months,
                      :rdf/type        :owl/Restriction}],
   :skos/definition "Year duration",
   :skos/historyNote
   "Year was proposed in the 2006 version of OWL-Time as an example of how DurationDescription could be specialized to allow for a duration to be restricted to a number of years. \n\nIt is deprecated in this edition of OWL-Time. ",
   :skos/prefLabel [{:rdf/language "pt",
                     :rdf/value    "Ano"}
                    {:rdf/language "it",
                     :rdf/value    "Anno"}
                    {:rdf/language "ar",
                     :rdf/value    "سنة"}
                    {:rdf/language "pl",
                     :rdf/value    "Rok"}
                    {:rdf/language "nl",
                     :rdf/value    "Jaar"}
                    {:rdf/language "es",
                     :rdf/value    "Año"}
                    {:rdf/language "de",
                     :rdf/value    "Jahr"}
                    {:rdf/language "fr",
                     :rdf/value    "Année (calendrier)"}
                    {:rdf/language "en",
                     :rdf/value    "Year"}
                    {:rdf/language "ru",
                     :rdf/value    "Год"}
                    {:rdf/language "zh",
                     :rdf/value    "年"}
                    {:rdf/language "ja",
                     :rdf/value    "年"}]})

(def after
  "Gives directionality to time. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2."
  {:owl/inverseOf :time/before,
   :rdf/about :time/after,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2."}
    {:rdf/language "en",
     :rdf/value
     "The subject is a temporal entity that occurs after the object. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2."}],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "después"}
                {:rdf/language "en",
                 :rdf/value    "is after"}],
   :rdfs/range :time/TemporalEntity,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2."}
    {:rdf/language "en",
     :rdf/value
     "Gives directionality to time. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2."}]})

(def before
  "Gives directionality to time. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals."
  {:owl/inverseOf :time/after,
   :rdf/about :time/before,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The subject is a temporal entity that occurs before the object. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals."}
    {:rdf/language "es",
     :rdf/value
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está antes que otra entidad temporal T2, entonces el final de T1 está antes que el principio de T2. Así, \"antes\" se puede considerar básica para instantes y derivada para intervalos."}],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "antes"}
                {:rdf/language "en",
                 :rdf/value    "is before"}],
   :rdfs/range :time/TemporalEntity,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "Gives directionality to time. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals."}
    {:rdf/language "es",
     :rdf/value
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está antes que otra entidad temporal T2, entonces el final de T1 está antes que el principio de T2. Así, \"antes\" se puede considerar básica para instantes y derivada para intervalos."}]})

(def day
  "Day position in a calendar-clock system.  The range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar."
  {:rdf/about :time/day,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value    "Posición de día en un sistema calendario-reloj."}
    {:rdf/language "en",
     :rdf/value
     "Day position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar. "}],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "día"}
                {:rdf/language "en",
                 :rdf/value    "day"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Posición de día en un sistema calendario-reloj.\n\nEl rango de esta propiedad no está especificado, por tanto, se puede reemplazar por una representación específica de un día de calendario de cualquier calendario."}
    {:rdf/language "en",
     :rdf/value
     "Day position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar. "}]})

(def dayOfWeek
  "The day of week, whose value is a member of the class time:DayOfWeek"
  {:rdf/about :time/dayOfWeek,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'."
    {:rdf/language "en",
     :rdf/value
     "The day of week, whose value is a member of the class time:DayOfWeek"}],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "día de la semana"}
                {:rdf/language "en",
                 :rdf/value    "day of week"}],
   :rdfs/range :time/DayOfWeek,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'."}
    {:rdf/language "en",
     :rdf/value
     "The day of week, whose value is a member of the class time:DayOfWeek"}]})

(def dayOfYear
  "The number of the day within the year"
  {:rdf/about       :time/dayOfYear,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value    "El número de día en el año."}
                     {:rdf/language "en",
                      :rdf/value    "The number of the day within the year"}],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "día del año"}
                     {:rdf/language "en",
                      :rdf/value    "day of year"}],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition [{:rdf/language "es",
                      :rdf/value    "El número de día en el año."}
                     {:rdf/language "en",
                      :rdf/value    "The number of the day within the year"}]})

(def days
  "length of, or element of the length of, a temporal extent expressed in days"
  {:rdf/about :time/days,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en días."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in days"}],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "duración en días"}
                {:rdf/language "en",
                 :rdf/value    "days duration"}],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en días."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in days"}]})

(def generalDay
  "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month.  Note that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "---(0[1-9]|[1-9][0-9])(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/about :time/generalDay,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Día del mes - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gDay, excepto que se permiten valores hasta el 99, con el propósito de proporcionar soporte a calendarios con meses con más de 31 días.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."}
    {:rdf/language "en",
     :rdf/value
     "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Día generalizado"}
                {:rdf/language "en",
                 :rdf/value    "Generalized day"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Día del mes - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gDay, excepto que se permiten valores hasta el 99, con el propósito de proporcionar soporte a calendarios con meses con más de 31 días.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."}
    {:rdf/language "en",
     :rdf/value
     "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."}]})

(def generalMonth
  "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year.  Note that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "--(0[1-9]|1[0-9]|20)(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/about :time/generalMonth,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Mes del año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gMonth, excepto que se permiten valores hasta el 20, con el propósito de proporcionar soporte a calendarios con años con más de 12 meses.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."}
    {:rdf/language "en",
     :rdf/value
     "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Mes generalizado"}
                {:rdf/language "en",
                 :rdf/value    "Generalized month"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Mes del año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gMonth, excepto que se permiten valores hasta el 20, con el propósito de proporcionar soporte a calendarios con años con más de 12 meses.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."}
    {:rdf/language "en",
     :rdf/value
     "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."}]})

(def generalYear
  "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar.  Note that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?([1-9][0-9]{3,}|0[0-9]{3})(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/about :time/generalYear,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Número de año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gYear, aunque no está restringido a valores del calendario gregoriano.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."}
    {:rdf/language "en",
     :rdf/value
     "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Año generalizado"}
                {:rdf/language "en",
                 :rdf/value    "Generalized year"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Número de año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gYear, aunque no está restringido a valores del calendario gregoriano.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."}
    {:rdf/language "en",
     :rdf/value
     "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."}]})

(def hasBeginning
  "Beginning of a temporal entity."
  {:rdf/about          :time/hasBeginning,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       [{:rdf/language "en",
                         :rdf/value    "Beginning of a temporal entity"}
                        {:rdf/language "es",
                         :rdf/value    "Comienzo de una entidad temporal."}],
   :rdfs/domain        :time/TemporalEntity,
   :rdfs/label         [{:rdf/language "en",
                         :rdf/value    "has beginning"}
                        {:rdf/language "es",
                         :rdf/value    "tiene principio"}],
   :rdfs/range         :time/Instant,
   :rdfs/subPropertyOf :time/hasTime,
   :skos/definition    [{:rdf/language "en",
                         :rdf/value    "Beginning of a temporal entity."}
                        {:rdf/language "es",
                         :rdf/value    "Comienzo de una entidad temporal."}]})

(def hasDateTimeDescription
  "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description."
  {:rdf/about :time/hasDateTimeDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Valor de intervalo de fecha-hora expresado como un valor estructurado. El principio y el final del intervalo coincide con los límites del elemento más corto en la descripción."}
    {:rdf/language "en",
     :rdf/value
     "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description."}],
   :rdfs/domain :time/DateTimeInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "tiene descripción fecha-hora"}
                {:rdf/language "en",
                 :rdf/value    "has Date-Time description"}],
   :rdfs/range :time/GeneralDateTimeDescription,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Valor de intervalo de fecha-hora expresado como un valor estructurado. El principio y el final del intervalo coincide con los límites del elemento más corto en la descripción."}
    {:rdf/language "en",
     :rdf/value
     "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description."}]})

(def hasDuration
  "Duration of a temporal entity, event or activity, or thing, expressed as a scaled value"
  {:rdf/about :time/hasDuration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Duración de una entidad temporal, expresada como un valor escalado o un valor nominal."}
    {:rdf/language "en",
     :rdf/value
     "Duration of a temporal entity, expressed as a scaled value or nominal value"}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "tiene duración"}
                {:rdf/language "en",
                 :rdf/value    "has duration"}],
   :rdfs/range :time/Duration,
   :rdfs/subPropertyOf :time/hasTemporalDuration,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Duración de una entidad temporal, evento o actividad, o cosa, expresada como un valor escalado."}
    {:rdf/language "en",
     :rdf/value
     "Duration of a temporal entity, event or activity, or thing, expressed as a scaled value"}]})

(def hasDurationDescription
  "Duration of a temporal entity, expressed using a structured description"
  {:rdf/about :time/hasDurationDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Duración de una entidad temporal, expresada utilizando una descripción estructurada."}
    {:rdf/language "en",
     :rdf/value
     "Duration of a temporal entity, expressed using a structured description"}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "tiene descripción de duración"}
                {:rdf/language "en",
                 :rdf/value    "has duration description"}],
   :rdfs/range :time/GeneralDurationDescription,
   :rdfs/subPropertyOf :time/hasTemporalDuration,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Duración de una entidad temporal, expresada utilizando una descripción estructurada."}
    {:rdf/language "en",
     :rdf/value
     "Duration of a temporal entity, expressed using a structured description"}]})

(def hasEnd
  "End of a temporal entity."
  {:rdf/about          :time/hasEnd,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       [{:rdf/language "en",
                         :rdf/value    "End of a temporal entity."}
                        {:rdf/language "es",
                         :rdf/value    "Final de una entidad temporal."}],
   :rdfs/domain        :time/TemporalEntity,
   :rdfs/label         [{:rdf/language "es",
                         :rdf/value    "tiene fin"}
                        {:rdf/language "en",
                         :rdf/value    "has end"}],
   :rdfs/range         :time/Instant,
   :rdfs/subPropertyOf :time/hasTime,
   :skos/definition    [{:rdf/language "es",
                         :rdf/value    "Final de una entidad temporal."}
                        {:rdf/language "en",
                         :rdf/value    "End of a temporal entity."}]})

(def hasTRS
  "The temporal reference system used by a temporal position or extent description."
  {:rdf/about :time/hasTRS,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "El sistema de referencia temporal utilizado por una posición temporal o descripción de extensión."}
    {:rdf/language "en",
     :rdf/value
     "The temporal reference system used by a temporal position or extent description. "}],
   :rdfs/domain {:owl/unionOf [:time/TemporalPosition
                               :time/GeneralDurationDescription],
                 :rdf/type    :owl/Class},
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "sistema de referencia temporal utilizado"}
                {:rdf/language "en",
                 :rdf/value    "Temporal reference system used"}],
   :rdfs/range :time/TRS,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "The temporal reference system used by a temporal position or extent description. "}
    {:rdf/language "es",
     :rdf/value
     "El sistema de referencia temporal utilizado por una posición temporal o descripción de extensión."}]})

(def hasTemporalDuration
  "Duration of a temporal entity."
  {:rdf/about       :time/hasTemporalDuration,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value    "Duración de una entidad temporal."}
                     {:rdf/language "en",
                      :rdf/value    "Duration of a temporal entity."}],
   :rdfs/domain     :time/TemporalEntity,
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "tiene duración temporal"}
                     {:rdf/language "en",
                      :rdf/value    "has temporal duration"}],
   :rdfs/range      :time/TemporalDuration,
   :skos/definition [{:rdf/language "es",
                      :rdf/value    "Duración de una entidad temporal."}
                     {:rdf/language "en",
                      :rdf/value    "Duration of a temporal entity."}]})

(def hasTime
  "Supports the association of a temporal entity (instant or interval) to any thing"
  {:rdf/about :time/hasTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Proporciona soporte a la asociación de una entidad temporal (instante o intervalo) a cualquier cosa."}
    {:rdf/language "en",
     :rdf/value
     "Supports the association of a temporal entity (instant or interval) to any thing"}],
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "tiene tiempo"}
                {:rdf/language "en",
                 :rdf/value    "has time"}],
   :rdfs/range :time/TemporalEntity,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Proporciona soporte a la asociación de una entidad temporal (instante o intervalo) a cualquier cosa."}
    {:rdf/language "en",
     :rdf/value
     "Supports the association of a temporal entity (instant or interval) to any thing"}],
   :skos/editorialNote
   [{:rdf/language "en",
     :rdf/value
     "Feature at risk - added in 2017 revision, and not yet widely used. "}
    {:rdf/language "es",
     :rdf/value
     "Característica arriesgada -añadida en la revisión del 2017 que no ha sido todavía utilizada de forma amplia."}]})

(def hasXSDDuration
  "Extent of a temporal entity, expressed using xsd:duration"
  {:rdf/about :time/hasXSDDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Extensión de una entidad temporal, expresada utilizando xsd:duration."}
    {:rdf/language "en",
     :rdf/value "Extent of a temporal entity, expressed using xsd:duration"}],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has XSD duration"}
                {:rdf/language "es",
                 :rdf/value    "tiene duración XSD"}],
   :rdfs/range :xsd/duration,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Extensión de una entidad temporal, expresada utilizando xsd:duration."}
    {:rdf/language "en",
     :rdf/value "Extent of a temporal entity, expressed using xsd:duration"}],
   :skos/editorialNote
   [{:rdf/language "es",
     :rdf/value
     "Característica arriesgada - añadida en la revisión de 2017, y todavía no ampliamente utilizada."}
    {:rdf/language "en",
     :rdf/value
     "Feature at risk - added in 2017 revision, and not yet widely used. "}]})

(def hour
  "Hour position in a calendar-clock system."
  {:rdf/about       :time/hour,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value
                      "Posición de hora en un sistema calendario-reloj."}
                     {:rdf/language "en",
                      :rdf/value "Hour position in a calendar-clock system."}],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "hora"}
                     {:rdf/language "en",
                      :rdf/value    "hour"}],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition [{:rdf/language "es",
                      :rdf/value
                      "Posición de hora en un sistema calendario-reloj."}
                     {:rdf/language "en",
                      :rdf/value "Hour position in a calendar-clock system."}]})

(def hours
  "length of, or element of the length of, a temporal extent expressed in hours"
  {:rdf/about :time/hours,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en horas."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in hours"}],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "duración en horas"}
                {:rdf/language "en",
                 :rdf/value    "hours duration"}],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en horas."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in hours"}]})

(def inDateTime
  "Position of an instant, expressed using a structured description"
  {:rdf/about :time/inDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Position of an instant, expressed using a structured description"}
    {:rdf/language "es",
     :rdf/value
     "Posición de un instante, expresada utilizando una descripción estructurada."}],
   :rdfs/domain :time/Instant,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "in date-time description"}
                {:rdf/language "es",
                 :rdf/value    "en descripción de fecha-hora"}],
   :rdfs/range :time/GeneralDateTimeDescription,
   :rdfs/subPropertyOf :time/inTemporalPosition,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Posición de un instante, expresada utilizando una descripción estructurada."}
    {:rdf/language "en",
     :rdf/value
     "Position of an instant, expressed using a structured description"}]})

(def inTemporalPosition
  "Position of a time instant"
  {:rdf/about       :time/inTemporalPosition,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value    "Posición de un instante de tiempo."}
                     {:rdf/language "en",
                      :rdf/value    "Position of a time instant"}],
   :rdfs/domain     :time/Instant,
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "posición temporal"}
                     {:rdf/language "en",
                      :rdf/value    "Temporal position"}],
   :rdfs/range      :time/TemporalPosition,
   :skos/definition [{:rdf/language "es",
                      :rdf/value    "Posición de un instante de tiempo."}
                     {:rdf/language "en",
                      :rdf/value    "Position of a time instant"}]})

(def inTimePosition
  "Position of a time instant expressed as a TimePosition"
  {:rdf/about :time/inTimePosition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Posición de un instante, expresada como una coordenada temporal o un valor nominal."}
    {:rdf/language "en",
     :rdf/value
     "Position of an instant, expressed as a temporal coordinate or nominal value"}],
   :rdfs/domain :time/Instant,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "posición de tiempo"}
                {:rdf/language "en",
                 :rdf/value    "Time position"}],
   :rdfs/range :time/TimePosition,
   :rdfs/subPropertyOf :time/inTemporalPosition,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value    "Position of a time instant expressed as a TimePosition"}
    {:rdf/language "es",
     :rdf/value
     "Posición de un instante, expresada como una coordenada temporal o un valor nominal."}]})

(def inXSDDate
  "Position of an instant, expressed using xsd:date"
  {:rdf/about       :time/inXSDDate,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value
                      "Posición de un instante, expresado utilizando xsd:date."}
                     {:rdf/language "en",
                      :rdf/value
                      "Position of an instant, expressed using xsd:date"}],
   :rdfs/domain     :time/Instant,
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "en fecha XSD"}
                     {:rdf/language "en",
                      :rdf/value    "in XSD date"}],
   :rdfs/range      :xsd/date,
   :skos/definition [{:rdf/language "es",
                      :rdf/value
                      "Posición de un instante, expresado utilizando xsd:date."}
                     {:rdf/language "en",
                      :rdf/value
                      "Position of an instant, expressed using xsd:date"}]})

(def inXSDDateTime
  "Position of an instant, expressed using xsd:dateTime"
  {:owl/deprecated true,
   :rdf/about :time/inXSDDateTime,
   :rdf/type [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value "Posición de un instante, expresado utilizando xsd:dateTime."}
    {:rdf/language "en",
     :rdf/value    "Position of an instant, expressed using xsd:dateTime"}],
   :rdfs/domain :time/Instant,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "en fecha-tiempo XSD"}
                {:rdf/language "en",
                 :rdf/value    "in XSD Date-Time"}],
   :rdfs/range :xsd/dateTime,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value "Posición de un instante, expresado utilizando xsd:dateTime."}
    {:rdf/language "en",
     :rdf/value    "Position of an instant, expressed using xsd:dateTime"}],
   :skos/note
   [{:rdf/language "es",
     :rdf/value
     "La propiedad 'en fecha-hora XSD' ha sido reemplazada por 'en fecha-sello de tiempo XSD' que hace obligatorio el campo 'huso horario'."}
    {:rdf/language "en",
     :rdf/value
     "The property :inXSDDateTime is replaced by :inXSDDateTimeStamp which makes the time-zone field mandatory."}]})

(def inXSDDateTimeStamp
  "Position of an instant, expressed using xsd:dateTimeStamp"
  {:rdf/about :time/inXSDDateTimeStamp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Posición de un instante, expresado utilizando xsd:dateTimeStamp."}
    {:rdf/language "en",
     :rdf/value "Position of an instant, expressed using xsd:dateTimeStamp"}],
   :rdfs/domain :time/Instant,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "en fecha-sello de tiempo XSD"}
                {:rdf/language "en",
                 :rdf/value    "in XSD Date-Time-Stamp"}],
   :rdfs/range :xsd/dateTimeStamp,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Posición de un instante, expresado utilizando xsd:dateTimeStamp."}
    {:rdf/language "en",
     :rdf/value "Position of an instant, expressed using xsd:dateTimeStamp"}]})

(def inXSDgYear
  "Position of an instant, expressed using xsd:gYear"
  {:rdf/about :time/inXSDgYear,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value    "Posición de un instante, expresado utilizando xsd:gYear."}
    {:rdf/language "en",
     :rdf/value    "Position of an instant, expressed using xsd:gYear"}],
   :rdfs/domain :time/Instant,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "en año gregoriano XSD"}
                {:rdf/language "en",
                 :rdf/value    "in XSD g-Year"}],
   :rdfs/range :xsd/gYear,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value    "Posición de un instante, expresado utilizando xsd:gYear."}
    {:rdf/language "en",
     :rdf/value    "Position of an instant, expressed using xsd:gYear"}]})

(def inXSDgYearMonth
  "Position of an instant, expressed using xsd:gYearMonth"
  {:rdf/about :time/inXSDgYearMonth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value "Posición de un instante, expresado utilizando xsd:gYearMonth."}
    {:rdf/language "en",
     :rdf/value    "Position of an instant, expressed using xsd:gYearMonth"}],
   :rdfs/domain :time/Instant,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "en año-mes gregoriano XSD"}
                {:rdf/language "en",
                 :rdf/value    "in XSD g-YearMonth"}],
   :rdfs/range :xsd/gYearMonth,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value "Posición de un instante, expresado utilizando xsd:gYearMonth."}
    {:rdf/language "en",
     :rdf/value    "Position of an instant, expressed using xsd:gYearMonth"}]})

(def inside
  "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals."
  {:rdf/about :time/inside,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Un instante que cae dentro del intervalo. Se asume que no es ni el principio ni el final de ningún intervalo."}
    {:rdf/language "en",
     :rdf/value
     "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals."}],
   :rdfs/domain :time/Interval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "tiene instante de tiempo dentro"}
                {:rdf/language "en",
                 :rdf/value    "has time instant inside"}],
   :rdfs/range :time/Instant,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Un instante que cae dentro del intervalo. Se asume que no es ni el principio ni el final de ningún intervalo."}
    {:rdf/language "en",
     :rdf/value
     "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals."}]})

(def intervalAfter
  "If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2."
  {:owl/inverseOf :time/intervalBefore,
   :rdf/about :time/intervalAfter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2."}
    "Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "interval after"}
                {:rdf/language "es",
                 :rdf/value    "intervalo posterior"}],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/after :time/intervalDisjoint],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2."}]})

(def intervalBefore
  "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2."
  {:owl/inverseOf :time/intervalAfter,
   :rdf/about :time/intervalBefore,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 está antes que otro intervalo propio T2, entonces el final de T1 está antes que el principio de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "interval before"}
                {:rdf/language "es",
                 :rdf/value    "intervalo anterior"}],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/intervalDisjoint :time/before],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 está antes que otro intervalo propio T2, entonces el final de T1 está antes que el principio de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2."}]})

(def intervalContains
  "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2."
  {:owl/inverseOf :time/intervalDuring,
   :rdf/about :time/intervalContains,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 contiene otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 está después del final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo contiene"}
                {:rdf/language "en",
                 :rdf/value    "interval contains"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 contiene otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 está después del final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2."}]})

(def intervalDisjoint
  "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known."
  {:rdf/about :time/intervalDisjoint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es disjunto con otro intervalo propio T2, entonces el principio de T1 está después del final de T2, o el final de T1 está antes que el principio de T2, es decir, los intervalos no se solapan de ninguna forma, aunque su relación de orden no se conozca."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "interval disjoint"}
                {:rdf/language "es",
                 :rdf/value    "intervalo disjunto"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es disjunto con otro intervalo propio T2, entonces el principio de T1 está después del final de T2, o el final de T1 está antes que el principio de T2, es decir, los intervalos no se solapan de ninguna forma, aunque su relación de orden no se conozca."}],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "This interval relation is not included in the 13 basic relationships defined in Allen (1984), but is defined in (T.3) as the union of :intervalBefore v :intervalAfter . However, that is outside OWL2 expressivity, so is implemented as an explicit property, with :intervalBefore , :intervalAfter as sub-properties"}
    {:rdf/language "es",
     :rdf/value
     "Esta relación entre intervalos no estaba incluida en las 13 relaciones básicas definidas por Allen (1984), pero está definida en T.3 como la unión de 'intervalo anterior' con 'intervalo posterior'. Sin embargo, esto está fuera de la expresividad de OWL2, por tanto, está implementado como una propiedad explícita, con 'intervalo anterior' e 'intervalo posterior' como sub-propiedades."}]})

(def intervalDuring
  "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."
  {:owl/inverseOf :time/intervalContains,
   :rdf/about :time/intervalDuring,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 está durante otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 está antes que el final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo durante"}
                {:rdf/language "en",
                 :rdf/value    "interval during"}],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalIn,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 está durante otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 está antes que el final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."}]})

(def intervalEquals
  "If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2."
  {:owl/propertyDisjointWith :time/intervalIn,
   :rdf/about :time/intervalEquals,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es igual a otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 coincide con el final de T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo igual"}
                {:rdf/language "en",
                 :rdf/value    "interval equals"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es igual a otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 coincide con el final de T2."}]})

(def intervalFinishedBy
  "If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."
  {:owl/inverseOf :time/intervalFinishes,
   :rdf/about :time/intervalFinishedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 está terminado por otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 coincide con el final de T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo terminado por"}
                {:rdf/language "en",
                 :rdf/value    "interval finished by"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 está terminado por otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 coincide con el final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."}]})

(def intervalFinishes
  "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2."
  {:owl/inverseOf :time/intervalFinishedBy,
   :rdf/about :time/intervalFinishes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 termina otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 coincide con el final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo termina"}
                {:rdf/language "en",
                 :rdf/value    "interval finishes"}],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalIn,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 termina otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 coincide con el final de T2."}]})

(def intervalIn
  "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2."
  {:owl/propertyDisjointWith :time/intervalEquals,
   :rdf/about :time/intervalIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es un intervalo interior a otro intervalo propio T2, entonces el principio de T1 está después del principio de T2 o coincide con el principio de T2, y el final de T1 está antes que el final de T2, o coincide con el final de T2, excepto que el final de T1 puede no coincidir con el final de T2 si el principio de T1 coincide con el principio de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "interval in"}
                {:rdf/language "es",
                 :rdf/value    "intervalo interior"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es un intervalo interior a otro intervalo propio T2, entonces el principio de T1 está después del principio de T2 o coincide con el principio de T2, y el final de T1 está antes que el final de T2, o coincide con el final de T2, excepto que el final de T1 puede no coincidir con el final de T2 si el principio de T1 coincide con el principio de T2."}],
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "This interval relation is not included in the 13 basic relationships defined in Allen (1984), but is referred to as 'an important relationship' in Allen and Ferguson (1997). It is the disjoint union of :intervalStarts v :intervalDuring v :intervalFinishes . However, that is outside OWL2 expressivity, so is implemented as an explicit property, with :intervalStarts , :intervalDuring , :intervalFinishes as sub-properties"}
    {:rdf/language "es",
     :rdf/value
     "Esta relación entre intervalos no estaba incluida en las 13 relaciones básicas definidas por Allen (1984), pero se hace referencia a ella como \"una relación importante\" en Allen y Ferguson (1997). Es la unión disjunta de 'intervalo empieza', 'intervalo durante' y con 'intervalo termina'. Sin embargo, esto está fuera de la expresividad de OWL2, por tanto, se implementa como una propiedad explícita, con 'intervalo empieza', 'intervalo durante' e 'intervalo termina' como sub-propiedades."}]})

(def intervalMeets
  "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2."
  {:owl/inverseOf :time/intervalMetBy,
   :rdf/about :time/intervalMeets,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 se encuentra con otro intervalo propio T2, entonces el final de T1 coincide con el principio de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo se encuentra"}
                {:rdf/language "en",
                 :rdf/value    "interval meets"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 se encuentra con otro intervalo propio T2, entonces el final de T1 coincide con el principio de T2."}]})

(def intervalMetBy
  "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2."
  {:owl/inverseOf :time/intervalMeets,
   :rdf/about :time/intervalMetBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es 'intervalo encontrado por' otro intervalo propio T2, entonces el principio de T1 coincide con el final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo encontrado por"}
                {:rdf/language "en",
                 :rdf/value    "interval met by"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es 'intervalo encontrado por' otro intervalo propio T2, entonces el principio de T1 coincide con el final de T2."}]})

(def intervalOverlappedBy
  "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2."
  {:owl/inverseOf :time/intervalOverlaps,
   :rdf/about :time/intervalOverlappedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es 'intervalo solapado por' otro intervalo propio T2, entonces el principio de T1 es posterior al principio de T2, y el principio de T1 es anterior al final de T2, y el final de T1 es posterior al final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "intervalo solapado por"}
                {:rdf/language "en",
                 :rdf/value    "interval overlapped by"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es 'intervalo solapado por' otro intervalo propio T2, entonces el principio de T1 es posterior al principio de T2, y el principio de T1 es anterior al final de T2, y el final de T1 es posterior al final de T2."}]})

(def intervalOverlaps
  "If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2."
  {:owl/inverseOf :time/intervalOverlappedBy,
   :rdf/about :time/intervalOverlaps,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 se solapa con otro intervalo propio T2, entonces el principio de T1 es anterior al principio de T2, el final de T1 es posterior al principio de T2, y el final de T1 es anterior al final de T2."}
    {:rdf/language "es",
     :rdf/value
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "interval overlaps"}
                {:rdf/language "es",
                 :rdf/value    "intervalo se solapa"}],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 se solapa con otro intervalo propio T2, entonces el principio de T1 es anterior al principio de T2, el final de T1 es posterior al principio de T2, y el final de T1 es anterior al final de T2."}]})

(def intervalStartedBy
  "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."
  {:owl/inverseOf :time/intervalStarts,
   :rdf/about :time/intervalStartedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es empezado por otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 es posterior al final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interval started by"},
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 es empezado por otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 es posterior al final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."}]})

(def intervalStarts
  "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2."
  {:owl/inverseOf :time/intervalStartedBy,
   :rdf/about :time/intervalStarts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 empieza otro intervalo propio T2, entonces del principio de T1 con el principio de T2, y el final de T1 es anterior al final de T2."}
    {:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2."}],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "interval starts"}
                {:rdf/language "es",
                 :rdf/value    "intervalo empieza"}],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalIn,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2."}
    {:rdf/language "es",
     :rdf/value
     "Si un intervalo propio T1 empieza otro intervalo propio T2, entonces del principio de T1 con el final de T2, y el final de T1 es anterior al final de T2."}]})

(def minute
  "Minute position in a calendar-clock system."
  {:rdf/about       :time/minute,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    [{:rdf/language "es",
                      :rdf/value
                      "Posición de minuto en un sistema calendario-reloj."}
                     {:rdf/language "en",
                      :rdf/value
                      "Minute position in a calendar-clock system."}],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      [{:rdf/language "es",
                      :rdf/value    "minuto"}
                     {:rdf/language "en",
                      :rdf/value    "minute"}],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition [{:rdf/language "es",
                      :rdf/value
                      "Posición de minuto en un sistema calendario-reloj."}
                     {:rdf/language "en",
                      :rdf/value
                      "Minute position in a calendar-clock system."}]})

(def minutes
  "length, or element of, a temporal extent expressed in minutes"
  {:rdf/about :time/minutes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en minutos."}
    {:rdf/language "en",
     :rdf/value
     "length, or element of, a temporal extent expressed in minutes"}],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "minutos"}
                {:rdf/language "en",
                 :rdf/value    "minutes"}],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en minutos."}
    {:rdf/language "en",
     :rdf/value
     "length, or element of, a temporal extent expressed in minutes"}]})

(def month
  "Month position in a calendar-clock system.  The range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar."
  {:rdf/about :time/month,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Posición de mes en un sistema calendario-reloj.\n    El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un mes de calendario de un calendario cualquiera."}
    {:rdf/language "en",
     :rdf/value
     "Month position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar. "}],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "mes"}
                {:rdf/language "en",
                 :rdf/value    "month"}],
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Posición de mes en un sistema calendario-reloj.\n            El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un mes de calendario de un calendario cualquiera."}
    {:rdf/language "en",
     :rdf/value
     "Month position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar. "}]})

(def monthOfYear
  "The month of the year, whose value is a member of the class time:MonthOfYear"
  {:rdf/about :time/monthOfYear,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The month of the year, whose value is a member of the class time:MonthOfYear"}
    {:rdf/language "es",
     :rdf/value
     "El mes del año, cuyo valor es un miembro de la clase 'mes del año'."}],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "month of year"}
                {:rdf/language "es",
                 :rdf/value    "mes del año"}],
   :rdfs/range :time/MonthOfYear,
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "The month of the year, whose value is a member of the class time:MonthOfYear"}
    {:rdf/language "es",
     :rdf/value
     "El mes del año, cuyo valor es un miembro de la clase 'mes del año'."}],
   :skos/editorialNote
   [{:rdf/language "es",
     :rdf/value
     "Característica arriesgada - añadida en la revisión de 2017, y todavía no ampliamente utilizada."}
    {:rdf/language "en",
     :rdf/value
     "Feature at risk - added in 2017 revision, and not yet widely used. "}]})

(def months
  "length of, or element of the length of, a temporal extent expressed in months"
  {:rdf/about :time/months,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en meses."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in months"}],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "duración en meses"}
                {:rdf/language "en",
                 :rdf/value    "months duration"}],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en meses."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in months"}]})

(def nominalPosition
  "The (nominal) value indicating temporal position in an ordinal reference system"
  {:rdf/about :time/nominalPosition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "El valor (nominal) que indica posición temporal en un sistema de referencia ordinal."}
    {:rdf/language "en",
     :rdf/value
     "The (nominal) value indicating temporal position in an ordinal reference system "}],
   :rdfs/domain :time/TimePosition,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "nombre de posición temporal"}
                {:rdf/language "en",
                 :rdf/value    "Name of temporal position"}],
   :rdfs/range :xsd/string,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "El valor (nominal) que indica posición temporal en un sistema de referencia ordinal."}
    {:rdf/language "en",
     :rdf/value
     "The (nominal) value indicating temporal position in an ordinal reference system "}]})

(def numericDuration
  "Value of a temporal extent expressed as a decimal number scaled by a temporal unit"
  {:rdf/about :time/numericDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Valor de una extensión temporal expresada como un número decimal escalado por una unidad de tiempo."}
    {:rdf/language "en",
     :rdf/value
     "Value of a temporal extent expressed as a decimal number scaled by a temporal unit"}],
   :rdfs/domain :time/Duration,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "valor numérico de duración temporal"}
                {:rdf/language "en",
                 :rdf/value    "Numeric value of temporal duration"}],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "Valor de una extensión temporal expresada como un número decimal escalado por una unidad de tiempo."}
    {:rdf/language "en",
     :rdf/value
     "Value of a temporal extent expressed as a decimal number scaled by a temporal unit"}]})

(def numericPosition
  "The (numeric) value indicating position within a temporal coordinate system"
  {:rdf/about :time/numericPosition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "El valor (numérico) que indica posición temporal en un sistema de referencia ordinal."}
    {:rdf/language "en",
     :rdf/value
     "The (numeric) value indicating position within a temporal coordinate system "}],
   :rdfs/domain :time/TimePosition,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "valor numérico de posición temporal"}
                {:rdf/language "en",
                 :rdf/value    "Numeric value of temporal position"}],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [{:rdf/language "es",
     :rdf/value
     "El valor (numérico) que indica posición temporal en un sistema de referencia ordinal."}
    {:rdf/language "en",
     :rdf/value
     "The (numeric) value indicating position within a temporal coordinate system "}]})

(def second
  "Second position in a calendar-clock system."
  {:rdf/about    :time/second,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment [{:rdf/language "es",
                   :rdf/value
                   "Posición de segundo en un sistema calendario-reloj."}
                  {:rdf/language "en",
                   :rdf/value "Second position in a calendar-clock system."}],
   :rdfs/domain  :time/GeneralDateTimeDescription,
   :rdfs/label   [{:rdf/language "es",
                   :rdf/value    "segundo"}
                  {:rdf/language "en",
                   :rdf/value    "second"}],
   :rdfs/range   :xsd/decimal})

(def seconds
  "length of, or element of the length of, a temporal extent expressed in seconds"
  {:rdf/about :time/seconds,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en segundos."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in seconds"}],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "duración en segundos"}
                {:rdf/language "en",
                 :rdf/value    "seconds duration"}],
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso "http://www.bipm.org/en/publications/si-brochure/second.html"})

(def timeZone
  "The time zone for clock elements in the temporal position"
  {:rdf/about :time/timeZone,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The time zone for clock elements in the temporal position"},
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "in time zone"}
                {:rdf/language "es",
                 :rdf/value    "en huso horario"}],
   :rdfs/range :time/TimeZone,
   :skos/historyNote
   [{:rdf/language "es",
     :rdf/value
     "En la versión original de OWL-Time de 2006, el rango de 'en huso horario' se definió en un espacio de nombres diferente \"http://www.w3.org/2006/timezone#\".\n            Un axioma de alineación permite que los datos codificados de acuerdo con la versión anterior sean consistentes con la ontología actualizada."}
    "In the original 2006 version of OWL-Time, the range of time:timeZone was a TimeZone class in a separate namespace \"http://www.w3.org/2006/timezone#\". \nAn alignment axiom \n\ttzont:TimeZone rdfs:subClassOf time:TimeZone . \nallows data encoded according to the previous version to be consistent with the updated ontology. "],
   :skos/note
   ["IANA maintains a database of timezones. These are well maintained and generally considered authoritative, but individual items are not available at individual URIs, so cannot be used directly in data expressed using OWL-Time.\n\nDBPedia provides a set of resources corresponding to the IANA timezones, with a URI for each (e.g. http://dbpedia.org/resource/Australia/Eucla). The World Clock service also provides a list of time zones with the description of each available as an individual webpage with a convenient individual URI (e.g. https://www.timeanddate.com/time/zones/acwst). These or other, similar, resources might be used as a value of the time:timeZone property."
    {:rdf/language "es",
     :rdf/value
     "IANA mantiene una base de datos de husos horarios. Éstas están bien mantenidas y generalmente se consideran autorizadas, pero los ítems individuales no están disponibles en URIs individuales, por tanto, no se pueden utilizar directamente en datos expresados utilizando OWL-Time.\n            La BDPedia proporciona un conjunto de recursos correspondientes a los husos horarios de IANA, con una URI para cada uno (por ejemplo, http://dbpedia.org/resource/Australia/Eucla). El Servicio de Reloj Mundial también proporciona una lista de husos horarios con la descripción de cada uno de los disponibles como una página Web individual con una URI adecuada individual (por ejemplo, https://www.timeanddate.com/time/zones/acwst). Éstos, y otros recursos similares, se puden usar como un valor de la propiedad 'huso horario'."}]})

(def unitCentury
  {:rdf/about      :time/unitCentury,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Century (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "siècle"}
                    {:rdf/language "it",
                     :rdf/value    "secolo"}
                    {:rdf/language "ar",
                     :rdf/value    "قرن واحد"}
                    {:rdf/language "nl",
                     :rdf/value    "eeuw"}
                    {:rdf/language "es",
                     :rdf/value    "siglo"}
                    {:rdf/language "ja",
                     :rdf/value    "一世紀"}
                    {:rdf/language "pl",
                     :rdf/value    "stulecie"}
                    {:rdf/language "zh",
                     :rdf/value    "一个世纪"}
                    {:rdf/language "ru",
                     :rdf/value    "век"}
                    {:rdf/language "de",
                     :rdf/value    "Jahrhundert"}
                    {:rdf/language "kr",
                     :rdf/value    "한 세기"}
                    {:rdf/language "en",
                     :rdf/value    "century"}
                    {:rdf/language "pt",
                     :rdf/value    "século"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     100})

(def unitDay
  {:rdf/about      :time/unitDay,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Day (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tag"}
                    {:rdf/language "en",
                     :rdf/value    "day"}
                    {:rdf/language "nl",
                     :rdf/value    "dag"}
                    {:rdf/language "pt",
                     :rdf/value    "dia"}
                    {:rdf/language "es",
                     :rdf/value    "día"}
                    {:rdf/language "pl",
                     :rdf/value    "doba"}
                    {:rdf/language "ja",
                     :rdf/value    "ある日"}
                    {:rdf/language "ar",
                     :rdf/value    "يوماً ما"}
                    {:rdf/language "it",
                     :rdf/value    "giorno"}
                    {:rdf/language "kr",
                     :rdf/value    "언젠가"}
                    {:rdf/language "fr",
                     :rdf/value    "jour"}
                    {:rdf/language "zh",
                     :rdf/value    "一天"}],
   :time/days      1,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitDecade
  {:rdf/about      :time/unitDecade,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Decade (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "en",
                     :rdf/value    "decade"}
                    {:rdf/language "pl",
                     :rdf/value    "dekada"}
                    {:rdf/language "kr",
                     :rdf/value    "1 열개의"}
                    {:rdf/language "de",
                     :rdf/value    "Dekade"}
                    {:rdf/language "pt",
                     :rdf/value    "década"}
                    {:rdf/language "es",
                     :rdf/value    "una década"}
                    {:rdf/language "zh",
                     :rdf/value    "十年"}
                    {:rdf/language "ru",
                     :rdf/value    "одно десятилетие"}
                    {:rdf/language "it",
                     :rdf/value    "decennio"}
                    {:rdf/language "ja",
                     :rdf/value    "10年"}
                    {:rdf/language "nl",
                     :rdf/value    "decennium"}
                    {:rdf/language "fr",
                     :rdf/value    "décennie"}
                    {:rdf/language "ar",
                     :rdf/value    "عقد واحد"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     10})

(def unitHour
  {:rdf/about      :time/unitHour,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Hour (unit of temporal duration)"},
   :skos/prefLabel ["один час\"@ru"
                    {:rdf/language "ja",
                     :rdf/value    "一時間"}
                    {:rdf/language "pl",
                     :rdf/value    "godzina"}
                    {:rdf/language "de",
                     :rdf/value    "Stunde"}
                    {:rdf/language "zh",
                     :rdf/value    "一小時"}
                    {:rdf/language "kr",
                     :rdf/value    "한 시간"}
                    {:rdf/language "pt",
                     :rdf/value    "hora"}
                    {:rdf/language "es",
                     :rdf/value    "hora"}
                    {:rdf/language "it",
                     :rdf/value    "ora"}
                    {:rdf/language "en",
                     :rdf/value    "hour"}
                    {:rdf/language "ar",
                     :rdf/value    "ساعة واحدة"}
                    {:rdf/language "nl",
                     :rdf/value    "uur"}
                    {:rdf/language "fr",
                     :rdf/value    "heure"}],
   :time/days      0,
   :time/hours     1,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitMillenium
  {:rdf/about      :time/unitMillenium,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Century (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "en",
                     :rdf/value    "millenium"}
                    {:rdf/language "pl",
                     :rdf/value    "tysiąclecie"}
                    {:rdf/language "ja",
                     :rdf/value    "ミレニアム"}
                    {:rdf/language "fr",
                     :rdf/value    "millénaire"}
                    {:rdf/language "ru",
                     :rdf/value    "тысячелетие"}
                    {:rdf/language "it",
                     :rdf/value    "millennio"}
                    {:rdf/language "ar",
                     :rdf/value    "الألفية"}
                    {:rdf/language "de",
                     :rdf/value    "Jahrtausend"}
                    {:rdf/language "es",
                     :rdf/value    "milenio"}
                    {:rdf/language "nl",
                     :rdf/value    "millennium"}
                    {:rdf/language "zh",
                     :rdf/value    "千年"}
                    {:rdf/language "pt",
                     :rdf/value    "milênio"}
                    {:rdf/language "kr",
                     :rdf/value    "밀레니엄"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     1000})

(def unitMinute
  {:rdf/about      :time/unitMinute,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Minute (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "ar",
                     :rdf/value    "دقيقة واحدة"}
                    {:rdf/language "nl",
                     :rdf/value    "minuut"}
                    {:rdf/language "ru",
                     :rdf/value    "одна минута"}
                    {:rdf/language "de",
                     :rdf/value    "Minute"}
                    {:rdf/language "pt",
                     :rdf/value    "minuto"}
                    {:rdf/language "it",
                     :rdf/value    "minuto"}
                    {:rdf/language "es",
                     :rdf/value    "minuto"}
                    {:rdf/language "kr",
                     :rdf/value    "분"}
                    {:rdf/language "zh",
                     :rdf/value    "等一下"}
                    {:rdf/language "ja",
                     :rdf/value    "一分"}
                    {:rdf/language "fr",
                     :rdf/value    "minute"}
                    {:rdf/language "en",
                     :rdf/value    "minute"}
                    {:rdf/language "pl",
                     :rdf/value    "minuta"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   1,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitMonth
  {:rdf/about      :time/unitMonth,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Month (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "en",
                     :rdf/value    "month"}
                    {:rdf/language "it",
                     :rdf/value    "mese"}
                    {:rdf/language "fr",
                     :rdf/value    "mois"}
                    {:rdf/language "es",
                     :rdf/value    "mes"}
                    {:rdf/language "kr",
                     :rdf/value    "한달"}
                    {:rdf/language "ru",
                     :rdf/value    "один месяц"}
                    {:rdf/language "de",
                     :rdf/value    "Monat"}
                    {:rdf/language "nl",
                     :rdf/value    "maand"}
                    {:rdf/language "pl",
                     :rdf/value    "miesiąc"}
                    {:rdf/language "zh",
                     :rdf/value    "一個月"}
                    {:rdf/language "ar",
                     :rdf/value    "شهر واحد"}
                    {:rdf/language "ja",
                     :rdf/value    "一か月"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    1,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitSecond
  {:rdf/about      :time/unitSecond,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Second (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "pt",
                     :rdf/value    "segundo"}
                    {:rdf/language "es",
                     :rdf/value    "segundo"}
                    {:rdf/language "nl",
                     :rdf/value    "seconde"}
                    {:rdf/language "fr",
                     :rdf/value    "seconde"}
                    {:rdf/language "pl",
                     :rdf/value    "sekundę"}
                    {:rdf/language "de",
                     :rdf/value    "Sekunde"}
                    {:rdf/language "en",
                     :rdf/value    "second"}
                    {:rdf/language "ar",
                     :rdf/value    "ثانية واحدة"}
                    {:rdf/language "zh",
                     :rdf/value    "一秒"}
                    {:rdf/language "ja",
                     :rdf/value    "一秒"}
                    {:rdf/language "kr",
                     :rdf/value    "일초"}
                    {:rdf/language "it",
                     :rdf/value    "secondo"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   1,
   :time/weeks     0,
   :time/years     0})

(def unitType
  "The temporal unit which provides the precision of a date-time value or scale of a temporal extent"
  {:rdf/about :time/unitType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "La unidad de tiempo que proporciona la precisión de un valor fecha-hora o la escala de una extensión temporal."}
    {:rdf/language "en",
     :rdf/value
     "The temporal unit which provides the precision of a date-time value or scale of a temporal extent"}],
   :rdfs/domain {:owl/unionOf [:time/GeneralDateTimeDescription :time/Duration],
                 :rdf/type    :owl/Class},
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "tipo de unidad temporal"}
                {:rdf/language "en",
                 :rdf/value    "temporal unit type"}],
   :rdfs/range :time/TemporalUnit})

(def unitWeek
  {:rdf/about      :time/unitWeek,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Week (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "ja",
                     :rdf/value    "一週間"}
                    {:rdf/language "en",
                     :rdf/value    "week"}
                    {:rdf/language "nl",
                     :rdf/value    "week"}
                    {:rdf/language "it",
                     :rdf/value    "settimana"}
                    {:rdf/language "pt",
                     :rdf/value    "semana"}
                    {:rdf/language "es",
                     :rdf/value    "semana"}
                    {:rdf/language "ru",
                     :rdf/value    "одна неделя"}
                    {:rdf/language "pl",
                     :rdf/value    "tydzień"}
                    {:rdf/language "kr",
                     :rdf/value    "일주일"}
                    {:rdf/language "zh",
                     :rdf/value    "一周"}
                    {:rdf/language "fr",
                     :rdf/value    "semaine"}
                    {:rdf/language "ar",
                     :rdf/value    "سبوع واحد"}
                    {:rdf/language "de",
                     :rdf/value    "Woche"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     1,
   :time/years     0})

(def unitYear
  {:rdf/about      :time/unitYear,
   :rdf/type       :time/TemporalUnit,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "Year (unit of temporal duration)"},
   :skos/prefLabel [{:rdf/language "it",
                     :rdf/value    "anno"}
                    {:rdf/language "ar",
                     :rdf/value    "سنة واحدة"}
                    {:rdf/language "zh",
                     :rdf/value    "一年"}
                    {:rdf/language "ja",
                     :rdf/value    "一年"}
                    {:rdf/language "nl",
                     :rdf/value    "jaar"}
                    {:rdf/language "de",
                     :rdf/value    "Jahr"}
                    {:rdf/language "ru",
                     :rdf/value    "один год"}
                    {:rdf/language "es",
                     :rdf/value    "un año"}
                    {:rdf/language "en",
                     :rdf/value    "year"}
                    {:rdf/language "fr",
                     :rdf/value    "an"}
                    {:rdf/language "kr",
                     :rdf/value    "1 년"}
                    {:rdf/language "pt",
                     :rdf/value    "ano"}
                    {:rdf/language "pl",
                     :rdf/value    "rok"}],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     1})

(def week
  "Week number within the year."
  {:rdf/about :time/week,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment [{:rdf/language "es",
                   :rdf/value    "Número de semana en el año."}
                  {:rdf/language "en",
                   :rdf/value    "Week number within the year."}],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "semana"}
                {:rdf/language "en",
                 :rdf/value    "week"}],
   :rdfs/range :xsd/nonNegativeInteger,
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Weeks are numbered differently depending on the calendar in use and the local language or cultural conventions (locale). ISO-8601 specifies that the first week of the year includes at least four days, and that Monday is the first day of the week. In that system, week 1 is the week that contains the first Thursday in the year."},
   :skos/scopeNote
   {:rdf/language "es",
    :rdf/value
    "Las semanas están numeradas de forma diferente dependiendo del calendario en uso y de las convenciones lingüísticas y culturales locales (locale en inglés). El ISO-8601 especifica que la primera semana del año incluye al menos cuatro días, y que el lunes es el primer día de la semana. En ese sistema, la semana 1 es la semana que contiene el primer jueves del año."}})

(def weeks
  "length of, or element of the length of, a temporal extent expressed in weeks"
  {:rdf/about :time/weeks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en semanas."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in weeks"}],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "duración en semanas"}
                {:rdf/language "en",
                 :rdf/value    "weeks duration"}],
   :rdfs/range :xsd/decimal})

(def xsdDateTime
  "Value of DateTimeInterval expressed as a compact value."
  {:owl/deprecated true,
   :rdf/about :time/xsdDateTime,
   :rdf/type [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Valor de 'intervalo de fecha-hora' expresado como un valor compacto."}
    {:rdf/language "en",
     :rdf/value    "Value of DateTimeInterval expressed as a compact value."}],
   :rdfs/domain :time/DateTimeInterval,
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has XSD date-time"}
                {:rdf/language "es",
                 :rdf/value    "tiene fecha-hora XSD"}],
   :rdfs/range :xsd/dateTime,
   :skos/note
   ["Utilizando xsd:dateTime en este lugar significa que la duración del intervalo está implícita: se corresponde con la longitud del elemento más pequeño distinto de cero del literal fecha-hora. Sin embargo, esta regla no se puede utilizar para intervalos cuya duración es mayor que un rango más pequeño que el tiempo de comienzo - p.ej. el primer minuto o segundo del día, la primera hora del mes, o el primer día del año. En estos casos el intervalo deseado no se puede distinguir del intervalo correspondiente al próximo rango más alto. Debido a esta ambigüedad esencial, no se recomienda el uso de esta propiedad y está desaprobada."
    {:rdf/language "en",
     :rdf/value
     "Using xsd:dateTime in this place means that the duration of the interval is implicit: it corresponds to the length of the smallest non-zero element of the date-time literal. However, this rule cannot be used for intervals whose duration is more than one rank smaller than the starting time - e.g. the first minute or second of a day, the first hour of a month, or the first day of a year. In these cases the desired interval cannot be distinguished from the interval corresponding to the next rank up. Because of this essential ambiguity, use of this property is not recommended and it is deprecated."}]})

(def year
  "Year position in a calendar-clock system.  The range of this property is not specified, so can be replaced by any specific representation of a calendar year from any calendar."
  {:rdf/about :time/year,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Posición de año en un sistema calendario-reloj.\n\nl rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un año de calendario de un calendario cualquiera."}
    {:rdf/language "en",
     :rdf/value
     "Year position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar year from any calendar. "}],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "year"}})

(def years
  "length of, or element of the length of, a temporal extent expressed in years"
  {:rdf/about :time/years,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en años."}
    {:rdf/language "en",
     :rdf/value
     "length of, or element of the length of, a temporal extent expressed in years"}],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "duración en años"}
                {:rdf/language "en",
                 :rdf/value    "years duration"}],
   :rdfs/range :xsd/decimal})