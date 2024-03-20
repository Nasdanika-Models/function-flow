package org.nasdanika.models.functionflow.processors.targets.java;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.model.adapters.NodeAdapter;
import org.nasdanika.graph.model.util.NodeProcessorFactory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.function.BiFunctionProcessorFactory.NodeProcessor;
import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.Start;

/**
 * Creates node processor for {@link Start}
 */
public class StartNodeProcessorFactory extends NodeProcessorFactory {

	@Override
	public boolean isForModelElement(EObject node) {
		return node instanceof Start;
	}

	@Override
	public NodeProcessor<Object, Object, Object, Object> createProcessor(
			NodeProcessorConfig<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>> config,
			BiConsumer<Element, BiConsumer<ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>>, ProgressMonitor>> infoProvider,
			Consumer<CompletionStage<?>> endpointWiringStageConsumer,
			Map<Connection, BiFunction<Object, ProgressMonitor, Object>> incomingEndpoints,
			Map<Connection, BiFunction<Object, ProgressMonitor, Object>> outgoingEndpoints, 
			Context context,
			ProgressMonitor progressMonitor) {
						
		/* Pass to outgoing if condition matches, return true if so.
		 * SpEL conditions  
		 */
		return new NodeProcessor<Object, Object, Object, Object>() {

			/**
			 * This method is called by the containing flow and shall return true if condition matched (or was blank) and this start was activated
			 */
			@SuppressWarnings("unchecked")
			@Override
			public Object apply(Object input, ProgressMonitor pm) {
				Start start = (Start) ((NodeAdapter) config.getElement()).get();
				if (!Util.isBlank(start.getCondition())) {
					// TODO Match, return false if no match 
					throw new UnsupportedOperationException("Conditions are not yet supported. TODO - SpEL evaluator");
				}

				List<BiFunction<Object, ProgressMonitor, Object>> outgoingTransitions = outgoingEndpoints
					.entrySet()
					.stream()
					.filter(e -> ((Supplier<EObject>) e.getKey()).get().eClass() == FunctionFlowPackage.Literals.TRANSITION) // Exact type match - calls and error transitions are ignored
					.sorted((a,b) -> ((Start) ((Supplier<EObject>) a.getKey()).get()).getOrder() - ((Start) ((Supplier<EObject>) b.getKey()).get()).getOrder())
					.map(Map.Entry::getValue)
					.toList();
				
				for (BiFunction<Object, ProgressMonitor, Object> outgoingTransition: outgoingTransitions) {
					if (Boolean.TRUE.equals(outgoingTransition.apply(input, progressMonitor))) {
						break;
					}
				}
				
				return true;
			}

			@Override
			public Object applyIncoming(Connection connection, Object input, ProgressMonitor progressMonitor) {
				throw new UnsupportedOperationException("Start shall not have any incoming connections");
			}

			@Override
			public Object applyOutgoing(Connection connection, Object input, ProgressMonitor progressMonitor) {
				throw new UnsupportedOperationException("Start outgoing connections are unidirectional, downstream nodes shall not call start nodes");
			}
			
		};
	}			

	@Override
	protected boolean canHandleRequirement(Object requirement) {
		return requirement == null; // Default behavior - synchronous execution
	}
	
}
