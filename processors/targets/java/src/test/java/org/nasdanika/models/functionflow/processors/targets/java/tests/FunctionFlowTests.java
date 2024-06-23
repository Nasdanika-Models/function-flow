package org.nasdanika.models.functionflow.processors.targets.java.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.common.Context;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.graph.model.adapters.ElementAdapter;
import org.nasdanika.graph.model.adapters.GraphAdapterFactory;
import org.nasdanika.graph.processor.CapabilityProcessorFactory;
import org.nasdanika.graph.processor.NodeProcessorInfo;
import org.nasdanika.graph.processor.NopEndpointProcessorConfigFactory;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.FunctionFlow;
import org.nasdanika.models.functionflow.util.FunctionFlowDrawioResourceFactory;

public class FunctionFlowTests {
		
	@Test
	public void testFunctionFlowCapabilityProcessors() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drawio", new FunctionFlowDrawioResourceFactory(uri -> resourceSet.getEObject(uri, true)));
		File processDiagramFile = new File("process.drawio").getCanonicalFile();
		Resource processResource = resourceSet.getResource(URI.createFileURI(processDiagramFile.getAbsolutePath()), true);
				
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Context context = Context.EMPTY_CONTEXT;
		FunctionFlow functionFlow = (FunctionFlow) processResource.getContents().get(0);
		
		NodeProcessorInfo<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>> processorInfo = (NodeProcessorInfo<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>>) createCapabilityProcessor(functionFlow, null, context, progressMonitor);
		BiFunction<Object, ProgressMonitor, Object> processor = processorInfo.getProcessor();
		Object result = processor.apply("Hello", progressMonitor);
		System.out.println(result);
	}
		
	protected ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>> createCapabilityProcessor(EObject graph, Object requirement, Context context, ProgressMonitor progressMonitor) {				
		// Creating adapters
		GraphAdapterFactory graphAdapterFactory = new GraphAdapterFactory();  
		Transformer<EObject,ElementAdapter<?>> graphFactory = new Transformer<>(graphAdapterFactory); 
		Map<EObject, ElementAdapter<?>> registry = graphFactory.transform(Collections.singleton(graph), false, progressMonitor);
		
		// Configs and processors
		NopEndpointProcessorConfigFactory<Function<Object,Object>> processorConfigFactory = new NopEndpointProcessorConfigFactory<>() {
			
//			protected boolean isPassThrough(org.nasdanika.graph.Connection connection) {
//				return false;
//			};
			
		};
		
		Transformer<org.nasdanika.graph.Element, ProcessorConfig> transformer = new Transformer<>(processorConfigFactory);
		Map<org.nasdanika.graph.Element, ProcessorConfig> configs = transformer.transform(registry.values(), false, progressMonitor);

		CapabilityLoader capabilityLoader = new CapabilityLoader();		
		CapabilityProcessorFactory<Object, BiFunction<Object, ProgressMonitor, Object>> processorFactory = new CapabilityProcessorFactory<Object, BiFunction<Object, ProgressMonitor, Object>>(
				BiFunction.class, 
				BiFunction.class, 
				BiFunction.class, 
				null, 
				capabilityLoader); 
		
		Map<org.nasdanika.graph.Element, ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>>> processors = processorFactory.createProcessors(configs.values(), false, progressMonitor);

		// Root element processor
		return processors
				.values()
				.stream()
				.filter(v -> v.getParentProcessorConfig() == null)
				.findAny()
				.get();
	}
	
}
