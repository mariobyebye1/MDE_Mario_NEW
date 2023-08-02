/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.languages.mockup.services.UiMockupLanguageGrammarAccess;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Button;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Checkbox;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Condition;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Expression;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.FeatureCall;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Model;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.TextField;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage;

@SuppressWarnings("all")
public class UiMockupLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UiMockupLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UiMockupLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UiMockupLanguagePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case UiMockupLanguagePackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case UiMockupLanguagePackage.CHECKBOX:
				sequence_Checkbox(context, (Checkbox) semanticObject); 
				return; 
			case UiMockupLanguagePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case UiMockupLanguagePackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case UiMockupLanguagePackage.EXPRESSION:
				if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getOrExpressionRule()) {
					sequence_AndExpression_OrExpression_PrimaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAndExpressionRule()) {
					sequence_AndExpression_PrimaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case UiMockupLanguagePackage.FEATURE_CALL:
				if (rule == grammarAccess.getAndExpressionRule()) {
					sequence_AndExpression_FeatureCall(context, (FeatureCall) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getOrExpressionRule()) {
					sequence_AndExpression_FeatureCall_OrExpression(context, (FeatureCall) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimaryExpressionRule()
						|| rule == grammarAccess.getFeatureCallRule()) {
					sequence_FeatureCall(context, (FeatureCall) semanticObject); 
					return; 
				}
				else break;
			case UiMockupLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UiMockupLanguagePackage.NAVIGATION:
				sequence_Navigation(context, (Navigation) semanticObject); 
				return; 
			case UiMockupLanguagePackage.SCREEN:
				sequence_Screen(context, (Screen) semanticObject); 
				return; 
			case UiMockupLanguagePackage.TEXT_FIELD:
				sequence_TextField(context, (TextField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AndExpression returns FeatureCall
	 *
	 * Constraint:
	 *     ((arguments+=Expression arguments+=Expression*)? right=PrimaryExpression*)
	 */
	protected void sequence_AndExpression_FeatureCall(ISerializationContext context, FeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FeatureCall
	 *     OrExpression returns FeatureCall
	 *
	 * Constraint:
	 *     ((arguments+=Expression arguments+=Expression*)? right=PrimaryExpression* right=AndExpression*)
	 */
	protected void sequence_AndExpression_FeatureCall_OrExpression(ISerializationContext context, FeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *     OrExpression returns Expression
	 *
	 * Constraint:
	 *     (right=PrimaryExpression* right=AndExpression*)
	 */
	protected void sequence_AndExpression_OrExpression_PrimaryExpression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpression returns Expression
	 *
	 * Constraint:
	 *     right=PrimaryExpression*
	 */
	protected void sequence_AndExpression_PrimaryExpression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=DataType)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiMockupLanguagePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiMockupLanguagePackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, UiMockupLanguagePackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiMockupLanguagePackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     (name=ID label=Expression?)
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Checkbox
	 *     Checkbox returns Checkbox
	 *
	 * Constraint:
	 *     (name=ID label=Expression?)
	 */
	protected void sequence_Checkbox(ISerializationContext context, Checkbox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiMockupLanguagePackage.Literals.CONDITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiMockupLanguagePackage.Literals.CONDITION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID extendsEntity=[Entity|ID]? attributes+=Attribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns FeatureCall
	 *     FeatureCall returns FeatureCall
	 *
	 * Constraint:
	 *     (arguments+=Expression arguments+=Expression*)?
	 */
	protected void sequence_FeatureCall(ISerializationContext context, FeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (elements+=Entity | elements+=Screen | elements+=Navigation)+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Navigation returns Navigation
	 *
	 * Constraint:
	 *     (source=[Screen|ID] target=[Screen|ID] condition=Condition?)
	 */
	protected void sequence_Navigation(ISerializationContext context, Navigation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns Expression
	 *
	 * Constraint:
	 *     {Expression}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Screen returns Screen
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID] widgets+=Widget*)
	 */
	protected void sequence_Screen(ISerializationContext context, Screen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns TextField
	 *     TextField returns TextField
	 *
	 * Constraint:
	 *     (name=ID label=Expression?)
	 */
	protected void sequence_TextField(ISerializationContext context, TextField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
