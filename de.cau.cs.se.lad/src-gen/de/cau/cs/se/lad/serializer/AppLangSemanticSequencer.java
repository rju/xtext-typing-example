package de.cau.cs.se.lad.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.se.lad.appLang.AppLangPackage;
import de.cau.cs.se.lad.appLang.ArrayInstance;
import de.cau.cs.se.lad.appLang.DataModel;
import de.cau.cs.se.lad.appLang.Expression;
import de.cau.cs.se.lad.appLang.Field;
import de.cau.cs.se.lad.appLang.Function;
import de.cau.cs.se.lad.appLang.GridLayout;
import de.cau.cs.se.lad.appLang.Model;
import de.cau.cs.se.lad.appLang.NullLiteral;
import de.cau.cs.se.lad.appLang.Operation;
import de.cau.cs.se.lad.appLang.Service;
import de.cau.cs.se.lad.appLang.SimpleInstance;
import de.cau.cs.se.lad.appLang.Size;
import de.cau.cs.se.lad.appLang.SizeExpr;
import de.cau.cs.se.lad.appLang.StackLayout;
import de.cau.cs.se.lad.appLang.StringExpression;
import de.cau.cs.se.lad.appLang.StringLiteral;
import de.cau.cs.se.lad.appLang.StringProperty;
import de.cau.cs.se.lad.appLang.View;
import de.cau.cs.se.lad.appLang.ViewContainer;
import de.cau.cs.se.lad.appLang.ViewElement;
import de.cau.cs.se.lad.services.AppLangGrammarAccess;
import de.cau.cs.se.lad.types.ArrayType;
import de.cau.cs.se.lad.types.ClassType;
import de.cau.cs.se.lad.types.Property;
import de.cau.cs.se.lad.types.TypesPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AppLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AppLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AppLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AppLangPackage.ARRAY_INSTANCE:
				if(context == grammarAccess.getArrayInstanceRule() ||
				   context == grammarAccess.getInstanceRule()) {
					sequence_ArrayInstance(context, (ArrayInstance) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.DATA_MODEL:
				if(context == grammarAccess.getDataModelRule()) {
					sequence_DataModel(context, (DataModel) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.FUNCTION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.GRID_LAYOUT:
				if(context == grammarAccess.getGridLayoutRule() ||
				   context == grammarAccess.getLayoutRule()) {
					sequence_GridLayout(context, (GridLayout) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.NULL_LITERAL:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNullLiteralRule()) {
					sequence_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.SERVICE:
				if(context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.SIMPLE_INSTANCE:
				if(context == grammarAccess.getInstanceRule() ||
				   context == grammarAccess.getSimpleInstanceRule()) {
					sequence_SimpleInstance(context, (SimpleInstance) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.SIZE:
				if(context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.SIZE_EXPR:
				if(context == grammarAccess.getSizeExprRule()) {
					sequence_SizeExpr(context, (SizeExpr) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.STACK_LAYOUT:
				if(context == grammarAccess.getLayoutRule() ||
				   context == grammarAccess.getStackLayoutRule()) {
					sequence_StackLayout(context, (StackLayout) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.STRING_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getStringExpressionRule() ||
				   context == grammarAccess.getStringExpressionAccess().getStringExpressionLeftAction_1_0()) {
					sequence_StringExpression(context, (StringExpression) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.STRING_LITERAL:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getStringExpressionRule() ||
				   context == grammarAccess.getStringExpressionAccess().getStringExpressionLeftAction_1_0() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getStringValueRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.STRING_PROPERTY:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getStringExpressionRule() ||
				   context == grammarAccess.getStringExpressionAccess().getStringExpressionLeftAction_1_0() ||
				   context == grammarAccess.getStringPropertyRule() ||
				   context == grammarAccess.getStringValueRule()) {
					sequence_StringProperty(context, (StringProperty) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.VIEW:
				if(context == grammarAccess.getViewRule()) {
					sequence_View(context, (View) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.VIEW_CONTAINER:
				if(context == grammarAccess.getViewContainerRule() ||
				   context == grammarAccess.getViewContentRule()) {
					sequence_ViewContainer(context, (ViewContainer) semanticObject); 
					return; 
				}
				else break;
			case AppLangPackage.VIEW_ELEMENT:
				if(context == grammarAccess.getViewContentRule() ||
				   context == grammarAccess.getViewElementRule()) {
					sequence_ViewElement(context, (ViewElement) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArrayTypeRule()) {
					sequence_ArrayType(context, (ArrayType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.CLASS_TYPE:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (ClassType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type=ArrayType name=ID)
	 */
	protected void sequence_ArrayInstance(EObject context, ArrayInstance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.INSTANCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.ARRAY_INSTANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.ARRAY_INSTANCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayInstanceAccess().getTypeArrayTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getArrayInstanceAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] size=INT?)
	 */
	protected void sequence_ArrayType(EObject context, ArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[ClassType|ID]? properties+=Property)
	 */
	protected void sequence_Class(EObject context, ClassType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instances+=Instance* view=[Instance|ID])
	 */
	protected void sequence_DataModel(EObject context, DataModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Expression_1_0 right=BaseExpression)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getRightBaseExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.FIELD__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.FIELD__WIDTH));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.FIELD__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.FIELD__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldAccess().getWidthINTTerminalRuleCall_1_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getFieldAccess().getHeightINTTerminalRuleCall_3_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=FunctionEnum expressions+=Expression expressions+=Expression*)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (size=Size fields=Field)
	 */
	protected void sequence_GridLayout(EObject context, GridLayout semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.LAYOUT__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.LAYOUT__SIZE));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.GRID_LAYOUT__FIELDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.GRID_LAYOUT__FIELDS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGridLayoutAccess().getSizeSizeParserRuleCall_0_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getGridLayoutAccess().getFieldsFieldParserRuleCall_1_0(), semanticObject.getFields());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((services+=Service | views+=View | classes+=Class)* model=DataModel)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteral}
	 */
	protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=ID parameters+=Property parameters+=Property* expression=Expression)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=ID)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.PROPERTY__TYPE));
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.PROPERTY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID configurations+=Property configurations+=Property* operations+=Operation)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=ID)
	 */
	protected void sequence_SimpleInstance(EObject context, SimpleInstance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.INSTANCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.SIMPLE_INSTANCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.SIMPLE_INSTANCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleInstanceAccess().getTypeTypeIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getSimpleInstanceAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT unit=Unit)
	 */
	protected void sequence_SizeExpr(EObject context, SizeExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.SIZE_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.SIZE_EXPR__VALUE));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.SIZE_EXPR__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.SIZE_EXPR__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeExprAccess().getValueINTTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSizeExprAccess().getUnitUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (width=SizeExpr height=SizeExpr)
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.SIZE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.SIZE__WIDTH));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.SIZE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.SIZE__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeAccess().getWidthSizeExprParserRuleCall_1_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeAccess().getHeightSizeExprParserRuleCall_3_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (size=Size direction=Direction)
	 */
	protected void sequence_StackLayout(EObject context, StackLayout semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.LAYOUT__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.LAYOUT__SIZE));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.STACK_LAYOUT__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.STACK_LAYOUT__DIRECTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStackLayoutAccess().getSizeSizeParserRuleCall_0_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getStackLayoutAccess().getDirectionDirectionEnumRuleCall_1_0(), semanticObject.getDirection());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=StringExpression_StringExpression_1_0 right=StringValue)
	 */
	protected void sequence_StringExpression(EObject context, StringExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringExpressionAccess().getStringExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getStringExpressionAccess().getRightStringValueParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=[Property|ID]
	 */
	protected void sequence_StringProperty(EObject context, StringProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (layout=Layout contents+=ViewContent*)
	 */
	protected void sequence_ViewContainer(EObject context, ViewContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ViewType name=ID)
	 */
	protected void sequence_ViewElement(EObject context, ViewElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.VIEW_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.VIEW_ELEMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, AppLangPackage.Literals.VIEW_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppLangPackage.Literals.VIEW_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getViewElementAccess().getTypeViewTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getViewElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layout=Layout contents+=ViewContent*)
	 */
	protected void sequence_View(EObject context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
