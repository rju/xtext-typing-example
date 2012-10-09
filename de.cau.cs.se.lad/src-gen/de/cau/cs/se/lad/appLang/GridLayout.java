/**
 */
package de.cau.cs.se.lad.appLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.GridLayout#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getGridLayout()
 * @model
 * @generated
 */
public interface GridLayout extends Layout
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference.
   * @see #setFields(Field)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getGridLayout_Fields()
   * @model containment="true"
   * @generated
   */
  Field getFields();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.GridLayout#getFields <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' containment reference.
   * @see #getFields()
   * @generated
   */
  void setFields(Field value);

} // GridLayout
