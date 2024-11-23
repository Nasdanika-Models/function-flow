package org.nasdanika.models.functionflow.processors.runtime;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.CapabilityProcessorFactory.ProcessorRequirement;
import org.nasdanika.graph.processor.ReflectiveProcessorServiceFactory.ReflectiveProcessorFactoryProviderTargetRequirement;
import org.nasdanika.models.functionflow.End;

public class ProcessorCapabilityFactory implements CapabilityFactory<ReflectiveProcessorFactoryProviderTargetRequirement<Function<End,Invocable>, Invocable>, Object> {

	@Override
	public boolean canHandle(Object requirement) {
		if (requirement instanceof ReflectiveProcessorFactoryProviderTargetRequirement) {
			ReflectiveProcessorFactoryProviderTargetRequirement<?,?> targetRequirement = (ReflectiveProcessorFactoryProviderTargetRequirement<?,?>) requirement;
			if (targetRequirement.processorType() == Invocable.class) { 
				ProcessorRequirement<?, ?> processorRequiremment = targetRequirement.processorRequirement();
				if (processorRequiremment.handlerType() == Invocable.class && processorRequiremment.endpointType() == Invocable.class) {
					Object req = processorRequiremment.requirement();
					return req == null || req instanceof Function; 
				}
			}
		}
		return false;
	}
	
	@Override
	public CompletionStage<Iterable<CapabilityProvider<Object>>> create(
			ReflectiveProcessorFactoryProviderTargetRequirement<Function<End, Invocable>, Invocable> requirement,
			Loader loader, 
			ProgressMonitor progressMonitor) {
		
		ProcessorRequirement<Function<End, Invocable>, Invocable> processorRequirement = requirement.processorRequirement();
		ProcessorFactory processorFactory = new ProcessorFactory(loader.getCapabilityLoader(), processorRequirement.requirement());
		return CompletableFuture.completedStage(Collections.singleton(CapabilityProvider.of(processorFactory)));	
	}

}
