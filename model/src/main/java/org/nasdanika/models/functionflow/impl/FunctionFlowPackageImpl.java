/**
 */
package org.nasdanika.models.functionflow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.drawio.model.ModelPackage;

import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.models.functionflow.Consumer;
import org.nasdanika.models.functionflow.ConsumerFlow;
import org.nasdanika.models.functionflow.End;
import org.nasdanika.models.functionflow.ErrorTransition;
import org.nasdanika.models.functionflow.Flow;
import org.nasdanika.models.functionflow.FlowElement;
import org.nasdanika.models.functionflow.Function;
import org.nasdanika.models.functionflow.FunctionFlow;
import org.nasdanika.models.functionflow.FunctionFlowFactory;
import org.nasdanika.models.functionflow.FunctionFlowPackage;
import org.nasdanika.models.functionflow.Source;
import org.nasdanika.models.functionflow.SourceConsumer;
import org.nasdanika.models.functionflow.SourceConsumerFlow;
import org.nasdanika.models.functionflow.SourceErrorTransition;
import org.nasdanika.models.functionflow.SourceFlow;
import org.nasdanika.models.functionflow.SourceFlowElement;
import org.nasdanika.models.functionflow.SourceFunction;
import org.nasdanika.models.functionflow.SourceFunctionFlow;
import org.nasdanika.models.functionflow.SourceSupplier;
import org.nasdanika.models.functionflow.SourceSupplierFlow;
import org.nasdanika.models.functionflow.SourceTransition;
import org.nasdanika.models.functionflow.Start;
import org.nasdanika.models.functionflow.Supplier;

import org.nasdanika.models.functionflow.SupplierFlow;
import org.nasdanika.models.functionflow.Transition;
import org.nasdanika.models.party.PartyPackage;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionFlowPackageImpl extends EPackageImpl implements FunctionFlowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceSupplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceErrorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceSupplierFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceConsumerFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFunctionFlowEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.functionflow.FunctionFlowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionFlowPackageImpl() {
		super(eNS_URI, FunctionFlowFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FunctionFlowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionFlowPackage init() {
		if (isInited) return (FunctionFlowPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionFlowPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFunctionFlowPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FunctionFlowPackageImpl theFunctionFlowPackage = registeredFunctionFlowPackage instanceof FunctionFlowPackageImpl ? (FunctionFlowPackageImpl)registeredFunctionFlowPackage : new FunctionFlowPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ArchitecturePackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		org.nasdanika.graph.model.ModelPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFunctionFlowPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionFlowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionFlowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionFlowPackage.eNS_URI, theFunctionFlowPackage);
		return theFunctionFlowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowElement_Implementation() {
		return (EAttribute)flowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupplier() {
		return supplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplier_Output() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsumer() {
		return consumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsumer_Input() {
		return (EAttribute)consumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Input() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Output() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Condition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Order() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorTransition() {
		return errorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupplierFlow() {
		return supplierFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsumerFlow() {
		return consumerFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionFlow() {
		return functionFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Source() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceFlowElement() {
		return sourceFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceSupplier() {
		return sourceSupplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceConsumer() {
		return sourceConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceFunction() {
		return sourceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceTransition() {
		return sourceTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceErrorTransition() {
		return sourceErrorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceFlow() {
		return sourceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceSupplierFlow() {
		return sourceSupplierFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceConsumerFlow() {
		return sourceConsumerFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceFunctionFlow() {
		return sourceFunctionFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionFlowFactory getFunctionFlowFactory() {
		return (FunctionFlowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		flowElementEClass = createEClass(FLOW_ELEMENT);
		createEAttribute(flowElementEClass, FLOW_ELEMENT__IMPLEMENTATION);

		startEClass = createEClass(START);

		supplierEClass = createEClass(SUPPLIER);
		createEAttribute(supplierEClass, SUPPLIER__OUTPUT);

		endEClass = createEClass(END);

		consumerEClass = createEClass(CONSUMER);
		createEAttribute(consumerEClass, CONSUMER__INPUT);

		functionEClass = createEClass(FUNCTION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__INPUT);
		createEAttribute(transitionEClass, TRANSITION__OUTPUT);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);
		createEAttribute(transitionEClass, TRANSITION__ORDER);

		errorTransitionEClass = createEClass(ERROR_TRANSITION);

		flowEClass = createEClass(FLOW);

		supplierFlowEClass = createEClass(SUPPLIER_FLOW);

		consumerFlowEClass = createEClass(CONSUMER_FLOW);

		functionFlowEClass = createEClass(FUNCTION_FLOW);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__SOURCE);

		sourceFlowElementEClass = createEClass(SOURCE_FLOW_ELEMENT);

		sourceSupplierEClass = createEClass(SOURCE_SUPPLIER);

		sourceConsumerEClass = createEClass(SOURCE_CONSUMER);

		sourceFunctionEClass = createEClass(SOURCE_FUNCTION);

		sourceTransitionEClass = createEClass(SOURCE_TRANSITION);

		sourceErrorTransitionEClass = createEClass(SOURCE_ERROR_TRANSITION);

		sourceFlowEClass = createEClass(SOURCE_FLOW);

		sourceSupplierFlowEClass = createEClass(SOURCE_SUPPLIER_FLOW);

		sourceConsumerFlowEClass = createEClass(SOURCE_CONSUMER_FLOW);

		sourceFunctionFlowEClass = createEClass(SOURCE_FUNCTION_FLOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flowElementEClass.getESuperTypes().add(theArchitecturePackage.getArchitectureDescriptionElement());
		startEClass.getESuperTypes().add(theArchitecturePackage.getRelationshipSource());
		supplierEClass.getESuperTypes().add(this.getFlowElement());
		supplierEClass.getESuperTypes().add(theArchitecturePackage.getRelationshipSource());
		endEClass.getESuperTypes().add(theArchitecturePackage.getRelationshipTarget());
		consumerEClass.getESuperTypes().add(this.getFlowElement());
		consumerEClass.getESuperTypes().add(theArchitecturePackage.getRelationshipTarget());
		functionEClass.getESuperTypes().add(this.getSupplier());
		functionEClass.getESuperTypes().add(this.getConsumer());
		transitionEClass.getESuperTypes().add(this.getFlowElement());
		transitionEClass.getESuperTypes().add(theArchitecturePackage.getRelationship());
		errorTransitionEClass.getESuperTypes().add(this.getTransition());
		flowEClass.getESuperTypes().add(this.getFlowElement());
		flowEClass.getESuperTypes().add(theArchitecturePackage.getDomain());
		supplierFlowEClass.getESuperTypes().add(this.getFlow());
		supplierFlowEClass.getESuperTypes().add(theArchitecturePackage.getCompositeRelationshipSource());
		consumerFlowEClass.getESuperTypes().add(this.getFlow());
		consumerFlowEClass.getESuperTypes().add(theArchitecturePackage.getCompositeRelationshipTarget());
		functionFlowEClass.getESuperTypes().add(this.getSupplierFlow());
		functionFlowEClass.getESuperTypes().add(this.getConsumerFlow());
		sourceFlowElementEClass.getESuperTypes().add(this.getFlowElement());
		sourceFlowElementEClass.getESuperTypes().add(this.getSource());
		sourceSupplierEClass.getESuperTypes().add(this.getSupplier());
		sourceSupplierEClass.getESuperTypes().add(this.getSource());
		sourceConsumerEClass.getESuperTypes().add(this.getConsumer());
		sourceConsumerEClass.getESuperTypes().add(this.getSource());
		sourceFunctionEClass.getESuperTypes().add(this.getFunction());
		sourceFunctionEClass.getESuperTypes().add(this.getSource());
		sourceTransitionEClass.getESuperTypes().add(this.getTransition());
		sourceTransitionEClass.getESuperTypes().add(this.getSource());
		sourceErrorTransitionEClass.getESuperTypes().add(this.getErrorTransition());
		sourceErrorTransitionEClass.getESuperTypes().add(this.getSource());
		sourceFlowEClass.getESuperTypes().add(this.getFlow());
		sourceFlowEClass.getESuperTypes().add(this.getSource());
		sourceSupplierFlowEClass.getESuperTypes().add(this.getSupplierFlow());
		sourceSupplierFlowEClass.getESuperTypes().add(this.getSource());
		sourceConsumerFlowEClass.getESuperTypes().add(this.getConsumerFlow());
		sourceConsumerFlowEClass.getESuperTypes().add(this.getSource());
		sourceFunctionFlowEClass.getESuperTypes().add(this.getFunctionFlow());
		sourceFunctionFlowEClass.getESuperTypes().add(this.getSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(flowElementEClass, FlowElement.class, "FlowElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowElement_Implementation(), ecorePackage.getEString(), "implementation", null, 0, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supplierEClass, Supplier.class, "Supplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplier_Output(), ecorePackage.getEString(), "output", null, 0, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumerEClass, Consumer.class, "Consumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsumer_Input(), ecorePackage.getEString(), "input", null, 0, 1, Consumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Input(), ecorePackage.getEString(), "input", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Output(), ecorePackage.getEString(), "output", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorTransitionEClass, ErrorTransition.class, "ErrorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supplierFlowEClass, SupplierFlow.class, "SupplierFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumerFlowEClass, ConsumerFlow.class, "ConsumerFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionFlowEClass, FunctionFlow.class, "FunctionFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Source(), ecorePackage.getEString(), "source", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFlowElementEClass, SourceFlowElement.class, "SourceFlowElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceSupplierEClass, SourceSupplier.class, "SourceSupplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceConsumerEClass, SourceConsumer.class, "SourceConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceFunctionEClass, SourceFunction.class, "SourceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceTransitionEClass, SourceTransition.class, "SourceTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceErrorTransitionEClass, SourceErrorTransition.class, "SourceErrorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceFlowEClass, SourceFlow.class, "SourceFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceSupplierFlowEClass, SourceSupplierFlow.class, "SourceSupplierFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceConsumerFlowEClass, SourceConsumerFlow.class, "SourceConsumerFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceFunctionFlowEClass, SourceFunctionFlow.class, "SourceFunctionFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getSupplier_Output(),
		   source,
		   new String[] {
			   "documentation", "Output type"
		   });
		addAnnotation
		  (getConsumer_Input(),
		   source,
		   new String[] {
			   "documentation", "Output type"
		   });
		addAnnotation
		  (functionEClass,
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (getTransition_Input(),
		   source,
		   new String[] {
			   "documentation", "Output type"
		   });
		addAnnotation
		  (getTransition_Output(),
		   source,
		   new String[] {
			   "documentation", "Output type"
		   });
	}

} //FunctionFlowPackageImpl
