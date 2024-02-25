package org.nasdanika.models.functionflow.processors.doc;

import java.util.function.BiFunction;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.processors.doc.ArchitectureNodeProcessorFactory;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate documentation.
 * @author Pavel
 *
 */
public class FunctionFlowNodeProcessorFactory extends ArchitectureNodeProcessorFactory {
			
	public FunctionFlowNodeProcessorFactory(Context context, BiFunction<URI, ProgressMonitor, Action> prototypeProvider) {
		super(context, prototypeProvider);
		// TODO Auto-generated constructor stub
	}
	
}
