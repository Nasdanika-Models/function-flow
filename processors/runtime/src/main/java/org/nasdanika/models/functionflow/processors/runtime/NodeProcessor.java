package org.nasdanika.models.functionflow.processors.runtime;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Invocable;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.processor.OutgoingEndpoint;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class NodeProcessor<N extends EObject> extends FlowElementProcessor<N> {
	
	protected NodeProcessor(ProcessorFactory factory, N modelElement) {
		super(factory, modelElement);
	}
	
	protected Map<Connection, Invocable> outgoingEndpoints = Collections.synchronizedMap(new LinkedHashMap<>());	
	
	@OutgoingEndpoint
	public void addOutgoingEndpoint(Connection connection, Invocable endpoint) {
		outgoingEndpoints.put(connection, endpoint);
	}

}
