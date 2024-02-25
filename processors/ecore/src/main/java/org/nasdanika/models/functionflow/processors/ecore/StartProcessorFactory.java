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
import org.nasdanika.models.ecore.graph.processors.EAttributeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.START)
public class StartProcessorFactory {
	
	private Context context;

	public StartProcessorFactory(Context context) {
		this.context = context;
	}
	
	@EClassifierNodeProcessorFactory(
			description = "Passes containing flow input to outgoing transitions",
			documentation = 
                    """
					Start passes containing Consumer/Function flow input to its outgoing transitions.
					A flow may have multiple starts. 
					If there is more than one start then 
					starts are sorted by order.
					Within the order value starts are sorted by output specificity if it is supported.
					Starts with conditions are matched before starts witout condition. 
                    """
	)
	public EClassNodeProcessor createStartProcessor(
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
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = FunctionFlowPackage.eNS_URI,
			classID = FunctionFlowPackage.START,
			featureID = FunctionFlowPackage.START__CONDITION,
			description = "Start condition"
	)
	public EAttributeNodeProcessor createConditionProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}

	@EStructuralFeatureNodeProcessorFactory(
			nsURI = FunctionFlowPackage.eNS_URI,
			classID = FunctionFlowPackage.START,
			featureID = FunctionFlowPackage.START__ORDER,
			description = "Starts are sorted by order"
	)
	public EAttributeNodeProcessor createOrderProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}

	@EStructuralFeatureNodeProcessorFactory(
			nsURI = FunctionFlowPackage.eNS_URI,
			classID = FunctionFlowPackage.START,
			featureID = FunctionFlowPackage.START__OUTPUT,
			description = "Output type"
	)
	public EAttributeNodeProcessor createOutputProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
} // Start
