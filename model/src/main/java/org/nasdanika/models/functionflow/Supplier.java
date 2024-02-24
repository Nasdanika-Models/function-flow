/**
 */
package org.nasdanika.models.functionflow;

import org.nasdanika.models.architecture.RelationshipSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.Supplier#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getSupplier()
 * @model
 * @generated
 */
public interface Supplier extends FlowElement, RelationshipSource {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getSupplier_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.functionflow.Supplier#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

} // Supplier
