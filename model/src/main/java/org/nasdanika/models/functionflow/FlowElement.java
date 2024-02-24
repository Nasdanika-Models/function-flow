/**
 */
package org.nasdanika.models.functionflow;

import org.nasdanika.models.architecture.ArchitectureDescriptionElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.FlowElement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getFlowElement()
 * @model
 * @generated
 */
public interface FlowElement extends ArchitectureDescriptionElement {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getFlowElement_Implementation()
	 * @model
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.functionflow.FlowElement#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

} // FlowElement
