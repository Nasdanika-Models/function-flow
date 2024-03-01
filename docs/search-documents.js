var searchDocuments = {"references/eClassifiers/Publisher/index.html":{"action-uuid":"604afd2d-3a82-4a93-8d49-529f5aa19fb0","title":"Publisher","content":"Publisher passes inputs matching the condition to subscribers with matching input type and condition. Implementation attribute may be used for refining publishing functionality. E.g. it can be used as a name of a &ldquo;channel&rdquo;. Or it may be a composite configuration and also specify delivery multiplicity - one recipient, all recipients, anything in between."},"references/eClassifiers/Function/index.html":{"action-uuid":"9c21b97e-2efc-4829-bf0f-28f5e99bd6d3","title":"Function","content":"Function takes input and produces output as a result."},"references/eClassifiers/Call/inheritance.html":{"path":"Call/Inheritance","action-uuid":"bff22761-9386-4f05-88ac-022a9acd66ab","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/SourceFunction/inheritance.html":{"path":"Source Function/Inheritance","action-uuid":"3559eb15-2da4-4e95-abcd-043b3288b1f8","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Consumer/index.html":{"action-uuid":"e41b09ef-00ab-440e-8683-90864e124cbb","title":"Consumer","content":"Consumer processes inputs without producing outputs."},"references/eClassifiers/Supplier/references/eStructuralFeatures/output/index.html":{"path":"Supplier/Attributes/output","action-uuid":"30cbc67c-0df9-49f6-bbc2-344a1c330a8c","title":"output","content":"Output type"},"references/eClassifiers/SourceSupplier/inheritance.html":{"path":"Source Supplier/Inheritance","action-uuid":"2003c75d-b8cd-4251-8797-297ed0509a75","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/SourceTransition/index.html":{"action-uuid":"9bc5dc73-36b2-42a7-badc-5d1cc0907199","title":"Source Transition","content":"Source transition executes its source to transform input to output."},"references/eClassifiers/FlowElement/references/eStructuralFeatures/implementation/index.html":{"path":"Flow Element/Attributes/implementation","action-uuid":"4f4678c2-5ea3-42ec-ab08-25891aebbd8f","title":"implementation","content":"Meaning of implementation is generator/interpreter-specific. For example, for a Java generator it may be a fully qualified class name or a logical name which maps to a fully qualified class name. It may also be an expression returning the implementation, say constructor invocation."},"references/eClassifiers/SourceTransition/inheritance.html":{"path":"Source Transition/Inheritance","action-uuid":"4849b098-4228-41b6-976b-58b6a3dc4982","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Call/references/eStructuralFeatures/targetOutput/index.html":{"path":"Call/Attributes/targetOutput","action-uuid":"98f79859-44f1-4609-8ea4-aef200e2caf5","title":"targetOutput","content":"Output type"},"references/eClassifiers/SupplierFlow/index.html":{"action-uuid":"ea598d72-1141-4f07-a680-e69f5c14f9f0","title":"Supplier Flow","content":"Supplier flow is a composite supplier."},"index.html":{"action-uuid":"50025c59-41b2-4376-a4d6-24fcd61322b3","title":"Function Flow","content":"Function flow model is intended to be used for modeling graphs of nodes passing data from one to another to achieve some goal. There are three base types of nodes: Supplier - provides data, e.g. listens on an HTTP port or reads a file. Consumer - received data and does something with it. E.g. writes to a file or sends an HTTP response. Function - produces output data from input data. Function is both a supplier and a consumer. In the above diagram: The supplier listens for HTTP requests, parses them and passes to the query database function The query database function uses the request data to retrieve information from a database and passes query results to the rendering function The rendering function generates response HTML The send response consumer sends the rendered response back There are many technology solutions doing similar things. However, many of them are built for specific target runtimes. The goal of this model to be runtime-agnostic, which allows modelers to focus on the &ldquo;business&rdquo; flow using terminology specific to their semantic domain. For example, &ldquo;book a flight&rdquo;. During modeling it should be irrelevant how a flight is booked - by making a REST call, sending a JMS message or adding a record to a database. Making such decisions during modeling might be premature and inefficient because it distracts from the primary goal - modeling a flow1. Even in the above rather low-level flow there are multiple variation points - there are different ways to listen for HTTP request, many different databases and ways to query them, &hellip; The following sections provide an overview of the model elements, explain how to map Drawio diagrams to this model, and provide some guidelines regarding generators. Summary Drawio mapping errors implementation String Map condition input order output source target-input target-output Generation Interpretation Flow inheritance Usage scenario Summary As it was mentioned at the beginning, there are three base types of model elements - suppliers, consumers, and functions. A function is both a supplier and a consumer. Flow element is a base class for other model elements. Flow is a container of flow elements with several flavors - just a flow (command), supplier flow, function flow , and consumer flow. Suppliers, functions, and consumers communicate via transitions and calls. Error transitions are activated in case of errors. There are three flow element types which don&rsquo;t use transitions to communicate: Error handler - activated by errors which were not handled by error transitions. Publisher - publishes its inputs to subscribers. Subscriber - receives inputs from publishers. Start and End are flow input/output &ldquo;ports&rdquo; passing data from the flow to its elements. There is a number of source flavors of the above elements which allow to associates some type of source code with an element. The classifiers table lists all model elements alphabetically with short descriptions. The UML diagram shows model element relationships and attributes. There are also several types of graph representations including: Force graph Force graph with dependencies Drawio mapping Mapping of Drawio diagrams to Ecore models is explained in detail in the Beyond Diagrams book. This section documents diagram element properties specific for the function flow model. All properties below except order support -ref suffix to load them from an external resource resolved relative to the element&rsquo;s base-uri. For example, input property specifies input type, input-ref specifies a URI of a resource containing input type specification. The mapping logic just loads the below properties, what to do with them is up to the generation/execution logic. As such, the below sections are guidelines/suggestions which might be followed, extended, or ignored by the generator/interpreter providers. errors A list of error types thrown by a given element. Similar to Java method throws clause. Errors value is loaded as YAML and if it is a list (array) then its elements are treated as error type specifications. Otherwise, the entire value it treated as a single error type specification. A type specification for errors, input, and output can be: String Logical name, e.g. Account Physical name, e.g. mypackage.Account Map (YAML, JSON, XML, &hellip;) Type specification (schema) Mapping of argument names to argument types - logical, physical, specifications Maven coordinates to add to dependencies or construct a classloader + type name implementation Flow element implementation specification to be used by a generator or an interpreter/executor. Below are a few suggestions for implementation format: String A logical or a physical name of implementation class/object which can be instantiated or looked up in some registry. For example in Java: http-listener - a logical name to be translated to an object by the generator. mypackage.HttpListener - service interface name. Service implementations are to be loaded by ServiceLoader mypackage.HttpListenerImpl - implementation class name to be instantiated. Map A map in YAML, JSON, properties, XML, or other format may specify: Maven coordinates to add to dependencies in a generated pom.xml file or to create a classloader. Implementation class or service interface name. Configuration parameters. condition A condition for transitions, publishers, and subscribers. For generators it might be a boolean expression in the target language or a method body evaluating to boolean value. For a Java interpreter it might be a SpEL expression. input Input type for consumers, functions, and transitions. order Condition evaluation and type matching order for transitions. output Output type for suppliers, functions, and transitions. source Source code. Generators can copy it to the generated classes or use as a template (E.g. Apache FreeMarker or Mustache.java) to generate code. Interpreters may executed code. In Java interpreters may use scripting to evaluate source code. For example GraalVM ScriptEngine. target-input Input type for a call target. Defaults to the call input type if blank. target-output Output type for a call target. Defaults to the call output type if blank. Generation In Java a generator may: Generate a single input parameter for consumers and functions Generate a list of parameters from maps Add context parameter to allow flow elements to set/get shared flow state and lookup services. E.g. Context or MutableContext. Add progress monitor parameter Reuse flow elements for multiple inputs or create a new instance of the top-level flow for every input, or use a pool of instances. Merge generated code with existing code preserving manual modifications. This would allow to have evolve the flow/implementations, flow configuration, and generated code in parallel and then merge the three lines of evolution. E.g. upgrade to a new flow version or change implementation or configuration for a flow element. Interpretation In Java an interpreter may use SpEL expressions for conditions, scripting to evaluate sources and Maven classloader to load implementations. It may pass progress monitor and context variables between flow elements. Flow inheritance Flow elements have unique id&rsquo;s. This allows to implement flow inheritance - overriding configuration of a base flow. Currently this functionality is not part of the model - it can be implemented by generators and interpreters. Usage scenario A flow is created in terms of the semantic domain. E.g. Enroll student to a class. Flows and elements are documented and documentation is published to be available to stakeholders. Flows may define actors and flow elements may define roles and actors in roles to assign responsibilities. Flows and flow elements may have a single or multiple implementations as well as multiple sets of configuration properties. This allows to have a multiple embodiments of the same flow for different use cases. Implementations may be bespoke or reusable. Flows can form a hierarchy and flow element implementations can be flows or generated from flows. See Enterprise Model and the terminology chapter in the Beyond Diagrams book for more insights on value provided by diagramming/modeling. ↩ HTTP Listener Query Database Send HTTP Response Render Results"},"references/eClassifiers/SourceFunction/index.html":{"action-uuid":"1badbb4d-e127-4a44-bdec-e2af67a8e2c6","title":"Source Function","content":"Source function executes its source code to create output from input."},"references/eClassifiers/Start/inheritance.html":{"path":"Start/Inheritance","action-uuid":"2ec3ed46-0108-4dcf-a2d5-ddbe7c5c969b","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Call/references/eStructuralFeatures/targetInput/index.html":{"path":"Call/Attributes/targetInput","action-uuid":"8b4633ca-597e-4803-9552-92657c1b8379","title":"targetInput","content":"Output type"},"references/eClassifiers/ErrorHandler/inheritance.html":{"path":"Error Handler/Inheritance","action-uuid":"d76c248c-f740-4dae-b626-df3c5624ca2b","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Function/inheritance.html":{"path":"Function/Inheritance","action-uuid":"fa49e6bc-0fb0-4363-a658-0b6cf0bf362b","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/ErrorTransition/index.html":{"action-uuid":"7619e44e-2ca0-443c-a9e7-4730bf66cd56","title":"Error Transition","content":"Error transitions are activated by errors thrown by the source. If a flow element throws an error, outgoing error transitions are sorted by order, within the order they are sorted by error specificity if it is supported. Error transitions with conditions are matched before error transitions without conditions. The first transition to match error type and condition (if it is present) is activated."},"references/eClassifiers/SupplierFlow/inheritance.html":{"path":"Supplier Flow/Inheritance","action-uuid":"d02cea61-8f58-4dd0-bfaf-2d7b28706ce5","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Flow/index.html":{"action-uuid":"9c10dd48-a00f-4227-bd62-8f4c20b06d45","title":"Flow","content":"Flow is a container for flow elements connected by transitions. It is a base class for other flow types - Supplier Flow, Consumer Flow, and Function Flow. Flow does not take inputs and does not produce outputs. As such it does not support Start and End - it is an element graph consisting of Suppliers, Functions, Consumers, and Error Handlers"},"references/eClassifiers/Consumer/references/eStructuralFeatures/input/index.html":{"path":"Consumer/Attributes/input","action-uuid":"ebc5e84e-2f67-492e-9ead-29c8b71d3d52","title":"input","content":"Output type"},"references/eClassifiers/Source/index.html":{"action-uuid":"28fdac8b-df2b-4964-abca-acb0acb3360b","title":"Source","content":"Source is a base class for flow elements which execute source code. The meaning of source is implementation/generator specific. For a Java generation target it might be Java code and for a JavaScript generation target it might be JavaScript. However, depending on the implementation it might be some scripting language supported by Java scripting. It may also be a template which generates actual source code. E.g. Apache FreeMarker or Mustache.java."},"references/eClassifiers/SourceConsumer/inheritance.html":{"path":"Source Consumer/Inheritance","action-uuid":"bb5a8980-a785-463d-889a-68214e3a17d3","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Start/index.html":{"action-uuid":"e442f1a5-860e-40c3-b36a-58aaa041f17c","title":"Start","content":"Start passes containing Consumer/Function flow input to its outgoing transitions. A flow may have multiple starts. If there is more than one start then starts are sorted by order. Within the order value starts are sorted by output specificity if it is supported. Starts with conditions are matched before starts witout condition."},"references/eClassifiers/SourceErrorTransition/inheritance.html":{"path":"Source Error Transition/Inheritance","action-uuid":"d5017908-88f1-4716-b39f-52382b838065","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Subscriber/index.html":{"action-uuid":"e3d22db7-4762-433e-9bf8-fee0d9a3be96","title":"Subscriber","content":"Subscribers receive inputs from publishers which match their input type and condition. Implementation attriute can be used for further refinement. For example, it can be used as a name of a &ldquo;channel&rdquo; or specify both channel name and priority (order)."},"references/eClassifiers/FunctionFlow/inheritance.html":{"path":"Function Flow/Inheritance","action-uuid":"09d931c4-be7f-4716-8247-4b5cc5371699","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/FlowElement/references/eStructuralFeatures/errors/index.html":{"path":"Flow Element/Attributes/errors","action-uuid":"086b16cb-e48c-48d9-841b-ca9449caa68b","title":"errors","content":"A list of errors which has different semantics for different element types: For Error Handler the error list defines errors which the handler handles. For Error Transition the error list defines errors activate the transition. For all other elements defines errors which the element throws. Java analogy: Error handler and transition - exception type in catch clause All other elements - exception types in throws clause"},"references/eClassifiers/Transition/inheritance.html":{"path":"Transition/Inheritance","action-uuid":"d3278dbc-1f0c-46ea-a03a-1bec5a985230","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/End/inheritance.html":{"path":"End/Inheritance","action-uuid":"66ea9287-9d86-4cec-a32b-972356cc8be4","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Supplier/inheritance.html":{"path":"Supplier/Inheritance","action-uuid":"e0dd8e06-8669-4570-8dbe-98f2bc1ad0cc","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Subscriber/inheritance.html":{"path":"Subscriber/Inheritance","action-uuid":"0c6e06ab-5fbb-400b-a3fa-0c7381307fae","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/End/index.html":{"action-uuid":"36f05846-a24d-4a75-8e6b-113c61fd7999","title":"End","content":"End input is used as an output of the containing flow."},"references/eClassifiers/Call/index.html":{"action-uuid":"409fa25c-b83e-4260-a2ea-0b2065986ad6","title":"Call","content":"Calls a function node and returns result to the caller. It may be thought of as two transitions - to the calling function and back to the caller. Condition and order attributes can be used for aggregating multiple call in one as in if - else if - else chain."},"references/eClassifiers/ConsumerFlow/index.html":{"action-uuid":"ee7634d0-73c8-451b-83df-09a1a6bb7d02","title":"Consumer Flow","content":"Consumer flow passes its inputs to a matching Start."},"references/eClassifiers/Consumer/inheritance.html":{"path":"Consumer/Inheritance","action-uuid":"ed1c965f-2e62-4ca8-b942-1bda38348edb","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Transition/index.html":{"action-uuid":"a3dc00ef-9113-4993-bd7e-c2683a1430fe","title":"Transition","content":"Transisitions are functions which take source output as their input. Transition output is passes to its target as input. Only one transition is activated by the source output. Transitions are evauated for activation in the the order defined by the order property. Transitions within the same order are ordered by type specificity, if it is supported. Within the same type (or absense of thereof) transitions with conditions are evaluated before transition(s) without conditions."},"references/eClassifiers/Publisher/inheritance.html":{"path":"Publisher/Inheritance","action-uuid":"f5c0de23-8d32-48ac-aa91-8a1c649bb68f","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/FlowElement/index.html":{"action-uuid":"63850aab-562b-4b56-858b-ae0d06b0876f","title":"Flow Element","content":"Base class for flow elements. Defines errors and implementation attributes. errors has different semantics depending on a sub-class and is not applicable to some sub-classes."},"references/eClassifiers/Transition/references/eStructuralFeatures/output/index.html":{"path":"Transition/Attributes/output","action-uuid":"732f96ff-44b3-4c85-b25b-9b4df9742987","title":"output","content":"Output type"},"references/eClassifiers/SourceCall/inheritance.html":{"path":"Source Call/Inheritance","action-uuid":"1bc7bf7a-e925-4f4e-84c3-c9c294406cbf","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/SourceErrorTransition/index.html":{"action-uuid":"ec8eb857-9751-4d95-b3c6-cda26d3c4825","title":"Source Error Transition","content":"Source error transition executes its source code to transform the input error to transition output."},"references/eClassifiers/SourceSupplier/index.html":{"action-uuid":"8ec35214-3213-4826-90f2-735d33291840","title":"Source Supplier","content":"Source supplier executes its source code to supply output objects. For example, the source code may create an HTTP listener to supply HTTP request/response pairs (exchanges)."},"references/eClassifiers/FlowElement/inheritance.html":{"path":"Flow Element/Inheritance","action-uuid":"8ccf1f45-a0db-4991-844b-c166b4f28738","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/SourceCall/index.html":{"action-uuid":"c406fb6d-b20d-4f0e-8715-7a2afd03ddc3","title":"Source Call","content":"Source call executes its source to transform input to target input and then target output to output."},"references/eClassifiers/Transition/references/eStructuralFeatures/input/index.html":{"path":"Transition/Attributes/input","action-uuid":"05bacad5-fa37-47af-a3b2-bc4a13509718","title":"input","content":"Output type"},"glossary.html":{"action-uuid":"6d26012a-7bed-422b-8669-d3b0ff077ac9","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/eClassifiers/FunctionFlow/index.html":{"action-uuid":"10fb3cee-20e3-4d8a-bc6b-f2601d9ad87e","title":"Function Flow","content":"Function flow takes inputs and passes them to a matching Start element. It then collects output from its End element and uses it as flow output."},"references/eClassifiers/Start/references/eStructuralFeatures/output/index.html":{"path":"Start/Attributes/output","action-uuid":"126b1646-7eb0-4d95-a610-4397407b08a3","title":"output","content":"Output type"},"references/eClassifiers/SourceConsumer/index.html":{"action-uuid":"a7357d03-ccfd-4e62-b32e-710cfb9560a2","title":"Source Consumer","content":"Source consumer executes source code to process its inputs."},"references/eClassifiers/Source/inheritance.html":{"path":"Source/Inheritance","action-uuid":"07a8c266-e9f2-4ad4-ac9e-6e4813150533","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/ConsumerFlow/inheritance.html":{"path":"Consumer Flow/Inheritance","action-uuid":"05f323bd-1b09-467a-b63c-2884f041a548","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Flow/inheritance.html":{"path":"Flow/Inheritance","action-uuid":"85fff52c-7889-44b5-bbb1-cc9b46289845","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/ErrorHandler/index.html":{"action-uuid":"c9752b47-a3ae-46c3-a25a-e9709593f63f","title":"Error Handler","content":"If a flow element throws an error and there are no matching error transitions, then the error is handled by an error handler with matching errors. Error handlers are sorted in the order of error specificity, if it is supported. Otherwise they are matched with the error in the order they are defined in the model."},"references/eClassifiers/SourceErrorHandler/inheritance.html":{"path":"Source Error Handler/Inheritance","action-uuid":"0fc4d9c1-27c4-42d8-8105-8d0ea7660f19","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/SourceErrorHandler/index.html":{"action-uuid":"c449e773-d2ac-4f2e-8d54-52cd07171439","title":"Source Error Handler","content":"Source error handler executes source code to handle errors not handled by error transitions."},"references/eClassifiers/ErrorTransition/inheritance.html":{"path":"Error Transition/Inheritance","action-uuid":"79a20924-4c7c-4986-9c4a-20d4b317ef7c","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Supplier/index.html":{"action-uuid":"4e363d12-9902-4e31-b4c3-498b006aeac9","title":"Supplier","content":"Suppliers are sources of objects of output type which are passed via transitions to functions and consumers. Examples: HTTP listener File reader"}}