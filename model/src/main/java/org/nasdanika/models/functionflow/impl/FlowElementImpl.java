/**
 */
package org.nasdanika.models.functionflow.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.nasdanika.models.functionflow.impl.FlowElementImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FlowElementImpl#getConfiguration <em>Configuration</em>}</li>
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
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

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
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getErrors() {
		return (EList<String>)eDynamicGet(FunctionFlowPackage.FLOW_ELEMENT__ERRORS, FunctionFlowPackage.Literals.FLOW_ELEMENT__ERRORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfiguration() {
		return (String)eDynamicGet(FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(String newConfiguration) {
		eDynamicSet(FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__CONFIGURATION, newConfiguration);
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
			case FunctionFlowPackage.FLOW_ELEMENT__ERRORS:
				return getErrors();
			case FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION:
				return getConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case FunctionFlowPackage.FLOW_ELEMENT__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends String>)newValue);
				return;
			case FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION:
				setConfiguration((String)newValue);
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
			case FunctionFlowPackage.FLOW_ELEMENT__ERRORS:
				getErrors().clear();
				return;
			case FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
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
			case FunctionFlowPackage.FLOW_ELEMENT__ERRORS:
				return !getErrors().isEmpty();
			case FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? getConfiguration() != null : !CONFIGURATION_EDEFAULT.equals(getConfiguration());
		}
		return super.eIsSet(featureID);
	}

} //FlowElementImpl
