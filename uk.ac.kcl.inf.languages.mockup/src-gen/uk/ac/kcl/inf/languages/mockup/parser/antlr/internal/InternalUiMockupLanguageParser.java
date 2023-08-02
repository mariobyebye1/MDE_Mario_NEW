package uk.ac.kcl.inf.languages.mockup.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.languages.mockup.services.UiMockupLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUiMockupLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'}'", "':'", "'screen'", "'for'", "'text'", "'label'", "'checkbox'", "'button'", "'navigate'", "'from'", "'to'", "'when'", "'if'", "'||'", "'&&'", "'('", "','", "'true'", "'false'", "'String'", "'Boolean'", "'Integer'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalUiMockupLanguageParser(TokenStream input, UiMockupLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UiMockupLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUiMockupLanguage.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUiMockupLanguage.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalUiMockupLanguage.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUiMockupLanguage.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleEntity ) ) | ( (lv_elements_1_0= ruleScreen ) ) | ( (lv_elements_2_0= ruleNavigation ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:78:2: ( ( ( (lv_elements_0_0= ruleEntity ) ) | ( (lv_elements_1_0= ruleScreen ) ) | ( (lv_elements_2_0= ruleNavigation ) ) )* )
            // InternalUiMockupLanguage.g:79:2: ( ( (lv_elements_0_0= ruleEntity ) ) | ( (lv_elements_1_0= ruleScreen ) ) | ( (lv_elements_2_0= ruleNavigation ) ) )*
            {
            // InternalUiMockupLanguage.g:79:2: ( ( (lv_elements_0_0= ruleEntity ) ) | ( (lv_elements_1_0= ruleScreen ) ) | ( (lv_elements_2_0= ruleNavigation ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                case 22:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:80:3: ( (lv_elements_0_0= ruleEntity ) )
            	    {
            	    // InternalUiMockupLanguage.g:80:3: ( (lv_elements_0_0= ruleEntity ) )
            	    // InternalUiMockupLanguage.g:81:4: (lv_elements_0_0= ruleEntity )
            	    {
            	    // InternalUiMockupLanguage.g:81:4: (lv_elements_0_0= ruleEntity )
            	    // InternalUiMockupLanguage.g:82:5: lv_elements_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUiMockupLanguage.g:100:3: ( (lv_elements_1_0= ruleScreen ) )
            	    {
            	    // InternalUiMockupLanguage.g:100:3: ( (lv_elements_1_0= ruleScreen ) )
            	    // InternalUiMockupLanguage.g:101:4: (lv_elements_1_0= ruleScreen )
            	    {
            	    // InternalUiMockupLanguage.g:101:4: (lv_elements_1_0= ruleScreen )
            	    // InternalUiMockupLanguage.g:102:5: lv_elements_1_0= ruleScreen
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsScreenParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleScreen();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Screen");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUiMockupLanguage.g:120:3: ( (lv_elements_2_0= ruleNavigation ) )
            	    {
            	    // InternalUiMockupLanguage.g:120:3: ( (lv_elements_2_0= ruleNavigation ) )
            	    // InternalUiMockupLanguage.g:121:4: (lv_elements_2_0= ruleNavigation )
            	    {
            	    // InternalUiMockupLanguage.g:121:4: (lv_elements_2_0= ruleNavigation )
            	    // InternalUiMockupLanguage.g:122:5: lv_elements_2_0= ruleNavigation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsNavigationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_2_0=ruleNavigation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Navigation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalUiMockupLanguage.g:143:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalUiMockupLanguage.g:143:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalUiMockupLanguage.g:144:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalUiMockupLanguage.g:150:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:156:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalUiMockupLanguage.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalUiMockupLanguage.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalUiMockupLanguage.g:158:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalUiMockupLanguage.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUiMockupLanguage.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUiMockupLanguage.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalUiMockupLanguage.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.ID");
            				

            }


            }

            // InternalUiMockupLanguage.g:180:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUiMockupLanguage.g:181:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalUiMockupLanguage.g:185:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUiMockupLanguage.g:186:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUiMockupLanguage.g:186:5: (otherlv_3= RULE_ID )
                    // InternalUiMockupLanguage.g:187:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUiMockupLanguage.g:203:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:204:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalUiMockupLanguage.g:204:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalUiMockupLanguage.g:205:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalUiMockupLanguage.g:230:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUiMockupLanguage.g:230:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUiMockupLanguage.g:231:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUiMockupLanguage.g:237:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:243:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // InternalUiMockupLanguage.g:244:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // InternalUiMockupLanguage.g:244:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // InternalUiMockupLanguage.g:245:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // InternalUiMockupLanguage.g:245:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUiMockupLanguage.g:246:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUiMockupLanguage.g:246:4: (lv_name_0_0= RULE_ID )
            // InternalUiMockupLanguage.g:247:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalUiMockupLanguage.g:267:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalUiMockupLanguage.g:268:4: (lv_type_2_0= ruleDataType )
            {
            // InternalUiMockupLanguage.g:268:4: (lv_type_2_0= ruleDataType )
            // InternalUiMockupLanguage.g:269:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleScreen"
    // InternalUiMockupLanguage.g:290:1: entryRuleScreen returns [EObject current=null] : iv_ruleScreen= ruleScreen EOF ;
    public final EObject entryRuleScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreen = null;


        try {
            // InternalUiMockupLanguage.g:290:47: (iv_ruleScreen= ruleScreen EOF )
            // InternalUiMockupLanguage.g:291:2: iv_ruleScreen= ruleScreen EOF
            {
             newCompositeNode(grammarAccess.getScreenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScreen=ruleScreen();

            state._fsp--;

             current =iv_ruleScreen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScreen"


    // $ANTLR start "ruleScreen"
    // InternalUiMockupLanguage.g:297:1: ruleScreen returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' ) ;
    public final EObject ruleScreen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_widgets_5_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:303:2: ( (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' ) )
            // InternalUiMockupLanguage.g:304:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' )
            {
            // InternalUiMockupLanguage.g:304:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}' )
            // InternalUiMockupLanguage.g:305:3: otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_widgets_5_0= ruleWidget ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getScreenAccess().getScreenKeyword_0());
            		
            // InternalUiMockupLanguage.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUiMockupLanguage.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUiMockupLanguage.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalUiMockupLanguage.g:311:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScreenAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScreenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getScreenAccess().getForKeyword_2());
            		
            // InternalUiMockupLanguage.g:331:3: ( (otherlv_3= RULE_ID ) )
            // InternalUiMockupLanguage.g:332:4: (otherlv_3= RULE_ID )
            {
            // InternalUiMockupLanguage.g:332:4: (otherlv_3= RULE_ID )
            // InternalUiMockupLanguage.g:333:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScreenRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getScreenAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUiMockupLanguage.g:348:3: ( (lv_widgets_5_0= ruleWidget ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||(LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:349:4: (lv_widgets_5_0= ruleWidget )
            	    {
            	    // InternalUiMockupLanguage.g:349:4: (lv_widgets_5_0= ruleWidget )
            	    // InternalUiMockupLanguage.g:350:5: lv_widgets_5_0= ruleWidget
            	    {

            	    					newCompositeNode(grammarAccess.getScreenAccess().getWidgetsWidgetParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_widgets_5_0=ruleWidget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScreenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"widgets",
            	    						lv_widgets_5_0,
            	    						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Widget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScreen"


    // $ANTLR start "entryRuleWidget"
    // InternalUiMockupLanguage.g:375:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalUiMockupLanguage.g:375:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalUiMockupLanguage.g:376:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalUiMockupLanguage.g:382:1: ruleWidget returns [EObject current=null] : (this_TextField_0= ruleTextField | this_Checkbox_1= ruleCheckbox | this_Button_2= ruleButton ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_TextField_0 = null;

        EObject this_Checkbox_1 = null;

        EObject this_Button_2 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:388:2: ( (this_TextField_0= ruleTextField | this_Checkbox_1= ruleCheckbox | this_Button_2= ruleButton ) )
            // InternalUiMockupLanguage.g:389:2: (this_TextField_0= ruleTextField | this_Checkbox_1= ruleCheckbox | this_Button_2= ruleButton )
            {
            // InternalUiMockupLanguage.g:389:2: (this_TextField_0= ruleTextField | this_Checkbox_1= ruleCheckbox | this_Button_2= ruleButton )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUiMockupLanguage.g:390:3: this_TextField_0= ruleTextField
                    {

                    			newCompositeNode(grammarAccess.getWidgetAccess().getTextFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextField_0=ruleTextField();

                    state._fsp--;


                    			current = this_TextField_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:399:3: this_Checkbox_1= ruleCheckbox
                    {

                    			newCompositeNode(grammarAccess.getWidgetAccess().getCheckboxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checkbox_1=ruleCheckbox();

                    state._fsp--;


                    			current = this_Checkbox_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUiMockupLanguage.g:408:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleTextField"
    // InternalUiMockupLanguage.g:420:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // InternalUiMockupLanguage.g:420:50: (iv_ruleTextField= ruleTextField EOF )
            // InternalUiMockupLanguage.g:421:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalUiMockupLanguage.g:427:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:433:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? ) )
            // InternalUiMockupLanguage.g:434:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? )
            {
            // InternalUiMockupLanguage.g:434:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? )
            // InternalUiMockupLanguage.g:435:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextKeyword_0());
            		
            // InternalUiMockupLanguage.g:439:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUiMockupLanguage.g:440:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUiMockupLanguage.g:440:4: (lv_name_1_0= RULE_ID )
            // InternalUiMockupLanguage.g:441:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.ID");
            				

            }


            }

            // InternalUiMockupLanguage.g:457:3: (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUiMockupLanguage.g:458:4: otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getLabelKeyword_2_0());
                    			
                    // InternalUiMockupLanguage.g:462:4: ( (lv_label_3_0= ruleExpression ) )
                    // InternalUiMockupLanguage.g:463:5: (lv_label_3_0= ruleExpression )
                    {
                    // InternalUiMockupLanguage.g:463:5: (lv_label_3_0= ruleExpression )
                    // InternalUiMockupLanguage.g:464:6: lv_label_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTextFieldAccess().getLabelExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_label_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_3_0,
                    							"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleCheckbox"
    // InternalUiMockupLanguage.g:486:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalUiMockupLanguage.g:486:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalUiMockupLanguage.g:487:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalUiMockupLanguage.g:493:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:499:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? ) )
            // InternalUiMockupLanguage.g:500:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? )
            {
            // InternalUiMockupLanguage.g:500:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? )
            // InternalUiMockupLanguage.g:501:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
            		
            // InternalUiMockupLanguage.g:505:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUiMockupLanguage.g:506:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUiMockupLanguage.g:506:4: (lv_name_1_0= RULE_ID )
            // InternalUiMockupLanguage.g:507:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.ID");
            				

            }


            }

            // InternalUiMockupLanguage.g:523:3: (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUiMockupLanguage.g:524:4: otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getLabelKeyword_2_0());
                    			
                    // InternalUiMockupLanguage.g:528:4: ( (lv_label_3_0= ruleExpression ) )
                    // InternalUiMockupLanguage.g:529:5: (lv_label_3_0= ruleExpression )
                    {
                    // InternalUiMockupLanguage.g:529:5: (lv_label_3_0= ruleExpression )
                    // InternalUiMockupLanguage.g:530:6: lv_label_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCheckboxAccess().getLabelExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_label_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckboxRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_3_0,
                    							"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleButton"
    // InternalUiMockupLanguage.g:552:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalUiMockupLanguage.g:552:47: (iv_ruleButton= ruleButton EOF )
            // InternalUiMockupLanguage.g:553:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalUiMockupLanguage.g:559:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:565:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? ) )
            // InternalUiMockupLanguage.g:566:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? )
            {
            // InternalUiMockupLanguage.g:566:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )? )
            // InternalUiMockupLanguage.g:567:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalUiMockupLanguage.g:571:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUiMockupLanguage.g:572:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUiMockupLanguage.g:572:4: (lv_name_1_0= RULE_ID )
            // InternalUiMockupLanguage.g:573:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.ID");
            				

            }


            }

            // InternalUiMockupLanguage.g:589:3: (otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUiMockupLanguage.g:590:4: otherlv_2= 'label' ( (lv_label_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLabelKeyword_2_0());
                    			
                    // InternalUiMockupLanguage.g:594:4: ( (lv_label_3_0= ruleExpression ) )
                    // InternalUiMockupLanguage.g:595:5: (lv_label_3_0= ruleExpression )
                    {
                    // InternalUiMockupLanguage.g:595:5: (lv_label_3_0= ruleExpression )
                    // InternalUiMockupLanguage.g:596:6: lv_label_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getButtonAccess().getLabelExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_label_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getButtonRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_3_0,
                    							"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleNavigation"
    // InternalUiMockupLanguage.g:618:1: entryRuleNavigation returns [EObject current=null] : iv_ruleNavigation= ruleNavigation EOF ;
    public final EObject entryRuleNavigation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigation = null;


        try {
            // InternalUiMockupLanguage.g:618:51: (iv_ruleNavigation= ruleNavigation EOF )
            // InternalUiMockupLanguage.g:619:2: iv_ruleNavigation= ruleNavigation EOF
            {
             newCompositeNode(grammarAccess.getNavigationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigation=ruleNavigation();

            state._fsp--;

             current =iv_ruleNavigation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigation"


    // $ANTLR start "ruleNavigation"
    // InternalUiMockupLanguage.g:625:1: ruleNavigation returns [EObject current=null] : (otherlv_0= 'navigate' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'when' ( (lv_condition_6_0= ruleCondition ) ) )? ) ;
    public final EObject ruleNavigation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:631:2: ( (otherlv_0= 'navigate' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'when' ( (lv_condition_6_0= ruleCondition ) ) )? ) )
            // InternalUiMockupLanguage.g:632:2: (otherlv_0= 'navigate' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'when' ( (lv_condition_6_0= ruleCondition ) ) )? )
            {
            // InternalUiMockupLanguage.g:632:2: (otherlv_0= 'navigate' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'when' ( (lv_condition_6_0= ruleCondition ) ) )? )
            // InternalUiMockupLanguage.g:633:3: otherlv_0= 'navigate' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'when' ( (lv_condition_6_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigationAccess().getNavigateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNavigationAccess().getFromKeyword_1());
            		
            // InternalUiMockupLanguage.g:641:3: ( (otherlv_2= RULE_ID ) )
            // InternalUiMockupLanguage.g:642:4: (otherlv_2= RULE_ID )
            {
            // InternalUiMockupLanguage.g:642:4: (otherlv_2= RULE_ID )
            // InternalUiMockupLanguage.g:643:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getNavigationAccess().getSourceScreenCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getNavigationAccess().getToKeyword_3());
            		
            // InternalUiMockupLanguage.g:658:3: ( (otherlv_4= RULE_ID ) )
            // InternalUiMockupLanguage.g:659:4: (otherlv_4= RULE_ID )
            {
            // InternalUiMockupLanguage.g:659:4: (otherlv_4= RULE_ID )
            // InternalUiMockupLanguage.g:660:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getNavigationAccess().getTargetScreenCrossReference_4_0());
            				

            }


            }

            // InternalUiMockupLanguage.g:671:3: (otherlv_5= 'when' ( (lv_condition_6_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUiMockupLanguage.g:672:4: otherlv_5= 'when' ( (lv_condition_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getNavigationAccess().getWhenKeyword_5_0());
                    			
                    // InternalUiMockupLanguage.g:676:4: ( (lv_condition_6_0= ruleCondition ) )
                    // InternalUiMockupLanguage.g:677:5: (lv_condition_6_0= ruleCondition )
                    {
                    // InternalUiMockupLanguage.g:677:5: (lv_condition_6_0= ruleCondition )
                    // InternalUiMockupLanguage.g:678:6: lv_condition_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getNavigationAccess().getConditionConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigationRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigation"


    // $ANTLR start "entryRuleCondition"
    // InternalUiMockupLanguage.g:700:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUiMockupLanguage.g:700:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUiMockupLanguage.g:701:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUiMockupLanguage.g:707:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:713:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalUiMockupLanguage.g:714:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalUiMockupLanguage.g:714:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalUiMockupLanguage.g:715:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		
            // InternalUiMockupLanguage.g:719:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalUiMockupLanguage.g:720:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalUiMockupLanguage.g:720:4: (lv_expression_1_0= ruleExpression )
            // InternalUiMockupLanguage.g:721:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalUiMockupLanguage.g:742:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUiMockupLanguage.g:742:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUiMockupLanguage.g:743:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalUiMockupLanguage.g:749:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:755:2: (this_OrExpression_0= ruleOrExpression )
            // InternalUiMockupLanguage.g:756:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalUiMockupLanguage.g:767:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalUiMockupLanguage.g:767:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalUiMockupLanguage.g:768:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalUiMockupLanguage.g:774:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression (otherlv_1= '||' ( (lv_right_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:780:2: ( (this_AndExpression_0= ruleAndExpression (otherlv_1= '||' ( (lv_right_2_0= ruleAndExpression ) ) )* ) )
            // InternalUiMockupLanguage.g:781:2: (this_AndExpression_0= ruleAndExpression (otherlv_1= '||' ( (lv_right_2_0= ruleAndExpression ) ) )* )
            {
            // InternalUiMockupLanguage.g:781:2: (this_AndExpression_0= ruleAndExpression (otherlv_1= '||' ( (lv_right_2_0= ruleAndExpression ) ) )* )
            // InternalUiMockupLanguage.g:782:3: this_AndExpression_0= ruleAndExpression (otherlv_1= '||' ( (lv_right_2_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUiMockupLanguage.g:790:3: (otherlv_1= '||' ( (lv_right_2_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:791:4: otherlv_1= '||' ( (lv_right_2_0= ruleAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			
            	    // InternalUiMockupLanguage.g:795:4: ( (lv_right_2_0= ruleAndExpression ) )
            	    // InternalUiMockupLanguage.g:796:5: (lv_right_2_0= ruleAndExpression )
            	    {
            	    // InternalUiMockupLanguage.g:796:5: (lv_right_2_0= ruleAndExpression )
            	    // InternalUiMockupLanguage.g:797:6: lv_right_2_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_2_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_2_0,
            	    							"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalUiMockupLanguage.g:819:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalUiMockupLanguage.g:819:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalUiMockupLanguage.g:820:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalUiMockupLanguage.g:826:1: ruleAndExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '&&' ( (lv_right_2_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:832:2: ( (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '&&' ( (lv_right_2_0= rulePrimaryExpression ) ) )* ) )
            // InternalUiMockupLanguage.g:833:2: (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '&&' ( (lv_right_2_0= rulePrimaryExpression ) ) )* )
            {
            // InternalUiMockupLanguage.g:833:2: (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '&&' ( (lv_right_2_0= rulePrimaryExpression ) ) )* )
            // InternalUiMockupLanguage.g:834:3: this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '&&' ( (lv_right_2_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUiMockupLanguage.g:842:3: (otherlv_1= '&&' ( (lv_right_2_0= rulePrimaryExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUiMockupLanguage.g:843:4: otherlv_1= '&&' ( (lv_right_2_0= rulePrimaryExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			
            	    // InternalUiMockupLanguage.g:847:4: ( (lv_right_2_0= rulePrimaryExpression ) )
            	    // InternalUiMockupLanguage.g:848:5: (lv_right_2_0= rulePrimaryExpression )
            	    {
            	    // InternalUiMockupLanguage.g:848:5: (lv_right_2_0= rulePrimaryExpression )
            	    // InternalUiMockupLanguage.g:849:6: lv_right_2_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_2_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_2_0,
            	    							"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalUiMockupLanguage.g:871:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalUiMockupLanguage.g:871:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalUiMockupLanguage.g:872:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalUiMockupLanguage.g:878:1: rulePrimaryExpression returns [EObject current=null] : (this_FeatureCall_0= ruleFeatureCall | ( () ruleBoolLiteral ) | ( () ruleStringLiteral ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureCall_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:884:2: ( (this_FeatureCall_0= ruleFeatureCall | ( () ruleBoolLiteral ) | ( () ruleStringLiteral ) ) )
            // InternalUiMockupLanguage.g:885:2: (this_FeatureCall_0= ruleFeatureCall | ( () ruleBoolLiteral ) | ( () ruleStringLiteral ) )
            {
            // InternalUiMockupLanguage.g:885:2: (this_FeatureCall_0= ruleFeatureCall | ( () ruleBoolLiteral ) | ( () ruleStringLiteral ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case 31:
            case 32:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUiMockupLanguage.g:886:3: this_FeatureCall_0= ruleFeatureCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureCall_0=ruleFeatureCall();

                    state._fsp--;


                    			current = this_FeatureCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:895:3: ( () ruleBoolLiteral )
                    {
                    // InternalUiMockupLanguage.g:895:3: ( () ruleBoolLiteral )
                    // InternalUiMockupLanguage.g:896:4: () ruleBoolLiteral
                    {
                    // InternalUiMockupLanguage.g:896:4: ()
                    // InternalUiMockupLanguage.g:897:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getExpressionAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBoolLiteralParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBoolLiteral();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUiMockupLanguage.g:912:3: ( () ruleStringLiteral )
                    {
                    // InternalUiMockupLanguage.g:912:3: ( () ruleStringLiteral )
                    // InternalUiMockupLanguage.g:913:4: () ruleStringLiteral
                    {
                    // InternalUiMockupLanguage.g:913:4: ()
                    // InternalUiMockupLanguage.g:914:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getExpressionAction_2_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getStringLiteralParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // InternalUiMockupLanguage.g:932:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // InternalUiMockupLanguage.g:932:52: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // InternalUiMockupLanguage.g:933:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
             newCompositeNode(grammarAccess.getFeatureCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;

             current =iv_ruleFeatureCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // InternalUiMockupLanguage.g:939:1: ruleFeatureCall returns [EObject current=null] : ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalUiMockupLanguage.g:945:2: ( ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? ) )
            // InternalUiMockupLanguage.g:946:2: ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? )
            {
            // InternalUiMockupLanguage.g:946:2: ( () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? )
            // InternalUiMockupLanguage.g:947:3: () this_ID_1= RULE_ID (otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            {
            // InternalUiMockupLanguage.g:947:3: ()
            // InternalUiMockupLanguage.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureCallAccess().getFeatureCallAction_0(),
            					current);
            			

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            			newLeafNode(this_ID_1, grammarAccess.getFeatureCallAccess().getIDTerminalRuleCall_1());
            		
            // InternalUiMockupLanguage.g:958:3: (otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUiMockupLanguage.g:959:4: otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalUiMockupLanguage.g:963:4: ( (lv_arguments_3_0= ruleExpression ) )
                    // InternalUiMockupLanguage.g:964:5: (lv_arguments_3_0= ruleExpression )
                    {
                    // InternalUiMockupLanguage.g:964:5: (lv_arguments_3_0= ruleExpression )
                    // InternalUiMockupLanguage.g:965:6: lv_arguments_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_arguments_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUiMockupLanguage.g:982:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==30) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUiMockupLanguage.g:983:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFeatureCallAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalUiMockupLanguage.g:987:5: ( (lv_arguments_5_0= ruleExpression ) )
                    	    // InternalUiMockupLanguage.g:988:6: (lv_arguments_5_0= ruleExpression )
                    	    {
                    	    // InternalUiMockupLanguage.g:988:6: (lv_arguments_5_0= ruleExpression )
                    	    // InternalUiMockupLanguage.g:989:7: lv_arguments_5_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_arguments_5_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"uk.ac.kcl.inf.languages.mockup.UiMockupLanguage.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalUiMockupLanguage.g:1012:1: entryRuleBoolLiteral returns [String current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final String entryRuleBoolLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolLiteral = null;


        try {
            // InternalUiMockupLanguage.g:1012:51: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalUiMockupLanguage.g:1013:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalUiMockupLanguage.g:1019:1: ruleBoolLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUiMockupLanguage.g:1025:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalUiMockupLanguage.g:1026:2: (kw= 'true' | kw= 'false' )
            {
            // InternalUiMockupLanguage.g:1026:2: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUiMockupLanguage.g:1027:3: kw= 'true'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolLiteralAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:1033:3: kw= 'false'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolLiteralAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalUiMockupLanguage.g:1042:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalUiMockupLanguage.g:1042:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalUiMockupLanguage.g:1043:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalUiMockupLanguage.g:1049:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUiMockupLanguage.g:1055:2: (this_STRING_0= RULE_STRING )
            // InternalUiMockupLanguage.g:1056:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "ruleDataType"
    // InternalUiMockupLanguage.g:1066:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUiMockupLanguage.g:1072:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) ) )
            // InternalUiMockupLanguage.g:1073:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) )
            {
            // InternalUiMockupLanguage.g:1073:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalUiMockupLanguage.g:1074:3: (enumLiteral_0= 'String' )
                    {
                    // InternalUiMockupLanguage.g:1074:3: (enumLiteral_0= 'String' )
                    // InternalUiMockupLanguage.g:1075:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUiMockupLanguage.g:1082:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalUiMockupLanguage.g:1082:3: (enumLiteral_1= 'Boolean' )
                    // InternalUiMockupLanguage.g:1083:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUiMockupLanguage.g:1090:3: (enumLiteral_2= 'Integer' )
                    {
                    // InternalUiMockupLanguage.g:1090:3: (enumLiteral_2= 'Integer' )
                    // InternalUiMockupLanguage.g:1091:4: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000410802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000344000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000180000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});

}