package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.graph.Connection;

public interface ExceptionHandler {
	
	/**
	 * Handles exception. May rethrow or return a value to be used as a result.
	 * @param <T>
	 * @param processor
	 * @param Activator for nodes, null for connections
	 * @param args
	 * @param exception
	 * @return
	 */
	<T> T handleException(FlowElementProcessor<?> processor, Connection activator, Object[] args, RuntimeException exception);

}
