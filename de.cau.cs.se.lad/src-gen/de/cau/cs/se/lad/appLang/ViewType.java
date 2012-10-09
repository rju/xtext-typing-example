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
   * The '<em><b>BUTTON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUTTON_VALUE
   * @generated
   * @ordered
   */
  BUTTON(0, "BUTTON", "button"),

  /**
   * The '<em><b>VSPIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VSPIN_VALUE
   * @generated
   * @ordered
   */
  VSPIN(1, "VSPIN", "value-spinner"),

  /**
   * The '<em><b>DATESPIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATESPIN_VALUE
   * @generated
   * @ordered
   */
  DATESPIN(2, "DATESPIN", "date-spinner"),

  /**
   * The '<em><b>LABEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LABEL_VALUE
   * @generated
   * @ordered
   */
  LABEL(3, "LABEL", "label"),

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
  CANVAS(6, "Canvas", "canvas");

  /**
   * The '<em><b>BUTTON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BUTTON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUTTON
   * @model literal="button"
   * @generated
   * @ordered
   */
  public static final int BUTTON_VALUE = 0;

  /**
   * The '<em><b>VSPIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VSPIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VSPIN
   * @model literal="value-spinner"
   * @generated
   * @ordered
   */
  public static final int VSPIN_VALUE = 1;

  /**
   * The '<em><b>DATESPIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATESPIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATESPIN
   * @model literal="date-spinner"
   * @generated
   * @ordered
   */
  public static final int DATESPIN_VALUE = 2;

  /**
   * The '<em><b>LABEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LABEL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LABEL
   * @model literal="label"
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
   * An array of all the '<em><b>View Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ViewType[] VALUES_ARRAY =
    new ViewType[]
    {
      BUTTON,
      VSPIN,
      DATESPIN,
      LABEL,
      TEXT_OUTPUT,
      INPUT_FIELD,
      CANVAS,
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
      case VSPIN_VALUE: return VSPIN;
      case DATESPIN_VALUE: return DATESPIN;
      case LABEL_VALUE: return LABEL;
      case TEXT_OUTPUT_VALUE: return TEXT_OUTPUT;
      case INPUT_FIELD_VALUE: return INPUT_FIELD;
      case CANVAS_VALUE: return CANVAS;
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
