/**
 */
package de.cau.cs.se.lad.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.types.TypeReference#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.types.TypeReference#getRemainder <em>Remainder</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.types.TypesPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see de.cau.cs.se.lad.types.TypesPackage#getTypeReference_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.lad.types.TypeReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Remainder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remainder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remainder</em>' containment reference.
	 * @see #setRemainder(TypeReference)
	 * @see de.cau.cs.se.lad.types.TypesPackage#getTypeReference_Remainder()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getRemainder();

	/**
	 * Sets the value of the '{@link de.cau.cs.se.lad.types.TypeReference#getRemainder <em>Remainder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remainder</em>' containment reference.
	 * @see #getRemainder()
	 * @generated
	 */
	void setRemainder(TypeReference value);

} // TypeReference
