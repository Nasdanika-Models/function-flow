package org.nasdanika.models.functionflow.processors.targets.java;

import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.model.util.ConnectionProcessorFactory;
import org.nasdanika.graph.processor.ConnectionProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.function.BiFunctionProcessorFactory.ConnectionProcessor;
import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.Transition;

/**
 * Creates a simple pass-through connection if implementation is blank
 */
public class TransitionConnectionProcessorFactory extends ConnectionProcessorFactory {

	@Override
	public boolean isForModelElement(EObject connection) {
		return connection != null && connection.eClass() == FunctionFlowPackage.Literals.TRANSITION;
	}

	@Override
	public ConnectionProcessor<Object, Object, Object, Object> createProcessor(
			ConnectionProcessorConfig<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>> config,
			BiConsumer<Element, BiConsumer<ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>>, ProgressMonitor>> infoProvider,
			Consumer<CompletionStage<?>> endpointWiringStageConsumer, 
			Context context,
			ProgressMonitor progressMonitor) {
		
		return new ConnectionProcessor<Object, Object, Object, Object>() {

			@Override
			public Object apply(Object input, ProgressMonitor pm) {
				throw new UnsupportedOperationException("Transitions are only activated by their sources");
			}

			@Override
			public Object targetApply(Object input, ProgressMonitor progressMonitor, BiFunction<Object, ProgressMonitor, Object> sourceEndpoint) {
				throw new UnsupportedOperationException("Transitions are only activated by their sources");
			}

			@Override
			public Object sourceApply(Object input, ProgressMonitor progressMonitor, BiFunction<Object, ProgressMonitor, Object> targetEndpoint) {
				Transition transition = (Transition) ((Supplier<?>) config.getElement()).get();
				if (!Util.isBlank(transition.getCondition())) {
					// TODO Match, return false if no match 
					throw new UnsupportedOperationException("Conditions are not yet supported. TODO - SpEL evaluator");
				}
				
				targetEndpoint.apply(input, progressMonitor);
				return true;
			}
			
		};
	}

	@Override
	protected boolean canHandleRequirement(Object requirement) {
		return requirement == null; // Default behavior - synchronous execution
	}

}
