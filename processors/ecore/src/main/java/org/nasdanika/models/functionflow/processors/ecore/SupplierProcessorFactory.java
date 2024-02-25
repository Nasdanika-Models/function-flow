/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SUPPLIER)
public class SupplierProcessorFactory extends FlowElementProcessorFactory {
	
	public SupplierProcessorFactory(Context context) {
		super(context);
	}

//	String getOutput();

} // Supplier
