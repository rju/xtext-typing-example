/**
 */
package de.cau.cs.se.lad.appLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.DataModel#getInstances <em>Instances</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.DataModel#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.appLang.Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getDataModel_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

  /**
   * Returns the value of the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' reference.
   * @see #setView(Instance)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getDataModel_View()
   * @model
   * @generated
   */
  Instance getView();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.DataModel#getView <em>View</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' reference.
   * @see #getView()
   * @generated
   */
  void setView(Instance value);

} // DataModel
