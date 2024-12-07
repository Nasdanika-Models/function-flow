package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.Invocable;
import org.nasdanika.graph.processor.IncomingHandler;
import org.nasdanika.models.functionflow.End;

public class EndProcessor extends FlowElementProcessor<End> {
	
	private Invocable target;

	public EndProcessor(ProcessorFactory factory, End end, Invocable target) {
		super(factory, end);
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
