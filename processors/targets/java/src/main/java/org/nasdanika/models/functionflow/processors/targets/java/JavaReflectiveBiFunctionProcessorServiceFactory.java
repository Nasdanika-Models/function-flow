package org.nasdanika.models.functionflow.processors.targets.java;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.processor.CapabilityProcessorFactory.ProcessorRequirement;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.ReflectiveProcessorServiceFactory;
import org.nasdanika.models.functionflow.Start;

public class JavaReflectiveBiFunctionProcessorServiceFactory extends ReflectiveProcessorServiceFactory<Object, BiFunction<Object, ProgressMonitor, Object>> {
	
	public class Factory {
		
		@ProcessorFactory(
			valueType = Start.class,	
			handlerType = BiFunction.class,
			endpointType = BiFunction.class)
		public BiFunction<Object, ProgressMonitor, Object> createStartNodeProcessor(
			NodeProcessorConfig<BiFunction<Object, ProgressMonitor, Object>, BiFunction<Object, ProgressMonitor, Object>> config, 
			BiConsumer<Element, BiConsumer<ProcessorInfo<BiFunction<Object, ProgressMonitor, Object>>, ProgressMonitor>> infoProvider,
			Consumer<CompletionStage<?>> endpointWiringStageConsumer, 
			Class<?> processorType,
			Class<?> handlerType,
			Class<?> endpointType,
		 	Object requirement,
			ProgressMonitor progressMonitor) {
			
			return null;
		}
		
	}

	@Override
	protected Iterable<CompletionStage<Object>> loadTargets(
			Class<BiFunction<Object, ProgressMonitor, Object>> processorType,
			ProcessorRequirement<Object, BiFunction<Object, ProgressMonitor, Object>> serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		return Collections.singleton(CompletableFuture.completedStage(new Factory())); 
	}

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return type == BiFunction.class;
	}

}
