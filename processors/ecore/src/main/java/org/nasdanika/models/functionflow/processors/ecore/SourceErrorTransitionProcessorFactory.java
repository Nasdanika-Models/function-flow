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

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.SOURCE_ERROR_TRANSITION)
public class SourceErrorTransitionProcessorFactory extends ErrorTransitionProcessorFactory {
	
	public SourceErrorTransitionProcessorFactory(Context context) {
		super(context);
	}
	
	@EClassifierNodeProcessorFactory(
			label = "Source Error Transition",
			description = "Error transition which executes source code to transform the input error to output",
			documentation = 
                    """
					Source error transition executes its source code to transform the input error to transition output. 
                    """
	)
	public EClassNodeProcessor createSourceErrorTransitionProcessor(
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
	
} // SourceErrorTransition
