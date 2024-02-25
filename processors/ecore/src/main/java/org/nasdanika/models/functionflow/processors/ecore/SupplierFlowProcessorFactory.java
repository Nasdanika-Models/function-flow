/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.architecture.CompositeRelationshipSource;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SUPPLIER_FLOW)
public class SupplierFlowProcessorFactory extends FlowProcessorFactory {
	
	public SupplierFlowProcessorFactory(Context context) {
		super(context);
	}

} // SupplierFlow
