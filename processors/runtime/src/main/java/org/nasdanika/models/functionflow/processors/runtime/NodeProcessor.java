package org.nasdanika.models.functionflow.processors.runtime;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.processor.IncomingHandler;
import org.nasdanika.graph.processor.OutgoingEndpoint;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class NodeProcessor<N extends EObject> extends FlowElementProcessor<N> {
	
	protected NodeProcessor(ProcessorFactory factory, N modelElement, ProgressMonitor progressMonitor) {
		super(factory, modelElement, progressMonitor);
	}
	
	protected Map<Connection, Invocable> outgoingEndpoints = Collections.synchronizedMap(new LinkedHashMap<>());	
	
	@OutgoingEndpoint
	public final void addOutgoingEndpoint(Connection connection, Invocable endpoint) {
		outgoingEndpoints.put(connection, endpoint);
	}
	
	@IncomingHandler
	public Invocable getIncomingHandler(Connection connection) {
		Invocable ret = new Invocable() {

			@Override
			public <T> T invoke(Object... args) {
				return NodeProcessor.this.invoke(connection, args);
			}
			
		};
		return ret;
	}	
	
	protected <T> T invoke(Connection connection, Object[] args) {
		Invocable impl = getImplementation();
		if (impl == null) {
			return null; // Throw exception?
		}
		
		// TODO - error handling - error transitions and to parent
		return impl.bind(connection).invoke(args);
	}
		
	/**
	 * Dispatches to transitions
	 * @param <T>
	 * @param connection
	 * @param args
	 * @return
	 */
	protected <T> Map<Connection, T> dispatch(Object[] args) {
		Map<Connection, T> result = new LinkedHashMap<>();

		// TODO - sort, match, ...
		
		return result;
	}
	
	
	// submit - to transitions
	
}
