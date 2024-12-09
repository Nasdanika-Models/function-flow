package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.IncomingHandler;
import org.nasdanika.models.functionflow.End;

public class EndProcessor extends FlowElementProcessor<End> {
	
	private Invocable target;

	public EndProcessor(ProcessorFactory factory, End end, ProgressMonitor progressMonitor) {
		super(factory, end, progressMonitor);
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
		return this::sourceInvoke;
	}
	
	/**
	 * Invocation by the source
	 * @param <T>
	 * @param args
	 * @return
	 */
	protected <V> V sourceInvoke(Object... args) {
		return target == null ? null : target.invoke(args);
	}	

}
