package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.Tunnel;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedTunnelNodeProcessor;

public class TunnelNodeProcessor<T extends Tunnel> extends DocumentedNamedTunnelNodeProcessor<T> implements TunnelNodeProcessorMixIn<T> {
	
	public TunnelNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}

	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		TunnelNodeProcessorMixIn.super.configureLabel(source, label, progressMonitor);
	}
	
	// Relationship

}
