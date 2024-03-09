/**
 */
package org.nasdanika.models.functionflow.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.architecture.impl.NodeImpl;
import org.nasdanika.models.functionflow.Consumer;
import org.nasdanika.models.functionflow.FlowElement;
import org.nasdanika.models.functionflow.Function;
import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FunctionImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FunctionImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FunctionImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FunctionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FunctionImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends NodeImpl implements Function {
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
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementation() {
		return (String)eDynamicGet(FunctionFlowPackage.FUNCTION__IMPLEMENTATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__IMPLEMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(String newImplementation) {
		eDynamicSet(FunctionFlowPackage.FUNCTION__IMPLEMENTATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__IMPLEMENTATION, newImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getErrors() {
		return (EList<String>)eDynamicGet(FunctionFlowPackage.FUNCTION__ERRORS, FunctionFlowPackage.Literals.FLOW_ELEMENT__ERRORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfiguration() {
		return (String)eDynamicGet(FunctionFlowPackage.FUNCTION__CONFIGURATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(String newConfiguration) {
		eDynamicSet(FunctionFlowPackage.FUNCTION__CONFIGURATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__CONFIGURATION, newConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutput() {
		return (String)eDynamicGet(FunctionFlowPackage.FUNCTION__OUTPUT, FunctionFlowPackage.Literals.SUPPLIER__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(String newOutput) {
		eDynamicSet(FunctionFlowPackage.FUNCTION__OUTPUT, FunctionFlowPackage.Literals.SUPPLIER__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInput() {
		return (String)eDynamicGet(FunctionFlowPackage.FUNCTION__INPUT, FunctionFlowPackage.Literals.CONSUMER__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(String newInput) {
		eDynamicSet(FunctionFlowPackage.FUNCTION__INPUT, FunctionFlowPackage.Literals.CONSUMER__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionFlowPackage.FUNCTION__IMPLEMENTATION:
				return getImplementation();
			case FunctionFlowPackage.FUNCTION__ERRORS:
				return getErrors();
			case FunctionFlowPackage.FUNCTION__CONFIGURATION:
				return getConfiguration();
			case FunctionFlowPackage.FUNCTION__OUTPUT:
				return getOutput();
			case FunctionFlowPackage.FUNCTION__INPUT:
				return getInput();
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
			case FunctionFlowPackage.FUNCTION__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case FunctionFlowPackage.FUNCTION__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends String>)newValue);
				return;
			case FunctionFlowPackage.FUNCTION__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case FunctionFlowPackage.FUNCTION__OUTPUT:
				setOutput((String)newValue);
				return;
			case FunctionFlowPackage.FUNCTION__INPUT:
				setInput((String)newValue);
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
			case FunctionFlowPackage.FUNCTION__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case FunctionFlowPackage.FUNCTION__ERRORS:
				getErrors().clear();
				return;
			case FunctionFlowPackage.FUNCTION__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case FunctionFlowPackage.FUNCTION__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case FunctionFlowPackage.FUNCTION__INPUT:
				setInput(INPUT_EDEFAULT);
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
			case FunctionFlowPackage.FUNCTION__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? getImplementation() != null : !IMPLEMENTATION_EDEFAULT.equals(getImplementation());
			case FunctionFlowPackage.FUNCTION__ERRORS:
				return !getErrors().isEmpty();
			case FunctionFlowPackage.FUNCTION__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? getConfiguration() != null : !CONFIGURATION_EDEFAULT.equals(getConfiguration());
			case FunctionFlowPackage.FUNCTION__OUTPUT:
				return OUTPUT_EDEFAULT == null ? getOutput() != null : !OUTPUT_EDEFAULT.equals(getOutput());
			case FunctionFlowPackage.FUNCTION__INPUT:
				return INPUT_EDEFAULT == null ? getInput() != null : !INPUT_EDEFAULT.equals(getInput());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElement.class) {
			switch (derivedFeatureID) {
				case FunctionFlowPackage.FUNCTION__IMPLEMENTATION: return FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION;
				case FunctionFlowPackage.FUNCTION__ERRORS: return FunctionFlowPackage.FLOW_ELEMENT__ERRORS;
				case FunctionFlowPackage.FUNCTION__CONFIGURATION: return FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION;
				default: return -1;
			}
		}
		if (baseClass == Supplier.class) {
			switch (derivedFeatureID) {
				case FunctionFlowPackage.FUNCTION__OUTPUT: return FunctionFlowPackage.SUPPLIER__OUTPUT;
				default: return -1;
			}
		}
		if (baseClass == Consumer.class) {
			switch (derivedFeatureID) {
				case FunctionFlowPackage.FUNCTION__INPUT: return FunctionFlowPackage.CONSUMER__INPUT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElement.class) {
			switch (baseFeatureID) {
				case FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION: return FunctionFlowPackage.FUNCTION__IMPLEMENTATION;
				case FunctionFlowPackage.FLOW_ELEMENT__ERRORS: return FunctionFlowPackage.FUNCTION__ERRORS;
				case FunctionFlowPackage.FLOW_ELEMENT__CONFIGURATION: return FunctionFlowPackage.FUNCTION__CONFIGURATION;
				default: return -1;
			}
		}
		if (baseClass == Supplier.class) {
			switch (baseFeatureID) {
				case FunctionFlowPackage.SUPPLIER__OUTPUT: return FunctionFlowPackage.FUNCTION__OUTPUT;
				default: return -1;
			}
		}
		if (baseClass == Consumer.class) {
			switch (baseFeatureID) {
				case FunctionFlowPackage.CONSUMER__INPUT: return FunctionFlowPackage.FUNCTION__INPUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionImpl
