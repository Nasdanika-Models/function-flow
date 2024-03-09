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

@EClassifierNodeProcessorFactory(classifierID = FunctionFlowPackage.FLOW_ELEMENT)
public class FlowElementProcessorFactory  {
	
	protected Context context;

	public FlowElementProcessorFactory(Context context) {
		this.context = context;
	}
	
	@EClassifierNodeProcessorFactory(
			description = "Base class for flow elements",
			label = "Flow Element",
			documentation = 
                    """
					Base class for flow elements.
					Defines ``errors`` and ``implementation`` attributes.
					``errors`` has different semantics depending on a sub-class and is not
					applicable to some sub-classes.
                    """
	)
	public EClassNodeProcessor createFlowElementProcessor(
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
			classID = FunctionFlowPackage.FLOW_ELEMENT,
			featureID = FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION,
			description = "Optional classifier to specify how a particular element is implemented",
			documentation = 
					"""
					Meaning of implementation is generator/interpreter-specific. 
					For example, for a Java generator it may be a fully qualified class name or
					a logical name which maps to a fully qualified class name.
					It may also be an expression returning the implementation, say constructor invocation. 
					"""
	)
	public EAttributeNodeProcessor createImplementationProcessor(
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
			classID = FunctionFlowPackage.FLOW_ELEMENT,
			featureID = FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION,
			description = "Flow element configuration",
			documentation = 
					"""
					Flow element configuration. 
					"""
	)
	public EAttributeNodeProcessor createConfigurationProcessor(
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
			classID = FunctionFlowPackage.FLOW_ELEMENT,
			featureID = FunctionFlowPackage.FLOW_ELEMENT__ERRORS,
			description = "Errors either thrown by the element or handled by it",
			documentation = 
					"""
					A list of errors which has different semantics for different element types:
					
					* For [Error Handler](../ErrorHandler/index.html) the error list defines errors which the handler handles. 
					* For [Error Transition](../ErrorTransition/index.html) the error list defines errors activate the transition.
					* For all other elements defines errors which the element throws.
					
					Java analogy:
					
					* Error handler and transition - exception type in ``catch`` clause
					* All other elements - exception types in ``throws`` clause  
					 
					"""
	)
	public EAttributeNodeProcessor createErrorsProcessor(
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

} // FlowElement
