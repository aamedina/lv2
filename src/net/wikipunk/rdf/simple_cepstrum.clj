(ns net.wikipunk.rdf.simple-cepstrum
  "http://vamp-plugins.org/rdf/plugins/simple-cepstrum"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/simple-cepstrum",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/simple-cepstrum#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "simple-cepstrum"
                       "http://vamp-plugins.org/rdf/plugins/simple-cepstrum#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "simple-cepstrum",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/simple-cepstrum"})

(def library
  "A simple Vamp plugin to calculate and return cepstrum values from DFT bins. Useful as a preliminary tool for looking at cepstral data for simple pitch or envelope methods."
  {:db/ident :simple-cepstrum/library,
   :dc11/description
   "A simple Vamp plugin to calculate and return cepstrum values from DFT bins. Useful as a preliminary tool for looking at cepstral data for simple pitch or envelope methods.",
   :dc11/title "Simple Cepstrum",
   :foaf/maker :simple-cepstrum/library_maker,
   :foaf/page "http://code.soundsoftware.ac.uk/projects/vamp-simple-cepstrum",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :simple-cepstrum/simple-cepstrum,
   :vamp/has_source true,
   :vamp/identifier "simple-cepstrum"})

(def library_maker
  {:db/ident  :simple-cepstrum/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/qm.png",
   :foaf/name "Chris Cannam",
   :foaf/page "http://c4dm.eecs.qmul.ac.uk/"})

(def simple-cepstrum
  "Return simple cepstral data from DFT bins. This plugin is intended for casual inspection of cepstral data. It returns a lot of different sorts of data and is quite slow; it's not a good way to extract a single feature rapidly."
  {:db/ident :simple-cepstrum/simple-cepstrum,
   :dc11/description
   "Return simple cepstral data from DFT bins. This plugin is intended for casual inspection of cepstral data. It returns a lot of different sorts of data and is quite slow; it's not a good way to extract a single feature rapidly.",
   :dc11/rights "Freely redistributable (BSD license)",
   :dc11/title "Simple Cepstrum",
   :foaf/maker :simple-cepstrum/library_maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "simple-cepstrum",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Simple Cepstrum",
   :vamp/output [:simple-cepstrum/simple-cepstrum_output_peak_proportion
                 :simple-cepstrum/simple-cepstrum_output_cepstrum
                 :simple-cepstrum/simple-cepstrum_output_peak_to_rms
                 :simple-cepstrum/simple-cepstrum_output_peak
                 :simple-cepstrum/simple-cepstrum_output_interpolated_peak
                 :simple-cepstrum/simple-cepstrum_output_env
                 :simple-cepstrum/simple-cepstrum_output_variance
                 :simple-cepstrum/simple-cepstrum_output_am
                 :simple-cepstrum/simple-cepstrum_output_peak_to_second_peak
                 :simple-cepstrum/simple-cepstrum_output_raw_cepstral_peak
                 :simple-cepstrum/simple-cepstrum_output_total
                 :simple-cepstrum/simple-cepstrum_output_es],
   :vamp/parameter [:simple-cepstrum/simple-cepstrum_param_clamp
                    :simple-cepstrum/simple-cepstrum_param_fmax
                    :simple-cepstrum/simple-cepstrum_param_histlen
                    :simple-cepstrum/simple-cepstrum_param_method
                    :simple-cepstrum/simple-cepstrum_param_vflen
                    :simple-cepstrum/simple-cepstrum_param_fmin],
   :vamp/vamp_API_version :vamp/api_version_2})

(def simple-cepstrum_output_am
  "The cepstrum bins within the specified range, expressed as a value relative to the root mean square bin value in the range, with values below the RMS clamped to zero"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_am,
   :dc11/description
   "The cepstrum bins within the specified range, expressed as a value relative to the root mean square bin value in the range, with values below the RMS clamped to zero",
   :dc11/title "Cepstrum bins relative to RMS",
   :rdf/type :vamp/DenseOutput,
   :vamp/identifier "am"})

(def simple-cepstrum_output_cepstrum
  "The unprocessed cepstrum bins within the specified range"
  {:db/ident         :simple-cepstrum/simple-cepstrum_output_cepstrum,
   :dc11/description "The unprocessed cepstrum bins within the specified range",
   :dc11/title       "Cepstrum",
   :rdf/type         :vamp/DenseOutput,
   :vamp/identifier  "cepstrum",
   :vamp/unit        ""})

(def simple-cepstrum_output_env
  "Envelope calculated from the cepstral values below the specified minimum"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_env,
   :dc11/description
   "Envelope calculated from the cepstral values below the specified minimum",
   :dc11/title "Spectral envelope",
   :rdf/type :vamp/DenseOutput,
   :vamp/identifier "env"})

(def simple-cepstrum_output_es
  "Magnitude of spectrum values divided by calculated envelope values, to deconvolve the envelope"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_es,
   :dc11/description
   "Magnitude of spectrum values divided by calculated envelope values, to deconvolve the envelope",
   :dc11/title "Spectrum without envelope",
   :rdf/type :vamp/DenseOutput,
   :vamp/identifier "es"})

(def simple-cepstrum_output_interpolated_peak
  "Return the frequency whose period corresponds to the quefrency with the maximum bin value within the specified range of the cepstrum, using parabolic interpolation to estimate the peak quefrency to finer than single bin resolution"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_interpolated_peak,
   :dc11/description
   "Return the frequency whose period corresponds to the quefrency with the maximum bin value within the specified range of the cepstrum, using parabolic interpolation to estimate the peak quefrency to finer than single bin resolution",
   :dc11/title "Interpolated peak frequency",
   :rdf/type [:vamp/DenseOutput :vamp/KnownExtentsOutput],
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "interpolated_peak",
   :vamp/max_value 1000,
   :vamp/min_value 50,
   :vamp/unit "Hz"})

(def simple-cepstrum_output_peak
  "Return the value found in the maximum-valued bin within the specified range of the cepstrum"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_peak,
   :dc11/description
   "Return the value found in the maximum-valued bin within the specified range of the cepstrum",
   :dc11/title "Value at peak",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "peak",
   :vamp/unit ""})

(def simple-cepstrum_output_peak_proportion
  "Return the proportion of total energy that is found in the bins around the peak bin (as far as the nearest local minima), within the specified range of the cepstrum"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_peak_proportion,
   :dc11/description
   "Return the proportion of total energy that is found in the bins around the peak bin (as far as the nearest local minima), within the specified range of the cepstrum",
   :dc11/title "Energy around peak",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "peak_proportion",
   :vamp/unit ""})

(def simple-cepstrum_output_peak_to_rms
  "Return the difference between maximum and root mean square bin values within the specified range of the cepstrum"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_peak_to_rms,
   :dc11/description
   "Return the difference between maximum and root mean square bin values within the specified range of the cepstrum",
   :dc11/title "Peak-to-RMS distance",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "peak_to_rms",
   :vamp/unit ""})

(def simple-cepstrum_output_peak_to_second_peak
  "Return the difference between the value found in the peak bin within the specified range of the cepstrum, and that found in the next highest peak"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_peak_to_second_peak,
   :dc11/description
   "Return the difference between the value found in the peak bin within the specified range of the cepstrum, and that found in the next highest peak",
   :dc11/title "Peak to second-peak difference",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "peak_to_second_peak",
   :vamp/unit ""})

(def simple-cepstrum_output_raw_cepstral_peak
  "Return the frequency whose period corresponds to the quefrency with the maximum bin value within the specified range of the cepstrum"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_raw_cepstral_peak,
   :dc11/description
   "Return the frequency whose period corresponds to the quefrency with the maximum bin value within the specified range of the cepstrum",
   :dc11/title "Frequency corresponding to raw cepstral peak",
   :rdf/type [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "raw_cepstral_peak",
   :vamp/max_value 1000,
   :vamp/min_value 50,
   :vamp/unit "Hz"})

(def simple-cepstrum_output_total
  "Return the total energy found in all bins within the specified range of the cepstrum"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_total,
   :dc11/description
   "Return the total energy found in all bins within the specified range of the cepstrum",
   :dc11/title "Total energy",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "total",
   :vamp/unit ""})

(def simple-cepstrum_output_variance
  "Return the variance of bin values within the specified range of the cepstrum"
  {:db/ident :simple-cepstrum/simple-cepstrum_output_variance,
   :dc11/description
   "Return the variance of bin values within the specified range of the cepstrum",
   :dc11/title "Variance of cepstral bins in range",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "variance",
   :vamp/unit ""})

(def simple-cepstrum_param_clamp
  {:db/ident           :simple-cepstrum/simple-cepstrum_param_clamp,
   :dc11/format        "",
   :dc11/title         "Clamp negative values in cepstrum at zero",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "clamp",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def simple-cepstrum_param_fmax
  {:db/ident           :simple-cepstrum/simple-cepstrum_param_fmax,
   :dc11/format        "Hz",
   :dc11/title         "Maximum frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1000,
   :vamp/identifier    "fmax",
   :vamp/max_value     24000,
   :vamp/min_value     46.875M,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def simple-cepstrum_param_fmin
  {:db/ident           :simple-cepstrum/simple-cepstrum_param_fmin,
   :dc11/format        "Hz",
   :dc11/title         "Minimum frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 50,
   :vamp/identifier    "fmin",
   :vamp/max_value     24000,
   :vamp/min_value     46.875M,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def simple-cepstrum_param_histlen
  {:db/ident           :simple-cepstrum/simple-cepstrum_param_histlen,
   :dc11/format        "",
   :dc11/title         "Mean filter history length",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "histlen",
   :vamp/max_value     10,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def simple-cepstrum_param_method
  {:db/ident           :simple-cepstrum/simple-cepstrum_param_method,
   :dc11/format        "",
   :dc11/title         "Cepstrum transform method",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "method",
   :vamp/max_value     4,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Inverse symmetric"
                        "Inverse asymmetric"
                        "Inverse complex"
                        "Forward magnitude"
                        "Forward difference"]})

(def simple-cepstrum_param_vflen
  {:db/ident           :simple-cepstrum/simple-cepstrum_param_vflen,
   :dc11/format        "",
   :dc11/title         "Vertical filter length",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "vflen",
   :vamp/max_value     11,
   :vamp/min_value     1,
   :vamp/quantize_step 2,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})