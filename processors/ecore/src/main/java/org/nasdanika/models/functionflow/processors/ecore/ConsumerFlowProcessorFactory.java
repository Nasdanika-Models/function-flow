/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.architecture.CompositeRelationshipTarget;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.CONSUMER_FLOW)
public class ConsumerFlowProcessorFactory extends FlowProcessorFactory {
	
	public ConsumerFlowProcessorFactory(Context context) {
		super(context);
	}
	
} // ConsumerFlow
