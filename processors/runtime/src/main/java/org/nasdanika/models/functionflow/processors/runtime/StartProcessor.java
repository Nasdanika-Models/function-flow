package org.nasdanika.models.functionflow.processors.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.nasdanika.common.Invocable;
import org.nasdanika.graph.processor.OutgoingEndpoint;

public class StartProcessor extends NodeProcessor {

	public StartProcessor(ProcessorFactory factory) {
		super(factory);
	}

	protected Collection<Invocable> outgoingEndpoints = Collections.synchronizedCollection(new ArrayList<>());	
	
	@OutgoingEndpoint
	public void addOutgoingEndpoint(Invocable endpoint) {
		outgoingEndpoints.add(endpoint);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T invoke(Object... args) {
		// TODO - parallel and join?
		Map<Invocable, Object> outgoingEndpointsResults = new LinkedHashMap<>();
		for (Invocable e: outgoingEndpoints) {
			outgoingEndpointsResults.put(e, e.invoke(args));
		}
		return (T) outgoingEndpointsResults;
	}

}
