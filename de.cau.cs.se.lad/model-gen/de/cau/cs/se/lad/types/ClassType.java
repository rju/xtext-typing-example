/**
 */
package de.cau.cs.se.lad.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.types.ClassType#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.types.ClassType#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.types.TypesPackage#getClassType()
 * @model
 * @generated
 */
public interface ClassType extends UserType {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ClassType)
	 * @see de.cau.cs.se.lad.types.TypesPackage#getClassType_Parent()
	 * @model
	 * @generated
	 */
	ClassType getParent();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.lad.types.ClassType#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ClassType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.se.lad.types.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see de.cau.cs.se.lad.types.TypesPackage#getClassType_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

} // ClassType
