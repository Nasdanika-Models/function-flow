import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.functionflow.processors.runtime.ProcessorCapabilityFactory;

module org.nasdanika.models.functionflow.processors.runtime {
		
	requires transitive org.nasdanika.models.functionflow;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.models.graph.processors;
	requires org.nasdanika.graph;
	requires org.nasdanika.common;
	
	exports org.nasdanika.models.functionflow.processors.runtime;
	opens org.nasdanika.models.functionflow.processors.runtime to org.nasdanika.common; // For loading resources

	provides CapabilityFactory with ProcessorCapabilityFactory;
	
}
