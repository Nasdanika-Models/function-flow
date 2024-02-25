package org.nasdanika.models.functionflow.processors.targets.java;

import org.nasdanika.common.Context;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate Java sources from functon flow models.
 * @author Pavel
 *
 */
public class FunctionFlowNodeProcessorFactory {
			
	private Context context;

	/**
	 * 
	 * @param context
	 * @param reflectiveFactories Objects with annotated methods for creating processors. 
	 */
	public FunctionFlowNodeProcessorFactory(Context context)  {
		this.context = context;
	}
	
}
