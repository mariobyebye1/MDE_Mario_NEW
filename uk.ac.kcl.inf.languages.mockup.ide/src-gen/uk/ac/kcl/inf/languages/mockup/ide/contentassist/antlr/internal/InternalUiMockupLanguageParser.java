package uk.ac.kcl.inf.languages.mockup.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.languages.mockup.services.UiMockupLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUiMockupLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'String'", "'Boolean'", "'Integer'", "'entity'", "'{'", "'}'", "'extends'", "':'", "'screen'", "'for'", "'text'", "'label'", "'checkbox'", "'button'", "'navigate'", "'from'", "'to'", "'when'", "'if'", "'||'", "'&&'", "'('", "','"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUiMockupLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUiMockupLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUiMockupLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUiMockupLanguage.g"; }


    	private UiMockupLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(UiMockupLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalUiMockupLanguage.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:54:1: ( ruleModel EOF )
            // InternalUiMockupLanguage.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUiMockupLanguage.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalUiMockupLanguage.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalUiMockupLanguage.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalUiMockupLanguage.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalUiMockupLanguage.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==21||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalUiMockupLanguage.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:79:1: ( ruleEntity EOF )
            // InternalUiMockupLanguage.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalUiMockupLanguage.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalUiMockupLanguage.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalUiMockupLanguage.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalUiMockupLanguage.g:94:3: ( rule__Entity__Group__0 )
            // InternalUiMockupLanguage.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalUiMockupLanguage.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:104:1: ( ruleAttribute EOF )
            // InternalUiMockupLanguage.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUiMockupLanguage.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUiMockupLanguage.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUiMockupLanguage.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUiMockupLanguage.g:119:3: ( rule__Attribute__Group__0 )
            // InternalUiMockupLanguage.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleScreen"
    // InternalUiMockupLanguage.g:128:1: entryRuleScreen : ruleScreen EOF ;
    public final void entryRuleScreen() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:129:1: ( ruleScreen EOF )
            // InternalUiMockupLanguage.g:130:1: ruleScreen EOF
            {
             before(grammarAccess.getScreenRule()); 
            pushFollow(FOLLOW_1);
            ruleScreen();

            state._fsp--;

             after(grammarAccess.getScreenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScreen"


    // $ANTLR start "ruleScreen"
    // InternalUiMockupLanguage.g:137:1: ruleScreen : ( ( rule__Screen__Group__0 ) ) ;
    public final void ruleScreen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:141:2: ( ( ( rule__Screen__Group__0 ) ) )
            // InternalUiMockupLanguage.g:142:2: ( ( rule__Screen__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:142:2: ( ( rule__Screen__Group__0 ) )
            // InternalUiMockupLanguage.g:143:3: ( rule__Screen__Group__0 )
            {
             before(grammarAccess.getScreenAccess().getGroup()); 
            // InternalUiMockupLanguage.g:144:3: ( rule__Screen__Group__0 )
            // InternalUiMockupLanguage.g:144:4: rule__Screen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Screen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScreen"


    // $ANTLR start "entryRuleWidget"
    // InternalUiMockupLanguage.g:153:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:154:1: ( ruleWidget EOF )
            // InternalUiMockupLanguage.g:155:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalUiMockupLanguage.g:162:1: ruleWidget : ( ( rule__Widget__Alternatives ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:166:2: ( ( ( rule__Widget__Alternatives ) ) )
            // InternalUiMockupLanguage.g:167:2: ( ( rule__Widget__Alternatives ) )
            {
            // InternalUiMockupLanguage.g:167:2: ( ( rule__Widget__Alternatives ) )
            // InternalUiMockupLanguage.g:168:3: ( rule__Widget__Alternatives )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives()); 
            // InternalUiMockupLanguage.g:169:3: ( rule__Widget__Alternatives )
            // InternalUiMockupLanguage.g:169:4: rule__Widget__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleTextField"
    // InternalUiMockupLanguage.g:178:1: entryRuleTextField : ruleTextField EOF ;
    public final void entryRuleTextField() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:179:1: ( ruleTextField EOF )
            // InternalUiMockupLanguage.g:180:1: ruleTextField EOF
            {
             before(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getTextFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalUiMockupLanguage.g:187:1: ruleTextField : ( ( rule__TextField__Group__0 ) ) ;
    public final void ruleTextField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:191:2: ( ( ( rule__TextField__Group__0 ) ) )
            // InternalUiMockupLanguage.g:192:2: ( ( rule__TextField__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:192:2: ( ( rule__TextField__Group__0 ) )
            // InternalUiMockupLanguage.g:193:3: ( rule__TextField__Group__0 )
            {
             before(grammarAccess.getTextFieldAccess().getGroup()); 
            // InternalUiMockupLanguage.g:194:3: ( rule__TextField__Group__0 )
            // InternalUiMockupLanguage.g:194:4: rule__TextField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleCheckbox"
    // InternalUiMockupLanguage.g:203:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:204:1: ( ruleCheckbox EOF )
            // InternalUiMockupLanguage.g:205:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalUiMockupLanguage.g:212:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:216:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalUiMockupLanguage.g:217:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:217:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalUiMockupLanguage.g:218:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalUiMockupLanguage.g:219:3: ( rule__Checkbox__Group__0 )
            // InternalUiMockupLanguage.g:219:4: rule__Checkbox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleButton"
    // InternalUiMockupLanguage.g:228:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:229:1: ( ruleButton EOF )
            // InternalUiMockupLanguage.g:230:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalUiMockupLanguage.g:237:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:241:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalUiMockupLanguage.g:242:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:242:2: ( ( rule__Button__Group__0 ) )
            // InternalUiMockupLanguage.g:243:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalUiMockupLanguage.g:244:3: ( rule__Button__Group__0 )
            // InternalUiMockupLanguage.g:244:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleNavigation"
    // InternalUiMockupLanguage.g:253:1: entryRuleNavigation : ruleNavigation EOF ;
    public final void entryRuleNavigation() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:254:1: ( ruleNavigation EOF )
            // InternalUiMockupLanguage.g:255:1: ruleNavigation EOF
            {
             before(grammarAccess.getNavigationRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getNavigationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigation"


    // $ANTLR start "ruleNavigation"
    // InternalUiMockupLanguage.g:262:1: ruleNavigation : ( ( rule__Navigation__Group__0 ) ) ;
    public final void ruleNavigation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:266:2: ( ( ( rule__Navigation__Group__0 ) ) )
            // InternalUiMockupLanguage.g:267:2: ( ( rule__Navigation__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:267:2: ( ( rule__Navigation__Group__0 ) )
            // InternalUiMockupLanguage.g:268:3: ( rule__Navigation__Group__0 )
            {
             before(grammarAccess.getNavigationAccess().getGroup()); 
            // InternalUiMockupLanguage.g:269:3: ( rule__Navigation__Group__0 )
            // InternalUiMockupLanguage.g:269:4: rule__Navigation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Navigation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigation"


    // $ANTLR start "entryRuleCondition"
    // InternalUiMockupLanguage.g:278:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:279:1: ( ruleCondition EOF )
            // InternalUiMockupLanguage.g:280:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUiMockupLanguage.g:287:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:291:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalUiMockupLanguage.g:292:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:292:2: ( ( rule__Condition__Group__0 ) )
            // InternalUiMockupLanguage.g:293:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalUiMockupLanguage.g:294:3: ( rule__Condition__Group__0 )
            // InternalUiMockupLanguage.g:294:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalUiMockupLanguage.g:303:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:304:1: ( ruleExpression EOF )
            // InternalUiMockupLanguage.g:305:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalUiMockupLanguage.g:312:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:316:2: ( ( ruleOrExpression ) )
            // InternalUiMockupLanguage.g:317:2: ( ruleOrExpression )
            {
            // InternalUiMockupLanguage.g:317:2: ( ruleOrExpression )
            // InternalUiMockupLanguage.g:318:3: ruleOrExpression
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalUiMockupLanguage.g:328:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:329:1: ( ruleOrExpression EOF )
            // InternalUiMockupLanguage.g:330:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalUiMockupLanguage.g:337:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:341:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalUiMockupLanguage.g:342:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:342:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalUiMockupLanguage.g:343:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalUiMockupLanguage.g:344:3: ( rule__OrExpression__Group__0 )
            // InternalUiMockupLanguage.g:344:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalUiMockupLanguage.g:353:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:354:1: ( ruleAndExpression EOF )
            // InternalUiMockupLanguage.g:355:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalUiMockupLanguage.g:362:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:366:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalUiMockupLanguage.g:367:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:367:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalUiMockupLanguage.g:368:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalUiMockupLanguage.g:369:3: ( rule__AndExpression__Group__0 )
            // InternalUiMockupLanguage.g:369:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalUiMockupLanguage.g:378:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:379:1: ( rulePrimaryExpression EOF )
            // InternalUiMockupLanguage.g:380:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalUiMockupLanguage.g:387:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:391:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalUiMockupLanguage.g:392:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalUiMockupLanguage.g:392:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalUiMockupLanguage.g:393:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalUiMockupLanguage.g:394:3: ( rule__PrimaryExpression__Alternatives )
            // InternalUiMockupLanguage.g:394:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // InternalUiMockupLanguage.g:403:1: entryRuleFeatureCall : ruleFeatureCall EOF ;
    public final void entryRuleFeatureCall() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:404:1: ( ruleFeatureCall EOF )
            // InternalUiMockupLanguage.g:405:1: ruleFeatureCall EOF
            {
             before(grammarAccess.getFeatureCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureCall();

            state._fsp--;

             after(grammarAccess.getFeatureCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // InternalUiMockupLanguage.g:412:1: ruleFeatureCall : ( ( rule__FeatureCall__Group__0 ) ) ;
    public final void ruleFeatureCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:416:2: ( ( ( rule__FeatureCall__Group__0 ) ) )
            // InternalUiMockupLanguage.g:417:2: ( ( rule__FeatureCall__Group__0 ) )
            {
            // InternalUiMockupLanguage.g:417:2: ( ( rule__FeatureCall__Group__0 ) )
            // InternalUiMockupLanguage.g:418:3: ( rule__FeatureCall__Group__0 )
            {
             before(grammarAccess.getFeatureCallAccess().getGroup()); 
            // InternalUiMockupLanguage.g:419:3: ( rule__FeatureCall__Group__0 )
            // InternalUiMockupLanguage.g:419:4: rule__FeatureCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalUiMockupLanguage.g:428:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:429:1: ( ruleBoolLiteral EOF )
            // InternalUiMockupLanguage.g:430:1: ruleBoolLiteral EOF
            {
             before(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolLiteral();

            state._fsp--;

             after(grammarAccess.getBoolLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalUiMockupLanguage.g:437:1: ruleBoolLiteral : ( ( rule__BoolLiteral__Alternatives ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:441:2: ( ( ( rule__BoolLiteral__Alternatives ) ) )
            // InternalUiMockupLanguage.g:442:2: ( ( rule__BoolLiteral__Alternatives ) )
            {
            // InternalUiMockupLanguage.g:442:2: ( ( rule__BoolLiteral__Alternatives ) )
            // InternalUiMockupLanguage.g:443:3: ( rule__BoolLiteral__Alternatives )
            {
             before(grammarAccess.getBoolLiteralAccess().getAlternatives()); 
            // InternalUiMockupLanguage.g:444:3: ( rule__BoolLiteral__Alternatives )
            // InternalUiMockupLanguage.g:444:4: rule__BoolLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalUiMockupLanguage.g:453:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalUiMockupLanguage.g:454:1: ( ruleStringLiteral EOF )
            // InternalUiMockupLanguage.g:455:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalUiMockupLanguage.g:462:1: ruleStringLiteral : ( RULE_STRING ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:466:2: ( ( RULE_STRING ) )
            // InternalUiMockupLanguage.g:467:2: ( RULE_STRING )
            {
            // InternalUiMockupLanguage.g:467:2: ( RULE_STRING )
            // InternalUiMockupLanguage.g:468:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "ruleDataType"
    // InternalUiMockupLanguage.g:478:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:482:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalUiMockupLanguage.g:483:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalUiMockupLanguage.g:483:2: ( ( rule__DataType__Alternatives ) )
            // InternalUiMockupLanguage.g:484:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalUiMockupLanguage.g:485:3: ( rule__DataType__Alternatives )
            // InternalUiMockupLanguage.g:485:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalUiMockupLanguage.g:493:1: rule__Model__Alternatives : ( ( ( rule__Model__ElementsAssignment_0 ) ) | ( ( rule__Model__ElementsAssignment_1 ) ) | ( ( rule__Model__ElementsAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:497:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) | ( ( rule__Model__ElementsAssignment_1 ) ) | ( ( rule__Model__ElementsAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUiMockupLanguage.g:498:2: ( ( rule__Model__ElementsAssignment_0 ) )
                    {
                    // InternalUiMockupLanguage.g:498:2: ( ( rule__Model__ElementsAssignment_0 ) )
                    // InternalUiMockupLanguage.g:499:3: ( rule__Model__ElementsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
                    // InternalUiMockupLanguage.g:500:3: ( rule__Model__ElementsAssignment_0 )
                    // InternalUiMockupLanguage.g:500:4: rule__Model__ElementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ElementsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:504:2: ( ( rule__Model__ElementsAssignment_1 ) )
                    {
                    // InternalUiMockupLanguage.g:504:2: ( ( rule__Model__ElementsAssignment_1 ) )
                    // InternalUiMockupLanguage.g:505:3: ( rule__Model__ElementsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
                    // InternalUiMockupLanguage.g:506:3: ( rule__Model__ElementsAssignment_1 )
                    // InternalUiMockupLanguage.g:506:4: rule__Model__ElementsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ElementsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUiMockupLanguage.g:510:2: ( ( rule__Model__ElementsAssignment_2 ) )
                    {
                    // InternalUiMockupLanguage.g:510:2: ( ( rule__Model__ElementsAssignment_2 ) )
                    // InternalUiMockupLanguage.g:511:3: ( rule__Model__ElementsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
                    // InternalUiMockupLanguage.g:512:3: ( rule__Model__ElementsAssignment_2 )
                    // InternalUiMockupLanguage.g:512:4: rule__Model__ElementsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ElementsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Widget__Alternatives"
    // InternalUiMockupLanguage.g:520:1: rule__Widget__Alternatives : ( ( ruleTextField ) | ( ruleCheckbox ) | ( ruleButton ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:524:1: ( ( ruleTextField ) | ( ruleCheckbox ) | ( ruleButton ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUiMockupLanguage.g:525:2: ( ruleTextField )
                    {
                    // InternalUiMockupLanguage.g:525:2: ( ruleTextField )
                    // InternalUiMockupLanguage.g:526:3: ruleTextField
                    {
                     before(grammarAccess.getWidgetAccess().getTextFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextField();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getTextFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:531:2: ( ruleCheckbox )
                    {
                    // InternalUiMockupLanguage.g:531:2: ( ruleCheckbox )
                    // InternalUiMockupLanguage.g:532:3: ruleCheckbox
                    {
                     before(grammarAccess.getWidgetAccess().getCheckboxParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckbox();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getCheckboxParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUiMockupLanguage.g:537:2: ( ruleButton )
                    {
                    // InternalUiMockupLanguage.g:537:2: ( ruleButton )
                    // InternalUiMockupLanguage.g:538:3: ruleButton
                    {
                     before(grammarAccess.getWidgetAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getButtonParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalUiMockupLanguage.g:547:1: rule__PrimaryExpression__Alternatives : ( ( ruleFeatureCall ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:551:1: ( ( ruleFeatureCall ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 11:
            case 12:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUiMockupLanguage.g:552:2: ( ruleFeatureCall )
                    {
                    // InternalUiMockupLanguage.g:552:2: ( ruleFeatureCall )
                    // InternalUiMockupLanguage.g:553:3: ruleFeatureCall
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureCall();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:558:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalUiMockupLanguage.g:558:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalUiMockupLanguage.g:559:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalUiMockupLanguage.g:560:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalUiMockupLanguage.g:560:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUiMockupLanguage.g:564:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalUiMockupLanguage.g:564:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalUiMockupLanguage.g:565:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalUiMockupLanguage.g:566:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalUiMockupLanguage.g:566:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__BoolLiteral__Alternatives"
    // InternalUiMockupLanguage.g:574:1: rule__BoolLiteral__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BoolLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:578:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUiMockupLanguage.g:579:2: ( 'true' )
                    {
                    // InternalUiMockupLanguage.g:579:2: ( 'true' )
                    // InternalUiMockupLanguage.g:580:3: 'true'
                    {
                     before(grammarAccess.getBoolLiteralAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBoolLiteralAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:585:2: ( 'false' )
                    {
                    // InternalUiMockupLanguage.g:585:2: ( 'false' )
                    // InternalUiMockupLanguage.g:586:3: 'false'
                    {
                     before(grammarAccess.getBoolLiteralAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBoolLiteralAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalUiMockupLanguage.g:595:1: rule__DataType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:599:1: ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUiMockupLanguage.g:600:2: ( ( 'String' ) )
                    {
                    // InternalUiMockupLanguage.g:600:2: ( ( 'String' ) )
                    // InternalUiMockupLanguage.g:601:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalUiMockupLanguage.g:602:3: ( 'String' )
                    // InternalUiMockupLanguage.g:602:4: 'String'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:606:2: ( ( 'Boolean' ) )
                    {
                    // InternalUiMockupLanguage.g:606:2: ( ( 'Boolean' ) )
                    // InternalUiMockupLanguage.g:607:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalUiMockupLanguage.g:608:3: ( 'Boolean' )
                    // InternalUiMockupLanguage.g:608:4: 'Boolean'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUiMockupLanguage.g:612:2: ( ( 'Integer' ) )
                    {
                    // InternalUiMockupLanguage.g:612:2: ( ( 'Integer' ) )
                    // InternalUiMockupLanguage.g:613:3: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 
                    // InternalUiMockupLanguage.g:614:3: ( 'Integer' )
                    // InternalUiMockupLanguage.g:614:4: 'Integer'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalUiMockupLanguage.g:622:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:626:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalUiMockupLanguage.g:627:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalUiMockupLanguage.g:634:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:638:1: ( ( 'entity' ) )
            // InternalUiMockupLanguage.g:639:1: ( 'entity' )
            {
            // InternalUiMockupLanguage.g:639:1: ( 'entity' )
            // InternalUiMockupLanguage.g:640:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalUiMockupLanguage.g:649:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:653:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalUiMockupLanguage.g:654:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalUiMockupLanguage.g:661:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:665:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalUiMockupLanguage.g:666:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalUiMockupLanguage.g:666:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalUiMockupLanguage.g:667:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalUiMockupLanguage.g:668:2: ( rule__Entity__NameAssignment_1 )
            // InternalUiMockupLanguage.g:668:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalUiMockupLanguage.g:676:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:680:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalUiMockupLanguage.g:681:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalUiMockupLanguage.g:688:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:692:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalUiMockupLanguage.g:693:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalUiMockupLanguage.g:693:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalUiMockupLanguage.g:694:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalUiMockupLanguage.g:695:2: ( rule__Entity__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUiMockupLanguage.g:695:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalUiMockupLanguage.g:703:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:707:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalUiMockupLanguage.g:708:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalUiMockupLanguage.g:715:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:719:1: ( ( '{' ) )
            // InternalUiMockupLanguage.g:720:1: ( '{' )
            {
            // InternalUiMockupLanguage.g:720:1: ( '{' )
            // InternalUiMockupLanguage.g:721:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalUiMockupLanguage.g:730:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:734:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalUiMockupLanguage.g:735:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalUiMockupLanguage.g:742:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttributesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:746:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalUiMockupLanguage.g:747:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalUiMockupLanguage.g:747:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalUiMockupLanguage.g:748:2: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalUiMockupLanguage.g:749:2: ( rule__Entity__AttributesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:749:3: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalUiMockupLanguage.g:757:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:761:1: ( rule__Entity__Group__5__Impl )
            // InternalUiMockupLanguage.g:762:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalUiMockupLanguage.g:768:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:772:1: ( ( '}' ) )
            // InternalUiMockupLanguage.g:773:1: ( '}' )
            {
            // InternalUiMockupLanguage.g:773:1: ( '}' )
            // InternalUiMockupLanguage.g:774:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalUiMockupLanguage.g:784:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:788:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalUiMockupLanguage.g:789:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalUiMockupLanguage.g:796:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:800:1: ( ( 'extends' ) )
            // InternalUiMockupLanguage.g:801:1: ( 'extends' )
            {
            // InternalUiMockupLanguage.g:801:1: ( 'extends' )
            // InternalUiMockupLanguage.g:802:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalUiMockupLanguage.g:811:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:815:1: ( rule__Entity__Group_2__1__Impl )
            // InternalUiMockupLanguage.g:816:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalUiMockupLanguage.g:822:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendsEntityAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:826:1: ( ( ( rule__Entity__ExtendsEntityAssignment_2_1 ) ) )
            // InternalUiMockupLanguage.g:827:1: ( ( rule__Entity__ExtendsEntityAssignment_2_1 ) )
            {
            // InternalUiMockupLanguage.g:827:1: ( ( rule__Entity__ExtendsEntityAssignment_2_1 ) )
            // InternalUiMockupLanguage.g:828:2: ( rule__Entity__ExtendsEntityAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityAssignment_2_1()); 
            // InternalUiMockupLanguage.g:829:2: ( rule__Entity__ExtendsEntityAssignment_2_1 )
            // InternalUiMockupLanguage.g:829:3: rule__Entity__ExtendsEntityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ExtendsEntityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsEntityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUiMockupLanguage.g:838:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:842:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUiMockupLanguage.g:843:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalUiMockupLanguage.g:850:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:854:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalUiMockupLanguage.g:855:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalUiMockupLanguage.g:855:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalUiMockupLanguage.g:856:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalUiMockupLanguage.g:857:2: ( rule__Attribute__NameAssignment_0 )
            // InternalUiMockupLanguage.g:857:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalUiMockupLanguage.g:865:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:869:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUiMockupLanguage.g:870:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalUiMockupLanguage.g:877:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:881:1: ( ( ':' ) )
            // InternalUiMockupLanguage.g:882:1: ( ':' )
            {
            // InternalUiMockupLanguage.g:882:1: ( ':' )
            // InternalUiMockupLanguage.g:883:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalUiMockupLanguage.g:892:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:896:1: ( rule__Attribute__Group__2__Impl )
            // InternalUiMockupLanguage.g:897:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalUiMockupLanguage.g:903:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:907:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalUiMockupLanguage.g:908:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalUiMockupLanguage.g:908:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalUiMockupLanguage.g:909:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalUiMockupLanguage.g:910:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalUiMockupLanguage.g:910:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Screen__Group__0"
    // InternalUiMockupLanguage.g:919:1: rule__Screen__Group__0 : rule__Screen__Group__0__Impl rule__Screen__Group__1 ;
    public final void rule__Screen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:923:1: ( rule__Screen__Group__0__Impl rule__Screen__Group__1 )
            // InternalUiMockupLanguage.g:924:2: rule__Screen__Group__0__Impl rule__Screen__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Screen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Screen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__0"


    // $ANTLR start "rule__Screen__Group__0__Impl"
    // InternalUiMockupLanguage.g:931:1: rule__Screen__Group__0__Impl : ( 'screen' ) ;
    public final void rule__Screen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:935:1: ( ( 'screen' ) )
            // InternalUiMockupLanguage.g:936:1: ( 'screen' )
            {
            // InternalUiMockupLanguage.g:936:1: ( 'screen' )
            // InternalUiMockupLanguage.g:937:2: 'screen'
            {
             before(grammarAccess.getScreenAccess().getScreenKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScreenAccess().getScreenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__0__Impl"


    // $ANTLR start "rule__Screen__Group__1"
    // InternalUiMockupLanguage.g:946:1: rule__Screen__Group__1 : rule__Screen__Group__1__Impl rule__Screen__Group__2 ;
    public final void rule__Screen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:950:1: ( rule__Screen__Group__1__Impl rule__Screen__Group__2 )
            // InternalUiMockupLanguage.g:951:2: rule__Screen__Group__1__Impl rule__Screen__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Screen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Screen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__1"


    // $ANTLR start "rule__Screen__Group__1__Impl"
    // InternalUiMockupLanguage.g:958:1: rule__Screen__Group__1__Impl : ( ( rule__Screen__NameAssignment_1 ) ) ;
    public final void rule__Screen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:962:1: ( ( ( rule__Screen__NameAssignment_1 ) ) )
            // InternalUiMockupLanguage.g:963:1: ( ( rule__Screen__NameAssignment_1 ) )
            {
            // InternalUiMockupLanguage.g:963:1: ( ( rule__Screen__NameAssignment_1 ) )
            // InternalUiMockupLanguage.g:964:2: ( rule__Screen__NameAssignment_1 )
            {
             before(grammarAccess.getScreenAccess().getNameAssignment_1()); 
            // InternalUiMockupLanguage.g:965:2: ( rule__Screen__NameAssignment_1 )
            // InternalUiMockupLanguage.g:965:3: rule__Screen__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Screen__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__1__Impl"


    // $ANTLR start "rule__Screen__Group__2"
    // InternalUiMockupLanguage.g:973:1: rule__Screen__Group__2 : rule__Screen__Group__2__Impl rule__Screen__Group__3 ;
    public final void rule__Screen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:977:1: ( rule__Screen__Group__2__Impl rule__Screen__Group__3 )
            // InternalUiMockupLanguage.g:978:2: rule__Screen__Group__2__Impl rule__Screen__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Screen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Screen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__2"


    // $ANTLR start "rule__Screen__Group__2__Impl"
    // InternalUiMockupLanguage.g:985:1: rule__Screen__Group__2__Impl : ( 'for' ) ;
    public final void rule__Screen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:989:1: ( ( 'for' ) )
            // InternalUiMockupLanguage.g:990:1: ( 'for' )
            {
            // InternalUiMockupLanguage.g:990:1: ( 'for' )
            // InternalUiMockupLanguage.g:991:2: 'for'
            {
             before(grammarAccess.getScreenAccess().getForKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScreenAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__2__Impl"


    // $ANTLR start "rule__Screen__Group__3"
    // InternalUiMockupLanguage.g:1000:1: rule__Screen__Group__3 : rule__Screen__Group__3__Impl rule__Screen__Group__4 ;
    public final void rule__Screen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1004:1: ( rule__Screen__Group__3__Impl rule__Screen__Group__4 )
            // InternalUiMockupLanguage.g:1005:2: rule__Screen__Group__3__Impl rule__Screen__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Screen__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Screen__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__3"


    // $ANTLR start "rule__Screen__Group__3__Impl"
    // InternalUiMockupLanguage.g:1012:1: rule__Screen__Group__3__Impl : ( ( rule__Screen__EntityAssignment_3 ) ) ;
    public final void rule__Screen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1016:1: ( ( ( rule__Screen__EntityAssignment_3 ) ) )
            // InternalUiMockupLanguage.g:1017:1: ( ( rule__Screen__EntityAssignment_3 ) )
            {
            // InternalUiMockupLanguage.g:1017:1: ( ( rule__Screen__EntityAssignment_3 ) )
            // InternalUiMockupLanguage.g:1018:2: ( rule__Screen__EntityAssignment_3 )
            {
             before(grammarAccess.getScreenAccess().getEntityAssignment_3()); 
            // InternalUiMockupLanguage.g:1019:2: ( rule__Screen__EntityAssignment_3 )
            // InternalUiMockupLanguage.g:1019:3: rule__Screen__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Screen__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScreenAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__3__Impl"


    // $ANTLR start "rule__Screen__Group__4"
    // InternalUiMockupLanguage.g:1027:1: rule__Screen__Group__4 : rule__Screen__Group__4__Impl rule__Screen__Group__5 ;
    public final void rule__Screen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1031:1: ( rule__Screen__Group__4__Impl rule__Screen__Group__5 )
            // InternalUiMockupLanguage.g:1032:2: rule__Screen__Group__4__Impl rule__Screen__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Screen__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Screen__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__4"


    // $ANTLR start "rule__Screen__Group__4__Impl"
    // InternalUiMockupLanguage.g:1039:1: rule__Screen__Group__4__Impl : ( '{' ) ;
    public final void rule__Screen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1043:1: ( ( '{' ) )
            // InternalUiMockupLanguage.g:1044:1: ( '{' )
            {
            // InternalUiMockupLanguage.g:1044:1: ( '{' )
            // InternalUiMockupLanguage.g:1045:2: '{'
            {
             before(grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__4__Impl"


    // $ANTLR start "rule__Screen__Group__5"
    // InternalUiMockupLanguage.g:1054:1: rule__Screen__Group__5 : rule__Screen__Group__5__Impl rule__Screen__Group__6 ;
    public final void rule__Screen__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1058:1: ( rule__Screen__Group__5__Impl rule__Screen__Group__6 )
            // InternalUiMockupLanguage.g:1059:2: rule__Screen__Group__5__Impl rule__Screen__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Screen__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Screen__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__5"


    // $ANTLR start "rule__Screen__Group__5__Impl"
    // InternalUiMockupLanguage.g:1066:1: rule__Screen__Group__5__Impl : ( ( rule__Screen__WidgetsAssignment_5 )* ) ;
    public final void rule__Screen__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1070:1: ( ( ( rule__Screen__WidgetsAssignment_5 )* ) )
            // InternalUiMockupLanguage.g:1071:1: ( ( rule__Screen__WidgetsAssignment_5 )* )
            {
            // InternalUiMockupLanguage.g:1071:1: ( ( rule__Screen__WidgetsAssignment_5 )* )
            // InternalUiMockupLanguage.g:1072:2: ( rule__Screen__WidgetsAssignment_5 )*
            {
             before(grammarAccess.getScreenAccess().getWidgetsAssignment_5()); 
            // InternalUiMockupLanguage.g:1073:2: ( rule__Screen__WidgetsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23||(LA9_0>=25 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:1073:3: rule__Screen__WidgetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Screen__WidgetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScreenAccess().getWidgetsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__5__Impl"


    // $ANTLR start "rule__Screen__Group__6"
    // InternalUiMockupLanguage.g:1081:1: rule__Screen__Group__6 : rule__Screen__Group__6__Impl ;
    public final void rule__Screen__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1085:1: ( rule__Screen__Group__6__Impl )
            // InternalUiMockupLanguage.g:1086:2: rule__Screen__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Screen__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__6"


    // $ANTLR start "rule__Screen__Group__6__Impl"
    // InternalUiMockupLanguage.g:1092:1: rule__Screen__Group__6__Impl : ( '}' ) ;
    public final void rule__Screen__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1096:1: ( ( '}' ) )
            // InternalUiMockupLanguage.g:1097:1: ( '}' )
            {
            // InternalUiMockupLanguage.g:1097:1: ( '}' )
            // InternalUiMockupLanguage.g:1098:2: '}'
            {
             before(grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__Group__6__Impl"


    // $ANTLR start "rule__TextField__Group__0"
    // InternalUiMockupLanguage.g:1108:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1112:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // InternalUiMockupLanguage.g:1113:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TextField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0"


    // $ANTLR start "rule__TextField__Group__0__Impl"
    // InternalUiMockupLanguage.g:1120:1: rule__TextField__Group__0__Impl : ( 'text' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1124:1: ( ( 'text' ) )
            // InternalUiMockupLanguage.g:1125:1: ( 'text' )
            {
            // InternalUiMockupLanguage.g:1125:1: ( 'text' )
            // InternalUiMockupLanguage.g:1126:2: 'text'
            {
             before(grammarAccess.getTextFieldAccess().getTextKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0__Impl"


    // $ANTLR start "rule__TextField__Group__1"
    // InternalUiMockupLanguage.g:1135:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl rule__TextField__Group__2 ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1139:1: ( rule__TextField__Group__1__Impl rule__TextField__Group__2 )
            // InternalUiMockupLanguage.g:1140:2: rule__TextField__Group__1__Impl rule__TextField__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TextField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1"


    // $ANTLR start "rule__TextField__Group__1__Impl"
    // InternalUiMockupLanguage.g:1147:1: rule__TextField__Group__1__Impl : ( ( rule__TextField__NameAssignment_1 ) ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1151:1: ( ( ( rule__TextField__NameAssignment_1 ) ) )
            // InternalUiMockupLanguage.g:1152:1: ( ( rule__TextField__NameAssignment_1 ) )
            {
            // InternalUiMockupLanguage.g:1152:1: ( ( rule__TextField__NameAssignment_1 ) )
            // InternalUiMockupLanguage.g:1153:2: ( rule__TextField__NameAssignment_1 )
            {
             before(grammarAccess.getTextFieldAccess().getNameAssignment_1()); 
            // InternalUiMockupLanguage.g:1154:2: ( rule__TextField__NameAssignment_1 )
            // InternalUiMockupLanguage.g:1154:3: rule__TextField__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextField__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1__Impl"


    // $ANTLR start "rule__TextField__Group__2"
    // InternalUiMockupLanguage.g:1162:1: rule__TextField__Group__2 : rule__TextField__Group__2__Impl ;
    public final void rule__TextField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1166:1: ( rule__TextField__Group__2__Impl )
            // InternalUiMockupLanguage.g:1167:2: rule__TextField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextField__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2"


    // $ANTLR start "rule__TextField__Group__2__Impl"
    // InternalUiMockupLanguage.g:1173:1: rule__TextField__Group__2__Impl : ( ( rule__TextField__Group_2__0 )? ) ;
    public final void rule__TextField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1177:1: ( ( ( rule__TextField__Group_2__0 )? ) )
            // InternalUiMockupLanguage.g:1178:1: ( ( rule__TextField__Group_2__0 )? )
            {
            // InternalUiMockupLanguage.g:1178:1: ( ( rule__TextField__Group_2__0 )? )
            // InternalUiMockupLanguage.g:1179:2: ( rule__TextField__Group_2__0 )?
            {
             before(grammarAccess.getTextFieldAccess().getGroup_2()); 
            // InternalUiMockupLanguage.g:1180:2: ( rule__TextField__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUiMockupLanguage.g:1180:3: rule__TextField__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextField__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextFieldAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2__Impl"


    // $ANTLR start "rule__TextField__Group_2__0"
    // InternalUiMockupLanguage.g:1189:1: rule__TextField__Group_2__0 : rule__TextField__Group_2__0__Impl rule__TextField__Group_2__1 ;
    public final void rule__TextField__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1193:1: ( rule__TextField__Group_2__0__Impl rule__TextField__Group_2__1 )
            // InternalUiMockupLanguage.g:1194:2: rule__TextField__Group_2__0__Impl rule__TextField__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__TextField__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextField__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_2__0"


    // $ANTLR start "rule__TextField__Group_2__0__Impl"
    // InternalUiMockupLanguage.g:1201:1: rule__TextField__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TextField__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1205:1: ( ( 'label' ) )
            // InternalUiMockupLanguage.g:1206:1: ( 'label' )
            {
            // InternalUiMockupLanguage.g:1206:1: ( 'label' )
            // InternalUiMockupLanguage.g:1207:2: 'label'
            {
             before(grammarAccess.getTextFieldAccess().getLabelKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getLabelKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_2__0__Impl"


    // $ANTLR start "rule__TextField__Group_2__1"
    // InternalUiMockupLanguage.g:1216:1: rule__TextField__Group_2__1 : rule__TextField__Group_2__1__Impl ;
    public final void rule__TextField__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1220:1: ( rule__TextField__Group_2__1__Impl )
            // InternalUiMockupLanguage.g:1221:2: rule__TextField__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextField__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_2__1"


    // $ANTLR start "rule__TextField__Group_2__1__Impl"
    // InternalUiMockupLanguage.g:1227:1: rule__TextField__Group_2__1__Impl : ( ( rule__TextField__LabelAssignment_2_1 ) ) ;
    public final void rule__TextField__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1231:1: ( ( ( rule__TextField__LabelAssignment_2_1 ) ) )
            // InternalUiMockupLanguage.g:1232:1: ( ( rule__TextField__LabelAssignment_2_1 ) )
            {
            // InternalUiMockupLanguage.g:1232:1: ( ( rule__TextField__LabelAssignment_2_1 ) )
            // InternalUiMockupLanguage.g:1233:2: ( rule__TextField__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTextFieldAccess().getLabelAssignment_2_1()); 
            // InternalUiMockupLanguage.g:1234:2: ( rule__TextField__LabelAssignment_2_1 )
            // InternalUiMockupLanguage.g:1234:3: rule__TextField__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TextField__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_2__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__0"
    // InternalUiMockupLanguage.g:1243:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1247:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalUiMockupLanguage.g:1248:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Checkbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0"


    // $ANTLR start "rule__Checkbox__Group__0__Impl"
    // InternalUiMockupLanguage.g:1255:1: rule__Checkbox__Group__0__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1259:1: ( ( 'checkbox' ) )
            // InternalUiMockupLanguage.g:1260:1: ( 'checkbox' )
            {
            // InternalUiMockupLanguage.g:1260:1: ( 'checkbox' )
            // InternalUiMockupLanguage.g:1261:2: 'checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__0__Impl"


    // $ANTLR start "rule__Checkbox__Group__1"
    // InternalUiMockupLanguage.g:1270:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1274:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalUiMockupLanguage.g:1275:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Checkbox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1"


    // $ANTLR start "rule__Checkbox__Group__1__Impl"
    // InternalUiMockupLanguage.g:1282:1: rule__Checkbox__Group__1__Impl : ( ( rule__Checkbox__NameAssignment_1 ) ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1286:1: ( ( ( rule__Checkbox__NameAssignment_1 ) ) )
            // InternalUiMockupLanguage.g:1287:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            {
            // InternalUiMockupLanguage.g:1287:1: ( ( rule__Checkbox__NameAssignment_1 ) )
            // InternalUiMockupLanguage.g:1288:2: ( rule__Checkbox__NameAssignment_1 )
            {
             before(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 
            // InternalUiMockupLanguage.g:1289:2: ( rule__Checkbox__NameAssignment_1 )
            // InternalUiMockupLanguage.g:1289:3: rule__Checkbox__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__2"
    // InternalUiMockupLanguage.g:1297:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1301:1: ( rule__Checkbox__Group__2__Impl )
            // InternalUiMockupLanguage.g:1302:2: rule__Checkbox__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2"


    // $ANTLR start "rule__Checkbox__Group__2__Impl"
    // InternalUiMockupLanguage.g:1308:1: rule__Checkbox__Group__2__Impl : ( ( rule__Checkbox__Group_2__0 )? ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1312:1: ( ( ( rule__Checkbox__Group_2__0 )? ) )
            // InternalUiMockupLanguage.g:1313:1: ( ( rule__Checkbox__Group_2__0 )? )
            {
            // InternalUiMockupLanguage.g:1313:1: ( ( rule__Checkbox__Group_2__0 )? )
            // InternalUiMockupLanguage.g:1314:2: ( rule__Checkbox__Group_2__0 )?
            {
             before(grammarAccess.getCheckboxAccess().getGroup_2()); 
            // InternalUiMockupLanguage.g:1315:2: ( rule__Checkbox__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUiMockupLanguage.g:1315:3: rule__Checkbox__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Checkbox__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckboxAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group__2__Impl"


    // $ANTLR start "rule__Checkbox__Group_2__0"
    // InternalUiMockupLanguage.g:1324:1: rule__Checkbox__Group_2__0 : rule__Checkbox__Group_2__0__Impl rule__Checkbox__Group_2__1 ;
    public final void rule__Checkbox__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1328:1: ( rule__Checkbox__Group_2__0__Impl rule__Checkbox__Group_2__1 )
            // InternalUiMockupLanguage.g:1329:2: rule__Checkbox__Group_2__0__Impl rule__Checkbox__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Checkbox__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group_2__0"


    // $ANTLR start "rule__Checkbox__Group_2__0__Impl"
    // InternalUiMockupLanguage.g:1336:1: rule__Checkbox__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__Checkbox__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1340:1: ( ( 'label' ) )
            // InternalUiMockupLanguage.g:1341:1: ( 'label' )
            {
            // InternalUiMockupLanguage.g:1341:1: ( 'label' )
            // InternalUiMockupLanguage.g:1342:2: 'label'
            {
             before(grammarAccess.getCheckboxAccess().getLabelKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getLabelKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group_2__0__Impl"


    // $ANTLR start "rule__Checkbox__Group_2__1"
    // InternalUiMockupLanguage.g:1351:1: rule__Checkbox__Group_2__1 : rule__Checkbox__Group_2__1__Impl ;
    public final void rule__Checkbox__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1355:1: ( rule__Checkbox__Group_2__1__Impl )
            // InternalUiMockupLanguage.g:1356:2: rule__Checkbox__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group_2__1"


    // $ANTLR start "rule__Checkbox__Group_2__1__Impl"
    // InternalUiMockupLanguage.g:1362:1: rule__Checkbox__Group_2__1__Impl : ( ( rule__Checkbox__LabelAssignment_2_1 ) ) ;
    public final void rule__Checkbox__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1366:1: ( ( ( rule__Checkbox__LabelAssignment_2_1 ) ) )
            // InternalUiMockupLanguage.g:1367:1: ( ( rule__Checkbox__LabelAssignment_2_1 ) )
            {
            // InternalUiMockupLanguage.g:1367:1: ( ( rule__Checkbox__LabelAssignment_2_1 ) )
            // InternalUiMockupLanguage.g:1368:2: ( rule__Checkbox__LabelAssignment_2_1 )
            {
             before(grammarAccess.getCheckboxAccess().getLabelAssignment_2_1()); 
            // InternalUiMockupLanguage.g:1369:2: ( rule__Checkbox__LabelAssignment_2_1 )
            // InternalUiMockupLanguage.g:1369:3: rule__Checkbox__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__Group_2__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalUiMockupLanguage.g:1378:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1382:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalUiMockupLanguage.g:1383:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalUiMockupLanguage.g:1390:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1394:1: ( ( 'button' ) )
            // InternalUiMockupLanguage.g:1395:1: ( 'button' )
            {
            // InternalUiMockupLanguage.g:1395:1: ( 'button' )
            // InternalUiMockupLanguage.g:1396:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalUiMockupLanguage.g:1405:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1409:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalUiMockupLanguage.g:1410:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalUiMockupLanguage.g:1417:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1421:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalUiMockupLanguage.g:1422:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalUiMockupLanguage.g:1422:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalUiMockupLanguage.g:1423:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalUiMockupLanguage.g:1424:2: ( rule__Button__NameAssignment_1 )
            // InternalUiMockupLanguage.g:1424:3: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalUiMockupLanguage.g:1432:1: rule__Button__Group__2 : rule__Button__Group__2__Impl ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1436:1: ( rule__Button__Group__2__Impl )
            // InternalUiMockupLanguage.g:1437:2: rule__Button__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalUiMockupLanguage.g:1443:1: rule__Button__Group__2__Impl : ( ( rule__Button__Group_2__0 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1447:1: ( ( ( rule__Button__Group_2__0 )? ) )
            // InternalUiMockupLanguage.g:1448:1: ( ( rule__Button__Group_2__0 )? )
            {
            // InternalUiMockupLanguage.g:1448:1: ( ( rule__Button__Group_2__0 )? )
            // InternalUiMockupLanguage.g:1449:2: ( rule__Button__Group_2__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_2()); 
            // InternalUiMockupLanguage.g:1450:2: ( rule__Button__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUiMockupLanguage.g:1450:3: rule__Button__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group_2__0"
    // InternalUiMockupLanguage.g:1459:1: rule__Button__Group_2__0 : rule__Button__Group_2__0__Impl rule__Button__Group_2__1 ;
    public final void rule__Button__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1463:1: ( rule__Button__Group_2__0__Impl rule__Button__Group_2__1 )
            // InternalUiMockupLanguage.g:1464:2: rule__Button__Group_2__0__Impl rule__Button__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Button__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_2__0"


    // $ANTLR start "rule__Button__Group_2__0__Impl"
    // InternalUiMockupLanguage.g:1471:1: rule__Button__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__Button__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1475:1: ( ( 'label' ) )
            // InternalUiMockupLanguage.g:1476:1: ( 'label' )
            {
            // InternalUiMockupLanguage.g:1476:1: ( 'label' )
            // InternalUiMockupLanguage.g:1477:2: 'label'
            {
             before(grammarAccess.getButtonAccess().getLabelKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getLabelKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_2__0__Impl"


    // $ANTLR start "rule__Button__Group_2__1"
    // InternalUiMockupLanguage.g:1486:1: rule__Button__Group_2__1 : rule__Button__Group_2__1__Impl ;
    public final void rule__Button__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1490:1: ( rule__Button__Group_2__1__Impl )
            // InternalUiMockupLanguage.g:1491:2: rule__Button__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_2__1"


    // $ANTLR start "rule__Button__Group_2__1__Impl"
    // InternalUiMockupLanguage.g:1497:1: rule__Button__Group_2__1__Impl : ( ( rule__Button__LabelAssignment_2_1 ) ) ;
    public final void rule__Button__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1501:1: ( ( ( rule__Button__LabelAssignment_2_1 ) ) )
            // InternalUiMockupLanguage.g:1502:1: ( ( rule__Button__LabelAssignment_2_1 ) )
            {
            // InternalUiMockupLanguage.g:1502:1: ( ( rule__Button__LabelAssignment_2_1 ) )
            // InternalUiMockupLanguage.g:1503:2: ( rule__Button__LabelAssignment_2_1 )
            {
             before(grammarAccess.getButtonAccess().getLabelAssignment_2_1()); 
            // InternalUiMockupLanguage.g:1504:2: ( rule__Button__LabelAssignment_2_1 )
            // InternalUiMockupLanguage.g:1504:3: rule__Button__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_2__1__Impl"


    // $ANTLR start "rule__Navigation__Group__0"
    // InternalUiMockupLanguage.g:1513:1: rule__Navigation__Group__0 : rule__Navigation__Group__0__Impl rule__Navigation__Group__1 ;
    public final void rule__Navigation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1517:1: ( rule__Navigation__Group__0__Impl rule__Navigation__Group__1 )
            // InternalUiMockupLanguage.g:1518:2: rule__Navigation__Group__0__Impl rule__Navigation__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Navigation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__0"


    // $ANTLR start "rule__Navigation__Group__0__Impl"
    // InternalUiMockupLanguage.g:1525:1: rule__Navigation__Group__0__Impl : ( 'navigate' ) ;
    public final void rule__Navigation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1529:1: ( ( 'navigate' ) )
            // InternalUiMockupLanguage.g:1530:1: ( 'navigate' )
            {
            // InternalUiMockupLanguage.g:1530:1: ( 'navigate' )
            // InternalUiMockupLanguage.g:1531:2: 'navigate'
            {
             before(grammarAccess.getNavigationAccess().getNavigateKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNavigationAccess().getNavigateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__0__Impl"


    // $ANTLR start "rule__Navigation__Group__1"
    // InternalUiMockupLanguage.g:1540:1: rule__Navigation__Group__1 : rule__Navigation__Group__1__Impl rule__Navigation__Group__2 ;
    public final void rule__Navigation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1544:1: ( rule__Navigation__Group__1__Impl rule__Navigation__Group__2 )
            // InternalUiMockupLanguage.g:1545:2: rule__Navigation__Group__1__Impl rule__Navigation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Navigation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__1"


    // $ANTLR start "rule__Navigation__Group__1__Impl"
    // InternalUiMockupLanguage.g:1552:1: rule__Navigation__Group__1__Impl : ( 'from' ) ;
    public final void rule__Navigation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1556:1: ( ( 'from' ) )
            // InternalUiMockupLanguage.g:1557:1: ( 'from' )
            {
            // InternalUiMockupLanguage.g:1557:1: ( 'from' )
            // InternalUiMockupLanguage.g:1558:2: 'from'
            {
             before(grammarAccess.getNavigationAccess().getFromKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNavigationAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__1__Impl"


    // $ANTLR start "rule__Navigation__Group__2"
    // InternalUiMockupLanguage.g:1567:1: rule__Navigation__Group__2 : rule__Navigation__Group__2__Impl rule__Navigation__Group__3 ;
    public final void rule__Navigation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1571:1: ( rule__Navigation__Group__2__Impl rule__Navigation__Group__3 )
            // InternalUiMockupLanguage.g:1572:2: rule__Navigation__Group__2__Impl rule__Navigation__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Navigation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__2"


    // $ANTLR start "rule__Navigation__Group__2__Impl"
    // InternalUiMockupLanguage.g:1579:1: rule__Navigation__Group__2__Impl : ( ( rule__Navigation__SourceAssignment_2 ) ) ;
    public final void rule__Navigation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1583:1: ( ( ( rule__Navigation__SourceAssignment_2 ) ) )
            // InternalUiMockupLanguage.g:1584:1: ( ( rule__Navigation__SourceAssignment_2 ) )
            {
            // InternalUiMockupLanguage.g:1584:1: ( ( rule__Navigation__SourceAssignment_2 ) )
            // InternalUiMockupLanguage.g:1585:2: ( rule__Navigation__SourceAssignment_2 )
            {
             before(grammarAccess.getNavigationAccess().getSourceAssignment_2()); 
            // InternalUiMockupLanguage.g:1586:2: ( rule__Navigation__SourceAssignment_2 )
            // InternalUiMockupLanguage.g:1586:3: rule__Navigation__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Navigation__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__2__Impl"


    // $ANTLR start "rule__Navigation__Group__3"
    // InternalUiMockupLanguage.g:1594:1: rule__Navigation__Group__3 : rule__Navigation__Group__3__Impl rule__Navigation__Group__4 ;
    public final void rule__Navigation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1598:1: ( rule__Navigation__Group__3__Impl rule__Navigation__Group__4 )
            // InternalUiMockupLanguage.g:1599:2: rule__Navigation__Group__3__Impl rule__Navigation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Navigation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__3"


    // $ANTLR start "rule__Navigation__Group__3__Impl"
    // InternalUiMockupLanguage.g:1606:1: rule__Navigation__Group__3__Impl : ( 'to' ) ;
    public final void rule__Navigation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1610:1: ( ( 'to' ) )
            // InternalUiMockupLanguage.g:1611:1: ( 'to' )
            {
            // InternalUiMockupLanguage.g:1611:1: ( 'to' )
            // InternalUiMockupLanguage.g:1612:2: 'to'
            {
             before(grammarAccess.getNavigationAccess().getToKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNavigationAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__3__Impl"


    // $ANTLR start "rule__Navigation__Group__4"
    // InternalUiMockupLanguage.g:1621:1: rule__Navigation__Group__4 : rule__Navigation__Group__4__Impl rule__Navigation__Group__5 ;
    public final void rule__Navigation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1625:1: ( rule__Navigation__Group__4__Impl rule__Navigation__Group__5 )
            // InternalUiMockupLanguage.g:1626:2: rule__Navigation__Group__4__Impl rule__Navigation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Navigation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__4"


    // $ANTLR start "rule__Navigation__Group__4__Impl"
    // InternalUiMockupLanguage.g:1633:1: rule__Navigation__Group__4__Impl : ( ( rule__Navigation__TargetAssignment_4 ) ) ;
    public final void rule__Navigation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1637:1: ( ( ( rule__Navigation__TargetAssignment_4 ) ) )
            // InternalUiMockupLanguage.g:1638:1: ( ( rule__Navigation__TargetAssignment_4 ) )
            {
            // InternalUiMockupLanguage.g:1638:1: ( ( rule__Navigation__TargetAssignment_4 ) )
            // InternalUiMockupLanguage.g:1639:2: ( rule__Navigation__TargetAssignment_4 )
            {
             before(grammarAccess.getNavigationAccess().getTargetAssignment_4()); 
            // InternalUiMockupLanguage.g:1640:2: ( rule__Navigation__TargetAssignment_4 )
            // InternalUiMockupLanguage.g:1640:3: rule__Navigation__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Navigation__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__4__Impl"


    // $ANTLR start "rule__Navigation__Group__5"
    // InternalUiMockupLanguage.g:1648:1: rule__Navigation__Group__5 : rule__Navigation__Group__5__Impl ;
    public final void rule__Navigation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1652:1: ( rule__Navigation__Group__5__Impl )
            // InternalUiMockupLanguage.g:1653:2: rule__Navigation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navigation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__5"


    // $ANTLR start "rule__Navigation__Group__5__Impl"
    // InternalUiMockupLanguage.g:1659:1: rule__Navigation__Group__5__Impl : ( ( rule__Navigation__Group_5__0 )? ) ;
    public final void rule__Navigation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1663:1: ( ( ( rule__Navigation__Group_5__0 )? ) )
            // InternalUiMockupLanguage.g:1664:1: ( ( rule__Navigation__Group_5__0 )? )
            {
            // InternalUiMockupLanguage.g:1664:1: ( ( rule__Navigation__Group_5__0 )? )
            // InternalUiMockupLanguage.g:1665:2: ( rule__Navigation__Group_5__0 )?
            {
             before(grammarAccess.getNavigationAccess().getGroup_5()); 
            // InternalUiMockupLanguage.g:1666:2: ( rule__Navigation__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUiMockupLanguage.g:1666:3: rule__Navigation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Navigation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group__5__Impl"


    // $ANTLR start "rule__Navigation__Group_5__0"
    // InternalUiMockupLanguage.g:1675:1: rule__Navigation__Group_5__0 : rule__Navigation__Group_5__0__Impl rule__Navigation__Group_5__1 ;
    public final void rule__Navigation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1679:1: ( rule__Navigation__Group_5__0__Impl rule__Navigation__Group_5__1 )
            // InternalUiMockupLanguage.g:1680:2: rule__Navigation__Group_5__0__Impl rule__Navigation__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Navigation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group_5__0"


    // $ANTLR start "rule__Navigation__Group_5__0__Impl"
    // InternalUiMockupLanguage.g:1687:1: rule__Navigation__Group_5__0__Impl : ( 'when' ) ;
    public final void rule__Navigation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1691:1: ( ( 'when' ) )
            // InternalUiMockupLanguage.g:1692:1: ( 'when' )
            {
            // InternalUiMockupLanguage.g:1692:1: ( 'when' )
            // InternalUiMockupLanguage.g:1693:2: 'when'
            {
             before(grammarAccess.getNavigationAccess().getWhenKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNavigationAccess().getWhenKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group_5__0__Impl"


    // $ANTLR start "rule__Navigation__Group_5__1"
    // InternalUiMockupLanguage.g:1702:1: rule__Navigation__Group_5__1 : rule__Navigation__Group_5__1__Impl ;
    public final void rule__Navigation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1706:1: ( rule__Navigation__Group_5__1__Impl )
            // InternalUiMockupLanguage.g:1707:2: rule__Navigation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navigation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group_5__1"


    // $ANTLR start "rule__Navigation__Group_5__1__Impl"
    // InternalUiMockupLanguage.g:1713:1: rule__Navigation__Group_5__1__Impl : ( ( rule__Navigation__ConditionAssignment_5_1 ) ) ;
    public final void rule__Navigation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1717:1: ( ( ( rule__Navigation__ConditionAssignment_5_1 ) ) )
            // InternalUiMockupLanguage.g:1718:1: ( ( rule__Navigation__ConditionAssignment_5_1 ) )
            {
            // InternalUiMockupLanguage.g:1718:1: ( ( rule__Navigation__ConditionAssignment_5_1 ) )
            // InternalUiMockupLanguage.g:1719:2: ( rule__Navigation__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getNavigationAccess().getConditionAssignment_5_1()); 
            // InternalUiMockupLanguage.g:1720:2: ( rule__Navigation__ConditionAssignment_5_1 )
            // InternalUiMockupLanguage.g:1720:3: rule__Navigation__ConditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Navigation__ConditionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getConditionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__Group_5__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalUiMockupLanguage.g:1729:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1733:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalUiMockupLanguage.g:1734:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalUiMockupLanguage.g:1741:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1745:1: ( ( 'if' ) )
            // InternalUiMockupLanguage.g:1746:1: ( 'if' )
            {
            // InternalUiMockupLanguage.g:1746:1: ( 'if' )
            // InternalUiMockupLanguage.g:1747:2: 'if'
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalUiMockupLanguage.g:1756:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1760:1: ( rule__Condition__Group__1__Impl )
            // InternalUiMockupLanguage.g:1761:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalUiMockupLanguage.g:1767:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ExpressionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1771:1: ( ( ( rule__Condition__ExpressionAssignment_1 ) ) )
            // InternalUiMockupLanguage.g:1772:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            {
            // InternalUiMockupLanguage.g:1772:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            // InternalUiMockupLanguage.g:1773:2: ( rule__Condition__ExpressionAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 
            // InternalUiMockupLanguage.g:1774:2: ( rule__Condition__ExpressionAssignment_1 )
            // InternalUiMockupLanguage.g:1774:3: rule__Condition__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalUiMockupLanguage.g:1783:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1787:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalUiMockupLanguage.g:1788:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalUiMockupLanguage.g:1795:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1799:1: ( ( ruleAndExpression ) )
            // InternalUiMockupLanguage.g:1800:1: ( ruleAndExpression )
            {
            // InternalUiMockupLanguage.g:1800:1: ( ruleAndExpression )
            // InternalUiMockupLanguage.g:1801:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalUiMockupLanguage.g:1810:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1814:1: ( rule__OrExpression__Group__1__Impl )
            // InternalUiMockupLanguage.g:1815:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalUiMockupLanguage.g:1821:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1825:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalUiMockupLanguage.g:1826:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalUiMockupLanguage.g:1826:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalUiMockupLanguage.g:1827:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalUiMockupLanguage.g:1828:2: ( rule__OrExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:1828:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalUiMockupLanguage.g:1837:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1841:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalUiMockupLanguage.g:1842:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalUiMockupLanguage.g:1849:1: rule__OrExpression__Group_1__0__Impl : ( '||' ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1853:1: ( ( '||' ) )
            // InternalUiMockupLanguage.g:1854:1: ( '||' )
            {
            // InternalUiMockupLanguage.g:1854:1: ( '||' )
            // InternalUiMockupLanguage.g:1855:2: '||'
            {
             before(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalUiMockupLanguage.g:1864:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1868:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalUiMockupLanguage.g:1869:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalUiMockupLanguage.g:1875:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1879:1: ( ( ( rule__OrExpression__RightAssignment_1_1 ) ) )
            // InternalUiMockupLanguage.g:1880:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            {
            // InternalUiMockupLanguage.g:1880:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            // InternalUiMockupLanguage.g:1881:2: ( rule__OrExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            // InternalUiMockupLanguage.g:1882:2: ( rule__OrExpression__RightAssignment_1_1 )
            // InternalUiMockupLanguage.g:1882:3: rule__OrExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalUiMockupLanguage.g:1891:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1895:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalUiMockupLanguage.g:1896:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalUiMockupLanguage.g:1903:1: rule__AndExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1907:1: ( ( rulePrimaryExpression ) )
            // InternalUiMockupLanguage.g:1908:1: ( rulePrimaryExpression )
            {
            // InternalUiMockupLanguage.g:1908:1: ( rulePrimaryExpression )
            // InternalUiMockupLanguage.g:1909:2: rulePrimaryExpression
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalUiMockupLanguage.g:1918:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1922:1: ( rule__AndExpression__Group__1__Impl )
            // InternalUiMockupLanguage.g:1923:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalUiMockupLanguage.g:1929:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1933:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalUiMockupLanguage.g:1934:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalUiMockupLanguage.g:1934:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalUiMockupLanguage.g:1935:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalUiMockupLanguage.g:1936:2: ( rule__AndExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:1936:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalUiMockupLanguage.g:1945:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1949:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalUiMockupLanguage.g:1950:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalUiMockupLanguage.g:1957:1: rule__AndExpression__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1961:1: ( ( '&&' ) )
            // InternalUiMockupLanguage.g:1962:1: ( '&&' )
            {
            // InternalUiMockupLanguage.g:1962:1: ( '&&' )
            // InternalUiMockupLanguage.g:1963:2: '&&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalUiMockupLanguage.g:1972:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1976:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalUiMockupLanguage.g:1977:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalUiMockupLanguage.g:1983:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:1987:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalUiMockupLanguage.g:1988:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalUiMockupLanguage.g:1988:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalUiMockupLanguage.g:1989:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            // InternalUiMockupLanguage.g:1990:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalUiMockupLanguage.g:1990:3: rule__AndExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalUiMockupLanguage.g:1999:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2003:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalUiMockupLanguage.g:2004:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalUiMockupLanguage.g:2011:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2015:1: ( ( () ) )
            // InternalUiMockupLanguage.g:2016:1: ( () )
            {
            // InternalUiMockupLanguage.g:2016:1: ( () )
            // InternalUiMockupLanguage.g:2017:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAction_1_0()); 
            // InternalUiMockupLanguage.g:2018:2: ()
            // InternalUiMockupLanguage.g:2018:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalUiMockupLanguage.g:2026:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2030:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalUiMockupLanguage.g:2031:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalUiMockupLanguage.g:2037:1: rule__PrimaryExpression__Group_1__1__Impl : ( ruleBoolLiteral ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2041:1: ( ( ruleBoolLiteral ) )
            // InternalUiMockupLanguage.g:2042:1: ( ruleBoolLiteral )
            {
            // InternalUiMockupLanguage.g:2042:1: ( ruleBoolLiteral )
            // InternalUiMockupLanguage.g:2043:2: ruleBoolLiteral
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBoolLiteralParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleBoolLiteral();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getBoolLiteralParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalUiMockupLanguage.g:2053:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2057:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalUiMockupLanguage.g:2058:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalUiMockupLanguage.g:2065:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2069:1: ( ( () ) )
            // InternalUiMockupLanguage.g:2070:1: ( () )
            {
            // InternalUiMockupLanguage.g:2070:1: ( () )
            // InternalUiMockupLanguage.g:2071:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAction_2_0()); 
            // InternalUiMockupLanguage.g:2072:2: ()
            // InternalUiMockupLanguage.g:2072:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalUiMockupLanguage.g:2080:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2084:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalUiMockupLanguage.g:2085:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalUiMockupLanguage.g:2091:1: rule__PrimaryExpression__Group_2__1__Impl : ( ruleStringLiteral ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2095:1: ( ( ruleStringLiteral ) )
            // InternalUiMockupLanguage.g:2096:1: ( ruleStringLiteral )
            {
            // InternalUiMockupLanguage.g:2096:1: ( ruleStringLiteral )
            // InternalUiMockupLanguage.g:2097:2: ruleStringLiteral
            {
             before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getStringLiteralParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group__0"
    // InternalUiMockupLanguage.g:2107:1: rule__FeatureCall__Group__0 : rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1 ;
    public final void rule__FeatureCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2111:1: ( rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1 )
            // InternalUiMockupLanguage.g:2112:2: rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__0"


    // $ANTLR start "rule__FeatureCall__Group__0__Impl"
    // InternalUiMockupLanguage.g:2119:1: rule__FeatureCall__Group__0__Impl : ( () ) ;
    public final void rule__FeatureCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2123:1: ( ( () ) )
            // InternalUiMockupLanguage.g:2124:1: ( () )
            {
            // InternalUiMockupLanguage.g:2124:1: ( () )
            // InternalUiMockupLanguage.g:2125:2: ()
            {
             before(grammarAccess.getFeatureCallAccess().getFeatureCallAction_0()); 
            // InternalUiMockupLanguage.g:2126:2: ()
            // InternalUiMockupLanguage.g:2126:3: 
            {
            }

             after(grammarAccess.getFeatureCallAccess().getFeatureCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group__1"
    // InternalUiMockupLanguage.g:2134:1: rule__FeatureCall__Group__1 : rule__FeatureCall__Group__1__Impl rule__FeatureCall__Group__2 ;
    public final void rule__FeatureCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2138:1: ( rule__FeatureCall__Group__1__Impl rule__FeatureCall__Group__2 )
            // InternalUiMockupLanguage.g:2139:2: rule__FeatureCall__Group__1__Impl rule__FeatureCall__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__FeatureCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__1"


    // $ANTLR start "rule__FeatureCall__Group__1__Impl"
    // InternalUiMockupLanguage.g:2146:1: rule__FeatureCall__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__FeatureCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2150:1: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2151:1: ( RULE_ID )
            {
            // InternalUiMockupLanguage.g:2151:1: ( RULE_ID )
            // InternalUiMockupLanguage.g:2152:2: RULE_ID
            {
             before(grammarAccess.getFeatureCallAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureCallAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group__2"
    // InternalUiMockupLanguage.g:2161:1: rule__FeatureCall__Group__2 : rule__FeatureCall__Group__2__Impl ;
    public final void rule__FeatureCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2165:1: ( rule__FeatureCall__Group__2__Impl )
            // InternalUiMockupLanguage.g:2166:2: rule__FeatureCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__2"


    // $ANTLR start "rule__FeatureCall__Group__2__Impl"
    // InternalUiMockupLanguage.g:2172:1: rule__FeatureCall__Group__2__Impl : ( ( rule__FeatureCall__Group_2__0 )? ) ;
    public final void rule__FeatureCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2176:1: ( ( ( rule__FeatureCall__Group_2__0 )? ) )
            // InternalUiMockupLanguage.g:2177:1: ( ( rule__FeatureCall__Group_2__0 )? )
            {
            // InternalUiMockupLanguage.g:2177:1: ( ( rule__FeatureCall__Group_2__0 )? )
            // InternalUiMockupLanguage.g:2178:2: ( rule__FeatureCall__Group_2__0 )?
            {
             before(grammarAccess.getFeatureCallAccess().getGroup_2()); 
            // InternalUiMockupLanguage.g:2179:2: ( rule__FeatureCall__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUiMockupLanguage.g:2179:3: rule__FeatureCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__2__Impl"


    // $ANTLR start "rule__FeatureCall__Group_2__0"
    // InternalUiMockupLanguage.g:2188:1: rule__FeatureCall__Group_2__0 : rule__FeatureCall__Group_2__0__Impl rule__FeatureCall__Group_2__1 ;
    public final void rule__FeatureCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2192:1: ( rule__FeatureCall__Group_2__0__Impl rule__FeatureCall__Group_2__1 )
            // InternalUiMockupLanguage.g:2193:2: rule__FeatureCall__Group_2__0__Impl rule__FeatureCall__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__FeatureCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2__0"


    // $ANTLR start "rule__FeatureCall__Group_2__0__Impl"
    // InternalUiMockupLanguage.g:2200:1: rule__FeatureCall__Group_2__0__Impl : ( '(' ) ;
    public final void rule__FeatureCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2204:1: ( ( '(' ) )
            // InternalUiMockupLanguage.g:2205:1: ( '(' )
            {
            // InternalUiMockupLanguage.g:2205:1: ( '(' )
            // InternalUiMockupLanguage.g:2206:2: '('
            {
             before(grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group_2__1"
    // InternalUiMockupLanguage.g:2215:1: rule__FeatureCall__Group_2__1 : rule__FeatureCall__Group_2__1__Impl rule__FeatureCall__Group_2__2 ;
    public final void rule__FeatureCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2219:1: ( rule__FeatureCall__Group_2__1__Impl rule__FeatureCall__Group_2__2 )
            // InternalUiMockupLanguage.g:2220:2: rule__FeatureCall__Group_2__1__Impl rule__FeatureCall__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__FeatureCall__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2__1"


    // $ANTLR start "rule__FeatureCall__Group_2__1__Impl"
    // InternalUiMockupLanguage.g:2227:1: rule__FeatureCall__Group_2__1__Impl : ( ( rule__FeatureCall__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__FeatureCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2231:1: ( ( ( rule__FeatureCall__ArgumentsAssignment_2_1 ) ) )
            // InternalUiMockupLanguage.g:2232:1: ( ( rule__FeatureCall__ArgumentsAssignment_2_1 ) )
            {
            // InternalUiMockupLanguage.g:2232:1: ( ( rule__FeatureCall__ArgumentsAssignment_2_1 ) )
            // InternalUiMockupLanguage.g:2233:2: ( rule__FeatureCall__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_2_1()); 
            // InternalUiMockupLanguage.g:2234:2: ( rule__FeatureCall__ArgumentsAssignment_2_1 )
            // InternalUiMockupLanguage.g:2234:3: rule__FeatureCall__ArgumentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group_2__2"
    // InternalUiMockupLanguage.g:2242:1: rule__FeatureCall__Group_2__2 : rule__FeatureCall__Group_2__2__Impl ;
    public final void rule__FeatureCall__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2246:1: ( rule__FeatureCall__Group_2__2__Impl )
            // InternalUiMockupLanguage.g:2247:2: rule__FeatureCall__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2__2"


    // $ANTLR start "rule__FeatureCall__Group_2__2__Impl"
    // InternalUiMockupLanguage.g:2253:1: rule__FeatureCall__Group_2__2__Impl : ( ( rule__FeatureCall__Group_2_2__0 )* ) ;
    public final void rule__FeatureCall__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2257:1: ( ( ( rule__FeatureCall__Group_2_2__0 )* ) )
            // InternalUiMockupLanguage.g:2258:1: ( ( rule__FeatureCall__Group_2_2__0 )* )
            {
            // InternalUiMockupLanguage.g:2258:1: ( ( rule__FeatureCall__Group_2_2__0 )* )
            // InternalUiMockupLanguage.g:2259:2: ( rule__FeatureCall__Group_2_2__0 )*
            {
             before(grammarAccess.getFeatureCallAccess().getGroup_2_2()); 
            // InternalUiMockupLanguage.g:2260:2: ( rule__FeatureCall__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:2260:3: rule__FeatureCall__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__FeatureCall__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFeatureCallAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2__2__Impl"


    // $ANTLR start "rule__FeatureCall__Group_2_2__0"
    // InternalUiMockupLanguage.g:2269:1: rule__FeatureCall__Group_2_2__0 : rule__FeatureCall__Group_2_2__0__Impl rule__FeatureCall__Group_2_2__1 ;
    public final void rule__FeatureCall__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2273:1: ( rule__FeatureCall__Group_2_2__0__Impl rule__FeatureCall__Group_2_2__1 )
            // InternalUiMockupLanguage.g:2274:2: rule__FeatureCall__Group_2_2__0__Impl rule__FeatureCall__Group_2_2__1
            {
            pushFollow(FOLLOW_15);
            rule__FeatureCall__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2_2__0"


    // $ANTLR start "rule__FeatureCall__Group_2_2__0__Impl"
    // InternalUiMockupLanguage.g:2281:1: rule__FeatureCall__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureCall__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2285:1: ( ( ',' ) )
            // InternalUiMockupLanguage.g:2286:1: ( ',' )
            {
            // InternalUiMockupLanguage.g:2286:1: ( ',' )
            // InternalUiMockupLanguage.g:2287:2: ','
            {
             before(grammarAccess.getFeatureCallAccess().getCommaKeyword_2_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFeatureCallAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2_2__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group_2_2__1"
    // InternalUiMockupLanguage.g:2296:1: rule__FeatureCall__Group_2_2__1 : rule__FeatureCall__Group_2_2__1__Impl ;
    public final void rule__FeatureCall__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2300:1: ( rule__FeatureCall__Group_2_2__1__Impl )
            // InternalUiMockupLanguage.g:2301:2: rule__FeatureCall__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2_2__1"


    // $ANTLR start "rule__FeatureCall__Group_2_2__1__Impl"
    // InternalUiMockupLanguage.g:2307:1: rule__FeatureCall__Group_2_2__1__Impl : ( ( rule__FeatureCall__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__FeatureCall__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2311:1: ( ( ( rule__FeatureCall__ArgumentsAssignment_2_2_1 ) ) )
            // InternalUiMockupLanguage.g:2312:1: ( ( rule__FeatureCall__ArgumentsAssignment_2_2_1 ) )
            {
            // InternalUiMockupLanguage.g:2312:1: ( ( rule__FeatureCall__ArgumentsAssignment_2_2_1 ) )
            // InternalUiMockupLanguage.g:2313:2: ( rule__FeatureCall__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_2_2_1()); 
            // InternalUiMockupLanguage.g:2314:2: ( rule__FeatureCall__ArgumentsAssignment_2_2_1 )
            // InternalUiMockupLanguage.g:2314:3: rule__FeatureCall__ArgumentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__ArgumentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_2_2__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalUiMockupLanguage.g:2323:1: rule__Model__ElementsAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2327:1: ( ( ruleEntity ) )
            // InternalUiMockupLanguage.g:2328:2: ( ruleEntity )
            {
            // InternalUiMockupLanguage.g:2328:2: ( ruleEntity )
            // InternalUiMockupLanguage.g:2329:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getElementsEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsEntityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_0"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // InternalUiMockupLanguage.g:2338:1: rule__Model__ElementsAssignment_1 : ( ruleScreen ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2342:1: ( ( ruleScreen ) )
            // InternalUiMockupLanguage.g:2343:2: ( ruleScreen )
            {
            // InternalUiMockupLanguage.g:2343:2: ( ruleScreen )
            // InternalUiMockupLanguage.g:2344:3: ruleScreen
            {
             before(grammarAccess.getModelAccess().getElementsScreenParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScreen();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsScreenParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__Model__ElementsAssignment_2"
    // InternalUiMockupLanguage.g:2353:1: rule__Model__ElementsAssignment_2 : ( ruleNavigation ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2357:1: ( ( ruleNavigation ) )
            // InternalUiMockupLanguage.g:2358:2: ( ruleNavigation )
            {
            // InternalUiMockupLanguage.g:2358:2: ( ruleNavigation )
            // InternalUiMockupLanguage.g:2359:3: ruleNavigation
            {
             before(grammarAccess.getModelAccess().getElementsNavigationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsNavigationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalUiMockupLanguage.g:2368:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2372:1: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2373:2: ( RULE_ID )
            {
            // InternalUiMockupLanguage.g:2373:2: ( RULE_ID )
            // InternalUiMockupLanguage.g:2374:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ExtendsEntityAssignment_2_1"
    // InternalUiMockupLanguage.g:2383:1: rule__Entity__ExtendsEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2387:1: ( ( ( RULE_ID ) ) )
            // InternalUiMockupLanguage.g:2388:2: ( ( RULE_ID ) )
            {
            // InternalUiMockupLanguage.g:2388:2: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2389:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityEntityCrossReference_2_1_0()); 
            // InternalUiMockupLanguage.g:2390:3: ( RULE_ID )
            // InternalUiMockupLanguage.g:2391:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsEntityEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExtendsEntityAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // InternalUiMockupLanguage.g:2402:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2406:1: ( ( ruleAttribute ) )
            // InternalUiMockupLanguage.g:2407:2: ( ruleAttribute )
            {
            // InternalUiMockupLanguage.g:2407:2: ( ruleAttribute )
            // InternalUiMockupLanguage.g:2408:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalUiMockupLanguage.g:2417:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2421:1: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2422:2: ( RULE_ID )
            {
            // InternalUiMockupLanguage.g:2422:2: ( RULE_ID )
            // InternalUiMockupLanguage.g:2423:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalUiMockupLanguage.g:2432:1: rule__Attribute__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2436:1: ( ( ruleDataType ) )
            // InternalUiMockupLanguage.g:2437:2: ( ruleDataType )
            {
            // InternalUiMockupLanguage.g:2437:2: ( ruleDataType )
            // InternalUiMockupLanguage.g:2438:3: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Screen__NameAssignment_1"
    // InternalUiMockupLanguage.g:2447:1: rule__Screen__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Screen__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2451:1: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2452:2: ( RULE_ID )
            {
            // InternalUiMockupLanguage.g:2452:2: ( RULE_ID )
            // InternalUiMockupLanguage.g:2453:3: RULE_ID
            {
             before(grammarAccess.getScreenAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScreenAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__NameAssignment_1"


    // $ANTLR start "rule__Screen__EntityAssignment_3"
    // InternalUiMockupLanguage.g:2462:1: rule__Screen__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Screen__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2466:1: ( ( ( RULE_ID ) ) )
            // InternalUiMockupLanguage.g:2467:2: ( ( RULE_ID ) )
            {
            // InternalUiMockupLanguage.g:2467:2: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2468:3: ( RULE_ID )
            {
             before(grammarAccess.getScreenAccess().getEntityEntityCrossReference_3_0()); 
            // InternalUiMockupLanguage.g:2469:3: ( RULE_ID )
            // InternalUiMockupLanguage.g:2470:4: RULE_ID
            {
             before(grammarAccess.getScreenAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScreenAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getScreenAccess().getEntityEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__EntityAssignment_3"


    // $ANTLR start "rule__Screen__WidgetsAssignment_5"
    // InternalUiMockupLanguage.g:2481:1: rule__Screen__WidgetsAssignment_5 : ( ruleWidget ) ;
    public final void rule__Screen__WidgetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2485:1: ( ( ruleWidget ) )
            // InternalUiMockupLanguage.g:2486:2: ( ruleWidget )
            {
            // InternalUiMockupLanguage.g:2486:2: ( ruleWidget )
            // InternalUiMockupLanguage.g:2487:3: ruleWidget
            {
             before(grammarAccess.getScreenAccess().getWidgetsWidgetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getScreenAccess().getWidgetsWidgetParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Screen__WidgetsAssignment_5"


    // $ANTLR start "rule__TextField__NameAssignment_1"
    // InternalUiMockupLanguage.g:2496:1: rule__TextField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2500:1: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2501:2: ( RULE_ID )
            {
            // InternalUiMockupLanguage.g:2501:2: ( RULE_ID )
            // InternalUiMockupLanguage.g:2502:3: RULE_ID
            {
             before(grammarAccess.getTextFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__NameAssignment_1"


    // $ANTLR start "rule__TextField__LabelAssignment_2_1"
    // InternalUiMockupLanguage.g:2511:1: rule__TextField__LabelAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__TextField__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2515:1: ( ( ruleExpression ) )
            // InternalUiMockupLanguage.g:2516:2: ( ruleExpression )
            {
            // InternalUiMockupLanguage.g:2516:2: ( ruleExpression )
            // InternalUiMockupLanguage.g:2517:3: ruleExpression
            {
             before(grammarAccess.getTextFieldAccess().getLabelExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTextFieldAccess().getLabelExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__LabelAssignment_2_1"


    // $ANTLR start "rule__Checkbox__NameAssignment_1"
    // InternalUiMockupLanguage.g:2526:1: rule__Checkbox__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Checkbox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2530:1: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2531:2: ( RULE_ID )
            {
            // InternalUiMockupLanguage.g:2531:2: ( RULE_ID )
            // InternalUiMockupLanguage.g:2532:3: RULE_ID
            {
             before(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__NameAssignment_1"


    // $ANTLR start "rule__Checkbox__LabelAssignment_2_1"
    // InternalUiMockupLanguage.g:2541:1: rule__Checkbox__LabelAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Checkbox__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2545:1: ( ( ruleExpression ) )
            // InternalUiMockupLanguage.g:2546:2: ( ruleExpression )
            {
            // InternalUiMockupLanguage.g:2546:2: ( ruleExpression )
            // InternalUiMockupLanguage.g:2547:3: ruleExpression
            {
             before(grammarAccess.getCheckboxAccess().getLabelExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCheckboxAccess().getLabelExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkbox__LabelAssignment_2_1"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalUiMockupLanguage.g:2556:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2560:1: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2561:2: ( RULE_ID )
            {
            // InternalUiMockupLanguage.g:2561:2: ( RULE_ID )
            // InternalUiMockupLanguage.g:2562:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__LabelAssignment_2_1"
    // InternalUiMockupLanguage.g:2571:1: rule__Button__LabelAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Button__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2575:1: ( ( ruleExpression ) )
            // InternalUiMockupLanguage.g:2576:2: ( ruleExpression )
            {
            // InternalUiMockupLanguage.g:2576:2: ( ruleExpression )
            // InternalUiMockupLanguage.g:2577:3: ruleExpression
            {
             before(grammarAccess.getButtonAccess().getLabelExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getLabelExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__LabelAssignment_2_1"


    // $ANTLR start "rule__Navigation__SourceAssignment_2"
    // InternalUiMockupLanguage.g:2586:1: rule__Navigation__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Navigation__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2590:1: ( ( ( RULE_ID ) ) )
            // InternalUiMockupLanguage.g:2591:2: ( ( RULE_ID ) )
            {
            // InternalUiMockupLanguage.g:2591:2: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2592:3: ( RULE_ID )
            {
             before(grammarAccess.getNavigationAccess().getSourceScreenCrossReference_2_0()); 
            // InternalUiMockupLanguage.g:2593:3: ( RULE_ID )
            // InternalUiMockupLanguage.g:2594:4: RULE_ID
            {
             before(grammarAccess.getNavigationAccess().getSourceScreenIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNavigationAccess().getSourceScreenIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNavigationAccess().getSourceScreenCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__SourceAssignment_2"


    // $ANTLR start "rule__Navigation__TargetAssignment_4"
    // InternalUiMockupLanguage.g:2605:1: rule__Navigation__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Navigation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2609:1: ( ( ( RULE_ID ) ) )
            // InternalUiMockupLanguage.g:2610:2: ( ( RULE_ID ) )
            {
            // InternalUiMockupLanguage.g:2610:2: ( ( RULE_ID ) )
            // InternalUiMockupLanguage.g:2611:3: ( RULE_ID )
            {
             before(grammarAccess.getNavigationAccess().getTargetScreenCrossReference_4_0()); 
            // InternalUiMockupLanguage.g:2612:3: ( RULE_ID )
            // InternalUiMockupLanguage.g:2613:4: RULE_ID
            {
             before(grammarAccess.getNavigationAccess().getTargetScreenIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNavigationAccess().getTargetScreenIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getNavigationAccess().getTargetScreenCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__TargetAssignment_4"


    // $ANTLR start "rule__Navigation__ConditionAssignment_5_1"
    // InternalUiMockupLanguage.g:2624:1: rule__Navigation__ConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__Navigation__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2628:1: ( ( ruleCondition ) )
            // InternalUiMockupLanguage.g:2629:2: ( ruleCondition )
            {
            // InternalUiMockupLanguage.g:2629:2: ( ruleCondition )
            // InternalUiMockupLanguage.g:2630:3: ruleCondition
            {
             before(grammarAccess.getNavigationAccess().getConditionConditionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getNavigationAccess().getConditionConditionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigation__ConditionAssignment_5_1"


    // $ANTLR start "rule__Condition__ExpressionAssignment_1"
    // InternalUiMockupLanguage.g:2639:1: rule__Condition__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Condition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2643:1: ( ( ruleExpression ) )
            // InternalUiMockupLanguage.g:2644:2: ( ruleExpression )
            {
            // InternalUiMockupLanguage.g:2644:2: ( ruleExpression )
            // InternalUiMockupLanguage.g:2645:3: ruleExpression
            {
             before(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment_1"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_1"
    // InternalUiMockupLanguage.g:2654:1: rule__OrExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2658:1: ( ( ruleAndExpression ) )
            // InternalUiMockupLanguage.g:2659:2: ( ruleAndExpression )
            {
            // InternalUiMockupLanguage.g:2659:2: ( ruleAndExpression )
            // InternalUiMockupLanguage.g:2660:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_1"
    // InternalUiMockupLanguage.g:2669:1: rule__AndExpression__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2673:1: ( ( rulePrimaryExpression ) )
            // InternalUiMockupLanguage.g:2674:2: ( rulePrimaryExpression )
            {
            // InternalUiMockupLanguage.g:2674:2: ( rulePrimaryExpression )
            // InternalUiMockupLanguage.g:2675:3: rulePrimaryExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_1"


    // $ANTLR start "rule__FeatureCall__ArgumentsAssignment_2_1"
    // InternalUiMockupLanguage.g:2684:1: rule__FeatureCall__ArgumentsAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__FeatureCall__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2688:1: ( ( ruleExpression ) )
            // InternalUiMockupLanguage.g:2689:2: ( ruleExpression )
            {
            // InternalUiMockupLanguage.g:2689:2: ( ruleExpression )
            // InternalUiMockupLanguage.g:2690:3: ruleExpression
            {
             before(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__FeatureCall__ArgumentsAssignment_2_2_1"
    // InternalUiMockupLanguage.g:2699:1: rule__FeatureCall__ArgumentsAssignment_2_2_1 : ( ruleExpression ) ;
    public final void rule__FeatureCall__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiMockupLanguage.g:2703:1: ( ( ruleExpression ) )
            // InternalUiMockupLanguage.g:2704:2: ( ruleExpression )
            {
            // InternalUiMockupLanguage.g:2704:2: ( ruleExpression )
            // InternalUiMockupLanguage.g:2705:3: ruleExpression
            {
             before(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__ArgumentsAssignment_2_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008210002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006840000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000002L});

}