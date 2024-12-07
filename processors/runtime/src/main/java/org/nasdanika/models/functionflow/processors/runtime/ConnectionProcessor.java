package org.nasdanika.models.functionflow.processors.runtime;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Invocable;
import org.nasdanika.graph.processor.SourceHandler;
import org.nasdanika.graph.processor.TargetEndpoint;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class ConnectionProcessor<T extends EObject> extends FlowElementProcessor<T> {
	
	public ConnectionProcessor(ProcessorFactory factory, T modelElement) {
		super(factory, modelElement);
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
	protected <V> V sourceInvoke(Object... args) {
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
