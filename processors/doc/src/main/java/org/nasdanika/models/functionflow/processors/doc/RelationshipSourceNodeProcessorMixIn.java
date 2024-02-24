package org.nasdanika.models.functionflow.processors.doc;

import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedConnectionSourceNodeProcessorMixIn;

public interface RelationshipSourceNodeProcessorMixIn<T extends RelationshipSource> extends DocumentedNamedConnectionSourceNodeProcessorMixIn<T>, ArchitectureDescriptionElementNodeProcessorMixIn<T> {
	
} 
