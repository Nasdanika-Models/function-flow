package org.nasdanika.models.functionflow.processors.runtime;

import java.util.Map;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.Connection;
import org.nasdanika.models.functionflow.Transition;
import org.springframework.expression.ExpressionException;

public class TransitionProcessor<T extends Transition> extends ConnectionProcessor<T> {
	
	public TransitionProcessor(ProcessorFactory factory, T transition, ProgressMonitor progressMonitor) {
		super(factory, transition, progressMonitor);
	}

	@Override
	public boolean isAsync() {
		return true;
	}
	
	public boolean isCall() {
		return false;
	}
	
	
	public boolean matchResult(Connection activator, Object[] args, Object[] results) {
		String condition = getModelElement().getCondition();
		if (Util.isBlank(condition)) {
			return true;
		}
		try {
			return evaluate(
					condition, 
					Map.of(
						"activator", activator, 
						"args", args, 
						"results", results), 
					Boolean.class); 
		} catch (ExpressionException e) {			
			return false;
		}
	}
	
	public boolean isContinue() {
		return false;
	}
	
}
