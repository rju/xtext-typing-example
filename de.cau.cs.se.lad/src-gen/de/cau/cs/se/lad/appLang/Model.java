/**
 */
package de.cau.cs.se.lad.appLang;

import de.cau.cs.se.lad.types.ClassType;
import de.cau.cs.se.lad.types.ServiceType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.Model#getServices <em>Services</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.Model#getViews <em>Views</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.Model#getClasses <em>Classes</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.Model#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.types.ServiceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getModel_Services()
   * @model containment="true"
   * @generated
   */
  EList<ServiceType> getServices();

  /**
   * Returns the value of the '<em><b>Views</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.appLang.View}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getModel_Views()
   * @model containment="true"
   * @generated
   */
  EList<View> getViews();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.types.ClassType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getModel_Classes()
   * @model containment="true"
   * @generated
   */
  EList<ClassType> getClasses();

  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference.
   * @see #setModel(DataModel)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getModel_Model()
   * @model containment="true"
   * @generated
   */
  DataModel getModel();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.Model#getModel <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' containment reference.
   * @see #getModel()
   * @generated
   */
  void setModel(DataModel value);

} // Model
