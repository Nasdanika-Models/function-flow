package org.nasdanika.models.functionflow.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SourceRecord;
import org.nasdanika.common.Util;
import org.nasdanika.models.architecture.util.ArchitectureDrawioFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.persistence.ConfigurationException;
import org.yaml.snakeyaml.Yaml;

/**
 * Factory for mapping drawio model to function flow model
 * @param <G>
 * @param <E>
 */
public abstract class FunctionFlowDrawioFactory extends ArchitectureDrawioFactory {

	public FunctionFlowDrawioFactory(ResourceSet resourceSet) {
		super(resourceSet);
	}

	/**
	 * Returns a map with graph and ncore entries.
	 */
	@Override
	protected Map<String, EPackage> getEPackages() {		
		Map<String, EPackage> ret = new LinkedHashMap<>();
		ret.put("function-flow", FunctionFlowPackage.eINSTANCE);
		ret.putAll(super.getEPackages());
		return ret;
	}
	
	protected String getInputPropertyName() {
		return getPropertyNamespace() + "input";
	}
	
	protected String getInput(EObject eObj) {
		SourceRecord source = loadSource(eObj, getInputPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getConfigurationPropertyName() {
		return getPropertyNamespace() + "configuration";
	}
	
	protected String getConfiguration(EObject eObj) {
		SourceRecord source = loadSource(eObj, getConfigurationPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getOutputPropertyName() {
		return getPropertyNamespace() + "output";
	}
	
	protected String getOutput(EObject eObj) {
		SourceRecord source = loadSource(eObj, getOutputPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getTargetInputPropertyName() {
		return getPropertyNamespace() + "target-input";
	}
	
	protected String getTargetInput(EObject eObj) {
		SourceRecord source = loadSource(eObj, getTargetInputPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getTargetOutputPropertyName() {
		return getPropertyNamespace() + "target-output";
	}
	
	protected String getTargetOutput(EObject eObj) {
		SourceRecord source = loadSource(eObj, getTargetOutputPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getErrorsPropertyName() {
		return getPropertyNamespace() + "errors";
	}
	
	protected String getErrors(EObject eObj) {
		SourceRecord source = loadSource(eObj, getErrorsPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getImplementationPropertyName() {
		return getPropertyNamespace() + "implementation";
	}
	
	protected String getImplementation(EObject eObj) {
		SourceRecord source = loadSource(eObj, getImplementationPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getConditionPropertyName() {
		return getPropertyNamespace() + "condition";
	}
	
	protected String getCondition(EObject eObj) {
		SourceRecord source = loadSource(eObj, getConditionPropertyName());
		if (source == null) {
			return null;
		}
		return source.source();		
	}
	
	protected String getOrderPropertyName() {
		return getPropertyNamespace() + "order";
	}
		
	protected String getSourcePropertyName() {
		return getPropertyNamespace() + "source";
	}
	
	@Override
	protected void configureSemanticElement(
			EObject eObj, 
			EObject semanticElement, 
			Map<EObject, EObject> registry,
			boolean isPrototype, ProgressMonitor progressMonitor) {
		super.configureSemanticElement(eObj, semanticElement, registry, isPrototype, progressMonitor);
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Consumer) {
			String input = getInput(eObj);
			if (!Util.isBlank(input)) {
				((org.nasdanika.models.functionflow.Consumer) semanticElement).setInput(input);
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Supplier) {
			String output = getOutput(eObj);
			if (!Util.isBlank(output)) {
				((org.nasdanika.models.functionflow.Supplier) semanticElement).setOutput(output);
			}
		}
				
		if (semanticElement instanceof org.nasdanika.models.functionflow.Transition) {
			String input = getInput(eObj);
			if (!Util.isBlank(input)) {
				((org.nasdanika.models.functionflow.Transition) semanticElement).setInput(input);
			}
			
			String output = getOutput(eObj);
			if (!Util.isBlank(output)) {
				((org.nasdanika.models.functionflow.Transition) semanticElement).setOutput(output);
			}
			
			String orderPropertyName = getOrderPropertyName();
			if (!Util.isBlank(orderPropertyName)) {
				String order = getProperty(eObj, orderPropertyName);
				if (!Util.isBlank(order)) {
					((org.nasdanika.models.functionflow.Transition) semanticElement).setOrder(Integer.parseInt(order));
				}
			}
			
			String condition = getCondition(eObj);
			if (!Util.isBlank(condition)) {
				((org.nasdanika.models.functionflow.Transition) semanticElement).setCondition(condition);
			}
		}
						
		if (semanticElement instanceof org.nasdanika.models.functionflow.Call) {
			String targetInput = getTargetInput(eObj);
			if (!Util.isBlank(targetInput)) {
				((org.nasdanika.models.functionflow.Call) semanticElement).setTargetInput(targetInput);
			}
			
			String targetOutput = getTargetOutput(eObj);
			if (!Util.isBlank(targetOutput)) {
				((org.nasdanika.models.functionflow.Call) semanticElement).setTargetOutput(targetOutput);
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Start) {
			String orderPropertyName = getOrderPropertyName();
			if (!Util.isBlank(orderPropertyName)) {
				String order = getProperty(eObj, orderPropertyName);
				if (!Util.isBlank(order)) {
					((org.nasdanika.models.functionflow.Start) semanticElement).setOrder(Integer.parseInt(order));
				}
			}
			
			String condition = getCondition(eObj);
			if (!Util.isBlank(condition)) {
				((org.nasdanika.models.functionflow.Start) semanticElement).setCondition(condition);
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Source) {
			SourceRecord source = loadSource(eObj, getSourcePropertyName());
			if (source != null) {
				((org.nasdanika.models.functionflow.Source) semanticElement).setSource(source.source());
				String baseURI = ((org.nasdanika.models.functionflow.Source) semanticElement).getBaseURI();
				if (baseURI != null) {
					((org.nasdanika.models.functionflow.Source) semanticElement).setBaseURI(baseURI.toString());					
				}
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.FlowElement) {
			String errors = getErrors(eObj);
			if (!Util.isBlank(errors)) {
				Yaml yaml = new Yaml();
				Object errorsSpecObj = yaml.load(errors);
				org.nasdanika.models.functionflow.FlowElement flowElement = (org.nasdanika.models.functionflow.FlowElement) semanticElement;
				if (errorsSpecObj instanceof Iterable) {
					for (Object error: (Iterable<?>) errorsSpecObj) {
						if (error instanceof String) {
							flowElement.getErrors().add((String) error);
						} else {
							flowElement.getErrors().add(yaml.dump(error));							
						}
					}
				} else {
					flowElement.getErrors().add(errors);
				}
				throw new ConfigurationException("Usupported errors type: " + errorsSpecObj, asMarked(eObj));
			}
			
			String implementation = getImplementation(eObj);
			if (!Util.isBlank(implementation)) {
				((org.nasdanika.models.functionflow.FlowElement) semanticElement).setImplementation(implementation);
			}
			
			String configuration = getConfiguration(eObj);
			if (!Util.isBlank(implementation)) {
				((org.nasdanika.models.functionflow.FlowElement) semanticElement).setImplementation(implementation);
			}
		}	
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Subscriber) {
			String condition = getCondition(eObj);
			if (!Util.isBlank(condition)) {
				((org.nasdanika.models.functionflow.Subscriber) semanticElement).setCondition(condition);
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Publisher) {
			String condition = getCondition(eObj);
			if (!Util.isBlank(condition)) {
				((org.nasdanika.models.functionflow.Publisher) semanticElement).setCondition(condition);
			}
		}
				
	}

}
