/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.Element#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.Element#getNode <em>Node</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.Element#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getElement_Element()
   * @model
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.Element#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(Node)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getElement_Node()
   * @model
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.Element#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Node value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getElement_Output()
   * @model
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.Element#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

} // Element