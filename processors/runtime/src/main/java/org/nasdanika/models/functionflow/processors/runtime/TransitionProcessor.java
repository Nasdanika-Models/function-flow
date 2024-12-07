package org.nasdanika.models.functionflow.processors.runtime;

import org.nasdanika.models.functionflow.Transition;

public class TransitionProcessor<T extends Transition> extends ConnectionProcessor<T> {
	
	public TransitionProcessor(ProcessorFactory factory, T transition) {
		super(factory, transition);
	}

}
