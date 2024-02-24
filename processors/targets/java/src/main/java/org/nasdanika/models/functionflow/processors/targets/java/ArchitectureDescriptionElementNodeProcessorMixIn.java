/**
 */
package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.models.architecture.ArchitectureDescriptionElement;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedGraphElementNodeProcessorMixIn;

public interface ArchitectureDescriptionElementNodeProcessorMixIn<T extends ArchitectureDescriptionElement> extends DocumentedNamedGraphElementNodeProcessorMixIn<T>, ArchitectureElementNodeProcessorMixIn<T>, UndergoerNodeProcessorMixIn<T> {
	
	
} 
