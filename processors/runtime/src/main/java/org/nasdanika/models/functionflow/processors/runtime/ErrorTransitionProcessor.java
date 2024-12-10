package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.models.functionflow.ErrorTransition;

public class ErrorTransitionProcessor extends TransitionProcessor<ErrorTransition> {
	
	public ErrorTransitionProcessor(ProcessorFactory factory, ErrorTransition errorTransition, ProgressMonitor progressMonitor) {
		super(factory, errorTransition, progressMonitor);
	}

	public boolean match(Connection activator, Object[] args, RuntimeException exception) {
		throw new UnsupportedOperationException();
	}
	
}
