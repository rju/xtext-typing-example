/**
 */
package de.cau.cs.se.lad.appLang.impl;

import de.cau.cs.se.lad.appLang.AppLangPackage;
import de.cau.cs.se.lad.appLang.Size;
import de.cau.cs.se.lad.appLang.SizeExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.impl.SizeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.impl.SizeImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeImpl extends MinimalEObjectImpl.Container implements Size
{
  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected SizeExpr width;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected SizeExpr height;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SizeImpl()
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
    return AppLangPackage.Literals.SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeExpr getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWidth(SizeExpr newWidth, NotificationChain msgs)
  {
    SizeExpr oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppLangPackage.SIZE__WIDTH, oldWidth, newWidth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(SizeExpr newWidth)
  {
    if (newWidth != width)
    {
      NotificationChain msgs = null;
      if (width != null)
        msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.SIZE__WIDTH, null, msgs);
      if (newWidth != null)
        msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.SIZE__WIDTH, null, msgs);
      msgs = basicSetWidth(newWidth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppLangPackage.SIZE__WIDTH, newWidth, newWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeExpr getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeight(SizeExpr newHeight, NotificationChain msgs)
  {
    SizeExpr oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppLangPackage.SIZE__HEIGHT, oldHeight, newHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(SizeExpr newHeight)
  {
    if (newHeight != height)
    {
      NotificationChain msgs = null;
      if (height != null)
        msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.SIZE__HEIGHT, null, msgs);
      if (newHeight != null)
        msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.SIZE__HEIGHT, null, msgs);
      msgs = basicSetHeight(newHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppLangPackage.SIZE__HEIGHT, newHeight, newHeight));
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
      case AppLangPackage.SIZE__WIDTH:
        return basicSetWidth(null, msgs);
      case AppLangPackage.SIZE__HEIGHT:
        return basicSetHeight(null, msgs);
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
      case AppLangPackage.SIZE__WIDTH:
        return getWidth();
      case AppLangPackage.SIZE__HEIGHT:
        return getHeight();
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
      case AppLangPackage.SIZE__WIDTH:
        setWidth((SizeExpr)newValue);
        return;
      case AppLangPackage.SIZE__HEIGHT:
        setHeight((SizeExpr)newValue);
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
      case AppLangPackage.SIZE__WIDTH:
        setWidth((SizeExpr)null);
        return;
      case AppLangPackage.SIZE__HEIGHT:
        setHeight((SizeExpr)null);
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
      case AppLangPackage.SIZE__WIDTH:
        return width != null;
      case AppLangPackage.SIZE__HEIGHT:
        return height != null;
    }
    return super.eIsSet(featureID);
  }

} //SizeImpl
