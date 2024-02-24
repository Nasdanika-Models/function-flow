package org.nasdanika.models.functionflow.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.models.architecture.util.ArchitectureDrawioFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

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

}
