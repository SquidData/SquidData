# Squid Data

## Overview

*Squid* is a multi-modal conjunctive query synthesizer automating code search with a Datalog-based program analyzer. It utilizes the relational representation derived by the industrial Datalog-based program analyzer in company A (a global IT company) and synthesizes the conjunctive queries separating the positive and negative examples specified by users. The synthesized queries can be evaluated to conduct the code search tasks.

In this GitHub repository, we publish the code search tasks mentioned in our paper, including the positive/negative examples, and natural language description. We also provide the basic configuration of the synthesis, such as the language schema and the dictionary of the named entities. The synthesized results under different settings are also included in this repository.


## Synthesis Configuration

### Language Schema

As demonstrated in our paper, our synthesizer *Squid* requires a set of relations generated by a Datalog-based program analyzer, which forms the relational representation of a program. In our implementation, we leverage the industrial Datalog-based program analyzer in company A to derive the relations. The names of the relations and the attributes are shown in the file `SynthesisConfig/LangSchema.json`.

Notably, the Datalog-based program analyzer we utilize actually exposes a query language to access the attributes of each relation. In the file `SynthesisConfig/LangSchema.json`, we demonstrate each attribute of a relation by a pair of relation name and API name. For example, the line 4 and the line 5 indicate that the relation `Method` has an attribute that is a foreign key referencing the primary key in the relation `Class`. Specifically, the attribute can be accessed by the API named `getBelongedClass`. Besides, the primary key of a relation can be directly obtained by the relation identifier, which does not have the corresponding API. 

The relations listed in the file `SynthesisConfig/LangSchema.json` conform to the definition of the language schema in our paper. Although we access the attributes of a relation via the corresponding API instead of accessing the attributes directly, the relational algebra expressions in our paper and the queries using such APIs are actually allotropes.

### Dictionary of Named Entities

All the named entities are listed in the file `SynthesisConfig/dictionary.txt`. We do not provide the details of how to map an attribute in a relation to a set of named entities, which can be easily derived from the API names. For example, the first attribute of the relation `Method`, i.e., the return value of the API named `getBelongedClass`, includes `belonged` and `class`. Actually, all the keywords in the API names form the named entities of the attributes accessed via the APIs. Such a mapping h can be derived from the documentation of the APIs, while they almost yield the same result. Due to the commercial use of the Datalog-based program analyzer, we cannot provide the complete documentation and hence, demonstrate the API names to explain how the named entities corresponding to an attribute are generated.

## Synthesis Results

All 31 cases are listed in the directory `SynthesisResult`. Specifically, the synthesis specifications are demonstrated in the directory `SynthesisResult/casex/spec`, and the synthesized queries are listed in three txt files in the directory `SynthesisResult/casex/result`.

### Synthesis Specification

A synthesis specification consists of two parts, namely the example program containing positive and negative examples, which is shown in `Main.java`, and the natural language description, which is shown in `NL.json`.

We design a UI interface for users to drag the code snippets to label the positive and negative examples. To show the examples in a Java file, we just label the target constructs with the comments beginning with `Target` for demonstration.


### Synthesized Queries

We list the synthesized queries under three different settings, which leverage the dual quantitative metrics, the named-entity coverage, and the structural complexity to prioritize the query candidates, respectively. The results are listed in the files `full-feature.txt`, `coverageonly.txt`, and `sizeonly.txt`, respectively. Also, the synthesized results of EGS-Str and EGS-StrDual are shown in the files `EGS-Str.txt` and `EGS-StrDual.txt`.

As explained above, the synthesized queries are in a query language supported by the Datalog-based program analyzer in company A. Despite the usage of APIs, the queries are still in the form of the conjunctive queries formulated in our paper. Consider the synthesized query in case 1 as an example:

```
predicate output(int id, int startLineNumber){
    exists(LocalVariable a1, Type a2, string s0) {
        a2=a1.getType()
                and
        s0 = a2.getName()
                and
        equal(s0, "double")
                and
        id = a1
                and
        startLineNumber = a1.getLocation().getStartLineNumber()
     }
}
```

In this query, we utilize two relations, namely `LocalVariable` and `Type`. There is one equality constraint, i.e., `a2=a1.getType()`, and one string constraint, i.e., `s0=a2.getName() and equal(s0, "double")`. The variables `id`, `startLineNumber`, and the other two clauses are used to localize the construct in the program, which is not relevant to our synthesis problem. We just introduce them in our query for better code search. We omit other attributes in the `output` relation for clear demonstration.
