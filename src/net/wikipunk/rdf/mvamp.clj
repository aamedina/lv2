(ns net.wikipunk.rdf.mvamp
  "http://vamp-plugins.org/rdf/plugins/mvamp"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/mvamp",
   :rdf/ns-prefix-map {"af"       "http://purl.org/ontology/af/",
                       "cc"       "http://web.resource.org/cc/",
                       "dc11"     "http://purl.org/dc/elements/1.1/",
                       "foaf"     "http://xmlns.com/foaf/0.1/",
                       "mvamp"    "http://vamp-plugins.org/rdf/plugins/mvamp#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "plugbase" "http://vamp-plugins.org/rdf/plugins/mvamp#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp"     "http://purl.org/ontology/vamp/",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "mvamp",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/mvamp"})

(def library
  "Low-level feature extraction plugins containing functionality from the MARSYAS batch feature extractor"
  {:db/ident :mvamp/library,
   :dc11/description
   "Low-level feature extraction plugins containing functionality from the MARSYAS batch feature extractor",
   :dc11/title "MARSYAS Vamp plugins",
   :foaf/maker :mvamp/maker,
   :foaf/page "http://marsyas.info/downloads/vamp-plugins.html",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:mvamp/marsyas_bextract_sfm
                           :mvamp/marsyas_bextract_rolloff
                           :mvamp/marsyas_bextract_lpcc
                           :mvamp/marsyas_bextract_zero_crossings
                           :mvamp/marsyas_bextract_centroid
                           :mvamp/marsyas_bextract_lsp
                           :mvamp/marsyas_bextract_scf
                           :mvamp/marsyas_bextract_mfcc],
   :vamp/has_binary "linux32",
   :vamp/has_source true,
   :vamp/identifier "mvamp"})

(def maker
  {:db/ident  :mvamp/maker,
   :foaf/name "Marsyas Plugins",
   :foaf/page "http://marsyas.info/"})

(def marsyas_bextract_centroid
  "Marsyas - Batch Feature Extract - Centroid"
  {:db/ident :mvamp/marsyas_bextract_centroid,
   :dc11/description "Marsyas - Batch Feature Extract - Centroid",
   :dc11/rights "GPL v3 license",
   :dc11/title "Marsyas - Batch Feature Extract - Centroid",
   :foaf/maker :mvamp/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "marsyas_bextract_centroid",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Marsyas - Batch Feature Extract - Centroid",
   :vamp/output :mvamp/marsyas_bextract_centroid_output_centroid_value,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_centroid_output_centroid_value
  "The value of the centroid"
  {:db/ident             :mvamp/marsyas_bextract_centroid_output_centroid_value,
   :dc11/description     "The value of the centroid",
   :dc11/title           "Centroid value",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "centroid_value",
   :vamp/unit            "value"})

(def marsyas_bextract_lpcc
  "Marsyas - Batch Feature Extract - Linear Prediction Cepstral Coefficients"
  {:db/ident :mvamp/marsyas_bextract_lpcc,
   :dc11/description
   "Marsyas - Batch Feature Extract - Linear Prediction Cepstral Coefficients",
   :dc11/rights "GPL v3 license",
   :dc11/title
   "Marsyas - Batch Feature Extract - Linear Prediction Cepstral Coefficients",
   :foaf/maker :mvamp/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "marsyas_bextract_lpcc",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name
   "Marsyas - Batch Feature Extract - Linear Prediction Cepstral Coefficients",
   :vamp/output
   :mvamp/marsyas_bextract_lpcc_output_linear_prediction_cepstral_coefficients,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_lpcc_output_linear_prediction_cepstral_coefficients
  "The value of the Linear Prediction Cepstral Coefficients"
  {:db/ident
   :mvamp/marsyas_bextract_lpcc_output_linear_prediction_cepstral_coefficients,
   :dc11/description "The value of the Linear Prediction Cepstral Coefficients",
   :dc11/title "Linear Prediction Cepstral Coefficients",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 12,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "linear_prediction_cepstral_coefficients",
   :vamp/unit "value"})

(def marsyas_bextract_lsp
  "Marsyas - Batch Feature Extract - Line Spectral Pairs"
  {:db/ident :mvamp/marsyas_bextract_lsp,
   :dc11/description "Marsyas - Batch Feature Extract - Line Spectral Pairs",
   :dc11/rights "GPL v3 license",
   :dc11/title "Marsyas - Batch Feature Extract - Line Spectral Pairs",
   :foaf/maker :mvamp/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "marsyas_bextract_lsp",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Marsyas - Batch Feature Extract - Line Spectral Pairs",
   :vamp/output :mvamp/marsyas_bextract_lsp_output_line_spectral_pairs,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_lsp_output_line_spectral_pairs
  "The Line Spectral Pairs per sample"
  {:db/ident             :mvamp/marsyas_bextract_lsp_output_line_spectral_pairs,
   :dc11/description     "The Line Spectral Pairs per sample",
   :dc11/title           "Line Spectral Pairs",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       18,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "line_spectral_pairs",
   :vamp/unit            "value"})

(def marsyas_bextract_mfcc
  "Marsyas - Batch Feature Extract - Mel-Frequency Cepstral Coefficients"
  {:db/ident :mvamp/marsyas_bextract_mfcc,
   :dc11/description
   "Marsyas - Batch Feature Extract - Mel-Frequency Cepstral Coefficients",
   :dc11/rights "GPL v3 license",
   :dc11/title
   "Marsyas - Batch Feature Extract - Mel-Frequency Cepstral Coefficients",
   :foaf/maker :mvamp/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "marsyas_bextract_mfcc",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name
   "Marsyas - Batch Feature Extract - Mel-Frequency Cepstral Coefficients",
   :vamp/output :mvamp/marsyas_bextract_mfcc_output_mfcc,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_mfcc_output_mfcc
  "The value of the Mel-Frequency Cepstral Coefficients"
  {:db/ident             :mvamp/marsyas_bextract_mfcc_output_mfcc,
   :dc11/description     "The value of the Mel-Frequency Cepstral Coefficients",
   :dc11/title           "Mel-Frequency Cepstral Coefficients",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       12,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mfcc",
   :vamp/unit            "value"})

(def marsyas_bextract_rolloff
  "Marsyas - Batch Feature Extract - Spectral Rolloff"
  {:db/ident              :mvamp/marsyas_bextract_rolloff,
   :dc11/description      "Marsyas - Batch Feature Extract - Spectral Rolloff",
   :dc11/rights           "GPL v3 license",
   :dc11/title            "Marsyas - Batch Feature Extract - Spectral Rolloff",
   :foaf/maker            :mvamp/maker,
   :owl/versionInfo       "2",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "marsyas_bextract_rolloff",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Marsyas - Batch Feature Extract - Spectral Rolloff",
   :vamp/output           :mvamp/marsyas_bextract_rolloff_output_rolloff,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_rolloff_output_rolloff
  "The value of the Spectral Rolloff"
  {:db/ident             :mvamp/marsyas_bextract_rolloff_output_rolloff,
   :dc11/description     "The value of the Spectral Rolloff",
   :dc11/title           "Spectral Rolloff",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rolloff",
   :vamp/unit            "value"})

(def marsyas_bextract_scf
  "Marsyas - Batch Feature Extract - Spectral Crest Factor"
  {:db/ident :mvamp/marsyas_bextract_scf,
   :dc11/description "Marsyas - Batch Feature Extract - Spectral Crest Factor",
   :dc11/rights "GPL v3 license",
   :dc11/title "Marsyas - Batch Feature Extract - Spectral Crest Factor",
   :foaf/maker :mvamp/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "marsyas_bextract_scf",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Marsyas - Batch Feature Extract - Spectral Crest Factor",
   :vamp/output :mvamp/marsyas_bextract_scf_output_scf,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_scf_output_scf
  "The value of the Spectral Crest Factor"
  {:db/ident             :mvamp/marsyas_bextract_scf_output_scf,
   :dc11/description     "The value of the Spectral Crest Factor",
   :dc11/title           "Spectral Crest Factor",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       24,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "scf",
   :vamp/unit            "value"})

(def marsyas_bextract_sfm
  "Marsyas - Batch Feature Extract - Spectral Flatness Measure"
  {:db/ident :mvamp/marsyas_bextract_sfm,
   :dc11/description
   "Marsyas - Batch Feature Extract - Spectral Flatness Measure",
   :dc11/rights "GPL v3 license",
   :dc11/title "Marsyas - Batch Feature Extract - Spectral Flatness Measure",
   :foaf/maker :mvamp/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "marsyas_bextract_sfm",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Marsyas - Batch Feature Extract - Spectral Flatness Measure",
   :vamp/output :mvamp/marsyas_bextract_sfm_output_spf,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_sfm_output_spf
  "The value of the Spectral Flatness Measure"
  {:db/ident             :mvamp/marsyas_bextract_sfm_output_spf,
   :dc11/description     "The value of the Spectral Flatness Measure",
   :dc11/title           "Spectral Flatness Measure",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spf",
   :vamp/unit            "value"})

(def marsyas_bextract_zero_crossings
  "Marsyas - Batch Feature Extract - Zero Crossings"
  {:db/ident :mvamp/marsyas_bextract_zero_crossings,
   :dc11/description "Marsyas - Batch Feature Extract - Zero Crossings",
   :dc11/rights "GPL v3 license",
   :dc11/title "Marsyas - Batch Feature Extract - Zero Crossings",
   :foaf/maker :mvamp/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "marsyas_bextract_zero_crossings",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Marsyas - Batch Feature Extract - Zero Crossings",
   :vamp/output
   :mvamp/marsyas_bextract_zero_crossings_output_zero_crossing_counts,
   :vamp/vamp_API_version :vamp/api_version_1})

(def marsyas_bextract_zero_crossings_output_zero_crossing_counts
  "The number of zero crossing points per sample"
  {:db/ident :mvamp/marsyas_bextract_zero_crossings_output_zero_crossing_counts,
   :dc11/description "The number of zero crossing points per sample",
   :dc11/title "Zero Crossing Counts",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "zero_crossing_counts",
   :vamp/unit "crossings"})