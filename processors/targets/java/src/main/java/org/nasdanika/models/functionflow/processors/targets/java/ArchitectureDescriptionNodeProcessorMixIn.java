/**
 */
package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedGraphNodeProcessorMixIn;

public interface ArchitectureDescriptionNodeProcessorMixIn<T extends ArchitectureDescription> extends DocumentedNamedGraphNodeProcessorMixIn<T>, ArchitectureElementNodeProcessorMixIn<T> {
	
	
//	EList<Actor> getActors();
	
} 
