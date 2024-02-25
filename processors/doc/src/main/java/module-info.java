module org.nasdanika.models.functionflow.processors.doc {
		
	requires transitive org.nasdanika.models.functionflow;	
	requires transitive org.nasdanika.models.architecture.processors;
	
	exports org.nasdanika.models.functionflow.processors.doc;
	opens org.nasdanika.models.functionflow.processors.doc; // For loading resources
	
}
