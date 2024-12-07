package org.nasdanika.models.functionflow.processors.runtime;

import java.util.Map;

import org.nasdanika.common.Component;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.processor.ChildProcessors;
import org.nasdanika.graph.processor.ParentProcessor;
import org.nasdanika.graph.processor.ProcessorElement;
import org.nasdanika.graph.processor.ProcessorInfo;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class FlowElementProcessor implements Invocable, Component {
	
	protected ProcessorFactory factory;

	protected FlowElementProcessor(ProcessorFactory factory) {
		this.factory = factory;
	}
	
	@ParentProcessor
	public FlowElementProcessor parentProcessor;
	
	@ChildProcessors
	public Map<org.nasdanika.graph.Element, ProcessorInfo<FlowElementProcessor>> childProcessors;	
	
	@ProcessorElement
	public Element element;
	
	protected Invocable getImplementation() {
		return null;
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
			for (ProcessorInfo<FlowElementProcessor> childProcessorInfo: childProcessors.values()) {
				FlowElementProcessor childProcessor = childProcessorInfo.getProcessor();
				if (childProcessor != null) {
					childProcessor.start(progressMonitor);
				}
			}
		}
	}
	
	@Override
	public void stop(ProgressMonitor progressMonitor) {		
		if (childProcessors != null) {
			for (ProcessorInfo<FlowElementProcessor> childProcessorInfo: childProcessors.values()) {
				FlowElementProcessor childProcessor = childProcessorInfo.getProcessor();
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
	public <T> T invoke(Object... args) {
		throw new UnsupportedOperationException(this + " shall not be invoked directly");
	}	

}
