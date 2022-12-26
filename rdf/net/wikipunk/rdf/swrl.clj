(ns net.wikipunk.rdf.swrl
  "http://www.w3.org/2003/11/swrl#"
  {:dcat/downloadURL
   "http://www.w3.org/Submission/2004/SUBM-SWRL-20040521/swrl.rdf",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "swrl" "http://www.w3.org/2003/11/swrl#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "swrl",
   :rdfa/uri "http://www.w3.org/2003/11/swrl#"})

(def Atom
  "common superclass"
  {:rdf/about    :swrl/Atom,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "common superclass"})

(def Builtin
  {:rdf/about :swrl/Builtin,
   :rdf/type  :rdfs/Class})

(def BuiltinAtom
  "consists of a builtin and a List of arguments"
  {:rdf/about       :swrl/BuiltinAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a builtin and a List of arguments",
   :rdfs/subClassOf :swrl/Atom})

(def ClassAtom
  "consists of a classPredicate and argument1"
  {:rdf/about       :swrl/ClassAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a classPredicate and argument1",
   :rdfs/subClassOf :swrl/Atom})

(def DataRangeAtom
  "consists of a dataRange and argument1"
  {:rdf/about       :swrl/DataRangeAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a dataRange and argument1",
   :rdfs/subClassOf :swrl/Atom})

(def DatavaluedPropertyAtom
  "consists of a propertyPredicate (owl:DatatypeProperty), argument1 (owl:Thing), and argument2 (rdfs:Literal)"
  {:rdf/about :swrl/DatavaluedPropertyAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "consists of a propertyPredicate (owl:DatatypeProperty), argument1 (owl:Thing), and argument2 (rdfs:Literal)",
   :rdfs/subClassOf :swrl/Atom})

(def DifferentIndividualsAtom
  "consists of argument1 (owl:Thing) and argument2 (owl:Thing)"
  {:rdf/about :swrl/DifferentIndividualsAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment "consists of argument1 (owl:Thing) and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def Imp
  "implication (rule)"
  {:rdf/about    :swrl/Imp,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "implication (rule)"})

(def IndividualPropertyAtom
  "consists of a propertyPredicate (owl:ObjectProperty), argument1 (owl:Thing), and argument2 (owl:Thing)"
  {:rdf/about :swrl/IndividualPropertyAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "consists of a propertyPredicate (owl:ObjectProperty), argument1 (owl:Thing), and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def SameIndividualAtom
  "consists of argument1 (owl:Thing) and argument2 (owl:Thing)"
  {:rdf/about :swrl/SameIndividualAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment "consists of argument1 (owl:Thing) and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def Variable
  "indicate that a URI is being used as a variable"
  {:rdf/about    :swrl/Variable,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "indicate that a URI is being used as a variable"})

(def argument1
  {:rdf/about   :swrl/argument1,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/Atom,
   :rdfs/range  :rdfs/Resource})

(def argument2
  "can be a Literal or Resource"
  {:rdf/about    :swrl/argument2,
   :rdf/type     :rdf/Property,
   :rdfs/comment "can be a Literal or Resource",
   :rdfs/domain  :swrl/Atom})

(def arguments
  {:rdf/about   :swrl/arguments,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/BuiltinAtom,
   :rdfs/range  :rdf/List})

(def body
  "rule body (antecedent):  List of Atom"
  {:rdf/about    :swrl/body,
   :rdf/type     :rdf/Property,
   :rdfs/comment "rule body (antecedent):  List of Atom",
   :rdfs/domain  :swrl/Imp,
   :rdfs/range   :rdf/List})

(def builtin
  {:rdf/about   :swrl/builtin,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/BuiltinAtom,
   :rdfs/range  :swrl/Builtin})

(def classPredicate
  {:rdf/about   :swrl/classPredicate,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/ClassAtom,
   :rdfs/range  :rdfs/Class})

(def dataRange
  {:rdf/about   :swrl/dataRange,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/DataRangeAtom,
   :rdfs/range  :owl/DataRange})

(def head
  "rule head (consequent):  List of Atom"
  {:rdf/about    :swrl/head,
   :rdf/type     :rdf/Property,
   :rdfs/comment "rule head (consequent):  List of Atom",
   :rdfs/domain  :swrl/Imp,
   :rdfs/range   :rdf/List})

(def propertyPredicate
  {:rdf/about   :swrl/propertyPredicate,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/Atom,
   :rdfs/range  :rdf/Property})