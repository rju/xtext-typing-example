/**
 */
package de.cau.cs.se.lad.appLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.Function#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.Function#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends BaseExpression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.lad.appLang.FunctionEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.FunctionEnum
   * @see #setName(FunctionEnum)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getFunction_Name()
   * @model
   * @generated
   */
  FunctionEnum getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.FunctionEnum
   * @see #getName()
   * @generated
   */
  void setName(FunctionEnum value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.appLang.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getFunction_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Function
