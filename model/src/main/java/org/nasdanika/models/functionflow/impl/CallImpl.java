/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.functionflow.Call;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.CallImpl#getTargetInput <em>Target Input</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.CallImpl#getTargetOutput <em>Target Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends TransitionImpl implements Call {
	/**
	 * The default value of the '{@link #getTargetInput() <em>Target Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInput()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_INPUT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetOutput() <em>Target Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_OUTPUT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetInput() {
		return (String)eDynamicGet(FunctionFlowPackage.CALL__TARGET_INPUT, FunctionFlowPackage.Literals.CALL__TARGET_INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetInput(String newTargetInput) {
		eDynamicSet(FunctionFlowPackage.CALL__TARGET_INPUT, FunctionFlowPackage.Literals.CALL__TARGET_INPUT, newTargetInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetOutput() {
		return (String)eDynamicGet(FunctionFlowPackage.CALL__TARGET_OUTPUT, FunctionFlowPackage.Literals.CALL__TARGET_OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetOutput(String newTargetOutput) {
		eDynamicSet(FunctionFlowPackage.CALL__TARGET_OUTPUT, FunctionFlowPackage.Literals.CALL__TARGET_OUTPUT, newTargetOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionFlowPackage.CALL__TARGET_INPUT:
				return getTargetInput();
			case FunctionFlowPackage.CALL__TARGET_OUTPUT:
				return getTargetOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionFlowPackage.CALL__TARGET_INPUT:
				setTargetInput((String)newValue);
				return;
			case FunctionFlowPackage.CALL__TARGET_OUTPUT:
				setTargetOutput((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunctionFlowPackage.CALL__TARGET_INPUT:
				setTargetInput(TARGET_INPUT_EDEFAULT);
				return;
			case FunctionFlowPackage.CALL__TARGET_OUTPUT:
				setTargetOutput(TARGET_OUTPUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunctionFlowPackage.CALL__TARGET_INPUT:
				return TARGET_INPUT_EDEFAULT == null ? getTargetInput() != null : !TARGET_INPUT_EDEFAULT.equals(getTargetInput());
			case FunctionFlowPackage.CALL__TARGET_OUTPUT:
				return TARGET_OUTPUT_EDEFAULT == null ? getTargetOutput() != null : !TARGET_OUTPUT_EDEFAULT.equals(getTargetOutput());
		}
		return super.eIsSet(featureID);
	}

} //CallImpl
