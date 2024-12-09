package org.nasdanika.models.functionflow.processors.runtime;

import java.util.function.BiConsumer;
import java.util.function.Function;

import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.model.adapters.ConnectionAdapter;
import org.nasdanika.graph.model.adapters.NodeAdapter;
import org.nasdanika.graph.processor.ConnectionProcessorConfig;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.Processor;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.models.functionflow.Call;
import org.nasdanika.models.functionflow.End;
import org.nasdanika.models.functionflow.Flow;
import org.nasdanika.models.functionflow.Start;
import org.nasdanika.models.functionflow.Transition;

/**
 * Reflective target to create {@link Invocable} processors.
 */
public class ProcessorFactory {
	
	private CapabilityLoader capabilityLoader;

	public ProcessorFactory(CapabilityLoader capabilityLoader) {
		this.capabilityLoader = capabilityLoader;
	}
	
	public CapabilityLoader getCapabilityLoader() {
		return capabilityLoader;
	}
	
	@Processor(
			type = NodeAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Flow)")
	public Object createFunctionFlowProcessor(
		NodeProcessorConfig<?,?> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
		Function<ProgressMonitor, Object> next,		
		ProgressMonitor progressMonitor) {
		
		return new FlowProcessor<Flow>(
				this, 
				(Flow) ((NodeAdapter) config.getElement()).get(),
				progressMonitor);
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
		
		return new StartProcessor(
				this, 
				(Start) ((NodeAdapter) config.getElement()).get(),
				progressMonitor);
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
		
		return new EndProcessor(
				this, 
				(End) ((NodeAdapter) config.getElement()).get(),
				progressMonitor);
	}
		
	@Processor(
			type = ConnectionAdapter.class,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Transition)")
	public Object createTransitionProcessor(
			ConnectionProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		return new TransitionProcessor<Transition>(
				this, 
				(Transition) ((ConnectionAdapter) config.getElement()).get(),
				progressMonitor);
	}	
	
	@Processor(
			type = ConnectionAdapter.class,
			priority = 1,
			value = "get() instanceof T(org.nasdanika.models.functionflow.Call)")
	public Object createCallProcessor(
			ConnectionProcessorConfig<?,?> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			Function<ProgressMonitor, Object> next,		
			ProgressMonitor progressMonitor) {
		
		return new CallProcessor<Call>(
				this, 
				(Call) ((ConnectionAdapter) config.getElement()).get(),
				progressMonitor);
	}
		
	// =====
		
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

}
