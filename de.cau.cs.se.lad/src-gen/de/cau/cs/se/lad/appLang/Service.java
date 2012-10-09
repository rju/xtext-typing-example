/**
 */
package de.cau.cs.se.lad.appLang;

import de.cau.cs.se.lad.types.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.Service#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.Service#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.Service#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
{
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
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.types.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configurations</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getService_Configurations()
   * @model containment="true"
   * @generated
   */
  EList<Property> getConfigurations();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.appLang.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getService_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // Service
