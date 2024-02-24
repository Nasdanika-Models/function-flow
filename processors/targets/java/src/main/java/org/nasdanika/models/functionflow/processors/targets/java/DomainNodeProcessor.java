package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.Domain;

public class DomainNodeProcessor<T extends Domain> extends ArchitectureDescriptionElementNodeProcessor<T> implements DomainNodeProcessorMixIn<T> {
	
	public DomainNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}

	// ArchitectureDescription
	
}
