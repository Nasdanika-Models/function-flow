package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.models.architecture.CompositeNode;

public interface CompositeNodeNodeProcessorMixIn<T extends CompositeNode> extends DomainNodeProcessorMixIn<T>, NodeNodeProcessorMixIn<T> {
	
} 
