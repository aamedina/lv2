(ns net.wikipunk.rdf.FChT_f0gram
  "http://vamp-plugins.org/rdf/plugins/FChT_f0gram"
  {:foaf/maker        "http://vamp-plugins.org/rdf/template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/FChT_f0gram",
   :rdf/ns-prefix-map {"FChT_f0gram"
                       "http://vamp-plugins.org/rdf/plugins/FChT_f0gram#",
                       "af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "FChT_f0gram",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/FChT_f0gram"})

(def fchtransformf0gram
  "This plug-in produces a representation, called F0gram, which exhibits the salience of the fundamental frequency of the sound sources in the audio file. The computation of the F0gram makes use of the Fan Chirp Transform analysis. It is based on the article \"Fan chirp transform for music representation\" P. Cancela, E. Lopez, M. Rocamora, International Conference on Digital Audio Effects, 13th. DAFx-10. Graz, Austria - 6-10 Sep 2010."
  {:db/ident :FChT_f0gram/fchtransformf0gram,
   :dc11/description
   "This plug-in produces a representation, called F0gram, which exhibits the salience of the fundamental frequency of the sound sources in the audio file. The computation of the F0gram makes use of the Fan Chirp Transform analysis. It is based on the article \"Fan chirp transform for music representation\"  P. Cancela, E. Lopez, M. Rocamora, International Conference on Digital Audio Effects, 13th. DAFx-10. Graz, Austria - 6-10 Sep 2010.",
   :dc11/rights "copyright (C) 2011 GPL - Audio Processing Group, UdelaR",
   :dc11/title "Fan Chirp Transform F0gram",
   :foaf/maker :FChT_f0gram/library_maker,
   :owl/versionInfo "0",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "fchtransformf0gram",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Fan Chirp Transform F0gram",
   :vamp/output :FChT_f0gram/fchtransformf0gram_output_f0gram,
   :vamp/parameter [:FChT_f0gram/fchtransformf0gram_param_num_f0_hyps
                    :FChT_f0gram/fchtransformf0gram_param_fmax
                    :FChT_f0gram/fchtransformf0gram_param_f0min
                    :FChT_f0gram/fchtransformf0gram_param_f0_prefer_fun
                    :FChT_f0gram/fchtransformf0gram_param_alpha_max
                    :FChT_f0gram/fchtransformf0gram_param_f0gram_mode
                    :FChT_f0gram/fchtransformf0gram_param_nsamp
                    :FChT_f0gram/fchtransformf0gram_param_f0s_per_oct
                    :FChT_f0gram/fchtransformf0gram_param_num_warps
                    :FChT_f0gram/fchtransformf0gram_param_nfft
                    :FChT_f0gram/fchtransformf0gram_param_num_octs
                    :FChT_f0gram/fchtransformf0gram_param_f0_prefer_stdev
                    :FChT_f0gram/fchtransformf0gram_param_alpha_dist
                    :FChT_f0gram/fchtransformf0gram_param_f0_prefer_mean],
   :vamp/vamp_API_version :vamp/api_version_2})

(def fchtransformf0gram_output_f0gram
  "This representation show the salience of the different f0s in the signal."
  {:db/ident :FChT_f0gram/fchtransformf0gram_output_f0gram,
   :dc11/description
   "This representation show the salience of the different f0s in the signal.",
   :dc11/title "F0gram: salience of f0s",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 768,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "f0gram",
   :vamp/unit "Hertz"})

(def fchtransformf0gram_param_alpha_dist
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_alpha_dist,
   :dc11/format        "",
   :dc11/title         "alpha distribution",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "alpha_dist",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["lin" "log"]})

(def fchtransformf0gram_param_alpha_max
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_alpha_max,
   :dc11/format        "Hz/s",
   :dc11/title         "Maximum alpha value",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 5,
   :vamp/identifier    "alpha_max",
   :vamp/max_value     10,
   :vamp/min_value     -10,
   :vamp/quantize_step 1,
   :vamp/unit          "Hz/s",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_f0_prefer_fun
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_f0_prefer_fun,
   :dc11/format        "",
   :dc11/title         "f0 preference function",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "f0_prefer_fun",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_f0_prefer_mean
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_f0_prefer_mean,
   :dc11/format        "",
   :dc11/title         "mean f0 preference function",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 60,
   :vamp/identifier    "f0_prefer_mean",
   :vamp/max_value     127,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_f0_prefer_stdev
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_f0_prefer_stdev,
   :dc11/format        "",
   :dc11/title         "stdev of f0 preference function",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 18,
   :vamp/identifier    "f0_prefer_stdev",
   :vamp/max_value     127,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_f0gram_mode
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_f0gram_mode,
   :dc11/format        "",
   :dc11/title         "display mode of f0gram",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "f0gram_mode",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_f0min
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_f0min,
   :dc11/format        "Hz",
   :dc11/title         "min f0",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 80,
   :vamp/identifier    "f0min",
   :vamp/max_value     500,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_f0s_per_oct
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_f0s_per_oct,
   :dc11/format        "",
   :dc11/title         "f0 values per octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 192,
   :vamp/identifier    "f0s_per_oct",
   :vamp/max_value     768,
   :vamp/min_value     12,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_fmax
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_fmax,
   :dc11/format        "Hz",
   :dc11/title         "Maximum frequency",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 10000,
   :vamp/identifier    "fmax",
   :vamp/max_value     22050,
   :vamp/min_value     2000,
   :vamp/quantize_step 1,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_nfft
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_nfft,
   :dc11/format        "samples",
   :dc11/title         "FFT number of points",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "nfft",
   :vamp/max_value     4,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   ["256" "512" "1024" "2048" "4096" "8192"]})

(def fchtransformf0gram_param_nsamp
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_nsamp,
   :dc11/format        "samples",
   :dc11/title         "Number of samples",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2048,
   :vamp/identifier    "nsamp",
   :vamp/max_value     4096,
   :vamp/min_value     128,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_num_f0_hyps
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_num_f0_hyps,
   :dc11/format        "",
   :dc11/title         "number of f0 hypotesis",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 10,
   :vamp/identifier    "num_f0_hyps",
   :vamp/max_value     100,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_num_octs
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_num_octs,
   :dc11/format        "",
   :dc11/title         "number of octaves",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 4,
   :vamp/identifier    "num_octs",
   :vamp/max_value     10,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def fchtransformf0gram_param_num_warps
  {:db/ident           :FChT_f0gram/fchtransformf0gram_param_num_warps,
   :dc11/format        "",
   :dc11/title         "Number of warpings",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 21,
   :vamp/identifier    "num_warps",
   :vamp/max_value     101,
   :vamp/min_value     1,
   :vamp/quantize_step 2,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def library
  "Fundamental-frequency salience visualisation based on the Fan Chirp Transform, from the Universidad de la Republica, Uruguay"
  {:db/ident :FChT_f0gram/library,
   :dc11/description
   "Fundamental-frequency salience visualisation based on the Fan Chirp Transform, from the Universidad de la Republica, Uruguay",
   :dc11/title "Fan Chirp F0gram",
   :doap/download-page
   "http://iie.fing.edu.uy/investigacion/grupos/gpa/vamp-plugin.html",
   :foaf/maker :FChT_f0gram/library_maker,
   :foaf/page
   "http://iie.fing.edu.uy/investigacion/grupos/gpa/vamp-plugin.html",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin :FChT_f0gram/fchtransformf0gram,
   :vamp/has_binary ["win32" "linux32" "osx" "linux64"],
   :vamp/has_source true,
   :vamp/identifier "fanchirp"})

(def library_maker
  {:db/ident  :FChT_f0gram/library_maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/udelar.png",
   :foaf/name "Audio Processing Group, Universidad de la Republica, Uruguay",
   :foaf/page "http://iie.fing.edu.uy/investigacion/grupos/gpa/index.html"})