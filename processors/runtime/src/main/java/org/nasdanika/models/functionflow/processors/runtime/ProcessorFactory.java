package org.nasdanika.models.functionflow.processors.runtime;

import java.util.function.BiConsumer;
import java.util.function.Function;

import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.Node;
import org.nasdanika.graph.model.adapters.NodeAdapter;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.Processor;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.End;

/**
 * Reflective target to create {@link Invocable} processors.
 */
public class ProcessorFactory {
	
	private CapabilityLoader capabilityLoader;
	private Function<End, Invocable> endResolver;

	public ProcessorFactory(CapabilityLoader capabilityLoader, Function<End,Invocable> endResolver) {
		this.capabilityLoader = capabilityLoader;
		this.endResolver = endResolver;
	}
	
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.FunctionFlow)")
	public Object createFunctionFlowProcessor(
		NodeProcessorConfig<?,?> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
		Function<ProgressMonitor, Object> next,		
		ProgressMonitor progressMonitor) {
		
		return new FunctionFlowProcessor();
	}
	
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Start)")
	public Object createStartProcessor(
		NodeProcessorConfig<?,?> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
		Function<ProgressMonitor, Object> next,		
		ProgressMonitor progressMonitor) {
		
		return new StartProcessor();
	}
	
	
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.End)")
	public Object createEndProcessor(
		NodeProcessorConfig<?,?> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
		Function<ProgressMonitor, Object> next,		
		ProgressMonitor progressMonitor) {
		
		NodeAdapter element = (NodeAdapter) config.getElement();
		return new EndProcessor(endResolver == null ? null : endResolver.apply((End) element.get()));
	}

}
