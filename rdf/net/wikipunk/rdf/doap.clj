(ns net.wikipunk.rdf.doap
  "Description of a Project (DOAP) vocabulary"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/doap.ttl",
   :dcterms/title "Description of a Project (DOAP) vocabulary",
   :foaf/maker {:foaf/mbox "mailto:edd@usefulinc.com",
                :foaf/name "Edd Dumbill",
                :rdf/type  :foaf/Person},
   :owl/imports "http://xmlns.com/foaf/0.1/",
   :rdf/about "http://usefulinc.com/ns/doap#",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "doap"    "http://usefulinc.com/ns/doap#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "doap",
   :rdfa/uri "http://usefulinc.com/ns/doap#",
   :rdfs/comment
   ["The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
    {:rdf/language "cs",
     :rdf/value
     "Slovník Description of a Project (DOAP, Popis projektu), popsaný použitím W3C RDF Schema a Web Ontology Language."}
    {:rdf/language "fr",
     :rdf/value
     "Le vocabulaire Description Of A Project (DOAP, Description D'Un Projet),\n\t\tdécrit en utilisant RDF Schema du W3C et OWL."}
    {:rdf/language "es",
     :rdf/value
     "El vocabulario Description of a Project (DOAP, Descripción de un Proyecto), descrito usando RDF Schema de W3C\n\t\ty Web Ontology Language."}
    {:rdf/language "de",
     :rdf/value
     "Das Vokabular \"Description of a Project (DOAP)\", beschrieben durch W3C RDF Schema and the Web Ontology Language."}]}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  {:rdf/about        :doap/ArchRepository,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "GNU Arch source code repository."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů GNU Arch."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt GNU Arch du code source."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio GNU Arch del código fuente."}
                      {:rdf/language "de",
                       :rdf/value "GNU Arch Quellcode-Versionierungssystem."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "Dépôt GNU Arch"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio GNU Arch"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště GNU Arch"}
                      {:rdf/language "en",
                       :rdf/value    "GNU Arch repository"}
                      {:rdf/language "de",
                       :rdf/value    "GNU Arch repository"}],
   :rdfs/subClassOf  :doap/Repository})

(def BKRepository
  {:rdf/about        :doap/BKRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Dépôt BitKeeper du code source."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů BitKeeper."}
                      {:rdf/language "de",
                       :rdf/value "BitKeeper Quellcode-Versionierungssystem."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio BitKeeper del código fuente."}
                      {:rdf/language "en",
                       :rdf/value    "BitKeeper source code repository."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "BitKeeper Repository"}
                      {:rdf/language "en",
                       :rdf/value    "BitKeeper Repository"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt BitKeeper"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště BitKeeper"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio BitKeeper"}],
   :rdfs/subClassOf  :doap/Repository})

(def BazaarBranch
  "Bazaar source code branch."
  {:rdf/about        :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Bazaar source code branch."},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Bazaar Branch"},
   :rdfs/subClassOf  :doap/Repository})

(def CVSRepository
  {:rdf/about        :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Dépôt CVS du code source."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů CVS."}
                      {:rdf/language "de",
                       :rdf/value    "CVS Quellcode-Versionierungssystem."}
                      {:rdf/language "en",
                       :rdf/value    "CVS source code repository."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio CVS del código fuente."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "CVS Repository"}
                      {:rdf/language "en",
                       :rdf/value    "CVS Repository"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště CVS"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt CVS"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio CVS"}],
   :rdfs/subClassOf  :doap/Repository})

(def DarcsRepository
  {:rdf/about        :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "darcs source code repository."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio darcs del código fuente."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt darcs du code source."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "darcs Repository"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio darcs"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt darcs"}],
   :rdfs/subClassOf  :doap/Repository})

(def GitBranch
  "Git source code branch."
  {:rdf/about        :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Git source code branch."},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Git Branch"},
   :rdfs/subClassOf  :doap/Repository})

(def HgRepository
  "Mercurial source code repository."
  {:rdf/about        :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Mercurial source code repository."},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mercurial Repository"},
   :rdfs/subClassOf  :doap/Repository})

(def Project
  {:rdf/about        :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "cs",
                       :rdf/value    "Projekt."}
                      {:rdf/language "es",
                       :rdf/value    "Un proyecto."}
                      {:rdf/language "de",
                       :rdf/value    "Ein Projekt."}
                      {:rdf/language "fr",
                       :rdf/value    "Un projet."}
                      {:rdf/language "en",
                       :rdf/value    "A project."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "es",
                       :rdf/value    "Proyecto"}
                      {:rdf/language "fr",
                       :rdf/value    "Projet"}
                      {:rdf/language "en",
                       :rdf/value    "Project"}
                      {:rdf/language "cs",
                       :rdf/value    "Projekt"}
                      {:rdf/language "de",
                       :rdf/value    "Prijekt"}],
   :rdfs/subClassOf  :foaf/Project})

(def Repository
  {:rdf/about        :doap/Repository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "Source code repository."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt du code source."}
                      {:rdf/language "de",
                       :rdf/value    "Quellcode-Versionierungssystem."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů."}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio del código fuente."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "cs",
                       :rdf/value    "Úložiště"}
                      {:rdf/language "en",
                       :rdf/value    "Repository"}
                      {:rdf/language "de",
                       :rdf/value    "Repository"}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio"}]})

(def SVNRepository
  {:rdf/about        :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "Subversion source code repository."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů Subversion."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt Subversion du code source."}
                      {:rdf/language "de",
                       :rdf/value "Subversion Quellcode-Versionierungssystem."}
                      {:rdf/language "es",
                       :rdf/value "Repositorio Subversion del código fuente."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "Dépôt Subversion"}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště Subversion"}
                      {:rdf/language "en",
                       :rdf/value    "Subversion Repository"}
                      {:rdf/language "de",
                       :rdf/value    "Subversion Repository"}
                      {:rdf/language "es",
                       :rdf/value    "Repositorio Subversion"}],
   :rdfs/subClassOf  :doap/Repository})

(def Specification
  "A specification of a system's aspects, technical or otherwise."
  {:rdf/about :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specification of a system's aspects, technical or otherwise."},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Specification"}})

(def Version
  {:rdf/about :doap/Version,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value    "Información sobre la versión de un release del proyecto."}
    {:rdf/language "fr",
     :rdf/value    "Détails sur une version d'une realease d'un projet."}
    {:rdf/language "cs",
     :rdf/value    "Informace o uvolněné verzi projektu."}
    {:rdf/language "en",
     :rdf/value    "Version information of a project release."}
    {:rdf/language "de",
     :rdf/value    "Versionsinformation eines Projekt Releases."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Version"}
                {:rdf/language "de",
                 :rdf/value    "Version"}
                {:rdf/language "fr",
                 :rdf/value    "Version"}
                {:rdf/language "cs",
                 :rdf/value    "Verze"}
                {:rdf/language "es",
                 :rdf/value    "Versión"}]})

(def audience
  "Description of target user base"
  {:rdf/about        :doap/audience,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Description of target user base"},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "audience"}})

(def blog
  "URI of a blog related to a project"
  {:rdf/about        :doap/blog,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "URI of a blog related to a project"},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "blog"}})

(def browse
  {:rdf/about        :doap/browse,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/language "cs",
                       :rdf/value    "Webové rozhraní pro prohlížení úložiště."}
                      {:rdf/language "en",
                       :rdf/value    "Web browser interface to repository."}
                      {:rdf/language "fr",
                       :rdf/value    "Interface web au dépôt."}
                      {:rdf/language "es",
                       :rdf/value    "Interface web del repositorio."}
                      {:rdf/language "de",
                       :rdf/value "Web-Browser Interface für das Repository."}],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "browse"}
                      {:rdf/language "es",
                       :rdf/value    "navegar"}
                      {:rdf/language "fr",
                       :rdf/value    "visualiser"}
                      {:rdf/language "cs",
                       :rdf/value    "prohlížeč"}
                      {:rdf/language "en",
                       :rdf/value    "browse"}]})

(def bug-database
  {:rdf/about        :doap/bug-database,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Suivi des bugs pour un projet."}
                      {:rdf/language "en",
                       :rdf/value    "Bug tracker for a project."}
                      {:rdf/language "de",
                       :rdf/value    "Fehlerdatenbank eines Projektes."}
                      {:rdf/language "es",
                       :rdf/value    "Bug tracker para un proyecto."}
                      {:rdf/language "cs",
                       :rdf/value    "Správa chyb projektu."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "cs",
                       :rdf/value    "databáze chyb"}
                      {:rdf/language "fr",
                       :rdf/value    "suivi des bugs"}
                      {:rdf/language "de",
                       :rdf/value    "Fehlerdatenbank"}
                      {:rdf/language "en",
                       :rdf/value    "bug database"}
                      {:rdf/language "es",
                       :rdf/value    "base de datos de bugs"}]})

(def category
  {:rdf/about        :doap/category,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/language "de",
                       :rdf/value    "Eine Kategorie eines Projektes."}
                      {:rdf/language "cs",
                       :rdf/value    "Kategorie projektu."}
                      {:rdf/language "en",
                       :rdf/value    "A category of project."}
                      {:rdf/language "es",
                       :rdf/value    "Una categoría de proyecto."}
                      {:rdf/language "fr",
                       :rdf/value    "Une catégorie de projet."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "category"}
                      {:rdf/language "es",
                       :rdf/value    "categoría"}
                      {:rdf/language "cs",
                       :rdf/value    "kategorie"}
                      {:rdf/language "de",
                       :rdf/value    "Kategorie"}
                      {:rdf/language "fr",
                       :rdf/value    "catégorie"}]})

(def created
  {:rdf/about :doap/created,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/language "de",
     :rdf/value
     "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05."}
    {:rdf/language "cs",
     :rdf/value
     "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05"}
    {:rdf/language "es",
     :rdf/value
     "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05"}
    {:rdf/language "en",
     :rdf/value
     "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"}
    {:rdf/language "fr",
     :rdf/value
     "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)"}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "created"}
                {:rdf/language "de",
                 :rdf/value    "erstellt"}
                {:rdf/language "cs",
                 :rdf/value    "vytvořeno"}
                {:rdf/language "es",
                 :rdf/value    "creado"}
                {:rdf/language "fr",
                 :rdf/value    "créé"}]})

(def description
  {:rdf/about :doap/description,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Čistě textový, 2 až 4 věty dlouhý popis projektu."}
    {:rdf/language "fr",
     :rdf/value    "Texte descriptif d'un projet, long de 2 à 4 phrases."}
    {:rdf/language "es",
     :rdf/value
     "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud."}
    {:rdf/language "de",
     :rdf/value
     "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen."}
    {:rdf/language "en",
     :rdf/value
     "Plain text description of a project, of 2-4 sentences in length."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "descripción"}
                {:rdf/language "cs",
                 :rdf/value    "popis"}
                {:rdf/language "fr",
                 :rdf/value    "description"}
                {:rdf/language "en",
                 :rdf/value    "description"}
                {:rdf/language "de",
                 :rdf/value    "Beschreibung"}]})

(def developer
  {:rdf/about        :doap/developer,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     [{:rdf/language "cs",
                       :rdf/value    "Vývojář softwaru projektu."}
                      {:rdf/language "es",
                       :rdf/value "Desarrollador de software para el proyecto."}
                      {:rdf/language "fr",
                       :rdf/value    "Développeur pour le projet."}
                      {:rdf/language "en",
                       :rdf/value    "Developer of software for the project."}
                      {:rdf/language "de",
                       :rdf/value    "Software-Entwickler für eine Projekt."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "Entwickler"}
                      {:rdf/language "cs",
                       :rdf/value    "vývojář"}
                      {:rdf/language "fr",
                       :rdf/value    "développeur"}
                      {:rdf/language "es",
                       :rdf/value    "desarrollador"}
                      {:rdf/language "en",
                       :rdf/value    "developer"}],
   :rdfs/range       :foaf/Person})

(def documenter
  {:rdf/about        :doap/documenter,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     [{:rdf/language "es",
                       :rdf/value
                       "Proveedor de documentación para el proyecto."}
                      {:rdf/language "fr",
                       :rdf/value "Collaborateur à la documentation du projet."}
                      {:rdf/language "cs",
                       :rdf/value    "Spoluautor dokumentace projektu."}
                      {:rdf/language "en",
                       :rdf/value
                       "Contributor of documentation to the project."}
                      {:rdf/language "de",
                       :rdf/value
                       "Mitarbeiter an der Dokumentation eines Projektes."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "documenter"}
                      {:rdf/language "cs",
                       :rdf/value    "dokumentarista"}
                      {:rdf/language "de",
                       :rdf/value    "Dokumentator"}
                      {:rdf/language "es",
                       :rdf/value    "escritor de ayuda"}
                      {:rdf/language "fr",
                       :rdf/value    "rédacteur de l'aide"}],
   :rdfs/range       :foaf/Person})

(def download-mirror
  {:rdf/about :doap/download-mirror,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value    "Mirror of software download web page."}
    {:rdf/language "de",
     :rdf/value
     "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann."}
    {:rdf/language "cs",
     :rdf/value    "Zrcadlo stránky pro stažení softwaru."}
    {:rdf/language "fr",
     :rdf/value    "Miroir de la page de téléchargement du programme."}
    {:rdf/language "es",
     :rdf/value    "Mirror de la página web de descarga."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "zrcadlo stránky pro stažení"}
                {:rdf/language "fr",
                 :rdf/value    "miroir pour le téléchargement"}
                {:rdf/language "en",
                 :rdf/value    "download mirror"}
                {:rdf/language "de",
                 :rdf/value    "Spiegel der Seite zum Herunterladen"}
                {:rdf/language "es",
                 :rdf/value    "mirror de descarga"}]})

(def download-page
  {:rdf/about :doap/download-page,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "de",
     :rdf/value
     "Web-Seite von der die Projekt-Software heruntergeladen werden kann."}
    {:rdf/language "cs",
     :rdf/value    "Webová stránka, na které lze stáhnout projektový software."}
    {:rdf/language "en",
     :rdf/value "Web page from which the project software can be downloaded."}
    {:rdf/language "fr",
     :rdf/value
     "Page web à partir de laquelle on peut télécharger le programme."}
    {:rdf/language "es",
     :rdf/value    "Página web de la cuál se puede bajar el software."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "stránka pro stažení"}
                {:rdf/language "fr",
                 :rdf/value    "page de téléchargement"}
                {:rdf/language "de",
                 :rdf/value    "Seite zum Herunterladen"}
                {:rdf/language "en",
                 :rdf/value    "download page"}
                {:rdf/language "es",
                 :rdf/value    "página de descarga"}]})

(def file-release
  {:rdf/about        :doap/file-release,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value
                       "URI of download associated with this release."}
                      {:rdf/language "cs",
                       :rdf/value "URI adresa stažení asociované s revizí."}],
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "cs",
                       :rdf/value    "soubor revize"}
                      {:rdf/language "en",
                       :rdf/value    "file-release"}]})

(def helper
  {:rdf/about        :doap/helper,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     [{:rdf/language "cs",
                       :rdf/value    "Spoluautor projektu."}
                      {:rdf/language "de",
                       :rdf/value    "Projekt-Mitarbeiter."}
                      {:rdf/language "fr",
                       :rdf/value    "Collaborateur au projet."}
                      {:rdf/language "en",
                       :rdf/value    "Project contributor."}
                      {:rdf/language "es",
                       :rdf/value    "Colaborador del proyecto."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "helper"}
                      {:rdf/language "fr",
                       :rdf/value    "collaborateur"}
                      {:rdf/language "es",
                       :rdf/value    "colaborador"}
                      {:rdf/language "de",
                       :rdf/value    "Helfer"}
                      {:rdf/language "cs",
                       :rdf/value    "spoluautor"}],
   :rdfs/range       :foaf/Person})

(def homepage
  {:rdf/about :doap/homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto."}
    {:rdf/language "en",
     :rdf/value
     "URL of a project's homepage,\n\t\tassociated with exactly one project."}
    {:rdf/language "de",
     :rdf/value
     "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
    {:rdf/language "fr",
     :rdf/value
     "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet."}
    {:rdf/language "cs",
     :rdf/value
     "URL adresa domovské stránky projektu asociované s právě jedním projektem."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "página web"}
                {:rdf/language "de",
                 :rdf/value    "Homepage"}
                {:rdf/language "en",
                 :rdf/value    "homepage"}
                {:rdf/language "cs",
                 :rdf/value    "domovská stránka"}
                {:rdf/language "fr",
                 :rdf/value    "page web"}],
   :rdfs/subPropertyOf :foaf/homepage})

(def implements
  "A specification that a project implements. Could be a standard, API or legally defined level of conformance."
  {:rdf/about :doap/implements,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specification that a project implements. Could be a standard, API or legally defined level of conformance."},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Implements specification"},
   :rdfs/range :doap/Specification})

(def language
  "ISO language code a project has been translated into"
  {:rdf/about        :doap/language,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "ISO language code a project has been translated into"},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "language"}})

(def license
  {:rdf/about :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "L'URI d'une description RDF de la licence sous laquelle le programme est distribué."}
    {:rdf/language "es",
     :rdf/value
     "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software."}
    {:rdf/language "de",
     :rdf/value
     "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird."}
    {:rdf/language "cs",
     :rdf/value
     "URI adresa RDF popisu licence, pod kterou je software distribuován."}
    {:rdf/language "en",
     :rdf/value
     "The URI of an RDF description of the license the software is distributed under."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Lizenz"}
                {:rdf/language "cs",
                 :rdf/value    "licence"}
                {:rdf/language "fr",
                 :rdf/value    "licence"}
                {:rdf/language "en",
                 :rdf/value    "license"}
                {:rdf/language "es",
                 :rdf/value    "licencia"}]})

(def location
  {:rdf/about        :doap/location,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/language "de",
                       :rdf/value    "Lokation eines Repositorys."}
                      {:rdf/language "en",
                       :rdf/value    "Location of a repository."}
                      {:rdf/language "es",
                       :rdf/value    "lugar de un repositorio."}
                      {:rdf/language "fr",
                       :rdf/value    "Emplacement d'un dépôt."}
                      {:rdf/language "cs",
                       :rdf/value    "Umístění úložiště."}],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "repository location"}
                      {:rdf/language "cs",
                       :rdf/value    "umístění úložiště"}
                      {:rdf/language "es",
                       :rdf/value    "lugar del respositorio"}
                      {:rdf/language "fr",
                       :rdf/value    "emplacement du dépôt"}
                      {:rdf/language "de",
                       :rdf/value    "Repository Lokation"}]})

(def mailing-list
  {:rdf/about :doap/mailing-list,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Domovská stránka nebo e–mailová adresa e–mailové diskuse."}
    {:rdf/language "fr",
     :rdf/value    "Page web de la liste de diffusion, ou adresse de courriel."}
    {:rdf/language "de",
     :rdf/value    "Homepage der Mailing Liste oder E-Mail Adresse."}
    {:rdf/language "en",
     :rdf/value    "Mailing list home page or email address."}
    {:rdf/language "es",
     :rdf/value    "Página web de la lista de correo o dirección de correo."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "lista de correo"}
                {:rdf/language "en",
                 :rdf/value    "mailing list"}
                {:rdf/language "fr",
                 :rdf/value    "liste de diffusion"}
                {:rdf/language "de",
                 :rdf/value    "Mailing Liste"}
                {:rdf/language "cs",
                 :rdf/value    "e–mailová diskuse"}]})

(def maintainer
  {:rdf/about :doap/maintainer,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Správce projektu, vedoucí projektu."}
    {:rdf/language "fr",
     :rdf/value    "Développeur principal d'un projet, un meneur du projet."}
    {:rdf/language "de",
     :rdf/value    "Hauptentwickler eines Projektes, der Projektleiter"}
    {:rdf/language "es",
     :rdf/value "Desarrollador principal de un proyecto, un líder de proyecto."}
    {:rdf/language "en",
     :rdf/value    "Maintainer of a project, a project leader."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Projektverantwortlicher"}
                {:rdf/language "fr",
                 :rdf/value    "développeur principal"}
                {:rdf/language "cs",
                 :rdf/value    "správce"}
                {:rdf/language "en",
                 :rdf/value    "maintainer"}
                {:rdf/language "es",
                 :rdf/value    "desarrollador principal"}],
   :rdfs/range :foaf/Person})

(def module
  {:rdf/about :doap/module,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch."}
    {:rdf/language "de",
     :rdf/value
     "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys."}
    {:rdf/language "cs",
     :rdf/value    "Jméno modulu v CVS, BitKeeper nebo Arch úložišti."}
    {:rdf/language "en",
     :rdf/value
     "Module name of a Subversion, CVS, BitKeeper or Arch repository."}
    {:rdf/language "es",
     :rdf/value
     "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch."}],
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "module"}
                {:rdf/language "en",
                 :rdf/value    "module"}
                {:rdf/language "cs",
                 :rdf/value    "modul"}
                {:rdf/language "de",
                 :rdf/value    "Modul"}
                {:rdf/language "es",
                 :rdf/value    "módulo"}]})

(def name
  {:rdf/about          :doap/name,
   :rdf/type           [:rdf/Property :owl/AnnotationProperty],
   :rdfs/comment       [{:rdf/language "en",
                         :rdf/value    "A name of something."}
                        {:rdf/language "de",
                         :rdf/value    "Der Name von Irgendwas"}
                        {:rdf/language "es",
                         :rdf/value    "El nombre de algo."}
                        {:rdf/language "cs",
                         :rdf/value    "Jméno něčeho."}
                        {:rdf/language "fr",
                         :rdf/value    "Le nom de quelque chose."}],
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         [{:rdf/language "es",
                         :rdf/value    "nombre"}
                        {:rdf/language "fr",
                         :rdf/value    "nom"}
                        {:rdf/language "de",
                         :rdf/value    "Name"}
                        {:rdf/language "en",
                         :rdf/value    "name"}
                        {:rdf/language "cs",
                         :rdf/value    "jméno"}],
   :rdfs/subPropertyOf :rdfs/label})

(def old-homepage
  {:rdf/about :doap/old-homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value
     "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem."}
    {:rdf/language "en",
     :rdf/value
     "URL of a project's past homepage,\n\t\tassociated with exactly one project."}
    {:rdf/language "fr",
     :rdf/value
     "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet."}
    {:rdf/language "de",
     :rdf/value
     "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."}
    {:rdf/language "es",
     :rdf/value
     "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "stará domovská stránka"}
                {:rdf/language "fr",
                 :rdf/value    "ancienne page web"}
                {:rdf/language "de",
                 :rdf/value    "Alte Homepage"}
                {:rdf/language "en",
                 :rdf/value    "old homepage"}
                {:rdf/language "es",
                 :rdf/value    "página web antigua"}],
   :rdfs/subPropertyOf :foaf/homepage})

(def os
  {:rdf/about :doap/os,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation."}
    {:rdf/language "es",
     :rdf/value
     "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular."}
    {:rdf/language "de",
     :rdf/value
     "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist."}
    {:rdf/language "cs",
     :rdf/value
     "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému."}
    {:rdf/language "en",
     :rdf/value
     "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."}],
   :rdfs/domain [:doap/Project :doap/Version],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "operační systém"}
                {:rdf/language "fr",
                 :rdf/value    "système d'exploitation"}
                {:rdf/language "de",
                 :rdf/value    "Betriebssystem"}
                {:rdf/language "es",
                 :rdf/value    "sistema operativo"}
                {:rdf/language "en",
                 :rdf/value    "operating system"}]})

(def platform
  "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"
  {:rdf/about :doap/platform,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"},
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "platform"}})

(def programming-language
  {:rdf/about :doap/programming-language,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Programming language a project is implemented in or intended for use with."}
    {:rdf/language "es",
     :rdf/value
     "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse."}
    {:rdf/language "de",
     :rdf/value
     "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen."}
    {:rdf/language "fr",
     :rdf/value
     "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser."}
    {:rdf/language "cs",
     :rdf/value
     "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "programovací jazyk"}
                {:rdf/language "fr",
                 :rdf/value    "langage de programmation"}
                {:rdf/language "en",
                 :rdf/value    "programming language"}
                {:rdf/language "es",
                 :rdf/value    "lenguaje de programación"}
                {:rdf/language "de",
                 :rdf/value    "Programmiersprache"}]})

(def release
  {:rdf/about        :doap/release,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value    "Une release (révision) d'un projet."}
                      {:rdf/language "es",
                       :rdf/value    "Un release (versión) de un proyecto."}
                      {:rdf/language "en",
                       :rdf/value    "A project release."}
                      {:rdf/language "cs",
                       :rdf/value    "Relase (verze) projektu."}
                      {:rdf/language "de",
                       :rdf/value    "Ein Release (Version) eines Projekts."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "de",
                       :rdf/value    "Release"}
                      {:rdf/language "fr",
                       :rdf/value    "release"}
                      {:rdf/language "es",
                       :rdf/value    "release"}
                      {:rdf/language "en",
                       :rdf/value    "release"}
                      {:rdf/language "cs",
                       :rdf/value    "release"}],
   :rdfs/range       :doap/Version})

(def repository
  {:rdf/about        :doap/repository,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     [{:rdf/language "es",
                       :rdf/value    "Repositorio del código fuente."}
                      {:rdf/language "en",
                       :rdf/value    "Source code repository."}
                      {:rdf/language "cs",
                       :rdf/value    "Úložiště zdrojových kódů."}
                      {:rdf/language "fr",
                       :rdf/value    "Dépôt du code source."}
                      {:rdf/language "de",
                       :rdf/value    "Quellcode-Versionierungssystem."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "repository"}
                      {:rdf/language "es",
                       :rdf/value    "repositorio"}
                      {:rdf/language "fr",
                       :rdf/value    "dépôt"}
                      {:rdf/language "de",
                       :rdf/value    "Repository"}
                      {:rdf/language "cs",
                       :rdf/value    "úložiště"}],
   :rdfs/range       :doap/Repository})

(def revision
  {:rdf/about :doap/revision,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value    "Revision identifier of a software release."}
    {:rdf/language "es",
     :rdf/value    "Indentificador de la versión de un release de software."}
    {:rdf/language "cs",
     :rdf/value    "Identifikátor zpřístupněné revize softwaru."}
    {:rdf/language "de",
     :rdf/value    "Versionsidentifikator eines Software-Releases."}
    {:rdf/language "fr",
     :rdf/value    "Identifiant de révision d'une release du programme."}],
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Version"}
                {:rdf/language "en",
                 :rdf/value    "revision"}
                {:rdf/language "fr",
                 :rdf/value    "révision"}
                {:rdf/language "es",
                 :rdf/value    "versión"}
                {:rdf/language "cs",
                 :rdf/value    "verze"}]})

(def screenshots
  {:rdf/about        :doap/screenshots,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "Web page with screenshots of project."}
                      {:rdf/language "es",
                       :rdf/value
                       "Página web con capturas de pantalla del proyecto."}
                      {:rdf/language "fr",
                       :rdf/value
                       "Page web avec des captures d'écran du projet."}
                      {:rdf/language "cs",
                       :rdf/value
                       "Webová stránka projektu se snímky obrazovky."}
                      {:rdf/language "de",
                       :rdf/value
                       "Web-Seite mit Screenshots eines Projektes."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "cs",
                       :rdf/value    "snímek obrazovky"}
                      {:rdf/language "de",
                       :rdf/value    "Screenshots"}
                      {:rdf/language "en",
                       :rdf/value    "screenshots"}
                      {:rdf/language "fr",
                       :rdf/value    "captures d'écran"}
                      {:rdf/language "es",
                       :rdf/value    "capturas de pantalla"}]})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:rdf/about :doap/service-endpoint,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The URI of a web service endpoint where software as a service may be accessed"},
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service endpoint"}})

(def shortdesc
  {:rdf/about :doap/shortdesc,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [{:rdf/language "es",
     :rdf/value
     "Descripción corta (8 o 9 palabras) en texto plano de un proyecto."}
    {:rdf/language "en",
     :rdf/value    "Short (8 or 9 words) plain text description of a project."}
    {:rdf/language "cs",
     :rdf/value    "Krátký (8 nebo 9 slov) čistě textový popis projektu."}
    {:rdf/language "de",
     :rdf/value
     "Kurzbeschreibung (8 oder 9 Wörter) eines Projects als einfacher Text."}
    {:rdf/language "fr",
     :rdf/value    "Texte descriptif concis (8 ou 9 mots) d'un projet."}],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Kurzbeschreibung"}
                {:rdf/language "fr",
                 :rdf/value    "description courte"}
                {:rdf/language "es",
                 :rdf/value    "descripción corta"}
                {:rdf/language "cs",
                 :rdf/value    "krátký popis"}
                {:rdf/language "en",
                 :rdf/value    "short description"}]})

(def tester
  {:rdf/about :doap/tester,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "cs",
     :rdf/value    "Tester nebo jiný spoluautor kontrolující kvalitu."}
    {:rdf/language "fr",
     :rdf/value    "Un testeur ou un collaborateur au contrôle qualité."}
    {:rdf/language "de",
     :rdf/value "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle."}
    {:rdf/language "en",
     :rdf/value    "A tester or other quality control contributor."}
    {:rdf/language "es",
     :rdf/value    "Un tester u otro proveedor de control de calidad."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "testeur"}
                {:rdf/language "de",
                 :rdf/value    "Tester"}
                {:rdf/language "es",
                 :rdf/value    "tester"}
                {:rdf/language "en",
                 :rdf/value    "tester"}
                {:rdf/language "cs",
                 :rdf/value    "tester"}],
   :rdfs/range :foaf/Person})

(def translator
  {:rdf/about        :doap/translator,
   :rdf/type         [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment     [{:rdf/language "es",
                       :rdf/value    "Proveedor de traducciones al proyecto."}
                      {:rdf/language "de",
                       :rdf/value
                       "Mitarbeiter an den Übersetzungen eines Projektes."}
                      {:rdf/language "en",
                       :rdf/value "Contributor of translations to the project."}
                      {:rdf/language "fr",
                       :rdf/value    "Collaborateur à la traduction du projet."}
                      {:rdf/language "cs",
                       :rdf/value    "Spoluautor překladu projektu."}],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       [{:rdf/language "es",
                       :rdf/value    "traductor"}
                      {:rdf/language "en",
                       :rdf/value    "translator"}
                      {:rdf/language "de",
                       :rdf/value    "Übersetzer"}
                      {:rdf/language "fr",
                       :rdf/value    "traducteur"}
                      {:rdf/language "cs",
                       :rdf/value    "překladatel"}],
   :rdfs/range       :foaf/Person})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:rdf/about        :doap/vendor,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Vendor organization: commercial, free or otherwise"},
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "vendor"},
   :rdfs/range       :foaf/Organization})

(def wiki
  {:rdf/about :doap/wiki,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value "L'URL du Wiki pour la discussion collaborative sur le projet."}
    {:rdf/language "en",
     :rdf/value    "URL of Wiki for collaborative discussion of project."}
    {:rdf/language "de",
     :rdf/value    "Wiki-URL für die kollaborative Dikussion eines Projektes."}
    {:rdf/language "cs",
     :rdf/value    "URL adresa wiki projektu pro společné diskuse."}
    {:rdf/language "es",
     :rdf/value    "URL del Wiki para discusión colaborativa del proyecto."}],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Wiki"}
                {:rdf/language "fr",
                 :rdf/value    "wiki"}
                {:rdf/language "es",
                 :rdf/value    "wiki"}
                {:rdf/language "en",
                 :rdf/value    "wiki"}
                {:rdf/language "cs",
                 :rdf/value    "wiki"}]})