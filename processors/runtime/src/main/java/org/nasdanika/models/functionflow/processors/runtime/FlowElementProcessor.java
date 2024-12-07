package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;

/**
 * Interface implemented by all processors - start, invoke, close
 */
public interface FlowElementProcessor extends Invocable, AutoCloseable {
	
	/**
	 * Starts the processor, e.g. creates listeners for publishers, opens connections etc.
	 * @param progressMonitor
	 */
	default void start(ProgressMonitor progressMonitor) {
		
	}
	
	@Override
	default void close() throws Exception {		
		
	}

}
