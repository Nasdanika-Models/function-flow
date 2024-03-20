/**
 */
package org.nasdanika.models.functionflow;

import java.util.function.BiFunction;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorInfo;
import org.nasdanika.models.architecture.CompositeNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getFunctionFlow()
 * @model
 * @generated
 */
public interface FunctionFlow extends Function, CompositeNode, SupplierFlow, ConsumerFlow {
	
	/**
	 * Creates a process, invokes starts, returns result produced by ends.
	 * @param context
	 * @param progressMonitor
	 * @return
	 */
	default BiFunction<Object, ProgressMonitor, Object> createFunction(
			Object requirement,
			Context context,
			ProgressMonitor progressMonitor) {
		
		NodeProcessorInfo<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>> processorInfo = (NodeProcessorInfo<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>>) createProcessor(requirement, context, progressMonitor);
		BiFunction<Object, ProgressMonitor, Object> processor = processorInfo.getProcessor();
		return new BiFunction<Object, ProgressMonitor, Object>() {
			
			@Override
			public Object apply(Object input, ProgressMonitor pm) {
				// Ignoring input configuration - for documentation purposes
				return processor.apply(input, pm); // Ignoring result
			}
		};
	}
	
} // FunctionFlow
