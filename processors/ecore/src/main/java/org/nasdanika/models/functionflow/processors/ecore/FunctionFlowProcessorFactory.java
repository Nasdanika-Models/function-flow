/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;


@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.FUNCTION_FLOW)
public class FunctionFlowProcessorFactory  {
	
	private Context context;

	public FunctionFlowProcessorFactory(Context context) {
		this.context = context;
	}
	
} // FunctionFlow
