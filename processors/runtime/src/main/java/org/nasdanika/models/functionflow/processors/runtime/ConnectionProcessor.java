package org.nasdanika.models.functionflow.processors.runtime;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.SourceHandler;
import org.nasdanika.graph.processor.TargetEndpoint;

/**
 * Base class for processors - wiring, gstart, invoke, close
 */
public class ConnectionProcessor<T extends EObject> extends FlowElementProcessor<T> {
	
	public ConnectionProcessor(ProcessorFactory factory, T modelElement, ProgressMonitor progressMonitor) {
		super(factory, modelElement, progressMonitor);
	}
	
	public boolean isAsync() {
		return false;
	}

	@SourceHandler
	public Invocable getSourceHandler() {
		Invocable invocable = getImplementation();
		if (invocable == null) {
			invocable = this::sourceInvoke;
		}
		return isAsync() ? invocable.asAsync() : invocable;
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
	public final void setTargetEndpoint(Invocable targetEndpoint) {
		this.targetEndpoint = targetEndpoint;
	}
	
	public Invocable getTargetEndpoint() {
		return targetEndpoint;
	}

}
