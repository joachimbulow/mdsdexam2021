/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.DataAccess#getAccessedData <em>Accessed Data</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.exTwentyOne.DataAccess#getAccessedField <em>Accessed Field</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getDataAccess()
 * @model
 * @generated
 */
public interface DataAccess extends Expression
{
  /**
   * Returns the value of the '<em><b>Accessed Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accessed Data</em>' attribute.
   * @see #setAccessedData(String)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getDataAccess_AccessedData()
   * @model
   * @generated
   */
  String getAccessedData();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.DataAccess#getAccessedData <em>Accessed Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessed Data</em>' attribute.
   * @see #getAccessedData()
   * @generated
   */
  void setAccessedData(String value);

  /**
   * Returns the value of the '<em><b>Accessed Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accessed Field</em>' attribute.
   * @see #setAccessedField(String)
   * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage#getDataAccess_AccessedField()
   * @model
   * @generated
   */
  String getAccessedField();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.exTwentyOne.DataAccess#getAccessedField <em>Accessed Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessed Field</em>' attribute.
   * @see #getAccessedField()
   * @generated
   */
  void setAccessedField(String value);

} // DataAccess
