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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'int'", "'string'", "'none'", "'+'", "'-'", "'*'", "'/'", "'.'", "'if'", "'then'", "'else'", "'end'", "'new'", "'='", "'let'", "'in'", "'<'", "'>'", "'<='", "'>='"
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
    // InternalExTwentyOne.g:203:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:209:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleType ) ) ) )
            // InternalExTwentyOne.g:210:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleType ) ) )
            {
            // InternalExTwentyOne.g:210:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleType ) ) )
            // InternalExTwentyOne.g:211:3: otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleType ) )
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
            		
            // InternalExTwentyOne.g:237:3: ( (lv_value_3_0= ruleType ) )
            // InternalExTwentyOne.g:238:4: (lv_value_3_0= ruleType )
            {
            // InternalExTwentyOne.g:238:4: (lv_value_3_0= ruleType )
            // InternalExTwentyOne.g:239:5: lv_value_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Type");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFunction"
    // InternalExTwentyOne.g:260:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalExTwentyOne.g:260:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalExTwentyOne.g:261:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalExTwentyOne.g:267:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_lambda_3_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:273:2: ( ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) ) )
            // InternalExTwentyOne.g:274:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) )
            {
            // InternalExTwentyOne.g:274:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) ) )
            // InternalExTwentyOne.g:275:3: () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) ( (lv_lambda_3_0= ruleLambda ) )
            {
            // InternalExTwentyOne.g:275:3: ()
            // InternalExTwentyOne.g:276:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
            		
            // InternalExTwentyOne.g:286:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:287:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:287:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:288:5: lv_name_2_0= RULE_ID
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

            // InternalExTwentyOne.g:304:3: ( (lv_lambda_3_0= ruleLambda ) )
            // InternalExTwentyOne.g:305:4: (lv_lambda_3_0= ruleLambda )
            {
            // InternalExTwentyOne.g:305:4: (lv_lambda_3_0= ruleLambda )
            // InternalExTwentyOne.g:306:5: lv_lambda_3_0= ruleLambda
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
    // InternalExTwentyOne.g:327:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalExTwentyOne.g:327:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalExTwentyOne.g:328:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalExTwentyOne.g:334:1: ruleLambda returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_value_4_0 = null;

        EObject lv_lambdaExp_7_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:340:2: ( ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' ) )
            // InternalExTwentyOne.g:341:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' )
            {
            // InternalExTwentyOne.g:341:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}' )
            // InternalExTwentyOne.g:342:3: () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_lambdaExp_7_0= ruleExp ) ) otherlv_8= '}'
            {
            // InternalExTwentyOne.g:342:3: ()
            // InternalExTwentyOne.g:343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLambdaAccess().getLambdaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExTwentyOne.g:353:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:354:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:354:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:355:5: lv_name_2_0= RULE_ID
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
            		
            // InternalExTwentyOne.g:375:3: ( (lv_value_4_0= ruleType ) )
            // InternalExTwentyOne.g:376:4: (lv_value_4_0= ruleType )
            {
            // InternalExTwentyOne.g:376:4: (lv_value_4_0= ruleType )
            // InternalExTwentyOne.g:377:5: lv_value_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getValueTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalExTwentyOne.g:402:3: ( (lv_lambdaExp_7_0= ruleExp ) )
            // InternalExTwentyOne.g:403:4: (lv_lambdaExp_7_0= ruleExp )
            {
            // InternalExTwentyOne.g:403:4: (lv_lambdaExp_7_0= ruleExp )
            // InternalExTwentyOne.g:404:5: lv_lambdaExp_7_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getLambdaExpExpParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalExTwentyOne.g:429:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalExTwentyOne.g:429:46: (iv_ruleInput= ruleInput EOF )
            // InternalExTwentyOne.g:430:2: iv_ruleInput= ruleInput EOF
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
    // InternalExTwentyOne.g:436:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:442:2: ( ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) ) )
            // InternalExTwentyOne.g:443:2: ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) )
            {
            // InternalExTwentyOne.g:443:2: ( () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) ) )
            // InternalExTwentyOne.g:444:3: () otherlv_1= 'input' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= ruleType ) )
            {
            // InternalExTwentyOne.g:444:3: ()
            // InternalExTwentyOne.g:445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
            		
            // InternalExTwentyOne.g:455:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:456:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:456:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:457:5: lv_name_2_0= RULE_ID
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
            		
            // InternalExTwentyOne.g:477:3: ( (lv_value_4_0= ruleType ) )
            // InternalExTwentyOne.g:478:4: (lv_value_4_0= ruleType )
            {
            // InternalExTwentyOne.g:478:4: (lv_value_4_0= ruleType )
            // InternalExTwentyOne.g:479:5: lv_value_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInputAccess().getValueTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Type");
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode"
    // InternalExTwentyOne.g:500:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalExTwentyOne.g:500:45: (iv_ruleNode= ruleNode EOF )
            // InternalExTwentyOne.g:501:2: iv_ruleNode= ruleNode EOF
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
    // InternalExTwentyOne.g:507:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' ) ;
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
            // InternalExTwentyOne.g:513:2: ( ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' ) )
            // InternalExTwentyOne.g:514:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' )
            {
            // InternalExTwentyOne.g:514:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']' )
            // InternalExTwentyOne.g:515:3: () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) ) otherlv_6= ']'
            {
            // InternalExTwentyOne.g:515:3: ()
            // InternalExTwentyOne.g:516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeAccess().getNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
            		
            // InternalExTwentyOne.g:526:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:527:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:527:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:528:5: lv_name_2_0= RULE_ID
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
            		
            // InternalExTwentyOne.g:548:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_lambda_5_0= ruleLambda ) ) )
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
                    // InternalExTwentyOne.g:549:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalExTwentyOne.g:549:4: ( (otherlv_4= RULE_ID ) )
                    // InternalExTwentyOne.g:550:5: (otherlv_4= RULE_ID )
                    {
                    // InternalExTwentyOne.g:550:5: (otherlv_4= RULE_ID )
                    // InternalExTwentyOne.g:551:6: otherlv_4= RULE_ID
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
                    // InternalExTwentyOne.g:563:4: ( (lv_lambda_5_0= ruleLambda ) )
                    {
                    // InternalExTwentyOne.g:563:4: ( (lv_lambda_5_0= ruleLambda ) )
                    // InternalExTwentyOne.g:564:5: (lv_lambda_5_0= ruleLambda )
                    {
                    // InternalExTwentyOne.g:564:5: (lv_lambda_5_0= ruleLambda )
                    // InternalExTwentyOne.g:565:6: lv_lambda_5_0= ruleLambda
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
    // InternalExTwentyOne.g:591:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalExTwentyOne.g:591:47: (iv_ruleStream= ruleStream EOF )
            // InternalExTwentyOne.g:592:2: iv_ruleStream= ruleStream EOF
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
    // InternalExTwentyOne.g:598:1: ruleStream returns [EObject current=null] : ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ ) ;
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
            // InternalExTwentyOne.g:604:2: ( ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ ) )
            // InternalExTwentyOne.g:605:2: ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ )
            {
            // InternalExTwentyOne.g:605:2: ( () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+ )
            // InternalExTwentyOne.g:606:3: () otherlv_1= 'stream' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+
            {
            // InternalExTwentyOne.g:606:3: ()
            // InternalExTwentyOne.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStreamAccess().getStreamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getStreamKeyword_1());
            		
            // InternalExTwentyOne.g:617:3: ( (otherlv_2= RULE_ID ) )
            // InternalExTwentyOne.g:618:4: (otherlv_2= RULE_ID )
            {
            // InternalExTwentyOne.g:618:4: (otherlv_2= RULE_ID )
            // InternalExTwentyOne.g:619:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0());
            				

            }


            }

            // InternalExTwentyOne.g:630:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExTwentyOne.g:631:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalExTwentyOne.g:635:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalExTwentyOne.g:636:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:636:5: (otherlv_4= RULE_ID )
            	    // InternalExTwentyOne.g:637:6: otherlv_4= RULE_ID
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

            // InternalExTwentyOne.g:649:3: (otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )* )+
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
            	    // InternalExTwentyOne.g:650:4: otherlv_5= 'to' ( (lv_elements_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getToKeyword_4_0());
            	    			
            	    // InternalExTwentyOne.g:654:4: ( (lv_elements_6_0= ruleElement ) )
            	    // InternalExTwentyOne.g:655:5: (lv_elements_6_0= ruleElement )
            	    {
            	    // InternalExTwentyOne.g:655:5: (lv_elements_6_0= ruleElement )
            	    // InternalExTwentyOne.g:656:6: lv_elements_6_0= ruleElement
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

            	    // InternalExTwentyOne.g:673:4: (otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==24) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalExTwentyOne.g:674:5: otherlv_7= ',' ( (lv_elements_8_0= ruleElement ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,24,FOLLOW_16); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getCommaKeyword_4_2_0());
            	    	    				
            	    	    // InternalExTwentyOne.g:678:5: ( (lv_elements_8_0= ruleElement ) )
            	    	    // InternalExTwentyOne.g:679:6: (lv_elements_8_0= ruleElement )
            	    	    {
            	    	    // InternalExTwentyOne.g:679:6: (lv_elements_8_0= ruleElement )
            	    	    // InternalExTwentyOne.g:680:7: lv_elements_8_0= ruleElement
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
    // InternalExTwentyOne.g:703:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalExTwentyOne.g:703:48: (iv_ruleElement= ruleElement EOF )
            // InternalExTwentyOne.g:704:2: iv_ruleElement= ruleElement EOF
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
    // InternalExTwentyOne.g:710:1: ruleElement returns [EObject current=null] : ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) ) ;
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
            // InternalExTwentyOne.g:716:2: ( ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) ) )
            // InternalExTwentyOne.g:717:2: ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) )
            {
            // InternalExTwentyOne.g:717:2: ( ( () ( (lv_element_1_0= RULE_ID ) ) ) | (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' ) | (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) ) )
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
                    // InternalExTwentyOne.g:718:3: ( () ( (lv_element_1_0= RULE_ID ) ) )
                    {
                    // InternalExTwentyOne.g:718:3: ( () ( (lv_element_1_0= RULE_ID ) ) )
                    // InternalExTwentyOne.g:719:4: () ( (lv_element_1_0= RULE_ID ) )
                    {
                    // InternalExTwentyOne.g:719:4: ()
                    // InternalExTwentyOne.g:720:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementAccess().getElementAction_0_0(),
                    						current);
                    				

                    }

                    // InternalExTwentyOne.g:726:4: ( (lv_element_1_0= RULE_ID ) )
                    // InternalExTwentyOne.g:727:5: (lv_element_1_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:727:5: (lv_element_1_0= RULE_ID )
                    // InternalExTwentyOne.g:728:6: lv_element_1_0= RULE_ID
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
                    // InternalExTwentyOne.g:746:3: (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' )
                    {
                    // InternalExTwentyOne.g:746:3: (otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']' )
                    // InternalExTwentyOne.g:747:4: otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda ) otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalExTwentyOne.g:751:4: ( ( (otherlv_3= RULE_ID ) ) | this_Lambda_4= ruleLambda )
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
                            // InternalExTwentyOne.g:752:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalExTwentyOne.g:752:5: ( (otherlv_3= RULE_ID ) )
                            // InternalExTwentyOne.g:753:6: (otherlv_3= RULE_ID )
                            {
                            // InternalExTwentyOne.g:753:6: (otherlv_3= RULE_ID )
                            // InternalExTwentyOne.g:754:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getElementRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                            							newLeafNode(otherlv_3, grammarAccess.getElementAccess().getNodeNodeOrFunctionCrossReference_1_1_0_0());
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalExTwentyOne.g:766:5: this_Lambda_4= ruleLambda
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
                    // InternalExTwentyOne.g:781:3: (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) )
                    {
                    // InternalExTwentyOne.g:781:3: (otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) ) )
                    // InternalExTwentyOne.g:782:4: otherlv_6= 'output' ( (lv_output_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getElementAccess().getOutputKeyword_2_0());
                    			
                    // InternalExTwentyOne.g:786:4: ( (lv_output_7_0= RULE_ID ) )
                    // InternalExTwentyOne.g:787:5: (lv_output_7_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:787:5: (lv_output_7_0= RULE_ID )
                    // InternalExTwentyOne.g:788:6: lv_output_7_0= RULE_ID
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
    // InternalExTwentyOne.g:809:1: entryRuleDataDecl returns [EObject current=null] : iv_ruleDataDecl= ruleDataDecl EOF ;
    public final EObject entryRuleDataDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDecl = null;


        try {
            // InternalExTwentyOne.g:809:49: (iv_ruleDataDecl= ruleDataDecl EOF )
            // InternalExTwentyOne.g:810:2: iv_ruleDataDecl= ruleDataDecl EOF
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
    // InternalExTwentyOne.g:816:1: ruleDataDecl returns [EObject current=null] : ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_values_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_values_10_0= ruleType ) ) )* otherlv_11= '}' ) ;
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
        EObject lv_values_6_0 = null;

        EObject lv_values_10_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:822:2: ( ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_values_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_values_10_0= ruleType ) ) )* otherlv_11= '}' ) )
            // InternalExTwentyOne.g:823:2: ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_values_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_values_10_0= ruleType ) ) )* otherlv_11= '}' )
            {
            // InternalExTwentyOne.g:823:2: ( () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_values_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_values_10_0= ruleType ) ) )* otherlv_11= '}' )
            // InternalExTwentyOne.g:824:3: () otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_values_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_values_10_0= ruleType ) ) )* otherlv_11= '}'
            {
            // InternalExTwentyOne.g:824:3: ()
            // InternalExTwentyOne.g:825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDeclAccess().getDataDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataDeclAccess().getDataKeyword_1());
            		
            // InternalExTwentyOne.g:835:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:836:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:836:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:837:5: lv_name_2_0= RULE_ID
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
            		
            // InternalExTwentyOne.g:857:3: ( (lv_data_4_0= RULE_ID ) )
            // InternalExTwentyOne.g:858:4: (lv_data_4_0= RULE_ID )
            {
            // InternalExTwentyOne.g:858:4: (lv_data_4_0= RULE_ID )
            // InternalExTwentyOne.g:859:5: lv_data_4_0= RULE_ID
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
            		
            // InternalExTwentyOne.g:879:3: ( (lv_values_6_0= ruleType ) )
            // InternalExTwentyOne.g:880:4: (lv_values_6_0= ruleType )
            {
            // InternalExTwentyOne.g:880:4: (lv_values_6_0= ruleType )
            // InternalExTwentyOne.g:881:5: lv_values_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataDeclAccess().getValuesTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_values_6_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataDeclRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_6_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExTwentyOne.g:898:3: (otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_values_10_0= ruleType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:899:4: otherlv_7= ',' ( (lv_data_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_values_10_0= ruleType ) )
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDataDeclAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalExTwentyOne.g:903:4: ( (lv_data_8_0= RULE_ID ) )
            	    // InternalExTwentyOne.g:904:5: (lv_data_8_0= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:904:5: (lv_data_8_0= RULE_ID )
            	    // InternalExTwentyOne.g:905:6: lv_data_8_0= RULE_ID
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
            	    			
            	    // InternalExTwentyOne.g:925:4: ( (lv_values_10_0= ruleType ) )
            	    // InternalExTwentyOne.g:926:5: (lv_values_10_0= ruleType )
            	    {
            	    // InternalExTwentyOne.g:926:5: (lv_values_10_0= ruleType )
            	    // InternalExTwentyOne.g:927:6: lv_values_10_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getDataDeclAccess().getValuesTypeParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_values_10_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataDeclRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_10_0,
            	    							"org.xtext.example.mydsl.ExTwentyOne.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // InternalExTwentyOne.g:953:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalExTwentyOne.g:953:45: (iv_ruleType= ruleType EOF )
            // InternalExTwentyOne.g:954:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // InternalExTwentyOne.g:960:1: ruleType returns [EObject current=null] : ( ( (lv_intIdentifier_0_0= 'int' ) ) | ( (lv_stringValue_1_0= 'string' ) ) | ( (lv_id_2_0= RULE_ID ) ) | ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_noneValue_4_0= 'none' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_intIdentifier_0_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_id_2_0=null;
        Token lv_intValue_3_0=null;
        Token lv_noneValue_4_0=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:966:2: ( ( ( (lv_intIdentifier_0_0= 'int' ) ) | ( (lv_stringValue_1_0= 'string' ) ) | ( (lv_id_2_0= RULE_ID ) ) | ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_noneValue_4_0= 'none' ) ) ) )
            // InternalExTwentyOne.g:967:2: ( ( (lv_intIdentifier_0_0= 'int' ) ) | ( (lv_stringValue_1_0= 'string' ) ) | ( (lv_id_2_0= RULE_ID ) ) | ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_noneValue_4_0= 'none' ) ) )
            {
            // InternalExTwentyOne.g:967:2: ( ( (lv_intIdentifier_0_0= 'int' ) ) | ( (lv_stringValue_1_0= 'string' ) ) | ( (lv_id_2_0= RULE_ID ) ) | ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_noneValue_4_0= 'none' ) ) )
            int alt10=5;
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
            case RULE_INT:
                {
                alt10=4;
                }
                break;
            case 30:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalExTwentyOne.g:968:3: ( (lv_intIdentifier_0_0= 'int' ) )
                    {
                    // InternalExTwentyOne.g:968:3: ( (lv_intIdentifier_0_0= 'int' ) )
                    // InternalExTwentyOne.g:969:4: (lv_intIdentifier_0_0= 'int' )
                    {
                    // InternalExTwentyOne.g:969:4: (lv_intIdentifier_0_0= 'int' )
                    // InternalExTwentyOne.g:970:5: lv_intIdentifier_0_0= 'int'
                    {
                    lv_intIdentifier_0_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_intIdentifier_0_0, grammarAccess.getTypeAccess().getIntIdentifierIntKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "intIdentifier", lv_intIdentifier_0_0, "int");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:983:3: ( (lv_stringValue_1_0= 'string' ) )
                    {
                    // InternalExTwentyOne.g:983:3: ( (lv_stringValue_1_0= 'string' ) )
                    // InternalExTwentyOne.g:984:4: (lv_stringValue_1_0= 'string' )
                    {
                    // InternalExTwentyOne.g:984:4: (lv_stringValue_1_0= 'string' )
                    // InternalExTwentyOne.g:985:5: lv_stringValue_1_0= 'string'
                    {
                    lv_stringValue_1_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_stringValue_1_0, grammarAccess.getTypeAccess().getStringValueStringKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "stringValue", lv_stringValue_1_0, "string");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:998:3: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // InternalExTwentyOne.g:998:3: ( (lv_id_2_0= RULE_ID ) )
                    // InternalExTwentyOne.g:999:4: (lv_id_2_0= RULE_ID )
                    {
                    // InternalExTwentyOne.g:999:4: (lv_id_2_0= RULE_ID )
                    // InternalExTwentyOne.g:1000:5: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_id_2_0, grammarAccess.getTypeAccess().getIdIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:1017:3: ( (lv_intValue_3_0= RULE_INT ) )
                    {
                    // InternalExTwentyOne.g:1017:3: ( (lv_intValue_3_0= RULE_INT ) )
                    // InternalExTwentyOne.g:1018:4: (lv_intValue_3_0= RULE_INT )
                    {
                    // InternalExTwentyOne.g:1018:4: (lv_intValue_3_0= RULE_INT )
                    // InternalExTwentyOne.g:1019:5: lv_intValue_3_0= RULE_INT
                    {
                    lv_intValue_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_intValue_3_0, grammarAccess.getTypeAccess().getIntValueINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intValue",
                    						lv_intValue_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:1036:3: ( (lv_noneValue_4_0= 'none' ) )
                    {
                    // InternalExTwentyOne.g:1036:3: ( (lv_noneValue_4_0= 'none' ) )
                    // InternalExTwentyOne.g:1037:4: (lv_noneValue_4_0= 'none' )
                    {
                    // InternalExTwentyOne.g:1037:4: (lv_noneValue_4_0= 'none' )
                    // InternalExTwentyOne.g:1038:5: lv_noneValue_4_0= 'none'
                    {
                    lv_noneValue_4_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_noneValue_4_0, grammarAccess.getTypeAccess().getNoneValueNoneKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "noneValue", lv_noneValue_4_0, "none");
                    				

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalExTwentyOne.g:1054:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalExTwentyOne.g:1054:44: (iv_ruleExp= ruleExp EOF )
            // InternalExTwentyOne.g:1055:2: iv_ruleExp= ruleExp EOF
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
    // InternalExTwentyOne.g:1061:1: ruleExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) ) ( (lv_right_9_0= rulePrimary ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Primary_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:1067:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) ) ( (lv_right_9_0= rulePrimary ) ) )* ) )
            // InternalExTwentyOne.g:1068:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) ) ( (lv_right_9_0= rulePrimary ) ) )* )
            {
            // InternalExTwentyOne.g:1068:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) ) ( (lv_right_9_0= rulePrimary ) ) )* )
            // InternalExTwentyOne.g:1069:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) ) ( (lv_right_9_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExTwentyOne.g:1077:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) ) ( (lv_right_9_0= rulePrimary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=31 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExTwentyOne.g:1078:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) ) ( (lv_right_9_0= rulePrimary ) )
            	    {
            	    // InternalExTwentyOne.g:1078:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) | ( () otherlv_6= '*' ) | ( () otherlv_8= '/' ) )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalExTwentyOne.g:1079:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalExTwentyOne.g:1079:5: ( () otherlv_2= '+' )
            	            // InternalExTwentyOne.g:1080:6: () otherlv_2= '+'
            	            {
            	            // InternalExTwentyOne.g:1080:6: ()
            	            // InternalExTwentyOne.g:1081:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,31,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalExTwentyOne.g:1093:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalExTwentyOne.g:1093:5: ( () otherlv_4= '-' )
            	            // InternalExTwentyOne.g:1094:6: () otherlv_4= '-'
            	            {
            	            // InternalExTwentyOne.g:1094:6: ()
            	            // InternalExTwentyOne.g:1095:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,32,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalExTwentyOne.g:1107:5: ( () otherlv_6= '*' )
            	            {
            	            // InternalExTwentyOne.g:1107:5: ( () otherlv_6= '*' )
            	            // InternalExTwentyOne.g:1108:6: () otherlv_6= '*'
            	            {
            	            // InternalExTwentyOne.g:1108:6: ()
            	            // InternalExTwentyOne.g:1109:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMultLeftAction_1_0_2_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_6=(Token)match(input,33,FOLLOW_10); 

            	            						newLeafNode(otherlv_6, grammarAccess.getExpAccess().getAsteriskKeyword_1_0_2_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalExTwentyOne.g:1121:5: ( () otherlv_8= '/' )
            	            {
            	            // InternalExTwentyOne.g:1121:5: ( () otherlv_8= '/' )
            	            // InternalExTwentyOne.g:1122:6: () otherlv_8= '/'
            	            {
            	            // InternalExTwentyOne.g:1122:6: ()
            	            // InternalExTwentyOne.g:1123:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getDivideLeftAction_1_0_3_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_8=(Token)match(input,34,FOLLOW_10); 

            	            						newLeafNode(otherlv_8, grammarAccess.getExpAccess().getSolidusKeyword_1_0_3_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalExTwentyOne.g:1135:4: ( (lv_right_9_0= rulePrimary ) )
            	    // InternalExTwentyOne.g:1136:5: (lv_right_9_0= rulePrimary )
            	    {
            	    // InternalExTwentyOne.g:1136:5: (lv_right_9_0= rulePrimary )
            	    // InternalExTwentyOne.g:1137:6: lv_right_9_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_9_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_9_0,
            	    							"org.xtext.example.mydsl.ExTwentyOne.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePrimary"
    // InternalExTwentyOne.g:1159:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalExTwentyOne.g:1159:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalExTwentyOne.g:1160:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalExTwentyOne.g:1166:1: rulePrimary returns [EObject current=null] : (this_LetBinding_0= ruleLetBinding | this_IfThenElse_1= ruleIfThenElse | this_Parenthesis_2= ruleParenthesis | this_NewInput_3= ruleNewInput | this_DataAccess_4= ruleDataAccess | this_Type_5= ruleType ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_LetBinding_0 = null;

        EObject this_IfThenElse_1 = null;

        EObject this_Parenthesis_2 = null;

        EObject this_NewInput_3 = null;

        EObject this_DataAccess_4 = null;

        EObject this_Type_5 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:1172:2: ( (this_LetBinding_0= ruleLetBinding | this_IfThenElse_1= ruleIfThenElse | this_Parenthesis_2= ruleParenthesis | this_NewInput_3= ruleNewInput | this_DataAccess_4= ruleDataAccess | this_Type_5= ruleType ) )
            // InternalExTwentyOne.g:1173:2: (this_LetBinding_0= ruleLetBinding | this_IfThenElse_1= ruleIfThenElse | this_Parenthesis_2= ruleParenthesis | this_NewInput_3= ruleNewInput | this_DataAccess_4= ruleDataAccess | this_Type_5= ruleType )
            {
            // InternalExTwentyOne.g:1173:2: (this_LetBinding_0= ruleLetBinding | this_IfThenElse_1= ruleIfThenElse | this_Parenthesis_2= ruleParenthesis | this_NewInput_3= ruleNewInput | this_DataAccess_4= ruleDataAccess | this_Type_5= ruleType )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 15:
                {
                alt13=3;
                }
                break;
            case 40:
                {
                alt13=4;
                }
                break;
            case RULE_ID:
                {
                int LA13_5 = input.LA(2);

                if ( (LA13_5==35) ) {
                    alt13=5;
                }
                else if ( (LA13_5==EOF||LA13_5==16||LA13_5==18||LA13_5==22||LA13_5==24||(LA13_5>=31 && LA13_5<=34)||(LA13_5>=37 && LA13_5<=39)||LA13_5==41||(LA13_5>=43 && LA13_5<=47)) ) {
                    alt13=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 28:
            case 29:
            case 30:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalExTwentyOne.g:1174:3: this_LetBinding_0= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_0=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:1183:3: this_IfThenElse_1= ruleIfThenElse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIfThenElseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfThenElse_1=ruleIfThenElse();

                    state._fsp--;


                    			current = this_IfThenElse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:1192:3: this_Parenthesis_2= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_2=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:1201:3: this_NewInput_3= ruleNewInput
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewInput_3=ruleNewInput();

                    state._fsp--;


                    			current = this_NewInput_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:1210:3: this_DataAccess_4= ruleDataAccess
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataAccess_4=ruleDataAccess();

                    state._fsp--;


                    			current = this_DataAccess_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:1219:3: this_Type_5= ruleType
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_5=ruleType();

                    state._fsp--;


                    			current = this_Type_5;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalExTwentyOne.g:1231:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalExTwentyOne.g:1231:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalExTwentyOne.g:1232:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalExTwentyOne.g:1238:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:1244:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalExTwentyOne.g:1245:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalExTwentyOne.g:1245:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalExTwentyOne.g:1246:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')'
            {
            // InternalExTwentyOne.g:1246:3: ()
            // InternalExTwentyOne.g:1247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExTwentyOne.g:1257:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalExTwentyOne.g:1258:4: (lv_exp_2_0= ruleExp )
            {
            // InternalExTwentyOne.g:1258:4: (lv_exp_2_0= ruleExp )
            // InternalExTwentyOne.g:1259:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleDataAccess"
    // InternalExTwentyOne.g:1284:1: entryRuleDataAccess returns [EObject current=null] : iv_ruleDataAccess= ruleDataAccess EOF ;
    public final EObject entryRuleDataAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccess = null;


        try {
            // InternalExTwentyOne.g:1284:51: (iv_ruleDataAccess= ruleDataAccess EOF )
            // InternalExTwentyOne.g:1285:2: iv_ruleDataAccess= ruleDataAccess EOF
            {
             newCompositeNode(grammarAccess.getDataAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataAccess=ruleDataAccess();

            state._fsp--;

             current =iv_ruleDataAccess; 
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
    // $ANTLR end "entryRuleDataAccess"


    // $ANTLR start "ruleDataAccess"
    // InternalExTwentyOne.g:1291:1: ruleDataAccess returns [EObject current=null] : ( () ( (lv_accessedData_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_accessedField_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDataAccess() throws RecognitionException {
        EObject current = null;

        Token lv_accessedData_1_0=null;
        Token otherlv_2=null;
        Token lv_accessedField_3_0=null;


        	enterRule();

        try {
            // InternalExTwentyOne.g:1297:2: ( ( () ( (lv_accessedData_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_accessedField_3_0= RULE_ID ) ) ) )
            // InternalExTwentyOne.g:1298:2: ( () ( (lv_accessedData_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_accessedField_3_0= RULE_ID ) ) )
            {
            // InternalExTwentyOne.g:1298:2: ( () ( (lv_accessedData_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_accessedField_3_0= RULE_ID ) ) )
            // InternalExTwentyOne.g:1299:3: () ( (lv_accessedData_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_accessedField_3_0= RULE_ID ) )
            {
            // InternalExTwentyOne.g:1299:3: ()
            // InternalExTwentyOne.g:1300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataAccessAccess().getDataAccessAction_0(),
            					current);
            			

            }

            // InternalExTwentyOne.g:1306:3: ( (lv_accessedData_1_0= RULE_ID ) )
            // InternalExTwentyOne.g:1307:4: (lv_accessedData_1_0= RULE_ID )
            {
            // InternalExTwentyOne.g:1307:4: (lv_accessedData_1_0= RULE_ID )
            // InternalExTwentyOne.g:1308:5: lv_accessedData_1_0= RULE_ID
            {
            lv_accessedData_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_accessedData_1_0, grammarAccess.getDataAccessAccess().getAccessedDataIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataAccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accessedData",
            						lv_accessedData_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccessAccess().getFullStopKeyword_2());
            		
            // InternalExTwentyOne.g:1328:3: ( (lv_accessedField_3_0= RULE_ID ) )
            // InternalExTwentyOne.g:1329:4: (lv_accessedField_3_0= RULE_ID )
            {
            // InternalExTwentyOne.g:1329:4: (lv_accessedField_3_0= RULE_ID )
            // InternalExTwentyOne.g:1330:5: lv_accessedField_3_0= RULE_ID
            {
            lv_accessedField_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_accessedField_3_0, grammarAccess.getDataAccessAccess().getAccessedFieldIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataAccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accessedField",
            						lv_accessedField_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDataAccess"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalExTwentyOne.g:1350:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalExTwentyOne.g:1350:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalExTwentyOne.g:1351:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;

             current =iv_ruleIfThenElse; 
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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalExTwentyOne.g:1357:1: ruleIfThenElse returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_ifLogicExp_2_0= ruleLogicExp ) ) otherlv_3= 'then' ( (lv_thenExp_4_0= ruleExp ) ) otherlv_5= 'else' ( (lv_elseExp_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ifLogicExp_2_0 = null;

        EObject lv_thenExp_4_0 = null;

        EObject lv_elseExp_6_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:1363:2: ( ( () otherlv_1= 'if' ( (lv_ifLogicExp_2_0= ruleLogicExp ) ) otherlv_3= 'then' ( (lv_thenExp_4_0= ruleExp ) ) otherlv_5= 'else' ( (lv_elseExp_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalExTwentyOne.g:1364:2: ( () otherlv_1= 'if' ( (lv_ifLogicExp_2_0= ruleLogicExp ) ) otherlv_3= 'then' ( (lv_thenExp_4_0= ruleExp ) ) otherlv_5= 'else' ( (lv_elseExp_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalExTwentyOne.g:1364:2: ( () otherlv_1= 'if' ( (lv_ifLogicExp_2_0= ruleLogicExp ) ) otherlv_3= 'then' ( (lv_thenExp_4_0= ruleExp ) ) otherlv_5= 'else' ( (lv_elseExp_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalExTwentyOne.g:1365:3: () otherlv_1= 'if' ( (lv_ifLogicExp_2_0= ruleLogicExp ) ) otherlv_3= 'then' ( (lv_thenExp_4_0= ruleExp ) ) otherlv_5= 'else' ( (lv_elseExp_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalExTwentyOne.g:1365:3: ()
            // InternalExTwentyOne.g:1366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfThenElseAccess().getIfThenElseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getIfKeyword_1());
            		
            // InternalExTwentyOne.g:1376:3: ( (lv_ifLogicExp_2_0= ruleLogicExp ) )
            // InternalExTwentyOne.g:1377:4: (lv_ifLogicExp_2_0= ruleLogicExp )
            {
            // InternalExTwentyOne.g:1377:4: (lv_ifLogicExp_2_0= ruleLogicExp )
            // InternalExTwentyOne.g:1378:5: lv_ifLogicExp_2_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getIfThenElseAccess().getIfLogicExpLogicExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_ifLogicExp_2_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            					}
            					set(
            						current,
            						"ifLogicExp",
            						lv_ifLogicExp_2_0,
            						"org.xtext.example.mydsl.ExTwentyOne.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getThenKeyword_3());
            		
            // InternalExTwentyOne.g:1399:3: ( (lv_thenExp_4_0= ruleExp ) )
            // InternalExTwentyOne.g:1400:4: (lv_thenExp_4_0= ruleExp )
            {
            // InternalExTwentyOne.g:1400:4: (lv_thenExp_4_0= ruleExp )
            // InternalExTwentyOne.g:1401:5: lv_thenExp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getIfThenElseAccess().getThenExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_thenExp_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            					}
            					set(
            						current,
            						"thenExp",
            						lv_thenExp_4_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getElseKeyword_5());
            		
            // InternalExTwentyOne.g:1422:3: ( (lv_elseExp_6_0= ruleExp ) )
            // InternalExTwentyOne.g:1423:4: (lv_elseExp_6_0= ruleExp )
            {
            // InternalExTwentyOne.g:1423:4: (lv_elseExp_6_0= ruleExp )
            // InternalExTwentyOne.g:1424:5: lv_elseExp_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getIfThenElseAccess().getElseExpExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_elseExp_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            					}
            					set(
            						current,
            						"elseExp",
            						lv_elseExp_6_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIfThenElseAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleNewInput"
    // InternalExTwentyOne.g:1449:1: entryRuleNewInput returns [EObject current=null] : iv_ruleNewInput= ruleNewInput EOF ;
    public final EObject entryRuleNewInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewInput = null;


        try {
            // InternalExTwentyOne.g:1449:49: (iv_ruleNewInput= ruleNewInput EOF )
            // InternalExTwentyOne.g:1450:2: iv_ruleNewInput= ruleNewInput EOF
            {
             newCompositeNode(grammarAccess.getNewInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewInput=ruleNewInput();

            state._fsp--;

             current =iv_ruleNewInput; 
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
    // $ANTLR end "entryRuleNewInput"


    // $ANTLR start "ruleNewInput"
    // InternalExTwentyOne.g:1456:1: ruleNewInput returns [EObject current=null] : ( () otherlv_1= 'new' ( (lv_newArrayId_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_newArrayIds_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_newArrayExps_6_0= ruleExp ) ) (otherlv_7= ',' ( (lv_newArrayIds_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_newArrayExps_10_0= ruleExp ) ) )* otherlv_11= ']' ) ;
    public final EObject ruleNewInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_newArrayId_2_0=null;
        Token otherlv_3=null;
        Token lv_newArrayIds_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_newArrayIds_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_newArrayExps_6_0 = null;

        EObject lv_newArrayExps_10_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:1462:2: ( ( () otherlv_1= 'new' ( (lv_newArrayId_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_newArrayIds_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_newArrayExps_6_0= ruleExp ) ) (otherlv_7= ',' ( (lv_newArrayIds_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_newArrayExps_10_0= ruleExp ) ) )* otherlv_11= ']' ) )
            // InternalExTwentyOne.g:1463:2: ( () otherlv_1= 'new' ( (lv_newArrayId_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_newArrayIds_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_newArrayExps_6_0= ruleExp ) ) (otherlv_7= ',' ( (lv_newArrayIds_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_newArrayExps_10_0= ruleExp ) ) )* otherlv_11= ']' )
            {
            // InternalExTwentyOne.g:1463:2: ( () otherlv_1= 'new' ( (lv_newArrayId_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_newArrayIds_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_newArrayExps_6_0= ruleExp ) ) (otherlv_7= ',' ( (lv_newArrayIds_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_newArrayExps_10_0= ruleExp ) ) )* otherlv_11= ']' )
            // InternalExTwentyOne.g:1464:3: () otherlv_1= 'new' ( (lv_newArrayId_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_newArrayIds_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_newArrayExps_6_0= ruleExp ) ) (otherlv_7= ',' ( (lv_newArrayIds_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_newArrayExps_10_0= ruleExp ) ) )* otherlv_11= ']'
            {
            // InternalExTwentyOne.g:1464:3: ()
            // InternalExTwentyOne.g:1465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNewInputAccess().getNewInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNewInputAccess().getNewKeyword_1());
            		
            // InternalExTwentyOne.g:1475:3: ( (lv_newArrayId_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:1476:4: (lv_newArrayId_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:1476:4: (lv_newArrayId_2_0= RULE_ID )
            // InternalExTwentyOne.g:1477:5: lv_newArrayId_2_0= RULE_ID
            {
            lv_newArrayId_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_newArrayId_2_0, grammarAccess.getNewInputAccess().getNewArrayIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newArrayId",
            						lv_newArrayId_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getNewInputAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalExTwentyOne.g:1497:3: ( (lv_newArrayIds_4_0= RULE_ID ) )
            // InternalExTwentyOne.g:1498:4: (lv_newArrayIds_4_0= RULE_ID )
            {
            // InternalExTwentyOne.g:1498:4: (lv_newArrayIds_4_0= RULE_ID )
            // InternalExTwentyOne.g:1499:5: lv_newArrayIds_4_0= RULE_ID
            {
            lv_newArrayIds_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_newArrayIds_4_0, grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewInputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"newArrayIds",
            						lv_newArrayIds_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getNewInputAccess().getEqualsSignKeyword_5());
            		
            // InternalExTwentyOne.g:1519:3: ( (lv_newArrayExps_6_0= ruleExp ) )
            // InternalExTwentyOne.g:1520:4: (lv_newArrayExps_6_0= ruleExp )
            {
            // InternalExTwentyOne.g:1520:4: (lv_newArrayExps_6_0= ruleExp )
            // InternalExTwentyOne.g:1521:5: lv_newArrayExps_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_newArrayExps_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewInputRule());
            					}
            					add(
            						current,
            						"newArrayExps",
            						lv_newArrayExps_6_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExTwentyOne.g:1538:3: (otherlv_7= ',' ( (lv_newArrayIds_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_newArrayExps_10_0= ruleExp ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExTwentyOne.g:1539:4: otherlv_7= ',' ( (lv_newArrayIds_8_0= RULE_ID ) ) otherlv_9= '=' ( (lv_newArrayExps_10_0= ruleExp ) )
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNewInputAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalExTwentyOne.g:1543:4: ( (lv_newArrayIds_8_0= RULE_ID ) )
            	    // InternalExTwentyOne.g:1544:5: (lv_newArrayIds_8_0= RULE_ID )
            	    {
            	    // InternalExTwentyOne.g:1544:5: (lv_newArrayIds_8_0= RULE_ID )
            	    // InternalExTwentyOne.g:1545:6: lv_newArrayIds_8_0= RULE_ID
            	    {
            	    lv_newArrayIds_8_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(lv_newArrayIds_8_0, grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_7_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNewInputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"newArrayIds",
            	    							lv_newArrayIds_8_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,41,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getNewInputAccess().getEqualsSignKeyword_7_2());
            	    			
            	    // InternalExTwentyOne.g:1565:4: ( (lv_newArrayExps_10_0= ruleExp ) )
            	    // InternalExTwentyOne.g:1566:5: (lv_newArrayExps_10_0= ruleExp )
            	    {
            	    // InternalExTwentyOne.g:1566:5: (lv_newArrayExps_10_0= ruleExp )
            	    // InternalExTwentyOne.g:1567:6: lv_newArrayExps_10_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_newArrayExps_10_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNewInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"newArrayExps",
            	    							lv_newArrayExps_10_0,
            	    							"org.xtext.example.mydsl.ExTwentyOne.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNewInputAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleNewInput"


    // $ANTLR start "entryRuleLetBinding"
    // InternalExTwentyOne.g:1593:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalExTwentyOne.g:1593:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalExTwentyOne.g:1594:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalExTwentyOne.g:1600:1: ruleLetBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_binding_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalExTwentyOne.g:1606:2: ( ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalExTwentyOne.g:1607:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalExTwentyOne.g:1607:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalExTwentyOne.g:1608:3: () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalExTwentyOne.g:1608:3: ()
            // InternalExTwentyOne.g:1609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLetBindingAccess().getLetBindingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLetBindingAccess().getLetKeyword_1());
            		
            // InternalExTwentyOne.g:1619:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalExTwentyOne.g:1620:4: (lv_name_2_0= RULE_ID )
            {
            // InternalExTwentyOne.g:1620:4: (lv_name_2_0= RULE_ID )
            // InternalExTwentyOne.g:1621:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalExTwentyOne.g:1641:3: ( (lv_binding_4_0= ruleExp ) )
            // InternalExTwentyOne.g:1642:4: (lv_binding_4_0= ruleExp )
            {
            // InternalExTwentyOne.g:1642:4: (lv_binding_4_0= ruleExp )
            // InternalExTwentyOne.g:1643:5: lv_binding_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_binding_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_4_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getLetBindingAccess().getInKeyword_5());
            		
            // InternalExTwentyOne.g:1664:3: ( (lv_body_6_0= ruleExp ) )
            // InternalExTwentyOne.g:1665:4: (lv_body_6_0= ruleExp )
            {
            // InternalExTwentyOne.g:1665:4: (lv_body_6_0= ruleExp )
            // InternalExTwentyOne.g:1666:5: lv_body_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_body_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"org.xtext.example.mydsl.ExTwentyOne.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLetBindingAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleLogicExp"
    // InternalExTwentyOne.g:1691:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalExTwentyOne.g:1691:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalExTwentyOne.g:1692:2: iv_ruleLogicExp= ruleLogicExp EOF
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
    // InternalExTwentyOne.g:1698:1: ruleLogicExp returns [EObject current=null] : ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) ) ;
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
            // InternalExTwentyOne.g:1704:2: ( ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) ) )
            // InternalExTwentyOne.g:1705:2: ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) )
            {
            // InternalExTwentyOne.g:1705:2: ( ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) ) )
            // InternalExTwentyOne.g:1706:3: ( (lv_leftLogic_0_0= ruleExp ) ) (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' ) ( (lv_rightLogic_6_0= ruleExp ) )
            {
            // InternalExTwentyOne.g:1706:3: ( (lv_leftLogic_0_0= ruleExp ) )
            // InternalExTwentyOne.g:1707:4: (lv_leftLogic_0_0= ruleExp )
            {
            // InternalExTwentyOne.g:1707:4: (lv_leftLogic_0_0= ruleExp )
            // InternalExTwentyOne.g:1708:5: lv_leftLogic_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLogicExpAccess().getLeftLogicExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalExTwentyOne.g:1725:3: (otherlv_1= '=' | otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '<=' | otherlv_5= '>=' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt15=1;
                }
                break;
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
                {
                alt15=3;
                }
                break;
            case 46:
                {
                alt15=4;
                }
                break;
            case 47:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalExTwentyOne.g:1726:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:1731:4: otherlv_2= '<'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:1736:4: otherlv_3= '>'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:1741:4: otherlv_4= '<='
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:1746:4: otherlv_5= '>='
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalExTwentyOne.g:1751:3: ( (lv_rightLogic_6_0= ruleExp ) )
            // InternalExTwentyOne.g:1752:4: (lv_rightLogic_6_0= ruleExp )
            {
            // InternalExTwentyOne.g:1752:4: (lv_rightLogic_6_0= ruleExp )
            // InternalExTwentyOne.g:1753:5: lv_rightLogic_6_0= ruleExp
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000070000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000051070008030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000F20000000000L});

}