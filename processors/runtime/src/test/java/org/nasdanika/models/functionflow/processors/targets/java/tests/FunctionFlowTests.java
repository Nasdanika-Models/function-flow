package org.nasdanika.models.functionflow.processors.targets.java.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.Context;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.graph.model.adapters.ElementAdapter;
import org.nasdanika.graph.model.adapters.GraphAdapterFactory;
import org.nasdanika.graph.model.adapters.NodeAdapter;
import org.nasdanika.graph.processor.CapabilityProcessorFactory;
import org.nasdanika.graph.processor.NodeProcessorInfo;
import org.nasdanika.graph.processor.NopEndpointProcessorConfigFactory;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.End;
import org.nasdanika.models.functionflow.Start;

public class FunctionFlowTests {
		
	@Test
	public void testFunctionFlowCapabilityProcessors() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		File processDiagramFile = new File("process.drawio").getCanonicalFile();
		Resource processResource = resourceSet.getResource(URI.createFileURI(processDiagramFile.getAbsolutePath()), true);
		Context context = Context.EMPTY_CONTEXT;
//		FunctionFlow functionFlow = (FunctionFlow) processResource.getContents().get(0);
		Function<End, Invocable> endResolver = end -> {
			return new Invocable() {
				
				@SuppressWarnings("unchecked")
				@Override
				public <T> T invoke(Object... args) {
					System.out.println("End invoked: " + end + " " + args);
					return (T) "Purum";
				}
			};
		};
		NodeProcessorInfo<Invocable, Invocable, Invocable> processorInfo = (NodeProcessorInfo<Invocable, Invocable, Invocable>) createCapabilityProcessor(processResource.getContents(), endResolver, context, progressMonitor);
		Invocable processor = processorInfo.getProcessor();
		Object result = processor.invoke("Hello");
		System.out.println(result);
	}
		
	protected ProcessorInfo<Invocable> createCapabilityProcessor(
			List<EObject> graphElements, 
			Function<End,Invocable> endResolver, 
			Context context, 
			ProgressMonitor progressMonitor) {				
		// Creating adapters
		GraphAdapterFactory graphAdapterFactory = new GraphAdapterFactory();  
		Transformer<EObject,ElementAdapter<?>> graphFactory = new Transformer<>(graphAdapterFactory); 
		Map<EObject, ElementAdapter<?>> registry = graphFactory.transform(graphElements, false, progressMonitor);
		
		// Configs and processors
		NopEndpointProcessorConfigFactory<Function<Object,Object>> processorConfigFactory = new NopEndpointProcessorConfigFactory<>() {
			
//			protected boolean isPassThrough(org.nasdanika.graph.Connection connection) {
//				return false;
//			};
			
		};
		
		Transformer<org.nasdanika.graph.Element, ProcessorConfig> transformer = new Transformer<>(processorConfigFactory);
		Map<org.nasdanika.graph.Element, ProcessorConfig> configs = transformer.transform(registry.values(), false, progressMonitor);

		CapabilityLoader capabilityLoader = new CapabilityLoader();		
		CapabilityProcessorFactory<Object, Invocable> processorFactory = new CapabilityProcessorFactory<>(
				Invocable.class, 
				Invocable.class, 
				Invocable.class, 
				endResolver, 
				capabilityLoader); 
		
		Map<org.nasdanika.graph.Element, ProcessorInfo<Invocable>> processors = processorFactory.createProcessors(configs.values(), false, progressMonitor);

		// Root element processor
		return processors
				.entrySet()
				.stream()
				.filter(e -> e.getKey() instanceof NodeAdapter && ((NodeAdapter) e.getKey()).get() instanceof Start)
				.map(Entry::getValue)
				.findAny()
				.get();
	}
	
}
