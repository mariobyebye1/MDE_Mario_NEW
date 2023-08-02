/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup.uiMockupLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Condition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage#getCondition_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Condition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Condition