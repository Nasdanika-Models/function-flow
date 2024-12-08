package org.nasdanika.models.functionflow.processors.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.ChildProcessor;
import org.nasdanika.graph.processor.IncomingHandler;
import org.nasdanika.graph.processor.OutgoingEndpoint;
import org.nasdanika.models.functionflow.Flow;
import org.nasdanika.models.functionflow.FunctionFlow;

/**
 * {@link FunctionFlow} synchronous processor
 */
public class FlowProcessor<T extends Flow> extends NodeProcessor<T> {
	
	protected FlowProcessor(ProcessorFactory factory, T flow, ProgressMonitor progressMonitor) {
		super(factory, flow, progressMonitor);
	}

	protected Collection<Invocable> startProcessors = Collections.synchronizedCollection(new ArrayList<>());
	
	@ChildProcessor("get() instanceof T(org.nasdanika.models.functionflow.Start)")
	public void addStartProcessor(Invocable startProcessor) {
		startProcessors.add(startProcessor);
	}
	
	@ChildProcessor("get() instanceof T(org.nasdanika.models.functionflow.End)")
	public void addEndProcessor(EndProcessor endProcessor) {
		Invocable target = new Invocable() {

			@SuppressWarnings("unchecked")
			@Override
			public <V> V invoke(Object... args) {
				// TODO - parallel and join?
				Map<Invocable, Object> outgoingEndpointsResults = new LinkedHashMap<>();
				for (Invocable e: outgoingEndpoints) {
					outgoingEndpointsResults.put(e, e.invoke(args));
				}
				return (V) outgoingEndpointsResults;			
			}
			
		};
		endProcessor.setTarget(target);
	}

	protected Collection<Invocable> outgoingEndpoints = Collections.synchronizedCollection(new ArrayList<>());	
	
	@OutgoingEndpoint
	public void addOutgoingEndpoint(Invocable endpoint) {
		outgoingEndpoints.add(endpoint);
	}
	
	@IncomingHandler
	public Invocable getIncomingHandler() {
		return new Invocable() {
			
			@SuppressWarnings("unchecked")
			@Override
			public <T> T invoke(Object... args) {
				// TODO - parallel and join?
				Map<Invocable, Object> startProcessorResults = new LinkedHashMap<>();
				for (Invocable startProcessor: startProcessors) {
					startProcessorResults.put(startProcessor, startProcessor.invoke(args));
				}
				return (T) startProcessorResults;
			}
		};
		
	}
	
	@Override
	public <T> T invoke(Object... args) {
		throw new UnsupportedOperationException("Function flow processor shall not be invoked directly");
	}

}
