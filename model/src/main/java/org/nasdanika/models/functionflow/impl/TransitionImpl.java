/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedConnection;
import org.nasdanika.graph.model.ModelPackage;

import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipTarget;

import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.TransitionImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.TransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.TransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.impl.TransitionImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends FlowElementImpl implements Transition {
	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

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
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionFlowPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipTarget getTarget() {
		return (RelationshipTarget)eDynamicGet(FunctionFlowPackage.TRANSITION__TARGET, ModelPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTarget basicGetTarget() {
		return (RelationshipTarget)eDynamicGet(FunctionFlowPackage.TRANSITION__TARGET, ModelPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(RelationshipTarget newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, FunctionFlowPackage.TRANSITION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(RelationshipTarget newTarget) {
		eDynamicSet(FunctionFlowPackage.TRANSITION__TARGET, ModelPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBidirectional() {
		return (Boolean)eDynamicGet(FunctionFlowPackage.TRANSITION__BIDIRECTIONAL, ModelPackage.Literals.CONNECTION__BIDIRECTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidirectional(boolean newBidirectional) {
		eDynamicSet(FunctionFlowPackage.TRANSITION__BIDIRECTIONAL, ModelPackage.Literals.CONNECTION__BIDIRECTIONAL, newBidirectional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInput() {
		return (String)eDynamicGet(FunctionFlowPackage.TRANSITION__INPUT, FunctionFlowPackage.Literals.TRANSITION__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(String newInput) {
		eDynamicSet(FunctionFlowPackage.TRANSITION__INPUT, FunctionFlowPackage.Literals.TRANSITION__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutput() {
		return (String)eDynamicGet(FunctionFlowPackage.TRANSITION__OUTPUT, FunctionFlowPackage.Literals.TRANSITION__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(String newOutput) {
		eDynamicSet(FunctionFlowPackage.TRANSITION__OUTPUT, FunctionFlowPackage.Literals.TRANSITION__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return (String)eDynamicGet(FunctionFlowPackage.TRANSITION__CONDITION, FunctionFlowPackage.Literals.TRANSITION__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		eDynamicSet(FunctionFlowPackage.TRANSITION__CONDITION, FunctionFlowPackage.Literals.TRANSITION__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrder() {
		return (Integer)eDynamicGet(FunctionFlowPackage.TRANSITION__ORDER, FunctionFlowPackage.Literals.TRANSITION__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(int newOrder) {
		eDynamicSet(FunctionFlowPackage.TRANSITION__ORDER, FunctionFlowPackage.Literals.TRANSITION__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionFlowPackage.TRANSITION__TARGET:
				RelationshipTarget target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS, ConnectionTarget.class, msgs);
				return basicSetTarget((RelationshipTarget)otherEnd, msgs);
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
			case FunctionFlowPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
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
			case FunctionFlowPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FunctionFlowPackage.TRANSITION__BIDIRECTIONAL:
				return isBidirectional();
			case FunctionFlowPackage.TRANSITION__INPUT:
				return getInput();
			case FunctionFlowPackage.TRANSITION__OUTPUT:
				return getOutput();
			case FunctionFlowPackage.TRANSITION__CONDITION:
				return getCondition();
			case FunctionFlowPackage.TRANSITION__ORDER:
				return getOrder();
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
			case FunctionFlowPackage.TRANSITION__TARGET:
				setTarget((RelationshipTarget)newValue);
				return;
			case FunctionFlowPackage.TRANSITION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case FunctionFlowPackage.TRANSITION__INPUT:
				setInput((String)newValue);
				return;
			case FunctionFlowPackage.TRANSITION__OUTPUT:
				setOutput((String)newValue);
				return;
			case FunctionFlowPackage.TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
			case FunctionFlowPackage.TRANSITION__ORDER:
				setOrder((Integer)newValue);
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
			case FunctionFlowPackage.TRANSITION__TARGET:
				setTarget((RelationshipTarget)null);
				return;
			case FunctionFlowPackage.TRANSITION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case FunctionFlowPackage.TRANSITION__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case FunctionFlowPackage.TRANSITION__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case FunctionFlowPackage.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case FunctionFlowPackage.TRANSITION__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case FunctionFlowPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
			case FunctionFlowPackage.TRANSITION__BIDIRECTIONAL:
				return isBidirectional() != BIDIRECTIONAL_EDEFAULT;
			case FunctionFlowPackage.TRANSITION__INPUT:
				return INPUT_EDEFAULT == null ? getInput() != null : !INPUT_EDEFAULT.equals(getInput());
			case FunctionFlowPackage.TRANSITION__OUTPUT:
				return OUTPUT_EDEFAULT == null ? getOutput() != null : !OUTPUT_EDEFAULT.equals(getOutput());
			case FunctionFlowPackage.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case FunctionFlowPackage.TRANSITION__ORDER:
				return getOrder() != ORDER_EDEFAULT;
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
		if (baseClass == Connection.class) {
			switch (derivedFeatureID) {
				case FunctionFlowPackage.TRANSITION__TARGET: return ModelPackage.CONNECTION__TARGET;
				case FunctionFlowPackage.TRANSITION__BIDIRECTIONAL: return ModelPackage.CONNECTION__BIDIRECTIONAL;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnection.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
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
		if (baseClass == Connection.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONNECTION__TARGET: return FunctionFlowPackage.TRANSITION__TARGET;
				case ModelPackage.CONNECTION__BIDIRECTIONAL: return FunctionFlowPackage.TRANSITION__BIDIRECTIONAL;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnection.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TransitionImpl
