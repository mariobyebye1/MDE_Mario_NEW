/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup.uiMockupLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface UiMockupLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uiMockupLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/languages/mockup/UiMockupLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uiMockupLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UiMockupLanguagePackage eINSTANCE = uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ModelImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.EntityImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Extends Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXTENDS_ENTITY = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.AttributeImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ScreenImpl <em>Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ScreenImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getScreen()
   * @generated
   */
  int SCREEN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__NAME = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__ENTITY = 1;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__WIDGETS = 2;

  /**
   * The number of structural features of the '<em>Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.WidgetImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__LABEL = 1;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.TextFieldImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__LABEL = WIDGET__LABEL;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.CheckboxImpl <em>Checkbox</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.CheckboxImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getCheckbox()
   * @generated
   */
  int CHECKBOX = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX__LABEL = WIDGET__LABEL;

  /**
   * The number of structural features of the '<em>Checkbox</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ButtonImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getButton()
   * @generated
   */
  int BUTTON = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = WIDGET__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LABEL = WIDGET__LABEL;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.NavigationImpl <em>Navigation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.NavigationImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getNavigation()
   * @generated
   */
  int NAVIGATION = 8;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION__TARGET = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION__CONDITION = 2;

  /**
   * The number of structural features of the '<em>Navigation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ConditionImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 9;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.FeatureCallImpl <em>Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.FeatureCallImpl
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getFeatureCall()
   * @generated
   */
  int FEATURE_CALL = 11;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.DataType
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 12;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getExtendsEntity <em>Extends Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends Entity</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getExtendsEntity()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ExtendsEntity();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen
   * @generated
   */
  EClass getScreen();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen#getName()
   * @see #getScreen()
   * @generated
   */
  EAttribute getScreen_Name();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen#getEntity()
   * @see #getScreen()
   * @generated
   */
  EReference getScreen_Entity();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen#getWidgets()
   * @see #getScreen()
   * @generated
   */
  EReference getScreen_Widgets();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Widget#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Widget#getName()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Widget#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Widget#getLabel()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Label();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.TextField <em>Text Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Field</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.TextField
   * @generated
   */
  EClass getTextField();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Checkbox <em>Checkbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkbox</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Checkbox
   * @generated
   */
  EClass getCheckbox();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation <em>Navigation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigation</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation
   * @generated
   */
  EClass getNavigation();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation#getSource()
   * @see #getNavigation()
   * @generated
   */
  EReference getNavigation_Source();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation#getTarget()
   * @see #getNavigation()
   * @generated
   */
  EReference getNavigation_Target();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation#getCondition()
   * @see #getNavigation()
   * @generated
   */
  EReference getNavigation_Condition();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Condition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Condition#getExpression()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Expression();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Call</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.FeatureCall
   * @generated
   */
  EClass getFeatureCall();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.FeatureCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.FeatureCall#getArguments()
   * @see #getFeatureCall()
   * @generated
   */
  EReference getFeatureCall_Arguments();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.DataType
   * @generated
   */
  EEnum getDataType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UiMockupLanguageFactory getUiMockupLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ModelImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.EntityImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Extends Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__EXTENDS_ENTITY = eINSTANCE.getEntity_ExtendsEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.AttributeImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ScreenImpl <em>Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ScreenImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getScreen()
     * @generated
     */
    EClass SCREEN = eINSTANCE.getScreen();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN__NAME = eINSTANCE.getScreen_Name();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN__ENTITY = eINSTANCE.getScreen_Entity();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN__WIDGETS = eINSTANCE.getScreen_Widgets();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.WidgetImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__LABEL = eINSTANCE.getWidget_Label();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.TextFieldImpl <em>Text Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.TextFieldImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getTextField()
     * @generated
     */
    EClass TEXT_FIELD = eINSTANCE.getTextField();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.CheckboxImpl <em>Checkbox</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.CheckboxImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getCheckbox()
     * @generated
     */
    EClass CHECKBOX = eINSTANCE.getCheckbox();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ButtonImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.NavigationImpl <em>Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.NavigationImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getNavigation()
     * @generated
     */
    EClass NAVIGATION = eINSTANCE.getNavigation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION__SOURCE = eINSTANCE.getNavigation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION__TARGET = eINSTANCE.getNavigation_Target();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION__CONDITION = eINSTANCE.getNavigation_Condition();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ConditionImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.FeatureCallImpl <em>Feature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.FeatureCallImpl
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getFeatureCall()
     * @generated
     */
    EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CALL__ARGUMENTS = eINSTANCE.getFeatureCall_Arguments();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.DataType
     * @see uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.UiMockupLanguagePackageImpl#getDataType()
     * @generated
     */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

  }

} //UiMockupLanguagePackage
