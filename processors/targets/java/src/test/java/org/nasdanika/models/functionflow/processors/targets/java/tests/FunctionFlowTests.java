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
import org.nasdanika.models.functionflow.FunctionFlow;
import org.nasdanika.models.functionflow.util.FunctionFlowDrawioResourceFactory;

public class FunctionFlowTests {
		
	@Test
	public void testFunctionFlowProcessors() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drawio", new FunctionFlowDrawioResourceFactory(uri -> resourceSet.getEObject(uri, true)));
		File processDiagramFile = new File("process.drawio").getCanonicalFile();
		Resource processResource = resourceSet.getResource(URI.createFileURI(processDiagramFile.getAbsolutePath()), true);
				
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Context context = Context.EMPTY_CONTEXT;
		FunctionFlow functionFlow = (FunctionFlow) processResource.getContents().get(0);
		
		BiFunction<Object, ProgressMonitor, Object> function = functionFlow.createFunction(context, progressMonitor);
		Object result = function.apply("Hello", progressMonitor);
		System.out.println(result);
	}

}
