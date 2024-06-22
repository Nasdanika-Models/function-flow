import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.functionflow.processors.targets.java.EndNodeProcessorFactory;
import org.nasdanika.models.functionflow.processors.targets.java.FunctionFlowNodeProcessorFactory;
import org.nasdanika.models.functionflow.processors.targets.java.JavaReflectiveBiFunctionProcessorServiceFactory;
import org.nasdanika.models.functionflow.processors.targets.java.StartNodeProcessorFactory;
import org.nasdanika.models.functionflow.processors.targets.java.TransitionConnectionProcessorFactory;
import org.nasdanika.models.functionflow.processors.targets.java.sync.SyncCapabilityFactory;

module org.nasdanika.models.functionflow.processors.targets.java {
		
	requires transitive org.nasdanika.models.functionflow;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.functionflow.processors.targets.java;
	opens org.nasdanika.models.functionflow.processors.targets.java; // For loading resources

	provides CapabilityFactory with 
		SyncCapabilityFactory;
	
}
