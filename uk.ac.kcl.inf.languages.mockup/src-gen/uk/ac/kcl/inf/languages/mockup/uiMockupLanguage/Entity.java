/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup.uiMockupLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getExtendsEntity <em>Extends Entity</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Extends Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends Entity</em>' reference.
   * @see #setExtendsEntity(Entity)
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage#getEntity_ExtendsEntity()
   * @model
   * @generated
   */
  Entity getExtendsEntity();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getExtendsEntity <em>Extends Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends Entity</em>' reference.
   * @see #getExtendsEntity()
   * @generated
   */
  void setExtendsEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage#getEntity_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Entity
