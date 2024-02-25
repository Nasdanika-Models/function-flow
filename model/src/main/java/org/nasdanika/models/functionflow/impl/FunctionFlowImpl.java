/**
 */
package org.nasdanika.models.functionflow.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.architecture.CompositeRelationshipSource;
import org.nasdanika.models.architecture.CompositeRelationshipTarget;
import org.nasdanika.models.architecture.impl.CompositeNodeImpl;
import org.nasdanika.models.functionflow.ConsumerFlow;
import org.nasdanika.models.functionflow.Flow;
import org.nasdanika.models.functionflow.FlowElement;
import org.nasdanika.models.functionflow.FunctionFlow;
import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.SupplierFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FunctionFlowImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.FunctionFlowImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionFlowImpl extends CompositeNodeImpl implements FunctionFlow {
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
	protected FunctionFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.FUNCTION_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementation() {
		return (String)eDynamicGet(FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__IMPLEMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(String newImplementation) {
		eDynamicSet(FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION, FunctionFlowPackage.Literals.FLOW_ELEMENT__IMPLEMENTATION, newImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getErrors() {
		return (EList<String>)eDynamicGet(FunctionFlowPackage.FUNCTION_FLOW__ERRORS, FunctionFlowPackage.Literals.FLOW_ELEMENT__ERRORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION:
				return getImplementation();
			case FunctionFlowPackage.FUNCTION_FLOW__ERRORS:
				return getErrors();
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
			case FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case FunctionFlowPackage.FUNCTION_FLOW__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends String>)newValue);
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
			case FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case FunctionFlowPackage.FUNCTION_FLOW__ERRORS:
				getErrors().clear();
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
			case FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? getImplementation() != null : !IMPLEMENTATION_EDEFAULT.equals(getImplementation());
			case FunctionFlowPackage.FUNCTION_FLOW__ERRORS:
				return !getErrors().isEmpty();
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
				case FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION: return FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION;
				case FunctionFlowPackage.FUNCTION_FLOW__ERRORS: return FunctionFlowPackage.FLOW_ELEMENT__ERRORS;
				default: return -1;
			}
		}
		if (baseClass == Flow.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CompositeRelationshipSource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SupplierFlow.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CompositeRelationshipTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConsumerFlow.class) {
			switch (derivedFeatureID) {
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
				case FunctionFlowPackage.FLOW_ELEMENT__IMPLEMENTATION: return FunctionFlowPackage.FUNCTION_FLOW__IMPLEMENTATION;
				case FunctionFlowPackage.FLOW_ELEMENT__ERRORS: return FunctionFlowPackage.FUNCTION_FLOW__ERRORS;
				default: return -1;
			}
		}
		if (baseClass == Flow.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CompositeRelationshipSource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SupplierFlow.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CompositeRelationshipTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConsumerFlow.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionFlowImpl
