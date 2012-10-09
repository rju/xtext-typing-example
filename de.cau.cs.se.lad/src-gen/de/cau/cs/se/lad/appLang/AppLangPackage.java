/**
 */
package de.cau.cs.se.lad.appLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.lad.appLang.AppLangFactory
 * @model kind="package"
 * @generated
 */
public interface AppLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "appLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/se/lad/AppLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "appLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AppLangPackage eINSTANCE = de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ModelImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SERVICES = 0;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VIEWS = 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLASSES = 2;

  /**
   * The feature id for the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODEL = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ServiceImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getService()
   * @generated
   */
  int SERVICE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CONFIGURATIONS = 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__OPERATIONS = 2;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.OperationImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ExpressionImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.BaseExpressionImpl <em>Base Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.BaseExpressionImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getBaseExpression()
   * @generated
   */
  int BASE_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Base Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.StringExpressionImpl <em>String Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.StringExpressionImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringExpression()
   * @generated
   */
  int STRING_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__LEFT = BASE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__RIGHT = BASE_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>String Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.StringValueImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__LEFT = STRING_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__RIGHT = STRING_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = STRING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.StringPropertyImpl <em>String Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.StringPropertyImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringProperty()
   * @generated
   */
  int STRING_PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY__LEFT = STRING_VALUE__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY__RIGHT = STRING_VALUE__RIGHT;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY__REFERENCE = STRING_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY_FEATURE_COUNT = STRING_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.StringLiteralImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LEFT = STRING_VALUE__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__RIGHT = STRING_VALUE__RIGHT;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LITERAL = STRING_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = STRING_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.NullLiteralImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__LEFT = BASE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__RIGHT = BASE_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.FunctionImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__LEFT = BASE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RIGHT = BASE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPRESSIONS = BASE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.DataModelImpl <em>Data Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.DataModelImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getDataModel()
   * @generated
   */
  int DATA_MODEL = 11;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__INSTANCES = 0;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__VIEW = 1;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.InstanceImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ArrayInstanceImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getArrayInstance()
   * @generated
   */
  int ARRAY_INSTANCE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANCE__NAME = INSTANCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANCE__TYPE = INSTANCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.SimpleInstanceImpl <em>Simple Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.SimpleInstanceImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getSimpleInstance()
   * @generated
   */
  int SIMPLE_INSTANCE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_INSTANCE__NAME = INSTANCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_INSTANCE__TYPE = INSTANCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ViewImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getView()
   * @generated
   */
  int VIEW = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__LAYOUT = 1;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__CONTENTS = 2;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ViewContentImpl <em>View Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ViewContentImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewContent()
   * @generated
   */
  int VIEW_CONTENT = 16;

  /**
   * The number of structural features of the '<em>View Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ViewContainerImpl <em>View Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ViewContainerImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewContainer()
   * @generated
   */
  int VIEW_CONTAINER = 17;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__LAYOUT = VIEW_CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__CONTENTS = VIEW_CONTENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>View Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER_FEATURE_COUNT = VIEW_CONTENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.ViewElementImpl <em>View Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.ViewElementImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewElement()
   * @generated
   */
  int VIEW_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__TYPE = VIEW_CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__NAME = VIEW_CONTENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>View Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_FEATURE_COUNT = VIEW_CONTENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.LayoutImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 19;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__SIZE = 0;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.GridLayoutImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getGridLayout()
   * @generated
   */
  int GRID_LAYOUT = 20;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__SIZE = LAYOUT__SIZE;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__FIELDS = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Grid Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.FieldImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getField()
   * @generated
   */
  int FIELD = 21;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__WIDTH = 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__HEIGHT = 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.StackLayoutImpl <em>Stack Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.StackLayoutImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStackLayout()
   * @generated
   */
  int STACK_LAYOUT = 22;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STACK_LAYOUT__SIZE = LAYOUT__SIZE;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STACK_LAYOUT__DIRECTION = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stack Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STACK_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.SizeImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getSize()
   * @generated
   */
  int SIZE = 23;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__WIDTH = 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__HEIGHT = 1;

  /**
   * The number of structural features of the '<em>Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.impl.SizeExprImpl <em>Size Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.impl.SizeExprImpl
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getSizeExpr()
   * @generated
   */
  int SIZE_EXPR = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_EXPR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_EXPR__UNIT = 1;

  /**
   * The number of structural features of the '<em>Size Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.FunctionEnum <em>Function Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.FunctionEnum
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getFunctionEnum()
   * @generated
   */
  int FUNCTION_ENUM = 25;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.ViewType <em>View Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.ViewType
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewType()
   * @generated
   */
  int VIEW_TYPE = 26;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.Unit <em>Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.Unit
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getUnit()
   * @generated
   */
  int UNIT = 27;

  /**
   * The meta object id for the '{@link de.cau.cs.se.lad.appLang.Direction <em>Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.se.lad.appLang.Direction
   * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getDirection()
   * @generated
   */
  int DIRECTION = 28;


  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.cau.cs.se.lad.appLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.Model#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see de.cau.cs.se.lad.appLang.Model#getServices()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Services();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.Model#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see de.cau.cs.se.lad.appLang.Model#getViews()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Views();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.Model#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see de.cau.cs.se.lad.appLang.Model#getClasses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Classes();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.Model#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model</em>'.
   * @see de.cau.cs.se.lad.appLang.Model#getModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Model();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see de.cau.cs.se.lad.appLang.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.lad.appLang.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.Service#getConfigurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configurations</em>'.
   * @see de.cau.cs.se.lad.appLang.Service#getConfigurations()
   * @see #getService()
   * @generated
   */
  EReference getService_Configurations();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.Service#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see de.cau.cs.se.lad.appLang.Service#getOperations()
   * @see #getService()
   * @generated
   */
  EReference getService_Operations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.cau.cs.se.lad.appLang.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.lad.appLang.Operation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.lad.appLang.Operation#getType()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.lad.appLang.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.cau.cs.se.lad.appLang.Operation#getParameters()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.Operation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.se.lad.appLang.Operation#getExpression()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.cau.cs.se.lad.appLang.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.cau.cs.se.lad.appLang.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.cau.cs.se.lad.appLang.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.BaseExpression <em>Base Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Expression</em>'.
   * @see de.cau.cs.se.lad.appLang.BaseExpression
   * @generated
   */
  EClass getBaseExpression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expression</em>'.
   * @see de.cau.cs.se.lad.appLang.StringExpression
   * @generated
   */
  EClass getStringExpression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see de.cau.cs.se.lad.appLang.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.StringProperty <em>String Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Property</em>'.
   * @see de.cau.cs.se.lad.appLang.StringProperty
   * @generated
   */
  EClass getStringProperty();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.lad.appLang.StringProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.se.lad.appLang.StringProperty#getReference()
   * @see #getStringProperty()
   * @generated
   */
  EReference getStringProperty_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see de.cau.cs.se.lad.appLang.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.StringLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see de.cau.cs.se.lad.appLang.StringLiteral#getLiteral()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Literal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see de.cau.cs.se.lad.appLang.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see de.cau.cs.se.lad.appLang.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.Function#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.se.lad.appLang.Function#getType()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.Function#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see de.cau.cs.se.lad.appLang.Function#getExpressions()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Expressions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Model</em>'.
   * @see de.cau.cs.se.lad.appLang.DataModel
   * @generated
   */
  EClass getDataModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.DataModel#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see de.cau.cs.se.lad.appLang.DataModel#getInstances()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Instances();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.lad.appLang.DataModel#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see de.cau.cs.se.lad.appLang.DataModel#getView()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_View();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see de.cau.cs.se.lad.appLang.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.lad.appLang.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.ArrayInstance <em>Array Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Instance</em>'.
   * @see de.cau.cs.se.lad.appLang.ArrayInstance
   * @generated
   */
  EClass getArrayInstance();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.ArrayInstance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.se.lad.appLang.ArrayInstance#getType()
   * @see #getArrayInstance()
   * @generated
   */
  EReference getArrayInstance_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.SimpleInstance <em>Simple Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Instance</em>'.
   * @see de.cau.cs.se.lad.appLang.SimpleInstance
   * @generated
   */
  EClass getSimpleInstance();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.se.lad.appLang.SimpleInstance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.se.lad.appLang.SimpleInstance#getType()
   * @see #getSimpleInstance()
   * @generated
   */
  EReference getSimpleInstance_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see de.cau.cs.se.lad.appLang.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.lad.appLang.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.View#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see de.cau.cs.se.lad.appLang.View#getLayout()
   * @see #getView()
   * @generated
   */
  EReference getView_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.View#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see de.cau.cs.se.lad.appLang.View#getContents()
   * @see #getView()
   * @generated
   */
  EReference getView_Contents();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.ViewContent <em>View Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Content</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewContent
   * @generated
   */
  EClass getViewContent();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.ViewContainer <em>View Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Container</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewContainer
   * @generated
   */
  EClass getViewContainer();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.ViewContainer#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewContainer#getLayout()
   * @see #getViewContainer()
   * @generated
   */
  EReference getViewContainer_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.se.lad.appLang.ViewContainer#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewContainer#getContents()
   * @see #getViewContainer()
   * @generated
   */
  EReference getViewContainer_Contents();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.ViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Element</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewElement
   * @generated
   */
  EClass getViewElement();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.ViewElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewElement#getType()
   * @see #getViewElement()
   * @generated
   */
  EAttribute getViewElement_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.ViewElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewElement#getName()
   * @see #getViewElement()
   * @generated
   */
  EAttribute getViewElement_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see de.cau.cs.se.lad.appLang.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.Layout#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see de.cau.cs.se.lad.appLang.Layout#getSize()
   * @see #getLayout()
   * @generated
   */
  EReference getLayout_Size();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.GridLayout <em>Grid Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid Layout</em>'.
   * @see de.cau.cs.se.lad.appLang.GridLayout
   * @generated
   */
  EClass getGridLayout();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.GridLayout#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see de.cau.cs.se.lad.appLang.GridLayout#getFields()
   * @see #getGridLayout()
   * @generated
   */
  EReference getGridLayout_Fields();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see de.cau.cs.se.lad.appLang.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.Field#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see de.cau.cs.se.lad.appLang.Field#getWidth()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Width();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.Field#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see de.cau.cs.se.lad.appLang.Field#getHeight()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Height();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.StackLayout <em>Stack Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stack Layout</em>'.
   * @see de.cau.cs.se.lad.appLang.StackLayout
   * @generated
   */
  EClass getStackLayout();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.StackLayout#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see de.cau.cs.se.lad.appLang.StackLayout#getDirection()
   * @see #getStackLayout()
   * @generated
   */
  EAttribute getStackLayout_Direction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see de.cau.cs.se.lad.appLang.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.Size#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see de.cau.cs.se.lad.appLang.Size#getWidth()
   * @see #getSize()
   * @generated
   */
  EReference getSize_Width();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.se.lad.appLang.Size#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see de.cau.cs.se.lad.appLang.Size#getHeight()
   * @see #getSize()
   * @generated
   */
  EReference getSize_Height();

  /**
   * Returns the meta object for class '{@link de.cau.cs.se.lad.appLang.SizeExpr <em>Size Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Expr</em>'.
   * @see de.cau.cs.se.lad.appLang.SizeExpr
   * @generated
   */
  EClass getSizeExpr();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.SizeExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.se.lad.appLang.SizeExpr#getValue()
   * @see #getSizeExpr()
   * @generated
   */
  EAttribute getSizeExpr_Value();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.se.lad.appLang.SizeExpr#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see de.cau.cs.se.lad.appLang.SizeExpr#getUnit()
   * @see #getSizeExpr()
   * @generated
   */
  EAttribute getSizeExpr_Unit();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.lad.appLang.FunctionEnum <em>Function Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Function Enum</em>'.
   * @see de.cau.cs.se.lad.appLang.FunctionEnum
   * @generated
   */
  EEnum getFunctionEnum();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.lad.appLang.ViewType <em>View Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>View Type</em>'.
   * @see de.cau.cs.se.lad.appLang.ViewType
   * @generated
   */
  EEnum getViewType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.lad.appLang.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unit</em>'.
   * @see de.cau.cs.se.lad.appLang.Unit
   * @generated
   */
  EEnum getUnit();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.se.lad.appLang.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Direction</em>'.
   * @see de.cau.cs.se.lad.appLang.Direction
   * @generated
   */
  EEnum getDirection();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AppLangFactory getAppLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ModelImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SERVICES = eINSTANCE.getModel_Services();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__VIEWS = eINSTANCE.getModel_Views();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CLASSES = eINSTANCE.getModel_Classes();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODEL = eINSTANCE.getModel_Model();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ServiceImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CONFIGURATIONS = eINSTANCE.getService_Configurations();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__OPERATIONS = eINSTANCE.getService_Operations();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.OperationImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__TYPE = eINSTANCE.getOperation_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__EXPRESSION = eINSTANCE.getOperation_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ExpressionImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.BaseExpressionImpl <em>Base Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.BaseExpressionImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getBaseExpression()
     * @generated
     */
    EClass BASE_EXPRESSION = eINSTANCE.getBaseExpression();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.StringExpressionImpl <em>String Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.StringExpressionImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringExpression()
     * @generated
     */
    EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.StringValueImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.StringPropertyImpl <em>String Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.StringPropertyImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringProperty()
     * @generated
     */
    EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_PROPERTY__REFERENCE = eINSTANCE.getStringProperty_Reference();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.StringLiteralImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__LITERAL = eINSTANCE.getStringLiteral_Literal();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.NullLiteralImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.FunctionImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__TYPE = eINSTANCE.getFunction_Type();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPRESSIONS = eINSTANCE.getFunction_Expressions();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.DataModelImpl <em>Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.DataModelImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getDataModel()
     * @generated
     */
    EClass DATA_MODEL = eINSTANCE.getDataModel();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__INSTANCES = eINSTANCE.getDataModel_Instances();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__VIEW = eINSTANCE.getDataModel_View();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.InstanceImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ArrayInstanceImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getArrayInstance()
     * @generated
     */
    EClass ARRAY_INSTANCE = eINSTANCE.getArrayInstance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INSTANCE__TYPE = eINSTANCE.getArrayInstance_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.SimpleInstanceImpl <em>Simple Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.SimpleInstanceImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getSimpleInstance()
     * @generated
     */
    EClass SIMPLE_INSTANCE = eINSTANCE.getSimpleInstance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_INSTANCE__TYPE = eINSTANCE.getSimpleInstance_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ViewImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__LAYOUT = eINSTANCE.getView_Layout();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__CONTENTS = eINSTANCE.getView_Contents();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ViewContentImpl <em>View Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ViewContentImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewContent()
     * @generated
     */
    EClass VIEW_CONTENT = eINSTANCE.getViewContent();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ViewContainerImpl <em>View Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ViewContainerImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewContainer()
     * @generated
     */
    EClass VIEW_CONTAINER = eINSTANCE.getViewContainer();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CONTAINER__LAYOUT = eINSTANCE.getViewContainer_Layout();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CONTAINER__CONTENTS = eINSTANCE.getViewContainer_Contents();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.ViewElementImpl <em>View Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.ViewElementImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewElement()
     * @generated
     */
    EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_ELEMENT__TYPE = eINSTANCE.getViewElement_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_ELEMENT__NAME = eINSTANCE.getViewElement_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.LayoutImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT__SIZE = eINSTANCE.getLayout_Size();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.GridLayoutImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getGridLayout()
     * @generated
     */
    EClass GRID_LAYOUT = eINSTANCE.getGridLayout();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_LAYOUT__FIELDS = eINSTANCE.getGridLayout_Fields();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.FieldImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__WIDTH = eINSTANCE.getField_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__HEIGHT = eINSTANCE.getField_Height();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.StackLayoutImpl <em>Stack Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.StackLayoutImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getStackLayout()
     * @generated
     */
    EClass STACK_LAYOUT = eINSTANCE.getStackLayout();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STACK_LAYOUT__DIRECTION = eINSTANCE.getStackLayout_Direction();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.SizeImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getSize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getSize();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE__WIDTH = eINSTANCE.getSize_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE__HEIGHT = eINSTANCE.getSize_Height();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.impl.SizeExprImpl <em>Size Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.impl.SizeExprImpl
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getSizeExpr()
     * @generated
     */
    EClass SIZE_EXPR = eINSTANCE.getSizeExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_EXPR__VALUE = eINSTANCE.getSizeExpr_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_EXPR__UNIT = eINSTANCE.getSizeExpr_Unit();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.FunctionEnum <em>Function Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.FunctionEnum
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getFunctionEnum()
     * @generated
     */
    EEnum FUNCTION_ENUM = eINSTANCE.getFunctionEnum();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.ViewType <em>View Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.ViewType
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getViewType()
     * @generated
     */
    EEnum VIEW_TYPE = eINSTANCE.getViewType();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.Unit <em>Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.Unit
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getUnit()
     * @generated
     */
    EEnum UNIT = eINSTANCE.getUnit();

    /**
     * The meta object literal for the '{@link de.cau.cs.se.lad.appLang.Direction <em>Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.se.lad.appLang.Direction
     * @see de.cau.cs.se.lad.appLang.impl.AppLangPackageImpl#getDirection()
     * @generated
     */
    EEnum DIRECTION = eINSTANCE.getDirection();

  }

} //AppLangPackage
