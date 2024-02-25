/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;


@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.FUNCTION)
public class FunctionProcessorFactory {
	
	private Context context;

	public FunctionProcessorFactory(Context context) {
		this.context = context;
	}
	
} // Function
