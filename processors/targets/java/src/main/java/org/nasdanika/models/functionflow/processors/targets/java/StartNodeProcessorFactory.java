package org.nasdanika.models.functionflow.processors.targets.java;

import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.model.util.NodeProcessorFactory;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.function.BiFunctionProcessorFactory.NodeProcessor;
import org.nasdanika.models.functionflow.FunctionFlow;
import org.nasdanika.models.functionflow.Start;

/**
 * Creates node processor for {@link Start}
 */
public class StartNodeProcessorFactory implements NodeProcessorFactory {

	@Override
	public boolean canHandle(EObject node) {
		return node instanceof Start;
	}

	@Override
	public NodeProcessor<Object, Object, Object, Object> createProcessor(
			ProcessorConfig config,
			BiConsumer<Element, BiConsumer<ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>>, ProgressMonitor>> infoProvider,
			Consumer<CompletionStage<?>> endpointWiringStageConsumer,
			Map<Connection, BiFunction<Object, ProgressMonitor, Object>> incomingEndpoints,
			Map<Connection, BiFunction<Object, ProgressMonitor, Object>> outgoingEndpoints, Context context,
			ProgressMonitor progressMonitor) {
		
		/* Pass to outgoing if condition matches, return true if so.
		 * SpEL conditions  
		 */
		return new NodeProcessor<Object, Object, Object, Object>() {

			@Override
			public Object apply(Object input, ProgressMonitor pm) {
				// Call starts
				return null;
			}

			@Override
			public Object applyIncoming(Connection connection, Object input, ProgressMonitor progressMonitor) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object applyOutgoing(Connection connection, Object input, ProgressMonitor progressMonitor) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}
			
	
}
