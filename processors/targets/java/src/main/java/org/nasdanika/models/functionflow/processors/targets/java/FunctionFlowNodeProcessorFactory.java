package org.nasdanika.models.functionflow.processors.targets.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.model.util.NodeProcessorFactory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.function.BiFunctionProcessorFactory.NodeProcessor;
import org.nasdanika.models.functionflow.End;
import org.nasdanika.models.functionflow.FunctionFlow;
import org.nasdanika.models.functionflow.Start;

/**
 * Creates node processor for {@link FunctionFlow}
 */
public class FunctionFlowNodeProcessorFactory extends NodeProcessorFactory {

	@Override
	public boolean isForModelElement(EObject node) {
		return node instanceof FunctionFlow;
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodeProcessor<Object, Object, Object, Object> createProcessor(
			NodeProcessorConfig<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>> config,
			BiConsumer<Element, BiConsumer<ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>>, ProgressMonitor>> infoProvider,
			Consumer<CompletionStage<?>> endpointWiringStageConsumer,
			Map<Connection, BiFunction<Object, ProgressMonitor, Object>> incomingEndpoints,
			Map<Connection, BiFunction<Object, ProgressMonitor, Object>> outgoingEndpoints, 
			Context context,
			ProgressMonitor progressMonitor) {
		
		List<BiFunction<Object, ProgressMonitor, Object>> starts = Collections.synchronizedList(new ArrayList<>());
		config
				.getChildProcessorConfigs()
				.entrySet()
				.stream()
				.filter(e -> ((Supplier<EObject>) e.getKey()).get() instanceof Start)
				.sorted((a,b) -> ((Start) ((Supplier<EObject>) a.getKey()).get()).getOrder() - ((Start) ((Supplier<EObject>) b.getKey()).get()).getOrder())
				.map(Map.Entry::getValue)
				.map(ProcessorConfig::getElement)
				.forEach(startElement -> infoProvider.accept(startElement, (pi, pm) -> starts.add(pi.getProcessor())));
				
		List<BiFunction<Object, ProgressMonitor, Object>> ends = Collections.synchronizedList(new ArrayList<>());
		config
				.getChildProcessorConfigs()
				.entrySet()
				.stream()
				.filter(e -> ((Supplier<EObject>) e.getKey()).get() instanceof End)
				.map(Map.Entry::getValue)
				.map(ProcessorConfig::getElement)
				.forEach(endElement -> infoProvider.accept(endElement, (pi, pm) -> ends.add(pi.getProcessor())));
		
		// Wire incoming endpoints to starts and outgoing to ends 
		return new NodeProcessor<Object, Object, Object, Object>() {

			@Override
			public Object apply(Object input, ProgressMonitor pm) {				
				// Call starts
				for (BiFunction<Object, ProgressMonitor, Object> start: starts) {
					if (Boolean.TRUE.equals(start.apply(input, progressMonitor))) {
						break;
					}
				}

				for (BiFunction<Object, ProgressMonitor, Object> end: ends) {
					Optional<Object> result = (Optional<Object>) end.apply(input, progressMonitor);
					if (result != null) {
						return result.orElse(null);
					}
				}
				
				return null;
			}

			@Override
			public Object applyIncoming(Connection connection, Object input, ProgressMonitor progressMonitor) {
				// TODO - pass to starts
				return null;
			}

			@Override
			public Object applyOutgoing(Connection connection, Object input, ProgressMonitor progressMonitor) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

	@Override
	protected boolean canHandleRequirement(Object requirement) {
		return requirement == null; // Default behavior - synchronous execution
	}
	
}
