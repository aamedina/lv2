(ns net.wikipunk.rdf.vamp-libxtract
  "http://vamp-plugins.org/rdf/plugins/vamp-libxtract"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/vamp-libxtract",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/vamp-libxtract#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "vamp-libxtract"
                       "http://vamp-plugins.org/rdf/plugins/vamp-libxtract#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "vamp-libxtract",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/vamp-libxtract"}
  (:refer-clojure :exclude [spread]))

(def amdf
  "Extract the AMDF of an audio signal"
  {:db/ident :vamp-libxtract/amdf,
   :dc11/description "Extract the AMDF of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Average Magnitude Difference Function",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "amdf",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Average Magnitude Difference Function",
   :vamp/output :vamp-libxtract/amdf_output_amdf,
   :vamp/vamp_API_version :vamp/api_version_2})

(def amdf_output_amdf
  "Extract the AMDF of an audio signal"
  {:db/ident             :vamp-libxtract/amdf_output_amdf,
   :dc11/description     "Extract the AMDF of an audio signal",
   :dc11/title           "Average Magnitude Difference Function",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "amdf",
   :vamp/unit            ""})

(def asdf
  "Extract the ASDF of an audio signal"
  {:db/ident :vamp-libxtract/asdf,
   :dc11/description "Extract the ASDF of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Average Squared Difference Function",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "asdf",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Average Squared Difference Function",
   :vamp/output :vamp-libxtract/asdf_output_asdf,
   :vamp/vamp_API_version :vamp/api_version_2})

(def asdf_output_asdf
  "Extract the ASDF of an audio signal"
  {:db/ident             :vamp-libxtract/asdf_output_asdf,
   :dc11/description     "Extract the ASDF of an audio signal",
   :dc11/title           "Average Squared Difference Function",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "asdf",
   :vamp/unit            ""})

(def autocorrelation
  "Extract the autocorrelation of an audio signal"
  {:db/ident :vamp-libxtract/autocorrelation,
   :dc11/description "Extract the autocorrelation of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Autocorrelation",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "autocorrelation",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Autocorrelation",
   :vamp/output :vamp-libxtract/autocorrelation_output_autocorrelation,
   :vamp/vamp_API_version :vamp/api_version_2})

(def autocorrelation_output_autocorrelation
  "Extract the autocorrelation of an audio signal"
  {:db/ident             :vamp-libxtract/autocorrelation_output_autocorrelation,
   :dc11/description     "Extract the autocorrelation of an audio signal",
   :dc11/title           "Autocorrelation",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "autocorrelation",
   :vamp/unit            ""})

(def average_deviation
  "Extract the average deviation of a range of values"
  {:db/ident :vamp-libxtract/average_deviation,
   :dc11/description "Extract the average deviation of a range of values",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Average Deviation",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "average_deviation",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Average Deviation",
   :vamp/output :vamp-libxtract/average_deviation_output_average_deviation,
   :vamp/vamp_API_version :vamp/api_version_2})

(def average_deviation_output_average_deviation
  "Extract the average deviation of a range of values"
  {:db/ident :vamp-libxtract/average_deviation_output_average_deviation,
   :dc11/description "Extract the average deviation of a range of values",
   :dc11/title "Average Deviation",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "average_deviation",
   :vamp/unit ""})

(def bark_coefficients
  "Extract bark coefficients from an audio spectrum"
  {:db/ident :vamp-libxtract/bark_coefficients,
   :dc11/description "Extract bark coefficients from an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Bark Coefficients",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "bark_coefficients",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Bark Coefficients",
   :vamp/output :vamp-libxtract/bark_coefficients_output_bark_coefficients,
   :vamp/vamp_API_version :vamp/api_version_2})

(def bark_coefficients_output_bark_coefficients
  "Extract bark coefficients from an audio spectrum"
  {:db/ident :vamp-libxtract/bark_coefficients_output_bark_coefficients,
   :dc11/description "Extract bark coefficients from an audio spectrum",
   :dc11/title "Bark Coefficients",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "bark_coefficients",
   :vamp/unit ""})

(def crest
  "Extract the spectral crest measure of an audio spectrum"
  {:db/ident :vamp-libxtract/crest,
   :dc11/description "Extract the spectral crest measure of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Peeters (2003). Distributed under the GNU General Public License",
   :dc11/title "Spectral Crest Measure",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "crest",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Crest Measure",
   :vamp/output :vamp-libxtract/crest_output_crest,
   :vamp/vamp_API_version :vamp/api_version_2})

(def crest_output_crest
  "Extract the spectral crest measure of an audio spectrum"
  {:db/ident :vamp-libxtract/crest_output_crest,
   :dc11/description "Extract the spectral crest measure of an audio spectrum",
   :dc11/title "Spectral Crest Measure",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "crest",
   :vamp/unit ""})

(def dct
  "Extract the DCT of an audio signal"
  {:db/ident :vamp-libxtract/dct,
   :dc11/description "Extract the DCT of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Discrete Cosine Transform",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "dct",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Discrete Cosine Transform",
   :vamp/output :vamp-libxtract/dct_output_dct,
   :vamp/vamp_API_version :vamp/api_version_2})

(def dct_output_dct
  "Extract the DCT of an audio signal"
  {:db/ident             :vamp-libxtract/dct_output_dct,
   :dc11/description     "Extract the DCT of an audio signal",
   :dc11/title           "Discrete Cosine Transform",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "dct",
   :vamp/unit            ""})

(def f0
  "Extract the fundamental frequency of an audio signal"
  {:db/ident :vamp-libxtract/f0,
   :dc11/description "Extract the fundamental frequency of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Jamie Bullock. Distributed under the GNU General Public License",
   :dc11/title "Fundamental Frequency",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "f0",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Fundamental Frequency",
   :vamp/output :vamp-libxtract/f0_output_f0,
   :vamp/vamp_API_version :vamp/api_version_2})

(def f0_output_f0
  "Extract the fundamental frequency of an audio signal"
  {:db/ident             :vamp-libxtract/f0_output_f0,
   :dc11/description     "Extract the fundamental frequency of an audio signal",
   :dc11/title           "Fundamental Frequency",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "f0",
   :vamp/unit            "Hz"})

(def failsafe_f0
  "Extract the fundamental frequency of an audio signal (failsafe)"
  {:db/ident :vamp-libxtract/failsafe_f0,
   :dc11/description
   "Extract the fundamental frequency of an audio signal (failsafe)",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Jamie Bullock. Distributed under the GNU General Public License",
   :dc11/title "Fundamental Frequency (failsafe)",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "failsafe_f0",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Fundamental Frequency (failsafe)",
   :vamp/output :vamp-libxtract/failsafe_f0_output_failsafe_f0,
   :vamp/vamp_API_version :vamp/api_version_2})

(def failsafe_f0_output_failsafe_f0
  "Extract the fundamental frequency of an audio signal (failsafe)"
  {:db/ident :vamp-libxtract/failsafe_f0_output_failsafe_f0,
   :dc11/description
   "Extract the fundamental frequency of an audio signal (failsafe)",
   :dc11/title "Fundamental Frequency (failsafe)",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "failsafe_f0",
   :vamp/unit "Hz"})

(def flatness
  "Extract the spectral flatness of an audio spectrum"
  {:db/ident :vamp-libxtract/flatness,
   :dc11/description "Extract the spectral flatness of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Tristan Jehan (2005). Distributed under the GNU General Public License",
   :dc11/title "Spectral Flatness",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "flatness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Flatness",
   :vamp/output :vamp-libxtract/flatness_output_flatness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def flatness_output_flatness
  "Extract the spectral flatness of an audio spectrum"
  {:db/ident             :vamp-libxtract/flatness_output_flatness,
   :dc11/description     "Extract the spectral flatness of an audio spectrum",
   :dc11/title           "Spectral Flatness",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "flatness",
   :vamp/unit            ""})

(def harmonic_spectrum
  "Extract the harmonics from an audio spectrum"
  {:db/ident :vamp-libxtract/harmonic_spectrum,
   :dc11/description "Extract the harmonics from an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Harmonic Spectrum",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "harmonic_spectrum",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Harmonic Spectrum",
   :vamp/output :vamp-libxtract/harmonic_spectrum_output_amplitudes,
   :vamp/parameter [:vamp-libxtract/harmonic_spectrum_param_peak-threshold
                    :vamp-libxtract/harmonic_spectrum_param_harmonic-threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def harmonic_spectrum_output_amplitudes
  ""
  {:db/ident             :vamp-libxtract/harmonic_spectrum_output_amplitudes,
   :dc11/description     "",
   :dc11/title           "Peak Amplitudes",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "amplitudes",
   :vamp/unit            ""})

(def harmonic_spectrum_param_harmonic-threshold
  {:db/ident :vamp-libxtract/harmonic_spectrum_param_harmonic-threshold,
   :dc11/format "",
   :dc11/title "Harmonic Threshold",
   :rdf/type :vamp/Parameter,
   :vamp/default_value 0.1M,
   :vamp/identifier "harmonic-threshold",
   :vamp/max_value 1,
   :vamp/min_value 0,
   :vamp/unit "",
   :vamp/value_names :rdf/nil})

(def harmonic_spectrum_param_peak-threshold
  {:db/ident           :vamp-libxtract/harmonic_spectrum_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def highest_value
  "Extract the highest value from a given range"
  {:db/ident :vamp-libxtract/highest_value,
   :dc11/description "Extract the highest value from a given range",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Highest Value",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "highest_value",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Highest Value",
   :vamp/output :vamp-libxtract/highest_value_output_highest_value,
   :vamp/vamp_API_version :vamp/api_version_2})

(def highest_value_output_highest_value
  "Extract the highest value from a given range"
  {:db/ident             :vamp-libxtract/highest_value_output_highest_value,
   :dc11/description     "Extract the highest value from a given range",
   :dc11/title           "Highest Value",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "highest_value",
   :vamp/unit            ""})

(def irregularity_j
  "Extract the irregularity (type II) of an audio spectrum"
  {:db/ident :vamp-libxtract/irregularity_j,
   :dc11/description "Extract the irregularity (type II) of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Jensen (1999). Distributed under the GNU General Public License",
   :dc11/title "Irregularity II",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "irregularity_j",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Irregularity II",
   :vamp/output :vamp-libxtract/irregularity_j_output_irregularity_j,
   :vamp/vamp_API_version :vamp/api_version_2})

(def irregularity_j_output_irregularity_j
  "Extract the irregularity (type II) of an audio spectrum"
  {:db/ident :vamp-libxtract/irregularity_j_output_irregularity_j,
   :dc11/description "Extract the irregularity (type II) of an audio spectrum",
   :dc11/title "Irregularity II",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "irregularity_j",
   :vamp/unit ""})

(def irregularity_k
  "Extract the irregularity (type I) of an audio spectrum"
  {:db/ident :vamp-libxtract/irregularity_k,
   :dc11/description "Extract the irregularity (type I) of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Krimphoff (1994). Distributed under the GNU General Public License",
   :dc11/title "Irregularity I",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "irregularity_k",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Irregularity I",
   :vamp/output :vamp-libxtract/irregularity_k_output_irregularity_k,
   :vamp/vamp_API_version :vamp/api_version_2})

(def irregularity_k_output_irregularity_k
  "Extract the irregularity (type I) of an audio spectrum"
  {:db/ident :vamp-libxtract/irregularity_k_output_irregularity_k,
   :dc11/description "Extract the irregularity (type I) of an audio spectrum",
   :dc11/title "Irregularity I",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "irregularity_k",
   :vamp/unit ""})

(def kurtosis
  "Extract the kurtosis of a range of values"
  {:db/ident :vamp-libxtract/kurtosis,
   :dc11/description "Extract the kurtosis of a range of values",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Kurtosis",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "kurtosis",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Kurtosis",
   :vamp/output :vamp-libxtract/kurtosis_output_kurtosis,
   :vamp/vamp_API_version :vamp/api_version_2})

(def kurtosis_output_kurtosis
  "Extract the kurtosis of a range of values"
  {:db/ident             :vamp-libxtract/kurtosis_output_kurtosis,
   :dc11/description     "Extract the kurtosis of a range of values",
   :dc11/title           "Kurtosis",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "kurtosis",
   :vamp/unit            ""})

(def library
  "Low-level feature extraction plugins using Jamie Bullock's libxtract library to provide around 50 spectral and other features"
  {:db/ident :vamp-libxtract/library,
   :dc11/description
   "Low-level feature extraction plugins using Jamie Bullock's libxtract library to provide around 50 spectral and other features",
   :dc11/title "libxtract Vamp plugins",
   :doap/download-page
   "http://code.soundsoftware.ac.uk/projects/vamp-libxtract-plugins/files",
   :foaf/maker :vamp-libxtract/maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/vamp-libxtract-plugins",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:vamp-libxtract/spectrum
                           :vamp-libxtract/sharpness
                           :vamp-libxtract/highest_value
                           :vamp-libxtract/average_deviation
                           :vamp-libxtract/spectral_variance
                           :vamp-libxtract/irregularity_k
                           :vamp-libxtract/tonality
                           :vamp-libxtract/mean
                           :vamp-libxtract/smoothness
                           :vamp-libxtract/tristimulus_3
                           :vamp-libxtract/spectral_inharmonicity
                           :vamp-libxtract/standard_deviation
                           :vamp-libxtract/spectral_slope
                           :vamp-libxtract/spread
                           :vamp-libxtract/peak_spectrum
                           :vamp-libxtract/harmonic_spectrum
                           :vamp-libxtract/crest
                           :vamp-libxtract/spectral_skewness
                           :vamp-libxtract/failsafe_f0
                           :vamp-libxtract/zcr
                           :vamp-libxtract/sum
                           :vamp-libxtract/mfcc
                           :vamp-libxtract/spectral_centroid
                           :vamp-libxtract/flatness
                           :vamp-libxtract/odd_even_ratio
                           :vamp-libxtract/bark_coefficients
                           :vamp-libxtract/rms_amplitude
                           :vamp-libxtract/irregularity_j
                           :vamp-libxtract/f0
                           :vamp-libxtract/skewness
                           :vamp-libxtract/kurtosis
                           :vamp-libxtract/tristimulus_1
                           :vamp-libxtract/tristimulus_2
                           :vamp-libxtract/loudness
                           :vamp-libxtract/autocorrelation
                           :vamp-libxtract/dct
                           :vamp-libxtract/spectral_average_deviation
                           :vamp-libxtract/nonzero_count
                           :vamp-libxtract/spectral_standard_deviation
                           :vamp-libxtract/spectral_kurtosis
                           :vamp-libxtract/variance
                           :vamp-libxtract/amdf
                           :vamp-libxtract/asdf
                           :vamp-libxtract/lowest_value
                           :vamp-libxtract/rolloff
                           :vamp-libxtract/noisiness],
   :vamp/has_binary ["linux64" "win32" "osx"],
   :vamp/has_source true,
   :vamp/identifier "vamp-libxtract"})

(def loudness
  "Extract the loudness of an audio signal from its spectrum"
  {:db/ident :vamp-libxtract/loudness,
   :dc11/description
   "Extract the loudness of an audio signal from its spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Moore, Glasberg et al (2005). Distributed under the GNU General Public License",
   :dc11/title "Loudness",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "loudness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Loudness",
   :vamp/output :vamp-libxtract/loudness_output_loudness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def loudness_output_loudness
  "Extract the loudness of an audio signal from its spectrum"
  {:db/ident :vamp-libxtract/loudness_output_loudness,
   :dc11/description
   "Extract the loudness of an audio signal from its spectrum",
   :dc11/title "Loudness",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "loudness",
   :vamp/unit ""})

(def lowest_value
  "Extract the lowest value from a given range"
  {:db/ident :vamp-libxtract/lowest_value,
   :dc11/description "Extract the lowest value from a given range",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Lowest Value",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "lowest_value",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Lowest Value",
   :vamp/output :vamp-libxtract/lowest_value_output_lowest_value,
   :vamp/vamp_API_version :vamp/api_version_2})

(def lowest_value_output_lowest_value
  "Extract the lowest value from a given range"
  {:db/ident             :vamp-libxtract/lowest_value_output_lowest_value,
   :dc11/description     "Extract the lowest value from a given range",
   :dc11/title           "Lowest Value",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "lowest_value",
   :vamp/unit            ""})

(def maker
  {:db/ident  :vamp-libxtract/maker,
   :foaf/name "Chris Cannam and Jamie Bullock"})

(def mean
  "Extract the mean of a range of values"
  {:db/ident :vamp-libxtract/mean,
   :dc11/description "Extract the mean of a range of values",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Mean",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "mean",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Mean",
   :vamp/output :vamp-libxtract/mean_output_mean,
   :vamp/vamp_API_version :vamp/api_version_2})

(def mean_output_mean
  "Extract the mean of a range of values"
  {:db/ident             :vamp-libxtract/mean_output_mean,
   :dc11/description     "Extract the mean of a range of values",
   :dc11/title           "Mean",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mean",
   :vamp/unit            ""})

(def mfcc
  "Extract MFCC from an audio spectrum"
  {:db/ident :vamp-libxtract/mfcc,
   :dc11/description "Extract MFCC from an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Rabiner. Distributed under the GNU General Public License",
   :dc11/title "Mel-Frequency Cepstral Coefficients",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "mfcc",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Mel-Frequency Cepstral Coefficients",
   :vamp/output :vamp-libxtract/mfcc_output_mfcc,
   :vamp/parameter [:vamp-libxtract/mfcc_param_lowestcoef
                    :vamp-libxtract/mfcc_param_style
                    :vamp-libxtract/mfcc_param_highestcoef
                    :vamp-libxtract/mfcc_param_minfreq
                    :vamp-libxtract/mfcc_param_maxfreq
                    :vamp-libxtract/mfcc_param_bands],
   :vamp/vamp_API_version :vamp/api_version_2})

(def mfcc_output_mfcc
  "Extract MFCC from an audio spectrum"
  {:db/ident             :vamp-libxtract/mfcc_output_mfcc,
   :dc11/description     "Extract MFCC from an audio spectrum",
   :dc11/title           "Mel-Frequency Cepstral Coefficients",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mfcc",
   :vamp/unit            ""})

(def mfcc_param_bands
  {:db/ident           :vamp-libxtract/mfcc_param_bands,
   :dc11/format        "",
   :dc11/title         "# Mel Frequency Bands",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 40,
   :vamp/identifier    "bands",
   :vamp/max_value     80,
   :vamp/min_value     10,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_highestcoef
  {:db/ident           :vamp-libxtract/mfcc_param_highestcoef,
   :dc11/format        "",
   :dc11/title         "Highest Coefficient Returned",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 20,
   :vamp/identifier    "highestcoef",
   :vamp/max_value     80,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_lowestcoef
  {:db/ident           :vamp-libxtract/mfcc_param_lowestcoef,
   :dc11/format        "",
   :dc11/title         "Lowest Coefficient Returned",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "lowestcoef",
   :vamp/max_value     80,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_maxfreq
  {:db/ident           :vamp-libxtract/mfcc_param_maxfreq,
   :dc11/format        "Hz",
   :dc11/title         "Maximum Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 18000,
   :vamp/identifier    "maxfreq",
   :vamp/max_value     24000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_minfreq
  {:db/ident           :vamp-libxtract/mfcc_param_minfreq,
   :dc11/format        "Hz",
   :dc11/title         "Minimum Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 80,
   :vamp/identifier    "minfreq",
   :vamp/max_value     24000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_style
  {:db/ident           :vamp-libxtract/mfcc_param_style,
   :dc11/format        "",
   :dc11/title         "MFCC Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "style",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Equal Gain" "Equal Area"]})

(def noisiness
  "Extract the noisiness of an audio spectrum"
  {:db/ident :vamp-libxtract/noisiness,
   :dc11/description "Extract the noisiness of an audio  spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Tae Hong Park (2000). Distributed under the GNU General Public License",
   :dc11/title "Noisiness",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "noisiness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Noisiness",
   :vamp/output :vamp-libxtract/noisiness_output_noisiness,
   :vamp/parameter [:vamp-libxtract/noisiness_param_harmonic-threshold
                    :vamp-libxtract/noisiness_param_peak-threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def noisiness_output_noisiness
  "Extract the noisiness of an audio spectrum"
  {:db/ident             :vamp-libxtract/noisiness_output_noisiness,
   :dc11/description     "Extract the noisiness of an audio  spectrum",
   :dc11/title           "Noisiness",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "noisiness",
   :vamp/unit            ""})

(def noisiness_param_harmonic-threshold
  {:db/ident           :vamp-libxtract/noisiness_param_harmonic-threshold,
   :dc11/format        "",
   :dc11/title         "Harmonic Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.1M,
   :vamp/identifier    "harmonic-threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def noisiness_param_peak-threshold
  {:db/ident           :vamp-libxtract/noisiness_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def nonzero_count
  "Extract the number of non-zero elements in an input spectrum"
  {:db/ident :vamp-libxtract/nonzero_count,
   :dc11/description
   "Extract the number of non-zero elements in an input spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Non-zero count",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "nonzero_count",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Non-zero count",
   :vamp/output :vamp-libxtract/nonzero_count_output_nonzero_count,
   :vamp/parameter :vamp-libxtract/nonzero_count_param_peak-threshold,
   :vamp/vamp_API_version :vamp/api_version_2})

(def nonzero_count_output_nonzero_count
  "Extract the number of non-zero elements in an input spectrum"
  {:db/ident :vamp-libxtract/nonzero_count_output_nonzero_count,
   :dc11/description
   "Extract the number of non-zero elements in an input spectrum",
   :dc11/title "Non-zero count",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "nonzero_count",
   :vamp/unit ""})

(def nonzero_count_param_peak-threshold
  {:db/ident           :vamp-libxtract/nonzero_count_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def odd_even_ratio
  "Extract the odd-to-even harmonic ratio of an audio spectrum"
  {:db/ident :vamp-libxtract/odd_even_ratio,
   :dc11/description
   "Extract the odd-to-even harmonic ratio of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Odd/even Harmonic Ratio",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "odd_even_ratio",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Odd/even Harmonic Ratio",
   :vamp/output :vamp-libxtract/odd_even_ratio_output_odd_even_ratio,
   :vamp/parameter [:vamp-libxtract/odd_even_ratio_param_harmonic-threshold
                    :vamp-libxtract/odd_even_ratio_param_peak-threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def odd_even_ratio_output_odd_even_ratio
  "Extract the odd-to-even harmonic ratio of an audio spectrum"
  {:db/ident :vamp-libxtract/odd_even_ratio_output_odd_even_ratio,
   :dc11/description
   "Extract the odd-to-even harmonic ratio of an audio spectrum",
   :dc11/title "Odd/even Harmonic Ratio",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "odd_even_ratio",
   :vamp/unit ""})

(def odd_even_ratio_param_harmonic-threshold
  {:db/ident           :vamp-libxtract/odd_even_ratio_param_harmonic-threshold,
   :dc11/format        "",
   :dc11/title         "Harmonic Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.1M,
   :vamp/identifier    "harmonic-threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def odd_even_ratio_param_peak-threshold
  {:db/ident           :vamp-libxtract/odd_even_ratio_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def peak_spectrum
  "Extract the spectral peaks from an audio spectrum"
  {:db/ident :vamp-libxtract/peak_spectrum,
   :dc11/description "Extract the spectral peaks from an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Peak Spectrum",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "peak_spectrum",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Peak Spectrum",
   :vamp/output :vamp-libxtract/peak_spectrum_output_amplitudes,
   :vamp/parameter :vamp-libxtract/peak_spectrum_param_peak-threshold,
   :vamp/vamp_API_version :vamp/api_version_2})

(def peak_spectrum_output_amplitudes
  ""
  {:db/ident             :vamp-libxtract/peak_spectrum_output_amplitudes,
   :dc11/description     "",
   :dc11/title           "Peak Amplitudes",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "amplitudes",
   :vamp/unit            ""})

(def peak_spectrum_param_peak-threshold
  {:db/ident           :vamp-libxtract/peak_spectrum_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def rms_amplitude
  "Extract the RMS amplitude of an audio signal"
  {:db/ident :vamp-libxtract/rms_amplitude,
   :dc11/description "Extract the RMS amplitude of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "RMS Amplitude",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "rms_amplitude",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "RMS Amplitude",
   :vamp/output :vamp-libxtract/rms_amplitude_output_rms_amplitude,
   :vamp/vamp_API_version :vamp/api_version_2})

(def rms_amplitude_output_rms_amplitude
  "Extract the RMS amplitude of an audio signal"
  {:db/ident             :vamp-libxtract/rms_amplitude_output_rms_amplitude,
   :dc11/description     "Extract the RMS amplitude of an audio signal",
   :dc11/title           "RMS Amplitude",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rms_amplitude",
   :vamp/unit            ""})

(def rolloff
  "Extract the rolloff point of an audio spectrum"
  {:db/ident :vamp-libxtract/rolloff,
   :dc11/description "Extract the rolloff point of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Bee Suan Ong (2005). Distributed under the GNU General Public License",
   :dc11/title "Spectral Rolloff",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "rolloff",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Rolloff",
   :vamp/output :vamp-libxtract/rolloff_output_rolloff,
   :vamp/parameter :vamp-libxtract/rolloff_param_rolloff-threshold,
   :vamp/vamp_API_version :vamp/api_version_2})

(def rolloff_output_rolloff
  "Extract the rolloff point of an audio spectrum"
  {:db/ident             :vamp-libxtract/rolloff_output_rolloff,
   :dc11/description     "Extract the rolloff point of an audio spectrum",
   :dc11/title           "Spectral Rolloff",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rolloff",
   :vamp/unit            "Hz"})

(def rolloff_param_rolloff-threshold
  {:db/ident           :vamp-libxtract/rolloff_param_rolloff-threshold,
   :dc11/format        "%",
   :dc11/title         "Rolloff Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 90,
   :vamp/identifier    "rolloff-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def sharpness
  "Extract the spectral sharpness of an audio spectrum"
  {:db/ident :vamp-libxtract/sharpness,
   :dc11/description "Extract the spectral sharpness of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Sharpness",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "sharpness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Sharpness",
   :vamp/output :vamp-libxtract/sharpness_output_sharpness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def sharpness_output_sharpness
  "Extract the spectral sharpness of an audio spectrum"
  {:db/ident             :vamp-libxtract/sharpness_output_sharpness,
   :dc11/description     "Extract the spectral sharpness of an audio spectrum",
   :dc11/title           "Spectral Sharpness",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "sharpness",
   :vamp/unit            ""})

(def skewness
  "Extract the skewness of a range of values"
  {:db/ident :vamp-libxtract/skewness,
   :dc11/description "Extract the skewness of a range of values",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Skewness",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "skewness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Skewness",
   :vamp/output :vamp-libxtract/skewness_output_skewness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def skewness_output_skewness
  "Extract the skewness of a range of values"
  {:db/ident             :vamp-libxtract/skewness_output_skewness,
   :dc11/description     "Extract the skewness of a range of values",
   :dc11/title           "Skewness",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "skewness",
   :vamp/unit            ""})

(def smoothness
  "Extract the spectral smoothness of an audio spectrum"
  {:db/ident :vamp-libxtract/smoothness,
   :dc11/description "Extract the spectral smoothness of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from McAdams (1999). Distributed under the GNU General Public License",
   :dc11/title "Spectral Smoothness",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "smoothness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Smoothness",
   :vamp/output :vamp-libxtract/smoothness_output_smoothness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def smoothness_output_smoothness
  "Extract the spectral smoothness of an audio spectrum"
  {:db/ident             :vamp-libxtract/smoothness_output_smoothness,
   :dc11/description     "Extract the spectral smoothness of an audio spectrum",
   :dc11/title           "Spectral Smoothness",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "smoothness",
   :vamp/unit            ""})

(def spectral_average_deviation
  "Extract the average deviation of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_average_deviation,
   :dc11/description "Extract the average deviation of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Average Deviation",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_average_deviation",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Average Deviation",
   :vamp/output
   :vamp-libxtract/spectral_average_deviation_output_spectral_average_deviation,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_average_deviation_output_spectral_average_deviation
  "Extract the average deviation of an audio spectrum"
  {:db/ident
   :vamp-libxtract/spectral_average_deviation_output_spectral_average_deviation,
   :dc11/description "Extract the average deviation of an audio spectrum",
   :dc11/title "Spectral Average Deviation",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "spectral_average_deviation",
   :vamp/unit "Hz"})

(def spectral_centroid
  "Extract the spectral centroid of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_centroid,
   :dc11/description "Extract the spectral centroid of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Centroid",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_centroid",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Centroid",
   :vamp/output :vamp-libxtract/spectral_centroid_output_spectral_centroid,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_centroid_output_spectral_centroid
  "Extract the spectral centroid of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_centroid_output_spectral_centroid,
   :dc11/description "Extract the spectral centroid of an audio spectrum",
   :dc11/title "Spectral Centroid",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "spectral_centroid",
   :vamp/unit "Hz"})

(def spectral_inharmonicity
  "Extract the inharmonicity of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_inharmonicity,
   :dc11/description "Extract the inharmonicity of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Inharmonicity",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_inharmonicity",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Inharmonicity",
   :vamp/output
   :vamp-libxtract/spectral_inharmonicity_output_spectral_inharmonicity,
   :vamp/parameter :vamp-libxtract/spectral_inharmonicity_param_peak-threshold,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_inharmonicity_output_spectral_inharmonicity
  "Extract the inharmonicity of an audio spectrum"
  {:db/ident
   :vamp-libxtract/spectral_inharmonicity_output_spectral_inharmonicity,
   :dc11/description "Extract the inharmonicity of an audio spectrum",
   :dc11/title "Inharmonicity",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "spectral_inharmonicity",
   :vamp/unit ""})

(def spectral_inharmonicity_param_peak-threshold
  {:db/ident :vamp-libxtract/spectral_inharmonicity_param_peak-threshold,
   :dc11/format "%",
   :dc11/title "Peak Threshold",
   :rdf/type :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier "peak-threshold",
   :vamp/max_value 100,
   :vamp/min_value 0,
   :vamp/unit "%",
   :vamp/value_names :rdf/nil})

(def spectral_kurtosis
  "Extract the kurtosis of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_kurtosis,
   :dc11/description "Extract the kurtosis of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Kurtosis",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_kurtosis",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Kurtosis",
   :vamp/output :vamp-libxtract/spectral_kurtosis_output_spectral_kurtosis,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_kurtosis_output_spectral_kurtosis
  "Extract the kurtosis of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_kurtosis_output_spectral_kurtosis,
   :dc11/description "Extract the kurtosis of an audio spectrum",
   :dc11/title "Spectral Kurtosis",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "spectral_kurtosis",
   :vamp/unit ""})

(def spectral_skewness
  "Extract the skewness of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_skewness,
   :dc11/description "Extract the skewness of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Skewness",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_skewness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Skewness",
   :vamp/output :vamp-libxtract/spectral_skewness_output_spectral_skewness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_skewness_output_spectral_skewness
  "Extract the skewness of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_skewness_output_spectral_skewness,
   :dc11/description "Extract the skewness of an audio spectrum",
   :dc11/title "Spectral Skewness",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "spectral_skewness",
   :vamp/unit ""})

(def spectral_slope
  "Extract the spectral slope of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_slope,
   :dc11/description "Extract the spectral slope of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Slope",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_slope",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Slope",
   :vamp/output :vamp-libxtract/spectral_slope_output_spectral_slope,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_slope_output_spectral_slope
  "Extract the spectral slope of an audio spectrum"
  {:db/ident             :vamp-libxtract/spectral_slope_output_spectral_slope,
   :dc11/description     "Extract the spectral slope of an audio spectrum",
   :dc11/title           "Spectral Slope",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectral_slope",
   :vamp/unit            ""})

(def spectral_standard_deviation
  "Extract the standard deviation of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_standard_deviation,
   :dc11/description "Extract the standard deviation of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Standard Deviation",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_standard_deviation",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Standard Deviation",
   :vamp/output
   :vamp-libxtract/spectral_standard_deviation_output_spectral_standard_deviation,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_standard_deviation_output_spectral_standard_deviation
  "Extract the standard deviation of an audio spectrum"
  {:db/ident
   :vamp-libxtract/spectral_standard_deviation_output_spectral_standard_deviation,
   :dc11/description "Extract the standard deviation of an audio spectrum",
   :dc11/title "Spectral Standard Deviation",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "spectral_standard_deviation",
   :vamp/unit "Hz"})

(def spectral_variance
  "Extract the variance of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_variance,
   :dc11/description "Extract the variance of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectral Variance",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectral_variance",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Variance",
   :vamp/output :vamp-libxtract/spectral_variance_output_spectral_variance,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectral_variance_output_spectral_variance
  "Extract the variance of an audio spectrum"
  {:db/ident :vamp-libxtract/spectral_variance_output_spectral_variance,
   :dc11/description "Extract the variance of an audio spectrum",
   :dc11/title "Spectral Variance",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "spectral_variance",
   :vamp/unit "Hz"})

(def spectrum
  "Extract the spectrum of an audio signal"
  {:db/ident :vamp-libxtract/spectrum,
   :dc11/description "Extract the spectrum of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Spectrum",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectrum",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Spectrum",
   :vamp/output :vamp-libxtract/spectrum_output_amplitudes,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectrum_output_amplitudes
  ""
  {:db/ident             :vamp-libxtract/spectrum_output_amplitudes,
   :dc11/description     "",
   :dc11/title           "Peak Amplitudes",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "amplitudes",
   :vamp/unit            ""})

(def spread
  "Extract the spectral spread of an audio spectrum"
  {:db/ident :vamp-libxtract/spread,
   :dc11/description "Extract the spectral spread of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Norman Casagrande (2005). Distributed under the GNU General Public License",
   :dc11/title "Spectral Spread",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spread",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Spread",
   :vamp/output :vamp-libxtract/spread_output_spread,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spread_output_spread
  "Extract the spectral spread of an audio spectrum"
  {:db/ident             :vamp-libxtract/spread_output_spread,
   :dc11/description     "Extract the spectral spread of an audio spectrum",
   :dc11/title           "Spectral Spread",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spread",
   :vamp/unit            "Hz"})

(def standard_deviation
  "Extract the standard deviation of a range of values"
  {:db/ident :vamp-libxtract/standard_deviation,
   :dc11/description "Extract the standard deviation of a range of values",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Standard Deviation",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "standard_deviation",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Standard Deviation",
   :vamp/output :vamp-libxtract/standard_deviation_output_standard_deviation,
   :vamp/vamp_API_version :vamp/api_version_2})

(def standard_deviation_output_standard_deviation
  "Extract the standard deviation of a range of values"
  {:db/ident :vamp-libxtract/standard_deviation_output_standard_deviation,
   :dc11/description "Extract the standard deviation of a range of values",
   :dc11/title "Standard Deviation",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "standard_deviation",
   :vamp/unit ""})

(def sum
  "Extract the sum of the values in a given range"
  {:db/ident :vamp-libxtract/sum,
   :dc11/description "Extract the sum of the values in a given range",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Sum of Values",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "sum",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Sum of Values",
   :vamp/output :vamp-libxtract/sum_output_sum,
   :vamp/vamp_API_version :vamp/api_version_2})

(def sum_output_sum
  "Extract the sum of the values in a given range"
  {:db/ident             :vamp-libxtract/sum_output_sum,
   :dc11/description     "Extract the sum of the values in a given range",
   :dc11/title           "Sum of Values",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "sum",
   :vamp/unit            ""})

(def tonality
  "Extract the tonality an audio spectrum"
  {:db/ident :vamp-libxtract/tonality,
   :dc11/description "Extract the tonality an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from J. D. Johnston (1988). Distributed under the GNU General Public License",
   :dc11/title "Tonality",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tonality",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Tonality",
   :vamp/output :vamp-libxtract/tonality_output_tonality,
   :vamp/vamp_API_version :vamp/api_version_2})

(def tonality_output_tonality
  "Extract the tonality an audio spectrum"
  {:db/ident             :vamp-libxtract/tonality_output_tonality,
   :dc11/description     "Extract the tonality an audio spectrum",
   :dc11/title           "Tonality",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tonality",
   :vamp/unit            ""})

(def tristimulus_1
  "Extract the tristimulus (type I) of an audio spectrum"
  {:db/ident :vamp-libxtract/tristimulus_1,
   :dc11/description "Extract the tristimulus (type I) of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Pollard and Jansson (1982). Distributed under the GNU General Public License",
   :dc11/title "Tristimulus I",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tristimulus_1",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Tristimulus I",
   :vamp/output :vamp-libxtract/tristimulus_1_output_tristimulus_1,
   :vamp/parameter [:vamp-libxtract/tristimulus_1_param_harmonic-threshold
                    :vamp-libxtract/tristimulus_1_param_peak-threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def tristimulus_1_output_tristimulus_1
  "Extract the tristimulus (type I) of an audio spectrum"
  {:db/ident :vamp-libxtract/tristimulus_1_output_tristimulus_1,
   :dc11/description "Extract the tristimulus (type I) of an audio spectrum",
   :dc11/title "Tristimulus I",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tristimulus_1",
   :vamp/unit ""})

(def tristimulus_1_param_harmonic-threshold
  {:db/ident           :vamp-libxtract/tristimulus_1_param_harmonic-threshold,
   :dc11/format        "",
   :dc11/title         "Harmonic Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.1M,
   :vamp/identifier    "harmonic-threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tristimulus_1_param_peak-threshold
  {:db/ident           :vamp-libxtract/tristimulus_1_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def tristimulus_2
  "Extract the tristimulus (type II) of an audio spectrum"
  {:db/ident :vamp-libxtract/tristimulus_2,
   :dc11/description "Extract the tristimulus (type II) of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Pollard and Jansson (1982). Distributed under the GNU General Public License",
   :dc11/title "Tristimulus II",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tristimulus_2",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Tristimulus II",
   :vamp/output :vamp-libxtract/tristimulus_2_output_tristimulus_2,
   :vamp/parameter [:vamp-libxtract/tristimulus_2_param_harmonic-threshold
                    :vamp-libxtract/tristimulus_2_param_peak-threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def tristimulus_2_output_tristimulus_2
  "Extract the tristimulus (type II) of an audio spectrum"
  {:db/ident :vamp-libxtract/tristimulus_2_output_tristimulus_2,
   :dc11/description "Extract the tristimulus (type II) of an audio spectrum",
   :dc11/title "Tristimulus II",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tristimulus_2",
   :vamp/unit ""})

(def tristimulus_2_param_harmonic-threshold
  {:db/ident           :vamp-libxtract/tristimulus_2_param_harmonic-threshold,
   :dc11/format        "",
   :dc11/title         "Harmonic Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.1M,
   :vamp/identifier    "harmonic-threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tristimulus_2_param_peak-threshold
  {:db/ident           :vamp-libxtract/tristimulus_2_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def tristimulus_3
  "Extract the tristimulus (type III) of an audio spectrum"
  {:db/ident :vamp-libxtract/tristimulus_3,
   :dc11/description "Extract the tristimulus (type III) of an audio spectrum",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Method from Pollard and Jansson (1982). Distributed under the GNU General Public License",
   :dc11/title "Tristimulus III",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "tristimulus_3",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Tristimulus III",
   :vamp/output :vamp-libxtract/tristimulus_3_output_tristimulus_3,
   :vamp/parameter [:vamp-libxtract/tristimulus_3_param_harmonic-threshold
                    :vamp-libxtract/tristimulus_3_param_peak-threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def tristimulus_3_output_tristimulus_3
  "Extract the tristimulus (type III) of an audio spectrum"
  {:db/ident :vamp-libxtract/tristimulus_3_output_tristimulus_3,
   :dc11/description "Extract the tristimulus (type III) of an audio spectrum",
   :dc11/title "Tristimulus III",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 0,
   :vamp/bin_names :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "tristimulus_3",
   :vamp/unit ""})

(def tristimulus_3_param_harmonic-threshold
  {:db/ident           :vamp-libxtract/tristimulus_3_param_harmonic-threshold,
   :dc11/format        "",
   :dc11/title         "Harmonic Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.1M,
   :vamp/identifier    "harmonic-threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def tristimulus_3_param_peak-threshold
  {:db/ident           :vamp-libxtract/tristimulus_3_param_peak-threshold,
   :dc11/format        "%",
   :dc11/title         "Peak Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "peak-threshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "%",
   :vamp/value_names   :rdf/nil})

(def variance
  "Extract the variance of a range of values"
  {:db/ident :vamp-libxtract/variance,
   :dc11/description "Extract the variance of a range of values",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Variance",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "variance",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Variance",
   :vamp/output :vamp-libxtract/variance_output_variance,
   :vamp/vamp_API_version :vamp/api_version_2})

(def variance_output_variance
  "Extract the variance of a range of values"
  {:db/ident             :vamp-libxtract/variance_output_variance,
   :dc11/description     "Extract the variance of a range of values",
   :dc11/title           "Variance",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "variance",
   :vamp/unit            ""})

(def zcr
  "Extract the zero crossing rate of an audio signal"
  {:db/ident :vamp-libxtract/zcr,
   :dc11/description "Extract the zero crossing rate of an audio signal",
   :dc11/rights
   "Copyright 2006 Jamie Bullock, plugin Copyright 2006 Queen Mary, University of London. Distributed under the GNU General Public License",
   :dc11/title "Zero Crossing Rate",
   :foaf/maker :vamp-libxtract/maker,
   :owl/versionInfo "2",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "zcr",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Zero Crossing Rate",
   :vamp/output :vamp-libxtract/zcr_output_zcr,
   :vamp/vamp_API_version :vamp/api_version_2})

(def zcr_output_zcr
  "Extract the zero crossing rate of an audio signal"
  {:db/ident             :vamp-libxtract/zcr_output_zcr,
   :dc11/description     "Extract the zero crossing rate of an audio signal",
   :dc11/title           "Zero Crossing Rate",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/bin_names       :rdf/nil,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "zcr",
   :vamp/unit            "Hz"})