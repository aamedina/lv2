(ns net.wikipunk.rdf.mazurka
  "http://vamp-plugins.org/rdf/plugins/mazurka-plugins"
  {:foaf/maker        "http://www.vamp-plugins.org/doap.rdf#template-generator",
   :foaf/primaryTopic "http://vamp-plugins.org/rdf/plugins/mazurka-plugins",
   :rdf/ns-prefix-map {"af" "http://purl.org/ontology/af/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "mazurka"
                       "http://vamp-plugins.org/rdf/plugins/mazurka-plugins#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vamp" "http://purl.org/ontology/vamp/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :vamp/PluginDescription,
   :rdfa/prefix       "mazurka",
   :rdfa/uri          "http://vamp-plugins.org/rdf/plugins/mazurka-plugins"})

(def library
  "Spectral visualisation and feature extraction plugins from the Mazurka project"
  {:db/ident :mazurka/library,
   :dc11/description
   "Spectral visualisation and feature extraction plugins from the Mazurka project",
   :dc11/title "Mazurka Plugins",
   :doap/download-page "http://www.mazurka.org.uk/software/sv/plugin/download/",
   :foaf/maker :mazurka/maker,
   :foaf/page "http://www.mazurka.org.uk/software/sv/plugin/",
   :rdf/type :vamp/PluginLibrary,
   :vamp/available_plugin [:mazurka/mznevermore
                           :mazurka/mzpowercurve
                           :mazurka/mzspectralflux
                           :mazurka/mzharmonicspectrum
                           :mazurka/mzchronogram
                           :mazurka/mzspectralreflux],
   :vamp/has_binary ["linux32" "win32"],
   :vamp/identifier "mazurka-plugins"})

(def maker
  {:db/ident  :mazurka/maker,
   :foaf/name "The Mazurka Project",
   :foaf/page "http://www.mazurka.org.uk/"})

(def mzchronogram
  "Chronogram"
  {:db/ident              :mazurka/mzchronogram,
   :dc11/description      "Chronogram",
   :dc11/rights           "2006 Craig Stuart Sapp",
   :dc11/title            "Chronogram",
   :foaf/maker            :mazurka/maker,
   :owl/versionInfo       "200605270",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "mzchronogram",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Chronogram",
   :vamp/output           :mazurka/mzchronogram_output_,
   :vamp/parameter        [:mazurka/mzchronogram_param_frequency
                           :mazurka/mzchronogram_param_octave
                           :mazurka/mzchronogram_param_verticalperiod
                           :mazurka/mzchronogram_param_sensitivity
                           :mazurka/mzchronogram_param_channelview
                           :mazurka/mzchronogram_param_chroma],
   :vamp/vamp_API_version :vamp/api_version_1})

(def mzchronogram_output_
  "chronogram"
  {:db/ident             :mazurka/mzchronogram_output_,
   :dc11/description     "chronogram",
   :dc11/title           "Chronogram",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "",
   :vamp/unit            ""})

(def mzchronogram_param_channelview
  {:db/ident           :mazurka/mzchronogram_param_channelview,
   :dc11/format        "",
   :dc11/title         "Channel view",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value -2,
   :vamp/identifier    "channelview",
   :vamp/max_value     1,
   :vamp/min_value     -2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["stereo"
                        "stereo difference"
                        "left channel"
                        "right channel"]})

(def mzchronogram_param_chroma
  {:db/ident :mazurka/mzchronogram_param_chroma,
   :dc11/format "",
   :dc11/title "or Chroma",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 12,
   :vamp/identifier "chroma",
   :vamp/max_value 12,
   :vamp/min_value 0,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names ["C" "C#" "D" "D#" "E" "F" "F#" "G" "G#" "A" "A#" "B" ""]})

(def mzchronogram_param_frequency
  {:db/ident           :mazurka/mzchronogram_param_frequency,
   :dc11/format        "Hz",
   :dc11/title         "or Frequency",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "frequency",
   :vamp/max_value     10000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mzchronogram_param_octave
  {:db/ident           :mazurka/mzchronogram_param_octave,
   :dc11/format        "",
   :dc11/title         "+ Octave",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "octave",
   :vamp/max_value     9,
   :vamp/min_value     -1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["-1" "0" "1" "2" "3" "4" "5" "6" "7" "8" "9"]})

(def mzchronogram_param_sensitivity
  {:db/ident           :mazurka/mzchronogram_param_sensitivity,
   :dc11/format        "",
   :dc11/title         "Sensitivity",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "sensitivity",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzchronogram_param_verticalperiod
  {:db/ident           :mazurka/mzchronogram_param_verticalperiod,
   :dc11/format        "samples",
   :dc11/title         "Vertical period",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 100,
   :vamp/identifier    "verticalperiod",
   :vamp/max_value     10000,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mzharmonicspectrum
  "Harmonic Spectrogram"
  {:db/ident              :mazurka/mzharmonicspectrum,
   :dc11/description      "Harmonic Spectrogram",
   :dc11/rights           "2006 Craig Stuart Sapp",
   :dc11/title            "Harmonic Spectrogram",
   :foaf/maker            :mazurka/maker,
   :owl/versionInfo       "200606190",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "mzharmonicspectrum",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Harmonic Spectrogram",
   :vamp/output           [:mazurka/mzharmonicspectrum_output_rawpitch
                           :mazurka/mzharmonicspectrum_output_spectralpower
                           :mazurka/mzharmonicspectrum_output_spectrogram],
   :vamp/parameter        [:mazurka/mzharmonicspectrum_param_compress
                           :mazurka/mzharmonicspectrum_param_stepsamples
                           :mazurka/mzharmonicspectrum_param_windowsamples
                           :mazurka/mzharmonicspectrum_param_minpitch
                           :mazurka/mzharmonicspectrum_param_harmonics
                           :mazurka/mzharmonicspectrum_param_maxpitch
                           :mazurka/mzharmonicspectrum_param_method],
   :vamp/vamp_API_version :vamp/api_version_1})

(def mzharmonicspectrum_output_rawpitch
  ""
  {:db/ident             :mazurka/mzharmonicspectrum_output_rawpitch,
   :dc11/description     "",
   :dc11/title           "HS raw pitch estimate",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rawpitch",
   :vamp/unit            "Hz"})

(def mzharmonicspectrum_output_spectralpower
  ""
  {:db/ident             :mazurka/mzharmonicspectrum_output_spectralpower,
   :dc11/description     "",
   :dc11/title           "Spectral power",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralpower",
   :vamp/unit            ""})

(def mzharmonicspectrum_output_spectrogram
  ""
  {:db/ident             :mazurka/mzharmonicspectrum_output_spectrogram,
   :dc11/description     "",
   :dc11/title           "Spectrogram",
   :rdf/type             [:vamp/KnownExtentsOutput :vamp/DenseOutput],
   :vamp/bin_count       512,
   :vamp/bin_names       ["0:1"
                          "1:4"
                          "2:7"
                          "3:9"
                          "4:12"
                          "5:15"
                          "6:17"
                          "7:20"
                          "8:23"
                          "9:26"
                          "10:28"
                          "11:31"
                          "12:34"
                          "13:36"
                          "14:39"
                          "15:42"
                          "16:44"
                          "17:47"
                          "18:50"
                          "19:52"
                          "20:55"
                          "21:58"
                          "22:61"
                          "23:63"
                          "24:66"
                          "25:69"
                          "26:71"
                          "27:74"
                          "28:77"
                          "29:79"
                          "30:82"
                          "31:85"
                          "32:87"
                          "33:90"
                          "34:93"
                          "35:96"
                          "36:98"
                          "37:101"
                          "38:104"
                          "39:106"
                          "40:109"
                          "41:112"
                          "42:114"
                          "43:117"
                          "44:120"
                          "45:122"
                          "46:125"
                          "47:128"
                          "48:131"
                          "49:133"
                          "50:136"
                          "51:139"
                          "52:141"
                          "53:144"
                          "54:147"
                          "55:149"
                          "56:152"
                          "57:155"
                          "58:157"
                          "59:160"
                          "60:163"
                          "61:166"
                          "62:168"
                          "63:171"
                          "64:174"
                          "65:176"
                          "66:179"
                          "67:182"
                          "68:184"
                          "69:187"
                          "70:190"
                          "71:192"
                          "72:195"
                          "73:198"
                          "74:201"
                          "75:203"
                          "76:206"
                          "77:209"
                          "78:211"
                          "79:214"
                          "80:217"
                          "81:219"
                          "82:222"
                          "83:225"
                          "84:227"
                          "85:230"
                          "86:233"
                          "87:236"
                          "88:238"
                          "89:241"
                          "90:244"
                          "91:246"
                          "92:249"
                          "93:252"
                          "94:254"
                          "95:257"
                          "96:260"
                          "97:262"
                          "98:265"
                          "99:268"
                          "100:271"
                          "101:273"
                          "102:276"
                          "103:279"
                          "104:281"
                          "105:284"
                          "106:287"
                          "107:289"
                          "108:292"
                          "109:295"
                          "110:297"
                          "111:300"
                          "112:303"
                          "113:306"
                          "114:308"
                          "115:311"
                          "116:314"
                          "117:316"
                          "118:319"
                          "119:322"
                          "120:324"
                          "121:327"
                          "122:330"
                          "123:332"
                          "124:335"
                          "125:338"
                          "126:340"
                          "127:343"
                          "128:346"
                          "129:349"
                          "130:351"
                          "131:354"
                          "132:357"
                          "133:359"
                          "134:362"
                          "135:365"
                          "136:367"
                          "137:370"
                          "138:373"
                          "139:375"
                          "140:378"
                          "141:381"
                          "142:384"
                          "143:386"
                          "144:389"
                          "145:392"
                          "146:394"
                          "147:397"
                          "148:400"
                          "149:402"
                          "150:405"
                          "151:408"
                          "152:410"
                          "153:413"
                          "154:416"
                          "155:419"
                          "156:421"
                          "157:424"
                          "158:427"
                          "159:429"
                          "160:432"
                          "161:435"
                          "162:437"
                          "163:440"
                          "164:443"
                          "165:445"
                          "166:448"
                          "167:451"
                          "168:454"
                          "169:456"
                          "170:459"
                          "171:462"
                          "172:464"
                          "173:467"
                          "174:470"
                          "175:472"
                          "176:475"
                          "177:478"
                          "178:480"
                          "179:483"
                          "180:486"
                          "181:489"
                          "182:491"
                          "183:494"
                          "184:497"
                          "185:499"
                          "186:502"
                          "187:505"
                          "188:507"
                          "189:510"
                          "190:513"
                          "191:515"
                          "192:518"
                          "193:521"
                          "194:524"
                          "195:526"
                          "196:529"
                          "197:532"
                          "198:534"
                          "199:537"
                          "200:540"
                          "201:542"
                          "202:545"
                          "203:548"
                          "204:550"
                          "205:553"
                          "206:556"
                          "207:559"
                          "208:561"
                          "209:564"
                          "210:567"
                          "211:569"
                          "212:572"
                          "213:575"
                          "214:577"
                          "215:580"
                          "216:583"
                          "217:585"
                          "218:588"
                          "219:591"
                          "220:594"
                          "221:596"
                          "222:599"
                          "223:602"
                          "224:604"
                          "225:607"
                          "226:610"
                          "227:612"
                          "228:615"
                          "229:618"
                          "230:620"
                          "231:623"
                          "232:626"
                          "233:629"
                          "234:631"
                          "235:634"
                          "236:637"
                          "237:639"
                          "238:642"
                          "239:645"
                          "240:647"
                          "241:650"
                          "242:653"
                          "243:655"
                          "244:658"
                          "245:661"
                          "246:663"
                          "247:666"
                          "248:669"
                          "249:672"
                          "250:674"
                          "251:677"
                          "252:680"
                          "253:682"
                          "254:685"
                          "255:688"
                          "256:690"
                          "257:693"
                          "258:696"
                          "259:698"
                          "260:701"
                          "261:704"
                          "262:707"
                          "263:709"
                          "264:712"
                          "265:715"
                          "266:717"
                          "267:720"
                          "268:723"
                          "269:725"
                          "270:728"
                          "271:731"
                          "272:733"
                          "273:736"
                          "274:739"
                          "275:742"
                          "276:744"
                          "277:747"
                          "278:750"
                          "279:752"
                          "280:755"
                          "281:758"
                          "282:760"
                          "283:763"
                          "284:766"
                          "285:768"
                          "286:771"
                          "287:774"
                          "288:777"
                          "289:779"
                          "290:782"
                          "291:785"
                          "292:787"
                          "293:790"
                          "294:793"
                          "295:795"
                          "296:798"
                          "297:801"
                          "298:803"
                          "299:806"
                          "300:809"
                          "301:812"
                          "302:814"
                          "303:817"
                          "304:820"
                          "305:822"
                          "306:825"
                          "307:828"
                          "308:830"
                          "309:833"
                          "310:836"
                          "311:838"
                          "312:841"
                          "313:844"
                          "314:847"
                          "315:849"
                          "316:852"
                          "317:855"
                          "318:857"
                          "319:860"
                          "320:863"
                          "321:865"
                          "322:868"
                          "323:871"
                          "324:873"
                          "325:876"
                          "326:879"
                          "327:882"
                          "328:884"
                          "329:887"
                          "330:890"
                          "331:892"
                          "332:895"
                          "333:898"
                          "334:900"
                          "335:903"
                          "336:906"
                          "337:908"
                          "338:911"
                          "339:914"
                          "340:917"
                          "341:919"
                          "342:922"
                          "343:925"
                          "344:927"
                          "345:930"
                          "346:933"
                          "347:935"
                          "348:938"
                          "349:941"
                          "350:943"
                          "351:946"
                          "352:949"
                          "353:951"
                          "354:954"
                          "355:957"
                          "356:960"
                          "357:962"
                          "358:965"
                          "359:968"
                          "360:970"
                          "361:973"
                          "362:976"
                          "363:978"
                          "364:981"
                          "365:984"
                          "366:986"
                          "367:989"
                          "368:992"
                          "369:995"
                          "370:997"
                          "371:1000"
                          "372:1003"
                          "373:1005"
                          "374:1008"
                          "375:1011"
                          "376:1013"
                          "377:1016"
                          "378:1019"
                          "379:1021"
                          "380:1024"
                          "381:1027"
                          "382:1030"
                          "383:1032"
                          "384:1035"
                          "385:1038"
                          "386:1040"
                          "387:1043"
                          "388:1046"
                          "389:1048"
                          "390:1051"
                          "391:1054"
                          "392:1056"
                          "393:1059"
                          "394:1062"
                          "395:1065"
                          "396:1067"
                          "397:1070"
                          "398:1073"
                          "399:1075"
                          "400:1078"
                          "401:1081"
                          "402:1083"
                          "403:1086"
                          "404:1089"
                          "405:1091"
                          "406:1094"
                          "407:1097"
                          "408:1100"
                          "409:1102"
                          "410:1105"
                          "411:1108"
                          "412:1110"
                          "413:1113"
                          "414:1116"
                          "415:1118"
                          "416:1121"
                          "417:1124"
                          "418:1126"
                          "419:1129"
                          "420:1132"
                          "421:1135"
                          "422:1137"
                          "423:1140"
                          "424:1143"
                          "425:1145"
                          "426:1148"
                          "427:1151"
                          "428:1153"
                          "429:1156"
                          "430:1159"
                          "431:1161"
                          "432:1164"
                          "433:1167"
                          "434:1170"
                          "435:1172"
                          "436:1175"
                          "437:1178"
                          "438:1180"
                          "439:1183"
                          "440:1186"
                          "441:1188"
                          "442:1191"
                          "443:1194"
                          "444:1196"
                          "445:1199"
                          "446:1202"
                          "447:1205"
                          "448:1207"
                          "449:1210"
                          "450:1213"
                          "451:1215"
                          "452:1218"
                          "453:1221"
                          "454:1223"
                          "455:1226"
                          "456:1229"
                          "457:1231"
                          "458:1234"
                          "459:1237"
                          "460:1240"
                          "461:1242"
                          "462:1245"
                          "463:1248"
                          "464:1250"
                          "465:1253"
                          "466:1256"
                          "467:1258"
                          "468:1261"
                          "469:1264"
                          "470:1266"
                          "471:1269"
                          "472:1272"
                          "473:1274"
                          "474:1277"
                          "475:1280"
                          "476:1283"
                          "477:1285"
                          "478:1288"
                          "479:1291"
                          "480:1293"
                          "481:1296"
                          "482:1299"
                          "483:1301"
                          "484:1304"
                          "485:1307"
                          "486:1309"
                          "487:1312"
                          "488:1315"
                          "489:1318"
                          "490:1320"
                          "491:1323"
                          "492:1326"
                          "493:1328"
                          "494:1331"
                          "495:1334"
                          "496:1336"
                          "497:1339"
                          "498:1342"
                          "499:1344"
                          "500:1347"
                          "501:1350"
                          "502:1353"
                          "503:1355"
                          "504:1358"
                          "505:1361"
                          "506:1363"
                          "507:1366"
                          "508:1369"
                          "509:1371"
                          "510:1374"
                          "511:1377"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectrogram",
   :vamp/max_value       1,
   :vamp/min_value       0,
   :vamp/unit            "bin"})

(def mzharmonicspectrum_param_compress
  {:db/ident           :mazurka/mzharmonicspectrum_param_compress,
   :dc11/format        "",
   :dc11/title         "Compress range",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "compress",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["no" "yes"]})

(def mzharmonicspectrum_param_harmonics
  {:db/ident           :mazurka/mzharmonicspectrum_param_harmonics,
   :dc11/format        "",
   :dc11/title         "Harmonics",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 5,
   :vamp/identifier    "harmonics",
   :vamp/max_value     20,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzharmonicspectrum_param_maxpitch
  {:db/ident           :mazurka/mzharmonicspectrum_param_maxpitch,
   :dc11/format        "MIDI data",
   :dc11/title         "Max pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 84,
   :vamp/identifier    "maxpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI data",
   :vamp/value_names   ["C-1"
                        "C#-1"
                        "D-1"
                        "D#-1"
                        "E-1"
                        "F-1"
                        "F#-1"
                        "G-1"
                        "G#-1"
                        "A-1"
                        "A#-1"
                        "B-1"
                        "C0"
                        "C#0"
                        "D0"
                        "D#0"
                        "E0"
                        "F0"
                        "F#0"
                        "G0"
                        "G#0"
                        "A0"
                        "A#0"
                        "B0"
                        "C1"
                        "C#1"
                        "D1"
                        "D#1"
                        "E1"
                        "F1"
                        "F#1"
                        "G1"
                        "G#1"
                        "A1"
                        "A#1"
                        "B1"
                        "C2"
                        "C#2"
                        "D2"
                        "D#2"
                        "E2"
                        "F2"
                        "F#2"
                        "G2"
                        "G#2"
                        "A2"
                        "A#2"
                        "B2"
                        "C3"
                        "C#3"
                        "D3"
                        "D#3"
                        "E3"
                        "F3"
                        "F#3"
                        "G3"
                        "G#3"
                        "A3"
                        "A#3"
                        "B3"
                        "C4"
                        "C#4"
                        "D4"
                        "D#4"
                        "E4"
                        "F4"
                        "F#4"
                        "G4"
                        "G#4"
                        "A4"
                        "A#4"
                        "B4"
                        "C5"
                        "C#5"
                        "D5"
                        "D#5"
                        "E5"
                        "F5"
                        "F#5"
                        "G5"
                        "G#5"
                        "A5"
                        "A#5"
                        "B5"
                        "C6"
                        "C#6"
                        "D6"
                        "D#6"
                        "E6"
                        "F6"
                        "F#6"
                        "G6"
                        "G#6"
                        "A6"
                        "A#6"
                        "B6"
                        "C7"
                        "C#7"
                        "D7"
                        "D#7"
                        "E7"
                        "F7"
                        "F#7"
                        "G7"
                        "G#7"
                        "A7"
                        "A#7"
                        "B7"
                        "C8"
                        "C#8"
                        "D8"
                        "D#8"
                        "E8"
                        "F8"
                        "F#8"
                        "G8"
                        "G#8"
                        "A8"
                        "A#8"
                        "B8"
                        "C9"
                        "C#9"
                        "D9"
                        "D#9"
                        "E9"
                        "F9"
                        "F#9"
                        "G9"]})

(def mzharmonicspectrum_param_method
  {:db/ident           :mazurka/mzharmonicspectrum_param_method,
   :dc11/format        "",
   :dc11/title         "Method",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "method",
   :vamp/max_value     3,
   :vamp/min_value     1,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Magnitude Product"
                        "Magnitude Summation"
                        "Complex Summation"]})

(def mzharmonicspectrum_param_minpitch
  {:db/ident           :mazurka/mzharmonicspectrum_param_minpitch,
   :dc11/format        "MIDI data",
   :dc11/title         "Min pitch",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 36,
   :vamp/identifier    "minpitch",
   :vamp/max_value     127,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "MIDI data",
   :vamp/value_names   ["C-1"
                        "C#-1"
                        "D-1"
                        "D#-1"
                        "E-1"
                        "F-1"
                        "F#-1"
                        "G-1"
                        "G#-1"
                        "A-1"
                        "A#-1"
                        "B-1"
                        "C0"
                        "C#0"
                        "D0"
                        "D#0"
                        "E0"
                        "F0"
                        "F#0"
                        "G0"
                        "G#0"
                        "A0"
                        "A#0"
                        "B0"
                        "C1"
                        "C#1"
                        "D1"
                        "D#1"
                        "E1"
                        "F1"
                        "F#1"
                        "G1"
                        "G#1"
                        "A1"
                        "A#1"
                        "B1"
                        "C2"
                        "C#2"
                        "D2"
                        "D#2"
                        "E2"
                        "F2"
                        "F#2"
                        "G2"
                        "G#2"
                        "A2"
                        "A#2"
                        "B2"
                        "C3"
                        "C#3"
                        "D3"
                        "D#3"
                        "E3"
                        "F3"
                        "F#3"
                        "G3"
                        "G#3"
                        "A3"
                        "A#3"
                        "B3"
                        "C4"
                        "C#4"
                        "D4"
                        "D#4"
                        "E4"
                        "F4"
                        "F#4"
                        "G4"
                        "G#4"
                        "A4"
                        "A#4"
                        "B4"
                        "C5"
                        "C#5"
                        "D5"
                        "D#5"
                        "E5"
                        "F5"
                        "F#5"
                        "G5"
                        "G#5"
                        "A5"
                        "A#5"
                        "B5"
                        "C6"
                        "C#6"
                        "D6"
                        "D#6"
                        "E6"
                        "F6"
                        "F#6"
                        "G6"
                        "G#6"
                        "A6"
                        "A#6"
                        "B6"
                        "C7"
                        "C#7"
                        "D7"
                        "D#7"
                        "E7"
                        "F7"
                        "F#7"
                        "G7"
                        "G#7"
                        "A7"
                        "A#7"
                        "B7"
                        "C8"
                        "C#8"
                        "D8"
                        "D#8"
                        "E8"
                        "F8"
                        "F#8"
                        "G8"
                        "G#8"
                        "A8"
                        "A#8"
                        "B8"
                        "C9"
                        "C#9"
                        "D9"
                        "D#9"
                        "E9"
                        "F9"
                        "F#9"
                        "G9"]})

(def mzharmonicspectrum_param_stepsamples
  {:db/ident           :mazurka/mzharmonicspectrum_param_stepsamples,
   :dc11/format        "samples",
   :dc11/title         "Step size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 512,
   :vamp/identifier    "stepsamples",
   :vamp/max_value     30000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mzharmonicspectrum_param_windowsamples
  {:db/ident           :mazurka/mzharmonicspectrum_param_windowsamples,
   :dc11/format        "samples",
   :dc11/title         "Window size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1500,
   :vamp/identifier    "windowsamples",
   :vamp/max_value     10000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mznevermore
  "Nevermore Spectrogram"
  {:db/ident              :mazurka/mznevermore,
   :dc11/description      "Nevermore Spectrogram",
   :dc11/rights           "2006 Craig Stuart Sapp",
   :dc11/title            "Nevermore Spectrogram",
   :foaf/maker            :mazurka/maker,
   :owl/versionInfo       "200606200",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "mznevermore",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Nevermore Spectrogram",
   :vamp/output           :mazurka/mznevermore_output_spectrogram,
   :vamp/parameter        [:mazurka/mznevermore_param_maxbin
                           :mazurka/mznevermore_param_windowsamples
                           :mazurka/mznevermore_param_minbin
                           :mazurka/mznevermore_param_minfreq
                           :mazurka/mznevermore_param_windowtype
                           :mazurka/mznevermore_param_maxfreq
                           :mazurka/mznevermore_param_scale
                           :mazurka/mznevermore_param_stepsamples
                           :mazurka/mznevermore_param_compress
                           :mazurka/mznevermore_param_transformsamples],
   :vamp/vamp_API_version :vamp/api_version_1})

(def mznevermore_output_spectrogram
  ""
  {:db/ident             :mazurka/mznevermore_output_spectrogram,
   :dc11/description     "",
   :dc11/title           "Spectrogram",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       512,
   :vamp/bin_names       ["0:22"
                          "1:65"
                          "2:108"
                          "3:151"
                          "4:194"
                          "5:237"
                          "6:280"
                          "7:323"
                          "8:366"
                          "9:409"
                          "10:452"
                          "11:495"
                          "12:538"
                          "13:581"
                          "14:624"
                          "15:668"
                          "16:711"
                          "17:754"
                          "18:797"
                          "19:840"
                          "20:883"
                          "21:926"
                          "22:969"
                          "23:1012"
                          "24:1055"
                          "25:1098"
                          "26:1141"
                          "27:1184"
                          "28:1227"
                          "29:1270"
                          "30:1314"
                          "31:1357"
                          "32:1400"
                          "33:1443"
                          "34:1486"
                          "35:1529"
                          "36:1572"
                          "37:1615"
                          "38:1658"
                          "39:1701"
                          "40:1744"
                          "41:1787"
                          "42:1830"
                          "43:1873"
                          "44:1916"
                          "45:1960"
                          "46:2003"
                          "47:2046"
                          "48:2089"
                          "49:2132"
                          "50:2175"
                          "51:2218"
                          "52:2261"
                          "53:2304"
                          "54:2347"
                          "55:2390"
                          "56:2433"
                          "57:2476"
                          "58:2519"
                          "59:2562"
                          "60:2606"
                          "61:2649"
                          "62:2692"
                          "63:2735"
                          "64:2778"
                          "65:2821"
                          "66:2864"
                          "67:2907"
                          "68:2950"
                          "69:2993"
                          "70:3036"
                          "71:3079"
                          "72:3122"
                          "73:3165"
                          "74:3208"
                          "75:3252"
                          "76:3295"
                          "77:3338"
                          "78:3381"
                          "79:3424"
                          "80:3467"
                          "81:3510"
                          "82:3553"
                          "83:3596"
                          "84:3639"
                          "85:3682"
                          "86:3725"
                          "87:3768"
                          "88:3811"
                          "89:3854"
                          "90:3898"
                          "91:3941"
                          "92:3984"
                          "93:4027"
                          "94:4070"
                          "95:4113"
                          "96:4156"
                          "97:4199"
                          "98:4242"
                          "99:4285"
                          "100:4328"
                          "101:4371"
                          "102:4414"
                          "103:4457"
                          "104:4500"
                          "105:4544"
                          "106:4587"
                          "107:4630"
                          "108:4673"
                          "109:4716"
                          "110:4759"
                          "111:4802"
                          "112:4845"
                          "113:4888"
                          "114:4931"
                          "115:4974"
                          "116:5017"
                          "117:5060"
                          "118:5103"
                          "119:5146"
                          "120:5190"
                          "121:5233"
                          "122:5276"
                          "123:5319"
                          "124:5362"
                          "125:5405"
                          "126:5448"
                          "127:5491"
                          "128:5534"
                          "129:5577"
                          "130:5620"
                          "131:5663"
                          "132:5706"
                          "133:5749"
                          "134:5792"
                          "135:5835"
                          "136:5879"
                          "137:5922"
                          "138:5965"
                          "139:6008"
                          "140:6051"
                          "141:6094"
                          "142:6137"
                          "143:6180"
                          "144:6223"
                          "145:6266"
                          "146:6309"
                          "147:6352"
                          "148:6395"
                          "149:6438"
                          "150:6481"
                          "151:6525"
                          "152:6568"
                          "153:6611"
                          "154:6654"
                          "155:6697"
                          "156:6740"
                          "157:6783"
                          "158:6826"
                          "159:6869"
                          "160:6912"
                          "161:6955"
                          "162:6998"
                          "163:7041"
                          "164:7084"
                          "165:7127"
                          "166:7171"
                          "167:7214"
                          "168:7257"
                          "169:7300"
                          "170:7343"
                          "171:7386"
                          "172:7429"
                          "173:7472"
                          "174:7515"
                          "175:7558"
                          "176:7601"
                          "177:7644"
                          "178:7687"
                          "179:7730"
                          "180:7773"
                          "181:7817"
                          "182:7860"
                          "183:7903"
                          "184:7946"
                          "185:7989"
                          "186:8032"
                          "187:8075"
                          "188:8118"
                          "189:8161"
                          "190:8204"
                          "191:8247"
                          "192:8290"
                          "193:8333"
                          "194:8376"
                          "195:8419"
                          "196:8463"
                          "197:8506"
                          "198:8549"
                          "199:8592"
                          "200:8635"
                          "201:8678"
                          "202:8721"
                          "203:8764"
                          "204:8807"
                          "205:8850"
                          "206:8893"
                          "207:8936"
                          "208:8979"
                          "209:9022"
                          "210:9065"
                          "211:9109"
                          "212:9152"
                          "213:9195"
                          "214:9238"
                          "215:9281"
                          "216:9324"
                          "217:9367"
                          "218:9410"
                          "219:9453"
                          "220:9496"
                          "221:9539"
                          "222:9582"
                          "223:9625"
                          "224:9668"
                          "225:9711"
                          "226:9755"
                          "227:9798"
                          "228:9841"
                          "229:9884"
                          "230:9927"
                          "231:9970"
                          "232:10013"
                          "233:10056"
                          "234:10099"
                          "235:10142"
                          "236:10185"
                          "237:10228"
                          "238:10271"
                          "239:10314"
                          "240:10357"
                          "241:10401"
                          "242:10444"
                          "243:10487"
                          "244:10530"
                          "245:10573"
                          "246:10616"
                          "247:10659"
                          "248:10702"
                          "249:10745"
                          "250:10788"
                          "251:10831"
                          "252:10874"
                          "253:10917"
                          "254:10960"
                          "255:11003"
                          "256:11047"
                          "257:11090"
                          "258:11133"
                          "259:11176"
                          "260:11219"
                          "261:11262"
                          "262:11305"
                          "263:11348"
                          "264:11391"
                          "265:11434"
                          "266:11477"
                          "267:11520"
                          "268:11563"
                          "269:11606"
                          "270:11649"
                          "271:11693"
                          "272:11736"
                          "273:11779"
                          "274:11822"
                          "275:11865"
                          "276:11908"
                          "277:11951"
                          "278:11994"
                          "279:12037"
                          "280:12080"
                          "281:12123"
                          "282:12166"
                          "283:12209"
                          "284:12252"
                          "285:12295"
                          "286:12339"
                          "287:12382"
                          "288:12425"
                          "289:12468"
                          "290:12511"
                          "291:12554"
                          "292:12597"
                          "293:12640"
                          "294:12683"
                          "295:12726"
                          "296:12769"
                          "297:12812"
                          "298:12855"
                          "299:12898"
                          "300:12941"
                          "301:12985"
                          "302:13028"
                          "303:13071"
                          "304:13114"
                          "305:13157"
                          "306:13200"
                          "307:13243"
                          "308:13286"
                          "309:13329"
                          "310:13372"
                          "311:13415"
                          "312:13458"
                          "313:13501"
                          "314:13544"
                          "315:13587"
                          "316:13631"
                          "317:13674"
                          "318:13717"
                          "319:13760"
                          "320:13803"
                          "321:13846"
                          "322:13889"
                          "323:13932"
                          "324:13975"
                          "325:14018"
                          "326:14061"
                          "327:14104"
                          "328:14147"
                          "329:14190"
                          "330:14233"
                          "331:14277"
                          "332:14320"
                          "333:14363"
                          "334:14406"
                          "335:14449"
                          "336:14492"
                          "337:14535"
                          "338:14578"
                          "339:14621"
                          "340:14664"
                          "341:14707"
                          "342:14750"
                          "343:14793"
                          "344:14836"
                          "345:14879"
                          "346:14923"
                          "347:14966"
                          "348:15009"
                          "349:15052"
                          "350:15095"
                          "351:15138"
                          "352:15181"
                          "353:15224"
                          "354:15267"
                          "355:15310"
                          "356:15353"
                          "357:15396"
                          "358:15439"
                          "359:15482"
                          "360:15525"
                          "361:15569"
                          "362:15612"
                          "363:15655"
                          "364:15698"
                          "365:15741"
                          "366:15784"
                          "367:15827"
                          "368:15870"
                          "369:15913"
                          "370:15956"
                          "371:15999"
                          "372:16042"
                          "373:16085"
                          "374:16128"
                          "375:16171"
                          "376:16215"
                          "377:16258"
                          "378:16301"
                          "379:16344"
                          "380:16387"
                          "381:16430"
                          "382:16473"
                          "383:16516"
                          "384:16559"
                          "385:16602"
                          "386:16645"
                          "387:16688"
                          "388:16731"
                          "389:16774"
                          "390:16817"
                          "391:16860"
                          "392:16904"
                          "393:16947"
                          "394:16990"
                          "395:17033"
                          "396:17076"
                          "397:17119"
                          "398:17162"
                          "399:17205"
                          "400:17248"
                          "401:17291"
                          "402:17334"
                          "403:17377"
                          "404:17420"
                          "405:17463"
                          "406:17506"
                          "407:17550"
                          "408:17593"
                          "409:17636"
                          "410:17679"
                          "411:17722"
                          "412:17765"
                          "413:17808"
                          "414:17851"
                          "415:17894"
                          "416:17937"
                          "417:17980"
                          "418:18023"
                          "419:18066"
                          "420:18109"
                          "421:18152"
                          "422:18196"
                          "423:18239"
                          "424:18282"
                          "425:18325"
                          "426:18368"
                          "427:18411"
                          "428:18454"
                          "429:18497"
                          "430:18540"
                          "431:18583"
                          "432:18626"
                          "433:18669"
                          "434:18712"
                          "435:18755"
                          "436:18798"
                          "437:18842"
                          "438:18885"
                          "439:18928"
                          "440:18971"
                          "441:19014"
                          "442:19057"
                          "443:19100"
                          "444:19143"
                          "445:19186"
                          "446:19229"
                          "447:19272"
                          "448:19315"
                          "449:19358"
                          "450:19401"
                          "451:19444"
                          "452:19488"
                          "453:19531"
                          "454:19574"
                          "455:19617"
                          "456:19660"
                          "457:19703"
                          "458:19746"
                          "459:19789"
                          "460:19832"
                          "461:19875"
                          "462:19918"
                          "463:19961"
                          "464:20004"
                          "465:20047"
                          "466:20090"
                          "467:20134"
                          "468:20177"
                          "469:20220"
                          "470:20263"
                          "471:20306"
                          "472:20349"
                          "473:20392"
                          "474:20435"
                          "475:20478"
                          "476:20521"
                          "477:20564"
                          "478:20607"
                          "479:20650"
                          "480:20693"
                          "481:20736"
                          "482:20780"
                          "483:20823"
                          "484:20866"
                          "485:20909"
                          "486:20952"
                          "487:20995"
                          "488:21038"
                          "489:21081"
                          "490:21124"
                          "491:21167"
                          "492:21210"
                          "493:21253"
                          "494:21296"
                          "495:21339"
                          "496:21382"
                          "497:21426"
                          "498:21469"
                          "499:21512"
                          "500:21555"
                          "501:21598"
                          "502:21641"
                          "503:21684"
                          "504:21727"
                          "505:21770"
                          "506:21813"
                          "507:21856"
                          "508:21899"
                          "509:21942"
                          "510:21985"
                          "511:22028"],
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectrogram",
   :vamp/unit            "bin"})

(def mznevermore_param_compress
  {:db/ident           :mazurka/mznevermore_param_compress,
   :dc11/format        "",
   :dc11/title         "Compress range",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "compress",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["no" "yes"]})

(def mznevermore_param_maxbin
  {:db/ident           :mazurka/mznevermore_param_maxbin,
   :dc11/format        "bin",
   :dc11/title         "Max spectral bin",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2048,
   :vamp/identifier    "maxbin",
   :vamp/max_value     30000,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "bin",
   :vamp/value_names   :rdf/nil})

(def mznevermore_param_maxfreq
  {:db/ident           :mazurka/mznevermore_param_maxfreq,
   :dc11/format        "Hz",
   :dc11/title         "         or in Hz:",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "maxfreq",
   :vamp/max_value     24000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mznevermore_param_minbin
  {:db/ident           :mazurka/mznevermore_param_minbin,
   :dc11/format        "bin",
   :dc11/title         "Min spectral bin",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "minbin",
   :vamp/max_value     30000,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "bin",
   :vamp/value_names   :rdf/nil})

(def mznevermore_param_minfreq
  {:db/ident           :mazurka/mznevermore_param_minfreq,
   :dc11/format        "Hz",
   :dc11/title         "         or in Hz:",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "minfreq",
   :vamp/max_value     24000,
   :vamp/min_value     0,
   :vamp/unit          "Hz",
   :vamp/value_names   :rdf/nil})

(def mznevermore_param_scale
  {:db/ident           :mazurka/mznevermore_param_scale,
   :dc11/format        "",
   :dc11/title         "Frequency scale",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "scale",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Hertz" "Interval"]})

(def mznevermore_param_stepsamples
  {:db/ident           :mazurka/mznevermore_param_stepsamples,
   :dc11/format        "samples",
   :dc11/title         "Step size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 512,
   :vamp/identifier    "stepsamples",
   :vamp/max_value     30000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mznevermore_param_transformsamples
  {:db/ident           :mazurka/mznevermore_param_transformsamples,
   :dc11/format        "samples",
   :dc11/title         "Transform size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2048,
   :vamp/identifier    "transformsamples",
   :vamp/max_value     30000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mznevermore_param_windowsamples
  {:db/ident           :mazurka/mznevermore_param_windowsamples,
   :dc11/format        "samples",
   :dc11/title         "Window size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1500,
   :vamp/identifier    "windowsamples",
   :vamp/max_value     10000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mznevermore_param_windowtype
  {:db/ident :mazurka/mznevermore_param_windowtype,
   :dc11/format "",
   :dc11/title "Window type",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 2,
   :vamp/identifier "windowtype",
   :vamp/max_value 5,
   :vamp/min_value 1,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names
   ["Rectangular" "Hann" "Blackman" "BlackmanHarris4_92" "Triangular"]})

(def mzpowercurve
  "Power Curve"
  {:db/ident              :mazurka/mzpowercurve,
   :dc11/description      "Power Curve",
   :dc11/rights           "2006 Craig Stuart Sapp",
   :dc11/title            "Power Curve",
   :foaf/maker            :mazurka/maker,
   :owl/versionInfo       "200607100",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "mzpowercurve",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Power Curve",
   :vamp/output           [:mazurka/mzpowercurve_output_powerslopeproduct
                           :mazurka/mzpowercurve_output_smoothpowerslope
                           :mazurka/mzpowercurve_output_rawpower
                           :mazurka/mzpowercurve_output_smoothpower],
   :vamp/parameter        [:mazurka/mzpowercurve_param_filtermethod
                           :mazurka/mzpowercurve_param_hopsize
                           :mazurka/mzpowercurve_param_windowsize
                           :mazurka/mzpowercurve_param_smoothingfactor
                           :mazurka/mzpowercurve_param_window],
   :vamp/vamp_API_version :vamp/api_version_1})

(def mzpowercurve_output_powerslopeproduct
  ""
  {:db/ident             :mazurka/mzpowercurve_output_powerslopeproduct,
   :dc11/description     "",
   :dc11/title           "Scaled Power Slope",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "powerslopeproduct",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "dB slope"})

(def mzpowercurve_output_rawpower
  ""
  {:db/ident             :mazurka/mzpowercurve_output_rawpower,
   :dc11/description     "",
   :dc11/title           "Raw Power",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rawpower",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "dB"})

(def mzpowercurve_output_smoothpower
  ""
  {:db/ident             :mazurka/mzpowercurve_output_smoothpower,
   :dc11/description     "",
   :dc11/title           "Smoothed Power",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "smoothpower",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "dB"})

(def mzpowercurve_output_smoothpowerslope
  ""
  {:db/ident             :mazurka/mzpowercurve_output_smoothpowerslope,
   :dc11/description     "",
   :dc11/title           "Smoothed Power Slope",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "smoothpowerslope",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "dB slope"})

(def mzpowercurve_param_filtermethod
  {:db/ident           :mazurka/mzpowercurve_param_filtermethod,
   :dc11/format        "",
   :dc11/title         "Filter method (outputs 2-4)",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "filtermethod",
   :vamp/max_value     2,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Symmetric" "Forward" "Reverse"]})

(def mzpowercurve_param_hopsize
  {:db/ident           :mazurka/mzpowercurve_param_hopsize,
   :dc11/format        "ms",
   :dc11/title         "Window hop size",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "hopsize",
   :vamp/max_value     10000,
   :vamp/min_value     1,
   :vamp/unit          "ms",
   :vamp/value_names   :rdf/nil})

(def mzpowercurve_param_smoothingfactor
  {:db/ident           :mazurka/mzpowercurve_param_smoothingfactor,
   :dc11/format        "",
   :dc11/title         "Smoothing (outputs 2-4)",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.2M,
   :vamp/identifier    "smoothingfactor",
   :vamp/max_value     1,
   :vamp/min_value     -1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzpowercurve_param_window
  {:db/ident :mazurka/mzpowercurve_param_window,
   :dc11/format "",
   :dc11/title "Weighting window",
   :rdf/type :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier "window",
   :vamp/max_value 5,
   :vamp/min_value 1,
   :vamp/quantize_step 1,
   :vamp/unit "",
   :vamp/value_names
   ["Rectangular" "Hann" "Blackman" "BlackmanHarris4_92" "Triangular"]})

(def mzpowercurve_param_windowsize
  {:db/ident           :mazurka/mzpowercurve_param_windowsize,
   :dc11/format        "ms",
   :dc11/title         "Window size",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 10,
   :vamp/identifier    "windowsize",
   :vamp/max_value     10000,
   :vamp/min_value     10,
   :vamp/unit          "ms",
   :vamp/value_names   :rdf/nil})

(def mzspectralflux
  "Spectral Flux"
  {:db/ident              :mazurka/mzspectralflux,
   :dc11/description      "Spectral Flux",
   :dc11/rights           "2006 Craig Stuart Sapp",
   :dc11/title            "Spectral Flux",
   :foaf/maker            :mazurka/maker,
   :owl/versionInfo       "200612280",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "mzspectralflux",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Spectral Flux",
   :vamp/output           [:mazurka/mzspectralflux_output_thresholdfunction
                           :mazurka/mzspectralflux_output_rawspectralflux
                           :mazurka/mzspectralflux_output_spectrumderivative
                           :mazurka/mzspectralflux_output_scaledspectralflux
                           :mazurka/mzspectralflux_output_meanfunction
                           :mazurka/mzspectralflux_output_spectralfluxonsets
                           :mazurka/mzspectralflux_output_spectrum],
   :vamp/parameter        [:mazurka/mzspectralflux_param_pnorm
                           :mazurka/mzspectralflux_param_spectrum
                           :mazurka/mzspectralflux_param_delta
                           :mazurka/mzspectralflux_param_windowsamples
                           :mazurka/mzspectralflux_param_smooth
                           :mazurka/mzspectralflux_param_fluxtype
                           :mazurka/mzspectralflux_param_alpha
                           :mazurka/mzspectralflux_param_stepsamples],
   :vamp/vamp_API_version :vamp/api_version_1})

(def mzspectralflux_output_meanfunction
  ""
  {:db/ident             :mazurka/mzspectralflux_output_meanfunction,
   :dc11/description     "",
   :dc11/title           "Local Mean Threshold",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "meanfunction",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "scaled"})

(def mzspectralflux_output_rawspectralflux
  ""
  {:db/ident             :mazurka/mzspectralflux_output_rawspectralflux,
   :dc11/description     "",
   :dc11/title           "Raw Spectral Flux Function",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "rawspectralflux",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "raw"})

(def mzspectralflux_output_scaledspectralflux
  ""
  {:db/ident             :mazurka/mzspectralflux_output_scaledspectralflux,
   :dc11/description     "",
   :dc11/title           "Scaled Spectral Flux Function",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "scaledspectralflux",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "scaled"})

(def mzspectralflux_output_spectralfluxonsets
  ""
  {:db/ident             :mazurka/mzspectralflux_output_spectralfluxonsets,
   :dc11/description     "",
   :dc11/title           "Onset Times",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralfluxonsets",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def mzspectralflux_output_spectrum
  ""
  {:db/ident             :mazurka/mzspectralflux_output_spectrum,
   :dc11/description     "",
   :dc11/title           "Basis Spectrum",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1000,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectrum",
   :vamp/unit            "bin"})

(def mzspectralflux_output_spectrumderivative
  ""
  {:db/ident             :mazurka/mzspectralflux_output_spectrumderivative,
   :dc11/description     "",
   :dc11/title           "Spectrum Derivative",
   :rdf/type             :vamp/DenseOutput,
   :vamp/bin_count       1000,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectrumderivative",
   :vamp/unit            "bin"})

(def mzspectralflux_output_thresholdfunction
  ""
  {:db/ident             :mazurka/mzspectralflux_output_thresholdfunction,
   :dc11/description     "",
   :dc11/title           "Exponential Decay Threshold",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "thresholdfunction",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "scaled"})

(def mzspectralflux_param_alpha
  {:db/ident           :mazurka/mzspectralflux_param_alpha,
   :dc11/format        "",
   :dc11/title         "Exponential Decay Factor",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.9M,
   :vamp/identifier    "alpha",
   :vamp/max_value     0.999M,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzspectralflux_param_delta
  {:db/ident           :mazurka/mzspectralflux_param_delta,
   :dc11/format        "",
   :dc11/title         "Local Mean Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.45M,
   :vamp/identifier    "delta",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzspectralflux_param_fluxtype
  {:db/ident           :mazurka/mzspectralflux_param_fluxtype,
   :dc11/format        "",
   :dc11/title         "Flux Type",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 1,
   :vamp/identifier    "fluxtype",
   :vamp/max_value     8,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["Total Flux"
                        "Positive Flux"
                        "Negative Flux"
                        "Difference Flux"
                        "Composite Flux"
                        "Product Flux"
                        "Angular Flux"
                        "Cosine Flux"
                        "Schwartz Flux"]})

(def mzspectralflux_param_pnorm
  {:db/ident           :mazurka/mzspectralflux_param_pnorm,
   :dc11/format        "",
   :dc11/title         "Norm Order",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 1,
   :vamp/identifier    "pnorm",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzspectralflux_param_smooth
  {:db/ident           :mazurka/mzspectralflux_param_smooth,
   :dc11/format        "",
   :dc11/title         "Spectral Smoothing",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0,
   :vamp/identifier    "smooth",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzspectralflux_param_spectrum
  {:db/ident           :mazurka/mzspectralflux_param_spectrum,
   :dc11/format        "",
   :dc11/title         "Magnitude Spectrum",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 3,
   :vamp/identifier    "spectrum",
   :vamp/max_value     3,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   ["DFT" "Low DFT" "High DFT" "MIDI"]})

(def mzspectralflux_param_stepsamples
  {:db/ident           :mazurka/mzspectralflux_param_stepsamples,
   :dc11/format        "samples",
   :dc11/title         "Step Size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 441,
   :vamp/identifier    "stepsamples",
   :vamp/max_value     30000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mzspectralflux_param_windowsamples
  {:db/ident           :mazurka/mzspectralflux_param_windowsamples,
   :dc11/format        "samples",
   :dc11/title         "Window Size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2048,
   :vamp/identifier    "windowsamples",
   :vamp/max_value     10000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mzspectralreflux
  "Spectral Reflux"
  {:db/ident              :mazurka/mzspectralreflux,
   :dc11/description      "Spectral Reflux",
   :dc11/rights           "2006 Craig Stuart Sapp",
   :dc11/title            "Spectral Reflux",
   :foaf/maker            :mazurka/maker,
   :owl/versionInfo       "200701110",
   :rdf/type              :vamp/Plugin,
   :vamp/identifier       "mzspectralreflux",
   :vamp/input_domain     :vamp/TimeDomain,
   :vamp/name             "Spectral Reflux",
   :vamp/output           [:mazurka/mzspectralreflux_output_spectralrefluxonsets
                           :mazurka/mzspectralreflux_output_scaledspectralflux],
   :vamp/parameter        [:mazurka/mzspectralreflux_param_stepsamples
                           :mazurka/mzspectralreflux_param_alpha2
                           :mazurka/mzspectralreflux_param_delta
                           :mazurka/mzspectralreflux_param_recordingtype
                           :mazurka/mzspectralreflux_param_windowsamples],
   :vamp/vamp_API_version :vamp/api_version_1})

(def mzspectralreflux_output_scaledspectralflux
  ""
  {:db/ident             :mazurka/mzspectralreflux_output_scaledspectralflux,
   :dc11/description     "",
   :dc11/title           "Scaled Spectral Flux Function",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       1,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "scaledspectralflux",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            "scaled"})

(def mzspectralreflux_output_spectralrefluxonsets
  ""
  {:db/ident             :mazurka/mzspectralreflux_output_spectralrefluxonsets,
   :dc11/description     "",
   :dc11/title           "Onset Times",
   :rdf/type             :vamp/SparseOutput,
   :vamp/bin_count       0,
   :vamp/fixed_bin_count "true",
   :vamp/identifier      "spectralrefluxonsets",
   :vamp/sample_type     :vamp/VariableSampleRate,
   :vamp/unit            ""})

(def mzspectralreflux_param_alpha2
  {:db/ident           :mazurka/mzspectralreflux_param_alpha2,
   :dc11/format        "",
   :dc11/title         "Exponential Decay Factor",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.9M,
   :vamp/identifier    "alpha2",
   :vamp/max_value     0.999M,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzspectralreflux_param_delta
  {:db/ident           :mazurka/mzspectralreflux_param_delta,
   :dc11/format        "",
   :dc11/title         "Local Mean Threshold",
   :rdf/type           :vamp/Parameter,
   :vamp/default_value 0.2M,
   :vamp/identifier    "delta",
   :vamp/max_value     100,
   :vamp/min_value     0,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzspectralreflux_param_recordingtype
  {:db/ident           :mazurka/mzspectralreflux_param_recordingtype,
   :dc11/format        "",
   :dc11/title         "Historic Recording",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 0,
   :vamp/identifier    "recordingtype",
   :vamp/max_value     1,
   :vamp/min_value     0,
   :vamp/quantize_step 1,
   :vamp/unit          "",
   :vamp/value_names   :rdf/nil})

(def mzspectralreflux_param_stepsamples
  {:db/ident           :mazurka/mzspectralreflux_param_stepsamples,
   :dc11/format        "samples",
   :dc11/title         "Step Size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 441,
   :vamp/identifier    "stepsamples",
   :vamp/max_value     30000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})

(def mzspectralreflux_param_windowsamples
  {:db/ident           :mazurka/mzspectralreflux_param_windowsamples,
   :dc11/format        "samples",
   :dc11/title         "Window Size",
   :rdf/type           :vamp/QuantizedParameter,
   :vamp/default_value 2048,
   :vamp/identifier    "windowsamples",
   :vamp/max_value     10000,
   :vamp/min_value     2,
   :vamp/quantize_step 1,
   :vamp/unit          "samples",
   :vamp/value_names   :rdf/nil})