/**
 */
package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedConnectionNodeProcessorMixIn;

public interface RelationshipNodeProcessorMixIn<T extends Relationship> extends DocumentedNamedConnectionNodeProcessorMixIn<T>, ArchitectureElementNodeProcessorMixIn<T>, UndergoerNodeProcessorMixIn<T> {
	
} 
