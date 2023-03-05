(ns net.wikipunk.rdf.bbc
  "http://vamp-plugins.org/rdf/plugins/bbc-vamp-plugins"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/bbc-vamp-plugins",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "bbc"
                       "http://vamp-plugins.org/rdf/plugins/bbc-vamp-plugins#",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "plugbase"
                       "http://vamp-plugins.org/rdf/plugins/bbc-vamp-plugins#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "bbc",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/bbc-vamp-plugins"})

(def bbc-energy
  "Calculates the RMS energy and low energy ratio of a signal"
  {:db/ident :bbc/bbc-energy,
   :dc11/description
   "Calculates the RMS energy and low energy ratio of a signal",
   :dc11/rights "(c) 2013 British Broadcasting Corporation",
   :dc11/title "Energy",
   :foaf/maker :bbc/maker,
   :owl/versionInfo "3",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "bbc-energy",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Energy",
   :vamp/output [:bbc/bbc-energy_output_pdip
                 :bbc/bbc-energy_output_rmsenergy
                 :bbc/bbc-energy_output_lowenergy
                 :bbc/bbc-energy_output_rmsdelta
                 :bbc/bbc-energy_output_average],
   :vamp/parameter [:bbc/bbc-energy_param_avgwindow
                    :bbc/bbc-energy_param_threshold
                    :bbc/bbc-energy_param_avgpercentile
                    :bbc/bbc-energy_param_root
                    :bbc/bbc-energy_param_dipthresh],
   :vamp/vamp_API_version :vamp/api_version_2})

(def bbc-energy_output_average
  "Mean of RMS values over moving average window."
  {:db/ident             :bbc/bbc-energy_output_average,
   :dc11/description     "Mean of RMS values over moving average window.",
   :dc11/title           "Moving Average",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "average",
   :vamp/unit            ""})

(def bbc-energy_output_lowenergy
  "Percentage of track which is below the low energy threshold."
  {:db/ident :bbc/bbc-energy_output_lowenergy,
   :dc11/description
   "Percentage of track which is below the low energy threshold.",
   :dc11/title "Low Energy",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "lowenergy",
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def bbc-energy_output_pdip
  "Probability of the RMS energy dipping below the threshold."
  {:db/ident :bbc/bbc-energy_output_pdip,
   :dc11/description
   "Probability of the RMS energy dipping below the threshold.",
   :dc11/title "Dip probability",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "pdip",
   :vamp/unit ""})

(def bbc-energy_output_rmsdelta
  "Difference between RMS of previous and current blocks."
  {:db/ident :bbc/bbc-energy_output_rmsdelta,
   :dc11/description "Difference between RMS of previous and current blocks.",
   :dc11/title "RMS Energy Delta",
   :rdf/type :vamp/DenseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "rmsdelta",
   :vamp/unit ""})

(def bbc-energy_output_rmsenergy
  "RMS of the signal."
  {:db/ident             :bbc/bbc-energy_output_rmsenergy,
   :dc11/description     "RMS of the signal.",
   :dc11/title           "RMS Energy",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rmsenergy",
   :vamp/unit            ""})

(def bbc-energy_param_avgpercentile
  {:db/ident           :bbc/bbc-energy_param_avgpercentile,
   :dc11/format        "",
   :dc11/title         "Moving average percentile",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 3,
   :vamp/identifier    "avgpercentile",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-energy_param_avgwindow
  {:db/ident           :bbc/bbc-energy_param_avgwindow,
   :dc11/format        "seconds",
   :dc11/title         "Moving average window size",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1,
   :vamp/identifier    "avgwindow",
   :vamp/max_value     10,
   :vamp/min_value     0.001M,
   :vamp/unit          "seconds",
   :vamp/value_names   :rdf/nil})

(def bbc-energy_param_dipthresh
  {:db/ident           :bbc/bbc-energy_param_dipthresh,
   :dc11/format        "",
   :dc11/title         "Dip threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 3,
   :vamp/identifier    "dipthresh",
   :vamp/max_value     10,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-energy_param_root
  {:db/ident           :bbc/bbc-energy_param_root,
   :dc11/format        "",
   :dc11/title         "Use root",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "root",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-energy_param_threshold
  {:db/ident           :bbc/bbc-energy_param_threshold,
   :dc11/format        "",
   :dc11/title         "Low energy threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1,
   :vamp/identifier    "threshold",
   :vamp/max_value     10,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-intensity
  "Calculates the intensity of a signal and the intensity ratio for a number of sub-bands"
  {:db/ident :bbc/bbc-intensity,
   :dc11/description
   "Calculates the intensity of a signal and the intensity ratio for a number of sub-bands",
   :dc11/rights "(c) 2013 British Broadcasting Corporation",
   :dc11/title "Intensity",
   :foaf/maker :bbc/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "bbc-intensity",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Intensity",
   :vamp/output [:bbc/bbc-intensity_output_intensity-ratio
                 :bbc/bbc-intensity_output_intensity],
   :vamp/parameter :bbc/bbc-intensity_param_numBands,
   :vamp/vamp_API_version :vamp/api_version_2})

(def bbc-intensity_output_intensity
  "Sum of the FFT bin absolute values."
  {:db/ident             :bbc/bbc-intensity_output_intensity,
   :dc11/description     "Sum of the FFT bin absolute values.",
   :dc11/title           "Intensity",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "intensity",
   :vamp/unit            ""})

(def bbc-intensity_output_intensity-ratio
  "Sum of each sub-band's absolute values."
  {:db/ident             :bbc/bbc-intensity_output_intensity-ratio,
   :dc11/description     "Sum of each sub-band's absolute values.",
   :dc11/title           "Intensity Ratio",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       7,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "intensity-ratio",
   :vamp/unit            ""})

(def bbc-intensity_param_numBands
  {:db/ident           :bbc/bbc-intensity_param_numBands,
   :dc11/format        "",
   :dc11/title         "Sub-bands",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 7,
   :vamp/identifier    "numBands",
   :vamp/max_value     50,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-peaks
  "Calculates peak and trough values of a signal"
  {:db/ident              :bbc/bbc-peaks,
   :dc11/description      "Calculates peak and trough values of a signal",
   :dc11/rights           "(c) 2014 British Broadcasting Corporation",
   :dc11/title            "Peaks",
   :foaf/maker            {:foaf/name "BBC"},
   :owl/versionInfo       "1",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "bbc-peaks",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Peaks",
   :vamp/output           :bbc/bbc-peaks_output_peaks,
   :vamp/vamp_API_version :vamp/api_version_2})

(def bbc-peaks_output_peaks
  "Peak and trough, in order of occurance."
  {:db/ident             :bbc/bbc-peaks_output_peaks,
   :dc11/description     "Peak and trough, in order of occurance.",
   :dc11/title           "Peaks",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "peaks",
   :vamp/unit            ""})

(def bbc-rhythm
  "Calculates rhythmic features of a signal, including onsets and tempo"
  {:db/ident :bbc/bbc-rhythm,
   :dc11/description
   "Calculates rhythmic features of a signal, including onsets and tempo ",
   :dc11/rights "(c) 2013 British Broadcasting Corporation",
   :dc11/title "Rhythm",
   :foaf/maker :bbc/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "bbc-rhythm",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Rhythm",
   :vamp/output [:bbc/bbc-rhythm_output_onset
                 :bbc/bbc-rhythm_output_rhythm-strength
                 :bbc/bbc-rhythm_output_tempo
                 :bbc/bbc-rhythm_output_onset_curve
                 :bbc/bbc-rhythm_output_autocor
                 :bbc/bbc-rhythm_output_peak-valley-ratio
                 :bbc/bbc-rhythm_output_average
                 :bbc/bbc-rhythm_output_mean-correlation-peak
                 :bbc/bbc-rhythm_output_diff
                 :bbc/bbc-rhythm_output_avg-onset-freq],
   :vamp/parameter [:bbc/bbc-rhythm_param_threshold
                    :bbc/bbc-rhythm_param_min_bpm
                    :bbc/bbc-rhythm_param_average_window
                    :bbc/bbc-rhythm_param_numBands
                    :bbc/bbc-rhythm_param_peak_window
                    :bbc/bbc-rhythm_param_max_bpm],
   :vamp/vamp_API_version :vamp/api_version_2})

(def bbc-rhythm_output_autocor
  "Autocorrelation of onset detection curve."
  {:db/ident             :bbc/bbc-rhythm_output_autocor,
   :dc11/description     "Autocorrelation of onset detection curve.",
   :dc11/title           "Autocorrelation",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "autocor",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_average
  "Moving average of onset curve."
  {:db/ident             :bbc/bbc-rhythm_output_average,
   :dc11/description     "Moving average of onset curve.",
   :dc11/title           "Average",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "average",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_avg-onset-freq
  "Rate of onsets per minute."
  {:db/ident             :bbc/bbc-rhythm_output_avg-onset-freq,
   :dc11/description     "Rate of onsets per minute.",
   :dc11/title           "Average Onset Frequency",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "avg-onset-freq",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_diff
  "Difference between onset and average."
  {:db/ident             :bbc/bbc-rhythm_output_diff,
   :dc11/description     "Difference between onset and average.",
   :dc11/title           "Difference",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "diff",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_mean-correlation-peak
  "Mean of the peak autocorrelation values."
  {:db/ident             :bbc/bbc-rhythm_output_mean-correlation-peak,
   :dc11/description     "Mean of the peak autocorrelation values.",
   :dc11/title           "Mean Correlation Peak",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mean-correlation-peak",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_onset
  "Point of onsets."
  {:db/ident             :bbc/bbc-rhythm_output_onset,
   :dc11/description     "Point of onsets.",
   :dc11/title           "Onset",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onset",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_onset_curve
  "Onset detection curve."
  {:db/ident             :bbc/bbc-rhythm_output_onset_curve,
   :dc11/description     "Onset detection curve.",
   :dc11/title           "Onset curve",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "onset_curve",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_peak-valley-ratio
  "Ratio of the mean correlation peak to the mean correlation valley."
  {:db/ident :bbc/bbc-rhythm_output_peak-valley-ratio,
   :dc11/description
   "Ratio of the mean correlation peak to the mean correlation valley.",
   :dc11/title "Peak-Valley Ratio",
   :rdf/type :vamp/SparseOutput,
   :vamp/bin_count 1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier "peak-valley-ratio",
   :vamp/sample_type :vamp/VariableSampleRate,
   :vamp/unit ""})

(def bbc-rhythm_output_rhythm-strength
  "Average value of peaks in onset curve."
  {:db/ident             :bbc/bbc-rhythm_output_rhythm-strength,
   :dc11/description     "Average value of peaks in onset curve.",
   :dc11/title           "Rhythm Strength",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rhythm-strength",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def bbc-rhythm_output_tempo
  "Overall tempo of the track in BPM."
  {:db/ident             :bbc/bbc-rhythm_output_tempo,
   :dc11/description     "Overall tempo of the track in BPM.",
   :dc11/title           "Tempo",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "tempo",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "bpm"})

(def bbc-rhythm_param_average_window
  {:db/ident           :bbc/bbc-rhythm_param_average_window,
   :dc11/format        "frames",
   :dc11/title         "Moving average window length",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 200,
   :vamp/identifier    "average_window",
   :vamp/max_value     500,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "frames",
   :vamp/value_names   :rdf/nil})

(def bbc-rhythm_param_max_bpm
  {:db/ident           :bbc/bbc-rhythm_param_max_bpm,
   :dc11/format        "bpm",
   :dc11/title         "Maximum BPM",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 300,
   :vamp/identifier    "max_bpm",
   :vamp/max_value     400,
   :vamp/min_value     50,
   :vamp/quantize_step 1,
   :vamp/unit          "bpm",
   :vamp/value_names   :rdf/nil})

(def bbc-rhythm_param_min_bpm
  {:db/ident           :bbc/bbc-rhythm_param_min_bpm,
   :dc11/format        "bpm",
   :dc11/title         "Minimum BPM",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 12,
   :vamp/identifier    "min_bpm",
   :vamp/max_value     300,
   :vamp/min_value     5,
   :vamp/quantize_step 1,
   :vamp/unit          "bpm",
   :vamp/value_names   :rdf/nil})

(def bbc-rhythm_param_numBands
  {:db/ident           :bbc/bbc-rhythm_param_numBands,
   :dc11/format        "",
   :dc11/title         "Sub-bands",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 7,
   :vamp/identifier    "numBands",
   :vamp/max_value     50,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-rhythm_param_peak_window
  {:db/ident           :bbc/bbc-rhythm_param_peak_window,
   :dc11/format        "frames",
   :dc11/title         "Onset peak window length",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 6,
   :vamp/identifier    "peak_window",
   :vamp/max_value     20,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "frames",
   :vamp/value_names   :rdf/nil})

(def bbc-rhythm_param_threshold
  {:db/ident           :bbc/bbc-rhythm_param_threshold,
   :dc11/format        "",
   :dc11/title         "Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1,
   :vamp/identifier    "threshold",
   :vamp/max_value     10,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-spectral-contrast
  "Calculates the peak and valleys of the spectral contrast feature"
  {:db/ident :bbc/bbc-spectral-contrast,
   :dc11/description
   "Calculates the peak and valleys of the spectral contrast feature",
   :dc11/rights "(c) 2013 British Broadcasting Corporation",
   :dc11/title "Spectral Contrast",
   :foaf/maker :bbc/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "bbc-spectral-contrast",
   :vamp/input_domain :vamp/FrequencyDomain,
   :vamp/name "Spectral Contrast",
   :vamp/output [:bbc/bbc-spectral-contrast_output_peaks
                 :bbc/bbc-spectral-contrast_output_valleys
                 :bbc/bbc-spectral-contrast_output_mean],
   :vamp/parameter [:bbc/bbc-spectral-contrast_param_alpha
                    :bbc/bbc-spectral-contrast_param_numBands],
   :vamp/vamp_API_version :vamp/api_version_2})

(def bbc-spectral-contrast_output_mean
  "Mean of the spectrum."
  {:db/ident             :bbc/bbc-spectral-contrast_output_mean,
   :dc11/description     "Mean of the spectrum.",
   :dc11/title           "Spectral Mean",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       7,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "mean",
   :vamp/unit            ""})

(def bbc-spectral-contrast_output_peaks
  "Peak of the spectrum."
  {:db/ident             :bbc/bbc-spectral-contrast_output_peaks,
   :dc11/description     "Peak of the spectrum.",
   :dc11/title           "Spectral Peaks",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       7,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "peaks",
   :vamp/unit            ""})

(def bbc-spectral-contrast_output_valleys
  "Valley of the spectrum."
  {:db/ident             :bbc/bbc-spectral-contrast_output_valleys,
   :dc11/description     "Valley of the spectrum.",
   :dc11/title           "Spectral Valleys",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       7,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "valleys",
   :vamp/unit            ""})

(def bbc-spectral-contrast_param_alpha
  {:db/ident           :bbc/bbc-spectral-contrast_param_alpha,
   :dc11/format        "",
   :dc11/title         "Alpha",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.02M,
   :vamp/identifier    "alpha",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-spectral-contrast_param_numBands
  {:db/ident           :bbc/bbc-spectral-contrast_param_numBands,
   :dc11/format        "",
   :dc11/title         "Sub-bands",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 7,
   :vamp/identifier    "numBands",
   :vamp/max_value     50,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-spectral-flux
  "Calculates the spectral flux"
  {:db/ident              :bbc/bbc-spectral-flux,
   :dc11/description      "Calculates the spectral flux",
   :dc11/rights           "(c) 2013 British Broadcasting Corporation",
   :dc11/title            "Spectral Flux",
   :foaf/maker            :bbc/maker,
   :owl/versionInfo       "1",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "bbc-spectral-flux",
   :vamp/input_domain     :vamp/FrequencyDomain,
   :vamp/name             "Spectral Flux",
   :vamp/output           :bbc/bbc-spectral-flux_output_spectral-flux,
   :vamp/parameter        :bbc/bbc-spectral-flux_param_usel2,
   :vamp/vamp_API_version :vamp/api_version_2})

(def bbc-spectral-flux_output_spectral-flux
  "Difference between FFT bin values."
  {:db/ident             :bbc/bbc-spectral-flux_output_spectral-flux,
   :dc11/description     "Difference between FFT bin values.",
   :dc11/title           "Spectral Flux",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectral-flux",
   :vamp/unit            ""})

(def bbc-spectral-flux_param_usel2
  {:db/ident           :bbc/bbc-spectral-flux_param_usel2,
   :dc11/format        "",
   :dc11/title         "Use L2 norm over L1",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "usel2",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-speechmusic-segmenter
  "Calculates boundaries between speech and music"
  {:db/ident :bbc/bbc-speechmusic-segmenter,
   :dc11/description "Calculates boundaries between speech and music",
   :dc11/rights "(c) 2011 British Broadcasting Corporation",
   :dc11/title "Speech/Music segmenter",
   :foaf/maker :bbc/maker,
   :owl/versionInfo "1",
   :rdf/type :vamp/Plugin,
   :vamp/identifier "bbc-speechmusic-segmenter",
   :vamp/input_domain :vamp/TimeDomain,
   :vamp/name "Speech/Music segmenter",
   :vamp/output [:bbc/bbc-speechmusic-segmenter_output_segmentation
                 :bbc/bbc-speechmusic-segmenter_output_skewness],
   :vamp/parameter [:bbc/bbc-speechmusic-segmenter_param_resolution
                    :bbc/bbc-speechmusic-segmenter_param_decision_threshold
                    :bbc/bbc-speechmusic-segmenter_param_margin
                    :bbc/bbc-speechmusic-segmenter_param_min_music_length
                    :bbc/bbc-speechmusic-segmenter_param_change_threshold],
   :vamp/vamp_API_version :vamp/api_version_2})

(def bbc-speechmusic-segmenter_output_segmentation
  "Segmentation"
  {:db/ident             :bbc/bbc-speechmusic-segmenter_output_segmentation,
   :dc11/description     "Segmentation",
   :dc11/title           "Segmentation",
   :rdf/type             [:vamp/SparseOutput
                          :vamp/QuantizedOutput
                          :vamp/KnownExtentsOutput],
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "segmentation",
   :vamp/max_value       2,
   :vamp/min_value       0,
   :vamp/quantize_step   1,
   :vamp/sample_rate     0,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "segment-type"})

(def bbc-speechmusic-segmenter_output_skewness
  "Detection function"
  {:db/ident             :bbc/bbc-speechmusic-segmenter_output_skewness,
   :dc11/description     "Detection function",
   :dc11/title           "Detection function",
   :rdf/type             [:vamp/QuantizedOutput
                          :vamp/KnownExtentsOutput
                          :vamp/SparseOutput],
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "skewness",
   :vamp/max_value       2,
   :vamp/min_value       0,
   :vamp/quantize_step   1,
   :vamp/sample_rate     0,
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "segment-type"})

(def bbc-speechmusic-segmenter_param_change_threshold
  {:db/ident           :bbc/bbc-speechmusic-segmenter_param_change_threshold,
   :dc11/format        "",
   :dc11/title         "Change threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.0781M,
   :vamp/identifier    "change_threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-speechmusic-segmenter_param_decision_threshold
  {:db/ident           :bbc/bbc-speechmusic-segmenter_param_decision_threshold,
   :dc11/format        "",
   :dc11/title         "Decision threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.2734M,
   :vamp/identifier    "decision_threshold",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-speechmusic-segmenter_param_margin
  {:db/ident           :bbc/bbc-speechmusic-segmenter_param_margin,
   :dc11/format        "",
   :dc11/title         "Margin",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 14,
   :vamp/identifier    "margin",
   :vamp/max_value     50,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-speechmusic-segmenter_param_min_music_length
  {:db/ident           :bbc/bbc-speechmusic-segmenter_param_min_music_length,
   :dc11/format        "",
   :dc11/title         "Minimum music segment length",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "min_music_length",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def bbc-speechmusic-segmenter_param_resolution
  {:db/ident           :bbc/bbc-speechmusic-segmenter_param_resolution,
   :dc11/format        "",
   :dc11/title         "Resolution",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 256,
   :vamp/identifier    "resolution",
   :vamp/max_value     1024,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def library
  "A collection of audio feature extraction algorithms from BBC Research and Development"
  {:db/ident :bbc/library,
   :dc11/description
   "A collection of audio feature extraction algorithms from BBC Research and Development",
   :dc11/title "BBC Vamp Plugins",
   :doap/download-page "https://github.com/bbcrd/bbc-vamp-plugins/releases",
   :foaf/maker :bbc/maker,
   :foaf/page "https://github.com/bbcrd/bbc-vamp-plugins/blob/master/README.md",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:bbc/bbc-spectral-flux
                           :bbc/bbc-energy
                           :bbc/bbc-speechmusic-segmenter
                           :bbc/bbc-intensity
                           :bbc/bbc-rhythm
                           :bbc/bbc-peaks
                           :bbc/bbc-spectral-contrast],
   :vamp/has_binary ["osx" "linux64" "linux32" "win32"],
   :vamp/has_source true,
   :vamp/identifier "bbc-vamp-plugins"})

(def maker
  {:db/ident  :bbc/maker,
   :foaf/logo "http://vamp-plugins.org/rdf/plugins/makers/bbc.png",
   :foaf/name "BBC",
   :foaf/page "http://www.bbc.co.uk/"})