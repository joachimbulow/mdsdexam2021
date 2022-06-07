/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.Node#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lambda</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lambda</em>' reference.
   * @see #setLambda(Lambda)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getNode_Lambda()
   * @model
   * @generated
   */
  Lambda getLambda();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.Node#getLambda <em>Lambda</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lambda</em>' reference.
   * @see #getLambda()
   * @generated
   */
  void setLambda(Lambda value);

} // Node
