package org.nasdanika.models.functionflow.processors.runtime;

import java.util.function.BiConsumer;
import java.util.function.Function;

import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.Node;
import org.nasdanika.graph.model.adapters.NodeAdapter;
import org.nasdanika.graph.processor.ConnectionProcessorConfig;
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
			priority = 2,
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
	
	
	// -----
	
	
	@Processor(
			type = NodeAdapter.class,
			priority = 1,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Call)")
	public Object createCallProcessor(
			ConnectionProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Consumer)")
	public Object createConsumerProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1,
			value = "get() instanceof T(org.nasdanika.models.functionflow.ConsumerFlow)")
	public Object createConsumerFlowProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.ErrorHandler)")
	public Object createErrorHandlerProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.ErrorTransition)")
	public Object createErrorTransitionProcessor(
			ConnectionProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Flow)")
	public Object createFlowProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.Function)")
	public Object createFunctionProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
				
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 			
			value = "get() instanceof T(org.nasdanika.models.functionflow.Publisher)")
	public Object createPublisherProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 2, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SourceCall)")
	public Object createSourceCallProcessor(
			ConnectionProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SourceConsumer)")
	public Object createSourceConsumerProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SourceErrorHandler)")
	public Object createSourceErrorHandlerProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 2, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SourceErrorTransition)")
	public Object createSourceErrorTransitionProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 2, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SourceFunction)")
	public Object createSourceFunctionProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SourceSupplier)")
	public Object createSourceSupplierProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SourceTransition)")
	public Object createSourceTransitionProcessor(
			ConnectionProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.Subscriber)")
	public Object createSubscriberProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Supplier)")
	public Object createSupplierProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			priority = 1, 
			value = "get() instanceof T(org.nasdanika.models.functionflow.SupplierFlow)")
	public Object createSupplierFlowProcessor(
			NodeProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}
		
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Transition)")
	public Object createTransitionProcessor(
			ConnectionProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		throw new UnsupportedOperationException();
	}

}
