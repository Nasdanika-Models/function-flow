/**
 */
package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.models.architecture.CompositeRelationshipTarget;

public interface CompositeRelationshipTargetNodeProcessorMixIn<T extends CompositeRelationshipTarget> extends DomainNodeProcessorMixIn<T>, RelationshipTargetNodeProcessorMixIn<T> {
	
} 
