/**
 */
package de.cau.cs.se.lad.appLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.SizeExpr#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.SizeExpr#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSizeExpr()
 * @model
 * @generated
 */
public interface SizeExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSizeExpr_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.SizeExpr#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.lad.appLang.Unit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.Unit
   * @see #setUnit(Unit)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getSizeExpr_Unit()
   * @model
   * @generated
   */
  Unit getUnit();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.SizeExpr#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.Unit
   * @see #getUnit()
   * @generated
   */
  void setUnit(Unit value);

} // SizeExpr
