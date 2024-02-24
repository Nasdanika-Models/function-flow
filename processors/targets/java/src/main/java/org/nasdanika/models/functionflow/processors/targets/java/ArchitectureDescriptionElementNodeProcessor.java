package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.ArchitectureDescriptionElement;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedGraphElementNodeProcessor;

public class ArchitectureDescriptionElementNodeProcessor<T extends ArchitectureDescriptionElement> extends DocumentedNamedGraphElementNodeProcessor<T> implements ArchitectureDescriptionElementNodeProcessorMixIn<T> {
	
	public ArchitectureDescriptionElementNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
	
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		ArchitectureDescriptionElementNodeProcessorMixIn.super.configureLabel(source, label, progressMonitor);
	}	
	
	// ArchitectureElement
	
	// Undergoer
	

}
