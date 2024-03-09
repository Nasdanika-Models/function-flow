import org.nasdanika.graph.model.util.NodeProcessorFactory;
import org.nasdanika.models.functionflow.processors.targets.java.FunctionFlowNodeProcessorFactory;
import org.nasdanika.models.functionflow.processors.targets.java.StartNodeProcessorFactory;

module org.nasdanika.models.functionflow.processors.targets.java {
		
	requires transitive org.nasdanika.models.functionflow;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.functionflow.processors.targets.java;
	opens org.nasdanika.models.functionflow.processors.targets.java; // For loading resources


	provides NodeProcessorFactory with 
		FunctionFlowNodeProcessorFactory,
		StartNodeProcessorFactory;
	
}
