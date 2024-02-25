/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.architecture.Domain;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.FLOW)
public class FlowProcessorFactory extends FlowElementProcessorFactory {
	
	public FlowProcessorFactory(Context context) {
		super(context);
	}
	
} // Flow
