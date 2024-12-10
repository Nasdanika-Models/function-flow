package org.nasdanika.models.functionflow.processors.runtime;

import java.time.Instant;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
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
	public Invocable getIncomingHandler(Connection connection) {
		return new Invocable() {

			@Override
			public <T> T invoke(Object... args) {
				Instant start = Instant.now();
				try {
					return onResult(start, EndProcessor.this,  connection, args, target == null ? null : target.invoke(args));
				} catch (RuntimeException e) {
					onException(start, EndProcessor.this, connection, args, e);
					return handleException(EndProcessor.this, connection, args, e);
				}
			}
			
		};
	}		

}
