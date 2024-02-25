/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SOURCE)
public class SourceProcessorFactory extends FlowElementProcessorFactory {

	public SourceProcessorFactory(Context context) {
		super(context);
	}
		
//	String getSource();
	
} // Source
