/**
 */
package org.nasdanika.models.functionflow;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.graph.model.adapters.ConnectionAdapter;
import org.nasdanika.graph.model.adapters.ElementAdapter;
import org.nasdanika.graph.model.adapters.GraphAdapterFactory;
import org.nasdanika.graph.model.adapters.NodeAdapter;
import org.nasdanika.graph.model.util.ReflectiveProcessorFactory;
import org.nasdanika.graph.processor.NopEndpointProcessorConfigFactory;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.function.BiFunctionProcessorFactory;
import org.nasdanika.graph.processor.function.ReflectiveBiFunctionProcessorFactoryProvider;
import org.nasdanika.models.architecture.Domain;
import org.nasdanika.ncore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends FlowElement, Domain {
		
	
} // Flow
