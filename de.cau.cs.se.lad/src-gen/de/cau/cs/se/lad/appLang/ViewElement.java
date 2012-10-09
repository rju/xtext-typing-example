/**
 */
package de.cau.cs.se.lad.appLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.ViewElement#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.ViewElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getViewElement()
 * @model
 * @generated
 */
public interface ViewElement extends ViewContent
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.se.lad.appLang.ViewType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.ViewType
   * @see #setType(ViewType)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getViewElement_Type()
   * @model
   * @generated
   */
  ViewType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.ViewElement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.se.lad.appLang.ViewType
   * @see #getType()
   * @generated
   */
  void setType(ViewType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getViewElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.ViewElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ViewElement
