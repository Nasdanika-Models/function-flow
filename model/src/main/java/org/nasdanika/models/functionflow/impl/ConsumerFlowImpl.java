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

import org.nasdanika.models.architecture.CompositeRelationshipTarget;
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipTarget;

import org.nasdanika.models.functionflow.ConsumerFlow;
import org.nasdanika.models.functionflow.FunctionFlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.ConsumerFlowImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerFlowImpl extends FlowImpl implements ConsumerFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumerFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.CONSUMER_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relationship> getIncomingConnections() {
		return (EList<Relationship>)eDynamicGet(FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS, ModelPackage.Literals.CONNECTION_TARGET__INCOMING_CONNECTIONS, true, true);
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
			case FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS:
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
			case FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS:
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
			case FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS:
				return getIncomingConnections();
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
			case FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Relationship>)newValue);
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
			case FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
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
			case FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS:
				return !getIncomingConnections().isEmpty();
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
				case FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS: return ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS;
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
		if (baseClass == CompositeRelationshipTarget.class) {
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
				case ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS: return FunctionFlowPackage.CONSUMER_FLOW__INCOMING_CONNECTIONS;
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
		if (baseClass == CompositeRelationshipTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConsumerFlowImpl
