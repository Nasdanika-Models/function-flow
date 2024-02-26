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

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.CALL)
public class CallProcessorFactory extends FlowElementProcessorFactory {
	
	public CallProcessorFactory(Context context) {
		super(context);
	}
	
	@EClassifierNodeProcessorFactory(
			description = "Passes source output to target input possible transforming it",
			documentation = 
                    """
					Transisitions are functions which take source output as their input. 
					Transition output is passes to its target as input.
					
					Only one transition is activated by the source output.
					Transitions are evauated for activation in the the order defined by the
					``order`` property.
					Transitions within the same order are ordered by type specificity, if it is supported.
					Within the same type (or absense of thereof) transitions with conditions are evaluated before 
					transition(s) without conditions. 
					
					``errors`` is not applicable to transitions, only to [error transitions)(../ErrorTransition/index.html).										
                    """
	)
	public EClassNodeProcessor createTransitionProcessor(
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
			classID = FunctionFlowPackage.CALL,
			featureID = FunctionFlowPackage.CALL__TARGET_INPUT,
			description = "Target input type"
	)
	public EAttributeNodeProcessor createInputProcessor(
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
			classID = FunctionFlowPackage.CALL,
			featureID = FunctionFlowPackage.CALL__TARGET_OUTPUT,
			description = "Target output type"
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

	@EStructuralFeatureNodeProcessorFactory(
			nsURI = FunctionFlowPackage.eNS_URI,
			classID = FunctionFlowPackage.TRANSITION,
			featureID = FunctionFlowPackage.TRANSITION__CONDITION,
			description = "Transition condition shall be blank or evaluate to true for condition to activate"
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
			classID = FunctionFlowPackage.TRANSITION,
			featureID = FunctionFlowPackage.TRANSITION__ORDER,
			description = "Transitions are sorted by order, transitions with smaller order values are evaluated for matching before transitions with larger order value"
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

} // Transition
