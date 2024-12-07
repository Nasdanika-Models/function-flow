package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.Invocable;
import org.nasdanika.graph.processor.IncomingHandler;

public class EndProcessor extends FlowElementProcessor {
	
	private Invocable target;

	public EndProcessor(ProcessorFactory factory, Invocable target) {
		super(factory);
		this.target = target;;
	}
	
	/**
	 * Called by the parent processor if it is present
	 * @param endResolver
	 */
	public void setTarget(Invocable target) {
		this.target = target;
	}	
	
	@IncomingHandler
	public Invocable getIncomingHandler() {
		return target;
	}

}
