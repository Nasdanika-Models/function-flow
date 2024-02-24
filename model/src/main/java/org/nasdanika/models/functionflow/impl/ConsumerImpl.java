/**
 */
package org.nasdanika.models.functionflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedConnectionTarget;
import org.nasdanika.graph.model.ModelPackage;

import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipTarget;

import org.nasdanika.models.functionflow.Consumer;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.ConsumerImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.ConsumerImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerImpl extends FlowElementImpl implements Consumer {
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
	protected ConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relationship> getIncomingConnections() {
		return (EList<Relationship>)eDynamicGet(FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS, ModelPackage.Literals.CONNECTION_TARGET__INCOMING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInput() {
		return (String)eDynamicGet(FunctionFlowPackage.CONSUMER__INPUT, FunctionFlowPackage.Literals.CONSUMER__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(String newInput) {
		eDynamicSet(FunctionFlowPackage.CONSUMER__INPUT, FunctionFlowPackage.Literals.CONSUMER__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case FunctionFlowPackage.CONSUMER__INPUT:
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
			case FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Relationship>)newValue);
				return;
			case FunctionFlowPackage.CONSUMER__INPUT:
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
			case FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case FunctionFlowPackage.CONSUMER__INPUT:
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
			case FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS:
				return !getIncomingConnections().isEmpty();
			case FunctionFlowPackage.CONSUMER__INPUT:
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
		if (baseClass == ConnectionTarget.class) {
			switch (derivedFeatureID) {
				case FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS: return ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnectionTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationshipTarget.class) {
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
		if (baseClass == ConnectionTarget.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS: return FunctionFlowPackage.CONSUMER__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnectionTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationshipTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConsumerImpl
