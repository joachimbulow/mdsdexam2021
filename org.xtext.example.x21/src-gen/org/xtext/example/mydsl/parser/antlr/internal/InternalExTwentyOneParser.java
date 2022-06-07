package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ExTwentyOneGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExTwentyOneParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'data'", "'int'", "'string'", "'+'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalExTwentyOneParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExTwentyOneParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExTwentyOneParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExTwentyOne.g"; }



     	private ExTwentyOneGrammarAccess grammarAccess;

        public InternalExTwentyOneParser(TokenStream input, ExTwentyOneGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected ExTwentyOneGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalExTwentyOne.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalExTwentyOne.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalExTwentyOne.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalExTwentyOne.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalExTwentyOne.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalExTwentyOne.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalExTwentyOne.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalExTwentyOne.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExTwentyOne.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExTwentyOne.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalExTwentyOne.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExTwentyOne.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=14 && LA1_0<=15)||(LA1_0>=19 && LA1_0<=20)||LA1_0==23||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExTwentyOne.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalExTwentyOne.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalExTwentyOne.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"org.xtext.example.mydsl.ExTwentyOne.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDeclaration"
    // InternalExTwentyOne.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalExTwentyOne.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalExTwentyOne.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalExTwentyOne.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_Input_1 = null;

        EObject this_Node_2 = null;

        EObject this_Stream_3 = null;

        EObject this_DataDecl_4 = null;

        EObject this_Parameter_5 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:137:2: ( (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter ) )
            // InternalExTwentyOne.g:138:2: (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter )
            {
            // InternalExTwentyOne.g:138:2: (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 15:
            case 20:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 12:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalExTwentyOne.g:139:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:148:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:157:3: this_Node_2= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_2=ruleNode();

                    state._fsp--;


                    			current = this_Node_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:166:3: this_Stream_3= ruleStream
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stream_3=ruleStream();

                    state._fsp--;


                    			current = this_Stream_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:175:3: this_DataDecl_4= ruleDataDecl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataDecl_4=ruleDataDecl();

                    state._fsp--;


                    			current = this_DataDecl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:184:3: this_Parameter_5= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_5=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_5;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleParameter"
    // InternalExTwentyOne.g:196:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalExTwentyOne.g:196:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalExTwentyOne.g:197:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalExTwentyOne.g:203:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:209:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType ) )
            // InternalExTwentyOne.g:210:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType )
            {
            // InternalExTwentyOne.g:210:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType )
            // InternalExTwentyOne.g:211:3: otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalExTwentyOne.g:215:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExTwentyOne.g:216:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExTwentyOne.g:216:4: (lv_name_1_0= RULE_ID )
            // InternalExTwentyOne.g:217:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		

            			newCompositeNode(grammarAccess.getParameterAccess().getTypeParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFunction"
    // InternalExTwentyOne.g:248:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalExTwentyOne.g:248:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalExTwentyOne.g:249:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalExTwentyOne.g:255:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_lambda_2_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:261:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) ) )
            // InternalExTwentyOne.g:262:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) )
            {
            // InternalExTwentyOne.g:262:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) )
            // InternalExTwentyOne.g:263:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalExTwentyOne.g:267:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExTwentyOne.g:268:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExTwentyOne.g:268:4: (lv_name_1_0= RULE_ID )
            // InternalExTwentyOne.g:269:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExTwentyOne.g:285:3: ( (lv_lambda_2_0= ruleLambda ) )
            // InternalExTwentyOne.g:286:4: (lv_lambda_2_0= ruleLambda )
            {
            // InternalExTwentyOne.g:286:4: (lv_lambda_2_0= ruleLambda )
            // InternalExTwentyOne.g:287:5: lv_lambda_2_0= ruleLambda
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_lambda_2_0=ruleLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"lambda",
            						lv_lambda_2_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Lambda");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLambda"
    // InternalExTwentyOne.g:308:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalExTwentyOne.g:308:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalExTwentyOne.g:309:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalExTwentyOne.g:315:1: ruleLambda returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType otherlv_4= ')' otherlv_5= '{' ruleExp otherlv_7= '}' ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:321:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType otherlv_4= ')' otherlv_5= '{' ruleExp otherlv_7= '}' ) )
            // InternalExTwentyOne.g:322:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType otherlv_4= ')' otherlv_5= '{' ruleExp otherlv_7= '}' )
            {
            // InternalExTwentyOne.g:322:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType otherlv_4= ')' otherlv_5= '{' ruleExp otherlv_7= '}' )
            // InternalExTwentyOne.g:323:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType otherlv_4= ')' otherlv_5= '{' ruleExp otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0());
            		
            // InternalExTwentyOne.g:327:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExTwentyOne.g:328:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExTwentyOne.g:328:4: (lv_name_1_0= RULE_ID )
            // InternalExTwentyOne.g:329:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLambdaAccess().getColonKeyword_2());
            		

            			newCompositeNode(grammarAccess.getLambdaAccess().getTypeParserRuleCall_3());
            		
            pushFollow(FOLLOW_8);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5());
            		

            			newCompositeNode(grammarAccess.getLambdaAccess().getExpParserRuleCall_6());
            		
            pushFollow(FOLLOW_11);
            ruleExp();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleInput"
    // InternalExTwentyOne.g:379:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalExTwentyOne.g:379:46: (iv_ruleInput= ruleInput EOF )
            // InternalExTwentyOne.g:380:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalExTwentyOne.g:386:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:392:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType ) )
            // InternalExTwentyOne.g:393:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType )
            {
            // InternalExTwentyOne.g:393:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType )
            // InternalExTwentyOne.g:394:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleType
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalExTwentyOne.g:398:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExTwentyOne.g:399:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExTwentyOne.g:399:4: (lv_name_1_0= RULE_ID )
            // InternalExTwentyOne.g:400:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getColonKeyword_2());
            		

            			newCompositeNode(grammarAccess.getInputAccess().getTypeParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode"
    // InternalExTwentyOne.g:431:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalExTwentyOne.g:431:45: (iv_ruleNode= ruleNode EOF )
            // InternalExTwentyOne.g:432:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalExTwentyOne.g:438:1: ruleNode returns [EObject current=null] : ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ) | (this_Lambda_4= ruleLambda otherlv_5= ']' ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Lambda_4 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:444:2: ( ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ) | (this_Lambda_4= ruleLambda otherlv_5= ']' ) ) )
            // InternalExTwentyOne.g:445:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ) | (this_Lambda_4= ruleLambda otherlv_5= ']' ) )
            {
            // InternalExTwentyOne.g:445:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ) | (this_Lambda_4= ruleLambda otherlv_5= ']' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExTwentyOne.g:446:3: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalExTwentyOne.g:446:3: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) )
                    // InternalExTwentyOne.g:447:4: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0_0());
                    			
                    // InternalExTwentyOne.g:451:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalExTwentyOne.g:452:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:452:5: (lv_name_1_0= RULE_ID )
                    // InternalExTwentyOne.g:453:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalExTwentyOne.g:473:4: ( (otherlv_3= RULE_ID ) )
                    // InternalExTwentyOne.g:474:5: (otherlv_3= RULE_ID )
                    {
                    // InternalExTwentyOne.g:474:5: (otherlv_3= RULE_ID )
                    // InternalExTwentyOne.g:475:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLambdaLambdaCrossReference_0_3_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:488:3: (this_Lambda_4= ruleLambda otherlv_5= ']' )
                    {
                    // InternalExTwentyOne.g:488:3: (this_Lambda_4= ruleLambda otherlv_5= ']' )
                    // InternalExTwentyOne.g:489:4: this_Lambda_4= ruleLambda otherlv_5= ']'
                    {

                    				newCompositeNode(grammarAccess.getNodeAccess().getLambdaParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_Lambda_4=ruleLambda();

                    state._fsp--;


                    				current = this_Lambda_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_1());
                    			

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleStream"
    // InternalExTwentyOne.g:506:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalExTwentyOne.g:506:47: (iv_ruleStream= ruleStream EOF )
            // InternalExTwentyOne.g:507:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalExTwentyOne.g:513:1: ruleStream returns [EObject current=null] : (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )+ ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:519:2: ( (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )+ ) )
            // InternalExTwentyOne.g:520:2: (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )+ )
            {
            // InternalExTwentyOne.g:520:2: (otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )+ )
            // InternalExTwentyOne.g:521:3: otherlv_0= 'stream' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStreamAccess().getStreamKeyword_0());
            		
            // InternalExTwentyOne.g:525:3: ( (otherlv_1= RULE_ID ) )
            // InternalExTwentyOne.g:526:4: (otherlv_1= RULE_ID )
            {
            // InternalExTwentyOne.g:526:4: (otherlv_1= RULE_ID )
            // InternalExTwentyOne.g:527:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getInputsInputCrossReference_1_0());
            				

            }


            }

            // InternalExTwentyOne.g:538:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExTwentyOne.g:539:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalExTwentyOne.g:543:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalExTwentyOne.g:544:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:544:5: (otherlv_3= RULE_ID )
            	    // InternalExTwentyOne.g:545:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStreamRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getInputsInputCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalExTwentyOne.g:557:3: (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExTwentyOne.g:558:4: otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getToKeyword_3_0());
            	    			
            	    // InternalExTwentyOne.g:562:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalExTwentyOne.g:563:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:563:5: (otherlv_5= RULE_ID )
            	    // InternalExTwentyOne.g:564:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStreamRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getElementsElementCrossReference_3_1_0());
            	    					

            	    }


            	    }

            	    // InternalExTwentyOne.g:575:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==24) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalExTwentyOne.g:576:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getStreamAccess().getCommaKeyword_3_2_0());
            	    	    				
            	    	    // InternalExTwentyOne.g:580:5: ( (otherlv_7= RULE_ID ) )
            	    	    // InternalExTwentyOne.g:581:6: (otherlv_7= RULE_ID )
            	    	    {
            	    	    // InternalExTwentyOne.g:581:6: (otherlv_7= RULE_ID )
            	    	    // InternalExTwentyOne.g:582:7: otherlv_7= RULE_ID
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getStreamRule());
            	    	    							}
            	    	    						
            	    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    	    							newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getElementsElementCrossReference_3_2_1_0());
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleDataDecl"
    // InternalExTwentyOne.g:599:1: entryRuleDataDecl returns [EObject current=null] : iv_ruleDataDecl= ruleDataDecl EOF ;
    public final EObject entryRuleDataDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDecl = null;


        try {
            // InternalExTwentyOne.g:599:49: (iv_ruleDataDecl= ruleDataDecl EOF )
            // InternalExTwentyOne.g:600:2: iv_ruleDataDecl= ruleDataDecl EOF
            {
             newCompositeNode(grammarAccess.getDataDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDecl=ruleDataDecl();

            state._fsp--;

             current =iv_ruleDataDecl; 
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
    // $ANTLR end "entryRuleDataDecl"


    // $ANTLR start "ruleDataDecl"
    // InternalExTwentyOne.g:606:1: ruleDataDecl returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_ID ) ) otherlv_4= ':' ruleType (otherlv_6= ',' ( (lv_data_7_0= RULE_ID ) ) otherlv_8= ':' ruleType )* otherlv_10= '}' ) ;
    public final EObject ruleDataDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_data_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_data_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:612:2: ( (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_ID ) ) otherlv_4= ':' ruleType (otherlv_6= ',' ( (lv_data_7_0= RULE_ID ) ) otherlv_8= ':' ruleType )* otherlv_10= '}' ) )
            // InternalExTwentyOne.g:613:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_ID ) ) otherlv_4= ':' ruleType (otherlv_6= ',' ( (lv_data_7_0= RULE_ID ) ) otherlv_8= ':' ruleType )* otherlv_10= '}' )
            {
            // InternalExTwentyOne.g:613:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_ID ) ) otherlv_4= ':' ruleType (otherlv_6= ',' ( (lv_data_7_0= RULE_ID ) ) otherlv_8= ':' ruleType )* otherlv_10= '}' )
            // InternalExTwentyOne.g:614:3: otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_data_3_0= RULE_ID ) ) otherlv_4= ':' ruleType (otherlv_6= ',' ( (lv_data_7_0= RULE_ID ) ) otherlv_8= ':' ruleType )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataDeclAccess().getDataKeyword_0());
            		
            // InternalExTwentyOne.g:618:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExTwentyOne.g:619:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExTwentyOne.g:619:4: (lv_name_1_0= RULE_ID )
            // InternalExTwentyOne.g:620:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalExTwentyOne.g:640:3: ( (lv_data_3_0= RULE_ID ) )
            // InternalExTwentyOne.g:641:4: (lv_data_3_0= RULE_ID )
            {
            // InternalExTwentyOne.g:641:4: (lv_data_3_0= RULE_ID )
            // InternalExTwentyOne.g:642:5: lv_data_3_0= RULE_ID
            {
            lv_data_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_data_3_0, grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDeclRule());
            					}
            					addWithLastConsumed(
            						current,
            						"data",
            						lv_data_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDataDeclAccess().getColonKeyword_4());
            		

            			newCompositeNode(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_5());
            		
            pushFollow(FOLLOW_16);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalExTwentyOne.g:669:3: (otherlv_6= ',' ( (lv_data_7_0= RULE_ID ) ) otherlv_8= ':' ruleType )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExTwentyOne.g:670:4: otherlv_6= ',' ( (lv_data_7_0= RULE_ID ) ) otherlv_8= ':' ruleType
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDataDeclAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalExTwentyOne.g:674:4: ( (lv_data_7_0= RULE_ID ) )
            	    // InternalExTwentyOne.g:675:5: (lv_data_7_0= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:675:5: (lv_data_7_0= RULE_ID )
            	    // InternalExTwentyOne.g:676:6: lv_data_7_0= RULE_ID
            	    {
            	    lv_data_7_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(lv_data_7_0, grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataDeclRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"data",
            	    							lv_data_7_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDataDeclAccess().getColonKeyword_6_2());
            	    			

            	    				newCompositeNode(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6_3());
            	    			
            	    pushFollow(FOLLOW_16);
            	    ruleType();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDataDecl"


    // $ANTLR start "entryRuleType"
    // InternalExTwentyOne.g:712:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalExTwentyOne.g:712:44: (iv_ruleType= ruleType EOF )
            // InternalExTwentyOne.g:713:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalExTwentyOne.g:719:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:725:2: ( (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) )
            // InternalExTwentyOne.g:726:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
            {
            // InternalExTwentyOne.g:726:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExTwentyOne.g:727:3: kw= 'int'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:733:3: kw= 'string'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:739:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_2);
                    		

                    			newLeafNode(this_ID_2, grammarAccess.getTypeAccess().getIDTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalExTwentyOne.g:750:1: entryRuleExp returns [String current=null] : iv_ruleExp= ruleExp EOF ;
    public final String entryRuleExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExp = null;


        try {
            // InternalExTwentyOne.g:750:43: (iv_ruleExp= ruleExp EOF )
            // InternalExTwentyOne.g:751:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp.getText(); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalExTwentyOne.g:757:1: ruleExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:763:2: ( (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) )
            // InternalExTwentyOne.g:764:2: (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT )
            {
            // InternalExTwentyOne.g:764:2: (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT )
            // InternalExTwentyOne.g:765:3: this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getExpAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,29,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExpAccess().getPlusSignKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getExpAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000498D002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});

}