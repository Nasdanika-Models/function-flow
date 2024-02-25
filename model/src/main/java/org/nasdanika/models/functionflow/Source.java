/**
 */
package org.nasdanika.models.functionflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.functionflow.Source#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.functionflow.Source#getBaseURI <em>Base URI</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Source extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getSource_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.functionflow.Source#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#getSource_BaseURI()
	 * @model
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.functionflow.Source#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);

} // Source
