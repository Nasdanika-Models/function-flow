/**
 */
package org.nasdanika.models.functionflow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;

import org.nasdanika.drawio.model.SemanticElement;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.ConnectionSource;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedConnection;
import org.nasdanika.graph.model.DocumentedNamedConnectionSource;
import org.nasdanika.graph.model.DocumentedNamedConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedGraph;
import org.nasdanika.graph.model.DocumentedNamedGraphElement;
import org.nasdanika.graph.model.Graph;
import org.nasdanika.graph.model.GraphElement;

import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.architecture.ArchitectureDescriptionElement;
import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.architecture.CompositeNode;
import org.nasdanika.models.architecture.CompositeRelationshipSource;
import org.nasdanika.models.architecture.CompositeRelationshipTarget;
import org.nasdanika.models.architecture.Domain;
import org.nasdanika.models.architecture.Node;
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.architecture.RelationshipTarget;
import org.nasdanika.models.architecture.Undergoer;

import org.nasdanika.models.functionflow.*;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.StringIdentity;

import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.functionflow.FunctionFlowPackage
 * @generated
 */
public class FunctionFlowSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionFlowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFlowSwitch() {
		if (modelPackage == null) {
			modelPackage = FunctionFlowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FunctionFlowPackage.FLOW_ELEMENT: {
				FlowElement flowElement = (FlowElement)theEObject;
				T1 result = caseFlowElement(flowElement);
				if (result == null) result = caseArchitectureDescriptionElement(flowElement);
				if (result == null) result = caseDocumentedNamedGraphElement(flowElement);
				if (result == null) result = caseArchitectureElement(flowElement);
				if (result == null) result = caseUndergoer(flowElement);
				if (result == null) result = caseGraphElement(flowElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(flowElement);
				if (result == null) result = casePeriod(flowElement);
				if (result == null) result = caseStringIdentity(flowElement);
				if (result == null) result = caseSemanticElement(flowElement);
				if (result == null) result = caseDocumentedNamedElement(flowElement);
				if (result == null) result = caseNamedElement(flowElement);
				if (result == null) result = caseDocumented(flowElement);
				if (result == null) result = caseModelElement(flowElement);
				if (result == null) result = caseMarked(flowElement);
				if (result == null) result = caseAdaptable(flowElement);
				if (result == null) result = caseIMarked(flowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.START: {
				Start start = (Start)theEObject;
				T1 result = caseStart(start);
				if (result == null) result = caseRelationshipSource(start);
				if (result == null) result = caseDocumentedNamedConnectionSource(start);
				if (result == null) result = caseArchitectureDescriptionElement(start);
				if (result == null) result = caseDocumentedNamedGraphElement(start);
				if (result == null) result = caseConnectionSource(start);
				if (result == null) result = caseArchitectureElement(start);
				if (result == null) result = caseUndergoer(start);
				if (result == null) result = caseGraphElement(start);
				if (result == null) result = caseDocumentedNamedStringIdentity(start);
				if (result == null) result = casePeriod(start);
				if (result == null) result = caseStringIdentity(start);
				if (result == null) result = caseSemanticElement(start);
				if (result == null) result = caseDocumentedNamedElement(start);
				if (result == null) result = caseNamedElement(start);
				if (result == null) result = caseDocumented(start);
				if (result == null) result = caseModelElement(start);
				if (result == null) result = caseMarked(start);
				if (result == null) result = caseAdaptable(start);
				if (result == null) result = caseIMarked(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SUPPLIER: {
				Supplier supplier = (Supplier)theEObject;
				T1 result = caseSupplier(supplier);
				if (result == null) result = caseFlowElement(supplier);
				if (result == null) result = caseRelationshipSource(supplier);
				if (result == null) result = caseArchitectureDescriptionElement(supplier);
				if (result == null) result = caseDocumentedNamedConnectionSource(supplier);
				if (result == null) result = caseDocumentedNamedGraphElement(supplier);
				if (result == null) result = caseArchitectureElement(supplier);
				if (result == null) result = caseUndergoer(supplier);
				if (result == null) result = caseConnectionSource(supplier);
				if (result == null) result = caseGraphElement(supplier);
				if (result == null) result = caseDocumentedNamedStringIdentity(supplier);
				if (result == null) result = casePeriod(supplier);
				if (result == null) result = caseStringIdentity(supplier);
				if (result == null) result = caseSemanticElement(supplier);
				if (result == null) result = caseDocumentedNamedElement(supplier);
				if (result == null) result = caseNamedElement(supplier);
				if (result == null) result = caseDocumented(supplier);
				if (result == null) result = caseModelElement(supplier);
				if (result == null) result = caseMarked(supplier);
				if (result == null) result = caseAdaptable(supplier);
				if (result == null) result = caseIMarked(supplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.ERROR_HANDLER: {
				ErrorHandler errorHandler = (ErrorHandler)theEObject;
				T1 result = caseErrorHandler(errorHandler);
				if (result == null) result = caseFlowElement(errorHandler);
				if (result == null) result = caseRelationshipSource(errorHandler);
				if (result == null) result = caseArchitectureDescriptionElement(errorHandler);
				if (result == null) result = caseDocumentedNamedConnectionSource(errorHandler);
				if (result == null) result = caseDocumentedNamedGraphElement(errorHandler);
				if (result == null) result = caseArchitectureElement(errorHandler);
				if (result == null) result = caseUndergoer(errorHandler);
				if (result == null) result = caseConnectionSource(errorHandler);
				if (result == null) result = caseGraphElement(errorHandler);
				if (result == null) result = caseDocumentedNamedStringIdentity(errorHandler);
				if (result == null) result = casePeriod(errorHandler);
				if (result == null) result = caseStringIdentity(errorHandler);
				if (result == null) result = caseSemanticElement(errorHandler);
				if (result == null) result = caseDocumentedNamedElement(errorHandler);
				if (result == null) result = caseNamedElement(errorHandler);
				if (result == null) result = caseDocumented(errorHandler);
				if (result == null) result = caseModelElement(errorHandler);
				if (result == null) result = caseMarked(errorHandler);
				if (result == null) result = caseAdaptable(errorHandler);
				if (result == null) result = caseIMarked(errorHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.END: {
				End end = (End)theEObject;
				T1 result = caseEnd(end);
				if (result == null) result = caseRelationshipTarget(end);
				if (result == null) result = caseArchitectureDescriptionElement(end);
				if (result == null) result = caseDocumentedNamedConnectionTarget(end);
				if (result == null) result = caseDocumentedNamedGraphElement(end);
				if (result == null) result = caseArchitectureElement(end);
				if (result == null) result = caseUndergoer(end);
				if (result == null) result = caseConnectionTarget(end);
				if (result == null) result = caseGraphElement(end);
				if (result == null) result = caseDocumentedNamedStringIdentity(end);
				if (result == null) result = casePeriod(end);
				if (result == null) result = caseStringIdentity(end);
				if (result == null) result = caseSemanticElement(end);
				if (result == null) result = caseDocumentedNamedElement(end);
				if (result == null) result = caseNamedElement(end);
				if (result == null) result = caseDocumented(end);
				if (result == null) result = caseModelElement(end);
				if (result == null) result = caseMarked(end);
				if (result == null) result = caseAdaptable(end);
				if (result == null) result = caseIMarked(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.CONSUMER: {
				Consumer consumer = (Consumer)theEObject;
				T1 result = caseConsumer(consumer);
				if (result == null) result = caseFlowElement(consumer);
				if (result == null) result = caseRelationshipTarget(consumer);
				if (result == null) result = caseArchitectureDescriptionElement(consumer);
				if (result == null) result = caseDocumentedNamedConnectionTarget(consumer);
				if (result == null) result = caseDocumentedNamedGraphElement(consumer);
				if (result == null) result = caseArchitectureElement(consumer);
				if (result == null) result = caseUndergoer(consumer);
				if (result == null) result = caseConnectionTarget(consumer);
				if (result == null) result = caseGraphElement(consumer);
				if (result == null) result = caseDocumentedNamedStringIdentity(consumer);
				if (result == null) result = casePeriod(consumer);
				if (result == null) result = caseStringIdentity(consumer);
				if (result == null) result = caseSemanticElement(consumer);
				if (result == null) result = caseDocumentedNamedElement(consumer);
				if (result == null) result = caseNamedElement(consumer);
				if (result == null) result = caseDocumented(consumer);
				if (result == null) result = caseModelElement(consumer);
				if (result == null) result = caseMarked(consumer);
				if (result == null) result = caseAdaptable(consumer);
				if (result == null) result = caseIMarked(consumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T1 result = caseFunction(function);
				if (result == null) result = caseNode(function);
				if (result == null) result = caseSupplier(function);
				if (result == null) result = caseConsumer(function);
				if (result == null) result = caseRelationshipSource(function);
				if (result == null) result = caseRelationshipTarget(function);
				if (result == null) result = caseFlowElement(function);
				if (result == null) result = caseDocumentedNamedConnectionSource(function);
				if (result == null) result = caseArchitectureDescriptionElement(function);
				if (result == null) result = caseDocumentedNamedConnectionTarget(function);
				if (result == null) result = caseDocumentedNamedGraphElement(function);
				if (result == null) result = caseConnectionSource(function);
				if (result == null) result = caseArchitectureElement(function);
				if (result == null) result = caseUndergoer(function);
				if (result == null) result = caseConnectionTarget(function);
				if (result == null) result = caseGraphElement(function);
				if (result == null) result = caseDocumentedNamedStringIdentity(function);
				if (result == null) result = casePeriod(function);
				if (result == null) result = caseStringIdentity(function);
				if (result == null) result = caseSemanticElement(function);
				if (result == null) result = caseDocumentedNamedElement(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = caseDocumented(function);
				if (result == null) result = caseModelElement(function);
				if (result == null) result = caseMarked(function);
				if (result == null) result = caseAdaptable(function);
				if (result == null) result = caseIMarked(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T1 result = caseTransition(transition);
				if (result == null) result = caseFlowElement(transition);
				if (result == null) result = caseRelationship(transition);
				if (result == null) result = caseArchitectureDescriptionElement(transition);
				if (result == null) result = caseDocumentedNamedConnection(transition);
				if (result == null) result = caseDocumentedNamedGraphElement(transition);
				if (result == null) result = caseArchitectureElement(transition);
				if (result == null) result = caseUndergoer(transition);
				if (result == null) result = caseConnection(transition);
				if (result == null) result = caseGraphElement(transition);
				if (result == null) result = caseDocumentedNamedStringIdentity(transition);
				if (result == null) result = casePeriod(transition);
				if (result == null) result = caseStringIdentity(transition);
				if (result == null) result = caseSemanticElement(transition);
				if (result == null) result = caseDocumentedNamedElement(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseDocumented(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseMarked(transition);
				if (result == null) result = caseAdaptable(transition);
				if (result == null) result = caseIMarked(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.ERROR_TRANSITION: {
				ErrorTransition errorTransition = (ErrorTransition)theEObject;
				T1 result = caseErrorTransition(errorTransition);
				if (result == null) result = caseTransition(errorTransition);
				if (result == null) result = caseFlowElement(errorTransition);
				if (result == null) result = caseRelationship(errorTransition);
				if (result == null) result = caseArchitectureDescriptionElement(errorTransition);
				if (result == null) result = caseDocumentedNamedConnection(errorTransition);
				if (result == null) result = caseDocumentedNamedGraphElement(errorTransition);
				if (result == null) result = caseArchitectureElement(errorTransition);
				if (result == null) result = caseUndergoer(errorTransition);
				if (result == null) result = caseConnection(errorTransition);
				if (result == null) result = caseGraphElement(errorTransition);
				if (result == null) result = caseDocumentedNamedStringIdentity(errorTransition);
				if (result == null) result = casePeriod(errorTransition);
				if (result == null) result = caseStringIdentity(errorTransition);
				if (result == null) result = caseSemanticElement(errorTransition);
				if (result == null) result = caseDocumentedNamedElement(errorTransition);
				if (result == null) result = caseNamedElement(errorTransition);
				if (result == null) result = caseDocumented(errorTransition);
				if (result == null) result = caseModelElement(errorTransition);
				if (result == null) result = caseMarked(errorTransition);
				if (result == null) result = caseAdaptable(errorTransition);
				if (result == null) result = caseIMarked(errorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T1 result = caseFlow(flow);
				if (result == null) result = caseFlowElement(flow);
				if (result == null) result = caseDomain(flow);
				if (result == null) result = caseArchitectureDescriptionElement(flow);
				if (result == null) result = caseArchitectureDescription(flow);
				if (result == null) result = caseDocumentedNamedGraphElement(flow);
				if (result == null) result = caseArchitectureElement(flow);
				if (result == null) result = caseUndergoer(flow);
				if (result == null) result = caseDocumentedNamedGraph(flow);
				if (result == null) result = caseGraphElement(flow);
				if (result == null) result = caseDocumentedNamedStringIdentity(flow);
				if (result == null) result = casePeriod(flow);
				if (result == null) result = caseGraph(flow);
				if (result == null) result = caseStringIdentity(flow);
				if (result == null) result = caseSemanticElement(flow);
				if (result == null) result = caseDocumentedNamedElement(flow);
				if (result == null) result = caseNamedElement(flow);
				if (result == null) result = caseDocumented(flow);
				if (result == null) result = caseModelElement(flow);
				if (result == null) result = caseMarked(flow);
				if (result == null) result = caseAdaptable(flow);
				if (result == null) result = caseIMarked(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SUPPLIER_FLOW: {
				SupplierFlow supplierFlow = (SupplierFlow)theEObject;
				T1 result = caseSupplierFlow(supplierFlow);
				if (result == null) result = caseFlow(supplierFlow);
				if (result == null) result = caseCompositeRelationshipSource(supplierFlow);
				if (result == null) result = caseFlowElement(supplierFlow);
				if (result == null) result = caseDomain(supplierFlow);
				if (result == null) result = caseRelationshipSource(supplierFlow);
				if (result == null) result = caseArchitectureDescriptionElement(supplierFlow);
				if (result == null) result = caseArchitectureDescription(supplierFlow);
				if (result == null) result = caseDocumentedNamedConnectionSource(supplierFlow);
				if (result == null) result = caseDocumentedNamedGraphElement(supplierFlow);
				if (result == null) result = caseArchitectureElement(supplierFlow);
				if (result == null) result = caseUndergoer(supplierFlow);
				if (result == null) result = caseDocumentedNamedGraph(supplierFlow);
				if (result == null) result = caseConnectionSource(supplierFlow);
				if (result == null) result = caseGraphElement(supplierFlow);
				if (result == null) result = caseDocumentedNamedStringIdentity(supplierFlow);
				if (result == null) result = casePeriod(supplierFlow);
				if (result == null) result = caseGraph(supplierFlow);
				if (result == null) result = caseStringIdentity(supplierFlow);
				if (result == null) result = caseSemanticElement(supplierFlow);
				if (result == null) result = caseDocumentedNamedElement(supplierFlow);
				if (result == null) result = caseNamedElement(supplierFlow);
				if (result == null) result = caseDocumented(supplierFlow);
				if (result == null) result = caseModelElement(supplierFlow);
				if (result == null) result = caseMarked(supplierFlow);
				if (result == null) result = caseAdaptable(supplierFlow);
				if (result == null) result = caseIMarked(supplierFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.CONSUMER_FLOW: {
				ConsumerFlow consumerFlow = (ConsumerFlow)theEObject;
				T1 result = caseConsumerFlow(consumerFlow);
				if (result == null) result = caseFlow(consumerFlow);
				if (result == null) result = caseCompositeRelationshipTarget(consumerFlow);
				if (result == null) result = caseFlowElement(consumerFlow);
				if (result == null) result = caseDomain(consumerFlow);
				if (result == null) result = caseRelationshipTarget(consumerFlow);
				if (result == null) result = caseArchitectureDescriptionElement(consumerFlow);
				if (result == null) result = caseArchitectureDescription(consumerFlow);
				if (result == null) result = caseDocumentedNamedConnectionTarget(consumerFlow);
				if (result == null) result = caseDocumentedNamedGraphElement(consumerFlow);
				if (result == null) result = caseArchitectureElement(consumerFlow);
				if (result == null) result = caseUndergoer(consumerFlow);
				if (result == null) result = caseDocumentedNamedGraph(consumerFlow);
				if (result == null) result = caseConnectionTarget(consumerFlow);
				if (result == null) result = caseGraphElement(consumerFlow);
				if (result == null) result = caseDocumentedNamedStringIdentity(consumerFlow);
				if (result == null) result = casePeriod(consumerFlow);
				if (result == null) result = caseGraph(consumerFlow);
				if (result == null) result = caseStringIdentity(consumerFlow);
				if (result == null) result = caseSemanticElement(consumerFlow);
				if (result == null) result = caseDocumentedNamedElement(consumerFlow);
				if (result == null) result = caseNamedElement(consumerFlow);
				if (result == null) result = caseDocumented(consumerFlow);
				if (result == null) result = caseModelElement(consumerFlow);
				if (result == null) result = caseMarked(consumerFlow);
				if (result == null) result = caseAdaptable(consumerFlow);
				if (result == null) result = caseIMarked(consumerFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.FUNCTION_FLOW: {
				FunctionFlow functionFlow = (FunctionFlow)theEObject;
				T1 result = caseFunctionFlow(functionFlow);
				if (result == null) result = caseCompositeNode(functionFlow);
				if (result == null) result = caseSupplierFlow(functionFlow);
				if (result == null) result = caseConsumerFlow(functionFlow);
				if (result == null) result = caseNode(functionFlow);
				if (result == null) result = caseFlow(functionFlow);
				if (result == null) result = caseCompositeRelationshipSource(functionFlow);
				if (result == null) result = caseCompositeRelationshipTarget(functionFlow);
				if (result == null) result = caseDomain(functionFlow);
				if (result == null) result = caseArchitectureDescription(functionFlow);
				if (result == null) result = caseRelationshipSource(functionFlow);
				if (result == null) result = caseRelationshipTarget(functionFlow);
				if (result == null) result = caseFlowElement(functionFlow);
				if (result == null) result = caseArchitectureDescriptionElement(functionFlow);
				if (result == null) result = caseArchitectureElement(functionFlow);
				if (result == null) result = caseUndergoer(functionFlow);
				if (result == null) result = caseDocumentedNamedGraph(functionFlow);
				if (result == null) result = caseDocumentedNamedConnectionSource(functionFlow);
				if (result == null) result = caseDocumentedNamedConnectionTarget(functionFlow);
				if (result == null) result = caseDocumentedNamedGraphElement(functionFlow);
				if (result == null) result = caseDocumentedNamedStringIdentity(functionFlow);
				if (result == null) result = casePeriod(functionFlow);
				if (result == null) result = caseGraph(functionFlow);
				if (result == null) result = caseConnectionSource(functionFlow);
				if (result == null) result = caseConnectionTarget(functionFlow);
				if (result == null) result = caseGraphElement(functionFlow);
				if (result == null) result = caseStringIdentity(functionFlow);
				if (result == null) result = caseSemanticElement(functionFlow);
				if (result == null) result = caseDocumentedNamedElement(functionFlow);
				if (result == null) result = caseNamedElement(functionFlow);
				if (result == null) result = caseDocumented(functionFlow);
				if (result == null) result = caseModelElement(functionFlow);
				if (result == null) result = caseMarked(functionFlow);
				if (result == null) result = caseAdaptable(functionFlow);
				if (result == null) result = caseIMarked(functionFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SOURCE: {
				Source source = (Source)theEObject;
				T1 result = caseSource(source);
				if (result == null) result = caseFlowElement(source);
				if (result == null) result = caseArchitectureDescriptionElement(source);
				if (result == null) result = caseDocumentedNamedGraphElement(source);
				if (result == null) result = caseArchitectureElement(source);
				if (result == null) result = caseUndergoer(source);
				if (result == null) result = caseGraphElement(source);
				if (result == null) result = caseDocumentedNamedStringIdentity(source);
				if (result == null) result = casePeriod(source);
				if (result == null) result = caseStringIdentity(source);
				if (result == null) result = caseSemanticElement(source);
				if (result == null) result = caseDocumentedNamedElement(source);
				if (result == null) result = caseNamedElement(source);
				if (result == null) result = caseDocumented(source);
				if (result == null) result = caseModelElement(source);
				if (result == null) result = caseMarked(source);
				if (result == null) result = caseAdaptable(source);
				if (result == null) result = caseIMarked(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SOURCE_SUPPLIER: {
				SourceSupplier sourceSupplier = (SourceSupplier)theEObject;
				T1 result = caseSourceSupplier(sourceSupplier);
				if (result == null) result = caseSupplier(sourceSupplier);
				if (result == null) result = caseSource(sourceSupplier);
				if (result == null) result = caseFlowElement(sourceSupplier);
				if (result == null) result = caseRelationshipSource(sourceSupplier);
				if (result == null) result = caseArchitectureDescriptionElement(sourceSupplier);
				if (result == null) result = caseDocumentedNamedConnectionSource(sourceSupplier);
				if (result == null) result = caseDocumentedNamedGraphElement(sourceSupplier);
				if (result == null) result = caseArchitectureElement(sourceSupplier);
				if (result == null) result = caseUndergoer(sourceSupplier);
				if (result == null) result = caseConnectionSource(sourceSupplier);
				if (result == null) result = caseGraphElement(sourceSupplier);
				if (result == null) result = caseDocumentedNamedStringIdentity(sourceSupplier);
				if (result == null) result = casePeriod(sourceSupplier);
				if (result == null) result = caseStringIdentity(sourceSupplier);
				if (result == null) result = caseSemanticElement(sourceSupplier);
				if (result == null) result = caseDocumentedNamedElement(sourceSupplier);
				if (result == null) result = caseNamedElement(sourceSupplier);
				if (result == null) result = caseDocumented(sourceSupplier);
				if (result == null) result = caseModelElement(sourceSupplier);
				if (result == null) result = caseMarked(sourceSupplier);
				if (result == null) result = caseAdaptable(sourceSupplier);
				if (result == null) result = caseIMarked(sourceSupplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SOURCE_CONSUMER: {
				SourceConsumer sourceConsumer = (SourceConsumer)theEObject;
				T1 result = caseSourceConsumer(sourceConsumer);
				if (result == null) result = caseConsumer(sourceConsumer);
				if (result == null) result = caseSource(sourceConsumer);
				if (result == null) result = caseFlowElement(sourceConsumer);
				if (result == null) result = caseRelationshipTarget(sourceConsumer);
				if (result == null) result = caseArchitectureDescriptionElement(sourceConsumer);
				if (result == null) result = caseDocumentedNamedConnectionTarget(sourceConsumer);
				if (result == null) result = caseDocumentedNamedGraphElement(sourceConsumer);
				if (result == null) result = caseArchitectureElement(sourceConsumer);
				if (result == null) result = caseUndergoer(sourceConsumer);
				if (result == null) result = caseConnectionTarget(sourceConsumer);
				if (result == null) result = caseGraphElement(sourceConsumer);
				if (result == null) result = caseDocumentedNamedStringIdentity(sourceConsumer);
				if (result == null) result = casePeriod(sourceConsumer);
				if (result == null) result = caseStringIdentity(sourceConsumer);
				if (result == null) result = caseSemanticElement(sourceConsumer);
				if (result == null) result = caseDocumentedNamedElement(sourceConsumer);
				if (result == null) result = caseNamedElement(sourceConsumer);
				if (result == null) result = caseDocumented(sourceConsumer);
				if (result == null) result = caseModelElement(sourceConsumer);
				if (result == null) result = caseMarked(sourceConsumer);
				if (result == null) result = caseAdaptable(sourceConsumer);
				if (result == null) result = caseIMarked(sourceConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SOURCE_FUNCTION: {
				SourceFunction sourceFunction = (SourceFunction)theEObject;
				T1 result = caseSourceFunction(sourceFunction);
				if (result == null) result = caseFunction(sourceFunction);
				if (result == null) result = caseSource(sourceFunction);
				if (result == null) result = caseNode(sourceFunction);
				if (result == null) result = caseSupplier(sourceFunction);
				if (result == null) result = caseConsumer(sourceFunction);
				if (result == null) result = caseRelationshipSource(sourceFunction);
				if (result == null) result = caseRelationshipTarget(sourceFunction);
				if (result == null) result = caseFlowElement(sourceFunction);
				if (result == null) result = caseDocumentedNamedConnectionSource(sourceFunction);
				if (result == null) result = caseArchitectureDescriptionElement(sourceFunction);
				if (result == null) result = caseDocumentedNamedConnectionTarget(sourceFunction);
				if (result == null) result = caseDocumentedNamedGraphElement(sourceFunction);
				if (result == null) result = caseConnectionSource(sourceFunction);
				if (result == null) result = caseArchitectureElement(sourceFunction);
				if (result == null) result = caseUndergoer(sourceFunction);
				if (result == null) result = caseConnectionTarget(sourceFunction);
				if (result == null) result = caseGraphElement(sourceFunction);
				if (result == null) result = caseDocumentedNamedStringIdentity(sourceFunction);
				if (result == null) result = casePeriod(sourceFunction);
				if (result == null) result = caseStringIdentity(sourceFunction);
				if (result == null) result = caseSemanticElement(sourceFunction);
				if (result == null) result = caseDocumentedNamedElement(sourceFunction);
				if (result == null) result = caseNamedElement(sourceFunction);
				if (result == null) result = caseDocumented(sourceFunction);
				if (result == null) result = caseModelElement(sourceFunction);
				if (result == null) result = caseMarked(sourceFunction);
				if (result == null) result = caseAdaptable(sourceFunction);
				if (result == null) result = caseIMarked(sourceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SOURCE_TRANSITION: {
				SourceTransition sourceTransition = (SourceTransition)theEObject;
				T1 result = caseSourceTransition(sourceTransition);
				if (result == null) result = caseTransition(sourceTransition);
				if (result == null) result = caseSource(sourceTransition);
				if (result == null) result = caseFlowElement(sourceTransition);
				if (result == null) result = caseRelationship(sourceTransition);
				if (result == null) result = caseArchitectureDescriptionElement(sourceTransition);
				if (result == null) result = caseDocumentedNamedConnection(sourceTransition);
				if (result == null) result = caseDocumentedNamedGraphElement(sourceTransition);
				if (result == null) result = caseArchitectureElement(sourceTransition);
				if (result == null) result = caseUndergoer(sourceTransition);
				if (result == null) result = caseConnection(sourceTransition);
				if (result == null) result = caseGraphElement(sourceTransition);
				if (result == null) result = caseDocumentedNamedStringIdentity(sourceTransition);
				if (result == null) result = casePeriod(sourceTransition);
				if (result == null) result = caseStringIdentity(sourceTransition);
				if (result == null) result = caseSemanticElement(sourceTransition);
				if (result == null) result = caseDocumentedNamedElement(sourceTransition);
				if (result == null) result = caseNamedElement(sourceTransition);
				if (result == null) result = caseDocumented(sourceTransition);
				if (result == null) result = caseModelElement(sourceTransition);
				if (result == null) result = caseMarked(sourceTransition);
				if (result == null) result = caseAdaptable(sourceTransition);
				if (result == null) result = caseIMarked(sourceTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionFlowPackage.SOURCE_ERROR_TRANSITION: {
				SourceErrorTransition sourceErrorTransition = (SourceErrorTransition)theEObject;
				T1 result = caseSourceErrorTransition(sourceErrorTransition);
				if (result == null) result = caseErrorTransition(sourceErrorTransition);
				if (result == null) result = caseSource(sourceErrorTransition);
				if (result == null) result = caseTransition(sourceErrorTransition);
				if (result == null) result = caseFlowElement(sourceErrorTransition);
				if (result == null) result = caseRelationship(sourceErrorTransition);
				if (result == null) result = caseArchitectureDescriptionElement(sourceErrorTransition);
				if (result == null) result = caseDocumentedNamedConnection(sourceErrorTransition);
				if (result == null) result = caseDocumentedNamedGraphElement(sourceErrorTransition);
				if (result == null) result = caseArchitectureElement(sourceErrorTransition);
				if (result == null) result = caseUndergoer(sourceErrorTransition);
				if (result == null) result = caseConnection(sourceErrorTransition);
				if (result == null) result = caseGraphElement(sourceErrorTransition);
				if (result == null) result = caseDocumentedNamedStringIdentity(sourceErrorTransition);
				if (result == null) result = casePeriod(sourceErrorTransition);
				if (result == null) result = caseStringIdentity(sourceErrorTransition);
				if (result == null) result = caseSemanticElement(sourceErrorTransition);
				if (result == null) result = caseDocumentedNamedElement(sourceErrorTransition);
				if (result == null) result = caseNamedElement(sourceErrorTransition);
				if (result == null) result = caseDocumented(sourceErrorTransition);
				if (result == null) result = caseModelElement(sourceErrorTransition);
				if (result == null) result = caseMarked(sourceErrorTransition);
				if (result == null) result = caseAdaptable(sourceErrorTransition);
				if (result == null) result = caseIMarked(sourceErrorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowElement(FlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSupplier(Supplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseErrorHandler(ErrorHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConsumer(Consumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseErrorTransition(ErrorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSupplierFlow(SupplierFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConsumerFlow(ConsumerFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFunctionFlow(FunctionFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceSupplier(SourceSupplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceConsumer(SourceConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceFunction(SourceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceTransition(SourceTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Error Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceErrorTransition(SourceErrorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSemanticElement(SemanticElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentedNamedStringIdentity(DocumentedNamedStringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentedNamedGraphElement(DocumentedNamedGraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseConnectionSource(ConnectionSource<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Connection Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Connection Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseDocumentedNamedConnectionSource(DocumentedNamedConnectionSource<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitectureElement(ArchitectureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undergoer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undergoer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUndergoer(Undergoer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitectureDescriptionElement(ArchitectureDescriptionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationshipSource(RelationshipSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseConnectionTarget(ConnectionTarget<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseDocumentedNamedConnectionTarget(DocumentedNamedConnectionTarget<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationshipTarget(RelationshipTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ConnectionTarget<?>> T1 caseConnection(Connection<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ConnectionTarget<?>> T1 caseDocumentedNamedConnection(DocumentedNamedConnection<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E extends GraphElement> T1 caseGraph(Graph<E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E extends GraphElement> T1 caseDocumentedNamedGraph(DocumentedNamedGraph<E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitectureDescription(ArchitectureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Relationship Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Relationship Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeRelationshipSource(CompositeRelationshipSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Relationship Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Relationship Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeRelationshipTarget(CompositeRelationshipTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeNode(CompositeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //FunctionFlowSwitch
