/**
 */
package de.cau.cs.se.lad.appLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.ViewContainer#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.ViewContainer#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.appLang.AppLangPackage#getViewContainer()
 * @model
 * @generated
 */
public interface ViewContainer extends ViewContent
{
  /**
   * Returns the value of the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' containment reference.
   * @see #setLayout(Layout)
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getViewContainer_Layout()
   * @model containment="true"
   * @generated
   */
  Layout getLayout();

  /**
   * Sets the value of the '{@link de.cau.cs.se.lad.appLang.ViewContainer#getLayout <em>Layout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' containment reference.
   * @see #getLayout()
   * @generated
   */
  void setLayout(Layout value);

  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.se.lad.appLang.ViewContent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see de.cau.cs.se.lad.appLang.AppLangPackage#getViewContainer_Contents()
   * @model containment="true"
   * @generated
   */
  EList<ViewContent> getContents();

} // ViewContainer
