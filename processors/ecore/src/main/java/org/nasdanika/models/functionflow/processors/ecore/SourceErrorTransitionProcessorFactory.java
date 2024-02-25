/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SOURCE_ERROR_TRANSITION)
public class SourceErrorTransitionProcessorFactory extends ErrorTransitionProcessorFactory {
	
	public SourceErrorTransitionProcessorFactory(Context context) {
		super(context);
	}
	
} // SourceErrorTransition
