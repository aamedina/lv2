(ns net.wikipunk.rdf.lv2.doap
  "The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/doap.ttl",
   :foaf/maker {:foaf/mbox {:rdf/uri "mailto:edd@usefulinc.com"},
                :foaf/name "Edd Dumbill",
                :rdf/type  :foaf/Person},
   :owl/imports {:rdf/uri "http://xmlns.com/foaf/0.1/"},
   :rdf/about {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "doap"    "http://usefulinc.com/ns/doap#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "doap",
   :vann/preferredNamespaceUri "http://usefulinc.com/ns/doap#"}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  "GNU Arch source code repository."
  {:rdf/about        :doap/ArchRepository,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "fr",
                       :rdf/literal "Dépôt GNU Arch"}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio GNU Arch"}
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště GNU Arch"}
                      "GNU Arch repository"
                      {:rdf/lang    "de",
                       :rdf/literal "GNU Arch repository"}],
   :rdfs/subClassOf  :doap/Repository})

(def BKRepository
  "BitKeeper source code repository."
  {:rdf/about        :doap/BKRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "BitKeeper Repository"}
                      "BitKeeper Repository"
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt BitKeeper"}
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště BitKeeper"}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio BitKeeper"}],
   :rdfs/subClassOf  :doap/Repository})

(def BazaarBranch
  "Bazaar source code branch."
  {:rdf/about        :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Bazaar Branch",
   :rdfs/subClassOf  :doap/Repository})

(def CVSRepository
  "CVS source code repository."
  {:rdf/about        :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "CVS Repository"}
                      "CVS Repository"
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště CVS"}
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt CVS"}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio CVS"}],
   :rdfs/subClassOf  :doap/Repository})

(def DarcsRepository
  "darcs source code repository."
  {:rdf/about        :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["darcs Repository"
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio darcs"}
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt darcs"}],
   :rdfs/subClassOf  :doap/Repository})

(def GitBranch
  "Git source code branch."
  {:rdf/about        :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Git Branch",
   :rdfs/subClassOf  :doap/Repository})

(def HgRepository
  "Mercurial source code repository."
  {:rdf/about        :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Mercurial Repository",
   :rdfs/subClassOf  :doap/Repository})

(def Project
  "A project."
  {:rdf/about        :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "es",
                       :rdf/literal "Proyecto"}
                      {:rdf/lang    "fr",
                       :rdf/literal "Projet"}
                      "Project"
                      {:rdf/lang    "cs",
                       :rdf/literal "Projekt"}
                      {:rdf/lang    "de",
                       :rdf/literal "Prijekt"}],
   :rdfs/subClassOf  :foaf/Project})

(def Repository
  "Source code repository."
  {:rdf/about        :doap/Repository,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "Úložiště"}
                      "Repository"
                      {:rdf/lang    "de",
                       :rdf/literal "Repository"}
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt"}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio"}]})

(def SVNRepository
  "Subversion source code repository."
  {:rdf/about        :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "fr",
                       :rdf/literal "Dépôt Subversion"}
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště Subversion"}
                      "Subversion Repository"
                      {:rdf/lang    "de",
                       :rdf/literal "Subversion Repository"}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio Subversion"}],
   :rdfs/subClassOf  :doap/Repository})

(def Specification
  "A specification of a system's aspects, technical or otherwise."
  {:rdf/about        :doap/Specification,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Specification"})

(def Version
  "Version information of a project release."
  {:rdf/about        :doap/Version,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["Version"
                      {:rdf/lang    "de",
                       :rdf/literal "Version"}
                      {:rdf/lang    "fr",
                       :rdf/literal "Version"}
                      {:rdf/lang    "cs",
                       :rdf/literal "Verze"}
                      {:rdf/lang    "es",
                       :rdf/literal "Versión"}]})

(def audience
  "Description of target user base"
  {:rdf/about        :doap/audience,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "audience"})

(def blog
  "URI of a blog related to a project"
  {:rdf/about        :doap/blog,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "blog"})

(def browse
  "Web browser interface to repository."
  {:rdf/about        :doap/browse,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "browse"}
                      {:rdf/lang    "es",
                       :rdf/literal "navegar"}
                      {:rdf/lang    "fr",
                       :rdf/literal "visualiser"}
                      {:rdf/lang    "cs",
                       :rdf/literal "prohlížeč"}
                      "browse"]})

(def bug-database
  "Bug tracker for a project."
  {:rdf/about        :doap/bug-database,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "databáze chyb"}
                      {:rdf/lang    "fr",
                       :rdf/literal "suivi des bugs"}
                      {:rdf/lang    "de",
                       :rdf/literal "Fehlerdatenbank"}
                      "bug database"
                      {:rdf/lang    "es",
                       :rdf/literal "base de datos de bugs"}]})

(def category
  "A category of project."
  {:rdf/about        :doap/category,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["category"
                      {:rdf/lang    "es",
                       :rdf/literal "categoría"}
                      {:rdf/lang    "cs",
                       :rdf/literal "kategorie"}
                      {:rdf/lang    "de",
                       :rdf/literal "Kategorie"}
                      {:rdf/lang    "fr",
                       :rdf/literal "catégorie"}]})

(def created
  "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"
  {:rdf/about        :doap/created,
   :rdf/type         [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["created"
                      {:rdf/lang    "de",
                       :rdf/literal "erstellt"}
                      {:rdf/lang    "cs",
                       :rdf/literal "vytvořeno"}
                      {:rdf/lang    "es",
                       :rdf/literal "creado"}
                      {:rdf/lang    "fr",
                       :rdf/literal "créé"}]})

(def description
  "Plain text description of a project, of 2-4 sentences in length."
  {:rdf/about        :doap/description,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "es",
                       :rdf/literal "descripción"}
                      {:rdf/lang    "cs",
                       :rdf/literal "popis"}
                      {:rdf/lang    "fr",
                       :rdf/literal "description"}
                      "description"
                      {:rdf/lang    "de",
                       :rdf/literal "Beschreibung"}]})

(def developer
  "Developer of software for the project."
  {:rdf/about        :doap/developer,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "Entwickler"}
                      {:rdf/lang    "cs",
                       :rdf/literal "vývojář"}
                      {:rdf/lang    "fr",
                       :rdf/literal "développeur"}
                      {:rdf/lang    "es",
                       :rdf/literal "desarrollador"}
                      "developer"],
   :rdfs/range       :foaf/Person})

(def documenter
  "Contributor of documentation to the project."
  {:rdf/about        :doap/documenter,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["documenter"
                      {:rdf/lang    "cs",
                       :rdf/literal "dokumentarista"}
                      {:rdf/lang    "de",
                       :rdf/literal "Dokumentator"}
                      {:rdf/lang    "es",
                       :rdf/literal "escritor de ayuda"}
                      {:rdf/lang    "fr",
                       :rdf/literal "rédacteur de l'aide"}],
   :rdfs/range       :foaf/Person})

(def download-mirror
  "Mirror of software download web page."
  {:rdf/about        :doap/download-mirror,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "zrcadlo stránky pro stažení"}
                      {:rdf/lang    "fr",
                       :rdf/literal "miroir pour le téléchargement"}
                      "download mirror"
                      {:rdf/lang    "de",
                       :rdf/literal "Spiegel der Seite zum Herunterladen"}
                      {:rdf/lang    "es",
                       :rdf/literal "mirror de descarga"}]})

(def download-page
  "Web page from which the project software can be downloaded."
  {:rdf/about        :doap/download-page,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "stránka pro stažení"}
                      {:rdf/lang    "fr",
                       :rdf/literal "page de téléchargement"}
                      {:rdf/lang    "de",
                       :rdf/literal "Seite zum Herunterladen"}
                      "download page"
                      {:rdf/lang    "es",
                       :rdf/literal "página de descarga"}]})

(def file-release
  "URI of download associated with this release."
  {:rdf/about        :doap/file-release,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "soubor revize"}
                      "file-release"]})

(def helper
  "Project contributor."
  {:rdf/about        :doap/helper,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["helper"
                      {:rdf/lang    "fr",
                       :rdf/literal "collaborateur"}
                      {:rdf/lang    "es",
                       :rdf/literal "colaborador"}
                      {:rdf/lang    "de",
                       :rdf/literal "Helfer"}
                      {:rdf/lang    "cs",
                       :rdf/literal "spoluautor"}],
   :rdfs/range       :foaf/Person})

(def homepage
  "URL of a project's homepage,associated with exactly one project."
  {:rdf/about          :doap/homepage,
   :rdf/type           [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label         [{:rdf/lang    "es",
                         :rdf/literal "página web"}
                        {:rdf/lang    "de",
                         :rdf/literal "Homepage"}
                        "homepage"
                        {:rdf/lang    "cs",
                         :rdf/literal "domovská stránka"}
                        {:rdf/lang    "fr",
                         :rdf/literal "page web"}],
   :rdfs/subPropertyOf :foaf/homepage})

(def implements
  "A specification that a project implements. Could be a standard, API or legally defined level of conformance."
  {:rdf/about        :doap/implements,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Implements specification",
   :rdfs/range       :doap/Specification})

(def language
  "ISO language code a project has been translated into"
  {:rdf/about        :doap/language,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "language"})

(def license
  "The URI of an RDF description of the license the software is distributed under."
  {:rdf/about        :doap/license,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "Lizenz"}
                      {:rdf/lang    "cs",
                       :rdf/literal "licence"}
                      {:rdf/lang    "fr",
                       :rdf/literal "licence"}
                      "license"
                      {:rdf/lang    "es",
                       :rdf/literal "licencia"}]})

(def location
  "Location of a repository."
  {:rdf/about        :doap/location,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["repository location"
                      {:rdf/lang    "cs",
                       :rdf/literal "umístění úložiště"}
                      {:rdf/lang    "es",
                       :rdf/literal "lugar del respositorio"}
                      {:rdf/lang    "fr",
                       :rdf/literal "emplacement du dépôt"}
                      {:rdf/lang    "de",
                       :rdf/literal "Repository Lokation"}]})

(def mailing-list
  "Mailing list home page or email address."
  {:rdf/about        :doap/mailing-list,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "es",
                       :rdf/literal "lista de correo"}
                      "mailing list"
                      {:rdf/lang    "fr",
                       :rdf/literal "liste de diffusion"}
                      {:rdf/lang    "de",
                       :rdf/literal "Mailing Liste"}
                      {:rdf/lang    "cs",
                       :rdf/literal "e–mailová diskuse"}]})

(def maintainer
  "Maintainer of a project, a project leader."
  {:rdf/about        :doap/maintainer,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "Projektverantwortlicher"}
                      {:rdf/lang    "fr",
                       :rdf/literal "développeur principal"}
                      {:rdf/lang    "cs",
                       :rdf/literal "správce"}
                      "maintainer"
                      {:rdf/lang    "es",
                       :rdf/literal "desarrollador principal"}],
   :rdfs/range       :foaf/Person})

(def module
  "Module name of a Subversion, CVS, BitKeeper or Arch repository."
  {:rdf/about        :doap/module,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      {:owl/unionOf [:doap/CVSRepository
                                    :doap/ArchRepository
                                    :doap/BKRepository],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "fr",
                       :rdf/literal "module"}
                      "module"
                      {:rdf/lang    "cs",
                       :rdf/literal "modul"}
                      {:rdf/lang    "de",
                       :rdf/literal "Modul"}
                      {:rdf/lang    "es",
                       :rdf/literal "módulo"}]})

(def name
  "A name of something."
  {:rdf/about          :doap/name,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/isDefinedBy   {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label         [{:rdf/lang    "es",
                         :rdf/literal "nombre"}
                        {:rdf/lang    "fr",
                         :rdf/literal "nom"}
                        {:rdf/lang    "de",
                         :rdf/literal "Name"}
                        "name"
                        {:rdf/lang    "cs",
                         :rdf/literal "jméno"}],
   :rdfs/subPropertyOf :rdfs/label})

(def old-homepage
  "URL of a project's past homepage,associated with exactly one project."
  {:rdf/about          :doap/old-homepage,
   :rdf/type           [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label         [{:rdf/lang    "cs",
                         :rdf/literal "stará domovská stránka"}
                        {:rdf/lang    "fr",
                         :rdf/literal "ancienne page web"}
                        {:rdf/lang    "de",
                         :rdf/literal "Alte Homepage"}
                        "old homepage"
                        {:rdf/lang    "es",
                         :rdf/literal "página web antigua"}],
   :rdfs/subPropertyOf :foaf/homepage})

(def os
  "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."
  {:rdf/about        :doap/os,
   :rdf/type         [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain      [:doap/Project :doap/Version],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "operační systém"}
                      {:rdf/lang    "fr",
                       :rdf/literal "système d'exploitation"}
                      {:rdf/lang    "de",
                       :rdf/literal "Betriebssystem"}
                      {:rdf/lang    "es",
                       :rdf/literal "sistema operativo"}
                      "operating system"]})

(def platform
  "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"
  {:rdf/about        :doap/platform,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      [:doap/Version :doap/Project],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "platform"})

(def programming-language
  "Programming language a project is implemented in or intended for use with."
  {:rdf/about        :doap/programming-language,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "programovací jazyk"}
                      {:rdf/lang    "fr",
                       :rdf/literal "langage de programmation"}
                      "programming language"
                      {:rdf/lang    "es",
                       :rdf/literal "lenguaje de programación"}
                      {:rdf/lang    "de",
                       :rdf/literal "Programmiersprache"}]})

(def release
  "A project release."
  {:rdf/about        :doap/release,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "Release"}
                      {:rdf/lang    "fr",
                       :rdf/literal "release"}
                      {:rdf/lang    "es",
                       :rdf/literal "release"}
                      "release"
                      {:rdf/lang    "cs",
                       :rdf/literal "release"}],
   :rdfs/range       :doap/Version})

(def repository
  "Source code repository."
  {:rdf/about        :doap/repository,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       ["repository"
                      {:rdf/lang    "es",
                       :rdf/literal "repositorio"}
                      {:rdf/lang    "fr",
                       :rdf/literal "dépôt"}
                      {:rdf/lang    "de",
                       :rdf/literal "Repository"}
                      {:rdf/lang    "cs",
                       :rdf/literal "úložiště"}],
   :rdfs/range       :doap/Repository})

(def revision
  "Revision identifier of a software release."
  {:rdf/about        :doap/revision,
   :rdf/type         [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "Version"}
                      "revision"
                      {:rdf/lang    "fr",
                       :rdf/literal "révision"}
                      {:rdf/lang    "es",
                       :rdf/literal "versión"}
                      {:rdf/lang    "cs",
                       :rdf/literal "verze"}]})

(def screenshots
  "Web page with screenshots of project."
  {:rdf/about        :doap/screenshots,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "snímek obrazovky"}
                      {:rdf/lang    "de",
                       :rdf/literal "Screenshots"}
                      "screenshots"
                      {:rdf/lang    "fr",
                       :rdf/literal "captures d'écran"}
                      {:rdf/lang    "es",
                       :rdf/literal "capturas de pantalla"}]})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:rdf/about        :doap/service-endpoint,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "service endpoint"})

(def shortdesc
  "Short (8 or 9 words) plain text description of a project."
  {:rdf/about        :doap/shortdesc,
   :rdf/type         [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "Kurzbeschreibung"}
                      {:rdf/lang    "fr",
                       :rdf/literal "description courte"}
                      {:rdf/lang    "es",
                       :rdf/literal "descripción corta"}
                      {:rdf/lang    "cs",
                       :rdf/literal "krátký popis"}
                      "short description"]})

(def tester
  "A tester or other quality control contributor."
  {:rdf/about        :doap/tester,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "fr",
                       :rdf/literal "testeur"}
                      {:rdf/lang    "de",
                       :rdf/literal "Tester"}
                      {:rdf/lang    "es",
                       :rdf/literal "tester"}
                      "tester"
                      {:rdf/lang    "cs",
                       :rdf/literal "tester"}],
   :rdfs/range       :foaf/Person})

(def translator
  "Contributor of translations to the project."
  {:rdf/about        :doap/translator,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "es",
                       :rdf/literal "traductor"}
                      "translator"
                      {:rdf/lang    "de",
                       :rdf/literal "Übersetzer"}
                      {:rdf/lang    "fr",
                       :rdf/literal "traducteur"}
                      {:rdf/lang    "cs",
                       :rdf/literal "překladatel"}],
   :rdfs/range       :foaf/Person})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:rdf/about        :doap/vendor,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "vendor",
   :rdfs/range       :foaf/Organization})

(def wiki
  "URL of Wiki for collaborative discussion of project."
  {:rdf/about        :doap/wiki,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "de",
                       :rdf/literal "Wiki"}
                      {:rdf/lang    "fr",
                       :rdf/literal "wiki"}
                      {:rdf/lang    "es",
                       :rdf/literal "wiki"}
                      "wiki"
                      {:rdf/lang    "cs",
                       :rdf/literal "wiki"}]})