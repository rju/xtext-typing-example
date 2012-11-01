/**
 */
package de.cau.cs.se.lad.appLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>View Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getViewType()
 * @model
 * @generated
 */
public enum ViewType implements Enumerator
{
  /**
   * The '<em><b>Button</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUTTON_VALUE
   * @generated
   * @ordered
   */
  BUTTON(0, "Button", "button"),

  /**
   * The '<em><b>Value Spinner</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUE_SPINNER_VALUE
   * @generated
   * @ordered
   */
  VALUE_SPINNER(1, "ValueSpinner", "value-spinner"),

  /**
   * The '<em><b>Date Spinner</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_SPINNER_VALUE
   * @generated
   * @ordered
   */
  DATE_SPINNER(2, "DateSpinner", "date-spinner"),

  /**
   * The '<em><b>Label</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LABEL_VALUE
   * @generated
   * @ordered
   */
  LABEL(3, "Label", "label"),

  /**
   * The '<em><b>Text Output</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_OUTPUT_VALUE
   * @generated
   * @ordered
   */
  TEXT_OUTPUT(4, "TextOutput", "text"),

  /**
   * The '<em><b>Input Field</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_FIELD_VALUE
   * @generated
   * @ordered
   */
  INPUT_FIELD(5, "InputField", "input"),

  /**
   * The '<em><b>Canvas</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CANVAS_VALUE
   * @generated
   * @ordered
   */
  CANVAS(6, "Canvas", "canvas"),

  /**
   * The '<em><b>Tree List</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TREE_LIST_VALUE
   * @generated
   * @ordered
   */
  TREE_LIST(7, "TreeList", "tree-list");

  /**
   * The '<em><b>Button</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Button</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUTTON
   * @model name="Button" literal="button"
   * @generated
   * @ordered
   */
  public static final int BUTTON_VALUE = 0;

  /**
   * The '<em><b>Value Spinner</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Value Spinner</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALUE_SPINNER
   * @model name="ValueSpinner" literal="value-spinner"
   * @generated
   * @ordered
   */
  public static final int VALUE_SPINNER_VALUE = 1;

  /**
   * The '<em><b>Date Spinner</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date Spinner</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE_SPINNER
   * @model name="DateSpinner" literal="date-spinner"
   * @generated
   * @ordered
   */
  public static final int DATE_SPINNER_VALUE = 2;

  /**
   * The '<em><b>Label</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Label</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LABEL
   * @model name="Label" literal="label"
   * @generated
   * @ordered
   */
  public static final int LABEL_VALUE = 3;

  /**
   * The '<em><b>Text Output</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text Output</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT_OUTPUT
   * @model name="TextOutput" literal="text"
   * @generated
   * @ordered
   */
  public static final int TEXT_OUTPUT_VALUE = 4;

  /**
   * The '<em><b>Input Field</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Input Field</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INPUT_FIELD
   * @model name="InputField" literal="input"
   * @generated
   * @ordered
   */
  public static final int INPUT_FIELD_VALUE = 5;

  /**
   * The '<em><b>Canvas</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Canvas</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CANVAS
   * @model name="Canvas" literal="canvas"
   * @generated
   * @ordered
   */
  public static final int CANVAS_VALUE = 6;

  /**
   * The '<em><b>Tree List</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tree List</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TREE_LIST
   * @model name="TreeList" literal="tree-list"
   * @generated
   * @ordered
   */
  public static final int TREE_LIST_VALUE = 7;

  /**
   * An array of all the '<em><b>View Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ViewType[] VALUES_ARRAY =
    new ViewType[]
    {
      BUTTON,
      VALUE_SPINNER,
      DATE_SPINNER,
      LABEL,
      TEXT_OUTPUT,
      INPUT_FIELD,
      CANVAS,
      TREE_LIST,
    };

  /**
   * A public read-only list of all the '<em><b>View Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ViewType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>View Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ViewType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ViewType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>View Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ViewType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ViewType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>View Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ViewType get(int value)
  {
    switch (value)
    {
      case BUTTON_VALUE: return BUTTON;
      case VALUE_SPINNER_VALUE: return VALUE_SPINNER;
      case DATE_SPINNER_VALUE: return DATE_SPINNER;
      case LABEL_VALUE: return LABEL;
      case TEXT_OUTPUT_VALUE: return TEXT_OUTPUT;
      case INPUT_FIELD_VALUE: return INPUT_FIELD;
      case CANVAS_VALUE: return CANVAS;
      case TREE_LIST_VALUE: return TREE_LIST;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ViewType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ViewType
