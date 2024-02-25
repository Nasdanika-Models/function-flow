/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SOURCE_SUPPLIER)
public class SourceSupplierProcessorFactory extends SupplierProcessorFactory {
	
	public SourceSupplierProcessorFactory(Context context) {
		super(context);
	}
	
} // SourceSupplier
