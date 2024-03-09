/**
 */
package org.nasdanika.models.functionflow;

import java.util.function.BiFunction;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.ProcessorInfo;
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
	 * Creates a process, wires endFunction to ends, and returns function wired to starts.
	 * @param endFunction
	 * @param context
	 * @param progressMonitor
	 * @return
	 */
	default BiFunction<Object, ProgressMonitor, Object> createProcessor(
			BiFunction<Object, ProgressMonitor, Object> endFunction,
			Context context,
			ProgressMonitor progressMonitor) {
		
		ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>> processorInfo = createProcessor(context, progressMonitor);
		// TODO - wire ends to the end function, return a function wired to starts.
		throw new UnsupportedOperationException();
	}
	
} // FunctionFlow
