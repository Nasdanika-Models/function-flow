/**
 */
package org.nasdanika.models.functionflow.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.ERROR_HANDLER)
public class ErrorHandlerProcessorFactory extends FlowElementProcessorFactory {
	
	public ErrorHandlerProcessorFactory(Context context) {
		super(context);
	}
	
	@EClassifierNodeProcessorFactory(
			label = "Error Handler",			
			description = "Handles errors not handled by error transitions",
			documentation = 
                    """
					If a flow element throws an error and there are no matching error transitions, 
					then the error is handled by an error handler with matching errors.
					Error handlers are sorted in the order of error specificity, if it is supported.
					Otherwise they are matched with the error in the order they are defined in the model.
                    """
	)
	public EClassNodeProcessor createErrorHandlerProcessor(
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
	
} // ErrorHandler
