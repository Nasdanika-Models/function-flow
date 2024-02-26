package org.nasdanika.models.functionflow.util;

import java.io.IOException;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.architecture.util.ArchitectureDrawioFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.persistence.ConfigurationException;
import org.yaml.snakeyaml.Yaml;

/**
 * Factory for mapping drawio model to graph model
 * @param <G>
 * @param <E>
 */
public abstract class FunctionFlowDrawioFactory extends ArchitectureDrawioFactory {

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
	
	protected String getOutputPropertyName() {
		return getPropertyNamespace() + "output";
	}
	
	protected String getTargetInputPropertyName() {
		return getPropertyNamespace() + "target-input";
	}
	
	protected String getTargetOutputPropertyName() {
		return getPropertyNamespace() + "target-output";
	}
	
	protected String getErrorsPropertyName() {
	return getPropertyNamespace() + "errors";
	}
	
	protected String getImplementationPropertyName() {
	return getPropertyNamespace() + "implementation";
	}
	
	protected String getConditionPropertyName() {
	return getPropertyNamespace() + "condition";
	}
	
	protected String getOrderPropertyName() {
	return getPropertyNamespace() + "order";
	}
		
	protected String getSourcePropertyName() {
		return getPropertyNamespace() + "source";
	}
	
	protected String getSourceRefPropertyName() {
		return getPropertyNamespace() + "source-ref";
	}
		
	protected static record Source(URI uri, String source) {};
	
	protected Source getSource(EObject source) {
		String spn = getSourcePropertyName();
		if (!Util.isBlank(spn)) {
			String src = getProperty(source, spn);
			if (!Util.isBlank(src)) {
				return new Source(null, src);
			}
		}
		
		String srpn = getSourceRefPropertyName();
		if (!Util.isBlank(srpn)) {
			String ref = getProperty(source, srpn);
			if (!Util.isBlank(ref)) {
				URI refURI = URI.createURI(ref);
				URI baseURI = getBaseURI(source);
				if (baseURI != null && !baseURI.isRelative()) {
					refURI = refURI.resolve(baseURI);
				}
				try {
					DefaultConverter converter = DefaultConverter.INSTANCE;
					Reader reader = converter.toReader(refURI);
					return new Source(refURI, converter.toString(reader));
				} catch (IOException e) {
					throw new ConfigurationException("Error loading source from " + refURI, e, asMarked(source));
				}
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void configureSemanticElement(
			EObject eObj, 
			EObject semanticElement, 
			Map<EObject, EObject> registry,
			boolean isPrototype, ProgressMonitor progressMonitor) {
		super.configureSemanticElement(eObj, semanticElement, registry, isPrototype, progressMonitor);
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Consumer) {
			String inputPropertyName = getInputPropertyName();
			if (!Util.isBlank(inputPropertyName)) {
				String input = getProperty(eObj, inputPropertyName);
				if (!Util.isBlank(input)) {
					((org.nasdanika.models.functionflow.Consumer) semanticElement).setInput(input);
				}
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Supplier) {
			String outputPropertyName = getOutputPropertyName();
			if (!Util.isBlank(outputPropertyName)) {
				String output = getProperty(eObj, outputPropertyName);
				if (!Util.isBlank(output)) {
					((org.nasdanika.models.functionflow.Supplier) semanticElement).setOutput(output);
				}
			}
		}
				
		if (semanticElement instanceof org.nasdanika.models.functionflow.Transition) {
			String inputPropertyName = getInputPropertyName();
			if (!Util.isBlank(inputPropertyName)) {
				String input = getProperty(eObj, inputPropertyName);
				if (!Util.isBlank(input)) {
					((org.nasdanika.models.functionflow.Transition) semanticElement).setInput(input);
				}
			}
			
			String outputPropertyName = getOutputPropertyName();
			if (!Util.isBlank(outputPropertyName)) {
				String output = getProperty(eObj, outputPropertyName);
				if (!Util.isBlank(output)) {
					((org.nasdanika.models.functionflow.Transition) semanticElement).setOutput(output);
				}
			}
			
			String orderPropertyName = getOrderPropertyName();
			if (!Util.isBlank(orderPropertyName)) {
				String order = getProperty(eObj, orderPropertyName);
				if (!Util.isBlank(order)) {
					((org.nasdanika.models.functionflow.Transition) semanticElement).setOrder(Integer.parseInt(order));
				}
			}
			
			String conditionPropertyName = getConditionPropertyName();
			if (!Util.isBlank(conditionPropertyName)) {
				String condition = getProperty(eObj, conditionPropertyName);
				if (!Util.isBlank(condition)) {
					((org.nasdanika.models.functionflow.Transition) semanticElement).setCondition(condition);
				}
			}
		}
						
		if (semanticElement instanceof org.nasdanika.models.functionflow.Call) {
			String targetInputPropertyName = getTargetInputPropertyName();
			if (!Util.isBlank(targetInputPropertyName)) {
				String targetInput = getProperty(eObj, targetInputPropertyName);
				if (!Util.isBlank(targetInput)) {
					((org.nasdanika.models.functionflow.Call) semanticElement).setTargetInput(targetInput);
				}
			}
			
			String targetOutputPropertyName = getTargetOutputPropertyName();
			if (!Util.isBlank(targetOutputPropertyName)) {
				String targetOutput = getProperty(eObj, targetOutputPropertyName);
				if (!Util.isBlank(targetOutput)) {
					((org.nasdanika.models.functionflow.Call) semanticElement).setTargetOutput(targetOutput);
				}
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
			
			String conditionPropertyName = getConditionPropertyName();
			if (!Util.isBlank(conditionPropertyName)) {
				String condition = getProperty(eObj, conditionPropertyName);
				if (!Util.isBlank(condition)) {
					((org.nasdanika.models.functionflow.Start) semanticElement).setCondition(condition);
				}
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Source) {
			Source source = getSource(eObj);
			if (source != null) {
				((org.nasdanika.models.functionflow.Source) semanticElement).setSource(source.source());
				String baseURI = ((org.nasdanika.models.functionflow.Source) semanticElement).getBaseURI();
				if (baseURI != null) {
					((org.nasdanika.models.functionflow.Source) semanticElement).setBaseURI(baseURI.toString());					
				}
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.FlowElement) {
			String errorsPropertyName = getErrorsPropertyName();
			if (!Util.isBlank(errorsPropertyName)) {
				String errors = getProperty(eObj, errorsPropertyName);
				if (!Util.isBlank(errors)) {
					Yaml yaml = new Yaml();
					Object errorsSpecObj = yaml.load(errors);
					if (errorsSpecObj instanceof String) {
						((org.nasdanika.models.functionflow.FlowElement) semanticElement).getErrors().add((String) errorsSpecObj);						
					} else if (errorsSpecObj instanceof Iterable) {
						for (String error: (Iterable<String>) errorsSpecObj) {
							((org.nasdanika.models.functionflow.FlowElement) semanticElement).getErrors().add(error);													
						}
					}
					throw new ConfigurationException("Usupported errors type: " + errorsSpecObj, asMarked(eObj));
				}
			}
			
			String implementationPropertyName = getImplementationPropertyName();
			if (!Util.isBlank(implementationPropertyName)) {
				String implementation = getProperty(eObj, implementationPropertyName);
				if (!Util.isBlank(implementation)) {
					((org.nasdanika.models.functionflow.Transition) semanticElement).setImplementation(implementation);
				}
			}
		}	
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Subscriber) {
			String conditionPropertyName = getConditionPropertyName();
			if (!Util.isBlank(conditionPropertyName)) {
				String condition = getProperty(eObj, conditionPropertyName);
				if (!Util.isBlank(condition)) {
					((org.nasdanika.models.functionflow.Subscriber) semanticElement).setCondition(condition);
				}
			}
		}
		
		if (semanticElement instanceof org.nasdanika.models.functionflow.Publisher) {
			String conditionPropertyName = getConditionPropertyName();
			if (!Util.isBlank(conditionPropertyName)) {
				String condition = getProperty(eObj, conditionPropertyName);
				if (!Util.isBlank(condition)) {
					((org.nasdanika.models.functionflow.Publisher) semanticElement).setCondition(condition);
				}
			}
		}
				
	}

}
