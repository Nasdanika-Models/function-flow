package org.nasdanika.models.functionflow.processors.targets.java;

import java.util.Map;
import java.util.Optional;
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
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.function.BiFunctionProcessorFactory.NodeProcessor;
import org.nasdanika.models.functionflow.End;
import org.nasdanika.models.functionflow.Start;


/**
 * Creates node processor for {@link Start}
 */
public class EndNodeProcessorFactory extends NodeProcessorFactory {

	@Override
	protected boolean isForModelElement(EObject eObj) {
		return eObj instanceof End;
	}

	protected NodeProcessor<Object, Object, Object, Object> createProcessor(
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
			
			// Result holder. Set by applyIncoming(), collected by apply
			private ThreadLocal<Optional<Object>> result = new ThreadLocal<>();  

			/**
			 * Collects result
			 */
			@Override
			public Object apply(Object input, ProgressMonitor pm) {
				Optional<Object> rOpt = result.get();
				result.set(null); // Clear once collected
				return rOpt;
			}

			@Override
			public Object applyIncoming(Connection connection, Object input, ProgressMonitor progressMonitor) {
				result.set(input == null ? Optional.empty() : Optional.of(input));
				return true;
			}

			@Override
			public Object applyOutgoing(Connection connection, Object input, ProgressMonitor progressMonitor) {
				throw new UnsupportedOperationException("End shall not have outgoing connections calling it");
			}
			
		};
	}

	@Override
	protected boolean canHandleRequirement(Object requirement) {
		return requirement == null; // Default behavior - synchronous execution
	}
				
}
