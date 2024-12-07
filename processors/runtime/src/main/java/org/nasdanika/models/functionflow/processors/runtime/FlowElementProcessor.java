package org.nasdanika.models.functionflow.processors.runtime;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.Component;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.processor.ChildProcessors;
import org.nasdanika.graph.processor.ParentProcessor;
import org.nasdanika.graph.processor.ProcessorElement;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.FlowElement;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class FlowElementProcessor<T extends EObject> implements Invocable, Component {
	
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

}
