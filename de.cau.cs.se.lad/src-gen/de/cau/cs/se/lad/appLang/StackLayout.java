/**
 */
package de.cau.cs.se.lad.appLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.StackLayout#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getStackLayout()
 * @model
 * @generated
 */
public interface StackLayout extends Layout
{
  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.lad.appLang.Direction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.Direction
   * @see #setDirection(Direction)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getStackLayout_Direction()
   * @model
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.StackLayout#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.Direction
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

} // StackLayout
