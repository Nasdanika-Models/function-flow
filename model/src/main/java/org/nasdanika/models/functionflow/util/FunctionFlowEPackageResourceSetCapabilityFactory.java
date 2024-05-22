package org.nasdanika.models.functionflow.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

public class FunctionFlowEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

	@Override
	protected EPackage getEPackage() {
		return FunctionFlowPackage.eINSTANCE;
	}

	@Override
	protected URI getDocumentationURI() {
		return URI.createURI("https://function-flow.models.nasdanika.org/");
	}

}
