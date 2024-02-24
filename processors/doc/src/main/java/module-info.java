module org.nasdanika.models.functionflow.processors.doc {
		
	requires transitive org.nasdanika.models.functionflow;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.functionflow.processors.doc;
	opens org.nasdanika.models.functionflow.processors.doc; // For loading resources
	
}
