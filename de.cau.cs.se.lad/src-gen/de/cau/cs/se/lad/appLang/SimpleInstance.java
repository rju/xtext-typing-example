/**
 */
package de.cau.cs.se.lad.appLang;

import de.cau.cs.se.lad.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.SimpleInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSimpleInstance()
 * @model
 * @generated
 */
public interface SimpleInstance extends Instance
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSimpleInstance_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.SimpleInstance#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // SimpleInstance
