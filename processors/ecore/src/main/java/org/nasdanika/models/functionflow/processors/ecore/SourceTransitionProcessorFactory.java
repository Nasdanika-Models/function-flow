/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SOURCE_TRANSITION)
public class SourceTransitionProcessorFactory extends TransitionProcessorFactory {
	
	public SourceTransitionProcessorFactory(Context context) {
		super(context);
	}
	
} // SourceTransition
