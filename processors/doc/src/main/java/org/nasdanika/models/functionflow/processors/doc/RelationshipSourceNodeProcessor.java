package org.nasdanika.models.functionflow.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedConnectionSourceNodeProcessor;

public class RelationshipSourceNodeProcessor<T extends RelationshipSource> extends DocumentedNamedConnectionSourceNodeProcessor<T> implements RelationshipSourceNodeProcessorMixIn<T> {
	
	public RelationshipSourceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}

	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		RelationshipSourceNodeProcessorMixIn.super.configureLabel(source, label, progressMonitor);
	}
	
	// ArchitectureDescriptionElement

}
