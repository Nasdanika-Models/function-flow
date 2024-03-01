Function flow model is intended to be used for modeling graphs of nodes passing data from one to another to achieve some goal. 
There are three base types of nodes:

* Supplier - provides data, e.g. listens on an HTTP port or reads a file.
* Consumer - received data and does something with it. E.g. writes to a file or sends an HTTP response.
* Function - produces output data from input data. Function is both a supplier and a consumer.

```drawio-resource
function-flow.drawio
```

In the above diagram:

* The supplier listens for HTTP requests, parses them and passes to the query database function
* The query database function uses the request data to retrieve information from a database and passes query results to the rendering function 
* The rendering function generates response HTML
* The send response consumer sends the rendered response back

There are many technology solutions doing similar things. 
However, many of them are built for specific target runtimes. 
The goal of this model to be runtime-agnostic, which allows modelers to focus on
the "business" flow using terminology specific to their semantic domain.
For example, "book a flight". During modeling it should be irrelevant how a flight is booked - by making a REST call, sending a JMS message or adding a record to a database. 
Making such decisions during modeling might be premature and inefficient because it distracts from the primary goal - modeling a flow[^beyond-diagrams].

[^beyond-diagrams]: See [Enterprise Model](https://enterprise.models.nasdanika.org/) and the terminology chapter in the [Beyond Diagrams](https://leanpub.com/beyond-diagrams) book for more insights on value provided by diagramming/modeling. 

Even in the above rather low-level flow there are multiple variation points - there are different ways to listen for HTTP request, many different databases and ways to query them, ...

The following sections provide an overview of the model elements, explain how to map Drawio diagrams to this model, and provide some guidelines regarding generators.  

[TOC levels=6]

## Summary

As it was mentioned at the beginning, there are three base types of model elements - [suppliers](references/eClassifiers/Supplier/index.html), [consumers](references/eClassifiers/Consumer/index.html), and [functions](references/eClassifiers/Function/index.html). A function is both a supplier and a consumer.

[Flow element](references/eClassifiers/FlowElement/index.html) is a base class for other model elements.
[Flow](references/eClassifiers/Flow/index.html) is a container of flow elements with several flavors - just a flow (command), [supplier flow](references/eClassifiers/SupplierFlow/index.html), [function flow](references/eClassifiers/FunctionFlow/index.html) , and [consumer flow](references/eClassifiers/ConsumerFlow/index.html).

Suppliers, functions, and consumers communicate via [transitions](references/eClassifiers/Transition/index.html) and [calls](references/eClassifiers/Call/index.html). 
[Error transitions](references/eClassifiers/ErrorTransition/index.html) are activated in case of errors.

There are three flow element types which don't use transitions to communicate:

* [Error handler](references/eClassifiers/ErrorHandler/index.html) - activated by errors which were not handled by error transitions.
* [Publisher](references/eClassifiers/Publisher/index.html) - publishes its inputs to subscribers.
* [Subscriber](references/eClassifiers/Subscriber/index.html) - receives inputs from publishers.

[Start](references/eClassifiers/Start/index.html) and [End](references/eClassifiers/End/index.html) are flow input/output "ports" passing data from the flow to its elements.

There is a number of [source](references/eClassifiers/Source/index.html) flavors of the above elements which allow to associates some type of source code with an element.

The [classifiers](classifiers.html) table lists all model elements alphabetically with short descriptions.
The [UML diagram](diagram.html) shows model element relationships and attributes.
There are also several types of graph representations including:

* [Force graph](default-graph.html)
* [Force graph with dependencies](default-graph-with-dependencies-and-subpackages.html)


## Drawio mapping

Mapping of [Drawio](https://docs.nasdanika.org/core/drawio/index.html) diagrams to Ecore models is explained in detail in the [Beyond Diagrams](https://leanpub.com/beyond-diagrams) book. 
This section documents diagram element properties specific for the function flow model.

All properties below except ``order`` support ``-ref`` suffix to load them from an external resource resolved relative to the element's ``base-uri``.
For example, ``input`` property specifies input type, ``input-ref`` specifies a URI of a resource containing input type specification.

The mapping logic just loads the below properties, what to do with them is up to the generation/execution logic. 
As such, the below sections are guidelines/suggestions which might be followed, extended, or ignored by the generator/interpreter providers.

### errors

A list of error types thrown by a given element.
Similar to Java method ``throws`` clause. 
Errors value is loaded as YAML and if it is a list (array) then its elements are treated as error type specifications.
Otherwise, the entire value it treated as a single error type specification.

A type specification for errors, input, and output can be:

* String
    * Logical name, e.g. ``Account``
    * Physical name, e.g. ``mypackage.Account``
* Map (YAML, JSON, XML, ...)
    * Type specification (schema)
    * Mapping of argument names to argument types - logical, physical, specifications 
    * Maven coordinates to add to dependencies or construct a classloader + type name   

### implementation

Flow element implementation specification to be used by a generator or an interpreter/executor.
Below are a few suggestions for implementation format:

#### String

A logical or a physical name of implementation class/object which can be instantiated or looked up in some registry.
For example in Java:

* ``http-listener`` - a logical name to be translated to an object by the generator.
* ``mypackage.HttpListener`` - service interface name. Service implementations are to be loaded by [ServiceLoader](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ServiceLoader.html)
* ``mypackage.HttpListenerImpl`` - implementation class name to be instantiated.

#### Map

A map in YAML, JSON, properties, XML, or other format may specify:

* Maven coordinates to add to dependencies in a generated ``pom.xml`` file or to create a classloader.
* Implementation class or service interface name.
* Configuration parameters. 

### condition

A condition for transitions, publishers, and subscribers.
For generators it might be a boolean expression in the target language or a method body evaluating to boolean value.
For a Java interpreter it might be a [SpEL](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression. 

### input

Input type for consumers, functions, and transitions.

### order

Condition evaluation and type matching order for transitions.

### output

Output type for suppliers, functions, and transitions.

### source

Source code. 
Generators can copy it to the generated classes or use as a template (E.g.  [Apache FreeMarker](https://freemarker.apache.org/index.html) or [Mustache.java](https://github.com/spullara/mustache.java)) to generate code.
Interpreters may executed code. In Java interpreters may use [scripting](https://docs.oracle.com/en/java/javase/17/docs/api/java.scripting/javax/script/package-summary.html) to evaluate source code. 
For example [GraalVM ScriptEngine](https://www.graalvm.org/latest/reference-manual/js/ScriptEngine/).

### target-input

Input type for a call target. Defaults to the call input type if blank.

### target-output

Output type for a call target. Defaults to the call output type if blank.

## Generation

In Java a generator may:

* Generate a single input parameter for consumers and functions
* Generate a list of parameters from maps
* Add ``context`` parameter to allow flow elements to set/get shared flow state and lookup services. E.g. [Context](https://javadoc.io/doc/org.nasdanika.core/common/latest/org.nasdanika.common/org/nasdanika/common/Context.html) or [MutableContext](https://javadoc.io/doc/org.nasdanika.core/common/latest/org.nasdanika.common/org/nasdanika/common/MutableContext.html).
* Add progress monitor parameter
* Reuse flow elements for multiple inputs or create a new instance of the top-level flow for every input, or use a pool of instances.
* Merge generated code with existing code preserving manual modifications. This would allow to have evolve the flow/implementations, flow configuration, and generated code in parallel and then merge the three lines of evolution. E.g. upgrade to a new flow version or change implementation or configuration for a flow element.

## Interpretation

In Java an interpreter may use SpEL expressions for conditions, scripting to evaluate sources
and Maven classloader to load implementations.
It may pass progress monitor and context variables between flow elements.

## Flow inheritance

Flow elements have unique id's. This allows to implement flow inheritance - overriding configuration of a base flow. 
Currently this functionality is not part of the model - it can be implemented by generators and interpreters. 

## Usage scenario

A flow is created in terms of the [semantic domain](https://enterprise.models.nasdanika.org/references/eClassifiers/SemanticDomainKind/index.html). E.g. ``Enroll student to a class``. 
Flows and elements are documented and documentation is published to be available to stakeholders.
Flows may define [actors](https://architecture.models.nasdanika.org/references/eClassifiers/Actor/index.html) and flow elements may define [roles](https://architecture.models.nasdanika.org/references/eClassifiers/Role/index.html) and actors in roles to assign responsibilities.

Flows and flow elements may have a single or multiple implementations as well as multiple sets of configuration properties.
This allows to have a multiple embodiments of the same flow for different use cases. 
Implementations may be bespoke or reusable. 

Flows can form a hierarchy and flow element implementations can be flows or generated from flows.