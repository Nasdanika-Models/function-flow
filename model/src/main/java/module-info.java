import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.functionflow.util.FunctionFlowEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.functionflow {
	exports org.nasdanika.models.functionflow;
	exports org.nasdanika.models.functionflow.impl;
	exports org.nasdanika.models.functionflow.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;	
	requires transitive org.nasdanika.models.architecture;
	
	provides CapabilityFactory with FunctionFlowEPackageResourceSetCapabilityFactory;
	
}