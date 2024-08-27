package org.nasdanika.models.functionflow.processors.doc;

import java.util.function.BiFunction;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.models.architecture.processors.doc.ArchitectureNodeProcessorFactory;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate documentation.
 * @author Pavel
 *
 */
public class FunctionFlowNodeProcessorFactory extends ArchitectureNodeProcessorFactory {
			
	public FunctionFlowNodeProcessorFactory(Context context, BiFunction<URI, ProgressMonitor, Label> prototypeProvider) {
		super(context, prototypeProvider);
		// TODO Auto-generated constructor stub
	}
	
}
