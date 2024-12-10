package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.functionflow.Start;

public class StartProcessor extends NodeProcessor<Start> {

	public StartProcessor(ProcessorFactory factory, Start start, ProgressMonitor progressMonitor) {
		super(factory, start, progressMonitor);
	}

	@Override
	public <T> T invoke(Object... args) {
		return incomingInvoke(null, args);
	}

}
