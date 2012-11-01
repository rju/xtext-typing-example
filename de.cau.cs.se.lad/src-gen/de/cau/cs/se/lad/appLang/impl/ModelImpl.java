/**
 */
package de.cau.cs.se.lad.appLang.impl;

import de.cau.cs.se.lad.appLang.AppLangPackage;
import de.cau.cs.se.lad.appLang.DataModel;
import de.cau.cs.se.lad.appLang.Model;
import de.cau.cs.se.lad.appLang.View;

import de.cau.cs.se.lad.types.ClassType;
import de.cau.cs.se.lad.types.ServiceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.se.lad.appLang.impl.ModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.impl.ModelImpl#getViews <em>Views</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.impl.ModelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link de.cau.cs.se.lad.appLang.impl.ModelImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<ServiceType> services;

  /**
   * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViews()
   * @generated
   * @ordered
   */
  protected EList<View> views;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<ClassType> classes;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected DataModel model;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return AppLangPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceType> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<ServiceType>(ServiceType.class, this, AppLangPackage.MODEL__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<View> getViews()
  {
    if (views == null)
    {
      views = new EObjectContainmentEList<View>(View.class, this, AppLangPackage.MODEL__VIEWS);
    }
    return views;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassType> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<ClassType>(ClassType.class, this, AppLangPackage.MODEL__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModel getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModel(DataModel newModel, NotificationChain msgs)
  {
    DataModel oldModel = model;
    model = newModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppLangPackage.MODEL__MODEL, oldModel, newModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(DataModel newModel)
  {
    if (newModel != model)
    {
      NotificationChain msgs = null;
      if (model != null)
        msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.MODEL__MODEL, null, msgs);
      if (newModel != null)
        msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppLangPackage.MODEL__MODEL, null, msgs);
      msgs = basicSetModel(newModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppLangPackage.MODEL__MODEL, newModel, newModel));
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
      case AppLangPackage.MODEL__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case AppLangPackage.MODEL__VIEWS:
        return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
      case AppLangPackage.MODEL__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case AppLangPackage.MODEL__MODEL:
        return basicSetModel(null, msgs);
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
      case AppLangPackage.MODEL__SERVICES:
        return getServices();
      case AppLangPackage.MODEL__VIEWS:
        return getViews();
      case AppLangPackage.MODEL__CLASSES:
        return getClasses();
      case AppLangPackage.MODEL__MODEL:
        return getModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppLangPackage.MODEL__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends ServiceType>)newValue);
        return;
      case AppLangPackage.MODEL__VIEWS:
        getViews().clear();
        getViews().addAll((Collection<? extends View>)newValue);
        return;
      case AppLangPackage.MODEL__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends ClassType>)newValue);
        return;
      case AppLangPackage.MODEL__MODEL:
        setModel((DataModel)newValue);
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
      case AppLangPackage.MODEL__SERVICES:
        getServices().clear();
        return;
      case AppLangPackage.MODEL__VIEWS:
        getViews().clear();
        return;
      case AppLangPackage.MODEL__CLASSES:
        getClasses().clear();
        return;
      case AppLangPackage.MODEL__MODEL:
        setModel((DataModel)null);
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
      case AppLangPackage.MODEL__SERVICES:
        return services != null && !services.isEmpty();
      case AppLangPackage.MODEL__VIEWS:
        return views != null && !views.isEmpty();
      case AppLangPackage.MODEL__CLASSES:
        return classes != null && !classes.isEmpty();
      case AppLangPackage.MODEL__MODEL:
        return model != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
