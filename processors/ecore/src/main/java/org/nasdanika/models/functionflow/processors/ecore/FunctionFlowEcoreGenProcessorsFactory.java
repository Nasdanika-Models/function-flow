package org.nasdanika.models.functionflow.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EPackageNodeProcessorFactory(nsURI = FunctionFlowPackage.eNS_URI)
public class FunctionFlowEcoreGenProcessorsFactory {

	private Context context;
	
	@Factory
	public final ConsumerProcessorFactory consumerProcessorFactory;	
	
	@Factory
	public final ConsumerFlowProcessorFactory consumerFlowProcessorFactory;	
	
	@Factory
	public final EndProcessorFactory endProcessorFactory;	
	
	@Factory
	public final ErrorHandlerProcessorFactory errorHandlerProcessorFactory;	
	
	@Factory
	public final ErrorTransitionProcessorFactory errorTransitionProcessorFactory;	
	
	@Factory
	public final FlowProcessorFactory flowProcessorFactory;	
	
	@Factory
	public final FlowElementProcessorFactory flowElementProcessorFactory;	
	
	@Factory
	public final FunctionProcessorFactory functionProcessorFactory;	
	
	@Factory
	public final FunctionFlowProcessorFactory functionFlowProcessorFactory;	
	
	@Factory
	public final SourceConsumerProcessorFactory sourceConsumerProcessorFactory;	
	
	@Factory
	public final SourceErrorHandlerProcessorFactory sourceErrorHandlerProcessorFactory;	
	
	@Factory
	public final SourceErrorTransitionProcessorFactory sourceErrorTransitionProcessorFactory;	
	
	@Factory
	public final SourceFunctionProcessorFactory sourceFunctionProcessorFactory;	
	
	@Factory
	public final SourceProcessorFactory sourceProcessorFactory;	
	
	@Factory
	public final SourceSupplierProcessorFactory sourceSupplierProcessorFactory;	
	
	@Factory
	public final SourceTransitionProcessorFactory sourceTransitionProcessorFactory;	
	
	@Factory
	public final SourceCallProcessorFactory sourceCallProcessorFactory;	
	
	@Factory
	public final StartProcessorFactory startProcessorFactory;	
	
	@Factory
	public final SupplierProcessorFactory supplierProcessorFactory;	
	
	@Factory
	public final SupplierFlowProcessorFactory supplierFlowProcessorFactory;	
	
	@Factory
	public final TransitionProcessorFactory transitionProcessorFactory;		
	
	@Factory
	public final CallProcessorFactory callProcessorFactory;		
	
	@Factory
	public final PublisherProcessorFactory publisherProcessorFactory;		
	
	@Factory
	public final SubscriberProcessorFactory subscriberProcessorFactory;		

	
	public FunctionFlowEcoreGenProcessorsFactory(Context context) {
		this.context = context;
		consumerProcessorFactory = new ConsumerProcessorFactory(context);	
		consumerFlowProcessorFactory = new ConsumerFlowProcessorFactory(context); 	
		endProcessorFactory = new EndProcessorFactory(context); 	
		errorHandlerProcessorFactory = new ErrorHandlerProcessorFactory(context); 	
		errorTransitionProcessorFactory = new ErrorTransitionProcessorFactory(context); 	
		flowProcessorFactory = new FlowProcessorFactory(context); 	
		flowElementProcessorFactory = new FlowElementProcessorFactory(context); 	
		functionProcessorFactory = new FunctionProcessorFactory(context); 	
		functionFlowProcessorFactory = new FunctionFlowProcessorFactory(context); 	
		sourceProcessorFactory = new SourceProcessorFactory(context); 	
		sourceConsumerProcessorFactory = new SourceConsumerProcessorFactory(context); 	
		sourceErrorHandlerProcessorFactory = new SourceErrorHandlerProcessorFactory(context); 	
		sourceErrorTransitionProcessorFactory = new SourceErrorTransitionProcessorFactory(context); 	
		sourceFunctionProcessorFactory = new SourceFunctionProcessorFactory(context); 	
		sourceSupplierProcessorFactory = new SourceSupplierProcessorFactory(context); 	
		sourceTransitionProcessorFactory = new SourceTransitionProcessorFactory(context); 	
		sourceCallProcessorFactory = new SourceCallProcessorFactory(context); 	
		startProcessorFactory = new StartProcessorFactory(context); 	
		supplierProcessorFactory = new SupplierProcessorFactory(context); 	
		supplierFlowProcessorFactory = new SupplierFlowProcessorFactory(context); 	
		transitionProcessorFactory = new TransitionProcessorFactory(context); 		
		callProcessorFactory = new CallProcessorFactory(context); 		
		publisherProcessorFactory = new PublisherProcessorFactory(context); 		
		subscriberProcessorFactory = new SubscriberProcessorFactory(context); 		
	}
	

	@EPackageNodeProcessorFactory(
			label = "Function Flow",
			description = "A graph of functional elements - suppliers, functions, consumers - exchanging objects via transitions",
			actionPrototype = """
            app-action:
              content:
                content-markdown:
                  source:
                    content-resource:
                      location: function-flow.md
			"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
