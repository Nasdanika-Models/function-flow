/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SOURCE_FUNCTION)
public class SourceFunctionProcessorFactory extends FunctionProcessorFactory {

	public SourceFunctionProcessorFactory(Context context) {
		super(context);
	}
	
} // SourceFunction
