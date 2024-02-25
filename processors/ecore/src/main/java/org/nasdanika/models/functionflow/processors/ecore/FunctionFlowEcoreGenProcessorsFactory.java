package org.nasdanika.models.functionflow.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.common.Reflector.Factory;
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
	public final SourceErrorTransitionProcessorFactory sourceErrorTransitionProcessorFactory;	
	
	@Factory
	public final SourceFunctionProcessorFactory sourceFunctionProcessorFactory;	
	
	@Factory
	public final SourceSupplierProcessorFactory sourceSupplierProcessorFactory;	
	
	@Factory
	public final SourceTransitionProcessorFactory sourceTransitionProcessorFactory;	
	
	@Factory
	public final StartProcessorFactory startProcessorFactory;	
	
	@Factory
	public final SupplierProcessorFactory supplierProcessorFactory;	
	
	@Factory
	public final TransitionProcessorFactory transitionProcessorFactory;		

	
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
		sourceConsumerProcessorFactory = new SourceConsumerProcessorFactory(context); 	
		sourceErrorTransitionProcessorFactory = new SourceErrorTransitionProcessorFactory(context); 	
		sourceFunctionProcessorFactory = new SourceFunctionProcessorFactory(context); 	
		sourceSupplierProcessorFactory = new SourceSupplierProcessorFactory(context); 	
		sourceTransitionProcessorFactory = new SourceTransitionProcessorFactory(context); 	
		startProcessorFactory = new StartProcessorFactory(context); 	
		supplierProcessorFactory = new SupplierProcessorFactory(context); 	
		transitionProcessorFactory = new TransitionProcessorFactory(context); 		
	}
	
//	/**
//	 * Test of different ways to configure action prototype.
//	 * @param config
//	 * @param prototypeProvider
//	 * @param progressMonitor
//	 * @return
//	 */
//	@EPackageNodeProcessorFactory(
//			label = "Trum",
//			//actionPrototypeRef = "test-package.yml",
//			actionPrototype = """
//                    app-action:
//                        text: Param
//                        icon: fas fa-user					
//					
//					
//					""",
//			icon = "fas fa-users",
//			description = "My description",
//			documentation =  """
//				# Look at this!
//				
//				```drawio-resource
//				aws.drawio
//				```
//						
//				"""
//	)
//	public EPackageNodeProcessor createEPackageProcessor(
//			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
//			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
//			BiConsumer<Label, ProgressMonitor> labelConfigurator,
//			ProgressMonitor progressMonitor) {		
//		return new EPackageNodeProcessor(config, context, prototypeProvider) {
//			
//			@Override
//			protected void configureLabel(EObject eObject, Label label, ProgressMonitor progressMonitor) {
//				super.configureLabel(eObject, label, progressMonitor);
//				if (labelConfigurator != null) {
//					labelConfigurator.accept(label, progressMonitor);
//				}
//			}
//			
//		};
//	}	

}
