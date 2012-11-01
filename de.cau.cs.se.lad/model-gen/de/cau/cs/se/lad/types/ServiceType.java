/**
 */
package de.cau.cs.se.lad.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.types.ServiceType#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.types.ServiceType#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.se.lad.types.TypesPackage#getServiceType()
 * @model
 * @generated
 */
public interface ServiceType extends UserType {
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
	 * @see de.cau.cs.se.lad.types.TypesPackage#getServiceType_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.se.lad.types.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see de.cau.cs.se.lad.types.TypesPackage#getServiceType_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // ServiceType
