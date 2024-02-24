/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.architecture.impl.ArchitectureDescriptionElementImpl;

import org.nasdanika.models.functionflow.FlowElement;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FlowElementImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowElementImpl extends ArchitectureDescriptionElementImpl implements FlowElement {
	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementation() {
		return (String)eDynamicGet(FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__IMPLEMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(String newImplementation) {
		eDynamicSet(FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__IMPLEMENTATION, newImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION:
				return getImplementation();
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
			case FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION:
				setImplementation((String)newValue);
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
			case FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
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
			case FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? getImplementation() != null : !IMPLEMENTATION_EDEFAULT.equals(getImplementation());
		}
		return super.eIsSet(featureID);
	}

} //FlowElementImpl
