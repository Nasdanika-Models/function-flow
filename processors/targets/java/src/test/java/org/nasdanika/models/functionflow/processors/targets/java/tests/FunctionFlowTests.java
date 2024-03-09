package org.nasdanika.models.functionflow.processors.targets.java.tests;

import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.Flow;
import org.nasdanika.models.functionflow.util.FunctionFlowDrawioResourceFactory;

public class FunctionFlowTests {
	
	
	@Test
	public void testProcessors() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drawio", new FunctionFlowDrawioResourceFactory(uri -> resourceSet.getEObject(uri, true)));
		File processDiagramFile = new File("process.drawio").getCanonicalFile();
		Resource processResource = resourceSet.getResource(URI.createFileURI(processDiagramFile.getAbsolutePath()), true);
				
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Context context = Context.EMPTY_CONTEXT;
		Flow flow = (Flow) processResource.getContents().get(0);
		ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>> processorInfo = flow.createProcessor(context, progressMonitor);
		
	}

}
