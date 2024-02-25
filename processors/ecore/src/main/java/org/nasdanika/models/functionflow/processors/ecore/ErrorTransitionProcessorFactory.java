/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.ERROR_TRANSITION)
public class ErrorTransitionProcessorFactory extends TransitionProcessorFactory {
	
	public ErrorTransitionProcessorFactory(Context context) {
		super(context);
	}
	
} // ErrorTransition
