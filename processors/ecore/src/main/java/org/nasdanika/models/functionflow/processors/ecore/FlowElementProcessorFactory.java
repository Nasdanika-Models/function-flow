/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.FLOW_ELEMENT)
public class FlowElementProcessorFactory  {
	
	private Context context;

	public FlowElementProcessorFactory(Context context) {
		this.context = context;
	}

//	String getImplementation();
//	EList<String> getErrors();

} // FlowElement
