package org.nasdanika.models.functionflow.processors.runtime;

import java.time.Instant;
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
		Instant start = Instant.now();
		try {
			Map<Invocable, Object> outgoingEndpointsResults = new LinkedHashMap<>();
			for (Invocable e: outgoingEndpoints.values()) {
				outgoingEndpointsResults.put(e, e.invoke(args));
			}
			return onResult(start, this, null, args, (T) outgoingEndpointsResults);
		} catch (RuntimeException e) {
			onException(start, this, null, args, e);
			return handleException(this, null, args, e);
		}
	}

}
