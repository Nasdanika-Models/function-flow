/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.CONSUMER)
public class ConsumerProcessorFactory extends FlowElementProcessorFactory {

	public ConsumerProcessorFactory(Context context) {
		super(context);
	}

//	String getInput();

} // Consumer
