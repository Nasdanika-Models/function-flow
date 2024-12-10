package org.nasdanika.models.functionflow.processors.runtime;

import java.time.Instant;

import org.nasdanika.graph.Connection;

public interface ExecutionListener {
	
	void onInvoke(
			Instant start, 
			Instant end,
			FlowElementProcessor<?> processor, 
			Connection activator, 
			Object[] args, 
			Object result,
			RuntimeException exception);

}
