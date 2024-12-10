package org.nasdanika.models.functionflow.processors.runtime;

import java.lang.reflect.Array;
import java.time.Instant;
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
				return NodeProcessor.this.incomingInvoke(connection, args);
			}
			
		};
		return ret;
	}	
	
	@SuppressWarnings("unchecked")
	protected <T> T incomingInvoke(Connection connection, Object[] args) {
		Instant start = Instant.now();
		try {
			Invocable impl = getImplementation();
			if (impl == null) {
				// Dispatching
				return onResult(start, this, connection, args, (T) dispatch(args));
			}
			
			T result = impl.bind(connection).invoke(args);
			if (result != null && result.getClass().isArray()) {
				Object[] dispatchArgs = new Object[Array.getLength(result)];
				System.arraycopy(result, 0, dispatchArgs, 0, dispatchArgs.length);
				return onResult(start, this, connection, args, (T) dispatch(dispatchArgs));
			}
			return onResult(start, this, connection, args, (T) dispatch(new Object[] { result }));
		} catch (RuntimeException e) {
			onException(start, this, connection, args, e);
			return handleException(parentProcessor, connection, args, e);
		}
	}
	
	@Override
	public <V> V handleException(
			FlowElementProcessor<?> processor, 
			Connection activator, 
			Object[] args,
			RuntimeException exception) {
		// TODO Auto-generated method stub
		return super.handleException(processor, activator, args, exception);
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
