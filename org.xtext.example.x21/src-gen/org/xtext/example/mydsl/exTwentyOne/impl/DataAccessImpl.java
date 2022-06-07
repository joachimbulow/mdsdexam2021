/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.exTwentyOne.DataAccess;
import org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.impl.DataAccessImpl#getAccessedData <em>Accessed Data</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.impl.DataAccessImpl#getAccessedField <em>Accessed Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAccessImpl extends ExpressionImpl implements DataAccess
{
  /**
   * The default value of the '{@link #getAccessedData() <em>Accessed Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessedData()
   * @generated
   * @ordered
   */
  protected static final String ACCESSED_DATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccessedData() <em>Accessed Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessedData()
   * @generated
   * @ordered
   */
  protected String accessedData = ACCESSED_DATA_EDEFAULT;

  /**
   * The default value of the '{@link #getAccessedField() <em>Accessed Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessedField()
   * @generated
   * @ordered
   */
  protected static final String ACCESSED_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccessedField() <em>Accessed Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessedField()
   * @generated
   * @ordered
   */
  protected String accessedField = ACCESSED_FIELD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataAccessImpl()
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
    return ExTwentyOnePackage.Literals.DATA_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAccessedData()
  {
    return accessedData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAccessedData(String newAccessedData)
  {
    String oldAccessedData = accessedData;
    accessedData = newAccessedData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.DATA_ACCESS__ACCESSED_DATA, oldAccessedData, accessedData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAccessedField()
  {
    return accessedField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAccessedField(String newAccessedField)
  {
    String oldAccessedField = accessedField;
    accessedField = newAccessedField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.DATA_ACCESS__ACCESSED_FIELD, oldAccessedField, accessedField));
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
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_DATA:
        return getAccessedData();
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_FIELD:
        return getAccessedField();
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
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_DATA:
        setAccessedData((String)newValue);
        return;
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_FIELD:
        setAccessedField((String)newValue);
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
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_DATA:
        setAccessedData(ACCESSED_DATA_EDEFAULT);
        return;
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_FIELD:
        setAccessedField(ACCESSED_FIELD_EDEFAULT);
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
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_DATA:
        return ACCESSED_DATA_EDEFAULT == null ? accessedData != null : !ACCESSED_DATA_EDEFAULT.equals(accessedData);
      case ExTwentyOnePackage.DATA_ACCESS__ACCESSED_FIELD:
        return ACCESSED_FIELD_EDEFAULT == null ? accessedField != null : !ACCESSED_FIELD_EDEFAULT.equals(accessedField);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (accessedData: ");
    result.append(accessedData);
    result.append(", accessedField: ");
    result.append(accessedField);
    result.append(')');
    return result.toString();
  }

} //DataAccessImpl
