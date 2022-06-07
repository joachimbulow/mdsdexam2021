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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'int'", "'string'", "'+'"
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
    public static final int T__30=30;
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

                if ( (LA1_0==12||LA1_0==14||(LA1_0>=19 && LA1_0<=20)||LA1_0==23||LA1_0==27) ) {
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
            case 27:
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
    // InternalExTwentyOne.g:255:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_lambda_3_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:261:2: ( ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) ) )
            // InternalExTwentyOne.g:262:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) )
            {
            // InternalExTwentyOne.g:262:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) )
            // InternalExTwentyOne.g:263:3: () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) )
            {
            // InternalExTwentyOne.g:263:3: ()
            // InternalExTwentyOne.g:264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
            		
            // InternalExTwentyOne.g:274:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:275:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:275:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:276:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExTwentyOne.g:292:3: ( (lv_lambda_3_0= ruleLambda ) )
            // InternalExTwentyOne.g:293:4: (lv_lambda_3_0= ruleLambda )
            {
            // InternalExTwentyOne.g:293:4: (lv_lambda_3_0= ruleLambda )
            // InternalExTwentyOne.g:294:5: lv_lambda_3_0= ruleLambda
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_lambda_3_0=ruleLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"lambda",
            						lv_lambda_3_0,
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
    // InternalExTwentyOne.g:315:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalExTwentyOne.g:315:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalExTwentyOne.g:316:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalExTwentyOne.g:322:1: ruleLambda returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ruleExp otherlv_8= '}' ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:328:2: ( ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ruleExp otherlv_8= '}' ) )
            // InternalExTwentyOne.g:329:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ruleExp otherlv_8= '}' )
            {
            // InternalExTwentyOne.g:329:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ruleExp otherlv_8= '}' )
            // InternalExTwentyOne.g:330:3: () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ruleExp otherlv_8= '}'
            {
            // InternalExTwentyOne.g:330:3: ()
            // InternalExTwentyOne.g:331:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLambdaAccess().getLambdaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExTwentyOne.g:341:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:342:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:342:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:343:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getColonKeyword_3());
            		

            			newCompositeNode(grammarAccess.getLambdaAccess().getTypeParserRuleCall_4());
            		
            pushFollow(FOLLOW_8);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6());
            		

            			newCompositeNode(grammarAccess.getLambdaAccess().getExpParserRuleCall_7());
            		
            pushFollow(FOLLOW_11);
            ruleExp();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalExTwentyOne.g:393:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalExTwentyOne.g:393:46: (iv_ruleInput= ruleInput EOF )
            // InternalExTwentyOne.g:394:2: iv_ruleInput= ruleInput EOF
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
    // InternalExTwentyOne.g:400:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:406:2: ( ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType ) )
            // InternalExTwentyOne.g:407:2: ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType )
            {
            // InternalExTwentyOne.g:407:2: ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType )
            // InternalExTwentyOne.g:408:3: () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType
            {
            // InternalExTwentyOne.g:408:3: ()
            // InternalExTwentyOne.g:409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
            		
            // InternalExTwentyOne.g:419:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:420:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:420:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:421:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getColonKeyword_3());
            		

            			newCompositeNode(grammarAccess.getInputAccess().getTypeParserRuleCall_4());
            		
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
    // InternalExTwentyOne.g:452:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalExTwentyOne.g:452:45: (iv_ruleNode= ruleNode EOF )
            // InternalExTwentyOne.g:453:2: iv_ruleNode= ruleNode EOF
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
    // InternalExTwentyOne.g:459:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lambda_5_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:465:2: ( ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' ) )
            // InternalExTwentyOne.g:466:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' )
            {
            // InternalExTwentyOne.g:466:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' )
            // InternalExTwentyOne.g:467:3: () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']'
            {
            // InternalExTwentyOne.g:467:3: ()
            // InternalExTwentyOne.g:468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeAccess().getNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
            		
            // InternalExTwentyOne.g:478:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:479:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:479:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:480:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExTwentyOne.g:500:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
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
                    // InternalExTwentyOne.g:501:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalExTwentyOne.g:501:4: ( (otherlv_4= RULE_ID ) )
                    // InternalExTwentyOne.g:502:5: (otherlv_4= RULE_ID )
                    {
                    // InternalExTwentyOne.g:502:5: (otherlv_4= RULE_ID )
                    // InternalExTwentyOne.g:503:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:515:4: ( (lv_lambda_5_0= ruleLambda ) )
                    {
                    // InternalExTwentyOne.g:515:4: ( (lv_lambda_5_0= ruleLambda ) )
                    // InternalExTwentyOne.g:516:5: (lv_lambda_5_0= ruleLambda )
                    {
                    // InternalExTwentyOne.g:516:5: (lv_lambda_5_0= ruleLambda )
                    // InternalExTwentyOne.g:517:6: lv_lambda_5_0= ruleLambda
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_lambda_5_0=ruleLambda();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						set(
                    							current,
                    							"lambda",
                    							lv_lambda_5_0,
                    							"org.xtext.example.mydsl.ExTwentyOne.Lambda");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_5());
            		

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
    // InternalExTwentyOne.g:543:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalExTwentyOne.g:543:47: (iv_ruleStream= ruleStream EOF )
            // InternalExTwentyOne.g:544:2: iv_ruleStream= ruleStream EOF
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
    // InternalExTwentyOne.g:550:1: ruleStream returns [EObject current=null] : ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_elements_6_0 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:556:2: ( ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ ) )
            // InternalExTwentyOne.g:557:2: ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ )
            {
            // InternalExTwentyOne.g:557:2: ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ )
            // InternalExTwentyOne.g:558:3: () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+
            {
            // InternalExTwentyOne.g:558:3: ()
            // InternalExTwentyOne.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStreamAccess().getStreamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getStreamKeyword_1());
            		
            // InternalExTwentyOne.g:569:3: ( (otherlv_2= RULE_ID ) )
            // InternalExTwentyOne.g:570:4: (otherlv_2= RULE_ID )
            {
            // InternalExTwentyOne.g:570:4: (otherlv_2= RULE_ID )
            // InternalExTwentyOne.g:571:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0());
            				

            }


            }

            // InternalExTwentyOne.g:582:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExTwentyOne.g:583:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalExTwentyOne.g:587:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalExTwentyOne.g:588:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:588:5: (otherlv_4= RULE_ID )
            	    // InternalExTwentyOne.g:589:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStreamRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalExTwentyOne.g:601:3: (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+
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
            	    // InternalExTwentyOne.g:602:4: otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getToKeyword_4_0());
            	    			
            	    // InternalExTwentyOne.g:606:4: ( (lv_elements_6_0= ruleElement ) )
            	    // InternalExTwentyOne.g:607:5: (lv_elements_6_0= ruleElement )
            	    {
            	    // InternalExTwentyOne.g:607:5: (lv_elements_6_0= ruleElement )
            	    // InternalExTwentyOne.g:608:6: lv_elements_6_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_elements_6_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStreamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_6_0,
            	    							"org.xtext.example.mydsl.ExTwentyOne.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalExTwentyOne.g:625:4: (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==24) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalExTwentyOne.g:626:5: otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,24,FOLLOW_16); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getCommaKeyword_4_2_0());
            	    	    				
            	    	    // InternalExTwentyOne.g:630:5: ( (lv_elements_8_0= ruleElement ) )
            	    	    // InternalExTwentyOne.g:631:6: (lv_elements_8_0= ruleElement )
            	    	    {
            	    	    // InternalExTwentyOne.g:631:6: (lv_elements_8_0= ruleElement )
            	    	    // InternalExTwentyOne.g:632:7: lv_elements_8_0= ruleElement
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_elements_8_0=ruleElement();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getStreamRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"elements",
            	    	    								lv_elements_8_0,
            	    	    								"org.xtext.example.mydsl.ExTwentyOne.Element");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

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


    // $ANTLR start "entryRuleElement"
    // InternalExTwentyOne.g:655:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalExTwentyOne.g:655:48: (iv_ruleElement= ruleElement EOF )
            // InternalExTwentyOne.g:656:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalExTwentyOne.g:662:1: ruleElement returns [EObject current=null] : ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_element_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_output_7_0=null;
        EObject this_Lambda_4 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:668:2: ( ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) ) )
            // InternalExTwentyOne.g:669:2: ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) )
            {
            // InternalExTwentyOne.g:669:2: ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 26:
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
                    // InternalExTwentyOne.g:670:3: ( () ( (lv_element_1_0= RULE_ID ) ) )
                    {
                    // InternalExTwentyOne.g:670:3: ( () ( (lv_element_1_0= RULE_ID ) ) )
                    // InternalExTwentyOne.g:671:4: () ( (lv_element_1_0= RULE_ID ) )
                    {
                    // InternalExTwentyOne.g:671:4: ()
                    // InternalExTwentyOne.g:672:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementAccess().getElementAction_0_0(),
                    						current);
                    				

                    }

                    // InternalExTwentyOne.g:678:4: ( (lv_element_1_0= RULE_ID ) )
                    // InternalExTwentyOne.g:679:5: (lv_element_1_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:679:5: (lv_element_1_0= RULE_ID )
                    // InternalExTwentyOne.g:680:6: lv_element_1_0= RULE_ID
                    {
                    lv_element_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_element_1_0, grammarAccess.getElementAccess().getElementIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"element",
                    							lv_element_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:698:3: (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' )
                    {
                    // InternalExTwentyOne.g:698:3: (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' )
                    // InternalExTwentyOne.g:699:4: otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalExTwentyOne.g:703:4: ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==15) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalExTwentyOne.g:704:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalExTwentyOne.g:704:5: ( (otherlv_3= RULE_ID ) )
                            // InternalExTwentyOne.g:705:6: (otherlv_3= RULE_ID )
                            {
                            // InternalExTwentyOne.g:705:6: (otherlv_3= RULE_ID )
                            // InternalExTwentyOne.g:706:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getElementRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                            							newLeafNode(otherlv_3, grammarAccess.getElementAccess().getNodeNodeCrossReference_1_1_0_0());
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalExTwentyOne.g:718:5: this_Lambda_4= ruleLambda
                            {

                            					newCompositeNode(grammarAccess.getElementAccess().getLambdaParserRuleCall_1_1_1());
                            				
                            pushFollow(FOLLOW_14);
                            this_Lambda_4=ruleLambda();

                            state._fsp--;


                            					current = this_Lambda_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:733:3: (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) )
                    {
                    // InternalExTwentyOne.g:733:3: (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) )
                    // InternalExTwentyOne.g:734:4: otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getElementAccess().getOutputKeyword_2_0());
                    			
                    // InternalExTwentyOne.g:738:4: ( (lv_output_7_0= RULE_ID ) )
                    // InternalExTwentyOne.g:739:5: (lv_output_7_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:739:5: (lv_output_7_0= RULE_ID )
                    // InternalExTwentyOne.g:740:6: lv_output_7_0= RULE_ID
                    {
                    lv_output_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_output_7_0, grammarAccess.getElementAccess().getOutputIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"output",
                    							lv_output_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataDecl"
    // InternalExTwentyOne.g:761:1: entryRuleDataDecl returns [EObject current=null] : iv_ruleDataDecl= ruleDataDecl EOF ;
    public final EObject entryRuleDataDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDecl = null;


        try {
            // InternalExTwentyOne.g:761:49: (iv_ruleDataDecl= ruleDataDecl EOF )
            // InternalExTwentyOne.g:762:2: iv_ruleDataDecl= ruleDataDecl EOF
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
    // InternalExTwentyOne.g:768:1: ruleDataDecl returns [EObject current=null] : ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' ) ;
    public final EObject ruleDataDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_data_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_data_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:774:2: ( ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' ) )
            // InternalExTwentyOne.g:775:2: ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' )
            {
            // InternalExTwentyOne.g:775:2: ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' )
            // InternalExTwentyOne.g:776:3: () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}'
            {
            // InternalExTwentyOne.g:776:3: ()
            // InternalExTwentyOne.g:777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDeclAccess().getDataDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataDeclAccess().getDataKeyword_1());
            		
            // InternalExTwentyOne.g:787:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:788:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:788:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:789:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalExTwentyOne.g:809:3: ( (lv_data_4_0= RULE_ID ) )
            // InternalExTwentyOne.g:810:4: (lv_data_4_0= RULE_ID )
            {
            // InternalExTwentyOne.g:810:4: (lv_data_4_0= RULE_ID )
            // InternalExTwentyOne.g:811:5: lv_data_4_0= RULE_ID
            {
            lv_data_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_data_4_0, grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDeclRule());
            					}
            					addWithLastConsumed(
            						current,
            						"data",
            						lv_data_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDataDeclAccess().getColonKeyword_5());
            		

            			newCompositeNode(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6());
            		
            pushFollow(FOLLOW_18);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalExTwentyOne.g:838:3: (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:839:4: otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDataDeclAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalExTwentyOne.g:843:4: ( (lv_data_8_0= RULE_ID ) )
            	    // InternalExTwentyOne.g:844:5: (lv_data_8_0= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:844:5: (lv_data_8_0= RULE_ID )
            	    // InternalExTwentyOne.g:845:6: lv_data_8_0= RULE_ID
            	    {
            	    lv_data_8_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(lv_data_8_0, grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_7_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataDeclRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"data",
            	    							lv_data_8_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_9, grammarAccess.getDataDeclAccess().getColonKeyword_7_2());
            	    			

            	    				newCompositeNode(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_7_3());
            	    			
            	    pushFollow(FOLLOW_18);
            	    ruleType();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalExTwentyOne.g:881:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalExTwentyOne.g:881:44: (iv_ruleType= ruleType EOF )
            // InternalExTwentyOne.g:882:2: iv_ruleType= ruleType EOF
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
    // InternalExTwentyOne.g:888:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:894:2: ( (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) )
            // InternalExTwentyOne.g:895:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
            {
            // InternalExTwentyOne.g:895:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalExTwentyOne.g:896:3: kw= 'int'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:902:3: kw= 'string'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:908:3: this_ID_2= RULE_ID
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
    // InternalExTwentyOne.g:919:1: entryRuleExp returns [String current=null] : iv_ruleExp= ruleExp EOF ;
    public final String entryRuleExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExp = null;


        try {
            // InternalExTwentyOne.g:919:43: (iv_ruleExp= ruleExp EOF )
            // InternalExTwentyOne.g:920:2: iv_ruleExp= ruleExp EOF
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
    // InternalExTwentyOne.g:926:1: ruleExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:932:2: ( (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) )
            // InternalExTwentyOne.g:933:2: (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT )
            {
            // InternalExTwentyOne.g:933:2: (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT )
            // InternalExTwentyOne.g:934:3: this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getExpAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,30,FOLLOW_10); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008985002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});

}