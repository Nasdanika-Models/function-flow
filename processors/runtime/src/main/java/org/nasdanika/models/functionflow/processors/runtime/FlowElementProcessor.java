package org.nasdanika.models.functionflow.processors.runtime;

import java.time.Instant;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.Component;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.processor.ChildProcessors;
import org.nasdanika.graph.processor.ParentProcessor;
import org.nasdanika.graph.processor.ProcessorElement;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.Registry;
import org.nasdanika.models.functionflow.FlowElement;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class FlowElementProcessor<T extends EObject> implements Invocable, Component, ExceptionHandler {
	
	protected ProcessorFactory factory;

	private T modelElement;

	protected Invocable implementation;
		
	protected FlowElementProcessor(
			ProcessorFactory factory, 
			T modelElement, 
			ProgressMonitor progressMonitor) {
		this.factory = factory;
		this.modelElement = modelElement;
		if (modelElement instanceof FlowElement) {
			implementation = createImplementation(
					((FlowElement) modelElement).getImplementation(),
					modelElement,
					factory, 
					progressMonitor);
		}
	}
	
	protected ExecutionListener executionListener;
	
	public void setExecutionListener(ExecutionListener executionListener) {
		this.executionListener = executionListener;
	}
	
	public ExecutionListener getExecutionListener() {
		return executionListener;
	}
	
	/**
	 * Override in Source - implementation is script language name
	 * @param implementationSpe
	 * @param factory
	 * @return
	 */
	protected Invocable createImplementation(
			String implementationSpec, 
			T modelElement,
			ProcessorFactory factory, 
			ProgressMonitor progressMonitor) {
		if (Util.isBlank(implementationSpec)) {
			return null;
		}
		
		URI iReq = URI.createURI(implementationSpec);
		if (iReq.isRelative()) {
			Resource resource = modelElement.eResource();
			if (resource != null) {
				URI base = resource.getURI();
				iReq = iReq.resolve(base);
			}
		}
		
		Invocable constructor = factory.getCapabilityLoader().loadOne(
				ServiceCapabilityFactory.createRequirement(Invocable.class, null, iReq),
				progressMonitor);
		
		return constructor.invoke(this);
	}
	
	public T getModelElement() {
		return modelElement;
	}
	
	public ProcessorFactory getFactory() {
		return factory;
	}
	
	@ParentProcessor
	public FlowElementProcessor<?> parentProcessor;
	
	@ChildProcessors
	public Map<org.nasdanika.graph.Element, ProcessorInfo<FlowElementProcessor<?>>> childProcessors;	
	
	@ProcessorElement
	public Element element;
	
	@Registry
	public Map<Connection,ProcessorInfo<?>> registry;
	
	protected Invocable getImplementation() {
		return implementation;
	}
	
	/**
	 * Override to start this processor.
	 * @param progressMonitor
	 */
	protected void doStart(ProgressMonitor progressMonitor) {
		Invocable impl = getImplementation();
		if (impl instanceof Component) {
			((Component) impl).start(progressMonitor);
		}
	}
	
	/**
	 * Starts the processor, e.g. creates listeners for publishers, opens connections etc.
	 * @param progressMonitor
	 */
	@Override
	public void start(ProgressMonitor progressMonitor) {
		doStart(progressMonitor);
		if (childProcessors != null) {
			for (ProcessorInfo<FlowElementProcessor<?>> childProcessorInfo: childProcessors.values()) {
				FlowElementProcessor<?> childProcessor = childProcessorInfo.getProcessor();
				if (childProcessor != null) {
					childProcessor.start(progressMonitor);
				}
			}
		}
	}
	
	@Override
	public void stop(ProgressMonitor progressMonitor) {		
		if (childProcessors != null) {
			for (ProcessorInfo<FlowElementProcessor<?>> childProcessorInfo: childProcessors.values()) {
				FlowElementProcessor<?> childProcessor = childProcessorInfo.getProcessor();
				if (childProcessor != null) {
					childProcessor.stop(progressMonitor); 
				}
			}
		}		
		doStop(progressMonitor);
	}	
	
	/**
	 * Override to stop this processor
	 * @param progressMonitor
	 */
	protected void doStop(ProgressMonitor progressMonitor) {
		Invocable impl = getImplementation();
		if (impl instanceof Component) {
			((Component) impl).stop(progressMonitor);
		}		
	}

	@Override
	public <V> V invoke(Object... args) {
		throw new UnsupportedOperationException(this + " shall not be invoked directly");
	}
	
	@Override
	public void close(ProgressMonitor progressMonitor) {		
		if (childProcessors != null) {
			for (ProcessorInfo<FlowElementProcessor<?>> childProcessorInfo: childProcessors.values()) {
				FlowElementProcessor<?> childProcessor = childProcessorInfo.getProcessor();
				if (childProcessor != null) {
					childProcessor.close(progressMonitor); 
				}
			}
		}		
		doClose(progressMonitor);
	}	
	
	/**
	 * Override to stop this processor
	 * @param progressMonitor
	 */
	protected void doClose(ProgressMonitor progressMonitor) {
		Invocable impl = getImplementation();
		if (impl instanceof Component) {
			((Component) impl).close(progressMonitor);
		}		
	}

	/**
	 * Delegates to the parent or rethrows if there is not parent
	 */
	@Override
	public <V> V handleException(FlowElementProcessor<?> processor, Connection activator, Object[] args, RuntimeException exception) {
		if (parentProcessor != null) {
			return parentProcessor.handleException(processor, activator, args, exception);
		}
		
		throw exception;
	}
		
	public void onException(Instant start, FlowElementProcessor<?> source, Connection activator, Object[] args, RuntimeException e) {
		ExecutionListener el = getExecutionListener();
		if (el != null) {
			el.onInvoke(start, Instant.now(), source, activator, args, null, e);
		}
		if (parentProcessor != null) {
			parentProcessor.onException(start, source, activator, args, e);
		}
	}

	protected <V> V onResult(Instant start, FlowElementProcessor<?> source, Connection activator, Object[] args, V result) {
		ExecutionListener el = getExecutionListener();
		if (el != null) {
			el.onInvoke(start, Instant.now(), source, activator, args, result, null);
		}
		if (parentProcessor != null) {
			parentProcessor.onResult(start, source, activator, args, result);
		}
		
		return result;
	}
	
	public <V> V evaluate(String expr, Map<String, Object> variables, Class<V> resultType) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression(expr);		
            
		StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
		if (variables != null) {
			variables.entrySet().forEach(ve -> evaluationContext.setVariable(ve.getKey(), ve.getValue()));
		}
		return exp.getValue(evaluationContext, this, resultType);
	}	
	
	// publish

}
