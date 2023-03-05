(ns net.wikipunk.rdf.mir-edu
  "http://vamp-plugins.org/rdf/plugins/mir-edu"
  {:foaf/maker        ["http://www.vamp-plugins.org/doap.rdf#template-generator"
                       :mir-edu/maker],
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/mir-edu",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "mir-edu" "http://vamp-plugins.org/rdf/plugins/mir-edu#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/mir-edu#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "mir-edu",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/mir-edu"})

(def attackstartendtimes
  "Compute the start and end times of the attack of the signal. The start and end times of the attack are computed according to Peeters (2004), see code/documentation for further details. NOTE: the accuracy of the estimation depends on the step (hop) size of the analysis, the smaller the better. The times are returned as timestamps without any values."
  {:db/ident :mir-edu/attackstartendtimes,
   :dc11/description
   "Compute the start and end times of the attack of the signal. The start and end times of the attack are computed according to Peeters (2004), see code/documentation for further details. NOTE: the accuracy of the estimation depends on the step (hop) size of the analysis, the smaller the better. The times are returned as timestamps without any values.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Attack Start/End Times",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "attackstartendtimes",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MIR.EDU: Attack Start/End Times",
   :vamp/output :mir-edu/attackstartendtimes_output_attackstartendtimes,
   :vamp/vamp_API_version :vamp/api_version_2})

(def attackstartendtimes_output_attackstartendtimes
  ""
  {:db/ident :mir-edu/attackstartendtimes_output_attackstartendtimes,
   :dc11/description "",
   :dc11/title "Attack Start/End Times",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "attackstartendtimes",
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def library
  "An open source Vamp plug-in library written in C++ which implements a basic set of descriptors useful for teaching MIR"
  {:db/ident :mir-edu/library,
   :dc11/description
   "An open source Vamp plug-in library written in C++ which implements a basic set of descriptors useful for teaching MIR",
   :dc11/title "MIR.EDU",
   :foaf/maker :mir-edu/maker,
   :foaf/page "http://github.com/MTG/miredu",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:mir-edu/temporalcentroid
                           :mir-edu/spectralspread
                           :mir-edu/spectralcrest
                           :mir-edu/mfcc
                           :mir-edu/zerocrossingrate
                           :mir-edu/spectralflatness
                           :mir-edu/attackstartendtimes
                           :mir-edu/spectralflux
                           :mir-edu/spectralkurtosis
                           :mir-edu/spectralcentroid
                           :mir-edu/spectralskewness
                           :mir-edu/spectralrolloff
                           :mir-edu/logattacktime
                           :mir-edu/rms],
   :vamp/has_source true,
   :vamp/identifier "mir-edu"})

(def logattacktime
  "Compute the logarithm (base 10) of the duration of the attack of the signal (unit: log10(seconds)). The start and end times of the attack are computed according to Peeters (2004), see code/documentation for further details. NOTE: the accuracy of the estimation depends on the step (hop) size of the analysis, the smaller the better. The the timestamp of the returned value is the start time of the attack. For visualising the attack start and end times use the 'Attack Start/End Times' plug-in."
  {:db/ident :mir-edu/logattacktime,
   :dc11/description
   "Compute the logarithm (base 10) of the duration of the attack of the signal (unit: log10(seconds)). The start and end times of the attack are computed according to Peeters (2004), see code/documentation for further details. NOTE: the accuracy of the estimation depends on the step (hop) size of the analysis, the smaller the better. The the timestamp of the returned value is the start time of the attack. For visualising the attack start and end times use the 'Attack Start/End Times' plug-in.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Log Attack Time",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "logattacktime",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MIR.EDU: Log Attack Time",
   :vamp/output :mir-edu/logattacktime_output_logattacktime,
   :vamp/vamp_API_version :vamp/api_version_2})

(def logattacktime_output_logattacktime
  ""
  {:db/ident             :mir-edu/logattacktime_output_logattacktime,
   :dc11/description     "",
   :dc11/title           "Log Attack Time",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "logattacktime",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "log10(s)"})

(def maker
  {:db/ident  :mir-edu/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/upf.png",
   :foaf/name "Justin Salamon",
   :foaf/page "http://www.justinsalamon.com/"})

(def mfcc
  "Compute the Mel Frequency Cepstral Coefficients (MFCC) for each frame. MFCCs provide a concise representation of the spectral envelope of a sound, which in turn is related to the sound's timbre. Please refer to the code in MFCC.cpp and the reference provided in MFCC.h for a detailed explanation of how MFCCs are computed."
  {:db/ident :mir-edu/mfcc,
   :dc11/description
   "Compute the Mel Frequency Cepstral Coefficients (MFCC) for each frame. MFCCs provide a concise representation of the spectral envelope of a sound, which in turn is related to the sound's timbre. Please refer to the code in MFCC.cpp and the reference provided in MFCC.h for a detailed explanation of how MFCCs are computed.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: MFCC",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "mfcc",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: MFCC",
   :vamp/output :mir-edu/mfcc_output_mfcc,
   :vamp/parameter [:mir-edu/mfcc_param_minfrequency
                    :mir-edu/mfcc_param_nfilters
                    :mir-edu/mfcc_param_maxfrequency
                    :mir-edu/mfcc_param_ncoeffs
                    :mir-edu/mfcc_param_liftering],
   :vamp/vamp_API_version :vamp/api_version_2})

(def mfcc_output_mfcc
  ""
  {:db/ident             :mir-edu/mfcc_output_mfcc,
   :dc11/description     "",
   :dc11/title           "MFCC",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       13,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mfcc",
   :vamp/unit            ""})

(def mfcc_param_liftering
  {:db/ident           :mir-edu/mfcc_param_liftering,
   :dc11/format        "",
   :dc11/title         "Liftering Exponent",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.6M,
   :vamp/identifier    "liftering",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_maxfrequency
  {:db/ident           :mir-edu/mfcc_param_maxfrequency,
   :dc11/format        "Hz",
   :dc11/title         "Maximum Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 4000,
   :vamp/identifier    "maxfrequency",
   :vamp/max_value     24000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_minfrequency
  {:db/ident           :mir-edu/mfcc_param_minfrequency,
   :dc11/format        "Hz",
   :dc11/title         "Minimum Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "minfrequency",
   :vamp/max_value     24000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_ncoeffs
  {:db/ident           :mir-edu/mfcc_param_ncoeffs,
   :dc11/format        "",
   :dc11/title         "MFCC Coefficients",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 13,
   :vamp/identifier    "ncoeffs",
   :vamp/max_value     20,
   :vamp/min_value     13,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mfcc_param_nfilters
  {:db/ident           :mir-edu/mfcc_param_nfilters,
   :dc11/format        "",
   :dc11/title         "Mel Bands",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 40,
   :vamp/identifier    "nfilters",
   :vamp/max_value     40,
   :vamp/min_value     20,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def rms
  "Compute the root mean square of the signal for each frame"
  {:db/ident :mir-edu/rms,
   :dc11/description
   "Compute the root mean square of the signal for each frame",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: RMS",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "rms",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MIR.EDU: RMS",
   :vamp/output :mir-edu/rms_output_rms,
   :vamp/vamp_API_version :vamp/api_version_2})

(def rms_output_rms
  ""
  {:db/ident             :mir-edu/rms_output_rms,
   :dc11/description     "",
   :dc11/title           "RMS",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rms",
   :vamp/unit            ""})

(def spectralcentroid
  "Compute the spectral centroid of the signal for each frame. The unit of the values returned is Hz. If the frame is completely silent a value of 0 is returned."
  {:db/ident :mir-edu/spectralcentroid,
   :dc11/description
   "Compute the spectral centroid of the signal for each frame. The unit of the values returned is Hz. If the frame is completely silent a value of 0 is returned.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Centroid",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralcentroid",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Centroid",
   :vamp/output :mir-edu/spectralcentroid_output_spectralcentroid,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralcentroid_output_spectralcentroid
  ""
  {:db/ident             :mir-edu/spectralcentroid_output_spectralcentroid,
   :dc11/description     "",
   :dc11/title           "Spectral Centroid",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralcentroid",
   :vamp/unit            "Hz"})

(def spectralcrest
  "Compute the spectral crest of the signal for each frame. The crest is defined as the ratio between the maximum spectral magnitude in the frame and the arithmetical mean of the spectral magnitudes. The minimum possible value is 1 (flat spectrum) and it increases the peakier the spectrum is. If the frame is completely silent a value of 1 (flat spectrum) is returned."
  {:db/ident :mir-edu/spectralcrest,
   :dc11/description
   "Compute the spectral crest of the signal for each frame. The crest is defined as the ratio between the maximum spectral magnitude in the frame and the arithmetical mean of the spectral magnitudes. The minimum possible value is 1 (flat spectrum) and it increases the peakier the spectrum is. If the frame is completely silent a value of 1 (flat spectrum) is returned.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Crest",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralcrest",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Crest",
   :vamp/output :mir-edu/spectralcrest_output_spectralcrest,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralcrest_output_spectralcrest
  ""
  {:db/ident             :mir-edu/spectralcrest_output_spectralcrest,
   :dc11/description     "",
   :dc11/title           "Spectral Crest",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralcrest",
   :vamp/unit            ""})

(def spectralflatness
  "Compute the spectral flatness of the signal for each frame. The flatness is defined as the ratio of the geometric and arithmetical means of the spectral magnitudes. The values returned range between 0 (peaky spectrum) and 1 (flat spectrum). If the frame is completely silent a value of 1 (flat spectrum) is returned."
  {:db/ident :mir-edu/spectralflatness,
   :dc11/description
   "Compute the spectral flatness of the signal for each frame. The flatness is defined as the ratio of the geometric and arithmetical means of the spectral magnitudes. The values returned range between 0 (peaky spectrum) and 1 (flat spectrum). If the frame is completely silent a value of 1 (flat spectrum) is returned.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Flatness",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralflatness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Flatness",
   :vamp/output :mir-edu/spectralflatness_output_spectralflatness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralflatness_output_spectralflatness
  ""
  {:db/ident             :mir-edu/spectralflatness_output_spectralflatness,
   :dc11/description     "",
   :dc11/title           "Spectral Flatness",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralflatness",
   :vamp/unit            ""})

(def spectralflux
  "Compute the spectral flux between every two consecutive frames of the signal. The flux is defined as 1 minus the normalized correlation between successive magnitude spectra. The values returned range between 0 (no change) and 1 (maximum change). For the first frame the flux is always zero. If both frames are silent flux = 0, if only one is silent flux = 1."
  {:db/ident :mir-edu/spectralflux,
   :dc11/description
   "Compute the spectral flux between every two consecutive frames of the signal. The flux is defined as 1 minus the normalized correlation between successive magnitude spectra. The values returned range between 0 (no change) and 1 (maximum change). For the first frame the flux is always zero. If both frames are silent flux = 0, if only one is silent flux = 1.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Flux",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralflux",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Flux",
   :vamp/output :mir-edu/spectralflux_output_spectralflux,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralflux_output_spectralflux
  ""
  {:db/ident             :mir-edu/spectralflux_output_spectralflux,
   :dc11/description     "",
   :dc11/title           "Spectral Flux",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralflux",
   :vamp/unit            ""})

(def spectralkurtosis
  "Compute the spectral kurtosis of the signal for each frame. The kurtosis is a measure of the peakedness of a distribution. For a gaussian distribution kurtosis = 3, for a flat distribution kurtosis < 3 and for a peakier distribution kurtosis > 3.If the frame is completely silent a value of 0 is returned."
  {:db/ident :mir-edu/spectralkurtosis,
   :dc11/description
   "Compute the spectral kurtosis of the signal for each frame. The kurtosis is a measure of the peakedness of a distribution. For a gaussian distribution kurtosis = 3, for a flat distribution kurtosis < 3 and for a peakier distribution kurtosis > 3.If the frame is completely silent a value of 0 is returned.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Kurtosis",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralkurtosis",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Kurtosis",
   :vamp/output :mir-edu/spectralkurtosis_output_spectralkurtosis,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralkurtosis_output_spectralkurtosis
  ""
  {:db/ident             :mir-edu/spectralkurtosis_output_spectralkurtosis,
   :dc11/description     "",
   :dc11/title           "Spectral Kurtosis",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralkurtosis",
   :vamp/unit            ""})

(def spectralrolloff
  "Compute the spectral roll-off of the signal for each frame, defined as the frequency below which 95% of the signal energy is contained. The threshold (95%) is defined as a paramtere that can be changed by the user. The unit of the values returned is Hz. If the frame is completely silent a value of 0 is returned."
  {:db/ident :mir-edu/spectralrolloff,
   :dc11/description
   "Compute the spectral roll-off of the signal for each frame, defined as the frequency below which 95% of the signal energy is contained. The threshold (95%) is defined as a paramtere that can be changed by the user. The unit of the values returned is Hz. If the frame is completely silent a value of 0 is returned.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Roll-off",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralrolloff",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Roll-off",
   :vamp/output :mir-edu/spectralrolloff_output_spectralrolloff,
   :vamp/parameter :mir-edu/spectralrolloff_param_rolloffthreshold,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralrolloff_output_spectralrolloff
  ""
  {:db/ident             :mir-edu/spectralrolloff_output_spectralrolloff,
   :dc11/description     "",
   :dc11/title           "Spectral Rolloff",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralrolloff",
   :vamp/unit            "Hz"})

(def spectralrolloff_param_rolloffthreshold
  {:db/ident           :mir-edu/spectralrolloff_param_rolloffthreshold,
   :dc11/format        "",
   :dc11/title         "Roll-off threshold",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 95,
   :vamp/identifier    "rolloffthreshold",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def spectralskewness
  "Compute the spectral skewness of the signal for each frame. If the frame is completely silent a value of 0 is returned."
  {:db/ident :mir-edu/spectralskewness,
   :dc11/description
   "Compute the spectral skewness of the signal for each frame. If the frame is completely silent a value of 0 is returned.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Skewness",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralskewness",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Skewness",
   :vamp/output :mir-edu/spectralskewness_output_spectralskewness,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralskewness_output_spectralskewness
  ""
  {:db/ident             :mir-edu/spectralskewness_output_spectralskewness,
   :dc11/description     "",
   :dc11/title           "Spectral Skewness",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralskewness",
   :vamp/unit            ""})

(def spectralspread
  "Compute the spectral spread of the signal for each frame. The unit of the values returned is Hz. If the frame is completely silent a value of 0 is returned."
  {:db/ident :mir-edu/spectralspread,
   :dc11/description
   "Compute the spectral spread of the signal for each frame. The unit of the values returned is Hz. If the frame is completely silent a value of 0 is returned.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Spectral Spread",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "spectralspread",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "MIR.EDU: Spectral Spread",
   :vamp/output :mir-edu/spectralspread_output_spectralspread,
   :vamp/vamp_API_version :vamp/api_version_2})

(def spectralspread_output_spectralspread
  ""
  {:db/ident             :mir-edu/spectralspread_output_spectralspread,
   :dc11/description     "",
   :dc11/title           "Spectral Spread",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralspread",
   :vamp/unit            "Hz"})

(def temporalcentroid
  "Compute the temporal centroid of the entire signal, which is the centre of gravity of the energy of the signal. Energy is represented by the RMS of the signal. The termporal centroid is computed between times n1 and n2 which are the first and last times the signal RMS is above 15% of its maximum value. The temporal centroid is returned as a timestamp with no corresponding value."
  {:db/ident :mir-edu/temporalcentroid,
   :dc11/description
   "Compute the temporal centroid of the entire signal, which is the centre of gravity of the energy of the signal. Energy is represented by the RMS of the signal. The termporal centroid is computed between times n1 and n2 which are the first and last times the signal RMS is above 15% of its maximum value. The temporal centroid is returned as a timestamp with no corresponding value.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Temporal Centroid",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "temporalcentroid",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MIR.EDU: Temporal Centroid",
   :vamp/output :mir-edu/temporalcentroid_output_temporalcentroid,
   :vamp/vamp_API_version :vamp/api_version_2})

(def temporalcentroid_output_temporalcentroid
  ""
  {:db/ident             :mir-edu/temporalcentroid_output_temporalcentroid,
   :dc11/description     "",
   :dc11/title           "Temporal Centroid",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "temporalcentroid",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def zerocrossingrate
  "Compute the zero crossing rate of the signal for each frame (i.e. the number of times the signal changes sign). The unit of the values returned is crossings/second."
  {:db/ident :mir-edu/zerocrossingrate,
   :dc11/description
   "Compute the zero crossing rate of the signal for each frame (i.e. the number of times the signal changes sign). The unit of the values returned is crossings/second.",
   :dc11/rights "GPL",
   :dc11/title "MIR.EDU: Zero Crossing Rate",
   :foaf/maker {:foaf/name "MIR.EDU by Justin Salamon"},
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "zerocrossingrate",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "MIR.EDU: Zero Crossing Rate",
   :vamp/output :mir-edu/zerocrossingrate_output_zerocrossingrate,
   :vamp/vamp_API_version :vamp/api_version_2})

(def zerocrossingrate_output_zerocrossingrate
  ""
  {:db/ident             :mir-edu/zerocrossingrate_output_zerocrossingrate,
   :dc11/description     "",
   :dc11/title           "Zero Crossing Rate",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "zerocrossingrate",
   :vamp/unit            "Crossings/s"})