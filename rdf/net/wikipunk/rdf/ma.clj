(ns net.wikipunk.rdf.ma
  {:dcterms/date #inst "2013-03-20T00:00:00.000-04:00",
   :owl/imports "http://dublincore.org/2008/01/14/dcelements.rdf",
   :owl/versionInfo "R36",
   :rdf/about "http://www.w3.org/ns/ma-ont",
   :rdf/ns-prefix-map {"dc"   "http://purl.org/dc/elements/1.1/",
                       "ma"   "http://www.w3.org/ns/ma-ont#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ma",
   :rdfa/uri "http://www.w3.org/ns/ma-ont#",
   :rdfs/comment
   ["THE CONTENT OF THIS MA-ONT.RDF AND DERIVED MA-ONT.TTL FILES PREVAIL OVER THE SPECIFICATION."
    "Created by Tobias Buerger, Jean Pierre Evain and Pierre-Antoine Champin with the RDFS Taskforce within the W3C Media Annotation Working Group."],
   :rdfs/isDefinedBy {:rdf/uri
                      "http://www.w3.org/TR/2012/REC-mediaont-10-20120209/"}})

(def Agent
  "A person or organisation contributing to the media resource."
  {:owl/disjointWith [:ma/TargetAudience
                      :ma/Rating
                      :ma/MediaResource
                      :ma/Location
                      :ma/Collection],
   :rdf/about :ma/Agent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A person or organisation contributing to the media resource."})

(def AudioTrack
  "A specialisation of Track for Audio to provide a link to specific data properties such as sampleRate, etc. Specialisation is defined through object properties."
  {:owl/disjointWith [:ma/VideoTrack :ma/DataTrack],
   :rdf/about :ma/AudioTrack,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A specialisation of Track for Audio to provide a link to specific data properties such as sampleRate, etc. Specialisation is defined through object properties.",
   :rdfs/subClassOf :ma/Track})

(def Collection
  "Any group of media resource e.g. a series."
  {:owl/disjointWith [:ma/TargetAudience
                      :ma/Rating
                      :ma/MediaResource
                      :ma/Location],
   :rdf/about        :ma/Collection,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Any group of media resource e.g. a series."})

(def DataTrack
  "Ancillary data track e.g. captioning  in addition to video and audio tracks. Specialisation is made through the use of appropriate object properties."
  {:owl/disjointWith :ma/VideoTrack,
   :rdf/about :ma/DataTrack,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Ancillary data track e.g. captioning  in addition to video and audio tracks. Specialisation is made through the use of appropriate object properties.",
   :rdfs/subClassOf :ma/Track})

(def Image
  "A still image / thumbnail / key frame related to the media resource or being the media resource itself."
  {:rdf/about :ma/Image,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A still image / thumbnail / key frame related to the media resource or being the media resource itself.",
   :rdfs/subClassOf :ma/MediaResource})

(def Location
  "A location related to the media resource, e.g. depicted in the resource (possibly fictional) or where the resource was created (shooting location), etc."
  {:owl/disjointWith [:ma/TargetAudience :ma/Rating :ma/MediaResource],
   :rdf/about :ma/Location,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A location related to the media resource, e.g. depicted in the resource (possibly fictional) or where the resource was created (shooting location), etc."})

(def MediaFragment
  "A media fragment (spatial, temporal, track...) composing a media resource. In other ontologies fragment is sometimes referred to as a 'part' or 'segment'."
  {:rdf/about :ma/MediaFragment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A media fragment (spatial, temporal, track...) composing a media resource. In other ontologies fragment is sometimes referred to as a 'part' or 'segment'.",
   :rdfs/subClassOf :ma/MediaResource})

(def MediaResource
  "An image or an audiovisual media resource, which can be composed of one or more fragment / track."
  {:owl/disjointWith [:ma/TargetAudience :ma/Rating],
   :rdf/about :ma/MediaResource,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An image or an audiovisual media resource, which can be composed of one or more fragment / track."})

(def Organisation
  "An organisation or moral agent."
  {:owl/disjointWith :ma/Person,
   :rdf/about        :ma/Organisation,
   :rdf/type         :owl/Class,
   :rdfs/comment     "An organisation or moral agent.",
   :rdfs/subClassOf  :ma/Agent})

(def Person
  "A physical person."
  {:rdf/about       :ma/Person,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A physical person.",
   :rdfs/subClassOf :ma/Agent})

(def Rating
  "Information about the rating given to a media resource."
  {:owl/disjointWith :ma/TargetAudience,
   :rdf/about        :ma/Rating,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Information about the rating given to a media resource."})

(def TargetAudience
  "Information about The target audience (target region, target audience category but also parental guidance recommendation) for which a media resource is intended."
  {:rdf/about :ma/TargetAudience,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Information about The target audience (target region, target audience category but also parental guidance recommendation) for which a media resource is intended."})

(def Track
  "A specialisation of MediaFragment for audiovisual content."
  {:rdf/about :ma/Track,
   :rdf/type :owl/Class,
   :rdfs/comment "A specialisation of MediaFragment for audiovisual content.",
   :rdfs/subClassOf :ma/MediaFragment})

(def VideoTrack
  "A specialisation of Track for Video to provide a link to specific data properties such as frameRate, etc. Signing is another possible example of video track. Specialisation is defined through object properties."
  {:rdf/about :ma/VideoTrack,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A specialisation of Track for Video to provide a link to specific data properties such as frameRate, etc. Signing is another possible example of video track. Specialisation is defined through object properties.",
   :rdfs/subClassOf :ma/Track})

(def alternativeTitle
  "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"alternative\"."
  {:rdf/about :ma/alternativeTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"alternative\".",
   :rdfs/subPropertyOf :ma/title})

(def averageBitRate
  "Corresponds to 'averageBitRate' in the Ontology for Media Resources, expressed in kilobits/second."
  {:rdf/about :ma/averageBitRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'averageBitRate' in the Ontology for Media Resources, expressed in kilobits/second.",
   :rdfs/domain {:owl/intersectionOf [:ma/MediaResource
                                      {:owl/complementOf :ma/Image,
                                       :rdf/type         :owl/Class}],
                 :rdf/type :owl/Class},
   :rdfs/range :xsd/decimal})

(def collectionName
  "The name by which a collection (e.g. series) is known."
  {:rdf/about    :ma/collectionName,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The name by which a collection (e.g. series) is known.",
   :rdfs/domain  :ma/Collection})

(def copyright
  "Corresponds to 'copyright.copyright' in the Ontology for Media Resources."
  {:rdf/about :ma/copyright,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'copyright.copyright' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def createdIn
  "A subproperty of 'hasRelatedLocation\" used to specify where material shooting took place."
  {:owl/inverseOf :ma/isCreationLocationOf,
   :rdf/about :ma/createdIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subproperty of 'hasRelatedLocation\" used to specify where material shooting took place.",
   :rdfs/subPropertyOf :ma/hasRelatedLocation})

(def creationDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"creationDate\"."
  {:rdf/about :ma/creationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"creationDate\".",
   :rdfs/subPropertyOf :ma/date})

(def date
  "Corresponds to date.date in the ontology for Media Resources. Subproperties can be used to distinguish different values of 'date.type'. The recommended range is 'xsd:dateTime' (for compliance with OWL2-QL and OWL2-RL) but other time-related datatypes may be used (e.g. 'xsd:gYear', 'xsd:date'...)."
  {:rdf/about :ma/date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to date.date in the ontology for Media Resources. Subproperties can be used to distinguish different values of 'date.type'. The recommended range is 'xsd:dateTime' (for compliance with OWL2-QL and OWL2-RL) but other time-related datatypes may be used (e.g. 'xsd:gYear', 'xsd:date'...).",
   :rdfs/domain :ma/MediaResource})

(def depictsFictionalLocation
  "A subproperty of 'hasRelatedLocation' used to specify where the action depicted in the media is supposed to take place, as opposed to the location where shooting actually took place (see 'createdIn')."
  {:owl/inverseOf :ma/isFictionalLocationDepictedIn,
   :rdf/about :ma/depictsFictionalLocation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subproperty of 'hasRelatedLocation' used to specify where the action depicted in the media is supposed to take place, as opposed to the location where shooting actually took place (see 'createdIn').",
   :rdfs/subPropertyOf :ma/hasRelatedLocation})

(def description
  "Corresponds to 'description' in the Ontology for Media Resources. This can be specialised by using sub-properties e.g. 'summary' or 'script'."
  {:rdf/about :ma/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'description' in the Ontology for Media Resources. This can be specialised by using sub-properties e.g. 'summary' or 'script'.",
   :rdfs/domain :ma/MediaResource})

(def duration
  "Corresponds to 'duration' in the Ontology for Media Resources."
  {:rdf/about :ma/duration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'duration' in the Ontology for Media Resources.",
   :rdfs/domain {:owl/intersectionOf [:ma/MediaResource
                                      {:owl/complementOf :ma/Image,
                                       :rdf/type         :owl/Class}],
                 :rdf/type :owl/Class},
   :rdfs/range :xsd/decimal})

(def editDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"editDate\"."
  {:rdf/about :ma/editDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"editDate\".",
   :rdfs/subPropertyOf :ma/date})

(def features
  "Corresponds to 'contributor.contributor' in the Ontology for Media Resources with a 'contributor.role' meaning \"actor\"."
  {:owl/inverseOf :ma/playsIn,
   :rdf/about :ma/features,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'contributor.contributor' in the Ontology for Media Resources with a 'contributor.role' meaning \"actor\".",
   :rdfs/range :ma/Person,
   :rdfs/subPropertyOf :ma/hasContributor})

(def fragmentName
  "Corresponds to 'namedFragment.label' in the Ontology for Media Resources."
  {:rdf/about :ma/fragmentName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'namedFragment.label' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaFragment})

(def frameHeight
  "Corresponds to 'frameSize.height' in the Ontology for Media Resources, measured in frameSizeUnit."
  {:rdf/about :ma/frameHeight,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameSize.height' in the Ontology for Media Resources, measured in frameSizeUnit.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def frameRate
  "Corresponds to 'frameRate' in the Ontology for Media Resources, in frame per second."
  {:rdf/about :ma/frameRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameRate' in the Ontology for Media Resources, in frame per second.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/decimal})

(def frameSizeUnit
  "Corresponds to 'frameSize.unit' in the Ontology for Media Resources."
  {:rdf/about :ma/frameSizeUnit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameSize.unit' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def frameWidth
  "Corresponds to 'frameSize.width' in the Ontology for Media Resources measured in frameSizeUnit."
  {:rdf/about :ma/frameWidth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameSize.width' in the Ontology for Media Resources measured in frameSizeUnit.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def hasAccessConditions
  "Corresponds to 'policy' in the Ontology for Media Resources with a 'policy.type' \"access conditions\"."
  {:rdf/about :ma/hasAccessConditions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'policy' in the Ontology for Media Resources with a 'policy.type' \"access conditions\".",
   :rdfs/subPropertyOf :ma/hasPolicy})

(def hasAudioDescription
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"audio-description\"."
  {:rdf/about :ma/hasAudioDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"audio-description\".",
   :rdfs/subPropertyOf :ma/hasCaptioning})

(def hasCaptioning
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"captioning\". This property can for example point to a spatial fragment, a VideoTrack or a DataTrack. The language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track."
  {:owl/inverseOf :ma/isCaptioningOf,
   :rdf/about :ma/hasCaptioning,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"captioning\". This property can for example point to a spatial fragment, a VideoTrack or a DataTrack. The language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasChapter
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"chapter\"."
  {:owl/inverseOf :ma/isChapterOf,
   :rdf/about :ma/hasChapter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"chapter\".",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasClassification
  "Corresponds to 'targetAudience.classification' in the Ontology for Media Resources. This property is used to provide a value characterising the target audience."
  {:rdf/about :ma/hasClassification,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'targetAudience.classification' in the Ontology for Media Resources. This property is used to provide a value characterising the target audience.",
   :rdfs/domain :ma/TargetAudience})

(def hasClassificationSystem
  "Corresponds to 'targetAudience.identifier' in the Ontology for Media Resources. This is used to identify the reference sheme against which the target audience has been characterised."
  {:rdf/about :ma/hasClassificationSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'targetAudience.identifier' in the Ontology for Media Resources. This is used to identify the reference sheme against which the target audience has been characterised.",
   :rdfs/domain :ma/TargetAudience})

(def hasCompression
  "Corresponds to 'compression' in the Ontology for Media Resources."
  {:rdf/about :ma/hasCompression,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'compression' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def hasContributedTo
  {:rdf/about :ma/hasContributedTo,
   :rdf/type  :owl/ObjectProperty})

(def hasContributor
  "Corresponds to 'contributor.contributor' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'contributor.role'."
  {:owl/inverseOf :ma/hasContributedTo,
   :rdf/about :ma/hasContributor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'contributor.contributor' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'contributor.role'.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Agent})

(def hasCopyrightOver
  {:rdf/about :ma/hasCopyrightOver,
   :rdf/type  :owl/ObjectProperty})

(def hasCreated
  {:rdf/about :ma/hasCreated,
   :rdf/type  :owl/ObjectProperty})

(def hasCreator
  "Corresponds to 'creator.creator' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'creator.role'. Note that this property is semantically a subproperty of 'hasContributor'."
  {:owl/inverseOf :ma/hasCreated,
   :rdf/about :ma/hasCreator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'creator.creator' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'creator.role'. Note that this property is semantically a subproperty of 'hasContributor'.",
   :rdfs/subPropertyOf :ma/hasContributor})

(def hasFormat
  "Corresponds to 'format' in the Ontology for Media Resources."
  {:rdf/about    :ma/hasFormat,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Corresponds to 'format' in the Ontology for Media Resources.",
   :rdfs/domain  :ma/MediaResource})

(def hasFragment
  "Corresponds to 'fragment' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'fragment.role'."
  {:owl/inverseOf :ma/isFragmentOf,
   :rdf/about :ma/hasFragment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'fragment.role'.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/MediaFragment})

(def hasGenre
  "Corresponds to 'genre' in the Ontology for Media Resources."
  {:rdf/about    :ma/hasGenre,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Corresponds to 'genre' in the Ontology for Media Resources.",
   :rdfs/domain  :ma/MediaResource})

(def hasKeyword
  "Corresponds to 'keyword' in the Ontology for Media Resources."
  {:rdf/about :ma/hasKeyword,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'keyword' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def hasLanguage
  "Corresponds to 'language' in the Ontology for Media Resources. The language used in the resource. A controlled vocabulary such as defined in BCP 47 SHOULD be used. This property can also be used to identify the presence of sign language (RFC 5646). By inheritance, the hasLanguage property applies indifferently at the media resource / fragment / track levels.  Best practice recommends to use to best possible level of granularity fo describe the usage of language within a media resource including at fragment and track levels."
  {:rdf/about :ma/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'language' in the Ontology for Media Resources. The language used in the resource. A controlled vocabulary such as defined in BCP 47 SHOULD be used. This property can also be used to identify the presence of sign language (RFC 5646). By inheritance, the hasLanguage property applies indifferently at the media resource / fragment / track levels.  Best practice recommends to use to best possible level of granularity fo describe the usage of language within a media resource including at fragment and track levels.",
   :rdfs/domain :ma/MediaResource})

(def hasLocationCoordinateSystem
  "Corresponds to 'location.coordinateSystem' in the Ontology for Media Resources."
  {:rdf/about :ma/hasLocationCoordinateSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'location.coordinateSystem' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location})

(def hasMember
  {:rdf/about :ma/hasMember,
   :rdf/type  :owl/ObjectProperty})

(def hasNamedFragment
  "Corresponds to 'namedFragment' in the Ontology for Media Resources."
  {:owl/inverseOf :ma/isNamedFragmentOf,
   :rdf/about :ma/hasNamedFragment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'namedFragment' in the Ontology for Media Resources.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasPermissions
  "Corresponds to 'policy' in the Ontology for Media Resources with a  'policy.type' meaning \"permissions\"."
  {:rdf/about :ma/hasPermissions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'policy' in the Ontology for Media Resources with a  'policy.type' meaning \"permissions\".",
   :rdfs/subPropertyOf :ma/hasPolicy})

(def hasPolicy
  "Corresponds to 'policy' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'policy.type'."
  {:rdf/about :ma/hasPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'policy' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'policy.type'.",
   :rdfs/domain :ma/MediaResource})

(def hasPublished
  {:rdf/about :ma/hasPublished,
   :rdf/type  :owl/ObjectProperty})

(def hasPublisher
  "Corresponds to 'publisher' in the Ontology for Media Resources."
  {:owl/inverseOf :ma/hasPublished,
   :rdf/about :ma/hasPublisher,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'publisher' in the Ontology for Media Resources.",
   :rdfs/subPropertyOf :ma/hasContributor})

(def hasRating
  "Corresponds to 'rating' in the Ontology for Media Resources."
  {:owl/inverseOf :ma/isRatingOf,
   :rdf/about :ma/hasRating,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Corresponds to 'rating' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Rating})

(def hasRatingSystem
  "Corresponds to 'rating.type' in the Ontology for Media Resources."
  {:rdf/about :ma/hasRatingSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'rating.type' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating})

(def hasRelatedImage
  "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"related image\"."
  {:owl/inverseOf :ma/isImageRelatedTo,
   :rdf/about :ma/hasRelatedImage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"related image\".",
   :rdfs/range :ma/Image,
   :rdfs/subPropertyOf :ma/hasRelatedResource})

(def hasRelatedLocation
  "Corresponds to 'location' in the Ontology for Media Resources. Subproperties are provided to specify, when possible, the relation between the media resource and the location."
  {:owl/inverseOf :ma/isLocationRelatedTo,
   :rdf/about :ma/hasRelatedLocation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'location' in the Ontology for Media Resources. Subproperties are provided to specify, when possible, the relation between the media resource and the location.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Location})

(def hasRelatedResource
  "Corresponds to 'relation' and in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'relation.type'."
  {:owl/inverseOf :ma/isRelatedTo,
   :rdf/about :ma/hasRelatedResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'relation' and in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'relation.type'.",
   :rdfs/domain :ma/MediaResource})

(def hasSigning
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"signing\". This property can for example point to a spatial fragment or a VideoTrack. The sign language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track."
  {:owl/inverseOf :ma/isSigningOf,
   :rdf/about :ma/hasSigning,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"signing\". This property can for example point to a spatial fragment or a VideoTrack. The sign language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasSource
  "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"source\"."
  {:owl/inverseOf :ma/isSourceOf,
   :rdf/about :ma/hasSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"source\".",
   :rdfs/subPropertyOf :ma/hasRelatedResource})

(def hasSubtitling
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"subtitling\"."
  {:rdf/about :ma/hasSubtitling,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"subtitling\".",
   :rdfs/subPropertyOf :ma/hasCaptioning})

(def hasTargetAudience
  "Corresponds to 'targetAudience' in the Ontology for Media Resources."
  {:owl/inverseOf :ma/isTargetAudienceOf,
   :rdf/about :ma/hasTargetAudience,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'targetAudience' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/TargetAudience})

(def hasTrack
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"track\"."
  {:owl/inverseOf :ma/isTrackOf,
   :rdf/about :ma/hasTrack,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"track\".",
   :rdfs/range :ma/Track,
   :rdfs/subPropertyOf :ma/hasFragment})

(def isCaptioningOf
  {:rdf/about :ma/isCaptioningOf,
   :rdf/type  :owl/ObjectProperty})

(def isChapterOf
  {:rdf/about :ma/isChapterOf,
   :rdf/type  :owl/ObjectProperty})

(def isCopyrightedBy
  "Corresponds to 'copyright.identifier' in the Ontology for Media Resources."
  {:owl/inverseOf :ma/hasCopyrightOver,
   :rdf/about :ma/isCopyrightedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'copyright.identifier' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Agent})

(def isCreationLocationOf
  {:rdf/about :ma/isCreationLocationOf,
   :rdf/type  :owl/ObjectProperty})

(def isFictionalLocationDepictedIn
  {:rdf/about :ma/isFictionalLocationDepictedIn,
   :rdf/type  :owl/ObjectProperty})

(def isFragmentOf
  {:rdf/about :ma/isFragmentOf,
   :rdf/type  :owl/ObjectProperty})

(def isImageRelatedTo
  {:rdf/about :ma/isImageRelatedTo,
   :rdf/type  :owl/ObjectProperty,
   :rdfs/subPropertyOf :ma/isRelatedTo})

(def isLocationRelatedTo
  {:rdf/about :ma/isLocationRelatedTo,
   :rdf/type  :owl/ObjectProperty})

(def isMemberOf
  "Corresponds to 'collection' in the Ontology for Media Resources."
  {:owl/inverseOf :ma/hasMember,
   :rdf/about :ma/isMemberOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'collection' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Collection})

(def isNamedFragmentOf
  {:rdf/about :ma/isNamedFragmentOf,
   :rdf/type  :owl/ObjectProperty})

(def isProvidedBy
  "Corresponds to 'rating.identifier' in the Ontology for Media Resources."
  {:owl/inverseOf :ma/provides,
   :rdf/about :ma/isProvidedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'rating.identifier' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :ma/Agent})

(def isRatingOf
  {:rdf/about :ma/isRatingOf,
   :rdf/type  :owl/ObjectProperty})

(def isRelatedTo
  {:rdf/about :ma/isRelatedTo,
   :rdf/type  :owl/ObjectProperty})

(def isSigningOf
  {:rdf/about :ma/isSigningOf,
   :rdf/type  :owl/ObjectProperty})

(def isSourceOf
  {:rdf/about :ma/isSourceOf,
   :rdf/type  :owl/ObjectProperty})

(def isTargetAudienceOf
  {:rdf/about :ma/isTargetAudienceOf,
   :rdf/type  :owl/ObjectProperty})

(def isTrackOf
  {:rdf/about :ma/isTrackOf,
   :rdf/type  :owl/ObjectProperty})

(def locationAltitude
  "Corresponds to 'location.altitude' in the Ontology for Media Resources."
  {:rdf/about :ma/locationAltitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.altitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationLatitude
  "Corresponds to 'location.latitude' in the Ontology for Media Resources."
  {:rdf/about :ma/locationLatitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.latitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationLongitude
  "Corresponds to 'location.longitude' in the Ontology for Media Resources."
  {:rdf/about :ma/locationLongitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.longitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationName
  "Corresponds to 'location.name' in the Ontology for Media Resources."
  {:rdf/about :ma/locationName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.name' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location})

(def locator
  "Corresponds to 'locator' in the Ontology for Media Resources."
  {:rdf/about :ma/locator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'locator' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/anyURI})

(def mainOriginalTitle
  "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"original\"."
  {:rdf/about :ma/mainOriginalTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"original\".",
   :rdfs/subPropertyOf :ma/title})

(def numberOfTracks
  "Corresponds to 'numTracks.number' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'numTracks.type'."
  {:rdf/about :ma/numberOfTracks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'numTracks.number' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'numTracks.type'.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def playsIn
  {:rdf/about :ma/playsIn,
   :rdf/type  :owl/ObjectProperty})

(def provides
  {:rdf/about :ma/provides,
   :rdf/type  :owl/ObjectProperty})

(def ratingScaleMax
  "Corresponds to 'rating.max' in the Ontology for Media Resources."
  {:rdf/about :ma/ratingScaleMax,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'rating.max' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def ratingScaleMin
  "Corresponds to 'rating.min' in the Ontology for Media Resources."
  {:rdf/about :ma/ratingScaleMin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'rating.min' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def ratingValue
  "Corresponds to 'rating.value' in the Ontology for Media Resources."
  {:rdf/about :ma/ratingValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'rating.value' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def recordDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"recordDate\"."
  {:rdf/about :ma/recordDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"recordDate\".",
   :rdfs/subPropertyOf :ma/date})

(def releaseDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"releaseDate\"."
  {:rdf/about :ma/releaseDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"releaseDate\".",
   :rdfs/subPropertyOf :ma/date})

(def samplingRate
  "Corresponds to 'samplingRate' in the Ontology for Media Resources, in samples per second."
  {:rdf/about :ma/samplingRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'samplingRate' in the Ontology for Media Resources, in samples per second.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/decimal})

(def title
  "Corresponds to 'title.title' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'title.type'."
  {:rdf/about :ma/title,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'title.title' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'title.type'.",
   :rdfs/domain :ma/MediaResource})

(def trackName
  "Corresponds to 'fragment.name' in the Ontology for Media Resources, for Track fragments."
  {:rdf/about :ma/trackName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'fragment.name' in the Ontology for Media Resources, for Track fragments.",
   :rdfs/domain :ma/Track,
   :rdfs/subPropertyOf :ma/fragmentName})