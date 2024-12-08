package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.SourceHandler;
import org.nasdanika.models.functionflow.Transition;

public class TransitionProcessor<T extends Transition> extends ConnectionProcessor<T> {
	
	public TransitionProcessor(ProcessorFactory factory, T transition, ProgressMonitor progressMonitor) {
		super(factory, transition, progressMonitor);
	}

	@SourceHandler	
	@Override
	public Invocable getSourceHandler() {
		return super.getSourceHandler().asAsync();
	}
	
}
