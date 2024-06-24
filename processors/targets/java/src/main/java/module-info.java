import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.functionflow.processors.targets.java.sync.SyncCapabilityFactory;

module org.nasdanika.models.functionflow.processors.targets.java {
		
	requires transitive org.nasdanika.models.functionflow;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.functionflow.processors.targets.java.sync;
	opens org.nasdanika.models.functionflow.processors.targets.java.sync to org.nasdanika.common; // For loading resources

	provides CapabilityFactory with SyncCapabilityFactory;
	
}
