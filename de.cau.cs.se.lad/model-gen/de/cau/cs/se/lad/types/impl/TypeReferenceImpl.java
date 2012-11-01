/**
 */
package de.cau.cs.se.lad.types.impl;

import de.cau.cs.se.lad.types.Type;
import de.cau.cs.se.lad.types.TypeReference;
import de.cau.cs.se.lad.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.types.impl.TypeReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.types.impl.TypeReferenceImpl#getRemainder <em>Remainder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeReferenceImpl extends EObjectImpl implements TypeReference {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getRemainder() <em>Remainder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainder()
	 * @generated
	 * @ordered
	 */
	protected TypeReference remainder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getRemainder() {
		return remainder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemainder(TypeReference newRemainder, NotificationChain msgs) {
		TypeReference oldRemainder = remainder;
		remainder = newRemainder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_REFERENCE__REMAINDER, oldRemainder, newRemainder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainder(TypeReference newRemainder) {
		if (newRemainder != remainder) {
			NotificationChain msgs = null;
			if (remainder != null)
				msgs = ((InternalEObject)remainder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TYPE_REFERENCE__REMAINDER, null, msgs);
			if (newRemainder != null)
				msgs = ((InternalEObject)newRemainder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.TYPE_REFERENCE__REMAINDER, null, msgs);
			msgs = basicSetRemainder(newRemainder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_REFERENCE__REMAINDER, newRemainder, newRemainder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TYPE_REFERENCE__REMAINDER:
				return basicSetRemainder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.TYPE_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TypesPackage.TYPE_REFERENCE__REMAINDER:
				return getRemainder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.TYPE_REFERENCE__TYPE:
				setType((Type)newValue);
				return;
			case TypesPackage.TYPE_REFERENCE__REMAINDER:
				setRemainder((TypeReference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.TYPE_REFERENCE__TYPE:
				setType((Type)null);
				return;
			case TypesPackage.TYPE_REFERENCE__REMAINDER:
				setRemainder((TypeReference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.TYPE_REFERENCE__TYPE:
				return type != null;
			case TypesPackage.TYPE_REFERENCE__REMAINDER:
				return remainder != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeReferenceImpl
