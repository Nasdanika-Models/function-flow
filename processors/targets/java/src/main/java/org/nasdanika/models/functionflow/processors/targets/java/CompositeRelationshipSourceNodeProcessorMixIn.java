/**
 */
package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.models.architecture.CompositeRelationshipSource;

public interface CompositeRelationshipSourceNodeProcessorMixIn<T extends CompositeRelationshipSource> extends DomainNodeProcessorMixIn<T>, RelationshipSourceNodeProcessorMixIn<T> {
	
} 
