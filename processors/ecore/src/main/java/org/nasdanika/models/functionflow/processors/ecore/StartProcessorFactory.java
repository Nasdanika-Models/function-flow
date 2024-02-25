/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.START)
public class StartProcessorFactory {
	
	private Context context;

	public StartProcessorFactory(Context context) {
		this.context = context;
	}
	
	// condition, order, output
	
} // Start
