/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Type)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getParameter_Value()
   * @model containment="true"
   * @generated
   */
  Type getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.Parameter#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Type value);

} // Parameter
