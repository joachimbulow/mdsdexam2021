/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage;
import org.xtext.example.mydsl.exTwentyOne.Exp;
import org.xtext.example.mydsl.exTwentyOne.Lambda;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.impl.LambdaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.impl.LambdaImpl#getLambdaExp <em>Lambda Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaImpl extends ElementImpl implements Lambda
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLambdaExp() <em>Lambda Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLambdaExp()
   * @generated
   * @ordered
   */
  protected Exp lambdaExp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LambdaImpl()
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
    return ExTwentyOnePackage.Literals.LAMBDA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.LAMBDA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp getLambdaExp()
  {
    return lambdaExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLambdaExp(Exp newLambdaExp, NotificationChain msgs)
  {
    Exp oldLambdaExp = lambdaExp;
    lambdaExp = newLambdaExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.LAMBDA__LAMBDA_EXP, oldLambdaExp, newLambdaExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLambdaExp(Exp newLambdaExp)
  {
    if (newLambdaExp != lambdaExp)
    {
      NotificationChain msgs = null;
      if (lambdaExp != null)
        msgs = ((InternalEObject)lambdaExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExTwentyOnePackage.LAMBDA__LAMBDA_EXP, null, msgs);
      if (newLambdaExp != null)
        msgs = ((InternalEObject)newLambdaExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExTwentyOnePackage.LAMBDA__LAMBDA_EXP, null, msgs);
      msgs = basicSetLambdaExp(newLambdaExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.LAMBDA__LAMBDA_EXP, newLambdaExp, newLambdaExp));
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
      case ExTwentyOnePackage.LAMBDA__LAMBDA_EXP:
        return basicSetLambdaExp(null, msgs);
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
      case ExTwentyOnePackage.LAMBDA__NAME:
        return getName();
      case ExTwentyOnePackage.LAMBDA__LAMBDA_EXP:
        return getLambdaExp();
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
      case ExTwentyOnePackage.LAMBDA__NAME:
        setName((String)newValue);
        return;
      case ExTwentyOnePackage.LAMBDA__LAMBDA_EXP:
        setLambdaExp((Exp)newValue);
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
      case ExTwentyOnePackage.LAMBDA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ExTwentyOnePackage.LAMBDA__LAMBDA_EXP:
        setLambdaExp((Exp)null);
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
      case ExTwentyOnePackage.LAMBDA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ExTwentyOnePackage.LAMBDA__LAMBDA_EXP:
        return lambdaExp != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LambdaImpl
