package org.nasdanika.models.functionflow.processors.runtime;

import java.util.LinkedHashMap;
import java.util.Map;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.functionflow.Start;

public class StartProcessor extends NodeProcessor<Start> {

	public StartProcessor(ProcessorFactory factory, Start start, ProgressMonitor progressMonitor) {
		super(factory, start, progressMonitor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T invoke(Object... args) {
		Map<Invocable, Object> outgoingEndpointsResults = new LinkedHashMap<>();
		for (Invocable e: outgoingEndpoints.values()) {
			outgoingEndpointsResults.put(e, e.invoke(args));
		}
		return (T) outgoingEndpointsResults;
	}

}
