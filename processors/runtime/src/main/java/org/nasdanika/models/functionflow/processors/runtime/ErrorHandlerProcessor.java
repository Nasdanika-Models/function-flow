package org.nasdanika.models.functionflow.processors.runtime;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.Connection;
import org.nasdanika.models.functionflow.ErrorHandler;

public class ErrorHandlerProcessor extends NodeProcessor<ErrorHandler> {

	public ErrorHandlerProcessor(ProcessorFactory factory, ErrorHandler errorHandler, ProgressMonitor progressMonitor) {
		super(factory, errorHandler, progressMonitor);
	}
	
	@Override
	public <V> V invoke(Object... args) {
		return incomingInvoke(null, args);
	}

	public int distance(RuntimeException exception) {
		EList<String> errors = getModelElement().getErrors();
		
		int distance = Integer.MAX_VALUE;		
		for (Entry<Class<?>, Integer> ee: Util.lineageMap(exception.getClass()).entrySet()) {
			String ecName = ee.getKey().getName();
			for (String error: errors) {
				if (ecName.equals(error) || ecName.endsWith("." + error)) {
					distance = Math.min(distance, ee.getValue());
				}
			}
		}
		
		return distance;
	}
	
	public boolean match(FlowElementProcessor<?> processor, Connection activator, Object[] args, RuntimeException exception) {
		EList<String> errors = getModelElement().getErrors();
		if (errors.isEmpty()) {
			return true;
		}
		for (Class<?> ec: Util.lineageMap(exception.getClass()).keySet()) {
			String ecName = ec.getName();
			for (String error: errors) {
				if (ecName.equals(error) || ecName.endsWith("." + error)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
