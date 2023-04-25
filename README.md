# lv2
LV2 is an extensible open standard for audio plugins. LV2 has a simple
core interface, which is accompanied by extensions that add more
advanced functionality.

## requirements
* 64-bit Linux for native libs (tested on Ubuntu 22.04)

## Musical Feature Analysis Pipeline
1. Collect music files into a common directory
2. Run Sonic Annotator on them to generate RDF
3. Run jRDF2Vec on resulting RDF files to generate vector embeddings
4. Compare features with TorchAudio

https://github.com/pytorch/audio/blob/main/examples/tutorials/audio_feature_extractions_tutorial.py
https://download.pytorch.org/torchaudio/tutorial-assets/torchaudio_feature_extractions.png

## :rdfs/seeAlso
* https://lv2plug.in/

* https://gitlab.com/lv2/lv2

* https://github.com/aamedina/rdf
