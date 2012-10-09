/**
 */
package de.cau.cs.se.lad.appLang;

import de.cau.cs.se.lad.types.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.StringProperty#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getStringProperty()
 * @model
 * @generated
 */
public interface StringProperty extends StringValue
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Property)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getStringProperty_Reference()
   * @model
   * @generated
   */
  Property getReference();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.StringProperty#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Property value);

} // StringProperty
