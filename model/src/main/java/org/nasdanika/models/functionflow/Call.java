/**
 */
package org.nasdanika.models.functionflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.Call#getTargetInput <em>Target Input</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.Call#getTargetOutput <em>Target Output</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Transition {
	/**
	 * Returns the value of the '<em><b>Target Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Input</em>' attribute.
	 * @see #setTargetInput(String)
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getCall_TargetInput()
	 * @model
	 * @generated
	 */
	String getTargetInput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.functionflow.Call#getTargetInput <em>Target Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Input</em>' attribute.
	 * @see #getTargetInput()
	 * @generated
	 */
	void setTargetInput(String value);

	/**
	 * Returns the value of the '<em><b>Target Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Output</em>' attribute.
	 * @see #setTargetOutput(String)
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getCall_TargetOutput()
	 * @model
	 * @generated
	 */
	String getTargetOutput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.functionflow.Call#getTargetOutput <em>Target Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Output</em>' attribute.
	 * @see #getTargetOutput()
	 * @generated
	 */
	void setTargetOutput(String value);

} // Call
