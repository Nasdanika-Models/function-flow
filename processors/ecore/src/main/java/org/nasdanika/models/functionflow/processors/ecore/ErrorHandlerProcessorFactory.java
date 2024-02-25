/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.ERROR_HANDLER__ANNOTATIONS)
public class ErrorHandlerProcessorFactory extends FlowElementProcessorFactory {
	
	public ErrorHandlerProcessorFactory(Context context) {
		super(context);
	}
	
} // ErrorHandler
