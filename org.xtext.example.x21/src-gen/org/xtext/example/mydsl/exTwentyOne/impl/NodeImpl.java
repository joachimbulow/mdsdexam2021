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
import org.xtext.example.mydsl.exTwentyOne.Function;
import org.xtext.example.mydsl.exTwentyOne.Lambda;
import org.xtext.example.mydsl.exTwentyOne.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.impl.NodeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.impl.NodeImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends DeclarationImpl implements Node
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
   * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected Function function;

  /**
   * The cached value of the '{@link #getLambda() <em>Lambda</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLambda()
   * @generated
   * @ordered
   */
  protected Lambda lambda;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
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
    return ExTwentyOnePackage.Literals.NODE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function getFunction()
  {
    if (function != null && function.eIsProxy())
    {
      InternalEObject oldFunction = (InternalEObject)function;
      function = (Function)eResolveProxy(oldFunction);
      if (function != oldFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExTwentyOnePackage.NODE__FUNCTION, oldFunction, function));
      }
    }
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function basicGetFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunction(Function newFunction)
  {
    Function oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.NODE__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lambda getLambda()
  {
    return lambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLambda(Lambda newLambda, NotificationChain msgs)
  {
    Lambda oldLambda = lambda;
    lambda = newLambda;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.NODE__LAMBDA, oldLambda, newLambda);
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
  public void setLambda(Lambda newLambda)
  {
    if (newLambda != lambda)
    {
      NotificationChain msgs = null;
      if (lambda != null)
        msgs = ((InternalEObject)lambda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExTwentyOnePackage.NODE__LAMBDA, null, msgs);
      if (newLambda != null)
        msgs = ((InternalEObject)newLambda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExTwentyOnePackage.NODE__LAMBDA, null, msgs);
      msgs = basicSetLambda(newLambda, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExTwentyOnePackage.NODE__LAMBDA, newLambda, newLambda));
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
      case ExTwentyOnePackage.NODE__LAMBDA:
        return basicSetLambda(null, msgs);
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
      case ExTwentyOnePackage.NODE__NAME:
        return getName();
      case ExTwentyOnePackage.NODE__FUNCTION:
        if (resolve) return getFunction();
        return basicGetFunction();
      case ExTwentyOnePackage.NODE__LAMBDA:
        return getLambda();
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
      case ExTwentyOnePackage.NODE__NAME:
        setName((String)newValue);
        return;
      case ExTwentyOnePackage.NODE__FUNCTION:
        setFunction((Function)newValue);
        return;
      case ExTwentyOnePackage.NODE__LAMBDA:
        setLambda((Lambda)newValue);
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
      case ExTwentyOnePackage.NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ExTwentyOnePackage.NODE__FUNCTION:
        setFunction((Function)null);
        return;
      case ExTwentyOnePackage.NODE__LAMBDA:
        setLambda((Lambda)null);
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
      case ExTwentyOnePackage.NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ExTwentyOnePackage.NODE__FUNCTION:
        return function != null;
      case ExTwentyOnePackage.NODE__LAMBDA:
        return lambda != null;
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

} //NodeImpl
