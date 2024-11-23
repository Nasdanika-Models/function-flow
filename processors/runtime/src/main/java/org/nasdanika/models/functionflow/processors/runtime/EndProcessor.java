package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.Invocable;
import org.nasdanika.graph.processor.IncomingHandler;

public class EndProcessor implements Invocable {
	
	private Invocable target;

	public EndProcessor(Invocable target) {
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

	@Override
	public <T> T invoke(Object... args) {
		throw new UnsupportedOperationException("End shall not be invoked directly");
	}

}
