package org.nasdanika.models.functionflow.processors.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.processor.ChildProcessor;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.Flow;
import org.nasdanika.models.functionflow.FunctionFlow;
import org.nasdanika.models.functionflow.Transition;

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
				return (V) FlowProcessor.this.dispatch(null, null, args);			
			}
			
		};
		endProcessor.setTarget(endTarget);
	}
	
	@Override
	protected <V> Map<TransitionProcessor<Transition>, V> dispatch(Connection activator, Object[] args, Object[] results) {
		Map<TransitionProcessor<Transition>, V> dispatchResult = super.dispatch(activator, args, results);
		if (target != null) {
			dispatchResult.put(null, target.invoke(results));			
		}
		return dispatchResult;
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
	
	private ExceptionHandler exceptionHandler;
	
	public void setExceptionHandler(ExceptionHandler exceptionHandler) {
		this.exceptionHandler = exceptionHandler;
	}
	
	@Override
	public <V> V handleException(FlowElementProcessor<?> processor, Connection activator, Object[] args, RuntimeException exception) {
		Optional<ErrorHandlerProcessor> errorHandler = childProcessors
			.values()
			.stream()
			.map(ProcessorInfo::getProcessor)
			.filter(ErrorHandlerProcessor.class::isInstance)
			.map(ErrorHandlerProcessor.class::cast)
			.filter(ehp -> ehp != processor) // Simple prevention of infinite loops, does not prevent a loop if an exception is thrown in the downstream error processing
			.filter(ehp -> ehp.match(processor, activator, args, exception))
			.sorted((a, b) -> a.distance(exception) - b.distance(exception))
			.findFirst();		
			
		if (errorHandler.isPresent()) {
			return errorHandler.get().invoke(processor, activator, args, exception);
		}
		
		if (exceptionHandler != null) {
			return exceptionHandler.handleException(processor, activator, args, exception);
		}
		
		return super.handleException(processor, activator, args, exception);
	}

}
