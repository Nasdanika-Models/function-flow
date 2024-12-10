package org.nasdanika.models.functionflow.processors.runtime;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.processor.IncomingHandler;
import org.nasdanika.graph.processor.OutgoingEndpoint;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.Transition;

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
				return onResult(start, this, connection, args, (T) dispatch(connection, args, args));
			}
			
			T result = impl.bind(connection).invoke(args);
			if (result != null && result.getClass().isArray()) {
				Object[] dispatchArgs = new Object[Array.getLength(result)];
				System.arraycopy(result, 0, dispatchArgs, 0, dispatchArgs.length);
				return onResult(start, this, connection, args, (T) dispatch(connection, args, dispatchArgs));
			}
			return onResult(start, this, connection, args, (T) dispatch(connection, args, new Object[] { result }));
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
		
		record HandlerRecord(RuntimeException exception, Connection connnection, ErrorTransitionProcessor processor, Invocable endpoint) implements Comparable<HandlerRecord> {

			@Override
			public int compareTo(HandlerRecord o) {
				return processor().distance(exception()) - o.processor().distance(exception());
			}
			
		}
		
		List<HandlerRecord> matches = new ArrayList<>();
		
		for (Entry<Connection, Invocable> oee: outgoingEndpoints.entrySet()) {
			ProcessorInfo<?> processorInfo = registry.get(oee.getKey());
			if (processorInfo != null) {
				Object cProcessor = processorInfo.getProcessor();
				if (cProcessor instanceof ErrorTransitionProcessor) {
					ErrorTransitionProcessor errorTransitionProcessor = (ErrorTransitionProcessor) cProcessor;
					if (errorTransitionProcessor.matchException(activator, args, exception)) {
						matches.add(new HandlerRecord(exception, activator, errorTransitionProcessor, oee.getValue()));
					}
				}				
			}
		}
		
		Collections.sort(matches);
		for (HandlerRecord hr: matches) {
			return hr.endpoint().invoke(processor, activator, args, exception);
		}
		
		return super.handleException(processor, activator, args, exception);
	}
		
	/**
	 * Dispatches to transitions
	 * @param <T>
	 * @param connection
	 * @param args
	 * @return
	 */
	protected <T> Map<TransitionProcessor<Transition>, T> dispatch(Connection activator, Object[] args, Object[] results) {
		Map<TransitionProcessor<Transition>, T> dispatchResult = new LinkedHashMap<>();
		
		record TransitionRecord(Connection connnection, TransitionProcessor<Transition> processor, Invocable endpoint) implements Comparable<TransitionRecord> {

			@Override
			public int compareTo(TransitionRecord o) {
				return processor().getModelElement().getOrder() - o.processor().getModelElement().getOrder();
			}
			
		}
		
		List<TransitionRecord> matches = new ArrayList<>();
		
		for (Entry<Connection, Invocable> oee: outgoingEndpoints.entrySet()) {
			ProcessorInfo<?> processorInfo = registry.get(oee.getKey());
			if (processorInfo != null) {
				Object cProcessor = processorInfo.getProcessor();
				if (cProcessor instanceof TransitionProcessor) {
					@SuppressWarnings("unchecked")
					TransitionProcessor<Transition> transitionProcessor = (TransitionProcessor<Transition>) cProcessor;
					if (transitionProcessor.isCall()) {
						continue;
					}
					if (ErrorTransitionProcessor.class.isInstance(transitionProcessor)) {
						continue;
					}
					if (transitionProcessor.matchResult(activator, args, results)) {
						matches.add(new TransitionRecord(activator, transitionProcessor, oee.getValue()));
					}
				}				
			}
		}
		
		Collections.sort(matches);
		for (TransitionRecord tr: matches) {
			T tResult = tr.endpoint().invoke(args);
			dispatchResult.put(tr.processor(), tResult);
			if (!tr.processor().isContinue()) {
				break;
			}
		}
		
		return dispatchResult;
	}
	
}
