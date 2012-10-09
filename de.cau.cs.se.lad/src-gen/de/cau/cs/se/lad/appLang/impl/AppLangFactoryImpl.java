/**
 */
package de.cau.cs.se.lad.appLang.impl;

import de.cau.cs.se.lad.appLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppLangFactoryImpl extends EFactoryImpl implements AppLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AppLangFactory init()
  {
    try
    {
      AppLangFactory theAppLangFactory = (AppLangFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/se/lad/AppLang"); 
      if (theAppLangFactory != null)
      {
        return theAppLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AppLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AppLangPackage.MODEL: return createModel();
      case AppLangPackage.SERVICE: return createService();
      case AppLangPackage.OPERATION: return createOperation();
      case AppLangPackage.EXPRESSION: return createExpression();
      case AppLangPackage.BASE_EXPRESSION: return createBaseExpression();
      case AppLangPackage.STRING_EXPRESSION: return createStringExpression();
      case AppLangPackage.STRING_VALUE: return createStringValue();
      case AppLangPackage.STRING_PROPERTY: return createStringProperty();
      case AppLangPackage.STRING_LITERAL: return createStringLiteral();
      case AppLangPackage.NULL_LITERAL: return createNullLiteral();
      case AppLangPackage.FUNCTION: return createFunction();
      case AppLangPackage.DATA_MODEL: return createDataModel();
      case AppLangPackage.INSTANCE: return createInstance();
      case AppLangPackage.ARRAY_INSTANCE: return createArrayInstance();
      case AppLangPackage.SIMPLE_INSTANCE: return createSimpleInstance();
      case AppLangPackage.VIEW: return createView();
      case AppLangPackage.VIEW_CONTENT: return createViewContent();
      case AppLangPackage.VIEW_CONTAINER: return createViewContainer();
      case AppLangPackage.VIEW_ELEMENT: return createViewElement();
      case AppLangPackage.LAYOUT: return createLayout();
      case AppLangPackage.GRID_LAYOUT: return createGridLayout();
      case AppLangPackage.FIELD: return createField();
      case AppLangPackage.STACK_LAYOUT: return createStackLayout();
      case AppLangPackage.SIZE: return createSize();
      case AppLangPackage.SIZE_EXPR: return createSizeExpr();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AppLangPackage.FUNCTION_ENUM:
        return createFunctionEnumFromString(eDataType, initialValue);
      case AppLangPackage.VIEW_TYPE:
        return createViewTypeFromString(eDataType, initialValue);
      case AppLangPackage.UNIT:
        return createUnitFromString(eDataType, initialValue);
      case AppLangPackage.DIRECTION:
        return createDirectionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AppLangPackage.FUNCTION_ENUM:
        return convertFunctionEnumToString(eDataType, instanceValue);
      case AppLangPackage.VIEW_TYPE:
        return convertViewTypeToString(eDataType, instanceValue);
      case AppLangPackage.UNIT:
        return convertUnitToString(eDataType, instanceValue);
      case AppLangPackage.DIRECTION:
        return convertDirectionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseExpression createBaseExpression()
  {
    BaseExpressionImpl baseExpression = new BaseExpressionImpl();
    return baseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringProperty createStringProperty()
  {
    StringPropertyImpl stringProperty = new StringPropertyImpl();
    return stringProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel createDataModel()
  {
    DataModelImpl dataModel = new DataModelImpl();
    return dataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInstance createArrayInstance()
  {
    ArrayInstanceImpl arrayInstance = new ArrayInstanceImpl();
    return arrayInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleInstance createSimpleInstance()
  {
    SimpleInstanceImpl simpleInstance = new SimpleInstanceImpl();
    return simpleInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewContent createViewContent()
  {
    ViewContentImpl viewContent = new ViewContentImpl();
    return viewContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewContainer createViewContainer()
  {
    ViewContainerImpl viewContainer = new ViewContainerImpl();
    return viewContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewElement createViewElement()
  {
    ViewElementImpl viewElement = new ViewElementImpl();
    return viewElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridLayout createGridLayout()
  {
    GridLayoutImpl gridLayout = new GridLayoutImpl();
    return gridLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StackLayout createStackLayout()
  {
    StackLayoutImpl stackLayout = new StackLayoutImpl();
    return stackLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeExpr createSizeExpr()
  {
    SizeExprImpl sizeExpr = new SizeExprImpl();
    return sizeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionEnum createFunctionEnumFromString(EDataType eDataType, String initialValue)
  {
    FunctionEnum result = FunctionEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFunctionEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType createViewTypeFromString(EDataType eDataType, String initialValue)
  {
    ViewType result = ViewType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertViewTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit createUnitFromString(EDataType eDataType, String initialValue)
  {
    Unit result = Unit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirectionFromString(EDataType eDataType, String initialValue)
  {
    Direction result = Direction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppLangPackage getAppLangPackage()
  {
    return (AppLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AppLangPackage getPackage()
  {
    return AppLangPackage.eINSTANCE;
  }

} //AppLangFactoryImpl
