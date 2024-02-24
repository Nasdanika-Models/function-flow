/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.functionflow.ErrorTransition;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ErrorTransitionImpl extends TransitionImpl implements ErrorTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.ERROR_TRANSITION;
	}

} //ErrorTransitionImpl
