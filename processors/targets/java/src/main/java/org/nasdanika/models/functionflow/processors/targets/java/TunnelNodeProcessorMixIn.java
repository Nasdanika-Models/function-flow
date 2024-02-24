package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.models.architecture.Tunnel;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedTunnelNodeProcessorMixIn;

public interface TunnelNodeProcessorMixIn<T extends Tunnel> extends DocumentedNamedTunnelNodeProcessorMixIn<T>, RelationshipNodeProcessorMixIn<T> {
	
} 
