/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.functionflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionFlowFactoryImpl extends EFactoryImpl implements FunctionFlowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionFlowFactory init() {
		try {
			FunctionFlowFactory theFunctionFlowFactory = (FunctionFlowFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionFlowPackage.eNS_URI);
			if (theFunctionFlowFactory != null) {
				return theFunctionFlowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionFlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFlowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FunctionFlowPackage.FLOW_ELEMENT: return createFlowElement();
			case FunctionFlowPackage.START: return createStart();
			case FunctionFlowPackage.SUPPLIER: return createSupplier();
			case FunctionFlowPackage.ERROR_HANDLER: return createErrorHandler();
			case FunctionFlowPackage.END: return createEnd();
			case FunctionFlowPackage.CONSUMER: return createConsumer();
			case FunctionFlowPackage.FUNCTION: return createFunction();
			case FunctionFlowPackage.TRANSITION: return createTransition();
			case FunctionFlowPackage.ERROR_TRANSITION: return createErrorTransition();
			case FunctionFlowPackage.FLOW: return createFlow();
			case FunctionFlowPackage.SUPPLIER_FLOW: return createSupplierFlow();
			case FunctionFlowPackage.CONSUMER_FLOW: return createConsumerFlow();
			case FunctionFlowPackage.FUNCTION_FLOW: return createFunctionFlow();
			case FunctionFlowPackage.SOURCE_SUPPLIER: return createSourceSupplier();
			case FunctionFlowPackage.SOURCE_CONSUMER: return createSourceConsumer();
			case FunctionFlowPackage.SOURCE_FUNCTION: return createSourceFunction();
			case FunctionFlowPackage.SOURCE_TRANSITION: return createSourceTransition();
			case FunctionFlowPackage.SOURCE_ERROR_TRANSITION: return createSourceErrorTransition();
			case FunctionFlowPackage.SOURCE_ERROR_HANDLER: return createSourceErrorHandler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowElement createFlowElement() {
		FlowElementImpl flowElement = new FlowElementImpl();
		return flowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supplier createSupplier() {
		SupplierImpl supplier = new SupplierImpl();
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorHandler createErrorHandler() {
		ErrorHandlerImpl errorHandler = new ErrorHandlerImpl();
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorTransition createErrorTransition() {
		ErrorTransitionImpl errorTransition = new ErrorTransitionImpl();
		return errorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierFlow createSupplierFlow() {
		SupplierFlowImpl supplierFlow = new SupplierFlowImpl();
		return supplierFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsumerFlow createConsumerFlow() {
		ConsumerFlowImpl consumerFlow = new ConsumerFlowImpl();
		return consumerFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionFlow createFunctionFlow() {
		FunctionFlowImpl functionFlow = new FunctionFlowImpl();
		return functionFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceSupplier createSourceSupplier() {
		SourceSupplierImpl sourceSupplier = new SourceSupplierImpl();
		return sourceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceConsumer createSourceConsumer() {
		SourceConsumerImpl sourceConsumer = new SourceConsumerImpl();
		return sourceConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceFunction createSourceFunction() {
		SourceFunctionImpl sourceFunction = new SourceFunctionImpl();
		return sourceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceTransition createSourceTransition() {
		SourceTransitionImpl sourceTransition = new SourceTransitionImpl();
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceErrorTransition createSourceErrorTransition() {
		SourceErrorTransitionImpl sourceErrorTransition = new SourceErrorTransitionImpl();
		return sourceErrorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceErrorHandler createSourceErrorHandler() {
		SourceErrorHandlerImpl sourceErrorHandler = new SourceErrorHandlerImpl();
		return sourceErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionFlowPackage getFunctionFlowPackage() {
		return (FunctionFlowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionFlowPackage getPackage() {
		return FunctionFlowPackage.eINSTANCE;
	}

} //FunctionFlowFactoryImpl
