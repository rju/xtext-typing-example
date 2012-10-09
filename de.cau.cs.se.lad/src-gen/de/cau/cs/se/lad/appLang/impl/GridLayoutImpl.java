/**
 */
package de.cau.cs.se.lad.appLang.impl;

import de.cau.cs.se.lad.appLang.AppLangPackage;
import de.cau.cs.se.lad.appLang.Field;
import de.cau.cs.se.lad.appLang.GridLayout;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.impl.GridLayoutImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridLayoutImpl extends LayoutImpl implements GridLayout
{
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected Field fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GridLayoutImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AppLangPackage.Literals.GRID_LAYOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field getFields()
  {
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFields(Field newFields, NotificationChain msgs)
  {
    Field oldFields = fields;
    fields = newFields;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppLangPackage.GRID_LAYOUT__FIELDS, oldFields, newFields);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFields(Field newFields)
  {
    if (newFields != fields)
    {
      NotificationChain msgs = null;
      if (fields != null)
        msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.GRID_LAYOUT__FIELDS, null, msgs);
      if (newFields != null)
        msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.GRID_LAYOUT__FIELDS, null, msgs);
      msgs = basicSetFields(newFields, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppLangPackage.GRID_LAYOUT__FIELDS, newFields, newFields));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AppLangPackage.GRID_LAYOUT__FIELDS:
        return basicSetFields(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AppLangPackage.GRID_LAYOUT__FIELDS:
        return getFields();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppLangPackage.GRID_LAYOUT__FIELDS:
        setFields((Field)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AppLangPackage.GRID_LAYOUT__FIELDS:
        setFields((Field)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AppLangPackage.GRID_LAYOUT__FIELDS:
        return fields != null;
    }
    return super.eIsSet(featureID);
  }

} //GridLayoutImpl
