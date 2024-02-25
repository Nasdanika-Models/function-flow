/**
 */
package org.nasdanika.models.functionflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage
 * @generated
 */
public interface FunctionFlowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionFlowFactory eINSTANCE = org.nasdanika.models.functionflow.impl.FunctionFlowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Element</em>'.
	 * @generated
	 */
	FlowElement createFlowElement();

	/**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
	Start createStart();

	/**
	 * Returns a new object of class '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier</em>'.
	 * @generated
	 */
	Supplier createSupplier();

	/**
	 * Returns a new object of class '<em>Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Handler</em>'.
	 * @generated
	 */
	ErrorHandler createErrorHandler();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumer</em>'.
	 * @generated
	 */
	Consumer createConsumer();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Transition</em>'.
	 * @generated
	 */
	ErrorTransition createErrorTransition();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Supplier Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier Flow</em>'.
	 * @generated
	 */
	SupplierFlow createSupplierFlow();

	/**
	 * Returns a new object of class '<em>Consumer Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumer Flow</em>'.
	 * @generated
	 */
	ConsumerFlow createConsumerFlow();

	/**
	 * Returns a new object of class '<em>Function Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Flow</em>'.
	 * @generated
	 */
	FunctionFlow createFunctionFlow();

	/**
	 * Returns a new object of class '<em>Source Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Flow Element</em>'.
	 * @generated
	 */
	SourceFlowElement createSourceFlowElement();

	/**
	 * Returns a new object of class '<em>Source Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Supplier</em>'.
	 * @generated
	 */
	SourceSupplier createSourceSupplier();

	/**
	 * Returns a new object of class '<em>Source Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Consumer</em>'.
	 * @generated
	 */
	SourceConsumer createSourceConsumer();

	/**
	 * Returns a new object of class '<em>Source Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Function</em>'.
	 * @generated
	 */
	SourceFunction createSourceFunction();

	/**
	 * Returns a new object of class '<em>Source Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Transition</em>'.
	 * @generated
	 */
	SourceTransition createSourceTransition();

	/**
	 * Returns a new object of class '<em>Source Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Error Transition</em>'.
	 * @generated
	 */
	SourceErrorTransition createSourceErrorTransition();

	/**
	 * Returns a new object of class '<em>Source Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Flow</em>'.
	 * @generated
	 */
	SourceFlow createSourceFlow();

	/**
	 * Returns a new object of class '<em>Source Supplier Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Supplier Flow</em>'.
	 * @generated
	 */
	SourceSupplierFlow createSourceSupplierFlow();

	/**
	 * Returns a new object of class '<em>Source Consumer Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Consumer Flow</em>'.
	 * @generated
	 */
	SourceConsumerFlow createSourceConsumerFlow();

	/**
	 * Returns a new object of class '<em>Source Function Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Function Flow</em>'.
	 * @generated
	 */
	SourceFunctionFlow createSourceFunctionFlow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionFlowPackage getFunctionFlowPackage();

} //FunctionFlowFactory
