package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.functionflow.Call;

public class CallProcessor<T extends Call> extends TransitionProcessor<T> {
	
	public CallProcessor(ProcessorFactory factory, T transition, ProgressMonitor progressMonitor) {
		super(factory, transition, progressMonitor);
	}

	@Override
	public boolean isAsync() {
		return false;
	}
	
	@Override
	public boolean isCall() {
		return true;
	}
	
}
