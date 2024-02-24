module org.nasdanika.models.functionflow.processors.ecore {
		
	requires transitive org.nasdanika.models.functionflow;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.functionflow.processors.ecore;
	opens org.nasdanika.models.functionflow.processors.ecore; // For loading resources
	
}
