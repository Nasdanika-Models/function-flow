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
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.StartImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.StartImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.StartImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartImpl extends RelationshipSourceImpl implements Start {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return (String)eDynamicGet(FunctionFlowPackage.START__CONDITION, FunctionFlowPackage.Literals.START__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		eDynamicSet(FunctionFlowPackage.START__CONDITION, FunctionFlowPackage.Literals.START__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrder() {
		return (Integer)eDynamicGet(FunctionFlowPackage.START__ORDER, FunctionFlowPackage.Literals.START__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(int newOrder) {
		eDynamicSet(FunctionFlowPackage.START__ORDER, FunctionFlowPackage.Literals.START__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutput() {
		return (String)eDynamicGet(FunctionFlowPackage.START__OUTPUT, FunctionFlowPackage.Literals.START__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(String newOutput) {
		eDynamicSet(FunctionFlowPackage.START__OUTPUT, FunctionFlowPackage.Literals.START__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionFlowPackage.START__CONDITION:
				return getCondition();
			case FunctionFlowPackage.START__ORDER:
				return getOrder();
			case FunctionFlowPackage.START__OUTPUT:
				return getOutput();
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
			case FunctionFlowPackage.START__CONDITION:
				setCondition((String)newValue);
				return;
			case FunctionFlowPackage.START__ORDER:
				setOrder((Integer)newValue);
				return;
			case FunctionFlowPackage.START__OUTPUT:
				setOutput((String)newValue);
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
			case FunctionFlowPackage.START__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case FunctionFlowPackage.START__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FunctionFlowPackage.START__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
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
			case FunctionFlowPackage.START__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case FunctionFlowPackage.START__ORDER:
				return getOrder() != ORDER_EDEFAULT;
			case FunctionFlowPackage.START__OUTPUT:
				return OUTPUT_EDEFAULT == null ? getOutput() != null : !OUTPUT_EDEFAULT.equals(getOutput());
		}
		return super.eIsSet(featureID);
	}

} //StartImpl
