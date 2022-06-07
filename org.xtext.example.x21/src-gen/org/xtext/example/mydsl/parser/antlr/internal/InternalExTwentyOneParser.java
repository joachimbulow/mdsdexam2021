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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'int'", "'string'", "'+'", "'-'", "'*'", "'/'", "'let'", "'='", "'in'", "'end'", "'.'", "'none'", "'if'", "'then'", "'else'", "'new'", "'<'", "'>'", "'<='", "'>='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalExTwentyOne.g:322:1: ruleLambda returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_lambdaExp_7_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:328:2: ( ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' ) )
            // InternalExTwentyOne.g:329:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' )
            {
            // InternalExTwentyOne.g:329:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' )
            // InternalExTwentyOne.g:330:3: () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}'
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
            		
            otherlv_6=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalExTwentyOne.g:378:3: ( (lv_lambdaExp_7_0= ruleExp ) )
            // InternalExTwentyOne.g:379:4: (lv_lambdaExp_7_0= ruleExp )
            {
            // InternalExTwentyOne.g:379:4: (lv_lambdaExp_7_0= ruleExp )
            // InternalExTwentyOne.g:380:5: lv_lambdaExp_7_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getLambdaExpExpParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_lambdaExp_7_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"lambdaExp",
            						lv_lambdaExp_7_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

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
    // InternalExTwentyOne.g:405:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalExTwentyOne.g:405:46: (iv_ruleInput= ruleInput EOF )
            // InternalExTwentyOne.g:406:2: iv_ruleInput= ruleInput EOF
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
    // InternalExTwentyOne.g:412:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:418:2: ( ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType ) )
            // InternalExTwentyOne.g:419:2: ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType )
            {
            // InternalExTwentyOne.g:419:2: ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType )
            // InternalExTwentyOne.g:420:3: () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ruleType
            {
            // InternalExTwentyOne.g:420:3: ()
            // InternalExTwentyOne.g:421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
            		
            // InternalExTwentyOne.g:431:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:432:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:432:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:433:5: lv_name_2_0= RULE_ID
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
    // InternalExTwentyOne.g:464:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalExTwentyOne.g:464:45: (iv_ruleNode= ruleNode EOF )
            // InternalExTwentyOne.g:465:2: iv_ruleNode= ruleNode EOF
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
    // InternalExTwentyOne.g:471:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' ) ;
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
            // InternalExTwentyOne.g:477:2: ( ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' ) )
            // InternalExTwentyOne.g:478:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' )
            {
            // InternalExTwentyOne.g:478:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' )
            // InternalExTwentyOne.g:479:3: () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']'
            {
            // InternalExTwentyOne.g:479:3: ()
            // InternalExTwentyOne.g:480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeAccess().getNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
            		
            // InternalExTwentyOne.g:490:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:491:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:491:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:492:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExTwentyOne.g:512:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) )
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
                    // InternalExTwentyOne.g:513:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalExTwentyOne.g:513:4: ( (otherlv_4= RULE_ID ) )
                    // InternalExTwentyOne.g:514:5: (otherlv_4= RULE_ID )
                    {
                    // InternalExTwentyOne.g:514:5: (otherlv_4= RULE_ID )
                    // InternalExTwentyOne.g:515:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:527:4: ( (lv_lambda_5_0= ruleLambda ) )
                    {
                    // InternalExTwentyOne.g:527:4: ( (lv_lambda_5_0= ruleLambda ) )
                    // InternalExTwentyOne.g:528:5: (lv_lambda_5_0= ruleLambda )
                    {
                    // InternalExTwentyOne.g:528:5: (lv_lambda_5_0= ruleLambda )
                    // InternalExTwentyOne.g:529:6: lv_lambda_5_0= ruleLambda
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
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
    // InternalExTwentyOne.g:555:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalExTwentyOne.g:555:47: (iv_ruleStream= ruleStream EOF )
            // InternalExTwentyOne.g:556:2: iv_ruleStream= ruleStream EOF
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
    // InternalExTwentyOne.g:562:1: ruleStream returns [EObject current=null] : ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ ) ;
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
            // InternalExTwentyOne.g:568:2: ( ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ ) )
            // InternalExTwentyOne.g:569:2: ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ )
            {
            // InternalExTwentyOne.g:569:2: ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ )
            // InternalExTwentyOne.g:570:3: () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+
            {
            // InternalExTwentyOne.g:570:3: ()
            // InternalExTwentyOne.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStreamAccess().getStreamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getStreamKeyword_1());
            		
            // InternalExTwentyOne.g:581:3: ( (otherlv_2= RULE_ID ) )
            // InternalExTwentyOne.g:582:4: (otherlv_2= RULE_ID )
            {
            // InternalExTwentyOne.g:582:4: (otherlv_2= RULE_ID )
            // InternalExTwentyOne.g:583:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0());
            				

            }


            }

            // InternalExTwentyOne.g:594:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExTwentyOne.g:595:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalExTwentyOne.g:599:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalExTwentyOne.g:600:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:600:5: (otherlv_4= RULE_ID )
            	    // InternalExTwentyOne.g:601:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStreamRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalExTwentyOne.g:613:3: (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+
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
            	    // InternalExTwentyOne.g:614:4: otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_15); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getToKeyword_4_0());
            	    			
            	    // InternalExTwentyOne.g:618:4: ( (lv_elements_6_0= ruleElement ) )
            	    // InternalExTwentyOne.g:619:5: (lv_elements_6_0= ruleElement )
            	    {
            	    // InternalExTwentyOne.g:619:5: (lv_elements_6_0= ruleElement )
            	    // InternalExTwentyOne.g:620:6: lv_elements_6_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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

            	    // InternalExTwentyOne.g:637:4: (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==24) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalExTwentyOne.g:638:5: otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,24,FOLLOW_15); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getCommaKeyword_4_2_0());
            	    	    				
            	    	    // InternalExTwentyOne.g:642:5: ( (lv_elements_8_0= ruleElement ) )
            	    	    // InternalExTwentyOne.g:643:6: (lv_elements_8_0= ruleElement )
            	    	    {
            	    	    // InternalExTwentyOne.g:643:6: (lv_elements_8_0= ruleElement )
            	    	    // InternalExTwentyOne.g:644:7: lv_elements_8_0= ruleElement
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_16);
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
    // InternalExTwentyOne.g:667:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalExTwentyOne.g:667:48: (iv_ruleElement= ruleElement EOF )
            // InternalExTwentyOne.g:668:2: iv_ruleElement= ruleElement EOF
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
    // InternalExTwentyOne.g:674:1: ruleElement returns [EObject current=null] : ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) ) ;
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
            // InternalExTwentyOne.g:680:2: ( ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) ) )
            // InternalExTwentyOne.g:681:2: ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) )
            {
            // InternalExTwentyOne.g:681:2: ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) )
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
                    // InternalExTwentyOne.g:682:3: ( () ( (lv_element_1_0= RULE_ID ) ) )
                    {
                    // InternalExTwentyOne.g:682:3: ( () ( (lv_element_1_0= RULE_ID ) ) )
                    // InternalExTwentyOne.g:683:4: () ( (lv_element_1_0= RULE_ID ) )
                    {
                    // InternalExTwentyOne.g:683:4: ()
                    // InternalExTwentyOne.g:684:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementAccess().getElementAction_0_0(),
                    						current);
                    				

                    }

                    // InternalExTwentyOne.g:690:4: ( (lv_element_1_0= RULE_ID ) )
                    // InternalExTwentyOne.g:691:5: (lv_element_1_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:691:5: (lv_element_1_0= RULE_ID )
                    // InternalExTwentyOne.g:692:6: lv_element_1_0= RULE_ID
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
                    // InternalExTwentyOne.g:710:3: (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' )
                    {
                    // InternalExTwentyOne.g:710:3: (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' )
                    // InternalExTwentyOne.g:711:4: otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalExTwentyOne.g:715:4: ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda )
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
                            // InternalExTwentyOne.g:716:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalExTwentyOne.g:716:5: ( (otherlv_3= RULE_ID ) )
                            // InternalExTwentyOne.g:717:6: (otherlv_3= RULE_ID )
                            {
                            // InternalExTwentyOne.g:717:6: (otherlv_3= RULE_ID )
                            // InternalExTwentyOne.g:718:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getElementRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

                            							newLeafNode(otherlv_3, grammarAccess.getElementAccess().getNodeNodeCrossReference_1_1_0_0());
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalExTwentyOne.g:730:5: this_Lambda_4= ruleLambda
                            {

                            					newCompositeNode(grammarAccess.getElementAccess().getLambdaParserRuleCall_1_1_1());
                            				
                            pushFollow(FOLLOW_13);
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
                    // InternalExTwentyOne.g:745:3: (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) )
                    {
                    // InternalExTwentyOne.g:745:3: (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) )
                    // InternalExTwentyOne.g:746:4: otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getElementAccess().getOutputKeyword_2_0());
                    			
                    // InternalExTwentyOne.g:750:4: ( (lv_output_7_0= RULE_ID ) )
                    // InternalExTwentyOne.g:751:5: (lv_output_7_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:751:5: (lv_output_7_0= RULE_ID )
                    // InternalExTwentyOne.g:752:6: lv_output_7_0= RULE_ID
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
    // InternalExTwentyOne.g:773:1: entryRuleDataDecl returns [EObject current=null] : iv_ruleDataDecl= ruleDataDecl EOF ;
    public final EObject entryRuleDataDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDecl = null;


        try {
            // InternalExTwentyOne.g:773:49: (iv_ruleDataDecl= ruleDataDecl EOF )
            // InternalExTwentyOne.g:774:2: iv_ruleDataDecl= ruleDataDecl EOF
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
    // InternalExTwentyOne.g:780:1: ruleDataDecl returns [EObject current=null] : ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' ) ;
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
            // InternalExTwentyOne.g:786:2: ( ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' ) )
            // InternalExTwentyOne.g:787:2: ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' )
            {
            // InternalExTwentyOne.g:787:2: ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}' )
            // InternalExTwentyOne.g:788:3: () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ruleType (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )* otherlv_11= '}'
            {
            // InternalExTwentyOne.g:788:3: ()
            // InternalExTwentyOne.g:789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDeclAccess().getDataDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataDeclAccess().getDataKeyword_1());
            		
            // InternalExTwentyOne.g:799:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:800:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:800:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:801:5: lv_name_2_0= RULE_ID
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
            		
            // InternalExTwentyOne.g:821:3: ( (lv_data_4_0= RULE_ID ) )
            // InternalExTwentyOne.g:822:4: (lv_data_4_0= RULE_ID )
            {
            // InternalExTwentyOne.g:822:4: (lv_data_4_0= RULE_ID )
            // InternalExTwentyOne.g:823:5: lv_data_4_0= RULE_ID
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
            		
            pushFollow(FOLLOW_17);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalExTwentyOne.g:850:3: (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:851:4: otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ruleType
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDataDeclAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalExTwentyOne.g:855:4: ( (lv_data_8_0= RULE_ID ) )
            	    // InternalExTwentyOne.g:856:5: (lv_data_8_0= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:856:5: (lv_data_8_0= RULE_ID )
            	    // InternalExTwentyOne.g:857:6: lv_data_8_0= RULE_ID
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
            	    			
            	    pushFollow(FOLLOW_17);
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
    // InternalExTwentyOne.g:893:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalExTwentyOne.g:893:44: (iv_ruleType= ruleType EOF )
            // InternalExTwentyOne.g:894:2: iv_ruleType= ruleType EOF
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
    // InternalExTwentyOne.g:900:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:906:2: ( (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) )
            // InternalExTwentyOne.g:907:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
            {
            // InternalExTwentyOne.g:907:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
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
                    // InternalExTwentyOne.g:908:3: kw= 'int'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:914:3: kw= 'string'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:920:3: this_ID_2= RULE_ID
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
    // InternalExTwentyOne.g:931:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalExTwentyOne.g:931:44: (iv_ruleExp= ruleExp EOF )
            // InternalExTwentyOne.g:932:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // InternalExTwentyOne.g:938:1: ruleExp returns [EObject current=null] : ( () ruleType ( ( (lv_left_2_0= ruleType ) ) ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_letId_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token this_ID_21=null;
        Token otherlv_22=null;
        Token this_ID_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_newArrayId_33_0=null;
        Token otherlv_34=null;
        Token lv_newArrayIds_35_0=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token lv_newArrayIds_39_0=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        AntlrDatatypeRuleToken lv_left_2_0 = null;

        EObject lv_rightPlus_4_0 = null;

        EObject lv_rightMinus_6_0 = null;

        EObject lv_rightMultiply_8_0 = null;

        EObject lv_rightDivide_10_0 = null;

        EObject lv_inParenthesis_12_0 = null;

        EObject lv_letDefExp_17_0 = null;

        EObject lv_letTargetExp_19_0 = null;

        EObject lv_ifLogicExp_26_0 = null;

        EObject lv_thenExp_28_0 = null;

        EObject lv_elseExp_30_0 = null;

        EObject lv_newArrayExps_37_0 = null;

        EObject lv_newArrayExps_41_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:944:2: ( ( () ruleType ( ( (lv_left_2_0= ruleType ) ) ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) ) ) ) )
            // InternalExTwentyOne.g:945:2: ( () ruleType ( ( (lv_left_2_0= ruleType ) ) ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) ) ) )
            {
            // InternalExTwentyOne.g:945:2: ( () ruleType ( ( (lv_left_2_0= ruleType ) ) ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) ) ) )
            // InternalExTwentyOne.g:946:3: () ruleType ( ( (lv_left_2_0= ruleType ) ) ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) ) )
            {
            // InternalExTwentyOne.g:946:3: ()
            // InternalExTwentyOne.g:947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpAccess().getExpAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getExpAccess().getTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalExTwentyOne.g:960:3: ( ( (lv_left_2_0= ruleType ) ) ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) ) )
            // InternalExTwentyOne.g:961:4: ( (lv_left_2_0= ruleType ) ) ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) )
            {
            // InternalExTwentyOne.g:961:4: ( (lv_left_2_0= ruleType ) )
            // InternalExTwentyOne.g:962:5: (lv_left_2_0= ruleType )
            {
            // InternalExTwentyOne.g:962:5: (lv_left_2_0= ruleType )
            // InternalExTwentyOne.g:963:6: lv_left_2_0= ruleType
            {

            						newCompositeNode(grammarAccess.getExpAccess().getLeftTypeParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_18);
            lv_left_2_0=ruleType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getExpRule());
            						}
            						set(
            							current,
            							"left",
            							lv_left_2_0,
            							"org.xtext.example.mydsl.ExTwentyOne.Type");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalExTwentyOne.g:980:4: ( (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) ) | (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) ) | (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) ) | (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) ) | (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' ) | (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' ) | (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* ) | otherlv_24= 'none' | (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' ) | (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' ) )
            int alt13=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            case 15:
                {
                alt13=5;
                }
                break;
            case 34:
                {
                alt13=6;
                }
                break;
            case RULE_ID:
                {
                alt13=7;
                }
                break;
            case 39:
                {
                alt13=8;
                }
                break;
            case 40:
                {
                alt13=9;
                }
                break;
            case 43:
                {
                alt13=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalExTwentyOne.g:981:5: (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) )
                    {
                    // InternalExTwentyOne.g:981:5: (otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) ) )
                    // InternalExTwentyOne.g:982:6: otherlv_3= '+' ( (lv_rightPlus_4_0= ruleExp ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getPlusSignKeyword_2_1_0_0());
                    					
                    // InternalExTwentyOne.g:986:6: ( (lv_rightPlus_4_0= ruleExp ) )
                    // InternalExTwentyOne.g:987:7: (lv_rightPlus_4_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:987:7: (lv_rightPlus_4_0= ruleExp )
                    // InternalExTwentyOne.g:988:8: lv_rightPlus_4_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getRightPlusExpParserRuleCall_2_1_0_1_0());
                    							
                    pushFollow(FOLLOW_2);
                    lv_rightPlus_4_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"rightPlus",
                    									lv_rightPlus_4_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:1007:5: (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) )
                    {
                    // InternalExTwentyOne.g:1007:5: (otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) ) )
                    // InternalExTwentyOne.g:1008:6: otherlv_5= '-' ( (lv_rightMinus_6_0= ruleExp ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_6); 

                    						newLeafNode(otherlv_5, grammarAccess.getExpAccess().getHyphenMinusKeyword_2_1_1_0());
                    					
                    // InternalExTwentyOne.g:1012:6: ( (lv_rightMinus_6_0= ruleExp ) )
                    // InternalExTwentyOne.g:1013:7: (lv_rightMinus_6_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1013:7: (lv_rightMinus_6_0= ruleExp )
                    // InternalExTwentyOne.g:1014:8: lv_rightMinus_6_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getRightMinusExpParserRuleCall_2_1_1_1_0());
                    							
                    pushFollow(FOLLOW_2);
                    lv_rightMinus_6_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"rightMinus",
                    									lv_rightMinus_6_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:1033:5: (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) )
                    {
                    // InternalExTwentyOne.g:1033:5: (otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) ) )
                    // InternalExTwentyOne.g:1034:6: otherlv_7= '*' ( (lv_rightMultiply_8_0= ruleExp ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_6); 

                    						newLeafNode(otherlv_7, grammarAccess.getExpAccess().getAsteriskKeyword_2_1_2_0());
                    					
                    // InternalExTwentyOne.g:1038:6: ( (lv_rightMultiply_8_0= ruleExp ) )
                    // InternalExTwentyOne.g:1039:7: (lv_rightMultiply_8_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1039:7: (lv_rightMultiply_8_0= ruleExp )
                    // InternalExTwentyOne.g:1040:8: lv_rightMultiply_8_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getRightMultiplyExpParserRuleCall_2_1_2_1_0());
                    							
                    pushFollow(FOLLOW_2);
                    lv_rightMultiply_8_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"rightMultiply",
                    									lv_rightMultiply_8_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:1059:5: (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) )
                    {
                    // InternalExTwentyOne.g:1059:5: (otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) ) )
                    // InternalExTwentyOne.g:1060:6: otherlv_9= '/' ( (lv_rightDivide_10_0= ruleExp ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_6); 

                    						newLeafNode(otherlv_9, grammarAccess.getExpAccess().getSolidusKeyword_2_1_3_0());
                    					
                    // InternalExTwentyOne.g:1064:6: ( (lv_rightDivide_10_0= ruleExp ) )
                    // InternalExTwentyOne.g:1065:7: (lv_rightDivide_10_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1065:7: (lv_rightDivide_10_0= ruleExp )
                    // InternalExTwentyOne.g:1066:8: lv_rightDivide_10_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getRightDivideExpParserRuleCall_2_1_3_1_0());
                    							
                    pushFollow(FOLLOW_2);
                    lv_rightDivide_10_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"rightDivide",
                    									lv_rightDivide_10_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:1085:5: (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' )
                    {
                    // InternalExTwentyOne.g:1085:5: (otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')' )
                    // InternalExTwentyOne.g:1086:6: otherlv_11= '(' ( (lv_inParenthesis_12_0= ruleExp ) ) otherlv_13= ')'
                    {
                    otherlv_11=(Token)match(input,15,FOLLOW_6); 

                    						newLeafNode(otherlv_11, grammarAccess.getExpAccess().getLeftParenthesisKeyword_2_1_4_0());
                    					
                    // InternalExTwentyOne.g:1090:6: ( (lv_inParenthesis_12_0= ruleExp ) )
                    // InternalExTwentyOne.g:1091:7: (lv_inParenthesis_12_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1091:7: (lv_inParenthesis_12_0= ruleExp )
                    // InternalExTwentyOne.g:1092:8: lv_inParenthesis_12_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getInParenthesisExpParserRuleCall_2_1_4_1_0());
                    							
                    pushFollow(FOLLOW_8);
                    lv_inParenthesis_12_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"inParenthesis",
                    									lv_inParenthesis_12_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(otherlv_13, grammarAccess.getExpAccess().getRightParenthesisKeyword_2_1_4_2());
                    					

                    }


                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:1115:5: (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' )
                    {
                    // InternalExTwentyOne.g:1115:5: (otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end' )
                    // InternalExTwentyOne.g:1116:6: otherlv_14= 'let' ( (lv_letId_15_0= RULE_ID ) ) otherlv_16= '=' ( (lv_letDefExp_17_0= ruleExp ) ) otherlv_18= 'in' ( (lv_letTargetExp_19_0= ruleExp ) ) otherlv_20= 'end'
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_3); 

                    						newLeafNode(otherlv_14, grammarAccess.getExpAccess().getLetKeyword_2_1_5_0());
                    					
                    // InternalExTwentyOne.g:1120:6: ( (lv_letId_15_0= RULE_ID ) )
                    // InternalExTwentyOne.g:1121:7: (lv_letId_15_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:1121:7: (lv_letId_15_0= RULE_ID )
                    // InternalExTwentyOne.g:1122:8: lv_letId_15_0= RULE_ID
                    {
                    lv_letId_15_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    								newLeafNode(lv_letId_15_0, grammarAccess.getExpAccess().getLetIdIDTerminalRuleCall_2_1_5_1_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getExpRule());
                    								}
                    								setWithLastConsumed(
                    									current,
                    									"letId",
                    									lv_letId_15_0,
                    									"org.eclipse.xtext.common.Terminals.ID");
                    							

                    }


                    }

                    otherlv_16=(Token)match(input,35,FOLLOW_6); 

                    						newLeafNode(otherlv_16, grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_5_2());
                    					
                    // InternalExTwentyOne.g:1142:6: ( (lv_letDefExp_17_0= ruleExp ) )
                    // InternalExTwentyOne.g:1143:7: (lv_letDefExp_17_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1143:7: (lv_letDefExp_17_0= ruleExp )
                    // InternalExTwentyOne.g:1144:8: lv_letDefExp_17_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getLetDefExpExpParserRuleCall_2_1_5_3_0());
                    							
                    pushFollow(FOLLOW_20);
                    lv_letDefExp_17_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"letDefExp",
                    									lv_letDefExp_17_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_6); 

                    						newLeafNode(otherlv_18, grammarAccess.getExpAccess().getInKeyword_2_1_5_4());
                    					
                    // InternalExTwentyOne.g:1165:6: ( (lv_letTargetExp_19_0= ruleExp ) )
                    // InternalExTwentyOne.g:1166:7: (lv_letTargetExp_19_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1166:7: (lv_letTargetExp_19_0= ruleExp )
                    // InternalExTwentyOne.g:1167:8: lv_letTargetExp_19_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getLetTargetExpExpParserRuleCall_2_1_5_5_0());
                    							
                    pushFollow(FOLLOW_21);
                    lv_letTargetExp_19_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"letTargetExp",
                    									lv_letTargetExp_19_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    otherlv_20=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(otherlv_20, grammarAccess.getExpAccess().getEndKeyword_2_1_5_6());
                    					

                    }


                    }
                    break;
                case 7 :
                    // InternalExTwentyOne.g:1190:5: (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* )
                    {
                    // InternalExTwentyOne.g:1190:5: (this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )* )
                    // InternalExTwentyOne.g:1191:6: this_ID_21= RULE_ID (otherlv_22= '.' this_ID_23= RULE_ID )*
                    {
                    this_ID_21=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(this_ID_21, grammarAccess.getExpAccess().getIDTerminalRuleCall_2_1_6_0());
                    					
                    // InternalExTwentyOne.g:1195:6: (otherlv_22= '.' this_ID_23= RULE_ID )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==38) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalExTwentyOne.g:1196:7: otherlv_22= '.' this_ID_23= RULE_ID
                    	    {
                    	    otherlv_22=(Token)match(input,38,FOLLOW_3); 

                    	    							newLeafNode(otherlv_22, grammarAccess.getExpAccess().getFullStopKeyword_2_1_6_1_0());
                    	    						
                    	    this_ID_23=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    							newLeafNode(this_ID_23, grammarAccess.getExpAccess().getIDTerminalRuleCall_2_1_6_1_1());
                    	    						

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 8 :
                    // InternalExTwentyOne.g:1207:5: otherlv_24= 'none'
                    {
                    otherlv_24=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(otherlv_24, grammarAccess.getExpAccess().getNoneKeyword_2_1_7());
                    				

                    }
                    break;
                case 9 :
                    // InternalExTwentyOne.g:1212:5: (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' )
                    {
                    // InternalExTwentyOne.g:1212:5: (otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end' )
                    // InternalExTwentyOne.g:1213:6: otherlv_25= 'if' ( (lv_ifLogicExp_26_0= ruleLogicExp ) ) otherlv_27= 'then' ( (lv_thenExp_28_0= ruleExp ) ) otherlv_29= 'else' ( (lv_elseExp_30_0= ruleExp ) ) otherlv_31= 'end'
                    {
                    otherlv_25=(Token)match(input,40,FOLLOW_6); 

                    						newLeafNode(otherlv_25, grammarAccess.getExpAccess().getIfKeyword_2_1_8_0());
                    					
                    // InternalExTwentyOne.g:1217:6: ( (lv_ifLogicExp_26_0= ruleLogicExp ) )
                    // InternalExTwentyOne.g:1218:7: (lv_ifLogicExp_26_0= ruleLogicExp )
                    {
                    // InternalExTwentyOne.g:1218:7: (lv_ifLogicExp_26_0= ruleLogicExp )
                    // InternalExTwentyOne.g:1219:8: lv_ifLogicExp_26_0= ruleLogicExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getIfLogicExpLogicExpParserRuleCall_2_1_8_1_0());
                    							
                    pushFollow(FOLLOW_23);
                    lv_ifLogicExp_26_0=ruleLogicExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"ifLogicExp",
                    									lv_ifLogicExp_26_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.LogicExp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    otherlv_27=(Token)match(input,41,FOLLOW_6); 

                    						newLeafNode(otherlv_27, grammarAccess.getExpAccess().getThenKeyword_2_1_8_2());
                    					
                    // InternalExTwentyOne.g:1240:6: ( (lv_thenExp_28_0= ruleExp ) )
                    // InternalExTwentyOne.g:1241:7: (lv_thenExp_28_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1241:7: (lv_thenExp_28_0= ruleExp )
                    // InternalExTwentyOne.g:1242:8: lv_thenExp_28_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getThenExpExpParserRuleCall_2_1_8_3_0());
                    							
                    pushFollow(FOLLOW_24);
                    lv_thenExp_28_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"thenExp",
                    									lv_thenExp_28_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    otherlv_29=(Token)match(input,42,FOLLOW_6); 

                    						newLeafNode(otherlv_29, grammarAccess.getExpAccess().getElseKeyword_2_1_8_4());
                    					
                    // InternalExTwentyOne.g:1263:6: ( (lv_elseExp_30_0= ruleExp ) )
                    // InternalExTwentyOne.g:1264:7: (lv_elseExp_30_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1264:7: (lv_elseExp_30_0= ruleExp )
                    // InternalExTwentyOne.g:1265:8: lv_elseExp_30_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getElseExpExpParserRuleCall_2_1_8_5_0());
                    							
                    pushFollow(FOLLOW_21);
                    lv_elseExp_30_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								set(
                    									current,
                    									"elseExp",
                    									lv_elseExp_30_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    otherlv_31=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(otherlv_31, grammarAccess.getExpAccess().getEndKeyword_2_1_8_6());
                    					

                    }


                    }
                    break;
                case 10 :
                    // InternalExTwentyOne.g:1288:5: (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' )
                    {
                    // InternalExTwentyOne.g:1288:5: (otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']' )
                    // InternalExTwentyOne.g:1289:6: otherlv_32= 'new' ( (lv_newArrayId_33_0= RULE_ID ) ) otherlv_34= '[' ( (lv_newArrayIds_35_0= RULE_ID ) ) otherlv_36= '=' ( (lv_newArrayExps_37_0= ruleExp ) ) (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )* otherlv_42= ']'
                    {
                    otherlv_32=(Token)match(input,43,FOLLOW_3); 

                    						newLeafNode(otherlv_32, grammarAccess.getExpAccess().getNewKeyword_2_1_9_0());
                    					
                    // InternalExTwentyOne.g:1293:6: ( (lv_newArrayId_33_0= RULE_ID ) )
                    // InternalExTwentyOne.g:1294:7: (lv_newArrayId_33_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:1294:7: (lv_newArrayId_33_0= RULE_ID )
                    // InternalExTwentyOne.g:1295:8: lv_newArrayId_33_0= RULE_ID
                    {
                    lv_newArrayId_33_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    								newLeafNode(lv_newArrayId_33_0, grammarAccess.getExpAccess().getNewArrayIdIDTerminalRuleCall_2_1_9_1_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getExpRule());
                    								}
                    								setWithLastConsumed(
                    									current,
                    									"newArrayId",
                    									lv_newArrayId_33_0,
                    									"org.eclipse.xtext.common.Terminals.ID");
                    							

                    }


                    }

                    otherlv_34=(Token)match(input,21,FOLLOW_3); 

                    						newLeafNode(otherlv_34, grammarAccess.getExpAccess().getLeftSquareBracketKeyword_2_1_9_2());
                    					
                    // InternalExTwentyOne.g:1315:6: ( (lv_newArrayIds_35_0= RULE_ID ) )
                    // InternalExTwentyOne.g:1316:7: (lv_newArrayIds_35_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:1316:7: (lv_newArrayIds_35_0= RULE_ID )
                    // InternalExTwentyOne.g:1317:8: lv_newArrayIds_35_0= RULE_ID
                    {
                    lv_newArrayIds_35_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    								newLeafNode(lv_newArrayIds_35_0, grammarAccess.getExpAccess().getNewArrayIdsIDTerminalRuleCall_2_1_9_3_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getExpRule());
                    								}
                    								addWithLastConsumed(
                    									current,
                    									"newArrayIds",
                    									lv_newArrayIds_35_0,
                    									"org.eclipse.xtext.common.Terminals.ID");
                    							

                    }


                    }

                    otherlv_36=(Token)match(input,35,FOLLOW_6); 

                    						newLeafNode(otherlv_36, grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_9_4());
                    					
                    // InternalExTwentyOne.g:1337:6: ( (lv_newArrayExps_37_0= ruleExp ) )
                    // InternalExTwentyOne.g:1338:7: (lv_newArrayExps_37_0= ruleExp )
                    {
                    // InternalExTwentyOne.g:1338:7: (lv_newArrayExps_37_0= ruleExp )
                    // InternalExTwentyOne.g:1339:8: lv_newArrayExps_37_0= ruleExp
                    {

                    								newCompositeNode(grammarAccess.getExpAccess().getNewArrayExpsExpParserRuleCall_2_1_9_5_0());
                    							
                    pushFollow(FOLLOW_25);
                    lv_newArrayExps_37_0=ruleExp();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getExpRule());
                    								}
                    								add(
                    									current,
                    									"newArrayExps",
                    									lv_newArrayExps_37_0,
                    									"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    // InternalExTwentyOne.g:1356:6: (otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==24) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalExTwentyOne.g:1357:7: otherlv_38= ',' ( (lv_newArrayIds_39_0= RULE_ID ) ) otherlv_40= '=' ( (lv_newArrayExps_41_0= ruleExp ) )
                    	    {
                    	    otherlv_38=(Token)match(input,24,FOLLOW_3); 

                    	    							newLeafNode(otherlv_38, grammarAccess.getExpAccess().getCommaKeyword_2_1_9_6_0());
                    	    						
                    	    // InternalExTwentyOne.g:1361:7: ( (lv_newArrayIds_39_0= RULE_ID ) )
                    	    // InternalExTwentyOne.g:1362:8: (lv_newArrayIds_39_0= RULE_ID )
                    	    {
                    	    // InternalExTwentyOne.g:1362:8: (lv_newArrayIds_39_0= RULE_ID )
                    	    // InternalExTwentyOne.g:1363:9: lv_newArrayIds_39_0= RULE_ID
                    	    {
                    	    lv_newArrayIds_39_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    									newLeafNode(lv_newArrayIds_39_0, grammarAccess.getExpAccess().getNewArrayIdsIDTerminalRuleCall_2_1_9_6_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getExpRule());
                    	    									}
                    	    									addWithLastConsumed(
                    	    										current,
                    	    										"newArrayIds",
                    	    										lv_newArrayIds_39_0,
                    	    										"org.eclipse.xtext.common.Terminals.ID");
                    	    								

                    	    }


                    	    }

                    	    otherlv_40=(Token)match(input,35,FOLLOW_6); 

                    	    							newLeafNode(otherlv_40, grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_9_6_2());
                    	    						
                    	    // InternalExTwentyOne.g:1383:7: ( (lv_newArrayExps_41_0= ruleExp ) )
                    	    // InternalExTwentyOne.g:1384:8: (lv_newArrayExps_41_0= ruleExp )
                    	    {
                    	    // InternalExTwentyOne.g:1384:8: (lv_newArrayExps_41_0= ruleExp )
                    	    // InternalExTwentyOne.g:1385:9: lv_newArrayExps_41_0= ruleExp
                    	    {

                    	    									newCompositeNode(grammarAccess.getExpAccess().getNewArrayExpsExpParserRuleCall_2_1_9_6_3_0());
                    	    								
                    	    pushFollow(FOLLOW_25);
                    	    lv_newArrayExps_41_0=ruleExp();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getExpRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"newArrayExps",
                    	    										lv_newArrayExps_41_0,
                    	    										"org.xtext.example.mydsl.ExTwentyOne.Exp");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_42=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(otherlv_42, grammarAccess.getExpAccess().getRightSquareBracketKeyword_2_1_9_7());
                    					

                    }


                    }
                    break;

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleLogicExp"
    // InternalExTwentyOne.g:1414:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalExTwentyOne.g:1414:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalExTwentyOne.g:1415:2: iv_ruleLogicExp= ruleLogicExp EOF
            {
             newCompositeNode(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicExp=ruleLogicExp();

            state._fsp--;

             current =iv_ruleLogicExp; 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalExTwentyOne.g:1421:1: ruleLogicExp returns [EObject current=null] : ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_leftLogic_0_0 = null;

        EObject lv_rightLogic_6_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:1427:2: ( ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) ) )
            // InternalExTwentyOne.g:1428:2: ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) )
            {
            // InternalExTwentyOne.g:1428:2: ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) )
            // InternalExTwentyOne.g:1429:3: ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) )
            {
            // InternalExTwentyOne.g:1429:3: ( (lv_leftLogic_0_0= ruleExp ) )
            // InternalExTwentyOne.g:1430:4: (lv_leftLogic_0_0= ruleExp )
            {
            // InternalExTwentyOne.g:1430:4: (lv_leftLogic_0_0= ruleExp )
            // InternalExTwentyOne.g:1431:5: lv_leftLogic_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLogicExpAccess().getLeftLogicExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_leftLogic_0_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicExpRule());
            					}
            					set(
            						current,
            						"leftLogic",
            						lv_leftLogic_0_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExTwentyOne.g:1448:3: (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            case 46:
                {
                alt14=4;
                }
                break;
            case 47:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalExTwentyOne.g:1449:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:1454:4: otherlv_2= '<'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:1459:4: otherlv_3= '>'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:1464:4: otherlv_4= '<='
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:1469:4: otherlv_5= '>='
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalExTwentyOne.g:1474:3: ( (lv_rightLogic_6_0= ruleExp ) )
            // InternalExTwentyOne.g:1475:4: (lv_rightLogic_6_0= ruleExp )
            {
            // InternalExTwentyOne.g:1475:4: (lv_rightLogic_6_0= ruleExp )
            // InternalExTwentyOne.g:1476:5: lv_rightLogic_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLogicExpAccess().getRightLogicExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightLogic_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicExpRule());
            					}
            					set(
            						current,
            						"rightLogic",
            						lv_rightLogic_6_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
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
    // $ANTLR end "ruleLogicExp"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004200010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000987C0008010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000F00800000000L});

}