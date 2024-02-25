/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SOURCE_CONSUMER)
public class SourceConsumerProcessorFactory extends ConsumerProcessorFactory {
	
	public SourceConsumerProcessorFactory(Context context) {
		super(context);
	}
	
} // SourceConsumer
