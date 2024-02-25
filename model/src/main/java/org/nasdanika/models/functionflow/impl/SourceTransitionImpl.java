/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.Source;
import org.nasdanika.models.functionflow.SourceTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.SourceTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.SourceTransitionImpl#getBaseURI <em>Base URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceTransitionImpl extends TransitionImpl implements SourceTransition {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.SOURCE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(FunctionFlowPackage.SOURCE_TRANSITION__SOURCE, FunctionFlowPackage.Literals.SOURCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(FunctionFlowPackage.SOURCE_TRANSITION__SOURCE, FunctionFlowPackage.Literals.SOURCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseURI() {
		return (String)eDynamicGet(FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI, FunctionFlowPackage.Literals.SOURCE__BASE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseURI(String newBaseURI) {
		eDynamicSet(FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI, FunctionFlowPackage.Literals.SOURCE__BASE_URI, newBaseURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionFlowPackage.SOURCE_TRANSITION__SOURCE:
				return getSource();
			case FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI:
				return getBaseURI();
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
			case FunctionFlowPackage.SOURCE_TRANSITION__SOURCE:
				setSource((String)newValue);
				return;
			case FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI:
				setBaseURI((String)newValue);
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
			case FunctionFlowPackage.SOURCE_TRANSITION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI:
				setBaseURI(BASE_URI_EDEFAULT);
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
			case FunctionFlowPackage.SOURCE_TRANSITION__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI:
				return BASE_URI_EDEFAULT == null ? getBaseURI() != null : !BASE_URI_EDEFAULT.equals(getBaseURI());
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
		if (baseClass == Source.class) {
			switch (derivedFeatureID) {
				case FunctionFlowPackage.SOURCE_TRANSITION__SOURCE: return FunctionFlowPackage.SOURCE__SOURCE;
				case FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI: return FunctionFlowPackage.SOURCE__BASE_URI;
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
		if (baseClass == Source.class) {
			switch (baseFeatureID) {
				case FunctionFlowPackage.SOURCE__SOURCE: return FunctionFlowPackage.SOURCE_TRANSITION__SOURCE;
				case FunctionFlowPackage.SOURCE__BASE_URI: return FunctionFlowPackage.SOURCE_TRANSITION__BASE_URI;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SourceTransitionImpl
