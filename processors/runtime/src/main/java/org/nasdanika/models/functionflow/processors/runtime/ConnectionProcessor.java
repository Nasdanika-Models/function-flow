package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.common.Invocable;
import org.nasdanika.graph.processor.SourceHandler;
import org.nasdanika.graph.processor.TargetEndpoint;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class ConnectionProcessor extends FlowElementProcessor {
	
	public ConnectionProcessor(ProcessorFactory factory) {
		super(factory);
	}

	@SourceHandler
	public Invocable getSourceHandler() {
		Invocable invocable = this::sourceInvoke;
		return invocable.asAsync();
	}
	
	/**
	 * Invocation by the source
	 * @param <T>
	 * @param args
	 * @return
	 */
	protected <T> T sourceInvoke(Object... args) {
		if (targetEndpoint == null) {
			throw new IllegalStateException("Target endpoint is not set");
		}
		return targetEndpoint.invoke(args);
	}	
	
	protected Invocable targetEndpoint; 	
	
	@TargetEndpoint
	public void setTargetEndpoint(Invocable targetEndpoint) {
		this.targetEndpoint = targetEndpoint;
	}

}
