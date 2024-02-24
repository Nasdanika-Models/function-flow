/**
 */
package org.nasdanika.models.functionflow;

import org.nasdanika.models.architecture.RelationshipTarget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.Consumer#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getConsumer()
 * @model
 * @generated
 */
public interface Consumer extends FlowElement, RelationshipTarget {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getConsumer_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.functionflow.Consumer#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

} // Consumer
