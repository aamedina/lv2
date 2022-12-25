(ns net.wikipunk.rdf.lv2.doap
  "The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
  {:rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "doap",
   :foaf/maker {:foaf/name "Edd Dumbill",
                :foaf/mbox #:rdf{:uri "mailto:edd@usefulinc.com"},
                :rdf/type :foaf/Person},
   :dcat/downloadURL
     "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/doap.ttl",
   :owl/imports #:rdf{:uri "http://xmlns.com/foaf/0.1/"},
   :rdf/about [#:rdf{:uri "http://usefulinc.com/ns/doap#"}],
   :dcterms/title "Description of a Project (DOAP) vocabulary",
   :vann/preferredNamespaceUri "http://usefulinc.com/ns/doap#",
   :rdf/ns-prefix-map {"doap" "http://usefulinc.com/ns/doap#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "foaf" "http://xmlns.com/foaf/0.1/"}}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  "GNU Arch source code repository."
  {:rdfs/label [#:rdf{:literal "Dépôt GNU Arch", :lang "fr"}
                #:rdf{:literal "Repositorio GNU Arch", :lang "es"}
                #:rdf{:literal "Úložiště GNU Arch", :lang "cs"}
                "GNU Arch repository"
                #:rdf{:literal "GNU Arch repository", :lang "de"}],
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/subClassOf :doap/Repository,
   :rdfs/comment
     ["GNU Arch source code repository."
      #:rdf{:literal "Úložiště zdrojových kódů GNU Arch.", :lang "cs"}
      #:rdf{:literal "Dépôt GNU Arch du code source.", :lang "fr"}
      #:rdf{:literal "Repositorio GNU Arch del código fuente.", :lang "es"}
      #:rdf{:literal "GNU Arch Quellcode-Versionierungssystem.", :lang "de"}]})

(def BKRepository
  "BitKeeper source code repository."
  {:rdfs/comment
     [#:rdf{:literal "Dépôt BitKeeper du code source.", :lang "fr"}
      #:rdf{:literal "Úložiště zdrojových kódů BitKeeper.", :lang "cs"}
      #:rdf{:literal "BitKeeper Quellcode-Versionierungssystem.", :lang "de"}
      #:rdf{:literal "Repositorio BitKeeper del código fuente.", :lang "es"}
      "BitKeeper source code repository."],
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/label [#:rdf{:literal "BitKeeper Repository", :lang "de"}
                "BitKeeper Repository"
                #:rdf{:literal "Dépôt BitKeeper", :lang "fr"}
                #:rdf{:literal "Úložiště BitKeeper", :lang "cs"}
                #:rdf{:literal "Repositorio BitKeeper", :lang "es"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/subClassOf :doap/Repository})

(def BazaarBranch
  "Bazaar source code branch."
  {:rdfs/subClassOf :doap/Repository,
   :rdfs/label "Bazaar Branch",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/comment "Bazaar source code branch.",
   :rdf/type :rdfs/Class})

(def CVSRepository
  "CVS source code repository."
  {:rdfs/comment [#:rdf{:literal "Dépôt CVS du code source.", :lang "fr"}
                  #:rdf{:literal "Úložiště zdrojových kódů CVS.", :lang "cs"}
                  #:rdf{:literal "CVS Quellcode-Versionierungssystem.",
                   :lang "de"} "CVS source code repository."
                  #:rdf{:literal "Repositorio CVS del código fuente.",
                   :lang "es"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#:rdf{:literal "CVS Repository", :lang "de"} "CVS Repository"
                #:rdf{:literal "Úložiště CVS", :lang "cs"}
                #:rdf{:literal "Dépôt CVS", :lang "fr"}
                #:rdf{:literal "Repositorio CVS", :lang "es"}],
   :rdfs/subClassOf :doap/Repository,
   :rdf/type [:rdfs/Class :owl/Class]})

(def DarcsRepository
  "darcs source code repository."
  {:rdfs/subClassOf :doap/Repository,
   :rdfs/label ["darcs Repository"
                #:rdf{:literal "Repositorio darcs", :lang "es"}
                #:rdf{:literal "Dépôt darcs", :lang "fr"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/comment ["darcs source code repository."
                  #:rdf{:literal "Repositorio darcs del código fuente.",
                   :lang "es"}
                  #:rdf{:literal "Dépôt darcs du code source.", :lang "fr"}],
   :rdf/type :rdfs/Class})

(def GitBranch
  "Git source code branch."
  {:rdfs/subClassOf :doap/Repository,
   :rdfs/label "Git Branch",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/comment "Git source code branch.",
   :rdf/type :rdfs/Class})

(def HgRepository
  "Mercurial source code repository."
  {:rdfs/subClassOf :doap/Repository,
   :rdfs/label "Mercurial Repository",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/comment "Mercurial source code repository.",
   :rdf/type :rdfs/Class})

(def Project
  "A project."
  {:rdf/type :rdfs/Class,
   :rdfs/label [#:rdf{:literal "Proyecto", :lang "es"}
                #:rdf{:literal "Projet", :lang "fr"} "Project"
                #:rdf{:literal "Projekt", :lang "cs"}
                #:rdf{:literal "Prijekt", :lang "de"}],
   :rdfs/comment [#:rdf{:literal "Projekt.", :lang "cs"}
                  #:rdf{:literal "Un proyecto.", :lang "es"}
                  #:rdf{:literal "Ein Projekt.", :lang "de"}
                  #:rdf{:literal "Un projet.", :lang "fr"} "A project."],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/subClassOf :foaf/Project})

(def Repository
  "Source code repository."
  {:rdfs/label [#:rdf{:literal "Úložiště", :lang "cs"} "Repository"
                #:rdf{:literal "Repository", :lang "de"}
                #:rdf{:literal "Dépôt", :lang "fr"}
                #:rdf{:literal "Repositorio", :lang "es"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/comment ["Source code repository."
                  #:rdf{:literal "Dépôt du code source.", :lang "fr"}
                  #:rdf{:literal "Quellcode-Versionierungssystem.", :lang "de"}
                  #:rdf{:literal "Úložiště zdrojových kódů.", :lang "cs"}
                  #:rdf{:literal "Repositorio del código fuente.", :lang "es"}],
   :rdf/type :rdfs/Class})

(def SVNRepository
  "Subversion source code repository."
  {:rdfs/label [#:rdf{:literal "Dépôt Subversion", :lang "fr"}
                #:rdf{:literal "Úložiště Subversion", :lang "cs"}
                "Subversion Repository"
                #:rdf{:literal "Subversion Repository", :lang "de"}
                #:rdf{:literal "Repositorio Subversion", :lang "es"}],
   :rdfs/subClassOf :doap/Repository,
   :rdfs/comment
     ["Subversion source code repository."
      #:rdf{:literal "Úložiště zdrojových kódů Subversion.", :lang "cs"}
      #:rdf{:literal "Dépôt Subversion du code source.", :lang "fr"}
      #:rdf{:literal "Subversion Quellcode-Versionierungssystem.", :lang "de"}
      #:rdf{:literal "Repositorio Subversion del código fuente.", :lang "es"}],
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def Specification
  "A specification of a system's aspects, technical or otherwise."
  {:rdfs/label "Specification",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/comment
     "A specification of a system's aspects, technical or otherwise.",
   :rdf/type :rdfs/Class})

(def Version
  "Version information of a project release."
  {:rdfs/comment
     [#:rdf{:literal "Información sobre la versión de un release del proyecto.",
       :lang "es"}
      #:rdf{:literal "Détails sur une version d'une realease d'un projet.",
       :lang "fr"}
      #:rdf{:literal "Informace o uvolněné verzi projektu.", :lang "cs"}
      "Version information of a project release."
      #:rdf{:literal "Versionsinformation eines Projekt Releases.",
       :lang "de"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type :rdfs/Class,
   :rdfs/label ["Version" #:rdf{:literal "Version", :lang "de"}
                #:rdf{:literal "Version", :lang "fr"}
                #:rdf{:literal "Verze", :lang "cs"}
                #:rdf{:literal "Versión", :lang "es"}]})

(def audience
  "Description of target user base"
  {:rdfs/label "audience",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/comment "Description of target user base",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def blog
  "URI of a blog related to a project"
  {:rdfs/label "blog",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/comment "URI of a blog related to a project",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def browse
  "Web browser interface to repository."
  {:rdfs/label [#:rdf{:literal "browse", :lang "de"}
                #:rdf{:literal "navegar", :lang "es"}
                #:rdf{:literal "visualiser", :lang "fr"}
                #:rdf{:literal "prohlížeč", :lang "cs"} "browse"],
   :rdfs/comment [#:rdf{:literal "Webové rozhraní pro prohlížení úložiště.",
                   :lang "cs"} "Web browser interface to repository."
                  #:rdf{:literal "Interface web au dépôt.", :lang "fr"}
                  #:rdf{:literal "Interface web del repositorio.", :lang "es"}
                  #:rdf{:literal "Web-Browser Interface für das Repository.",
                   :lang "de"}],
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Repository})

(def bug-database
  "Bug tracker for a project."
  {:rdfs/label [#:rdf{:literal "databáze chyb", :lang "cs"}
                #:rdf{:literal "suivi des bugs", :lang "fr"}
                #:rdf{:literal "Fehlerdatenbank", :lang "de"} "bug database"
                #:rdf{:literal "base de datos de bugs", :lang "es"}],
   :rdfs/comment [#:rdf{:literal "Suivi des bugs pour un projet.", :lang "fr"}
                  "Bug tracker for a project."
                  #:rdf{:literal "Fehlerdatenbank eines Projektes.", :lang "de"}
                  #:rdf{:literal "Bug tracker para un proyecto.", :lang "es"}
                  #:rdf{:literal "Správa chyb projektu.", :lang "cs"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :doap/Project})

(def category
  "A category of project."
  {:rdfs/label ["category" #:rdf{:literal "categoría", :lang "es"}
                #:rdf{:literal "kategorie", :lang "cs"}
                #:rdf{:literal "Kategorie", :lang "de"}
                #:rdf{:literal "catégorie", :lang "fr"}],
   :rdfs/comment [#:rdf{:literal "Eine Kategorie eines Projektes.", :lang "de"}
                  #:rdf{:literal "Kategorie projektu.", :lang "cs"}
                  "A category of project."
                  #:rdf{:literal "Una categoría de proyecto.", :lang "es"}
                  #:rdf{:literal "Une catégorie de projet.", :lang "fr"}],
   :rdfs/domain :doap/Project,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def created
  "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"
  {:rdfs/label ["created" #:rdf{:literal "erstellt", :lang "de"}
                #:rdf{:literal "vytvořeno", :lang "cs"}
                #:rdf{:literal "creado", :lang "es"}
                #:rdf{:literal "créé", :lang "fr"}],
   :rdfs/comment
     [#:rdf{:literal
              "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05.",
       :lang "de"}
      #:rdf{:literal
              "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05",
       :lang "cs"}
      #:rdf{:literal
              "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05",
       :lang "es"}
      "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"
      #:rdf{:literal
              "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)",
       :lang "fr"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type [:rdf/Property :owl/DatatypeProperty]})

(def description
  "Plain text description of a project, of 2-4 sentences in length."
  {:rdfs/comment
     [#:rdf{:literal "Čistě textový, 2 až 4 věty dlouhý popis projektu.",
       :lang "cs"}
      #:rdf{:literal "Texte descriptif d'un projet, long de 2 à 4 phrases.",
       :lang "fr"}
      #:rdf{:literal
              "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud.",
       :lang "es"}
      #:rdf{:literal
              "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen.",
       :lang "de"}
      "Plain text description of a project, of 2-4 sentences in length."],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#:rdf{:literal "descripción", :lang "es"}
                #:rdf{:literal "popis", :lang "cs"}
                #:rdf{:literal "description", :lang "fr"} "description"
                #:rdf{:literal "Beschreibung", :lang "de"}],
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def developer
  "Developer of software for the project."
  {:rdfs/label [#:rdf{:literal "Entwickler", :lang "de"}
                #:rdf{:literal "vývojář", :lang "cs"}
                #:rdf{:literal "développeur", :lang "fr"}
                #:rdf{:literal "desarrollador", :lang "es"} "developer"],
   :rdfs/comment
     [#:rdf{:literal "Vývojář softwaru projektu.", :lang "cs"}
      #:rdf{:literal "Desarrollador de software para el proyecto.", :lang "es"}
      #:rdf{:literal "Développeur pour le projet.", :lang "fr"}
      "Developer of software for the project."
      #:rdf{:literal "Software-Entwickler für eine Projekt.", :lang "de"}],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/range :foaf/Person})

(def documenter
  "Contributor of documentation to the project."
  {:rdfs/comment
     [#:rdf{:literal "Proveedor de documentación para el proyecto.", :lang "es"}
      #:rdf{:literal "Collaborateur à la documentation du projet.", :lang "fr"}
      #:rdf{:literal "Spoluautor dokumentace projektu.", :lang "cs"}
      "Contributor of documentation to the project."
      #:rdf{:literal "Mitarbeiter an der Dokumentation eines Projektes.",
       :lang "de"}],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label ["documenter" #:rdf{:literal "dokumentarista", :lang "cs"}
                #:rdf{:literal "Dokumentator", :lang "de"}
                #:rdf{:literal "escritor de ayuda", :lang "es"}
                #:rdf{:literal "rédacteur de l'aide", :lang "fr"}],
   :rdfs/range :foaf/Person,
   :rdfs/domain :doap/Project})

(def download-mirror
  "Mirror of software download web page."
  {:rdfs/label [#:rdf{:literal "zrcadlo stránky pro stažení", :lang "cs"}
                #:rdf{:literal "miroir pour le téléchargement", :lang "fr"}
                "download mirror"
                #:rdf{:literal "Spiegel der Seite zum Herunterladen",
                 :lang "de"} #:rdf{:literal "mirror de descarga", :lang "es"}],
   :rdfs/domain :doap/Project,
   :rdfs/comment
     ["Mirror of software download web page."
      #:rdf{:literal
              "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann.",
       :lang "de"}
      #:rdf{:literal "Zrcadlo stránky pro stažení softwaru.", :lang "cs"}
      #:rdf{:literal "Miroir de la page de téléchargement du programme.",
       :lang "fr"}
      #:rdf{:literal "Mirror de la página web de descarga.", :lang "es"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type [:rdf/Property :owl/ObjectProperty]})

(def download-page
  "Web page from which the project software can be downloaded."
  {:rdfs/label [#:rdf{:literal "stránka pro stažení", :lang "cs"}
                #:rdf{:literal "page de téléchargement", :lang "fr"}
                #:rdf{:literal "Seite zum Herunterladen", :lang "de"}
                "download page"
                #:rdf{:literal "página de descarga", :lang "es"}],
   :rdfs/comment
     [#:rdf{:literal
              "Web-Seite von der die Projekt-Software heruntergeladen werden kann.",
       :lang "de"}
      #:rdf{:literal
              "Webová stránka, na které lze stáhnout projektový software.",
       :lang "cs"} "Web page from which the project software can be downloaded."
      #:rdf{:literal
              "Page web à partir de laquelle on peut télécharger le programme.",
       :lang "fr"}
      #:rdf{:literal "Página web de la cuál se puede bajar el software.",
       :lang "es"}],
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project})

(def file-release
  "URI of download associated with this release."
  {:rdfs/label [#:rdf{:literal "soubor revize", :lang "cs"} "file-release"],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Version,
   :rdfs/comment ["URI of download associated with this release."
                  #:rdf{:literal "URI adresa stažení asociované s revizí.",
                   :lang "cs"}],
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def helper
  "Project contributor."
  {:rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/range :foaf/Person,
   :rdfs/label ["helper" #:rdf{:literal "collaborateur", :lang "fr"}
                #:rdf{:literal "colaborador", :lang "es"}
                #:rdf{:literal "Helfer", :lang "de"}
                #:rdf{:literal "spoluautor", :lang "cs"}],
   :rdfs/comment [#:rdf{:literal "Spoluautor projektu.", :lang "cs"}
                  #:rdf{:literal "Projekt-Mitarbeiter.", :lang "de"}
                  #:rdf{:literal "Collaborateur au projet.", :lang "fr"}
                  "Project contributor."
                  #:rdf{:literal "Colaborador del proyecto.", :lang "es"}],
   :rdfs/domain :doap/Project})

(def homepage
  "URL of a project's homepage,\n\t\tassociated with exactly one project."
  {:rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/subPropertyOf :foaf/homepage,
   :rdfs/label [#:rdf{:literal "página web", :lang "es"}
                #:rdf{:literal "Homepage", :lang "de"} "homepage"
                #:rdf{:literal "domovská stránka", :lang "cs"}
                #:rdf{:literal "page web", :lang "fr"}],
   :rdfs/comment
     [#:rdf{:literal
              "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto.",
       :lang "es"}
      "URL of a project's homepage,\n\t\tassociated with exactly one project."
      #:rdf{:literal
              "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.",
       :lang "de"}
      #:rdf{:literal
              "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet.",
       :lang "fr"}
      #:rdf{:literal
              "URL adresa domovské stránky projektu asociované s právě jedním projektem.",
       :lang "cs"}],
   :rdfs/domain :doap/Project,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property]})

(def implements
  "A specification that a project implements. Could be a standard, API or legally defined level of conformance."
  {:rdfs/range :doap/Specification,
   :rdfs/label "Implements specification",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/comment
     "A specification that a project implements. Could be a standard, API or legally defined level of conformance.",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def language
  "ISO language code a project has been translated into"
  {:rdfs/label "language",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/comment "ISO language code a project has been translated into",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def license
  "The URI of an RDF description of the license the software is distributed under."
  {:rdf/type :rdf/Property,
   :rdfs/comment
     [#:rdf{:literal
              "L'URI d'une description RDF de la licence sous laquelle le programme est distribué.",
       :lang "fr"}
      #:rdf{:literal
              "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software.",
       :lang "es"}
      #:rdf{:literal
              "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird.",
       :lang "de"}
      #:rdf{:literal
              "URI adresa RDF popisu licence, pod kterou je software distribuován.",
       :lang "cs"}
      "The URI of an RDF description of the license the software is distributed under."],
   :rdfs/label [#:rdf{:literal "Lizenz", :lang "de"}
                #:rdf{:literal "licence", :lang "cs"}
                #:rdf{:literal "licence", :lang "fr"} "license"
                #:rdf{:literal "licencia", :lang "es"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def location
  "Location of a repository."
  {:rdfs/label ["repository location"
                #:rdf{:literal "umístění úložiště", :lang "cs"}
                #:rdf{:literal "lugar del respositorio", :lang "es"}
                #:rdf{:literal "emplacement du dépôt", :lang "fr"}
                #:rdf{:literal "Repository Lokation", :lang "de"}],
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment [#:rdf{:literal "Lokation eines Repositorys.", :lang "de"}
                  "Location of a repository."
                  #:rdf{:literal "lugar de un repositorio.", :lang "es"}
                  #:rdf{:literal "Emplacement d'un dépôt.", :lang "fr"}
                  #:rdf{:literal "Umístění úložiště.", :lang "cs"}],
   :rdfs/domain :doap/Repository,
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def mailing-list
  "Mailing list home page or email address."
  {:rdfs/label [#:rdf{:literal "lista de correo", :lang "es"} "mailing list"
                #:rdf{:literal "liste de diffusion", :lang "fr"}
                #:rdf{:literal "Mailing Liste", :lang "de"}
                #:rdf{:literal "e–mailová diskuse", :lang "cs"}],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
     [#:rdf{:literal
              "Domovská stránka nebo e–mailová adresa e–mailové diskuse.",
       :lang "cs"}
      #:rdf{:literal
              "Page web de la liste de diffusion, ou adresse de courriel.",
       :lang "fr"}
      #:rdf{:literal "Homepage der Mailing Liste oder E-Mail Adresse.",
       :lang "de"} "Mailing list home page or email address."
      #:rdf{:literal "Página web de la lista de correo o dirección de correo.",
       :lang "es"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project})

(def maintainer
  "Maintainer of a project, a project leader."
  {:rdfs/comment
     [#:rdf{:literal "Správce projektu, vedoucí projektu.", :lang "cs"}
      #:rdf{:literal "Développeur principal d'un projet, un meneur du projet.",
       :lang "fr"}
      #:rdf{:literal "Hauptentwickler eines Projektes, der Projektleiter",
       :lang "de"}
      #:rdf{:literal
              "Desarrollador principal de un proyecto, un líder de proyecto.",
       :lang "es"} "Maintainer of a project, a project leader."],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/label [#:rdf{:literal "Projektverantwortlicher", :lang "de"}
                #:rdf{:literal "développeur principal", :lang "fr"}
                #:rdf{:literal "správce", :lang "cs"} "maintainer"
                #:rdf{:literal "desarrollador principal", :lang "es"}],
   :rdfs/range :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project})

(def module
  "Module name of a Subversion, CVS, BitKeeper or Arch repository."
  {:rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/label [#:rdf{:literal "module", :lang "fr"} "module"
                #:rdf{:literal "modul", :lang "cs"}
                #:rdf{:literal "Modul", :lang "de"}
                #:rdf{:literal "módulo", :lang "es"}],
   :rdfs/comment
     [#:rdf{:literal
              "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch.",
       :lang "fr"}
      #:rdf{:literal
              "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys.",
       :lang "de"}
      #:rdf{:literal "Jméno modulu v CVS, BitKeeper nebo Arch úložišti.",
       :lang "cs"}
      "Module name of a Subversion, CVS, BitKeeper or Arch repository."
      #:rdf{:literal
              "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch.",
       :lang "es"}],
   :rdfs/domain {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository
                               :doap/BKRepository],
                 :rdf/type :owl/Class},
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def name
  "A name of something."
  {:rdfs/label [#:rdf{:literal "nombre", :lang "es"}
                #:rdf{:literal "nom", :lang "fr"}
                #:rdf{:literal "Name", :lang "de"} "name"
                #:rdf{:literal "jméno", :lang "cs"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment ["A name of something."
                  #:rdf{:literal "Der Name von Irgendwas", :lang "de"}
                  #:rdf{:literal "El nombre de algo.", :lang "es"}
                  #:rdf{:literal "Jméno něčeho.", :lang "cs"}
                  #:rdf{:literal "Le nom de quelque chose.", :lang "fr"}],
   :rdfs/subPropertyOf :rdfs/label})

(def old-homepage
  "URL of a project's past homepage,\n\t\tassociated with exactly one project."
  {:rdfs/label [#:rdf{:literal "stará domovská stránka", :lang "cs"}
                #:rdf{:literal "ancienne page web", :lang "fr"}
                #:rdf{:literal "Alte Homepage", :lang "de"} "old homepage"
                #:rdf{:literal "página web antigua", :lang "es"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/subPropertyOf :foaf/homepage,
   :rdfs/domain :doap/Project,
   :rdfs/comment
     [#:rdf{:literal
              "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem.",
       :lang "cs"}
      "URL of a project's past homepage,\n\t\tassociated with exactly one project."
      #:rdf{:literal
              "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet.",
       :lang "fr"}
      #:rdf{:literal
              "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.",
       :lang "de"}
      #:rdf{:literal
              "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto.",
       :lang "es"}]})

(def os
  "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."
  {:rdfs/label [#:rdf{:literal "operační systém", :lang "cs"}
                #:rdf{:literal "système d'exploitation", :lang "fr"}
                #:rdf{:literal "Betriebssystem", :lang "de"}
                #:rdf{:literal "sistema operativo", :lang "es"}
                "operating system"],
   :rdfs/comment
     [#:rdf{:literal
              "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation.",
       :lang "fr"}
      #:rdf{:literal
              "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular.",
       :lang "es"}
      #:rdf{:literal
              "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist.",
       :lang "de"}
      #:rdf{:literal
              "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému.",
       :lang "cs"}
      "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."],
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain [:doap/Project :doap/Version]})

(def platform
  "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"
  {:rdfs/label "platform",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/comment
     "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR",
   :rdf/type [:owl/DatatypeProperty :rdf/Property]})

(def programming-language
  "Programming language a project is implemented in or intended for use with."
  {:rdfs/comment
     ["Programming language a project is implemented in or intended for use with."
      #:rdf{:literal
              "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse.",
       :lang "es"}
      #:rdf{:literal
              "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen.",
       :lang "de"}
      #:rdf{:literal
              "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser.",
       :lang "fr"}
      #:rdf{:literal
              "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití.",
       :lang "cs"}],
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/label [#:rdf{:literal "programovací jazyk", :lang "cs"}
                #:rdf{:literal "langage de programmation", :lang "fr"}
                "programming language"
                #:rdf{:literal "lenguaje de programación", :lang "es"}
                #:rdf{:literal "Programmiersprache", :lang "de"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project})

(def release
  "A project release."
  {:rdfs/comment
     [#:rdf{:literal "Une release (révision) d'un projet.", :lang "fr"}
      #:rdf{:literal "Un release (versión) de un proyecto.", :lang "es"}
      "A project release."
      #:rdf{:literal "Relase (verze) projektu.", :lang "cs"}
      #:rdf{:literal "Ein Release (Version) eines Projekts.", :lang "de"}],
   :rdfs/label [#:rdf{:literal "Release", :lang "de"}
                #:rdf{:literal "release", :lang "fr"}
                #:rdf{:literal "release", :lang "es"} "release"
                #:rdf{:literal "release", :lang "cs"}],
   :rdfs/range :doap/Version,
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :doap/Project})

(def repository
  "Source code repository."
  {:rdfs/comment [#:rdf{:literal "Repositorio del código fuente.", :lang "es"}
                  "Source code repository."
                  #:rdf{:literal "Úložiště zdrojových kódů.", :lang "cs"}
                  #:rdf{:literal "Dépôt du code source.", :lang "fr"}
                  #:rdf{:literal "Quellcode-Versionierungssystem.",
                   :lang "de"}],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label ["repository" #:rdf{:literal "repositorio", :lang "es"}
                #:rdf{:literal "dépôt", :lang "fr"}
                #:rdf{:literal "Repository", :lang "de"}
                #:rdf{:literal "úložiště", :lang "cs"}],
   :rdfs/range :doap/Repository,
   :rdfs/domain :doap/Project})

(def revision
  "Revision identifier of a software release."
  {:rdfs/comment
     ["Revision identifier of a software release."
      #:rdf{:literal "Indentificador de la versión de un release de software.",
       :lang "es"}
      #:rdf{:literal "Identifikátor zpřístupněné revize softwaru.", :lang "cs"}
      #:rdf{:literal "Versionsidentifikator eines Software-Releases.",
       :lang "de"}
      #:rdf{:literal "Identifiant de révision d'une release du programme.",
       :lang "fr"}],
   :rdfs/label [#:rdf{:literal "Version", :lang "de"} "revision"
                #:rdf{:literal "révision", :lang "fr"}
                #:rdf{:literal "versión", :lang "es"}
                #:rdf{:literal "verze", :lang "cs"}],
   :rdfs/domain :doap/Version,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def screenshots
  "Web page with screenshots of project."
  {:rdfs/domain :doap/Project,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/label [#:rdf{:literal "snímek obrazovky", :lang "cs"}
                #:rdf{:literal "Screenshots", :lang "de"} "screenshots"
                #:rdf{:literal "captures d'écran", :lang "fr"}
                #:rdf{:literal "capturas de pantalla", :lang "es"}],
   :rdfs/comment
     ["Web page with screenshots of project."
      #:rdf{:literal "Página web con capturas de pantalla del proyecto.",
       :lang "es"}
      #:rdf{:literal "Page web avec des captures d'écran du projet.",
       :lang "fr"}
      #:rdf{:literal "Webová stránka projektu se snímky obrazovky.", :lang "cs"}
      #:rdf{:literal "Web-Seite mit Screenshots eines Projektes.", :lang "de"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:rdfs/label "service endpoint",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/comment
     "The URI of a web service endpoint where software as a service may be accessed",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def shortdesc
  "Short (8 or 9 words) plain text description of a project."
  {:rdfs/label [#:rdf{:literal "Kurzbeschreibung", :lang "de"}
                #:rdf{:literal "description courte", :lang "fr"}
                #:rdf{:literal "descripción corta", :lang "es"}
                #:rdf{:literal "krátký popis", :lang "cs"} "short description"],
   :rdfs/comment
     [#:rdf{:literal
              "Descripción corta (8 o 9 palabras) en texto plano de un proyecto.",
       :lang "es"} "Short (8 or 9 words) plain text description of a project."
      #:rdf{:literal "Krátký (8 nebo 9 slov) čistě textový popis projektu.",
       :lang "cs"}
      #:rdf{:literal
              "Kurzbeschreibung (8 oder 9 Wörter) eines Projects als einfacher Text.",
       :lang "de"}
      #:rdf{:literal "Texte descriptif concis (8 ou 9 mots) d'un projet.",
       :lang "fr"}],
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def tester
  "A tester or other quality control contributor."
  {:rdfs/label [#:rdf{:literal "testeur", :lang "fr"}
                #:rdf{:literal "Tester", :lang "de"}
                #:rdf{:literal "tester", :lang "es"} "tester"
                #:rdf{:literal "tester", :lang "cs"}],
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/range :foaf/Person,
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/comment
     [#:rdf{:literal "Tester nebo jiný spoluautor kontrolující kvalitu.",
       :lang "cs"}
      #:rdf{:literal "Un testeur ou un collaborateur au contrôle qualité.",
       :lang "fr"}
      #:rdf{:literal
              "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle.",
       :lang "de"} "A tester or other quality control contributor."
      #:rdf{:literal "Un tester u otro proveedor de control de calidad.",
       :lang "es"}]})

(def translator
  "Contributor of translations to the project."
  {:rdfs/label [#:rdf{:literal "traductor", :lang "es"} "translator"
                #:rdf{:literal "Übersetzer", :lang "de"}
                #:rdf{:literal "traducteur", :lang "fr"}
                #:rdf{:literal "překladatel", :lang "cs"}],
   :rdfs/range :foaf/Person,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
     [#:rdf{:literal "Proveedor de traducciones al proyecto.", :lang "es"}
      #:rdf{:literal "Mitarbeiter an den Übersetzungen eines Projektes.",
       :lang "de"} "Contributor of translations to the project."
      #:rdf{:literal "Collaborateur à la traduction du projet.", :lang "fr"}
      #:rdf{:literal "Spoluautor překladu projektu.", :lang "cs"}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"}})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:rdfs/range :foaf/Organization,
   :rdfs/label "vendor",
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdfs/domain :doap/Project,
   :rdfs/comment "Vendor organization: commercial, free or otherwise",
   :rdf/type [:owl/ObjectProperty :rdf/Property]})

(def wiki
  "URL of Wiki for collaborative discussion of project."
  {:rdfs/comment
     [#:rdf{:literal
              "L'URL du Wiki pour la discussion collaborative sur le projet.",
       :lang "fr"} "URL of Wiki for collaborative discussion of project."
      #:rdf{:literal
              "Wiki-URL für die kollaborative Dikussion eines Projektes.",
       :lang "de"}
      #:rdf{:literal "URL adresa wiki projektu pro společné diskuse.",
       :lang "cs"}
      #:rdf{:literal "URL del Wiki para discusión colaborativa del proyecto.",
       :lang "es"}],
   :rdfs/label [#:rdf{:literal "Wiki", :lang "de"}
                #:rdf{:literal "wiki", :lang "fr"}
                #:rdf{:literal "wiki", :lang "es"} "wiki"
                #:rdf{:literal "wiki", :lang "cs"}],
   :rdfs/isDefinedBy #:rdf{:uri "http://usefulinc.com/ns/doap#"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain :doap/Project})