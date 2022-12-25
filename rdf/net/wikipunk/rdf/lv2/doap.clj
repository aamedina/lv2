(ns net.wikipunk.rdf.lv2.doap
  "Description of a Project (DOAP) vocabulary"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/doap.ttl",
   :dcterms/title "Description of a Project (DOAP) vocabulary",
   :foaf/maker {:foaf/mbox {:rdf/uri "mailto:edd@usefulinc.com"},
                :foaf/name "Edd Dumbill",
                :rdf/type  :foaf/Person},
   :lv2/project nil,
   :owl/imports {:rdf/uri "http://xmlns.com/foaf/0.1/"},
   :rdf/about {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "doap"    "http://usefulinc.com/ns/doap#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   ["The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
    {:rdf/lang "cs",
     :rdf/literal
     "Slovník Description of a Project (DOAP, Popis projektu), popsaný použitím W3C RDF Schema a Web Ontology Language."}
    {:rdf/lang "fr",
     :rdf/literal
     "Le vocabulaire Description Of A Project (DOAP, Description D'Un Projet),\n\t\tdécrit en utilisant RDF Schema du W3C et OWL."}
    {:rdf/lang "es",
     :rdf/literal
     "El vocabulario Description of a Project (DOAP, Descripción de un Proyecto), descrito usando RDF Schema de W3C\n\t\ty Web Ontology Language."}
    {:rdf/lang "de",
     :rdf/literal
     "Das Vokabular \"Description of a Project (DOAP)\", beschrieben durch W3C RDF Schema and the Web Ontology Language."}],
   :vann/preferredNamespacePrefix "doap",
   :vann/preferredNamespaceUri "http://usefulinc.com/ns/doap#"}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  "GNU Arch source code repository."
  {:rdf/about        :doap/ArchRepository,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     ["GNU Arch source code repository."
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště zdrojových kódů GNU Arch."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt GNU Arch du code source."}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio GNU Arch del código fuente."}
                      {:rdf/lang "de",
                       :rdf/literal
                       "GNU Arch Quellcode-Versionierungssystem."}],
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
   :rdfs/comment     [{:rdf/lang    "fr",
                       :rdf/literal "Dépôt BitKeeper du code source."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště zdrojových kódů BitKeeper."}
                      {:rdf/lang    "de",
                       :rdf/literal "BitKeeper Quellcode-Versionierungssystem."}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio BitKeeper del código fuente."}
                      "BitKeeper source code repository."],
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
   :rdfs/comment     "Bazaar source code branch.",
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Bazaar Branch",
   :rdfs/subClassOf  :doap/Repository})

(def CVSRepository
  "CVS source code repository."
  {:rdf/about        :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [{:rdf/lang    "fr",
                       :rdf/literal "Dépôt CVS du code source."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště zdrojových kódů CVS."}
                      {:rdf/lang    "de",
                       :rdf/literal "CVS Quellcode-Versionierungssystem."}
                      "CVS source code repository."
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio CVS del código fuente."}],
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
   :rdfs/comment     ["darcs source code repository."
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio darcs del código fuente."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt darcs du code source."}],
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
   :rdfs/comment     "Git source code branch.",
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Git Branch",
   :rdfs/subClassOf  :doap/Repository})

(def HgRepository
  "Mercurial source code repository."
  {:rdf/about        :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "Mercurial source code repository.",
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "Mercurial Repository",
   :rdfs/subClassOf  :doap/Repository})

(def Project
  "A project."
  {:rdf/about        :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/lang    "cs",
                       :rdf/literal "Projekt."}
                      {:rdf/lang    "es",
                       :rdf/literal "Un proyecto."}
                      {:rdf/lang    "de",
                       :rdf/literal "Ein Projekt."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Un projet."}
                      "A project."],
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
   :rdfs/comment     ["Source code repository."
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt du code source."}
                      {:rdf/lang    "de",
                       :rdf/literal "Quellcode-Versionierungssystem."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště zdrojových kódů."}
                      {:rdf/lang    "es",
                       :rdf/literal "Repositorio del código fuente."}],
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
   :rdfs/comment     ["Subversion source code repository."
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště zdrojových kódů Subversion."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt Subversion du code source."}
                      {:rdf/lang "de",
                       :rdf/literal
                       "Subversion Quellcode-Versionierungssystem."}
                      {:rdf/lang "es",
                       :rdf/literal
                       "Repositorio Subversion del código fuente."}],
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
  {:rdf/about :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A specification of a system's aspects, technical or otherwise.",
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label "Specification"})

(def Version
  "Version information of a project release."
  {:rdf/about :doap/Version,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [{:rdf/lang    "es",
     :rdf/literal "Información sobre la versión de un release del proyecto."}
    {:rdf/lang    "fr",
     :rdf/literal "Détails sur une version d'une realease d'un projet."}
    {:rdf/lang    "cs",
     :rdf/literal "Informace o uvolněné verzi projektu."}
    "Version information of a project release."
    {:rdf/lang    "de",
     :rdf/literal "Versionsinformation eines Projekt Releases."}],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label ["Version"
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
   :rdfs/comment     "Description of target user base",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "audience"})

(def blog
  "URI of a blog related to a project"
  {:rdf/about        :doap/blog,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "URI of a blog related to a project",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "blog"})

(def browse
  "Web browser interface to repository."
  {:rdf/about        :doap/browse,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/lang    "cs",
                       :rdf/literal "Webové rozhraní pro prohlížení úložiště."}
                      "Web browser interface to repository."
                      {:rdf/lang    "fr",
                       :rdf/literal "Interface web au dépôt."}
                      {:rdf/lang    "es",
                       :rdf/literal "Interface web del repositorio."}
                      {:rdf/lang "de",
                       :rdf/literal
                       "Web-Browser Interface für das Repository."}],
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
   :rdfs/comment     [{:rdf/lang    "fr",
                       :rdf/literal "Suivi des bugs pour un projet."}
                      "Bug tracker for a project."
                      {:rdf/lang    "de",
                       :rdf/literal "Fehlerdatenbank eines Projektes."}
                      {:rdf/lang    "es",
                       :rdf/literal "Bug tracker para un proyecto."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Správa chyb projektu."}],
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
   :rdfs/comment     [{:rdf/lang    "de",
                       :rdf/literal "Eine Kategorie eines Projektes."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Kategorie projektu."}
                      "A category of project."
                      {:rdf/lang    "es",
                       :rdf/literal "Una categoría de proyecto."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Une catégorie de projet."}],
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
  {:rdf/about :doap/created,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/lang "de",
     :rdf/literal
     "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05."}
    {:rdf/lang "cs",
     :rdf/literal
     "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05"}
    {:rdf/lang "es",
     :rdf/literal
     "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05"}
    "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"
    {:rdf/lang "fr",
     :rdf/literal
     "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)"}],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label ["created"
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
  {:rdf/about :doap/description,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/lang    "cs",
     :rdf/literal "Čistě textový, 2 až 4 věty dlouhý popis projektu."}
    {:rdf/lang    "fr",
     :rdf/literal "Texte descriptif d'un projet, long de 2 à 4 phrases."}
    {:rdf/lang "es",
     :rdf/literal
     "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud."}
    {:rdf/lang "de",
     :rdf/literal
     "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen."}
    "Plain text description of a project, of 2-4 sentences in length."],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "es",
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
   :rdfs/comment     [{:rdf/lang    "cs",
                       :rdf/literal "Vývojář softwaru projektu."}
                      {:rdf/lang "es",
                       :rdf/literal
                       "Desarrollador de software para el proyecto."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Développeur pour le projet."}
                      "Developer of software for the project."
                      {:rdf/lang    "de",
                       :rdf/literal "Software-Entwickler für eine Projekt."}],
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
   :rdfs/comment     [{:rdf/lang "es",
                       :rdf/literal
                       "Proveedor de documentación para el proyecto."}
                      {:rdf/lang "fr",
                       :rdf/literal
                       "Collaborateur à la documentation du projet."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Spoluautor dokumentace projektu."}
                      "Contributor of documentation to the project."
                      {:rdf/lang "de",
                       :rdf/literal
                       "Mitarbeiter an der Dokumentation eines Projektes."}],
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
  {:rdf/about :doap/download-mirror,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   ["Mirror of software download web page."
    {:rdf/lang "de",
     :rdf/literal
     "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann."}
    {:rdf/lang    "cs",
     :rdf/literal "Zrcadlo stránky pro stažení softwaru."}
    {:rdf/lang    "fr",
     :rdf/literal "Miroir de la page de téléchargement du programme."}
    {:rdf/lang    "es",
     :rdf/literal "Mirror de la página web de descarga."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "cs",
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
  {:rdf/about :doap/download-page,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/lang "de",
     :rdf/literal
     "Web-Seite von der die Projekt-Software heruntergeladen werden kann."}
    {:rdf/lang    "cs",
     :rdf/literal "Webová stránka, na které lze stáhnout projektový software."}
    "Web page from which the project software can be downloaded."
    {:rdf/lang "fr",
     :rdf/literal
     "Page web à partir de laquelle on peut télécharger le programme."}
    {:rdf/lang    "es",
     :rdf/literal "Página web de la cuál se puede bajar el software."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "cs",
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
   :rdfs/comment     ["URI of download associated with this release."
                      {:rdf/lang    "cs",
                       :rdf/literal "URI adresa stažení asociované s revizí."}],
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [{:rdf/lang    "cs",
                       :rdf/literal "soubor revize"}
                      "file-release"]})

(def helper
  "Project contributor."
  {:rdf/about        :doap/helper,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     [{:rdf/lang    "cs",
                       :rdf/literal "Spoluautor projektu."}
                      {:rdf/lang    "de",
                       :rdf/literal "Projekt-Mitarbeiter."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Collaborateur au projet."}
                      "Project contributor."
                      {:rdf/lang    "es",
                       :rdf/literal "Colaborador del proyecto."}],
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
  "URL of a project's homepage,   associated with exactly one project."
  {:rdf/about :doap/homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/lang "es",
     :rdf/literal
     "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto."}
    "URL of a project's homepage,\n\t\tassociated with exactly one project."
    {:rdf/lang "de",
     :rdf/literal
     "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
    {:rdf/lang "fr",
     :rdf/literal
     "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet."}
    {:rdf/lang "cs",
     :rdf/literal
     "URL adresa domovské stránky projektu asociované s právě jedním projektem."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "es",
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
  {:rdf/about :doap/implements,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A specification that a project implements. Could be a standard, API or legally defined level of conformance.",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label "Implements specification",
   :rdfs/range :doap/Specification})

(def language
  "ISO language code a project has been translated into"
  {:rdf/about        :doap/language,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "ISO language code a project has been translated into",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "language"})

(def license
  "The URI of an RDF description of the license the software is distributed under."
  {:rdf/about :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/lang "fr",
     :rdf/literal
     "L'URI d'une description RDF de la licence sous laquelle le programme est distribué."}
    {:rdf/lang "es",
     :rdf/literal
     "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software."}
    {:rdf/lang "de",
     :rdf/literal
     "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird."}
    {:rdf/lang "cs",
     :rdf/literal
     "URI adresa RDF popisu licence, pod kterou je software distribuován."}
    "The URI of an RDF description of the license the software is distributed under."],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "de",
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
   :rdfs/comment     [{:rdf/lang    "de",
                       :rdf/literal "Lokation eines Repositorys."}
                      "Location of a repository."
                      {:rdf/lang    "es",
                       :rdf/literal "lugar de un repositorio."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Emplacement d'un dépôt."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Umístění úložiště."}],
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
  {:rdf/about :doap/mailing-list,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/lang    "cs",
     :rdf/literal "Domovská stránka nebo e–mailová adresa e–mailové diskuse."}
    {:rdf/lang    "fr",
     :rdf/literal "Page web de la liste de diffusion, ou adresse de courriel."}
    {:rdf/lang    "de",
     :rdf/literal "Homepage der Mailing Liste oder E-Mail Adresse."}
    "Mailing list home page or email address."
    {:rdf/lang    "es",
     :rdf/literal "Página web de la lista de correo o dirección de correo."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "es",
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
  {:rdf/about :doap/maintainer,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/lang    "cs",
     :rdf/literal "Správce projektu, vedoucí projektu."}
    {:rdf/lang    "fr",
     :rdf/literal "Développeur principal d'un projet, un meneur du projet."}
    {:rdf/lang    "de",
     :rdf/literal "Hauptentwickler eines Projektes, der Projektleiter"}
    {:rdf/lang "es",
     :rdf/literal
     "Desarrollador principal de un proyecto, un líder de proyecto."}
    "Maintainer of a project, a project leader."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "de",
                 :rdf/literal "Projektverantwortlicher"}
                {:rdf/lang    "fr",
                 :rdf/literal "développeur principal"}
                {:rdf/lang    "cs",
                 :rdf/literal "správce"}
                "maintainer"
                {:rdf/lang    "es",
                 :rdf/literal "desarrollador principal"}],
   :rdfs/range :foaf/Person})

(def module
  "Module name of a Subversion, CVS, BitKeeper or Arch repository."
  {:rdf/about :doap/module,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/lang "fr",
     :rdf/literal
     "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch."}
    {:rdf/lang "de",
     :rdf/literal
     "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys."}
    {:rdf/lang    "cs",
     :rdf/literal "Jméno modulu v CVS, BitKeeper nebo Arch úložišti."}
    "Module name of a Subversion, CVS, BitKeeper or Arch repository."
    {:rdf/lang "es",
     :rdf/literal
     "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch."}],
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "fr",
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
   :rdfs/comment       ["A name of something."
                        {:rdf/lang    "de",
                         :rdf/literal "Der Name von Irgendwas"}
                        {:rdf/lang    "es",
                         :rdf/literal "El nombre de algo."}
                        {:rdf/lang    "cs",
                         :rdf/literal "Jméno něčeho."}
                        {:rdf/lang    "fr",
                         :rdf/literal "Le nom de quelque chose."}],
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
  "URL of a project's past homepage,   associated with exactly one project."
  {:rdf/about :doap/old-homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/lang "cs",
     :rdf/literal
     "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem."}
    "URL of a project's past homepage,\n\t\tassociated with exactly one project."
    {:rdf/lang "fr",
     :rdf/literal
     "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet."}
    {:rdf/lang "de",
     :rdf/literal
     "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
    {:rdf/lang "es",
     :rdf/literal
     "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "cs",
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
  {:rdf/about :doap/os,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/lang "fr",
     :rdf/literal
     "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation."}
    {:rdf/lang "es",
     :rdf/literal
     "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular."}
    {:rdf/lang "de",
     :rdf/literal
     "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist."}
    {:rdf/lang "cs",
     :rdf/literal
     "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému."}
    "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."],
   :rdfs/domain [:doap/Project :doap/Version],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "cs",
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
  {:rdf/about :doap/platform,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR",
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label "platform"})

(def programming-language
  "Programming language a project is implemented in or intended for use with."
  {:rdf/about :doap/programming-language,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   ["Programming language a project is implemented in or intended for use with."
    {:rdf/lang "es",
     :rdf/literal
     "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse."}
    {:rdf/lang "de",
     :rdf/literal
     "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen."}
    {:rdf/lang "fr",
     :rdf/literal
     "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser."}
    {:rdf/lang "cs",
     :rdf/literal
     "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "cs",
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
   :rdfs/comment     [{:rdf/lang    "fr",
                       :rdf/literal "Une release (révision) d'un projet."}
                      {:rdf/lang    "es",
                       :rdf/literal "Un release (versión) de un proyecto."}
                      "A project release."
                      {:rdf/lang    "cs",
                       :rdf/literal "Relase (verze) projektu."}
                      {:rdf/lang    "de",
                       :rdf/literal "Ein Release (Version) eines Projekts."}],
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
   :rdfs/comment     [{:rdf/lang    "es",
                       :rdf/literal "Repositorio del código fuente."}
                      "Source code repository."
                      {:rdf/lang    "cs",
                       :rdf/literal "Úložiště zdrojových kódů."}
                      {:rdf/lang    "fr",
                       :rdf/literal "Dépôt du code source."}
                      {:rdf/lang    "de",
                       :rdf/literal "Quellcode-Versionierungssystem."}],
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
  {:rdf/about :doap/revision,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   ["Revision identifier of a software release."
    {:rdf/lang    "es",
     :rdf/literal "Indentificador de la versión de un release de software."}
    {:rdf/lang    "cs",
     :rdf/literal "Identifikátor zpřístupněné revize softwaru."}
    {:rdf/lang    "de",
     :rdf/literal "Versionsidentifikator eines Software-Releases."}
    {:rdf/lang    "fr",
     :rdf/literal "Identifiant de révision d'une release du programme."}],
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "de",
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
   :rdfs/comment     ["Web page with screenshots of project."
                      {:rdf/lang "es",
                       :rdf/literal
                       "Página web con capturas de pantalla del proyecto."}
                      {:rdf/lang "fr",
                       :rdf/literal
                       "Page web avec des captures d'écran du projet."}
                      {:rdf/lang "cs",
                       :rdf/literal
                       "Webová stránka projektu se snímky obrazovky."}
                      {:rdf/lang "de",
                       :rdf/literal
                       "Web-Seite mit Screenshots eines Projektes."}],
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
  {:rdf/about :doap/service-endpoint,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "The URI of a web service endpoint where software as a service may be accessed",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label "service endpoint"})

(def shortdesc
  "Short (8 or 9 words) plain text description of a project."
  {:rdf/about :doap/shortdesc,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/lang "es",
     :rdf/literal
     "Descripción corta (8 o 9 palabras) en texto plano de un proyecto."}
    "Short (8 or 9 words) plain text description of a project."
    {:rdf/lang    "cs",
     :rdf/literal "Krátký (8 nebo 9 slov) čistě textový popis projektu."}
    {:rdf/lang "de",
     :rdf/literal
     "Kurzbeschreibung (8 oder 9 Wörter) eines Projects als einfacher Text."}
    {:rdf/lang    "fr",
     :rdf/literal "Texte descriptif concis (8 ou 9 mots) d'un projet."}],
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "de",
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
  {:rdf/about :doap/tester,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/lang    "cs",
     :rdf/literal "Tester nebo jiný spoluautor kontrolující kvalitu."}
    {:rdf/lang    "fr",
     :rdf/literal "Un testeur ou un collaborateur au contrôle qualité."}
    {:rdf/lang    "de",
     :rdf/literal "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle."}
    "A tester or other quality control contributor."
    {:rdf/lang    "es",
     :rdf/literal "Un tester u otro proveedor de control de calidad."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "fr",
                 :rdf/literal "testeur"}
                {:rdf/lang    "de",
                 :rdf/literal "Tester"}
                {:rdf/lang    "es",
                 :rdf/literal "tester"}
                "tester"
                {:rdf/lang    "cs",
                 :rdf/literal "tester"}],
   :rdfs/range :foaf/Person})

(def translator
  "Contributor of translations to the project."
  {:rdf/about        :doap/translator,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     [{:rdf/lang    "es",
                       :rdf/literal "Proveedor de traducciones al proyecto."}
                      {:rdf/lang "de",
                       :rdf/literal
                       "Mitarbeiter an den Übersetzungen eines Projektes."}
                      "Contributor of translations to the project."
                      {:rdf/lang    "fr",
                       :rdf/literal "Collaborateur à la traduction du projet."}
                      {:rdf/lang    "cs",
                       :rdf/literal "Spoluautor překladu projektu."}],
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
   :rdfs/comment     "Vendor organization: commercial, free or otherwise",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       "vendor",
   :rdfs/range       :foaf/Organization})

(def wiki
  "URL of Wiki for collaborative discussion of project."
  {:rdf/about :doap/wiki,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/lang "fr",
     :rdf/literal
     "L'URL du Wiki pour la discussion collaborative sur le projet."}
    "URL of Wiki for collaborative discussion of project."
    {:rdf/lang    "de",
     :rdf/literal "Wiki-URL für die kollaborative Dikussion eines Projektes."}
    {:rdf/lang    "cs",
     :rdf/literal "URL adresa wiki projektu pro společné diskuse."}
    {:rdf/lang    "es",
     :rdf/literal "URL del Wiki para discusión colaborativa del proyecto."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdf/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [{:rdf/lang    "de",
                 :rdf/literal "Wiki"}
                {:rdf/lang    "fr",
                 :rdf/literal "wiki"}
                {:rdf/lang    "es",
                 :rdf/literal "wiki"}
                "wiki"
                {:rdf/lang    "cs",
                 :rdf/literal "wiki"}]})