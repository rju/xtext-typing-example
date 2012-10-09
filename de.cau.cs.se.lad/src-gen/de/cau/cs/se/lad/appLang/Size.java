/**
 */
package de.cau.cs.se.lad.appLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.Size#getWidth <em>Width</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.Size#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSize()
 * @model
 * @generated
 */
public interface Size extends EObject
{
  /**
   * Returns the value of the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' containment reference.
   * @see #setWidth(SizeExpr)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSize_Width()
   * @model containment="true"
   * @generated
   */
  SizeExpr getWidth();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.Size#getWidth <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' containment reference.
   * @see #getWidth()
   * @generated
   */
  void setWidth(SizeExpr value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' containment reference.
   * @see #setHeight(SizeExpr)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSize_Height()
   * @model containment="true"
   * @generated
   */
  SizeExpr getHeight();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.Size#getHeight <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' containment reference.
   * @see #getHeight()
   * @generated
   */
  void setHeight(SizeExpr value);

} // Size
