/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.architecture.impl.RelationshipSourceImpl;

import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.Start;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StartImpl extends RelationshipSourceImpl implements Start {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.START;
	}

} //StartImpl
