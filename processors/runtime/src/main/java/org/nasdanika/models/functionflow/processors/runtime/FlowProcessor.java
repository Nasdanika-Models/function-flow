package org.nasdanika.models.functionflow.processors.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.processor.ChildProcessor;
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
		Invocable endTarget = new Invocable() {

			@SuppressWarnings("unchecked")
			@Override
			public <V> V invoke(Object... args) {
				return (V) FlowProcessor.this.dispatch(args);			
			}
			
		};
		endProcessor.setTarget(endTarget);
	}
	
	@Override
	protected <V> Map<Connection, V> dispatch(Object[] args) {
		Map<Connection, V> result = super.dispatch(args);
		if (target != null) {
			result.put(null, target.invoke(args));			
		}
		return result;
	}
	
	private Invocable target;
	
	public void setTarget(Invocable target) {
		this.target = target;
	}	
		
	@SuppressWarnings("unchecked")
	@Override
	public <V> V invoke(Object... args) {
		Map<Invocable, Object> startProcessorResults = new LinkedHashMap<>();
		for (Invocable startProcessor: startProcessors) {
			startProcessorResults.put(startProcessor, startProcessor.invoke(args));
		}
		return (V) startProcessorResults;
	}

}
