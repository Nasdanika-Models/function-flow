/**
 */
package org.nasdanika.models.functionflow.processors.doc;

import org.nasdanika.models.architecture.Node;

public interface NodeNodeProcessorMixIn<T extends Node> extends RelationshipSourceNodeProcessorMixIn<T>, RelationshipTargetNodeProcessorMixIn<T> {
	
} 
