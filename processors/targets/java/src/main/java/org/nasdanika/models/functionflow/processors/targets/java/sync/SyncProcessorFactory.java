package org.nasdanika.models.functionflow.processors.targets.java.sync;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.model.adapters.NodeAdapter;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.Processor;
import org.nasdanika.graph.processor.ProcessorInfo;

/**
 * Reflective target to create synchronous {@link BiFunction} processors.
 */
public class SyncProcessorFactory {
	
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Start)")
	public Object createStartProcessor(
		NodeProcessorConfig<?,?> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
		ProgressMonitor progressMonitor) {
		
		return null;
	}
	
	
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.End)")
	public Object createEndProcessor(
		NodeProcessorConfig<?,?> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
		ProgressMonitor progressMonitor) {
		
		return null;
	}
	
	
	// TODO - factory methods

}
