/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.TRANSITION)
public class TransitionProcessorFactory extends FlowElementProcessorFactory {
	
	public TransitionProcessorFactory(Context context) {
		super(context);
	}

//	String getInput();
//	String getOutput();
//	String getCondition();
//	int getOrder();

} // Transition
