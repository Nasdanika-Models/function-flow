package org.nasdanika.models.functionflow.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.CompositeRelationshipSource;

public class CompositeRelationshipSourceNodeProcessor<T extends CompositeRelationshipSource> extends DomainNodeProcessor<T> implements CompositeRelationshipSourceNodeProcessorMixIn<T> {
	
	public CompositeRelationshipSourceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
	
	// RelationshipSource

}
