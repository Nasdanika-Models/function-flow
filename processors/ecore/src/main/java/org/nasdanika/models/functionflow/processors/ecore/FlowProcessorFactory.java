/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.FLOW)
public class FlowProcessorFactory extends FlowElementProcessorFactory {
	
	public FlowProcessorFactory(Context context) {
		super(context);
	}
	
	@EClassifierNodeProcessorFactory(
			description = "Container of flow elements connected by transitions",
			documentation = 
                    """
					Flow is a container for flow elements connected by transitions.
					It is a base class for other flow types - [Supplier Flow](../SupplierFlow/index.html), [Consumer Flow](../ConsumerFlow/index.html),
					and [Function Flow](../FunctionFlow/index.html).
					
					Flow does not take inputs and does not produce outputs.
					As such it does not support [Start](../Start/index.html) and [End](../End/index.html) - it is an element graph
					consisting of [Suppliers](../Supplier/index.html), [Functions](../Function/index.html), [Consumers](../Consumer/index.html), and [Error Handlers](../ErrorHandler/index.html) 					
                    """
	)
	public EClassNodeProcessor createFlowProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}	
			
		};
	}
	
} // Flow
